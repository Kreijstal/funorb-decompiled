/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static da field_b;
    static String[] field_d;
    static String field_a;
    static String field_c;

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static o a(boolean param0, o param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        o var11 = null;
        o stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        o stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            param1.d();
            var11 = new o(param1.field_p, param1.field_t / 3);
            var4 = 0;
            var5 = 0;
            var6 = param1.field_v;
            var7 = var11.field_v;
            var8 = 0;
            L1: while (true) {
              if (var11.field_t <= var8) {
                var8 = -54 % ((param2 - -21) / 57);
                var11.f();
                stackOut_13_0 = (o) var11;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                var9 = 0;
                L2: while (true) {
                  if (var9 >= var11.field_p) {
                    var5 = var5 - var11.field_p;
                    var9 = 0;
                    L3: while (true) {
                      if (var11.field_p <= var9) {
                        var5 = var5 - var11.field_p;
                        var9 = 0;
                        L4: while (true) {
                          if (var11.field_p <= var9) {
                            var8++;
                            continue L1;
                          } else {
                            int incrementValue$6 = var5;
                            var5++;
                            int incrementValue$7 = var4;
                            var4++;
                            var7[incrementValue$6] = var7[incrementValue$6] + rf.b(20, var6[incrementValue$7], param0, 0);
                            var9++;
                            continue L4;
                          }
                        }
                      } else {
                        int incrementValue$8 = var5;
                        var5++;
                        int incrementValue$9 = var4;
                        var4++;
                        var7[incrementValue$8] = var7[incrementValue$8] + rf.b(20, var6[incrementValue$9], param0, 1);
                        var9++;
                        continue L3;
                      }
                    }
                  } else {
                    int incrementValue$10 = var5;
                    var5++;
                    int incrementValue$11 = var4;
                    var4++;
                    var7[incrementValue$10] = var7[incrementValue$10] + rf.b(20, var6[incrementValue$11], param0, 2);
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("eb.B(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Player Name: ";
        field_d = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_c = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
