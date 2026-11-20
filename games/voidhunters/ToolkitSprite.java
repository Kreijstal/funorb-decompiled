/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ToolkitSprite implements ColorBuffer {
    abstract int getHeight();

    final void drawRotatedScaled(float param0, float param1, float param2, float param3, int param4, int param5, int param6, int param7, int param8) {
        double var10 = 0.0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        if (param4 != 0) {
          var10 = (double)(param5 & 65535) * 0.00009587379924285257;
          var12 = (float)Math.sin(var10) * (float)param4;
          var13 = (float)Math.cos(var10) * (float)param4;
          var14 = (-param2 * var13 + -param3 * var12) / 4096.0f + param0;
          var15 = (-(-param2) * var12 + -param3 * var13) / 4096.0f + param1;
          var16 = (((float)this.getPaddedWidth() - param2) * var13 + -param3 * var12) / 4096.0f + param0;
          var17 = (-((float)this.getPaddedWidth() - param2) * var12 + -param3 * var13) / 4096.0f + param1;
          var18 = (-param2 * var13 + ((float)this.getPaddedHeight() - param3) * var12) / 4096.0f + param0;
          var19 = (-(-param2) * var12 + ((float)this.getPaddedHeight() - param3) * var13) / 4096.0f + param1;
          this.drawAffine(var14, var15, var16, var17, var18, var19, param6, param7, param8);
          return;
        }
    }

    abstract int getPaddedHeight();

    abstract void writePixels(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    abstract void drawTiled(int param0, int param1, int param2, int param3, int param4, int param5, int param6);

    abstract void setPadding(int param0, int param1, int param2, int param3);

    final void drawScaled(int param0, int param1, int param2, int param3) {
        this.drawScaled(param0, param1, param2, param3, 1, 0, 1, 1);
    }

    abstract int getPaddedWidth();

    abstract void drawAffine(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9);

    private final void drawAffine(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8) {
        this.drawAffine(param0, param1, param2, param3, param4, param5, param6, param7, param8, 1);
    }

    abstract void drawScaled(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    final void drawScaled(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.drawScaled(param0, param1, param2, param3, param4, param5, param6, 1);
    }

    final void draw(int param0, int param1) {
        this.draw(param0, param1, 1, 0, 1);
    }

    abstract int getWidth();

    abstract void draw(int param0, int param1, int param2, int param3, int param4);
}
