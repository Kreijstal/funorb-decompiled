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
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var12 = new char[param1];
            var11 = var12;
            var10 = var11;
            var4 = var10;
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
                stackIn_18_0 = new String(var12, 0, var5);
                break L0;
              } else {
                L3: {
                  var7 = param0[var6 + param2] & 255;
                  if ((var7 ^ -1) == -1) {
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
                    incrementValue$1 = var5;
                    var5++;
                    var10[incrementValue$1] = (char)var7;
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
            var4_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("qi.A(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_18_0;
    }

    public static void a(int param0) {
        field_m = null;
        field_h = null;
        if (param0 != 0) {
            byte[] var2 = (byte[]) null;
            qi.a((byte[]) null, 50, -16, 91);
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
