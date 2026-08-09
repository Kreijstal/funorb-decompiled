/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh implements io {
    static vn field_a;

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 16777215) {
                break L1;
              } else {
                field_a = (vn) null;
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

            stackIn_5_1 = new StringBuilder().append("kh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ')');
        }
    }

    final static fn a(int param0, boolean param1) {
        tm var2 = new tm(param0);
        kn.field_L.a(0, var2);
        if (param1) {
            return (fn) null;
        }
        return var2.field_j;
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -5 % ((-18 - param0) / 41);
    }

    static {
    }
}
