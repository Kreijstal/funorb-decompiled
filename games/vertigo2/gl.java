/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    int field_c;
    static boolean field_o;
    int field_j;
    int field_h;
    int field_n;
    int field_d;
    static String field_a;
    byte[] field_e;
    int field_b;
    static mp field_i;
    static int field_l;
    static String[] field_p;
    byte[] field_g;
    static boolean field_k;
    static String field_m;
    int field_f;

    final static void a(int param0, long param1, java.applet.Applet param2, String param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param2.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              if (param0 != -11) {
                field_o = false;
              }
              var9 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param1 >= 0L) {
                var7Lifetime4 = var9 + "; Expires=" + uh.a((byte) -66, param1 * 1000L + gk.a(param0 ^ -95)) + "; Max-Age=" + param1;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              je.a(param2, "document.cookie=\"" + var7Lifetime4 + "\"", (byte) 124);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("gl.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        kg.c((byte) 76);
        if (param0 == 26780) {
          nn.a(1, ia.field_G, r.field_f, re.field_k, kb.field_d[0].field_x, nl.field_k);
          return;
        }
        field_o = false;
        nn.a(1, ia.field_G, r.field_f, re.field_k, kb.field_d[0].field_x, nl.field_k);
    }

    final static String a(int param0, boolean param1, boolean param2, int param3) {
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var12 = null;
        int var13 = Vertigo2.field_L ? 1 : 0;
        int var4 = param3 % 50;
        String var9Lifetime1;
        String var10Lifetime1;
        String var10Lifetime2;
        String var12Lifetime1;
        String var12Lifetime2;
        String var12Lifetime3;
        String var12Lifetime4;
        String var12Lifetime5;
        String var12Lifetime6;
        String var12Lifetime7;
        String var9Lifetime2;
        String var10Lifetime1Lifetime1;
        String var12Lifetime1Lifetime1;
        var4 = var4 * 2;
        int var5 = param3 / 50;
        int var6 = var5 / 60;
        var5 = var5 % 60;
        int var7 = var6 / 60;
        if (param0 >= -26) {
          return (String) null;
        }
        var6 = var6 % 60;
        if (10 <= var4) {
          var8 = Integer.toString(var4);
        } else {
          var8 = "0" + var4;
          var9 = var8;
          var10 = var9;
          var9Lifetime2 = var8;
        }
        if (var5 < 10) {
          var9Lifetime1 = "0" + var5;
        } else {
          var9Lifetime1 = Integer.toString(var5);
          var10Lifetime1 = var9Lifetime1;
          var12 = var10Lifetime1;
          var10Lifetime1Lifetime1 = var9Lifetime1;
        }
        if (10 <= var6) {
          var10Lifetime2 = Integer.toString(var6);
        } else {
          var10Lifetime2 = "0" + var6;
          var12Lifetime1 = var10Lifetime2;
          var12Lifetime1Lifetime1 = var10Lifetime2;
        }
        String var11 = Integer.toString(var7);
        var12Lifetime2 = var11;
        var12Lifetime3 = var11;
        var12Lifetime4 = "";
        if (param2) {
          var12Lifetime5 = var11 + ":" + var10Lifetime2 + ":" + var9Lifetime1;
          if (param1) {
            var12Lifetime5 = var12Lifetime5 + "." + var8;
          }
          return var12Lifetime5;
        }
        if (var7 <= 0) {
          var12Lifetime6 = var10Lifetime2 + ":" + var9Lifetime1;
          if (param1) {
            var12Lifetime6 = var12Lifetime6 + "." + var8;
          }
          return var12Lifetime6;
        }
        var12Lifetime7 = var11 + ":" + var10Lifetime2 + ":" + var9Lifetime1;
        if (param1) {
          var12Lifetime7 = var12Lifetime7 + "." + var8;
        }
        return var12Lifetime7;
    }

    public static void a(boolean param0) {
        if (param0) {
          field_i = null;
          field_p = null;
          field_m = null;
          field_a = null;
          return;
        }
        field_i = (mp) null;
        field_i = null;
        field_p = null;
        field_m = null;
        field_a = null;
    }

    static {
        field_o = false;
        field_a = "This entry doesn't match";
        field_m = "Day";
    }
}
