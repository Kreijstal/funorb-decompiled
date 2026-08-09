/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static hl[] field_c;
    static jl[] field_a;
    static int[] field_b;

    final static id[] a(ue param0, String param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ue stackIn_2_0 = null;
        String stackIn_2_1 = null;
        ue stackIn_3_0 = null;
        String stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_6_0 = 0;
        id[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param0.a(param2, param3);
              stackIn_2_0 = (ue) (param0);

              stackIn_2_1 = (String) (param1);

              if (param3) {
                stackIn_3_0 = (ue) ((Object) stackIn_2_0);
                stackIn_3_1 = (String) ((Object) stackIn_2_1);
                stackIn_3_2 = 0;
                break L1;
              } else {
                stackIn_3_0 = (ue) ((Object) stackIn_2_0);
                stackIn_3_1 = (String) ((Object) stackIn_2_1);
                stackIn_3_2 = 1;
                break L1;
              }
            }
            L2: {
              var5 = ((ue) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0, var4_int);
              if (param3) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            stackIn_7_0 = ji.a(stackIn_6_0 != 0, param0, var5, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("fg.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 6) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, hl[] param1, int param2, int param3) {
        try {
            if (param0 != 32513) {
                field_b = (int[]) null;
            }
            u.field_c = new gi(param1);
            qf.field_g = param2;
            qc.field_g = param3;
            nc.a((byte) 83);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "fg.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
