/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ib {
    static String field_d;
    String field_a;
    int field_c;
    static String field_b;

    abstract java.net.Socket a(byte param0) throws IOException;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != -14394) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_a, this.field_c);
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_21_0 = false;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref2 = null;
          var7 = wizardrun.field_H;
          try {
            if (kk.field_yb) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (cl.a(param1, -3264, "getcookies"));
              var4 = tj.a(var3, -22710, ';');
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
              if (param0 != 46) {
                field_b = (String) null;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = decompiledCaughtException;
            }
            stackIn_21_0 = (param1.getParameter("tuhstatbut") != null);
            return stackIn_21_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var2_ref;
            stackIn_24_1 = new StringBuilder().append("ib.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 != -64) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          ib.a((byte) -62, (java.applet.Applet) null);
        }
    }

    static {
        field_d = "You have 1 unread message!";
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
