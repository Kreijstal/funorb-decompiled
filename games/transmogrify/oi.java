/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends IntrusiveNode {
    int[] field_m;
    static String field_j;
    static ResourceArchive field_g;
    static long field_i;
    static ModalDialogHost field_k;
    static String[] field_l;
    int field_h;

    public static void clearStaticReferences(int param0) {
        field_g = null;
        field_k = null;
        field_j = null;
        field_l = null;
        if (param0 >= -36) {
          field_g = (ResourceArchive) null;
        }
    }

    private oi() throws Throwable {
        throw new Error();
    }

    static {
        field_j = "to return to the normal view.";
    }
}
