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
        if (param0 > -86) {
            field_e = -49;
        }
    }

    final static vl a(fs param0, boolean param1, int param2) {
        int discarded$2 = 0;
        int discarded$3 = 0;
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
        vl stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        vl stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
            L3: {
              var5 = new jn();
              if (param2 > 50) {
                break L3;
              } else {
                pi.a(116);
                break L3;
              }
            }
            var6 = param0.e(-31302);
            var7 = 1;
            var8 = 0;
            L4: while (true) {
              L5: {
                if (var6 <= var8) {
                  break L5;
                } else {
                  L6: {
                    var9 = param0.e(-31302);
                    var10 = param0.c(true);
                    var11 = param0.c(true);
                    discarded$2 = param0.c(true);
                    discarded$3 = param0.c(true);
                    var12 = 0;
                    if ((var3_int ^ -1) < -3) {
                      var12 = param0.c(true);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var13 = cq.a(var12, var10 >> 102900680, var11 >> 1328233288, var9, (byte) -113);
                    if (-3 != (var9 ^ -1)) {
                      break L7;
                    } else {
                      var13.field_s = var7;
                      var7++;
                      break L7;
                    }
                  }
                  var5.a((ms) (var13), (byte) 39);
                  var8++;
                  if (var14 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_15_0 = new vl(var5, var4);
              stackIn_16_0 = stackOut_15_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("pi.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_16_0;
    }

    static {
        field_a = new ph(16);
        field_g = "Password: ";
        field_e = 0;
        field_f = "Your email address is used to identify this account";
    }
}
