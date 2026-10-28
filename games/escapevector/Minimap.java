/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.util.Vector;

final class Minimap {
    private int tileWidth;
    private int viewportWidth;
    static int[] field_u;
    private int maximumMapHeight;
    static Sprite field_r;
    private GameplaySession session;
    static String field_p;
    private int viewportHeight;
    private IntrusiveDeque pickupMarkers;
    static String field_O;
    private LevelObject cargo;
    private int[] fullTileMask;
    private int tileHeight;
    private int maximumMapWidth;
    private int markerScale;
    private int shipColor;
    private int[] terrainRowColors;
    boolean darkenBackground;
    private int borderColor;
    private SpriteLabelColumns legend;
    private int objectivePulsePeriod;
    private boolean[] scaledMask;
    int pixelsPerTile;
    private int cargoPulsePeriod;
    private int pickupPulsePeriod;
    int animationTick;
    private int cargoColor;
    private int[] tileRowColors;
    private int objectiveColor;
    boolean showFrame;
    private MinimapPoint clipMinimum;
    private int topTerrainColor;
    private int backgroundColor;
    private boolean visible;
    private int pickupColor;
    private int bottomTerrainColor;
    private MinimapPoint clipMaximum;
    private int gridSpacingY;
    private boolean wrapAtSpawn;
    private int gridSpacingX;
    private int gridColor;

    private final void drawTerrainTiles(int guard, int screenY, int screenX) {
        int var10 = EscapeVector.obfuscationControl;
        if (guard <= 85) {
          return;
        }
        int var4 = this.session.tilesWide * this.pixelsPerTile;
        int var5 = this.pixelsPerTile * this.session.tilesHigh;
        int var6 = (this.viewportWidth - var4) / 2;
        int var7 = (-var5 + this.viewportHeight) / 2;
        this.drawFrame(var6, (byte) 104, var5, var4, var7);
        var7 = var7 + screenY;
        var6 = var6 + screenX;
        for (int var8 = 0; var8 < this.session.tilesHigh; var8++) {
          for (int var9 = 0; this.session.tilesWide > var9; var9++) {
            this.drawTerrainTile(var9, (byte) 99, var7 + this.pixelsPerTile * var8, this.pixelsPerTile * var9 + var6, var8);
          }
        }
    }

    private final boolean[] downsampleTileMask(int[] mask, int targetWidth, int targetHeight, byte guard) {
        String stackIn_34_2 = null;
        int var18 = EscapeVector.obfuscationControl;
        try {
          if (mask == null) {
            return null;
          }
          if (null == this.scaledMask) {
            this.scaledMask = new boolean[targetWidth * targetHeight];
          }
          if (mask == this.fullTileMask) {
            boolean[] stackIn_9_0 = this.fillMask(0);
            return stackIn_9_0;
          }
          this.scaledMask = this.clearMask(0, this.scaledMask);
          if (guard < 104) {
            boolean[] stackIn_12_0 = (boolean[]) null;
            return stackIn_12_0;
          }
          int var5_int = this.tileWidth / targetWidth;
          int var6 = this.tileHeight / targetHeight;
          for (int var7 = 0; targetHeight > var7; var7++) {
            int var8 = var7 * var6;
            int var9 = targetWidth * var7;
            for (int var10 = 0; targetWidth > var10; var10++) {
              int var11 = var10 * var5_int;
              for (int var12 = 0; var6 > var12; var12++) {
                int var13 = var8 + var12;
                if (this.tileHeight > var13) {
                  int var14 = mask[var13];
                  int var15 = var10 + var9;
                  for (int var16 = 0; var5_int > var16; var16++) {
                    int var17 = var16 + var11;
                    if (var17 < this.tileWidth) {
                      this.scaledMask[var15] = IsaacRandom.a(this.scaledMask[var15], this.isBitSet(var14, var17, -2));
                      continue;
                    }
                    break;
                  }
                  continue;
                }
                break;
              }
            }
          }
          boolean[] stackIn_30_0 = this.scaledMask;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_33_0 = var5;
          StringBuilder stackIn_33_1 = new StringBuilder().append("li.IA(");
          if (mask == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(targetWidth).append(',').append(targetHeight).append(',').append(guard).append(')').toString());
        }
    }

