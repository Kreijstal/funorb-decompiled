/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends UiWidget {
    static String confirmEmailText;
    private int field_H;
    private Sprite field_M;
    boolean field_J;
    private Sprite[] field_z;
    private int field_K;
    int field_I;
    static float[] field_y;
    private int field_x;
    private int field_A;
    private Sprite field_G;
    private int field_B;
    private int field_D;
    private Sprite field_E;
    static SpriteData[] field_F;

    public static void releaseStatics(int param0) {
        field_y = null;
        confirmEmailText = null;
        if (param0 != -1346554936) {
          pq.releaseStatics(-63);
        }
        field_F = null;
    }

    private final void g(int param0) {
        this.field_z = new Sprite[]{this.a(this.field_K, (byte) -110, this.field_x), this.a(this.field_D, (byte) -5, this.field_B)};
        this.field_M = this.f(-53);
        if (param0 != 880072001) {
          this.field_K = -125;
        }
        this.field_G = this.field_M.copyMirroredHorizontally();
        this.field_E = new Sprite(this.height >> 1, this.height);
    }

    final void b(int param0, int param1, int param2) {
        this.field_K = param1;
        this.field_B = 8355711 & param0 >> 1;
        this.field_D = (param1 & 16711422) >> 1;
        if (param2 <= 16) {
          return;
        }
        this.field_x = param0;
        this.g(880072001);
    }

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        int var5_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = 94 / ((guard + 25) / 45);
          if (this.field_J) {
            this.field_A = this.field_A + 1;
            if (this.field_A <= this.field_H * 2) {
              return;
            }
            this.field_A = this.field_A - this.field_H * 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("pq.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(parentY).append(')').toString());
        }
    }

    private final Sprite f(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        int var2 = this.height >> 1;
        Sprite var3 = new Sprite(var2, this.height);
        jq.a(7161, var3);
        if (param0 > -23) {
          this.field_M = (Sprite) null;
        }
        for (var4 = 0; this.height > var4; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((-var4 + this.height) * var4);
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(1.0 - var6);
              var8 = !(1.0 <= var6) ? (int)(var6 * 255.0) : 255;
            }
            SoftwareRasterizer.setPixel(var5, var4, var8 << 16 | (var8 | var8 << 8));
          }
        }
        ClientException.popRasterState((byte) -94);
        return var3;
    }

    private final Sprite a(int param0, byte param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var6 = 0;
        int var13 = Sumoblitz.field_L ? 1 : 0;
        Sprite var14 = new Sprite(2 * this.field_H, this.height);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        int var6Lifetime1;
        jq.a(7161, var14);
        int var5 = this.height >> 1;
        for (var6 = 0; this.height > var6; var6++) {
          var7 = (var6 >> 1) * (-1 + this.field_H * 2) % (2 * this.field_H);
          var8 = param2 & 16711935;
          var9 = 65280 & param2;
          var10 = var6 - var5;
          var11 = 128 + (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
          var12 = var11 < 256 ? (var9 * var11 & 16711680 | -16711936 & var11 * var8) >>> 8 : var9 | var8;
          SoftwareRasterizer.drawHorizontalLine(var7, var6, this.field_H, var12);
          var9Lifetime1 = param0 & 65280;
          var8Lifetime1 = 16711935 & param0;
          SoftwareRasterizer.drawHorizontalLine(-(2 * this.field_H) + var7, var6, this.field_H, var12);
          var12Lifetime1 = 256 > var11 ? (16711680 & var11 * var9Lifetime1 | var8Lifetime1 * var11 & -16711936) >>> 8 : var8Lifetime1 | var9Lifetime1;
          SoftwareRasterizer.drawHorizontalLine(this.field_H + var7, var6, this.field_H, var12Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-this.field_H + var7, var6, this.field_H, var12Lifetime1);
        }
        var6Lifetime1 = 21 % ((param1 + 50) / 32);
        ClientException.popRasterState((byte) 44);
        return var14;
    }

    private final void a(Sprite param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = param3 + this.width;
          kw.pushClip(this.height + param1, param1, 1, param3 + this.field_M.field_x, -this.field_M.field_x + var5_int);
          for (var6 = param3 - this.field_A; var6 < var5_int; var6 = var6 + param0.field_x) {
            param0.draw(var6, param1);
          }
          if (param2 != 256) {
            this.field_J = true;
          }
          ClientException.popRasterState((byte) -51);
          if (param3 + this.field_M.field_x >= SoftwareRasterizer.clipLeft) {
            jq.a(param2 + 6905, this.field_E);
            param0.draw(-this.field_A, 0);
            param0.draw(this.field_H * 2 - this.field_A, 0);
            this.field_G.drawMultiply(0, 0);
            ClientException.popRasterState((byte) -105);
            this.field_E.draw(param3, param1);
          }
          if (SoftwareRasterizer.clipRight >= -this.field_M.field_x + var5_int) {
            jq.a(7161, this.field_E);
            for (var7 = this.field_A + this.width - this.field_M.field_x; this.field_H * 2 < var7; var7 = var7 - this.field_H * 2) {
            }
            param0.draw(-var7, 0);
            param0.draw(2 * this.field_H - var7, 0);
            this.field_M.drawMultiply(0, 0);
            ClientException.popRasterState((byte) 106);
            this.field_E.draw(var5_int - this.field_M.field_x, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("pq.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    pq(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, (16711422 & param6) >> 1);
    }

    final static int a(int param0, int param1) {
        if (param0 != 1) {
          return -1;
        }
        int var2 = 0;
        if ((param1 & 7) != 0) {
          var2 = -(7 & param1) + 8;
        }
        int var3 = var2 + param1;
        return var3;
    }

    final void setBounds(int guard, int newX, int newY, int newHeight, int newWidth) {
        super.setBounds(-57, newX, newY, newHeight, newWidth);
        this.g(880072001);
        int var6 = 85 % ((28 - guard) / 63);
    }

    private pq(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_B = param7;
        this.field_D = param8;
        this.field_K = param6;
        this.field_x = param5;
        this.field_H = param4;
        this.setBounds(-79, param0, param1, param3, param2);
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        if (layer != 0) {
          return;
        }
        int var5 = parentX + this.x;
        if (guard >= -35) {
          this.field_z = (Sprite[]) null;
        }
        int var6 = this.y + parentY;
        this.a(this.field_z[0], var6, 256, var5);
        if (this.field_I < 65536) {
          kw.pushClip(var6 + this.height, var6, 1, var5 + (this.field_I * this.width >> 16), this.width + var5);
          this.a(this.field_z[1], var6, 256, var5);
          ClientException.popRasterState((byte) -110);
        }
    }

    static {
        confirmEmailText = "Confirm Email:";
        field_y = new float[16];
    }
}
