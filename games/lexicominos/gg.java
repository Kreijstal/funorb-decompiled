/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static dg field_b;
    static sh field_d;
    static db[] field_a;
    static String field_c;

    public static void a(boolean param0) {
        if (param0) {
          field_c = null;
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        }
        gg.a(true);
        field_c = null;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static void a(boolean param0, java.applet.Applet param1, String param2) {
        try {
          Throwable throwable = null;
          String var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          try {
            ta.field_d = param2;
            try {
              var3 = param1.getParameter("cookieprefix");
              var5 = var3;
              var5Lifetime1 = var3;
              var4 = param1.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var5Lifetime4 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
              if (0 == param2.length()) {
                var5Lifetime4 = var5Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              oa.a("document.cookie=\"" + var5Lifetime4 + "\"", param1, -30196);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              throwable = decompiledCaughtException;
            }
            vg.a(!param0, param1);
            if (param0) {
              return;
            }
            gg.a(false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3_ref;
            stackIn_14_1 = new StringBuilder().append("gg.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param2 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new dg();
        field_c = "Checking";
    }
}
