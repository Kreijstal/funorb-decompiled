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
            String var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_21_0 = 0;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref2 = null;
            var7 = wizardrun.field_H;
            try {
              L0: {
                if (!kk.field_yb) {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      var3 = (String) (cl.a(param1, -3264, "getcookies"));
                      var4 = tj.a(var3, -22710, ';');
                      var5 = 0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          L3: {
                            if (param0 == 46) {
                              break L3;
                            } else {
                              field_b = (String) null;
                              break L3;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                              break L4;
                            } else {
                              if (var4[var5].substring(0, var6).trim().equals(var2)) {
                                stackIn_12_0 = 1;
                                decompiledRegionSelector0 = 0;
                                break L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  } else {
                    L6: {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackIn_21_0 = 0;
                        break L6;
                      } else {
                        stackIn_21_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  }
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_24_0 = (RuntimeException) (var2_ref);

                stackIn_24_1 = new StringBuilder().append("ib.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackIn_25_2 = "null";
                  break L7;
                } else {
                  stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackIn_25_2 = "{...}";
                  break L7;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_21_0 != 0;
              } else {
                return stackIn_12_0 != 0;
              }
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
