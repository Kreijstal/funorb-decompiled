/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp {
    static hga field_d;
    static boolean field_a;
    static kv[] field_b;
    static int field_c;

    final static boolean a(int param0, byte param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 99 / ((-16 - param1) / 37);
          stackIn_3_0 = ((param2[param0 >> 5] & 1 << (31 & param0)) != 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hp.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, String param1, int param2) {
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
            nb.field_q = param1;
            try {
              if (param2 != 3) {
                hp.a(106);
              }
              var6 = param0.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param1.length() == 0) {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var5Lifetime6 = var7 + "; Expires=" + km.a(f.b((byte) 73) + 94608000000L, -1) + "; Max-Age=" + 94608000L;
              }
              ac.a("document.cookie=\"" + var5Lifetime6 + "\"", param0, 119);
            } catch (Throwable throwable) {
            }
            eha.a(-123, param0);
          } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hp.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        int var1 = 31 % ((-6 - param0) / 38);
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var3 = (String) null;
            hp.a((java.applet.Applet) null, (String) null, 0);
          }
          stackIn_3_0 = mc.a(false, param0, param1 ^ 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hp.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, kv[] param4, int param5) {
        int var22 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var23 = BachelorFridge.field_y;
        try {
          if (param4 == null) {
            return;
          }
          if (0 < param0 &&
            param3 > 0) {
            if (param4[3] == null) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param4[3].field_n;
            }
            var6_int = stackIn_11_0;
            if (param4[5] == null) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = param4[5].field_n;
            }
            var7 = stackIn_14_0;
            if (null != param4[1]) {
              stackIn_17_0 = param4[1].field_o;
            } else {
              stackIn_17_0 = 0;
            }
            var8 = stackIn_17_0;
            var10 = 6 / ((52 - param2) / 42);
            if (null != param4[7]) {
              stackIn_20_0 = param4[7].field_o;
            } else {
              stackIn_20_0 = 0;
            }
            var9 = stackIn_20_0;
            var11 = param1 + param0;
            var12 = param3 + param5;
            var13 = param1 + var6_int;
            var14 = -var7 + var11;
            var15 = param5 + var8;
            var16 = -var9 + var12;
            var17 = var13;
            var18 = var14;
            if (var18 < var17) {
              var18 = var6_int * param0 / (var7 + var6_int) + param1;
              var17 = var6_int * param0 / (var7 + var6_int) + param1;
            }
            var19 = var15;
            var20 = var16;
            if (var20 < var19) {
              var20 = param5 + var8 * param3 / (var9 + var8);
              var19 = param5 + var8 * param3 / (var9 + var8);
            }
            dg.a(qb.field_m);
            if (param4[0] != null) {
              dg.c(param1, param5, var17, var19);
              param4[0].e(param1, param5);
              dg.b(qb.field_m);
            }
            if (null != param4[2]) {
              dg.c(var18, param5, var11, var19);
              param4[2].e(var14, param5);
              dg.b(qb.field_m);
            }
            if (param4[6] != null) {
              dg.c(param1, var20, var17, var12);
              param4[6].e(param1, var16);
              dg.b(qb.field_m);
            }
            if (param4[8] != null) {
              dg.c(var18, var20, var11, var12);
              param4[8].e(var14, var16);
              dg.b(qb.field_m);
            }
            if (null != param4[1] &&
              param4[1].field_n != 0) {
              dg.c(var17, param5, var18, var19);
              for (var21 = var13; var21 < var14; var21 = var21 + param4[1].field_n) {
                param4[1].e(var21, param5);
              }
              dg.b(qb.field_m);
            }
            if (null != param4[7] &&
              param4[7].field_n != 0) {
              dg.c(var17, var20, var18, var12);
              for (var21Lifetime1 = var13; var21Lifetime1 < var14; var21Lifetime1 = var21Lifetime1 + param4[7].field_n) {
                param4[7].e(var21Lifetime1, var16);
              }
              dg.b(qb.field_m);
            }
            if (param4[3] != null &&
              0 != param4[3].field_o) {
              dg.c(param1, var19, var17, var20);
              for (var21Lifetime2 = var15; var21Lifetime2 < var16; var21Lifetime2 = var21Lifetime2 + param4[3].field_o) {
                param4[3].e(param1, var21Lifetime2);
              }
              dg.b(qb.field_m);
            }
            if (param4[5] != null &&
              0 != param4[5].field_o) {
              dg.c(var18, var19, var11, var20);
              for (var21Lifetime3 = var15; var16 > var21Lifetime3; var21Lifetime3 = var21Lifetime3 + param4[5].field_o) {
                param4[5].e(var14, var21Lifetime3);
              }
              dg.b(qb.field_m);
            }
            if (null != param4[4] &&
              param4[4].field_n != 0) {
              if (0 == param4[4].field_o) {
                return;
              }
              dg.c(var17, var19, var18, var20);
              for (var21Lifetime4 = var15; var16 > var21Lifetime4; var21Lifetime4 = var21Lifetime4 + param4[4].field_o) {
                for (var22 = var13; var14 > var22; var22 = var22 + param4[4].field_n) {
                  param4[4].e(var22, var21Lifetime4);
                }
              }
              dg.b(qb.field_m);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_75_0 = var6;
          stackIn_75_1 = new StringBuilder().append("hp.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_a = true;
    }
}
