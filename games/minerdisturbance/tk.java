/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk implements uj {
    static boolean field_a;
    static char[] field_e;
    static String field_f;
    static int field_h;
    static int field_g;
    static int[] field_d;
    static String field_b;
    static String field_c;

    final static void b(boolean param0) {
        nk var1 = (nk) (eb.field_f.c(51510));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        eh.a(var1.field_y, var1.field_n, var1.field_s);
        eh.a(var1.field_r, var1.field_o, var1.field_t, var1.field_q);
        var1.field_y = null;
        ah.field_g.a((byte) 91, var1);
        if (!param0) {
          bi var2 = (bi) null;
          tk.a((bi) null, -86, (byte) -122);
        }
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
          String var3 = null;
          String var6 = null;
          String var4 = null;
          String var6Lifetime1;
          String var6Lifetime2;
          String var6Lifetime3;
          String var6Lifetime4;
          try {
            w.field_T = param0;
            try {
              var3 = param1.getParameter("cookieprefix");
              var6 = var3;
              var6Lifetime1 = var3;
              int var5 = 108 / ((60 - param2) / 59);
              var4 = param1.getParameter("cookiehost");
              var6Lifetime2 = var4;
              var6Lifetime3 = var4;
              var6Lifetime4 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (param0.length() == 0) {
                var6Lifetime4 = var6Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              lk.a(param1, "document.cookie=\"" + var6Lifetime4 + "\"", (byte) -106);
            } catch (Throwable throwable) {
            }
            ie.a(param1, true);
          } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "tk.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(bi param0, int param1, byte param2) {
        ld var3 = null;
        try {
          var3 = sn.field_c;
          var3.d((byte) -82, param1);
          var3.c(param0.field_o, 25564);
          if (param2 != -102) {
            tk.b(true);
          }
          var3.b((byte) 124, param0.field_n);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "tk.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 126) {
          return false;
        }
        stackIn_6_0 = (null != ll.field_a) && (ll.field_a.e((byte) 83) != null);
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 != 8225) {
          return;
        }
        field_b = null;
        field_f = null;
    }

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_3_0 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          var2_int = param1.length();
          if (param0 != 732) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(97 + var5 - 65);
            } else if ((97 > var5 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_22_0 = new String(var8);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("tk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void a(boolean param0) {
        if (param0) {
          return;
        }
        tb.field_a = 1;
        gd.field_x = 3;
    }

    final static ud[] a(int param0, ld param1) {
        ud[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ud[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ud var7 = null;
        int var7_int = 0;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        try {
          var2_int = param1.c((byte) -104, 8);
          if (var2_int > 0) {
            return null;
          }
          var3 = param1.c((byte) -122, 12);
          var4 = new ud[var3];
          var5 = 0;
          var6 = -77 % ((param0 - 67) / 45);
          while (var5 < var3) {
            if (ql.a(param1, (byte) 100)) {
              var7 = new ud();
              param1.c((byte) -95, 24);
              param1.c((byte) -81, 24);
              var7.field_d = param1.c((byte) -99, 24);
              param1.c((byte) -72, 9);
              param1.c((byte) -83, 12);
              param1.c((byte) -68, 12);
              param1.c((byte) -126, 12);
              var4[var5] = var7;
            } else {
              var7_int = param1.c((byte) -110, ol.a(var5 - 1, 8));
              var4[var5] = var4[var7_int];
            }
            var5++;
          }
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("tk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final String a(byte param0) {
        int var2 = 70 % ((param0 + 33) / 62);
        return "Make Ore Effluvium";
    }

    static {
        field_e = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_f = "Cancel";
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = "Password: ";
        field_g = 64;
    }
}
