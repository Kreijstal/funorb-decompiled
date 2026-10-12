/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static long field_e;
    static int[] field_b;
    static int field_a;
    static String[] field_d;
    static String[] field_c;

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          try {
            al.field_n = param2;
            try {
              var3 = param0.getParameter("cookieprefix");
              var4 = param0.getParameter("cookiehost");
              var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
              if (param1 == param2.length()) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              lj.a((byte) -110, param0, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            ld.a(16058, param0);
          } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        if (null != am.field_z) {
          am.field_z.c((byte) -45);
          am.field_z = null;
        }
        if (param0 > -123) {
          field_b = (int[]) null;
        }
    }

    final static String a(int param0, String param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var4_int = param1.length();
          var5 = param2.length();
          var6 = param3.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = var6 - var5;
          if (var8 != 0) {
            var9_int = 0;
            while (true) {
              var9_int = param1.indexOf(param2, var9_int);
              if (var9_int < 0) {
                break;
              }
              var7 = var7 + var8;
              var9_int = var9_int + var5;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          while (true) {
            var11 = param1.indexOf(param2, var10);
            if (var11 >= 0) {
              discarded$0 = var9.append(param1.substring(var10, var11));
              var10 = var5 + var11;
              discarded$1 = var9.append(param3);
              continue;
            }
            break;
          }
          discarded$2 = var9.append(param1.substring(var10));
          if (param0 == 6609) {
            stackIn_15_0 = var9.toString();
            return stackIn_15_0;
          }
          stackIn_13_0 = (String) null;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("dj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static String[] a(int param0, char param1, String param2) {
        int var8 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        CharSequence var11 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var11 = (CharSequence) ((Object) param2);
          var3_int = rt.a(var11, 0, param1);
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          var7 = -23 / ((param0 + 52) / 48);
          for (var8 = 0; var8 < var3_int; var8++) {
            for (var9 = var6; param1 != param2.charAt(var9); var9++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var9);
            var6 = var9 + 1;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("dj.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static rd a(int param0, int param1, hd param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        rd var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        rd stackIn_5_0 = null;
        rd stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = ug.a(param4, param1, -1, param2, param0, param5);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (rd) (stackIn_2_0);
          }
          var7 = new rd();
          var7.field_c = var8;
          var7.field_c.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param0, param5);
          var7.addFocusListener(var7);
          var7.requestFocus();
          if (param3 <= -15) {
            stackIn_7_0 = var7;
            return stackIn_7_0;
          }
          stackIn_5_0 = (rd) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("dj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 <= 20) {
          String var2 = (String) null;
          dj.a(74, '{', (String) null);
        }
    }

    static {
        field_b = new int[8192];
        field_c = new String[]{"Misthalin", "Kharidian Desert", "Frozen Wastes", "Hallowvale Swamps", "Forinthry Barrens"};
        field_d = new String[]{null, null, null, null, "Riverbed", null, "Sea of Lava", null, null, null, null, null, null, null, null, null};
    }
}
