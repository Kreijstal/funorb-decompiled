/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class we {
    static String field_a;
    static long field_c;
    static String field_b;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            kc.a(param1, param0 ^ 1263, "");
            if (param0 != 0) {
                we.a((byte) 108);
            }
            q.a(param1, param0 + -1);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "we.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, na param3) {
        RuntimeException runtimeException = null;
        na var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 64) {
                break L1;
              } else {
                var5 = (na) null;
                we.a(-85, 1, -73, (na) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("we.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(int param0, aj param1, byte param2) {
        la var8 = null;
        la var9 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        try {
            var8 = ra.field_C;
            var9 = var8;
            var9.c(param0, 7);
            var9.field_k = var9.field_k + 1;
            var4 = var9.field_k;
            var9.a(1, (byte) -119);
            var9.b(param1.field_q, (byte) -127);
            var9.b(param1.field_p, (byte) -120);
            var9.b(param1.field_n, (byte) -119);
            var9.b(false, param1.field_r);
            var9.b(false, param1.field_k);
            var9.b(false, param1.field_l);
            var9.b(false, param1.field_i);
            var9.a(param1.field_o.length, (byte) -75);
            int var5 = 18 % ((param2 - 54) / 62);
            for (var6 = 0; param1.field_o.length > var6; var6++) {
                var8.b(false, param1.field_o[var6]);
            }
            var9.a(var4, false);
            var9.a(true, var9.field_k - var4);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "we.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 < 15) {
            field_a = (String) null;
        }
    }

    static {
        field_a = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_b = "Email (Login):";
    }
}
