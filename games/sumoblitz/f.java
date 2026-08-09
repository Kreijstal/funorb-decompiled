/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends us {
    int field_u;
    static hr[] field_r;
    float field_v;
    static ts field_t;
    static java.awt.Font field_s;
    float field_q;
    int field_p;
    static boolean field_w;

    public static void d(boolean param0) {
        field_s = null;
        field_r = null;
        if (param0) {
            f.d((byte) 31);
            field_t = null;
            return;
        }
        field_t = null;
    }

    f(fr param0, int param1, int param2, int param3, boolean param4, int[] param5, int param6, int param7) {
        super(param0, param1, 6408, param2, param3, param4, param5, param6, param7, true);
        RuntimeException var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_p = param3;
          this.field_u = param2;
          if (this.field_c != 34037) {
            this.field_q = 1.0f;
            this.field_v = 1.0f;
            return;
          } else {
            this.field_q = (float)param2;
            this.field_v = (float)param3;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var9 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var9);

            stackIn_7_1 = new StringBuilder().append("f.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L0;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L0;
            }
          }
          L1: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    f(fr param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int param7) {
        super(param0, 3553, param1, param4, param5);
        try {
            this.field_u = param2;
            this.field_p = param3;
            this.a(0, param6, param7, 0, param2, 0, 0, true, (byte) -124, param3);
            this.field_q = (float)param2 / (float)param4;
            this.field_v = (float)param3 / (float)param5;
            this.a(false, false, -27365);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    final static boolean d(byte param0) {
        if (param0 != 63) {
            f.e(false);
            return wt.field_i.b((byte) 126);
        }
        return wt.field_i.b((byte) 126);
    }

    f(fr param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, true);
        RuntimeException var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_u = param3;
          this.field_p = param4;
          if (34037 == this.field_c) {
            this.field_v = (float)param4;
            this.field_q = (float)param3;
            return;
          } else {
            this.field_v = 1.0f;
            this.field_q = 1.0f;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var9 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var9);

            stackIn_7_1 = new StringBuilder().append("f.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L0;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L0;
            }
          }
          L1: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param7 + ')');
        }
    }

    final static String e(boolean param0) {
        if (param0) {
            field_s = (java.awt.Font) null;
            return rb.field_c;
        }
        return rb.field_c;
    }

    f(fr param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, 3553, 6408, param3, param4);
        try {
            this.field_p = param2;
            this.field_u = param1;
            this.a(param2, param1, 0, param5, 0, 0, 0, true, true);
            this.field_v = (float)param2 / (float)param4;
            this.field_q = (float)param1 / (float)param3;
            this.a(false, false, -27365);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = false;
        field_t = new ts(7, 0, 1, 1);
    }
}
