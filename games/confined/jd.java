/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static int[] field_d;
    static ResourceArchive field_b;
    static int[] field_h;
    static int[] field_e;
    static PrimaryNodeDeque field_f;
    static int field_g;
    static boolean field_c;
    static PcmSample field_a;

    public static void clearStaticReferences(byte param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0 != -38) {
          field_b = (ResourceArchive) null;
        }
        field_f = null;
        field_a = null;
        field_h = null;
    }

    final static RgbSprite[] a(int param0, int param1, int param2, int param3, boolean param4) {
        RgbSprite[] var6 = new RgbSprite[9];
        RgbSprite[] var5 = var6;
        RgbSprite dupTemp$0 = wm.a(param3, true, param2);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        RgbSprite dupTemp$1 = wm.a(param3, param4, param0);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param1 != 0) {
          var6[4] = wm.a(64, true, param1);
        }
        return var5;
    }

    final static void sleepMillis(int param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (param0 != 1) {
          field_c = true;
        }
        if (param1 % 10L == 0L) {
          wd.sleepIgnoringInterrupts(-1L + param1, -1);
          wd.sleepIgnoringInterrupts(1L, 119);
        } else {
          wd.sleepIgnoringInterrupts(param1, 125);
        }
    }

    static {
        int var0 = 0;
        double var1 = 0.0;
        int var0Lifetime1;
        double var1Lifetime1;
        field_d = new int[65536];
        field_h = new int[65536];
        for (var0 = 0; var0 < 65536; var0++) {
          var1 = -Math.sqrt((double)var0) + 256.0;
          field_d[var0] = (int)(0.5 + var1 * var1);
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 65536; var0Lifetime1++) {
          var1Lifetime1 = Math.sqrt((double)var0Lifetime1);
          field_h[var0Lifetime1] = (int)Math.floor(768.5 - 9.0 * var1Lifetime1 + (double)var0Lifetime1 * 0.0234375);
        }
        field_e = new int[8192];
        field_f = new PrimaryNodeDeque();
    }
}
