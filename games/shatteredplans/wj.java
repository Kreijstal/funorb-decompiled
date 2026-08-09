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
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
                    stackIn_26_0 = 0;
                    break L1;
                  } else {
                    stackIn_26_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
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
                    stackIn_28_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    rs.field_Db.b(pd.field_k, bb.field_b, -498);
                    stackIn_17_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L3: {
                    L4: {
                      L5: {
                        if (rs.field_Db == null) {
                          break L5;
                        } else {
                          if (-6 >= (jb.field_b ^ -1)) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (rr.a(wl.field_f, param0, (byte) 64)) {
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
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("wj.D(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L6;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_26_0 != 0;
            } else {
              return stackIn_28_0 != 0;
            }
          }
        }
    }

    final static void a(int param0) {
        bi stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        bi stackIn_16_0;
        int stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_16_4;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nd[] var7 = null;
        sb var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        nd var9_ref_nd = null;
        int var10 = 0;
        nd[] var11 = null;
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
              if ((var5 ^ -1) > -257) {
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
                var6 = di.field_m >> -1007291647;
                gf.g(320, var4 + 528, 400, 16777215);
                break L3;
              }
            }
            if (param0 == 128) {
              L4: {
                ac.field_s.f(var1_int, var2);
                tg.a(var2, oe.field_c, (byte) 15, var1_int);
                stackIn_13_0 = mc.field_u;

                stackIn_13_1 = 0;

                stackIn_13_2 = var4;

                stackIn_13_3 = var6;

                if (0 <= dp.field_r) {








                  if ((dp.field_r ^ -1) >= -257) {
                    stackIn_16_0 = (bi) ((Object) stackIn_13_0);
                    stackIn_16_1 = stackIn_13_1;
                    stackIn_16_2 = stackIn_13_2;
                    stackIn_16_3 = stackIn_13_3;
                    stackIn_16_4 = dp.field_r;
                    break L4;
                  } else {
                    stackIn_16_0 = (bi) ((Object) stackIn_13_0);
                    stackIn_16_1 = stackIn_13_1;
                    stackIn_16_2 = stackIn_13_2;
                    stackIn_16_3 = stackIn_13_3;
                    stackIn_16_4 = 256;
                    break L4;
                  }
                } else {
                  stackIn_16_0 = (bi) ((Object) stackIn_13_0);
                  stackIn_16_1 = stackIn_13_1;
                  stackIn_16_2 = stackIn_13_2;
                  stackIn_16_3 = stackIn_13_3;
                  stackIn_16_4 = 0;
                  break L4;
                }
              }
              ((bi) (Object) stackIn_16_0).c(stackIn_16_1, stackIn_16_2, stackIn_16_3 * stackIn_16_4 >> 1705641288);
              mc.field_u.c(0, var4, var6);
              var11 = fe.field_C;
              var7 = var11;
              var8 = 0;
              L5: while (true) {
                if (var11.length <= var8) {
                  var7_ref = (sb) ((Object) rp.field_K.d(0));
                  L6: while (true) {
                    if (var7_ref == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var2 = (int)var7_ref.field_n;
                      var1_int = (int)var7_ref.field_l;
                      var8 = 1;
                      L7: while (true) {
                        if (var8 >= 50) {
                          gf.b((int)var7_ref.field_l << -1743112892, (int)var7_ref.field_n << -1674075228, 128, 100, fe.field_u);
                          var7_ref = (sb) ((Object) rp.field_K.a((byte) -71));
                          continue L6;
                        } else {
                          L8: {
                            var9 = -var8 + var7_ref.field_q;
                            gf.b(var1_int << 1931902500, var2 << 1231932036, -var8 + 50, -(var8 * 2) + 100, fe.field_u);
                            if ((var9 ^ -1) > -1) {
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
                      gf.b(var9_ref_nd.field_e + var1_int << 1035740484, var9_ref_nd.field_j - -var2 << 1755684804, var9_ref_nd.field_f, var9_ref_nd.field_a, fe.field_u);
                      break L9;
                    }
                  }
                  var8++;
                  continue L5;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "wj.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != 59) {
            field_k = (String) null;
        }
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
            var5.h(param1, param0 + -65);
            var5.field_j = var5.field_j + 1;
            var4 = var5.field_j;
            var5.c(1, (byte) -59);
            var5.c(param2.field_j, (byte) -104);
            var5.c(param2.field_l, (byte) -75);
            if (param0 != 320) {
                field_n = (String) null;
            }
            var5.e(11135, param2.field_i);
            var5.e(11135, param2.field_n);
            var5.e(param0 ^ 10815, param2.field_m);
            var5.e(param0 + 10815, param2.field_h);
            var5.a(var4, param0 + -446);
            var5.b(-var4 + var5.field_j, (byte) 127);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "wj.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Asking to join <%0>'s game...";
        field_k = "Service unavailable";
    }
}
