/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Camera {
    private int field_j;
    private int field_p;
    private int field_r;
    static long field_c;
    private int field_n;
    static Sprite field_w;
    private int field_a;
    int centerX;
    static String field_b;
    private int field_s;
    static int[] field_m;
    float field_i;
    private int field_o;
    private int field_l;
    private int field_q;
    private int field_e;
    int centerY;
    float field_t;
    boolean field_f;
    static int[] field_u;
    private int field_h;
    private int field_v;
    float zoom;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_v = (param1 * 54 + (6 * param3 + param2 * -15) - param8 * 27) / 18;
        this.field_p = (-(27 * param0) + 6 * param4 + (-15 * param5 + 54 * param7)) / 18;
        this.field_s = param2;
        this.field_h = (54 * param8 + (-(27 * param1) + (param3 * -15 + param2 * 6))) / 18;
        this.field_n = (param0 * 54 + (-(param7 * 27) + (-15 * param4 + 6 * param5))) / 18;
        this.field_e = param3;
        this.field_o = param5;
        if (param6 != 0) {
          this.a(-46, 18, 71, -61, 29, -12, 103, -61, 65);
        } else {
          this.field_l = param4;
          return;
        }
        this.field_l = param4;
    }

    private final void clampToBounds(int param0) {
        float stackIn_6_0 = 0.0f;
        float stackIn_24_0 = 0.0f;
        float var2;
        float var3;
        int var4;
        int var5;
        float var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var4Lifetime2;
        int var5Lifetime2;
        var2 = 320.0f * this.zoom;
        if (param0 != 27) {
          return;
        }
        if (!(var2 > (float)this.centerX)) {
          if (!LinkButtonPainter.field_a) {
            stackIn_24_0 = this.zoom * 200.0f;
          } else {
            stackIn_24_0 = this.zoom * 240.0f;
          }
          var3 = stackIn_24_0;
          if (!(var3 > (float)this.centerY)) {
            var4 = (int)((float)(320 + this.field_q) - var2);
            if (var4 < this.centerX) {
              this.centerX = var4;
            }
            var5 = (int)((float)(this.field_j + 240) - var3);
            if (this.centerY <= var5) {
              return;
            }
            this.centerY = var5;
            return;
          }
          this.centerY = (int)var3;
          var4Lifetime2 = (int)((float)(320 + this.field_q) - var2);
          if (var4Lifetime2 < this.centerX) {
            this.centerX = var4Lifetime2;
          }
          var5Lifetime2 = (int)((float)(this.field_j + 240) - var3);
          if (this.centerY <= var5Lifetime2) {
            return;
          }
          this.centerY = var5Lifetime2;
          return;
        }
        this.centerX = (int)var2;
        if (!LinkButtonPainter.field_a) {
          stackIn_6_0 = this.zoom * 200.0f;
        } else {
          stackIn_6_0 = this.zoom * 240.0f;
        }
        var3Lifetime1 = stackIn_6_0;
        if (var3Lifetime1 > (float)this.centerY) {
          this.centerY = (int)var3Lifetime1;
        }
        var4Lifetime1 = (int)((float)(320 + this.field_q) - var2);
        if (var4Lifetime1 < this.centerX) {
          this.centerX = var4Lifetime1;
        }
        var5Lifetime1 = (int)((float)(this.field_j + 240) - var3Lifetime1);
        if (this.centerY <= var5Lifetime1) {
          return;
        }
        this.centerY = var5Lifetime1;
    }

    final static PcmSampleStream b(int param0, int param1) {
        wj var2 = new wj(param1);
        fd.field_M.a(var2, false);
        if (param0 <= -125) {
          return var2.field_m;
        }
        return (PcmSampleStream) null;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 != 105) {
          return;
        }
        m.c(540);
        SoftwareRasterizer.intersectClip(param0, param4, param3, param1);
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_u = null;
        if (param0 != 6) {
          return;
        }
        field_w = null;
        field_m = null;
    }

    final int screenToWorldY(boolean param0, int param1) {
        if (param0) {
          return (int)((float)this.centerY + this.zoom * (float)(param1 - 240));
        }
        this.field_h = 13;
        return (int)((float)this.centerY + this.zoom * (float)(param1 - 240));
    }

    final void scroll(int param0, int param1, int param2) {
        if (param2 == 25992) {
          this.centerY = this.centerY - param1;
          this.centerX = this.centerX - param0;
          this.clampToBounds(27);
          return;
        }
    }

    final void a(byte param0) {
        if (param0 <= 41) {
          this.worldToScreenX(-95, 100);
          if (DebouncedValidationProvider.field_h) {
            return;
          }
          this.centerY = this.field_l;
          this.field_f = true;
          this.centerX = this.field_e;
          this.field_t = 0.0f;
          this.field_i = 0.004999999888241291f;
          return;
        }
        if (DebouncedValidationProvider.field_h) {
          return;
        }
        this.centerY = this.field_l;
        this.field_f = true;
        this.centerX = this.field_e;
        this.field_t = 0.0f;
        this.field_i = 0.004999999888241291f;
    }

    final int worldToScreenX(int param0, int param1) {
        if (param1 == -20126) {
          return (int)((float)(-this.centerX) + (this.zoom * 320.0f + (float)param0));
        }
        return 52;
    }

    final int screenToWorldX(int param0, int param1) {
        if (param1 == 2) {
          return (int)(this.zoom * (float)(param0 - 320) + (float)this.centerX);
        }
        this.moveTo(48, (byte) 69, 41);
        return (int)(this.zoom * (float)(param0 - 320) + (float)this.centerX);
    }

    final static double a(int param0, double param1) {
        if (param0 == 0) {
          return TranslatedUiText.field_d[65535 & (int)(32768.0 * param1 / 3.141592653589793)];
        }
        field_w = (Sprite) null;
        return TranslatedUiText.field_d[65535 & (int)(32768.0 * param1 / 3.141592653589793)];
    }

    final void updateKeyScroll(boolean param0, boolean param1, boolean param2, boolean param3, byte param4, boolean param5) {
        int stackIn_13_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_60_0 = 0;
        float var7;
        int var7_int;
        float var8;
        int var9;
        int var7_intLifetime1;
        int var7_intLifetime2;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_f) {
          if (!(0.00001 < (double)this.field_i)) {
            this.field_f = false;
            if (param4 != -91) {
              return;
            }
            this.clampToBounds(27);
            return;
          }
          if (!(1.0f > this.field_t)) {
            this.field_f = false;
            if (param4 != -91) {
              return;
            }
            this.clampToBounds(27);
            return;
          }
          this.field_t = this.field_t + this.field_i;
          if ((double)this.field_t > 0.87) {
            this.field_i = (float)((double)this.field_i - 0.0001);
          }
          var7 = this.field_t;
          var8 = -var7 + 1.0f;
          this.centerX = (int)(var7 * (var7 * (var8 * (float)(3 * this.field_v))) + (var8 * (float)this.field_e * var8 * var8 + var8 * ((float)(3 * this.field_h) * var8) * var7) + var7 * ((float)this.field_s * var7) * var7);
          this.centerY = (int)(var7 * (var8 * (float)(3 * this.field_p)) * var7 + (var8 * ((float)this.field_l * var8) * var8 + var7 * (var8 * (float)(3 * this.field_n) * var8)) + var7 * (var7 * (var7 * (float)this.field_o)));
          if (param4 != -91) {
            return;
          }
          this.clampToBounds(27);
          return;
        }
        if (this.field_r > 0) {
          this.field_r = this.field_r - 1;
          if (0 < this.field_a) {
            this.field_a = this.field_a - 1;
          }
          if (this.field_a < 0) {
            this.field_a = this.field_a + 1;
          }
          if (this.field_r < 0) {
            this.field_r = this.field_r + 1;
          }
          stackIn_13_0 = (param1) ? 2 : 1;
          var7_int = stackIn_13_0 * (int)(this.zoom * 8.0f);
          if (param2) {
            this.field_r = -var7_int;
          }
          if (param3) {
            this.field_a = var7_int;
          }
          if (param5) {
            this.field_r = var7_int;
          }
          if (param0) {
            this.field_a = -var7_int;
          }
          this.centerY = this.centerY + this.field_r;
          this.centerX = this.centerX + this.field_a;
          if (param4 != -91) {
            return;
          }
          this.clampToBounds(27);
          return;
        }
        if (0 < this.field_a) {
          this.field_a = this.field_a - 1;
          if (this.field_a < 0) {
            this.field_a = this.field_a + 1;
          }
          if (this.field_r < 0) {
            this.field_r = this.field_r + 1;
          }
          stackIn_37_0 = (param1) ? 2 : 1;
          var7_intLifetime1 = stackIn_37_0 * (int)(this.zoom * 8.0f);
          if (param2) {
            this.field_r = -var7_intLifetime1;
          }
          if (param3) {
            this.field_a = var7_intLifetime1;
          }
          if (param5) {
            this.field_r = var7_intLifetime1;
          }
          if (param0) {
            this.field_a = -var7_intLifetime1;
          }
          this.centerY = this.centerY + this.field_r;
          this.centerX = this.centerX + this.field_a;
          if (param4 != -91) {
            return;
          }
          this.clampToBounds(27);
          return;
        }
        if (this.field_a < 0) {
          this.field_a = this.field_a + 1;
        }
        if (this.field_r < 0) {
          this.field_r = this.field_r + 1;
        }
        stackIn_60_0 = (param1) ? 2 : 1;
        var7_intLifetime2 = stackIn_60_0 * (int)(this.zoom * 8.0f);
        if (param2) {
          this.field_r = -var7_intLifetime2;
        }
        if (param3) {
          this.field_a = var7_intLifetime2;
        }
        if (param5) {
          this.field_r = var7_intLifetime2;
        }
        if (param0) {
          this.field_a = -var7_intLifetime2;
        }
        this.centerY = this.centerY + this.field_r;
        this.centerX = this.centerX + this.field_a;
        if (param4 != -91) {
          return;
        }
        this.clampToBounds(27);
        return;
    }

    final int worldToScreenY(int param0, int param1) {
        if (param1 >= 104) {
          return (int)((float)(-this.centerY) + (this.zoom * 240.0f + (float)param0));
        }
        Camera.a(-81, -0.29647944214546124);
        return (int)((float)(-this.centerY) + (this.zoom * 240.0f + (float)param0));
    }

    Camera(int param0, int param1) {
        this.field_a = 0;
        this.field_r = 0;
        this.field_f = false;
        this.zoom = 1.0f;
        this.field_j = param1 - 240;
        this.field_q = -320 + param0;
    }

    final void a(boolean param0) {
        if (param0) {
          return;
        }
        this.moveTo(this.field_j / 2, (byte) -39, this.field_q / 2);
    }

    final void moveTo(int param0, byte param1, int param2) {
        this.centerY = param0;
        this.centerX = param2;
        this.clampToBounds(27);
        if (param1 > -35) {
          Camera.a(-48, -0.08284056706899026);
        }
    }

    static {
        field_m = new int[8192];
        field_u = new int[]{};
        field_b = "2- and 4-player games!";
    }
}
