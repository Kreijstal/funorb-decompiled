/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static int field_c;
    static String field_b;
    static boolean field_a;

    public static void b() {
        field_b = null;
    }

    final static void a() {
        mi.k(-32460, 2);
    }

    final static uq[] a(byte param0, mi param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        uq[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        uq var6 = null;
        int var7 = 0;
        uq[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        uq[] stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.c((byte) -107, 8);
            if (var2_int <= 0) {
              var3 = param1.c((byte) -96, 12);
              var4 = new uq[var3];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var3) {
                  stackOut_12_0 = (uq[]) var4;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  L2: {
                    int discarded$20 = -31980;
                    if (id.a(param1)) {
                      var6 = new uq();
                      int discarded$21 = param1.c((byte) -124, 24);
                      int discarded$22 = param1.c((byte) -121, 24);
                      var6.field_e = param1.c((byte) -120, 24);
                      int discarded$23 = param1.c((byte) -115, 9);
                      int discarded$24 = param1.c((byte) -105, 12);
                      int discarded$25 = param1.c((byte) -119, 12);
                      int discarded$26 = param1.c((byte) -106, 12);
                      var4[var5] = var6;
                      break L2;
                    } else {
                      var6_int = param1.c((byte) -128, ee.a(-1 + var5, 96));
                      var4[var5] = var4[var6_int];
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("ng.B(").append(-108).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = Vertigo2.field_L ? 1 : 0;
            if (ap.field_e > param1) {
              break L1;
            } else {
              if (param3 > ib.field_a) {
                break L1;
              } else {
                if (param6 < ua.field_e) {
                  break L1;
                } else {
                  if (param2 <= cj.field_D) {
                    if (param4 != 1) {
                      nb.a(param6, param3, param0, (byte) -92, param4, param2, param1);
                      break L0;
                    } else {
                      f.a(param3, param1, param0, param6, (byte) -8, param2);
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (param4 == 1) {
            dm.a(0, param1, param6, param3, param0, param2);
            break L0;
          } else {
            int discarded$12 = 0;
            bs.a(param4, param3, param0, param2, param1, param6);
            break L0;
          }
        }
        var7 = 116 / ((25 - param5) / 35);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Only show game chat from my friends";
    }
}
