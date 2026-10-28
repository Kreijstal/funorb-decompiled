/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationHelpWidget extends TextHotspotWidget {
    static String field_G;
    private Sprite indicatorScratch;
    static Sprite field_I;
    private int animationTick;
    static int field_H;
    private ValidationSource validation;
    static String field_J;
    private String helpText;
    static byte[] field_K;

    ValidationHelpWidget(ValidationSource param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, PairedTextColumns.defaultTextPainter(true));
        try {
          this.helpText = param1;
          this.validation = param0;
          this.setBounds(param4, param3, param2, true, param5);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "lf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        String var5;
        Object var18 = null;
        Object var23 = null;
        int var13 = EscapeVector.obfuscationControl;
        ValidationState var6 = this.validation.validationState(17124);
        if (of.field_f == var6) {
          String var17 = ContentTransitionDialog.field_bb;
          if (!var17.equals(this.text)) {
            this.text = var17;
            this.rebuildHotspots(0);
          }
          super.drawLayer(screenY, (byte) 109, layer, screenX);
          var6 = this.validation.validationState(17124);
          WidgetTextLayout var28 = (WidgetTextLayout) ((Object) this.painter);
          int var9 = screenX + this.x;
          int var10 = var28.textOriginY((UiComponent) (this), screenY, -16956) + (var28.ensureTextLayout((UiComponent) (this), 90).height(0) >> 1);
          if (guard <= 85) {
            return;
          }
          if (of.field_f == var6) {
            Sprite var20 = EditableTextWidget.field_E[0];
            int var11 = var20.fullWidth << 1;
            int var12 = var20.fullHeight << 1;
            if (this.indicatorScratch == null) {
              this.indicatorScratch = new Sprite(var11, var12);
              TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -84);
            } else if (var11 > this.indicatorScratch.width) {
              this.indicatorScratch = new Sprite(var11, var12);
              TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -84);
            } else if (var12 <= this.indicatorScratch.height) {
              TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -7);
              SoftwareRasterizer.clearFramebuffer();
            } else {
              this.indicatorScratch = new Sprite(var11, var12);
              TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -84);
            }
            var20.drawRotatedScaledBilinear(112, 144, var20.fullWidth << 4, var20.fullHeight << 4, -this.animationTick << 10, 4096);
            RasterRestoreSupport.popRasterState((byte) 120);
            this.indicatorScratch.drawAdditive(-(var20.fullWidth >> 1) + var9, -var20.fullHeight + var10, 256);
            return;
          }
          if (var6 != ug.field_c) {
            if (ArchiveProvider.field_a == var6) {
              Sprite var22 = EditableTextWidget.field_E[2];
              var22.drawAdditive(var9, -(var22.height >> 1) + var10, 256);
              return;
            }
            if (IsaacRandom.field_h != var6) {
              return;
            }
            Sprite var21 = EditableTextWidget.field_E[1];
            var21.drawAdditive(var9, -(var21.height >> 1) + var10, 256);
            return;
          }
          Sprite var19 = EditableTextWidget.field_E[0];
          int var11Lifetime3 = var19.fullWidth << 1;
          int var12Lifetime3 = var19.fullHeight << 1;
          if (this.indicatorScratch != null &&
            var11Lifetime3 <= this.indicatorScratch.width &&
            var12Lifetime3 <= this.indicatorScratch.height) {
            TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -7);
            SoftwareRasterizer.clearFramebuffer();
          } else {
            this.indicatorScratch = new Sprite(var11Lifetime3, var12Lifetime3);
            TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -84);
          }
          var19.drawRotatedScaledBilinear(112, 144, var19.fullWidth << 4, var19.fullHeight << 4, -this.animationTick << 10, 4096);
          RasterRestoreSupport.popRasterState((byte) 120);
          this.indicatorScratch.drawAdditive(-(var19.fullWidth >> 1) + var9, -var19.fullHeight + var10, 256);
          return;
        }
        regionExit1: {
          regionExit2: {
            if (ug.field_c != var6) {
              var5 = this.validation.validationMessage(44);
              if (var5 != null) {
                if (!var5.equals(this.text)) {
                  break regionExit2;
                }
                break regionExit1;
              }
              var5 = this.helpText;
            } else {
              var5 = ContentTransitionDialog.field_bb;
            }
            if (var5.equals(this.text)) {
              break regionExit1;
            }
          }
          this.text = var5;
          this.rebuildHotspots(0);
        }
        super.drawLayer(screenY, (byte) 109, layer, screenX);
        ValidationState var6Lifetime1 = this.validation.validationState(17124);
        WidgetTextLayout var29 = (WidgetTextLayout) ((Object) this.painter);
        int var9Lifetime1 = screenX + this.x;
        int var10Lifetime1 = var29.textOriginY((UiComponent) (this), screenY, -16956) + (var29.ensureTextLayout((UiComponent) (this), 90).height(0) >> 1);
        if (guard <= 85) {
          return;
        }
        if (of.field_f == var6Lifetime1) {
          Sprite var25 = EditableTextWidget.field_E[0];
          int var11Lifetime1 = var25.fullWidth << 1;
          int var12Lifetime1 = var25.fullHeight << 1;
          if (this.indicatorScratch == null) {
            this.indicatorScratch = new Sprite(var11Lifetime1, var12Lifetime1);
            TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -84);
          } else if (var11Lifetime1 > this.indicatorScratch.width) {
            this.indicatorScratch = new Sprite(var11Lifetime1, var12Lifetime1);
            TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -84);
          } else if (var12Lifetime1 <= this.indicatorScratch.height) {
            TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -7);
            SoftwareRasterizer.clearFramebuffer();
          } else {
            this.indicatorScratch = new Sprite(var11Lifetime1, var12Lifetime1);
            TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -84);
          }
          var25.drawRotatedScaledBilinear(112, 144, var25.fullWidth << 4, var25.fullHeight << 4, -this.animationTick << 10, 4096);
          RasterRestoreSupport.popRasterState((byte) 120);
          this.indicatorScratch.drawAdditive(-(var25.fullWidth >> 1) + var9Lifetime1, -var25.fullHeight + var10Lifetime1, 256);
          return;
        }
        if (var6Lifetime1 != ug.field_c) {
          if (ArchiveProvider.field_a == var6Lifetime1) {
            Sprite var27 = EditableTextWidget.field_E[2];
            var27.drawAdditive(var9Lifetime1, -(var27.height >> 1) + var10Lifetime1, 256);
            return;
          }
          if (IsaacRandom.field_h != var6Lifetime1) {
            return;
          }
          Sprite var26 = EditableTextWidget.field_E[1];
          var26.drawAdditive(var9Lifetime1, -(var26.height >> 1) + var10Lifetime1, 256);
          return;
        }
        Sprite var24 = EditableTextWidget.field_E[0];
        int var11Lifetime2 = var24.fullWidth << 1;
        int var12Lifetime2 = var24.fullHeight << 1;
        if (this.indicatorScratch == null) {
          this.indicatorScratch = new Sprite(var11Lifetime2, var12Lifetime2);
          TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -84);
        } else if (var11Lifetime2 <= this.indicatorScratch.width &&
          var12Lifetime2 <= this.indicatorScratch.height) {
          TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -7);
          SoftwareRasterizer.clearFramebuffer();
        } else {
          this.indicatorScratch = new Sprite(var11Lifetime2, var12Lifetime2);
          TickClock.pushSpriteRaster(this.indicatorScratch, (byte) -84);
        }
        var24.drawRotatedScaledBilinear(112, 144, var24.fullWidth << 4, var24.fullHeight << 4, -this.animationTick << 10, 4096);
        RasterRestoreSupport.popRasterState((byte) 120);
        this.indicatorScratch.drawAdditive(-(var24.fullWidth >> 1) + var9Lifetime1, -var24.fullHeight + var10Lifetime1, 256);
        return;
    }

    final void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        if (guard != -14472) {
          return;
        }
        try {
          this.animationTick = this.animationTick + 1;
          super.updateHover(guard ^ 0, offsetY, offsetX, root);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "lf.Q(" + guard + ',' + offsetY + ',' + offsetX + ',' + (root != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean containsIdentifierVariant(String identifier, byte guard, String text) {
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        try {
          text = MouseWheelInput.replaceCharacter(-1, '_', text, "");
          String var3 = DynamicTerrainRenderer.a(identifier, false);
          if (guard != 37) {
            field_J = (String) null;
          }
          boolean stackIn_7_0 = (text.indexOf(identifier) != -1) || (-1 != text.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("lf.A(");
          if (identifier == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(',');
          if (text == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_J = null;
        field_K = null;
        int var1 = -35 % ((guard - 34) / 58);
        field_I = null;
        field_G = null;
    }

    final String getTooltip(int guard) {
        if (guard == 1) {
          return null;
        }
        return (String) null;
    }

    final boolean focusNext(int guard, UiComponent root) {
        String stackIn_7_2 = null;
        try {
          if (guard == -4659) {
            return false;
          }
          field_I = (Sprite) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("lf.M(").append(guard).append(',');
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_J = "Player Name: ";
        field_G = "Play the game without logging in just yet";
        field_H = 1;
    }
}
