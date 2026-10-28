/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProgressQuery extends IntrusiveNode {
    int[] progressWords;
    boolean complete;
    static String field_i;
    int campaignId;

    final static String readCookie(byte guard, String name, java.applet.Applet applet) {
        try {
          String stackIn_17_2 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          int var7 = EscapeVector.obfuscationControl;
          try {
            try {
              String var3 = (String) (JavaScriptBridge.callWindowFunction(applet, "getcookies", -29155));
              String[] var4 = ModalPanel.splitString(-128, var3, ';');
              for (int var5 = 0; var4.length > var5; var5++) {
                int var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(name)) {
                  String stackIn_6_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_6_0;
                }
              }
              if (guard <= 78) {
                field_i = (String) null;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var3_ref2 = decompiledCaughtException;
            }
            Object stackIn_13_0 = null;
            return (String) (stackIn_13_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_16_0 = var3_ref;
            StringBuilder stackIn_16_1 = new StringBuilder().append("dc.B(").append(guard).append(',');
            if (name == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
            if (applet == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int ceilDivide(int guard, int divisor, int value) {
        if (guard > -5) {
          return -127;
        }
        int var3 = value / divisor;
        if (value % divisor == 0) {
          return var3;
        }
        var3++;
        return var3;
    }

    final static void drawOutlinedText(byte guard, String text, int x, int y) {
        try {
          ByteStorage.gameFont.drawCenteredAlpha(text, x - 1, -1 + y, 0, -1, 64);
          if (guard < 19) {
            field_i = (String) null;
          }
          ByteStorage.gameFont.drawCenteredAlpha(text, 1 + x, -1 + y, 0, -1, 64);
          ByteStorage.gameFont.drawCenteredAlpha(text, x - 1, 1 + y, 0, -1, 64);
          ByteStorage.gameFont.drawCenteredAlpha(text, 1 + x, 1 + y, 0, -1, 64);
          ByteStorage.gameFont.drawCentered(text, x, y, 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "dc.E(" + guard + ',' + (text != null ? "{...}" : "null") + ',' + x + ',' + y + ')');
        }
    }

    final static int interpolateInt(int end, int duration, int start, int elapsed, int guard) {
        if (guard == 64) {
          return elapsed * (-start + end) / duration + start;
        }
        field_i = (String) null;
        return elapsed * (-start + end) / duration + start;
    }

    ProgressQuery() {
    }

    public static void releaseStatics(boolean guard) {
        field_i = null;
        if (guard) {
          ProgressQuery.releaseStatics(true);
        }
    }

    static {
        field_i = "RIGHT ARROW";
    }
}
