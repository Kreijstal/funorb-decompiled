/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoadingStageHook {
    static int field_a;
    static String[] field_f;
    static String field_b;
    static Sprite field_d;
    static boolean field_e;
    static Archive field_c;

    final static void runLoadingStageHook(int param0) {
        if (param0 != 16) {
          LoadingStageHook.runLoadingStageHook(108);
        }
    }

    public static void releaseStatics(boolean param0) {
        field_b = null;
        field_d = null;
        if (param0) {
          field_c = null;
          field_f = null;
          return;
        }
        LoadingStageHook.runLoadingStageHook(62);
        field_c = null;
        field_f = null;
    }

    static {
        field_f = new String[16];
        field_b = "Play rated game";
    }
}
