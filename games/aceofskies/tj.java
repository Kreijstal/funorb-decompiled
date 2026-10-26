/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends ao {
    static String field_n;
    private float field_r;
    private float field_s;
    private float field_g;
    private float field_q;
    private float field_f;
    private float field_e;
    static int field_o;
    private float field_p;
    private float field_l;
    static int field_m;
    private float field_h;
    private float field_k;
    private float field_i;
    private float field_j;

    final float[] a(byte param0) {
        ml.field_h[1] = this.field_h;
        ml.field_h[9] = this.field_p;
        ml.field_h[12] = 0.0f;
        ml.field_h[5] = this.field_j;
        ml.field_h[14] = 0.0f;
        ml.field_h[2] = this.field_f;
        ml.field_h[13] = 0.0f;
        ml.field_h[4] = this.field_l;
        ml.field_h[6] = this.field_q;
        ml.field_h[0] = this.field_i;
        ml.field_h[10] = this.field_r;
        ml.field_h[8] = this.field_s;
        if (param0 > 97) {
          return ml.field_h;
        }
        this.field_h = 1.0541695356369019f;
        return ml.field_h;
    }

    public static void b(byte param0) {
        if (param0 >= -45) {
          return;
        }
        field_n = null;
    }

    final void a(float param0, float param1, float[] param2, float param3, int param4, float param5) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var7_float = 0.0f;
        RuntimeException var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        var11 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param4 > -21) {
            this.field_i = 1.9943350553512573f;
          }
          if (!(0.00390625f < param5) &&
            !(param5 < -0.00390625f)) {
            if (!(param3 > 0.00390625f) &&
              !(-0.00390625f > param3)) {
              var10 = -param0 / param1;
              var9 = this.field_e + var10 * this.field_r;
              var7_float = this.field_g + this.field_s * var10;
              var8 = this.field_k + var10 * this.field_p;
            } else {
              var10 = -param0 / param3;
              var9 = this.field_e + this.field_q * var10;
              var8 = this.field_j * var10 + this.field_k;
              var7_float = var10 * this.field_l + this.field_g;
            }
          } else {
            var10 = -param0 / param5;
            var8 = this.field_k + this.field_h * var10;
            var9 = this.field_f * var10 + this.field_e;
            var7_float = this.field_g + var10 * this.field_i;
          }
          param2[2] = param3 * this.field_q + this.field_f * param5 + param1 * this.field_r;
          param2[0] = this.field_s * param1 + (this.field_i * param5 + this.field_l * param3);
          param2[1] = this.field_p * param1 + (param3 * this.field_j + param5 * this.field_h);
          param2[3] = -(var7_float * param2[0] + param2[1] * var8 + var9 * param2[2]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("tj.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void c(byte param0) {
        this.field_p = 0.0f;
        this.field_h = 0.0f;
        this.field_j = 1.0f;
        this.field_s = 0.0f;
        if (param0 >= 50) {
          this.field_i = 1.0f;
          this.field_g = 0.0f;
          this.field_e = 0.0f;
          this.field_k = 0.0f;
          this.field_q = 0.0f;
          this.field_l = 0.0f;
          this.field_r = 1.0f;
          this.field_f = 0.0f;
          return;
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        du.field_m = null;
        wu.field_l = null;
        bm.field_z = 0;
        var2 = RendererManager.field_f;
        RendererManager.field_f = ah.field_s;
        ul.field_r.field_j = ul.field_r.field_j + 1;
        ah.field_s = var2;
        if (param1 == 51) {
          ul.field_r.field_e = 2;
          var3 = 97 / ((17 - param0) / 62);
          if (2 <= ul.field_r.field_j &&
            param1 == 51) {
            return 2;
          }
          if (ul.field_r.field_j >= 2 &&
            50 == param1) {
            return 5;
          }
          if (ul.field_r.field_j < 4) {
            return -1;
          }
          return 1;
        }
        if (param1 == 50) {
          ul.field_r.field_e = 5;
          var3Lifetime1 = 97 / ((17 - param0) / 62);
          if (2 > ul.field_r.field_j) {
            if (ul.field_r.field_j >= 2 &&
              50 == param1) {
              return 5;
            }
            if (ul.field_r.field_j < 4) {
              return -1;
            }
            return 1;
          }
          if (param1 == 51) {
            return 2;
          }
        } else {
          ul.field_r.field_e = 1;
          var3Lifetime1 = 97 / ((17 - param0) / 62);
          if (2 <= ul.field_r.field_j &&
            param1 == 51) {
            return 2;
          }
        }
        if (ul.field_r.field_j >= 2 &&
          50 == param1) {
          return 5;
        }
        if (ul.field_r.field_j >= 4) {
          return 1;
        }
        return -1;
    }

    final float[] b(int param0) {
        ml.field_h[12] = this.field_g;
        ml.field_h[5] = this.field_j;
        ml.field_h[2] = this.field_f;
        ml.field_h[4] = this.field_l;
        if (param0 > 102) {
          ml.field_h[8] = this.field_s;
          ml.field_h[14] = this.field_e;
          ml.field_h[13] = this.field_k;
          ml.field_h[10] = this.field_r;
          ml.field_h[9] = this.field_p;
          ml.field_h[0] = this.field_i;
          ml.field_h[1] = this.field_h;
          ml.field_h[6] = this.field_q;
          return ml.field_h;
        }
        field_m = -21;
        ml.field_h[8] = this.field_s;
        ml.field_h[14] = this.field_e;
        ml.field_h[13] = this.field_k;
        ml.field_h[10] = this.field_r;
        ml.field_h[9] = this.field_p;
        ml.field_h[0] = this.field_i;
        ml.field_h[1] = this.field_h;
        ml.field_h[6] = this.field_q;
        return ml.field_h;
    }

    final static Sprite[] a(String param0, String param1, int param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.b(param1, param2 ^ param2);
          var5 = param3.a(-39, var4_int, param0);
          stackIn_1_0 = ScorchMark.a(param3, var4_int, (byte) -70, var5);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("tj.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    tj() {
        this.c((byte) 75);
    }

    static {
        field_n = "Passwords must be between 5 and 20 letters and numbers";
        field_m = 0;
    }
}
