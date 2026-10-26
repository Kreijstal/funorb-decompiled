/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static of field_a;
    static int field_c;
    static String field_b;

    final static void a(int param0) {
        SoundPlayback var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        SoundPlayback var1Lifetime1;
        var2 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          um.field_m.h();
          BitmapFont.field_a.h();
          ad.field_U = ad.field_U - 1;
          if (0 == ad.field_U) {
            ad.field_U = 200;
            var1 = (SoundPlayback) (di.field_M.first(268435455));
            while (var1 != null) {
              if (!var1.field_i.isLinked((byte) 93)) {
                var1.unlink(-128);
              }
              var1 = (SoundPlayback) (di.field_M.next((byte) 103));
            }
            if (null != ao.field_c) {
              var1Lifetime1 = (SoundPlayback) (ao.field_c.first(268435455));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_i.isLinked((byte) 105)) {
                  var1Lifetime1.unlink(-123);
                }
                var1Lifetime1 = (SoundPlayback) (ao.field_c.next((byte) 103));
              }
            }
          }
          if (param0 != 200) {
            field_c = -8;
          }
          if (null != mg.field_d) {
            if (mg.field_d.f(32119)) {
              return;
            }
            dt.field_c = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1_ref), "we.C(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
          field_c = -22;
        }
        field_b = null;
        field_a = null;
    }

    final static w a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        w stackIn_11_0 = null;
        w stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = 0;
          while (true) {
            if (var3 >= var2_int) {
              if (param1 < -108) {
                stackIn_13_0 = td.field_d;
                return stackIn_13_0;
              }
              stackIn_11_0 = (w) null;
              return stackIn_11_0;
            }
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_7_0 = null;
          return (w) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("we.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, ll[] param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
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
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param5 == null) {
            return;
          }
          if (param1 > 0 &&
            param0 > 0) {
            if (param5[3] != null) {
              stackIn_10_0 = param5[3].field_v;
            } else {
              stackIn_10_0 = 0;
            }
            var6_int = stackIn_10_0;
            if (null == param5[5]) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = param5[5].field_v;
            }
            var7 = stackIn_13_0;
            if (param5[1] != null) {
              stackIn_16_0 = param5[1].field_q;
            } else {
              stackIn_16_0 = 0;
            }
            var8 = stackIn_16_0;
            if (null != param5[7]) {
              stackIn_19_0 = param5[7].field_q;
            } else {
              stackIn_19_0 = 0;
            }
            var9 = stackIn_19_0;
            var10 = param2 + param1;
            var11 = param0 + param4;
            var12 = var6_int + param2;
            var13 = var10 - var7;
            var14 = param4 + var8;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param1 * var6_int / (var6_int + var7) + param2;
              var16 = param1 * var6_int / (var6_int + var7) + param2;
            }
            var18 = var14;
            var19 = var15;
            vp.b(jo.field_j);
            if (var18 > var19) {
              var19 = var8 * param0 / (var9 + var8) + param4;
              var18 = var8 * param0 / (var9 + var8) + param4;
            }
            if (param5[0] != null) {
              vp.a(param2, param4, var16, var18);
              param5[0].b(param2, param4);
              vp.a(jo.field_j);
            }
            if (param5[2] != null) {
              vp.a(var17, param4, var10, var18);
              param5[2].b(var13, param4);
              vp.a(jo.field_j);
            }
            if (param5[6] != null) {
              vp.a(param2, var19, var16, var11);
              param5[6].b(param2, var15);
              vp.a(jo.field_j);
            }
            if (param5[8] != null) {
              vp.a(var17, var19, var10, var11);
              param5[8].b(var13, var15);
              vp.a(jo.field_j);
            }
            if (param5[1] != null &&
              0 != param5[1].field_v) {
              vp.a(var16, param4, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param5[1].field_v) {
                param5[1].b(var20, param4);
              }
              vp.a(jo.field_j);
            }
            if (param5[7] != null &&
              param5[7].field_v != 0) {
              vp.a(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param5[7].field_v) {
                param5[7].b(var20Lifetime1, var15);
              }
              vp.a(jo.field_j);
            }
            if (null != param5[3] &&
              param5[3].field_q != 0) {
              vp.a(param2, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param5[3].field_q) {
                param5[3].b(param2, var20Lifetime2);
              }
              vp.a(jo.field_j);
            }
            if (null != param5[5] &&
              param5[5].field_q != 0) {
              vp.a(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param5[5].field_q) {
                param5[5].b(var13, var20Lifetime3);
              }
              vp.a(jo.field_j);
            }
            if (param5[4] != null &&
              param5[4].field_v != 0 &&
              param5[4].field_q != 0) {
              vp.a(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var20Lifetime4 < var15; var20Lifetime4 = var20Lifetime4 + param5[4].field_q) {
                for (var21 = var12; var21 < var13; var21 = var21 + param5[4].field_v) {
                  param5[4].b(var21, var20Lifetime4);
                }
              }
              vp.a(jo.field_j);
            }
            if (param3) {
              field_a = (of) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_76_0 = var6;
          stackIn_76_1 = new StringBuilder().append("we.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    static {
        field_a = new of();
        field_b = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = -1;
    }
}
