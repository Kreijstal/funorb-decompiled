/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static String field_e;
    static int field_d;
    static int field_g;
    static dl field_a;
    static String field_f;
    static oi field_c;
    static int field_b;

    final static void a(String[] args) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (uo.field_i != null) {
                uo.field_i.field_L.a(args, 0);
                break L1;
              } else {
                break L1;
              }
            }
            if (oh.field_d == null) {
              break L0;
            } else {
              oh.field_d.field_A.a(args, 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("rk.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (args == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 3928 + 41);
        }
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_a = null;
        field_f = null;
    }

    final static void a(int param0) {
        if (!gl.field_c) {
            throw new IllegalStateException();
        }
        jd.field_z = true;
        int discarded$0 = 1;
        fl.a(true);
        hp.field_s = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 54;
        field_e = "Waiting for sound effects";
        field_a = new dl(540, 140);
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_c = new oi();
    }
}
