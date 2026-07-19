/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends kj {
    String field_gb;
    static qk field_db;
    String field_cb;
    static String field_fb;
    int field_eb;

    aa() {
        super(0L, (kj) null);
    }

    final static void a(ad param0, int param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        w var7 = null;
        w var8 = null;
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
        var6 = Main.field_T;
        try {
          L0: {
            var7 = na.field_r;
            var8 = var7;
            var8.h(param2, 0);
            var8.field_i = var8.field_i + 1;
            var4 = var8.field_i;
            var8.b(-9469, 1);
            var8.e(param0.field_p, param1 + 22742);
            var8.e(param0.field_r, 26040);
            var8.e(param0.field_m, 26040);
            var8.a(-246, param0.field_k);
            var8.a(-246, param0.field_l);
            var8.a(param1 ^ -3096, param0.field_n);
            var8.a(param1 + -3544, param0.field_s);
            var8.b(-9469, param0.field_o.length);
            var5 = 0;
            L1: while (true) {
              if (param0.field_o.length <= var5) {
                L2: {
                  if (param1 == 3298) {
                    break L2;
                  } else {
                    field_fb = (String) null;
                    break L2;
                  }
                }
                discarded$1 = var8.b(var4, (byte) 5);
                var8.f(var8.field_i + -var4, 8049);
                break L0;
              } else {
                var7.a(-246, param0.field_o[var5]);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("aa.H(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(byte param0) {
        field_fb = null;
        field_db = null;
        if (param0 != -49) {
            ad var2 = (ad) null;
            aa.a((ad) null, 19, 27);
        }
    }

    static {
    }
}
