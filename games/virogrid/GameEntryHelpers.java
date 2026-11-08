/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameEntryHelpers {
    static ConnectionStage field_a;
    static byte[][] field_b;
    static int[] field_c;

    public static void releaseStatics(int param0) {
        if (param0 == 1000) {
          field_a = null;
          field_b = (byte[][]) null;
          field_c = null;
          return;
        }
        field_c = (int[]) null;
        field_a = null;
        field_b = (byte[][]) null;
        field_c = null;
    }

    final static boolean isCurrentGameEntry(int param0) {
        if (param0 == 1000) {
          return AudioSetupHelpers.field_d.field_gc == LogoAndLoginHelpers.field_d ? true : false;
        }
        field_b = (byte[][]) null;
        return AudioSetupHelpers.field_d.field_gc == LogoAndLoginHelpers.field_d ? true : false;
    }

    static {
        field_a = new ConnectionStage();
        field_b = new byte[1000][];
    }
}
