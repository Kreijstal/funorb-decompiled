/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static of field_a;
    static int field_c;
    static String field_b;

    final static void a(int param0) {
        int var2 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          um.field_m.h();
          RendererBitmapFont.field_a.h();
          ad.field_U = ad.field_U - 1;
          if (0 == ad.field_U) {
            ad.field_U = 200;
            SoundPlayback var1 = (SoundPlayback) (di.activeSoundPlaybacks.first(268435455));
            while (var1 != null) {
              if (!var1.field_i.isLinked((byte) 93)) {
                var1.unlink(-128);
              }
              var1 = (SoundPlayback) (di.activeSoundPlaybacks.next((byte) 103));
            }
            if (null != ao.field_c) {
              SoundPlayback var1Lifetime1 = (SoundPlayback) (ao.field_c.first(268435455));
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
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
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
        String stackIn_17_2 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var2_int = param0.length();
          int var3 = 0;
          while (true) {
            if (var3 >= var2_int) {
              if (param1 < -108) {
                w stackIn_13_0 = td.field_d;
                return stackIn_13_0;
              }
              w stackIn_11_0 = (w) null;
              return stackIn_11_0;
            }
            int var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          Object stackIn_7_0 = null;
          return (w) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var2;
          StringBuilder stackIn_16_1 = new StringBuilder().append("we.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, Sprite[] param5) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        String stackIn_77_2 = null;
        int var22 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param5 == null) {
            return;
          }
          if (param1 > 0 &&
            param0 > 0) {
            if (param5[3] != null) {
              stackIn_10_0 = param5[3].fullWidth;
            } else {
              stackIn_10_0 = 0;
            }
            int var6_int = stackIn_10_0;
            if (null == param5[5]) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = param5[5].fullWidth;
            }
            int var7 = stackIn_13_0;
            if (param5[1] != null) {
              stackIn_16_0 = param5[1].fullHeight;
            } else {
              stackIn_16_0 = 0;
            }
            int var8 = stackIn_16_0;
            if (null != param5[7]) {
              stackIn_19_0 = param5[7].fullHeight;
            } else {
              stackIn_19_0 = 0;
            }
            int var9 = stackIn_19_0;
            int var10 = param2 + param1;
            int var11 = param0 + param4;
            int var12 = var6_int + param2;
            int var13 = var10 - var7;
            int var14 = param4 + var8;
            int var15 = -var9 + var11;
            int var16 = var12;
            int var17 = var13;
            if (var16 > var17) {
              var17 = param1 * var6_int / (var6_int + var7) + param2;
              var16 = param1 * var6_int / (var6_int + var7) + param2;
            }
            int var18 = var14;
            int var19 = var15;
            SoftwareRasterizer.saveClip(jo.field_j);
            if (var18 > var19) {
              var19 = var8 * param0 / (var9 + var8) + param4;
              var18 = var8 * param0 / (var9 + var8) + param4;
            }
            if (param5[0] != null) {
              SoftwareRasterizer.intersectClip(param2, param4, var16, var18);
              param5[0].b(param2, param4);
              SoftwareRasterizer.restoreClip(jo.field_j);
            }
            if (param5[2] != null) {
              SoftwareRasterizer.intersectClip(var17, param4, var10, var18);
              param5[2].b(var13, param4);
              SoftwareRasterizer.restoreClip(jo.field_j);
            }
            if (param5[6] != null) {
              SoftwareRasterizer.intersectClip(param2, var19, var16, var11);
              param5[6].b(param2, var15);
              SoftwareRasterizer.restoreClip(jo.field_j);
            }
            if (param5[8] != null) {
              SoftwareRasterizer.intersectClip(var17, var19, var10, var11);
              param5[8].b(var13, var15);
              SoftwareRasterizer.restoreClip(jo.field_j);
            }
            if (param5[1] != null &&
              0 != param5[1].fullWidth) {
              SoftwareRasterizer.intersectClip(var16, param4, var17, var18);
              for (int var20 = var12; var20 < var13; var20 = var20 + param5[1].fullWidth) {
                param5[1].b(var20, param4);
              }
              SoftwareRasterizer.restoreClip(jo.field_j);
            }
            if (param5[7] != null &&
              param5[7].fullWidth != 0) {
              SoftwareRasterizer.intersectClip(var16, var19, var17, var11);
              for (int var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param5[7].fullWidth) {
                param5[7].b(var20Lifetime1, var15);
              }
              SoftwareRasterizer.restoreClip(jo.field_j);
            }
            if (null != param5[3] &&
              param5[3].fullHeight != 0) {
              SoftwareRasterizer.intersectClip(param2, var18, var16, var19);
              for (int var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param5[3].fullHeight) {
                param5[3].b(param2, var20Lifetime2);
              }
              SoftwareRasterizer.restoreClip(jo.field_j);
            }
            if (null != param5[5] &&
              param5[5].fullHeight != 0) {
              SoftwareRasterizer.intersectClip(var17, var18, var10, var19);
              for (int var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param5[5].fullHeight) {
                param5[5].b(var13, var20Lifetime3);
              }
              SoftwareRasterizer.restoreClip(jo.field_j);
            }
            if (param5[4] != null &&
              param5[4].fullWidth != 0 &&
              param5[4].fullHeight != 0) {
              SoftwareRasterizer.intersectClip(var16, var18, var17, var19);
              for (int var20Lifetime4 = var14; var20Lifetime4 < var15; var20Lifetime4 = var20Lifetime4 + param5[4].fullHeight) {
                for (int var21 = var12; var21 < var13; var21 = var21 + param5[4].fullWidth) {
                  param5[4].b(var21, var20Lifetime4);
                }
              }
              SoftwareRasterizer.restoreClip(jo.field_j);
            }
            if (param3) {
              field_a = (of) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_76_0 = var6;
          StringBuilder stackIn_76_1 = new StringBuilder().append("we.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
