/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qr {
    static String field_c;
    static String field_f;
    static int[] field_e;
    static String field_a;
    static String field_d;
    static String field_g;
    static hd[] field_b;

    final static void a(int param0) {
        int var4 = Kickabout.field_G;
        if (param0 <= 31) {
            field_a = null;
        }
        int[] var5 = vu.field_zb;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        while (var2 < var3) {
            int incrementValue$0 = var2;
            var2++;
            var5[incrementValue$0] = 0;
            int incrementValue$1 = var2;
            var2++;
            var5[incrementValue$1] = 0;
            int incrementValue$2 = var2;
            var2++;
            var5[incrementValue$2] = 0;
            int incrementValue$3 = var2;
            var2++;
            var5[incrementValue$3] = 0;
            int incrementValue$4 = var2;
            var2++;
            var5[incrementValue$4] = 0;
            int incrementValue$5 = var2;
            var2++;
            var5[incrementValue$5] = 0;
            int incrementValue$6 = var2;
            var2++;
            var5[incrementValue$6] = 0;
            int incrementValue$7 = var2;
            var2++;
            var5[incrementValue$7] = 0;
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        if (param2 != 3) {
            return null;
        }
        Object var3 = null;
        Object var4 = null;
        if (wk.field_b != null) {
            if (!(wk.field_b.equals((Object) (Object) param0.getParameter("settings")))) {
                var3 = (Object) (Object) wk.field_b;
                var4 = var3;
                var4 = var3;
            }
        }
        if (lu.field_t != null) {
            if (!lu.field_t.equals((Object) (Object) param0.getParameter("session"))) {
                var4 = (Object) (Object) lu.field_t;
            }
        }
        return rt.a(param1, (String) var4, -1, (String) var3, false);
    }

    final static int a(int param0, byte param1) {
        if (param1 != -1) {
            field_f = null;
        }
        return (int)((double)((-320 + param0 << 559870344) / hw.field_i) + hd.field_K);
    }

    final static void a(int param0, iw param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              L1: {
                var5 = Kickabout.field_G;
                var6 = new byte[param0];
                var2 = var6;
                if (pd.field_G == null) {
                  break L1;
                } else {
                  try {
                    L2: {
                      pd.field_G.a((byte) 4, 0L);
                      pd.field_G.a(param0 ^ 64, var6);
                      var3_int = 0;
                      L3: while (true) {
                        L4: {
                          if (var3_int >= 24) {
                            break L4;
                          } else {
                            if (0 == var2[var3_int]) {
                              var3_int++;
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (-25 >= (var3_int ^ -1)) {
                          throw new IOException();
                        } else {
                          param1.a(0, 24, param0 ^ 1991220136, var2);
                          decompiledRegionSelector0 = 0;
                          break L2;
                        }
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      var4 = 0;
                      L6: while (true) {
                        if (-25 >= (var4 ^ -1)) {
                          decompiledRegionSelector0 = 1;
                          break L5;
                        } else {
                          var2[var4] = (byte)-1;
                          var4++;
                          continue L6;
                        }
                      }
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              param1.a(0, 24, param0 ^ 1991220136, var2);
              break L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_g = null;
        field_f = null;
        field_d = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_a = "When EXP reaches 100% you can spend it on a stat point!";
        field_e = new int[3];
        field_d = "<%0> must play 1 more rated game before playing with the current options.";
        field_e[0] = 14;
        field_e[1] = 18;
        field_e[2] = 21;
        field_g = "Tournament Lobby";
    }
}
