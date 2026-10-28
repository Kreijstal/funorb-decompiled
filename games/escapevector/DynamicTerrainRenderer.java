/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DynamicTerrainRenderer {
    static int field_b;
    static Sprite field_w;
    private int[] savedClip;
    private int[] fullTileMask;
    private int[][] boundaryMasks;
    private TileSpriteCacheEntry[][] boundaryTiles;
    private int tilesHigh;
    private boolean[] columnScratch;
    private int tilesWide;
    private TileSpriteCacheEntry[][] solidTiles;
    private boolean[][] paddedPixels;
    int boundaryColor;
    private int[][] terrainMasks;
    int field_B;
    private boolean[] dirtyTiles;
    static String field_t;
    private int stripeColorB;
    private int stripeColorA;
    private int[] emptyTileMask;
    private int[][] tileNeighborhood;
    private boolean[] pixelNeighborhood;
    static int[] field_i;
    private int tileHeight;
    private int[] stripeColors;
    private int tileWidth;
    private Sprite[] compositeSurfaces;
    private int[] floorGradient;
    static String field_m;

    private final void fillPaddedCorners(int[][] tiles, boolean[][] pixels, byte guard) {
        try {
          pixels[0][0] = this.isMaskPixelSet(this.tileWidth - 1, -1 + this.tileHeight, (byte) -23, tiles[0]);
          pixels[0][1 + this.tileWidth] = this.isMaskPixelSet(0, -1 + this.tileHeight, (byte) -66, tiles[2]);
          pixels[1 + this.tileHeight][0] = this.isMaskPixelSet(this.tileWidth - 1, 0, (byte) -78, tiles[6]);
          pixels[this.tileHeight + 1][1 + this.tileWidth] = this.isMaskPixelSet(0, 0, (byte) -44, tiles[8]);
          if (guard < 63) {
            this.rebuildBoundaryMasks(16);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "na.VA(" + (tiles != null ? "{...}" : "null") + ',' + (pixels != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    private final void fillRow(int color, int[] destination, int offset) {
        offset = offset - 1;
        for (int var4 = 0; var4 < this.tileWidth; var4++) {
          offset++;
          destination[offset] = color;
        }
    }

    private final int[][] allocateEmptyMaskGrid(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        int[][] var5 = new int[this.tilesHigh * this.tilesWide][];
        int[][] var2 = var5;
        int var3 = 0;
        do {
          if (var3 >= var5.length) {
            if (guard != 1) {
              this.pixelNeighborhood = (boolean[]) null;
            }
            break;
          }
          var5[var3] = this.emptyTileMask;
          var3++;
        } while (var4 == 0);
        return var2;
    }

    private final void drawBelowWorld(int guard, int firstTileY, int pixelOffsetY) {
        int stackIn_7_0 = 0;
        int var9 = EscapeVector.obfuscationControl;
        if (guard >= -96) {
          this.advanceCacheRow((TileSpriteCacheEntry[][]) null, 102);
        }
        int var4 = -pixelOffsetY;
        int var5 = firstTileY;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var5 >= this.tilesHigh))) {
          stackIn_7_0 = var4 + this.tileHeight;
          if (var9 == 0) {
            var4 = stackIn_7_0;
            var5++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_7_0 = this.floorGradient[0];
        }
        int var6 = stackIn_7_0;
        int var7 = this.floorGradient[1];
        int var8 = 1 + (-var4 + 479);
        if (0 >= var8) {
          return;
        }
        SoftwareRasterizer.fillVerticalGradient(0, var4, 640, var8, var6, var7);
        this.drawBackdropBelow(var4, (byte) 104);
        return;
    }

    private final int maskRow(int[] mask, byte guard, int row) {
        String stackIn_16_2 = null;
        try {
          int var4_int = -12 / ((43 - guard) / 44);
          if (this.fullTileMask == mask) {
            int stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (this.emptyTileMask == mask) {
            int stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          if (row < 0) {
            int stackIn_10_0 = 0;
            return stackIn_10_0;
          }
          if (row >= this.tileHeight) {
            return 0;
          }
          int stackIn_12_0 = mask[row];
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("na.D(");
          if (mask == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(',').append(row).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_t = null;
        field_i = null;
        field_m = null;
        field_w = null;
        if (guard != 3) {
          DynamicTerrainRenderer.createButtonRow(-86, (int[]) null, 29, -25, (BinaryBitmapFont) null, (String[]) null, (int[]) null, false, (int[]) null);
        }
    }

    private final boolean isBitClear(int bits, int bit) {
        int var3 = 1 << bit;
        int var4 = bits & var3;
        return var4 == 0 ? true : false;
    }

    private final boolean[][] buildPaddedPixels(int guard, int[][] tiles) {
        String stackIn_5_2 = null;
        try {
          this.fillPaddedCenter((byte) 121, tiles, this.paddedPixels);
          this.fillPaddedEdges(tiles, (byte) 62, this.paddedPixels);
          int var3_int = -64 / ((guard + 50) / 40);
          this.fillPaddedCorners(tiles, this.paddedPixels, (byte) 107);
          boolean[][] stackIn_1_0 = this.paddedPixels;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var3;
          StringBuilder stackIn_4_1 = new StringBuilder().append("na.T(").append(guard).append(',');
          if (tiles == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final boolean isMaskPixelSet(int x, int y, byte guard, int[] mask) {
        String stackIn_8_2 = null;
        try {
          int var5_int = this.maskRow(mask, (byte) 125, y);
          if (guard >= -18) {
            return true;
          }
          boolean var6 = (this.isBitSet(var5_int, x));
          boolean stackIn_4_0 = var6;
          return (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5;
          StringBuilder stackIn_7_1 = new StringBuilder().append("na.FA(").append(x).append(',').append(y).append(',').append(guard).append(',');
          if (mask == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final TileSpriteCacheEntry[][] allocateTileCache(int startRow, TileSpriteCacheEntry[][] cache, int tileX, boolean guard, int tileY) {
        String stackIn_28_2 = null;
        int var14 = EscapeVector.obfuscationControl;
        try {
          if (cache != null) {
            TileSpriteCacheEntry[][] stackIn_4_0 = (TileSpriteCacheEntry[][]) (cache);
            return stackIn_4_0;
          }
          int var6_int = 640;
          int var7 = 480;
          int var8 = 1 + var6_int / this.tileWidth;
          int var9 = var7 / this.tileHeight + 1;
          cache = new TileSpriteCacheEntry[var9][var8];
          int var10 = startRow;
          scanLoop1: while (true) {
            int stackIn_7_0 = ~var10;
            scanLoop2: while (true) {
              if (stackIn_7_0 > ~var9) {
                int var11 = var10 + tileY;
                int var12 = 0;
                while (var8 > var12) {
                  stackIn_7_0 = var12 + tileX;
                  if (var14 != 0) {
                    continue scanLoop2;
                  }
                  int var13 = stackIn_7_0;
                  while (var13 < 0) {
                    var13 = var13 + this.tilesWide;
                  }
                  while (var13 >= this.tilesWide) {
                    var13 = var13 - this.tilesWide;
                  }
                  cache[var10][var12] = new TileSpriteCacheEntry(this.tileWidth, this.tileHeight, var11, var13);
                  var12++;
                }
                var10++;
                if (var14 == 0) {
                  continue scanLoop1;
                }
              }
              break;
            }
            break;
          }
          TileSpriteCacheEntry[][] stackIn_24_0 = (TileSpriteCacheEntry[][]) (cache);
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var6;
          StringBuilder stackIn_27_1 = new StringBuilder().append("na.DA(").append(startRow).append(',');
          if (cache == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(tileX).append(',').append(guard).append(',').append(tileY).append(')').toString());
        }
    }

    private final boolean isBitSet(int bits, int bit) {
        int var3 = 1 << bit;
        int var4 = bits & var3;
        return var4 != 0 ? true : false;
    }

    private final int[] setMaskPixel(int row, int[] mask, boolean value, int guard, int column) {
        String stackIn_15_2 = null;
        try {
          if (row >= 0 &&
            row < this.tileHeight) {
            if (column >= 0 &&
              column < this.tileWidth) {
              mask = this.expandTileMask(row, mask, column, 72);
              int var6_int = this.maskRow(mask, (byte) -47, row);
              var6_int = this.setRowBit(value, var6_int, column, guard + guard);
              mask[row] = var6_int;
              int[] stackIn_11_0 = (int[]) (mask);
              return stackIn_11_0;
            }
            int[] stackIn_9_0 = (int[]) (mask);
            return stackIn_9_0;
          }
          int[] stackIn_4_0 = (int[]) (mask);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var6;
          StringBuilder stackIn_14_1 = new StringBuilder().append("na.F(").append(row).append(',');
          if (mask == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(value).append(',').append(guard).append(',').append(column).append(')').toString());
        }
    }

    final void invalidateTileNeighborhood(int tileX, int tileY, boolean guard) {
        int var7 = EscapeVector.obfuscationControl;
        if (tileY >= 0) {
          if (this.tilesHigh <= tileY) {
            return;
          }
          if (0 <= tileX) {
            if (tileX >= this.tilesWide) {
              return;
            }
            if (!guard) {
              this.tilesHigh = 38;
            }
            int var4 = -1;
            scanLoop1: while (true) {
              int stackIn_11_0 = -2;
              while (stackIn_11_0 <= ~var4) {
                if (var7 == 0) {
                  if (var4 + tileY >= 0 &&
                    this.tilesHigh > tileY + var4) {
                    int var5 = this.tilesWide * (var4 + tileY);
                    int var6 = -1;
                    while (1 >= var6) {
                      stackIn_11_0 = var6 + tileX;
                      if (stackIn_11_0 >= 0 &&
                        var6 + tileX < this.tilesWide) {
                        this.dirtyTiles[var6 + tileX + var5] = true;
                      }
                      var6++;
                    }
                  }
                  var4++;
                  continue scanLoop1;
                }
                break;
              }
              break;
            }
            return;
          }
        }
    }

    private final void drawBoundaryTiles(int pixelOffsetX, byte guard, int pixelOffsetY) {
        boolean stackIn_15_0 = false;
        boolean stackIn_18_1 = false;
        int var13 = EscapeVector.obfuscationControl;
        int var4 = this.boundaryTiles.length;
        int var5 = this.boundaryTiles[0].length;
        int var6 = -this.tileHeight - pixelOffsetY;
        if (guard != 1) {
          return;
        }
        int var7 = 0;
        while (true) {
          int stackIn_4_0 = ~var4;
          if (stackIn_4_0 < ~var7) {
            var6 = var6 + this.tileHeight;
            int var8 = -this.tileWidth - pixelOffsetX;
            if (var13 == 0) {
              int var9 = 0;
              while (var9 < var5) {
                var8 = var8 + this.tileWidth;
                TileSpriteCacheEntry var10 = this.boundaryTiles[var7][var9];
                stackIn_4_0 = var10.tileY;
                if (stackIn_4_0 >= 0) {
                  stackIn_15_0 = (this.tilesHigh > var10.tileY);
                } else {
                  stackIn_15_0 = false;
                }
                boolean var11 = stackIn_15_0;
                int[] var12 = this.tileMaskAt(var10.tileY, -2981, var10.tileX, this.boundaryMasks);
                boolean stackIn_17_0 = var11;
                stackIn_18_1 = !(this.emptyTileMask == var12);
                boolean var11Lifetime1 = stackIn_17_0 & stackIn_18_1;
                if (var11Lifetime1) {
                  var10.sprite.drawTransparent(var8, var6);
                }
                var9++;
              }
              var7++;
              continue;
            }
          }
          return;
        }
    }

    final static void acceptChatMessage(int guard, ChatMessage message) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        String stackIn_25_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (null == message.text) {
            return;
          }
          boolean decompiledFrameCompleted0 = true;
          if (message.messageIdHigh16 != 0 ||
            message.messageIdLow24 != 0) {
            int var2_int = 0;
            while (!(LoginStage.field_b <= var2_int)) {
              ChatMessage var3 = IterableNodeHashTable.field_d[var2_int];
              stackIn_17_0 = var3.messageType;
              stackIn_17_1 = 2;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_17_0 == stackIn_17_1 &&
                message.messageIdHigh16 == var3.messageIdHigh16 &&
                var3.messageIdLow24 == message.messageIdLow24) {
                return;
              }
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_17_0 = guard;
            stackIn_17_1 = 19956;
          }
          if (stackIn_17_0 != stackIn_17_1) {
            field_b = -79;
          }
          if (null == message.quickChatResponses) {
          }
          ChatHistorySupport.appendMessage(message, 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_24_0 = var2;
          StringBuilder stackIn_24_1 = new StringBuilder().append("na.C(").append(guard).append(',');
          if (message == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void copyMaskColumn(int start, boolean[] source, int length, boolean[][] destination, int guard, int column) {
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          int var7_int = 0;
          while (var7_int < length) {
            boolean var8 = (source[var7_int + start]);
            destination[start + var7_int][column] = (var8);
            var7_int++;
            if (var9 != 0) {
              return;
            }
          }
          if (guard != -23372) {
            int discarded$4 = this.maskColumn(48, -27, (int[]) null);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var7;
          StringBuilder stackIn_11_1 = new StringBuilder().append("na.LA(").append(start).append(',');
          if (source == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(length).append(',');
          if (destination == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(guard).append(',').append(column).append(')').toString());
        }
    }

    final void renderTerrain(int viewportWidth, int cameraX, int cameraY) {
        int var12 = EscapeVector.obfuscationControl;
        int var4 = 0;
        int var5 = 0;
        int var6 = this.tileWidth * this.tilesWide;
        int var7 = cameraX;
        scanLoop1: while (true) {
          if (var7 < 0) {
            var7 = var7 + var6;
            if (var12 == 0) {
              continue;
            }
          } else {
            while (var6 <= var7) {
              var7 = var7 - var6;
              if (var12 != 0) {
                break scanLoop1;
              }
            }
            var4 = var7 / this.tileWidth;
            var5 = var7 % this.tileWidth;
          }
          break;
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = this.tilesHigh * this.tileHeight;
        int var11 = cameraY;
        scanLoop2: while (true) {
          if (0 > var11) {
            var8 = var8 - this.tilesHigh;
            var11 = var11 + var10;
            if (var12 == 0) {
              continue;
            }
          } else if (cameraY >= 0) {
            var8 = var11 / this.tileHeight;
            if (var12 == 0) {
              break scanLoop2;
            }
          }
          var8 = var8 + var11 / this.tileHeight;
          break;
        }
        int var9Lifetime1 = var11 % this.tileHeight;
        this.renderScrollingBackdrop(false, cameraY);
        this.solidTiles = this.allocateTileCache(viewportWidth - 640, this.solidTiles, var4, false, var8);
        this.positionCache((byte) -66, this.solidTiles, var4, var8);
        this.updateSolidTiles((byte) 122, var8, var4);
        this.renderMaskedBackdrop(var9Lifetime1, var5, (byte) 110);
        this.boundaryTiles = this.allocateTileCache(0, this.boundaryTiles, var4, true, var8);
        this.positionCache((byte) -66, this.boundaryTiles, var4, var8);
        this.updateBoundaryTiles((byte) 89, var8, var4);
        this.drawBoundaryTiles(var5, (byte) 1, var9Lifetime1);
        this.drawBelowWorld(viewportWidth ^ -744, var8, var9Lifetime1);
        if (viewportWidth != 640) {
          DynamicTerrainRenderer.calculateButtonGap(93, -16, 127, -111);
        }
        return;
    }

    private final void drawBackdropBelow(int y, byte guard) {
        SoftwareRasterizer.saveClip(this.savedClip);
        SoftwareRasterizer.setClip(0, y, 639, 479);
        this.compositeSurfaces[0].drawTransparent(0, 0);
        if (guard != 104) {
          field_w = (Sprite) null;
        }
        SoftwareRasterizer.restoreClip(this.savedClip);
    }

    private final boolean isFullRow(int bits) {
        return bits == -1;
    }

    private final boolean isDirty(int tileY, int guard, int tileX) {
        if (tileY < 0) {
          return false;
        }
        if (this.tilesHigh <= tileY) {
          return false;
        }
        if (guard != 2) {
          this.fillStripedBackdrop(-80, 10, -58);
        }
        if (tileX >= 0 &&
          this.tilesWide > tileX) {
          return this.dirtyTiles[tileX + tileY * this.tilesWide];
        }
        return false;
    }

    final static String reverseString(String text, boolean guard) {
        String stackIn_12_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          int var2_int = text.length();
          if (guard) {
            String stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          char[] var3 = new char[var2_int];
          int var4 = 0;
          while (var2_int > var4) {
            var3[-1 + (var2_int - var4)] = text.charAt(var4);
            var4++;
            if (var5 == 0) {
              continue;
            }
            break;
          }
          String stackIn_8_0 = new String(var3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var2;
          StringBuilder stackIn_11_1 = new StringBuilder().append("na.FB(");
          if (text == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void updateSolidTiles(byte guard, int firstTileY, int firstTileX) {
        int var13 = EscapeVector.obfuscationControl;
        int var4 = this.solidTiles.length;
        int var5 = this.solidTiles[0].length;
        int var6 = 47 % ((guard - 75) / 36);
        int var7 = 0;
        scanLoop1: while (true) {
          int stackIn_2_0 = var7;
          if (stackIn_2_0 < var4 &&
            var13 == 0) {
            int var8 = 0;
            while (var8 < var5) {
              int var9 = firstTileY + var7;
              stackIn_2_0 = var8 + firstTileX;
              int var10 = stackIn_2_0;
              while (var10 < 0) {
                var10 = var10 + this.tilesWide;
              }
              while (this.tilesWide <= var10) {
                var10 = var10 - this.tilesWide;
              }
              TileSpriteCacheEntry var11 = this.solidTiles[var7][var8];
              boolean stackIn_18_0 = !(!this.isDirty(var9, 2, var10));
              boolean var12 = stackIn_18_0;
              var12 = ((var12) | var11.dirty);
              if (var12) {
                var11.tileX = var10;
                var11.tileY = var9;
                this.rasterizeTileMask(var9, this.terrainMasks, 1, 0, var11.sprite.pixels, var10);
                var11.dirty = false;
              }
              var8++;
            }
            var7++;
            continue scanLoop1;
          }
          break;
        }
        return;
    }

    private final int[] buildBoundaryMask(boolean[][] pixels, int guard, int[] mask) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          int var4_int = 14 % ((58 - guard) / 57);
          int var5 = 0;
          scanLoop1: while (true) {
            int stackIn_3_0 = var5;
            scanLoop2: while (stackIn_3_0 < this.tileHeight) {
              int var6 = this.maskRow(mask, (byte) 108, var5);
              int var7 = 0;
              while (this.tileWidth > var7) {
                boolean var8 = (this.isBitSet(var6, var7));
                boolean[] var13 = this.readPixelNeighborhood(var7, pixels, var5, (byte) 110);
                boolean var10 = (this.isBoundaryPixel(var13, false));
                boolean stackOut_6_0 = this.xor((var10), (var8), 0);
                stackIn_3_0 = stackOut_6_0 ? 1 : 0;
                boolean stackIn_7_0 = stackOut_6_0;
                if (var11 != 0) {
                  continue scanLoop2;
                }
                if (stackIn_7_0 ||
                  var11 != 0) {
                  mask = this.setMaskPixel(var5, mask, (var10), 0, var7);
                }
                var7++;
              }
              var5++;
              if (var11 == 0) {
                continue scanLoop1;
              }
              break;
            }
            break;
          }
          int[] stackIn_14_0 = (int[]) (mask);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var4;
          StringBuilder stackIn_17_1 = new StringBuilder().append("na.G(");
          if (pixels == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(guard).append(',');
          if (mask == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void fillMaskedRow(int color, int bits, int[] destination, int offset) {
        offset = offset - 1;
        for (int var5 = 0; var5 < this.tileWidth; var5++) {
          offset++;
          if (!this.isBitClear(bits, var5)) {
            destination[offset] = color;
          }
        }
    }

    private final void updateBoundaryTiles(byte guard, int firstTileY, int firstTileX) {
        int var12 = EscapeVector.obfuscationControl;
        if (guard <= 62) {
          boolean discarded$0 = this.isBitSet(94, 29);
        }
        int var4 = this.boundaryTiles.length;
        int var5 = this.boundaryTiles[0].length;
        int var6 = 0;
        scanLoop1: while (true) {
          int stackIn_4_0 = ~var6;
          if (stackIn_4_0 > ~var4 &&
            var12 == 0) {
            int var7 = 0;
            while (var5 > var7) {
              int var8 = var6 + firstTileY;
              stackIn_4_0 = var7 + firstTileX;
              int var9 = stackIn_4_0;
              while (0 > var9) {
                var9 = var9 + this.tilesWide;
              }
              while (var9 >= this.tilesWide) {
                var9 = var9 - this.tilesWide;
              }
              boolean stackIn_20_0 = !(!this.isDirty(var8, 2, var9));
              boolean var10 = stackIn_20_0;
              if (var10) {
                this.rebuildBoundaryTile((byte) 105, var9, var8);
              }
              TileSpriteCacheEntry var11 = this.boundaryTiles[var6][var7];
              var10 = ((var10) | var11.dirty);
              if (var10) {
                var11.tileX = var9;
                var11.tileY = var8;
                this.rasterizeTileMask(var8, this.boundaryMasks, this.boundaryColor, 0, var11.sprite.pixels, var9);
                var11.dirty = false;
              }
              var7++;
            }
            var6++;
            continue scanLoop1;
          }
          break;
        }
        return;
    }

    private final int setRowBit(boolean value, int bits, int bit, int guard) {
        if (bit >= 0 &&
          this.tileWidth > bit) {
          int var5 = 1 << bit;
          int var6 = ~var5;
          if (guard != 0) {
            this.emptyTileMask = (int[]) null;
          }
          int var7 = bits & var6;
          if (value) {
            bits = var7 | var5;
          }
          if (!value ||
            EscapeVector.obfuscationControl != 0) {
            bits = var7;
          }
          return bits;
        }
        return bits;
    }

    private final boolean isBoundaryPixel(boolean[] neighbors, boolean guard) {
        String stackIn_24_2 = null;
        try {
          if (guard) {
            this.retreatCacheRow((TileSpriteCacheEntry[][]) null, (byte) 54);
          }
          if (!neighbors[4]) {
            return false;
          }
          if (!neighbors[1]) {
            return true;
          }
          if (!neighbors[3]) {
            return true;
          }
          if (!neighbors[5]) {
            return true;
          }
          if (neighbors[7]) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var3;
          StringBuilder stackIn_23_1 = new StringBuilder().append("na.WA(");
          if (neighbors == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void applyRasterMask(int[] mask, boolean guard, int[] destination) {
        String stackIn_31_2 = null;
        String stackIn_34_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (!guard) {
            DynamicTerrainRenderer.acceptChatMessage(-40, (ChatMessage) null);
          }
          int var4_int = destination.length / 8;
          int var5 = 0;
          int var6 = 0;
          while (var6 < var4_int) {
            if (var7 != 0) {
              return;
            }
            int incrementValue$0 = var5;
            var5++;
            if (0 == mask[incrementValue$0]) {
              destination[var5 - 1] = 0;
            }
            if (mask[var5++] == 0) {
              destination[var5 - 1] = 0;
            }
            if (mask[var5++] == 0) {
              destination[-1 + var5] = 0;
            }
            if (mask[var5++] == 0) {
              destination[var5 - 1] = 0;
            }
            if (mask[var5++] == 0) {
              destination[var5 - 1] = 0;
            }
            int incrementValue$5 = var5;
            var5++;
            if (0 == mask[incrementValue$5]) {
              destination[var5 - 1] = 0;
            }
            if (mask[var5++] == 0) {
              destination[-1 + var5] = 0;
            }
            int incrementValue$7 = var5;
            var5++;
            if (0 == mask[incrementValue$7]) {
              destination[-1 + var5] = 0;
            }
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_30_0 = var4;
          StringBuilder stackIn_30_1 = new StringBuilder().append("na.HA(");
          if (mask == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          StringBuilder stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(guard).append(',');
          if (destination == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final boolean[] readPixelNeighborhood(int pixelX, boolean[][] pixels, int pixelY, byte guard) {
        String stackIn_17_2 = null;
        int var13 = EscapeVector.obfuscationControl;
        try {
          int var5_int = 3;
          int var6 = 3;
          if (guard <= 84) {
            this.clearDirty(65, -13, 112);
          }
          int var7 = pixelY + 1 - 1;
          int var8 = 1 + (pixelX - 1);
          int var9 = 0;
          scanLoop1: while (var6 > var9) {
            int var10 = 0;
            while (true) {
              if (var5_int > var10) {
                boolean var11 = (pixels[var7 + var9][var8 + var10]);
                int var12 = var9 * var5_int + var10;
                this.pixelNeighborhood[var12] = (var11);
                var10++;
                if (var13 == 0) {
                  continue;
                }
              } else {
                var9++;
              }
              break;
            }
            if (var13 == 0) {
              continue scanLoop1;
            }
            break;
          }
          boolean[] stackIn_13_0 = this.pixelNeighborhood;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("na.PA(").append(pixelX).append(',');
          if (pixels == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(pixelY).append(',').append(guard).append(')').toString());
        }
    }

    final static void rankRatingRows(int rowLimit, int startIndex) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          LoginCredentials.sortRatingIndices((byte) -116, AccountTermsPanel.field_J, rowLimit, ArchiveRequest.field_t, true, TextLayoutLine.field_e, startIndex);
          int var2_int = 0;
          do {
            if (!(AccountTermsPanel.field_J > var2_int)) {
              LoginCredentials.sortRatingIndices((byte) -128, AccountTermsPanel.field_J + rowLimit, rowLimit + rowLimit, AlternateUsernameCredentials.field_r, false, TextLayout.field_d, rowLimit);
              break;
            }
            LegacyStyleNode.field_q[var2_int + rowLimit] = var2_int;
            var2_int++;
          } while (var3 == 0);
          if (AccountTermsPanel.field_J > rowLimit) {
            AccountTermsPanel.field_J = rowLimit;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "na.TA(" + rowLimit + ',' + startIndex + ')');
        }
    }

    private final void rasterizeTileMask(int tileY, int[][] tiles, int color, int guard, int[] destination, int tileX) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        int var13 = EscapeVector.obfuscationControl;
        try {
          int[] var14 = this.tileMaskAt(tileY, guard - 2981, tileX, tiles);
          int[] var7 = var14;
          this.clearRows(destination, guard);
          if (this.emptyTileMask == var14) {
            return;
          }
          int var8 = -this.tileWidth;
          int var9 = 0;
          while (var9 < this.tileHeight) {
            var8 = var8 + this.tileWidth;
            int var10 = this.maskRow(var14, (byte) 89, var9);
            boolean var11 = (this.isEmptyRow(var10));
            if (var13 != 0) {
              return;
            }
            if (!var11 ||
              var13 != 0) {
              if (this.isFullRow(var10)) {
                this.fillRow(color, destination, var8);
              } else {
                this.fillMaskedRow(color, var10, destination, var8);
              }
            }
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_17_0 = runtimeException;
          StringBuilder stackIn_17_1 = new StringBuilder().append("na.QA(").append(tileY).append(',');
          if (tiles == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(color).append(',').append(guard).append(',');
          if (destination == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(tileX).append(')').toString());
        }
    }

    private final void positionCacheY(TileSpriteCacheEntry[][] cache, int tileY, byte guard) {
        String stackIn_14_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var4_int = 117 / ((30 - guard) / 52);
          int var5 = cache[0][0].tileY;
          while (var5 < tileY) {
            var5++;
            this.advanceCacheRow(cache, 0);
            if (var6 != 0) {
              return;
            }
          }
          while (tileY < var5) {
            var5--;
            this.retreatCacheRow(cache, (byte) 122);
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var4;
          StringBuilder stackIn_13_1 = new StringBuilder().append("na.EB(");
          if (cache == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(tileY).append(',').append(guard).append(')').toString());
        }
    }

    private final int[] tileMaskAt(int tileY, int guard, int tileX, int[][] tiles) {
        int stackIn_17_0 = 0;
        String stackIn_33_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (tileY < 0) {
            int[] stackIn_4_0 = this.emptyTileMask;
            return stackIn_4_0;
          }
          if (tileY >= this.tilesHigh) {
            int[] stackIn_8_0 = this.fullTileMask;
            return stackIn_8_0;
          }
          scanLoop1: while (true) {
            if (this.tilesWide <= tileX) {
              tileX = tileX - this.tilesWide;
              if (var6 == 0) {
                continue;
              }
            } else {
              while (tileX < 0) {
                stackIn_17_0 = tileX + this.tilesWide;
                if (var6 != 0) {
                  break scanLoop1;
                }
                tileX = stackIn_17_0;
              }
            }
            stackIn_17_0 = tileX + this.tilesWide * tileY;
            break;
          }
          int var5_int = stackIn_17_0;
          if (0 > var5_int) {
            int[] stackIn_20_0 = this.emptyTileMask;
            return stackIn_20_0;
          }
          if (var5_int >= tiles.length) {
            int[] stackIn_24_0 = this.emptyTileMask;
            return stackIn_24_0;
          }
          if (guard == -2981) {
            int[] stackIn_29_0 = tiles[var5_int];
            return stackIn_29_0;
          }
          int[] stackIn_27_0 = (int[]) null;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_32_0 = var5;
          StringBuilder stackIn_32_1 = new StringBuilder().append("na.EA(").append(tileY).append(',').append(guard).append(',').append(tileX).append(',');
          if (tiles == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    private final boolean xor(boolean left, boolean right, int guard) {
        if (guard != 0) {
          return false;
        }
        return right ^ left;
    }

    private final void renderScrollingBackdrop(boolean guard, int cameraY) {
        int var3 = 640;
        int var4 = 480;
        int var5 = (BoundedRandomAccessFile.activeSession.field_M >> 16) % var3;
        SoftwareRasterizer.saveClip(this.savedClip);
        int var6 = cameraY % var4;
        this.compositeSurfaces[0].bindAsFramebuffer();
        this.fillStripedBackdrop(-126, var5, var6);
        if (guard) {
          this.invalidateTileNeighborhood(98, 82, true);
        }
        int var7 = -var5 + var3;
        int var8 = -var6 + var4;
        int var9 = 0;
        int var10 = var7;
        int var11 = 0;
        int var12 = var8;
        int var13 = -var5;
        int var14 = -var6;
        int var15 = var5 >= 0 ? 1 : -1;
        SoftwareRasterizer.setClip(var9, var11, var10, var12);
        AccountPanelInputSupport.drawCachedEdgeSegments(var14, -24, var13);
        SoftwareRasterizer.setClip(var7 * var15 + var9, var11, var10 + var5 * var15, var12);
        AccountPanelInputSupport.drawCachedEdgeSegments(var14, -123, var13 + var15 * var3);
        SoftwareRasterizer.setClip(var9, var11 + var8, var10, var6 + var12);
        AccountPanelInputSupport.drawCachedEdgeSegments(var14 + var4, -127, var13);
        SoftwareRasterizer.setClip(var9 + var7 * var15, var11 + var8, var10 + var5 * var15, var12 + var6);
        AccountPanelInputSupport.drawCachedEdgeSegments(var14 + var4, -94, var3 * var15 + var13);
        AlphaContainer.field_D.bindRaster(107);
        SoftwareRasterizer.restoreClip(this.savedClip);
    }

    private final void fillPaddedEdges(int[][] tiles, byte guard, boolean[][] pixels) {
        try {
          int[] var13 = tiles[1];
          int var5 = this.maskRow(var13, (byte) 121, -1 + this.tileHeight);
          this.unpackBitRange(1, -1, 0, this.tileWidth, var5, pixels[0]);
          int var7 = 102 / ((guard + 63) / 41);
          int[] var6 = tiles[7];
          int var8 = this.maskRow(var6, (byte) -81, 0);
          this.unpackBitRange(1, -1, 0, this.tileWidth, var8, pixels[1 + this.tileHeight]);
          int[] var9 = tiles[3];
          int var10 = this.maskColumn(-103, this.tileWidth - 1, var9);
          this.unpackBitRange(1, -1, 0, this.tileHeight, var10, this.columnScratch);
          this.copyMaskColumn(1, this.columnScratch, this.tileHeight, pixels, -23372, 0);
          int[] var11 = tiles[5];
          int var12 = this.maskColumn(-95, 0, var11);
          this.unpackBitRange(1, -1, 0, this.tileHeight, var12, this.columnScratch);
          this.copyMaskColumn(1, this.columnScratch, this.tileHeight, pixels, -23372, 1 + this.tileWidth);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "na.DB(" + (tiles != null ? "{...}" : "null") + ',' + guard + ',' + (pixels != null ? "{...}" : "null") + ')');
        }
    }

    private final void retreatCacheColumn(boolean guard, TileSpriteCacheEntry[][] cache) {
        String stackIn_21_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          int var3_int = cache.length;
          if (guard) {
            return;
          }
          int var4 = cache[0].length;
          int var5 = 0;
          while (var3_int > var5) {
            TileSpriteCacheEntry var6 = cache[var5][var4 - 1];
            var6.dirty = true;
            if (var9 != 0) {
              return;
            }
            int var7_int = -1 + var4;
            while (var7_int > 0) {
              cache[var5][var7_int] = cache[var5][-1 + var7_int];
              var7_int--;
            }
            TileSpriteCacheEntry var7 = cache[var5][1];
            var6.tileY = var7.tileY;
            int var8 = var7.tileX - 1;
            while (var8 < 0) {
              var8 = var8 + this.tilesWide;
            }
            var6.tileX = var8;
            cache[var5][0] = var6;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var3;
          StringBuilder stackIn_20_1 = new StringBuilder().append("na.KB(").append(guard).append(',');
          if (cache == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void positionCache(byte guard, TileSpriteCacheEntry[][] cache, int tileX, int tileY) {
        try {
          this.positionCacheX((byte) -3, cache, tileX);
          if (guard != -66) {
            this.stripeColorA = 10;
          }
          this.positionCacheY(cache, tileY, (byte) -40);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "na.O(" + guard + ',' + (cache != null ? "{...}" : "null") + ',' + tileX + ',' + tileY + ')');
        }
    }

    private final void fillPaddedCenter(byte guard, int[][] tiles, boolean[][] pixels) {
        int stackIn_12_0 = 0;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          int[] var4 = tiles[4];
          int var5 = 0;
          scanLoop1: while (true) {
            if (var5 < this.tileHeight) {
              int var6 = this.maskRow(var4, (byte) 111, var5);
              stackIn_12_0 = 0;
              if (var9 != 0) {
                break scanLoop1;
              }
              int var7 = stackIn_12_0;
              while (this.tileWidth > var7) {
                boolean var8 = (this.isBitSet(var6, var7));
                pixels[1 + var5][1 + var7] = (var8);
                var7++;
              }
              var5++;
              continue scanLoop1;
            }
            stackIn_12_0 = guard;
            break;
          }
          if (stackIn_12_0 != 121) {
            int[] discarded$1 = this.expandTileMask(97, (int[]) null, -32, 39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var4_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("na.AB(").append(guard).append(',');
          if (tiles == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (pixels == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void positionCacheX(byte guard, TileSpriteCacheEntry[][] cache, int tileX) {
        String stackIn_39_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          int var4_int = this.tilesWide / 2;
          int var5 = cache[0][0].tileX;
          int var6 = -var5 + tileX;
          if (0 > var6) {
            var6 = var6 + this.tilesWide;
          }
          regionExit1: {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (var5 > tileX) {
              if (var4_int < var6) {
                while (tileX > var5) {
                  if (var4_int < var6) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  this.advanceCacheColumn(cache, 7);
                  var5++;
                  while (true) {
                    if (var5 < this.tilesWide) {
                      break;
                    }
                    var5 = var5 - this.tilesWide;
                    if (var7 != 0) {
                      break regionExit1;
                    }
                  }
                }
                decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
              }
              if (decompiledFrameRemainder0 &&
                decompiledFrameCompleted0) {
                var5 = var5 - this.tilesWide;
              }
            }
            if (decompiledFrameRemainder0 &&
              decompiledFrameCompleted0) {
              while (tileX > var5) {
                if (var4_int < var6) {
                  break;
                }
                this.advanceCacheColumn(cache, 7);
                var5++;
                while (true) {
                  if (var5 < this.tilesWide) {
                    break;
                  }
                  var5 = var5 - this.tilesWide;
                  if (var7 != 0) {
                    break regionExit1;
                  }
                }
              }
            }
            if (guard != -3) {
              this.stripeColorB = -127;
            }
            var6 = var5 - tileX;
          }
          if (var6 < 0) {
            var6 = this.tilesWide + var6;
          }
          if (var5 < tileX &&
            var4_int >= var6) {
            var5 = var5 + this.tilesWide;
          }
          scanLoop2: while (tileX < var5 &&
            var4_int >= var6) {
            this.retreatCacheColumn(false, cache);
            var5--;
            while (true) {
              if (var5 >= 0) {
                continue scanLoop2;
              }
              var5 = var5 + this.tilesWide;
              if (var7 != 0) {
                break;
              }
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_38_0 = var4;
          StringBuilder stackIn_38_1 = new StringBuilder().append("na.HB(").append(guard).append(',');
          if (cache == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(tileX).append(')').toString());
        }
    }

    private final void fillStripedBackdrop(int guard, int pixelX, int pixelY) {
        int var12 = EscapeVector.obfuscationControl;
        int[] var13 = this.stripeColors;
        int[] var4 = var13;
        boolean stackIn_3_0 = !((pixelX & 1 ^ 1 & pixelY) != 1);
        boolean var5 = stackIn_3_0;
        int var7 = -39 % ((guard - 74) / 47);
        if (var5) {
          var13[0] = this.stripeColorB;
          var13[1] = this.stripeColorA;
        }
        if (!var5 ||
          var12 != 0) {
          var13[1] = this.stripeColorB;
          var13[0] = this.stripeColorA;
        }
        int[] var6 = SoftwareRasterizer.pixels;
        int var8 = 640;
        int var9 = 480;
        int var10 = var8 * var9;
        int var11 = 0;
        while (var10 > var11) {
          var6[var11] = var13[SpriteCheckboxPainter.bitwiseAnd(var11, 1)];
          var11++;
          if (var12 == 0) {
            continue;
          }
          break;
        }
    }

    private final void unpackBitRange(int offset, int guard, int firstBit, int length, int bits, boolean[] destination) {
        String stackIn_12_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (guard != -1) {
            DynamicTerrainRenderer.reverseString((String) null, true);
          }
          int var7_int = 0;
          while (length > var7_int) {
            boolean var8 = (this.isBitSet(bits, firstBit + var7_int));
            destination[offset + var7_int] = (var8);
            var7_int++;
            if (var9 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var7;
          StringBuilder stackIn_11_1 = new StringBuilder().append("na.CA(").append(offset).append(',').append(guard).append(',').append(firstBit).append(',').append(length).append(',').append(bits).append(',');
          if (destination == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static int calculateButtonGap(int leadingSlots, int buttonCount, int availableWidth, int contentWidth) {
        int var4 = leadingSlots + buttonCount;
        int var5 = -contentWidth + availableWidth;
        int var6 = var5 / var4;
        return var6;
    }

    private final void retreatCacheRow(TileSpriteCacheEntry[][] cache, byte guard) {
        String stackIn_13_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          int var3_int = cache.length;
          int var4 = cache[0].length;
          int var5 = -89 / ((guard - 76) / 43);
          int var6 = 0;
          while (var6 < var4) {
            TileSpriteCacheEntry var7 = cache[-1 + var3_int][var6];
            var7.dirty = true;
            if (var9 != 0) {
              return;
            }
            int var8_int = var3_int - 1;
            while (var8_int > 0) {
              cache[var8_int][var6] = cache[-1 + var8_int][var6];
              var8_int--;
            }
            TileSpriteCacheEntry var8 = cache[1][var6];
            var7.tileX = var8.tileX;
            var7.tileY = var8.tileY - 1;
            cache[0][var6] = var7;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_12_0 = runtimeException;
          StringBuilder stackIn_12_1 = new StringBuilder().append("na.SA(");
          if (cache == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    private final int maskColumn(int guard, int column, int[] mask) {
        int stackIn_23_0 = 0;
        String stackIn_27_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (mask == this.fullTileMask) {
            int stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (this.emptyTileMask == mask) {
            int stackIn_6_0 = 0;
            return stackIn_6_0;
          }
          if (column >= 0 &&
            column < this.tileHeight) {
            if (guard > -88) {
              this.tilesHigh = 1;
            }
            int var4_int = 0;
            int var5 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (this.tileHeight <= var5))) {
              int var6 = this.maskRow(mask, (byte) -83, var5);
              int var7 = this.isBitSet(var6, column) ? 1 : 0;
              stackIn_23_0 = var7;
              if (var9 == 0) {
                if (stackIn_23_0 != 0) {
                  int var8 = 1 << var5;
                  var4_int = var8 | var4_int;
                }
                var5++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_23_0 = var4_int;
            }
            return stackIn_23_0;
          }
          int stackIn_11_0 = 0;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_26_0 = var4;
          StringBuilder stackIn_26_1 = new StringBuilder().append("na.JA(").append(guard).append(',').append(column).append(',');
          if (mask == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final void advanceCacheColumn(TileSpriteCacheEntry[][] cache, int guard) {
        String stackIn_19_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var3_int = cache.length;
          int var4 = cache[0].length;
          int var6 = -81 / ((guard - 56) / 48);
          int var5 = 0;
          while (var3_int > var5) {
            TileSpriteCacheEntry var7 = cache[var5][0];
            var7.dirty = true;
            if (var10 != 0) {
              return;
            }
            int var8_int = 0;
            while (var8_int < -1 + var4) {
              cache[var5][var8_int] = cache[var5][var8_int + 1];
              var8_int++;
            }
            TileSpriteCacheEntry var8 = cache[var5][-2 + var4];
            var7.tileY = var8.tileY;
            int var9 = 1 + var8.tileX;
            while (var9 >= this.tilesWide) {
              var9 = var9 - this.tilesWide;
            }
            var7.tileX = var9;
            cache[var5][-1 + var4] = var7;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var3;
          StringBuilder stackIn_18_1 = new StringBuilder().append("na.BB(");
          if (cache == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void clearRows(int[] rows, int start) {
        String stackIn_10_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          int var3_int = start;
          while (rows.length > var3_int) {
            rows[var3_int] = 0;
            var3_int++;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var3;
          StringBuilder stackIn_9_1 = new StringBuilder().append("na.E(");
          if (rows == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(start).append(')').toString());
        }
    }

    private final void rebuildBoundaryTile(byte guard, int tileX, int tileY) {
        int[][] var7 = this.tileNeighborhood(tileY, this.terrainMasks, false, tileX);
        int[][] var4 = var7;
        if (guard < 103) {
          return;
        }
        int[] var8 = this.tileMaskAt(tileY, -2981, tileX, this.boundaryMasks);
        int[] var5 = var8;
        boolean[][] var6 = this.buildPaddedPixels(0, var7);
        var5 = this.buildBoundaryMask(var6, 115, var8);
        this.boundaryMasks[tileX + tileY * this.tilesWide] = var5;
        this.clearDirty(tileX, -1, tileY);
    }

    final static LegacyButton[] createButtonRow(int param0, int[] param1, int param2, int param3, BinaryBitmapFont param4, String[] param5, int[] param6, boolean param7, int[] param8) {
        LegacyButton[] stackIn_8_0 = null;
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        int var18 = EscapeVector.obfuscationControl;
        try {
          int var9_int = 3;
          int var10 = param1.length;
          int var11 = ByteArrayPoolSupport.totalButtonTextWidth(param4, (byte) -121, param5);
          int var12 = DynamicTerrainRenderer.calculateButtonGap(1, var10, param0, var11);
          int var13 = PcmResampler.centeredButtonStart(var11, (byte) 122, param0, var10, var12);
          LegacyButton[] var14 = new LegacyButton[var10];
          int var15 = 0;
          if (param7) {
            field_w = (Sprite) null;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var15 >= var10))) {
            int var16 = ArchiveFactorySupport.buttonRowWidth(var12, param4, param5, var13, var15, param3, 0);
            LegacyButton var17 = new LegacyButton(var9_int, param1[var15], param5[var15], param8[var15], param6[var15], param4);
            var17.setPosition((byte) 114, var16, param2);
            stackIn_8_0 = var14;
            if (var18 == 0) {
              stackIn_8_0[var15] = var17;
              var15++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_8_0 = var14;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var9 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var9;
          StringBuilder stackIn_11_1 = new StringBuilder().append("na.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param6 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void rebuildBoundaryMasks(int startRow) {
        int var4 = EscapeVector.obfuscationControl;
        int var2 = startRow;
        while (var2 < this.tilesHigh &&
          var4 == 0) {
          int var3 = 0;
          while (var3 < this.tilesWide) {
            this.rebuildBoundaryTile((byte) 107, var3, var2);
            var3++;
          }
          var2++;
        }
        return;
    }

    private final boolean isEmptyRow(int bits) {
        return bits == 0;
    }

    private final void advanceCacheRow(TileSpriteCacheEntry[][] cache, int guard) {
        String stackIn_13_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var3_int = cache.length;
          int var4 = cache[guard].length;
          int var5 = 0;
          while (var5 < var4) {
            TileSpriteCacheEntry var6 = cache[0][var5];
            var6.dirty = true;
            if (var8 != 0) {
              return;
            }
            int var7_int = 0;
            while (var3_int - 1 > var7_int) {
              cache[var7_int][var5] = cache[var7_int + 1][var5];
              var7_int++;
            }
            TileSpriteCacheEntry var7 = cache[-2 + var3_int][var5];
            var6.tileY = var7.tileY + 1;
            var6.tileX = var7.tileX;
            cache[-1 + var3_int][var5] = var6;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_12_0 = runtimeException;
          StringBuilder stackIn_12_1 = new StringBuilder().append("na.P(");
          if (cache == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void clearDirty(int tileX, int guard, int tileY) {
        if (tileY >= 0) {
          if (this.tilesHigh <= tileY) {
            return;
          }
          if (~tileX <= guard) {
            if (tileX >= this.tilesWide) {
              return;
            }
            this.dirtyTiles[tileY * this.tilesWide + tileX] = false;
            return;
          }
        }
    }

    private final void renderMaskedBackdrop(int pixelOffsetY, int pixelOffsetX, byte guard) {
        int stackIn_14_0 = 0;
        int var14 = EscapeVector.obfuscationControl;
        int var4 = 640;
        SoftwareRasterizer.saveClip(this.savedClip);
        int var5 = 480;
        this.compositeSurfaces[1].bindAsFramebuffer();
        SoftwareRasterizer.setClip(0, 0, var4, var5);
        SoftwareRasterizer.clearFramebuffer();
        int var6 = this.solidTiles.length;
        int var7 = this.solidTiles[0].length;
        int var8 = -this.tileHeight - pixelOffsetY;
        int var9 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var9 >= var6))) {
          var8 = var8 + this.tileHeight;
          int var10 = -pixelOffsetX - this.tileWidth;
          stackIn_14_0 = 0;
          if (var14 == 0) {
            int var11 = stackIn_14_0;
            while (var11 < var7) {
              var10 = var10 + this.tileWidth;
              TileSpriteCacheEntry var12 = this.solidTiles[var9][var11];
              int[] var13 = this.tileMaskAt(var12.tileY, -2981, var12.tileX, this.terrainMasks);
              int[] stackIn_17_0 = this.emptyTileMask;
              if (stackIn_17_0 != var13) {
                if (var13 == this.fullTileMask) {
                  SoftwareRasterizer.fillRectangle(var10, var8, this.tileWidth, this.tileHeight, 1);
                } else {
                  var12.sprite.drawOpaque(var10, var8);
                }
              }
              var11++;
            }
            var9++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_14_0 = guard;
        }
        if (stackIn_14_0 <= 102) {
          this.fillPaddedEdges((int[][]) null, (byte) 106, (boolean[][]) null);
        }
        AlphaContainer.field_D.bindRaster(126);
        int[] stackIn_17_0Lifetime1 = this.savedClip;
        SoftwareRasterizer.restoreClip(stackIn_17_0Lifetime1);
        this.applyRasterMask(this.compositeSurfaces[1].pixels, true, this.compositeSurfaces[0].pixels);
        this.compositeSurfaces[0].drawTransparent(0, 0);
        return;
    }

    private final int[] expandTileMask(int row, int[] mask, int column, int guard) {
        int[] stackIn_17_0 = null;
        String stackIn_21_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (this.fullTileMask != mask &&
            this.emptyTileMask != mask) {
            int[] stackIn_4_0 = (int[]) (mask);
            return stackIn_4_0;
          }
          int var6 = 67 / ((-63 - guard) / 62);
          int var5_int = 0;
          if (this.fullTileMask == mask) {
            var5_int = -1;
          }
          if (this.emptyTileMask == mask) {
            var5_int = 0;
          }
          mask = new int[this.tileHeight];
          int var7 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (mask.length <= var7))) {
            stackIn_17_0 = (int[]) (mask);
            if (var8 == 0) {
              stackIn_17_0[var7] = var5_int;
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_17_0 = (int[]) (mask);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var5;
          StringBuilder stackIn_20_1 = new StringBuilder().append("na.H(").append(row).append(',');
          if (mask == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(column).append(',').append(guard).append(')').toString());
        }
    }

    private final void allocateCompositeSurfaces(int guard) {
        int var3 = EscapeVector.obfuscationControl;
        this.compositeSurfaces = new Sprite[2];
        int var2 = 0;
        while (var2 < this.compositeSurfaces.length) {
          this.compositeSurfaces[var2] = new Sprite(640, 480);
          var2++;
          if (var3 != 0) {
            return;
          }
        }
        if (guard < 48) {
          this.field_B = 101;
        }
        return;
    }

    private final int[][] tileNeighborhood(int tileY, int[][] tiles, boolean guard, int tileX) {
        String stackIn_17_2 = null;
        int var13 = EscapeVector.obfuscationControl;
        try {
          int var5_int = 3;
          int var6 = 3;
          int var7 = -1 + tileY;
          int var8 = -1 + tileX;
          int var9 = 0;
          if (guard) {
            int[][] stackIn_3_0 = (int[][]) null;
            return stackIn_3_0;
          }
          scanLoop1: while (var9 < var6) {
            int var10 = 0;
            while (true) {
              if (var10 < var5_int) {
                int[] var15 = this.tileMaskAt(var9 + var7, -2981, var8 + var10, tiles);
                int var12 = var10 + var5_int * var9;
                this.tileNeighborhood[var12] = var15;
                var10++;
                if (var13 == 0) {
                  continue;
                }
              } else {
                var9++;
              }
              break;
            }
            if (var13 == 0) {
              continue scanLoop1;
            }
            break;
          }
          int[][] stackIn_13_0 = this.tileNeighborhood;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("na.JB(").append(tileY).append(',');
          if (tiles == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(',').append(tileX).append(')').toString());
        }
    }

    DynamicTerrainRenderer(int[][] terrainMasks, int[] fullTileMask, int[] options, int tilesWide, int tilesHigh) {
        this.field_B = 1458707;
        this.tileHeight = 32;
        this.stripeColors = new int[2];
        this.floorGradient = new int[]{199169, 0};
        this.stripeColorA = 199169;
        this.tileWidth = 32;
        this.boundaryColor = 2917671;
        this.stripeColorB = 597511;
        try {
          this.emptyTileMask = options;
          this.fullTileMask = fullTileMask;
          this.tilesWide = tilesWide;
          this.tilesHigh = tilesHigh;
          this.terrainMasks = terrainMasks;
          this.boundaryMasks = this.allocateEmptyMaskGrid(1);
          this.columnScratch = new boolean[2 + this.tileHeight];
          this.pixelNeighborhood = new boolean[9];
          this.tileNeighborhood = new int[9][];
          this.dirtyTiles = new boolean[this.tilesHigh * this.tilesWide];
          this.paddedPixels = new boolean[this.tileHeight + 2][2 + this.tileWidth];
          this.rebuildBoundaryMasks(0);
          this.allocateCompositeSurfaces(96);
          this.savedClip = new int[4];
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "na.<init>(" + (terrainMasks != null ? "{...}" : "null") + ',' + (fullTileMask != null ? "{...}" : "null") + ',' + (options != null ? "{...}" : "null") + ',' + tilesWide + ',' + tilesHigh + ')');
        }
    }

    static {
        field_b = 0;
        field_t = " - fire rock buster";
        field_m = "Highscores";
        field_i = new int[]{11, 14, 15, 16, 17, 18};
    }
}
