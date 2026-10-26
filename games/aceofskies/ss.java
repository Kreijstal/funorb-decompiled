/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss extends ea {
    private int field_y;
    private Sprite field_A;
    private int field_B;
    private int field_x;
    private Sprite field_D;
    private int field_s;
    private Sprite field_C;
    int field_z;
    private int field_v;
    private int field_r;
    private Sprite[] field_w;
    boolean field_u;
    static boolean field_t;

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 <= 122) {
          return;
        }
        super.a(param0, param1, param2, param3, (byte) 124);
        this.a(-104);
    }

    private final Sprite b(int param0, int param1, int param2) {
        Sprite var13 = new Sprite(this.field_y * 2, this.field_n);
        cm.a(var13, -14492);
        int var5 = this.field_n >> 1;
        for (int var6 = 0; var6 < this.field_n; var6++) {
          int var7 = (var6 >> 1) * (2 * this.field_y - 1) % (this.field_y * 2);
          int var8 = 16711935 & param0;
          int var9 = param0 & 65280;
          int var10 = -var5 + var6;
          int var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
          int var12 = var11 >= 256 ? var8 | var9 : (-16711936 & var11 * var8 | var9 * var11 & 16711680) >>> 8;
          SoftwareRasterizer.drawHorizontalLine(var7, var6, this.field_y, var12);
          int var9Lifetime1 = param2 & 65280;
          int var8Lifetime1 = 16711935 & param2;
          SoftwareRasterizer.drawHorizontalLine(-(2 * this.field_y) + var7, var6, this.field_y, var12);
          int var12Lifetime1 = var11 >= 256 ? var9Lifetime1 | var8Lifetime1 : (-16711936 & var11 * var8Lifetime1 | 16711680 & var11 * var9Lifetime1) >>> 8;
          SoftwareRasterizer.drawHorizontalLine(this.field_y + var7, var6, this.field_y, var12Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-this.field_y + var7, var6, this.field_y, var12Lifetime1);
        }
        if (param1 != 128) {
          this.a(90, 49, (byte) 110);
        }
        sl.c(2765);
        return var13;
    }

    private final void a(int param0) {
        this.field_w = new Sprite[]{this.b(this.field_v, 128, this.field_B), this.b(this.field_x, 128, this.field_s)};
        int var2 = 64 % ((param0 + 63) / 35);
        this.field_D = this.b(true);
        this.field_C = this.field_D.copyMirroredHorizontally();
        this.field_A = new Sprite(this.field_n >> 1, this.field_n);
    }

    ss(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, 8355711 & param6 >> 1);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return;
        }
        int var5 = param3 + this.field_p;
        int var6 = this.field_h + param2;
        this.a(var5, 118, var6, this.field_w[0]);
        if (param0 < 64) {
          this.field_B = -13;
        }
        if (this.field_z < 65536) {
          fp.a((byte) 77, var6, var6 + this.field_n, this.field_q + var5, (this.field_q * this.field_z >> 16) + var5);
          this.a(var5, -101, var6, this.field_w[1]);
          sl.c(2765);
        }
    }

    final void a(int param0, int param1, byte param2) {
        this.field_x = (16711422 & param1) >> 1;
        this.field_B = param0;
        int var4 = -88 % ((-6 - param2) / 58);
        this.field_v = param1;
        this.field_s = (param0 & 16711422) >> 1;
        this.a(-116);
    }

    private final Sprite b(boolean param0) {
        if (!param0) {
          this.field_v = -80;
        }
        int var2 = this.field_n >> 1;
        Sprite var3 = new Sprite(var2, this.field_n);
        cm.a(var3, -14492);
        for (int var4 = 0; var4 < this.field_n; var4++) {
          for (int var5 = 0; var5 < var2; var5++) {
            double var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_n) * var4);
            int var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(1.0 - var6);
              var8 = 1.0 <= var6 ? 255 : (int)(255.0 * var6);
            }
            SoftwareRasterizer.setPixel(var5, var4, var8 | var8 << 8 | var8 << 16);
          }
        }
        sl.c(2765);
        return var3;
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        String stackIn_11_2 = null;
        try {
          if (this.field_u) {
            this.field_r = this.field_r + 1;
            if (2 * this.field_y < this.field_r) {
              this.field_r = this.field_r - this.field_y * 2;
            }
          }
          if (param0 <= 13) {
            this.field_z = 30;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var5;
          StringBuilder stackIn_10_1 = new StringBuilder().append("ss.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, Sprite param3) {
        String stackIn_17_2 = null;
        int var8 = 0;
        int var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var5_int = this.field_q + param0;
          fp.a((byte) 44, param2, param2 + this.field_n, -this.field_D.width + var5_int, param0 + this.field_D.width);
          int var6 = -13 / ((-39 - param1) / 58);
          for (int var7 = -this.field_r + param0; var5_int > var7; var7 = var7 + param3.width) {
            param3.b(var7, param2);
          }
          sl.c(2765);
          if (this.field_D.width + param0 >= SoftwareRasterizer.clipLeft) {
            cm.a(this.field_A, -14492);
            param3.b(-this.field_r, 0);
            param3.b(2 * this.field_y - this.field_r, 0);
            this.field_C.a(0, 0);
            sl.c(2765);
            this.field_A.b(param0, param2);
          }
          if (SoftwareRasterizer.clipRight >= var5_int - this.field_D.width) {
            cm.a(this.field_A, -14492);
            for (var8 = this.field_r + this.field_q - this.field_D.width; 2 * this.field_y < var8; var8 = var8 - 2 * this.field_y) {
            }
            param3.b(-var8, 0);
            param3.b(this.field_y * 2 - var8, 0);
            this.field_D.a(0, 0);
            sl.c(2765);
            this.field_A.b(var5_int - this.field_D.width, param2);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("ss.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private ss(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_s = param8;
        this.field_y = param4;
        this.field_B = param6;
        this.field_v = param5;
        this.field_x = param7;
        this.a(param3, param0, param1, param2, (byte) 127);
    }

    static {
        field_t = false;
    }
}
