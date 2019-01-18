package structurePattern.componentPattern;

import java.util.Iterator;
import java.util.List;

public interface Component {
    void addFile(Component file);

    void removeFile(Component file);

    Component addFolder(Component folder);

    void removeFolder(Component folder);

    List<Component> getFiles();

    List<Component> getFolders();

    List<Component> getAll();

    Iterator<Component> iterator();

    void display();
}