/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static String field_b;
    static int field_d;
    static int[] field_a;
    static String field_c;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 < 44) {
          field_d = -70;
        }
    }

    final static void a(pm param0, pm param1, byte param2) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        int var7 = 0;
        double var8 = 0.0;
        double var10 = 0.0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_double = param1.field_E - param0.field_E;
          var5 = -param0.field_t + param1.field_t;
          var7 = 50 / ((param2 - 6) / 56);
          var8 = -param0.field_D + param1.field_D;
          var10 = var5 * var5 + var3_double * var3_double + var8 * var8;
          if (!((param1.field_C + param0.field_C) * (param1.field_C + param0.field_C) > var10)) {
            return;
          }
          param0.a(param1, -88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gb.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          jc.field_g = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          if (param0 != -94) {
            field_a = (int[]) null;
          }
          kn.a(124, param1, var4, var3, var2);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "gb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Wing pod";
        field_a = new int[10];
        field_d = 5;
        field_c = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
