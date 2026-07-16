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
            return null;
        }
        return new java.net.Socket(((ib) this).field_a, ((ib) this).field_c);
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_8_0 = 0;
            int stackIn_17_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_15_0 = 0;
            var7 = wizardrun.field_H;
            if (!kk.field_yb) {
              try {
                L0: {
                  var2 = "tuhstatbut";
                  var3 = (String) cl.a(param1, -3264, "getcookies");
                  var4 = tj.a(var3, -22710, ';');
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      L2: {
                        if (param0 == 46) {
                          break L2;
                        } else {
                          field_b = null;
                          break L2;
                        }
                      }
                      break L0;
                    } else {
                      L3: {
                        var6 = var4[var5].indexOf('=');
                        if (-1 < (var6 ^ -1)) {
                          break L3;
                        } else {
                          if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                            stackOut_7_0 = 1;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0 != 0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var2_ref = decompiledCaughtException;
                  break L4;
                }
              }
              L5: {
                if (param1.getParameter("tuhstatbut") == null) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L5;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L5;
                }
              }
              return stackIn_17_0 != 0;
            } else {
              return true;
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
            Object var2 = null;
            boolean discarded$0 = ib.a((byte) -62, (java.applet.Applet) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You have 1 unread message!";
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
