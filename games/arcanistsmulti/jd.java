/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    private int[] field_a;
    private int field_k;
    private int field_d;
    private int[] field_f;
    static String field_c;
    private int field_b;
    static String field_e;
    static String field_i;
    static qb[] field_j;
    static String field_g;
    private int field_h;

    final int c(byte param0) {
        ((jd) this).field_b = ((jd) this).field_b - 1;
        if (!(((jd) this).field_b != 0)) {
            this.a((byte) -103);
            ((jd) this).field_b = 255;
        }
        if (param0 != -46) {
            field_i = null;
        }
        return ((jd) this).field_a[((jd) this).field_b];
    }

    public static void d(byte param0) {
        field_j = null;
        if (param0 != -109) {
            jd.d((byte) -44);
        }
        field_i = null;
        field_g = null;
        field_c = null;
        field_e = null;
    }

    private final void a(int param0) {
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
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == 1046142536) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        var8 = -1640531527;
        var3 = -1640531527;
        var5 = -1640531527;
        var4 = -1640531527;
        var9 = -1640531527;
        var6 = -1640531527;
        var7 = -1640531527;
        var10 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L3: while (true) {
                  if ((var2 ^ -1) <= -257) {
                    this.a((byte) -126);
                    ((jd) this).field_b = 256;
                    return;
                  } else {
                    var7 = var7 + ((jd) this).field_f[var2 - -4];
                    var9 = var9 + ((jd) this).field_f[6 + var2];
                    var3 = var3 + ((jd) this).field_f[var2];
                    var10 = var10 + ((jd) this).field_f[7 + var2];
                    var6 = var6 + ((jd) this).field_f[var2 + 3];
                    var4 = var4 + ((jd) this).field_f[var2 + 1];
                    var8 = var8 + ((jd) this).field_f[5 + var2];
                    var5 = var5 + ((jd) this).field_f[var2 - -2];
                    var3 = var3 ^ var4 << 875389387;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 664968706;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -893967960;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -562421744;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -2044102166;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 639147780;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -872798648;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -568192471;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((jd) this).field_f[var2] = var3;
                    ((jd) this).field_f[1 + var2] = var4;
                    ((jd) this).field_f[var2 - -2] = var5;
                    ((jd) this).field_f[3 + var2] = var6;
                    ((jd) this).field_f[var2 + 4] = var7;
                    ((jd) this).field_f[var2 + 5] = var8;
                    ((jd) this).field_f[var2 - -6] = var9;
                    ((jd) this).field_f[var2 - -7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var7 = var7 + ((jd) this).field_a[4 + var2];
                var4 = var4 + ((jd) this).field_a[var2 - -1];
                var10 = var10 + ((jd) this).field_a[var2 + 7];
                var5 = var5 + ((jd) this).field_a[var2 + 2];
                var8 = var8 + ((jd) this).field_a[var2 - -5];
                var9 = var9 + ((jd) this).field_a[var2 + 6];
                var6 = var6 + ((jd) this).field_a[3 + var2];
                var3 = var3 + ((jd) this).field_a[var2];
                var3 = var3 ^ var4 << -693057493;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> -640872414;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << 656376392;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> 1145160752;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << 745669386;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> -2086837532;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << -1991288184;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 916879017;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((jd) this).field_f[var2] = var3;
                ((jd) this).field_f[var2 + 1] = var4;
                ((jd) this).field_f[var2 + 2] = var5;
                ((jd) this).field_f[var2 - -3] = var6;
                ((jd) this).field_f[var2 - -4] = var7;
                ((jd) this).field_f[var2 - -5] = var8;
                ((jd) this).field_f[6 + var2] = var9;
                ((jd) this).field_f[7 + var2] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 892115883;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 722398754;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -2069697496;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -1030212400;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 1854946794;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 630984964;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 1046142536;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -929659831;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L1;
          }
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 < -84) {
            break L0;
          } else {
            ((jd) this).field_d = -89;
            break L0;
          }
        }
        ((jd) this).field_d = ((jd) this).field_d + 1;
        ((jd) this).field_k = ((jd) this).field_k + (((jd) this).field_d + 1);
        var2 = 0;
        L1: while (true) {
          if (-257 >= var2) {
            return;
          } else {
            L2: {
              var3 = ((jd) this).field_f[var2];
              if (-1 != (2 & var2)) {
                if (0 != (1 & var2)) {
                  ((jd) this).field_h = ((jd) this).field_h ^ ((jd) this).field_h >>> -533837616;
                  break L2;
                } else {
                  ((jd) this).field_h = ((jd) this).field_h ^ ((jd) this).field_h << 1649781730;
                  break L2;
                }
              } else {
                if (-1 != (var2 & 1 ^ -1)) {
                  ((jd) this).field_h = ((jd) this).field_h ^ ((jd) this).field_h >>> 61505094;
                  break L2;
                } else {
                  ((jd) this).field_h = ((jd) this).field_h ^ ((jd) this).field_h << -1625450995;
                  break L2;
                }
              }
            }
            ((jd) this).field_h = ((jd) this).field_h + ((jd) this).field_f[var2 + 128 & 255];
            var4 = ((jd) this).field_h + ((jd) this).field_f[dg.a(var3 >> 160291746, 255)] + ((jd) this).field_k;
            ((jd) this).field_f[var2] = ((jd) this).field_h + ((jd) this).field_f[dg.a(var3 >> 160291746, 255)] + ((jd) this).field_k;
            ((jd) this).field_k = var3 + ((jd) this).field_f[dg.a(255, var4 >> -147818776 >> 1203664194)];
            ((jd) this).field_a[var2] = var3 + ((jd) this).field_f[dg.a(255, var4 >> -147818776 >> 1203664194)];
            var2++;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        co.field_f.a(param3, param0, param5, param1, (byte) -120);
        if (!(null == nn.field_q)) {
            nn.field_q.a(param6, -ng.field_K + param6, param1, true, param1, param4);
        }
        if (param2 != 19) {
            field_e = null;
        }
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != -116) {
            ((jd) this).field_b = 111;
        }
        if (!((param0 ^ -1) < -1)) {
            throw new IllegalArgumentException();
        }
        int var3 = 2147483647 + -(int)(4294967296L % (long)param0);
        do {
            var4 = ((jd) this).c((byte) -46);
        } while (var3 < var4);
        return dh.a(var4, true, param0);
    }

    final static int b(int param0) {
        if (param0 >= -6) {
            int discarded$0 = jd.b(1);
        }
        return qm.field_u;
    }

    final jd b(byte param0) {
        jd var2 = new jd();
        var2.field_f = new int[256];
        var2.field_a = new int[256];
        if (param0 <= 22) {
            ((jd) this).field_f = null;
        }
        var2.field_b = ((jd) this).field_b;
        sf.a(((jd) this).field_a, 0, var2.field_a, 0, 256);
        sf.a(((jd) this).field_f, 0, var2.field_f, 0, 256);
        var2.field_d = ((jd) this).field_d;
        var2.field_k = ((jd) this).field_k;
        var2.field_h = ((jd) this).field_h;
        return var2;
    }

    private jd() {
    }

    jd(int[] param0) {
        int var2 = 0;
        ((jd) this).field_a = new int[256];
        ((jd) this).field_f = new int[256];
        for (var2 = 0; var2 < param0.length; var2++) {
            ((jd) this).field_a[var2] = param0[var2];
        }
        this.a(1046142536);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "The target up the cliff to the left is harder to reach. Pressing 'Backspace' will cause you to jump up high. Use this ability to scale the cliff.";
        field_e = "Protect your Arcanist within the safety of a tower - just click the mouse to cast. You can leave a tower by jumping.";
        field_i = "Message lobby";
    }
}
