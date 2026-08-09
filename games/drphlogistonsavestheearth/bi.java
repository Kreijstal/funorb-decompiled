/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends lb {
    static vj field_I;
    byte[] field_F;
    int field_G;
    static String field_J;
    ik field_H;
    static mk[] field_K;

    final byte[] i(int param0) {
        if (param0 != 13095) {
            return (byte[]) null;
        }
        if (this.field_u) {
            throw new RuntimeException();
        }
        return this.field_F;
    }

    public static void a(byte param0) {
        field_I = null;
        field_K = null;
        field_J = null;
        int var1 = 93 / ((47 - param0) / 62);
    }

    final static void a(String param0, int param1, nh param2) {
        RuntimeException runtimeException = null;
        nh var4 = null;
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
            L1: {
              hf.field_D = param2;
              df.field_b = param0;
              if (param1 >= 119) {
                break L1;
              } else {
                var4 = (nh) null;
                bi.a((String) null, -46, (nh) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("bi.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    bi() {
    }

    final int g(int param0) {
        if (!(!this.field_u)) {
            return 0;
        }
        if (param0 > -38) {
            this.i(116);
            return 100;
        }
        return 100;
    }

    static {
        field_K = new mk[9];
    }
}
