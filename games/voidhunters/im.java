/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im extends aia {
    float field_o;
    static faa field_q;
    int field_p;
    int field_m;
    float field_n;
    boolean field_l;

    im(qfa param0, int param1, int param2, int param3, boolean param4, int[] param5, int param6, int param7) {
        super(param0, param1, 6408, param2, param3, param4, param5, param6, param7, true);
        try {
            this.field_m = param2;
            if (this.field_b == 34037) {
                this.field_o = (float)param3;
                this.field_n = (float)param2;
                this.field_l = false;
            } else {
                this.field_l = true;
                this.field_n = 1.0f;
                this.field_o = 1.0f;
            }
            this.field_p = param3;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    im(qfa param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int param7) {
        super(param0, 3553, param1, param4, param5);
        try {
            this.field_p = param3;
            this.field_m = param2;
            this.a(param3, param7, 0, param6, 0, param2, 0, 0, true, 1);
            this.field_o = (float)param3 / (float)param5;
            this.field_l = false;
            this.field_n = (float)param2 / (float)param4;
            this.a(false, false, 10497);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    im(qfa param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, true);
        try {
            this.field_m = param3;
            if (-34038 == (this.field_b ^ -1)) {
                this.field_o = (float)param4;
                this.field_l = false;
                this.field_n = (float)param3;
            } else {
                this.field_n = 1.0f;
                this.field_o = 1.0f;
                this.field_l = true;
            }
            this.field_p = param4;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    im(qfa param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, 3553, 6408, param3, param4);
        try {
            this.field_m = param1;
            this.field_p = param2;
            this.a((byte) 32, 0, param1, 0, param2, 0, 0, true, param5);
            this.field_n = (float)param1 / (float)param3;
            this.field_o = (float)param2 / (float)param4;
            this.field_l = false;
            this.a(false, false, 10497);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    im(qfa param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3, param4);
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          this.field_m = param3;
          this.field_p = param4;
          if ((this.field_b ^ -1) != -34038) {
            this.field_n = 1.0f;
            this.field_l = true;
            this.field_o = 1.0f;
            return;
          } else {
            this.field_l = false;
            this.field_o = (float)param4;
            this.field_n = (float)param3;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var6);
            stackOut_5_1 = new StringBuilder().append("im.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 != 105) {
            return;
        }
        field_q = null;
    }

    im(qfa param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, 3553, param1, param4, param5);
        try {
            this.field_o = (float)param3 / (float)param5;
            this.field_n = (float)param2 / (float)param4;
            this.field_p = param3;
            this.field_m = param2;
            this.field_l = false;
            this.a(false, false, 10497);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
