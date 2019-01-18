package structurePattern.componentPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder implements Component {
    private String name;//文件名称
    private List<Component> files;//本文件下的文件
    private List<Component> folders;//本文件下的子文件夹

    public Folder(String name){
        this.name = name;
        files = new ArrayList<Component>();
        folders = new ArrayList<Component>();
    }

    public void addFile(Component file){
        files.add(file);
    }

    public void removeFile(Component file){
        files.remove(file);
    }

    public Component addFolder(Component folder){
        folders.add(folder);
        return this;
    }

    public void removeFolder(Component folder){
        folders.remove(folder);
    }

    public List<Component> getFiles(){
        return files;
    }

    public List<Component> getFolders(){
        return folders;
    }

    public List<Component> getAll(){
        List<Component> all = new ArrayList<Component>(folders);

        Iterator<Component> iteratorFile = files.iterator();
        while (iteratorFile.hasNext()){
            all.add(iteratorFile.next());//把本文件下所有的文件加入list
        }

        return all;
    }

    public Iterator<Component> iterator(){
        List<Component> all = new ArrayList<Component>();
        addAll(all, this);
        return all.iterator();
    }

    public void display(){
        System.out.println(this.name);
    }

    //把component本身及其中所有的子文件和所有的文件，都加到list中
    private void addAll(List<Component> all, Component component){
        if(null == component){
            return;
        }
        all.add(component);//把自身加入list

        Iterator<Component> iteratorFile = component.getFiles().iterator();
        while (iteratorFile.hasNext()){
            all.add(iteratorFile.next());//把本文件下所有的文件加入list
        }

        Iterator<Component> iteratorFolder = component.getFolders().iterator();
        while (iteratorFolder.hasNext()){
            addAll(all,iteratorFolder.next());//递归处理本文件夹下的子文件夹
        }
    }
}
