/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends fp {
    private static int[] field_F;
    static String field_z;
    static int field_y;
    static int[] field_E;
    static String[] field_D;
    static String field_A;
    static int field_B;
    static String field_H;
    static bt field_x;

    final static vc a(int param0, iw param1) {
        vc var4 = new vc();
        var4.field_a = param1.i((byte) -124);
        int var3 = param1.h((byte) -115);
        if (1 == (var3 & 1)) {
        }
        if (!(((var3 & 65) >> 877127974 ^ -1) != -2)) {
            var4.field_j = true;
        }
        if (1 == (23 & var3) >> -1878011356) {
            var4.field_r = true;
        }
        if ((1 & var3 >> 48774625) == -2) {
        }
        if (-2 == (var3 >> 2048926690 & 1)) {
        }
        if (-2 == (var3 >> -862602461 & 1 ^ -1)) {
            var4.field_h = true;
        }
        if ((var3 & 63) >> -375784251 == 1) {
            var4.field_q = true;
        }
        var4.field_i = param1.k(4);
        if (param0 != -21832) {
            int discarded$0 = vc.b(20);
        }
        var4.field_v = param1.k(4);
        var4.field_t = param1.k(4);
        var4.field_s = param1.h((byte) -108);
        var4.field_m = new up();
        var4.field_m.a(28, param1);
        return var4;
    }

    final static void a(String param0, int param1) {
        if (param1 != -1) {
            field_H = null;
        }
        ct.field_x = param0;
    }

    private vc() {
    }

    final static int a(int param0, int param1, byte param2) {
        if (param2 != -72) {
            vc.f((byte) 120);
        }
        int var3 = param1 >>> 617989727;
        return -var3 + (var3 + param1) / param0;
    }

    final static void f(byte param0) {
        da.b(67);
        ra.i((byte) -90);
        ck.field_b = null;
        fa.b(47);
        if (param0 != 119) {
            int discarded$0 = vc.b(104);
        }
    }

    final static void h(byte param0) {
        int var2 = 0;
        nl var2_ref = null;
        nl var3 = null;
        int var3_int = 0;
        la[] var4 = null;
        int var5 = 0;
        la var6 = null;
        int var7 = 0;
        Object var8 = null;
        tj var9 = null;
        L0: {
          var7 = Kickabout.field_G;
          if (param0 == 125) {
            break L0;
          } else {
            var8 = null;
            vc.a((String) null, 94);
            break L0;
          }
        }
        if (!sl.field_Eb) {
          L1: {
            var9 = et.field_d.field_V;
            if (ic.field_i) {
              L2: {
                var2 = et.field_d.field_R[0].field_g;
                if ((var9.field_m ^ -1) != -2) {
                  break L2;
                } else {
                  var9.field_m = -1;
                  break L2;
                }
              }
              L3: {
                if (0 != var9.field_m) {
                  break L3;
                } else {
                  if (var2 != var9.field_s) {
                    var9.field_m = -1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (0 != var9.field_m) {
                  break L4;
                } else {
                  if (var9.field_s == var2) {
                    ic.field_i = false;
                    break L1;
                  } else {
                    break L4;
                  }
                }
              }
              var3 = et.field_d.field_P[0][var2];
              if (!qg.a(2235, var3.field_w, 20, var3.field_M)) {
                var9.field_r = 3;
                break L1;
              } else {
                var9.field_r = 0;
                if (var3.field_u == 0) {
                  break L1;
                } else {
                  var3.a((byte) -31, 0);
                  break L1;
                }
              }
            } else {
              if (0 != (var9.field_m ^ -1)) {
                break L1;
              } else {
                if ((var9.field_p ^ -1) >= -1) {
                  break L1;
                } else {
                  if ((var9.field_p ^ -1) > -88080385) {
                    var2_ref = et.field_d.a((byte) 120, 0);
                    var3_int = 0;
                    var4 = et.field_d.field_x;
                    var5 = 0;
                    L5: while (true) {
                      if (var5 >= var4.length) {
                        if (var3_int != 0) {
                          break L1;
                        } else {
                          if (262144 > var9.e(-111)) {
                            ic.field_i = true;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        var6 = var4[var5];
                        var3_int = var3_int != 0 | var6.a(var2_ref.field_M, var2_ref.field_w, 703166480, var2_ref.field_v) ? 1 : 0;
                        var5++;
                        continue L5;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void g(byte param0) {
        field_A = null;
        field_D = null;
        field_F = null;
        int var1 = -118 % ((param0 - -81) / 42);
        field_x = null;
        field_z = null;
        field_E = null;
        field_H = null;
    }

    final static void i(byte param0) {
        int var1 = 0;
        gm var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = Kickabout.field_G;
          wo.a(ar.field_c, (gm) (Object) tq.field_F.b((byte) -96), (byte) 118, 256);
          if (param0 == 45) {
            break L0;
          } else {
            vc.i((byte) 21);
            break L0;
          }
        }
        var1 = 0;
        L1: while (true) {
          if (var1 >= tq.field_F.field_I) {
            return;
          } else {
            if (tq.field_F.field_R[var1].d(3511)) {
              if (wp.field_c == tq.field_F.field_g[var1].field_p) {
                L2: {
                  var2 = (gm) (Object) tq.field_F.a((byte) -60, var1);
                  if (jn.field_kb != var1) {
                    stackOut_10_0 = 160;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = 256;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                var3 = stackIn_11_0;
                wo.a(da.field_u[va.field_J], var2, (byte) -17, var3);
                var1++;
                continue L1;
              } else {
                var1++;
                continue L1;
              }
            } else {
              var1++;
              continue L1;
            }
          }
        }
    }

    final static int b(int param0) {
        if (!(!tc.field_s)) {
            return -1;
        }
        if (!bo.field_Cb.a(false, "beach")) {
            return bo.field_Cb.a("beach", -16248);
        }
        tc.field_s = true;
        wn.field_a = ng.a("deckchairs", "beach", 2, bo.field_Cb);
        st.field_q = bg.a("beach", bo.field_Cb, (byte) 45, "parasol");
        ns.field_c = bg.a("beach", bo.field_Cb, (byte) 92, "ball");
        je.field_h = bg.a("beach", bo.field_Cb, (byte) 68, "bucket");
        c.field_e = bg.a("beach", bo.field_Cb, (byte) 76, "palmtree");
        vq.field_a = bg.a("beach", bo.field_Cb, (byte) 76, "starfish");
        el.field_D = bg.a("beach", bo.field_Cb, (byte) 93, "icecream");
        int var1 = 88 % ((65 - param0) / 42);
        tv.field_b = ng.a("stains", "beach", 2, bo.field_Cb);
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_z = "Decline invitation to <%0>'s game";
        field_A = "left ";
        field_y = 0;
        field_E = new int[6];
        field_F = new int[6];
        field_E[2] = 64;
        field_E[4] = 20;
        field_E[0] = 32;
        field_E[1] = 32;
        field_E[5] = 16;
        field_E[3] = 32;
        for (var0 = 0; var0 < field_E.length; var0++) {
            field_F[var0] = field_E[var0];
        }
        field_H = "The <col=ccccff>Trinkets Expansion Pack</col> is accessible to subscribing FunOrb members. It allows you to customise your team with special abilities, immunities, stat boosts, and cheat<nbsp>codes!";
    }
}
