/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends vd {
    private int field_w;
    private int field_v;
    static int field_u;

    final static boolean d(byte param0) {
        int var1 = -7 % ((param0 - 76) / 32);
        return !ae.field_b ? true : false;
    }

    b(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3);
        ((b) this).field_w = param4;
        ((b) this).field_v = param5;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((b) this).field_s) {
          var2 = 68 % ((67 - param0) / 47);
          if (0 != ((b) this).field_w) {
            if (16777215 >= ((b) this).field_v) {
              gf.a(((b) this).field_k, ((b) this).field_t, ((b) this).field_m, ((b) this).field_i, ((b) this).field_w, ((b) this).field_v);
              return;
            } else {
              gf.a(((b) this).field_k, ((b) this).field_t, ((b) this).field_m, ((b) this).field_i, ((b) this).field_w, 16777215 & ((b) this).field_v, ((b) this).field_v >> 24);
              return;
            }
          } else {
            if (((b) this).field_v <= 16777215) {
              gf.d(((b) this).field_k, ((b) this).field_t, ((b) this).field_m, ((b) this).field_i, ((b) this).field_v);
              return;
            } else {
              gf.c(((b) this).field_k, ((b) this).field_t, ((b) this).field_m, ((b) this).field_i, 16777215 & ((b) this).field_v, ((b) this).field_v >> 24);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, ob param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 2232) {
              L1: {
                var3_int = param2.length();
                if (var3_int > 255) {
                  var3_int = 255;
                  break L1;
                } else {
                  break L1;
                }
              }
              param1.c(var3_int, (byte) -60);
              var4 = 0;
              L2: while (true) {
                if (var3_int <= var4) {
                  break L0;
                } else {
                  param1.c((int) param2.charAt(var4), (byte) -57);
                  var4++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("b.B(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        ka.a(7321, 50);
    }
}
