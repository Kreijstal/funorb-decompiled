/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static boolean field_d;
    static String field_b;
    static String field_a;
    static volatile int field_c;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 23365) {
            field_a = (String) null;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (!(11 != fn.field_R)) {
            kn.a(param0 ^ -8145);
        }
        nn.a(bn.field_a, md.field_v, param0 + 8007, n.field_Q);
        if (param0 != -8129) {
            return;
        }
        try {
            bo.a(0, 0, param1, -2);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "kf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static oh[] a(boolean param0, oh[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        oh var3 = null;
        int var4 = 0;
        oh[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= param1.length) {
                stackIn_7_0 = (oh[]) (param1);
                break L0;
              } else {
                var3 = param1[var2_int];
                param1[var2_int].field_D = 0;
                var3.field_x = 0;
                param1[var2_int].field_t = param1[var2_int].field_u;
                param1[var2_int].field_F = param1[var2_int].field_E;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("kf.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, int param1, int param2, ve param3, ve param4, int param5) {
        try {
            da.field_e = param1;
            io.field_a = param2;
            if (param0 != -4968) {
                field_c = 80;
            }
            hj.field_e = param3;
            mn.field_c = param5;
            hd.field_t = param4;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "kf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
        field_a = "Only show game chat from my friends";
        field_b = "Exploiting a bug";
        field_c = 0;
    }
}
