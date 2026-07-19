/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends br {
    static String field_f;
    static int field_j;
    int field_h;
    static String field_i;
    int field_g;

    final static ae a(ga param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        fg stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        fg stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = param0.d((byte) 69);
            var3 = param0.g(param1 ^ -31477);
            var4 = new int[var3];
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var3 <= var5) {
                  if (param1 == -114) {
                    break L2;
                  } else {
                    qk.b(true);
                    break L2;
                  }
                } else {
                  var4[var5] = param0.d((byte) 69);
                  var5++;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              stackOut_8_0 = new fg(var2_int, var4);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("qk.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return (ae) ((Object) stackIn_9_0);
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_f = null;
        field_i = null;
    }

    final static void a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int discarded$0 = 0;
        try {
            var2_int = bd.field_g;
            var3 = bo.field_d;
            var4 = vo.field_m.field_yb.b(param0, 500);
            var5 = vo.field_m.field_yb.c(param0, 500) + 6;
            var6 = 2 + var4 * jk.field_f;
            var7 = qp.a(var2_int, (byte) 126, var5, 12);
            var8 = br.a(true, var3, 20, var6);
            oo.a(var7, var8, var5, var6, 0);
            oo.e(var7 + 1, var8 - -1, -2 + var5, var6 + -2, 16777088);
            if (param1 > -109) {
                field_j = 23;
            }
            discarded$0 = vo.field_m.field_yb.a(param0, var7 + 3, -vo.field_m.field_yb.field_C + 1 + (var8 + jp.field_f), 500, 1000, 0, -1, 0, 0, jk.field_f);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final qk a(int param0) {
        if (param0 != 30544) {
            return (qk) null;
        }
        return new qk(this.field_g, this.field_h);
    }

    qk(int param0, int param1) {
        this.field_h = param1;
        this.field_g = param0;
    }

    static {
        field_f = "Start Game";
        field_i = "<%0> has dropped out.";
    }
}
