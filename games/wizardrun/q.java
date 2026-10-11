/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    byte[] field_c;
    int field_e;
    byte[] field_f;
    int field_k;
    int field_a;
    int field_d;
    static String field_l;
    static int field_b;
    int field_i;
    int field_h;
    static String field_g;
    int field_j;

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
          return;
        }
        field_l = null;
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          String var6 = null;
          String var7 = null;
          String var8 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            pa.field_f = param2;
            try {
              var7 = param1.getParameter("cookieprefix");
              var5 = var7;
              var5Lifetime1 = var7;
              var4 = param1.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var8 = var7 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var8;
              var5Lifetime5 = var8;
              if (0 != param2.length()) {
                var5Lifetime6 = var8 + "; Expires=" + fc.a((byte) -32, 94608000000L + d.a((byte) 30)) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              cl.a(param1, "document.cookie=\"" + var5Lifetime6 + "\"", (byte) -111);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            jf.a((byte) 76, param1);
            if (param0 == 26017) {
              return;
            }
            var6 = (String) null;
            q.a(-77, (java.applet.Applet) null, (String) null);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var3_ref;
            stackIn_12_1 = new StringBuilder().append("q.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, java.awt.Frame param1, vh param2) {
        jh var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        var4 = wizardrun.field_H;
        try {
          while (true) {
            var3 = param2.a(7, param1);
            while (var3.field_a == 0) {
              tg.a(10L, false);
            }
            if (var3.field_a != 1) {
              tg.a(100L, false);
              continue;
            }
            break;
          }
          param1.setVisible(false);
          var3_int = 79 % ((param0 + 4) / 58);
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("q.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_l = "COMPLETE";
        field_b = 10;
        field_g = "to keep fullscreen or";
    }
}
