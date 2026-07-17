/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends s {
    private ga field_I;
    static int field_H;
    private int field_G;

    final void a(byte param0, pj param1, int param2, int param3) {
        try {
            ((jf) this).field_G = ((jf) this).field_G + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "jf.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        qd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hj var12 = null;
        hj var13 = null;
        hj var14 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (0 != param1) {
          return;
        } else {
          L0: {
            L1: {
              var5 = param3 - (-((jf) this).field_s + -(((jf) this).field_m >> 1));
              var6 = (((jf) this).field_r >> 1) + (((jf) this).field_n + param0);
              var8 = ((jf) this).field_I.d(param2 ^ -1040730);
              if (ml.field_a == var8) {
                break L1;
              } else {
                if (var8 != uj.field_b) {
                  if (vh.field_h != var8) {
                    if (nc.field_bb != var8) {
                      break L0;
                    } else {
                      var14 = wd.field_C[1];
                      var14.e(-(var14.field_o >> 1) + var5, -(var14.field_k >> 1) + var6, 256);
                      break L0;
                    }
                  } else {
                    var13 = wd.field_C[2];
                    var13.e(-(var13.field_o >> 1) + var5, var6 + -(var13.field_k >> 1), 256);
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var12 = wd.field_C[0];
                var9 = var12.field_s << 1;
                var10 = var12.field_t << 1;
                if (null == lj.field_N) {
                  break L3;
                } else {
                  if (var9 > lj.field_N.field_o) {
                    break L3;
                  } else {
                    if (lj.field_N.field_k < var10) {
                      break L3;
                    } else {
                      de.a(-128, lj.field_N);
                      ul.d();
                      break L2;
                    }
                  }
                }
              }
              lj.field_N = new hj(var9, var10);
              de.a(param2 ^ -1048454, lj.field_N);
              break L2;
            }
            var12.b(112, 144, var12.field_s << 4, var12.field_t << 4, -((jf) this).field_G << 10, 4096);
            int discarded$1 = -105;
            oc.g();
            lj.field_N.e(-var12.field_s + var5, var6 - var12.field_t, 256);
            break L0;
          }
          return;
        }
    }

    final boolean a(int param0, pj param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -81) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jf.E(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    jf(ga param0) {
        try {
            ((jf) this).field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "jf.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean j() {
        return mb.field_c;
    }

    final String g(int param0) {
        if (param0 != -8235) {
            return null;
        }
        if (!(!((jf) this).field_t)) {
            return ((jf) this).field_I.a(126);
        }
        return null;
    }

    final static void a(byte param0, int param1, hj param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var20 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (-param3 + param1 << 8) / param2.field_s;
              param4 = param4 + param2.field_u;
              param5 = param5 + param2.field_p;
              var7 = (param3 << 8) + param2.field_p * var6_int;
              var8 = param5 - -(ul.field_f * param4);
              var9 = 0;
              var10 = param2.field_k;
              var11 = param2.field_o;
              var12 = -var11 + ul.field_f;
              if (param4 >= ul.field_d) {
                break L1;
              } else {
                var14 = ul.field_d - param4;
                var9 = var9 + var14 * var11;
                var10 = var10 - var14;
                param4 = ul.field_d;
                var8 = var8 + var14 * ul.field_f;
                break L1;
              }
            }
            L2: {
              var13 = 0;
              if (ul.field_i > param5) {
                var14 = ul.field_i - param5;
                var12 = var12 + var14;
                var8 = var8 + var14;
                param5 = ul.field_i;
                var13 = var13 + var14;
                var11 = var11 - var14;
                var7 = var7 + var14 * var6_int;
                var9 = var9 + var14;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (ul.field_a < var10 + param4) {
                var10 = var10 - (-ul.field_a + (var10 + param4));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var11 + param5 <= ul.field_e) {
                break L4;
              } else {
                var14 = -ul.field_e + (var11 + param5);
                var11 = var11 - var14;
                var13 = var13 + var14;
                var12 = var12 + var14;
                break L4;
              }
            }
            L5: {
              if (var11 <= 0) {
                break L5;
              } else {
                if (var10 > 0) {
                  param4 = -var10;
                  L6: while (true) {
                    if (param4 >= 0) {
                      break L0;
                    } else {
                      var14 = var7;
                      param5 = -var11;
                      L7: while (true) {
                        if (param5 >= 0) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param4++;
                          continue L6;
                        } else {
                          L8: {
                            var15 = var14 >> 8;
                            var16 = 256 - var15;
                            var14 = var14 + var6_int;
                            if (var15 >= 0) {
                              L9: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param2.field_v[incrementValue$1];
                                if (0 == var17) {
                                  break L9;
                                } else {
                                  if (var15 <= 255) {
                                    var18 = ul.field_b[var8];
                                    var19 = 16711935 & var15 * (var17 & 16711935) + var16 * (16711935 & var18) >> 8;
                                    ul.field_b[var8] = var19 - -(vi.a(16711715, vi.a(var17, 65280) * var15 + vi.a(var18, 65280) * var16) >> 8);
                                    break L9;
                                  } else {
                                    ul.field_b[var8] = var17;
                                    break L9;
                                  }
                                }
                              }
                              var8++;
                              break L8;
                            } else {
                              var9++;
                              var8++;
                              break L8;
                            }
                          }
                          param5++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("jf.KA(").append(-20).append(44).append(param1).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = 10;
    }
}
