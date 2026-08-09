/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends aa {
    static ia field_cb;
    static int[] field_ab;
    static ei field_Y;
    static t field_db;
    static int field_bb;
    static int field_Z;

    final static kl a(int param0, byte param1, lf param2) {
        RuntimeException var3 = null;
        kl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -112) {
                break L1;
              } else {
                qc.n(52);
                break L1;
              }
            }
            stackIn_3_0 = new kl(param2, pi.field_c * param0 / 1000);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("qc.OA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    qc(ln param0, gm param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void c(gm param0, int param1) {
        try {
            if (param1 != 33) {
                field_db = (t) null;
            }
            super.c(param0, param1 + 0);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "qc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void n(int param0) {
        field_ab = null;
        field_cb = null;
        field_db = null;
        field_Y = null;
        if (param0 != 1269) {
            field_bb = -19;
        }
    }

    static {
        field_Y = new ei();
    }
}
