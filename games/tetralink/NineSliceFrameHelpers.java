/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NineSliceFrameHelpers {
    static String field_a;
    static QuickChatCommandType field_c;
    static int[] field_b;
    static String field_e;
    static String field_d;

    final static boolean isFullscreenActive(int param0) {
        if (param0 <= 105) {
          return true;
        }
        return null != EmailAvailabilityValidator.field_u ? true : ScreenSwitchHelpers.field_e;
    }

    final static void saveRandomData(byte param0) {
        try {
          if (null != SectorCacheStore.field_f) {
            try {
              SectorCacheStore.field_f.seek(0L, 0);
              SectorCacheStore.field_f.write(param0 ^ -19814, BackgroundSparkle.field_q.payload, BackgroundSparkle.field_q.position, 24);
            } catch (Exception exception) {
            }
          }
          BackgroundSparkle.field_q.position = BackgroundSparkle.field_q.position + 24;
          if (param0 != 115) {
            field_d = (String) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean isSavedFlagsReady(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 4) {
          field_d = (String) null;
        }
        stackIn_7_0 = (Bzip2State.field_n) || (LoadingProgressDialog.isKeyboardIdle(-69));
        return stackIn_7_0;
    }

    final static Sprite[] createSolidCenterSprites(int param0, int param1) {
        Sprite[] var2 = new Sprite[9];
        var2[4] = FaceNormal.createSolidSprite(param1, 64, IsaacCipher.bitXor(param0, param0));
        return var2;
    }

    final static UiComponent getChatInputWidget(int param0) {
        if (param0 != 0) {
          NineSliceFrameHelpers.getChatInputWidget(-109);
        }
        return NetworkGameClient.field_t.field_Pb;
    }

    final static void drawNineSliceFrame(int param0, byte param1, Sprite[] param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
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
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = TetraLink.field_J;
        try {
          if (param2 == null) {
            return;
          }
          if (0 < param0 &&
            param4 > 0) {
            if (null != param2[3]) {
              stackIn_9_0 = param2[3].field_t;
            } else {
              stackIn_9_0 = 0;
            }
            var6_int = stackIn_9_0;
            if (null == param2[5]) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = param2[5].field_t;
            }
            var7 = stackIn_12_0;
            if (null != param2[1]) {
              stackIn_15_0 = param2[1].field_F;
            } else {
              stackIn_15_0 = 0;
            }
            var8 = stackIn_15_0;
            if (param2[7] != null) {
              stackIn_18_0 = param2[7].field_F;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            var10 = param0 + param3;
            var11 = param4 + param5;
            var12 = param3 + var6_int;
            if (param1 != -36) {
              field_d = (String) null;
            }
            var13 = -var7 + var10;
            var14 = var8 + param5;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param3 + param0 * var6_int / (var6_int + var7);
              var16 = param3 + param0 * var6_int / (var6_int + var7);
            }
            var18 = var14;
            var19 = var15;
            SoftwareRasterizer.saveClip(AudioPumpThread.field_i);
            if (var18 > var19) {
              var19 = param5 + var8 * param4 / (var9 + var8);
              var18 = param5 + var8 * param4 / (var9 + var8);
            }
            if (param2[0] != null) {
              SoftwareRasterizer.intersectClip(param3, param5, var16, var18);
              param2[0].drawTransparent(param3, param5);
              SoftwareRasterizer.restoreClip(AudioPumpThread.field_i);
            }
            if (param2[2] != null) {
              SoftwareRasterizer.intersectClip(var17, param5, var10, var18);
              param2[2].drawTransparent(var13, param5);
              SoftwareRasterizer.restoreClip(AudioPumpThread.field_i);
            }
            if (null != param2[6]) {
              SoftwareRasterizer.intersectClip(param3, var19, var16, var11);
              param2[6].drawTransparent(param3, var15);
              SoftwareRasterizer.restoreClip(AudioPumpThread.field_i);
            }
            if (param2[8] != null) {
              SoftwareRasterizer.intersectClip(var17, var19, var10, var11);
              param2[8].drawTransparent(var13, var15);
              SoftwareRasterizer.restoreClip(AudioPumpThread.field_i);
            }
            if (null != param2[1] &&
              0 != param2[1].field_t) {
              SoftwareRasterizer.intersectClip(var16, param5, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param2[1].field_t) {
                param2[1].drawTransparent(var20, param5);
              }
              SoftwareRasterizer.restoreClip(AudioPumpThread.field_i);
            }
            if (null != param2[7] &&
              param2[7].field_t != 0) {
              SoftwareRasterizer.intersectClip(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param2[7].field_t) {
                param2[7].drawTransparent(var20Lifetime1, var15);
              }
              SoftwareRasterizer.restoreClip(AudioPumpThread.field_i);
            }
            if (param2[3] != null &&
              param2[3].field_F != 0) {
              SoftwareRasterizer.intersectClip(param3, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param2[3].field_F) {
                param2[3].drawTransparent(param3, var20Lifetime2);
              }
              SoftwareRasterizer.restoreClip(AudioPumpThread.field_i);
            }
            if (param2[5] != null &&
              param2[5].field_F != 0) {
              SoftwareRasterizer.intersectClip(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param2[5].field_F) {
                param2[5].drawTransparent(var13, var20Lifetime3);
              }
              SoftwareRasterizer.restoreClip(AudioPumpThread.field_i);
            }
            if (param2[4] != null &&
              0 != param2[4].field_t &&
              param2[4].field_F != 0) {
              SoftwareRasterizer.intersectClip(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param2[4].field_F) {
                for (var21 = var12; var21 < var13; var21 = var21 + param2[4].field_t) {
                  param2[4].drawTransparent(var21, var20Lifetime4);
                }
              }
              SoftwareRasterizer.restoreClip(AudioPumpThread.field_i);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("qj.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        int var1 = -67 / ((0 - param0) / 49);
        field_d = null;
        field_c = null;
    }

    static {
        field_b = new int[]{2, 14, 15, 6, 5, 16, 17, 10, 11, 12};
        field_c = new QuickChatCommandType(1, 2, 2, 0);
        field_e = "Your turn - playing <%0> (<%1>)";
        field_d = "Enter name of friend to add to list";
    }
}
