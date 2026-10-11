/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static NodeDeque field_c;
    static int[] field_a;
    static Projectile field_b;
    static String field_d;

    final static boolean b(int param0) {
        if (param0 > -111) {
          return false;
        }
        return nc.field_q;
    }

    public static void d(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_c = null;
        field_a = null;
    }

    final static dm a(String param0, int param1) {
        RuntimeException var2 = null;
        java.applet.Applet var3 = null;
        dm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -82) {
            var3 = (java.applet.Applet) null;
            ri.a((String) null, (java.applet.Applet) null, 26);
          }
          if (gf.field_a.a((byte) -72) &&
            !param0.equals(gf.field_a.a(true))) {
            gf.field_a = sf.a(param0, 16);
          }
          stackIn_6_0 = gf.field_a;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ri.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean c(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 6995) {
          field_b = (Projectile) null;
        }
        stackIn_6_0 = (uj.field_d >= 10) && (13 <= nj.field_Q);
        return stackIn_6_0;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          java.applet.Applet var6 = null;
          String var7 = null;
          String var8 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            dn.field_Ub = param0;
            try {
              var7 = param1.getParameter("cookieprefix");
              var5 = var7;
              var5Lifetime1 = var7;
              if (param2 < 123) {
                var6 = (java.applet.Applet) null;
                ri.a((String) null, (java.applet.Applet) null, 49);
              }
              var4 = param1.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var8 = var7 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var8;
              var5Lifetime5 = var8;
              if (0 != param0.length()) {
                var5Lifetime6 = var8 + "; Expires=" + mj.b(94608000000L + mm.a(-102), 0) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              hn.a(param1, 27781, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            oh.a(param1, (byte) 117);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref;
            stackIn_13_1 = new StringBuilder().append("ri.B(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 16913) {
          ri.c(-124);
        }
        int var3 = Math.max(param0, (param1 & 16731221) >> 16);
        int var4 = Math.max(param0, 255 & param1 >> 8);
        int var5 = Math.max(param0, 255 & param1);
        param1 = var5 | (var4 << 8 | (param1 & -16777216 | var3 << 16));
        return param1;
    }

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          if (param0 != -1) {
            field_d = (String) null;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var3[-1 + var2_int - var4] = param1.charAt(var4);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ri.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 16731221) {
          return false;
        }
        stackIn_7_0 = (10 <= uj.field_d) && (!mg.field_ac) && (!ud.e(-111));
        return stackIn_7_0;
    }

    final static cc a(long param0, boolean param1) {
        if (param1) {
          return (cc) null;
        }
        return (cc) (t.field_c.a(param0, (byte) 96));
    }

    static {
        field_a = new int[]{2, 20, 21, 6, 37, 45, 5, 13};
        field_c = new NodeDeque();
        field_d = "Spectating";
    }
}
