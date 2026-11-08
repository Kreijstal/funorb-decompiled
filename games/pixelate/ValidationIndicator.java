/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationIndicator extends TextButton {
    private ValidationSource field_P;
    private int field_Q;
    static IntrusiveDeque field_O;
    static String field_N;

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        try {
          this.field_Q = this.field_Q + 1;
          if (param0 != 40) {
            field_N = (String) null;
          }
          super.updatePointer(param0 ^ 0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "vc.L(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String getTooltip(byte param0) {
        if (this.field_D) {
          return this.field_P.getMessage((byte) -7);
        }
        if (param0 > 16) {
          return null;
        }
        field_N = (String) null;
        return null;
    }

    final boolean focusNext(UiComponent param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 27) {
            return false;
          }
          this.field_P = (ValidationSource) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vc.HA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void configureLegacyMenuStyle(int param0, int param1, int param2, NineSliceFrame param3, int param4, NineSliceFrame param5, int param6, int param7, int param8, BitmapFont param9, int param10, int param11, int param12, NineSliceFrame param13, int param14, BitmapFont param15, byte param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          ValidationState.configureLegacyMenu((byte) -109, param15, param9, param6);
          BackgroundScene.setLegacyMenuFontMetrics(param17, false, param0, param7, param18);
          OptionsScreen.setLegacyMenuCentre(param8, param20, true);
          LoginCookieHelpers.setMenuButtonStyle(param5, param2, -118, param3, param4, param1);
          PictureStrip.setLegacyMenuFrame(param12, param13, 16, param10);
          JaggrabDownloader.setMenuTextColours((byte) -113, param19, param11, param14);
          var21_int = -33 / ((param16 - 20) / 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("vc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final void drawLayer(int param0, int param1, int param2, byte param3) {
        int var5;
        int var6;
        int var7;
        ValidationState var9;
        int var10;
        int var11;
        int var12;
        Sprite var14;
        Sprite var15;
        Sprite var16;
        Sprite var17;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = Pixelate.field_H ? 1 : 0;
        super.drawLayer(param0, param1, param2, (byte) 125);
        if (param1 != 0) {
          return;
        }
        var6 = -40 / ((param3 - 70) / 49);
        var5 = (this.field_E >> 1) + param2 + this.field_z;
        var7 = (this.field_C >> 1) + (this.field_p + param0);
        var9 = this.field_P.getState((byte) 110);
        if (BufferedRandomAccessFile.field_b == var9) {
          var17 = CanvasRasterBuffer.field_g[0];
          var10 = var17.field_A << 1;
          var11 = var17.field_B << 1;
          if (null == QuickChatPhraseCache.field_k) {
            QuickChatPhraseCache.field_k = new Sprite(var10, var11);
            Checkbox.renderToSprite(-83, QuickChatPhraseCache.field_k);
          } else {
            if (var10 > QuickChatPhraseCache.field_k.field_F) {
              QuickChatPhraseCache.field_k = new Sprite(var10, var11);
              Checkbox.renderToSprite(-83, QuickChatPhraseCache.field_k);
            } else {
              if (QuickChatPhraseCache.field_k.field_E >= var11) {
                Checkbox.renderToSprite(-71, QuickChatPhraseCache.field_k);
                SoftwareRasterizer.clear();
              } else {
                QuickChatPhraseCache.field_k = new Sprite(var10, var11);
                Checkbox.renderToSprite(-83, QuickChatPhraseCache.field_k);
              }
            }
          }
          var17.drawRotatedAboutPivot(112, 144, var17.field_A << 4, var17.field_B << 4, -this.field_Q << 10, 4096);
          LinkButtonPainter.popRasterState((byte) 92);
          QuickChatPhraseCache.field_k.drawAdditive(var5 - var17.field_A, var7 - var17.field_B, 256);
          return;
        }
        if (var9 != UiTheme.field_j) {
          if (var9 == LobbyFrameHelpers.field_a) {
            var14 = CanvasRasterBuffer.field_g[2];
            var14.drawAdditive(var5 - (var14.field_F >> 1), -(var14.field_E >> 1) + var7, 256);
            return;
          }
          if (RetroBlock.field_g != var9) {
            return;
          }
          var15 = CanvasRasterBuffer.field_g[1];
          var15.drawAdditive(-(var15.field_F >> 1) + var5, var7 - (var15.field_E >> 1), 256);
          return;
        }
        var16 = CanvasRasterBuffer.field_g[0];
        var10Lifetime1 = var16.field_A << 1;
        var11Lifetime1 = var16.field_B << 1;
        if (null == QuickChatPhraseCache.field_k) {
          QuickChatPhraseCache.field_k = new Sprite(var10Lifetime1, var11Lifetime1);
          Checkbox.renderToSprite(-83, QuickChatPhraseCache.field_k);
        } else {
          if (var10Lifetime1 > QuickChatPhraseCache.field_k.field_F) {
            QuickChatPhraseCache.field_k = new Sprite(var10Lifetime1, var11Lifetime1);
            Checkbox.renderToSprite(-83, QuickChatPhraseCache.field_k);
          } else {
            if (QuickChatPhraseCache.field_k.field_E >= var11Lifetime1) {
              Checkbox.renderToSprite(-71, QuickChatPhraseCache.field_k);
              SoftwareRasterizer.clear();
            } else {
              QuickChatPhraseCache.field_k = new Sprite(var10Lifetime1, var11Lifetime1);
              Checkbox.renderToSprite(-83, QuickChatPhraseCache.field_k);
            }
          }
        }
        var16.drawRotatedAboutPivot(112, 144, var16.field_A << 4, var16.field_B << 4, -this.field_Q << 10, 4096);
        LinkButtonPainter.popRasterState((byte) 92);
        QuickChatPhraseCache.field_k.drawAdditive(var5 - var16.field_A, var7 - var16.field_B, 256);
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= -84) {
          field_N = null;
          field_O = null;
          return;
        }
        BitmapFont var2 = (BitmapFont) null;
        ValidationIndicator.configureLegacyMenuStyle(16, 19, 82, (NineSliceFrame) null, 15, (NineSliceFrame) null, -91, -16, 3, (BitmapFont) null, 119, -31, -67, (NineSliceFrame) null, -69, (BitmapFont) null, (byte) 15, -5, 94, -75, -69);
        field_N = null;
        field_O = null;
    }

    ValidationIndicator(ValidationSource param0) {
        try {
          this.field_P = param0;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "vc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_O = new IntrusiveDeque();
        field_N = "Connection timed out. Please try using a different server.";
    }
}
