/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_a;
    static String field_d;
    static String field_f;
    static String field_c;
    static String field_e;
    static String field_b;

    final static boolean a(int param0) {
        int var1 = 26 % ((-17 - param0) / 52);
        return gi.field_i != null ? true : false;
    }

    final static String a(int param0, byte[] param1, boolean param2, int param3) {
        String discarded$4 = null;
        int incrementValue$5 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
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
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = new char[param0];
              var12 = var13;
              var11 = var12;
              var4 = var11;
              if (!param2) {
                break L1;
              } else {
                var10 = (byte[]) null;
                discarded$4 = oe.a(-96, (byte[]) null, true, 87);
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (var6 >= param0) {
                stackOut_15_0 = new String(var13, 0, var5);
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var7 = 255 & param1[var6 + param3];
                    if (-1 != (var7 ^ -1)) {
                      break L4;
                    } else {
                      if (var9 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var7 < 128) {
                      break L5;
                    } else {
                      if ((var7 ^ -1) <= -161) {
                        break L5;
                      } else {
                        L6: {
                          var8 = vg.field_s[-128 + var7];
                          if (0 != var8) {
                            break L6;
                          } else {
                            var8 = 63;
                            break L6;
                          }
                        }
                        var7 = var8;
                        break L5;
                      }
                    }
                  }
                  incrementValue$5 = var5;
                  var5++;
                  var11[incrementValue$5] = (char)var7;
                  break L3;
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4_ref);
            stackOut_17_1 = new StringBuilder().append("oe.A(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    public static void b(int param0) {
        if (param0 != -9162) {
          field_f = (String) null;
          field_a = null;
          field_d = null;
          field_b = null;
          field_e = null;
          field_f = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_b = null;
          field_e = null;
          field_f = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, int param1, ja[] param2, byte param3) {
        try {
            qf.field_c = new pd(param2);
            if (param3 != -21) {
                field_d = (String) null;
            }
            ic.field_g = param1;
            e.field_a = param0;
            ff.f(-4604);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "oe.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_a = "You can spectate this game";
        field_d = "Shaun";
        field_e = "<%0> has entered a game.";
        field_b = "Quit to website";
    }
}
