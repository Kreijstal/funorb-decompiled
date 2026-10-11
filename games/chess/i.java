/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static String field_c;
    static String field_a;
    static String field_b;

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Chess.field_G;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          for (var4 = param0; var4 < var2_int; var4++) {
            var3[-var4 + var2_int - 1] = param1.charAt(var4);
          }
          stackIn_5_0 = new String(var3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("i.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          String var2 = (String) null;
          i.a(-53, (String) null);
        }
        field_a = null;
        field_c = null;
    }

    final static void a(boolean param0, String param1, int param2, String param3) {
        try {
          gg.field_a = param3;
          pi.field_a = param1;
          qd.a(-1845, ii.field_T, param0);
          if (param2 != -5136) {
            String var5 = (String) null;
            i.a(true, (String) null, 91, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "i.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "If you do nothing the game will revert to normal view in <%0> second.";
        field_b = "<%0> is already on your friend list.";
    }
}
