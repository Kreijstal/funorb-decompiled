/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mu extends RendererBitmapFont {
    private wl field_f;
    private si field_g;
    private boolean field_e;
    private el field_h;

    final void drawGlyphWithMask(char glyph, int x, int y, int color, boolean shadowPass, aa mask, int maskX, int maskY) {
        dc var9 = (dc) (mask);
        el var10 = var9.field_e;
        this.field_f.a((byte) 10);
        this.field_f.a(this.field_h, 1);
        if (!this.field_e &&
          !shadowPass) {
          this.field_f.a(7681, -26625, 7681);
        } else {
          this.field_f.a(7681, -26625, 8448);
          this.field_f.a(34168, 768, 34176, 0);
        }
        this.field_f.a(false, 1);
        this.field_f.a(var10, 1);
        this.field_f.a(7681, -26625, 8448);
        this.field_f.a(34168, 768, 34176, 0);
        jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
        jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field_r / (float)var10.field_q;
        float var12 = var10.field_p / (float)var10.field_o;
        jaggl.OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0f, 0.0f, (float)(-maskX) * var11}, 0);
        jaggl.OpenGL.glTexGenfv(8193, 9474, new float[]{0.0f, var12, 0.0f, (float)(-maskY) * var12}, 0);
        jaggl.OpenGL.glEnable(3168);
        jaggl.OpenGL.glEnable(3169);
        jaggl.OpenGL.glColor4ub((byte)(color >> 16), (byte)(color >> 8), (byte)color, (byte)(color >> 24));
        jaggl.OpenGL.glTranslatef((float)x, (float)y, 0.0f);
        this.field_g.a(-23085, glyph);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glDisable(3168);
        jaggl.OpenGL.glDisable(3169);
        this.field_f.a(5890, 768, 34176, 0);
        this.field_f.a(8448, -26625, 8448);
        this.field_f.a((rt) null, 1);
        this.field_f.a(false, 0);
        if (this.field_e ||
          shadowPass) {
          this.field_f.a(5890, 768, 34176, 0);
        }
    }

    final void drawGlyph(char glyph, int x, int y, int color, boolean shadowPass) {
        this.field_f.a((byte) 10);
        this.field_f.a(this.field_h, 1);
        if (!this.field_e &&
          !shadowPass) {
          this.field_f.a(7681, -26625, 7681);
        } else {
          this.field_f.a(7681, -26625, 8448);
          this.field_f.a(34168, 768, 34176, 0);
        }
        jaggl.OpenGL.glColor4ub((byte)(color >> 16), (byte)(color >> 8), (byte)color, (byte)(color >> 24));
        jaggl.OpenGL.glTranslatef((float)x, (float)y, 0.0f);
        this.field_g.a(-23085, glyph);
        jaggl.OpenGL.glLoadIdentity();
        if (this.field_e ||
          shadowPass) {
          this.field_f.a(5890, 768, 34176, 0);
        }
    }

    mu(wl param0, BitmapFontMetrics param1, SpriteData[] param2, boolean param3) {
        super(param0, param1);
        int stackIn_22_2 = 0;
        int var8_int;
        int var13;
        int var14;
        int var15_int;
        byte[] var16_ref_byte__;
        int var17_int;
        int var18_int;
        int var19_int;
        int var20_int;
        this.field_f = param0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
          SpriteData var22 = param2[var6];
          if (var22.height > var5) {
            var5 = var22.height;
          }
          if (var22.width > var5) {
            var5 = var22.width;
          }
        }
        int var6Lifetime1 = var5 * 16;
        if (!param3) {
          int[] var33 = new int[var6Lifetime1 * var6Lifetime1];
          int[] var28 = var33;
          int[] var7_ref_int__ = var28;
          for (var8_int = 0; var8_int < 256; var8_int++) {
            SpriteData var25 = param2[var8_int];
            int[] var10 = var25.palette;
            byte[] var31 = var25.alpha;
            byte[] var26 = var31;
            byte[] var11_ref_byte__ = var26;
            byte[] var32 = var25.indices;
            byte[] var27 = var32;
            byte[] var12_ref_byte__ = var27;
            var13 = var25.height;
            var14 = var25.width;
            var15_int = var8_int % 16 * var5;
            int var16_int = var8_int / 16 * var5;
            var17_int = var16_int * var6Lifetime1 + var15_int;
            var18_int = 0;
            if (var11_ref_byte__ != null) {
              for (var19_int = 0; var19_int < var13; var19_int++) {
                for (var20_int = 0; var20_int < var14; var20_int++) {
                  int incrementValue$3 = var17_int;
                  var17_int++;
                  var7_ref_int__[incrementValue$3] = var31[var18_int] << 24 | var10[var32[var18_int] & 255];
                  var18_int++;
                }
                var17_int = var17_int + (var6Lifetime1 - var14);
              }
            } else {
              for (var19_int = 0; var19_int < var13; var19_int++) {
                for (var20_int = 0; var20_int < var14; var20_int++) {
                  int incrementValue$0 = var18_int;
                  var18_int++;
                  byte dupTemp$1 = var12_ref_byte__[incrementValue$0];
                  int var21 = dupTemp$1;
                  if (dupTemp$1 == 0) {
                    var17_int++;
                  } else {
                    int incrementValue$2 = var17_int;
                    var17_int++;
                    var7_ref_int__[incrementValue$2] = -16777216 | var10[var21 & 255];
                  }
                }
                var17_int = var17_int + (var6Lifetime1 - var14);
              }
            }
          }
          this.field_h = ab.a(param0, -125, false, var33, 0, 0, var6Lifetime1, var6Lifetime1);
          this.field_e = false;
        } else {
          byte[] var30 = new byte[var6Lifetime1 * var6Lifetime1];
          byte[] var24 = var30;
          byte[] var7_ref_byte__ = var24;
          for (var8_int = 0; var8_int < 256; var8_int++) {
            SpriteData var23 = param2[var8_int];
            int var10_int = var23.height;
            int var11 = var23.width;
            int var12 = var8_int % 16 * var5;
            var13 = var8_int / 16 * var5;
            var14 = var13 * var6Lifetime1 + var12;
            var15_int = 0;
            if (var23.alpha != null) {
              var16_ref_byte__ = var23.alpha;
              for (var17_int = 0; var17_int < var10_int; var17_int++) {
                for (var18_int = 0; var18_int < var11; var18_int++) {
                  var7_ref_byte__[var14++] = var16_ref_byte__[var15_int++];
                }
                var14 = var14 + (var6Lifetime1 - var11);
              }
            } else {
              var16_ref_byte__ = var23.indices;
              for (var17_int = 0; var17_int < var10_int; var17_int++) {
                for (var18_int = 0; var18_int < var11; var18_int++) {
                  int incrementValue$6 = var14;
                  var14++;
                  int incrementValue$7 = var15_int;
                  var15_int++;
                  byte[] stackIn_21_0 = var7_ref_byte__;
                  int stackIn_21_1 = incrementValue$6;
                  if (var16_ref_byte__[incrementValue$7] != 0) {
                    stackIn_22_2 = -1;
                  } else {
                    stackIn_22_2 = 0;
                  }
                  stackIn_21_0[stackIn_21_1] = (byte)stackIn_22_2;
                }
                var14 = var14 + (var6Lifetime1 - var11);
              }
            }
          }
          this.field_h = wq.a(param0, var6Lifetime1, var6Lifetime1, false, 6406, 6406, 9980, var30);
          this.field_e = true;
        }
        this.field_h.a(false, -128);
        this.field_g = new si(param0, 256);
        float var7 = this.field_h.field_r / (float)this.field_h.field_q;
        float var8 = this.field_h.field_p / (float)this.field_h.field_o;
        for (int var9 = 0; var9 < 256; var9++) {
          SpriteData var29 = param2[var9];
          int var11Lifetime1 = var29.height;
          int var12Lifetime1 = var29.width;
          int var13Lifetime1 = var29.padTop;
          int var14Lifetime1 = var29.padLeft;
          float var15 = (float)(var9 % 16 * var5);
          float var16 = (float)(var9 / 16 * var5);
          float var17 = var15 * var7;
          float var18 = var16 * var8;
          float var19 = (var15 + (float)var12Lifetime1) * var7;
          float var20 = (var16 + (float)var11Lifetime1) * var8;
          this.field_g.a((byte) 111, var9);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glTexCoord2f(var17, this.field_h.field_p - var18);
          jaggl.OpenGL.glVertex2i(var14Lifetime1, var13Lifetime1);
          jaggl.OpenGL.glTexCoord2f(var17, this.field_h.field_p - var20);
          jaggl.OpenGL.glVertex2i(var14Lifetime1, var13Lifetime1 + var11Lifetime1);
          jaggl.OpenGL.glTexCoord2f(var19, this.field_h.field_p - var20);
          jaggl.OpenGL.glVertex2i(var14Lifetime1 + var12Lifetime1, var13Lifetime1 + var11Lifetime1);
          jaggl.OpenGL.glTexCoord2f(var19, this.field_h.field_p - var18);
          jaggl.OpenGL.glVertex2i(var14Lifetime1 + var12Lifetime1, var13Lifetime1);
          jaggl.OpenGL.glEnd();
          this.field_g.b(false);
        }
    }
}
