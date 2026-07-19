/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hcb extends rqa {
    static int field_p;
    static int field_o;
    static String field_q;

    public static void a(int param0) {
        field_q = null;
        if (param0 < 34) {
            hcb.a(-45, -91, 32, -35, 52, 118, 51, -43, 19, 16, 38);
        }
    }

    final static void b(boolean param0) {
        rb.field_c = new ij();
        if (param0) {
            field_q = (String) null;
        }
    }

    hcb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(String param0, int param1) {
        int discarded$2 = 0;
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 15) {
                break L1;
              } else {
                discarded$2 = hcb.a(108, -16, -68, (byte) 20, 33);
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (param0.length() < cd.field_b) {
                  break L2;
                } else {
                  if (param0.length() <= qn.field_f) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("hcb.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_o = 58;
                break L1;
              }
            }
            stackOut_2_0 = new nc(frb.a(34, 91));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("hcb.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, int param1, int param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        L0: {
          var5 = 15 & param4;
          if (var5 >= 8) {
            stackOut_2_0 = param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        if (var5 >= 4) {
          if (var5 != 12) {
            if ((var5 ^ -1) == -15) {
              L1: {
                var7 = param2;
                var8 = -70 / ((-24 - param3) / 62);
                if ((2 & var5) != 0) {
                  stackOut_31_0 = -var7;
                  stackIn_32_0 = stackOut_31_0;
                  break L1;
                } else {
                  stackOut_30_0 = var7;
                  stackIn_32_0 = stackOut_30_0;
                  break L1;
                }
              }
              L2: {
                stackOut_32_0 = stackIn_32_0;
                stackIn_34_0 = stackOut_32_0;
                stackIn_33_0 = stackOut_32_0;
                if ((var5 & 1) != 0) {
                  stackOut_34_0 = stackIn_34_0;
                  stackOut_34_1 = -var6;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  break L2;
                } else {
                  stackOut_33_0 = stackIn_33_0;
                  stackOut_33_1 = var6;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  break L2;
                }
              }
              return stackIn_35_0 + stackIn_35_1;
            } else {
              stackOut_20_0 = param0;
              stackIn_22_0 = stackOut_20_0;
              L3: {
                var7 = stackIn_22_0;
                var8 = -70 / ((-24 - param3) / 62);
                if ((2 & var5) != 0) {
                  stackOut_24_0 = -var7;
                  stackIn_25_0 = stackOut_24_0;
                  break L3;
                } else {
                  stackOut_23_0 = var7;
                  stackIn_25_0 = stackOut_23_0;
                  break L3;
                }
              }
              L4: {
                stackOut_25_0 = stackIn_25_0;
                stackIn_27_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if ((var5 & 1) != 0) {
                  stackOut_27_0 = stackIn_27_0;
                  stackOut_27_1 = -var6;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  break L4;
                } else {
                  stackOut_26_0 = stackIn_26_0;
                  stackOut_26_1 = var6;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  break L4;
                }
              }
              return stackIn_28_0 + stackIn_28_1;
            }
          } else {
            L5: {
              var7 = param2;
              var8 = -70 / ((-24 - param3) / 62);
              if ((2 & var5) != 0) {
                stackOut_14_0 = -var7;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = var7;
                stackIn_15_0 = stackOut_13_0;
                break L5;
              }
            }
            L6: {
              stackOut_15_0 = stackIn_15_0;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if ((var5 & 1) != 0) {
                stackOut_17_0 = stackIn_17_0;
                stackOut_17_1 = -var6;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L6;
              } else {
                stackOut_16_0 = stackIn_16_0;
                stackOut_16_1 = var6;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L6;
              }
            }
            return stackIn_18_0 + stackIn_18_1;
          }
        } else {
          L7: {
            var7 = param1;
            var8 = -70 / ((-24 - param3) / 62);
            if ((2 & var5) != 0) {
              stackOut_6_0 = -var7;
              stackIn_7_0 = stackOut_6_0;
              break L7;
            } else {
              stackOut_5_0 = var7;
              stackIn_7_0 = stackOut_5_0;
              break L7;
            }
          }
          L8: {
            stackOut_7_0 = stackIn_7_0;
            stackIn_9_0 = stackOut_7_0;
            stackIn_8_0 = stackOut_7_0;
            if ((var5 & 1) != 0) {
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = -var6;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L8;
            } else {
              stackOut_8_0 = stackIn_8_0;
              stackOut_8_1 = var6;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              break L8;
            }
          }
          return stackIn_10_0 + stackIn_10_1;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var11 = 0;
        if (param0 == 8) {
          if (!li.field_i) {
            var11 = param8 >>> -23556328;
            if ((var11 ^ -1) >= -2) {
              return;
            } else {
              bfb.field_b = 255 - var11;
              bfb.a(param7, param6, param1, param4, param9, param5, param8);
              return;
            }
          } else {
            if (!ew.field_o) {
              return;
            } else {
              og.field_r.a(param4, param7, param9, param6, param5, param1, param8, param3, param10, param2);
              return;
            }
          }
        } else {
          field_p = 5;
          if (!li.field_i) {
            var11 = param8 >>> -23556328;
            if ((var11 ^ -1) >= -2) {
              return;
            } else {
              bfb.field_b = 255 - var11;
              bfb.a(param7, param6, param1, param4, param9, param5, param8);
              return;
            }
          } else {
            if (!ew.field_o) {
              return;
            } else {
              og.field_r.a(param4, param7, param9, param6, param5, param1, param8, param3, param10, param2);
              return;
            }
          }
        }
    }

    static {
        field_q = "Exploiting a bug";
    }
}