    final void removeObject(LevelObject object, int guard) {
        String stackIn_22_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (object == null) {
            return;
          }
          if (1 == object.objectType) {
            this.cargo = null;
          }
          if (this.pickupMarkers.isEmpty(guard ^ -4348)) {
            return;
          }
          if (guard != 4236) {
            return;
          }
          IntrusiveNode var3 = this.pickupMarkers.first(false);
          while (var3 != null) {
            LevelObject var4 = (LevelObject) (var3);
            if (var4.objectId == object.objectId) {
              var4.unlink((byte) -60);
              return;
            }
            var3 = this.pickupMarkers.next((byte) 70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var3_ref;
          StringBuilder stackIn_21_1 = new StringBuilder().append("li.D(");
          if (object == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(guard).append(')').toString());
        }
    }

    private final Sprite createLegendSwatch(int color, int guard) {
        BinaryBitmapFont var3 = ByteStorage.gameFont;
        int var4 = var3.maxAscent + var3.maxDescent;
        int var5 = var4 / 2;
        int var6 = (-var5 + var4) / 2;
        if (guard != -5425) {
          this.blendPixel(85, false, 28, 3);
        }
        Sprite var7 = new Sprite(var4, var4);
        var7.bindAsFramebuffer();
        SoftwareRasterizer.fillRectangle(var6, var6, var5, var5, color);
        AlphaContainer.field_D.a(guard + 5535);
        return var7;
    }

    private final void drawWorldCopy(boolean showShip, int screenY, int screenX, int guard) {
        this.drawTerrainTiles(98, screenY, screenX);
        this.drawCargoMarker(false, screenY, screenX);
        this.drawPickupMarkers(screenY, screenX, 109);
        this.drawMissionTargets(89, screenY, screenX);
        if (guard != 4) {
          this.drawWorldMarker(-104, 44, -51, -65, 36, -11, -3);
        }
        if (showShip) {
          this.drawShipMarker(-124, screenY, screenX);
        }
    }

    private final void blendPixel(int alpha, boolean guard, int color, int destinationIndex) {
        int var5 = SoftwareRasterizer.pixels[destinationIndex];
        int var6 = 16711680;
        int var7 = 16;
        int var8 = 65280;
        int var9 = 8;
        int var10 = 255;
        int var11 = 0;
        int var12 = this.blendChannel(var6, alpha, 256, color, var5, var7);
        int var13 = this.blendChannel(var8, alpha, 256, color, var5, var9);
        int var14 = this.blendChannel(var10, alpha, 256, color, var5, var11);
        int var15 = 0;
        var15 = var15 | var6 & var12 << var7;
        var15 = var15 | var13 << var9 & var8;
        if (guard) {
          return;
        }
        var15 = var15 | var14 << var11 & var10;
        SoftwareRasterizer.pixels[destinationIndex] = var15;
    }

    public static void releaseStatics(int guard) {
        field_u = null;
        field_p = null;
        field_O = null;
        int var1 = 30 / ((guard + 2) / 47);
        field_r = null;
    }

    private final void positionLegend(int guard) {
        int var2 = (this.viewportWidth - this.legend.contentWidth(true)) / 2;
        int var3 = (this.viewportWidth - this.pixelsPerTile * this.session.tilesWide) / 2;
        int var4 = this.session.tilesWide * this.pixelsPerTile;
        if (guard <= 118) {
          int discarded$0 = this.interpolateChannel(28, -44, (byte) -72, -60, -37, 49, -114);
        }
        int var5 = 8;
        int var6 = var5 + var3 + var4;
        int var7 = var6 - var2;
        this.legend.translateX((byte) -93, var7);
    }

    final boolean isVisible(byte guard) {
        if (guard >= -101) {
          return true;
        }
        return this.visible;
    }

    final void renderView(int param0, boolean param1, int param2, int param3) {
        if (!this.visible) {
          return;
        }
        if (this.darkenBackground) {
          SoftwareRasterizer.darkenRectangle(0, 0, this.viewportWidth, this.viewportHeight);
        }
        this.updateClipBounds(param2, -32279, param0);
        if (!this.wrapAtSpawn) {
          this.drawWorldCopy(param1, param0, param2, param3 ^ 4);
          return;
        }
        int var5 = this.session.tilesWide * this.pixelsPerTile;
        int var6 = this.spawnCenterOffset(56);
        int var7 = var6 - var5;
        if (param3 > var6) {
          this.drawWorldCopy(param1, param0, -var6 + param2, 4);
          this.drawWorldCopy(param1, param0, param2 - var7, 4);
        } else {
          this.drawWorldCopy(param1, param0, var7 + param2, 4);
          this.drawWorldCopy(param1, param0, var6 + param2, param3 + 4);
        }
    }

    private final SpriteStrip[] spriteStripsToArray(IntrusiveDeque deque, int start) {
        String stackIn_9_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var3_int = deque.size((byte) 62);
          SpriteStrip[] var4 = new SpriteStrip[var3_int];
          int var5 = start;
          IntrusiveNode var6 = deque.first(false);
          while (var6 != null) {
            SpriteStrip var7 = (SpriteStrip) (var6);
            int incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = var7;
            var6 = deque.next((byte) 70);
          }
          SpriteStrip[] stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("li.K(");
          if (deque == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(start).append(')').toString());
        }
    }

