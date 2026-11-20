/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BlueprintEditorText {
    static String editorText;
    static int field_b;
    static String overwriteConfirmationText;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        editorText = null;
        overwriteConfirmationText = null;
        if (param0 != 1) {
          BlueprintEditorText.clearSharedReferences(-21);
        }
    }

    static {
        field_z = "veb.A(";
        field_b = 1;
        editorText = "Editor";
        overwriteConfirmationText = "Click again to overwrite";
    }
}
