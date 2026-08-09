/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends nr {
    int field_q;
    int field_o;
    float field_r;
    float field_p;

    el(wl param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int param7) {
        super(param0, 3553, param1, param4, param5);
        try {
            this.field_q = param2;
            this.field_o = param3;
            this.a(0, param6, 0, true, 0, -34038, param3, 0, param7, param2);
            this.field_r = (float)param2 / (float)param4;
            this.field_p = (float)param3 / (float)param5;
            this.a(false, 11779, false);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    el(wl param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, 3553, 6408, param3, param4);
        try {
            this.field_o = param2;
            this.field_q = param1;
            this.a(param1, 0, param2, true, 0, param5, 0, (byte) 0, 0);
            this.field_r = (float)param1 / (float)param3;
            this.field_p = (float)param2 / (float)param4;
            this.a(false, 11779, false);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    el(wl param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, true);
        try {
            this.field_o = param4;
            if (this.field_f != 34037) {
                this.field_p = 1.0f;
                this.field_r = 1.0f;
            } else {
                this.field_p = (float)param4;
                this.field_r = (float)param3;
            }
            this.field_q = param3;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    el(wl param0, int param1, int param2, int param3, boolean param4, int[] param5, int param6, int param7) {
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
          this.field_o = param3;
          this.field_q = param2;
          if (-34038 != (this.field_f ^ -1)) {
            this.field_p = 1.0f;
            this.field_r = 1.0f;
            return;
          } else {
            this.field_r = (float)param2;
            this.field_p = (float)param3;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var9 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var9);

            stackIn_7_1 = new StringBuilder().append("el.<init>(");

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
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
    }
}
