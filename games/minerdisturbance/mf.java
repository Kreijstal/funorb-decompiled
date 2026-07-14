/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static ta field_h;
    private int field_g;
    private int field_d;
    private int[] field_l;
    private int[] field_e;
    static int field_i;
    static long field_k;
    private int field_n;
    private int field_b;
    static char[] field_f;
    static Boolean field_a;
    static ea field_c;
    static int[] field_m;
    static ac field_j;

    public static void c(byte param0) {
        if (param0 <= 0) {
            field_h = null;
        }
        field_j = null;
        field_f = null;
        field_m = null;
        field_a = null;
        field_h = null;
        field_c = null;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 != -752960408) {
            return;
        }
        if (!(11 != fh.field_b)) {
            pk.b(114);
        }
        mn.a((byte) -63, oe.field_d, ul.field_a, bj.field_c);
        cl.a(param1, 0, 0, 310);
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        ((mf) this).field_n = ((mf) this).field_n + 1;
        ((mf) this).field_g = ((mf) this).field_g + (((mf) this).field_n + 1);
        var2 = 0;
        L0: while (true) {
          if (-257 >= (var2 ^ -1)) {
            L1: {
              if (param0 == -91) {
                break L1;
              } else {
                ((mf) this).field_d = -29;
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var3 = ((mf) this).field_e[var2];
              if ((var2 & 2) == 0) {
                if ((var2 & 1) != 0) {
                  ((mf) this).field_b = ((mf) this).field_b ^ ((mf) this).field_b >>> 691401094;
                  break L2;
                } else {
                  ((mf) this).field_b = ((mf) this).field_b ^ ((mf) this).field_b << -57282547;
                  break L2;
                }
              } else {
                if ((1 & var2) == 0) {
                  ((mf) this).field_b = ((mf) this).field_b ^ ((mf) this).field_b << -1366241694;
                  break L2;
                } else {
                  ((mf) this).field_b = ((mf) this).field_b ^ ((mf) this).field_b >>> -209774640;
                  break L2;
                }
              }
            }
            ((mf) this).field_b = ((mf) this).field_b + ((mf) this).field_e[var2 + 128 & 255];
            var4 = ((mf) this).field_g + (((mf) this).field_b + ((mf) this).field_e[c.a(1020, var3) >> 654921122]);
            ((mf) this).field_e[var2] = ((mf) this).field_g + (((mf) this).field_b + ((mf) this).field_e[c.a(1020, var3) >> 654921122]);
            ((mf) this).field_g = var3 + ((mf) this).field_e[c.a(261205, var4) >> 705589640 >> 296878274];
            ((mf) this).field_l[var2] = var3 + ((mf) this).field_e[c.a(261205, var4) >> 705589640 >> 296878274];
            var2++;
            continue L0;
          }
        }
    }

    private final void b(byte param0) {
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
          var11 = MinerDisturbance.field_ab;
          if (param0 == 90) {
            break L0;
          } else {
            ((mf) this).field_e = null;
            break L0;
          }
        }
        var7 = -1640531527;
        var8 = -1640531527;
        var6 = -1640531527;
        var10 = -1640531527;
        var4 = -1640531527;
        var9 = -1640531527;
        var3 = -1640531527;
        var5 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L3: while (true) {
                  if (-257 >= (var2 ^ -1)) {
                    this.a((byte) -91);
                    ((mf) this).field_d = 256;
                    return;
                  } else {
                    var5 = var5 + ((mf) this).field_e[var2 - -2];
                    var3 = var3 + ((mf) this).field_e[var2];
                    var9 = var9 + ((mf) this).field_e[6 + var2];
                    var8 = var8 + ((mf) this).field_e[var2 + 5];
                    var7 = var7 + ((mf) this).field_e[4 + var2];
                    var10 = var10 + ((mf) this).field_e[7 + var2];
                    var6 = var6 + ((mf) this).field_e[3 + var2];
                    var4 = var4 + ((mf) this).field_e[var2 + 1];
                    var3 = var3 ^ var4 << -1084828021;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1393050782;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 1374820968;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 847888816;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 1904117450;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -1049415772;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << -249633272;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 320964361;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((mf) this).field_e[var2] = var3;
                    ((mf) this).field_e[var2 + 1] = var4;
                    ((mf) this).field_e[2 + var2] = var5;
                    ((mf) this).field_e[var2 + 3] = var6;
                    ((mf) this).field_e[4 + var2] = var7;
                    ((mf) this).field_e[5 + var2] = var8;
                    ((mf) this).field_e[6 + var2] = var9;
                    ((mf) this).field_e[var2 - -7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var5 = var5 + ((mf) this).field_l[2 + var2];
                var6 = var6 + ((mf) this).field_l[var2 - -3];
                var3 = var3 + ((mf) this).field_l[var2];
                var4 = var4 + ((mf) this).field_l[var2 + 1];
                var8 = var8 + ((mf) this).field_l[5 + var2];
                var9 = var9 + ((mf) this).field_l[6 + var2];
                var10 = var10 + ((mf) this).field_l[var2 - -7];
                var7 = var7 + ((mf) this).field_l[var2 + 4];
                var3 = var3 ^ var4 << -1332641621;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> -128159422;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << -2130680280;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1212044944;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 45326570;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 1197919364;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 591620840;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -161835735;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((mf) this).field_e[var2] = var3;
                ((mf) this).field_e[var2 - -1] = var4;
                ((mf) this).field_e[var2 - -2] = var5;
                ((mf) this).field_e[3 + var2] = var6;
                ((mf) this).field_e[4 + var2] = var7;
                ((mf) this).field_e[var2 + 5] = var8;
                ((mf) this).field_e[var2 + 6] = var9;
                ((mf) this).field_e[var2 + 7] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 2122869803;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 1329604770;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 186479592;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -1175804560;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -1552008854;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 1504221540;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << -752960408;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 832577897;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L1;
          }
        }
    }

    final static pf a(int param0) {
        int var1 = 78 / ((param0 - 80) / 44);
        return new pf(lm.n(81), wc.b((byte) 117));
    }

    final int b(int param0) {
        if (param0 != 4) {
            return 35;
        }
        if (-1 == (((mf) this).field_d ^ -1)) {
            this.a((byte) -91);
            ((mf) this).field_d = 256;
        }
        ((mf) this).field_d = ((mf) this).field_d - 1;
        return ((mf) this).field_l[((mf) this).field_d - 1];
    }

    mf(int[] param0) {
        int var2 = 0;
        ((mf) this).field_l = new int[256];
        ((mf) this).field_e = new int[256];
        for (var2 = 0; param0.length > var2; var2++) {
            ((mf) this).field_l[var2] = param0[var2];
        }
        this.b((byte) 90);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0L;
        field_h = new ta();
        field_f = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_c = new ea(640, 480);
    }
}
