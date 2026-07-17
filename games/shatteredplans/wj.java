/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends oh {
    int field_p;
    static String field_n;
    int field_q;
    int field_l;
    static String field_k;
    int field_h;
    int[] field_i;
    int field_o;
    int field_m;
    int field_j;

    final static boolean a(pf param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 < -68) {
              qa.field_w = as.a(param0, bb.field_b, (byte) 115, pd.field_k);
              if (1 == je.field_d) {
                L1: {
                  jb.field_b = 0;
                  am.field_Gb = nh.field_p;
                  tc.field_C = td.field_P;
                  wl.field_f = as.a(param0, tc.field_C, (byte) -41, am.field_Gb);
                  if (null == wl.field_f) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L1;
                  } else {
                    stackOut_24_0 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    break L1;
                  }
                }
                return stackIn_26_0 != 0;
              } else {
                if (rf.field_n == 1) {
                  jb.field_b = jb.field_b + 1;
                  if (rs.field_Db == null) {
                    L2: {
                      var2_int = (-pd.field_k + am.field_Gb) * (am.field_Gb - pd.field_k) - -((-bb.field_b + tc.field_C) * (tc.field_C + -bb.field_b));
                      if (5 >= jb.field_b) {
                        break L2;
                      } else {
                        if (25 >= var2_int) {
                          break L2;
                        } else {
                          if (wl.field_f == null) {
                            break L2;
                          } else {
                            lh.field_w = wl.field_f.field_k + -am.field_Gb;
                            rs.field_Db = wl.field_f;
                            ir.field_D = wl.field_f.field_t + -tc.field_C;
                            break L2;
                          }
                        }
                      }
                    }
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L0;
                  } else {
                    rs.field_Db.b(pd.field_k, bb.field_b, -498);
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  }
                } else {
                  L3: {
                    L4: {
                      L5: {
                        if (rs.field_Db == null) {
                          break L5;
                        } else {
                          if (jb.field_b >= 5) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      int discarded$1 = 64;
                      if (rr.a(wl.field_f, param0)) {
                        dn.field_h = wl.field_f;
                        if (null == dn.field_h) {
                          break L3;
                        } else {
                          dn.field_h.a(bb.field_b - dn.field_h.field_t, 0, -dn.field_h.field_k + pd.field_k);
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    dn.field_h = null;
                    break L3;
                  }
                  rs.field_Db = null;
                  wl.field_f = null;
                  return false;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("wj.D(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 41);
        }
        return stackIn_28_0 != 0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nd[] var7 = null;
        sb var7_ref = null;
        int var8 = 0;
        nd var9_ref_nd = null;
        int var9 = 0;
        int var10 = 0;
        nd[] var11 = null;
        bi stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        bi stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        bi stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        bi stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        bi stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        bi stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        bi stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        bi stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        bi stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = (float)di.field_m / 1000.0f + 0.15000000596046448f;
              var1_int = -(int)(200.0 * Math.sin((double)var3));
              var2 = (int)(Math.cos((double)var3) * 200.0) - 200;
              va.field_e.f(var1_int, var2);
              var4 = -(di.field_m * 120 / 1000) + 176;
              var5 = 540 - var4;
              ra.a(-111);
              if (var5 < 256) {
                var4 = 284;
                var5 = 256;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == mc.field_u) {
                mc.field_u = ds.field_b.g();
                mc.field_u.e();
                break L2;
              } else {
                mc.field_u.e();
                ds.field_b.c(0, 0);
                break L2;
              }
            }
            L3: {
              var1_int = -5;
              var2 = -80 + 100 * di.field_m / 1000;
              so.a(0, 0, var2 + -var4 + ac.field_s.field_x, ma.field_r);
              cg.i(0);
              var6 = 256;
              if (512 <= di.field_m) {
                break L3;
              } else {
                var6 = di.field_m >> 1;
                gf.g(320, var4 + 528, 400, 16777215);
                break L3;
              }
            }
            L4: {
              ac.field_s.f(var1_int, var2);
              tg.a(var2, oe.field_c, (byte) 15, var1_int);
              stackOut_10_0 = mc.field_u;
              stackOut_10_1 = 0;
              stackOut_10_2 = var4;
              stackOut_10_3 = var6;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              stackIn_12_3 = stackOut_10_3;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              stackIn_11_3 = stackOut_10_3;
              if (0 <= dp.field_r) {
                stackOut_12_0 = (bi) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = stackIn_12_2;
                stackOut_12_3 = stackIn_12_3;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_14_3 = stackOut_12_3;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                if (dp.field_r <= 256) {
                  stackOut_14_0 = (bi) (Object) stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = stackIn_14_3;
                  stackOut_14_4 = dp.field_r;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  stackIn_15_4 = stackOut_14_4;
                  break L4;
                } else {
                  stackOut_13_0 = (bi) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = stackIn_13_3;
                  stackOut_13_4 = 256;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  stackIn_15_4 = stackOut_13_4;
                  break L4;
                }
              } else {
                stackOut_11_0 = (bi) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = stackIn_11_3;
                stackOut_11_4 = 0;
                stackIn_15_0 = stackOut_11_0;
                stackIn_15_1 = stackOut_11_1;
                stackIn_15_2 = stackOut_11_2;
                stackIn_15_3 = stackOut_11_3;
                stackIn_15_4 = stackOut_11_4;
                break L4;
              }
            }
            ((bi) (Object) stackIn_15_0).c(stackIn_15_1, stackIn_15_2, stackIn_15_3 * stackIn_15_4 >> 8);
            mc.field_u.c(0, var4, var6);
            var11 = fe.field_C;
            var7 = var11;
            var8 = 0;
            L5: while (true) {
              if (var11.length <= var8) {
                var7_ref = (sb) (Object) rp.field_K.d(0);
                L6: while (true) {
                  if (var7_ref == null) {
                    break L0;
                  } else {
                    var2 = (int)var7_ref.field_n;
                    var1_int = (int)var7_ref.field_l;
                    var8 = 1;
                    L7: while (true) {
                      if (var8 >= 50) {
                        gf.b((int)var7_ref.field_l << 4, (int)var7_ref.field_n << 4, 128, 100, fe.field_u);
                        var7_ref = (sb) (Object) rp.field_K.a((byte) -71);
                        continue L6;
                      } else {
                        L8: {
                          var9 = -var8 + var7_ref.field_q;
                          gf.b(var1_int << 4, var2 << 4, -var8 + 50, -(var8 * 2) + 100, fe.field_u);
                          if (var9 < 0) {
                            var9 += 50;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int = (int)var7_ref.field_o[var9];
                        var2 = (int)var7_ref.field_i[var9];
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                L9: {
                  var9_ref_nd = var11[var8];
                  if (0 == var9_ref_nd.field_a) {
                    break L9;
                  } else {
                    gf.b(var9_ref_nd.field_e + var1_int << 4, var9_ref_nd.field_j - -var2 << 4, var9_ref_nd.field_f, var9_ref_nd.field_a, fe.field_u);
                    break L9;
                  }
                }
                var8++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "wj.C(" + 128 + 41);
        }
    }

    public static void a() {
        field_n = null;
        field_k = null;
    }

    private wj() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1, lq param2) {
        sl var5 = null;
        int var4 = 0;
        try {
            var5 = js.field_f;
            var5.h(4, 255);
            var5.field_j = var5.field_j + 1;
            var4 = var5.field_j;
            var5.c(1, (byte) -59);
            var5.c(param2.field_j, (byte) -104);
            var5.c(param2.field_l, (byte) -75);
            var5.e(11135, param2.field_i);
            var5.e(11135, param2.field_n);
            var5.e(11135, param2.field_m);
            var5.e(11135, param2.field_h);
            int discarded$0 = var5.a(var4, -126);
            var5.b(-var4 + var5.field_j, (byte) 127);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "wj.B(" + 320 + 44 + 4 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Asking to join <%0>'s game...";
        field_k = "Service unavailable";
    }
}
