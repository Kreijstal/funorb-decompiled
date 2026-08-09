/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends dg {
    int field_A;
    static boolean field_D;
    static String field_B;
    static th field_C;
    static String field_F;

    final void a(int param0, byte param1, int param2, int param3) {
        if (param0 != 0) {
            return;
        }
        if (null == this.field_y) {
            return;
        }
        if (0 == this.field_A) {
            return;
        }
        if (!(this.field_A != 256)) {
            this.field_y.a(param0, (byte) -57, param2 - -this.field_k, this.field_w + param3);
            return;
        }
        pb var5 = new pb(this.field_y.field_p, this.field_y.field_t);
        hj.a(var5, 1);
        this.field_y.a(param0, param1, 0, 0);
        id.b((byte) -58);
        var5.e(param3 + this.field_w, this.field_k + param2, this.field_A);
    }

    public oa() {
        super(0, 0, 0, 0, (uk) null, (lf) null);
        this.field_A = 256;
    }

    oa(rj param0) {
        super(param0.field_w, param0.field_k, param0.field_p, param0.field_t, (uk) null, (lf) null);
        try {
            param0.b(this.field_p, 0, 0, this.field_t, 23987);
            this.field_A = 256;
            this.field_y = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "oa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(rb param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        rb var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var4 = (rb) null;
                oa.a((rb) null, 119, true);
                break L1;
              }
            }
            stackIn_3_0 = param0.c(param1 + -25186, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("oa.K(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void i(int param0) {
        field_B = null;
        field_C = null;
        if (param0 > -68) {
            oa.i(-65);
            field_F = null;
            return;
        }
        field_F = null;
    }

    static {
        field_D = true;
        field_B = "Click";
        field_C = new th();
        field_F = "Connection lost. <%0>";
    }
}
