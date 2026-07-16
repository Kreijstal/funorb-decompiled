/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static ak field_i;
    static int field_e;
    static String field_c;
    static int field_k;
    static String[] field_h;
    static int field_a;
    static int field_j;
    static tf field_f;
    static String field_g;
    static String field_d;
    static int field_b;

    public static void a(int param0) {
        if (param0 != 23652) {
            return;
        }
        field_c = null;
        field_f = null;
        field_d = null;
        field_g = null;
        field_h = null;
        field_i = null;
    }

    final static int a(int param0, int param1, int param2, byte param3) {
        if (t.field_j < param2 + param1) {
          if (param3 == -1) {
            if (-1 >= (-param2 + (param1 + param0) ^ -1)) {
              return param1 - -param0 - param2;
            } else {
              return -param2 + t.field_j;
            }
          } else {
            return 38;
          }
        } else {
          return param1;
        }
    }

    final static String a(boolean param0, byte[] param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        var13 = new char[param3];
        var12 = var13;
        var11 = var12;
        var10 = var11;
        var4 = var10;
        if (param0) {
          var5 = 0;
          var6 = 0;
          if (param3 > var6) {
            var7 = param1[param2 - -var6] & 255;
            if (var7 != 0) {
              if (var7 >= 128) {
                if (160 <= var7) {
                  int incrementValue$6 = var5;
                  var5++;
                  var4[incrementValue$6] = (char)var7;
                  var6++;
                  var6++;
                  var6++;
                  return new String(var13, 0, var5);
                } else {
                  L0: {
                    var8 = jg.field_I[-128 + var7];
                    if (var8 == 0) {
                      var8 = 63;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  var7 = var8;
                  int incrementValue$7 = var5;
                  var5++;
                  var4[incrementValue$7] = (char)var7;
                  var6++;
                  var6++;
                  var6++;
                  return new String(var13, 0, var5);
                }
              } else {
                int incrementValue$8 = var5;
                var5++;
                var4[incrementValue$8] = (char)var7;
                var6++;
                var6++;
                var6++;
                return new String(var13, 0, var5);
              }
            } else {
              var6++;
              var6++;
              var6++;
              return new String(var13, 0, var5);
            }
          } else {
            return new String(var13, 0, var5);
          }
        } else {
          field_e = -113;
          var5 = 0;
          var6 = 0;
          if (param3 > var6) {
            var7 = param1[param2 - -var6] & 255;
            if (var7 != 0) {
              if (var7 >= 128) {
                if (160 <= var7) {
                  int incrementValue$9 = var5;
                  var5++;
                  var4[incrementValue$9] = (char)var7;
                  var6++;
                  var6++;
                  var6++;
                  return new String(var13, 0, var5);
                } else {
                  L1: {
                    var8 = jg.field_I[-128 + var7];
                    if (var8 == 0) {
                      var8 = 63;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var7 = var8;
                  int incrementValue$10 = var5;
                  var5++;
                  var4[incrementValue$10] = (char)var7;
                  var6++;
                  var6++;
                  var6++;
                  return new String(var13, 0, var5);
                }
              } else {
                int incrementValue$11 = var5;
                var5++;
                var4[incrementValue$11] = (char)var7;
                var6++;
                var6++;
                var6++;
                return new String(var13, 0, var5);
              }
            } else {
              var6++;
              var6++;
              var6++;
              var6++;
              return new String(var13, 0, var5);
            }
          } else {
            return new String(var13, 0, var5);
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        uk.field_v.field_m = 0;
        uk.field_v.e(160, 12);
        uk.field_v.d(ai.field_d.nextInt(), -42);
        uk.field_v.d(ai.field_d.nextInt(), -97);
        uk.field_v.e(160, param1);
        if (param0 <= 79) {
          return;
        } else {
          uk.field_v.e(160, param3);
          uk.field_v.b(1276387944, param2);
          uk.field_v.a(tp.field_t, ag.field_m, 0);
          aa.field_f.g(18, 15514);
          int fieldTemp$1 = aa.field_f.field_m + 1;
          aa.field_f.field_m = aa.field_f.field_m + 1;
          var4 = fieldTemp$1;
          aa.field_f.a(uk.field_v.field_m, 0, -3493, uk.field_v.field_k);
          aa.field_f.f(-var4 + aa.field_f.field_m, -1);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          ca.field_a[pg.field_e] = param4;
          gn.field_A[pg.field_e] = pg.field_e;
          ep.field_c[pg.field_e] = param3;
          if (w.field_s > param3) {
            ro.field_a = param3;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param3 > aa.field_o) {
            qn.field_k = param3;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          uc.field_b[pg.field_e] = param0;
          vp.field_Fb[pg.field_e] = param5;
          gh.field_q[pg.field_e] = param2;
          var6 = param2 + (param5 + param0);
          if (param1 != var6) {
            stackOut_8_0 = 1000 * param0 / var6;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 0;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        var7 = stackIn_9_0;
        nb.field_c[pg.field_e] = var7;
        if (qn.field_k >= var7) {
          if (var7 < ro.field_a) {
            ro.field_a = var7;
            pg.field_e = pg.field_e + 1;
            return;
          } else {
            pg.field_e = pg.field_e + 1;
            return;
          }
        } else {
          qn.field_k = var7;
          if (var7 >= ro.field_a) {
            pg.field_e = pg.field_e + 1;
            return;
          } else {
            ro.field_a = var7;
            pg.field_e = pg.field_e + 1;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[]{"The <col=ffff00>timer bar</col> is slowly draining at the bottom of the screen.", "Complete pictures as quickly as you can to <col=ffff00>bump</col> it back up.<br>The game is over when it disappears."};
        fj.a(false, 50);
        field_g = "Quick Chat Help";
        field_d = "Login: ";
    }
}
