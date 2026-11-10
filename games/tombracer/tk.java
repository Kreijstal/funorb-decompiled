/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static ResourceArchive field_b;
    static String[][] field_a;

    final static int a(int param0) {
        if (param0 != -22636) {
          field_b = (ResourceArchive) null;
          return HardwareRidgedWaterNoise.field_v;
        }
        return HardwareRidgedWaterNoise.field_v;
    }

    public static void releaseStatics(boolean param0) {
        field_a = (String[][]) null;
        if (param0) {
          tk.releaseStatics(false);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
    }
}
