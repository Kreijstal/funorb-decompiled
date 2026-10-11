/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_a;
    int field_c;
    static String field_b;
    int field_e;
    static int field_d;

    final static boolean a(String param0, byte param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          try {
            if (!ej.field_k.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            if (param1 != -5) {
              return false;
            }
            var3 = 0;
            while (true) {
              if (param0.length() <= var3) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                return true;
              }
              if (-1 != var2.indexOf((int) param0.charAt(var3))) {
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
          stackIn_24_0 = var2_ref2;
          stackIn_24_1 = new StringBuilder().append("li.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        int var1 = -88 / ((37 - param0) / 52);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    li(int param0, int param1, int param2, int param3) {
        this.field_c = param3;
        this.field_e = param0;
    }

    static {
        field_a = "Members' Benefits";
        field_b = "Menu";
    }
}
