/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static jn field_a;
    private String field_e;
    static ri[] field_c;
    static int field_b;
    static int field_d;
    static qr field_f;

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        if (param0 != 0) {
            jj.a(-108);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -2183) {
                break L1;
              } else {
                field_f = (qr) null;
                break L1;
              }
            }
            stackIn_3_0 = this.field_e.equals(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jj.A(");

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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final void a(boolean param0, java.applet.Applet param1) {
        try {
            gj.a(31536000L, param1, param0, this.field_e, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    jj(String param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new jn();
        field_b = 0;
        field_d = 0;
        field_f = new qr();
    }
}
