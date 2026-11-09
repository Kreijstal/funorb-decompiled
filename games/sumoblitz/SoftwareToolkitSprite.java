/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SoftwareToolkitSprite extends ToolkitSprite {
    static int field_d;
    static int field_f;
    static int field_g;
    static int field_p;
    private static int field_C;
    static int field_v;
    int height;
    int insetLeft;
    static int field_c;
    private static int field_l;
    static int field_D;
    int insetBottom;
    private static int field_x;
    static int field_n;
    private static int field_o;
    static int field_s;
    static int field_i;
    static int field_j;
    static int field_w;
    int width;
    static int field_h;
    int insetTop;
    int insetRight;
    SoftwareGraphicsToolkit toolkit;
    static int field_r;
    static int field_b;
    static int field_e;
    static int field_u;
    static int field_a;
    static int field_m;

    abstract void drawScaled(int x, int y, int width, int height, int colorMode, int color, int blendMode, int flags);

    final int width() {
        return this.width;
    }

    final void drawAffine(float x0, float y0, float x1, float y1, float x2, float y2, int colorMode, int color, int blendMode, int flags) {
        int var11;
        int var12;
        if (this.toolkit.isDisposed()) {
          throw new IllegalStateException();
        }
        if (!this.prepareAffine(x0, y0, x1, y1, x2, y2)) {
          return;
        }
        field_u = color;
        if (colorMode == 1) {
          if (colorMode == 1) {
            if (blendMode == 0) {
              this.blitAffine(1, 0);
              return;
            }
            if (blendMode == 1) {
              this.blitAffine(1, 1);
              return;
            }
            if (blendMode != 2) {
              return;
            }
            this.blitAffine(1, 2);
            return;
          }
          if (colorMode == 0) {
            if (blendMode == 0) {
              this.blitAffine(0, 0);
              return;
            }
            if (blendMode == 1) {
              this.blitAffine(0, 1);
              return;
            }
            if (blendMode != 2) {
              return;
            }
            this.blitAffine(0, 2);
            return;
          }
          if (colorMode == 3) {
            if (blendMode == 0) {
              this.blitAffine(3, 0);
              return;
            }
            if (blendMode == 1) {
              this.blitAffine(3, 1);
              return;
            }
            if (blendMode != 2) {
              return;
            }
            this.blitAffine(3, 2);
            return;
          }
          if (colorMode != 2) {
            return;
          }
          if (blendMode == 0) {
            this.blitAffine(2, 0);
            return;
          }
          if (blendMode == 1) {
            this.blitAffine(2, 1);
            return;
          }
          if (blendMode != 2) {
            return;
          }
          this.blitAffine(2, 2);
          return;
        }
        field_f = color >>> 24;
        field_c = 256 - field_f;
        if (colorMode == 0) {
          field_j = (color & 16711680) >> 16;
          field_v = (color & 65280) >> 8;
          field_i = color & 255;
          if (colorMode == 1) {
            if (blendMode == 0) {
              this.blitAffine(1, 0);
              return;
            }
            if (blendMode == 1) {
              this.blitAffine(1, 1);
              return;
            }
            if (blendMode != 2) {
              return;
            }
            this.blitAffine(1, 2);
            return;
          }
          if (colorMode == 0) {
            if (blendMode == 0) {
              this.blitAffine(0, 0);
              return;
            }
            if (blendMode == 1) {
              this.blitAffine(0, 1);
              return;
            }
            if (blendMode != 2) {
              return;
            }
            this.blitAffine(0, 2);
            return;
          }
          if (colorMode == 3) {
            if (blendMode == 0) {
              this.blitAffine(3, 0);
              return;
            }
            if (blendMode == 1) {
              this.blitAffine(3, 1);
              return;
            }
            if (blendMode != 2) {
              return;
            }
            this.blitAffine(3, 2);
            return;
          }
          if (colorMode != 2) {
            return;
          }
          if (blendMode == 0) {
            this.blitAffine(2, 0);
            return;
          }
          if (blendMode == 1) {
            this.blitAffine(2, 1);
            return;
          }
          if (blendMode != 2) {
            return;
          }
          this.blitAffine(2, 2);
          return;
        }
        if (colorMode == 2) {
          field_o = color >>> 24;
          field_x = 256 - field_o;
          var11 = (color & 16711935) * field_x & -16711936;
          var12 = (color & 65280) * field_x & 16711680;
          field_D = (var11 | var12) >>> 8;
        }
        if (colorMode == 1) {
          if (blendMode == 0) {
            this.blitAffine(1, 0);
            return;
          }
          if (blendMode == 1) {
            this.blitAffine(1, 1);
            return;
          }
          if (blendMode != 2) {
            return;
          }
          this.blitAffine(1, 2);
          return;
        }
        if (colorMode != 0) {
          if (colorMode != 3) {
            if (colorMode == 2) {
              if (blendMode == 0) {
                this.blitAffine(2, 0);
                return;
              }
              if (blendMode == 1) {
                this.blitAffine(2, 1);
                return;
              }
              if (blendMode == 2) {
                this.blitAffine(2, 2);
                return;
              }
            }
          } else {
            if (blendMode == 0) {
              this.blitAffine(3, 0);
              return;
            }
            if (blendMode == 1) {
              this.blitAffine(3, 1);
              return;
            }
            if (blendMode == 2) {
              this.blitAffine(3, 2);
              return;
            }
          }
        } else {
          if (blendMode == 0) {
            this.blitAffine(0, 0);
            return;
          }
          if (blendMode == 1) {
            this.blitAffine(0, 1);
            return;
          }
          if (blendMode == 2) {
            this.blitAffine(0, 2);
            return;
          }
        }
    }

    final int paddedHeight() {
        return this.insetTop + this.height + this.insetBottom;
    }

    final int paddedWidth() {
        return this.insetLeft + this.width + this.insetRight;
    }

    abstract void blitAffine(int colorMode, int blendMode);

    private final boolean prepareAffine(float x0, float y0, float x1, float y1, float x2, float y2) {
        int var7;
        int var8;
        float var9;
        float var10;
        float var11;
        float var12;
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var9Lifetime1;
        float var10Lifetime1;
        float var11Lifetime1;
        float var12Lifetime1;
        float var13Lifetime1;
        float var14Lifetime1;
        float var15Lifetime1;
        float var16Lifetime1;
        var7 = this.insetLeft + this.width + this.insetRight;
        var8 = this.insetTop + this.height + this.insetBottom;
        if (var7 != this.width) {
          var9 = (x1 - x0) / (float)var7;
          var10 = (y1 - y0) / (float)var7;
          var11 = (x2 - x0) / (float)var8;
          var12 = (y2 - y0) / (float)var8;
          var13 = var11 * (float)this.insetTop;
          var14 = var12 * (float)this.insetTop;
          var15 = var9 * (float)this.insetLeft;
          var16 = var10 * (float)this.insetLeft;
          var17 = -var9 * (float)this.insetRight;
          var18 = -var10 * (float)this.insetRight;
          var19 = -var11 * (float)this.insetBottom;
          var20 = -var12 * (float)this.insetBottom;
          x0 = x0 + (var15 + var13);
          y0 = y0 + (var16 + var14);
          x1 = x1 + (var17 + var13);
          y1 = y1 + (var18 + var14);
          x2 = x2 + (var15 + var19);
          y2 = y2 + (var16 + var20);
        } else {
          if (var8 != this.height) {
            var9 = (x1 - x0) / (float)var7;
            var10 = (y1 - y0) / (float)var7;
            var11 = (x2 - x0) / (float)var8;
            var12 = (y2 - y0) / (float)var8;
            var13 = var11 * (float)this.insetTop;
            var14 = var12 * (float)this.insetTop;
            var15 = var9 * (float)this.insetLeft;
            var16 = var10 * (float)this.insetLeft;
            var17 = -var9 * (float)this.insetRight;
            var18 = -var10 * (float)this.insetRight;
            var19 = -var11 * (float)this.insetBottom;
            var20 = -var12 * (float)this.insetBottom;
            x0 = x0 + (var15 + var13);
            y0 = y0 + (var16 + var14);
            x1 = x1 + (var17 + var13);
            y1 = y1 + (var18 + var14);
            x2 = x2 + (var15 + var19);
            y2 = y2 + (var16 + var20);
          }
        }
        var9Lifetime1 = x2 + (x1 - x0);
        var10Lifetime1 = y1 + (y2 - y0);
        if (!(x0 < x1)) {
          var11Lifetime1 = x1;
          var12Lifetime1 = x0;
        } else {
          var11Lifetime1 = x0;
          var12Lifetime1 = x1;
        }
        if (x2 < var11Lifetime1) {
          var11Lifetime1 = x2;
        }
        if (var9Lifetime1 < var11Lifetime1) {
          var11Lifetime1 = var9Lifetime1;
        }
        if (x2 > var12Lifetime1) {
          var12Lifetime1 = x2;
        }
        if (var9Lifetime1 > var12Lifetime1) {
          var12Lifetime1 = var9Lifetime1;
        }
        if (!(y0 < y1)) {
          var13Lifetime1 = y1;
          var14Lifetime1 = y0;
        } else {
          var13Lifetime1 = y0;
          var14Lifetime1 = y1;
        }
        if (y2 < var13Lifetime1) {
          var13Lifetime1 = y2;
        }
        if (var10Lifetime1 < var13Lifetime1) {
          var13Lifetime1 = var10Lifetime1;
        }
        if (y2 > var14Lifetime1) {
          var14Lifetime1 = y2;
        }
        if (var10Lifetime1 > var14Lifetime1) {
          var14Lifetime1 = var10Lifetime1;
        }
        if (var11Lifetime1 < (float)this.toolkit.clipLeft) {
          var11Lifetime1 = (float)this.toolkit.clipLeft;
        }
        if (var12Lifetime1 > (float)this.toolkit.clipRight) {
          var12Lifetime1 = (float)this.toolkit.clipRight;
        }
        if (var13Lifetime1 < (float)this.toolkit.clipTop) {
          var13Lifetime1 = (float)this.toolkit.clipTop;
        }
        if (var14Lifetime1 > (float)this.toolkit.clipBottom) {
          var14Lifetime1 = (float)this.toolkit.clipBottom;
        }
        var12Lifetime1 = var11Lifetime1 - var12Lifetime1;
        if (var12Lifetime1 >= 0.0f) {
          return false;
        }
        var14Lifetime1 = var13Lifetime1 - var14Lifetime1;
        if (var14Lifetime1 >= 0.0f) {
          return false;
        }
        field_r = this.toolkit.targetWidth;
        field_e = (int)((float)((int)var13Lifetime1 * field_r) + var11Lifetime1);
        var15Lifetime1 = (x1 - x0) * (y2 - y0) - (y1 - y0) * (x2 - x0);
        var16Lifetime1 = (x2 - x0) * (y1 - y0) - (y2 - y0) * (x1 - x0);
        field_w = (int)((y2 - y0) * 4096.0f * (float)this.width / var15Lifetime1);
        field_d = (int)((y1 - y0) * 4096.0f * (float)this.height / var16Lifetime1);
        field_p = (int)((x2 - x0) * 4096.0f * (float)this.width / var16Lifetime1);
        field_b = (int)((x1 - x0) * 4096.0f * (float)this.height / var15Lifetime1);
        field_l = (int)(var11Lifetime1 * 16.0f + 8.0f - (x0 + x1 + x2 + var9Lifetime1) / 4.0f * 16.0f);
        field_C = (int)(var13Lifetime1 * 16.0f + 8.0f - (y0 + y1 + y2 + var10Lifetime1) / 4.0f * 16.0f);
        field_s = (this.width >> 1 << 12) + (field_C * field_p >> 4);
        field_m = (this.height >> 1 << 12) + (field_C * field_b >> 4);
        field_g = field_l * field_w >> 4;
        field_a = field_l * field_d >> 4;
        field_h = (int)var12Lifetime1;
        field_n = (int)var14Lifetime1;
        return true;
    }

    final void setInsets(int left, int top, int right, int bottom) {
        this.insetLeft = left;
        this.insetTop = top;
        this.insetRight = right;
        this.insetBottom = bottom;
    }

    SoftwareToolkitSprite(SoftwareGraphicsToolkit owner, int pixelWidth, int pixelHeight) {
        this.toolkit = owner;
        this.width = pixelWidth;
        this.height = pixelHeight;
    }

    abstract void draw(int x, int y, int colorMode, int color, int blendMode);

    final int height() {
        return this.height;
    }

    static {
        field_f = 0;
        field_x = 0;
        field_v = 0;
        field_c = 0;
        field_j = 0;
        field_i = 0;
        field_o = 0;
        field_D = 0;
    }
}
