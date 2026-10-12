/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PaletteRegionMap {
    static String[] field_a;
    private int anchorColour;
    static String field_i;
    private NodeDeque[] anchorsByRegion;
    private int regionCount;
    private int ignoredColour;
    static int[] field_f;
    static AnimationPlayer field_g;
    private int[] regionByPaletteIndex;
    private IndexedSprite sourceImage;

    final NodeDeque getAnchors(int regionId, int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          return (NodeDeque) null;
        }
        return this.anchorsByRegion[1 + regionId];
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        if (11 == p.field_b) {
          AnimationFrameSet.d((byte) -13);
        }
        SpellCastRequest.a(dd.field_a, TelepopEvent.field_C, UnitSpell.field_e, -1);
        if (param0 <= 106) {
          return;
        }
        try {
          pt.a(0, 12, param1, 0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pr.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void addAnchor(int row, int column, int regionId, byte obfuscationGuard) {
        regionId++;
        if (this.anchorsByRegion[regionId] == null) {
          this.anchorsByRegion[regionId] = new NodeDeque();
        }
        if (obfuscationGuard >= -95) {
          this.getRegionAt(-65, (byte) -99, 28);
        }
        this.anchorsByRegion[regionId].addLast((byte) -119, (IntrusiveNode) (new RegionAnchor(column, row)));
    }

    final static boolean b(int param0) {
        int var1;
        boolean stackIn_4_0 = false;
        var1 = -21 % ((param0 + 25) / 55);
        stackIn_4_0 = (null != ActionSpell.field_e) && (ActionSpell.field_e.a((byte) 103));
        return stackIn_4_0;
    }

    final static void a(PacketBuffer param0, byte param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          java.awt.Canvas var6 = null;
          byte[] var7 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            if (param1 != -84) {
              var6 = (java.awt.Canvas) null;
              PaletteRegionMap.a((byte) -8, (java.awt.Canvas) null);
            }
            var7 = new byte[24];
            var2 = var7;
            if (le.field_d != null) {
              try {
                le.field_d.seek(-1, 0L);
                le.field_d.readArray(0, var7);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                param0.writeBytes(var2, 0, 24, 81);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            param0.writeBytes(var2, 0, 24, 81);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("pr.I(");
            if (param0 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ClientUiComponent a(int param0, int param1, int param2, int param3, int param4, int param5, BitmapFont param6, int param7, int param8, int param9, int param10, byte param11, int param12) {
        int var13_int = 0;
        RuntimeException var13 = null;
        ClientUiComponent var14 = null;
        ClientUiComponent stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13_int = -103 % ((-17 - param11) / 52);
          var14 = new ClientUiComponent(0L, (ClientUiComponent) null);
          var14.skinSprites = tn.a(true, param12, param3);
          var14.matchedButtonSkinSprites = tn.a(true, param4, param8);
          var14.heldPressSkinSprites = tn.a(true, param1, param7);
          var14.selectedSkinSprites = tn.a(true, param10, param9);
          var14.disabledSkinSprites = tn.a(true, param2, param0);
          var14.textColour = param5;
          var14.font = param6;
          stackIn_1_0 = var14;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_4_0 = var13;
          stackIn_4_1 = new StringBuilder().append("pr.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        if (param0 != 7742) {
          field_g = (AnimationPlayer) null;
        }
        field_a = null;
        field_f = null;
    }

    final RgbSprite extractRegionSprite(int regionId, int colour, byte obfuscationGuard, int padding) {
        int x = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        int minimumX;
        int maximumX;
        int minimumY;
        int maximumY;
        int y;
        int var10;
        RgbSprite sprite;
        int paletteIndex;
        int region;
        int outputPaletteIndex;
        int outputRegion;
        int var16;
        int outputX;
        int height;
        int width;
        int outputY;
        int var13Lifetime1;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        minimumX = this.sourceImage.pixelWidth;
        maximumX = 0;
        minimumY = this.sourceImage.pixelHeight;
        maximumY = 0;
        var10 = 6 / ((17 - obfuscationGuard) / 40);
        for (y = this.sourceImage.offsetY; y < this.sourceImage.pixelHeight; y++) {
          for (x = this.sourceImage.offsetX; this.sourceImage.pixelWidth > x; x++) {
            paletteIndex = this.sourceImage.pixelIndices[x + this.sourceImage.pixelWidth * y];
            region = this.regionByPaletteIndex[paletteIndex];
            if (~regionId == ~region) {
              minimumX = Math.min(minimumX, x);
              maximumX = Math.max(maximumX, x);
              minimumY = Math.min(minimumY, y);
              maximumY = Math.max(maximumY, y);
            }
          }
        }
        height = 1 + (maximumY - minimumY);
        width = 1 + (maximumX - minimumX);
        if (width <= 0) {
          return null;
        }
        if (0 >= height) {
          return null;
        }
        width = width + 2 * padding;
        height = height + padding * 2;
        sprite = new RgbSprite(width, height);
        for (outputY = minimumY; maximumY >= outputY; outputY++) {
          outputX = minimumX;
          var13Lifetime1 = outputX;
          while (outputX < maximumX) {
            outputPaletteIndex = this.sourceImage.pixelIndices[outputY * this.sourceImage.pixelWidth + outputX];
            outputRegion = this.regionByPaletteIndex[outputPaletteIndex];
            stackIn_20_0 = sprite.pixels;
            stackIn_20_1 = (padding + (-minimumY + outputY)) * width + (outputX - (minimumX - padding));
            if (outputRegion == regionId) {
              stackIn_21_2 = colour;
            } else {
              stackIn_21_2 = 0;
            }
            stackIn_20_0[stackIn_20_1] = stackIn_21_2;
            outputX++;
          }
        }
        sprite.canvasWidth = width + minimumX;
        sprite.canvasHeight = height + minimumY;
        sprite.offsetY = minimumY;
        sprite.offsetX = minimumX;
        return sprite;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        if (param3 != 0) {
          PaletteRegionMap.b(-81);
        }
        DiskCacheWorker.a(mi.field_l, 2, jn.field_d, param0, gl.field_c, param1, param2);
    }

    PaletteRegionMap(IndexedSprite sourceImage, int ignoredColour, int anchorColour) {
        try {
          this.regionCount = 0;
          this.sourceImage = sourceImage;
          this.anchorColour = anchorColour;
          this.ignoredColour = ignoredColour;
          this.indexRegions(-91);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pr.<init>(" + (sourceImage != null ? "{...}" : "null") + ',' + ignoredColour + ',' + anchorColour + ')');
        }
    }

    final int getRegionAt(int x, byte obfuscationGuard, int y) {
        int relativeX;
        int relativeY;
        int paletteIndex;
        int regionId;
        int var8;
        relativeX = -this.sourceImage.offsetX + x;
        relativeY = y - this.sourceImage.offsetY;
        if (relativeX >= 0 &&
          relativeX < -this.sourceImage.offsetX + this.sourceImage.pixelWidth &&
          0 <= relativeY &&
          this.sourceImage.pixelHeight - this.sourceImage.offsetY > relativeY) {
          if (this.sourceImage.pixelIndices.length <= relativeX + this.sourceImage.pixelWidth * relativeY) {
            return -1;
          }
          var8 = -17 % ((-35 - obfuscationGuard) / 36);
          paletteIndex = this.sourceImage.pixelIndices[relativeX + relativeY * this.sourceImage.pixelWidth];
          regionId = this.regionByPaletteIndex[paletteIndex];
          return regionId;
        }
        return -1;
    }

    private final void indexRegions(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        int paletteIndex;
        int anchorPaletteIndex;
        int var4;
        int paletteEntry;
        int pixelPaletteIndex;
        int var7;
        int ignoredPaletteIndex;
        int lastRegionId;
        int pixelIndex;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.anchorsByRegion = new NodeDeque[257];
        this.regionByPaletteIndex = new int[256];
        for (paletteIndex = 0; paletteIndex < this.regionByPaletteIndex.length; paletteIndex++) {
          this.regionByPaletteIndex[paletteIndex] = -1;
        }
        ignoredPaletteIndex = -1;
        anchorPaletteIndex = -1;
        var4 = 101 % ((-34 - obfuscationGuard) / 39);
        for (paletteEntry = 0; this.sourceImage.palette.length > paletteEntry; paletteEntry++) {
          if (this.ignoredColour != this.sourceImage.palette[paletteEntry]) {
            if (this.sourceImage.palette[paletteEntry] == this.anchorColour) {
              anchorPaletteIndex = paletteEntry;
            }
          } else {
            ignoredPaletteIndex = paletteEntry;
          }
        }
        lastRegionId = -1;
        for (pixelIndex = 0; pixelIndex < this.sourceImage.pixelIndices.length; pixelIndex++) {
          pixelPaletteIndex = this.sourceImage.pixelIndices[pixelIndex] & 255;
          if (ignoredPaletteIndex != pixelPaletteIndex) {
            if (anchorPaletteIndex != pixelPaletteIndex) {
              if (this.regionByPaletteIndex[pixelPaletteIndex] == -1) {
                fieldTemp$0 = this.regionCount;
                this.regionCount = this.regionCount + 1;
                this.regionByPaletteIndex[pixelPaletteIndex] = fieldTemp$0;
              }
              lastRegionId = this.regionByPaletteIndex[pixelPaletteIndex];
            } else {
              this.addAnchor(pixelIndex / this.sourceImage.pixelWidth, pixelIndex % this.sourceImage.pixelWidth, lastRegionId, (byte) -121);
            }
          }
        }
    }

    final void drawSelectedRegions(byte obfuscationGuard, int left, boolean[] enabledRegions, int top, IndexedSprite colourImage) {
        int y = 0;
        int x = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int clipLeft = 0;
        int clipTop = 0;
        int clipRight = 0;
        int clipBottom = 0;
        int sourceIndex = 0;
        int paletteIndex = 0;
        int regionId = 0;
        int colour = 0;
        int destinationIndex = 0;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int[] pixels = null;
        var18 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          pixels = SoftwareRaster.pixels;
          var20 = pixels;
          var19 = var20;
          var6 = var19;
          clipLeft = this.sourceImage.offsetX;
          clipTop = this.sourceImage.offsetY;
          if (obfuscationGuard <= 79) {
            this.getAnchors(52, 9);
          }
          clipRight = this.sourceImage.pixelWidth;
          if (SoftwareRaster.clipLeft > clipLeft + left) {
            clipLeft = SoftwareRaster.clipLeft - left;
          }
          if (clipRight + left >= SoftwareRaster.clipRight) {
            clipRight = -left + SoftwareRaster.clipRight;
          }
          clipBottom = this.sourceImage.pixelHeight;
          if (SoftwareRaster.clipTop > clipTop + top) {
            clipTop = -top + SoftwareRaster.clipTop;
          }
          if (SoftwareRaster.clipBottom <= clipBottom + top) {
            clipBottom = -top + SoftwareRaster.clipBottom;
          }
          for (y = clipTop; y < clipBottom; y++) {
            for (x = clipLeft; x < clipRight; x++) {
              sourceIndex = x + y * this.sourceImage.pixelWidth;
              paletteIndex = 255 & this.sourceImage.pixelIndices[sourceIndex];
              regionId = this.regionByPaletteIndex[paletteIndex];
              if (0 <= regionId &&
                regionId < enabledRegions.length &&
                enabledRegions[regionId]) {
                colour = colourImage.palette[255 & colourImage.pixelIndices[sourceIndex]];
                destinationIndex = SoftwareRaster.width * (top + y) + (left + x);
                if (pixels.length <= destinationIndex) {
                  System.out.println(pixels.length);
                }
                pixels[destinationIndex] = colour;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_34_0 = var6_ref;
          stackIn_34_1 = new StringBuilder().append("pr.D(").append(obfuscationGuard).append(',').append(left).append(',');
          if (enabledRegions == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(top).append(',');
          if (colourImage == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    static {
        field_a = new String[]{"This unit has plate armour, giving +<%0>0% defence against melee attacks.", "This unit has padded armour, giving +<%0>0% defence against ranged attacks.", "This unit has enchanted armour, giving +<%0>0% defence against magical attacks.", "This unit has dragon armour, giving +<%0>0% defence against flame attacks.", "This unit has runic armour, giving +<%0>0% defence against all attacks.", "This unit has camoflaged armour, giving +<%0>0% defence against aerial attacks.", "This unit has stone armour, protecting it from <%0> attacks but halving its speed.", "This unit has granite armour, protecting it from <%0> attacks but immobilising it."};
        field_f = new int[]{0, 70, 74, 78, 82, 86, 90, 103, 104};
    }
}
