/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static boolean field_d;
    static String field_b;
    static String field_a;
    static volatile int field_c;

    public static void a() {
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (!(11 != fn.field_R)) {
            kn.a(16);
        }
        nn.a(bn.field_a, md.field_v, -122, n.field_Q);
        try {
            bo.a(0, 0, param1, -2);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "kf.A(" + -8129 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static oh[] a(boolean param0, oh[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        oh var3 = null;
        int var4 = 0;
        oh[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        oh[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param1.length) {
                stackOut_4_0 = (oh[]) param1;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3 = param1[var2_int];
                param1[var2_int].field_D = 0;
                var3.field_x = 0;
                param1[var2_int].field_t = param1[var2_int].field_u;
                param1[var2_int].field_F = param1[var2_int].field_E;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("kf.B(").append(1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    final static void a(int param0, int param1, int param2, ve param3, ve param4, int param5) {
        try {
            da.field_e = param1;
            io.field_a = param2;
            hj.field_e = param3;
            mn.field_c = param5;
            hd.field_t = param4;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "kf.C(" + -4968 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Only show game chat from my friends";
        field_b = "Exploiting a bug";
        field_c = 0;
    }
}
