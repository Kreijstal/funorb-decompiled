/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static String field_a;
    static String field_c;
    static int[] field_d;
    static boolean field_b;
    static String field_e;

    final static void a(int param0, ah param1) {
        oh var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new oh(param1.a("final_frame.jpg", "", true), (java.awt.Component) (Object) uh.field_b);
            var3 = var2.field_u;
            var4 = var2.field_E;
            nm.b((byte) 45);
            a.field_c = new oh(var3, var4 * 3 / 4);
            a.field_c.c();
            var2.b(0, 0);
            h.field_c = new oh(var3, var4 - a.field_c.field_E);
            h.field_c.c();
            var2.b(0, -a.field_c.field_E);
            h.field_c.field_D = a.field_c.field_E;
            dh.a(-581);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "kj.B(" + 3 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(byte param0, CharSequence[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 2;
            int discarded$2 = -2;
            stackOut_0_0 = gh.a(param1, 0, param1.length);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("kj.C(").append(109).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a() {
        pm.field_g = k.a(0);
        ib.field_b = 0;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_b = true;
          field_d = null;
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        sj.field_e = param1;
        hl.field_cb = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "End Game";
        field_c = "You appear to be telling someone your password - please don't!";
        field_e = "This option cannot be combined with the current settings for:  ";
        field_b = true;
    }
}
