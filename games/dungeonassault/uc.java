/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends lm {
    static String field_L;
    private int field_O;
    boolean field_R;
    static ph field_E;
    static String[] field_K;
    private cn field_D;
    private int field_H;
    int field_S;
    private int field_B;
    private cn field_P;
    static String field_Q;
    static String field_C;
    static nh field_I;
    private int field_J;
    private int field_F;
    private cn[] field_M;
    private int field_G;
    private cn field_T;

    private final cn b(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = DungeonAssault.field_K;
        int var2 = this.field_s >> 1;
        cn var3 = new cn(var2, this.field_s);
        lm.a(var3, (byte) 66);
        for (var4 = 0; var4 < this.field_s; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((this.field_s - var4) * var4);
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = var6 >= 1.0 ? 255 : (int)(var6 * 255.0);
            }
            gf.a(var5, var4, var8 << 8 | var8 | var8 << 16);
          }
        }
        ti.c(param0);
        return var3;
    }

    private final cn b(int param0, int param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var6 = 0;
        int var13 = DungeonAssault.field_K;
        cn var14 = new cn(2 * this.field_B, this.field_s);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        int var6Lifetime1;
        lm.a(var14, (byte) -94);
        int var5 = this.field_s >> 1;
        for (var6 = 0; var6 < this.field_s; var6++) {
          var7 = (var6 >> 1) * (this.field_B * 2 - 1) % (this.field_B * 2);
          var8 = 16711935 & param2;
          var9 = param2 & 65280;
          var10 = var6 - var5;
          var11 = 128 + (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
          var12 = 256 > var11 ? (var11 * var9 & 16711680 | var11 * var8 & -16711936) >>> 8 : var9 | var8;
          gf.b(var7, var6, this.field_B, var12);
          gf.b(var7 - this.field_B * 2, var6, this.field_B, var12);
          var9Lifetime1 = param0 & 65280;
          var8Lifetime1 = 16711935 & param0;
          var12Lifetime1 = var11 >= 256 ? var9Lifetime1 | var8Lifetime1 : (var11 * var9Lifetime1 & 16711680 | var8Lifetime1 * var11 & -16711936) >>> 8;
          gf.b(this.field_B + var7, var6, this.field_B, var12Lifetime1);
          gf.b(var7 - this.field_B, var6, this.field_B, var12Lifetime1);
        }
        ti.c(true);
        var6Lifetime1 = 87 / ((15 - param1) / 57);
        return var14;
    }

    private final void a(int param0, int param1, int param2, cn param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = DungeonAssault.field_K;
        try {
          var5_int = param2 + this.field_x;
          d.a(this.field_D.field_y + param2, this.field_s + param1, var5_int - this.field_D.field_y, param1, false);
          var6 = param2 - this.field_O;
          var7 = -26 / ((-35 - param0) / 41);
          while (var5_int > var6) {
            param3.h(var6, param1);
            var6 = var6 + param3.field_y;
          }
          ti.c(true);
          if (gf.field_j <= param2 + this.field_D.field_y) {
            lm.a(this.field_P, (byte) -107);
            param3.h(-this.field_O, 0);
            param3.h(-this.field_O + 2 * this.field_B, 0);
            this.field_T.d(0, 0);
            ti.c(true);
            this.field_P.h(param2, param1);
          }
          if (gf.field_h >= var5_int - this.field_D.field_y) {
            lm.a(this.field_P, (byte) -94);
            for (var7Lifetime1 = this.field_x + (-this.field_D.field_y + this.field_O); var7Lifetime1 > this.field_B * 2; var7Lifetime1 = var7Lifetime1 - this.field_B * 2) {
            }
            param3.h(-var7Lifetime1, 0);
            param3.h(2 * this.field_B - var7Lifetime1, 0);
            this.field_D.d(0, 0);
            ti.c(true);
            this.field_P.h(var5_int - this.field_D.field_y, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("uc.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        int var1 = -39 % ((56 - param0) / 38);
        return so.field_b != null ? true : false;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0 ^ param0, param1, param2, param3, param4);
        this.a(param0 ^ -370091864);
    }

    final static void a(int param0, int param1, int param2, cn param3, int param4, int param5, int param6, boolean param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        cn var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = DungeonAssault.field_K;
        try {
          if (gf.field_j > param4) {
            param2 = param2 - (-param4 + gf.field_j);
            param4 = gf.field_j;
          }
          if (gf.field_f > param6) {
            param5 = param5 - (-param6 + gf.field_f);
            param6 = gf.field_f;
          }
          if (param2 + param4 > gf.field_h) {
            param2 = gf.field_h - param4;
          }
          if (param6 + param5 > gf.field_e) {
            param5 = -param6 + gf.field_e;
          }
          if (0 < param2 &&
            param5 > 0) {
            var21 = param3.d();
            var30 = gf.field_b;
            var10 = gf.field_i;
            var11 = gf.field_c;
            var29 = new int[4];
            gf.a(var29);
            param3.e();
            gf.a(var29[0], var29[1], var29[2], var29[3]);
            var13 = param3.field_y * param6 + param4;
            var14 = -param2 + param3.field_y;
            var25 = var21.field_B;
            var22 = var25;
            var15 = var22;
            if (param7) {
              return;
            }
            for (var16 = param6; param5 + param6 > var16; var16++) {
              for (var17 = param4; var17 < param4 + param2; var17++) {
                var18 = var25[var13];
                if (var18 != 0 && (var17 > 0 &&
                  var15[var13 - 1] == 0 ||
                  0 < var16 &&
                  var15[-param3.field_y + var13] == 0 ||
                  -1 + param3.field_y > var17 &&
                  var15[var13 + 1] == 0 ||
                  !(var16 >= param3.field_v - 1) &&
                  var15[param3.field_y + var13] == 0)) {
                  gf.f(var17, var16, param1, param0);
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.h(-param3.field_w, -param3.field_A);
            gf.a(var30, var10, var11);
            gf.b(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_46_0 = var8;
          stackIn_46_1 = new StringBuilder().append("uc.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_Q = null;
        field_E = null;
        field_K = null;
        field_C = null;
        field_I = null;
        if (param0) {
          uc.c(true);
        }
        field_L = null;
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!param3) {
            uc.g(-103);
          }
          if (this.field_R) {
            this.field_O = this.field_O + 1;
            if (2 * this.field_B >= this.field_O) {
              return;
            }
            this.field_O = this.field_O - 2 * this.field_B;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("uc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
          return;
        }
        int var5 = this.field_q + param1;
        int var6 = param3 + this.field_v;
        this.a(param2 ^ -97, var6, var5, this.field_M[param2]);
        if (this.field_S < 65536) {
          d.a(var5 + (this.field_x * this.field_S >> 16), var6 + this.field_s, this.field_x + var5, var6, false);
          this.a(-99, var6, var5, this.field_M[1]);
          ti.c(true);
        }
    }

    uc(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, 8355711 & param6 >> 1);
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_10_0 = false;
        if (param0 != -854857176) {
          return true;
        }
        stackIn_10_0 = ((!(param1 < 65) &&
          !(90 < param1)) ||
          (!(param1 < 97) &&
          !(param1 > 122)));
        return stackIn_10_0;
    }

    final void b(int param0, byte param1, int param2) {
        this.field_G = param0;
        this.field_J = param2 >> 1 & 8355711;
        this.field_F = param2;
        this.field_H = 8355711 & param0 >> 1;
        if (param1 != 94) {
          this.field_P = (cn) null;
        }
        this.a(-370091864);
    }

    private uc(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_G = param6;
        this.field_H = param8;
        this.field_B = param4;
        this.field_F = param5;
        this.field_J = param7;
        this.b(0, param2, param1, param0, param3);
    }

    private final void a(int param0) {
        if (param0 != -370091864) {
          field_Q = (String) null;
        }
        this.field_M = new cn[]{this.b(this.field_G, -123, this.field_F), this.b(this.field_H, -88, this.field_J)};
        this.field_D = this.b(true);
        this.field_T = this.field_D.b();
        this.field_P = new cn(this.field_s >> 1, this.field_s);
    }

    static {
        field_L = "Waiting for animations";
        field_Q = "Aged by goblin standards, the goblin scout didn't get that way through reckless bravery, but though cowardly, he can generally find a way out of any situation.";
        field_C = "My Dungeon";
    }
}
