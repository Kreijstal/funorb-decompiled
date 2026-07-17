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
        RuntimeException var2 = null;
        int var3 = 0;
        vc var4 = null;
        vc stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        vc stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var4 = new vc();
              var4.field_a = param1.i((byte) -124);
              var3 = param1.h((byte) -115);
              if (1 != (var3 & 1)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((var3 & 65) >> 6 == 1) {
                var4.field_j = true;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (1 != (23 & var3) >> 4) {
                break L3;
              } else {
                var4.field_r = true;
                break L3;
              }
            }
            L4: {
              if ((1 & var3 >> 1) != -2) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-2 != (var3 >> 2 & 1)) {
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((var3 >> 3 & 1) != 1) {
                break L6;
              } else {
                var4.field_h = true;
                break L6;
              }
            }
            L7: {
              if ((var3 & 63) >> 5 != 1) {
                break L7;
              } else {
                var4.field_q = true;
                break L7;
              }
            }
            L8: {
              var4.field_i = param1.k(4);
              if (param0 == -21832) {
                break L8;
              } else {
                int discarded$1 = vc.b(20);
                break L8;
              }
            }
            var4.field_v = param1.k(4);
            var4.field_t = param1.k(4);
            var4.field_s = param1.h((byte) -108);
            var4.field_m = new up();
            var4.field_m.a(28, param1);
            stackOut_14_0 = (vc) var4;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("vc.B(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L9;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0;
    }

    final static void a(String param0, int param1) {
        try {
            if (param1 != -1) {
                field_H = null;
            }
            ct.field_x = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "vc.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private vc() {
    }

    final static int a(int param0, int param1) {
        int var3 = param1 >>> 31;
        return -var3 + (var3 + param1) / param0;
    }

    final static void f() {
        da.b(67);
        int discarded$0 = -90;
        ra.i();
        ck.field_b = null;
        fa.b(47);
    }

    final static void h() {
        RuntimeException var1 = null;
        int var2 = 0;
        nl var2_ref_nl = null;
        nl var3 = null;
        int var3_int = 0;
        la[] var4 = null;
        int var5 = 0;
        la var6 = null;
        int var7 = 0;
        tj var8 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (!sl.field_Eb) {
              L1: {
                var8 = et.field_d.field_V;
                if (ic.field_i) {
                  L2: {
                    var2 = et.field_d.field_R[0].field_g;
                    if (var8.field_m != 1) {
                      break L2;
                    } else {
                      var8.field_m = -1;
                      break L2;
                    }
                  }
                  L3: {
                    if (0 != var8.field_m) {
                      break L3;
                    } else {
                      if (var2 != var8.field_s) {
                        var8.field_m = -1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (0 != var8.field_m) {
                      break L4;
                    } else {
                      if (var8.field_s == var2) {
                        ic.field_i = false;
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 = et.field_d.field_P[0][var2];
                  if (!qg.a(2235, var3.field_w, 20, var3.field_M)) {
                    var8.field_r = 3;
                    break L1;
                  } else {
                    var8.field_r = 0;
                    if (var3.field_u == 0) {
                      break L1;
                    } else {
                      var3.a((byte) -31, 0);
                      break L1;
                    }
                  }
                } else {
                  if (var8.field_m != -1) {
                    break L1;
                  } else {
                    if (var8.field_p <= 0) {
                      break L1;
                    } else {
                      if (var8.field_p < 88080384) {
                        var2_ref_nl = et.field_d.a((byte) 120, 0);
                        var3_int = 0;
                        var4 = et.field_d.field_x;
                        var5 = 0;
                        L5: while (true) {
                          if (var5 >= var4.length) {
                            if (var3_int != 0) {
                              break L1;
                            } else {
                              if (262144 > var8.e(-111)) {
                                ic.field_i = true;
                                break L1;
                              } else {
                                break L1;
                              }
                            }
                          } else {
                            var6 = var4[var5];
                            var3_int = var3_int != 0 | var6.a(var2_ref_nl.field_M, var2_ref_nl.field_w, 703166480, var2_ref_nl.field_v) ? 1 : 0;
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "vc.A(" + 125 + 41);
        }
    }

    public static void g() {
        field_A = null;
        field_D = null;
        field_F = null;
        int var1 = 0;
        field_x = null;
        field_z = null;
        field_E = null;
        field_H = null;
    }

    final static void i(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              wo.a(ar.field_c, (gm) (Object) tq.field_F.b((byte) -96), (byte) 118, 256);
              if (param0 == 45) {
                break L1;
              } else {
                vc.i((byte) 21);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (var1_int >= tq.field_F.field_I) {
                break L0;
              } else {
                L3: {
                  if (!tq.field_F.field_R[var1_int].d(3511)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "vc.F(" + param0 + 41);
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
