/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pm extends fn {
    private String field_c;
    private long field_e;
    static String field_d;

    eo a(int param0) {
        if (param0 >= -51) {
            field_d = (String) null;
            return ds.field_e;
        }
        return ds.field_e;
    }

    pm(long param0, String param1) {
        try {
            this.field_e = param0;
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "pm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 <= 82) {
            pm.b(122);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(rb param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.b((byte) -102, this.field_e);
              param0.b(0, this.field_c);
              if (param1) {
                break L1;
              } else {
                this.a(-32);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("pm.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_d = "ACHIEVEMENTS THIS GAME";
    }
}
