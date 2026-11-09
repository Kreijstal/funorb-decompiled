/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationStatusWidget extends InteractiveWidget {
    static String field_G;
    private int animationTicks;
    private InputValidator validator;
    static String thisPasswordContainsYourText;

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        try {
          this.animationTicks = this.animationTicks + 1;
          int var5_int = 46 / ((guard + 25) / 45);
          super.update(parentX, 54, root, parentY);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "vr.U(" + parentX + ',' + guard + ',' + (root != null ? "{...}" : "null") + ',' + parentY + ')');
        }
    }

    final static void detachKeyboardInput(java.awt.Component component, int resetValue) {
        try {
          component.removeKeyListener(EmailCredentials.field_e);
          component.removeFocusListener(EmailCredentials.field_e);
          LegacyOpenGlEnvironmentWaterEffect.field_i = resetValue;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "vr.D(" + (component != null ? "{...}" : "null") + ',' + resetValue + ')');
        }
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        Sprite var16 = null;
        Sprite var17 = null;
        Sprite var14 = null;
        Sprite var15 = null;
        int var9 = 0;
        int var10 = 0;
        UiWidget var12 = null;
        int var11 = Sumoblitz.field_L ? 1 : 0;
        UiWidget var12Lifetime1;
        UiWidget var12Lifetime2;
        UiWidget var12Lifetime3;
        UiWidget var12Lifetime4;
        UiWidget var12Lifetime5;
        UiWidget var12Lifetime6;
        UiWidget var12Lifetime1Lifetime1;
        UiWidget var12Lifetime1Lifetime2;
        UiWidget var12Lifetime1Lifetime3;
        int var9Lifetime1;
        int var10Lifetime1;
        super.renderLayer(parentX, parentY, (byte) -122, layer);
        if (0 != layer) {
          return;
        }
        int var5 = (this.width >> 1) + (this.x + parentX);
        int var6 = (this.height >> 1) + parentY + this.y;
        ValidationStatus var8 = this.validator.getStatus(-103);
        if (GameInstructions.DEBOUNCING == var8) {
          var16 = ToolkitRasterStateCacheEntry.field_m[0];
          var9 = var16.paddedWidth << 1;
          var10 = var16.paddedHeight << 1;
          if (ValidationStatusSpriteCache.scratch == null) {
            ValidationStatusSpriteCache.scratch = new Sprite(var9, var10);
            LegacyVertexAttribute.pushSpriteRaster(7161, ValidationStatusSpriteCache.scratch);
            var16.drawRotatedScaled(112, 144, var16.paddedWidth << 4, var16.paddedHeight << 4, -this.animationTicks << 10, 4096);
            ClientException.popRasterState((byte) 126);
            ValidationStatusSpriteCache.scratch.drawAdditive(var5 - var16.paddedWidth, -var16.paddedHeight + var6, 256);
            if (guard >= -35) {
              var12 = (UiWidget) null;
              this.update(86, -51, (UiWidget) null, 16);
            }
            return;
          }
          if (var9 > ValidationStatusSpriteCache.scratch.width) {
            ValidationStatusSpriteCache.scratch = new Sprite(var9, var10);
            LegacyVertexAttribute.pushSpriteRaster(7161, ValidationStatusSpriteCache.scratch);
            var16.drawRotatedScaled(112, 144, var16.paddedWidth << 4, var16.paddedHeight << 4, -this.animationTicks << 10, 4096);
            ClientException.popRasterState((byte) 126);
            ValidationStatusSpriteCache.scratch.drawAdditive(var5 - var16.paddedWidth, -var16.paddedHeight + var6, 256);
            if (guard >= -35) {
              var12Lifetime4 = (UiWidget) null;
              this.update(86, -51, (UiWidget) null, 16);
            }
            return;
          }
          if (var10 <= ValidationStatusSpriteCache.scratch.height) {
            LegacyVertexAttribute.pushSpriteRaster(7161, ValidationStatusSpriteCache.scratch);
            SoftwareRasterizer.clear();
            var16.drawRotatedScaled(112, 144, var16.paddedWidth << 4, var16.paddedHeight << 4, -this.animationTicks << 10, 4096);
            ClientException.popRasterState((byte) 126);
            ValidationStatusSpriteCache.scratch.drawAdditive(var5 - var16.paddedWidth, -var16.paddedHeight + var6, 256);
            if (guard >= -35) {
              var12Lifetime5 = (UiWidget) null;
              this.update(86, -51, (UiWidget) null, 16);
            }
            return;
          }
          ValidationStatusSpriteCache.scratch = new Sprite(var9, var10);
          LegacyVertexAttribute.pushSpriteRaster(7161, ValidationStatusSpriteCache.scratch);
          var16.drawRotatedScaled(112, 144, var16.paddedWidth << 4, var16.paddedHeight << 4, -this.animationTicks << 10, 4096);
          ClientException.popRasterState((byte) 126);
          ValidationStatusSpriteCache.scratch.drawAdditive(var5 - var16.paddedWidth, -var16.paddedHeight + var6, 256);
          if (guard >= -35) {
            var12Lifetime6 = (UiWidget) null;
            this.update(86, -51, (UiWidget) null, 16);
          }
          return;
        }
        if (FullscreenPromptController.PENDING == var8) {
          var17 = ToolkitRasterStateCacheEntry.field_m[0];
          var9Lifetime1 = var17.paddedWidth << 1;
          var10Lifetime1 = var17.paddedHeight << 1;
          if (ValidationStatusSpriteCache.scratch == null) {
            ValidationStatusSpriteCache.scratch = new Sprite(var9Lifetime1, var10Lifetime1);
            LegacyVertexAttribute.pushSpriteRaster(7161, ValidationStatusSpriteCache.scratch);
            var17.drawRotatedScaled(112, 144, var17.paddedWidth << 4, var17.paddedHeight << 4, -this.animationTicks << 10, 4096);
            ClientException.popRasterState((byte) 126);
            ValidationStatusSpriteCache.scratch.drawAdditive(var5 - var17.paddedWidth, -var17.paddedHeight + var6, 256);
            if (guard >= -35) {
              var12Lifetime1 = (UiWidget) null;
              this.update(86, -51, (UiWidget) null, 16);
            }
            return;
          }
          if (var9Lifetime1 > ValidationStatusSpriteCache.scratch.width) {
            ValidationStatusSpriteCache.scratch = new Sprite(var9Lifetime1, var10Lifetime1);
            LegacyVertexAttribute.pushSpriteRaster(7161, ValidationStatusSpriteCache.scratch);
            var17.drawRotatedScaled(112, 144, var17.paddedWidth << 4, var17.paddedHeight << 4, -this.animationTicks << 10, 4096);
            ClientException.popRasterState((byte) 126);
            ValidationStatusSpriteCache.scratch.drawAdditive(var5 - var17.paddedWidth, -var17.paddedHeight + var6, 256);
            if (guard >= -35) {
              var12Lifetime1Lifetime1 = (UiWidget) null;
              this.update(86, -51, (UiWidget) null, 16);
            }
            return;
          }
          if (var10Lifetime1 > ValidationStatusSpriteCache.scratch.height) {
            ValidationStatusSpriteCache.scratch = new Sprite(var9Lifetime1, var10Lifetime1);
            LegacyVertexAttribute.pushSpriteRaster(7161, ValidationStatusSpriteCache.scratch);
            var17.drawRotatedScaled(112, 144, var17.paddedWidth << 4, var17.paddedHeight << 4, -this.animationTicks << 10, 4096);
            ClientException.popRasterState((byte) 126);
            ValidationStatusSpriteCache.scratch.drawAdditive(var5 - var17.paddedWidth, -var17.paddedHeight + var6, 256);
            if (guard < -35) {
              return;
            }
            var12Lifetime1Lifetime2 = (UiWidget) null;
            this.update(86, -51, (UiWidget) null, 16);
            return;
          }
          LegacyVertexAttribute.pushSpriteRaster(7161, ValidationStatusSpriteCache.scratch);
          SoftwareRasterizer.clear();
          var17.drawRotatedScaled(112, 144, var17.paddedWidth << 4, var17.paddedHeight << 4, -this.animationTicks << 10, 4096);
          ClientException.popRasterState((byte) 126);
          ValidationStatusSpriteCache.scratch.drawAdditive(var5 - var17.paddedWidth, -var17.paddedHeight + var6, 256);
          if (guard < -35) {
            return;
          }
          var12Lifetime1Lifetime3 = (UiWidget) null;
          this.update(86, -51, (UiWidget) null, 16);
          return;
        }
        if (AccountConnectionPhase.INVALID == var8) {
          var14 = ToolkitRasterStateCacheEntry.field_m[2];
          var14.drawAdditive(-(var14.width >> 1) + var5, var6 - (var14.height >> 1), 256);
          if (guard < -35) {
            return;
          }
          var12Lifetime2 = (UiWidget) null;
          this.update(86, -51, (UiWidget) null, 16);
          return;
        }
        if (var8 == PerlinNoiseFactory.VALID) {
          var15 = ToolkitRasterStateCacheEntry.field_m[1];
          var15.drawAdditive(var5 - (var15.width >> 1), var6 - (var15.height >> 1), 256);
        }
        if (guard < -35) {
          return;
        }
        var12Lifetime3 = (UiWidget) null;
        this.update(86, -51, (UiWidget) null, 16);
    }

    final String hoveredTooltip(int guard) {
        if (this.hovered) {
          return this.validator.getMessage(3690);
        }
        if (guard != -6696) {
          this.renderLayer(-102, 53, (byte) -40, -114);
          return null;
        }
        return null;
    }

    final boolean requestFocus(UiWidget root, byte guard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard == 61) {
            return false;
          }
          this.animationTicks = 103;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vr.Q(");
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_G = null;
        thisPasswordContainsYourText = null;
        if (param0 != -21433) {
          java.awt.Component var2 = (java.awt.Component) null;
          ValidationStatusWidget.detachKeyboardInput((java.awt.Component) null, -80);
        }
    }

    ValidationStatusWidget(InputValidator validation) {
        try {
          this.validator = validation;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "vr.<init>(" + (validation != null ? "{...}" : "null") + ')');
        }
    }

    static {
        thisPasswordContainsYourText = "This password contains your Player Name, and would be easy to guess";
    }
}
