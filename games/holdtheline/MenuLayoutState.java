/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuLayoutState {
    static ResourceArchive field_a;
    static String field_b;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -21989) {
          field_a = (ResourceArchive) null;
        }
    }

    final static void clearArchiveOnGuardMismatch(int param0) {
        if (param0 != 26719) {
          field_a = (ResourceArchive) null;
        }
    }

    final static int getMenuHeight(int param0) {
        if (param0 != 20719) {
          MenuLayoutState.clearSharedReferences(108);
          return TrackBoundary.menuHeight;
        }
        return TrackBoundary.menuHeight;
    }

    static {
        field_b = "Create your own free Jagex account";
    }
}
