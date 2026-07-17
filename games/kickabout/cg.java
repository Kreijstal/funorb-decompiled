/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends ct {
    private int field_J;
    static String[] field_G;
    private String field_A;
    private hu field_I;
    static ut field_K;
    private boolean field_B;
    static String[] field_E;
    static int field_D;
    private int field_C;
    static String field_L;
    private int field_M;

    final static void a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            if (param1 <= -83) {
              L1: {
                k.field_i = k.field_i + 1;
                if (ji.field_Hb != -1) {
                  break L1;
                } else {
                  if (lj.field_h == -1) {
                    ji.field_Hb = el.field_A;
                    lj.field_h = n.field_m;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  if (param0 != null) {
                    if (param0.equals((Object) (Object) mh.field_o)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    if (null != mh.field_o) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (!nc.field_a) {
                    if (us.field_e <= k.field_i) {
                      if (k.field_i < us.field_e - -rd.field_i) {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        break L4;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_19_0 = stackOut_16_0;
                        break L4;
                      }
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_19_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_19_0 = stackOut_12_0;
                    break L4;
                  }
                }
                L5: {
                  var2_int = stackIn_19_0;
                  if (param0 == null) {
                    k.field_i = 0;
                    break L5;
                  } else {
                    if (nc.field_a) {
                      k.field_i = us.field_e;
                      break L5;
                    } else {
                      if (var2_int == 0) {
                        k.field_i = 0;
                        break L5;
                      } else {
                        k.field_i = us.field_e;
                        break L5;
                      }
                    }
                  }
                }
                td.field_d = lj.field_h;
                ws.field_e = ji.field_Hb;
                if (param0 == null) {
                  if (var2_int != 0) {
                    nc.field_a = true;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  nc.field_a = false;
                  break L2;
                }
              }
              L6: {
                if (nc.field_a) {
                  break L6;
                } else {
                  if (us.field_e <= k.field_i) {
                    break L6;
                  } else {
                    if (!el.field_C) {
                      break L6;
                    } else {
                      k.field_i = 0;
                      td.field_d = lj.field_h;
                      ws.field_e = ji.field_Hb;
                      break L6;
                    }
                  }
                }
              }
              L7: {
                mh.field_o = param0;
                if (!nc.field_a) {
                  break L7;
                } else {
                  if (k.field_i == nd.field_b) {
                    k.field_i = 0;
                    nc.field_a = false;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              lj.field_h = -1;
              ji.field_Hb = -1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var2;
            stackOut_42_1 = new StringBuilder().append("cg.D(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L8;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 44 + param1 + 41);
        }
    }

    public static void k(int param0) {
        field_E = null;
        field_L = null;
        field_G = null;
        field_K = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((cg) this).field_t - -param2;
        int var6 = param3 + ((cg) this).field_g;
        super.a(param0, (int) (char)param1, param2, param3);
        if (!(0 == param0)) {
            return;
        }
        int var7 = !((cg) this).field_B ? 0 : -(2 * ((cg) this).field_J) + -((cg) this).field_M + ((cg) this).field_n;
        int discarded$0 = ((cg) this).field_I.a(((cg) this).field_A, var5 + (var7 + ((cg) this).field_J), ((cg) this).field_J + var6, -((cg) this).field_J + ((cg) this).field_M, ((cg) this).field_i - ((cg) this).field_J * 2, ((cg) this).field_C, -1, ((cg) this).field_B ? 0 : 2, 1, ((cg) this).field_I.field_G);
    }

    final String f(int param0) {
        int var2 = ((cg) this).field_z.field_m ? 1 : 0;
        ((cg) this).field_z.field_m = ((cg) this).field_m;
        String var3 = ((cg) this).field_z.f(param0);
        ((cg) this).field_z.field_m = var2 != 0 ? true : false;
        return var3;
    }

    cg(int param0, int param1, int param2, int param3, fd param4, boolean param5, int param6, int param7, hu param8, int param9, String param10) {
        super(param0, param1, param2, param3, (gj) null, (jv) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              ((cg) this).field_C = param9;
              ((cg) this).field_z = param4;
              ((cg) this).field_J = param7;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((cg) this).field_B = stackIn_4_1 != 0;
              ((cg) this).field_A = param10;
              ((cg) this).field_M = param6;
              ((cg) this).field_I = param8;
              var12_int = ((cg) this).field_M - ((cg) this).field_J;
              var13 = ((cg) this).field_I.c(param10, var12_int, ((cg) this).field_I.field_G) - -(2 * ((cg) this).field_J);
              if (param3 < var13) {
                ((cg) this).a(var13, 1, param0, param2, param1);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!((cg) this).field_B) {
                stackOut_9_0 = ((cg) this).field_M + 2 * ((cg) this).field_J;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((cg) this).field_z.a(-(((cg) this).field_J * 2) + param3, 1, var14, -((cg) this).field_M + (param2 + -(((cg) this).field_J * 3)), ((cg) this).field_J + (var13 + -param3 >> 1));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("cg.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param9).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = 0;
        field_G = new String[]{"Right-click", "Mouse wheel"};
        field_L = "<%0> beats <%1>, <%2> to <%3>, sealing their place <%4>.";
    }
}
