/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    static long field_c;
    static ui field_b;
    static ck[] field_a;

    final static boolean a(int param0, int param1, byte param2, int param3) {
        int var4 = 0;
        var4 = 0;
        if (!wc.field_n) {
          if (jh.field_h) {
            return tl.b(15, 102, 13);
          } else {
            if (!dc.a(13, 15, 6774)) {
              if (wl.field_p) {
                return false;
              } else {
                return nm.a(12, 1, 13);
              }
            } else {
              return true;
            }
          }
        } else {
          return bc.field_E.a(wh.field_c, el.field_G, (byte) 126);
        }
    }

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          vh.field_f = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("rm.A(").append(73).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
    }

    final static void a(int param0, ck[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param3 <= 0) {
                  break L1;
                } else {
                  var6_int = param1[0].field_K;
                  var7 = param1[2].field_K;
                  var8 = param1[1].field_K;
                  param1[0].a(param2, param0, param4);
                  param1[2].a(-var7 + param2 - -param3, param0, param4);
                  hk.b(kh.field_e);
                  hk.f(var6_int + param2, param0, -var7 + (param3 + param2), param1[1].field_C + param0);
                  var9 = param2 + var6_int;
                  var10 = param3 + param2 - var7;
                  param2 = var9;
                  L2: while (true) {
                    if (~param2 <= ~var10) {
                      hk.a(kh.field_e);
                      break L0;
                    } else {
                      param1[1].a(param2, param0, param4);
                      param2 = param2 + var8;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6);
            stackOut_10_1 = new StringBuilder().append("rm.B(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + -121 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
    }
}
