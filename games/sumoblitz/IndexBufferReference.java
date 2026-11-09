/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IndexBufferReference {
    private IndexBuffer buffer;
    static QuickChatCommand field_a;

    final void close(int guard) {
        if (null != this.buffer) {
          this.buffer.close(guard + 12002);
          if (guard != -1) {
            field_a = (QuickChatCommand) null;
            return;
          }
          return;
        }
        if (guard == -1) {
          return;
        }
        field_a = (QuickChatCommand) null;
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 6) {
          field_a = (QuickChatCommand) null;
        }
    }

    final static boolean hasLegacyStatusFlag(int separator, java.applet.Applet applet) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_17_0 = false;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = Sumoblitz.field_L ? 1 : 0;
          try {
            if (ShaderEffect.field_d) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (BrowserScriptBridge.call(applet, 116, "getcookies"));
              var4 = SocialContact.split((char)separator, var3, -27224);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_17_0 = (applet.getParameter("tuhstatbut") != null);
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref2;
            stackIn_20_1 = new StringBuilder().append("lm.B(").append(separator).append(',');
            if (applet == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    IndexBufferReference(boolean unused) {
    }

    static {
        field_a = new QuickChatCommand(6, 0, 4, 2);
    }
}
