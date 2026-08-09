/*
 * Decompiled by CFR-JS 0.4.0.
 */
class e extends bc {
    private String field_c;
    static String field_d;
    private long field_e;
    static la field_b;
    static int field_f;

    public static void b(boolean param0) {
        field_d = null;
        if (!param0) {
            field_d = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final void a(fj param0, byte param1) {
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
              param0.a(118, this.field_e);
              param0.a((byte) 107, this.field_c);
              if (param1 == -71) {
                break L1;
              } else {
                e.b(true);
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

            stackIn_5_1 = new StringBuilder().append("e.F(");

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
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    e(long param0, String param1) {
        try {
            this.field_e = param0;
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "e.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    gq a(boolean param0) {
        if (param0) {
            field_d = (String) null;
            return hg.field_f;
        }
        return hg.field_f;
    }

    static {
        field_d = "This game has been updated! Please reload this page.";
    }
}
