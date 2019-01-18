package structurePattern.componentPattern;

import java.util.Iterator;

public class TestUse {
    public static void main(String[] args){
        Component root = new Folder("root");//根目录
        Component folder1 = new Folder("folder1");//一级目录
        Component folder2 = new Folder("folder2");//一级目录
        Component folder3 = new Folder("folder3");//一级目录
        Component folder4 = new Folder("folder4");//一级目录
        Component folder5 = new Folder("folder5");//一级目录

        root.addFolder(folder1).addFolder(folder2).addFolder(folder3).addFolder(folder4).addFolder(folder5);
        folder1.addFile(new File("file1.txt"));
        folder4.addFile( new File("file4.txt"));

        Iterator<Component> all = root.iterator();
        while (all.hasNext()){
            all.next().display();
        }
    }
}
