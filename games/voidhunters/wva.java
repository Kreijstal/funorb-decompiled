/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wva implements dja {
    static String field_a;
    static int field_b;

    final static void b(byte param0) {
        if (di.field_l != null) {
          di.field_l.a(-32339, dpa.field_p);
        }
        int var1 = -93 % ((param0 + 11) / 55);
    }

    public static void a(int param0) {
        int var1 = 101 % ((-83 - param0) / 37);
        field_a = null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          field_b = 111;
        }
        return (tv[]) ((Object) new qqb[param1]);
    }

    final static void b(int param0, int param1) {
        if (param1 != 22681) {
          wva.b((byte) 45);
        }
        faa var2 = dpa.field_p;
        var2.h(24335, param0);
        var2.c(0, 1);
        var2.c(0, 0);
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
          String var3 = null;
          String var5 = null;
          String var4 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          try {
            if (param1 != 56) {
              field_a = (String) null;
            }
            cta.field_p = param2;
            try {
              var3 = param0.getParameter("cookieprefix");
              var5 = var3;
              var5Lifetime1 = var3;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var5Lifetime4 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
              if (param2.length() == 0) {
                var5Lifetime4 = var5Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              ia.a((byte) -115, param0, "document.cookie=\"" + var5Lifetime4 + "\"");
            } catch (Throwable throwable) {
            }
            hg.a(-102, param0);
          } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "wva.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final tv a(byte param0) {
        int var2 = -42 % ((-64 - param0) / 50);
        return (tv) ((Object) new qqb());
    }

    final static int a(int param0, String[] param1, int param2, String param3, no param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = VoidHunters.field_G;
        try {
          var5_int = param4.b(param3);
          if (param0 >= var5_int &&
            param3.indexOf("<br>") == -1) {
            param1[0] = param3;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          var6 = (-1 + (param0 + var5_int)) / param0;
          param0 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = param2;
          var8 = param3.length();
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param3.charAt(var9);
            if (32 == var10 ||
              var10 == 45) {
              var11 = param3.substring(var7, var9 + 1).trim();
              var12 = param4.b(var11);
              if (var12 >= param0) {
                var7 = var9 + 1;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param1[incrementValue$1] = var11;
              }
            }
            if (62 == var10 &&
              param3.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param1[incrementValue$2] = param3.substring(var7, var9 - 3).trim();
              var7 = var9 + 1;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param1[incrementValue$0] = param3.substring(var7, var8).trim();
          }
          stackIn_26_0 = var6Lifetime1;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("wva.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    static {
        field_a = "Best";
        field_b = 0;
    }
}
