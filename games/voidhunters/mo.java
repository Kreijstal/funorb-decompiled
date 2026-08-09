/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends ub implements ntb {
    String field_i;
    static String field_j;

    public final void a(faa param0, boolean param1) {
        param0.f((byte) -74);
        this.field_i = param0.g(-1609246200);
        if (param1) {
            return;
        }
        try {
            param0.p(-23497);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mo.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    mo() {
    }

    public final void b(byte param0, tv param1) {
        mo var6 = null;
        mo var7 = null;
        try {
            var6 = (mo) ((Object) param1);
            var7 = var6;
            if (param0 <= 54) {
                tv var4 = (tv) null;
                this.b((byte) -13, (tv) null);
            }
            var7.field_i = this.field_i;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mo.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_j = null;
        if (param0 != 46) {
            field_j = (String) null;
        }
    }

    public final void b(faa param0, int param1) {
        param0.r(32712);
        param0.b((byte) 0, this.field_i);
        if (param1 >= -109) {
            return;
        }
        try {
            param0.q(-100);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mo.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    mo(String param0) {
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        mo var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
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
              var4 = 34 / ((param0 - 22) / 59);
              var3 = (mo) ((Object) param1);
              if (var3.field_i.equals(this.field_i)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("mo.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public final void a(tv param0, int param1) {
        mo var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -19) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            L2: {
              var3 = (mo) ((Object) param0);
              var4 = 0;
              if (var3.field_i.equals(this.field_i)) {
                break L2;
              } else {
                iva.a(-6940, "String requeststring has changed. ");
                var4 = 1;
                break L2;
              }
            }
            if (var4 != 0) {
              tfb.a((byte) -116, "This instance of DebugRequest has changed");
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("mo.F(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    static {
        field_j = "Screen Size";
    }
}
