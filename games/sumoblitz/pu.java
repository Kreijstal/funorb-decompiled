/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pu extends ToolkitSprite {
    private Texture2D field_j;
    private int field_l;
    private int field_f;
    private boolean field_g;
    private int field_b;
    private boolean field_k;
    static DialogLayer field_e;
    static boolean field_m;
    private int field_n;
    private int field_i;
    private HardwareGraphicsToolkit field_d;
    private boolean field_h;
    private int field_c;
    static String blastReadyText;

    final int paddedHeight() {
        return this.field_b + this.field_l + this.field_f;
    }

    final void drawScaled(int x, int y, int width, int height, int colorMode, int color, int blendMode, int flags) {
        AffineTransform3D var10;
        AffineTransform3D var11;
        Texture2D stackIn_4_0 = null;
        var11 = this.field_d.d(84);
        var10 = this.field_d.B(0);
        stackIn_4_0 = this.field_j;
        if (this.field_h) {
          ((Texture2D) (Object) stackIn_4_0).setFilter(lh.NEAREST, 15149);
        } else {
          if (this.field_g) {
            ((Texture2D) (Object) stackIn_4_0).setFilter(lh.NEAREST, 15149);
          } else {
            if ((flags & 1) == 0) {
              ((Texture2D) (Object) stackIn_4_0).setFilter(lh.NEAREST, 15149);
            } else {
              ((Texture2D) (Object) stackIn_4_0).setFilter(ArrayWidgetContainer.LINEAR, 15149);
            }
          }
        }
        this.field_d.w(10);
        this.field_d.a(this.field_j, 95);
        this.field_d.e(blendMode, 13);
        this.field_d.h(59, colorMode);
        this.field_d.a(mm.CONSTANT, 1, 0);
        this.field_d.a(mm.CONSTANT, 1, true);
        this.field_d.a(false, color);
        var10.setScale(this.field_j.textureV((float)this.field_l, -19230), this.field_j.textureU((float)this.field_n, -74), 0, 1.0f);
        if (this.field_k) {
          width = this.field_n * width / this.paddedWidth();
          height = this.field_l * height / this.paddedHeight();
          y = y + this.field_f * height / this.field_l;
          x = x + this.field_i * width / this.field_n;
        }
        var11.setScale((float)height, (float)width, 0, 0.0f);
        var11.translate(y, x, (byte) 103, 0);
        this.field_d.a(IntList.field_c, 28880);
        this.field_d.U(0);
        this.field_d.n(2);
        this.field_d.l(0);
        this.field_d.a(FontMetrics.PREVIOUS, 1, 0);
        this.field_d.a(FontMetrics.PREVIOUS, 1, true);
    }

    final int width() {
        return this.field_n;
    }

    final void drawAffine(float x0, float y0, float x1, float y1, float x2, float y2, int colorMode, int color, int blendMode, int flags) {
        AffineTransform3D var12;
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var21;
        float var22;
        float var23;
        float var24;
        float var25;
        float var26;
        AffineTransform3D var27;
        Texture2D stackIn_4_0 = null;
        TextureFilter stackIn_5_1 = null;
        var27 = this.field_d.d(82);
        var12 = this.field_d.B(0);
        stackIn_4_0 = this.field_j;
        if (!this.field_h &&
          !this.field_g &&
          (1 & flags) != 0) {
          stackIn_5_1 = ArrayWidgetContainer.LINEAR;
        } else {
          stackIn_5_1 = lh.NEAREST;
        }
        ((Texture2D) (Object) stackIn_4_0).setFilter(stackIn_5_1, 15149);
        this.field_d.w(10);
        this.field_d.a(this.field_j, 109);
        this.field_d.e(blendMode, 13);
        this.field_d.h(104, colorMode);
        this.field_d.a(mm.CONSTANT, 1, 0);
        this.field_d.a(mm.CONSTANT, 1, true);
        this.field_d.a(false, color);
        if (this.field_k) {
          var13 = (float)this.paddedWidth();
          var14 = (float)this.paddedHeight();
          var15 = (-x0 + x1) / var13;
          var16 = (y1 - y0) / var13;
          var17 = (x2 - x0) / var14;
          var18 = (y2 - y0) / var14;
          var19 = var17 * (float)this.field_f;
          var20 = (float)this.field_f * var18;
          var21 = var15 * (float)this.field_i;
          var22 = var16 * (float)this.field_i;
          var23 = (float)this.field_c * -var15;
          var24 = (float)this.field_c * -var16;
          var25 = -var17 * (float)this.field_b;
          x2 = var25 + (var21 + x2);
          y0 = var20 + (var22 + y0);
          y1 = y1 + var24 + var20;
          x1 = var19 + (x1 + var23);
          x0 = var19 + (x0 + var21);
          var26 = -var18 * (float)this.field_b;
          y2 = y2 + var22 + var26;
        }
        var27.setLinear(x2 - x0, -y0 + y2, -y0 + y1, -x0 + x1, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 18356);
        var27.translate((byte) 96, 0.0f, y0, x0);
        var12.setScale(this.field_j.textureV((float)this.field_l, -19230), this.field_j.textureU((float)this.field_n, -65), 0, 1.0f);
        this.field_d.a(IntList.field_c, 28880);
        this.field_d.U(0);
        this.field_d.n(2);
        this.field_d.l(0);
        this.field_d.a(FontMetrics.PREVIOUS, 1, 0);
        this.field_d.a(FontMetrics.PREVIOUS, 1, true);
    }

    final void setInsets(int left, int top, int right, int bottom) {
        this.field_f = top;
        this.field_c = right;
        this.field_b = bottom;
        this.field_i = left;
        if (this.field_i != 0) {
          this.field_k = true;
        } else {
          if (this.field_f != 0) {
            this.field_k = true;
          } else {
            if (this.field_c != 0) {
              this.field_k = true;
            } else {
              if (this.field_b != 0) {
                this.field_k = true;
              } else {
                this.field_k = false;
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        if (param0 <= -25) {
          PasswordInputRenderer.field_u[1] = LegacyOpenGlEffectManager.field_i;
          PasswordInputRenderer.field_u[0] = ResourceArchive.field_f;
          PasswordInputRenderer.field_u[2] = hc.field_f;
          ok.field_k = -1 + (-1 + PasswordInputRenderer.field_u[1] - 1 + PasswordInputRenderer.field_u[0]) + PasswordInputRenderer.field_u[2];
          return;
        }
        blastReadyText = (String) null;
        PasswordInputRenderer.field_u[1] = LegacyOpenGlEffectManager.field_i;
        PasswordInputRenderer.field_u[0] = ResourceArchive.field_f;
        PasswordInputRenderer.field_u[2] = hc.field_f;
        ok.field_k = -1 + (-1 + PasswordInputRenderer.field_u[1] - 1 + PasswordInputRenderer.field_u[0]) + PasswordInputRenderer.field_u[2];
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        blastReadyText = null;
        if (param0 != 1) {
          pu.releaseStatics(123);
        }
    }

    final int height() {
        return this.field_l;
    }

    pu(HardwareGraphicsToolkit param0, int param1, int param2, int[] param3, int param4, int param5) {
        RuntimeException var7 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_f = 0;
        this.field_k = false;
        this.field_b = 0;
        this.field_c = 0;
        this.field_i = 0;
        try {
          this.field_d = param0;
          this.field_n = param1;
          this.field_l = param2;
          this.field_j = param0.a(false, param5, param3, param1, -45, param4, param2);
          this.field_j.setWrap(true, true, true);
          stackIn_4_1 = (param1 != this.field_j.width(-16625));
          this.field_h = stackIn_4_1;
          stackIn_7_1 = (param2 != this.field_j.height((byte) -97));
          this.field_g = stackIn_7_1;
          if (!this.field_h) {
            this.field_j.usesNormalizedCoordinates(-24722);
          }
          if (this.field_g) {
            return;
          }
          this.field_j.usesNormalizedCoordinates(-24722);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("pu.<init>(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void draw(int x, int y, int colorMode, int color, int blendMode) {
        AffineTransform3D var8 = this.field_d.d(73);
        AffineTransform3D var7 = this.field_d.B(0);
        x = x + this.field_i;
        y = y + this.field_f;
        this.field_j.setFilter(lh.NEAREST, 15149);
        this.field_d.w(10);
        this.field_d.a(this.field_j, 93);
        this.field_d.e(blendMode, 13);
        this.field_d.h(92, colorMode);
        this.field_d.a(mm.CONSTANT, 1, 0);
        this.field_d.a(mm.CONSTANT, 1, true);
        this.field_d.a(false, color);
        var8.setScale((float)this.field_l, (float)this.field_n, 0, 0.0f);
        var8.translate(y, x, (byte) 120, 0);
        var7.setScale(this.field_j.textureV((float)this.field_l, -19230), this.field_j.textureU((float)this.field_n, -79), 0, 1.0f);
        this.field_d.a(IntList.field_c, 28880);
        this.field_d.U(0);
        this.field_d.n(2);
        this.field_d.l(0);
        this.field_d.a(FontMetrics.PREVIOUS, 1, 0);
        this.field_d.a(FontMetrics.PREVIOUS, 1, true);
    }

    final int paddedWidth() {
        return this.field_i + (this.field_n + this.field_c);
    }

    static {
        blastReadyText = "BLAST READY";
    }
}
