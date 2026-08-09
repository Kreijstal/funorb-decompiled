/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jtb extends fh {
    boolean field_k;
    volatile boolean field_n;
    boolean field_l;
    static int field_m;

    abstract byte[] a(int param0);

    abstract int e(byte param0);

    jtb() {
        this.field_n = true;
    }

    final static void a(int param0, int param1, long param2, boolean param3, String param4) {
        RuntimeException runtimeException = null;
        String var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              kkb.field_p = param1;
              hb.field_b = param2;
              cwa.field_b = param4;
              cha.field_o = true;
              gi.field_a = param0;
              if (!param3) {
                break L1;
              } else {
                var7 = (String) null;
                jtb.a(50, -52, 121L, false, (String) null);
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

            stackIn_5_1 = new StringBuilder().append("jtb.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_m = 2560;
    }
}
