/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tb extends hq {
    static boolean field_u;
    static ja field_v;
    static int[] field_t;
    static ja field_s;

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        RuntimeException var6 = null;
        cf var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                ng.a(1, param3 + param4.field_y, param4.field_n, param4.field_i + param1, param4.field_w);
                break L1;
              } else {
                break L1;
              }
            }
            super.a(param0, param1, param2 ^ 0, param3, param4);
            if (param2 == -15112) {
              break L0;
            } else {
              var7 = (cf) null;
              this.a(true, 39, -62, 86, (cf) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var6);
            stackOut_6_1 = new StringBuilder().append("tb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    tb(int param0) {
        this(ke.field_h, param0);
    }

    public static void c(byte param0) {
        field_v = null;
        field_t = null;
        if (param0 != 109) {
            tb.c((byte) 124);
            field_s = null;
            return;
        }
        field_s = null;
    }

    tb(fm param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_C, -1, 2147483647, false);
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (um.field_c != null) {
          var1 = um.field_c;
          synchronized (var1) {
            L0: {
              um.field_c = null;
              break L0;
            }
          }
          L1: {
            if (param0 == 4862) {
              break L1;
            } else {
              field_s = (ja) null;
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (param0 == 4862) {
              break L2;
            } else {
              field_s = (ja) null;
              break L2;
            }
          }
          return;
        }
    }

    static {
        field_u = true;
    }
}
