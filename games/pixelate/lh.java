/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    private int[] field_c;
    static ak field_b;
    private int field_d;
    private int[] field_h;
    private int field_i;
    static boolean field_g;
    static String field_j;
    private int field_f;
    private int field_e;
    static String field_a;

    final static hh a(int param0, fm param1, int param2, int param3) {
        if (param3 <= 114) {
            field_a = null;
        }
        if (!rk.a(param2, false, param1, param0)) {
            return null;
        }
        return tj.b((byte) -103);
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
        int var12 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        var9 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var3 = -1640531527;
        var4 = -1640531527;
        var6 = -1640531527;
        var11 = -48 % ((param0 - 36) / 44);
        var8 = -1640531527;
        var10 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -5) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -257) {
                var2 = 0;
                L2: while (true) {
                  if (-257 >= (var2 ^ -1)) {
                    this.a(false);
                    ((lh) this).field_e = 256;
                    return;
                  } else {
                    var3 = var3 + ((lh) this).field_c[var2];
                    var10 = var10 + ((lh) this).field_c[7 + var2];
                    var4 = var4 + ((lh) this).field_c[var2 + 1];
                    var9 = var9 + ((lh) this).field_c[6 + var2];
                    var5 = var5 + ((lh) this).field_c[var2 - -2];
                    var7 = var7 + ((lh) this).field_c[var2 + 4];
                    var6 = var6 + ((lh) this).field_c[3 + var2];
                    var8 = var8 + ((lh) this).field_c[5 + var2];
                    var3 = var3 ^ var4 << -721909685;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -1390876766;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -981150264;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 1293273328;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -310902678;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 48077700;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -535351224;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 249680393;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((lh) this).field_c[var2] = var3;
                    ((lh) this).field_c[1 + var2] = var4;
                    ((lh) this).field_c[var2 + 2] = var5;
                    ((lh) this).field_c[3 + var2] = var6;
                    ((lh) this).field_c[4 + var2] = var7;
                    ((lh) this).field_c[5 + var2] = var8;
                    ((lh) this).field_c[6 + var2] = var9;
                    ((lh) this).field_c[var2 + 7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var3 = var3 + ((lh) this).field_h[var2];
                var7 = var7 + ((lh) this).field_h[4 + var2];
                var4 = var4 + ((lh) this).field_h[var2 - -1];
                var8 = var8 + ((lh) this).field_h[var2 + 5];
                var10 = var10 + ((lh) this).field_h[var2 + 7];
                var5 = var5 + ((lh) this).field_h[2 + var2];
                var6 = var6 + ((lh) this).field_h[3 + var2];
                var9 = var9 + ((lh) this).field_h[6 + var2];
                var3 = var3 ^ var4 << -760426997;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 1898855906;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << -865169976;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> 369800400;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << -187975830;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 78339940;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << -1055121144;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -1801031639;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((lh) this).field_c[var2] = var3;
                ((lh) this).field_c[var2 - -1] = var4;
                ((lh) this).field_c[var2 - -2] = var5;
                ((lh) this).field_c[3 + var2] = var6;
                ((lh) this).field_c[4 + var2] = var7;
                ((lh) this).field_c[5 + var2] = var8;
                ((lh) this).field_c[6 + var2] = var9;
                ((lh) this).field_c[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 740219659;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> -2086660606;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -1822721272;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -436350416;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -1509384726;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -1141496604;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 1814196936;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 511832073;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    final int a(int param0) {
        if (!(0 != ((lh) this).field_e)) {
            this.a(false);
            ((lh) this).field_e = 256;
        }
        if (param0 != 256) {
            ((lh) this).field_f = -113;
        }
        ((lh) this).field_e = ((lh) this).field_e - 1;
        return ((lh) this).field_h[((lh) this).field_e - 1];
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          ((lh) this).field_d = ((lh) this).field_d + 1;
          ((lh) this).field_i = ((lh) this).field_i + (((lh) this).field_d + 1);
          var2 = 0;
          if (!param0) {
            break L0;
          } else {
            ((lh) this).field_f = 19;
            break L0;
          }
        }
        L1: while (true) {
          if (-257 >= (var2 ^ -1)) {
            return;
          } else {
            L2: {
              var3 = ((lh) this).field_c[var2];
              if ((2 & var2) == 0) {
                if (0 != (var2 & 1)) {
                  ((lh) this).field_f = ((lh) this).field_f ^ ((lh) this).field_f >>> -2048654522;
                  break L2;
                } else {
                  ((lh) this).field_f = ((lh) this).field_f ^ ((lh) this).field_f << 2100437549;
                  break L2;
                }
              } else {
                if ((1 & var2) != 0) {
                  ((lh) this).field_f = ((lh) this).field_f ^ ((lh) this).field_f >>> -58926992;
                  break L2;
                } else {
                  ((lh) this).field_f = ((lh) this).field_f ^ ((lh) this).field_f << -1472161086;
                  break L2;
                }
              }
            }
            ((lh) this).field_f = ((lh) this).field_f + ((lh) this).field_c[255 & var2 + 128];
            var4 = ((lh) this).field_i + ((lh) this).field_f + ((lh) this).field_c[cm.a(255, var3 >> 1480786466)];
            ((lh) this).field_c[var2] = ((lh) this).field_i + ((lh) this).field_f + ((lh) this).field_c[cm.a(255, var3 >> 1480786466)];
            ((lh) this).field_i = ((lh) this).field_c[cm.a(255, var4 >> 1153342376 >> -743386238)] + var3;
            ((lh) this).field_h[var2] = ((lh) this).field_c[cm.a(255, var4 >> 1153342376 >> -743386238)] + var3;
            var2++;
            continue L1;
          }
        }
    }

    public static void c(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 7) {
            return;
        }
        field_j = null;
    }

    final static ld a(fm param0, int param1, int param2, fm param3, int param4) {
        if (!rk.a(param4, false, param0, param1)) {
            return null;
        }
        if (param2 != 48077700) {
            field_j = null;
        }
        return on.a(param3.a(param1, param4, true), param2 ^ 48077726);
    }

    lh(int[] param0) {
        int var2 = 0;
        ((lh) this).field_h = new int[256];
        ((lh) this).field_c = new int[256];
        for (var2 = 0; var2 < param0.length; var2++) {
            ((lh) this).field_h[var2] = param0[var2];
        }
        this.b(-60);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Security";
        field_a = "Please try again in a few minutes.";
    }
}
