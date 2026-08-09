/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends ks {
    static String field_H;
    static boolean[] field_D;
    byte[] field_F;
    static wk[] field_G;
    static String field_J;
    static String field_I;
    static volatile int field_B;
    int field_L;
    bc field_C;
    static int field_E;
    static tp field_K;

    final static wk a(String param0, String param1, kl param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.a(param1, 96);
              if (!param3) {
                break L1;
              } else {
                field_G = (wk[]) null;
                break L1;
              }
            }
            var5 = param2.a((byte) -107, var4_int, param0);
            stackIn_3_0 = vh.a(-1, var4_int, param2, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("nh.D(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final byte[] d(byte param0) {
        int var2 = 125 / ((param0 - -35) / 45);
        if (!(!this.field_x)) {
            throw new RuntimeException();
        }
        return this.field_F;
    }

    public static void h(int param0) {
        field_J = null;
        field_G = null;
        field_I = null;
        field_D = null;
        if (param0 < 107) {
            return;
        }
        field_H = null;
        field_K = null;
    }

    nh() {
    }

    final int g(int param0) {
        if (this.field_x) {
            return 0;
        }
        if (param0 != 0) {
            field_J = (String) null;
            return 100;
        }
        return 100;
    }

    static {
        field_B = -1;
        field_I = "Open in popup window";
        field_H = "Magic robes help to protect against magic damage.";
        field_J = "Error";
    }
}
