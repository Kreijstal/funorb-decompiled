/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareToolkit extends GraphicsToolkit {
    private int field_E;
    private int field_z;
    private NodeHashTable field_t;
    private boolean field_B;
    private int field_o;
    private RasterBuffer field_D;
    private boolean disposed;
    private java.awt.Canvas canvas;
    int width;
    private int field_C;
    int[] pixels;
    private int projectionScaleY;
    private SoftwareFramebuffer framebuffer;
    private int projectionCenterX;
    private int field_q;
    int clipTop;
    private SoftLruCache field_d;
    private float[] field_G;
    private int projectionScaleX;
    private int field_u;
    private int field_F;
    int clipRight;
    private int field_v;
    private SoftLruCache field_f;
    private SoftwareRenderContext[] threadContexts;
    private int projectionCenterY;
    private int height;
    int clipBottom;
    int clipLeft;
    private int field_h;
    private int threadContextCount;
    private int farPlane;
    float[] depth;
    private int nearPlane;
    private static String field_K;

    final boolean supportsMultipleCanvases() {
        return true;
    }

    final boolean hasSlowOffscreenRendering() {
        return false;
    }

    final Transform3D createTransform() {
        return (Transform3D) ((Object) new SoftwareTransform3D());
    }

    final void clearColor(int param0) {
        this.fillRectangle(0, 0, this.width, this.height, param0, 0);
    }

    final void drawCircle(int param0, int param1, int param2, int param3, int param4) {
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
        if (param2 == 0) {
          if (param0 >= this.clipLeft) {
            if (param1 >= this.clipTop &&
              param0 < this.clipRight &&
              param1 < this.clipBottom) {
              var6 = param3 >>> 24;
              var7 = param0 + param1 * this.width;
              if (param4 != 0 && (param4 != 1 ||
                var6 != 255)) {
                if (param4 == 1) {
                  var8 = var7;
                  var9 = param3;
                  var10 = var6;
                  var9 = ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280) + (var10 << 24);
                  var11 = 256 - var10;
                  var12 = this.pixels[var8];
                  var12 = ((var12 & 16711935) * var11 >> 8 & 16711935) + ((var12 & 65280) * var11 >> 8 & 65280);
                  this.pixels[var8] = var9 + var12;
                  return;
                }
                if (param4 != 2) {
                  return;
                }
                var8Lifetime2 = var7;
                var9Lifetime2 = param3;
                var10Lifetime2 = this.pixels[var8Lifetime2];
                var11Lifetime2 = var9Lifetime2 + var10Lifetime2;
                var12Lifetime2 = (var9Lifetime2 & 16711935) + (var10Lifetime2 & 16711935);
                var10Lifetime3 = (var12Lifetime2 & 16777472) + (var11Lifetime2 - var12Lifetime2 & 65536);
                this.pixels[var8Lifetime2] = var11Lifetime2 - var10Lifetime3 | var10Lifetime3 - (var10Lifetime3 >>> 8);
                return;
              }
              this.pixels[var7] = param3;
              return;
            }
            return;
          }
          return;
        }
        if (param2 < 0) {
          param2 = -param2;
        }
        if (this.clipRight > this.clipLeft) {
          if (this.clipBottom <= this.clipTop) {
            return;
          }
          if (param0 + param2 >= this.clipLeft) {
            if (param0 - param2 < this.clipRight &&
              param1 + param2 >= this.clipTop &&
              param1 - param2 < this.clipBottom) {
              var6Lifetime1 = param0 + param1 * this.width;
              var7Lifetime1 = var6Lifetime1;
              var8Lifetime1 = var6Lifetime1 - param2 * this.width;
              var9Lifetime1 = var6Lifetime1 + param2 * this.width;
              var10Lifetime1 = param2;
              var11Lifetime1 = 0;
              param2 = param2 * param2;
              var12Lifetime1 = param2 - var10Lifetime1;
              var13 = param3 >>> 24;
              if (param4 != 0 && (param4 != 1 ||
                var13 != 255)) {
                if (param4 != 1) {
                  if (param4 != 2) {
                    return;
                  }
                  if (param0 - var10Lifetime1 >= this.clipLeft &&
                    param0 + var10Lifetime1 < this.clipRight &&
                    param1 - var10Lifetime1 >= this.clipTop &&
                    param1 + var10Lifetime1 < this.clipBottom) {
                    var14 = var6Lifetime1 - var10Lifetime1;
                    var15 = param3;
                    var16 = this.pixels[var14];
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var16Lifetime12 = (var18 & 16777472) + (var17 - var18 & 65536);
                    this.pixels[var14] = var17 - var16Lifetime12 | var16Lifetime12 - (var16Lifetime12 >>> 8);
                    var14Lifetime12 = var6Lifetime1 + var10Lifetime1;
                    var15Lifetime12 = param3;
                    var16Lifetime13 = this.pixels[var14Lifetime12];
                    var17Lifetime12 = var15Lifetime12 + var16Lifetime13;
                    var18Lifetime12 = (var15Lifetime12 & 16711935) + (var16Lifetime13 & 16711935);
                    var16Lifetime14 = (var18Lifetime12 & 16777472) + (var17Lifetime12 - var18Lifetime12 & 65536);
                    this.pixels[var14Lifetime12] = var17Lifetime12 - var16Lifetime14 | var16Lifetime14 - (var16Lifetime14 >>> 8);
                    var14Lifetime13 = var8Lifetime1;
                    var15Lifetime13 = param3;
                    var16Lifetime15 = this.pixels[var14Lifetime13];
                    var17Lifetime13 = var15Lifetime13 + var16Lifetime15;
                    var18Lifetime13 = (var15Lifetime13 & 16711935) + (var16Lifetime15 & 16711935);
                    var16Lifetime16 = (var18Lifetime13 & 16777472) + (var17Lifetime13 - var18Lifetime13 & 65536);
                    this.pixels[var14Lifetime13] = var17Lifetime13 - var16Lifetime16 | var16Lifetime16 - (var16Lifetime16 >>> 8);
                    var14Lifetime14 = var9Lifetime1;
                    var15Lifetime14 = param3;
                    var16Lifetime17 = this.pixels[var14Lifetime14];
                    var17Lifetime14 = var15Lifetime14 + var16Lifetime17;
                    var18Lifetime14 = (var15Lifetime14 & 16711935) + (var16Lifetime17 & 16711935);
                    var16Lifetime18 = (var18Lifetime14 & 16777472) + (var17Lifetime14 - var18Lifetime14 & 65536);
                    this.pixels[var14Lifetime14] = var17Lifetime14 - var16Lifetime18 | var16Lifetime18 - (var16Lifetime18 >>> 8);
                    while (true) {
                      incrementValue$0 = var11Lifetime1;
                      var11Lifetime1++;
                      var12Lifetime1 = var12Lifetime1 + (incrementValue$0 + var11Lifetime1);
                      var6Lifetime1 = var6Lifetime1 - this.width;
                      var7Lifetime1 = var7Lifetime1 + this.width;
                      if (var12Lifetime1 > param2) {
                        var10Lifetime1--;
                        var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                        var8Lifetime1 = var8Lifetime1 + this.width;
                        var9Lifetime1 = var9Lifetime1 - this.width;
                      }
                      if (var10Lifetime1 < var11Lifetime1) {
                        return;
                      }
                      var14Lifetime15 = var8Lifetime1 - var11Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var8Lifetime1 + var11Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var6Lifetime1 - var10Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var6Lifetime1 + var10Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var7Lifetime1 - var10Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var7Lifetime1 + var10Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var9Lifetime1 - var11Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                      var14Lifetime15 = var9Lifetime1 + var11Lifetime1;
                      var15Lifetime15 = param3;
                      var16Lifetime19 = this.pixels[var14Lifetime15];
                      var17Lifetime15 = var15Lifetime15 + var16Lifetime19;
                      var18Lifetime15 = (var15Lifetime15 & 16711935) + (var16Lifetime19 & 16711935);
                      var16Lifetime19 = (var18Lifetime15 & 16777472) + (var17Lifetime15 - var18Lifetime15 & 65536);
                      this.pixels[var14Lifetime15] = var17Lifetime15 - var16Lifetime19 | var16Lifetime19 - (var16Lifetime19 >>> 8);
                    }
                  }
                  if (param0 - var10Lifetime1 >= this.clipLeft &&
                    param1 >= this.clipTop &&
                    param1 < this.clipBottom) {
                    var14Lifetime7 = var6Lifetime1 - var10Lifetime1;
                    var15Lifetime7 = param3;
                    var16Lifetime7 = this.pixels[var14Lifetime7];
                    var17Lifetime7 = var15Lifetime7 + var16Lifetime7;
                    var18Lifetime7 = (var15Lifetime7 & 16711935) + (var16Lifetime7 & 16711935);
                    var16Lifetime7Lifetime1 = (var18Lifetime7 & 16777472) + (var17Lifetime7 - var18Lifetime7 & 65536);
                    this.pixels[var14Lifetime7] = var17Lifetime7 - var16Lifetime7Lifetime1 | var16Lifetime7Lifetime1 - (var16Lifetime7Lifetime1 >>> 8);
                  }
                  if (param0 + var10Lifetime1 < this.clipRight &&
                    param1 >= this.clipTop &&
                    param1 < this.clipBottom) {
                    var14Lifetime8 = var6Lifetime1 + var10Lifetime1;
                    var15Lifetime8 = param3;
                    var16Lifetime8 = this.pixels[var14Lifetime8];
                    var17Lifetime8 = var15Lifetime8 + var16Lifetime8;
                    var18Lifetime8 = (var15Lifetime8 & 16711935) + (var16Lifetime8 & 16711935);
                    var16Lifetime8Lifetime1 = (var18Lifetime8 & 16777472) + (var17Lifetime8 - var18Lifetime8 & 65536);
                    this.pixels[var14Lifetime8] = var17Lifetime8 - var16Lifetime8Lifetime1 | var16Lifetime8Lifetime1 - (var16Lifetime8Lifetime1 >>> 8);
                  }
                  if (param1 - var10Lifetime1 >= this.clipTop &&
                    param0 >= this.clipLeft &&
                    param0 < this.clipRight) {
                    var14Lifetime9 = var8Lifetime1;
                    var15Lifetime9 = param3;
                    var16Lifetime9 = this.pixels[var14Lifetime9];
                    var17Lifetime9 = var15Lifetime9 + var16Lifetime9;
                    var18Lifetime9 = (var15Lifetime9 & 16711935) + (var16Lifetime9 & 16711935);
                    var16Lifetime9Lifetime1 = (var18Lifetime9 & 16777472) + (var17Lifetime9 - var18Lifetime9 & 65536);
                    this.pixels[var14Lifetime9] = var17Lifetime9 - var16Lifetime9Lifetime1 | var16Lifetime9Lifetime1 - (var16Lifetime9Lifetime1 >>> 8);
                  }
                  if (param1 + var10Lifetime1 < this.clipBottom &&
                    param0 >= this.clipLeft &&
                    param0 < this.clipRight) {
                    var14Lifetime10 = var9Lifetime1;
                    var15Lifetime10 = param3;
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
                    var6Lifetime1 = var6Lifetime1 - this.width;
                    var7Lifetime1 = var7Lifetime1 + this.width;
                    if (var12Lifetime1 > param2) {
                      var10Lifetime1--;
                      var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                      var8Lifetime1 = var8Lifetime1 + this.width;
                      var9Lifetime1 = var9Lifetime1 - this.width;
                    }
                    if (var10Lifetime1 < var11Lifetime1) {
                      return;
                    }
                    if (param1 - var10Lifetime1 >= this.clipTop &&
                      param1 - var10Lifetime1 < this.clipBottom) {
                      if (param0 - var11Lifetime1 >= this.clipLeft &&
                        param0 - var11Lifetime1 < this.clipRight) {
                        var14Lifetime11 = var8Lifetime1 - var11Lifetime1;
                        var15Lifetime11 = param3;
                        var16Lifetime11 = this.pixels[var14Lifetime11];
                        var17Lifetime11 = var15Lifetime11 + var16Lifetime11;
                        var18Lifetime11 = (var15Lifetime11 & 16711935) + (var16Lifetime11 & 16711935);
                        var16Lifetime11 = (var18Lifetime11 & 16777472) + (var17Lifetime11 - var18Lifetime11 & 65536);
                        this.pixels[var14Lifetime11] = var17Lifetime11 - var16Lifetime11 | var16Lifetime11 - (var16Lifetime11 >>> 8);
                      }
                      if (param0 + var11Lifetime1 >= this.clipLeft &&
                        param0 + var11Lifetime1 < this.clipRight) {
                        var14Lifetime11 = var8Lifetime1 + var11Lifetime1;
                        var15Lifetime11 = param3;
                        var16Lifetime11 = this.pixels[var14Lifetime11];
                        var17Lifetime11 = var15Lifetime11 + var16Lifetime11;
                        var18Lifetime11 = (var15Lifetime11 & 16711935) + (var16Lifetime11 & 16711935);
                        var16Lifetime11 = (var18Lifetime11 & 16777472) + (var17Lifetime11 - var18Lifetime11 & 65536);
                        this.pixels[var14Lifetime11] = var17Lifetime11 - var16Lifetime11 | var16Lifetime11 - (var16Lifetime11 >>> 8);
                      }
                    }
                    if (param1 - var11Lifetime1 >= this.clipTop &&
                      param1 - var11Lifetime1 < this.clipBottom) {
                      if (param0 - var10Lifetime1 >= this.clipLeft &&
                        param0 - var10Lifetime1 < this.clipRight) {
                        var14Lifetime11Lifetime1 = var6Lifetime1 - var10Lifetime1;
                        var15Lifetime11Lifetime1 = param3;
                        var16Lifetime11Lifetime1 = this.pixels[var14Lifetime11Lifetime1];
                        var17Lifetime11Lifetime1 = var15Lifetime11Lifetime1 + var16Lifetime11Lifetime1;
                        var18Lifetime11Lifetime1 = (var15Lifetime11Lifetime1 & 16711935) + (var16Lifetime11Lifetime1 & 16711935);
                        var16Lifetime11Lifetime1 = (var18Lifetime11Lifetime1 & 16777472) + (var17Lifetime11Lifetime1 - var18Lifetime11Lifetime1 & 65536);
                        this.pixels[var14Lifetime11Lifetime1] = var17Lifetime11Lifetime1 - var16Lifetime11Lifetime1 | var16Lifetime11Lifetime1 - (var16Lifetime11Lifetime1 >>> 8);
                      }
                      if (param0 + var10Lifetime1 >= this.clipLeft &&
                        param0 + var10Lifetime1 < this.clipRight) {
                        var14Lifetime11Lifetime1 = var6Lifetime1 + var10Lifetime1;
                        var15Lifetime11Lifetime1 = param3;
                        var16Lifetime11Lifetime1 = this.pixels[var14Lifetime11Lifetime1];
                        var17Lifetime11Lifetime1 = var15Lifetime11Lifetime1 + var16Lifetime11Lifetime1;
                        var18Lifetime11Lifetime1 = (var15Lifetime11Lifetime1 & 16711935) + (var16Lifetime11Lifetime1 & 16711935);
                        var16Lifetime11Lifetime1 = (var18Lifetime11Lifetime1 & 16777472) + (var17Lifetime11Lifetime1 - var18Lifetime11Lifetime1 & 65536);
                        this.pixels[var14Lifetime11Lifetime1] = var17Lifetime11Lifetime1 - var16Lifetime11Lifetime1 | var16Lifetime11Lifetime1 - (var16Lifetime11Lifetime1 >>> 8);
                      }
                    }
                    if (param1 + var11Lifetime1 >= this.clipTop &&
                      param1 + var11Lifetime1 < this.clipBottom) {
                      if (param0 - var10Lifetime1 >= this.clipLeft &&
                        param0 - var10Lifetime1 < this.clipRight) {
                        var14Lifetime11Lifetime2 = var7Lifetime1 - var10Lifetime1;
                        var15Lifetime11Lifetime2 = param3;
                        var16Lifetime11Lifetime2 = this.pixels[var14Lifetime11Lifetime2];
                        var17Lifetime11Lifetime2 = var15Lifetime11Lifetime2 + var16Lifetime11Lifetime2;
                        var18Lifetime11Lifetime2 = (var15Lifetime11Lifetime2 & 16711935) + (var16Lifetime11Lifetime2 & 16711935);
                        var16Lifetime11Lifetime2 = (var18Lifetime11Lifetime2 & 16777472) + (var17Lifetime11Lifetime2 - var18Lifetime11Lifetime2 & 65536);
                        this.pixels[var14Lifetime11Lifetime2] = var17Lifetime11Lifetime2 - var16Lifetime11Lifetime2 | var16Lifetime11Lifetime2 - (var16Lifetime11Lifetime2 >>> 8);
                      }
                      if (param0 + var10Lifetime1 >= this.clipLeft &&
                        param0 + var10Lifetime1 < this.clipRight) {
                        var14Lifetime11Lifetime2 = var7Lifetime1 + var10Lifetime1;
                        var15Lifetime11Lifetime2 = param3;
                        var16Lifetime11Lifetime2 = this.pixels[var14Lifetime11Lifetime2];
                        var17Lifetime11Lifetime2 = var15Lifetime11Lifetime2 + var16Lifetime11Lifetime2;
                        var18Lifetime11Lifetime2 = (var15Lifetime11Lifetime2 & 16711935) + (var16Lifetime11Lifetime2 & 16711935);
                        var16Lifetime11Lifetime2 = (var18Lifetime11Lifetime2 & 16777472) + (var17Lifetime11Lifetime2 - var18Lifetime11Lifetime2 & 65536);
                        this.pixels[var14Lifetime11Lifetime2] = var17Lifetime11Lifetime2 - var16Lifetime11Lifetime2 | var16Lifetime11Lifetime2 - (var16Lifetime11Lifetime2 >>> 8);
                      }
                    }
                    if (param1 + var10Lifetime1 < this.clipTop) {
                      continue;
                    }
                    if (param1 + var10Lifetime1 >= this.clipBottom) {
                      continue;
                    }
                    if (param0 - var11Lifetime1 >= this.clipLeft &&
                      param0 - var11Lifetime1 < this.clipRight) {
                      var14Lifetime11Lifetime3 = var9Lifetime1 - var11Lifetime1;
                      var15Lifetime11Lifetime3 = param3;
                      var16Lifetime11Lifetime3 = this.pixels[var14Lifetime11Lifetime3];
                      var17Lifetime11Lifetime3 = var15Lifetime11Lifetime3 + var16Lifetime11Lifetime3;
                      var18Lifetime11Lifetime3 = (var15Lifetime11Lifetime3 & 16711935) + (var16Lifetime11Lifetime3 & 16711935);
                      var16Lifetime11Lifetime3 = (var18Lifetime11Lifetime3 & 16777472) + (var17Lifetime11Lifetime3 - var18Lifetime11Lifetime3 & 65536);
                      this.pixels[var14Lifetime11Lifetime3] = var17Lifetime11Lifetime3 - var16Lifetime11Lifetime3 | var16Lifetime11Lifetime3 - (var16Lifetime11Lifetime3 >>> 8);
                    }
                    if (param0 + var11Lifetime1 < this.clipLeft) {
                      continue;
                    }
                    if (param0 + var11Lifetime1 >= this.clipRight) {
                      continue;
                    }
                    var14Lifetime11Lifetime4 = var9Lifetime1 + var11Lifetime1;
                    var15Lifetime11Lifetime4 = param3;
                    var16Lifetime11Lifetime4 = this.pixels[var14Lifetime11Lifetime4];
                    var17Lifetime11Lifetime4 = var15Lifetime11Lifetime4 + var16Lifetime11Lifetime4;
                    var18Lifetime11Lifetime4 = (var15Lifetime11Lifetime4 & 16711935) + (var16Lifetime11Lifetime4 & 16711935);
                    var16Lifetime11Lifetime5 = (var18Lifetime11Lifetime4 & 16777472) + (var17Lifetime11Lifetime4 - var18Lifetime11Lifetime4 & 65536);
                    this.pixels[var14Lifetime11Lifetime4] = var17Lifetime11Lifetime4 - var16Lifetime11Lifetime5 | var16Lifetime11Lifetime5 - (var16Lifetime11Lifetime5 >>> 8);
                  }
                }
                if (param0 - var10Lifetime1 >= this.clipLeft &&
                  param0 + var10Lifetime1 < this.clipRight &&
                  param1 - var10Lifetime1 >= this.clipTop &&
                  param1 + var10Lifetime1 < this.clipBottom) {
                  var14Lifetime1 = var6Lifetime1 - var10Lifetime1;
                  var15Lifetime1 = param3;
                  var16Lifetime1 = var13;
                  var15Lifetime1 = ((var15Lifetime1 & 16711935) * var16Lifetime1 >> 8 & 16711935) + ((var15Lifetime1 & 65280) * var16Lifetime1 >> 8 & 65280) + (var16Lifetime1 << 24);
                  var17Lifetime1 = 256 - var16Lifetime1;
                  var18Lifetime1 = this.pixels[var14Lifetime1];
                  var18Lifetime1 = ((var18Lifetime1 & 16711935) * var17Lifetime1 >> 8 & 16711935) + ((var18Lifetime1 & 65280) * var17Lifetime1 >> 8 & 65280);
                  this.pixels[var14Lifetime1] = var15Lifetime1 + var18Lifetime1;
                  var14Lifetime1Lifetime1 = var6Lifetime1 + var10Lifetime1;
                  var15Lifetime1Lifetime1 = param3;
                  var16Lifetime1Lifetime1 = var13;
                  var15Lifetime1Lifetime1 = ((var15Lifetime1Lifetime1 & 16711935) * var16Lifetime1Lifetime1 >> 8 & 16711935) + ((var15Lifetime1Lifetime1 & 65280) * var16Lifetime1Lifetime1 >> 8 & 65280) + (var16Lifetime1Lifetime1 << 24);
                  var17Lifetime1Lifetime1 = 256 - var16Lifetime1Lifetime1;
                  var18Lifetime1Lifetime1 = this.pixels[var14Lifetime1Lifetime1];
                  var18Lifetime1Lifetime1 = ((var18Lifetime1Lifetime1 & 16711935) * var17Lifetime1Lifetime1 >> 8 & 16711935) + ((var18Lifetime1Lifetime1 & 65280) * var17Lifetime1Lifetime1 >> 8 & 65280);
                  this.pixels[var14Lifetime1Lifetime1] = var15Lifetime1Lifetime1 + var18Lifetime1Lifetime1;
                  var14Lifetime1Lifetime2 = var8Lifetime1;
                  var15Lifetime1Lifetime2 = param3;
                  var16Lifetime1Lifetime2 = var13;
                  var15Lifetime1Lifetime2 = ((var15Lifetime1Lifetime2 & 16711935) * var16Lifetime1Lifetime2 >> 8 & 16711935) + ((var15Lifetime1Lifetime2 & 65280) * var16Lifetime1Lifetime2 >> 8 & 65280) + (var16Lifetime1Lifetime2 << 24);
                  var17Lifetime1Lifetime2 = 256 - var16Lifetime1Lifetime2;
                  var18Lifetime1Lifetime2 = this.pixels[var14Lifetime1Lifetime2];
                  var18Lifetime1Lifetime2 = ((var18Lifetime1Lifetime2 & 16711935) * var17Lifetime1Lifetime2 >> 8 & 16711935) + ((var18Lifetime1Lifetime2 & 65280) * var17Lifetime1Lifetime2 >> 8 & 65280);
                  this.pixels[var14Lifetime1Lifetime2] = var15Lifetime1Lifetime2 + var18Lifetime1Lifetime2;
                  var14Lifetime1Lifetime3 = var9Lifetime1;
                  var15Lifetime1Lifetime3 = param3;
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
                    var6Lifetime1 = var6Lifetime1 - this.width;
                    var7Lifetime1 = var7Lifetime1 + this.width;
                    if (var12Lifetime1 > param2) {
                      var10Lifetime1--;
                      var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                      var8Lifetime1 = var8Lifetime1 + this.width;
                      var9Lifetime1 = var9Lifetime1 - this.width;
                    }
                    if (var10Lifetime1 < var11Lifetime1) {
                      return;
                    }
                    var14Lifetime1Lifetime4 = var8Lifetime1 - var11Lifetime1;
                    var15Lifetime1Lifetime4 = param3;
                    var16Lifetime1Lifetime4 = var13;
                    var15Lifetime1Lifetime4 = ((var15Lifetime1Lifetime4 & 16711935) * var16Lifetime1Lifetime4 >> 8 & 16711935) + ((var15Lifetime1Lifetime4 & 65280) * var16Lifetime1Lifetime4 >> 8 & 65280) + (var16Lifetime1Lifetime4 << 24);
                    var17Lifetime1Lifetime4 = 256 - var16Lifetime1Lifetime4;
                    var18Lifetime1Lifetime4 = this.pixels[var14Lifetime1Lifetime4];
                    var18Lifetime1Lifetime4 = ((var18Lifetime1Lifetime4 & 16711935) * var17Lifetime1Lifetime4 >> 8 & 16711935) + ((var18Lifetime1Lifetime4 & 65280) * var17Lifetime1Lifetime4 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4] = var15Lifetime1Lifetime4 + var18Lifetime1Lifetime4;
                    var14Lifetime1Lifetime4Lifetime1 = var8Lifetime1 + var11Lifetime1;
                    var15Lifetime1Lifetime4Lifetime1 = param3;
                    var16Lifetime1Lifetime4Lifetime1 = var13;
                    var15Lifetime1Lifetime4Lifetime1 = ((var15Lifetime1Lifetime4Lifetime1 & 16711935) * var16Lifetime1Lifetime4Lifetime1 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime1 & 65280) * var16Lifetime1Lifetime4Lifetime1 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime1 << 24);
                    var17Lifetime1Lifetime4Lifetime1 = 256 - var16Lifetime1Lifetime4Lifetime1;
                    var18Lifetime1Lifetime4Lifetime1 = this.pixels[var14Lifetime1Lifetime4Lifetime1];
                    var18Lifetime1Lifetime4Lifetime1 = ((var18Lifetime1Lifetime4Lifetime1 & 16711935) * var17Lifetime1Lifetime4Lifetime1 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime1 & 65280) * var17Lifetime1Lifetime4Lifetime1 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime1] = var15Lifetime1Lifetime4Lifetime1 + var18Lifetime1Lifetime4Lifetime1;
                    var14Lifetime1Lifetime4Lifetime2 = var6Lifetime1 - var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime2 = param3;
                    var16Lifetime1Lifetime4Lifetime2 = var13;
                    var15Lifetime1Lifetime4Lifetime2 = ((var15Lifetime1Lifetime4Lifetime2 & 16711935) * var16Lifetime1Lifetime4Lifetime2 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime2 & 65280) * var16Lifetime1Lifetime4Lifetime2 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime2 << 24);
                    var17Lifetime1Lifetime4Lifetime2 = 256 - var16Lifetime1Lifetime4Lifetime2;
                    var18Lifetime1Lifetime4Lifetime2 = this.pixels[var14Lifetime1Lifetime4Lifetime2];
                    var18Lifetime1Lifetime4Lifetime2 = ((var18Lifetime1Lifetime4Lifetime2 & 16711935) * var17Lifetime1Lifetime4Lifetime2 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime2 & 65280) * var17Lifetime1Lifetime4Lifetime2 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime2] = var15Lifetime1Lifetime4Lifetime2 + var18Lifetime1Lifetime4Lifetime2;
                    var14Lifetime1Lifetime4Lifetime3 = var6Lifetime1 + var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime3 = param3;
                    var16Lifetime1Lifetime4Lifetime3 = var13;
                    var15Lifetime1Lifetime4Lifetime3 = ((var15Lifetime1Lifetime4Lifetime3 & 16711935) * var16Lifetime1Lifetime4Lifetime3 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime3 & 65280) * var16Lifetime1Lifetime4Lifetime3 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime3 << 24);
                    var17Lifetime1Lifetime4Lifetime3 = 256 - var16Lifetime1Lifetime4Lifetime3;
                    var18Lifetime1Lifetime4Lifetime3 = this.pixels[var14Lifetime1Lifetime4Lifetime3];
                    var18Lifetime1Lifetime4Lifetime3 = ((var18Lifetime1Lifetime4Lifetime3 & 16711935) * var17Lifetime1Lifetime4Lifetime3 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime3 & 65280) * var17Lifetime1Lifetime4Lifetime3 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime3] = var15Lifetime1Lifetime4Lifetime3 + var18Lifetime1Lifetime4Lifetime3;
                    var14Lifetime1Lifetime4Lifetime4 = var7Lifetime1 - var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime4 = param3;
                    var16Lifetime1Lifetime4Lifetime4 = var13;
                    var15Lifetime1Lifetime4Lifetime4 = ((var15Lifetime1Lifetime4Lifetime4 & 16711935) * var16Lifetime1Lifetime4Lifetime4 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime4 & 65280) * var16Lifetime1Lifetime4Lifetime4 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime4 << 24);
                    var17Lifetime1Lifetime4Lifetime4 = 256 - var16Lifetime1Lifetime4Lifetime4;
                    var18Lifetime1Lifetime4Lifetime4 = this.pixels[var14Lifetime1Lifetime4Lifetime4];
                    var18Lifetime1Lifetime4Lifetime4 = ((var18Lifetime1Lifetime4Lifetime4 & 16711935) * var17Lifetime1Lifetime4Lifetime4 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime4 & 65280) * var17Lifetime1Lifetime4Lifetime4 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime4] = var15Lifetime1Lifetime4Lifetime4 + var18Lifetime1Lifetime4Lifetime4;
                    var14Lifetime1Lifetime4Lifetime5 = var7Lifetime1 + var10Lifetime1;
                    var15Lifetime1Lifetime4Lifetime5 = param3;
                    var16Lifetime1Lifetime4Lifetime5 = var13;
                    var15Lifetime1Lifetime4Lifetime5 = ((var15Lifetime1Lifetime4Lifetime5 & 16711935) * var16Lifetime1Lifetime4Lifetime5 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime5 & 65280) * var16Lifetime1Lifetime4Lifetime5 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime5 << 24);
                    var17Lifetime1Lifetime4Lifetime5 = 256 - var16Lifetime1Lifetime4Lifetime5;
                    var18Lifetime1Lifetime4Lifetime5 = this.pixels[var14Lifetime1Lifetime4Lifetime5];
                    var18Lifetime1Lifetime4Lifetime5 = ((var18Lifetime1Lifetime4Lifetime5 & 16711935) * var17Lifetime1Lifetime4Lifetime5 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime5 & 65280) * var17Lifetime1Lifetime4Lifetime5 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime5] = var15Lifetime1Lifetime4Lifetime5 + var18Lifetime1Lifetime4Lifetime5;
                    var14Lifetime1Lifetime4Lifetime6 = var9Lifetime1 - var11Lifetime1;
                    var15Lifetime1Lifetime4Lifetime6 = param3;
                    var16Lifetime1Lifetime4Lifetime6 = var13;
                    var15Lifetime1Lifetime4Lifetime6 = ((var15Lifetime1Lifetime4Lifetime6 & 16711935) * var16Lifetime1Lifetime4Lifetime6 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime6 & 65280) * var16Lifetime1Lifetime4Lifetime6 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime6 << 24);
                    var17Lifetime1Lifetime4Lifetime6 = 256 - var16Lifetime1Lifetime4Lifetime6;
                    var18Lifetime1Lifetime4Lifetime6 = this.pixels[var14Lifetime1Lifetime4Lifetime6];
                    var18Lifetime1Lifetime4Lifetime6 = ((var18Lifetime1Lifetime4Lifetime6 & 16711935) * var17Lifetime1Lifetime4Lifetime6 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime6 & 65280) * var17Lifetime1Lifetime4Lifetime6 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime6] = var15Lifetime1Lifetime4Lifetime6 + var18Lifetime1Lifetime4Lifetime6;
                    var14Lifetime1Lifetime4Lifetime7 = var9Lifetime1 + var11Lifetime1;
                    var15Lifetime1Lifetime4Lifetime7 = param3;
                    var16Lifetime1Lifetime4Lifetime7 = var13;
                    var15Lifetime1Lifetime4Lifetime7 = ((var15Lifetime1Lifetime4Lifetime7 & 16711935) * var16Lifetime1Lifetime4Lifetime7 >> 8 & 16711935) + ((var15Lifetime1Lifetime4Lifetime7 & 65280) * var16Lifetime1Lifetime4Lifetime7 >> 8 & 65280) + (var16Lifetime1Lifetime4Lifetime7 << 24);
                    var17Lifetime1Lifetime4Lifetime7 = 256 - var16Lifetime1Lifetime4Lifetime7;
                    var18Lifetime1Lifetime4Lifetime7 = this.pixels[var14Lifetime1Lifetime4Lifetime7];
                    var18Lifetime1Lifetime4Lifetime7 = ((var18Lifetime1Lifetime4Lifetime7 & 16711935) * var17Lifetime1Lifetime4Lifetime7 >> 8 & 16711935) + ((var18Lifetime1Lifetime4Lifetime7 & 65280) * var17Lifetime1Lifetime4Lifetime7 >> 8 & 65280);
                    this.pixels[var14Lifetime1Lifetime4Lifetime7] = var15Lifetime1Lifetime4Lifetime7 + var18Lifetime1Lifetime4Lifetime7;
                  }
                }
                if (param0 - var10Lifetime1 >= this.clipLeft &&
                  param1 >= this.clipTop &&
                  param1 < this.clipBottom) {
                  var14Lifetime2 = var6Lifetime1 - var10Lifetime1;
                  var15Lifetime2 = param3;
                  var16Lifetime2 = var13;
                  var15Lifetime2 = ((var15Lifetime2 & 16711935) * var16Lifetime2 >> 8 & 16711935) + ((var15Lifetime2 & 65280) * var16Lifetime2 >> 8 & 65280) + (var16Lifetime2 << 24);
                  var17Lifetime2 = 256 - var16Lifetime2;
                  var18Lifetime2 = this.pixels[var14Lifetime2];
                  var18Lifetime2 = ((var18Lifetime2 & 16711935) * var17Lifetime2 >> 8 & 16711935) + ((var18Lifetime2 & 65280) * var17Lifetime2 >> 8 & 65280);
                  this.pixels[var14Lifetime2] = var15Lifetime2 + var18Lifetime2;
                }
                if (param0 + var10Lifetime1 < this.clipRight &&
                  param1 >= this.clipTop &&
                  param1 < this.clipBottom) {
                  var14Lifetime3 = var6Lifetime1 + var10Lifetime1;
                  var15Lifetime3 = param3;
                  var16Lifetime3 = var13;
                  var15Lifetime3 = ((var15Lifetime3 & 16711935) * var16Lifetime3 >> 8 & 16711935) + ((var15Lifetime3 & 65280) * var16Lifetime3 >> 8 & 65280) + (var16Lifetime3 << 24);
                  var17Lifetime3 = 256 - var16Lifetime3;
                  var18Lifetime3 = this.pixels[var14Lifetime3];
                  var18Lifetime3 = ((var18Lifetime3 & 16711935) * var17Lifetime3 >> 8 & 16711935) + ((var18Lifetime3 & 65280) * var17Lifetime3 >> 8 & 65280);
                  this.pixels[var14Lifetime3] = var15Lifetime3 + var18Lifetime3;
                }
                if (param1 - var10Lifetime1 >= this.clipTop &&
                  param0 >= this.clipLeft &&
                  param0 < this.clipRight) {
                  var14Lifetime4 = var8Lifetime1;
                  var15Lifetime4 = param3;
                  var16Lifetime4 = var13;
                  var15Lifetime4 = ((var15Lifetime4 & 16711935) * var16Lifetime4 >> 8 & 16711935) + ((var15Lifetime4 & 65280) * var16Lifetime4 >> 8 & 65280) + (var16Lifetime4 << 24);
                  var17Lifetime4 = 256 - var16Lifetime4;
                  var18Lifetime4 = this.pixels[var14Lifetime4];
                  var18Lifetime4 = ((var18Lifetime4 & 16711935) * var17Lifetime4 >> 8 & 16711935) + ((var18Lifetime4 & 65280) * var17Lifetime4 >> 8 & 65280);
                  this.pixels[var14Lifetime4] = var15Lifetime4 + var18Lifetime4;
                }
                if (param1 + var10Lifetime1 < this.clipBottom &&
                  param0 >= this.clipLeft &&
                  param0 < this.clipRight) {
                  var14Lifetime5 = var9Lifetime1;
                  var15Lifetime5 = param3;
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
                  var6Lifetime1 = var6Lifetime1 - this.width;
                  var7Lifetime1 = var7Lifetime1 + this.width;
                  if (var12Lifetime1 > param2) {
                    var10Lifetime1--;
                    var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                    var8Lifetime1 = var8Lifetime1 + this.width;
                    var9Lifetime1 = var9Lifetime1 - this.width;
                  }
                  if (var10Lifetime1 < var11Lifetime1) {
                    return;
                  }
                  if (param1 - var10Lifetime1 >= this.clipTop &&
                    param1 - var10Lifetime1 < this.clipBottom) {
                    if (param0 - var11Lifetime1 >= this.clipLeft &&
                      param0 - var11Lifetime1 < this.clipRight) {
                      var14Lifetime6 = var8Lifetime1 - var11Lifetime1;
                      var15Lifetime6 = param3;
                      var16Lifetime6 = var13;
                      var15Lifetime6 = ((var15Lifetime6 & 16711935) * var16Lifetime6 >> 8 & 16711935) + ((var15Lifetime6 & 65280) * var16Lifetime6 >> 8 & 65280) + (var16Lifetime6 << 24);
                      var17Lifetime6 = 256 - var16Lifetime6;
                      var18Lifetime6 = this.pixels[var14Lifetime6];
                      var18Lifetime6 = ((var18Lifetime6 & 16711935) * var17Lifetime6 >> 8 & 16711935) + ((var18Lifetime6 & 65280) * var17Lifetime6 >> 8 & 65280);
                      this.pixels[var14Lifetime6] = var15Lifetime6 + var18Lifetime6;
                    }
                    if (param0 + var11Lifetime1 >= this.clipLeft &&
                      param0 + var11Lifetime1 < this.clipRight) {
                      var14Lifetime6Lifetime5 = var8Lifetime1 + var11Lifetime1;
                      var15Lifetime6Lifetime5 = param3;
                      var16Lifetime6Lifetime5 = var13;
                      var15Lifetime6Lifetime5 = ((var15Lifetime6Lifetime5 & 16711935) * var16Lifetime6Lifetime5 >> 8 & 16711935) + ((var15Lifetime6Lifetime5 & 65280) * var16Lifetime6Lifetime5 >> 8 & 65280) + (var16Lifetime6Lifetime5 << 24);
                      var17Lifetime6Lifetime5 = 256 - var16Lifetime6Lifetime5;
                      var18Lifetime6Lifetime5 = this.pixels[var14Lifetime6Lifetime5];
                      var18Lifetime6Lifetime5 = ((var18Lifetime6Lifetime5 & 16711935) * var17Lifetime6Lifetime5 >> 8 & 16711935) + ((var18Lifetime6Lifetime5 & 65280) * var17Lifetime6Lifetime5 >> 8 & 65280);
                      this.pixels[var14Lifetime6Lifetime5] = var15Lifetime6Lifetime5 + var18Lifetime6Lifetime5;
                    }
                  }
                  if (param1 - var11Lifetime1 >= this.clipTop &&
                    param1 - var11Lifetime1 < this.clipBottom) {
                    if (param0 - var10Lifetime1 >= this.clipLeft &&
                      param0 - var10Lifetime1 < this.clipRight) {
                      var14Lifetime6Lifetime1 = var6Lifetime1 - var10Lifetime1;
                      var15Lifetime6Lifetime1 = param3;
                      var16Lifetime6Lifetime1 = var13;
                      var15Lifetime6Lifetime1 = ((var15Lifetime6Lifetime1 & 16711935) * var16Lifetime6Lifetime1 >> 8 & 16711935) + ((var15Lifetime6Lifetime1 & 65280) * var16Lifetime6Lifetime1 >> 8 & 65280) + (var16Lifetime6Lifetime1 << 24);
                      var17Lifetime6Lifetime1 = 256 - var16Lifetime6Lifetime1;
                      var18Lifetime6Lifetime1 = this.pixels[var14Lifetime6Lifetime1];
                      var18Lifetime6Lifetime1 = ((var18Lifetime6Lifetime1 & 16711935) * var17Lifetime6Lifetime1 >> 8 & 16711935) + ((var18Lifetime6Lifetime1 & 65280) * var17Lifetime6Lifetime1 >> 8 & 65280);
                      this.pixels[var14Lifetime6Lifetime1] = var15Lifetime6Lifetime1 + var18Lifetime6Lifetime1;
                    }
                    if (param0 + var10Lifetime1 >= this.clipLeft &&
                      param0 + var10Lifetime1 < this.clipRight) {
                      var14Lifetime6Lifetime1Lifetime1 = var6Lifetime1 + var10Lifetime1;
                      var15Lifetime6Lifetime1Lifetime1 = param3;
                      var16Lifetime6Lifetime1Lifetime1 = var13;
                      var15Lifetime6Lifetime1Lifetime1 = ((var15Lifetime6Lifetime1Lifetime1 & 16711935) * var16Lifetime6Lifetime1Lifetime1 >> 8 & 16711935) + ((var15Lifetime6Lifetime1Lifetime1 & 65280) * var16Lifetime6Lifetime1Lifetime1 >> 8 & 65280) + (var16Lifetime6Lifetime1Lifetime1 << 24);
                      var17Lifetime6Lifetime1Lifetime1 = 256 - var16Lifetime6Lifetime1Lifetime1;
                      var18Lifetime6Lifetime1Lifetime1 = this.pixels[var14Lifetime6Lifetime1Lifetime1];
                      var18Lifetime6Lifetime1Lifetime1 = ((var18Lifetime6Lifetime1Lifetime1 & 16711935) * var17Lifetime6Lifetime1Lifetime1 >> 8 & 16711935) + ((var18Lifetime6Lifetime1Lifetime1 & 65280) * var17Lifetime6Lifetime1Lifetime1 >> 8 & 65280);
                      this.pixels[var14Lifetime6Lifetime1Lifetime1] = var15Lifetime6Lifetime1Lifetime1 + var18Lifetime6Lifetime1Lifetime1;
                    }
                  }
                  if (param1 + var11Lifetime1 >= this.clipTop &&
                    param1 + var11Lifetime1 < this.clipBottom) {
                    if (param0 - var10Lifetime1 >= this.clipLeft &&
                      param0 - var10Lifetime1 < this.clipRight) {
                      var14Lifetime6Lifetime2 = var7Lifetime1 - var10Lifetime1;
                      var15Lifetime6Lifetime2 = param3;
                      var16Lifetime6Lifetime2 = var13;
                      var15Lifetime6Lifetime2 = ((var15Lifetime6Lifetime2 & 16711935) * var16Lifetime6Lifetime2 >> 8 & 16711935) + ((var15Lifetime6Lifetime2 & 65280) * var16Lifetime6Lifetime2 >> 8 & 65280) + (var16Lifetime6Lifetime2 << 24);
                      var17Lifetime6Lifetime2 = 256 - var16Lifetime6Lifetime2;
                      var18Lifetime6Lifetime2 = this.pixels[var14Lifetime6Lifetime2];
                      var18Lifetime6Lifetime2 = ((var18Lifetime6Lifetime2 & 16711935) * var17Lifetime6Lifetime2 >> 8 & 16711935) + ((var18Lifetime6Lifetime2 & 65280) * var17Lifetime6Lifetime2 >> 8 & 65280);
                      this.pixels[var14Lifetime6Lifetime2] = var15Lifetime6Lifetime2 + var18Lifetime6Lifetime2;
                    }
                    if (param0 + var10Lifetime1 >= this.clipLeft &&
                      param0 + var10Lifetime1 < this.clipRight) {
                      var14Lifetime6Lifetime2Lifetime1 = var7Lifetime1 + var10Lifetime1;
                      var15Lifetime6Lifetime2Lifetime1 = param3;
                      var16Lifetime6Lifetime2Lifetime1 = var13;
                      var15Lifetime6Lifetime2Lifetime1 = ((var15Lifetime6Lifetime2Lifetime1 & 16711935) * var16Lifetime6Lifetime2Lifetime1 >> 8 & 16711935) + ((var15Lifetime6Lifetime2Lifetime1 & 65280) * var16Lifetime6Lifetime2Lifetime1 >> 8 & 65280) + (var16Lifetime6Lifetime2Lifetime1 << 24);
                      var17Lifetime6Lifetime2Lifetime1 = 256 - var16Lifetime6Lifetime2Lifetime1;
                      var18Lifetime6Lifetime2Lifetime1 = this.pixels[var14Lifetime6Lifetime2Lifetime1];
                      var18Lifetime6Lifetime2Lifetime1 = ((var18Lifetime6Lifetime2Lifetime1 & 16711935) * var17Lifetime6Lifetime2Lifetime1 >> 8 & 16711935) + ((var18Lifetime6Lifetime2Lifetime1 & 65280) * var17Lifetime6Lifetime2Lifetime1 >> 8 & 65280);
                      this.pixels[var14Lifetime6Lifetime2Lifetime1] = var15Lifetime6Lifetime2Lifetime1 + var18Lifetime6Lifetime2Lifetime1;
                    }
                  }
                  if (param1 + var10Lifetime1 < this.clipTop) {
                    continue;
                  }
                  if (param1 + var10Lifetime1 >= this.clipBottom) {
                    continue;
                  }
                  if (param0 - var11Lifetime1 >= this.clipLeft &&
                    param0 - var11Lifetime1 < this.clipRight) {
                    var14Lifetime6Lifetime3 = var9Lifetime1 - var11Lifetime1;
                    var15Lifetime6Lifetime3 = param3;
                    var16Lifetime6Lifetime3 = var13;
                    var15Lifetime6Lifetime3 = ((var15Lifetime6Lifetime3 & 16711935) * var16Lifetime6Lifetime3 >> 8 & 16711935) + ((var15Lifetime6Lifetime3 & 65280) * var16Lifetime6Lifetime3 >> 8 & 65280) + (var16Lifetime6Lifetime3 << 24);
                    var17Lifetime6Lifetime3 = 256 - var16Lifetime6Lifetime3;
                    var18Lifetime6Lifetime3 = this.pixels[var14Lifetime6Lifetime3];
                    var18Lifetime6Lifetime3 = ((var18Lifetime6Lifetime3 & 16711935) * var17Lifetime6Lifetime3 >> 8 & 16711935) + ((var18Lifetime6Lifetime3 & 65280) * var17Lifetime6Lifetime3 >> 8 & 65280);
                    this.pixels[var14Lifetime6Lifetime3] = var15Lifetime6Lifetime3 + var18Lifetime6Lifetime3;
                  }
                  if (param0 + var11Lifetime1 < this.clipLeft) {
                    continue;
                  }
                  if (param0 + var11Lifetime1 >= this.clipRight) {
                    continue;
                  }
                  var14Lifetime6Lifetime4 = var9Lifetime1 + var11Lifetime1;
                  var15Lifetime6Lifetime4 = param3;
                  var16Lifetime6Lifetime4 = var13;
                  var15Lifetime6Lifetime4 = ((var15Lifetime6Lifetime4 & 16711935) * var16Lifetime6Lifetime4 >> 8 & 16711935) + ((var15Lifetime6Lifetime4 & 65280) * var16Lifetime6Lifetime4 >> 8 & 65280) + (var16Lifetime6Lifetime4 << 24);
                  var17Lifetime6Lifetime4 = 256 - var16Lifetime6Lifetime4;
                  var18Lifetime6Lifetime4 = this.pixels[var14Lifetime6Lifetime4];
                  var18Lifetime6Lifetime4 = ((var18Lifetime6Lifetime4 & 16711935) * var17Lifetime6Lifetime4 >> 8 & 16711935) + ((var18Lifetime6Lifetime4 & 65280) * var17Lifetime6Lifetime4 >> 8 & 65280);
                  this.pixels[var14Lifetime6Lifetime4] = var15Lifetime6Lifetime4 + var18Lifetime6Lifetime4;
                }
              }
              if (param0 - var10Lifetime1 >= this.clipLeft) {
                if (param0 + var10Lifetime1 < this.clipRight) {
                  if (param1 - var10Lifetime1 >= this.clipTop) {
                    if (param1 + var10Lifetime1 < this.clipBottom) {
                      this.pixels[var6Lifetime1 - var10Lifetime1] = param3;
                      this.pixels[var6Lifetime1 + var10Lifetime1] = param3;
                      this.pixels[var8Lifetime1] = param3;
                      this.pixels[var9Lifetime1] = param3;
                      while (true) {
                        incrementValue$4 = var11Lifetime1;
                        var11Lifetime1++;
                        var12Lifetime1 = var12Lifetime1 + (incrementValue$4 + var11Lifetime1);
                        var6Lifetime1 = var6Lifetime1 - this.width;
                        var7Lifetime1 = var7Lifetime1 + this.width;
                        if (var12Lifetime1 > param2) {
                          var10Lifetime1--;
                          var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                          var8Lifetime1 = var8Lifetime1 + this.width;
                          var9Lifetime1 = var9Lifetime1 - this.width;
                        }
                        if (var10Lifetime1 < var11Lifetime1) {
                          return;
                        }
                        this.pixels[var8Lifetime1 - var11Lifetime1] = param3;
                        this.pixels[var8Lifetime1 + var11Lifetime1] = param3;
                        this.pixels[var6Lifetime1 - var10Lifetime1] = param3;
                        this.pixels[var6Lifetime1 + var10Lifetime1] = param3;
                        this.pixels[var7Lifetime1 - var10Lifetime1] = param3;
                        this.pixels[var7Lifetime1 + var10Lifetime1] = param3;
                        this.pixels[var9Lifetime1 - var11Lifetime1] = param3;
                        this.pixels[var9Lifetime1 + var11Lifetime1] = param3;
                      }
                    }
                    if (param0 - var10Lifetime1 >= this.clipLeft &&
                      param1 >= this.clipTop &&
                      param1 < this.clipBottom) {
                      this.pixels[var6Lifetime1 - var10Lifetime1] = param3;
                    }
                  } else {
                    if (param0 - var10Lifetime1 >= this.clipLeft &&
                      param1 >= this.clipTop &&
                      param1 < this.clipBottom) {
                      this.pixels[var6Lifetime1 - var10Lifetime1] = param3;
                    }
                  }
                } else {
                  if (param0 - var10Lifetime1 >= this.clipLeft &&
                    param1 >= this.clipTop &&
                    param1 < this.clipBottom) {
                    this.pixels[var6Lifetime1 - var10Lifetime1] = param3;
                  }
                }
              } else {
                if (param0 - var10Lifetime1 >= this.clipLeft &&
                  param1 >= this.clipTop &&
                  param1 < this.clipBottom) {
                  this.pixels[var6Lifetime1 - var10Lifetime1] = param3;
                }
              }
              if (param0 + var10Lifetime1 < this.clipRight) {
                if (param1 >= this.clipTop) {
                  if (param1 < this.clipBottom) {
                    this.pixels[var6Lifetime1 + var10Lifetime1] = param3;
                    if (param1 - var10Lifetime1 >= this.clipTop &&
                      param0 >= this.clipLeft &&
                      param0 < this.clipRight) {
                      this.pixels[var8Lifetime1] = param3;
                    }
                  } else {
                    if (param1 - var10Lifetime1 >= this.clipTop &&
                      param0 >= this.clipLeft &&
                      param0 < this.clipRight) {
                      this.pixels[var8Lifetime1] = param3;
                    }
                  }
                } else {
                  if (param1 - var10Lifetime1 >= this.clipTop &&
                    param0 >= this.clipLeft &&
                    param0 < this.clipRight) {
                    this.pixels[var8Lifetime1] = param3;
                  }
                }
              } else {
                if (param1 - var10Lifetime1 >= this.clipTop &&
                  param0 >= this.clipLeft &&
                  param0 < this.clipRight) {
                  this.pixels[var8Lifetime1] = param3;
                }
              }
              if (param1 + var10Lifetime1 < this.clipBottom &&
                param0 >= this.clipLeft &&
                param0 < this.clipRight) {
                this.pixels[var9Lifetime1] = param3;
              }
              while (true) {
                incrementValue$5 = var11Lifetime1;
                var11Lifetime1++;
                var12Lifetime1 = var12Lifetime1 + (incrementValue$5 + var11Lifetime1);
                var6Lifetime1 = var6Lifetime1 - this.width;
                var7Lifetime1 = var7Lifetime1 + this.width;
                if (var12Lifetime1 > param2) {
                  var10Lifetime1--;
                  var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
                  var8Lifetime1 = var8Lifetime1 + this.width;
                  var9Lifetime1 = var9Lifetime1 - this.width;
                }
                if (var10Lifetime1 < var11Lifetime1) {
                  return;
                }
                if (param1 - var10Lifetime1 >= this.clipTop &&
                  param1 - var10Lifetime1 < this.clipBottom) {
                  if (param0 - var11Lifetime1 >= this.clipLeft) {
                    if (param0 - var11Lifetime1 < this.clipRight) {
                      this.pixels[var8Lifetime1 - var11Lifetime1] = param3;
                      if (param0 + var11Lifetime1 >= this.clipLeft &&
                        param0 + var11Lifetime1 < this.clipRight) {
                        this.pixels[var8Lifetime1 + var11Lifetime1] = param3;
                      }
                    } else {
                      if (param0 + var11Lifetime1 >= this.clipLeft &&
                        param0 + var11Lifetime1 < this.clipRight) {
                        this.pixels[var8Lifetime1 + var11Lifetime1] = param3;
                      }
                    }
                  } else {
                    if (param0 + var11Lifetime1 >= this.clipLeft &&
                      param0 + var11Lifetime1 < this.clipRight) {
                      this.pixels[var8Lifetime1 + var11Lifetime1] = param3;
                    }
                  }
                }
                if (param1 - var11Lifetime1 >= this.clipTop &&
                  param1 - var11Lifetime1 < this.clipBottom) {
                  if (param0 - var10Lifetime1 >= this.clipLeft &&
                    param0 - var10Lifetime1 < this.clipRight) {
                    this.pixels[var6Lifetime1 - var10Lifetime1] = param3;
                  }
                  if (param0 + var10Lifetime1 >= this.clipLeft &&
                    param0 + var10Lifetime1 < this.clipRight) {
                    this.pixels[var6Lifetime1 + var10Lifetime1] = param3;
                  }
                }
                if (param1 + var11Lifetime1 >= this.clipTop &&
                  param1 + var11Lifetime1 < this.clipBottom) {
                  if (param0 - var10Lifetime1 >= this.clipLeft &&
                    param0 - var10Lifetime1 < this.clipRight) {
                    this.pixels[var7Lifetime1 - var10Lifetime1] = param3;
                  }
                  if (param0 + var10Lifetime1 >= this.clipLeft &&
                    param0 + var10Lifetime1 < this.clipRight) {
                    this.pixels[var7Lifetime1 + var10Lifetime1] = param3;
                  }
                }
                if (param1 + var10Lifetime1 < this.clipTop) {
                  continue;
                }
                if (param1 + var10Lifetime1 >= this.clipBottom) {
                  continue;
                }
                if (param0 - var11Lifetime1 >= this.clipLeft &&
                  param0 - var11Lifetime1 < this.clipRight) {
                  this.pixels[var9Lifetime1 - var11Lifetime1] = param3;
                }
                if (param0 + var11Lifetime1 < this.clipLeft) {
                  continue;
                }
                if (param0 + var11Lifetime1 >= this.clipRight) {
                  continue;
                }
                this.pixels[var9Lifetime1 + var11Lifetime1] = param3;
              }
            }
            return;
          }
        }
    }

    final boolean hasVolatileBackbuffer() {
        return false;
    }

    private final void setDepthWriteEnabled(boolean param0) {
        SoftwareRenderContext var2 = this.getThreadContext((Runnable) ((Object) Thread.currentThread()));
        var2.depthWriteEnabled = param0 ? true : false;
    }

    final ToolkitSprite createSprite(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var10 = 0;
        int incrementValue$4 = 0;
        int var7;
        int var8;
        int var9;
        int var11;
        var7 = 0;
        var8 = param1;
        var9 = 0;
        scanLoop1: while (true) {
          if (var9 < param4) {
            for (var10 = 0; var10 < param3; var10++) {
              incrementValue$4 = var8;
              var8++;
              var11 = param0[incrementValue$4] >>> 24;
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
          return (ToolkitSprite) ((Object) new SoftwareRgbSprite(this, param0, param1, param2, param3, param4, param5));
        }
        return (ToolkitSprite) ((Object) new SoftwareArgbSprite(this, param0, param1, param2, param3, param4, param5));
    }

    final void fillRectangle(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        if (param0 < this.clipLeft) {
          param2 = param2 - (this.clipLeft - param0);
          param0 = this.clipLeft;
        }
        if (param1 < this.clipTop) {
          param3 = param3 - (this.clipTop - param1);
          param1 = this.clipTop;
        }
        if (param0 + param2 > this.clipRight) {
          param2 = this.clipRight - param0;
        }
        if (param1 + param3 > this.clipBottom) {
          param3 = this.clipBottom - param1;
        }
        if (param2 > 0) {
          if (param3 > 0 &&
            param0 <= this.clipRight &&
            param1 <= this.clipBottom) {
            var7 = this.width - param2;
            var8 = param0 + param1 * this.width;
            var9 = param4 >>> 24;
            if (param5 != 0 && (param5 != 1 ||
              var9 != 255)) {
              if (param5 == 1) {
                param4 = ((param4 & 16711935) * var9 >> 8 & 16711935) + (((param4 & -16711936) >>> 8) * var9 & -16711936);
                var10 = 256 - var9;
                for (var11 = 0; var11 < param3; var11++) {
                  for (var12 = -param2; var12 < 0; var12++) {
                    var13 = this.pixels[var8];
                    var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                    incrementValue$1 = var8;
                    var8++;
                    this.pixels[incrementValue$1] = param4 + var13;
                  }
                  var8 = var8 + var7;
                }
                return;
              }
              if (param5 != 2) {
                throw new IllegalArgumentException();
              }
              for (var10 = 0; var10 < param3; var10++) {
                for (var11 = -param2; var11 < 0; var11++) {
                  var12 = this.pixels[var8];
                  var13Lifetime1 = param4 + var12;
                  var14 = (param4 & 16711935) + (var12 & 16711935);
                  var12 = (var14 & 16777472) + (var13Lifetime1 - var14 & 65536);
                  incrementValue$0 = var8;
                  var8++;
                  this.pixels[incrementValue$0] = var13Lifetime1 - var12 | var12 - (var12 >>> 8);
                }
                var8 = var8 + var7;
              }
              return;
            }
            var10 = param2 >> 3;
            var11 = param2 & 7;
            param2 = var8 - 1;
            for (var12 = -param3; var12 < 0; var12++) {
              if (var10 > 0) {
                param0 = var10;
                do {
                  param2++;
                  this.pixels[param2] = param4;
                  param2++;
                  this.pixels[param2] = param4;
                  param2++;
                  this.pixels[param2] = param4;
                  param2++;
                  this.pixels[param2] = param4;
                  param2++;
                  this.pixels[param2] = param4;
                  param2++;
                  this.pixels[param2] = param4;
                  param2++;
                  this.pixels[param2] = param4;
                  param2++;
                  this.pixels[param2] = param4;
                  param0--;
                } while (param0 > 0);
              }
              if (var11 > 0) {
                param0 = var11;
                do {
                  param2++;
                  this.pixels[param2] = param4;
                  param0--;
                } while (param0 > 0);
              }
              param2 = param2 + var7;
            }
          } else {
            return;
          }
        }
    }

    final void setDirectionalLighting(int param0, float param1, float param2, float param3, float param4, float param5) {
        Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
    }

    final boolean isBloomSupported() {
        return false;
    }

    final boolean supportsResizableBackbuffer() {
        return true;
    }

    final void copyFrontToBackBuffer() {
    }

    final void restoreDefaultFramebuffer() {
        if (this.canvas != null) {
          this.pixels = this.field_D.pixels;
          this.width = this.field_D.width;
          this.height = this.field_D.height;
          this.depth = this.field_G;
          this.field_F = this.field_v;
          this.field_q = this.field_u;
        } else {
          this.width = 1;
          this.height = 1;
          this.pixels = null;
          this.field_F = 1;
          this.field_q = 1;
          this.depth = null;
        }
        this.framebuffer = null;
        this.refreshFramebufferState();
    }

    final void setAmbientLight(float param0) {
    }

    final boolean supportsEnvironmentMaps() {
        return false;
    }

    final void setBloomParameters(float param0, float param1, float param2) {
    }

    final SoftwareRenderContext getThreadContext(Runnable param0) {
        int var2 = 0;
        for (var2 = 0; var2 < this.threadContextCount; var2++) {
          if (this.threadContexts[var2].thread == param0) {
            return this.threadContexts[var2];
          }
        }
        return null;
    }

    final void bindFramebuffer(Framebuffer param0) {
        SoftwareFramebuffer var2 = (SoftwareFramebuffer) (param0);
        this.width = var2.width;
        this.height = var2.height;
        this.pixels = var2.pixels;
        this.framebuffer = var2;
        this.field_F = var2.width;
        this.field_q = var2.height;
        this.depth = var2.depth;
        this.refreshFramebufferState();
    }

    final void updateFrame(int param0) {
        ScrollingTexturePixels var4 = null;
        int var5 = 0;
        TextureMetadata var6 = null;
        int var2 = param0 - this.field_E;
        Object var3 = this.field_f.first((byte) 67);
        while (var3 != null) {
          var4 = (ScrollingTexturePixels) (var3);
          if (var4.field_h) {
            var4.animationElapsedMillis = var4.animationElapsedMillis + var2;
            var5 = var4.animationElapsedMillis / 20;
            if (var5 > 0) {
              var6 = this.field_a.getTextureMetadata(-20292, var4.textureId);
              var4.scroll(var6.field_p * var2 * 50 / 1000, var6.field_d * var2 * 50 / 1000);
              var4.animationElapsedMillis = var4.animationElapsedMillis - var5 * 20;
            }
            var4.field_h = false;
          }
          var3 = this.field_f.next(false);
        }
        this.field_E = param0;
        this.field_d.age(true, 5);
        this.field_f.age(true, 5);
    }

    private final void bindThreadContext(int param0) {
        this.threadContexts[param0].bindThread((Runnable) ((Object) Thread.currentThread()), 0);
    }

    final void drawVerticalLine(int param0, int param1, int param2, int param3, int param4) {
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
        if (param0 >= this.clipLeft) {
          if (param0 >= this.clipRight) {
            return;
          }
          if (param1 < this.clipTop) {
            param2 = param2 - (this.clipTop - param1);
            param1 = this.clipTop;
          }
          if (param1 + param2 > this.clipBottom) {
            param2 = this.clipBottom - param1;
          }
          var6 = param0 + param1 * this.width;
          var7 = param3 >>> 24;
          if (param4 != 0 && (param4 != 1 ||
            var7 != 255)) {
            if (param4 == 1) {
              param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
              var8 = 256 - var7;
              for (var9 = 0; var9 < param2; var9++) {
                var10 = var6 + var9 * this.width;
                var11 = this.pixels[var10];
                var11 = ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
                this.pixels[var10] = param3 + var11;
              }
              return;
            }
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            for (var8Lifetime2 = 0; var8Lifetime2 < param2; var8Lifetime2++) {
              var9Lifetime1 = var6 + var8Lifetime2 * this.width;
              var10Lifetime1 = this.pixels[var9Lifetime1];
              var11Lifetime1 = param3 + var10Lifetime1;
              var12 = (param3 & 16711935) + (var10Lifetime1 & 16711935);
              var10Lifetime1Lifetime1 = (var12 & 16777472) + (var11Lifetime1 - var12 & 65536);
              this.pixels[var9Lifetime1] = var11Lifetime1 - var10Lifetime1Lifetime1 | var10Lifetime1Lifetime1 - (var10Lifetime1Lifetime1 >>> 8);
            }
            return;
          }
          for (var8Lifetime1 = 0; var8Lifetime1 < param2; var8Lifetime1++) {
            this.pixels[var6 + var8Lifetime1 * this.width] = param3;
          }
        }
    }

    final ToolkitSprite createSprite(int param0, int param1, boolean param2) {
        if (param2) {
          return (ToolkitSprite) ((Object) new SoftwareArgbSprite(this, param0, param1));
        }
        return (ToolkitSprite) ((Object) new SoftwareRgbSprite(this, param0, param1));
    }

    private final void refreshFramebufferState() {
        int var1 = 0;
        for (var1 = 0; var1 < this.threadContextCount; var1++) {
          this.threadContexts[var1].resetRasterizer((byte) 3);
        }
        this.resetClip();
    }

    private final void registerCanvas(java.awt.Canvas param0, int param1, int param2) {
        RasterBuffer var4;
        var4 = (RasterBuffer) (this.field_t.get((long)param0.hashCode(), 119));
        if (var4 != null) {
          if (var4.width == param1 &&
            var4.height == param2) {
            return;
          }
          this.resizeCanvas(param0, param1, param2);
        } else {
          var4 = ResourceNode.createRasterBuffer(param1, true, param0, param2);
          this.field_t.put((long)param0.hashCode(), var4, (byte) -124);
        }
    }

    final boolean supportsOffscreenRendering() {
        return true;
    }

    final boolean supportsAntialiasing() {
        return false;
    }

    final boolean supportsUnderwaterEffects() {
        return true;
    }

    final int getNearPlane() {
        return this.nearPlane;
    }

    final boolean supportsMultipleThreads() {
        return true;
    }

    final void beginPostProcessing(int param0, int param1, int param2, int param3) {
    }

    final void drawThickLine(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        SoftwareTriangleRasterizer stackIn_25_0 = null;
        boolean stackIn_27_1 = false;
        SoftwareTriangleRasterizer stackIn_34_0 = null;
        boolean stackIn_36_1 = false;
        SoftwareRenderContext var8;
        SoftwareTriangleRasterizer var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        var8 = this.getThreadContext((Runnable) ((Object) Thread.currentThread()));
        var9 = var8.rasterizer;
        var10 = param2 - param0;
        var11 = param3 - param1;
        if (var10 < 0) {
          stackIn_3_0 = -var10;
        } else {
          stackIn_3_0 = var10;
        }
        var12 = stackIn_3_0;
        if (var11 < 0) {
          stackIn_6_0 = -var11;
        } else {
          stackIn_6_0 = var11;
        }
        var13 = stackIn_6_0;
        var14 = var12;
        if (var14 < var13) {
          var14 = var13;
        }
        if (var14 == 0) {
          return;
        }
        var15 = (var10 << 16) / var14;
        var16 = (var11 << 16) / var14;
        var10 = var10 + (var15 >> 16);
        var11 = var11 + (var16 >> 16);
        if (var16 > var15) {
          var16 = -var16;
        } else {
          var15 = -var15;
        }
        var17 = param5 * var16 >> 17;
        var18 = param5 * var16 + 1 >> 17;
        var19 = param5 * var15 >> 17;
        var20 = param5 * var15 + 1 >> 17;
        param0 = param0 - var9.getOriginX();
        param1 = param1 - var9.getOriginY();
        var21 = param0 + var17;
        var22 = param0 - var18;
        var23 = param0 + var10 - var18;
        var24 = param0 + var10 + var17;
        var25 = param1 + var19;
        var26 = param1 - var20;
        var27 = param1 + var11 - var20;
        var28 = param1 + var11 + var19;
        if (param6 != 0) {
          if (param6 != 1) {
            throw new IllegalArgumentException();
          }
          var9.transparency = 255 - (param4 >>> 24);
        } else {
          var9.transparency = 0;
        }
        this.setDepthWriteEnabled(false);
        stackIn_25_0 = var9;
        stackIn_27_1 = !(var21 >= 0) || !(var21 <= var9.clipWidth) || !(var22 >= 0) || !(var22 <= var9.clipWidth) || !(var23 >= 0) || !(var23 <= var9.clipWidth);
        stackIn_25_0.clipHorizontally = stackIn_27_1;
        var9.drawFlatTriangle((float)var25, (float)var26, (float)var27, (float)var21, (float)var22, (float)var23, 100.0f, 100.0f, 100.0f, param4);
        stackIn_34_0 = var9;
        stackIn_36_1 = !(var21 >= 0) || !(var21 <= var9.clipWidth) || !(var23 >= 0) || !(var23 <= var9.clipWidth) || !(var24 >= 0) || !(var24 <= var9.clipWidth);
        stackIn_34_0.clipHorizontally = stackIn_36_1;
        var9.drawFlatTriangle((float)var25, (float)var27, (float)var28, (float)var21, (float)var23, (float)var24, 100.0f, 100.0f, 100.0f, param4);
        this.setDepthWriteEnabled(true);
        return;
    }

    final ToolkitFont createFont(ToolkitFontMetrics param0, IndexedSpriteData[] param1, boolean param2) {
        int var7 = 0;
        int[] var4;
        int[] var5;
        int var6;
        var4 = new int[param1.length];
        var5 = new int[param1.length];
        var6 = 0;
        for (var7 = 0; var7 < param1.length; var7++) {
          var4[var7] = param1[var7].width;
          var5[var7] = param1[var7].height;
          if (param1[var7].alpha != null) {
            var6 = 1;
          }
        }
        if (!param2) {
          if (var6 == 0) {
            return (ToolkitFont) ((Object) new SoftwarePaletteFont(this, param0, param1, var4, var5));
          }
          throw new IllegalArgumentException("");
        }
        if (var6 == 0) {
          return (ToolkitFont) ((Object) new SoftwareMonoFont(this, param0, param1, var4, var5));
        }
        return (ToolkitFont) ((Object) new SoftwareAlphaFont(this, param0, param1, var4, var5));
    }

    final boolean enableBloom() {
        return false;
    }

    final Framebuffer createFramebuffer(ColorBuffer param0, DepthBuffer param1) {
        return (Framebuffer) ((Object) new SoftwareFramebuffer(this, (ToolkitSprite) (param0), (SoftwareDepthBuffer) (param1)));
    }

    private final void resizeCanvas(java.awt.Canvas param0, int param1, int param2) {
        RasterBuffer var7 = null;
        java.awt.Dimension var5 = null;
        float[] array$0 = null;
        RasterBuffer var6 = (RasterBuffer) (this.field_t.get((long)param0.hashCode(), 97));
        if (var6 != null) {
          var6.unlink(-3846);
          var7 = ResourceNode.createRasterBuffer(param1, true, param0, param2);
          this.field_t.put((long)param0.hashCode(), var7, (byte) -122);
          if (this.canvas == param0 &&
            this.framebuffer == null) {
            var5 = param0.getSize();
            this.field_z = var5.width;
            this.field_o = var5.height;
            this.field_D = var7;
            this.pixels = var7.pixels;
            this.width = var7.width;
            this.height = var7.height;
            if (this.width != this.field_F ||
              this.height != this.field_q) {
              this.field_F = this.width;
              this.field_v = this.width;
              this.field_q = this.height;
              this.field_u = this.height;
              array$0 = new float[this.field_F * this.field_q];
              this.depth = array$0;
              this.field_G = array$0;
            }
            this.refreshFramebufferState();
          }
          return;
        }
    }

    final void present(int param0, int param1) throws GraphicsPresentException {
        java.awt.Graphics var3 = null;
        if (this.canvas == null ||
          this.field_D == null) {
          throw new IllegalStateException(field_K);
        }
        try {
          var3 = this.canvas.getGraphics();
          this.field_D.drawRegion(var3, this.field_z, param1, 32255, param0, 0, 0, this.field_o);
        } catch (Exception exception) {
          this.canvas.repaint();
        }
    }

    private SoftwareToolkit(TextureProvider param0) {
        super(param0);
        SoftwareTransform3D discarded$0 = null;
        this.field_B = false;
        this.disposed = false;
        this.field_t = new NodeHashTable(4);
        this.projectionScaleX = 512;
        this.clipBottom = 0;
        this.projectionScaleY = 512;
        this.clipLeft = 0;
        this.clipTop = 0;
        this.clipRight = 0;
        this.farPlane = 3500;
        this.nearPlane = 50;
        this.field_d = new SoftLruCache(16);
        try {
          this.field_f = new SoftLruCache(256);
          discarded$0 = new SoftwareTransform3D();
          this.setThreadContextCount(1);
          this.bindThreadContext(0);
          PasswordValidator.acquireColorPalettes(true, (byte) 33, true);
          this.field_B = true;
          this.field_E = (int)MonotonicMillisClock.currentTimeMillis(false);
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          this.dispose((byte) 30);
          throw new RuntimeException("");
        }
    }

    final void clearDepth() {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$0 = 0;
        int var8 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.clipLeft == 0 &&
          this.clipRight == this.width &&
          this.clipTop == 0 &&
          this.clipBottom == this.height) {
          var1 = this.depth.length;
          var2 = var1 - (var1 & 7);
          var3 = 0;
          while (var3 < var2) {
            incrementValue$1 = var3;
            var3++;
            this.depth[incrementValue$1] = 2147483648.0f;
            incrementValue$2 = var3;
            var3++;
            this.depth[incrementValue$2] = 2147483648.0f;
            incrementValue$3 = var3;
            var3++;
            this.depth[incrementValue$3] = 2147483648.0f;
            incrementValue$4 = var3;
            var3++;
            this.depth[incrementValue$4] = 2147483648.0f;
            incrementValue$5 = var3;
            var3++;
            this.depth[incrementValue$5] = 2147483648.0f;
            incrementValue$6 = var3;
            var3++;
            this.depth[incrementValue$6] = 2147483648.0f;
            incrementValue$7 = var3;
            var3++;
            this.depth[incrementValue$7] = 2147483648.0f;
            incrementValue$8 = var3;
            var3++;
            this.depth[incrementValue$8] = 2147483648.0f;
          }
          while (var3 < var1) {
            incrementValue$0 = var3;
            var3++;
            this.depth[incrementValue$0] = 2147483648.0f;
          }
          return;
        }
        var1 = this.clipRight - this.clipLeft;
        var2 = this.clipBottom - this.clipTop;
        var3 = this.width - var1;
        var4 = this.clipLeft + this.clipTop * this.width;
        var5 = var1 >> 3;
        var6 = var1 & 7;
        var1 = var4 - 1;
        for (var8 = -var2; var8 < 0; var8++) {
          if (var5 > 0) {
            var7 = var5;
            do {
              var1++;
              this.depth[var1] = 2147483648.0f;
              var1++;
              this.depth[var1] = 2147483648.0f;
              var1++;
              this.depth[var1] = 2147483648.0f;
              var1++;
              this.depth[var1] = 2147483648.0f;
              var1++;
              this.depth[var1] = 2147483648.0f;
              var1++;
              this.depth[var1] = 2147483648.0f;
              var1++;
              this.depth[var1] = 2147483648.0f;
              var1++;
              this.depth[var1] = 2147483648.0f;
              var7--;
            } while (var7 > 0);
          }
          if (var6 > 0) {
            var7 = var6;
            do {
              var1++;
              this.depth[var1] = 2147483648.0f;
              var7--;
            } while (var7 > 0);
          }
          var1 = var1 + var3;
        }
    }

    final int[] getProjectionParameters() {
        return new int[]{this.projectionCenterX, this.projectionCenterY, this.projectionScaleX, this.projectionScaleY};
    }

    private final void setThreadContextCount(int param0) {
        int var2 = 0;
        this.threadContextCount = param0;
        this.threadContexts = new SoftwareRenderContext[this.threadContextCount];
        for (var2 = 0; var2 < this.threadContextCount; var2++) {
          this.threadContexts[var2] = new SoftwareRenderContext(this);
        }
    }

    final boolean supportsFarClipPlane() {
        return false;
    }

    final boolean isDisposed() {
        return this.disposed;
    }

    final void applyPostProcessing() {
    }

    final GraphicsHeap createHeap(int param0) {
        return null;
    }

    final void fillGradientTriangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        SoftwareTriangleRasterizer stackIn_7_0 = null;
        boolean stackIn_9_1 = false;
        SoftwareRenderContext var11;
        SoftwareTriangleRasterizer var12;
        int var13;
        var11 = this.getThreadContext((Runnable) ((Object) Thread.currentThread()));
        var12 = var11.rasterizer;
        var12.coarseShading = false;
        param0 = param0 - this.field_C;
        param2 = param2 - this.field_C;
        param4 = param4 - this.field_C;
        param1 = param1 - this.field_h;
        param3 = param3 - this.field_h;
        param5 = param5 - this.field_h;
        stackIn_7_0 = var12;
        stackIn_9_1 = !(param0 >= 0) || !(param0 <= var12.clipWidth) || !(param2 >= 0) || !(param2 <= var12.clipWidth) || !(param4 >= 0) || !(param4 <= var12.clipWidth);
        boolean decompiledFrameRemainder0 = true;
        stackIn_7_0.clipHorizontally = stackIn_9_1;
        var12.depthTestDisabled = true;
        var13 = param6 >>> 24;
        if (param9 != 0 && (param9 != 1 ||
          var13 != 255)) {
          if (param9 == 1) {
            var12.transparency = 255 - var13;
            var12.additiveBlending = false;
            var12.drawGouraudTriangle((float)param1, (float)param3, (float)param5, (float)param0, (float)param2, (float)param4, 0.0f, 0.0f, 0.0f, param6, param7, param8);
          } else {
            if (param9 != 2) {
              throw new IllegalArgumentException();
            }
            var12.transparency = 128;
            var12.additiveBlending = true;
            var12.drawGouraudTriangle((float)param1, (float)param3, (float)param5, (float)param0, (float)param2, (float)param4, 0.0f, 0.0f, 0.0f, param6, param7, param8);
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          var12.transparency = 0;
          var12.additiveBlending = false;
          var12.drawGouraudTriangle((float)param1, (float)param3, (float)param5, (float)param0, (float)param2, (float)param4, 0.0f, 0.0f, 0.0f, param6, param7, param8);
        }
        var12.coarseShading = true;
        var12.depthTestDisabled = false;
    }

    SoftwareToolkit(java.awt.Canvas param0, TextureProvider param1, int param2, int param3) {
        this(param1);
        try {
          this.registerCanvas(param0, param2, param3);
          this.setCanvas(param0);
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          this.dispose((byte) 30);
          throw new RuntimeException("");
        }
    }

    private final void setCanvas(java.awt.Canvas param0) {
        float[] array$1 = null;
        RasterBuffer var2;
        java.awt.Dimension var3;
        if (param0 == null) {
          this.canvas = null;
          this.field_D = null;
          if (this.framebuffer == null) {
            this.pixels = null;
            this.height = 1;
            this.width = 1;
            this.field_q = 1;
            this.field_F = 1;
            this.refreshFramebufferState();
          }
        } else {
          var2 = (RasterBuffer) (this.field_t.get((long)param0.hashCode(), 125));
          if (var2 != null) {
            this.canvas = param0;
            var3 = param0.getSize();
            this.field_z = var3.width;
            this.field_o = var3.height;
            this.field_D = var2;
            if (this.framebuffer == null) {
              this.pixels = var2.pixels;
              this.width = var2.width;
              this.height = var2.height;
              if (this.width != this.field_F ||
                this.height != this.field_q) {
                this.field_F = this.width;
                this.field_v = this.width;
                this.field_q = this.height;
                this.field_u = this.height;
                array$1 = new float[this.field_F * this.field_q];
                this.depth = array$1;
                this.field_G = array$1;
              }
              this.refreshFramebufferState();
            }
          }
        }
    }

    final boolean supportsShadows() {
        return false;
    }

    final void setClip(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
          param0 = 0;
        }
        if (param1 < 0) {
          param1 = 0;
        }
        if (param2 > this.width) {
          param2 = this.width;
        }
        if (param3 > this.height) {
          param3 = this.height;
        }
        this.clipLeft = param0;
        this.clipRight = param2;
        this.clipTop = param1;
        this.clipBottom = param3;
        this.refreshClipState();
    }

    final void fillCircle(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$10 = 0;
        int incrementValue$9 = 0;
        int incrementValue$11 = 0;
        int incrementValue$6 = 0;
        int incrementValue$8 = 0;
        int incrementValue$7 = 0;
        int incrementValue$16 = 0;
        int incrementValue$15 = 0;
        int incrementValue$17 = 0;
        int incrementValue$12 = 0;
        int incrementValue$14 = 0;
        int incrementValue$13 = 0;
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
        int var19;
        int var20;
        int var21;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var21Lifetime1;
        if (param2 < 0) {
          param2 = -param2;
        }
        var6 = param1 - param2;
        if (var6 < this.clipTop) {
          var6 = this.clipTop;
        }
        var7 = param1 + param2 + 1;
        if (var7 > this.clipBottom) {
          var7 = this.clipBottom;
        }
        var8 = var6;
        var9 = param2 * param2;
        var10 = 0;
        var11 = param1 - var8;
        var12 = var11 * var11;
        var13 = var12 - var11;
        if (param1 > var7) {
          param1 = var7;
        }
        var14 = param3 >>> 24;
        if (param4 != 0 && (param4 != 1 ||
          var14 != 255)) {
          if (param4 != 1) {
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            while (var8 < param1) {
              while (true) {
                if (var13 > var9 &&
                  var12 > var9) {
                  var15 = param0 - var10 + 1;
                  if (var15 < this.clipLeft) {
                    var15 = this.clipLeft;
                  }
                  var16 = param0 + var10;
                  if (var16 > this.clipRight) {
                    var16 = this.clipRight;
                  }
                  var17 = var15 + var8 * this.width;
                  for (var18 = var15; var18 < var16; var18++) {
                    var19 = this.pixels[var17];
                    var20 = param3 + var19;
                    var21 = (param3 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    incrementValue$4 = var17;
                    var17++;
                    this.pixels[incrementValue$4] = var20 - var19 | var19 - (var19 >>> 8);
                  }
                  var8++;
                  incrementValue$3 = var11;
                  var11--;
                  var12 = var12 - (incrementValue$3 + var11);
                  var13 = var13 - (var11 + var11);
                  break;
                }
                var12 = var12 + (var10 + var10);
                incrementValue$5 = var10;
                var10++;
                var13 = var13 + (incrementValue$5 + var10);
              }
            }
            var10 = param2;
            var11 = -var11;
            var13 = var11 * var11 + var9;
            var12 = var13 - var10;
            var13 = var13 - var11;
            while (var8 < var7) {
              while (var13 > var9) {
                if (var12 > var9) {
                  incrementValue$0 = var10;
                  var10--;
                  var13 = var13 - (incrementValue$0 + var10);
                  var12 = var12 - (var10 + var10);
                  continue;
                }
                break;
              }
              var15 = param0 - var10;
              if (var15 < this.clipLeft) {
                var15 = this.clipLeft;
              }
              var16 = param0 + var10;
              if (var16 > this.clipRight - 1) {
                var16 = this.clipRight - 1;
              }
              var17 = var15 + var8 * this.width;
              for (var18 = var15; var18 <= var16; var18++) {
                var19 = this.pixels[var17];
                var20 = param3 + var19;
                var21Lifetime1 = (param3 & 16711935) + (var19 & 16711935);
                var19 = (var21Lifetime1 & 16777472) + (var20 - var21Lifetime1 & 65536);
                incrementValue$2 = var17;
                var17++;
                this.pixels[incrementValue$2] = var20 - var19 | var19 - (var19 >>> 8);
              }
              var8++;
              var13 = var13 + (var11 + var11);
              incrementValue$1 = var11;
              var11++;
              var12 = var12 + (incrementValue$1 + var11);
            }
            return;
          } else {
            param3 = ((param3 & 16711935) * var14 >> 8 & 16711935) + ((param3 & 65280) * var14 >> 8 & 65280) + (var14 << 24);
            var15 = 256 - var14;
            while (var8 < param1) {
              while (true) {
                if (var13 > var9 &&
                  var12 > var9) {
                  var16 = param0 - var10 + 1;
                  if (var16 < this.clipLeft) {
                    var16 = this.clipLeft;
                  }
                  var17 = param0 + var10;
                  if (var17 > this.clipRight) {
                    var17 = this.clipRight;
                  }
                  var18 = var16 + var8 * this.width;
                  for (var19 = var16; var19 < var17; var19++) {
                    var20 = this.pixels[var18];
                    var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & 65280) * var15 >> 8 & 65280);
                    incrementValue$10 = var18;
                    var18++;
                    this.pixels[incrementValue$10] = param3 + var20;
                  }
                  var8++;
                  incrementValue$9 = var11;
                  var11--;
                  var12 = var12 - (incrementValue$9 + var11);
                  var13 = var13 - (var11 + var11);
                  break;
                }
                var12 = var12 + (var10 + var10);
                incrementValue$11 = var10;
                var10++;
                var13 = var13 + (incrementValue$11 + var10);
              }
            }
            var10 = param2;
            var11 = -var11;
            var13 = var11 * var11 + var9;
            var12 = var13 - var10;
            var13 = var13 - var11;
            while (var8 < var7) {
              while (var13 > var9) {
                if (var12 > var9) {
                  incrementValue$6 = var10;
                  var10--;
                  var13 = var13 - (incrementValue$6 + var10);
                  var12 = var12 - (var10 + var10);
                  continue;
                }
                break;
              }
              var16 = param0 - var10;
              if (var16 < this.clipLeft) {
                var16 = this.clipLeft;
              }
              var17 = param0 + var10;
              if (var17 > this.clipRight - 1) {
                var17 = this.clipRight - 1;
              }
              var18 = var16 + var8 * this.width;
              for (var19 = var16; var19 <= var17; var19++) {
                var20 = this.pixels[var18];
                var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & 65280) * var15 >> 8 & 65280);
                incrementValue$8 = var18;
                var18++;
                this.pixels[incrementValue$8] = param3 + var20;
              }
              var8++;
              var13 = var13 + (var11 + var11);
              incrementValue$7 = var11;
              var11++;
              var12 = var12 + (incrementValue$7 + var11);
            }
            return;
          }
        }
        while (var8 < param1) {
          while (true) {
            if (var13 > var9 &&
              var12 > var9) {
              var15Lifetime1 = param0 - var10 + 1;
              if (var15Lifetime1 < this.clipLeft) {
                var15Lifetime1 = this.clipLeft;
              }
              var16Lifetime1 = param0 + var10;
              if (var16Lifetime1 > this.clipRight) {
                var16Lifetime1 = this.clipRight;
              }
              var17Lifetime1 = var15Lifetime1 + var8 * this.width;
              for (var18Lifetime1 = var15Lifetime1; var18Lifetime1 < var16Lifetime1; var18Lifetime1++) {
                incrementValue$16 = var17Lifetime1;
                var17Lifetime1++;
                this.pixels[incrementValue$16] = param3;
              }
              var8++;
              incrementValue$15 = var11;
              var11--;
              var12 = var12 - (incrementValue$15 + var11);
              var13 = var13 - (var11 + var11);
              break;
            }
            var12 = var12 + (var10 + var10);
            incrementValue$17 = var10;
            var10++;
            var13 = var13 + (incrementValue$17 + var10);
          }
        }
        var10Lifetime1 = param2;
        var11Lifetime1 = var8 - param1;
        var13Lifetime1 = var11Lifetime1 * var11Lifetime1 + var9;
        var12Lifetime1 = var13Lifetime1 - var10Lifetime1;
        var13Lifetime1 = var13Lifetime1 - var11Lifetime1;
        while (var8 < var7) {
          while (var13Lifetime1 > var9) {
            if (var12Lifetime1 > var9) {
              incrementValue$12 = var10Lifetime1;
              var10Lifetime1--;
              var13Lifetime1 = var13Lifetime1 - (incrementValue$12 + var10Lifetime1);
              var12Lifetime1 = var12Lifetime1 - (var10Lifetime1 + var10Lifetime1);
              continue;
            }
            break;
          }
          var15Lifetime2 = param0 - var10Lifetime1;
          if (var15Lifetime2 < this.clipLeft) {
            var15Lifetime2 = this.clipLeft;
          }
          var16Lifetime2 = param0 + var10Lifetime1;
          if (var16Lifetime2 > this.clipRight - 1) {
            var16Lifetime2 = this.clipRight - 1;
          }
          var17Lifetime2 = var15Lifetime2 + var8 * this.width;
          for (var18Lifetime2 = var15Lifetime2; var18Lifetime2 <= var16Lifetime2; var18Lifetime2++) {
            incrementValue$14 = var17Lifetime2;
            var17Lifetime2++;
            this.pixels[incrementValue$14] = param3;
          }
          var8++;
          var13Lifetime1 = var13Lifetime1 + (var11Lifetime1 + var11Lifetime1);
          incrementValue$13 = var11Lifetime1;
          var11Lifetime1++;
          var12Lifetime1 = var12Lifetime1 + (incrementValue$13 + var11Lifetime1);
        }
        return;
    }

    final boolean isBloomEnabled() {
        return false;
    }

    final int getFarPlane() {
        return this.farPlane;
    }

    final void releaseResources() {
        if (this.field_B) {
          SetDebrisFoundInPairs.releaseColorPalettes((byte) -101, false, true);
          this.field_B = false;
        }
        this.field_D = null;
        this.canvas = null;
        this.field_z = 0;
        this.field_o = 0;
        this.field_t = null;
        this.disposed = true;
    }

    final void setViewTransform(Transform3D param0) {
    }

    final ToolkitSprite createSprite(IndexedSpriteData param0, boolean param1) {
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
        var20 = param0.palette;
        var16 = var20;
        var3 = var16;
        var4 = param0.pixels;
        var5 = param0.width;
        var6 = param0.height;
        if (param1 &&
          param0.alpha == null) {
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
          var9 = param0.alpha;
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
        ((ToolkitSprite) (var7)).setPadding(param0.leftPadding, param0.topPadding, param0.rightPadding, param0.bottomPadding);
        return (ToolkitSprite) (var7);
    }

    final boolean supportsMemoryPools() {
        return false;
    }

    final void writePixels(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        param6 = param6 - param2;
        for (var8 = 0; var8 < param3; var8++) {
          var9 = (param1 + var8) * this.width + param0;
          for (var10 = 0; var10 < param2; var10++) {
            incrementValue$0 = param5;
            param5++;
            this.pixels[var9 + var10] = param4[incrementValue$0];
          }
          param5 = param5 + param6;
        }
    }

    final void drawLine(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 == 0) {
          if (param2 < 0) {
            this.drawHorizontalLine(param0 + param2, param1, -param2 + 1, param4, param5);
          } else {
            this.drawHorizontalLine(param0, param1, param2 + 1, param4, param5);
          }
          return;
        }
        if (param2 == 0) {
          if (param3 < 0) {
            this.drawVerticalLine(param0, param1 + param3, -param3 + 1, param4, param5);
          } else {
            this.drawVerticalLine(param0, param1, param3 + 1, param4, param5);
          }
          return;
        }
        if (param2 + param3 < 0) {
          param0 = param0 + param2;
          param2 = -param2;
          param1 = param1 + param3;
          param3 = -param3;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param2 <= param3) {
          param0 = param0 << 16;
          param0 = param0 + 32768;
          param2 = param2 << 16;
          var7 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
          param3 = param3 + param1;
          if (param1 < this.clipTop) {
            param0 = param0 + var7 * (this.clipTop - param1);
            param1 = this.clipTop;
          }
          if (param3 >= this.clipBottom) {
            param3 = this.clipBottom - 1;
          }
          var8 = param4 >>> 24;
          if (param5 != 0 && (param5 != 1 ||
            var8 != 255)) {
            if (param5 == 1) {
              param4 = ((param4 & 16711935) * var8 >> 8 & 16711935) + ((param4 & 65280) * var8 >> 8 & 65280) + (var8 << 24);
              var9 = 256 - var8;
              while (param1 <= param3) {
                var10 = param0 >> 16;
                if (var10 >= this.clipLeft &&
                  var10 < this.clipRight) {
                  var11 = var10 + param1 * this.width;
                  var12 = this.pixels[var11];
                  var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                  this.pixels[var10 + param1 * this.width] = param4 + var12;
                }
                param0 = param0 + var7;
                param1++;
              }
            } else {
              if (param5 != 2) {
                throw new IllegalArgumentException();
              }
              while (param1 <= param3) {
                var9Lifetime4 = param0 >> 16;
                if (var9Lifetime4 >= this.clipLeft &&
                  var9Lifetime4 < this.clipRight) {
                  var10Lifetime2 = var9Lifetime4 + param1 * this.width;
                  var11Lifetime2 = this.pixels[var10Lifetime2];
                  var12Lifetime2 = param4 + var11Lifetime2;
                  var13 = (param4 & 16711935) + (var11Lifetime2 & 16711935);
                  var11Lifetime2Lifetime1 = (var13 & 16777472) + (var12Lifetime2 - var13 & 65536);
                  this.pixels[var10Lifetime2] = var12Lifetime2 - var11Lifetime2Lifetime1 | var11Lifetime2Lifetime1 - (var11Lifetime2Lifetime1 >>> 8);
                }
                param0 = param0 + var7;
                param1++;
              }
            }
          } else {
            while (param1 <= param3) {
              var9Lifetime3 = param0 >> 16;
              if (var9Lifetime3 >= this.clipLeft &&
                var9Lifetime3 < this.clipRight) {
                this.pixels[var9Lifetime3 + param1 * this.width] = param4;
              }
              param0 = param0 + var7;
              param1++;
            }
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          param1 = param1 << 16;
          param1 = param1 + 32768;
          param3 = param3 << 16;
          var7Lifetime1 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
          param2 = param2 + param0;
          if (param0 < this.clipLeft) {
            param1 = param1 + var7Lifetime1 * (this.clipLeft - param0);
            param0 = this.clipLeft;
          }
          if (param2 >= this.clipRight) {
            param2 = this.clipRight - 1;
          }
          var8Lifetime1 = param4 >>> 24;
          if (param5 != 0 && (param5 != 1 ||
            var8Lifetime1 != 255)) {
            if (param5 == 1) {
              param4 = ((param4 & 16711935) * var8Lifetime1 >> 8 & 16711935) + ((param4 & 65280) * var8Lifetime1 >> 8 & 65280) + (var8Lifetime1 << 24);
              var9Lifetime1 = 256 - var8Lifetime1;
              while (param0 <= param2) {
                var10Lifetime1 = param1 >> 16;
                if (var10Lifetime1 >= this.clipTop &&
                  var10Lifetime1 < this.clipBottom) {
                  var11Lifetime1 = param0 + var10Lifetime1 * this.width;
                  var12Lifetime1 = this.pixels[var11Lifetime1];
                  var12Lifetime1 = ((var12Lifetime1 & 16711935) * var9Lifetime1 >> 8 & 16711935) + ((var12Lifetime1 & 65280) * var9Lifetime1 >> 8 & 65280);
                  this.pixels[var11Lifetime1] = param4 + var12Lifetime1;
                }
                param1 = param1 + var7Lifetime1;
                param0++;
              }
            } else {
              if (param5 != 2) {
                throw new IllegalArgumentException();
              }
              while (param0 <= param2) {
                var9Lifetime1 = param1 >> 16;
                if (var9Lifetime1 >= this.clipTop &&
                  var9Lifetime1 < this.clipBottom) {
                  var10Lifetime1 = param0 + var9Lifetime1 * this.width;
                  var11Lifetime1 = this.pixels[var10Lifetime1];
                  var12Lifetime1 = param4 + var11Lifetime1;
                  var13Lifetime1 = (param4 & 16711935) + (var11Lifetime1 & 16711935);
                  var11Lifetime1 = (var13Lifetime1 & 16777472) + (var12Lifetime1 - var13Lifetime1 & 65536);
                  this.pixels[var10Lifetime1] = var12Lifetime1 - var11Lifetime1 | var11Lifetime1 - (var11Lifetime1 >>> 8);
                }
                param1 = param1 + var7Lifetime1;
                param0++;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            while (param0 <= param2) {
              var9Lifetime2 = param1 >> 16;
              if (var9Lifetime2 >= this.clipTop &&
                var9Lifetime2 < this.clipBottom) {
                this.pixels[param0 + var9Lifetime2 * this.width] = param4;
              }
              param1 = param1 + var7Lifetime1;
              param0++;
            }
          }
        }

    }

    final void setHeap(GraphicsHeap param0) {
    }

    final void intersectClip(int param0, int param1, int param2, int param3) {
        if (this.clipLeft < param0) {
          this.clipLeft = param0;
        }
        if (this.clipTop < param1) {
          this.clipTop = param1;
        }
        if (this.clipRight > param2) {
          this.clipRight = param2;
        }
        if (this.clipBottom > param3) {
          this.clipBottom = param3;
        }
        this.refreshClipState();
    }

    final Model3D createModel(ModelData param0, int param1, int param2, int param3, int param4) {
        return (Model3D) ((Object) new SoftwareModel(this, param0, param1, param3, param4, param2));
    }

    final int getMaxPointLights() {
        return 0;
    }

    final DepthBuffer createDepthBuffer(int param0, int param1) {
        return (DepthBuffer) ((Object) new SoftwareDepthBuffer(param0, param1));
    }

    private final void refreshClipState() {
        SoftwareTriangleRasterizer var2_ref_daa = null;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        int var1Lifetime1;
        this.field_C = this.clipLeft - this.projectionCenterX;
        this.field_h = this.clipTop - this.projectionCenterY;
        for (var1 = 0; var1 < this.threadContextCount; var1++) {
          var2_ref_daa = this.threadContexts[var1].rasterizer;
          var2_ref_daa.clipWidth = this.clipRight - this.clipLeft;
          var2_ref_daa.clipHeight = this.clipBottom - this.clipTop;
        }
        var1Lifetime1 = this.clipTop * this.width + this.clipLeft;
        for (var2 = this.clipTop; var2 < this.clipBottom; var2++) {
          for (var3 = 0; var3 < this.threadContextCount; var3++) {
            this.threadContexts[var3].rasterizer.rowOffsets[var2 - this.clipTop] = var1Lifetime1;
          }
          var1Lifetime1 = var1Lifetime1 + this.width;
        }
    }

    final int[] readPixels(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        int[] var5 = new int[param2 * param3];
        int var6 = 0;
        for (var7 = 0; var7 < param3; var7++) {
          var8 = (param1 + var7) * this.width + param0;
          for (var9 = 0; var9 < param2; var9++) {
            incrementValue$0 = var6;
            var6++;
            var5[incrementValue$0] = this.pixels[var8 + var9];
          }
        }
        return var5;
    }

    final void setProjectionParameters(int param0, int param1, int param2, int param3) {
        this.projectionCenterX = param0;
        this.projectionCenterY = param1;
        this.projectionScaleX = param2;
        this.projectionScaleY = param3;
        this.refreshClipState();
    }

    final void drawHorizontalLine(int param0, int param1, int param2, int param3, int param4) {
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
        if (param1 >= this.clipTop) {
          if (param1 >= this.clipBottom) {
            return;
          }
          if (param0 < this.clipLeft) {
            param2 = param2 - (this.clipLeft - param0);
            param0 = this.clipLeft;
          }
          if (param0 + param2 > this.clipRight) {
            param2 = this.clipRight - param0;
          }
          var6 = param0 + param1 * this.width;
          var7 = param3 >>> 24;
          if (param4 != 0 && (param4 != 1 ||
            var7 != 255)) {
            if (param4 == 1) {
              param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
              var8 = 256 - var7;
              for (var9 = 0; var9 < param2; var9++) {
                var10 = this.pixels[var6 + var9];
                var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                this.pixels[var6 + var9] = param3 + var10;
              }
              return;
            }
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            for (var8Lifetime2 = 0; var8Lifetime2 < param2; var8Lifetime2++) {
              var9Lifetime1 = this.pixels[var6 + var8Lifetime2];
              var10Lifetime1 = param3 + var9Lifetime1;
              var11 = (param3 & 16711935) + (var9Lifetime1 & 16711935);
              var9Lifetime1Lifetime1 = (var11 & 16777472) + (var10Lifetime1 - var11 & 65536);
              this.pixels[var6 + var8Lifetime2] = var10Lifetime1 - var9Lifetime1Lifetime1 | var9Lifetime1Lifetime1 - (var9Lifetime1Lifetime1 >>> 8);
            }
            return;
          }
          for (var8Lifetime1 = 0; var8Lifetime1 < param2; var8Lifetime1++) {
            this.pixels[var6 + var8Lifetime1] = param3;
          }
        }
    }

    final void setDepthRange(int param0, int param1) {
        this.getThreadContext((Runnable) ((Object) Thread.currentThread()));
        this.nearPlane = param0;
        this.farPlane = param1;
    }

    final boolean supportsFastTexturedParticles() {
        return false;
    }

    private final void resetClip() {
        this.clipLeft = 0;
        this.clipTop = 0;
        this.clipRight = this.width;
        this.clipBottom = this.height;
        this.refreshClipState();
    }

    final void drawRectangle(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.drawHorizontalLine(param0, param1, param2, param4, param5);
        this.drawHorizontalLine(param0, param1 + param3 - 1, param2, param4, param5);
        this.drawVerticalLine(param0, param1 + 1, param3 - 2, param4, param5);
        this.drawVerticalLine(param0 + param2 - 1, param1 + 1, param3 - 2, param4, param5);
    }

    final void getClip(int[] param0) {
        param0[0] = this.clipLeft;
        param0[1] = this.clipTop;
        param0[2] = this.clipRight;
        param0[3] = this.clipBottom;
    }

    static {
        field_K = "off";
    }
}
