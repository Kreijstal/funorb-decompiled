/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class be extends li {
    boolean field_p;
    static int field_t;
    static fe field_n;
    int field_r;
    static boolean field_q;
    static String field_s;
    int[] field_o;

    final static void a(int param0, er[] param1, int param2, int param3, int param4, int param5, int param6, int param7, er[] param8, int param9, er[] param10, int param11, cc param12, int param13, int param14) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        int var17 = 0;
        try {
          var15_int = param12.field_t + param12.field_M;
          var16 = param12.field_t;
          var17 = 107 / ((-4 - param0) / 47);
          c.a(param11, var16, var15_int, param3, param1, param9, param12, param4, param13, param5, param8, param14, param6, param10, param12, var16, 20412, param7, var15_int, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_4_0 = var15;
          stackIn_4_1 = new StringBuilder().append("be.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != 83) {
          return -74;
        }
        return mj.a(-109, in.field_b, param0);
    }

    public static void a(int param0) {
        field_n = null;
        field_s = null;
        if (param0 != -1) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          be.a((String) null, 38, (java.applet.Applet) null);
        }
    }

    be() {
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            v.field_b = param0;
            try {
              var6 = param2.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param1 == ~param0.length()) {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var5Lifetime6 = var7 + "; Expires=" + uh.a((byte) -66, 94608000000L + gk.a(53)) + "; Max-Age=" + 94608000L;
              }
              je.a(param2, "document.cookie=\"" + var5Lifetime6 + "\"", (byte) 124);
            } catch (Throwable throwable) {
            }
            op.a(~param1, param2);
          } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "be.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_s = "Hide players in <%0>'s game";
    }
}
