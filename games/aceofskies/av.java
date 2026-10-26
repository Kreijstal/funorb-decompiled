/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class av {
    static IntrusiveDeque field_c;
    private static int[] field_b;
    static ej field_a;

    final static boolean a(boolean param0) {
        if (ua.menuActions[0] != null) {
          return false;
        }
        za.registerMenuLayout(34, new int[]{0, 3, 22, 2, 14, 11}, 220, 210, 0, 430, (byte) -64);
        za.registerMenuLayout(32, new int[]{1, 12, 13, 3, 7}, 160, 170, 1, 470, (byte) 107);
        za.registerMenuLayout(32, new int[]{15, 5}, 400, 200, 2, 440, (byte) 106);
        za.registerMenuLayout(32, new int[]{18, 6, 17}, 430, 170, 3, 470, (byte) -103);
        za.registerMenuLayout(32, new int[]{15, 5}, 400, 260, 4, 512, (byte) -42);
        za.registerMenuLayout(32, new int[]{2, 5}, 400, 260, 5, 498, (byte) -64);
        za.registerMenuLayout(32, new int[]{15, 16}, 200, 110, 6, 530, (byte) -65);
        za.registerMenuLayout(32, new int[]{12, 13, 5}, 240, 170, 7, 470, (byte) 119);
        oq.field_K = kn.field_b.measureTextWidth((byte) 94, du.menuActionLabels[12]);
        int var1 = kn.field_b.measureTextWidth((byte) 94, du.menuActionLabels[13]);
        if (oq.field_K < var1) {
          oq.field_K = var1;
        }
        int var2 = 4 + dp.field_h.field_a + dp.field_h.maxDescent;
        bk.menuTop[6] = var2 + 200 + (dp.field_h.maxAscent + dp.field_h.maxDescent);
        if (!param0) {
          av.a((byte) -119);
        }
        oo.menuRowSpacing[6] = 30 + 2 * var2;
        return true;
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (param3) {
          var4++;
        }
        int var5 = -111 / ((-32 - param0) / 57);
        return qh.field_a[var4];
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 != 22847) {
          field_b = (int[]) null;
        }
        return mi.b(param1, param2, 22547) & ta.a(param2, param1, (byte) 82);
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        int var1 = -17 % ((param0 - 59) / 41);
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        int var1Lifetime1;
        int var1Lifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime2Lifetime1;
        field_c = new IntrusiveDeque();
        field_b = new int[128];
        for (var0 = 0; var0 < 64; var0++) {
          var1 = var0 * (var0 * 192) / 4096;
          var2 = 128 * var0 * (var0 * (var0 * var0)) / 16777216;
          var3 = 255 * (var0 * (var0 * var0)) / 262144;
          field_b[var0] = (var2 << 8) + (var1 << 16) + var3;
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 64; var0Lifetime1++) {
          var1Lifetime1 = 96 * (var0Lifetime1 * var0Lifetime1) / 4096;
          var2Lifetime1 = 32 * (var0Lifetime1 * (var0Lifetime1 * var0Lifetime1)) / 262144;
          var3Lifetime1 = var0Lifetime1 * var0Lifetime1 * 128 / 4096;
          field_b[-var0Lifetime1 + 127] = (var1Lifetime1 << 16) - (-(var2Lifetime1 << 8) - var3Lifetime1);
        }
        var0Lifetime2 = 16711935 & field_b[63];
        var1Lifetime2 = 65280 & field_b[63];
        for (var2Lifetime2 = 0; var2Lifetime2 < 2; var2Lifetime2++) {
          var3Lifetime2 = field_b[64 + var2Lifetime2];
          var4 = 256 - 256 * var2Lifetime2 / 2;
          var5 = 16711935 & var3Lifetime2;
          var6 = var3Lifetime2 & 65280;
          var5 = var5 * (-var4 + 256);
          var6 = var6 * (-var4 + 256);
          var5 = var5 + var0Lifetime2 * var4;
          var6 = var6 + var1Lifetime2 * var4;
          var3Lifetime2Lifetime1 = (var6 & 16711680 | -16711936 & var5) >>> 8;
          field_b[64 + var2Lifetime2] = var3Lifetime2Lifetime1;
        }
        field_a = new ej(2, 4, 4, 0);
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$c7de0d339b2a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (param3) {
          var4++;
        }
        int var5 = -111 / ((-32 - param0) / 57);
        return qh.field_a[var4];
    }
}
