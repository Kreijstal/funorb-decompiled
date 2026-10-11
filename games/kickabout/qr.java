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
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Kickabout.field_G;
        try {
          if (param0 <= 31) {
            field_a = (String) null;
          }
          var5 = vu.field_zb;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref), "qr.A(" + param0 + ')');
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 3) {
            stackIn_2_0 = (java.net.URL) null;
            return stackIn_2_0;
          }
          var3 = null;
          var4 = null;
          if (wk.field_b != null &&
            !wk.field_b.equals(param0.getParameter("settings"))) {
            var3 = wk.field_b;
            var4 = var3;
            var4 = var3;
          }
          if (lu.field_t != null &&
            !lu.field_t.equals(param0.getParameter("session"))) {
            var4 = lu.field_t;
          }
          stackIn_11_0 = rt.a(param1, (String) (var4), -1, (String) (var3), false);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("qr.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != -1) {
          field_f = (String) null;
        }
        return (int)((double)((-320 + param0 << 8) / hw.field_i) + hd.field_K);
    }

    final static void a(int param0, iw param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = Kickabout.field_G;
          try {
            var6 = new byte[param0];
            var2 = var6;
            if (pd.field_G != null) {
              try {
                pd.field_G.a((byte) 4, 0L);
                pd.field_G.a(param0 ^ 64, var6);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (0 == var2[var3_int]) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                param1.a(0, 24, param0 ^ 1991220136, var2);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            param1.a(0, 24, param0 ^ 1991220136, var2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("qr.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
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
