/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveKeyRequest extends IntrusiveNode {
    int id;
    static QuickChatDynamicCommand field_n;
    int[] key;
    int category;
    static InputValidationError field_k;
    static String field_m;
    private static String field_z;

    public static void clearSharedReferences(boolean param0) {
        field_k = null;
        field_n = null;
        field_m = null;
        if (param0) {
          field_m = (String) null;
        }
    }

    ArchiveKeyRequest() {
    }

    static {
        field_z = "fo.A(";
        field_n = new QuickChatDynamicCommand(1, 2, 2, 0);
        field_k = new InputValidationError();
        field_m = "Create a free Account";
    }
}
