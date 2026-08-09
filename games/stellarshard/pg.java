/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends wl {
    static ha field_fb;
    static pb[] field_hb;
    static hl field_cb;
    static volatile int field_gb;
    static String field_eb;
    static pf field_db;

    final void b(rj param0, int param1) {
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
              super.b(param0, param1 ^ 0);
              if (param1 == 23143) {
                break L1;
              } else {
                pg.m(21);
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

            stackIn_5_1 = new StringBuilder().append("pg.I(");

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
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    pg(ei param0, rj param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void m(int param0) {
        field_hb = null;
        field_db = null;
        field_eb = null;
        field_fb = null;
        field_cb = null;
        if (param0 != 7694) {
            pg.m(-42);
        }
    }

    static {
        field_gb = -1;
        field_eb = "Unfortunately we are unable to create an account for you at this time.";
    }
}
