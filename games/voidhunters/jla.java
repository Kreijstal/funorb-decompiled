/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jla extends htb {
    static String field_B;

    final void c(int param0, int param1, int param2, int param3) {
        this.field_u = !this.field_u ? true : false;
        super.c(param0, param1, param2, param3);
    }

    private jla(String param0, wwa param1, sba param2) {
        super(param0, param1, param2);
        try {
            this.field_q = msa.field_s.field_d;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 77 % ((param0 - -87) / 33);
        field_B = null;
    }

    private jla(String param0, sba param1) {
        this(param0, msa.field_s.field_a, param1);
        try {
            this.field_q = msa.field_s.field_d;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static dnb a(byte[] param0, byte param1, int param2) {
        dnb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        dnb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new dnb(param0);
            var4 = -111 / ((param1 - -2) / 45);
            ahb.field_o.b(-10258, var3);
            nv.a((byte) -61, var3, param2);
            stackIn_1_0 = (dnb) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("jla.I(");

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
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    jla(String param0, sba param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_u = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_B = "<%0> is not a member, and cannot play with the current options.";
    }
}
