/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class sk {
    static long field_h;
    static co field_a;
    static String field_d;
    static int field_e;
    static String field_b;
    static String field_g;
    static String field_c;
    static String field_i;
    static qb[] field_f;

    final static String a(int param0) {
        RuntimeException var1 = null;
        String stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_10_0 = null;
        try {
          L0: {
            L1: {
              if (oh.field_i) {
                break L1;
              } else {
                if (~oa.field_e < ~jh.field_f) {
                  break L1;
                } else {
                  if (~(oa.field_e - -qc.field_e) >= ~jh.field_f) {
                    break L1;
                  } else {
                    stackOut_7_0 = cb.field_c;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
            }
            if (param0 == -14150) {
              stackOut_12_0 = null;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_10_0 = null;
              stackIn_11_0 = stackOut_10_0;
              return (String) (Object) stackIn_11_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "sk.C(" + param0 + ')');
        }
        return (String) (Object) stackIn_13_0;
    }

    final static void a(ec param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              mj.field_r = param2;
              if (param1 == -28995) {
                break L1;
              } else {
                String discarded$2 = sk.a(-70);
                break L1;
              }
            }
            ol.field_f = param0;
            tg.field_d = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("sk.B(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        try {
            field_i = null;
            field_a = null;
            field_c = null;
            field_d = null;
            field_b = null;
            field_g = null;
            int var1_int = 43 % ((param0 - 46) / 42);
            field_f = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "sk.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You can spectate this game";
        field_a = new co();
        field_b = "Retry";
        field_i = "You cannot get damaged in this arena, so select the spell again and try to shoot the target. Remember to hold down the mouse button to increase the velocity of your attack.";
        field_g = "You have <%0> unread messages!";
        field_c = "<br><br>Press 'Enter' to continue";
    }
}
