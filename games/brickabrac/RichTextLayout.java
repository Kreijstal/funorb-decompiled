/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RichTextLayout extends WidgetTextLayout {
    static int field_m;
    static String field_s;
    private String cachedText;
    private int wrapWidth;
    private int horizontalAlignment;
    static java.awt.Image field_r;
    static MusicTrack podiumMusicTrack;
    static String field_o;
    private boolean singleLine;
    static long lastGameReadMillis;
    private int lineSpacing;
    private TextFont font;
    private int verticalAlignment;
    private int layoutHeight;

    final void layoutCentered(String text, int baselineY, TextFont font, int centerX, int horizontalAlignment) {
        TextLineLayout var8 = null;
        int var7 = 0;
        if (text == null) {
          this.lines = null;
          return;
        }
        if (font == this.font &&
          this.singleLine &&
          this.horizontalAlignment == 1 &&
          this.cachedText != null &&
          this.cachedText.equals(text)) {
          return;
        }
        try {
          this.singleLine = true;
          this.font = font;
          this.horizontalAlignment = horizontalAlignment;
          var8 = this.createSingleLine(text, font, (byte) -72, baselineY);
          var7 = font.measureText(text);
          var8.caretX[0] = centerX - (var7 >> 1);
          var8.caretX[text.length()] = centerX + (var7 >> 1);
          DraggableWidget.populateCaretPositions(25293, text, var8, 0, font);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oj.J(" + (text != null ? "{...}" : "null") + ',' + baselineY + ',' + (font != null ? "{...}" : "null") + ',' + centerX + ',' + horizontalAlignment + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        UiComponent stackIn_7_0 = null;
        boolean stackIn_7_1 = false;
        boolean stackIn_8_2 = false;
        UiComponent stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        boolean stackIn_12_2 = false;
        UiComponent stackIn_17_0 = null;
        boolean stackIn_17_1 = false;
        boolean stackIn_18_2 = false;
        UiComponent stackIn_21_0 = null;
        boolean stackIn_21_1 = false;
        boolean stackIn_22_2 = false;
        UiComponent stackIn_26_0 = null;
        boolean stackIn_26_1 = false;
        boolean stackIn_27_2 = false;
        UiComponent stackIn_30_0 = null;
        boolean stackIn_30_1 = false;
        boolean stackIn_31_2 = false;
        UiComponent stackIn_39_0 = null;
        boolean stackIn_39_1 = false;
        boolean stackIn_40_2 = false;
        UiComponent stackIn_43_0 = null;
        boolean stackIn_43_1 = false;
        boolean stackIn_44_2 = false;
        UiComponent stackIn_48_0 = null;
        boolean stackIn_48_1 = false;
        boolean stackIn_49_2 = false;
        UiComponent stackIn_52_0 = null;
        boolean stackIn_52_1 = false;
        boolean stackIn_53_2 = false;
        UiComponent stackIn_60_0 = null;
        boolean stackIn_60_1 = false;
        boolean stackIn_61_2 = false;
        UiComponent stackIn_64_0 = null;
        boolean stackIn_64_1 = false;
        boolean stackIn_65_2 = false;
        UiComponent stackIn_69_0 = null;
        boolean stackIn_69_1 = false;
        boolean stackIn_70_2 = false;
        UiComponent stackIn_73_0 = null;
        boolean stackIn_73_1 = false;
        boolean stackIn_74_2 = false;
        UiComponent stackIn_82_0 = null;
        boolean stackIn_82_1 = false;
        boolean stackIn_83_2 = false;
        UiComponent stackIn_86_0 = null;
        boolean stackIn_86_1 = false;
        boolean stackIn_87_2 = false;
        UiComponent stackIn_91_0 = null;
        boolean stackIn_91_1 = false;
        boolean stackIn_92_2 = false;
        UiComponent stackIn_95_0 = null;
        boolean stackIn_95_1 = false;
        boolean stackIn_96_2 = false;
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        MovingBody.a((byte) 74, 640 + Rasterizer2D.width >> 1, -640 + Rasterizer2D.width >> 1, 0, Rasterizer2D.height);
        if (TextLineLayout.field_b <= 0) {
          if (IntArrayRequest.field_j > 0) {
            if (null == GrowableIntList.field_e) {
              stackIn_60_0 = NinjaBackground.field_w;
              stackIn_60_1 = true;
              stackIn_61_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
              ((UiComponent) (Object) stackIn_60_0).drawRoot(stackIn_60_1, stackIn_61_2);
              stackIn_64_0 = MultiplayerMatch.field_d;
              stackIn_64_1 = true;
              stackIn_65_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
              ((UiComponent) (Object) stackIn_64_0).drawRoot(stackIn_64_1, stackIn_65_2);
            } else {
              GrowableIntList.field_e.drawAt(NinjaBackground.field_w.localX, 0);
              stackIn_69_0 = NinjaBackground.field_w;
              stackIn_69_1 = true;
              stackIn_70_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
              ((UiComponent) (Object) stackIn_69_0).drawRoot(stackIn_69_1, stackIn_70_2);
              stackIn_73_0 = MultiplayerMatch.field_d;
              stackIn_73_1 = true;
              stackIn_74_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
              ((UiComponent) (Object) stackIn_73_0).drawRoot(stackIn_73_1, stackIn_74_2);
            }
          } else {
            if (TableDataRequest.field_m > 0) {
              if (null == GrowableIntList.field_e) {
                stackIn_82_0 = NinjaBackground.field_w;
                stackIn_82_1 = true;
                stackIn_83_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
                ((UiComponent) (Object) stackIn_82_0).drawRoot(stackIn_82_1, stackIn_83_2);
                stackIn_86_0 = MultiplayerMatch.field_d;
                stackIn_86_1 = true;
                stackIn_87_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
                ((UiComponent) (Object) stackIn_86_0).drawRoot(stackIn_86_1, stackIn_87_2);
              } else {
                GrowableIntList.field_e.drawAt(NinjaBackground.field_w.localX, 0);
                stackIn_91_0 = NinjaBackground.field_w;
                stackIn_91_1 = true;
                stackIn_92_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
                ((UiComponent) (Object) stackIn_91_0).drawRoot(stackIn_91_1, stackIn_92_2);
                stackIn_95_0 = MultiplayerMatch.field_d;
                stackIn_95_1 = true;
                stackIn_96_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
                ((UiComponent) (Object) stackIn_95_0).drawRoot(stackIn_95_1, stackIn_96_2);
              }
            }
          }
          sc.popRaster(-123);
          var2 = -63 / ((70 - param1) / 49);
          return;
        }
        if (null != GrowableIntList.field_e) {
          GrowableIntList.field_e.drawAt(ContentTransitionLayer.field_gb.localX, 0);
        }
        stackIn_7_0 = ContentTransitionLayer.field_gb;
        stackIn_7_1 = true;
        stackIn_8_2 = (param0) && (!sc.field_c);
        ((UiComponent) (Object) stackIn_7_0).drawRoot(stackIn_7_1, stackIn_8_2);
        stackIn_11_0 = FontRequestHelpers.field_a;
        stackIn_11_1 = true;
        stackIn_12_2 = (param0) && (!sc.field_c);
        ((UiComponent) (Object) stackIn_11_0).drawRoot(stackIn_11_1, stackIn_12_2);
        if (IntArrayRequest.field_j > 0) {
          if (null == GrowableIntList.field_e) {
            stackIn_17_0 = NinjaBackground.field_w;
            stackIn_17_1 = true;
            stackIn_18_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
            ((UiComponent) (Object) stackIn_17_0).drawRoot(stackIn_17_1, stackIn_18_2);
            stackIn_21_0 = MultiplayerMatch.field_d;
            stackIn_21_1 = true;
            stackIn_22_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
            ((UiComponent) (Object) stackIn_21_0).drawRoot(stackIn_21_1, stackIn_22_2);
          } else {
            GrowableIntList.field_e.drawAt(NinjaBackground.field_w.localX, 0);
            stackIn_26_0 = NinjaBackground.field_w;
            stackIn_26_1 = true;
            stackIn_27_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
            ((UiComponent) (Object) stackIn_26_0).drawRoot(stackIn_26_1, stackIn_27_2);
            stackIn_30_0 = MultiplayerMatch.field_d;
            stackIn_30_1 = true;
            stackIn_31_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
            ((UiComponent) (Object) stackIn_30_0).drawRoot(stackIn_30_1, stackIn_31_2);
          }
          sc.popRaster(-123);
          var2Lifetime1 = -63 / ((70 - param1) / 49);
          return;
        }
        if (TableDataRequest.field_m <= 0) {
          sc.popRaster(-123);
          var2Lifetime2 = -63 / ((70 - param1) / 49);
          return;
        }
        if (null == GrowableIntList.field_e) {
          stackIn_39_0 = NinjaBackground.field_w;
          stackIn_39_1 = true;
          stackIn_40_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
          ((UiComponent) (Object) stackIn_39_0).drawRoot(stackIn_39_1, stackIn_40_2);
          stackIn_43_0 = MultiplayerMatch.field_d;
          stackIn_43_1 = true;
          stackIn_44_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
          ((UiComponent) (Object) stackIn_43_0).drawRoot(stackIn_43_1, stackIn_44_2);
          sc.popRaster(-123);
          var2Lifetime3 = -63 / ((70 - param1) / 49);
          return;
        }
        GrowableIntList.field_e.drawAt(NinjaBackground.field_w.localX, 0);
        stackIn_48_0 = NinjaBackground.field_w;
        stackIn_48_1 = true;
        stackIn_49_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
        ((UiComponent) (Object) stackIn_48_0).drawRoot(stackIn_48_1, stackIn_49_2);
        stackIn_52_0 = MultiplayerMatch.field_d;
        stackIn_52_1 = true;
        stackIn_53_2 = (param0) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
        ((UiComponent) (Object) stackIn_52_0).drawRoot(stackIn_52_1, stackIn_53_2);
        sc.popRaster(-123);
        var2Lifetime4 = -63 / ((70 - param1) / 49);
        return;
    }

    final void layoutLeftAligned(TextFont font, int baselineY, int leftX, String text, int horizontalAlignment) {
        TextLineLayout var7 = null;
        TextLineLayout var8 = null;
        if (text == null) {
          this.lines = null;
          return;
        }
        if (this.font == font && this.singleLine && this.horizontalAlignment == 0 && this.cachedText != null &&
          this.cachedText.equals(text)) {
          return;
        }
        try {
          this.font = font;
          this.singleLine = true;
          this.cachedText = text;
          this.horizontalAlignment = horizontalAlignment;
          var7 = this.createSingleLine(text, font, (byte) -109, baselineY);
          var8 = var7;
          var7.caretX[0] = leftX;
          var8.caretX[text.length()] = font.measureText(text) + leftX;
          DraggableWidget.populateCaretPositions(horizontalAlignment ^ 25293, text, var8, 0, font);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oj.N(" + (font != null ? "{...}" : "null") + ',' + baselineY + ',' + leftX + ',' + (text != null ? "{...}" : "null") + ',' + horizontalAlignment + ')');
        }
    }

    final static void a(int param0, Paddle param1, int param2, int param3, byte param4, PlayerBoard param5, int param6) {
        RgbSprite[] stackIn_4_0 = null;
        RgbSprite[] stackIn_7_0 = null;
        RgbSprite stackIn_10_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RgbSprite[] var7 = null;
        RuntimeException var7_ref = null;
        RgbSprite[] var8 = null;
        RgbSprite var9 = null;
        int var10 = 0;
        int var11 = 0;
        RgbSprite var12 = null;
        int var12_int = 0;
        int var13 = 0;
        RgbSprite[] var14 = null;
        RgbSprite var15 = null;
        RgbSprite var12Lifetime1;
        int var12_intLifetime1;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          if (TabbedPane.currentBackground != null) {
            stackIn_4_0 = TabbedPane.currentBackground.a((byte) -89, param2);
          } else {
            stackIn_4_0 = null;
          }
          var14 = stackIn_4_0;
          var7 = var14;
          if (TabbedPane.currentBackground != null) {
            stackIn_7_0 = TabbedPane.currentBackground.a(param2, true);
          } else {
            stackIn_7_0 = null;
          }
          var8 = stackIn_7_0;
          if (TabbedPane.currentBackground == null) {
            stackIn_10_0 = null;
          } else {
            stackIn_10_0 = TabbedPane.currentBackground.a(true, param2);
          }
          var9 = stackIn_10_0;
          if (param4 < 54) {
            return;
          }
          var10 = param1.y256 >> 8;
          var11 = param1.x256 >> 8;
          if (param0 == 2) {
            var15 = FullscreenDialogHelpers.activePaddleFlameSprites[1][ChocolateBackground.field_w.nextBoundedInt(-37880252, FullscreenDialogHelpers.activePaddleFlameSprites[1].length)];
            var12 = var15;
            var12.f((var11 + param6 * param2 - var15.canvasWidth * param2 + 3) / param2, (3 + (param2 * param3 + var10)) / param2, 196);
          }
          FullscreenFailureKind.activePaddleCapSprites[0].drawTransparent(var11 / param2 + param6, var10 / param2 + param3);
          if (var7 != null) {
            var14[0].drawTransparent(param6 + var11 / param2, param3 + var10 / param2);
          }
          var11 += 16;
          for (var12_int = 0; param1.sizeStage / 2 > var12_int; var12_int++) {
            HorizontalFrameHelpers.activePaddleSegmentSprites[0].drawTransparent(var11 / param2 + param6, param3 + var10 / param2);
            if (null != var8) {
              var8[0].drawTransparent(var11 / param2 + param6, var10 / param2 + param3);
            }
            var11 += 6;
          }
          TextHotspotRegion.activePaddleCenterSprite.drawTransparent(param6 + var11 / param2, var10 / param2 + param3);
          if (var9 != null) {
            var9.drawTransparent(param6 + var11 / param2, var10 / param2 + param3);
          }
          var11 += 8;
          for (var12_intLifetime1 = 0; param1.sizeStage / 2 > var12_intLifetime1; var12_intLifetime1++) {
            HorizontalFrameHelpers.activePaddleSegmentSprites[1].drawTransparent(var11 / param2 + param6, var10 / param2 + param3);
            if (null != var8) {
              var8[1].drawTransparent(var11 / param2 + param6, param3 + var10 / param2);
            }
            var11 += 6;
          }
          if (0 == param0) {
            var12Lifetime1 = FullscreenDialogHelpers.activePaddleFlameSprites[0][ChocolateBackground.field_w.nextBoundedInt(-37880252, FullscreenDialogHelpers.activePaddleFlameSprites[0].length)];
            var12Lifetime1.f((var11 + (16 + param6 * param2) - 3) / param2, (3 + param2 * param3 + var10) / param2, 196);
          }
          FullscreenFailureKind.activePaddleCapSprites[1].drawTransparent(param6 + var11 / param2, var10 / param2 + param3);
          if (var7 == null) {
            return;
          }
          var14[1].drawTransparent(param6 + var11 / param2, param3 + var10 / param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_44_0 = var7_ref;
          stackIn_44_1 = new StringBuilder().append("oj.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param6).append(')').toString());
        }
    }

    private final TextLineLayout createSingleLine(String text, TextFont font, byte obfuscationGuard, int baselineY) {
        TextLineLayout var5 = null;
        RuntimeException var5_ref = null;
        TextLineLayout var6 = null;
        TextLineLayout stackIn_2_0 = null;
        TextLineLayout stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new TextLineLayout(-font.ascent + baselineY, baselineY + font.descent, text.length());
          var5 = var6;
          this.lines = new TextLineLayout[]{var6};
          if (obfuscationGuard < -71) {
            stackIn_4_0 = var5;
            return stackIn_4_0;
          }
          stackIn_2_0 = (TextLineLayout) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("oj.I(");
          if (text == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (font == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(',').append(baselineY).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 == -51) {
          podiumMusicTrack = null;
          field_r = null;
          field_s = null;
          field_o = null;
          return;
        }
        lastGameReadMillis = -70L;
        podiumMusicTrack = null;
        field_r = null;
        field_s = null;
        field_o = null;
    }

    final void layoutRightAligned(String text, TextFont font, int rightX, byte obfuscationGuard, int baselineY) {
        TextLineLayout var9 = null;
        TextLineLayout var10 = null;
        if (text == null) {
          this.lines = null;
          return;
        }
        if (font == this.font && this.singleLine && 2 == this.horizontalAlignment && null != this.cachedText &&
          this.cachedText.equals(text)) {
          return;
        }
        try {
          if (obfuscationGuard > -90) {
            TextFont var7 = (TextFont) null;
            this.layoutCentered((String) null, -87, (TextFont) null, 2, -3);
          }
          this.font = font;
          this.cachedText = text;
          this.singleLine = true;
          this.horizontalAlignment = 2;
          var9 = this.createSingleLine(text, font, (byte) -108, baselineY);
          var10 = var9;
          var10.caretX[0] = rightX - font.measureText(text);
          var10.caretX[text.length()] = rightX;
          DraggableWidget.populateCaretPositions(25293, text, var10, 0, font);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oj.L(" + (text != null ? "{...}" : "null") + ',' + (font != null ? "{...}" : "null") + ',' + rightX + ',' + obfuscationGuard + ',' + baselineY + ')');
        }
    }

    final static int b(boolean param0) {
        if (GameConnectionShell.clientStage < 2) {
          return 0;
        }
        if (LoginCredentialKind.field_e == 0) {
          if (!LabeledWidget.field_P.ensureIndex((byte) -127)) {
            return 20;
          }
          if (!LabeledWidget.field_P.ensureGroupAvailableByName("commonui", -28138)) {
            return 40;
          }
          if (!RadialSelectorWidget.field_S.ensureIndex((byte) -127)) {
            return 50;
          }
          if (!RadialSelectorWidget.field_S.ensureGroupAvailableByName("commonui", -28138)) {
            return 60;
          }
          if (!BoardPresentationHelpers.field_c.ensureIndex((byte) -127)) {
            return 70;
          }
          if (!BoardPresentationHelpers.field_c.ensureAllGroupsAvailable(117)) {
            return 80;
          }
        } else {
          if (ValidationIconWidget.field_K != null) {
            if (!ValidationIconWidget.field_K.ensureIndex((byte) -127)) {
              return 14;
            }
            if (!ValidationIconWidget.field_K.hasGroupName(-104, "")) {
              return 29;
            }
            if (!ValidationIconWidget.field_K.ensureGroupAvailableByName("", -28138)) {
              return 29;
            }
          }
          if (!LabeledWidget.field_P.ensureIndex((byte) -127)) {
            return 43;
          }
          if (!LabeledWidget.field_P.ensureGroupAvailableByName("commonui", -28138)) {
            return 57;
          }
          if (!RadialSelectorWidget.field_S.ensureIndex((byte) -127)) {
            return 71;
          }
          if (!RadialSelectorWidget.field_S.ensureGroupAvailableByName("commonui", -28138)) {
            return 80;
          }
          if (!BoardPresentationHelpers.field_c.ensureIndex((byte) -127)) {
            return 82;
          }
          if (!BoardPresentationHelpers.field_c.ensureAllGroupsAvailable(110)) {
            return 86;
          }
        }
        if (param0) {
          return 71;
        }
        return 100;
    }

    final void layoutWrapped(String text, int horizontalAlignment, int obfuscationGuard, int layoutHeight, int lineSpacing, int wrapWidth, int verticalAlignment, TextFont font) {
        TextLineLayout stackIn_34_0;
        TextLineLayout stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        TextLineLayout stackIn_35_0 = null;
        TextLineLayout stackIn_35_1 = null;
        int stackIn_35_4 = 0;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        TextLineLayout stackIn_39_2 = null;
        int stackIn_40_3;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        String[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        TextLineLayout var15 = null;
        int var16 = 0;
        int var13Lifetime1;
        var16 = BrickABrac.field_J ? 1 : 0;
        try {
          if (0 == lineSpacing) {
            lineSpacing = font.baselineHeight;
          }
          if (text == null) {
            this.lines = null;
            return;
          }
          if (font == this.font &&
            !this.singleLine &&
            horizontalAlignment == this.horizontalAlignment &&
            verticalAlignment == this.verticalAlignment &&
            this.lineSpacing == lineSpacing &&
            this.layoutHeight == layoutHeight &&
            wrapWidth == this.wrapWidth &&
            this.cachedText != null &&
            this.cachedText.equals(text)) {
            return;
          }
          var9_int = -125 % ((26 - obfuscationGuard) / 49);
          this.horizontalAlignment = horizontalAlignment;
          this.singleLine = false;
          this.cachedText = text;
          this.layoutHeight = layoutHeight;
          this.verticalAlignment = verticalAlignment;
          this.lineSpacing = lineSpacing;
          this.wrapWidth = wrapWidth;
          this.font = font;
          var10 = new String[1 + font.countWrappedLines(text, wrapWidth)];
          var11 = Math.max(1, font.wrapText(text, new int[]{wrapWidth}, var10));
          if (this.verticalAlignment == 3 &&
            var11 == 1) {
            this.verticalAlignment = 1;
          }
          this.lines = new TextLineLayout[var11];
          if (this.verticalAlignment == 0) {
            var12 = font.ascent;
          } else {
            if (this.verticalAlignment == 1) {
              var12 = (-(var11 * this.lineSpacing) + this.layoutHeight >> 1) + font.ascent;
            } else {
              if (2 != this.verticalAlignment) {
                var13 = (this.layoutHeight - this.lineSpacing * var11) / (var11 + 1);
                if (var13 < 0) {
                  var13 = 0;
                }
                var12 = var13 + font.ascent;
                this.lineSpacing = this.lineSpacing + var13;
              } else {
                var12 = this.layoutHeight - font.descent - var11 * this.lineSpacing;
              }
            }
          }
          for (var13Lifetime1 = 0; var11 > var13Lifetime1; var13Lifetime1++) {
            var14 = var10[var13Lifetime1];
            stackIn_34_0 = null;
            stackIn_34_1 = null;
            stackIn_34_2 = var12 - font.ascent;
            stackIn_34_3 = font.descent + var12;
            if (var14 != null) {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = var14.length();
            } else {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = 0;
            }
            var15 = new TextLineLayout(stackIn_34_2, stackIn_34_3, stackIn_35_4);
            var15.caretX[0] = 0;
            if (var14 != null) {
              var15.caretX[var14.length()] = font.measureText(var14);
              stackIn_39_0 = 25293;
              stackIn_39_1 = var14;
              stackIn_39_2 = var15;
              if (horizontalAlignment != 3) {
                stackIn_40_3 = 0;
              } else {
                stackIn_40_3 = this.a(wrapWidth, font.measureText(var14), var14, true);
              }
              DraggableWidget.populateCaretPositions(stackIn_39_0, stackIn_39_1, stackIn_39_2, stackIn_40_3, font);
            }
            this.lines[var13Lifetime1] = var15;
            var12 = var12 + lineSpacing;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("oj.O(");
          if (text == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(horizontalAlignment).append(',').append(obfuscationGuard).append(',').append(layoutHeight).append(',').append(lineSpacing).append(',').append(wrapWidth).append(',').append(verticalAlignment).append(',');
          if (font == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    public RichTextLayout() {
    }

    static {
        field_o = "Seriously offensive language";
        field_s = "Please select a level.";
    }
}
