/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BrowserUrlLauncher {
    static Sprite field_b;
    static String field_a;
    static String field_d;
    static int field_c;

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 > -124) {
          field_c = 25;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void openExternalUrl(boolean param0, int param1, String param2, java.applet.Applet param3) {
        try {
          int var4_int = 0;
          RuntimeException var4 = null;
          java.net.MalformedURLException var5 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (PlatformTaskDispatcher.field_k.startsWith("win") &&
              FadingDialog.a(99, param2)) {
              return;
            }
            var4_int = 116 / ((63 - param1) / 56);
            try {
              param3.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              ResizableDialog.a((Throwable) null, "MGR1: " + param2, -562);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var4;
            stackIn_10_1 = new StringBuilder().append("sh.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
            if (param3 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
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
