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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            ng.a(1, param3 + param4.field_y, param4.field_n, param4.field_i + param1, param4.field_w);
          }
          super.a(param0, param1, param2 ^ 0, param3, param4);
          if (param2 == -15112) {
            return;
          }
          var7 = (cf) null;
          this.a(true, 39, -62, 86, (cf) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("tb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
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
            um.field_c = null;
          }
        }
        if (param0 != 4862) {
          field_s = (ja) null;
        }
    }

    static {
        field_u = true;
    }
}
