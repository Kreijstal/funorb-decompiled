/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends ToolkitSprite {
    private int field_c;
    private int field_h;
    private int field_a;
    private LegacyOpenGlSpriteTexture field_d;
    private LegacyOpenGlGraphicsToolkit field_j;
    LegacyOpenGlSpriteTexture field_g;
    private boolean field_e;
    private int field_f;
    private int field_i;
    static String levelCompleteText;

    public static void releaseStatics(int param0) {
        levelCompleteText = null;
        if (param0 != 0) {
          cm.releaseStatics(-59);
        }
    }

    final void draw(int x, int y, int colorMode, int color, int blendMode) {
        this.field_g.setLinearFiltering(false, 0);
        this.field_j.q(-97);
        this.field_j.c(25189, blendMode);
        jaggl.OpenGL.glColor4ub((byte)(color >> 16), (byte)(color >> 8), (byte)color, (byte)(color >> 24));
        x = x + this.field_i;
        y = y + this.field_f;
        if (this.field_d != null) {
          this.b(6344, colorMode);
          this.field_d.setLinearFiltering(false, 0);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_g.maxV);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.maxV);
          jaggl.OpenGL.glVertex2i(x, y);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(x, y + this.field_g.spriteHeight);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_g.maxU, 0.0f);
          jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, 0.0f);
          jaggl.OpenGL.glVertex2i(x + this.field_g.spriteWidth, this.field_g.spriteHeight + y);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_g.maxU, this.field_g.maxV);
          jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, this.field_g.maxV);
          jaggl.OpenGL.glVertex2i(this.field_g.spriteWidth + x, y);
          jaggl.OpenGL.glEnd();
          this.a(0);
          return;
        }
        this.field_j.bindTexture(98, this.field_g);
        this.field_j.c(colorMode, true);
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.maxV);
        jaggl.OpenGL.glVertex2i(x, y);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2i(x, this.field_g.spriteHeight + y);
        jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, 0.0f);
        jaggl.OpenGL.glVertex2i(this.field_g.spriteWidth + x, y + this.field_g.spriteHeight);
        jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, this.field_g.maxV);
        jaggl.OpenGL.glVertex2i(this.field_g.spriteWidth + x, y);
        jaggl.OpenGL.glEnd();
    }

    final int paddedWidth() {
        return this.field_i + (this.field_g.spriteWidth + this.field_a);
    }

    final int paddedHeight() {
        return this.field_g.spriteHeight - (-this.field_f - this.field_h);
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        int var10;
        int[] var11;
        int[] var12;
        int[] var14;
        int[] var17;
        var10 = Sumoblitz.field_L ? 1 : 0;
        if (!this.field_j.field_W) {
          this.field_g.copyFromFramebuffer((byte) 125, param3, param0, param4, param1, param2, param5);
        } else {
          var14 = this.field_j.b(param3, param5, 1, param2, param1);
          var12 = var14;
          var11 = var12;
          var17 = var11;
          if (var11 != null) {
            for (var9 = 0; var14.length > var9; var9++) {
              var11[var9] = ic.a(var14[var9], -16777216);
            }
            this.a(param1, param0, (byte) -76, param5, var17, param4, 0, param5);
          }
        }
        if (param6 == -3773) {
          return;
        }
        this.b(3, -68, -66, -16, -63, 102, -72);
    }

    final void drawScaled(int x, int y, int width, int height, int colorMode, int color, int blendMode, int flags) {
        int var15 = Sumoblitz.field_L ? 1 : 0;
        this.field_g.setLinearFiltering((flags & 1) != 0 ? true : false, 0);
        this.field_j.q(-122);
        this.field_j.c(25189, blendMode);
        jaggl.OpenGL.glColor4ub((byte)(color >> 16), (byte)(color >> 8), (byte)color, (byte)(color >> 24));
        if (!this.field_e) {
          if (this.field_d == null) {
            this.field_j.bindTexture(127, this.field_g);
            this.field_j.c(colorMode, true);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.maxV);
            jaggl.OpenGL.glVertex2i(x, y);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(x, height + y);
            jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, 0.0f);
            jaggl.OpenGL.glVertex2i(x + width, height + y);
            jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, this.field_g.maxV);
            jaggl.OpenGL.glVertex2i(width + x, y);
            jaggl.OpenGL.glEnd();
            return;
          }
          this.b(6344, colorMode);
          this.field_d.setLinearFiltering(true, 0);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_g.maxV);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.maxV);
          jaggl.OpenGL.glVertex2i(x, y);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(x, height + y);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_g.maxU, 0.0f);
          jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, 0.0f);
          jaggl.OpenGL.glVertex2i(width + x, y + height);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_g.maxU, this.field_g.maxV);
          jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, this.field_g.maxV);
          jaggl.OpenGL.glVertex2i(x + width, y);
          jaggl.OpenGL.glEnd();
          this.a(0);
          return;
        }
        float var9 = (float)width / (float)this.paddedWidth();
        float var10 = (float)height / (float)this.paddedHeight();
        float var11 = (float)x + var9 * (float)this.field_i;
        float var12 = (float)y + var10 * (float)this.field_f;
        float var13 = var11 + (float)this.field_g.spriteWidth * var9;
        float var14 = (float)this.field_g.spriteHeight * var10 + var12;
        if (null == this.field_d) {
          this.field_j.bindTexture(39, this.field_g);
          this.field_j.c(colorMode, true);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.maxV);
          jaggl.OpenGL.glVertex2f(var11, var12);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2f(var11, var14);
          jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, 0.0f);
          jaggl.OpenGL.glVertex2f(var13, var14);
          jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, this.field_g.maxV);
          jaggl.OpenGL.glVertex2f(var13, var12);
          jaggl.OpenGL.glEnd();
          return;
        }
        this.b(6344, colorMode);
        this.field_d.setLinearFiltering(true, 0);
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_g.maxV);
        jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.maxV);
        jaggl.OpenGL.glVertex2f(var11, var12);
        jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2f(var11, var14);
        jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_g.maxU, 0.0f);
        jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, 0.0f);
        jaggl.OpenGL.glVertex2f(var13, var14);
        jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_g.maxU, this.field_g.maxV);
        jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, this.field_g.maxV);
        jaggl.OpenGL.glVertex2f(var13, var12);
        jaggl.OpenGL.glEnd();
        this.a(0);
    }

    final int width() {
        return this.field_g.spriteWidth;
    }

    final int height() {
        return this.field_g.spriteHeight;
    }

    final void setInsets(int left, int top, int right, int bottom) {
        this.field_h = bottom;
        this.field_i = left;
        this.field_f = top;
        this.field_a = right;
        if (this.field_i != 0) {
          this.field_e = true;
        } else {
          if (0 != this.field_f) {
            this.field_e = true;
          } else {
            if (this.field_a != 0) {
              this.field_e = true;
            } else {
              if (this.field_h != 0) {
                this.field_e = true;
              } else {
                this.field_e = false;
              }
            }
          }
        }
    }

    private final void a(int param0) {
        this.field_j.g(1, 119);
        this.field_j.bindTexture(24, (LegacyOpenGlTexture) null);
        this.field_j.a(param0 ^ 20685, 8448, 8448);
        this.field_j.b(34168, 768, 1, -128);
        this.field_j.a(112, 0, 5890, 770);
        this.field_j.g(param0, 112);
        this.field_j.b(34168, 768, 1, 92);
    }

    final void drawAffine(float x0, float y0, float x1, float y1, float x2, float y2, int colorMode, int color, int blendMode, int flags) {
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var11Lifetime1;
        float var12Lifetime1;
        if (this.field_e) {
          var11 = (float)this.paddedWidth();
          var12 = (float)this.paddedHeight();
          var13 = (x1 - x0) / var11;
          var14 = (y1 - y0) / var11;
          var15 = (x2 - x0) / var12;
          var16 = (y2 - y0) / var12;
          var17 = var15 * (float)this.field_f;
          var18 = (float)this.field_f * var16;
          var19 = var13 * (float)this.field_i;
          var20 = var14 * (float)this.field_i;
          var21 = (float)this.field_a * -var13;
          var22 = (float)this.field_a * -var14;
          var23 = -var15 * (float)this.field_h;
          var24 = -var16 * (float)this.field_h;
          y0 = var18 + (y0 + var20);
          x0 = x0 + var19 + var17;
          x2 = x2 + var19 + var23;
          y1 = y1 + var22 + var18;
          x1 = var17 + (x1 + var21);
          y2 = var24 + (y2 + var20);
        }
        var11Lifetime1 = x2 + (x1 - x0);
        var12Lifetime1 = y1 + (-y0 + y2);
        this.field_g.setLinearFiltering((flags & 1) != 0 ? true : false, 0);
        this.field_j.q(-70);
        this.field_j.bindTexture(110, this.field_g);
        this.field_j.c(25189, blendMode);
        this.field_j.c(colorMode, true);
        jaggl.OpenGL.glColor4ub((byte)(color >> 16), (byte)(color >> 8), (byte)color, (byte)(color >> 24));
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.maxV);
        jaggl.OpenGL.glVertex2f(x0, y0);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2f(x2, y2);
        jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, 0.0f);
        jaggl.OpenGL.glVertex2f(var11Lifetime1, var12Lifetime1);
        jaggl.OpenGL.glTexCoord2f(this.field_g.maxU, this.field_g.maxV);
        jaggl.OpenGL.glVertex2f(x1, y1);
        jaggl.OpenGL.glEnd();
    }

    cm(LegacyOpenGlGraphicsToolkit param0, int param1, int param2, int[] param3, int param4, int param5) {
        this.field_e = false;
        this.field_h = 0;
        this.field_a = 0;
        this.field_c = 0;
        this.field_f = 0;
        this.field_i = 0;
        try {
          this.field_j = param0;
          this.field_g = js.a(param2, param4, param5, false, param0, (byte) -119, param1, param3);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void b(int param0, int param1) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_j.g(1, 115);
        this.field_j.bindTexture(74, this.field_g);
        this.field_j.a(param0 ^ 18437, 7681, this.field_j.b(param1, (byte) -14));
        this.field_j.b(34167, 768, 1, -120);
        this.field_j.a(113, 0, 34168, 770);
        this.field_j.g(0, 100);
        if (param0 != 6344) {
          this.draw(114, -109, -63, -80, 49);
          this.field_j.bindTexture(param0 ^ 6275, this.field_d);
          this.field_j.a(20685, 7681, 34479);
          this.field_j.b(34166, 768, 1, param0 - 6465);
          if (this.field_c == 0) {
            this.field_j.a(31322, 0.5f, 0.5f, 1.0f, 0.0f);
            return;
          }
          if (this.field_c == 1) {
            this.field_j.a(param0 + 24978, 1.0f, 0.5f, 0.5f, 0.0f);
            return;
          }
          if (this.field_c == 2) {
            this.field_j.a(31322, 0.5f, 1.0f, 0.5f, 0.0f);
            return;
          }
          if (this.field_c == 3) {
            this.field_j.a(31322, 128.5f, 128.5f, 128.5f, 0.0f);
            return;
          }
          return;
        }
        this.field_j.bindTexture(param0 ^ 6275, this.field_d);
        this.field_j.a(20685, 7681, 34479);
        this.field_j.b(34166, 768, 1, param0 - 6465);
        if (this.field_c == 0) {
          this.field_j.a(31322, 0.5f, 0.5f, 1.0f, 0.0f);
          return;
        }
        if (this.field_c == 1) {
          this.field_j.a(param0 + 24978, 1.0f, 0.5f, 0.5f, 0.0f);
          return;
        }
        if (this.field_c == 2) {
          this.field_j.a(31322, 0.5f, 1.0f, 0.5f, 0.0f);
          return;
        }
        if (this.field_c == 3) {
          this.field_j.a(31322, 128.5f, 128.5f, 128.5f, 0.0f);
          return;
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, int[] param4, int param5, int param6, int param7) {
        try {
          if (param2 >= -67) {
            this.b(-99, 125);
          }
          this.field_g.uploadInts(param0, param3, param5, param4, param6, param1, param7, true, true);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cm.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        levelCompleteText = "LEVEL COMPLETE!";
    }
}
