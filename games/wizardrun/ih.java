/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String[] field_c;
    static boolean field_a;
    static uc field_b;

    final static int a(byte param0) {
        if (param0 > -77) {
          ih.a(76, -4, -17, 16, true, -96, 63);
          return (int)(1000000000L / wj.field_E);
        } else {
          return (int)(1000000000L / wj.field_E);
        }
    }

    final static boolean a(String param0, boolean param1, nk param2, int param3, int param4, String param5, String param6) {
        RuntimeException var7 = null;
        kk var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                field_a = true;
                break L1;
              }
            }
            if (fi.field_y != ej.field_b) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = new kk(u.field_A, param2);
              u.field_A.b((ub) (var8), (byte) 94);
              if (!ri.c(42)) {
                L2: {
                  ki.field_F = null;
                  fi.field_y = pl.field_E;
                  na.field_l = param0;
                  ac.field_t = param4;
                  sf.field_a = param5;
                  we.field_a = param6;
                  if (!param1) {
                    stackIn_11_0 = 0;
                    break L2;
                  } else {
                    stackIn_11_0 = 1;
                    break L2;
                  }
                }
                ub.field_m = stackIn_11_0 != 0;
                return true;
              } else {
                var8.p(param3 ^ -20371);
                stackIn_13_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var7);

            stackIn_16_1 = new StringBuilder().append("ih.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param6 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_17_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final static void a(int param0) {
        if (!qb.field_p) {
            throw new IllegalStateException();
        }
        vc.field_M = true;
        ml.a(param0 + 11579568, true);
        ml.field_t = param0;
    }

    public static void b(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 0) {
            String var2 = (String) null;
            ih.a((String) null, false, (nk) null, -33, -128, (String) null, (String) null);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (param4) {
          if (param5 >= param0) {
            if (param5 < param0 - -param1) {
              if (param6 >= param3) {
                if (param3 + param2 <= param6) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_a = true;
          if (param5 >= param0) {
            if (param5 < param0 - -param1) {
              if (param6 >= param3) {
                if (param3 + param2 <= param6) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    static {
        field_a = false;
        field_c = new String[]{"By rating", "By win percentage"};
    }
}
