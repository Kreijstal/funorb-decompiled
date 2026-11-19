/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static ResourceArchive field_a;
    static String field_b;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -21989) {
          field_a = (ResourceArchive) null;
        }
    }

    final static void c(int param0) {
        if (param0 != 26719) {
          field_a = (ResourceArchive) null;
        }
    }

    final static int b(int param0) {
        if (param0 != 20719) {
          ml.clearSharedReferences(108);
          return TrackBoundary.field_v;
        }
        return TrackBoundary.field_v;
    }

    static {
        field_b = "Create your own free Jagex account";
    }
}
