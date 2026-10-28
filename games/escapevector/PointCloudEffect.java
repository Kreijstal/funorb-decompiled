/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PointCloudEffect extends DualLinkNode {
    static String[] field_r;
    int[] velocityYQ16;
    boolean finished;
    private boolean persistentParticles;
    static boolean field_t;
    static String field_v;
    int[] velocityXQ16;
    int[] positionXQ16;
    boolean indexedRendering;
    private int particleCount;
    static ResourceArchive field_D;
    int[] positionYQ16;
    int[] auxiliaryVelocityQ16;
    private int fadeThreshold;
    boolean[] activeParticles;
    static int field_u;
    static String[] field_z;

    final void draw(int guard, int cameraX, int cameraY) {
        int var11 = EscapeVector.obfuscationControl;
        int var4 = 2147483647;
        int var5 = -2147483648;
        int var6 = 2147483647;
        int var7 = -2147483648;
        for (int var8 = 0; var8 < this.particleCount; var8++) {
          if (this.activeParticles == null ||
            this.activeParticles[var8]) {
            int var9 = this.positionXQ16[var8] >> 16;
            if (var9 - 2 < var4) {
              var4 = -2 + var9;
            }
            if (var5 < var9 + 3) {
              var5 = 3 + var9;
            }
            int var10 = this.positionYQ16[var8] >> 16;
            if (-2 + var10 < var6) {
              var6 = var10 - 2;
            }
            if (var7 < var10 + 3) {
              var7 = var10 + 3;
            }
          }
        }
        if (guard < 79) {
          this.prepareRasterSprite(126, 35, 57, -87, -120, 87);
        }
        if (var4 >= var5) {
          return;
        }
        if (var7 <= var6) {
          return;
        }
        int var8Lifetime1 = var5 - var4;
        this.prepareRasterSprite(var8Lifetime1, var6, 58, var5, var7, var4);
        this.rasterizePointGlow(var6, var4, 26, var8Lifetime1);
        this.thresholdRasterAndCheckFinished(19507);
        this.drawWrappedSprites(var6, -641, var8Lifetime1, cameraY, var4, cameraX);
    }

    private final void allocatePointArrays(int count, int guard) {
        this.auxiliaryVelocityQ16 = new int[count];
        this.positionYQ16 = new int[count];
        this.velocityXQ16 = new int[count];
        if (guard != 0) {
          return;
        }
        this.positionXQ16 = new int[count];
        this.velocityYQ16 = new int[count];
    }

    final void updateParticles() {
        for (int var1 = 0; var1 < this.particleCount; var1++) {
          if (this.activeParticles == null ||
            this.activeParticles[var1]) {
            this.integratePointWithTerrain(var1);
            double var2 = (double)this.velocityXQ16[var1];
            double var4 = (double)this.velocityYQ16[var1];
            double var6 = (double)this.auxiliaryVelocityQ16[var1];
            double var8 = 1.0 - 0.000002 * Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
            if (var8 < 0.5) {
              var8 = 0.5;
            }
            var2 = var2 * var8;
            var4 = var4 * var8;
            var6 = var6 * var8;
            this.velocityXQ16[var1] = (int)var2;
            this.velocityYQ16[var1] = (int)var4;
            this.auxiliaryVelocityQ16[var1] = (int)var6;
          }
        }
        if (this.persistentParticles) {
          return;
        }
        this.fadeThreshold = this.fadeThreshold + 3;
    }

    final void clearActiveParticles(byte guard) {
        int var3 = EscapeVector.obfuscationControl;
        int var2 = 0;
        if (guard > -124) {
          return;
        }
        while (var2 < this.particleCount) {
          this.activeParticles[var2] = false;
          var2++;
        }
    }

    private final boolean terrainIsSolidAtQ16(int xQ16, int yQ16) {
        int[][] var3 = BoundedRandomAccessFile.activeSession.terrainMasks;
        int var4 = BoundedRandomAccessFile.activeSession.tilesWide;
        int[] var5 = QuickChatPhraseDefinition.fullTileMask;
        xQ16 = xQ16 >> 16;
        yQ16 = yQ16 >> 16;
        int var6 = xQ16 >> 5;
        int var7 = yQ16 >> 5;
        if (var7 < 0) {
          return false;
        }
        int[] var8 = var5;
        if (var7 < BoundedRandomAccessFile.activeSession.tilesHigh) {
          while (var6 < 0) {
            var6 = var6 + var4;
          }
          var6 = var6 % var4;
          var8 = var3[var7 * var4 + var6];
          if (var8 == null) {
            return false;
          }
        }
        if (var8 != var5) {
          int var9 = xQ16 & 31;
          int var10 = yQ16 & 31;
          if ((var8[var10] & 1 << var9) == 0) {
            return false;
          }
        }
        return true;
    }

    public static void releaseStatics(int guard) {
        field_z = null;
        field_D = null;
        field_r = null;
        if (guard <= 66) {
          PointCloudEffect.activeApplet((byte) 25);
        }
        field_v = null;
    }

    private final void drawWrappedSprites(int top, int guard, int width, int cameraY, int left, int cameraX) {
        int var7 = 0;
        IndexedSprite stackIn_8_0 = null;
        int var10 = EscapeVector.obfuscationControl;
        for (var7 = -cameraX + left; -width < var7; var7 = var7 - BoundedRandomAccessFile.activeSession.worldWidth) {
        }
        if (guard != -641) {
          this.clearTerrainAtQ16(-1, -98);
        }
        var7 = var7 + BoundedRandomAccessFile.activeSession.worldWidth;
        if (this.indexedRendering) {
          stackIn_8_0 = ChatMessage.effectSprite;
        } else {
          stackIn_8_0 = RatingQuery.pointCloudRasterSprite;
        }
        IndexedSprite var8 = stackIn_8_0;
        try {
          IndexedSprite var9 = this.buildExtremaOutline((byte) 96);
          while (var7 < 640) {
            var8.draw(var7, top - cameraY);
            if (var9 != null) {
              var9.draw(var7, -cameraY + top);
            }
            var7 = var7 + BoundedRandomAccessFile.activeSession.worldWidth;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          Exception var9_ref = (Exception) (Object) decompiledCaughtException;
          System.out.println("Error");
        }
    }

    private final void rasterizePointGlow(int top, int left, int guard, int width) {
        int var11 = EscapeVector.obfuscationControl;
        if (guard <= 8) {
          IndexedSprite var12 = (IndexedSprite) null;
          this.copySpriteGeometry(-110, (IndexedSprite) null, (IndexedSprite) null);
        }
        for (int var5 = 0; var5 < this.particleCount; var5++) {
          if (null == this.activeParticles ||
            this.activeParticles[var5]) {
            int var6 = this.positionXQ16[var5] >> 16;
            int var7 = this.positionYQ16[var5] >> 16;
            var6 = var6 - left;
            var7 = var7 - top;
            int var8 = var7 * width + var6;
            int var9 = 4096 - this.fadeThreshold * 16 >> 8;
            kh.a((byte) 99, var9, var8);
            int var10 = 14 * var9 >> 4;
            kh.a((byte) -101, var10, -1 + var8);
            kh.a((byte) -127, var10, var8 + 1);
            kh.a((byte) -113, var10, -width + var8);
            kh.a((byte) -108, var10, var8 + width);
            int var10Lifetime1 = var9 * 12 >> 4;
            kh.a((byte) -84, var10Lifetime1, -1 + (-width + var8));
            kh.a((byte) 117, var10Lifetime1, 1 + (var8 - width));
            kh.a((byte) 50, var10Lifetime1, var8 + width - 1);
            kh.a((byte) -47, var10Lifetime1, 1 + (var8 + width));
            var9 = var9 >> 1;
            kh.a((byte) -103, var9, var8 - 2);
            kh.a((byte) 78, var9, var8 + 2);
            kh.a((byte) 79, var9, -(width * 2) + var8);
            int var10Lifetime2 = var9 * 5 >> 3;
            kh.a((byte) 36, var9, var8 + width * 2);
            kh.a((byte) -69, var10Lifetime2, var8 - width - 2);
            kh.a((byte) 23, var10Lifetime2, -2 + var8 + width);
            kh.a((byte) 61, var10Lifetime2, var8 - width + 2);
            kh.a((byte) 88, var10Lifetime2, 2 + var8 + width);
            kh.a((byte) 65, var10Lifetime2, var8 - (width * 2 + 1));
            kh.a((byte) 55, var10Lifetime2, -(width * 2) + var8 + 1);
            kh.a((byte) -114, var10Lifetime2, -1 + 2 * width + var8);
            kh.a((byte) 119, var10Lifetime2, 1 + var8 + 2 * width);
          }
        }
    }

    final static void enqueueProgressRecord(int opcode, byte guard, ProgressRecord record) {
        try {
          if (guard != -107) {
            field_t = true;
          }
          RasterBuffer.field_e.addLast(-12328, record);
          IntrusiveNode.writeProgressRecord(-97, opcode, record);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oc.B(" + opcode + ',' + guard + ',' + (record != null ? "{...}" : "null") + ')');
        }
    }

    private final void buildEffectPalette(byte guard) {
        int var7 = EscapeVector.obfuscationControl;
        int var3 = 118 / ((guard + 12) / 57);
        for (int var2 = 0; var2 < 256; var2++) {
          int var4 = -(var2 * var2) + 512 * var2 >> 8;
          int var5 = var2;
          int var6 = var2 * var2 >> 8;
          if (var2 < 128) {
            var6 = var6 + (var2 * 128 - var2 * var2 >> 5);
          }
          RatingQuery.pointCloudRasterSprite.field_l[var2] = MatchingTextValidator.a(MatchingTextValidator.a(var4 << 16, var5 << 8), var6);
        }
    }

    private final void copySpriteGeometry(int guard, IndexedSprite source, IndexedSprite destination) {
        try {
          destination.field_a = source.field_a;
          destination.field_g = source.field_g;
          if (guard <= 53) {
            this.thresholdRasterAndCheckFinished(32);
          }
          destination.field_d = source.field_d;
          destination.field_h = source.field_h;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oc.F(" + guard + ',' + (source != null ? "{...}" : "null") + ',' + (destination != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean objectIsSolidAtPixel(int x, int y) {
        int var7;
        for (int var3 = 0; var3 < BoundedRandomAccessFile.activeSession.levelObjects.size(); var3++) {
          LevelObject var4 = (LevelObject) (BoundedRandomAccessFile.activeSession.levelObjects.elementAt(var3));
          Sprite var5 = var4.collisionSprite;
          int var6 = var4.y + var5.offsetY;
          if (y >= var6 &&
            y < var6 + var5.height) {
            for (var7 = var4.x + var5.offsetX; var7 < x; var7 = var7 + BoundedRandomAccessFile.activeSession.worldWidth) {
            }
            while (var7 > x) {
              var7 = var7 - BoundedRandomAccessFile.activeSession.worldWidth;
            }
            if (!(x >= var7 + var5.width) &&
              var5.pixels[(y - var6) * var5.width + (x - var7)] != 0) {
              return true;
            }
          }
        }
        return false;
    }

    final static void attachKeyboardInput(byte guard, java.awt.Component component) {
        component.setFocusTraversalKeysEnabled(false);
        component.addKeyListener(ThreeSliceButtonPainter.field_v);
        if (guard != -38) {
          return;
        }
        try {
          component.addFocusListener(ThreeSliceButtonPainter.field_v);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oc.Q(" + guard + ',' + (component != null ? "{...}" : "null") + ')');
        }
    }

    private final void clearTerrainAtQ16(int xQ16, int yQ16) {
        int var3 = BoundedRandomAccessFile.activeSession.tilesWide;
        int[] var4 = QuickChatPhraseDefinition.fullTileMask;
        xQ16 = xQ16 >> 16;
        yQ16 = yQ16 >> 16;
        if (this.objectIsSolidAtPixel(xQ16, yQ16)) {
          return;
        }
        int var5 = xQ16 >> 5;
        int var6 = yQ16 >> 5;
        if (var6 < 0) {
          return;
        }
        BoundedRandomAccessFile.activeSession.ensureTerrainRow(var6);
        while (var5 < 0) {
          var5 = var5 + var3;
        }
        var5 = var5 % var3;
        if (BoundedRandomAccessFile.activeSession.dynamicTerrain != null) {
          BoundedRandomAccessFile.activeSession.dynamicTerrain.invalidateTileNeighborhood(var5, var6, true);
        }
        int[][] var7 = BoundedRandomAccessFile.activeSession.terrainMasks;
        int[] var8 = var7[var6 * var3 + var5];
        if (var8 == null) {
          return;
        }
        if (var8 == var4) {
          int[] var11 = new int[32];
          var8 = var11;
          var7[var6 * var3 + var5] = new int[32];
          for (int var9 = 0; var9 < 32; var9++) {
            var11[var9] = -1;
          }
        }
        int var9Lifetime1 = xQ16 & 31;
        int var10 = yQ16 & 31;
        var8[var10] = var8[var10] & ~(1 << var9Lifetime1);
    }

    final static java.applet.Applet activeApplet(byte guard) {
        if (guard >= -58) {
          ProgressRecord var2 = (ProgressRecord) null;
          PointCloudEffect.enqueueProgressRecord(56, (byte) 48, (ProgressRecord) null);
        }
        if (null != ModalPanel.field_P) {
          return ModalPanel.field_P;
        }
        return (java.applet.Applet) ((Object) StatefulTextPainter.field_r);
    }

    final void integratePointWithTerrain(int index) {
        boolean stackIn_19_0 = false;
        boolean stackIn_22_1 = false;
        boolean stackIn_29_0 = false;
        boolean stackIn_32_1 = false;
        int var2 = this.positionXQ16[index];
        int var3 = this.positionYQ16[index];
        int var4 = this.velocityXQ16[index];
        int var5 = this.velocityYQ16[index];
        int var6 = var2 + var4;
        int var7 = var3 + var5;
        if (!this.persistentParticles &&
          !this.terrainIsSolidAtQ16(var6, var7)) {
          this.positionXQ16[index] = var6;
          this.positionYQ16[index] = var7;
        } else {
          int var8 = (int)Math.sqrt((double)var4 * (double)var4 + (double)var5 * (double)var5) >> 16;
          var4 = var4 / (var8 + 1);
          var5 = var5 / (var8 + 1);
          int var9 = 0;
          while (true) {
            if (var9 >= var8) {
              var2 = var6;
              var3 = var7;
              if (this.persistentParticles &&
                !this.terrainIsSolidAtQ16(var2, var3)) {
                this.positionXQ16[index] = var2;
                this.positionYQ16[index] = var3;
                break;
              }
            } else {
              var2 = var2 + var4;
              var3 = var3 + var5;
              if (!this.terrainIsSolidAtQ16(var2, var3)) {
                var9++;
                continue;
              }
            }
            int stackIn_14_0 = (!this.terrainIsSolidAtQ16(var2 - 65536, var3)) ? 0 : 1;
            boolean decompiledFrameRemainder0 = true;
            var9 = stackIn_14_0;
            int var10 = this.terrainIsSolidAtQ16(var2 + 65536, var3) ? 1 : 0;
            boolean var11 = (this.terrainIsSolidAtQ16(var2, var3 - 65536));
            boolean var12 = (this.terrainIsSolidAtQ16(var2, var3 + 65536));
            if (var11 != var12) {
              stackIn_19_0 = ((var11) &&
                (!(var12)));
              stackIn_22_1 = !(this.velocityYQ16[index] >= 0);
              if (stackIn_19_0 == stackIn_22_1) {
                this.velocityYQ16[index] = -this.velocityYQ16[index] >> 2;
                this.velocityXQ16[index] = this.velocityXQ16[index] + this.velocityXQ16[index] * 3;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var9 != var10) {
                stackIn_29_0 = (var9 != 0 &&
                  var10 == 0);
                stackIn_32_1 = !(this.velocityXQ16[index] >= 0);
                if (stackIn_29_0 == stackIn_32_1) {
                  this.velocityXQ16[index] = -this.velocityXQ16[index] >> 2;
                  this.velocityYQ16[index] = this.velocityYQ16[index] + this.velocityYQ16[index] * 3;
                  decompiledFrameRemainder0 = false;
                }
              }
              if (decompiledFrameRemainder0) {
                if (!this.persistentParticles &&
                  BoundedRandomAccessFile.activeSession.levelIndex >= 0) {
                  if (var9 == 0) {
                    this.clearTerrainAtQ16(var2, var3);
                  } else if (var10 == 0) {
                    this.clearTerrainAtQ16(var2, var3);
                  } else if (!var11) {
                    this.clearTerrainAtQ16(var2, var3);
                  } else if (!var12) {
                    this.clearTerrainAtQ16(var2, var3);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var2 = var2 - var4;
                  var3 = var3 - var5;
                }
              }
            }
            this.positionXQ16[index] = var2;
            this.positionYQ16[index] = var3;
            break;
          }
        }
    }

    private final void thresholdRasterAndCheckFinished(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        this.finished = true;
        if (guard != 19507) {
          return;
        }
        int var2 = RatingQuery.pointCloudRasterSprite.field_g * RatingQuery.pointCloudRasterSprite.field_d;
        for (int var3 = 0; var2 > var3; var3++) {
          int var4 = RatingQuery.pointCloudRasterSprite.field_k[var3] & 255;
          if (this.fadeThreshold >= var4) {
            RatingQuery.pointCloudRasterSprite.field_k[var3] = (byte) 0;
          } else {
            this.finished = false;
          }
        }
    }

    private final void prepareAlternateSprites(int guard) {
        this.copySpriteGeometry(109, RatingQuery.pointCloudRasterSprite, ChatMessage.effectSprite);
        ChatMessage.effectSprite.field_k = RatingQuery.pointCloudRasterSprite.field_k;
        if (guard < 114) {
          field_r = (String[]) null;
        }
        this.copySpriteGeometry(112, RatingQuery.pointCloudRasterSprite, ChatMessage.effectOutlineSprite);
        int var2 = ChatMessage.effectOutlineSprite.field_h * ChatMessage.effectOutlineSprite.field_a;
        if (ChatMessage.effectOutlineSprite.field_k.length < var2) {
          ChatMessage.effectOutlineSprite.field_k = new byte[var2];
        }
    }

    private final void prepareRasterSprite(int width, int top, int guard, int right, int bottom, int left) {
        int var10 = EscapeVector.obfuscationControl;
        int var7 = -100 % ((-7 - guard) / 38);
        if (RatingQuery.pointCloudRasterSprite == null) {
          RatingQuery.pointCloudRasterSprite = new IndexedSprite(right - left, bottom - top, 256);
          this.buildEffectPalette((byte) -82);
        } else {
          RatingQuery.pointCloudRasterSprite.field_g = width;
          RatingQuery.pointCloudRasterSprite.field_a = width;
          RatingQuery.pointCloudRasterSprite.field_d = -top + bottom;
          RatingQuery.pointCloudRasterSprite.field_h = -top + bottom;
          int var8 = RatingQuery.pointCloudRasterSprite.field_d * RatingQuery.pointCloudRasterSprite.field_g;
          if (RatingQuery.pointCloudRasterSprite.field_k.length < var8) {
            RatingQuery.pointCloudRasterSprite.field_k = new byte[var8];
          } else {
            for (int var9 = 0; var8 > var9; var9++) {
              RatingQuery.pointCloudRasterSprite.field_k[var9] = (byte) 0;
            }
          }
        }
        this.prepareAlternateSprites(122);
    }

    PointCloudEffect(Sprite sprite, int x, int y, PcmSample sound) {
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        this.persistentParticles = false;
        this.indexedRendering = false;
        this.fadeThreshold = 0;
        try {
          y = y + sprite.offsetY;
          x = x + sprite.offsetX;
          int var5_int = (sprite.width << 15) + (x << 16);
          int var6 = (sprite.height << 15) + (y << 16);
          int var7 = 0;
          int var8 = sprite.width * sprite.height;
          for (int var9 = 0; var8 > var9; var9++) {
            if (sprite.pixels[var9] != 0) {
              var7++;
            }
          }
          this.particleCount = var7 * 8;
          this.allocatePointArrays(this.particleCount, 0);
          int var9Lifetime1 = 0;
          for (int var10 = 0; var10 < var8; var10++) {
            if (sprite.pixels[var10] != 0) {
              for (int var11 = 0; var11 < 8; var11++) {
                this.positionXQ16[var9Lifetime1] = var10 % sprite.width + x << 16;
                this.positionYQ16[var9Lifetime1] = y + var10 / sprite.width << 16;
                var9Lifetime1++;
              }
            }
          }
          for (int var10Lifetime1 = 0; this.particleCount > var10Lifetime1; var10Lifetime1++) {
            this.velocityXQ16[var10Lifetime1] = -262144 + (int)(Math.random() * 524289.0);
            this.velocityYQ16[var10Lifetime1] = -262144 + (int)(524289.0 * Math.random());
            this.auxiliaryVelocityQ16[var10Lifetime1] = -262144 + (int)(Math.random() * 524289.0);
          }
          AlternateUsernameCredentials.field_n.playSampleWithPan(sound, 100, BoundedRandomAccessFile.activeSession.spatialVolume(131072 * (sprite.height + sprite.width), var5_int, 96, var6), BoundedRandomAccessFile.activeSession.spatialPan(var5_int, 112));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var5;
          StringBuilder stackIn_20_1 = new StringBuilder().append("oc.<init>(");
          if (sprite == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(x).append(',').append(y).append(',');
          if (sound == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    PointCloudEffect(int xQ16, int yQ16, PcmSample sound) {
        this.persistentParticles = false;
        this.indexedRendering = false;
        this.fadeThreshold = 0;
        try {
          this.particleCount = 4096;
          this.allocatePointArrays(this.particleCount, 0);
          for (int var4_int = 0; this.particleCount > var4_int; var4_int++) {
            double var5 = 6.283185307179586 * Math.random();
            double var7 = Math.sqrt(Math.random()) * 524288.0;
            this.positionXQ16[var4_int] = xQ16 + (int)(Math.sin(var5) * var7);
            this.positionYQ16[var4_int] = (int)(var7 * Math.cos(var5)) + yQ16;
            this.velocityXQ16[var4_int] = -262144 + (int)(524289.0 * Math.random());
            this.velocityYQ16[var4_int] = -262144 + (int)(Math.random() * 524289.0);
            this.auxiliaryVelocityQ16[var4_int] = -262144 + (int)(524289.0 * Math.random());
          }
          AlternateUsernameCredentials.field_n.playSampleWithPan(sound, 100, BoundedRandomAccessFile.activeSession.spatialVolume(4194304, xQ16, 96, yQ16), BoundedRandomAccessFile.activeSession.spatialPan(xQ16, 109));
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oc.<init>(" + xQ16 + ',' + yQ16 + ',' + (sound != null ? "{...}" : "null") + ')');
        }
    }

    private final IndexedSprite buildExtremaOutline(byte guard) {
        int var15 = EscapeVector.obfuscationControl;
        if (!this.indexedRendering) {
          return null;
        }
        if (guard <= 86) {
          field_z = (String[]) null;
        }
        byte[] var20 = ChatMessage.effectOutlineSprite.field_k;
        byte[] var17 = var20;
        byte[] var16 = var17;
        byte[] var26 = var16;
        byte[] var25 = RatingQuery.pointCloudRasterSprite.field_k;
        for (int var4 = 0; var20.length > var4; var4++) {
          var20[var4] = (byte) 0;
        }
        int var4Lifetime1 = RatingQuery.pointCloudRasterSprite.field_a;
        int var5 = RatingQuery.pointCloudRasterSprite.field_h;
        int var6 = 0;
        int var7 = 0;
        while (var5 > var7) {
          int var8 = var6;
          int var9 = var6 - (-var4Lifetime1 + 1);
          boolean var10 = false;
          boolean var11 = false;
          int var12 = 0;
          while (!var10 ||
            !var11) {
            int stackIn_14_0 = ~var12;
            if (stackIn_14_0 > ~var4Lifetime1) {
              if (!var10 &&
                var25[var8] != 0) {
                var10 = true;
                var26[var8] = (byte) 1;
              }
              if (!var11 &&
                var25[var9] != 0) {
                var26[var9] = (byte) 1;
                var11 = true;
              }
              var8++;
              var9--;
              var12++;
              continue;
            }
            break;
          }
          var6 = var6 + var4Lifetime1;
          var7++;
        }
        int var7Lifetime1 = 0;
        int var8Lifetime1 = (-1 + var5) * var4Lifetime1;
        int var9Lifetime1 = 0;
        while (true) {
          if (var9Lifetime1 >= var4Lifetime1) {
            return ChatMessage.effectOutlineSprite;
          }
          int var10Lifetime1 = var7Lifetime1;
          int var11Lifetime1 = var7Lifetime1 + var8Lifetime1;
          boolean var12Lifetime1 = false;
          boolean var13 = false;
          int var14 = 0;
          var7Lifetime1++;
          while (!var12Lifetime1 ||
            !var13) {
            int stackIn_36_0 = ~var14;
            if (stackIn_36_0 > ~var5) {
              if (!var12Lifetime1 &&
                var25[var10Lifetime1] != 0) {
                var12Lifetime1 = true;
                var26[var10Lifetime1] = (byte) 1;
              }
              if (!var13 &&
                var25[var11Lifetime1] != 0) {
                var26[var11Lifetime1] = (byte) 1;
                var13 = true;
              }
              var10Lifetime1 = var10Lifetime1 + var4Lifetime1;
              var14++;
              var11Lifetime1 = var11Lifetime1 - var4Lifetime1;
              continue;
            }
            break;
          }
          var9Lifetime1++;
        }
    }

    PointCloudEffect(int count) {
        this.persistentParticles = false;
        this.indexedRendering = false;
        this.fadeThreshold = 0;
        this.fadeThreshold = 96;
        this.persistentParticles = true;
        this.particleCount = count;
        this.allocatePointArrays(this.particleCount, 0);
        this.activeParticles = new boolean[this.particleCount];
    }

    static {
        field_r = new String[]{"Showing by rating", "Showing by win percentage"};
        field_v = "Objective";
        field_z = new String[]{"By rating", "By win percentage"};
    }
}
