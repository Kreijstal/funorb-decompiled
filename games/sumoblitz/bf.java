/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static java.awt.Color field_a;
    private int[] field_b;
    static String field_d;
    static String[] field_c;

    public static void b() {
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static void a() {
        if (!ms.field_a) {
            throw new IllegalStateException();
        }
        pu.field_m = true;
        int discarded$0 = 0;
        jv.a(true);
        jv.field_a = 0;
    }

    bf(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if ((param0.length >> 1) + param0.length < var2_int) {
                ((bf) this).field_b = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = param0[var3] & var2_int - 1;
                        L4: while (true) {
                          if (-1 == ((bf) this).field_b[1 + (var4 + var4)]) {
                            ((bf) this).field_b[var4 - -var4] = param0[var3];
                            ((bf) this).field_b[var4 + (var4 - -1)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = -1 + var2_int & var4 - -1;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((bf) this).field_b[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("bf.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = -116 % ((param1 - 32) / 48);
        var3 = -1 + (((bf) this).field_b.length >> 1);
        var5 = var3 & param0;
        L0: while (true) {
          var6 = ((bf) this).field_b[var5 + (var5 - -1)];
          if (var6 == -1) {
            return -1;
          } else {
            if (param0 == ((bf) this).field_b[var5 + var5]) {
              return var6;
            } else {
              var5 = var3 & 1 + var5;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new java.awt.Color(10040319);
    }
}
