/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndexLoaderState {
    static ArchiveIndexLoader loader;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        loader = null;
        if (param0 != 13032) {
          ArchiveIndexLoaderState.clearSharedReferences(102);
        }
    }

    static {
        field_z = "ho.A(";
    }
}
