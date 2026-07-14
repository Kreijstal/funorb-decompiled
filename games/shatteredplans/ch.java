/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch implements wr {
    static bi field_c;
    static String field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var16 = new int[4];
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        gf.a(var16);
        if (param2 * 2 <= param3) {
          gf.f(param2 + param4, param5, param3 - 2 * param2, param1);
          gf.f(param2 + param4, param5 - -param7, -(2 * param2) + param3, param6);
          gf.i(param4, param5, param4 - -param2, param5 - -param2);
          gf.b(param2 + param4, param5 - -param2, param2, param1);
          gf.b(var16);
          gf.i(param4 + (param3 - param2), param5, param4 + param3, param5 + param2);
          gf.b(-param2 + param3 + (param4 + -1), param5 + param2, param2, param1);
          gf.b(var16);
          gf.i(param4, -param2 + (param7 + param5), param4 + param2, param5 - -param7);
          gf.b(param4 - -param2, -1 + (param7 + param5 + -param2), param2, param6);
          gf.b(var16);
          gf.i(-param2 + (param3 + param4), param5 - -param7 - param2, param4 - -param3, param5 - -param7);
          gf.b(-1 + param4 - (-param3 + param2), param7 + param5 - (param2 - -1), param2, param6);
          gf.b(var16);
          if (param0 == 20) {
            var9 = 0;
            L0: while (true) {
              if (-20 + param7 > var9) {
                var10 = ui.a(param1, param6, param0 ^ -72, 256 * var9 / (param7 - 20));
                gf.a(param4, param2 + (param5 + var9), var10);
                gf.a(-1 + (param3 + param4), var9 + (param5 + param2), var10);
                var9++;
                continue L0;
              } else {
                return;
              }
            }
          } else {
            field_a = null;
            var9 = 0;
            L1: while (true) {
              if (-20 + param7 > var9) {
                var10 = ui.a(param1, param6, param0 ^ -72, 256 * var9 / (param7 - 20));
                gf.a(param4, param2 + (param5 + var9), var10);
                gf.a(-1 + (param3 + param4), var9 + (param5 + param2), var10);
                var9++;
                continue L1;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == -15073) {
          var3 = 0;
          var4 = vo.field_b;
          L0: while (true) {
            if (t.field_c.length > var3) {
              var5 = pr.field_d[var3];
              if (0 <= var5) {
                var6 = or.a(true, t.field_c[var3], true);
                var4 = var4 + js.field_e;
                var7 = -(var6 >> 1803979169) + ol.field_e;
                if (ek.a((uo.field_g << -83196383) + vh.field_b, param2, var7 + -js.field_g, (byte) -100, var4, (js.field_g << 765712929) + var6, param1)) {
                  return var5;
                } else {
                  var4 = var4 + (vh.field_b + (js.field_e + (uo.field_g << 1433234241)));
                  var3++;
                  continue L0;
                }
              } else {
                var4 = var4 + fe.field_A;
                var3++;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          field_a = null;
          var3 = 0;
          var4 = vo.field_b;
          if (t.field_c.length > var3) {
            L1: {
              var5 = pr.field_d[var3];
              if (0 <= var5) {
                var6 = or.a(true, t.field_c[var3], true);
                var4 = var4 + js.field_e;
                var7 = -(var6 >> 1803979169) + ol.field_e;
                if (ek.a((uo.field_g << -83196383) + vh.field_b, param2, var7 + -js.field_g, (byte) -100, var4, (js.field_g << 765712929) + var6, param1)) {
                  return var5;
                } else {
                  var4 = var4 + (vh.field_b + (js.field_e + (uo.field_g << 1433234241)));
                  break L1;
                }
              } else {
                var4 = var4 + fe.field_A;
                var3++;
                break L1;
              }
            }
            var3++;
            var3++;
            var3++;
            return -1;
          } else {
            return -1;
          }
        }
    }

    final static bi a(bc param0, int param1, int param2, int param3) {
        if (!vd.a(param3, param0, param2, 2)) {
            return null;
        }
        if (param1 >= -104) {
            return null;
        }
        return ed.a(true);
    }

    final static qh a(byte param0) {
        ne.field_l = new qh(0, 60, 238, 300, ShatteredPlansClient.field_L.toUpperCase());
        fe var1 = new fe(-16 + ne.field_l.field_k - -ne.field_l.field_m, 2 + ne.field_l.field_t, 11, 11, -1, (bi) null, "X", 16711680);
        var1.field_h = (Object) (Object) ne.field_l;
        lh var2 = new lh(-20 + ne.field_l.field_m, ne.field_l.field_t - -20, -28 + ne.field_l.field_i, 3974311);
        int var3 = -24 / ((param0 - 57) / 47);
        ne.field_l.a((vd) (Object) var1, 8);
        ne.field_l.a((vd) (Object) var2, 8);
        lp var4 = new lp(ne.field_l.field_k + 9, 20 + ne.field_l.field_t, 209, ne.field_l.field_i + -28);
        ne.field_l.a((vd) (Object) var4, 8);
        ne.field_l.field_z = var4;
        var2.field_x = (gj) (Object) var4;
        em var5 = new em();
        ne.field_l.field_x = (jk) (Object) var5;
        var5.field_e = var2;
        return ne.field_l;
    }

    final static bi[] a(int param0, byte param1, bc param2, int param3) {
        Object var5 = null;
        if (param1 == 87) {
          if (!vd.a(param3, param2, param0, 2)) {
            return null;
          } else {
            return rq.a(0);
          }
        } else {
          var5 = null;
          bi discarded$7 = ch.a((bc) null, 22, -122, 78);
          if (!vd.a(param3, param2, param0, 2)) {
            return null;
          } else {
            return rq.a(0);
          }
        }
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        var1 = 0;
        if (param0 > 86) {
          L0: while (true) {
            if (!cc.e((byte) 55)) {
              L1: {
                ns.field_nb.a(-1, ch.a(-15073, td.field_P, nh.field_p), ch.a(-15073, bb.field_b, pd.field_k));
                if (ns.field_nb.a((byte) 36)) {
                  var1 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var2 = 0;
              if (var1 != 0) {
                if (0 <= ns.field_nb.field_c) {
                  var2 = fs.field_y[ns.field_nb.field_c];
                  if (-3 == var2) {
                    oi.a(true);
                    return var2;
                  } else {
                    return var2;
                  }
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            } else {
              ns.field_nb.b(0);
              if (!ns.field_nb.a((byte) -82)) {
                continue L0;
              } else {
                var1 = 1;
                continue L0;
              }
            }
          }
        } else {
          return 86;
        }
    }

    public static void b(byte param0) {
        int var1 = 1 % ((-34 - param0) / 52);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Percentage of fleets attacking each turn (average for game).";
        field_a = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
