/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sm {
    static String field_f;
    static String field_e;
    static cn field_g;
    int field_d;
    static String field_b;
    static String field_a;
    static int field_c;

    final static void a(Throwable param0, int param1, String param2) {
        try {
          qg stackIn_14_0;
          int stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          java.net.URL stackIn_14_4;
          StringBuilder stackIn_14_5;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          String stackIn_15_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          pn var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = DungeonAssault.field_K;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = hc.a(9, param0);
            }
            if (param2 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param2;
            }
            sn.a(11580, var3);
            var7 = eg.a(var3, ":", "%3a", true);
            var8 = eg.a(var7, "@", "%40", true);
            var9 = eg.a(var8, "&", "%26", true);
            var10 = eg.a(var9, "#", "%23", true);
            if (null == ci.field_q) {
              return;
            }
            stackIn_14_0 = kf.field_o;
            stackIn_14_1 = param1 ^ -17;
            stackIn_14_2 = null;
            stackIn_14_3 = null;
            stackIn_14_4 = ci.field_q.getCodeBase();
            stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(wj.field_s).append("&u=");
            if (pe.field_o != null) {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = pe.field_o;
            } else {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = "" + ne.field_g;
            }
            var4 = ((qg) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, ((StringBuilder) (Object) stackIn_14_5).append(stackIn_15_6).append("&v1=").append(qg.field_c).append("&v2=").append(qg.field_p).append("&e=").append(var10).toString()));
            while (var4.field_c == 0) {
              pj.a(0, 1L);
            }
            if (param1 == var4.field_c) {
              var5 = (DataInputStream) (var4.field_f);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            return false;
          }
          if (param1 != null &&
            param1.length() >= wa.field_k) {
            if (param1.length() > md.field_b) {
              return true;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("sm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        if (param0 == -118) {
          field_b = null;
          field_g = null;
          field_f = null;
          return;
        }
        sm.a((byte) 34);
        field_b = null;
        field_g = null;
        field_f = null;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          String var7 = null;
          String var5 = null;
          String var4 = null;
          String var8 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            pa.field_b = param2;
            try {
              var7 = param0.getParameter("cookieprefix");
              var5 = var7;
              var5Lifetime1 = var7;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              if (param1 != 31500) {
                String var6 = (String) null;
                sm.a((Throwable) null, 45, (String) null);
              }
              var8 = var7 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var8;
              var5Lifetime5 = var8;
              var5Lifetime6 = var8;
              if (param2.length() == 0) {
                var5Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              ee.a("document.cookie=\"" + var5Lifetime6 + "\"", (byte) -46, param0);
            } catch (Throwable throwable) {
            }
            lm.a((byte) -106, param0);
          } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "sm.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = "Please enter your age in years";
        field_a = "Hidden Darts";
        field_b = "A very large, wolf-like creature with burning red eyes.";
        field_e = "You woke the sleeping dragon!";
    }
}
