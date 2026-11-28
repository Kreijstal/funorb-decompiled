/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static int[] field_a;

    public static void clearStaticReferences(byte param0) {
        if (param0 <= 41) {
          field_a = (int[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(boolean param0) {
        if (param0) {
          field_a = (int[]) null;
          return ArchiveSourceManager.field_h.loadMasterIndex((byte) -111);
        }
        return ArchiveSourceManager.field_h.loadMasterIndex((byte) -111);
    }

    final static int a(int param0) {
        if (param0 != 12035) {
          field_a = (int[]) null;
          return ClientException.field_d;
        }
        return ClientException.field_d;
    }

    static {
    }
}
