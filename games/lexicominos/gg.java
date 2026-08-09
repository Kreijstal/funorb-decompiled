/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static dg field_b;
    static sh field_d;
    static db[] field_a;
    static String field_c;

    public static void a(boolean param0) {
        if (!param0) {
          gg.a(true);
          field_c = null;
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1, String param2) {
        try {
            Throwable throwable = null;
            String var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            int stackIn_9_0 = 0;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                ta.field_d = param2;
                try {
                  L1: {
                    L2: {
                      var3 = param1.getParameter("cookieprefix");
                      var5 = var3;
                      var5 = var3;
                      var4 = param1.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                      if (0 != param2.length()) {
                        break L2;
                      } else {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      }
                    }
                    oa.a("document.cookie=\"" + var5 + "\"", param1, -30196);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    throwable = decompiledCaughtException;
                    break L3;
                  }
                }
                L4: {
                  if (param0) {
                    stackIn_9_0 = 0;
                    break L4;
                  } else {
                    stackIn_9_0 = 1;
                    break L4;
                  }
                }
                vg.a(stackIn_9_0 != 0, param1);
                if (param0) {
                  break L0;
                } else {
                  gg.a(false);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_14_0 = (RuntimeException) (var3_ref);

                stackIn_14_1 = new StringBuilder().append("gg.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param2 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L6;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L6;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
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