    private final int interpolateChannel(int shift, int index, byte guard, int endColor, int mask, int startColor, int length) {
        int var8 = (startColor & mask) >>> shift;
        int var9 = (mask & endColor) >>> shift;
        int var10 = -var8 + var9;
        if (length <= 1) {
          return var8;
        }
        int var11 = var8 + var10 * index / (-1 + length);
        if (guard <= 117) {
          this.drawTerrainTiles(-52, -118, -38);
        }
        return var11;
    }

    private final int choosePixelsPerTile(byte guard) {
        int var3 = this.maximumMapWidth / this.session.tilesWide;
        int var4 = this.maximumMapHeight / this.session.tilesHigh;
        if (guard > -98) {
          this.configureLegend((byte) 81);
        }
        int var2 = var3;
        if (var4 < var3) {
          var2 = var4;
        }
        return var2;
    }

    private final int[] tileColorsForRow(int[] mask, int tileY, boolean guard) {
        String stackIn_20_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (mask == null) {
            return null;
          }
          int var4_int = this.pixelsPerTile * tileY;
          if (var4_int < 0) {
            Object stackIn_6_0 = null;
            return (int[]) (stackIn_6_0);
          }
          if (!guard) {
            this.darkenBackground = false;
          }
          int var5 = 0;
          int var6 = var4_int;
          while (var5 < this.tileRowColors.length) {
            if (this.terrainRowColors.length > var6) {
              this.tileRowColors[var5] = this.terrainRowColors[var6];
            } else {
              this.tileRowColors[var5] = this.terrainRowColors[this.terrainRowColors.length - 1];
            }
            var5++;
            var6++;
          }
          int[] stackIn_16_0 = this.tileRowColors;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var4;
          StringBuilder stackIn_19_1 = new StringBuilder().append("li.W(");
          if (mask == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(tileY).append(',').append(guard).append(')').toString());
        }
    }

    private final int blendChannel(int mask, int alpha, int alphaScale, int sourceColor, int destinationColor, int shift) {
        int var7 = this.colorChannel(destinationColor, (byte) -119, shift, mask);
        int var8 = this.colorChannel(sourceColor, (byte) -119, shift, mask);
        int var9 = -alpha + alphaScale;
        int var10 = alpha;
        int var11 = var7 * var9 + var8 * var10 >> 8;
        return var11;
    }

    private final void drawMaskedRectangle(int[] rowColors, int rectangleWidth, int x, int alpha, boolean[] mask, int color, byte guard, int rectangleHeight, int y) {
        String stackIn_56_2 = null;
        String stackIn_59_2 = null;
        int var25 = EscapeVector.obfuscationControl;
        try {
          if (alpha >= 0 &&
            alpha <= 256) {
            if (guard >= -62) {
              this.buildLegend(false);
            }
            int var10_int = y * this.viewportWidth + x;
            if (var10_int < 0) {
              return;
            }
            boolean stackIn_13_0 = !(rowColors == null);
            boolean var11 = stackIn_13_0;
            for (int var12 = 0; var12 < rectangleHeight; var12++) {
              int var13 = var12 + y;
              if (this.clipMinimum.y <= var13 &&
                var13 < this.clipMaximum.y) {
                int var14 = rectangleWidth * var12;
                int var15 = var12 * this.viewportWidth + var10_int;
                int var16 = color;
                if (var11) {
                  var16 = rowColors[var12];
                }
                boolean var17 = false;
                if (var11) {
                  boolean stackIn_24_0 = !(var13 % this.gridSpacingY != 0);
                  var17 = stackIn_24_0;
                }
                for (int var18 = 0; var18 < rectangleWidth; var18++) {
                  int var19 = x + var18;
                  if (this.clipMinimum.x <= var19 &&
                    var19 < this.clipMaximum.x) {
                    int var20 = var15 + var18;
                    if (var20 >= 0 &&
                      SoftwareRasterizer.pixels.length > var20) {
                      int var21 = var14 + var18;
                      boolean var22 = true;
                      if (mask != null) {
                        var22 = (mask[var21]);
                      }
                      int var23 = color;
                      if (var22) {
                        var23 = var16;
                      }
                      boolean var24 = false;
                      if (var11 &&
                        !var17) {
                        boolean stackIn_41_0 = !(0 != var19 % this.gridSpacingX);
                        var24 = stackIn_41_0;
                      }
                      if (var22 && (var24 ||
                        var17)) {
                        var23 = this.gridColor;
                      }
                      if (alpha == 256) {
                        SoftwareRasterizer.pixels[var20] = var23;
                      } else {
                        this.blendPixel(alpha, false, var23, var20);
                      }
                    }
                  }
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10 = decompiledCaughtException;
          RuntimeException stackIn_55_0 = var10;
          StringBuilder stackIn_55_1 = new StringBuilder().append("li.T(");
          if (rowColors == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          StringBuilder stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(rectangleWidth).append(',').append(x).append(',').append(alpha).append(',');
          if (mask == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(color).append(',').append(guard).append(',').append(rectangleHeight).append(',').append(y).append(')').toString());
        }
    }

    private final void drawFrame(int x, byte guard, int mapHeight, int mapWidth, int y) {
        if (!this.showFrame) {
          return;
        }
        int var6 = mapWidth + x;
        int var7 = mapHeight + y;
        int var8 = 6;
        LoginCredentialType.drawInsetUnevenFrame(var6 + var8, this.backgroundColor, 73, 0, this.borderColor, -var8 + y, x - var8, 0, var7 + var8);
        BinaryBitmapFont var9 = ByteStorage.gameFont;
        int var10 = var9.maxDescent + var9.maxAscent;
        if (guard != 104) {
          this.wrapAtSpawn = false;
        }
        int var11 = -var8 + (y - (var10 + var9.maxDescent));
        int var12 = 15658734;
        String var13 = null == this.cargo ? StringNode.field_k : FullscreenFocusCanvas.field_b;
        var9.drawCentered(var13, this.viewportWidth / 2, var11, var12, -1);
        this.drawLegend(111);
    }

    private final void drawLegend(int guard) {
        if (this.legend == null) {
          return;
        }
        int var3 = -40 / ((guard + 5) / 37);
        int var2 = (this.viewportHeight - this.pixelsPerTile * this.session.tilesHigh) / 2;
        int var4 = this.pixelsPerTile * this.session.tilesHigh;
        int var5 = this.legend.height((byte) -90);
        int var6 = (-var5 + var4) / 2 + var2;
        this.legend.draw(var6, 3);
    }

    private final boolean isBitSet(int bits, int bit, int guard) {
        if (guard != -2) {
          this.viewportWidth = -61;
        }
        return 0 != (1 << bit & bits) ? true : false;
    }

    private final void drawMissionTargets(int guard, int screenY, int screenX) {
        int var8 = EscapeVector.obfuscationControl;
        IntrusiveDeque var4 = this.session.missionTargets;
        if (var4 == null) {
          return;
        }
        if (var4.isEmpty(-116)) {
          return;
        }
        int var5 = this.pulseAlpha((byte) -29, this.objectivePulsePeriod);
        IntrusiveNode var6 = var4.first(false);
        while (var6 != null) {
          LevelObject var7 = (LevelObject) (var6);
          if (var7.missionTarget) {
            this.drawWorldMarker(screenX, var7.x, this.objectiveColor, var5, screenY, var7.y, 4);
          }
          var6 = var4.next((byte) 70);
        }
        if (guard < 40) {
          this.terrainRowColors = (int[]) null;
        }
    }

    private final void drawPickupMarkers(int screenY, int screenX, int guard) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.pickupMarkers.isEmpty(-103)) {
          return;
        }
        IntrusiveNode var4 = this.pickupMarkers.first(false);
        if (guard < 35) {
          this.configureLegend((byte) 4);
        }
        while (var4 != null) {
          LevelObject var5 = (LevelObject) (var4);
          int var6 = this.pulseAlpha((byte) -29, this.pickupPulsePeriod);
          this.drawWorldMarker(screenX, var5.x, this.pickupColor, var6, screenY, var5.y, 4);
          var4 = this.pickupMarkers.next((byte) 70);
        }
    }

    private final void drawWorldMarker(int screenX, int worldX, int color, int alpha, int screenY, int worldY, int guard) {
        int var8 = (this.viewportWidth - this.session.tilesWide * this.pixelsPerTile) / 2;
        int var9 = (this.viewportHeight - this.pixelsPerTile * this.session.tilesHigh) / 2;
        int var10 = worldX * this.pixelsPerTile / this.tileWidth;
        int var11 = this.pixelsPerTile * worldY / this.tileHeight;
        int var12 = var8 + var10;
        if (guard != 4) {
          this.session = (GameplaySession) null;
        }
        int var13 = var11 + var9;
        int var14 = this.pixelsPerTile * this.markerScale;
        var14 = 20 < var14 ? 20 : var14;
        int var15 = var14;
        int var16 = var14;
        this.drawMaskedRectangle((int[]) null, var15, var12 + screenX, alpha, (boolean[]) null, color, (byte) -72, var16, var13 + screenY);
    }

    private final void configureLegend(byte guard) {
        BinaryBitmapFont var2 = ByteStorage.gameFont;
        int var3 = 16777215;
        int var4 = 16777215;
        if (guard != -112) {
          this.topTerrainColor = 95;
        }
        this.legend.configure(var4, var2, var3, 125);
    }

    private final String[] stringsToArray(IntrusiveDeque deque, int guard) {
        String stackIn_11_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var3_int = deque.size((byte) 73);
          String[] var4 = new String[var3_int];
          int var5 = 0;
          IntrusiveNode var6 = deque.first(false);
          while (var6 != null) {
            StringNode var7 = (StringNode) (var6);
            int incrementValue$3 = var5;
            var5++;
            var4[incrementValue$3] = var7.text;
            var6 = deque.next((byte) 70);
          }
          if (guard != 11125) {
            int discarded$2 = this.interpolateChannel(54, -100, (byte) 126, 78, 66, 10, 81);
          }
          String[] stackIn_7_0 = var4;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3;
          StringBuilder stackIn_10_1 = new StringBuilder().append("li.G(");
          if (deque == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void buildTerrainGradient(int guard) {
        int var8 = EscapeVector.obfuscationControl;
        this.tileRowColors = new int[this.pixelsPerTile];
        if (guard != 100) {
          int discarded$0 = this.colorChannel(76, (byte) -11, -116, -105);
        }
        int var2 = this.session.tilesHigh * this.pixelsPerTile;
        this.terrainRowColors = new int[var2];
        for (int var3 = 0; var3 < this.terrainRowColors.length; var3++) {
          int var4 = this.interpolateChannel(16, var3, (byte) 122, this.bottomTerrainColor, 16711680, this.topTerrainColor, this.terrainRowColors.length);
          int var5 = this.interpolateChannel(8, var3, (byte) 120, this.bottomTerrainColor, 65280, this.topTerrainColor, this.terrainRowColors.length);
          int var6 = this.interpolateChannel(0, var3, (byte) 118, this.bottomTerrainColor, 255, this.topTerrainColor, this.terrainRowColors.length);
          int var7 = 16770546 & var4 << 16;
          var7 = var7 | (-1442840321 & var5) << 8;
          var7 = var7 | 255 & var6;
          this.terrainRowColors[var3] = var7;
        }
    }

    final void draw(byte guard) {
        this.renderView(0, true, 0, 0);
        if (guard != -120) {
          Minimap.releaseStatics(80);
        }
    }

    private final int pulseAlpha(byte guard, int period) {
        int var3 = this.animationTick;
        var3 = var3 % period;
        period = period / 2;
        boolean var4 = (period <= var3);
        if (var4) {
          var3 = var3 - period;
        }
        if (guard != -29) {
          this.terrainRowColors = (int[]) null;
        }
        if (var4) {
          return var3 * 255 / period;
        }
        return -(255 * var3 / period) + 255;
    }

    final void toggleVisible(byte guard) {
        if (guard != -101) {
          return;
        }
        this.visible = !this.visible ? true : false;
    }

    private final boolean[] fillMask(int start) {
        int var3 = EscapeVector.obfuscationControl;
        for (int var2 = start; this.scaledMask.length > var2; var2++) {
          this.scaledMask[var2] = true;
        }
        return this.scaledMask;
    }

    private final void collectPickupMarkers(int start) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.session == null) {
          return;
        }
        Vector var2 = this.session.levelObjects;
        int var3 = var2.size();
        for (int var4 = start; var3 > var4; var4++) {
          LevelObject var5 = (LevelObject) (var2.elementAt(var4));
          if (var5 != null) {
            int var6 = var5.objectType;
            if ((ResourceArchive.isPowerupType(var6, -64) ||
              var6 == 0 ||
              var6 == 5) && var6 != 1) {
              this.pickupMarkers.addLast(start - 12328, var5);
            }
          }
        }
    }

    private final int spawnCenterOffset(int guard) {
        int var2 = this.session.tilesWide * this.pixelsPerTile;
        int var3 = var2 / 2;
        int var4 = this.session.spawnXQ16 >> 16;
        var4 = this.pixelsPerTile * var4 / this.tileWidth;
        int var5 = 1 + var3 - var4;
        if (guard < 24) {
          return 24;
        }
        return var5;
    }

    private final void drawShipMarker(int guard, int screenY, int screenX) {
        int var4 = this.session.shipXQ16 >> 16;
        if (guard > -117) {
          return;
        }
        int var5 = this.session.shipYQ16 >> 16;
        this.drawWorldMarker(screenX, var4, this.shipColor, 256, screenY, var5, 4);
    }

    private final void updateClipBounds(int screenX, int guard, int screenY) {
        int var4 = this.session.tilesWide * this.pixelsPerTile;
        int var5 = this.session.tilesHigh * this.pixelsPerTile;
        if (guard != -32279) {
          Sprite discarded$0 = this.createLegendSwatch(91, -67);
        }
        int var6 = (this.viewportWidth - var4) / 2 + screenX;
        int var7 = var4 + var6;
        int var8 = (this.viewportHeight - var5) / 2 + screenY;
        int var9 = var8 + var5;
        this.clipMinimum.y = var8;
        this.clipMinimum.x = var6;
        this.clipMaximum.x = var7;
        this.clipMaximum.y = var9;
    }

    private final int colorChannel(int mask, byte guard, int shift, int color) {
        if (guard != -119) {
          Sprite discarded$0 = this.createLegendSwatch(118, -21);
        }
        return (color & mask) >> shift;
    }

    private final boolean[] clearMask(int start, boolean[] mask) {
        String stackIn_9_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          for (int var3_int = start; mask.length > var3_int; var3_int++) {
            mask[var3_int] = false;
          }
          boolean[] stackIn_5_0 = (boolean[]) (mask);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("li.Q(").append(start).append(',');
          if (mask == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void drawCargoMarker(boolean guard, int screenY, int screenX) {
        if (guard) {
          boolean[] var5 = (boolean[]) null;
          boolean[] discarded$0 = this.clearMask(122, (boolean[]) null);
        }
        if (null == this.cargo) {
          return;
        }
        if (this.session.cargoLost) {
          return;
        }
        int var4 = this.pulseAlpha((byte) -29, this.cargoPulsePeriod);
        this.drawWorldMarker(screenX, this.cargo.x, this.cargoColor, var4, screenY, this.cargo.y, 4);
    }

    private final void buildLegend(boolean guard) {
        String var2 = sf.field_n;
        IntrusiveDeque var3 = new IntrusiveDeque();
        IntrusiveDeque var4 = new IntrusiveDeque();
        var3.addLast(-12328, new StringNode(PathPoint.field_d));
        if (!guard) {
          return;
        }
        var4.addLast(-12328, new SpriteStrip(new Sprite[]{this.createLegendSwatch(this.shipColor, -5425)}, 0));
        if (null != this.cargo) {
          var3.addLast(-12328, new StringNode(QuitPageSupport.field_b));
          var4.addLast(-12328, new SpriteStrip(new Sprite[]{this.createLegendSwatch(this.cargoColor, -5425)}, 0));
        }
        IntrusiveDeque var5 = this.session.missionTargets;
        if (var5 != null &&
          !var5.isEmpty(-103)) {
          var3.addLast(-12328, new StringNode(SpriteLabelColumns.field_q));
          var4.addLast(-12328, new SpriteStrip(new Sprite[]{this.createLegendSwatch(this.objectiveColor, -5425)}, 0));
        }
        if (this.pickupMarkers != null &&
          !this.pickupMarkers.isEmpty(-111)) {
          var3.addLast(-12328, new StringNode(IterableDualLinkDeque.field_a));
          var4.addLast(-12328, new SpriteStrip(new Sprite[]{this.createLegendSwatch(this.pickupColor, -5425)}, 0));
        }
        this.legend = new SpriteLabelColumns(var2, this.spriteStripsToArray(var4, 0), this.stringsToArray(var3, 11125));
        this.configureLegend((byte) -112);
        this.positionLegend(126);
        return;
    }

    private final void drawTerrainTile(int tileX, byte guard, int screenY, int screenX, int tileY) {
        if (guard <= 60) {
          return;
        }
        int[][] var11 = this.session.terrainMasks;
        int[][] var6 = var11;
        int var7 = tileY * this.session.tilesWide + tileX;
        if (var11 == null) {
          return;
        }
        if (var7 >= 0) {
          if (var11.length <= var7) {
            return;
          }
          int[] var8 = var11[var7];
          int[] var9 = this.tileColorsForRow(var8, tileY, true);
          boolean[] var10 = this.downsampleTileMask(var8, this.pixelsPerTile, this.pixelsPerTile, (byte) 109);
          this.drawMaskedRectangle(var9, this.pixelsPerTile, screenX, 256, var10, this.backgroundColor, (byte) -99, this.pixelsPerTile, screenY);
          return;
        }
    }

    Minimap(GameplaySession session, LevelObject focusObject, boolean option) {
        this.tileWidth = 32;
        this.fullTileMask = QuickChatPhraseDefinition.fullTileMask;
        this.viewportWidth = 640;
        this.maximumMapHeight = 349;
        this.viewportHeight = 480;
        this.tileHeight = 32;
        this.maximumMapWidth = 402;
        this.pickupMarkers = new IntrusiveDeque();
        this.darkenBackground = true;
        this.borderColor = 4755528;
        this.shipColor = 15658734;
        this.pickupPulsePeriod = 100;
        this.animationTick = 0;
        this.cargoPulsePeriod = 100;
        this.markerScale = 2;
        this.pixelsPerTile = 1;
        this.showFrame = true;
        this.visible = false;
        this.cargoColor = 16711680;
        this.objectivePulsePeriod = 100;
        this.objectiveColor = 16711680;
        this.backgroundColor = 1;
        this.bottomTerrainColor = 998158;
        this.pickupColor = 16776960;
        this.topTerrainColor = 3568436;
        this.clipMinimum = new MinimapPoint(0, 0);
        this.clipMaximum = new MinimapPoint(this.viewportWidth, this.viewportHeight);
        this.gridSpacingY = 4;
        this.gridSpacingX = 4;
        this.gridColor = 1138193;
        try {
          this.cargo = focusObject;
          this.wrapAtSpawn = option ? true : false;
          this.session = session;
          this.collectPickupMarkers(0);
          this.pixelsPerTile = this.choosePixelsPerTile((byte) -105);
          this.buildTerrainGradient(100);
          this.buildLegend(true);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "li.<init>(" + (session != null ? "{...}" : "null") + ',' + (focusObject != null ? "{...}" : "null") + ',' + option + ')');
        }
    }

    static {
        field_u = new int[8192];
        field_p = "Rock Buster";
        field_O = "Back";
    }
}
