/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteCheckboxRenderer implements WidgetRenderer {
    static Sprite boardSceneRaster;
    static BufferedSocket field_e;
    static int field_f;
    static String field_a;
    static int field_c;
    static int previousMenuScreenId;

    final static void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Geoblox.clientControlFlowFlag;
        GzipInflater.sunBackgroundSprite.drawRunEncoded(0, 0);
        PacketByteCipher.sunForegroundSprite.draw(320 - (PacketByteCipher.sunForegroundSprite.fullWidth >> 1), param0 - (PacketByteCipher.sunForegroundSprite.fullHeight >> 1));
        AudioService.screenTitleSprites[0].draw(0, 20);
        int var1 = -70 + MatchingTextValidator.field_j;
        if (var1 >= 0) {
            if (!((double)var1 * 0.0174532925 < 1.5707963267948966)) {
                var2 = RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullWidth >> 1;
                if (CachedTextLayout.field_h >= 11) {
                    var3 = (MatchingTextValidator.field_j - UnderlinedButtonRenderer.field_c >> 1) * (MatchingTextValidator.field_j - UnderlinedButtonRenderer.field_c >> 1) >> 1;
                    RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].drawGrayModulated(-(RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullWidth >> 1) + 320, var3 + (-(RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullHeight >> 1) + 240), WidgetSkinState.field_j);
                    AccountCreationForm.introGeometryFrames[0].draw(var2 + 320, -34 + var3 - (AccountCreationForm.introGeometryFrames[0].fullHeight >> 1) + 240);
                    AccountCreationForm.introGeometryFrames[1].draw(-var2 + 320 - AccountCreationForm.introGeometryFrames[1].fullWidth, -(AccountCreationForm.introGeometryFrames[1].fullHeight >> 1) + (240 + var3 + 22));
                    return;
                }
                var3 = MatchingTextValidator.field_j << 2;
                if (var2 + 320 < 1000 - var3) {
                    AccountCreationForm.introGeometryFrames[0].draw(1000 - var3, -34 + (240 - (AccountCreationForm.introGeometryFrames[0].fullHeight >> 1)));
                } else {
                    AccountCreationForm.introGeometryFrames[0].draw(320 + var2, 206 - (AccountCreationForm.introGeometryFrames[0].fullHeight >> 1));
                }
                if (-AccountCreationForm.introGeometryFrames[1].fullWidth + (320 - var2) > var3 - 1200) {
                    AccountCreationForm.introGeometryFrames[1].draw(var3 - 1200, 22 + (240 - (AccountCreationForm.introGeometryFrames[1].fullHeight >> 1)));
                    RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].drawGrayModulated(320 - var2, 240 - (RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullHeight >> 1), WidgetSkinState.field_j);
                    return;
                }
                AccountCreationForm.introGeometryFrames[1].draw(-AccountCreationForm.introGeometryFrames[1].fullWidth - var2 + 320, 240 - (AccountCreationForm.introGeometryFrames[1].fullHeight >> 1) + 22);
                RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].drawGrayModulated(320 - var2, 240 - (RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullHeight >> 1), WidgetSkinState.field_j);
                return;
            }
            AudioService.screenTitleSprites[0].drawAdditive(0, 20, (int)(0.5 + Math.sin(2.0 * ((double)var1 * 0.0174532925)) * 90.0));
        }
        var2 = RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullWidth >> 1;
        if (CachedTextLayout.field_h >= 11) {
            var3 = (MatchingTextValidator.field_j - UnderlinedButtonRenderer.field_c >> 1) * (MatchingTextValidator.field_j - UnderlinedButtonRenderer.field_c >> 1) >> 1;
            RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].drawGrayModulated(-(RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullWidth >> 1) + 320, var3 + (-(RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullHeight >> 1) + 240), WidgetSkinState.field_j);
            AccountCreationForm.introGeometryFrames[0].draw(var2 + 320, -34 + var3 - (AccountCreationForm.introGeometryFrames[0].fullHeight >> 1) + 240);
            AccountCreationForm.introGeometryFrames[1].draw(-var2 + 320 - AccountCreationForm.introGeometryFrames[1].fullWidth, -(AccountCreationForm.introGeometryFrames[1].fullHeight >> 1) + (240 + var3 + 22));
            return;
        }
        var3 = MatchingTextValidator.field_j << 2;
        if (var2 + 320 < 1000 - var3) {
            AccountCreationForm.introGeometryFrames[0].draw(1000 - var3, -34 + (240 - (AccountCreationForm.introGeometryFrames[0].fullHeight >> 1)));
            if (-AccountCreationForm.introGeometryFrames[1].fullWidth + (320 - var2) > var3 - 1200) {
                AccountCreationForm.introGeometryFrames[1].draw(var3 - 1200, 22 + (240 - (AccountCreationForm.introGeometryFrames[1].fullHeight >> 1)));
                RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].drawGrayModulated(320 - var2, 240 - (RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullHeight >> 1), WidgetSkinState.field_j);
                return;
            }
            AccountCreationForm.introGeometryFrames[1].draw(-AccountCreationForm.introGeometryFrames[1].fullWidth - var2 + 320, 240 - (AccountCreationForm.introGeometryFrames[1].fullHeight >> 1) + 22);
            RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].drawGrayModulated(320 - var2, 240 - (RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullHeight >> 1), WidgetSkinState.field_j);
            return;
        }
        AccountCreationForm.introGeometryFrames[0].draw(320 + var2, 206 - (AccountCreationForm.introGeometryFrames[0].fullHeight >> 1));
        if (-AccountCreationForm.introGeometryFrames[1].fullWidth + (320 - var2) > var3 - 1200) {
            AccountCreationForm.introGeometryFrames[1].draw(var3 - 1200, 22 + (240 - (AccountCreationForm.introGeometryFrames[1].fullHeight >> 1)));
            RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].drawGrayModulated(320 - var2, 240 - (RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullHeight >> 1), WidgetSkinState.field_j);
            return;
        }
        AccountCreationForm.introGeometryFrames[1].draw(-AccountCreationForm.introGeometryFrames[1].fullWidth - var2 + 320, 240 - (AccountCreationForm.introGeometryFrames[1].fullHeight >> 1) + 22);
        RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].drawGrayModulated(320 - var2, 240 - (RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullHeight >> 1), WidgetSkinState.field_j);
    }

    public static void a(boolean param0) {
        field_e = null;
        boardSceneRaster = null;
        if (!param0) {
            return;
        }
        field_a = null;
    }

    public final void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Sprite var8 = null;
        try {
          var6_int = widget.widgetX + parentX;
          var7 = widget.widgetY + parentY;
          ik.a(var6_int, widget.widgetHeight, var7, widget.widgetWidth, -1540604944);
          var8 = oa.field_e[1];
          if ((widget instanceof ButtonWidget) &&
              (((ButtonWidget) ((Object) widget)).active)) {
            var8.drawAdditive(var6_int - (-1 - (-var8.fullWidth + widget.widgetWidth >> 1)), (-var8.fullHeight + widget.widgetHeight >> 1) + 1 + var7, 256);
          }
          if (widget.hasKeyboardFocus((byte) 54)) {
            ImageProducerRasterBuffer.a(var7 + 2, -4 + widget.widgetWidth, 14164, -4 + widget.widgetHeight, var6_int + 2);
          }
          if (methodGuard < -5) {
            return;
          }
          field_c = 68;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("oc.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void pushRasterTarget(int methodGuard) {
        int var2 = -117 / ((-46 - methodGuard) / 50);
        RasterTargetSnapshot var1 = (RasterTargetSnapshot) ((Object) sg.rasterSnapshotPool.removeLast(1));
        if (!(var1 != null)) {
            var1 = new RasterTargetSnapshot();
        }
        var1.capture(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipRight, SoftwareRasterizer.clipBottom, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight, SoftwareRasterizer.clipTop, SoftwareRasterizer.framebuffer, true);
        MatchingTextValidator.rasterTargetStack.addLast(-88, var1);
    }

    final static void a(int param0) {
        try {
            java.lang.reflect.Method var1_ref_java_lang_reflect_Method = null;
            int var1 = 0;
            Exception var1_ref_Exception = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              var1_ref_java_lang_reflect_Method = Runtime.class.getMethod("maxMemory", new Class[]{});
              if (var1_ref_java_lang_reflect_Method == null) {
                var1 = -93 / ((-13 - param0) / 47);
                return;
              }
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1_ref_java_lang_reflect_Method.invoke((Object) (var2), (Object[]) null));
                li.field_c = 1 + (int)(var3.longValue() / 1048576L);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                var1 = -93 / ((-13 - param0) / 47);
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref_Exception = (Exception) (Object) decompiledCaughtException;
              var1 = -93 / ((-13 - param0) / 47);
              return;
            }
            var1 = -93 / ((-13 - param0) / 47);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = 80;
        boardSceneRaster = new Sprite(640, 640);
    }
}
