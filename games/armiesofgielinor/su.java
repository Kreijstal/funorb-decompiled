/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class su {
    static int[] field_a;
    private float[] field_e;
    static String field_b;
    static String field_c;
    static je field_d;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            su.a(true);
        }
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final ej a(byte param0, ha param1, id[] param2, int param3, boolean param4) {
        ej var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ej var10 = null;
        ej stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var10 = new ej(param1, param3, param4, param2);
            var6 = var10;
            var7 = 0;
            var8 = -40 / ((param0 - -12) / 61);
            L1: while (true) {
              if ((var7 ^ -1) <= -63) {
                stackIn_5_0 = (ej) (var6);
                break L0;
              } else {
                var10.field_P[var7] = this.field_e[var7];
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6_ref);

            stackIn_8_1 = new StringBuilder().append("su.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_5_0;
    }

    private su() throws Throwable {
        throw new Error();
    }

    static {
        field_a = new int[]{1, 8, 8, 15, 1, 9};
        field_b = "Name";
        field_c = "Sound: ";
    }
}
