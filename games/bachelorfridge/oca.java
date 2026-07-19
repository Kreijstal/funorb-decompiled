/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oca extends jm {
    private int field_q;
    static String field_p;
    static sna field_n;
    static String field_o;
    private int field_m;

    final void a(boolean param0, op param1) {
        RuntimeException runtimeException = null;
        lu var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.field_a[this.field_q][this.field_m].field_m = true;
              if (!param0) {
                break L1;
              } else {
                var4 = (lu) null;
                this.b((lu) null, (byte) 17);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("oca.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void b(lu param0, byte param1) {
        try {
            param0.d(this.field_q, 0);
            param0.d(this.field_m, 0);
            int var3_int = 118 % ((37 - param1) / 38);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "oca.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(ub param0, int param1) {
        if (param1 > -2) {
            return;
        }
        try {
            param0.field_o.b(30996, this.field_q, this.field_m);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "oca.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 > -20) {
          oca.d((byte) 63);
          field_o = null;
          field_n = null;
          field_p = null;
          return;
        } else {
          field_o = null;
          field_n = null;
          field_p = null;
          return;
        }
    }

    oca(int param0, int param1) {
        this.field_m = param1;
        this.field_q = param0;
        this.field_j = 1;
    }

    oca(lu param0) {
        try {
            this.field_j = 1;
            this.field_q = param0.b(16711935);
            this.field_m = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "oca.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
