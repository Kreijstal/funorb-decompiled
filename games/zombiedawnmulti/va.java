/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static String field_b;
    static int field_a;

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          try {
            if (!go.field_l.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            if (param0 != 9805) {
              field_b = (String) null;
            }
            var3 = 0;
            while (true) {
              if (param1.length() <= var3) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                return true;
              }
              if (var2.indexOf((int) param1.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var2_ref2;
          stackIn_22_1 = new StringBuilder().append("va.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 == 62) {
          kn.a(-1431, true, am.field_a, mc.field_g);
          bl.field_h = true;
          return;
        }
        field_b = (String) null;
        kn.a(-1431, true, am.field_a, mc.field_g);
        bl.field_h = true;
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param0 != -59) {
          va.a((byte) -88);
          return jm.a(param1, -23936, param2, param3);
        }
        return jm.a(param1, -23936, param2, param3);
    }

    public static void a(int param0) {
        if (param0 < 100) {
          va.a((byte) 9, -56, 96, -45);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = "Powerups with this modifier will kill ANYTHING! Try it on Fireball for a show.";
        field_a = 0;
    }
}
