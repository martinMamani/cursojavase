package ar.com.eduit.curso.java.utils.file;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
public interface I_File {
    void print();
    String getText();
    void setText(String text);
    void appendText(String text);
    void addLine(String line);
    void addLines(Collection<String>lines);
    void clear();
    List<String>getLines();
    List<String>getLines(String filter);
    List<String>getSorteredLines();
    List<String>getSorteredLines(String filter);
    List<String>getReversedLines();
    List<String>getReversedSorteredLines();
    LinkedHashSet<String>getLinkedHashSetLines();
    TreeSet<String>getTreeSetLines();
    void removeLine(String line);
}