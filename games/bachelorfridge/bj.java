/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends pp {
    int field_i;
    static du field_k;
    static String field_j;
    int field_l;

    final static void a(byte[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            lka.field_E = qs.a(false, new lu(param0));
            uma.field_P = new kga[lka.field_E.length + -1];
            var2_int = 1;
            L1: while (true) {
              if (lka.field_E.length <= var2_int) {
                break L0;
              } else {
                int discarded$6 = -16306;
                var3 = vc.a(var2_int, 0);
                var4 = new int[15];
                var5 = 0;
                L2: while (true) {
                  if (var4.length <= var5) {
                    ql.a(var4, var3, 0);
                    var2_int++;
                    continue L1;
                  } else {
                    var4[var5] = cl.a(var5 - -2, (byte) 107, var2_int);
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("bj.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 22 + 41);
        }
    }

    public static void d() {
        field_k = null;
        field_j = null;
    }

    final void a(lu param0, byte param1) {
        try {
            super.a(param0, (byte) -28);
            er.a(((bj) this).field_h, 122, param0);
            param0.d(((bj) this).field_i, 0);
            int var3_int = -81 / ((34 - param1) / 58);
            param0.d(((bj) this).field_l, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bj.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(aga param0, op param1, int param2) {
        if (param2 != 12) {
            field_k = null;
        }
        aga var5 = ((bj) this).field_h.a(param2 ^ 30, param1);
        aga var4 = var5;
        if (!(null == param1.field_a[((bj) this).field_i][((bj) this).field_l].field_l)) {
            return;
        }
        try {
            param1.field_a[var5.field_x][var5.field_J].field_l = null;
            var4.field_J = ((bj) this).field_l;
            var4.field_x = ((bj) this).field_i;
            param1.field_a[((bj) this).field_i][((bj) this).field_l].field_l = var4;
            var4.f(32);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bj.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    bj(nq param0, int param1, int param2) {
        try {
            ((bj) this).field_h = param0;
            ((bj) this).field_i = param1;
            ((bj) this).field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new du(2, 4, 4, 0);
        field_j = "***Target blocked!***";
    }
}
