/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static o field_b;
    static String field_a;
    static String field_d;
    static int field_c;

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 > -124) {
            field_c = 25;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, int param1, String param2, java.applet.Applet param3) {
        try {
            int var4_int = 0;
            RuntimeException var4 = null;
            java.net.MalformedURLException var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            StringBuilder stackIn_13_1 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (!vh.field_k.startsWith("win")) {
                    break L1;
                  } else {
                    if (!tj.a(99, param2)) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                var4_int = 116 / ((63 - param1) / 56);
                try {
                  L2: {
                    param3.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                    break L2;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var5 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  rg.a((Throwable) null, "MGR1: " + param2, -562);
                  return;
                }
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var4);

                stackIn_10_1 = new StringBuilder().append("sh.A(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L3;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

                if (param3 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L4;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L4;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_d = "Connection restored.";
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_c = 0;
    }
}
