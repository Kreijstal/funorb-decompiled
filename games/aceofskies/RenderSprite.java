/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RenderSprite implements ra {
    final void draw(int x, int y) {
        this.drawBlended(x, y, 1, 0, 1);
    }

    final void drawScaled(int x, int y, int destinationWidth, int destinationHeight, int param4, int param5, int param6) {
        this.drawScaled(x, y, destinationWidth, destinationHeight, param4, param5, param6, 1);
    }

    abstract void drawScaled(int x, int y, int destinationWidth, int destinationHeight, int param4, int param5, int param6, int param7);

    abstract void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9);

    abstract int getFullWidth();

    final void a(float param0, float param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param0, param1, (float)this.getFullWidth() / 2.0f, (float)this.getFullHeight() / 2.0f, param2, param3, param4, param5, param6);
    }

    private final void a(float param0, float param1, float param2, float param3, int param4, int param5, int param6, int param7, int param8) {
        if (param4 != 0) {
          double var10 = (double)(param5 & 65535) * 0.00009587379924285257;
          float var12 = (float)Math.sin(var10) * (float)param4;
          float var13 = (float)Math.cos(var10) * (float)param4;
          float var14 = (-param2 * var13 + -param3 * var12) / 4096.0f + param0;
          float var15 = (-(-param2) * var12 + -param3 * var13) / 4096.0f + param1;
          float var16 = (((float)this.getFullWidth() - param2) * var13 + -param3 * var12) / 4096.0f + param0;
          float var17 = (-((float)this.getFullWidth() - param2) * var12 + -param3 * var13) / 4096.0f + param1;
          float var18 = (-param2 * var13 + ((float)this.getFullHeight() - param3) * var12) / 4096.0f + param0;
          float var19 = (-(-param2) * var12 + ((float)this.getFullHeight() - param3) * var13) / 4096.0f + param1;
          this.a(var14, var15, var16, var17, var18, var19, param6, param7, param8);
          return;
        }
    }

    abstract int getHeight();

    private final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8) {
        this.a(param0, param1, param2, param3, param4, param5, param6, param7, param8, 1);
    }

    abstract void a(int param0, int param1, int param2, int param3);

    final void drawScaledPlain(int x, int y, int destinationWidth, int destinationHeight) {
        this.drawScaled(x, y, destinationWidth, destinationHeight, 1, 0, 1, 1);
    }

    abstract int getWidth();

    abstract void drawBlended(int x, int y, int blendMode, int argb, int param4);

    abstract int getFullHeight();

    final void a(float param0, float param1, int param2, int param3) {
        this.a(param0, param1, (float)this.getFullWidth() / 2.0f, (float)this.getFullHeight() / 2.0f, param2, param3, 1, 0, 1);
    }
}
