/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    static String field_d;
    static hj field_b;
    static String field_a;
    int field_c;

    final static qj a(boolean param0, byte param1) {
        qj var2;
        qj stackIn_3_0 = null;
        qj stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        qj stackIn_7_0 = null;
        qj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        var2 = new qj(true);
        if (param1 != -68) {
          L0: {
            fk.a(-117);
            stackIn_7_0 = (qj) (var2);

            if (!param0) {
              stackIn_8_0 = (qj) ((Object) stackIn_7_0);
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = (qj) ((Object) stackIn_7_0);
              stackIn_8_1 = 1;
              break L0;
            }
          }
          stackIn_8_0.field_d = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            stackIn_3_0 = (qj) (var2);

            if (!param0) {
              stackIn_4_0 = (qj) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (qj) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L1;
            }
          }
          stackIn_4_0.field_d = stackIn_4_1 != 0;
          return var2;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != -102) {
            fk.a((byte) 29);
        }
    }

    final static boolean a(int param0) {
        if (param0 != 1113) {
            field_a = (String) null;
            return tl.a(uj.b((byte) -120), 61);
        }
        return tl.a(uj.b((byte) -120), 61);
    }

    final static hj a(ki param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        hj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 122 % ((param2 - -6) / 44);
            var5 = param0.a(param3, 0);
            var6 = param0.a(param1, 5187, var5);
            stackIn_1_0 = va.a(var5, var6, param0, (byte) -127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("fk.B(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    fk(int param0) {
        this.field_c = param0;
    }

    static {
        field_d = "Change display name";
        field_a = "Type your password again to make sure it's correct";
    }
}
