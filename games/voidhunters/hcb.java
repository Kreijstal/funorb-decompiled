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
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 15) {
                break L1;
              } else {
                hcb.a(108, -16, -68, (byte) 20, 33);
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
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackIn_7_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("hcb.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = new nc(frb.a(34, 91));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hcb.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, int param1, int param2, byte param3, int param4) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = 15 & param4;
          if (var5 >= 8) {
            stackIn_3_0 = param1;
            break L0;
          } else {
            stackIn_3_0 = param2;
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
                  stackIn_32_0 = -var7;
                  break L1;
                } else {
                  stackIn_32_0 = var7;
                  break L1;
                }
              }
              L2: {


                if ((var5 & 1) != 0) {

                  stackIn_35_1 = -var6;
                  break L2;
                } else {

                  stackIn_35_1 = var6;
                  break L2;
                }
              }
              return stackIn_32_0 + stackIn_35_1;
            } else {
              stackIn_22_0 = param0;
              L3: {
                var7 = stackIn_22_0;
                var8 = -70 / ((-24 - param3) / 62);
                if ((2 & var5) != 0) {
                  stackIn_25_0 = -var7;
                  break L3;
                } else {
                  stackIn_25_0 = var7;
                  break L3;
                }
              }
              L4: {


                if ((var5 & 1) != 0) {

                  stackIn_28_1 = -var6;
                  break L4;
                } else {

                  stackIn_28_1 = var6;
                  break L4;
                }
              }
              return stackIn_25_0 + stackIn_28_1;
            }
          } else {
            L5: {
              var7 = param2;
              var8 = -70 / ((-24 - param3) / 62);
              if ((2 & var5) != 0) {
                stackIn_15_0 = -var7;
                break L5;
              } else {
                stackIn_15_0 = var7;
                break L5;
              }
            }
            L6: {


              if ((var5 & 1) != 0) {

                stackIn_18_1 = -var6;
                break L6;
              } else {

                stackIn_18_1 = var6;
                break L6;
              }
            }
            return stackIn_15_0 + stackIn_18_1;
          }
        } else {
          L7: {
            var7 = param1;
            var8 = -70 / ((-24 - param3) / 62);
            if ((2 & var5) != 0) {
              stackIn_7_0 = -var7;
              break L7;
            } else {
              stackIn_7_0 = var7;
              break L7;
            }
          }
          L8: {


            if ((var5 & 1) != 0) {

              stackIn_10_1 = -var6;
              break L8;
            } else {

              stackIn_10_1 = var6;
              break L8;
            }
          }
          return stackIn_7_0 + stackIn_10_1;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var11;
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
