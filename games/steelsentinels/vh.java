/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static int field_c;
    static String[] field_d;
    static int field_a;
    static wk[] field_b;

    final static void a(int param0, tc param1, byte param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        kj var8 = null;
        kj var9 = null;
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
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var8 = mm.field_g;
            var9 = var8;
            var9.a(param0, (byte) -117);
            var9.field_p = var9.field_p + 1;
            var4 = var9.field_p;
            var9.a((byte) 120, 1);
            var9.d(param1.field_p, 36);
            var9.d(param1.field_y, 20);
            var9.d(param1.field_o, 29);
            var9.b(true, param1.field_C);
            var9.b(true, param1.field_u);
            var9.b(true, param1.field_t);
            var9.b(true, param1.field_w);
            var9.a((byte) 123, param1.field_q.length);
            var5 = -14 / ((57 - param2) / 48);
            var6 = 0;
            L1: while (true) {
              if (var6 >= param1.field_q.length) {
                discarded$1 = var9.f(-103, var4);
                var9.b((byte) 99, -var4 + var9.field_p);
                break L0;
              } else {
                var8.b(true, param1.field_q[var6]);
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("vh.B(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final static wk[] a(int param0, cm param1, int param2, byte param3) {
        wk[] discarded$2 = null;
        RuntimeException var4 = null;
        cm var5 = null;
        wk[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (wa.a((byte) 30, param0, param2, param1)) {
              L1: {
                if (param3 > 16) {
                  break L1;
                } else {
                  var5 = (cm) null;
                  discarded$2 = vh.a(83, (cm) null, 117, (byte) 119);
                  break L1;
                }
              }
              stackOut_5_0 = gj.b(0);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("vh.C(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        if (param0 >= -1) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (!(!fj.field_e)) {
            return ve.field_b.a(true, ei.field_q, de.field_c);
        }
        if (vb.field_e) {
            return ba.a(112, param3, param0);
        }
        if (hd.b(-3, param3, param0)) {
            return true;
        }
        if (!(!uc.field_g)) {
            return false;
        }
        int var4 = 10 / ((param2 - 40) / 40);
        return he.a((byte) -122, param1, param3);
    }

    static {
        field_a = 200;
        field_c = 34;
    }
}
