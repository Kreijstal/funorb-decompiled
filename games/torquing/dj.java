/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static int[] field_c;
    static t[] field_a;
    static String field_b;

    final static int a(int param0, int param1, int param2, rm param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int fieldTemp$1 = 0;
        int[] var11 = null;
        RuntimeException var11_ref = null;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var20 = null;
        int[] var25 = null;
        int[] var26 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var15 = Torquing.field_u;
        try {
          L0: {
            po.field_x[0] = param3.field_M[param7];
            po.field_x[1] = param3.field_M[param0];
            po.field_x[2] = param3.field_M[param1];
            cl.field_e[0] = param3.field_B[param7];
            cl.field_e[1] = param3.field_B[param0];
            cl.field_e[2] = param3.field_B[param1];
            jm.field_e[0] = param3.field_E[param7];
            jm.field_e[1] = param3.field_E[param0];
            jm.field_e[2] = param3.field_E[param1];
            ml.field_d[2] = param4;
            ml.field_d[1] = param2;
            ml.field_d[0] = param5;
            il.field_p[1] = param8;
            il.field_p[0] = param10;
            il.field_p[2] = param6;
            g.a(po.field_x, cl.field_e, jm.field_e, ml.field_d, il.field_p);
            cd.a(param3, -19729, 3);
            var20 = g.field_b;
            var17 = var20;
            var16 = var17;
            var11 = var16;
            var25 = g.field_c;
            var26 = g.field_a;
            param7 = param3.a(var20[0], var25[0], var26[0]);
            param0 = param3.a(var20[param9], var25[1], var26[1]);
            param1 = param3.a(var20[2], var25[2], var26[2]);
            var14 = 0;
            L1: while (true) {
              if (var14 >= param3.field_k) {
                param3.field_s[param3.field_k] = (byte) 0;
                param3.field_u[param3.field_k] = (short)param7;
                param3.field_n[param3.field_k] = (short)param0;
                param3.field_x[param3.field_k] = (short)param1;
                fieldTemp$1 = param3.field_k;
                param3.field_k = param3.field_k + 1;
                stackIn_11_0 = fieldTemp$1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (param7 != param3.field_u[var14]) {
                    break L2;
                  } else {
                    if (param0 != param3.field_n[var14]) {
                      break L2;
                    } else {
                      if (param3.field_x[var14] == param1) {
                        stackIn_8_0 = var14;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var14++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var11_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var11_ref);

            stackIn_14_1 = new StringBuilder().append("dj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_11_0;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -62) {
            field_c = (int[]) null;
        }
        field_a = null;
    }

    static {
        field_c = new int[8192];
        field_b = "Passwords must be between 5 and 20 characters long";
    }
}
