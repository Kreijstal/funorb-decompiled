/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareGraphicsToolkit extends GraphicsToolkit {
    private int canvasHeight;
    private ToolkitRasterBuffer canvasBuffer;
    private java.awt.Canvas canvas;
    private int canvasWidth;
    private IntrusiveNodeHashTable canvasBuffers;
    private boolean field_J;
    private boolean disposed;
    private int field_A;
    private int projectionCenterX;
    private int nearPlane;
    int targetWidth;
    private int projectionScaleY;
    private int field_x;
    int clipLeft;
    int[] pixels;
    private int projectionScaleX;
    private int contextCount;
    int clipRight;
    private SoftLruCache field_u;
    private int field_m;
    private int projectionCenterY;
    private SoftwareRenderTarget renderTarget;
    int clipTop;
    private int field_w;
    int clipBottom;
    private int field_F;
    private int targetHeight;
    private int farPlane;
    private SoftwareRenderContext[] contexts;
    private SoftLruCache field_E;
    private static String offText;

    final void updateTime(int timeMillis) {
        ScrollingTexturePixels var4 = null;
        int var5 = 0;
        TextureMetadata var6 = null;
        int var2 = timeMillis - this.field_A;
        Object var3 = this.field_u.firstValue(0);
        while (var3 != null) {
          var4 = (ScrollingTexturePixels) (var3);
          if (var4.used) {
            var4.elapsedMillis = var4.elapsedMillis + var2;
            var5 = var4.elapsedMillis / 20;
            if (var5 > 0) {
              var6 = this.textureProvider.a(-29193, var4.textureId);
              var4.scroll(var6.field_c * var2 * 50 / 1000, var6.field_u * var2 * 50 / 1000);
              var4.elapsedMillis = var4.elapsedMillis - var5 * 20;
            }
            var4.used = false;
          }
          var3 = this.field_u.nextValue((byte) -92);
        }
        this.field_A = timeMillis;
        this.field_E.age(5, 22663);
        this.field_u.age(5, 22663);
    }

    final int farPlane() {
        return this.farPlane;
    }

    final int nearPlane() {
        return this.nearPlane;
    }

    final void clear(int color) {
        this.fillRectangle(0, 0, this.targetWidth, this.targetHeight, color, 0);
    }

    final void intersectClip(int left, int top, int right, int bottom) {
        if (this.clipLeft < left) {
          this.clipLeft = left;
        }
        if (this.clipTop < top) {
          this.clipTop = top;
        }
        if (this.clipRight > right) {
          this.clipRight = right;
        }
        if (this.clipBottom > bottom) {
          this.clipBottom = bottom;
        }
        this.updateClipRowOffsets();
    }

    final boolean isFloatPostProcessingEnabled() {
        return false;
    }

    final ToolkitSprite createSprite(SpriteData data, boolean preferIndexed) {
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_27_2 = 0;
        int[] var3;
        byte[] var4;
        int var5;
        int var6;
        Object var7;
        int[] var8;
        byte[] var9;
        int var10;
        int var11;
        int var12;
        int var13;
        byte[] var14;
        int[] var15;
        int[] var16;
        byte[] var17;
        int[] var18;
        int[] var19;
        int[] var20;
        byte[] var21;
        int[] var22;
        int[] var23;
        var20 = data.field_g;
        var16 = var20;
        var3 = var16;
        var4 = data.field_e;
        var5 = data.field_h;
        var6 = data.field_i;
        if (preferIndexed &&
          data.field_a == null) {
          var22 = new int[var20.length];
          var18 = var22;
          var8 = var18;
          var21 = new byte[var5 * var6];
          var17 = var21;
          var14 = var17;
          var9 = var14;
          for (var10 = 0; var10 < var6; var10++) {
            var11 = var10 * var5;
            for (var12 = 0; var12 < var5; var12++) {
              var14[var11 + var12] = var4[var11 + var12];
            }
          }
          for (var10 = 0; var10 < var20.length; var10++) {
            var8[var10] = var20[var10];
          }
          var7 = new SoftwareIndexedSprite(this, var21, var22, var5, var6);
        } else {
          var23 = new int[var5 * var6];
          var19 = var23;
          var15 = var19;
          var9 = data.field_a;
          if (var9 != null) {
            for (var10 = 0; var10 < var6; var10++) {
              var11 = var10 * var5;
              for (var12 = 0; var12 < var5; var12++) {
                var15[var11 + var12] = var3[var4[var11 + var12] & 255] | var9[var11 + var12] << 24;
              }
            }
            var7 = new SoftwareArgbSprite(this, var23, var5, var6);
          } else {
            for (var10 = 0; var10 < var6; var10++) {
              var11 = var10 * var5;
              for (var12 = 0; var12 < var5; var12++) {
                var13 = var3[var4[var11 + var12] & 255];
                stackIn_26_0 = var15;
                stackIn_26_1 = var11 + var12;
                if (var13 == 0) {
                  stackIn_27_2 = 0;
                } else {
                  stackIn_27_2 = -16777216 | var13;
                }
                stackIn_26_0[stackIn_26_1] = stackIn_27_2;
              }
            }
            var7 = new SoftwareRgbSprite(this, var23, var5, var6);
          }
        }
        ((ToolkitSprite) (var7)).setInsets(data.field_c, data.field_d, data.field_b, data.field_f);
        return (ToolkitSprite) (var7);
    }

    private SoftwareGraphicsToolkit(TextureProvider param0) {
        super(param0);
        SoftwareTransform3D discarded$0 = null;
        this.disposed = false;
        this.field_J = false;
        this.canvasBuffers = new IntrusiveNodeHashTable(4);
        this.projectionScaleY = 512;
        this.clipRight = 0;
        this.nearPlane = 50;
        this.clipBottom = 0;
        this.projectionScaleX = 512;
        this.clipLeft = 0;
        this.clipTop = 0;
        this.farPlane = 3500;
        this.field_E = new SoftLruCache(16);
        try {
          this.field_u = new SoftLruCache(256);
          discarded$0 = new SoftwareTransform3D();
          this.createContexts(1);
          this.bindContextToCurrentThread(0);
          RasterColorTables.retainColorTables(true, -52, true);
          this.field_J = true;
          this.field_A = (int)IntroMeshResources.monotonicTimeMillis(-48);
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          this.close((byte) -34);
          throw new RuntimeException("");
        }
    }

    final void drawCircle(int centerX, int centerY, int radius, int color, int blendMode) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var8Lifetime2;
        int var9Lifetime2;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime2;
        int var12Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var14Lifetime5;
        int var14Lifetime6;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var15Lifetime5;
        int var15Lifetime6;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var16Lifetime5;
        int var16Lifetime6;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var17Lifetime6;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var18Lifetime6;
        int var14Lifetime7;
        int var14Lifetime8;
        int var14Lifetime9;
        int var14Lifetime10;
        int var14Lifetime11;
        int var15Lifetime7;
        int var15Lifetime8;
        int var15Lifetime9;
        int var15Lifetime10;
        int var15Lifetime11;
        int var16Lifetime7;
        int var16Lifetime8;
        int var16Lifetime9;
        int var16Lifetime10;
        int var16Lifetime11;
        int var17Lifetime7;
        int var17Lifetime8;
        int var17Lifetime9;
        int var17Lifetime10;
        int var17Lifetime11;
        int var18Lifetime7;
        int var18Lifetime8;
        int var18Lifetime9;
        int var18Lifetime10;
        int var18Lifetime11;
        int var14Lifetime1Lifetime1;
        int var14Lifetime1Lifetime2;
        int var14Lifetime1Lifetime3;
        int var14Lifetime1Lifetime4;
        int var14Lifetime6Lifetime1;
        int var14Lifetime6Lifetime2;
        int var14Lifetime6Lifetime3;
        int var14Lifetime6Lifetime4;
        int var15Lifetime1Lifetime1;
        int var15Lifetime1Lifetime2;
        int var15Lifetime1Lifetime3;
        int var15Lifetime1Lifetime4;
        int var15Lifetime6Lifetime1;
        int var15Lifetime6Lifetime2;
        int var15Lifetime6Lifetime3;
        int var15Lifetime6Lifetime4;
        int var16Lifetime1Lifetime1;
        int var16Lifetime1Lifetime2;
        int var16Lifetime1Lifetime3;
        int var16Lifetime1Lifetime4;
        int var16Lifetime6Lifetime1;
        int var16Lifetime6Lifetime2;
        int var16Lifetime6Lifetime3;
        int var16Lifetime6Lifetime4;
        int var17Lifetime1Lifetime1;
        int var17Lifetime1Lifetime2;
        int var17Lifetime1Lifetime3;
        int var17Lifetime1Lifetime4;
        int var17Lifetime6Lifetime1;
        int var17Lifetime6Lifetime2;
        int var17Lifetime6Lifetime3;
        int var17Lifetime6Lifetime4;
        int var18Lifetime1Lifetime1;
        int var18Lifetime1Lifetime2;
        int var18Lifetime1Lifetime3;
        int var18Lifetime1Lifetime4;
        int var18Lifetime6Lifetime1;
        int var18Lifetime6Lifetime2;
        int var18Lifetime6Lifetime3;
        int var18Lifetime6Lifetime4;
        int var14Lifetime12;
        int var14Lifetime13;
        int var14Lifetime14;
        int var14Lifetime15;
        int var15Lifetime12;
        int var15Lifetime13;
        int var15Lifetime14;
        int var15Lifetime15;
        int var16Lifetime12;
        int var16Lifetime13;
        int var16Lifetime14;
        int var16Lifetime15;
        int var16Lifetime16;
        int var16Lifetime17;
        int var16Lifetime18;
        int var16Lifetime19;
        int var17Lifetime12;
        int var17Lifetime13;
        int var17Lifetime14;
        int var17Lifetime15;
        int var18Lifetime12;
        int var18Lifetime13;
        int var18Lifetime14;
        int var18Lifetime15;
        int var14Lifetime6Lifetime5;
        int var15Lifetime6Lifetime5;
        int var16Lifetime6Lifetime5;
        int var17Lifetime6Lifetime5;
        int var18Lifetime6Lifetime5;
        int var14Lifetime11Lifetime1;
        int var14Lifetime11Lifetime2;
        int var14Lifetime11Lifetime3;
        int var14Lifetime11Lifetime4;
        int var15Lifetime11Lifetime1;
        int var15Lifetime11Lifetime2;
        int var15Lifetime11Lifetime3;
        int var15Lifetime11Lifetime4;
        int var16Lifetime7Lifetime1;
        int var16Lifetime8Lifetime1;
        int var16Lifetime9Lifetime1;
        int var16Lifetime10Lifetime1;
        int var16Lifetime11Lifetime1;
        int var16Lifetime11Lifetime2;
        int var16Lifetime11Lifetime3;
        int var16Lifetime11Lifetime4;
        int var16Lifetime11Lifetime5;
        int var17Lifetime11Lifetime1;
        int var17Lifetime11Lifetime2;
        int var17Lifetime11Lifetime3;
        int var17Lifetime11Lifetime4;
        int var18Lifetime11Lifetime1;
        int var18Lifetime11Lifetime2;
        int var18Lifetime11Lifetime3;
        int var18Lifetime11Lifetime4;
        int var14Lifetime1Lifetime4Lifetime1;
        int var14Lifetime1Lifetime4Lifetime2;
        int var14Lifetime1Lifetime4Lifetime3;
        int var14Lifetime1Lifetime4Lifetime4;
        int var14Lifetime1Lifetime4Lifetime5;
        int var14Lifetime1Lifetime4Lifetime6;
        int var14Lifetime1Lifetime4Lifetime7;
        int var14Lifetime6Lifetime1Lifetime1;
        int var14Lifetime6Lifetime2Lifetime1;
        int var15Lifetime1Lifetime4Lifetime1;
        int var15Lifetime1Lifetime4Lifetime2;
        int var15Lifetime1Lifetime4Lifetime3;
        int var15Lifetime1Lifetime4Lifetime4;
        int var15Lifetime1Lifetime4Lifetime5;
        int var15Lifetime1Lifetime4Lifetime6;
        int var15Lifetime1Lifetime4Lifetime7;
        int var15Lifetime6Lifetime1Lifetime1;
        int var15Lifetime6Lifetime2Lifetime1;
        int var16Lifetime1Lifetime4Lifetime1;
        int var16Lifetime1Lifetime4Lifetime2;
        int var16Lifetime1Lifetime4Lifetime3;
        int var16Lifetime1Lifetime4Lifetime4;
        int var16Lifetime1Lifetime4Lifetime5;
        int var16Lifetime1Lifetime4Lifetime6;
        int var16Lifetime1Lifetime4Lifetime7;
        int var16Lifetime6Lifetime1Lifetime1;
        int var16Lifetime6Lifetime2Lifetime1;
        int var17Lifetime1Lifetime4Lifetime1;
        int var17Lifetime1Lifetime4Lifetime2;
        int var17Lifetime1Lifetime4Lifetime3;
        int var17Lifetime1Lifetime4Lifetime4;
        int var17Lifetime1Lifetime4Lifetime5;
        int var17Lifetime1Lifetime4Lifetime6;
        int var17Lifetime1Lifetime4Lifetime7;
        int var17Lifetime6Lifetime1Lifetime1;
        int var17Lifetime6Lifetime2Lifetime1;
        int var18Lifetime1Lifetime4Lifetime1;
        int var18Lifetime1Lifetime4Lifetime2;
        int var18Lifetime1Lifetime4Lifetime3;
        int var18Lifetime1Lifetime4Lifetime4;
        int var18Lifetime1Lifetime4Lifetime5;
        int var18Lifetime1Lifetime4Lifetime6;
        int var18Lifetime1Lifetime4Lifetime7;
        int var18Lifetime6Lifetime1Lifetime1;
        int var18Lifetime6Lifetime2Lifetime1;
        if (radius == 0) {
          if (centerX >= this.clipLeft) {
            if (centerY >= this.clipTop &&
              centerX < this.clipRight &&
              centerY < this.clipBottom) {
              var6 = color >>> 24;
              var7 = centerX + centerY * this.targetWidth;
              if (blendMode != 0 && (blendMode != 1 ||
                var6 != 255)) {
                if (blendMode == 1) {
                  var8 = var7;
                  var9 = color;
                  var10 = var6;
                  var9 = ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280) + (var10 << 24);
                  var11 = 256 - var10;
                  var12 = this.pixels[var8];
                  var12 = ((var12 & 16711935) * var11 >> 8 & 16711935) + ((var12 & 65280) * var11 >> 8 & 65280);
                  this.pixels[var8] = var9 + var12;
                  return;
                }
                if (blendMode != 2) {
                  return;
                }
                var8Lifetime2 = var7;
                var9Lifetime2 = color;
                var10Lifetime2 = this.pixels[var8Lifetime2];
                var11Lifetime2 = var9Lifetime2 + var10Lifetime2;
                var12Lifetime2 = (var9Lifetime2 & 16711935) + (var10Lifetime2 & 16711935);
                var10Lifetime3 = (var12Lifetime2 & 16777472) + (var11Lifetime2 - var12Lifetime2 & 65536);
                this.pixels[var8Lifetime2] = var11Lifetime2 - var10Lifetime3 | var10Lifetime3 - (var10Lifetime3 >>> 8);
                return;
              }
              this.pixels[var7] = color;
              return;
            }
            return;
          }
          return;
        }
        if (radius < 0) {
          radius = -radius;
        }
        if (this.clipRight > this.clipLeft) {
          if (this.clipBottom <= this.clipTop) {
            return;
          }
          if (centerX + radius >= this.clipLeft) {
            if (centerX - radius < this.clipRight &&
              centerY + radius >= this.clipTop &&
              centerY - radius < this.clipBottom) {
              var6Lifetime1 = centerX + centerY * this.targetWidth;
              var7Lifetime1 = var6Lifetime1;
              var8Lifetime1 = var6Lifetime1 - radius * this.targetWidth;
              var9Lifetime1 = var6Lifetime1 + radius * this.targetWidth;
              var10Lifetime1 = radius;
              var11Lifetime1 = 0;
              radius = radius * radius;
              var12Lifetime1 = radius - var10Lifetime1;
              var13 = color >>> 24;
              if (blendMode != 0 && (blendMode != 1 ||
                var13 != 255)) {
                if (blendMode != 1) {
                  if (blendMode != 2) {
                    return;
                  }
                  if (centerX - var10Lifetime1 >= this.clipLeft &&
                    centerX + var10Lifetime1 < this.clipRight &&
                    centerY - var10Lifetime1 >= this.clipTop &&
                    centerY + var10Lifetime1 < this.clipBottom) {
                    var14 = var6Lifetime1 - var10Lifetime1;
                    var15 = color;
                    var16 = this.pixels[var14];
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var16Lifetime12 = (var18 & 16777472) + (var17 - var18 & 65536);
                    this.pixels[var14] = var17 - var16Lifetime12 | var16Lifetime12 - (var16Lifetime12 >>> 8);
                    var14Lifetime12 = var6Lifetime1 + var10Lifetime1;
                    var15Lifetime12 = color;
                    var16Lifetime13 = this.pixels[var14Lifetime12];
                    var17Lifetime12 = var15Lifetime12 + var16Lifetime13;
                    var18Lifetime12 = (var15Lifetime12 & 16711935) + (var16Lifetime13 & 16711935);
                    var16Lifetime14 = (var18Lifetime12 & 16777472) + (var17Lifetime12 - var18Lifetime12 & 65536);
                    this.pixels[var14Lifetime12] = var17Lifetime12 - var16Lifetime14 | var16Lifetime14 - (var16Lifetime14 >>> 8);
                    var14Lifetime13 = var8Lifetime1;
                    var15Lifetime13 = color;
                    var16Lifetime15 = this.pixels[var14Lifetime13];
                    var17Lifetime13 = var15Lifetime13 + var16Lifetime15;
                    var18Lifetime13 = (var15Lifetime13 & 16711935) + (var16Lifetime15 & 16711935);
                    var16Lifetime16 = (var18Lifetime13 & 16777472) + (var17Lifetime13 - var18Lifetime13 & 65536);
                    this.pixels[var14Lifetime13] = var17Lifetime13 - var16Lifetime16 | var16Lifetime16 - (var16Lifetime16 >>> 8);
                    var14Lifetime14 = var9Lifetime1;
                    var15Lifetime14 = color;
                    var16Lifetime17 = this.pixels[var14Lifetime14];
                    var17Lifetime14 = var15Lifetime14 + var16Lifetime17;
                    var18Lifetime14 = (var15Lifetime14 & 16711935) + (var16Lifetime17 & 16711935);
                    var16Lifetime18 = (var18Lifetime14 & 16777472) + (var17Lifetime14 - var18Lifetime14 & 65536);
                    this.pixels[var14Lifetime14] = var17Lifetime14 - var16Lifetime18 | var16Lifetime18 - (var16Lifetime18 >>> 8);
                    while (true) {
                      incrementValue$0 = var11Lifetime1;
                      var11Lifetime1++;
                      var12Lifetime1 = var12Lifetime1 + (incrementValue$0 + var11Lifetime1);
                      var6Lifetime1 = var6Lifetime1 - this.targetWidth;
                      var7Lifetime1 = var7Lifetime1 + this.targetWidth;
                      if (var12Lifetime1 > radius) {
                        var10Lifetime1--;
                        var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                        var8Lifetime1 = var8Lifetime1 + this.targetWidth;
                        var9Lifetime1 = var9Lifetime1 - this.targetWidth;
                      }
                      if (var10Lifetime1 < var11Lifetime1) {
                        return;
                      }
                      var14Lifetime15 = var8Lifetime1 - var11Lifetime1;
                      var15Lifetime15 = color;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var8Lifetime1 + var11Lifetime1;
                      var15Lifetime15 = color;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var6Lifetime1 - var10Lifetime1;
                      var15Lifetime15 = color;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var6Lifetime1 + var10Lifetime1;
                      var15Lifetime15 = color;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var7Lifetime1 - var10Lifetime1;
                      var15Lifetime15 = color;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var7Lifetime1 + var10Lifetime1;
                      var15Lifetime15 = color;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var9Lifetime1 - var11Lifetime1;
                      var15Lifetime15 = color;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var9Lifetime1 + var11Lifetime1;
                      var15Lifetime15 = color;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                    }
                  }
                  if (centerX - var10Lifetime1 >= this.clipLeft &&
                    centerY >= this.clipTop &&
                    centerY < this.clipBottom) {
                    var14Lifetime7 = var6Lifetime1 - var10Lifetime1;
                    var15Lifetime7 = color;
                    var16Lifetime7 = this.pixels[var14Lifetime7];
                    var17Lifetime7 = var15Lifetime7 + var16Lifetime7;
                    var18Lifetime7 = (var15Lifetime7 & 16711935) + (var16Lifetime7 & 16711935);
                    var16Lifetime7Lifetime1 = (var18Lifetime7 & 16777472) + (var17Lifetime7 - var18Lifetime7 & 65536);
                    this.pixels[var14Lifetime7] = var17Lifetime7 - var16Lifetime7Lifetime1 | var16Lifetime7Lifetime1 - (var16Lifetime7Lifetime1 >>> 8);
                  }
                  if (centerX + var10Lifetime1 < this.clipRight &&
                    centerY >= this.clipTop &&
                    centerY < this.clipBottom) {
                    var14Lifetime8 = var6Lifetime1 + var10Lifetime1;
                    var15Lifetime8 = color;
                    var16Lifetime8 = this.pixels[var14Lifetime8];
                    var17Lifetime8 = var15Lifetime8 + var16Lifetime8;
                    var18Lifetime8 = (var15Lifetime8 & 16711935) + (var16Lifetime8 & 16711935);
                    var16Lifetime8Lifetime1 = (var18Lifetime8 & 16777472) + (var17Lifetime8 - var18Lifetime8 & 65536);
                    this.pixels[var14Lifetime8] = var17Lifetime8 - var16Lifetime8Lifetime1 | var16Lifetime8Lifetime1 - (var16Lifetime8Lifetime1 >>> 8);
                  }
                  if (centerY - var10Lifetime1 >= this.clipTop &&
                    centerX >= this.clipLeft &&
                    centerX < this.clipRight) {
                    var14Lifetime9 = var8Lifetime1;
                    var15Lifetime9 = color;
                    var16Lifetime9 = this.pixels[var14Lifetime9];
                    var17Lifetime9 = var15Lifetime9 + var16Lifetime9;
                    var18Lifetime9 = (var15Lifetime9 & 16711935) + (var16Lifetime9 & 16711935);
                    var16Lifetime9Lifetime1 = (var18Lifetime9 & 16777472) + (var17Lifetime9 - var18Lifetime9 & 65536);
                    this.pixels[var14Lifetime9] = var17Lifetime9 - var16Lifetime9Lifetime1 | var16Lifetime9Lifetime1 - (var16Lifetime9Lifetime1 >>> 8);
                  }
                  if (centerY + var10Lifetime1 < this.clipBottom &&
                    centerX >= this.clipLeft &&
                    centerX < this.clipRight) {
                    var14Lifetime10 = var9Lifetime1;
                    var15Lifetime10 = color;
                    var16Lifetime10 = this.pixels[var14Lifetime10];
                    var17Lifetime10 = var15Lifetime10 + var16Lifetime10;
                    var18Lifetime10 = (var15Lifetime10 & 16711935) + (var16Lifetime10 & 16711935);
                    var16Lifetime10Lifetime1 = (var18Lifetime10 & 16777472) + (var17Lifetime10 - var18Lifetime10 & 65536);
                    this.pixels[var14Lifetime10] = var17Lifetime10 - var16Lifetime10Lifetime1 | var16Lifetime10Lifetime1 - (var16Lifetime10Lifetime1 >>> 8);
                  }
                  while (true) {
                    incrementValue$1 = var11Lifetime1;
                    var11Lifetime1++;
                    var12Lifetime1 = var12Lifetime1 + (incrementValue$1 + var11Lifetime1);
                    var6Lifetime1 = var6Lifetime1 - this.targetWidth;
                    var7Lifetime1 = var7Lifetime1 + this.targetWidth;
                    if (var12Lifetime1 > radius) {
                      var10Lifetime1--;
                      var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                      var8Lifetime1 = var8Lifetime1 + this.targetWidth;
                      var9Lifetime1 = var9Lifetime1 - this.targetWidth;
                    }
                    if (var10Lifetime1 < var11Lifetime1) {
                      return;
                    }
                    if (centerY - var10Lifetime1 >= this.clipTop &&
                      centerY - var10Lifetime1 < this.clipBottom) {
                      if (centerX - var11Lifetime1 >= this.clipLeft &&
                        centerX - var11Lifetime1 < this.clipRight) {
                        var14Lifetime11 = var8Lifetime1 - var11Lifetime1;
                        var15Lifetime11 = color;
                        var16Lifetime11 = this.pixels[var14Lifetime11];
                        var17Lifetime11 = var15Lifetime11 + var16Lifetime11;
                        var18Lifetime11 = (var15Lifetime11 & 16711935) + (var16Lifetime11 & 16711935);
                        var16Lifetime11 = (var18Lifetime11 & 16777472) + (var17Lifetime11 - var18Lifetime11 & 65536);
                        this.pixels[var14Lifetime11] = var17Lifetime11 - var16Lifetime11 | var16Lifetime11 - (var16Lifetime11 >>> 8);
                      }
                      if (centerX + var11Lifetime1 >= this.clipLeft &&
                        centerX + var11Lifetime1 < this.clipRight) {
                        var14Lifetime11 = var8Lifetime1 + var11Lifetime1;
                        var15Lifetime11 = color;
                        var16Lifetime11 = this.pixels[var14Lifetime11];
                        var17Lifetime11 = var15Lifetime11 + var16Lifetime11;
                        var18Lifetime11 = (var15Lifetime11 & 16711935) + (var16Lifetime11 & 16711935);
                        var16Lifetime11 = (var18Lifetime11 & 16777472) + (var17Lifetime11 - var18Lifetime11 & 65536);
                        this.pixels[var14Lifetime11] = var17Lifetime11 - var16Lifetime11 | var16Lifetime11 - (var16Lifetime11 >>> 8);
                      }
                    }
                    if (centerY - var11Lifetime1 >= this.clipTop &&
                      centerY - var11Lifetime1 < this.clipBottom) {
                      if (centerX - var10Lifetime1 >= this.clipLeft &&
                        centerX - var10Lifetime1 < this.clipRight) {
                        var14Lifetime11Lifetime1 = var6Lifetime1 - var10Lifetime1;
                        var15Lifetime11Lifetime1 = color;
                        var16Lifetime11Lifetime1 = this.pixels[var14Lifetime11Lifetime1];
                        var17Lifetime11Lifetime1 = var15Lifetime11Lifetime1 + var16Lifetime11Lifetime1;
                        var18Lifetime11Lifetime1 = (var15Lifetime11Lifetime1 & 16711935) + (var16Lifetime11Lifetime1 & 16711935);
                        var16Lifetime11Lifetime1 = (var18Lifetime11Lifetime1 & 16777472) + (var17Lifetime11Lifetime1 - var18Lifetime11Lifetime1 & 65536);
                        this.pixels[var14Lifetime11Lifetime1] = var17Lifetime11Lifetime1 - var16Lifetime11Lifetime1 | var16Lifetime11Lifetime1 - (var16Lifetime11Lifetime1 >>> 8);
                      }
                      if (centerX + var10Lifetime1 >= this.clipLeft &&
                        centerX + var10Lifetime1 < this.clipRight) {
                        var14Lifetime11Lifetime1 = var6Lifetime1 + var10Lifetime1;
                        var15Lifetime11Lifetime1 = color;
                        var16Lifetime11Lifetime1 = this.pixels[var14Lifetime11Lifetime1];
                        var17Lifetime11Lifetime1 = var15Lifetime11Lifetime1 + var16Lifetime11Lifetime1;
                        var18Lifetime11Lifetime1 = (var15Lifetime11Lifetime1 & 16711935) + (var16Lifetime11Lifetime1 & 16711935);
                        var16Lifetime11Lifetime1 = (var18Lifetime11Lifetime1 & 16777472) + (var17Lifetime11Lifetime1 - var18Lifetime11Lifetime1 & 65536);
                        this.pixels[var14Lifetime11Lifetime1] = var17Lifetime11Lifetime1 - var16Lifetime11Lifetime1 | var16Lifetime11Lifetime1 - (var16Lifetime11Lifetime1 >>> 8);
                      }
                    }
                    if (centerY + var11Lifetime1 >= this.clipTop &&
                      centerY + var11Lifetime1 < this.clipBottom) {
                      if (centerX - var10Lifetime1 >= this.clipLeft &&
                        centerX - var10Lifetime1 < this.clipRight) {
                        var14Lifetime11Lifetime2 = var7Lifetime1 - var10Lifetime1;
                        var15Lifetime11Lifetime2 = color;
                        var16Lifetime11Lifetime2 = this.pixels[var14Lifetime11Lifetime2];
                        var17Lifetime11Lifetime2 = var15Lifetime11Lifetime2 + var16Lifetime11Lifetime2;
                        var18Lifetime11Lifetime2 = (var15Lifetime11Lifetime2 & 16711935) + (var16Lifetime11Lifetime2 & 16711935);
                        var16Lifetime11Lifetime2 = (var18Lifetime11Lifetime2 & 16777472) + (var17Lifetime11Lifetime2 - var18Lifetime11Lifetime2 & 65536);
                        this.pixels[var14Lifetime11Lifetime2] = var17Lifetime11Lifetime2 - var16Lifetime11Lifetime2 | var16Lifetime11Lifetime2 - (var16Lifetime11Lifetime2 >>> 8);
                      }
                      if (centerX + var10Lifetime1 >= this.clipLeft &&
                        centerX + var10Lifetime1 < this.clipRight) {
                        var14Lifetime11Lifetime2 = var7Lifetime1 + var10Lifetime1;
                        var15Lifetime11Lifetime2 = color;
                        var16Lifetime11Lifetime2 = this.pixels[var14Lifetime11Lifetime2];
                        var17Lifetime11Lifetime2 = var15Lifetime11Lifetime2 + var16Lifetime11Lifetime2;
                        var18Lifetime11Lifetime2 = (var15Lifetime11Lifetime2 & 16711935) + (var16Lifetime11Lifetime2 & 16711935);
                        var16Lifetime11Lifetime2 = (var18Lifetime11Lifetime2 & 16777472) + (var17Lifetime11Lifetime2 - var18Lifetime11Lifetime2 & 65536);
                        this.pixels[var14Lifetime11Lifetime2] = var17Lifetime11Lifetime2 - var16Lifetime11Lifetime2 | var16Lifetime11Lifetime2 - (var16Lifetime11Lifetime2 >>> 8);
                      }
                    }
                    if (centerY + var10Lifetime1 < this.clipTop) {
                      continue;
                    }
                    if (centerY + var10Lifetime1 >= this.clipBottom) {
                      continue;
                    }
                    if (centerX - var11Lifetime1 >= this.clipLeft &&
                      centerX - var11Lifetime1 < this.clipRight) {
                      var14Lifetime11Lifetime3 = var9Lifetime1 - var11Lifetime1;
                      var15Lifetime11Lifetime3 = color;
                      var16Lifetime11Lifetime3 = this.pixels[var14Lifetime11Lifetime3];
                      var17Lifetime11Lifetime3 = var15Lifetime11Lifetime3 + var16Lifetime11Lifetime3;
                      var18Lifetime11Lifetime3 = (var15Lifetime11Lifetime3 & 16711935) + (var16Lifetime11Lifetime3 & 16711935);
                      var16Lifetime11Lifetime3 = (var18Lifetime11Lifetime3 & 16777472) + (var17Lifetime11Lifetime3 - var18Lifetime11Lifetime3 & 65536);
                      this.pixels[var14Lifetime11Lifetime3] = var17Lifetime11Lifetime3 - var16Lifetime11Lifetime3 | var16Lifetime11Lifetime3 - (var16Lifetime11Lifetime3 >>> 8);
                    }
                    if (centerX + var11Lifetime1 < this.clipLeft) {
                      continue;
                    }
                    if (centerX + var11Lifetime1 >= this.clipRight) {
                      continue;
                    }
                    var14Lifetime11Lifetime4 = var9Lifetime1 + var11Lifetime1;
                    var15Lifetime11Lifetime4 = color;
                    var16Lifetime11Lifetime4 = this.pixels[var14Lifetime11Lifetime4];
                    var17Lifetime11Lifetime4 = var15Lifetime11Lifetime4 + var16Lifetime11Lifetime4;
                    var18Lifetime11Lifetime4 = (var15Lifetime11Lifetime4 & 16711935) + (var16Lifetime11Lifetime4 & 16711935);
                    var16Lifetime11Lifetime5 = (var18Lifetime11Lifetime4 & 16777472) + (var17Lifetime11Lifetime4 - var18Lifetime11Lifetime4 & 65536);
                    this.pixels[var14Lifetime11Lifetime4] = var17Lifetime11Lifetime4 - var16Lifetime11Lifetime5 | var16Lifetime11Lifetime5 - (var16Lifetime11Lifetime5 >>> 8);
                  }
                }
                if (centerX - var10Lifetime1 >= this.clipLeft &&
                  centerX + var10Lifetime1 < this.clipRight &&
                  centerY - var10Lifetime1 >= this.clipTop &&
                  centerY + var10Lifetime1 < this.clipBottom) {
                  var14Lifetime1 = var6Lifetime1 - var10Lifetime1;
                  var15Lifetime1 = color;
                  var16Lifetime1 = var13;
                  var15Lifetime1 = ((var15Lifetime1 & 16711935) * var16Lifetime1 >> 8 & 16711935) + ((var15Lifetime1 & 65280) * var16Lifetime1 >> 8 & 65280) + (var16Lifetime1 << 24);
                  var17Lifetime1 = 256 - var16Lifetime1;
                  var18Lifetime1 = this.pixels[var14Lifetime1];
                  var18Lifetime1 = ((var18Lifetime1 & 16711935) * var17Lifetime1 >> 8 & 16711935) + ((var18Lifetime1 & 65280) * var17Lifetime1 >> 8 & 65280);
                  this.pixels[var14Lifetime1] = var15Lifetime1 + var18Lifetime1;
                  var14Lifetime1Lifetime1 = var6Lifetime1 + var10Lifetime1;
                  var15Lifetime1Lifetime1 = color;
                  var16Lifetime1Lifetime1 = var13;
                  var15Lifetime1Lifetime1 = ((var15Lifetime1Lifetime1 & 16711935) * var16Lifetime1Lifetime1 >> 8 & 16711935) + ((var15Lifetime1Lifetime1 & 65280) * var16Lifetime1Lifetime1 >> 8 & 65280) + (var16Lifetime1Lifetime1 << 24);
                  var17Lifetime1Lifetime1 = 256 - var16Lifetime1Lifetime1;
                  var18Lifetime1Lifetime1 = this.pixels[var14Lifetime1Lifetime1];
                  var18Lifetime1Lifetime1 = ((var18Lifetime1Lifetime1 & 16711935) * var17Lifetime1Lifetime1 >> 8 & 16711935) + ((var18Lifetime1Lifetime1 & 65280) * var17Lifetime1Lifetime1 >> 8 & 65280);
                  this.pixels[var14Lifetime1Lifetime1] = var15Lifetime1Lifetime1 + var18Lifetime1Lifetime1;
                  var14Lifetime1Lifetime2 = var8Lifetime1;
                  var15Lifetime1Lifetime2 = color;
                  var16Lifetime1Lifetime2 = var13;
                  var15Lifetime1Lifetime2 = ((var15Lifetime1Lifetime2 & 16711935) * var16Lifetime1Lifetime2 >> 8 & 16711935) + ((var15Lifetime1Lifetime2 & 65280) * var16Lifetime1Lifetime2 >> 8 & 65280) + (var16Lifetime1Lifetime2 << 24);
                  var17Lifetime1Lifetime2 = 256 - var16Lifetime1Lifetime2;
                  var18Lifetime1Lifetime2 = this.pixels[var14Lifetime1Lifetime2];
                  var18Lifetime1Lifetime2 = ((var18Lifetime1Lifetime2 & 16711935) * var17Lifetime1Lifetime2 >> 8 & 16711935) + ((var18Lifetime1Lifetime2 & 65280) * var17Lifetime1Lifetime2 >> 8 & 65280);
                  this.pixels[var14Lifetime1Lifetime2] = var15Lifetime1Lifetime2 + var18Lifetime1Lifetime2;
                  var14Lifetime1Lifetime3 = var9Lifetime1;
                  var15Lifetime1Lifetime3 = color;
                  var16Lifetime1Lifetime3 = var13;
                  var15Lifetime1Lifetime3 = ((var15Lifetime1Lifetime3 & 16711935) * var16Lifetime1Lifetime3 >> 8 & 16711935) + ((var15Lifetime1Lifetime3 & 65280) * var16Lifetime1Lifetime3 >> 8 & 65280) + (var16Lifetime1Lifetime3 << 24);
                  var17Lifetime1Lifetime3 = 256 - var16Lifetime1Lifetime3;
                  var18Lifetime1Lifetime3 = this.pixels[var14Lifetime1Lifetime3];
                  var18Lifetime1Lifetime3 = ((var18Lifetime1Lifetime3 & 16711935) * var17Lifetime1Lifetime3 >> 8 & 16711935) + ((var18Lifetime1Lifetime3 & 65280) * var17Lifetime1Lifetime3 >> 8 & 65280);
                  this.pixels[var14Lifetime1Lifetime3] = var15Lifetime1Lifetime3 + var18Lifetime1Lifetime3;
                  while (true) {
                    incrementValue$2 = var11Lifetime1;
                    var11Lifetime1++;
                    var12Lifetime1 = var12Lifetime1 + (incrementValue$2 + var11Lifetime1);
                    var6Lifetime1 = var6Lifetime1 - this.targetWidth;
                    var7Lifetime1 = var7Lifetime1 + this.targetWidth;
                    if (var12Lifetime1 > radius) {
                      var10Lifetime1--;
                      var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                      var8Lifetime1 = var8Lifetime1 + this.targetWidth;
                      var9Lifetime1 = var9Lifetime1 - this.targetWidth;
                    }
                    if (var10Lifetime1 < var11Lifetime1) {
                      return;
                    }
                    var14Lifetime1Lifetime4 = var8Lifetime1 - var11Lifetime1;
                    var15Lifetime1Lifetime4 = color;
                    var16Lifetime1Lifetime4 = var13;
                    var15Lifetime1Lifetime4 = ((var15Lifetime1Lifetime4 & 16711935) * var16Lifetime1Lifetime4 >> 8 & 16711935) + ((var15Lifetime1Lifetime4 & 65280) * var16Lifetime1Lifetime4 >> 8 & 65280) + (var16Lifetime1Lifetime4 << 24);
                    var17Lifetime1Lifetime4 = 256 - var16Lifetime1Lifetime4;
                    var18Lifetime1Lifetime4 = this.pixels[var14Lifetime1Lifetime4];
                    var18Lifetime1Lifetime4 = ((var18Lifetime1Lifetime4 & 16711935) * var17Lifetime1Lifetime4 >> 8 & 16711935) + ((var18Lifetime1Lifetime4 & 65280) * var17Lifetime1Lifetime4 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4] = var15Lifetime1Lifetime4 + var18Lifetime1Lifetime4;
                    var14Lifetime1Lifetime4Lifetime1 = var8Lifetime1 + var11Lifetime1;
                    var15Lifetime1Lifetime4Lifetime1 = color;
                    var16Lifetime1Lifetime4Lifetime1 = var13;
                    var15Lifetime1Lifetime4Lifetime1 = ((var15Lifetime1Lifetime4Lifetime1 & 16711935) * var16Lifetime1Lifetime4Lifetime1 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime1 & 65280) * var16Lifetime1Lifetime4Lifetime1 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime1 << 24);
                    var17Lifetime1Lifetime4Lifetime1 = 256 - var16Lifetime1Lifetime4Lifetime1;
                    var18Lifetime1Lifetime4Lifetime1 = this.pixels[var14Lifetime1Lifetime4Lifetime1];
                    var18Lifetime1Lifetime4Lifetime1 = ((var18Lifetime1Lifetime4Lifetime1 & 16711935) * var17Lifetime1Lifetime4Lifetime1 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime1 & 65280) * var17Lifetime1Lifetime4Lifetime1 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime1] = var15Lifetime1Lifetime4Lifetime1 + var18Lifetime1Lifetime4Lifetime1;
                    var14Lifetime1Lifetime4Lifetime2 = var6Lifetime1 - var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime2 = color;
                    var16Lifetime1Lifetime4Lifetime2 = var13;
                    var15Lifetime1Lifetime4Lifetime2 = ((var15Lifetime1Lifetime4Lifetime2 & 16711935) * var16Lifetime1Lifetime4Lifetime2 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime2 & 65280) * var16Lifetime1Lifetime4Lifetime2 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime2 << 24);
                    var17Lifetime1Lifetime4Lifetime2 = 256 - var16Lifetime1Lifetime4Lifetime2;
                    var18Lifetime1Lifetime4Lifetime2 = this.pixels[var14Lifetime1Lifetime4Lifetime2];
                    var18Lifetime1Lifetime4Lifetime2 = ((var18Lifetime1Lifetime4Lifetime2 & 16711935) * var17Lifetime1Lifetime4Lifetime2 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime2 & 65280) * var17Lifetime1Lifetime4Lifetime2 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime2] = var15Lifetime1Lifetime4Lifetime2 + var18Lifetime1Lifetime4Lifetime2;
                    var14Lifetime1Lifetime4Lifetime3 = var6Lifetime1 + var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime3 = color;
                    var16Lifetime1Lifetime4Lifetime3 = var13;
                    var15Lifetime1Lifetime4Lifetime3 = ((var15Lifetime1Lifetime4Lifetime3 & 16711935) * var16Lifetime1Lifetime4Lifetime3 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime3 & 65280) * var16Lifetime1Lifetime4Lifetime3 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime3 << 24);
                    var17Lifetime1Lifetime4Lifetime3 = 256 - var16Lifetime1Lifetime4Lifetime3;
                    var18Lifetime1Lifetime4Lifetime3 = this.pixels[var14Lifetime1Lifetime4Lifetime3];
                    var18Lifetime1Lifetime4Lifetime3 = ((var18Lifetime1Lifetime4Lifetime3 & 16711935) * var17Lifetime1Lifetime4Lifetime3 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime3 & 65280) * var17Lifetime1Lifetime4Lifetime3 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime3] = var15Lifetime1Lifetime4Lifetime3 + var18Lifetime1Lifetime4Lifetime3;
                    var14Lifetime1Lifetime4Lifetime4 = var7Lifetime1 - var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime4 = color;
                    var16Lifetime1Lifetime4Lifetime4 = var13;
                    var15Lifetime1Lifetime4Lifetime4 = ((var15Lifetime1Lifetime4Lifetime4 & 16711935) * var16Lifetime1Lifetime4Lifetime4 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime4 & 65280) * var16Lifetime1Lifetime4Lifetime4 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime4 << 24);
                    var17Lifetime1Lifetime4Lifetime4 = 256 - var16Lifetime1Lifetime4Lifetime4;
                    var18Lifetime1Lifetime4Lifetime4 = this.pixels[var14Lifetime1Lifetime4Lifetime4];
                    var18Lifetime1Lifetime4Lifetime4 = ((var18Lifetime1Lifetime4Lifetime4 & 16711935) * var17Lifetime1Lifetime4Lifetime4 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime4 & 65280) * var17Lifetime1Lifetime4Lifetime4 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime4] = var15Lifetime1Lifetime4Lifetime4 + var18Lifetime1Lifetime4Lifetime4;
                    var14Lifetime1Lifetime4Lifetime5 = var7Lifetime1 + var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime5 = color;
                    var16Lifetime1Lifetime4Lifetime5 = var13;
                    var15Lifetime1Lifetime4Lifetime5 = ((var15Lifetime1Lifetime4Lifetime5 & 16711935) * var16Lifetime1Lifetime4Lifetime5 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime5 & 65280) * var16Lifetime1Lifetime4Lifetime5 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime5 << 24);
                    var17Lifetime1Lifetime4Lifetime5 = 256 - var16Lifetime1Lifetime4Lifetime5;
                    var18Lifetime1Lifetime4Lifetime5 = this.pixels[var14Lifetime1Lifetime4Lifetime5];
                    var18Lifetime1Lifetime4Lifetime5 = ((var18Lifetime1Lifetime4Lifetime5 & 16711935) * var17Lifetime1Lifetime4Lifetime5 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime5 & 65280) * var17Lifetime1Lifetime4Lifetime5 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime5] = var15Lifetime1Lifetime4Lifetime5 + var18Lifetime1Lifetime4Lifetime5;
                    var14Lifetime1Lifetime4Lifetime6 = var9Lifetime1 - var11Lifetime1;
                    var15Lifetime1Lifetime4Lifetime6 = color;
                    var16Lifetime1Lifetime4Lifetime6 = var13;
                    var15Lifetime1Lifetime4Lifetime6 = ((var15Lifetime1Lifetime4Lifetime6 & 16711935) * var16Lifetime1Lifetime4Lifetime6 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime6 & 65280) * var16Lifetime1Lifetime4Lifetime6 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime6 << 24);
                    var17Lifetime1Lifetime4Lifetime6 = 256 - var16Lifetime1Lifetime4Lifetime6;
                    var18Lifetime1Lifetime4Lifetime6 = this.pixels[var14Lifetime1Lifetime4Lifetime6];
                    var18Lifetime1Lifetime4Lifetime6 = ((var18Lifetime1Lifetime4Lifetime6 & 16711935) * var17Lifetime1Lifetime4Lifetime6 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime6 & 65280) * var17Lifetime1Lifetime4Lifetime6 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime6] = var15Lifetime1Lifetime4Lifetime6 + var18Lifetime1Lifetime4Lifetime6;
                    var14Lifetime1Lifetime4Lifetime7 = var9Lifetime1 + var11Lifetime1;
                    var15Lifetime1Lifetime4Lifetime7 = color;
                    var16Lifetime1Lifetime4Lifetime7 = var13;
                    var15Lifetime1Lifetime4Lifetime7 = ((var15Lifetime1Lifetime4Lifetime7 & 16711935) * var16Lifetime1Lifetime4Lifetime7 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime7 & 65280) * var16Lifetime1Lifetime4Lifetime7 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime7 << 24);
                    var17Lifetime1Lifetime4Lifetime7 = 256 - var16Lifetime1Lifetime4Lifetime7;
                    var18Lifetime1Lifetime4Lifetime7 = this.pixels[var14Lifetime1Lifetime4Lifetime7];
                    var18Lifetime1Lifetime4Lifetime7 = ((var18Lifetime1Lifetime4Lifetime7 & 16711935) * var17Lifetime1Lifetime4Lifetime7 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime7 & 65280) * var17Lifetime1Lifetime4Lifetime7 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime7] = var15Lifetime1Lifetime4Lifetime7 + var18Lifetime1Lifetime4Lifetime7;
                  }
                }
                if (centerX - var10Lifetime1 >= this.clipLeft &&
                  centerY >= this.clipTop &&
                  centerY < this.clipBottom) {
                  var14Lifetime2 = var6Lifetime1 - var10Lifetime1;
                  var15Lifetime2 = color;
                  var16Lifetime2 = var13;
                  var15Lifetime2 = ((var15Lifetime2 & 16711935) * var16Lifetime2 >> 8 & 16711935) + ((var15Lifetime2 & 65280) * var16Lifetime2 >> 8 & 65280) + (var16Lifetime2 << 24);
                  var17Lifetime2 = 256 - var16Lifetime2;
                  var18Lifetime2 = this.pixels[var14Lifetime2];
                  var18Lifetime2 = ((var18Lifetime2 & 16711935) * var17Lifetime2 >> 8 & 16711935) + ((var18Lifetime2 & 65280) * var17Lifetime2 >> 8 & 65280);
                  this.pixels[var14Lifetime2] = var15Lifetime2 + var18Lifetime2;
                }
                if (centerX + var10Lifetime1 < this.clipRight &&
                  centerY >= this.clipTop &&
                  centerY < this.clipBottom) {
                  var14Lifetime3 = var6Lifetime1 + var10Lifetime1;
                  var15Lifetime3 = color;
                  var16Lifetime3 = var13;
                  var15Lifetime3 = ((var15Lifetime3 & 16711935) * var16Lifetime3 >> 8 & 16711935) + ((var15Lifetime3 & 65280) * var16Lifetime3 >> 8 & 65280) + (var16Lifetime3 << 24);
                  var17Lifetime3 = 256 - var16Lifetime3;
                  var18Lifetime3 = this.pixels[var14Lifetime3];
                  var18Lifetime3 = ((var18Lifetime3 & 16711935) * var17Lifetime3 >> 8 & 16711935) + ((var18Lifetime3 & 65280) * var17Lifetime3 >> 8 & 65280);
                  this.pixels[var14Lifetime3] = var15Lifetime3 + var18Lifetime3;
                }
                if (centerY - var10Lifetime1 >= this.clipTop &&
                  centerX >= this.clipLeft &&
                  centerX < this.clipRight) {
                  var14Lifetime4 = var8Lifetime1;
                  var15Lifetime4 = color;
                  var16Lifetime4 = var13;
                  var15Lifetime4 = ((var15Lifetime4 & 16711935) * var16Lifetime4 >> 8 & 16711935) + ((var15Lifetime4 & 65280) * var16Lifetime4 >> 8 & 65280) + (var16Lifetime4 << 24);
                  var17Lifetime4 = 256 - var16Lifetime4;
                  var18Lifetime4 = this.pixels[var14Lifetime4];
                  var18Lifetime4 = ((var18Lifetime4 & 16711935) * var17Lifetime4 >> 8 & 16711935) + ((var18Lifetime4 & 65280) * var17Lifetime4 >> 8 & 65280);
                  this.pixels[var14Lifetime4] = var15Lifetime4 + var18Lifetime4;
                }
                if (centerY + var10Lifetime1 < this.clipBottom &&
                  centerX >= this.clipLeft &&
                  centerX < this.clipRight) {
                  var14Lifetime5 = var9Lifetime1;
                  var15Lifetime5 = color;
                  var16Lifetime5 = var13;
                  var15Lifetime5 = ((var15Lifetime5 & 16711935) * var16Lifetime5 >> 8 & 16711935) + ((var15Lifetime5 & 65280) * var16Lifetime5 >> 8 & 65280) + (var16Lifetime5 << 24);
                  var17Lifetime5 = 256 - var16Lifetime5;
                  var18Lifetime5 = this.pixels[var14Lifetime5];
                  var18Lifetime5 = ((var18Lifetime5 & 16711935) * var17Lifetime5 >> 8 & 16711935) + ((var18Lifetime5 & 65280) * var17Lifetime5 >> 8 & 65280);
                  this.pixels[var14Lifetime5] = var15Lifetime5 + var18Lifetime5;
                }
                while (true) {
                  incrementValue$3 = var11Lifetime1;
                  var11Lifetime1++;
                  var12Lifetime1 = var12Lifetime1 + (incrementValue$3 + var11Lifetime1);
                  var6Lifetime1 = var6Lifetime1 - this.targetWidth;
                  var7Lifetime1 = var7Lifetime1 + this.targetWidth;
                  if (var12Lifetime1 > radius) {
                    var10Lifetime1--;
                    var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                    var8Lifetime1 = var8Lifetime1 + this.targetWidth;
                    var9Lifetime1 = var9Lifetime1 - this.targetWidth;
                  }
                  if (var10Lifetime1 < var11Lifetime1) {
                    return;
                  }
                  if (centerY - var10Lifetime1 >= this.clipTop &&
                    centerY - var10Lifetime1 < this.clipBottom) {
                    if (centerX - var11Lifetime1 >= this.clipLeft &&
                      centerX - var11Lifetime1 < this.clipRight) {
                      var14Lifetime6 = var8Lifetime1 - var11Lifetime1;
                      var15Lifetime6 = color;
                      var16Lifetime6 = var13;
                      var15Lifetime6 = ((var15Lifetime6 & 16711935) * var16Lifetime6 >> 8 & 16711935) + ((var15Lifetime6 & 65280) * var16Lifetime6 >> 8 & 65280) + (var16Lifetime6 << 24);
                      var17Lifetime6 = 256 - var16Lifetime6;
                      var18Lifetime6 = this.pixels[var14Lifetime6];
                      var18Lifetime6 = ((var18Lifetime6 & 16711935) * var17Lifetime6 >> 8 & 16711935) + ((var18Lifetime6 & 65280) * var17Lifetime6 >> 8 & 65280);
                      this.pixels[var14Lifetime6] = var15Lifetime6 + var18Lifetime6;
                    }
                    if (centerX + var11Lifetime1 >= this.clipLeft &&
                      centerX + var11Lifetime1 < this.clipRight) {
                      var14Lifetime6Lifetime5 = var8Lifetime1 + var11Lifetime1;
                      var15Lifetime6Lifetime5 = color;
                      var16Lifetime6Lifetime5 = var13;
                      var15Lifetime6Lifetime5 = ((var15Lifetime6Lifetime5 & 16711935) * var16Lifetime6Lifetime5 >> 8 & 16711935) + ((var15Lifetime6Lifetime5 & 65280) * var16Lifetime6Lifetime5 >> 8 & 65280) + (var16Lifetime6Lifetime5 << 24);
                      var17Lifetime6Lifetime5 = 256 - var16Lifetime6Lifetime5;
                      var18Lifetime6Lifetime5 = this.pixels[var14Lifetime6Lifetime5];
                      var18Lifetime6Lifetime5 = ((var18Lifetime6Lifetime5 & 16711935) * var17Lifetime6Lifetime5 >> 8 & 16711935) + ((var18Lifetime6Lifetime5 & 65280) * var17Lifetime6Lifetime5 >> 8 & 65280);
                      this.pixels[var14Lifetime6Lifetime5] = var15Lifetime6Lifetime5 + var18Lifetime6Lifetime5;
                    }
                  }
                  if (centerY - var11Lifetime1 >= this.clipTop &&
                    centerY - var11Lifetime1 < this.clipBottom) {
                    if (centerX - var10Lifetime1 >= this.clipLeft &&
                      centerX - var10Lifetime1 < this.clipRight) {
                      var14Lifetime6Lifetime1 = var6Lifetime1 - var10Lifetime1;
                      var15Lifetime6Lifetime1 = color;
                      var16Lifetime6Lifetime1 = var13;
                      var15Lifetime6Lifetime1 = ((var15Lifetime6Lifetime1 & 16711935) * var16Lifetime6Lifetime1 >> 8 & 16711935) + ((var15Lifetime6Lifetime1 & 65280) * var16Lifetime6Lifetime1 >> 8 & 65280) + (var16Lifetime6Lifetime1 << 24);
                      var17Lifetime6Lifetime1 = 256 - var16Lifetime6Lifetime1;
                      var18Lifetime6Lifetime1 = this.pixels[var14Lifetime6Lifetime1];
                      var18Lifetime6Lifetime1 = ((var18Lifetime6Lifetime1 & 16711935) * var17Lifetime6Lifetime1 >> 8 & 16711935) + ((var18Lifetime6Lifetime1 & 65280) * var17Lifetime6Lifetime1 >> 8 & 65280);
                      this.pixels[var14Lifetime6Lifetime1] = var15Lifetime6Lifetime1 + var18Lifetime6Lifetime1;
                    }
                    if (centerX + var10Lifetime1 >= this.clipLeft &&
                      centerX + var10Lifetime1 < this.clipRight) {
                      var14Lifetime6Lifetime1Lifetime1 = var6Lifetime1 + var10Lifetime1;
                      var15Lifetime6Lifetime1Lifetime1 = color;
                      var16Lifetime6Lifetime1Lifetime1 = var13;
                      var15Lifetime6Lifetime1Lifetime1 = ((var15Lifetime6Lifetime1Lifetime1 & 16711935) * var16Lifetime6Lifetime1Lifetime1 >> 8 & 16711935) + ((var15Lifetime6Lifetime1Lifetime1 & 65280) * var16Lifetime6Lifetime1Lifetime1 >> 8 & 65280) + (var16Lifetime6Lifetime1Lifetime1 << 24);
                      var17Lifetime6Lifetime1Lifetime1 = 256 - var16Lifetime6Lifetime1Lifetime1;
                      var18Lifetime6Lifetime1Lifetime1 = this.pixels[var14Lifetime6Lifetime1Lifetime1];
                      var18Lifetime6Lifetime1Lifetime1 = ((var18Lifetime6Lifetime1Lifetime1 & 16711935) * var17Lifetime6Lifetime1Lifetime1 >> 8 & 16711935) + ((var18Lifetime6Lifetime1Lifetime1 & 65280) * var17Lifetime6Lifetime1Lifetime1 >> 8 & 65280);
                      this.pixels[var14Lifetime6Lifetime1Lifetime1] = var15Lifetime6Lifetime1Lifetime1 + var18Lifetime6Lifetime1Lifetime1;
                    }
                  }
                  if (centerY + var11Lifetime1 >= this.clipTop &&
                    centerY + var11Lifetime1 < this.clipBottom) {
                    if (centerX - var10Lifetime1 >= this.clipLeft &&
                      centerX - var10Lifetime1 < this.clipRight) {
                      var14Lifetime6Lifetime2 = var7Lifetime1 - var10Lifetime1;
                      var15Lifetime6Lifetime2 = color;
                      var16Lifetime6Lifetime2 = var13;
                      var15Lifetime6Lifetime2 = ((var15Lifetime6Lifetime2 & 16711935) * var16Lifetime6Lifetime2 >> 8 & 16711935) + ((var15Lifetime6Lifetime2 & 65280) * var16Lifetime6Lifetime2 >> 8 & 65280) + (var16Lifetime6Lifetime2 << 24);
                      var17Lifetime6Lifetime2 = 256 - var16Lifetime6Lifetime2;
                      var18Lifetime6Lifetime2 = this.pixels[var14Lifetime6Lifetime2];
                      var18Lifetime6Lifetime2 = ((var18Lifetime6Lifetime2 & 16711935) * var17Lifetime6Lifetime2 >> 8 & 16711935) + ((var18Lifetime6Lifetime2 & 65280) * var17Lifetime6Lifetime2 >> 8 & 65280);
                      this.pixels[var14Lifetime6Lifetime2] = var15Lifetime6Lifetime2 + var18Lifetime6Lifetime2;
                    }
                    if (centerX + var10Lifetime1 >= this.clipLeft &&
                      centerX + var10Lifetime1 < this.clipRight) {
                      var14Lifetime6Lifetime2Lifetime1 = var7Lifetime1 + var10Lifetime1;
                      var15Lifetime6Lifetime2Lifetime1 = color;
                      var16Lifetime6Lifetime2Lifetime1 = var13;
                      var15Lifetime6Lifetime2Lifetime1 = ((var15Lifetime6Lifetime2Lifetime1 & 16711935) * var16Lifetime6Lifetime2Lifetime1 >> 8 & 16711935) + ((var15Lifetime6Lifetime2Lifetime1 & 65280) * var16Lifetime6Lifetime2Lifetime1 >> 8 & 65280) + (var16Lifetime6Lifetime2Lifetime1 << 24);
                      var17Lifetime6Lifetime2Lifetime1 = 256 - var16Lifetime6Lifetime2Lifetime1;
                      var18Lifetime6Lifetime2Lifetime1 = this.pixels[var14Lifetime6Lifetime2Lifetime1];
                      var18Lifetime6Lifetime2Lifetime1 = ((var18Lifetime6Lifetime2Lifetime1 & 16711935) * var17Lifetime6Lifetime2Lifetime1 >> 8 & 16711935) + ((var18Lifetime6Lifetime2Lifetime1 & 65280) * var17Lifetime6Lifetime2Lifetime1 >> 8 & 65280);
                      this.pixels[var14Lifetime6Lifetime2Lifetime1] = var15Lifetime6Lifetime2Lifetime1 + var18Lifetime6Lifetime2Lifetime1;
                    }
                  }
                  if (centerY + var10Lifetime1 < this.clipTop) {
                    continue;
                  }
                  if (centerY + var10Lifetime1 >= this.clipBottom) {
                    continue;
                  }
                  if (centerX - var11Lifetime1 >= this.clipLeft &&
                    centerX - var11Lifetime1 < this.clipRight) {
                    var14Lifetime6Lifetime3 = var9Lifetime1 - var11Lifetime1;
                    var15Lifetime6Lifetime3 = color;
                    var16Lifetime6Lifetime3 = var13;
                    var15Lifetime6Lifetime3 = ((var15Lifetime6Lifetime3 & 16711935) * var16Lifetime6Lifetime3 >> 8 & 16711935) + ((var15Lifetime6Lifetime3 & 65280) * var16Lifetime6Lifetime3 >> 8 & 65280) + (var16Lifetime6Lifetime3 << 24);
                    var17Lifetime6Lifetime3 = 256 - var16Lifetime6Lifetime3;
                    var18Lifetime6Lifetime3 = this.pixels[var14Lifetime6Lifetime3];
                    var18Lifetime6Lifetime3 = ((var18Lifetime6Lifetime3 & 16711935) * var17Lifetime6Lifetime3 >> 8 & 16711935) + ((var18Lifetime6Lifetime3 & 65280) * var17Lifetime6Lifetime3 >> 8 & 65280);
                    this.pixels[var14Lifetime6Lifetime3] = var15Lifetime6Lifetime3 + var18Lifetime6Lifetime3;
                  }
                  if (centerX + var11Lifetime1 < this.clipLeft) {
                    continue;
                  }
                  if (centerX + var11Lifetime1 >= this.clipRight) {
                    continue;
                  }
                  var14Lifetime6Lifetime4 = var9Lifetime1 + var11Lifetime1;
                  var15Lifetime6Lifetime4 = color;
                  var16Lifetime6Lifetime4 = var13;
                  var15Lifetime6Lifetime4 = ((var15Lifetime6Lifetime4 & 16711935) * var16Lifetime6Lifetime4 >> 8 & 16711935) + ((var15Lifetime6Lifetime4 & 65280) * var16Lifetime6Lifetime4 >> 8 & 65280) + (var16Lifetime6Lifetime4 << 24);
                  var17Lifetime6Lifetime4 = 256 - var16Lifetime6Lifetime4;
                  var18Lifetime6Lifetime4 = this.pixels[var14Lifetime6Lifetime4];
                  var18Lifetime6Lifetime4 = ((var18Lifetime6Lifetime4 & 16711935) * var17Lifetime6Lifetime4 >> 8 & 16711935) + ((var18Lifetime6Lifetime4 & 65280) * var17Lifetime6Lifetime4 >> 8 & 65280);
                  this.pixels[var14Lifetime6Lifetime4] = var15Lifetime6Lifetime4 + var18Lifetime6Lifetime4;
                }
              }
              if (centerX - var10Lifetime1 >= this.clipLeft) {
                if (centerX + var10Lifetime1 < this.clipRight) {
                  if (centerY - var10Lifetime1 >= this.clipTop) {
                    if (centerY + var10Lifetime1 < this.clipBottom) {
                      this.pixels[var6Lifetime1 - var10Lifetime1] = color;
                      this.pixels[var6Lifetime1 + var10Lifetime1] = color;
                      this.pixels[var8Lifetime1] = color;
                      this.pixels[var9Lifetime1] = color;
                      while (true) {
                        incrementValue$4 = var11Lifetime1;
                        var11Lifetime1++;
                        var12Lifetime1 = var12Lifetime1 + (incrementValue$4 + var11Lifetime1);
                        var6Lifetime1 = var6Lifetime1 - this.targetWidth;
                        var7Lifetime1 = var7Lifetime1 + this.targetWidth;
                        if (var12Lifetime1 > radius) {
                          var10Lifetime1--;
                          var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                          var8Lifetime1 = var8Lifetime1 + this.targetWidth;
                          var9Lifetime1 = var9Lifetime1 - this.targetWidth;
                        }
                        if (var10Lifetime1 < var11Lifetime1) {
                          return;
                        }
                        this.pixels[var8Lifetime1 - var11Lifetime1] = color;
                        this.pixels[var8Lifetime1 + var11Lifetime1] = color;
                        this.pixels[var6Lifetime1 - var10Lifetime1] = color;
                        this.pixels[var6Lifetime1 + var10Lifetime1] = color;
                        this.pixels[var7Lifetime1 - var10Lifetime1] = color;
                        this.pixels[var7Lifetime1 + var10Lifetime1] = color;
                        this.pixels[var9Lifetime1 - var11Lifetime1] = color;
                        this.pixels[var9Lifetime1 + var11Lifetime1] = color;
                      }
                    }
                    if (centerX - var10Lifetime1 >= this.clipLeft &&
                      centerY >= this.clipTop &&
                      centerY < this.clipBottom) {
                      this.pixels[var6Lifetime1 - var10Lifetime1] = color;
                    }
                  } else {
                    if (centerX - var10Lifetime1 >= this.clipLeft &&
                      centerY >= this.clipTop &&
                      centerY < this.clipBottom) {
                      this.pixels[var6Lifetime1 - var10Lifetime1] = color;
                    }
                  }
                } else {
                  if (centerX - var10Lifetime1 >= this.clipLeft &&
                    centerY >= this.clipTop &&
                    centerY < this.clipBottom) {
                    this.pixels[var6Lifetime1 - var10Lifetime1] = color;
                  }
                }
              } else {
                if (centerX - var10Lifetime1 >= this.clipLeft &&
                  centerY >= this.clipTop &&
                  centerY < this.clipBottom) {
                  this.pixels[var6Lifetime1 - var10Lifetime1] = color;
                }
              }
              if (centerX + var10Lifetime1 < this.clipRight) {
                if (centerY >= this.clipTop) {
                  if (centerY < this.clipBottom) {
                    this.pixels[var6Lifetime1 + var10Lifetime1] = color;
                    if (centerY - var10Lifetime1 >= this.clipTop &&
                      centerX >= this.clipLeft &&
                      centerX < this.clipRight) {
                      this.pixels[var8Lifetime1] = color;
                    }
                  } else {
                    if (centerY - var10Lifetime1 >= this.clipTop &&
                      centerX >= this.clipLeft &&
                      centerX < this.clipRight) {
                      this.pixels[var8Lifetime1] = color;
                    }
                  }
                } else {
                  if (centerY - var10Lifetime1 >= this.clipTop &&
                    centerX >= this.clipLeft &&
                    centerX < this.clipRight) {
                    this.pixels[var8Lifetime1] = color;
                  }
                }
              } else {
                if (centerY - var10Lifetime1 >= this.clipTop &&
                  centerX >= this.clipLeft &&
                  centerX < this.clipRight) {
                  this.pixels[var8Lifetime1] = color;
                }
              }
              if (centerY + var10Lifetime1 < this.clipBottom &&
                centerX >= this.clipLeft &&
                centerX < this.clipRight) {
                this.pixels[var9Lifetime1] = color;
              }
              while (true) {
                incrementValue$5 = var11Lifetime1;
                var11Lifetime1++;
                var12Lifetime1 = var12Lifetime1 + (incrementValue$5 + var11Lifetime1);
                var6Lifetime1 = var6Lifetime1 - this.targetWidth;
                var7Lifetime1 = var7Lifetime1 + this.targetWidth;
                if (var12Lifetime1 > radius) {
                  var10Lifetime1--;
                  var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                  var8Lifetime1 = var8Lifetime1 + this.targetWidth;
                  var9Lifetime1 = var9Lifetime1 - this.targetWidth;
                }
                if (var10Lifetime1 < var11Lifetime1) {
                  return;
                }
                if (centerY - var10Lifetime1 >= this.clipTop &&
                  centerY - var10Lifetime1 < this.clipBottom) {
                  if (centerX - var11Lifetime1 >= this.clipLeft) {
                    if (centerX - var11Lifetime1 < this.clipRight) {
                      this.pixels[var8Lifetime1 - var11Lifetime1] = color;
                      if (centerX + var11Lifetime1 >= this.clipLeft &&
                        centerX + var11Lifetime1 < this.clipRight) {
                        this.pixels[var8Lifetime1 + var11Lifetime1] = color;
                      }
                    } else {
                      if (centerX + var11Lifetime1 >= this.clipLeft &&
                        centerX + var11Lifetime1 < this.clipRight) {
                        this.pixels[var8Lifetime1 + var11Lifetime1] = color;
                      }
                    }
                  } else {
                    if (centerX + var11Lifetime1 >= this.clipLeft &&
                      centerX + var11Lifetime1 < this.clipRight) {
                      this.pixels[var8Lifetime1 + var11Lifetime1] = color;
                    }
                  }
                }
                if (centerY - var11Lifetime1 >= this.clipTop &&
                  centerY - var11Lifetime1 < this.clipBottom) {
                  if (centerX - var10Lifetime1 >= this.clipLeft &&
                    centerX - var10Lifetime1 < this.clipRight) {
                    this.pixels[var6Lifetime1 - var10Lifetime1] = color;
                  }
                  if (centerX + var10Lifetime1 >= this.clipLeft &&
                    centerX + var10Lifetime1 < this.clipRight) {
                    this.pixels[var6Lifetime1 + var10Lifetime1] = color;
                  }
                }
                if (centerY + var11Lifetime1 >= this.clipTop &&
                  centerY + var11Lifetime1 < this.clipBottom) {
                  if (centerX - var10Lifetime1 >= this.clipLeft &&
                    centerX - var10Lifetime1 < this.clipRight) {
                    this.pixels[var7Lifetime1 - var10Lifetime1] = color;
                  }
                  if (centerX + var10Lifetime1 >= this.clipLeft &&
                    centerX + var10Lifetime1 < this.clipRight) {
                    this.pixels[var7Lifetime1 + var10Lifetime1] = color;
                  }
                }
                if (centerY + var10Lifetime1 < this.clipTop) {
                  continue;
                }
                if (centerY + var10Lifetime1 >= this.clipBottom) {
                  continue;
                }
                if (centerX - var11Lifetime1 >= this.clipLeft &&
                  centerX - var11Lifetime1 < this.clipRight) {
                  this.pixels[var9Lifetime1 - var11Lifetime1] = color;
                }
                if (centerX + var11Lifetime1 < this.clipLeft) {
                  continue;
                }
                if (centerX + var11Lifetime1 >= this.clipRight) {
                  continue;
                }
                this.pixels[var9Lifetime1 + var11Lifetime1] = color;
              }
            }
            return;
          }
        }
    }

    private final SoftwareRenderContext contextForThread(Runnable thread) {
        int var2 = 0;
        for (var2 = 0; var2 < this.contextCount; var2++) {
          if (this.contexts[var2].thread == thread) {
            return this.contexts[var2];
          }
        }
        return null;
    }

    final void getClip(int[] bounds) {
        bounds[0] = this.clipLeft;
        bounds[1] = this.clipTop;
        bounds[2] = this.clipRight;
        bounds[3] = this.clipBottom;
    }

    private final void updateClipRowOffsets() {
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        int var1Lifetime1;
        for (var1 = 0; var1 < this.contextCount; var1++) {
        }
        var1Lifetime1 = this.clipTop * this.targetWidth + this.clipLeft;
        for (var2 = this.clipTop; var2 < this.clipBottom; var2++) {
          for (var3 = 0; var3 < this.contextCount; var3++) {
            this.contexts[var3].scanlineOffsets.rowOffsets[var2 - this.clipTop] = var1Lifetime1;
          }
          var1Lifetime1 = var1Lifetime1 + this.targetWidth;
        }
    }

    final boolean usesNativeRendering() {
        return false;
    }

    final void bindRenderTarget(RenderTarget target) {
        SoftwareRenderTarget var2 = (SoftwareRenderTarget) (target);
        this.targetWidth = var2.width;
        this.targetHeight = var2.height;
        this.pixels = var2.pixels;
        this.renderTarget = var2;
        this.field_x = var2.width;
        this.field_m = var2.height;
        this.refreshContexts();
    }

    private final void resetClip() {
        this.clipLeft = 0;
        this.clipTop = 0;
        this.clipRight = this.targetWidth;
        this.clipBottom = this.targetHeight;
        this.updateClipRowOffsets();
    }

    final GraphicsHeap createHeap(int capacity) {
        return null;
    }

    final ToolkitSprite createSprite(int[] pixels, int offset, int stride, int width, int height, boolean copyPixels) {
        int var10 = 0;
        int incrementValue$4 = 0;
        int var7;
        int var8;
        int var9;
        int var11;
        var7 = 0;
        var8 = offset;
        var9 = 0;
        scanLoop1: while (true) {
          if (var9 < height) {
            for (var10 = 0; var10 < width; var10++) {
              incrementValue$4 = var8;
              var8++;
              var11 = pixels[incrementValue$4] >>> 24;
              if (var11 != 0 &&
                var11 != 255) {
                var7 = 1;
                break scanLoop1;
              }
            }
            var9++;
            continue;
          }
          break;
        }
        if (var7 == 0) {
          return (ToolkitSprite) ((Object) new SoftwareRgbSprite(this, pixels, offset, stride, width, height, copyPixels));
        }
        return (ToolkitSprite) ((Object) new SoftwareArgbSprite(this, pixels, offset, stride, width, height, copyPixels));
    }

    private final void registerCanvas(java.awt.Canvas canvas, int width, int height) {
        ToolkitRasterBuffer var4;
        var4 = (ToolkitRasterBuffer) (this.canvasBuffers.get(106, (long)canvas.hashCode()));
        if (var4 != null) {
          if (var4.width == width &&
            var4.height == height) {
            return;
          }
          this.resizeCanvas(canvas, width, height);
        } else {
          var4 = SessionStatisticsSubmission.createToolkitRasterBuffer(width, height, canvas, -101);
          this.canvasBuffers.a(var4, -1, (long)canvas.hashCode());
        }
    }

    private final void selectCanvas(java.awt.Canvas canvas) {
        ToolkitRasterBuffer var2;
        java.awt.Dimension var3;
        if (canvas == null) {
          this.canvas = null;
          this.canvasBuffer = null;
          if (this.renderTarget == null) {
            this.pixels = null;
            this.targetHeight = 1;
            this.targetWidth = 1;
            this.field_m = 1;
            this.field_x = 1;
            this.refreshContexts();
          }
        } else {
          var2 = (ToolkitRasterBuffer) (this.canvasBuffers.get(127, (long)canvas.hashCode()));
          if (var2 != null) {
            this.canvas = canvas;
            var3 = canvas.getSize();
            this.canvasWidth = var3.width;
            this.canvasHeight = var3.height;
            this.canvasBuffer = var2;
            if (this.renderTarget == null) {
              this.pixels = var2.pixels;
              this.targetWidth = var2.width;
              this.targetHeight = var2.height;
              if (this.targetWidth != this.field_x ||
                this.targetHeight != this.field_m) {
                this.field_x = this.targetWidth;
                this.field_F = this.targetWidth;
                this.field_m = this.targetHeight;
                this.field_w = this.targetHeight;
              }
              this.refreshContexts();
            }
          }
        }
    }

    final void fillRectangle(int x, int y, int width, int height, int color, int blendMode) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var13Lifetime1;
        if (x < this.clipLeft) {
          width = width - (this.clipLeft - x);
          x = this.clipLeft;
        }
        if (y < this.clipTop) {
          height = height - (this.clipTop - y);
          y = this.clipTop;
        }
        if (x + width > this.clipRight) {
          width = this.clipRight - x;
        }
        if (y + height > this.clipBottom) {
          height = this.clipBottom - y;
        }
        if (width > 0) {
          if (height > 0 &&
            x <= this.clipRight &&
            y <= this.clipBottom) {
            var7 = this.targetWidth - width;
            var8 = x + y * this.targetWidth;
            var9 = color >>> 24;
            if (blendMode != 0 && (blendMode != 1 ||
              var9 != 255)) {
              if (blendMode == 1) {
                color = ((color & 16711935) * var9 >> 8 & 16711935) + (((color & -16711936) >>> 8) * var9 & -16711936);
                var10 = 256 - var9;
                for (var11 = 0; var11 < height; var11++) {
                  for (var12 = -width; var12 < 0; var12++) {
                    var13 = this.pixels[var8];
                    var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                    incrementValue$1 = var8;
                    var8++;
                    this.pixels[incrementValue$1] = color + var13;
                  }
                  var8 = var8 + var7;
                }
                return;
              }
              if (blendMode != 2) {
                throw new IllegalArgumentException();
              }
              for (var10 = 0; var10 < height; var10++) {
                for (var11 = -width; var11 < 0; var11++) {
                  var12 = this.pixels[var8];
                  var13Lifetime1 = color + var12;
                  var14 = (color & 16711935) + (var12 & 16711935);
                  var12 = (var14 & 16777472) + (var13Lifetime1 - var14 & 65536);
                  incrementValue$0 = var8;
                  var8++;
                  this.pixels[incrementValue$0] = var13Lifetime1 - var12 | var12 - (var12 >>> 8);
                }
                var8 = var8 + var7;
              }
              return;
            }
            var10 = width >> 3;
            var11 = width & 7;
            width = var8 - 1;
            for (var12 = -height; var12 < 0; var12++) {
              if (var10 > 0) {
                x = var10;
                do {
                  width++;
                  this.pixels[width] = color;
                  width++;
                  this.pixels[width] = color;
                  width++;
                  this.pixels[width] = color;
                  width++;
                  this.pixels[width] = color;
                  width++;
                  this.pixels[width] = color;
                  width++;
                  this.pixels[width] = color;
                  width++;
                  this.pixels[width] = color;
                  width++;
                  this.pixels[width] = color;
                  x--;
                } while (x > 0);
              }
              if (var11 > 0) {
                x = var11;
                do {
                  width++;
                  this.pixels[width] = color;
                  x--;
                } while (x > 0);
              }
              width = width + var7;
            }
          } else {
            return;
          }
        }
    }

    final boolean isDisposed() {
        return this.disposed;
    }

    private final void bindContextToCurrentThread(int index) {
        this.contexts[index].setThread((Runnable) ((Object) Thread.currentThread()), true);
    }

    private final void refreshContexts() {
        int var1 = 0;
        for (var1 = 0; var1 < this.contextCount; var1++) {
          this.contexts[var1].resetScanlineOffsets(126);
        }
        this.resetClip();
    }

    final ToolkitFont createFont(FontMetrics metrics, SpriteData[] glyphs, boolean useMaskGlyphs) {
        int var7 = 0;
        int[] var4;
        int[] var5;
        int var6;
        var4 = new int[glyphs.length];
        var5 = new int[glyphs.length];
        var6 = 0;
        for (var7 = 0; var7 < glyphs.length; var7++) {
          var4[var7] = glyphs[var7].field_h;
          var5[var7] = glyphs[var7].field_i;
          if (glyphs[var7].field_a != null) {
            var6 = 1;
          }
        }
        if (!useMaskGlyphs) {
          if (var6 == 0) {
            return (ToolkitFont) ((Object) new SoftwarePaletteFont(this, metrics, glyphs, var4, var5));
          }
          throw new IllegalArgumentException("");
        }
        if (var6 == 0) {
          return (ToolkitFont) ((Object) new SoftwareBinaryFont(this, metrics, glyphs, var4, var5));
        }
        return (ToolkitFont) ((Object) new SoftwareAlphaFont(this, metrics, glyphs, var4, var5));
    }

    final void drawLine(int x0, int y0, int x1, int y1, int color, int blendMode) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var9Lifetime3;
        int var10Lifetime2;
        int var11Lifetime2;
        int var12Lifetime2;
        int var9Lifetime4;
        int var11Lifetime2Lifetime1;
        x1 = x1 - x0;
        y1 = y1 - y0;
        if (y1 == 0) {
          if (x1 < 0) {
            this.drawHorizontalLine(x0 + x1, y0, -x1 + 1, color, blendMode);
          } else {
            this.drawHorizontalLine(x0, y0, x1 + 1, color, blendMode);
          }
          return;
        }
        if (x1 == 0) {
          if (y1 < 0) {
            this.drawVerticalLine(x0, y0 + y1, -y1 + 1, color, blendMode);
          } else {
            this.drawVerticalLine(x0, y0, y1 + 1, color, blendMode);
          }
          return;
        }
        if (x1 + y1 < 0) {
          x0 = x0 + x1;
          x1 = -x1;
          y0 = y0 + y1;
          y1 = -y1;
        }
        boolean decompiledFrameRemainder0 = true;
        if (x1 <= y1) {
          x0 = x0 << 16;
          x0 = x0 + 32768;
          x1 = x1 << 16;
          var7 = (int)Math.floor((double)x1 / (double)y1 + 0.5);
          y1 = y1 + y0;
          if (y0 < this.clipTop) {
            x0 = x0 + var7 * (this.clipTop - y0);
            y0 = this.clipTop;
          }
          if (y1 >= this.clipBottom) {
            y1 = this.clipBottom - 1;
          }
          var8 = color >>> 24;
          if (blendMode != 0 && (blendMode != 1 ||
            var8 != 255)) {
            if (blendMode == 1) {
              color = ((color & 16711935) * var8 >> 8 & 16711935) + ((color & 65280) * var8 >> 8 & 65280) + (var8 << 24);
              var9 = 256 - var8;
              while (y0 <= y1) {
                var10 = x0 >> 16;
                if (var10 >= this.clipLeft &&
                  var10 < this.clipRight) {
                  var11 = var10 + y0 * this.targetWidth;
                  var12 = this.pixels[var11];
                  var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                  this.pixels[var10 + y0 * this.targetWidth] = color + var12;
                }
                x0 = x0 + var7;
                y0++;
              }
            } else {
              if (blendMode != 2) {
                throw new IllegalArgumentException();
              }
              while (y0 <= y1) {
                var9Lifetime4 = x0 >> 16;
                if (var9Lifetime4 >= this.clipLeft &&
                  var9Lifetime4 < this.clipRight) {
                  var10Lifetime2 = var9Lifetime4 + y0 * this.targetWidth;
                  var11Lifetime2 = this.pixels[var10Lifetime2];
                  var12Lifetime2 = color + var11Lifetime2;
                  var13 = (color & 16711935) + (var11Lifetime2 & 16711935);
                  var11Lifetime2Lifetime1 = (var13 & 16777472) + (var12Lifetime2 - var13 & 65536);
                  this.pixels[var10Lifetime2] = var12Lifetime2 - var11Lifetime2Lifetime1 | var11Lifetime2Lifetime1 - (var11Lifetime2Lifetime1 >>> 8);
                }
                x0 = x0 + var7;
                y0++;
              }
            }
          } else {
            while (y0 <= y1) {
              var9Lifetime3 = x0 >> 16;
              if (var9Lifetime3 >= this.clipLeft &&
                var9Lifetime3 < this.clipRight) {
                this.pixels[var9Lifetime3 + y0 * this.targetWidth] = color;
              }
              x0 = x0 + var7;
              y0++;
            }
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          y0 = y0 << 16;
          y0 = y0 + 32768;
          y1 = y1 << 16;
          var7Lifetime1 = (int)Math.floor((double)y1 / (double)x1 + 0.5);
          x1 = x1 + x0;
          if (x0 < this.clipLeft) {
            y0 = y0 + var7Lifetime1 * (this.clipLeft - x0);
            x0 = this.clipLeft;
          }
          if (x1 >= this.clipRight) {
            x1 = this.clipRight - 1;
          }
          var8Lifetime1 = color >>> 24;
          if (blendMode != 0 && (blendMode != 1 ||
            var8Lifetime1 != 255)) {
            if (blendMode == 1) {
              color = ((color & 16711935) * var8Lifetime1 >> 8 & 16711935) + ((color & 65280) * var8Lifetime1 >> 8 & 65280) + (var8Lifetime1 << 24);
              var9Lifetime1 = 256 - var8Lifetime1;
              while (x0 <= x1) {
                var10Lifetime1 = y0 >> 16;
                if (var10Lifetime1 >= this.clipTop &&
                  var10Lifetime1 < this.clipBottom) {
                  var11Lifetime1 = x0 + var10Lifetime1 * this.targetWidth;
                  var12Lifetime1 = this.pixels[var11Lifetime1];
                  var12Lifetime1 = ((var12Lifetime1 & 16711935) * var9Lifetime1 >> 8 & 16711935) + ((var12Lifetime1 & 65280) * var9Lifetime1 >> 8 & 65280);
                  this.pixels[var11Lifetime1] = color + var12Lifetime1;
                }
                y0 = y0 + var7Lifetime1;
                x0++;
              }
            } else {
              if (blendMode != 2) {
                throw new IllegalArgumentException();
              }
              while (x0 <= x1) {
                var9Lifetime1 = y0 >> 16;
                if (var9Lifetime1 >= this.clipTop &&
                  var9Lifetime1 < this.clipBottom) {
                  var10Lifetime1 = x0 + var9Lifetime1 * this.targetWidth;
                  var11Lifetime1 = this.pixels[var10Lifetime1];
                  var12Lifetime1 = color + var11Lifetime1;
                  var13Lifetime1 = (color & 16711935) + (var11Lifetime1 & 16711935);
                  var11Lifetime1 = (var13Lifetime1 & 16777472) + (var12Lifetime1 - var13Lifetime1 & 65536);
                  this.pixels[var10Lifetime1] = var12Lifetime1 - var11Lifetime1 | var11Lifetime1 - (var11Lifetime1 >>> 8);
                }
                y0 = y0 + var7Lifetime1;
                x0++;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            while (x0 <= x1) {
              var9Lifetime2 = y0 >> 16;
              if (var9Lifetime2 >= this.clipTop &&
                var9Lifetime2 < this.clipBottom) {
                this.pixels[x0 + var9Lifetime2 * this.targetWidth] = color;
              }
              y0 = y0 + var7Lifetime1;
              x0++;
            }
          }
        }

    }

    SoftwareGraphicsToolkit(java.awt.Canvas param0, TextureProvider param1, int param2, int param3) {
        this(param1);
        try {
          this.registerCanvas(param0, param2, param3);
          this.selectCanvas(param0);
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          this.close((byte) -21);
          throw new RuntimeException("");
        }
    }

    final void drawHorizontalLine(int x, int y, int length, int color, int blendMode) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1Lifetime1;
        if (y >= this.clipTop) {
          if (y >= this.clipBottom) {
            return;
          }
          if (x < this.clipLeft) {
            length = length - (this.clipLeft - x);
            x = this.clipLeft;
          }
          if (x + length > this.clipRight) {
            length = this.clipRight - x;
          }
          var6 = x + y * this.targetWidth;
          var7 = color >>> 24;
          if (blendMode != 0 && (blendMode != 1 ||
            var7 != 255)) {
            if (blendMode == 1) {
              color = ((color & 16711935) * var7 >> 8 & 16711935) + ((color & 65280) * var7 >> 8 & 65280) + (var7 << 24);
              var8 = 256 - var7;
              for (var9 = 0; var9 < length; var9++) {
                var10 = this.pixels[var6 + var9];
                var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                this.pixels[var6 + var9] = color + var10;
              }
              return;
            }
            if (blendMode != 2) {
              throw new IllegalArgumentException();
            }
            for (var8Lifetime2 = 0; var8Lifetime2 < length; var8Lifetime2++) {
              var9Lifetime1 = this.pixels[var6 + var8Lifetime2];
              var10Lifetime1 = color + var9Lifetime1;
              var11 = (color & 16711935) + (var9Lifetime1 & 16711935);
              var9Lifetime1Lifetime1 = (var11 & 16777472) + (var10Lifetime1 - var11 & 65536);
              this.pixels[var6 + var8Lifetime2] = var10Lifetime1 - var9Lifetime1Lifetime1 | var9Lifetime1Lifetime1 - (var9Lifetime1Lifetime1 >>> 8);
            }
            return;
          }
          for (var8Lifetime1 = 0; var8Lifetime1 < length; var8Lifetime1++) {
            this.pixels[var6 + var8Lifetime1] = color;
          }
        }
    }

    final void useHeap(GraphicsHeap heap) {
    }

    final void setClip(int left, int top, int right, int bottom) {
        if (left < 0) {
          left = 0;
        }
        if (top < 0) {
          top = 0;
        }
        if (right > this.targetWidth) {
          right = this.targetWidth;
        }
        if (bottom > this.targetHeight) {
          bottom = this.targetHeight;
        }
        this.clipLeft = left;
        this.clipRight = right;
        this.clipTop = top;
        this.clipBottom = bottom;
        this.updateClipRowOffsets();
    }

    final void setDepthRange(int nearPlane, int farPlane) {
        SoftwareRenderContext discarded$0 = this.contextForThread((Runnable) ((Object) Thread.currentThread()));
        this.nearPlane = nearPlane;
        this.farPlane = farPlane;
    }

    final void setProjection(int centerX, int centerY, int scaleX, int scaleY) {
        this.projectionCenterX = centerX;
        this.projectionCenterY = centerY;
        this.projectionScaleX = scaleX;
        this.projectionScaleY = scaleY;
        this.updateClipRowOffsets();
    }

    final void drawPixels(int x, int y, int width, int height, int[] pixels, int offset, int stride) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        stride = stride - width;
        for (var8 = 0; var8 < height; var8++) {
          var9 = (y + var8) * this.targetWidth + x;
          for (var10 = 0; var10 < width; var10++) {
            incrementValue$0 = offset;
            offset++;
            this.pixels[var9 + var10] = pixels[incrementValue$0];
          }
          offset = offset + stride;
        }
    }

    private final void createContexts(int count) {
        int var2 = 0;
        this.contextCount = count;
        this.contexts = new SoftwareRenderContext[this.contextCount];
        for (var2 = 0; var2 < this.contextCount; var2++) {
          this.contexts[var2] = new SoftwareRenderContext(this);
        }
    }

    final void dispose() {
        if (this.field_J) {
          CubeMapSource.releaseColorTables(true, false, -1);
          this.field_J = false;
        }
        this.canvasBuffer = null;
        this.canvas = null;
        this.canvasWidth = 0;
        this.canvasHeight = 0;
        this.canvasBuffers = null;
        this.disposed = true;
    }

    private final void resizeCanvas(java.awt.Canvas canvas, int width, int height) {
        java.awt.Dimension var5 = null;
        ToolkitRasterBuffer var4 = (ToolkitRasterBuffer) (this.canvasBuffers.get(122, (long)canvas.hashCode()));
        if (var4 != null) {
          var4.unlink(false);
          var4 = SessionStatisticsSubmission.createToolkitRasterBuffer(width, height, canvas, -91);
          this.canvasBuffers.a(var4, -1, (long)canvas.hashCode());
          if (this.canvas == canvas &&
            this.renderTarget == null) {
            var5 = canvas.getSize();
            this.canvasWidth = var5.width;
            this.canvasHeight = var5.height;
            this.canvasBuffer = var4;
            this.pixels = var4.pixels;
            this.targetWidth = var4.width;
            this.targetHeight = var4.height;
            if (this.targetWidth != this.field_x ||
              this.targetHeight != this.field_m) {
              this.field_x = this.targetWidth;
              this.field_F = this.targetWidth;
              this.field_m = this.targetHeight;
              this.field_w = this.targetHeight;
            }
            this.refreshContexts();
          }
          return;
        }
    }

    private final void drawVerticalLine(int x, int y, int length, int color, int blendMode) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var8Lifetime2;
        int var10Lifetime1Lifetime1;
        if (x >= this.clipLeft) {
          if (x >= this.clipRight) {
            return;
          }
          if (y < this.clipTop) {
            length = length - (this.clipTop - y);
            y = this.clipTop;
          }
          if (y + length > this.clipBottom) {
            length = this.clipBottom - y;
          }
          var6 = x + y * this.targetWidth;
          var7 = color >>> 24;
          if (blendMode != 0 && (blendMode != 1 ||
            var7 != 255)) {
            if (blendMode == 1) {
              color = ((color & 16711935) * var7 >> 8 & 16711935) + ((color & 65280) * var7 >> 8 & 65280) + (var7 << 24);
              var8 = 256 - var7;
              for (var9 = 0; var9 < length; var9++) {
                var10 = var6 + var9 * this.targetWidth;
                var11 = this.pixels[var10];
                var11 = ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
                this.pixels[var10] = color + var11;
              }
              return;
            }
            if (blendMode != 2) {
              throw new IllegalArgumentException();
            }
            for (var8Lifetime2 = 0; var8Lifetime2 < length; var8Lifetime2++) {
              var9Lifetime1 = var6 + var8Lifetime2 * this.targetWidth;
              var10Lifetime1 = this.pixels[var9Lifetime1];
              var11Lifetime1 = color + var10Lifetime1;
              var12 = (color & 16711935) + (var10Lifetime1 & 16711935);
              var10Lifetime1Lifetime1 = (var12 & 16777472) + (var11Lifetime1 - var12 & 65536);
              this.pixels[var9Lifetime1] = var11Lifetime1 - var10Lifetime1Lifetime1 | var10Lifetime1Lifetime1 - (var10Lifetime1Lifetime1 >>> 8);
            }
            return;
          }
          for (var8Lifetime1 = 0; var8Lifetime1 < length; var8Lifetime1++) {
            this.pixels[var6 + var8Lifetime1 * this.targetWidth] = color;
          }
        }
    }

    final void present(int sourceX, int sourceY) throws RenderPresentationException {
        java.awt.Graphics var3 = null;
        if (this.canvas == null ||
          this.canvasBuffer == null) {
          throw new IllegalStateException(offText);
        }
        try {
          var3 = this.canvas.getGraphics();
          this.canvasBuffer.drawRegion(var3, 0, sourceY, this.canvasWidth, sourceX, this.canvasHeight, 0, (byte) -106);
        } catch (Exception exception) {
          this.canvas.repaint();
        }
    }

    final RenderTarget createRenderTarget(RenderSurface surface, RenderBuffer buffer) {
        return (RenderTarget) ((Object) new SoftwareRenderTarget(this, (ToolkitSprite) (surface), (SoftwareRenderBuffer) (buffer)));
    }

    final int[] projectionParameters() {
        return new int[]{this.projectionCenterX, this.projectionCenterY, this.projectionScaleX, this.projectionScaleY};
    }

    final RenderBuffer createRenderBuffer(int width, int height) {
        return (RenderBuffer) ((Object) new SoftwareRenderBuffer(width, height));
    }

    final void restoreCanvasTarget() {
        if (this.canvas != null) {
          this.pixels = this.canvasBuffer.pixels;
          this.targetWidth = this.canvasBuffer.width;
          this.targetHeight = this.canvasBuffer.height;
          this.field_x = this.field_F;
          this.field_m = this.field_w;
        } else {
          this.targetWidth = 1;
          this.targetHeight = 1;
          this.pixels = null;
          this.field_x = 1;
          this.field_m = 1;
        }
        this.renderTarget = null;
        this.refreshContexts();
    }

    final void copyFrontToBack() {
    }

    static {
        offText = "off";
    }
}
