/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ObjectSpriteSet {
    static PcmSample field_c;
    static PcmStreamMixer field_e;
    private Sprite[] sprites;
    private Sprite[] glowSprites;
    private SpriteOffset[] glowOffsets;
    static TrackerMusicDefinition[] field_d;
    static boolean canvasFocused;

    private final Sprite cropRotatedSprite(byte guard, int angle, Sprite original, Sprite padded, Sprite rotated) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          int var6_int = (padded.fullWidth - original.fullWidth) / 2;
          int var7 = (-original.fullHeight + padded.fullHeight) / 2;
          SpriteOffset var12 = new SpriteOffset(var6_int, var7);
          var6_int = -original.fullWidth + (padded.fullWidth - var6_int);
          var7 = -original.fullHeight + (padded.fullHeight - var7);
          SpriteOffset var9 = new SpriteOffset(var6_int, var7);
          SpriteOffset var13 = CanvasRenderSupport.selectQuarterTurnOffset(angle, (byte) 120, var9, var12);
          SpriteOffset var10 = this.rotatedDimensions(angle, original.fullHeight, -29295, original.fullWidth);
          if (guard <= 21) {
            ObjectSpriteSet.releaseStatics(104);
          }
          Sprite var11 = new Sprite(var10.x, var10.y);
          SoftwareRasterizer.saveClip(DisplayNameForm.field_M);
          var11.bindAsFramebuffer();
          rotated.drawTransparent(-var13.x, -var13.y);
          AlphaContainer.field_D.bindRaster(124);
          SoftwareRasterizer.restoreClip(DisplayNameForm.field_M);
          Sprite stackIn_3_0 = var11;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var6;
          StringBuilder stackIn_6_1 = new StringBuilder().append("rk.J(").append(guard).append(',').append(angle).append(',');
          if (original == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (padded == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (rotated == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final SpriteOffset rotatedDimensions(int angle, int height, int guard, int width) {
        int var5 = width;
        int var6 = height;
        if (angle == 16384) {
          var6 = width;
          var5 = height;
        }
        if (angle == 32768) {
          var6 = height;
          var5 = width;
        }
        if (angle == 49152) {
          var6 = width;
          var5 = height;
        }
        if (guard == -29295) {
          return new SpriteOffset(var5, var6);
        }
        this.glowOffsets = (SpriteOffset[]) null;
        return new SpriteOffset(var5, var6);
    }

    public static void releaseStatics(int guard) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (guard < 120) {
          ObjectSpriteSet.releaseStatics(53);
        }
    }

    final Sprite glowSprite(int guard, int angle) {
        if (angle == 0) {
          return this.glowSprites[0];
        }
        if (angle == 16384) {
          return this.glowSprites[1];
        }
        if (guard > -63) {
          ObjectSpriteSet.setLegacyMenuAnchors(26, -60, 78);
          if (angle == 32768) {
            return this.glowSprites[2];
          }
          if (angle == 49152) {
            return this.glowSprites[3];
          }
          return null;
        }
        if (angle == 32768) {
          return this.glowSprites[2];
        }
        if (angle == 49152) {
          return this.glowSprites[3];
        }
        return null;
    }

    private final SpriteOffset oppositeGlowOffset(Sprite glow, int guard, Sprite sprite, SpriteOffset offset) {
        String stackIn_19_2 = null;
        String stackIn_22_2 = null;
        String stackIn_25_2 = null;
        try {
          int var5_int = sprite.fullWidth;
          int var6 = sprite.fullHeight;
          if (guard != -1) {
            Sprite var10 = (Sprite) null;
            Sprite discarded$0 = this.rotateSprite((Sprite) null, 124, 55);
          }
          int var7 = offset.x;
          int var8 = offset.y;
          if (glow != null) {
            if (offset.x < 0) {
              var5_int = var5_int - offset.x;
            }
            if (offset.y < 0) {
              var6 = var6 - offset.y;
            }
            var7 = var5_int - glow.fullWidth;
            var8 = -glow.fullHeight + var6;
            if (offset.x >= 0) {
              var7 = var7 - offset.x;
            }
            if (offset.y >= 0) {
              var8 = var8 - offset.y;
            }
          }
          SpriteOffset var9 = new SpriteOffset(var7, var8);
          SpriteOffset stackIn_15_0 = var9;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var5;
          StringBuilder stackIn_18_1 = new StringBuilder().append("rk.B(");
          if (glow == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          StringBuilder stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(guard).append(',');
          if (sprite == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          StringBuilder stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (offset == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final SpriteOffset glowOffset(byte guard, int angle) {
        if (angle == 0) {
          return this.glowOffsets[0];
        }
        if (16384 == angle) {
          return this.glowOffsets[1];
        }
        if (angle == 32768) {
          return this.glowOffsets[2];
        }
        int var3 = 6 % ((-71 - guard) / 35);
        if (angle == 49152) {
          return this.glowOffsets[3];
        }
        return null;
    }

    private final Sprite padToSquare(Sprite sprite, int verticalDivisor) {
        String stackIn_8_2 = null;
        try {
          int var3_int = sprite.fullWidth;
          if (sprite.fullHeight > var3_int) {
            var3_int = sprite.fullHeight;
          }
          Sprite var4 = new Sprite(var3_int, var3_int);
          int var5 = (var3_int - sprite.fullWidth) / 2;
          int var6 = (-sprite.fullHeight + var3_int) / verticalDivisor;
          SoftwareRasterizer.saveClip(DisplayNameForm.field_M);
          var4.bindAsFramebuffer();
          sprite.drawTransparent(var5, var6);
          AlphaContainer.field_D.bindRaster(verticalDivisor ^ 126);
          SoftwareRasterizer.restoreClip(DisplayNameForm.field_M);
          Sprite stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("rk.A(");
          if (sprite == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(verticalDivisor).append(')').toString());
        }
    }

    final Sprite sprite(boolean guard, int angle) {
        if (guard) {
          field_e = (PcmStreamMixer) null;
          if (0 == angle) {
            return this.sprites[0];
          }
          if (angle == 16384) {
            return this.sprites[1];
          }
          if (angle == 32768) {
            return this.sprites[2];
          }
          if (49152 == angle) {
            return this.sprites[3];
          }
          return null;
        }
        if (0 == angle) {
          return this.sprites[0];
        }
        if (angle == 16384) {
          return this.sprites[1];
        }
        if (angle == 32768) {
          return this.sprites[2];
        }
        if (49152 == angle) {
          return this.sprites[3];
        }
        return null;
    }

    ObjectSpriteSet(Sprite sprite, Sprite glow, SpriteOffset offset) {
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        try {
          this.sprites = new Sprite[DialWidgetPainter.field_h.length];
          this.glowSprites = new Sprite[DialWidgetPainter.field_h.length];
          this.glowOffsets = new SpriteOffset[DialWidgetPainter.field_h.length];
          for (int var4_int = 0; this.sprites.length > var4_int; var4_int++) {
            int var5 = DialWidgetPainter.field_h[var4_int];
            this.sprites[var4_int] = this.rotateSprite(sprite, -67, var5);
            this.glowSprites[var4_int] = this.rotateSprite(glow, -53, var5);
            SpriteOffset var6 = this.oppositeGlowOffset(glow, -1, sprite, offset);
            this.glowOffsets[var4_int] = CanvasRenderSupport.selectQuarterTurnOffset(var5, (byte) 124, var6, offset);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var4;
          StringBuilder stackIn_7_1 = new StringBuilder().append("rk.<init>(");
          if (sprite == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (glow == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (offset == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void setLegacyMenuAnchors(int secondaryAnchor, int centerX, int guard) {
        if (guard != 11710) {
          return;
        }
        ClientException.field_e = centerX;
        LoginDialog.field_nb = secondaryAnchor;
    }

    private final Sprite rotateSprite(Sprite sprite, int guard, int angle) {
        String stackIn_11_2 = null;
        try {
          if (sprite == null) {
            return null;
          }
          int var4_int = 4096;
          Sprite var5 = this.padToSquare(sprite, 2);
          if (guard > -37) {
            Sprite stackIn_5_0 = (Sprite) null;
            return stackIn_5_0;
          }
          int var6 = var5.fullWidth;
          int var7 = var5.fullHeight;
          int var8 = var6 / 2;
          int var9 = var7 / 2;
          Sprite var10 = new Sprite(var6, var7);
          SoftwareRasterizer.saveClip(DisplayNameForm.field_M);
          var10.bindAsFramebuffer();
          var5.drawCenteredRotatedScaled(var8, (byte) 34, var4_int, angle, var9);
          AlphaContainer.field_D.bindRaster(124);
          SoftwareRasterizer.restoreClip(DisplayNameForm.field_M);
          Sprite var11 = this.cropRotatedSprite((byte) 100, angle, sprite, var5, var10);
          Sprite stackIn_7_0 = var11;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var4;
          StringBuilder stackIn_10_1 = new StringBuilder().append("rk.E(");
          if (sprite == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(',').append(angle).append(')').toString());
        }
    }

    static {
    }
}
