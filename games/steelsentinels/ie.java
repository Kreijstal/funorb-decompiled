/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static cm field_k;
    static boolean field_c;
    private int[] field_h;
    static String field_a;
    static int[][] field_f;
    private int field_e;
    private int field_g;
    private int field_j;
    static gk[] field_d;
    private int[] field_b;
    private int field_i;

    final static void b(byte param0) {
        int var1_int = 0;
        int var2 = SteelSentinels.field_G;
        try {
            for (var1_int = 0; var1_int < uc.field_a; var1_int++) {
                ph.field_e[var1_int] = null;
            }
            if (param0 != 124) {
                ie.b((byte) 117);
            }
            uc.field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ie.A(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SteelSentinels.field_G;
        var9 = -1640531527;
        var4 = -1640531527;
        var7 = -1640531527;
        var6 = -1640531527;
        var10 = -1640531527;
        var5 = -1640531527;
        var3 = -1640531527;
        var8 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a(116);
                    ((ie) this).field_i = 256;
                    return;
                  } else {
                    var6 = var6 + ((ie) this).field_b[var2 - -3];
                    var5 = var5 + ((ie) this).field_b[var2 + 2];
                    var3 = var3 + ((ie) this).field_b[var2];
                    var4 = var4 + ((ie) this).field_b[1 + var2];
                    var10 = var10 + ((ie) this).field_b[7 + var2];
                    var9 = var9 + ((ie) this).field_b[6 + var2];
                    var7 = var7 + ((ie) this).field_b[var2 + 4];
                    var8 = var8 + ((ie) this).field_b[5 + var2];
                    var3 = var3 ^ var4 << 11;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 2;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 8;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 16;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 10;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 4;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 8;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 9;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((ie) this).field_b[var2] = var3;
                    ((ie) this).field_b[var2 - -1] = var4;
                    ((ie) this).field_b[var2 - -2] = var5;
                    ((ie) this).field_b[3 + var2] = var6;
                    ((ie) this).field_b[var2 - -4] = var7;
                    ((ie) this).field_b[var2 + 5] = var8;
                    ((ie) this).field_b[6 + var2] = var9;
                    ((ie) this).field_b[var2 - -7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var9 = var9 + ((ie) this).field_h[var2 + 6];
                var3 = var3 + ((ie) this).field_h[var2];
                var10 = var10 + ((ie) this).field_h[7 + var2];
                var7 = var7 + ((ie) this).field_h[4 + var2];
                var6 = var6 + ((ie) this).field_h[3 + var2];
                var8 = var8 + ((ie) this).field_h[5 + var2];
                var5 = var5 + ((ie) this).field_h[2 + var2];
                var4 = var4 + ((ie) this).field_h[1 + var2];
                var3 = var3 ^ var4 << 11;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 2;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 8;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> 16;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 10;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 4;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 8;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 9;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((ie) this).field_b[var2] = var3;
                ((ie) this).field_b[var2 + 1] = var4;
                ((ie) this).field_b[var2 - -2] = var5;
                ((ie) this).field_b[var2 + 3] = var6;
                ((ie) this).field_b[var2 + 4] = var7;
                ((ie) this).field_b[var2 - -5] = var8;
                ((ie) this).field_b[var2 + 6] = var9;
                ((ie) this).field_b[var2 + 7] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 2;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 8;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 16;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 10;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 4;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 8;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 9;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int fieldTemp$3 = ((ie) this).field_g + 1;
        ((ie) this).field_g = ((ie) this).field_g + 1;
        ((ie) this).field_j = ((ie) this).field_j + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            var5 = -1 / ((param0 - 54) / 60);
            return;
          } else {
            L1: {
              var3 = ((ie) this).field_b[var2];
              if (0 == (var2 & 2)) {
                if ((1 & var2) != 0) {
                  ((ie) this).field_e = ((ie) this).field_e ^ ((ie) this).field_e >>> 6;
                  break L1;
                } else {
                  ((ie) this).field_e = ((ie) this).field_e ^ ((ie) this).field_e << 13;
                  break L1;
                }
              } else {
                if (0 == (var2 & 1)) {
                  ((ie) this).field_e = ((ie) this).field_e ^ ((ie) this).field_e << 2;
                  break L1;
                } else {
                  ((ie) this).field_e = ((ie) this).field_e ^ ((ie) this).field_e >>> 16;
                  break L1;
                }
              }
            }
            ((ie) this).field_e = ((ie) this).field_e + ((ie) this).field_b[var2 + 128 & 255];
            int dupTemp$4 = ((ie) this).field_j + (((ie) this).field_b[ec.a(var3, 1020) >> 2] - -((ie) this).field_e);
            var4 = dupTemp$4;
            ((ie) this).field_b[var2] = dupTemp$4;
            int dupTemp$5 = ((ie) this).field_b[ec.a(261147, var4) >> 8 >> 2] + var3;
            ((ie) this).field_j = dupTemp$5;
            ((ie) this).field_h[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        int var6 = SteelSentinels.field_G;
        if (param1 <= 0) {
            throw new IllegalArgumentException();
        }
        int var5 = -9 % ((-40 - param0) / 54);
        int var3 = 2147483647 - (int)(4294967296L % (long)param1);
        do {
            var4 = ((ie) this).c(-104);
        } while (var3 < var4);
        return uh.a(false, var4, param1);
    }

    public static void a(byte param0) {
        field_d = null;
        field_f = null;
        field_a = null;
        field_k = null;
    }

    final int c(int param0) {
        if (param0 >= -86) {
            this.a(74);
        }
        if (!(((ie) this).field_i != 0)) {
            this.a(126);
            ((ie) this).field_i = 256;
        }
        int fieldTemp$0 = ((ie) this).field_i - 1;
        ((ie) this).field_i = ((ie) this).field_i - 1;
        return ((ie) this).field_h[fieldTemp$0];
    }

    final static void a(ck param0, int param1, ck param2) {
        if (param2.field_i != null) {
            param2.b(4);
        }
        param2.field_k = param0;
        param2.field_i = param0.field_i;
        param2.field_i.field_k = param2;
        try {
            param2.field_k.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ie.G(" + (param0 != null ? "{...}" : "null") + ',' + 30 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ie(int[] param0) {
        int var2_int = 0;
        try {
            ((ie) this).field_h = new int[256];
            ((ie) this).field_b = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((ie) this).field_h[var2_int] = param0[var2_int];
            }
            this.b(55);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ie.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_f = new int[36][];
        field_f[35] = new int[2];
        field_f[11] = new int[2];
        field_f[12] = new int[2];
        field_f[3] = new int[2];
        field_f[30] = new int[2];
        field_f[10] = new int[2];
        field_f[2] = new int[2];
        field_f[14] = new int[2];
        field_f[21] = new int[2];
        field_f[29] = new int[2];
        field_f[4] = new int[2];
        field_f[18] = new int[2];
        field_f[0] = new int[2];
        field_f[5] = new int[2];
        field_f[17] = new int[2];
        field_f[1] = new int[2];
        field_f[13] = new int[2];
        field_f[16] = new int[2];
        field_f[15] = new int[2];
        field_f[26] = new int[2];
        field_f[28] = new int[2];
        field_f[31] = new int[2];
        field_f[27] = new int[2];
    }
}
