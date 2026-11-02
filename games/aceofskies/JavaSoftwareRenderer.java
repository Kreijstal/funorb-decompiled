/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaSoftwareRenderer extends GraphicsRenderer {
    private boolean field_y;
    private IntrusiveNodeHashTable field_g;
    private int field_q;
    private int field_B;
    private int field_n;
    private CanvasImageBuffer field_p;
    private java.awt.Canvas field_l;
    private boolean field_h;
    private int field_t;
    private WeightedObjectCache field_u;
    private int field_m;
    private WeightedObjectCache field_F;
    private int field_d;
    int field_w;
    int field_z;
    private int field_j;
    private it[] field_e;
    int field_f;
    private int field_v;
    int field_k;
    int field_D;
    private int field_i;
    private int field_A;
    private int field_G;
    private int field_o;
    int[] field_E;
    private int field_r;
    private lb field_C;
    private int field_x;
    private int field_s;
    private static String field_H;

    private final it a(Runnable param0) {
        for (int var2 = 0; var2 < this.field_A; var2++) {
          if (this.field_e[var2].field_a == param0) {
            return this.field_e[var2];
          }
        }
        return null;
    }

    final int i() {
        return this.field_d;
    }

    final void e() {
    }

    private final void b(java.awt.Canvas param0, int param1, int param2) {
        CanvasImageBuffer var4 = (CanvasImageBuffer) (this.field_g.findByKey((byte) 106, (long)param0.hashCode()));
        if (var4 != null) {
          if (var4.field_g == param1 &&
            var4.field_h == param2) {
            return;
          }
          this.a(param0, param1, param2);
        } else {
          var4 = oi.a(param0, -30, param1, param2);
          this.field_g.put(123, (long)param0.hashCode(), var4);
        }
    }

    final void copyPixels(int x, int y, int width, int height, int[] pixels, int offset, int stride) {
        stride = stride - width;
        for (int var8 = 0; var8 < height; var8++) {
          int var9 = (y + var8) * this.field_f + x;
          for (int var10 = 0; var10 < width; var10++) {
            int incrementValue$0 = offset;
            offset++;
            this.field_E[var9 + var10] = pixels[incrementValue$0];
          }
          offset = offset + stride;
        }
    }

    final int[] Y() {
        return new int[]{this.field_G, this.field_i, this.field_r, this.field_j};
    }

    private final void f() {
        for (int var1 = 0; var1 < this.field_A; var1++) {
        }
        int var1Lifetime1 = this.field_w * this.field_f + this.field_z;
        for (int var2 = this.field_w; var2 < this.field_D; var2++) {
          for (int var3 = 0; var3 < this.field_A; var3++) {
            this.field_e[var3].field_d.field_a[var2 - this.field_w] = var1Lifetime1;
          }
          var1Lifetime1 = var1Lifetime1 + this.field_f;
        }
    }

    final void b(int param0) {
        int var2 = param0 - this.field_B;
        Object var3 = this.field_F.a((byte) -16);
        while (var3 != null) {
          ui var4 = (ui) (var3);
          if (var4.field_e) {
            var4.field_i = var4.field_i + var2;
            int var5 = var4.field_i / 20;
            if (var5 > 0) {
              uh var6 = this.field_a.a(false, var4.field_h);
              var4.a(var6.field_n * var2 * 50 / 1000, var6.field_j * var2 * 50 / 1000);
              var4.field_i = var4.field_i - var5 * 20;
            }
            var4.field_e = false;
          }
          var3 = this.field_F.b(6408);
        }
        this.field_B = param0;
        this.field_u.a((byte) -46, 5);
        this.field_F.a((byte) -35, 5);
    }

    final void a(sm param0) {
        lb var2 = (lb) (param0);
        this.field_f = var2.field_c;
        this.field_v = var2.field_b;
        this.field_E = var2.field_d;
        this.field_C = var2;
        this.field_x = var2.field_c;
        this.field_m = var2.field_b;
        this.g();
    }

    final RenderSprite createSprite(SpriteData data, boolean preferIndexed) {
        int stackIn_27_2 = 0;
        Object var7;
        byte[] var9;
        int var10;
        int var11;
        int var12;
        int[] var20 = data.palette;
        int[] var16 = var20;
        int[] var3 = var16;
        byte[] var4 = data.indices;
        int var5 = data.width;
        int var6 = data.height;
        if (preferIndexed &&
          data.alpha == null) {
          int[] var22 = new int[var20.length];
          int[] var18 = var22;
          int[] var8 = var18;
          byte[] var21 = new byte[var5 * var6];
          byte[] var17 = var21;
          byte[] var14 = var17;
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
          var7 = new IndexedJavaSoftwareSprite(this, var21, var22, var5, var6);
        } else {
          int[] var23 = new int[var5 * var6];
          int[] var19 = var23;
          int[] var15 = var19;
          var9 = data.alpha;
          if (var9 != null) {
            for (var10 = 0; var10 < var6; var10++) {
              var11 = var10 * var5;
              for (var12 = 0; var12 < var5; var12++) {
                var15[var11 + var12] = var3[var4[var11 + var12] & 255] | var9[var11 + var12] << 24;
              }
            }
            var7 = new AlphaBlendedJavaSoftwareSprite(this, var23, var5, var6);
          } else {
            for (var10 = 0; var10 < var6; var10++) {
              var11 = var10 * var5;
              for (var12 = 0; var12 < var5; var12++) {
                int var13 = var3[var4[var11 + var12] & 255];
                int[] stackIn_26_0 = var15;
                int stackIn_26_1 = var11 + var12;
                stackIn_27_2 = (var13 == 0) ? (0) : (-16777216 | var13);
                stackIn_26_0[stackIn_26_1] = stackIn_27_2;
              }
            }
            var7 = new BinaryAlphaJavaSoftwareSprite(this, var23, var5, var6);
          }
        }
        ((RenderSprite) (var7)).a(data.padLeft, data.padTop, data.padRight, data.padBottom);
        return (RenderSprite) (var7);
    }

    final void fillRect(int x, int y, int width, int height, int argb, int blendMode) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (x < this.field_z) {
          width = width - (this.field_z - x);
          x = this.field_z;
        }
        if (y < this.field_w) {
          height = height - (this.field_w - y);
          y = this.field_w;
        }
        if (x + width > this.field_k) {
          width = this.field_k - x;
        }
        if (y + height > this.field_D) {
          height = this.field_D - y;
        }
        if (width > 0) {
          if (height > 0 &&
            x <= this.field_k &&
            y <= this.field_D) {
            int var7 = this.field_f - width;
            int var8 = x + y * this.field_f;
            int var9 = argb >>> 24;
            if (blendMode != 0 && (blendMode != 1 ||
              var9 != 255)) {
              if (blendMode == 1) {
                argb = ((argb & 16711935) * var9 >> 8 & 16711935) + (((argb & -16711936) >>> 8) * var9 & -16711936);
                var10 = 256 - var9;
                for (var11 = 0; var11 < height; var11++) {
                  for (var12 = -width; var12 < 0; var12++) {
                    int var13 = this.field_E[var8];
                    var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                    int incrementValue$1 = var8;
                    var8++;
                    this.field_E[incrementValue$1] = argb + var13;
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
                  var12 = this.field_E[var8];
                  int var13Lifetime1 = argb + var12;
                  int var14 = (argb & 16711935) + (var12 & 16711935);
                  var12 = (var14 & 16777472) + (var13Lifetime1 - var14 & 65536);
                  int incrementValue$0 = var8;
                  var8++;
                  this.field_E[incrementValue$0] = var13Lifetime1 - var12 | var12 - (var12 >>> 8);
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
                  this.field_E[width] = argb;
                  width++;
                  this.field_E[width] = argb;
                  width++;
                  this.field_E[width] = argb;
                  width++;
                  this.field_E[width] = argb;
                  width++;
                  this.field_E[width] = argb;
                  width++;
                  this.field_E[width] = argb;
                  width++;
                  this.field_E[width] = argb;
                  width++;
                  this.field_E[width] = argb;
                  x--;
                } while (x > 0);
              }
              if (var11 > 0) {
                x = var11;
                do {
                  width++;
                  this.field_E[width] = argb;
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

    private JavaSoftwareRenderer(d param0) {
        super(param0);
        this.field_h = false;
        this.field_y = false;
        this.field_g = new IntrusiveNodeHashTable(4);
        this.field_d = 50;
        this.field_z = 0;
        this.field_w = 0;
        this.field_o = 3500;
        this.field_j = 512;
        this.field_k = 0;
        this.field_D = 0;
        this.field_r = 512;
        this.field_u = new WeightedObjectCache(16);
        try {
          this.field_F = new WeightedObjectCache(256);
          iu discarded$0 = new iu();
          this.f(1);
          this.d(0);
          fr.a(true, 0, true);
          this.field_h = true;
          this.field_B = (int)kh.a(-61);
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          this.a(-9);
          throw new RuntimeException("");
        }
    }

    private final void j() {
        this.field_z = 0;
        this.field_w = 0;
        this.field_k = this.field_f;
        this.field_D = this.field_v;
        this.f();
    }

    final void a(za param0) {
    }

    final za c(int param0) {
        return null;
    }

    final void drawLine(int x1, int y1, int x2, int y2, int argb, int blendMode) {
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        x2 = x2 - x1;
        y2 = y2 - y1;
        if (y2 == 0) {
          if (x2 < 0) {
            this.drawHorizontalLine(x1 + x2, y1, -x2 + 1, argb, blendMode);
          } else {
            this.drawHorizontalLine(x1, y1, x2 + 1, argb, blendMode);
          }
          return;
        }
        if (x2 == 0) {
          if (y2 < 0) {
            this.b(x1, y1 + y2, -y2 + 1, argb, blendMode);
          } else {
            this.b(x1, y1, y2 + 1, argb, blendMode);
          }
          return;
        }
        if (x2 + y2 < 0) {
          x1 = x1 + x2;
          x2 = -x2;
          y1 = y1 + y2;
          y2 = -y2;
        }
        if (x2 <= y2) {
          x1 = x1 << 16;
          x1 = x1 + 32768;
          x2 = x2 << 16;
          int var7 = (int)Math.floor((double)x2 / (double)y2 + 0.5);
          y2 = y2 + y1;
          if (y1 < this.field_w) {
            x1 = x1 + var7 * (this.field_w - y1);
            y1 = this.field_w;
          }
          if (y2 >= this.field_D) {
            y2 = this.field_D - 1;
          }
          int var8 = argb >>> 24;
          if (blendMode == 0 || blendMode == 1 &&
            var8 == 255) {
            while (y1 <= y2) {
              int var9Lifetime3 = x1 >> 16;
              if (var9Lifetime3 >= this.field_z &&
                var9Lifetime3 < this.field_k) {
                this.field_E[var9Lifetime3 + y1 * this.field_f] = argb;
              }
              x1 = x1 + var7;
              y1++;
            }
          } else if (blendMode == 1) {
            argb = ((argb & 16711935) * var8 >> 8 & 16711935) + ((argb & 65280) * var8 >> 8 & 65280) + (var8 << 24);
            int var9 = 256 - var8;
            while (y1 <= y2) {
              int var10 = x1 >> 16;
              if (var10 >= this.field_z &&
                var10 < this.field_k) {
                int var11 = var10 + y1 * this.field_f;
                int var12 = this.field_E[var11];
                var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                this.field_E[var10 + y1 * this.field_f] = argb + var12;
              }
              x1 = x1 + var7;
              y1++;
            }
          } else {
            if (blendMode != 2) {
              throw new IllegalArgumentException();
            }
            while (y1 <= y2) {
              int var9Lifetime4 = x1 >> 16;
              if (var9Lifetime4 >= this.field_z &&
                var9Lifetime4 < this.field_k) {
                int var10Lifetime2 = var9Lifetime4 + y1 * this.field_f;
                int var11Lifetime2 = this.field_E[var10Lifetime2];
                int var12Lifetime2 = argb + var11Lifetime2;
                int var13 = (argb & 16711935) + (var11Lifetime2 & 16711935);
                int var11Lifetime2Lifetime1 = (var13 & 16777472) + (var12Lifetime2 - var13 & 65536);
                this.field_E[var10Lifetime2] = var12Lifetime2 - var11Lifetime2Lifetime1 | var11Lifetime2Lifetime1 - (var11Lifetime2Lifetime1 >>> 8);
              }
              x1 = x1 + var7;
              y1++;
            }
          }
        }
        else {
          y1 = y1 << 16;
          y1 = y1 + 32768;
          y2 = y2 << 16;
          int var7Lifetime1 = (int)Math.floor((double)y2 / (double)x2 + 0.5);
          x2 = x2 + x1;
          if (x1 < this.field_z) {
            y1 = y1 + var7Lifetime1 * (this.field_z - x1);
            x1 = this.field_z;
          }
          if (x2 >= this.field_k) {
            x2 = this.field_k - 1;
          }
          int var8Lifetime1 = argb >>> 24;
          if (blendMode != 0 && (blendMode != 1 ||
            var8Lifetime1 != 255)) {
            if (blendMode == 1) {
              argb = ((argb & 16711935) * var8Lifetime1 >> 8 & 16711935) + ((argb & 65280) * var8Lifetime1 >> 8 & 65280) + (var8Lifetime1 << 24);
              var9Lifetime1 = 256 - var8Lifetime1;
              while (x1 <= x2) {
                var10Lifetime1 = y1 >> 16;
                if (var10Lifetime1 >= this.field_w &&
                  var10Lifetime1 < this.field_D) {
                  var11Lifetime1 = x1 + var10Lifetime1 * this.field_f;
                  var12Lifetime1 = this.field_E[var11Lifetime1];
                  var12Lifetime1 = ((var12Lifetime1 & 16711935) * var9Lifetime1 >> 8 & 16711935) + ((var12Lifetime1 & 65280) * var9Lifetime1 >> 8 & 65280);
                  this.field_E[var11Lifetime1] = argb + var12Lifetime1;
                }
                y1 = y1 + var7Lifetime1;
                x1++;
              }
            } else {
              if (blendMode != 2) {
                throw new IllegalArgumentException();
              }
              while (x1 <= x2) {
                var9Lifetime1 = y1 >> 16;
                if (var9Lifetime1 >= this.field_w &&
                  var9Lifetime1 < this.field_D) {
                  var10Lifetime1 = x1 + var9Lifetime1 * this.field_f;
                  var11Lifetime1 = this.field_E[var10Lifetime1];
                  var12Lifetime1 = argb + var11Lifetime1;
                  int var13Lifetime1 = (argb & 16711935) + (var11Lifetime1 & 16711935);
                  var11Lifetime1 = (var13Lifetime1 & 16777472) + (var12Lifetime1 - var13Lifetime1 & 65536);
                  this.field_E[var10Lifetime1] = var12Lifetime1 - var11Lifetime1 | var11Lifetime1 - (var11Lifetime1 >>> 8);
                }
                y1 = y1 + var7Lifetime1;
                x1++;
              }
            }
            boolean decompiledFrameRemainder0 = false;
          }
          else {
            while (x1 <= x2) {
              int var9Lifetime2 = y1 >> 16;
              if (var9Lifetime2 >= this.field_w &&
                var9Lifetime2 < this.field_D) {
                this.field_E[x1 + var9Lifetime2 * this.field_f] = argb;
              }
              y1 = y1 + var7Lifetime1;
              x1++;
            }
          }
        }

    }

    final RendererBitmapFont createFont(BitmapFontMetrics metrics, SpriteData[] glyphSprites, boolean param2) {
        int[] var4 = new int[glyphSprites.length];
        int[] var5 = new int[glyphSprites.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < glyphSprites.length; var7++) {
          var4[var7] = glyphSprites[var7].width;
          var5[var7] = glyphSprites[var7].height;
          if (glyphSprites[var7].alpha != null) {
            var6 = true;
          }
        }
        if (!param2) {
          if (!var6) {
            return (RendererBitmapFont) ((Object) new be(this, metrics, glyphSprites, var4, var5));
          }
          throw new IllegalArgumentException("");
        }
        if (!var6) {
          return (RendererBitmapFont) ((Object) new tu(this, metrics, glyphSprites, var4, var5));
        }
        return (RendererBitmapFont) ((Object) new ts(this, metrics, glyphSprites, var4, var5));
    }

    private final void f(int param0) {
        this.field_A = param0;
        this.field_e = new it[this.field_A];
        for (int var2 = 0; var2 < this.field_A; var2++) {
          this.field_e[var2] = new it(this);
        }
    }

    final void b(int param0, int param1) throws lp {
        if (this.field_l == null ||
          this.field_p == null) {
          throw new IllegalStateException(field_H);
        }
        try {
          java.awt.Graphics var3 = this.field_l.getGraphics();
          this.field_p.a(this.field_q, param1, 0, this.field_n, -57, var3, param0, 0);
        } catch (Exception exception) {
          this.field_l.repaint();
        }
    }

    final void setClip(int left, int top, int right, int bottom) {
        if (left < 0) {
          left = 0;
        }
        if (top < 0) {
          top = 0;
        }
        if (right > this.field_f) {
          right = this.field_f;
        }
        if (bottom > this.field_v) {
          bottom = this.field_v;
        }
        this.field_z = left;
        this.field_k = right;
        this.field_w = top;
        this.field_D = bottom;
        this.f();
    }

    final boolean b() {
        return false;
    }

    final void drawHorizontalLine(int x, int y, int length, int argb, int blendMode) {
        if (y >= this.field_w) {
          if (y >= this.field_D) {
            return;
          }
          if (x < this.field_z) {
            length = length - (this.field_z - x);
            x = this.field_z;
          }
          if (x + length > this.field_k) {
            length = this.field_k - x;
          }
          int var6 = x + y * this.field_f;
          int var7 = argb >>> 24;
          if (blendMode != 0 && (blendMode != 1 ||
            var7 != 255)) {
            if (blendMode == 1) {
              argb = ((argb & 16711935) * var7 >> 8 & 16711935) + ((argb & 65280) * var7 >> 8 & 65280) + (var7 << 24);
              int var8 = 256 - var7;
              for (int var9 = 0; var9 < length; var9++) {
                int var10 = this.field_E[var6 + var9];
                var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
                this.field_E[var6 + var9] = argb + var10;
              }
              return;
            }
            if (blendMode != 2) {
              throw new IllegalArgumentException();
            }
            for (int var8Lifetime2 = 0; var8Lifetime2 < length; var8Lifetime2++) {
              int var9Lifetime1 = this.field_E[var6 + var8Lifetime2];
              int var10Lifetime1 = argb + var9Lifetime1;
              int var11 = (argb & 16711935) + (var9Lifetime1 & 16711935);
              int var9Lifetime1Lifetime1 = (var11 & 16777472) + (var10Lifetime1 - var11 & 65536);
              this.field_E[var6 + var8Lifetime2] = var10Lifetime1 - var9Lifetime1Lifetime1 | var9Lifetime1Lifetime1 - (var9Lifetime1Lifetime1 >>> 8);
            }
            return;
          }
          for (int var8Lifetime1 = 0; var8Lifetime1 < length; var8Lifetime1++) {
            this.field_E[var6 + var8Lifetime1] = argb;
          }
        }
    }

    final void drawRectOutline(int x, int y, int width, int height, int argb, int blendMode) {
        this.drawHorizontalLine(x, y, width, argb, blendMode);
        this.drawHorizontalLine(x, y + height - 1, width, argb, blendMode);
        this.b(x, y + 1, height - 2, argb, blendMode);
        this.b(x + width - 1, y + 1, height - 2, argb, blendMode);
    }

    final gd a(int param0, int param1) {
        return (gd) ((Object) new ac(param0, param1));
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        CanvasImageBuffer var4 = (CanvasImageBuffer) (this.field_g.findByKey((byte) 106, (long)param0.hashCode()));
        if (var4 != null) {
          var4.unlink(-128);
          var4 = oi.a(param0, -43, param1, param2);
          this.field_g.put(-32, (long)param0.hashCode(), var4);
          if (this.field_l == param0 &&
            this.field_C == null) {
            java.awt.Dimension var5 = param0.getSize();
            this.field_q = var5.width;
            this.field_n = var5.height;
            this.field_p = var4;
            this.field_E = var4.field_e;
            this.field_f = var4.field_g;
            this.field_v = var4.field_h;
            if (this.field_f != this.field_x ||
              this.field_v != this.field_m) {
              this.field_x = this.field_f;
              this.field_s = this.field_f;
              this.field_m = this.field_v;
              this.field_t = this.field_v;
            }
            this.g();
          }
          return;
        }
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_G = param0;
        this.field_i = param1;
        this.field_r = param2;
        this.field_j = param3;
        this.f();
    }

    final void f(int param0, int param1) {
        it discarded$0 = this.a((Runnable) ((Object) Thread.currentThread()));
        this.field_d = param0;
        this.field_o = param1;
    }

    private final void a(java.awt.Canvas param0) {
        if (param0 == null) {
          this.field_l = null;
          this.field_p = null;
          if (this.field_C == null) {
            this.field_E = null;
            this.field_v = 1;
            this.field_f = 1;
            this.field_m = 1;
            this.field_x = 1;
            this.g();
          }
        } else {
          CanvasImageBuffer var2 = (CanvasImageBuffer) (this.field_g.findByKey((byte) 106, (long)param0.hashCode()));
          if (var2 != null) {
            this.field_l = param0;
            java.awt.Dimension var3 = param0.getSize();
            this.field_q = var3.width;
            this.field_n = var3.height;
            this.field_p = var2;
            if (this.field_C == null) {
              this.field_E = var2.field_e;
              this.field_f = var2.field_g;
              this.field_v = var2.field_h;
              if (this.field_f != this.field_x ||
                this.field_v != this.field_m) {
                this.field_x = this.field_f;
                this.field_s = this.field_f;
                this.field_m = this.field_v;
                this.field_t = this.field_v;
              }
              this.g();
            }
          }
        }
    }

    final RenderSprite createArgbSprite(int[] pixels, int offset, int stride, int width, int height, boolean param5) {
        boolean var7 = false;
        int var8 = offset;
        int var9 = 0;
        scanLoop1: while (true) {
          if (var9 < height) {
            for (int var10 = 0; var10 < width; var10++) {
              int incrementValue$4 = var8;
              var8++;
              int var11 = pixels[incrementValue$4] >>> 24;
              if (var11 != 0 &&
                var11 != 255) {
                var7 = true;
                break scanLoop1;
              }
            }
            var9++;
            continue;
          }
          break;
        }
        if (!var7) {
          return (RenderSprite) ((Object) new BinaryAlphaJavaSoftwareSprite(this, pixels, offset, stride, width, height, param5));
        }
        return (RenderSprite) ((Object) new AlphaBlendedJavaSoftwareSprite(this, pixels, offset, stride, width, height, param5));
    }

    final void a() {
        if (this.field_l != null) {
          this.field_E = this.field_p.field_e;
          this.field_f = this.field_p.field_g;
          this.field_v = this.field_p.field_h;
          this.field_x = this.field_s;
          this.field_m = this.field_t;
        } else {
          this.field_f = 1;
          this.field_v = 1;
          this.field_E = null;
          this.field_x = 1;
          this.field_m = 1;
        }
        this.field_C = null;
        this.g();
    }

    private final void g() {
        for (int var1 = 0; var1 < this.field_A; var1++) {
          this.field_e[var1].a(false);
        }
        this.j();
    }

    private final void d(int param0) {
        this.field_e[param0].a((Runnable) ((Object) Thread.currentThread()), 6);
    }

    final void intersectClip(int left, int top, int right, int bottom) {
        if (this.field_z < left) {
          this.field_z = left;
        }
        if (this.field_w < top) {
          this.field_w = top;
        }
        if (this.field_k > right) {
          this.field_k = right;
        }
        if (this.field_D > bottom) {
          this.field_D = bottom;
        }
        this.f();
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        if (param0 >= this.field_z) {
          if (param0 >= this.field_k) {
            return;
          }
          if (param1 < this.field_w) {
            param2 = param2 - (this.field_w - param1);
            param1 = this.field_w;
          }
          if (param1 + param2 > this.field_D) {
            param2 = this.field_D - param1;
          }
          int var6 = param0 + param1 * this.field_f;
          int var7 = param3 >>> 24;
          if (param4 != 0 && (param4 != 1 ||
            var7 != 255)) {
            if (param4 == 1) {
              param3 = ((param3 & 16711935) * var7 >> 8 & 16711935) + ((param3 & 65280) * var7 >> 8 & 65280) + (var7 << 24);
              int var8 = 256 - var7;
              for (int var9 = 0; var9 < param2; var9++) {
                int var10 = var6 + var9 * this.field_f;
                int var11 = this.field_E[var10];
                var11 = ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
                this.field_E[var10] = param3 + var11;
              }
              return;
            }
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            for (int var8Lifetime2 = 0; var8Lifetime2 < param2; var8Lifetime2++) {
              int var9Lifetime1 = var6 + var8Lifetime2 * this.field_f;
              int var10Lifetime1 = this.field_E[var9Lifetime1];
              int var11Lifetime1 = param3 + var10Lifetime1;
              int var12 = (param3 & 16711935) + (var10Lifetime1 & 16711935);
              int var10Lifetime1Lifetime1 = (var12 & 16777472) + (var11Lifetime1 - var12 & 65536);
              this.field_E[var9Lifetime1] = var11Lifetime1 - var10Lifetime1Lifetime1 | var10Lifetime1Lifetime1 - (var10Lifetime1Lifetime1 >>> 8);
            }
            return;
          }
          for (int var8Lifetime1 = 0; var8Lifetime1 < param2; var8Lifetime1++) {
            this.field_E[var6 + var8Lifetime1 * this.field_f] = param3;
          }
        }
    }

    final int XA() {
        return this.field_o;
    }

    JavaSoftwareRenderer(java.awt.Canvas param0, d param1, int param2, int param3) {
        this(param1);
        try {
          this.b(param0, param2, param3);
          this.a(param0);
        } catch (Throwable throwable) {
          throwable.printStackTrace();
          this.a(-9);
          throw new RuntimeException("");
        }
    }

    final boolean d() {
        return false;
    }

    final boolean h() {
        return this.field_y;
    }

    final void getClip(int[] bounds) {
        bounds[0] = this.field_z;
        bounds[1] = this.field_w;
        bounds[2] = this.field_k;
        bounds[3] = this.field_D;
    }

    final void c() {
        if (this.field_h) {
          RendererBitmapFont.a(121, false, true);
          this.field_h = false;
        }
        this.field_p = null;
        this.field_l = null;
        this.field_q = 0;
        this.field_n = 0;
        this.field_g = null;
        this.field_y = true;
    }

    final sm a(ra param0, gd param1) {
        return (sm) ((Object) new lb(this, (RenderSprite) (param0), (ac) (param1)));
    }

    static {
        field_H = "off";
    }
}
