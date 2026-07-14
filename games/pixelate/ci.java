/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends jj {
    private li field_q;
    static boolean field_n;
    static int[] field_m;
    static String field_r;
    private li field_p;
    static int field_o;

    final void c(int param0) {
        super.c(param0);
        ((ci) this).field_p.a(440, 100, (byte) 116, 120, 0);
        ((ci) this).field_q.a(440, 100, (byte) 116, 120, 0);
        lg.field_a = lg.field_a - 4;
        if (!(0 <= lg.field_a)) {
            lg.field_a = 0;
        }
    }

    final void a(boolean param0) {
        qa.field_g.f(0, 0);
        int var2 = lg.field_a >> -1894730653;
        t.f(0, 0, 640, 480, 17, (var2 << -2067220824) + (var2 * 2 + 34) - -(var2 << 1759534608));
        ((ci) this).field_p.b((byte) -123);
        ((ci) this).field_q.b((byte) -123);
        Pixelate.field_E.b(0, -Pixelate.field_E.field_B + 480);
        if (param0) {
            return;
        }
        u.field_f.b(0, -u.field_f.field_B + 480, lg.field_a);
    }

    ci(String param0, tf[] param1) {
        super(param0, param1);
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        var18 = new int[255];
        var16 = var18;
        var14 = var16;
        var12 = var14;
        var11 = var12;
        var3 = var11;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var18.length) {
            var19 = new int[255];
            var5 = 0;
            L1: while (true) {
              if (var19.length <= var5) {
                ((ci) this).field_p = new li(2, 47, var18);
                ((ci) this).field_q = new li(1, 47, var19);
              } else {
                L2: {
                  var6 = 257 * var5;
                  var8 = (int)((double)var5 * 0.6);
                  var7 = (int)((double)var5 * 0.6);
                  var7 = var7 >> 1;
                  var9 = var5;
                  var8 = var8 >> 1;
                  if ((var8 ^ -1) >= -256) {
                    break L2;
                  } else {
                    var8 = 255;
                    break L2;
                  }
                }
                L3: {
                  var9 = var9 >> 1;
                  if (var9 <= 255) {
                    break L3;
                  } else {
                    var9 = 255;
                    break L3;
                  }
                }
                L4: {
                  if (0 <= var8) {
                    break L4;
                  } else {
                    var8 = 0;
                    break L4;
                  }
                }
                L5: {
                  if ((var7 ^ -1) <= -1) {
                    break L5;
                  } else {
                    var7 = 0;
                    break L5;
                  }
                }
                L6: {
                  var7 = var7 << 16;
                  var8 = var8 << 8;
                  if ((var9 ^ -1) <= -1) {
                    break L6;
                  } else {
                    var9 = 0;
                    break L6;
                  }
                }
                var6 = var8 | var7 | var9;
                var19[var5] = var6;
                var5++;
                continue L1;
              }
            }
          } else {
            L7: {
              var5 = var4 * 257;
              var6 = var4;
              var7 = var4;
              var6 = var6 >> 1;
              var8 = (int)(0.5 * (double)var4);
              var7 = var7 >> 1;
              var8 = var8 >> 1;
              if (var7 <= 255) {
                break L7;
              } else {
                var7 = 255;
                break L7;
              }
            }
            L8: {
              if (-1 >= (var7 ^ -1)) {
                break L8;
              } else {
                var7 = 0;
                break L8;
              }
            }
            L9: {
              if (var6 <= -1) {
                break L9;
              } else {
                var6 = 0;
                break L9;
              }
            }
            L10: {
              if (-256 >= var8) {
                break L10;
              } else {
                var8 = 255;
                break L10;
              }
            }
            L11: {
              var6 = var6 << 16;
              var7 = var7 << 8;
              if ((var8 ^ -1) <= -1) {
                break L11;
              } else {
                var8 = 0;
                break L11;
              }
            }
            var5 = var7 | var6 | var8;
            var18[var4] = var5;
            var4++;
            continue L0;
          }
        }
    }

    public static void d(int param0) {
        if (param0 != -12424) {
            return;
        }
        field_m = null;
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_m = new int[132];
        field_r = "Create unrated game";
        for (var0 = 0; field_m.length > var0; var0++) {
            field_m[var0] = 256;
        }
        field_m[118] = 200;
        field_m[57] = 180;
        field_m[7] = 141;
        field_m[113] = 146;
        field_m[62] = 103;
        field_m[79] = 200;
        field_m[59] = 180;
        field_m[112] = 146;
        field_m[126] = 211;
        field_m[115] = 205;
        field_m[6] = 150;
        field_m[124] = 201;
        field_m[61] = 190;
        field_m[119] = 200;
        field_m[117] = 146;
        field_m[58] = 180;
        field_m[39] = 213;
        field_m[114] = 146;
        field_m[63] = 180;
        field_m[60] = 180;
        field_m[38] = 213;
        field_m[56] = 180;
        field_m[78] = 200;
        field_m[131] = 238;
    }
}
