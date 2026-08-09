/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static int field_b;
    static boolean field_c;
    static String field_a;

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (param0 == -22697) {
              L1: {
                var3 = mq.a(param2, false);
                if (0 != (param1.indexOf(param2) ^ -1)) {
                  break L1;
                } else {
                  if (param1.indexOf(var3) != -1) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if (param1.startsWith(param2)) {
                          break L3;
                        } else {
                          if (param1.startsWith(var3)) {
                            break L3;
                          } else {
                            if (param1.endsWith(param2)) {
                              break L3;
                            } else {
                              if (!param1.endsWith(var3)) {
                                stackIn_15_0 = 0;
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      stackIn_15_0 = 1;
                      break L2;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("tj.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(byte param0) {
        if (param0 > 34) {
          if (ir.field_c != this) {
            if (Vertigo2.field_E != this) {
              if (this == bm.field_I) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, od param2, bs param3, boolean param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bs var12 = null;
        b var13 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            oq.a(param2, -1, 4462, -1, param3.field_Wb, (int[]) null, param3, param3.field_Pb, param3.field_bc);
            un.field_Lb.a(0, true);
            un.field_Lb.a((int[]) null, 0, (byte) -79);
            un.field_Lb.c(-24634);
            var13 = un.field_Lb;
            var8 = param0;
            var9 = param6;
            var10 = param5;
            var11 = param1;
            var13.field_n.c(var11, var9, -1220, var8, var10);
            if (!param4) {
              break L0;
            } else {
              var12 = (bs) null;
              tj.a(57, -125, (od) null, (bs) null, true, 20, -118);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("tj.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        try {
            if (param4 > -42) {
                field_b = -104;
            }
            oj.field_O[param5] = param0;
            oj.field_M[param5] = param3;
            oj.field_I[param5] = param1;
            oj.field_F[param5] = param6;
            oj.field_H[param5] = param2;
            oj.field_Q[param5] = false;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "tj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
