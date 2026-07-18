/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static ph field_a;
    static hr field_d;
    static String field_g;
    static int field_e;
    static ki field_c;
    static String field_b;
    static String field_f;

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_c = null;
        field_a = null;
        field_f = null;
        if (param0 != 20437) {
          pi.a(-26);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final static void a() {
        rd.a(4, -66);
    }

    final static vl a(fs param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        jn var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        nm var13 = null;
        int var14 = 0;
        vl stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        vl stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param0.e(-31302);
              var4 = 0;
              if (1 >= var3_int) {
                break L1;
              } else {
                var4 = param0.e(-31302);
                break L1;
              }
            }
            var5 = new jn();
            var6 = param0.e(-31302);
            var7 = 1;
            var8 = 0;
            L2: while (true) {
              if (var6 <= var8) {
                stackOut_12_0 = new vl(var5, var4);
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L3: {
                  var9 = param0.e(-31302);
                  var10 = param0.c(true);
                  var11 = param0.c(true);
                  int discarded$3 = param0.c(true);
                  int discarded$4 = param0.c(true);
                  var12 = 0;
                  if (var3_int > 2) {
                    var12 = param0.c(true);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  int discarded$5 = -113;
                  var13 = cq.a(var12, var10 >> 8, var11 >> 8, var9);
                  if (var9 != 2) {
                    break L4;
                  } else {
                    var13.field_s = var7;
                    var7++;
                    break L4;
                  }
                }
                var5.a((ms) (Object) var13, (byte) 39);
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("pi.B(");
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
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + true + ',' + 102 + ')');
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ph(16);
        field_g = "Password: ";
        field_e = 0;
        field_f = "Your email address is used to identify this account";
    }
}
