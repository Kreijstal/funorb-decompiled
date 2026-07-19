/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends oh {
    static String field_m;
    static int field_j;
    ln field_l;
    fs field_k;
    static pf field_h;
    int field_i;

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int incrementValue$5 = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var14 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var10 = new char[param1];
            var14 = var10;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (param1 <= var6) {
                L2: {
                  if (param3 <= -113) {
                    break L2;
                  } else {
                    qi.a(0);
                    break L2;
                  }
                }
                stackOut_15_0 = new String(var14, 0, var5);
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                L3: {
                  var7 = param0[var6 + param2] & 255;
                  if (var7 == 0) {
                    break L3;
                  } else {
                    L4: {
                      if ((var7 ^ -1) > -129) {
                        break L4;
                      } else {
                        if (160 <= var7) {
                          break L4;
                        } else {
                          L5: {
                            var8 = tl.field_p[var7 + -128];
                            if (var8 == 0) {
                              var8 = 63;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        }
                      }
                    }
                    incrementValue$5 = var5;
                    var5++;
                    var10[incrementValue$5] = (char)var7;
                    break L3;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("qi.A(");
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
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    public static void a(int param0) {
        String discarded$0 = null;
        field_m = null;
        field_h = null;
        if (param0 != 0) {
            byte[] var2 = (byte[]) null;
            discarded$0 = qi.a((byte[]) null, 50, -16, 91);
        }
    }

    qi(ln param0, fs param1, int param2) {
        try {
            this.field_k = param1;
            this.field_i = param2;
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_m = "ESC - cancel this line";
    }
}
