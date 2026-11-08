/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ColorQuantizationBox {
    static String field_b;
    int field_l;
    static String field_g;
    int field_d;
    int field_i;
    int field_k;
    int field_e;
    static int field_a;
    static RasterBuffer field_f;
    int field_c;
    int field_h;
    static int[] field_j;

    public static void releaseStatics(int param0) {
        field_f = null;
        field_g = null;
        field_b = null;
        if (param0 >= -101) {
          ColorQuantizationBox.drawMatchTimer(-81, -90, false, -51, 67, -68);
        }
        field_j = null;
    }

    final static void drawMatchTimer(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var16 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        CoverageBitmapFont var15 = null;
        if (param0 != -1) {
          var6 = param0 / 50;
          var7 = var6 / 60;
          var8 = var6 % 60;
          var9 = 256;
          if (param2 &&
            var8 <= 10 &&
            var7 == 0) {
            var9 = var9 + (5 * (param0 % 50) - 250 + 160);
            if (var9 < 256) {
              var9 = 256;
            }
          }
          var16 = Integer.toString(var8);
          var10 = var16;
          if (!(2 <= var16.length())) {
            var10 = LeaguesScreen.charToString('0', (byte) -83) + var16;
          }
          var11 = -25 + param3 - (var7 >= 10 ? 0 : 3);
          var12 = -4 + (param1 + 20);
          var13 = 50;
          var14 = 20;
          if (var9 != 256) {
            var12 = 16;
            var14 = 20 * var9 >> 8;
            var11 = -(var7 < 10 ? 3 : 0) + 25;
            var13 = var9 * 50 >> 8;
          }
          SoftwareRasterizer.fillRoundedRectangleBlended(-var13 + param3, param1, var13, var14, 2, 0, param4);
          if (256 != var9) {
            PacketBuffer.a(-122, AudioOutputSupport.field_b);
            SoftwareRasterizer.clearFramebuffer();
          }
          var15 = ByteArrayPool.field_d;
          if (MonotonicClock.monotonicMillis(107) % 1000L < 500L) {
            ((BitmapFont) ((Object) var15)).drawCentered(":", var11, var12, 16777215, -1);
          }
          ((BitmapFont) ((Object) var15)).drawRightAligned(Integer.toString(var7), var11 - 3, var12, 16777215, -1);
          ((BitmapFont) ((Object) var15)).drawText(var10, var11 + 3, var12, 16777215, -1);
          if (param5 >= -39) {
            field_f = (RasterBuffer) null;
          }
          if (var9 != 256) {
            TeamManagementScreen.e(124);
            AudioOutputSupport.field_b.drawScaledAdditive(param3 - var13, param1, var13, var14, 256);
          }
          return;
        }
    }

    final static void drawNineSlicePanel(int param0, int param1, int param2, byte param3, Sprite[] param4, int param5) {
        int var22 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
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
        var23 = Kickabout.field_G;
        try {
          if (param4 == null) {
            return;
          }
          if (0 < param5 &&
            param1 > 0) {
            var7 = 94 % ((-41 - param3) / 61);
            if (param4[3] != null) {
              stackIn_11_0 = param4[3].field_o;
            } else {
              stackIn_11_0 = 0;
            }
            var6_int = stackIn_11_0;
            if (null == param4[5]) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = param4[5].field_o;
            }
            var8 = stackIn_14_0;
            if (null != param4[1]) {
              stackIn_17_0 = param4[1].field_v;
            } else {
              stackIn_17_0 = 0;
            }
            var9 = stackIn_17_0;
            if (param4[7] == null) {
              stackIn_20_0 = 0;
            } else {
              stackIn_20_0 = param4[7].field_v;
            }
            var10 = stackIn_20_0;
            var11 = param2 + param5;
            var12 = param1 + param0;
            var13 = param2 + var6_int;
            var14 = var11 - var8;
            var15 = var9 + param0;
            var16 = -var10 + var12;
            var17 = var13;
            var18 = var14;
            if (var18 < var17) {
              var18 = var6_int * param5 / (var6_int + var8) + param2;
              var17 = var6_int * param5 / (var6_int + var8) + param2;
            }
            var19 = var15;
            var20 = var16;
            SoftwareRasterizer.saveClip(DirectByteStorage.field_j);
            if (var20 < var19) {
              var20 = param0 + param1 * var9 / (var10 + var9);
              var19 = param0 + param1 * var9 / (var10 + var9);
            }
            if (null != param4[0]) {
              SoftwareRasterizer.intersectClip(param2, param0, var17, var19);
              param4[0].c(param2, param0);
              SoftwareRasterizer.restoreClip(DirectByteStorage.field_j);
            }
            if (param4[2] != null) {
              SoftwareRasterizer.intersectClip(var18, param0, var11, var19);
              param4[2].c(var14, param0);
              SoftwareRasterizer.restoreClip(DirectByteStorage.field_j);
            }
            if (param4[6] != null) {
              SoftwareRasterizer.intersectClip(param2, var20, var17, var12);
              param4[6].c(param2, var16);
              SoftwareRasterizer.restoreClip(DirectByteStorage.field_j);
            }
            if (param4[8] != null) {
              SoftwareRasterizer.intersectClip(var18, var20, var11, var12);
              param4[8].c(var14, var16);
              SoftwareRasterizer.restoreClip(DirectByteStorage.field_j);
            }
            if (null != param4[1] &&
              param4[1].field_o != 0) {
              SoftwareRasterizer.intersectClip(var17, param0, var18, var19);
              for (var21 = var13; var14 > var21; var21 = var21 + param4[1].field_o) {
                param4[1].c(var21, param0);
              }
              SoftwareRasterizer.restoreClip(DirectByteStorage.field_j);
            }
            if (null != param4[7] &&
              param4[7].field_o != 0) {
              SoftwareRasterizer.intersectClip(var17, var20, var18, var12);
              for (var21Lifetime1 = var13; var14 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param4[7].field_o) {
                param4[7].c(var21Lifetime1, var16);
              }
              SoftwareRasterizer.restoreClip(DirectByteStorage.field_j);
            }
            if (param4[3] != null &&
              0 != param4[3].field_v) {
              SoftwareRasterizer.intersectClip(param2, var19, var17, var20);
              for (var21Lifetime2 = var15; var16 > var21Lifetime2; var21Lifetime2 = var21Lifetime2 + param4[3].field_v) {
                param4[3].c(param2, var21Lifetime2);
              }
              SoftwareRasterizer.restoreClip(DirectByteStorage.field_j);
            }
            if (param4[5] != null &&
              param4[5].field_v != 0) {
              SoftwareRasterizer.intersectClip(var18, var19, var11, var20);
              for (var21Lifetime3 = var15; var21Lifetime3 < var16; var21Lifetime3 = var21Lifetime3 + param4[5].field_v) {
                param4[5].c(var14, var21Lifetime3);
              }
              SoftwareRasterizer.restoreClip(DirectByteStorage.field_j);
            }
            if (null != param4[4] &&
              param4[4].field_o != 0) {
              if (param4[4].field_v == 0) {
                return;
              }
              SoftwareRasterizer.intersectClip(var17, var19, var18, var20);
              for (var21Lifetime4 = var15; var21Lifetime4 < var16; var21Lifetime4 = var21Lifetime4 + param4[4].field_v) {
                for (var22 = var13; var14 > var22; var22 = var22 + param4[4].field_o) {
                  param4[4].c(var22, var21Lifetime4);
                }
              }
              SoftwareRasterizer.restoreClip(DirectByteStorage.field_j);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("ea.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void showMessageDialog(int param0, byte param1) {
        if (param1 <= 12) {
          return;
        }
        if (null == WidgetStyleFactory.field_c) {
          WidgetStyleFactory.field_c = (PopupDialog) ((Object) new MessageDialog(param0));
        }
    }

    static {
        field_g = "Searching for an opponent";
        field_b = "Sound";
        field_j = new int[5];
        field_j[1] = 163840;
        field_j[2] = 163840;
        field_j[0] = 147456;
        field_j[3] = 180224;
        field_j[4] = 163840;
    }
}
