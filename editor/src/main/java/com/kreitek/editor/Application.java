package com.kreitek.editor;

public class Application {

    public static void main(String[] args) {
        EditorFactory editorFactory = new EditorFactory();
        if(args[0].equals("text")) {
            Editor editor = editorFactory.getEditor();
            editor.run();
        }else if (args[0].equals("json")){
            Editor editor = editorFactory.getEditorJson();
            editor.run();
        }else{
            System.out.println("argumento erroneo");
        }

    }

}
