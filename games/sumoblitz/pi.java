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

    final static void a(byte param0) {
        rd.a(4, -66);
    }

    final static vl a(fs param0, boolean param1, int param2) {
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
        vl stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        vl stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                param0.field_p = 0;
                break L1;
              }
            }
            L2: {
              var3_int = param0.e(-31302);
              var4 = 0;
              if (1 >= var3_int) {
                break L2;
              } else {
                var4 = param0.e(-31302);
                break L2;
              }
            }
            var5 = new jn();
            var6 = param0.e(-31302);
            var7 = 1;
            var8 = 0;
            L3: while (true) {
              if (var6 <= var8) {
                stackOut_14_0 = new vl(var5, var4);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                L4: {
                  var9 = param0.e(-31302);
                  var10 = param0.c(true);
                  var11 = param0.c(true);
                  int discarded$2 = param0.c(true);
                  int discarded$3 = param0.c(true);
                  var12 = 0;
                  if (var3_int > 2) {
                    var12 = param0.c(true);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var13 = cq.a(var12, var10 >> 8, var11 >> 8, var9, (byte) -113);
                  if (var9 != 2) {
                    break L5;
                  } else {
                    var13.field_s = var7;
                    var7++;
                    break L5;
                  }
                }
                var5.a((ms) (Object) var13, (byte) 39);
                var8++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("pi.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 44 + 102 + 41);
        }
        return stackIn_15_0;
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
