/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static int field_e;
    static String field_a;
    static String field_d;
    static String field_b;
    static String field_g;
    static um field_c;
    static id field_f;

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          try {
            qn.field_R = param1;
            try {
              var3 = param2.getParameter("cookieprefix");
              var5 = var3;
              var5Lifetime1 = var3;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var5Lifetime4 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
              if (param0 <= 10) {
                return;
              }
              if (param1.length() == 0) {
                var5Lifetime4 = var5Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              u.a((byte) -81, "document.cookie=\"" + var5Lifetime4 + "\"", param2);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            od.a(false, param2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var3_ref2;
            stackIn_12_1 = new StringBuilder().append("qa.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_f = null;
        field_c = null;
        if (param0 == -1) {
          field_b = null;
          field_a = null;
          return;
        }
        field_a = (String) null;
        field_b = null;
        field_a = null;
    }

    static {
        field_a = "Enter multiplayer lobby";
        field_g = "Withdraw request to join <%0>'s game";
        field_b = "Music: ";
        field_d = "Accept rematch";
    }
}
