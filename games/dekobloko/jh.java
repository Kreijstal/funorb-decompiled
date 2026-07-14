/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static String[] field_c;
    static java.awt.Canvas field_b;
    static int field_e;
    static String field_g;
    static String field_f;
    static ck field_d;
    static String field_a;
    static boolean field_h;

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        field_g = null;
        field_f = null;
        if (param0) {
            field_d = null;
        }
        field_c = null;
        field_d = null;
    }

    final static java.awt.Frame a(int param0, fd param1, int param2, int param3, boolean param4, int param5) {
        dc[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        dc[] var10 = null;
        mh var11 = null;
        var9 = client.field_A ? 1 : 0;
        if (param1.b(-86)) {
          L0: {
            if (param3 != 0) {
              break L0;
            } else {
              var10 = ak.a((byte) -109, param1);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (param2 == var10[var8].field_f) {
                      if (param0 == var10[var8].field_j) {
                        L2: {
                          if (-1 == (param5 ^ -1)) {
                            break L2;
                          } else {
                            if (var10[var8].field_a == param5) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (var10[var8].field_h > param3) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        var7_int = 1;
                        param3 = var10[var8].field_h;
                        var8++;
                        continue L1;
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            }
          }
          L4: {
            if (!param4) {
              break L4;
            } else {
              field_h = true;
              break L4;
            }
          }
          var11 = param1.a((byte) 107, param0, param3, param2, param5);
          L5: while (true) {
            if (0 != var11.field_c) {
              var7 = (java.awt.Frame) var11.field_b;
              if (var7 != null) {
                if ((var11.field_c ^ -1) == -3) {
                  wj.a(true, var7, param1);
                  return null;
                } else {
                  return var7;
                }
              } else {
                return null;
              }
            } else {
              ua.a(10L, -128);
              continue L5;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0, mm param1, ji param2) {
        int var3 = 0;
        ac var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        var9 = client.field_A ? 1 : 0;
        var3 = kd.field_p;
        ie.field_c = new w(0L, (w) null);
        if (param2 == null) {
          var10 = null;
          qb.a((Throwable) null, 16408, "QC1");
          return;
        } else {
          param2.field_b = false;
          param2.field_g = 0;
          oi.field_a = new em(var3, param2, param2);
          wj.field_Qb = new sm(var3, param2, param2, (lh) (Object) new ga());
          var4 = dn.b((byte) 124);
          if (var4 == null) {
            var11 = null;
            qb.a((Throwable) null, 16408, "QC2");
            return;
          } else {
            jc.a(var4, -1);
            var12 = null;
            fj.field_d = wa.a(2245737, 1513239, 0, 8947848, 5138823, 1127256, 65793, 65793, 4020342, 1513239, 65793, -24447, (mm) null);
            rd.field_e = wa.a(0, 0, 16764006, 0, 0, 0, 0, 0, 0, 0, 0, -24447, param1);
            ad.field_q = wa.a(0, 0, 16777215, 0, 0, 0, 0, 0, 0, 0, 0, -24447, param1);
            var5 = hk.field_j;
            var6 = hk.field_i;
            var16 = hk.field_l;
            qb.field_q = new ck(10, 14);
            qb.field_q.a();
            var8 = 2;
            L0: while (true) {
              if (-8 >= (var8 ^ -1)) {
                hk.a(var16, var5, var6);
                vk.field_a = ll.a(ad.field_q, rd.field_e, var4, fj.field_d, 0);
                if (param0 > 61) {
                  ie.field_c.field_M = new vj();
                  return;
                } else {
                  return;
                }
              } else {
                hk.g(var8, var8 - -1, 14 - (var8 << -810284479), 16777215);
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final static int a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        int var2 = 0;
        for (var3 = 0; param0.length > var3; var3++) {
            var2 = var2 + h.a(param0[var3], -127);
        }
        if (param1 < 94) {
            Object var5 = null;
            int discarded$0 = jh.a((int[]) null, 120);
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Form a Deko and a Bloko at precisely the same time", "Eliminate a wildcard as part of 2 shapes at the same time", "Eliminate a wildcard as part of 3 shapes at the same time", "Eliminate a wildcard as part of 7 shapes at the same time", "Double-eliminate a solid shape by completing 2 touching loose shapes at the same time", "Triple-eliminate a solid shape by completing 3 touching loose shapes at the same time", "Set off a chain of 5 explosions", "Set off a chain of 10 explosions", "Make a solid shape as tall as the bucket", "Bombard your victim with 100 shapes in one go in a multiplayer game", "Completely clear a quarter-full bucket in a Rated game", "Have over 30 shapes in your machine in a Rated game", "Unlock the Flowers theme in the Master Challenge (Theme 5)", "Unlock the City theme in the Master Challenge (Theme 7)", "Unlock the Eight-bit theme in the Master Challenge (Theme 8)", "Get at least 50,000 points in the Master Challenge", "Get at least 100,000 points in the Master Challenge", "Get at least 200,000 points in the Master Challenge", "Win a Rated game", "Win 3 Rated games in a row, in one session", "Win 5 Rated games in a row, in one session, starting with a Rating of at least 1500", "Win an 8-player Rated game", "Win an 8-player Rated game, defeating all opponents yourself", "Earn 50,000 points within the first two levels of the Master Challenge", "Win a Rated game without the glass breaking at all", "Defeat a FunOrb Moderator or someone who has this Achievement", "Send 500 shapes to other players in Rated games", "Send 1,000 shapes to other players in Rated games", "Send 2,500 shapes to other players in Rated games", "Send 5,000 shapes to other players in Rated games", "Send 10,000 shapes to other players in Rated games"};
        field_a = "Log in";
        field_g = "Accept <%0> into this game";
        field_f = "No";
        field_h = false;
        field_e = 0;
    }
}
