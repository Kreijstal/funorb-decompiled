/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends ck {
    static String field_p;
    wk field_q;
    String field_u;
    static String field_s;
    static wk field_o;
    static String field_t;
    static String field_v;
    static String field_w;
    static String field_r;

    public static void e(int param0) {
        field_o = null;
        field_v = null;
        field_p = null;
        field_s = null;
        if (param0 != 0) {
            Object var2 = null;
            boolean discarded$0 = ai.a((gi) null, 92);
        }
        field_t = null;
        field_r = null;
        field_w = null;
    }

    final static void d(int param0) {
        int var1 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var8 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var5 = SteelSentinels.field_G;
          var1 = 60 % ((3 - param0) / 43);
          if (ln.field_h) {
            break L0;
          } else {
            L1: {
              if (null == al.field_i) {
                al.field_i = fg.a(4, 19999);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (al.field_i.field_t) {
                var15 = ge.field_m;
                var11 = var15;
                var6 = var11;
                var16 = al.field_i.field_s;
                var4 = 0;
                L3: while (true) {
                  if ((var4 ^ -1) <= -9) {
                    var17 = ce.field_t;
                    var13 = var17;
                    var8 = var13;
                    var18 = al.field_i.field_s;
                    var10 = 0;
                    var4 = var10;
                    L4: while (true) {
                      if (8 <= var10) {
                        ln.field_h = true;
                        al.field_i = null;
                        wl.c((byte) 8);
                        break L2;
                      } else {
                        var8[var10] = ec.a(var17[var10], var18[var10] ^ -1);
                        var10++;
                        continue L4;
                      }
                    }
                  } else {
                    var6[var4] = vn.a(var15[var4], var16[var4]);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            if (ln.field_h) {
              en.a(79);
              am.b(-104);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L5: {
          if (!df.field_I) {
            L6: {
              if (null != ol.field_ac) {
                break L6;
              } else {
                ol.field_ac = od.a(6, true);
                break L6;
              }
            }
            if (ol.field_ac.field_q) {
              se.a(-1, ol.field_ac.field_t);
              ol.field_ac = null;
              df.field_I = true;
              mm.field_g.a(65, (byte) -117);
              mm.field_g.a(68, (byte) -117);
              mm.field_g.a(70, (byte) -117);
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
    }

    ai(wk param0, String param1) {
        ((ai) this).field_u = param1;
        ((ai) this).field_q = param0;
    }

    final static boolean a(gi param0, int param1) {
        if (param1 != -32599) {
            ai.e(-24);
        }
        int var2 = param0.f((byte) -123);
        int var3 = -2 != (var2 ^ -1) ? 0 : 1;
        return var3 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Reject";
        field_s = "Offer draw";
        field_o = new wk(540, 140);
        field_w = "<%0> has entered a game.";
        field_t = "Waiting for graphics";
        field_v = "Custom-building of sentinels is available in advanced mode only. Earn 1,000 solarite cubes in multiplayer games or in missions to unlock advanced mode.";
        field_r = "asd";
    }
}
