package structurePattern.componentPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class File implements Component{
    private String name;//文件名称

    public File(String name){
        this.name = name;
    }

    public void addFile(Component file){
    }

    public void removeFile(Component file){
    }

    public Component addFolder(Component folder){
        return null;
    }

    public void removeFolder(Component folder){
    }

    public List<Component> getFiles(){
        return null;
    }

    public List<Component> getFolders(){
        return null;
    }

    public List<Component> getAll(){
        return null;
    }

    public Iterator<Component> iterator(){
        return null;
    }

    public void display(){
        System.out.println(this.name);
    }
}
