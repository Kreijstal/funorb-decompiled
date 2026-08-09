/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static bd field_b;
    static bd[] field_a;
    static int[] field_c;

    final static void a(p param0, boolean param1, int param2, int[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_a = (bd[]) null;
                break L1;
              }
            }
            L2: {
              if ((param2 ^ -1) == -18) {
                stackIn_5_0 = 3;
                break L2;
              } else {
                stackIn_5_0 = 6;
                break L2;
              }
            }
            L3: {
              var4_int = stackIn_5_0;
              if (-3 != (param3[param0.field_j.b(-4)] ^ -1)) {
                param0.field_l.a(var4_int, (byte) 94, param0.field_c);
                break L3;
              } else {
                break L3;
              }
            }
            param0.a(8573);
            param0.field_e = param0.field_e + 1;
            if ((param0.field_e ^ -1) < -33) {
              param0.field_i = -1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("fm.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
    }

    public static void a(byte param0) {
        int[] var2;
        if (param0 >= -22) {
          var2 = (int[]) null;
          fm.a((p) null, true, -4, (int[]) null);
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    static {
        field_c = new int[8192];
    }
}
