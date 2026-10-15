/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class Widget extends IntrusiveNode {
    int textOffsetX;
    WidgetTextLayout textLayout;
    static BufferedFile field_k;
    int pressedButton;
    int height;
    static String[] field_v;
    boolean mouseOver;
    String text;
    int width;
    static TextFont textChoiceBodyFont;
    static long field_p;
    static String field_u;
    int x;
    WidgetRenderer renderer;
    static int[] field_y;
    static RgbSprite field_x;
    int textOffsetY;
    WidgetListener listener;
    String tooltip;
    int y;

    final void relayout(int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          return;
        }
        this.setBounds(this.height, this.x, this.y, (byte) -119, this.width);
    }

    void handlePointerRelease(int pointerY, int pointerX, int parentY, Widget focusRoot, int obfuscationGuard, int parentX) {
        try {
          this.pressedButton = 0;
          if (obfuscationGuard != 19223) {
            field_y = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oc.GA(" + pointerY + ',' + pointerX + ',' + parentY + ',' + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ')');
        }
    }

    void setBounds(int height, int x, int y, byte obfuscationGuard, int width) {
        this.height = height;
        if (obfuscationGuard == -119) {
          this.width = width;
          this.y = y;
          this.x = x;
          return;
        }
        this.setBounds(28, 90, 95, (byte) 89, -101);
        this.width = width;
        this.y = y;
        this.x = x;
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = this.e((byte) -79);
        var5_int = param2;
        while (var5_int <= var4) {
          this.drawLayer(param1, param0, var5_int, (byte) -11);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = BlankScreen.d((byte) 63);
        if (var5 == null) {
          return;
        }
        PopupWidgetLayer.widgetTheme.a(true, CappedUrlRequest.field_j, b.field_a, var5);
    }

    final static void drawPowerUpMeter(int y, int typeId, int x, PlayerBoard board, MultiplayerMatch match, byte obfuscationGuard) {
        int tutorialActiveValue = 0;
        int tutorialValue = 0;
        int highlightStageValue = 0;
        int firstBandValue = 0;
        int secondBandValue = 0;
        int thirdBandValue = 0;
        int fourthBandValue = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String boardSummary = null;
        StringBuilder matchContextBuilder = null;
        String matchSummary = null;
        RuntimeException caughtFailure = null;
        int tutorialActive = 0;
        RuntimeException failure = null;
        int highlightAge = 0;
        int barX = 0;
        int meterLevel = 0;
        int barBottom = 0;
        int firstBandHeight = 0;
        int highlightMeter;
        int secondBandHeight;
        int thirdBandHeight;
        int fourthBandHeight;
        try {
          if (match.playerCount == 1) {
            if (TextFieldRenderer.field_A) {
              tutorialActiveValue = (MusicVoice.a((byte) 88)) ? 1 : 0;
            } else {
              tutorialActiveValue = 0;
            }
          } else {
            tutorialActiveValue = 0;
          }
          tutorialActive = tutorialActiveValue;
          tutorialValue = tutorialActive;
          if (8 != ga.field_i &&
            ga.field_i != 9) {
            highlightStageValue = 0;
          } else {
            highlightStageValue = 1;
          }
          highlightMeter = tutorialValue & highlightStageValue;
          highlightAge = MembershipBenefitsScreen.clientTick - SpriteGeometry.field_v;
          TextHotspotRegion.powerUpMeterIcons[typeId].drawTransparent(x, y);
          if (highlightMeter != 0) {
            TextHotspotRegion.powerUpMeterIcons[typeId].f(x, y, 64 + (InteractiveGameClient.sine8192(200 * highlightAge, -4097) >> 10));
          }
          x += 7;
          y--;
          barX = LevelPackSelectScreen.powerUpMeterBarSprite.width + x - 5;
          Rasterizer2D.fillRectangle(barX, y + 1, 4, LevelPackSelectScreen.powerUpMeterBarSprite.height - 2, 16777215);
          if (obfuscationGuard <= 106) {
            Widget.initializeDiagnosticOverlay(120, (TextFont) null);
          }
          meterLevel = board.powerUpMeterLevels256[typeId] >> 8;
          barBottom = LevelPackSelectScreen.powerUpMeterBarSprite.height + (y - 1);
          if (meterLevel > 0) {
            firstBandValue = (meterLevel <= 3) ? meterLevel : 3;
            firstBandHeight = firstBandValue;
            Rasterizer2D.fillRectangle(barX, barBottom - firstBandHeight, 4, firstBandHeight, 16735667);
            barBottom -= 3;
          }
          if (meterLevel > 3) {
            if (meterLevel > 7) {
              secondBandValue = 4;
            } else {
              secondBandValue = -3 + meterLevel;
            }
            secondBandHeight = secondBandValue;
            Rasterizer2D.fillRectangle(barX, -secondBandHeight + barBottom, 4, secondBandHeight, 15876234);
            barBottom -= 4;
          }
          if (7 < meterLevel) {
            if (meterLevel > 13) {
              thirdBandValue = 6;
            } else {
              thirdBandValue = -7 + meterLevel;
            }
            thirdBandHeight = thirdBandValue;
            Rasterizer2D.fillRectangle(barX, -thirdBandHeight + barBottom, 4, thirdBandHeight, 15410040);
            barBottom -= 6;
          }
          if (meterLevel > 13) {
            if (meterLevel <= 20) {
              fourthBandValue = -13 + meterLevel;
            } else {
              fourthBandValue = 7;
            }
            fourthBandHeight = fourthBandValue;
            Rasterizer2D.fillRectangle(barX, barBottom - fourthBandHeight, 4, fourthBandHeight, 13245286);
          }
          if (meterLevel >= 20) {
            Rasterizer2D.fillRectangleAlpha(barX, y + LevelPackSelectScreen.powerUpMeterBarSprite.height - 21, 4, 20, 16777215, (InteractiveGameClient.sine8192(200 * MembershipBenefitsScreen.clientTick, -4097) >> 10) + 64);
          }
          LevelPackSelectScreen.powerUpMeterBarSprite.drawTransparent(x, y);
          if (highlightMeter != 0) {
            LevelPackSelectScreen.powerUpMeterBarSprite.f(x, y, (InteractiveGameClient.sine8192(400 * highlightAge, -4097) >> 10) + 64);
          }
          return;
        } catch (java.lang.RuntimeException caughtException) {
          caughtFailure = caughtException;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("oc.IA(").append(y).append(',').append(typeId).append(',').append(x).append(',');
          if (board == null) {
            boardSummary = "null";
          } else {
            boardSummary = "{...}";
          }
          matchContextBuilder = ((StringBuilder) (Object) contextBuilder).append(boardSummary).append(',');
          if (match == null) {
            matchSummary = "null";
          } else {
            matchSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) matchContextBuilder).append(matchSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final String toString() {
        return this.a(0, new Hashtable(), 24, new StringBuilder()).toString();
    }

    final boolean a(int param0, int param1, int param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        DraggableWidget var8;
        DraggableWidget var9;
        DraggableWidget var10;
        DraggableWidget var11;
        DraggableWidget var12;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var6Lifetime5;
        int var6Lifetime6;
        int var6Lifetime7;
        int var6Lifetime8;
        int var6Lifetime9;
        int var6Lifetime10;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var6Lifetime1Lifetime3;
        int var6Lifetime2Lifetime1;
        int var6Lifetime2Lifetime2;
        int var6Lifetime2Lifetime3;
        int var6Lifetime2Lifetime4;
        var7 = BrickABrac.field_J ? 1 : 0;
        this.updatePointer(this, (byte) 0, param1, param0);
        var5 = this.isFocused(-123) ? 1 : 0;
        if (!param3) {
          if (var5 == 0) {
            var6 = -57 % ((56 - param2) / 43);
            ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
            MusicVoice.a(this.getTooltip(15), 22546);
            return param3;
          }
          if (BackgroundScene.pressedButton == 0) {
            var6Lifetime6 = -57 % ((56 - param2) / 43);
            ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
            MusicVoice.a(this.getTooltip(15), 22546);
            return param3;
          }
          this.clearFocus(false);
          if (var7 == 0) {
            var6Lifetime7 = -57 % ((56 - param2) / 43);
            ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
            MusicVoice.a(this.getTooltip(15), 22546);
            return param3;
          }
          if (0 != GameplayAudioEvent.mouseWheelDelta &&
            var5 != 0) {
            this.a(GameplayAudioEvent.mouseWheelDelta, MusicPatch.pointerX, param0, -127, ResourcePreparationEntry.pointerY, this, param1);
          }
          if (BackgroundScene.pressedButton != 0) {
            if (this.handlePointerPress(this, LoadingProgressDialog.pressX, param1, param0, BackgroundScene.pressedButton, PlayerNameChooserPanel.pressY, 0)) {
              param3 = false;
            }
            this.clearFocus(false);
          }
          if (0 != MatchingTextValidator.heldButton) {
            var6Lifetime8 = -57 % ((56 - param2) / 43);
            ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
            MusicVoice.a(this.getTooltip(15), 22546);
            return param3;
          }
          if (ScrollPaneWithFooter.field_Pb == 0) {
            var6Lifetime9 = -57 % ((56 - param2) / 43);
            ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
            MusicVoice.a(this.getTooltip(15), 22546);
            return param3;
          }
          this.handlePointerRelease(ResourcePreparationEntry.pointerY, MusicPatch.pointerX, param0, this, 19223, param1);
          var8 = gd.draggedWidget;
          if (var8 != null) {
            if (var8.listener instanceof WidgetDropListener) {
              ((WidgetDropListener) (var8.listener)).onDrop(-24178, var8, (DropTargetWidget) null);
            }
            gd.draggedWidget = null;
          }
          var6Lifetime10 = -57 % ((56 - param2) / 43);
          ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
          MusicVoice.a(this.getTooltip(15), 22546);
          return param3;
        }
        if (0 != GameplayAudioEvent.mouseWheelDelta) {
          if (var5 == 0) {
            regionExit1: {
              if (BackgroundScene.pressedButton != 0) {
                if (this.handlePointerPress(this, LoadingProgressDialog.pressX, param1, param0, BackgroundScene.pressedButton, PlayerNameChooserPanel.pressY, 0)) {
                  param3 = false;
                  if (var7 == 0) {
                    break regionExit1;
                  }
                }
                if (0 == MatchingTextValidator.heldButton &&
                  ScrollPaneWithFooter.field_Pb != 0) {
                  this.handlePointerRelease(ResourcePreparationEntry.pointerY, MusicPatch.pointerX, param0, this, 19223, param1);
                  var9 = gd.draggedWidget;
                  if (var9 != null) {
                    if (!(var9.listener instanceof WidgetDropListener)) {
                      gd.draggedWidget = null;
                    } else {
                      ((WidgetDropListener) (var9.listener)).onDrop(-24178, var9, (DropTargetWidget) null);
                      gd.draggedWidget = null;
                    }
                  }
                }
                var6Lifetime1 = -57 % ((56 - param2) / 43);
                ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
                MusicVoice.a(this.getTooltip(15), 22546);
                return param3;
              }
            }
            if (0 != MatchingTextValidator.heldButton) {
              var6Lifetime1Lifetime1 = -57 % ((56 - param2) / 43);
              ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
              MusicVoice.a(this.getTooltip(15), 22546);
              return param3;
            }
            if (ScrollPaneWithFooter.field_Pb == 0) {
              var6Lifetime1Lifetime2 = -57 % ((56 - param2) / 43);
              ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
              MusicVoice.a(this.getTooltip(15), 22546);
              return param3;
            }
            this.handlePointerRelease(ResourcePreparationEntry.pointerY, MusicPatch.pointerX, param0, this, 19223, param1);
            var10 = gd.draggedWidget;
            if (var10 != null) {
              if (var10.listener instanceof WidgetDropListener) {
                ((WidgetDropListener) (var10.listener)).onDrop(-24178, var10, (DropTargetWidget) null);
              }
              gd.draggedWidget = null;
            }
            var6Lifetime1Lifetime3 = -57 % ((56 - param2) / 43);
            ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
            MusicVoice.a(this.getTooltip(15), 22546);
            return param3;
          }
          this.a(GameplayAudioEvent.mouseWheelDelta, MusicPatch.pointerX, param0, -127, ResourcePreparationEntry.pointerY, this, param1);
        }
        regionExit2: {
          if (BackgroundScene.pressedButton != 0) {
            if (this.handlePointerPress(this, LoadingProgressDialog.pressX, param1, param0, BackgroundScene.pressedButton, PlayerNameChooserPanel.pressY, 0)) {
              param3 = false;
              if (var7 == 0) {
                break regionExit2;
              }
            }
            if (var5 == 0) {
              if (0 != MatchingTextValidator.heldButton) {
                var6Lifetime2 = -57 % ((56 - param2) / 43);
                ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
                MusicVoice.a(this.getTooltip(15), 22546);
                return param3;
              }
              if (ScrollPaneWithFooter.field_Pb == 0) {
                var6Lifetime2Lifetime1 = -57 % ((56 - param2) / 43);
                ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
                MusicVoice.a(this.getTooltip(15), 22546);
                return param3;
              }
              this.handlePointerRelease(ResourcePreparationEntry.pointerY, MusicPatch.pointerX, param0, this, 19223, param1);
              var11 = gd.draggedWidget;
              if (var11 == null) {
                var6Lifetime2Lifetime2 = -57 % ((56 - param2) / 43);
                ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
                MusicVoice.a(this.getTooltip(15), 22546);
                return param3;
              }
              if (!(var11.listener instanceof WidgetDropListener)) {
                gd.draggedWidget = null;
                var6Lifetime2Lifetime3 = -57 % ((56 - param2) / 43);
                ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
                MusicVoice.a(this.getTooltip(15), 22546);
                return param3;
              }
              ((WidgetDropListener) (var11.listener)).onDrop(-24178, var11, (DropTargetWidget) null);
              gd.draggedWidget = null;
              var6Lifetime2Lifetime4 = -57 % ((56 - param2) / 43);
              ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
              MusicVoice.a(this.getTooltip(15), 22546);
              return param3;
            }
            this.clearFocus(false);
          }
        }
        if (0 != MatchingTextValidator.heldButton) {
          var6Lifetime3 = -57 % ((56 - param2) / 43);
          ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
          MusicVoice.a(this.getTooltip(15), 22546);
          return param3;
        }
        if (ScrollPaneWithFooter.field_Pb == 0) {
          var6Lifetime4 = -57 % ((56 - param2) / 43);
          ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
          MusicVoice.a(this.getTooltip(15), 22546);
          return param3;
        }
        this.handlePointerRelease(ResourcePreparationEntry.pointerY, MusicPatch.pointerX, param0, this, 19223, param1);
        var12 = gd.draggedWidget;
        if (var12 != null) {
          if (var12.listener instanceof WidgetDropListener) {
            ((WidgetDropListener) (var12.listener)).onDrop(-24178, var12, (DropTargetWidget) null);
          }
          gd.draggedWidget = null;
        }
        var6Lifetime5 = -57 % ((56 - param2) / 43);
        ScrollPaneWithFooter.field_Pb = MatchingTextValidator.heldButton;
        MusicVoice.a(this.getTooltip(15), 22546);
        return param3;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, Widget param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= -125) {
            return false;
          }
          this.textLayout = (WidgetTextLayout) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("oc.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void initializeDiagnosticOverlay(int obfuscationGuard, TextFont font) {
        try {
          SoundCache.diagnosticFont = font;
          bq.renderRateDiagnosticLine = new DiagnosticTextLine();
          PopupWidgetLayer.heapDiagnosticLine = new DiagnosticTextLine();
          if (obfuscationGuard != 1) {
            Widget.c(16);
          }
          LoginCredentials.diagnosticLines = new NodeDeque();
        } catch (RuntimeException initializationFailure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) initializationFailure), "oc.BA(" + obfuscationGuard + ',' + (font != null ? "{...}" : "null") + ')');
        }
    }

    void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        if (layer != 0) {
          if (obfuscationGuard == -11) {
            return;
          }
          this.a(5, -67, -79, true);
          return;
        }
        if (null == this.renderer) {
          if (obfuscationGuard == -11) {
            return;
          }
          this.a(5, -67, -79, true);
          return;
        }
        this.renderer.paintWidget(true, obfuscationGuard - 20607, parentX, this, parentY);
        if (obfuscationGuard == -11) {
          return;
        }
        this.a(5, -67, -79, true);
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 24) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param3, 1595637992, param0, param1)) {
            this.a(param1, param0, 0, param3);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("oc.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1595637992) {
            this.y = -128;
          }
          if (!param3.containsKey(this)) {
            param3.put(this, this);
            return true;
          }
          discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("oc.EA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, boolean param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.isFocused(-86)) {
          var4 = param1;
          if (var4 == 80) {
            return this.tryFocus(true, this);
          }
          if (param2) {
            return false;
          }
          field_p = -38L;
          return false;
        }
        if (this.handleWidgetKey(param1, (byte) 110, this, param0)) {
          return true;
        }
        var4Lifetime1 = param1;
        if (var4Lifetime1 == 80) {
          return this.tryFocus(true, this);
        }
        if (param2) {
          return false;
        }
        field_p = -38L;
        return false;
    }

    int e(byte param0) {
        int var2 = 88 / ((-17 - param0) / 43);
        return 0;
    }

    boolean isFocused(int obfuscationGuard) {
        if (obfuscationGuard > -49) {
          return false;
        }
        return false;
    }

    final static void c(byte param0) {
        if (param0 >= -12) {
          Widget.drawPowerUpMeter(89, -103, -10, (PlayerBoard) null, (MultiplayerMatch) null, (byte) 67);
          o.enabledFeatureMask = 0;
          return;
        }
        o.enabledFeatureMask = 0;
    }

    final static void a(PlatformServices param0, byte param1, java.awt.Canvas param2) {
        try {
          sj.field_f = new MidiSynthesizer();
          sj.field_f.b(0, 9, 128);
          tq.a(22050, true, sj.field_f, param0, 1024, (java.awt.Component) ((Object) param2));
          if (param1 != 60) {
            field_y = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oc.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        field_x = null;
        field_u = null;
        field_y = null;
        if (param0 == -14711) {
          field_v = null;
          textChoiceBodyFont = null;
          field_k = null;
          return;
        }
        field_p = 65L;
        field_v = null;
        textChoiceBodyFont = null;
        field_k = null;
    }

    boolean handlePointerPress(Widget focusRoot, int pointerX, int parentX, int parentY, int button, int pointerY, int obfuscationGuard) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.containsPoint(pointerY, parentY, parentX, 3, pointerX)) {
            this.pressedButton = button;
          }
          if (obfuscationGuard == 0) {
            return false;
          }
          this.e((byte) -99);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("oc.MA(");
          if (focusRoot == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(pointerX).append(',').append(parentX).append(',').append(parentY).append(',').append(button).append(',').append(pointerY).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == 110) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("oc.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(character).append(')').toString());
        }
    }

    final static int d(byte param0) {
        if (param0 != -59) {
          return 73;
        }
        return 1;
    }

    boolean tryFocus(boolean obfuscationGuard, Widget focusRoot) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("oc.CA(").append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void clearFocus(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          Widget.c(-57);
        }
    }

    final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.x).append(",").append(this.y).append(" ").append(this.width).append("x").append(this.height);
          if (null != this.text) {
            discarded$1 = param3.append(" text=\"").append(this.text).append('"');
          }
          if (this.mouseOver) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.isFocused(-102)) {
            discarded$3 = param3.append(" focused");
          }
          if (param2 != 0) {
            this.a((Hashtable) null, 44, -5, (StringBuilder) null);
          }
          if (this.renderer != null) {
            discarded$4 = param3.append(" renderer=");
            if (!(this.renderer instanceof Widget)) {
              discarded$5 = param3.append(this.renderer);
              if (var6 != 0) {
                param3 = this.a(param1 + 1, param0, 24, param3);
              }
            } else {
              param3 = this.a(param1 + 1, param0, 24, param3);
            }
          }
          if (null != this.listener) {
            discarded$6 = param3.append(" listener=");
            if (!(this.listener instanceof Widget)) {
              discarded$7 = param3.append(this.listener);
              if (var6 != 0) {
                param3 = this.a(1 + param1, param0, 24, param3);
              }
            } else {
              param3 = this.a(1 + param1, param0, 24, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("oc.LA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    Widget(String param0, WidgetListener param1) {
        this(param0, PopupWidgetLayer.widgetTheme.field_i, param1);
    }

    void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        int var5_int = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (obfuscationGuard != 0) {
            field_u = (String) null;
          }
          var5_int = this.containsPoint(ResourcePreparationEntry.pointerY, parentY, parentX, 3, MusicPatch.pointerX) ? 1 : 0;
          if ((this.mouseOver ? 1 : 0) != var5_int) {
            stackIn_7_1 = (var5_int != 0);
            this.mouseOver = stackIn_7_1;
            if (null != this.listener) {
              if (!(this.listener instanceof WidgetHoverListener)) {
                return;
              }
              ((WidgetHoverListener) (this.listener)).onMouseOverChanged(-6932, this, var5_int != 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("oc.WA(");
          if (focusRoot == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(',').append(parentY).append(')').toString());
        }
    }

    final boolean containsPoint(int pointerY, int parentY, int parentX, int obfuscationGuard, int pointerX) {
        if (obfuscationGuard != 3) {
          return false;
        }
        if (this.x + parentX > pointerX) {
          return false;
        }
        if (pointerY < parentY + this.y) {
          return false;
        }
        if (pointerX >= this.width + parentX + this.x) {
          return false;
        }
        if (pointerY < this.height + (this.y + parentY)) {
          return true;
        }
        return false;
    }

    final static void writeAbuseReport(int reasonId, int opcode, long reportTargetId, int obfuscationGuard, boolean muteRequested, String playerName) {
        int var7_int = 0;
        BitPacketBuffer stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          TextFieldValidator.outgoingPackets.writeCipheredOpcode(-13413, opcode);
          TextFieldValidator.outgoingPackets.position = TextFieldValidator.outgoingPackets.position + 1;
          var7_int = TextFieldValidator.outgoingPackets.position;
          TextFieldValidator.outgoingPackets.writeLong(-23054, reportTargetId);
          TextFieldValidator.outgoingPackets.writeCp1252String(playerName, obfuscationGuard - 2);
          TextFieldValidator.outgoingPackets.writeByte(31, reasonId);
          stackIn_2_0 = TextFieldValidator.outgoingPackets;
          stackIn_2_1 = -105;
          if (!muteRequested) {
            stackIn_3_2 = 0;
          } else {
            stackIn_3_2 = 1;
          }
          ((BitPacketBuffer) (Object) stackIn_2_0).writeByte(stackIn_2_1, stackIn_3_2);
          TextFieldValidator.outgoingPackets.backfillByteLength((byte) 114, -var7_int + TextFieldValidator.outgoingPackets.position);
          if (obfuscationGuard != 1) {
            field_k = (BufferedFile) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("oc.VA(").append(reasonId).append(',').append(opcode).append(',').append(reportTargetId).append(',').append(obfuscationGuard).append(',').append(muteRequested).append(',');
          if (playerName == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    String getTooltip(int obfuscationGuard) {
        if (obfuscationGuard < 6) {
          this.handleWidgetKey(-58, (byte) -3, (Widget) null, '*');
          if (this.mouseOver) {
            return this.tooltip;
          }
          return null;
        }
        if (this.mouseOver) {
          return this.tooltip;
        }
        return null;
    }

    protected Widget() {
        this.textOffsetX = 0;
        this.textOffsetY = 0;
    }

    Widget(String text, WidgetRenderer renderer, WidgetListener listener) {
        WidgetLayoutProvider var4 = null;
        this.textOffsetX = 0;
        this.textOffsetY = 0;
        try {
          this.text = text;
          this.listener = listener;
          this.renderer = renderer;
          if (this.renderer instanceof WidgetLayoutProvider) {
            var4 = (WidgetLayoutProvider) ((Object) this.renderer);
            this.width = var4.getPreferredWidth(this, 31);
            this.height = var4.getPreferredHeight(this, 46695);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oc.<init>(" + (text != null ? "{...}" : "null") + ',' + (renderer != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ')');
        }
    }

    Widget(int x, int y, int width, int height, WidgetRenderer renderer, WidgetListener listener) {
        this.textOffsetX = 0;
        this.textOffsetY = 0;
        try {
          this.x = x;
          this.width = width;
          this.listener = listener;
          this.renderer = renderer;
          this.y = y;
          this.height = height;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oc.<init>(" + x + ',' + y + ',' + width + ',' + height + ',' + (renderer != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_u = "Brick Extension";
        field_y = new int[]{44, 45, 8, 3};
    }
}
