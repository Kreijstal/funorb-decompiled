/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlSprite extends ToolkitSprite {
    private int field_b;
    static String field_k;
    private int field_j;
    private OpenGlToolkit toolkit;
    private im field_e;
    static String field_h;
    private int field_a;
    private boolean field_l;
    im texture;
    static boolean field_c;
    private int paddingTop;
    private int paddingLeft;

    private final void a(int param0) {
        if (param0 != -27568) {
          this.field_e = (im) null;
        }
        this.toolkit.setActiveTextureUnit(33984, 1);
        this.toolkit.bindTexture(65, (OpenGlTexture) null);
        this.toolkit.setTextureCombineOperations(8448, 8448, false);
        this.toolkit.setRgbCombineArgument(1, param0 + 61760, 768, 34168);
        this.toolkit.setAlphaCombineArgument(0, 770, 5890, 34184);
        this.toolkit.setActiveTextureUnit(33984, 0);
        this.toolkit.setRgbCombineArgument(1, 34192, 768, 34168);
    }

    final static boolean b(int param0, int param1) {
        if (param0 < 92) {
          return false;
        }
        return ArchiveIndexLoader.field_g.a(param1, 11, true);
    }

    final void draw(int param0, int param1, int param2, int param3, int param4) {
        this.texture.setLinearFiltering(-78, false);
        this.toolkit.n(27841);
        this.toolkit.setBlendMode(param4, 73);
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
        param1 = param1 + this.paddingTop;
        param0 = param0 + this.paddingLeft;
        if (this.field_e != null) {
          this.a(true, param2);
          this.field_e.setLinearFiltering(-77, false);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.texture.field_o);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.field_o);
          jaggl.OpenGL.glVertex2i(param0, param1);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(param0, this.texture.field_p + param1);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.texture.field_n, 0.0f);
          jaggl.OpenGL.glTexCoord2f(this.texture.field_n, 0.0f);
          jaggl.OpenGL.glVertex2i(this.texture.field_m + param0, this.texture.field_p + param1);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.texture.field_n, this.texture.field_o);
          jaggl.OpenGL.glTexCoord2f(this.texture.field_n, this.texture.field_o);
          jaggl.OpenGL.glVertex2i(param0 + this.texture.field_m, param1);
          jaggl.OpenGL.glEnd();
          this.a(-27568);
        } else {
          this.toolkit.bindTexture(117, this.texture);
          this.toolkit.setTextureCombineMode(0, param2);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.field_o);
          jaggl.OpenGL.glVertex2i(param0, param1);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(param0, this.texture.field_p + param1);
          jaggl.OpenGL.glTexCoord2f(this.texture.field_n, 0.0f);
          jaggl.OpenGL.glVertex2i(this.texture.field_m + param0, param1 + this.texture.field_p);
          jaggl.OpenGL.glTexCoord2f(this.texture.field_n, this.texture.field_o);
          jaggl.OpenGL.glVertex2i(this.texture.field_m + param0, param1);
          jaggl.OpenGL.glEnd();
        }
    }

    final int getHeight() {
        return this.texture.field_p;
    }

    final int getPaddedHeight() {
        return this.texture.field_p - (-this.paddingTop - this.field_b);
    }

    private final void a(boolean param0, int param1) {
        OpenGlToolkit stackIn_12_0 = null;
        float stackIn_12_1 = 0.0f;
        float stackIn_12_2 = 0.0f;
        boolean stackIn_13_3;
        int var4;
        var4 = VoidHunters.field_G;
        if (!param0) {
          this.drawTiled(10, 76, -118, 126, -96, -43, 86);
        }
        this.toolkit.setActiveTextureUnit(33984, 1);
        this.toolkit.bindTexture(55, this.texture);
        this.toolkit.setTextureCombineOperations(this.toolkit.getTextureCombineOperation(param1, 25887), 7681, false);
        this.toolkit.setRgbCombineArgument(1, 34192, 768, 34167);
        this.toolkit.setAlphaCombineArgument(0, 770, 34168, 34184);
        this.toolkit.setActiveTextureUnit(33984, 0);
        this.toolkit.bindTexture(63, this.field_e);
        this.toolkit.setTextureCombineOperations(34479, 7681, false);
        this.toolkit.setRgbCombineArgument(1, 34192, 768, 34166);
        if (this.field_j == 0) {
          stackIn_12_0 = this.toolkit;
          stackIn_12_1 = 0.0f;
          stackIn_12_2 = 0.5f;
          stackIn_13_3 = (param0) ? false : true;
          ((OpenGlToolkit) (Object) stackIn_12_0).setTextureEnvironmentColor(stackIn_12_1, stackIn_12_2, stackIn_13_3, 0.5f, 1.0f);
        } else {
          if (this.field_j == 1) {
            this.toolkit.setTextureEnvironmentColor(0.0f, 1.0f, false, 0.5f, 0.5f);
          } else {
            if (this.field_j != 2) {
              if (this.field_j == 3) {
                this.toolkit.setTextureEnvironmentColor(0.0f, 128.5f, false, 128.5f, 128.5f);
              }
            } else {
              this.toolkit.setTextureEnvironmentColor(0.0f, 0.5f, false, 1.0f, 0.5f);
            }
          }
        }
    }

    final void writePixels(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
          this.texture.a((byte) 32, param6, param2, param1, param3, param0, param5, true, param4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tla.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void drawScaled(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        float var9;
        float var10;
        float var11;
        float var12;
        float var13;
        float var14;
        int var15;
        im stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        var15 = VoidHunters.field_G;
        stackIn_2_0 = this.texture;
        stackIn_2_1 = -124;
        stackIn_3_2 = ((param7 & 1) == 0) ? false : true;
        ((im) (Object) stackIn_2_0).setLinearFiltering(stackIn_2_1, stackIn_3_2);
        this.toolkit.n(27841);
        this.toolkit.setBlendMode(param6, 115);
        jaggl.OpenGL.glColor4ub((byte)(param5 >> 16), (byte)(param5 >> 8), (byte)param5, (byte)(param5 >> 24));
        if (!this.field_l) {
          if (null != this.field_e) {
            this.a(true, param4);
            this.field_e.setLinearFiltering(-112, true);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.texture.field_o);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.field_o);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, param1 + param3);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.texture.field_n, 0.0f);
            jaggl.OpenGL.glTexCoord2f(this.texture.field_n, 0.0f);
            jaggl.OpenGL.glVertex2i(param0 + param2, param1 + param3);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.texture.field_n, this.texture.field_o);
            jaggl.OpenGL.glTexCoord2f(this.texture.field_n, this.texture.field_o);
            jaggl.OpenGL.glVertex2i(param2 + param0, param1);
            jaggl.OpenGL.glEnd();
            this.a(-27568);
          } else {
            this.toolkit.bindTexture(103, this.texture);
            this.toolkit.setTextureCombineMode(0, param4);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.field_o);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, param1 + param3);
            jaggl.OpenGL.glTexCoord2f(this.texture.field_n, 0.0f);
            jaggl.OpenGL.glVertex2i(param0 + param2, param3 + param1);
            jaggl.OpenGL.glTexCoord2f(this.texture.field_n, this.texture.field_o);
            jaggl.OpenGL.glVertex2i(param2 + param0, param1);
            jaggl.OpenGL.glEnd();
          }
        } else {
          var9 = (float)param2 / (float)this.getPaddedWidth();
          var10 = (float)param3 / (float)this.getPaddedHeight();
          var11 = (float)this.paddingLeft * var9 + (float)param0;
          var12 = (float)param1 + (float)this.paddingTop * var10;
          var13 = var11 + (float)this.texture.field_m * var9;
          var14 = (float)this.texture.field_p * var10 + var12;
          if (this.field_e != null) {
            this.a(true, param4);
            this.field_e.setLinearFiltering(-128, true);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.texture.field_o);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.field_o);
            jaggl.OpenGL.glVertex2f(var11, var12);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2f(var11, var14);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.texture.field_n, 0.0f);
            jaggl.OpenGL.glTexCoord2f(this.texture.field_n, 0.0f);
            jaggl.OpenGL.glVertex2f(var13, var14);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.texture.field_n, this.texture.field_o);
            jaggl.OpenGL.glTexCoord2f(this.texture.field_n, this.texture.field_o);
            jaggl.OpenGL.glVertex2f(var13, var12);
            jaggl.OpenGL.glEnd();
            this.a(-27568);
          } else {
            this.toolkit.bindTexture(120, this.texture);
            this.toolkit.setTextureCombineMode(0, param4);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.field_o);
            jaggl.OpenGL.glVertex2f(var11, var12);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2f(var11, var14);
            jaggl.OpenGL.glTexCoord2f(this.texture.field_n, 0.0f);
            jaggl.OpenGL.glVertex2f(var13, var14);
            jaggl.OpenGL.glTexCoord2f(this.texture.field_n, this.texture.field_o);
            jaggl.OpenGL.glVertex2f(var13, var12);
            jaggl.OpenGL.glEnd();
          }
        }
    }

    final void drawTiled(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8;
        int var9;
        int var10_int;
        int var11_int;
        int var12;
        int var13;
        int var14_int;
        float var14;
        int var15;
        float var16_float;
        int var16;
        float var17;
        int var18;
        float var10;
        float var11;
        int var15Lifetime1;
        var18 = VoidHunters.field_G;
        var8 = param2 + param0;
        this.texture.setLinearFiltering(-122, false);
        var9 = param1 + param3;
        this.toolkit.n(27841);
        this.toolkit.bindTexture(31, this.texture);
        this.toolkit.setBlendMode(param6, 111);
        this.toolkit.setTextureCombineMode(0, param4);
        jaggl.OpenGL.glColor4ub((byte)(param5 >> 16), (byte)(param5 >> 8), (byte)param5, (byte)(param5 >> 24));
        if (this.texture.field_l &&
          !this.field_l) {
          var10 = this.texture.field_o * (float)param3 / (float)this.texture.field_p;
          var11 = this.texture.field_n * (float)param2 / (float)this.texture.field_m;
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glTexCoord2f(0.0f, var10);
          jaggl.OpenGL.glVertex2i(param0, param1);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(param0, var9);
          jaggl.OpenGL.glTexCoord2f(var11, 0.0f);
          jaggl.OpenGL.glVertex2i(var8, var9);
          jaggl.OpenGL.glTexCoord2f(var11, var10);
          jaggl.OpenGL.glVertex2i(var8, param1);
          jaggl.OpenGL.glEnd();
        } else {
          jaggl.OpenGL.glPushMatrix();
          jaggl.OpenGL.glTranslatef((float)this.paddingLeft, (float)this.paddingTop, 0.0f);
          var10_int = this.getPaddedWidth();
          var11_int = this.getPaddedHeight();
          var13 = this.texture.field_p + param1;
          jaggl.OpenGL.glBegin(7);
          var12 = param1;
          while (var13 <= var9) {
            var15 = param0 + this.texture.field_m;
            var14_int = param0;
            while (var15 <= var8) {
              jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.field_o);
              jaggl.OpenGL.glVertex2i(var14_int, var12);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(var14_int, var13);
              jaggl.OpenGL.glTexCoord2f(this.texture.field_n, 0.0f);
              jaggl.OpenGL.glVertex2i(var15, var13);
              jaggl.OpenGL.glTexCoord2f(this.texture.field_n, this.texture.field_o);
              jaggl.OpenGL.glVertex2i(var15, var12);
              var14_int = var14_int + var10_int;
              var15 = var15 + var10_int;
            }
            if (var8 > var14_int) {
              var16_float = this.texture.field_n * (float)(-var14_int + var8) / (float)this.texture.field_m;
              jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.field_o);
              jaggl.OpenGL.glVertex2i(var14_int, var12);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(var14_int, var13);
              jaggl.OpenGL.glTexCoord2f(var16_float, 0.0f);
              jaggl.OpenGL.glVertex2i(var8, var13);
              jaggl.OpenGL.glTexCoord2f(var16_float, this.texture.field_o);
              jaggl.OpenGL.glVertex2i(var8, var12);
            }
            var13 = var13 + var11_int;
            var12 = var12 + var11_int;
          }
          if (var12 >= var9) {
            jaggl.OpenGL.glEnd();
            jaggl.OpenGL.glPopMatrix();
          } else {
            var14 = (float)(this.texture.field_p - (var9 - var12)) * this.texture.field_o / (float)this.texture.field_p;
            var16 = param0 + this.texture.field_m;
            var15Lifetime1 = param0;
            while (var16 <= var8) {
              jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.field_o);
              jaggl.OpenGL.glVertex2i(var15Lifetime1, var12);
              jaggl.OpenGL.glTexCoord2f(0.0f, var14);
              jaggl.OpenGL.glVertex2i(var15Lifetime1, var9);
              jaggl.OpenGL.glTexCoord2f(this.texture.field_n, var14);
              jaggl.OpenGL.glVertex2i(var16, var9);
              jaggl.OpenGL.glTexCoord2f(this.texture.field_n, this.texture.field_o);
              jaggl.OpenGL.glVertex2i(var16, var12);
              var16 = var16 + var10_int;
              var15Lifetime1 = var15Lifetime1 + var10_int;
            }
            if (var15Lifetime1 < var8) {
              var17 = (float)(var8 - var15Lifetime1) * this.texture.field_n / (float)this.texture.field_m;
              jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.field_o);
              jaggl.OpenGL.glVertex2i(var15Lifetime1, var12);
              jaggl.OpenGL.glTexCoord2f(0.0f, var14);
              jaggl.OpenGL.glVertex2i(var15Lifetime1, var9);
              jaggl.OpenGL.glTexCoord2f(var17, var14);
              jaggl.OpenGL.glVertex2i(var8, var9);
              jaggl.OpenGL.glTexCoord2f(var17, this.texture.field_o);
              jaggl.OpenGL.glVertex2i(var8, var12);
            }
            jaggl.OpenGL.glEnd();
            jaggl.OpenGL.glPopMatrix();
          }
        }
    }

    final int getPaddedWidth() {
        return this.field_a + (this.texture.field_m + this.paddingLeft);
    }

    final void setPadding(int param0, int param1, int param2, int param3) {
        boolean stackIn_7_1 = false;
        this.field_a = param2;
        this.field_b = param3;
        this.paddingTop = param1;
        this.paddingLeft = param0;
        stackIn_7_1 = (this.paddingLeft != 0) || (0 != this.paddingTop) || (0 != this.field_a) || (0 != this.field_b);
        this.field_l = stackIn_7_1;
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int[] var14 = null;
        int[] var12 = null;
        int[] var11 = null;
        int[] var15 = null;
        int var9 = 0;
        int var10 = VoidHunters.field_G;
        if (param4 <= 90) {
          field_h = (String) null;
        }
        if (!this.toolkit.field_eb) {
          this.texture.a(112, param2, param0, param6, param1, param3, param5);
        } else {
          var14 = this.toolkit.readPixels(param3, param5, param1, param6);
          var12 = var14;
          var11 = var12;
          var15 = var11;
          if (var11 != null) {
            for (var9 = 0; var9 < var14.length; var9++) {
              var11[var9] = SetAngularForceDownshift.a(var14[var9], -16777216);
            }
            this.writePixels(param0, param2, param1, param6, var15, 0, param1);
          }
        }
    }

    final int getWidth() {
        return this.texture.field_m;
    }

    final void drawAffine(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
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
        if (this.field_l) {
          var11 = (float)this.getPaddedWidth();
          var12 = (float)this.getPaddedHeight();
          var13 = (-param0 + param2) / var11;
          var14 = (-param1 + param3) / var11;
          var15 = (-param0 + param4) / var12;
          var16 = (param5 - param1) / var12;
          var17 = var15 * (float)this.paddingTop;
          var18 = var16 * (float)this.paddingTop;
          var19 = (float)this.paddingLeft * var13;
          var20 = var14 * (float)this.paddingLeft;
          var21 = (float)this.field_a * -var13;
          var22 = -var14 * (float)this.field_a;
          var23 = (float)this.field_b * -var15;
          param1 = var18 + (param1 + var20);
          param3 = var18 + (var22 + param3);
          param0 = var19 + param0 + var17;
          param4 = param4 + var19 + var23;
          var24 = (float)this.field_b * -var16;
          param2 = var17 + (var21 + param2);
          param5 = var24 + (var20 + param5);
        }
        var11Lifetime1 = param4 + (param2 - param0);
        this.texture.setLinearFiltering(109, (1 & param9) != 0 ? true : false);
        var12Lifetime1 = -param1 + param5 + param3;
        this.toolkit.n(27841);
        this.toolkit.bindTexture(54, this.texture);
        this.toolkit.setBlendMode(param8, 122);
        this.toolkit.setTextureCombineMode(0, param6);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 16), (byte)(param7 >> 8), (byte)param7, (byte)(param7 >> 24));
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.field_o);
        jaggl.OpenGL.glVertex2f(param0, param1);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2f(param4, param5);
        jaggl.OpenGL.glTexCoord2f(this.texture.field_n, 0.0f);
        jaggl.OpenGL.glVertex2f(var11Lifetime1, var12Lifetime1);
        jaggl.OpenGL.glTexCoord2f(this.texture.field_n, this.texture.field_o);
        jaggl.OpenGL.glVertex2f(param2, param3);
        jaggl.OpenGL.glEnd();
    }

    public static void clearSharedReferences(int param0) {
        field_k = null;
        field_h = null;
        if (param0 != 1) {
          field_h = (String) null;
        }
    }

    OpenGlSprite(OpenGlToolkit param0, int param1, int param2, boolean param3) {
        this.field_a = 0;
        this.paddingTop = 0;
        this.field_b = 0;
        this.field_j = 0;
        this.paddingLeft = 0;
        this.field_l = false;
        try {
          this.toolkit = param0;
          this.texture = SetAngleset.a(28, param1, param2, param0, param3 ? 6408 : 6407);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    OpenGlSprite(OpenGlToolkit param0, int param1, int param2, int[] param3, int param4, int param5) {
        this.field_a = 0;
        this.paddingTop = 0;
        this.field_b = 0;
        this.field_j = 0;
        this.paddingLeft = 0;
        this.field_l = false;
        try {
          this.toolkit = param0;
          this.texture = uw.a(param0, param4, param5, param2, param3, param1, false, (byte) 60);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_h = "You can spectate this game";
        field_k = "Swap control to clicked ship";
    }
}
