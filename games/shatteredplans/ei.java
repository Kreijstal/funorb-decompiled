/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static int[] field_g;
    static String field_b;
    static int[] field_d;
    static int field_e;
    static String[][] field_f;
    static java.applet.Applet field_c;
    static bi field_a;

    final static void a(int param0, fb param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        param1.b((byte) -86);
        fb var2 = (fb) (Object) kj.field_a.d(param0);
        while (var2 != null) {
            // ifeq L49
            var2 = (fb) (Object) kj.field_a.a((byte) -71);
        }
        if (var2 == null) {
            kj.field_a.a((byte) -113, (oh) (Object) param1);
        } else {
            wp.a((byte) -123, (oh) (Object) param1, (oh) (Object) var2);
        }
    }

    final static void a(byte param0, nf param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        if (param0 >= 35) {
          L0: while (true) {
            if (-4 >= (var2 ^ -1)) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= da.field_g) {
                  im.field_b[param1.a((byte) 113)] = im.field_b[param1.a((byte) 113)] + 1;
                  var2 = 0;
                  var3 = 0;
                  L2: while (true) {
                    if (var3 >= da.field_g) {
                      da.field_g = var2;
                      da.field_g = da.field_g + 1;
                      wm.field_d[da.field_g] = param1;
                      return;
                    } else {
                      L3: {
                        if (wm.field_d[var3].field_n != param1.field_n) {
                          break L3;
                        } else {
                          var4 = wm.field_d[var3].a((byte) 115);
                          if (kp.field_i < im.field_b[var4]) {
                            im.field_b[var4] = im.field_b[var4] - 1;
                            var3++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var2++;
                      wm.field_d[var2] = wm.field_d[var3];
                      var3++;
                      continue L2;
                    }
                  }
                } else {
                  if (wm.field_d[var2].field_n == param1.field_n) {
                    im.field_b[wm.field_d[var2].a((byte) 115)] = im.field_b[wm.field_d[var2].a((byte) 115)] + 1;
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              im.field_b[var2] = 0;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, byte[] param2, boolean param3, boolean param4, int param5) {
        sl var10 = js.field_f;
        var10.h(param0, 255);
        var10.field_j = var10.field_j + 1;
        int var7 = var10.field_j;
        var10.c(4, (byte) -106);
        if (param4) {
            Object var9 = null;
            ei.a(-47, (fb) null);
        }
        var10.c(param1, (byte) -122);
        int var8 = param5;
        if (!(!param3)) {
            // wide iinc 8 128
        }
        var10.c(var8, (byte) -56);
        var10.a(0, param2.length, param2, 22186);
        var10.b(-var7 + var10.field_j, (byte) 127);
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param2 <= 20) {
          return;
        } else {
          if ((param1 ^ -1) >= -21) {
            return;
          } else {
            var17 = new int[4];
            var16 = var17;
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var7 = var13;
            gf.a(var17);
            gf.a(param5, param4, param2, param1, 10, 0, 200);
            am.a(-10 + param2, param6, param3 ^ 12362, -10 + param1, param5, param4);
            gf.f(param5 + 10, param4, param2 + -20, 2052949);
            gf.f(10 + param5, param4 - -param1, param2 + -20, 0);
            gf.i(param5, param4, param5 - -10, 10 + param4);
            gf.b(param5 - -10, 10 + param4, 10, 2052949);
            gf.b(var17);
            gf.i(-10 + param2 + param5, param4, param5 - -param2, param4 + 10);
            gf.b(-11 + (param5 + param2), 10 + param4, 10, 2052949);
            gf.b(var17);
            if (param3 == -12394) {
              gf.i(param5, param4 + (param1 - 10), 10 + param5, param4 + param1);
              gf.b(param5 - -10, -10 + param1 + param4 - 1, 10, 0);
              gf.b(var17);
              gf.i(param5 - -param2 + -10, -10 + param1 + param4, param5 - -param2, param1 + param4);
              gf.b(param2 + param5 + -10 - 1, param1 + param4 + -11, 10, 0);
              gf.b(var17);
              var8 = 0;
              L0: while (true) {
                if (var8 >= param1 + -20) {
                  L1: {
                    if (param0) {
                      jl.field_W.c(param5 - -4, param4 - -3, 256);
                      var8 = param5 + 4 - -jl.field_W.field_z;
                      var9 = param5 + param2 + -3 - mr.field_g.field_z;
                      mr.field_g.c(var9, 3 + param4, 64);
                      var11 = var8;
                      L2: while (true) {
                        if (var11 >= var9) {
                          break L1;
                        } else {
                          var10 = 192 * (var9 + -var11) / (-var8 + var9) + 64;
                          me.field_h.c(var11, 3 + param4, var10);
                          var11++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                  return;
                } else {
                  var9 = ui.a(2052949, 0, -110, var8 * 256 / (param1 + -20));
                  gf.a(param5, 10 + param4 + var8, var9);
                  gf.a(param2 + (param5 + -1), var8 + (10 + param4), var9);
                  var8++;
                  continue L0;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_b = null;
        if (param0 >= -67) {
            field_e = -49;
        }
        field_g = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static int a(int param0) {
        if (!(-3 >= (ma.field_p ^ -1))) {
            return 0;
        }
        if (0 != ai.field_e) {
            if (es.field_j != null) {
                if (!es.field_j.b((byte) -122)) {
                    return 14;
                }
                if (!es.field_j.b("", (byte) -122)) {
                    return 29;
                }
                if (!es.field_j.a("", -70)) {
                    return 29;
                }
            }
            if (!rq.field_g.b((byte) 125)) {
                return 43;
            }
            if (!rq.field_g.a("commonui", 127)) {
                return 57;
            }
            if (!(tq.field_f.b((byte) -90))) {
                return 71;
            }
            if (!(tq.field_f.a("commonui", -105))) {
                return 80;
            }
            if (!(l.field_g.b((byte) -95))) {
                return 82;
            }
            // ifne L272
            return 86;
        }
        if (!rq.field_g.b((byte) 122)) {
            return 20;
        }
        if (!(rq.field_g.a("commonui", 60))) {
            return 40;
        }
        if (!(tq.field_f.b((byte) -109))) {
            return 50;
        }
        if (!(tq.field_f.a("commonui", -112))) {
            return 60;
        }
        if (!l.field_g.b((byte) -85)) {
            return 70;
        }
        if (!(l.field_g.a(param0 + -83))) {
            return 80;
        }
        if (param0 != 82) {
            return 4;
        }
        return 100;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have been removed from <%0>'s game.";
        field_g = new int[]{100, 100, 200, 200, 300, 100, 300, 200, 200, 200, 300, 300, 100, 300, 500, 500, 500, 500, 300, 500, 300, 500, 100, 100, 500};
    }
}
