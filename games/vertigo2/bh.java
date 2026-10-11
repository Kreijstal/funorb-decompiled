/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    private boolean field_C;
    int field_K;
    private boolean field_B;
    static String field_F;
    private int[] field_x;
    private int[] field_k;
    wo[] field_f;
    static fe[] field_y;
    private int[] field_q;
    int field_p;
    static int field_c;
    int field_d;
    private int[] field_G;
    private nj field_r;
    static java.awt.Color field_M;
    int field_E;
    int field_z;
    int field_D;
    int field_A;
    private int[] field_j;
    private boolean field_J;
    private int field_L;
    private int field_o;
    static byte[][] field_g;
    int field_v;
    int field_I;
    private int field_e;
    private boolean field_l;
    private rn[] field_i;
    int field_w;
    int field_n;
    private int[] field_u;
    static String field_H;
    private jg[] field_b;
    private int field_t;
    static er[] field_a;
    boolean field_m;
    int field_h;
    private boolean field_s;

    final rn[] m(int param0) {
        if (param0 != 9384) {
          this.field_x = (int[]) null;
        }
        return this.field_i;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        jg stackIn_25_0 = null;
        jg stackIn_43_0 = null;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= 0 &&
          null == this.field_b[param1]) {
          var5 = this.field_i[param0].field_h;
          var6 = this.field_i[param0].field_r;
          var7 = this.field_i[param0].field_o;
          if (this.field_i[param0].field_A == 2) {
            for (var8 = var5; var8 >= 0; var8--) {
              if (null == this.a((byte) 108, var6, var8, var7)) {
                this.field_i[param0].field_x = 128 * var8;
                continue;
              }
              break;
            }
            this.field_i[param0].field_D = this.a(var8, var6, (byte) -99, var7);
          }
          if (this.field_i[param0].field_A == 3) {
            for (var8Lifetime2 = var6; var8Lifetime2 >= 0; var8Lifetime2--) {
              if (null == this.a((byte) 108, var8Lifetime2, var5, var7)) {
                this.field_i[param0].field_x = var8Lifetime2 * 128;
                continue;
              }
              break;
            }
            this.field_i[param0].field_D = this.a(var5, var8Lifetime2, (byte) -115, var7);
          }
          if (this.field_i[param0].field_A == 4) {
            for (var8Lifetime3 = var7; var8Lifetime3 >= 0; var8Lifetime3--) {
              if (this.a((byte) 108, var6, var5, var8Lifetime3) == null) {
                this.field_i[param0].field_x = -240 + 240 * var8Lifetime3 + 47;
                continue;
              }
              break;
            }
            this.field_i[param0].field_D = this.a(var5, var6, (byte) -99, var8Lifetime3);
          }
        }
        if (param2 != 2) {
          return;
        }
        if (param3 >= 0) {
          stackIn_25_0 = this.field_b[param3];
          if (stackIn_25_0 == null) {
            var5Lifetime1 = this.field_i[param0].field_h;
            var6Lifetime1 = this.field_i[param0].field_r;
            var7Lifetime1 = this.field_i[param0].field_o;
            if (2 == this.field_i[param0].field_A) {
              for (var8Lifetime1 = var5Lifetime1; var8Lifetime1 < 5; var8Lifetime1++) {
                if (null == this.a((byte) 108, var6Lifetime1, var8Lifetime1, var7Lifetime1)) {
                  this.field_i[param0].field_B = 128 * var8Lifetime1;
                  continue;
                }
                break;
              }
              this.field_i[param0].field_E = this.a(var8Lifetime1, var6Lifetime1, (byte) -113, var7Lifetime1);
            }
            if (this.field_i[param0].field_A == 3) {
              for (var8Lifetime1Lifetime1 = var6Lifetime1; var8Lifetime1Lifetime1 < 5; var8Lifetime1Lifetime1++) {
                if (this.a((byte) 108, var8Lifetime1Lifetime1, var5Lifetime1, var7Lifetime1) == null) {
                  this.field_i[param0].field_B = var8Lifetime1Lifetime1 * 128;
                  continue;
                }
                break;
              }
              this.field_i[param0].field_E = this.a(var5Lifetime1, var8Lifetime1Lifetime1, (byte) -123, var7Lifetime1);
            }
            if (this.field_i[param0].field_A == 4) {
              for (var8Lifetime1Lifetime2 = var7Lifetime1; var8Lifetime1Lifetime2 < 15; var8Lifetime1Lifetime2++) {
                stackIn_43_0 = this.a((byte) 108, var6Lifetime1, var5Lifetime1, var8Lifetime1Lifetime2);
                if (stackIn_43_0 == null) {
                  this.field_i[param0].field_B = -47 + var8Lifetime1Lifetime2 * 240 + 240;
                  continue;
                }
                break;
              }
              this.field_i[param0].field_E = this.a(var5Lifetime1, var6Lifetime1, (byte) -73, var8Lifetime1Lifetime2);
            }
          }
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var10 = 0;
        jg stackIn_121_0 = null;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        String stackIn_143_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        wo var5_ref_wo = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jg var8_ref_jg = null;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        wo var15 = null;
        int[] var16 = null;
        jg var17 = null;
        jg var18 = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var7Lifetime1Lifetime1;
        int var9Lifetime5Lifetime1;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          param2.field_u = 0;
          this.field_e = 0;
          this.field_n = 0;
          this.field_s = true;
          var15 = this.field_f[0];
          var15.field_a = -64 + 128 * param2.h(-11);
          var15.field_I = 128 * param2.h(-11) - 64;
          var15.field_m = -240 + 240 * param2.h(-11) - 120;
          if (0 != this.field_w &&
            3 != this.field_w) {
            var5_ref_wo = this.field_f[1];
            var5_ref_wo.field_a = param2.h(-11) * 128 - 64;
            var5_ref_wo.field_I = param2.h(-11) * 128 - 64;
            var5_ref_wo.field_m = -120 + (param2.h(-11) - 1) * 240;
            if (param1 == 19 &&
              this.field_w == 2) {
              var5_ref_wo.field_a = var15.field_a - 256;
              var5_ref_wo.field_I = -256 + var15.field_I;
            }
          } else {
            if (1 < this.field_f.length) {
              var5_ref_wo = this.field_f[1];
              var5_ref_wo.field_a = 320;
              var5_ref_wo.field_m = 1800;
              var5_ref_wo.field_I = 320;
            }
          }
          if (2 == this.field_w) {
            param2.h(-11);
            this.field_I = nn.field_s[param1] * 50;
          }
          this.field_t = 0;
          this.field_h = -2147483648;
          this.field_D = 2147483647;
          this.field_v = 2147483647;
          this.field_K = -2147483648;
          this.field_A = -2147483648;
          this.field_z = 2147483647;
          this.field_L = 0;
          for (var5 = 0; var5 < 15; var5++) {
            for (var6 = 0; var6 < 5; var6++) {
              for (var7 = 0; var7 < 5; var7++) {
                var8 = param2.h(-11);
                if (21 == var8) {
                  var8 = 4;
                }
                if (var8 == 0) {
                  fieldTemp$0 = this.field_L;
                  this.field_L = this.field_L + 1;
                  this.field_b[fieldTemp$0] = null;
                } else {
                  if (31 <= var8) {
                    var8 = 4;
                  }
                  fieldTemp$1 = this.field_L;
                  this.field_L = this.field_L + 1;
                  this.field_b[fieldTemp$1] = new jg(var8, var7 * 128, 128 * var6, 240 * var5);
                  if (this.field_h < var7) {
                    this.field_h = var7;
                  }
                  if (this.field_z > var5) {
                    this.field_z = var5;
                  }
                  if (this.field_K < var6) {
                    this.field_K = var6;
                  }
                  if (var7 < this.field_D) {
                    this.field_D = var7;
                  }
                  if (this.field_v > var6) {
                    this.field_v = var6;
                  }
                  if (this.field_A < var5) {
                    this.field_A = var5;
                  }
                }
              }
            }
          }
          if (this.field_w == 1 &&
            param1 == 26) {
            this.a((byte) 108, 2, 0, 9).a(5, (byte) -122);
          } else if (1 == this.field_w &&
            param1 == 29) {
            this.a((byte) 108, 0, 2, 12).a(5, (byte) -126);
          } else if (2 == this.field_w &&
            param1 == 19) {
            var16 = new int[]{0, 0, 0, 4, 3, 0, 0, 0, 3, 4, 0, 0, 14, 0, 0, 3, 4, 0, 0, 0, 4, 3, 0, 0, 0};
            var6Lifetime1 = 0;
            for (var7Lifetime1 = 0; this.field_L > var7Lifetime1; var7Lifetime1++) {
              if (this.field_b[var7Lifetime1] != null &&
                this.field_b[var7Lifetime1].field_o == 0) {
                this.field_b[var7Lifetime1] = null;
              }
            }
            for (var7Lifetime1Lifetime1 = 0; 5 > var7Lifetime1Lifetime1; var7Lifetime1Lifetime1++) {
              for (var8Lifetime1 = 0; 5 > var8Lifetime1; var8Lifetime1++) {
                var9 = var8Lifetime1 + var7Lifetime1Lifetime1 * 5;
                if (0 != var16[var9]) {
                  if (9 > var6Lifetime1) {
                    this.field_b[var9] = new jg(var16[var9], var8Lifetime1 * 128, 128 * var7Lifetime1Lifetime1, 0);
                    var6Lifetime1++;
                  } else {
                    this.field_b[var9] = null;
                  }
                }
              }
            }
          } else {
            if (2 == this.field_w &&
              param1 == 26) {
              var17 = this.a((byte) 108, 2, 4, 7);
              if (var17 != null) {
                var17.a(4, (byte) -128);
              }
              var18 = this.a((byte) 108, 2, 0, 7);
              if (var18 != null) {
                var18.a(3, (byte) -124);
              }
            }
          }
          this.field_v = this.field_v * 128;
          this.field_D = this.field_D * 128;
          var5Lifetime1 = 12 / ((22 - param0) / 41);
          this.field_A = this.field_A * 240;
          this.field_z = this.field_z * 240;
          this.field_K = this.field_K * 128;
          this.field_h = this.field_h * 128;
          var6Lifetime2 = param2.field_u;
          param2.field_u = param2.field_u + 375;
          this.field_o = param2.h(-11);
          for (var7Lifetime2 = 0; this.field_o > var7Lifetime2; var7Lifetime2++) {
            this.field_q[var7Lifetime2] = param2.g(80);
            this.field_u[var7Lifetime2] = param2.g(82);
            this.field_G[var7Lifetime2] = param2.g(122);
            this.field_j[var7Lifetime2] = param2.g(96);
            this.field_x[var7Lifetime2] = param2.g(81);
            this.field_k[var7Lifetime2] = param2.g(110);
            var8_ref_jg = this.a((byte) 108, this.field_x[var7Lifetime2] - 1, -1 + this.field_j[var7Lifetime2], -1 + this.field_k[var7Lifetime2]);
            if (var8_ref_jg != null) {
              if (var8_ref_jg.field_p == 4) {
                var8_ref_jg.a(25, (byte) -124);
              } else {
                if (var8_ref_jg.field_p == 3) {
                  var8_ref_jg.a(26, (byte) -123);
                }
              }
            }
          }
          var7Lifetime3 = 6 + param2.field_u;
          param2.field_u = var6Lifetime2;
          this.field_t = 0;
          for (var8Lifetime2 = 0; 15 > var8Lifetime2; var8Lifetime2++) {
            for (var9Lifetime1 = 0; var9Lifetime1 < 5; var9Lifetime1++) {
              for (var10 = 0; 5 > var10; var10++) {
                var11 = param2.h(-11);
                if (var11 > 1) {
                  var12 = -1;
                  if (var11 == 5) {
                    var6Lifetime3 = param2.field_u;
                    param2.field_u = var7Lifetime3;
                    var12 = 3 * param2.h(-11) / 2;
                    var7Lifetime3 = param2.field_u;
                    param2.field_u = var6Lifetime3;
                  }
                  var13 = this.a(var10, var9Lifetime1, (byte) -124, var8Lifetime2);
                  if (var11 == 10) {
                    System.out.println("T10 on this level");
                  }
                  this.field_i[this.field_t] = new rn(this.field_b[var13].field_p, this.field_b[var13].field_l, this.field_b[var13].field_g, this.field_b[var13].field_s, var11, var12);
                  this.field_b[var13] = null;
                  this.field_t = this.field_t + 1;
                }
              }
            }
          }
          var8Lifetime3 = 0;
          for (var9Lifetime2 = 0; var9Lifetime2 < 375; var9Lifetime2++) {
            if (this.field_b[var9Lifetime2] != null) {
              continue;
            }
            var8Lifetime3 = var9Lifetime2;
            break;
          }
          for (var9Lifetime3 = 0; this.field_t > var9Lifetime3; var9Lifetime3++) {
            this.a(var9Lifetime3, var8Lifetime3, 2, var8Lifetime3);
          }
          for (var9Lifetime4 = 0; var9Lifetime4 < this.field_f.length; var9Lifetime4++) {
            this.field_f[var9Lifetime4].b(false);
          }
          if (3 == this.field_w) {
            for (var9Lifetime5 = 0; var9Lifetime5 < this.field_L; var9Lifetime5++) {
              stackIn_121_0 = this.field_b[var9Lifetime5];
              if (stackIn_121_0 != null && (this.field_b[var9Lifetime5].field_p == 12 ||
                this.field_b[var9Lifetime5].field_p == 9 ||
                this.field_b[var9Lifetime5].field_p == 19)) {
                this.field_b[var9Lifetime5].a(27, (byte) -123);
              }
            }
            for (var9Lifetime5Lifetime1 = 0; this.field_t > var9Lifetime5Lifetime1; var9Lifetime5Lifetime1++) {
              if (null != this.field_i[var9Lifetime5Lifetime1] && (this.field_i[var9Lifetime5Lifetime1].field_p == 12 ||
                this.field_i[var9Lifetime5Lifetime1].field_p == 9 ||
                this.field_i[var9Lifetime5Lifetime1].field_p == 19)) {
                this.field_i[var9Lifetime5Lifetime1].a(27, (byte) -122);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_142_0 = var4;
          stackIn_142_1 = new StringBuilder().append("bh.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_143_2 = "null";
          } else {
            stackIn_143_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_142_0), ((StringBuilder) (Object) stackIn_142_1).append(stackIn_143_2).append(')').toString());
        }
    }

    final int e(byte param0) {
        int var2 = -7 / ((param0 + 49) / 57);
        return this.field_t;
    }

    final int g(int param0) {
        int stackIn_7_0;
        int stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_8_4;
        int stackIn_19_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var4Lifetime2;
        var6 = Vertigo2.field_L ? 1 : 0;
        var2 = 0;
        var3 = this.field_f.length;
        for (var4 = 0; var4 < var3; var4++) {
          var2 = var2 + (3600 * this.field_f[var4].field_y + (this.field_f[var4].field_E + 640 * this.field_f[var4].field_k));
          var2 = var2 + (this.field_f[var4].field_c + (this.field_f[var4].field_O * 3600 + 640 * this.field_f[var4].c((byte) -127)));
        }
        for (var4Lifetime1 = 0; this.field_t > var4Lifetime1; var4Lifetime1++) {
          stackIn_7_0 = var2;
          stackIn_7_1 = 100;
          stackIn_7_2 = this.field_i[var4Lifetime1].field_l;
          stackIn_7_3 = -(640 * this.field_i[var4Lifetime1].field_g) - 3600 * this.field_i[var4Lifetime1].field_s;
          if (this.field_i[var4Lifetime1].b((byte) -113)) {
            stackIn_8_4 = 999;
          } else {
            stackIn_8_4 = 0;
          }
          var2 = stackIn_7_0 + (stackIn_7_1 * (stackIn_7_2 - (stackIn_7_3 - stackIn_8_4)) * (var4Lifetime1 + var3) + this.field_i[var4Lifetime1].field_k * 10000 + this.field_i[var4Lifetime1].field_v * 10000);
        }
        for (var4Lifetime2 = 0; this.field_L > var4Lifetime2; var4Lifetime2++) {
          if (null != this.field_b[var4Lifetime2]) {
            if (4 == this.field_b[var4Lifetime2].field_h + this.field_b[var4Lifetime2].field_r + this.field_b[var4Lifetime2].field_o + this.field_b[var4Lifetime2].field_p) {
              stackIn_19_0 = 1;
            } else {
              stackIn_19_0 = (this.field_b[var4Lifetime2].field_p == 3) ? 2 : 3;
            }
            var5 = stackIn_19_0;
            var2 = var2 + 1000 * ((this.field_L + (var4Lifetime2 + (this.field_t + var3))) * var5);
          }
        }
        if (param0 < 96) {
          this.field_B = true;
        }
        return var2;
    }

    private final void j(int param0) {
        this.field_s = false;
        if (param0 != 0) {
          this.a(-78, -35, 41, -14);
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3_int = 0;
        fa var3;
        jg var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        jg var13;
        jg var14;
        jg var15;
        var12 = Vertigo2.field_L ? 1 : 0;
        if (!this.field_l) {
          return;
        }
        if (null == this.field_r) {
          this.field_r = new nj();
        }
        if (0 == this.field_r.c(true)) {
          for (var3_int = 0; var3_int < this.field_L; var3_int++) {
            var14 = this.field_b[var3_int];
            if (var14 != null && (var14.field_p == 3 ||
              var14.field_p == 4)) {
              this.field_r.a(new fa(var3_int), false);
            }
          }
        }
        if (this.field_r.c(true) > 0) {
          var3 = (fa) (this.field_r.a((byte) 100));
          while (var3 != null) {
            boolean decompiledFrameRemainder0 = true;
            var13 = this.field_b[var3.field_n];
            var15 = var13;
            var4 = var15;
            if (var4 != null) {
              var5 = -this.field_f[0].field_E + var15.field_l;
              var6 = var13.field_g - this.field_f[0].field_y;
              var7 = var13.field_s - this.field_f[0].field_k;
              var8 = -this.field_f[1].field_E + var15.field_l;
              var9 = -this.field_f[1].field_y + var15.field_g;
              var10 = -this.field_f[1].field_k + var15.field_s;
              var11 = 147456;
              if ((param0) &&
                (decompiledFrameRemainder0 = !(var11 > var5 * var5 + var6 * var6 + var7 * var7))) {
                decompiledFrameRemainder0 = !(var10 * var10 + (var8 * var8 + var9 * var9) < var11);
              }
              if (decompiledFrameRemainder0) {
                var3.c(2);
                if (var15.field_p != 4) {
                  var4.field_p = 30;
                  return;
                }
                var4.field_p = 29;
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              var3.c(2);
            }
            var3 = (fa) (this.field_r.b(24));
          }
        }
        this.field_r.c(0);
        if (param1 < 75) {
          return;
        }
        this.a(false, (byte) 119);
    }

    final boolean c(byte param0) {
        int discarded$1 = 0;
        boolean stackIn_8_0 = false;
        if (param0 != 104) {
          discarded$1 = this.b(50, false);
        }
        stackIn_8_0 = (6 != this.field_e) && (this.field_e != 7) && (this.field_e != 3) && (4 != this.field_e);
        return stackIn_8_0;
    }

    final void a(wo[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param2 != -22747) {
            return;
          }
          for (var4_int = 0; var4_int < param0.length; var4_int++) {
            if (param1 != var4_int) {
              this.field_f[var4_int].a(param0[var4_int], param2 + 16799962);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("bh.W(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int l(int param0) {
        int var2 = -90 % ((-13 - param0) / 56);
        return this.field_L;
    }

    final void a(mi param0, int param1) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int var9 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          param0.p(param1 + 0);
          this.field_I = param0.c((byte) -115, 14);
          this.field_e = param0.c((byte) -94, 3);
          var3_int = 1;
          if (this.field_e == 7 ||
            6 == this.field_e ||
            this.field_e == 4 ||
            this.field_e == 3) {
            this.b((byte) -112);
            var3_int = 0;
          }
          this.field_n = param0.c((byte) -93, 8);
          for (var4 = 0; this.field_f.length > var4; var4++) {
            this.field_f[var4].a(0, param0);
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (var3_int == 0) {
            param0.b((byte) -76);
            var4 = 0;
            var5 = param1;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var5 >= 375))) {
              if (null != this.field_b[var5]) {
                var5++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              decompiledFrameCompleted0 = false;
            }
            if (decompiledFrameCompleted0) {
              var4 = var5;
              decompiledFrameRemainder0 = false;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            var4 = 0;
            for (var5Lifetime2 = 0; var5Lifetime2 < 15; var5Lifetime2++) {
              for (var6 = 0; var6 < 5; var6++) {
                for (var7 = 0; 5 > var7; var7++) {
                  var8 = param0.c((byte) -125, 5);
                  if (var8 == 0) {
                    incrementValue$0 = var4;
                    var4++;
                    this.field_b[incrementValue$0] = null;
                  } else {
                    incrementValue$1 = var4;
                    var4++;
                    this.field_b[incrementValue$1] = new jg(var8, 128 * var7, 128 * var6, var5Lifetime2 * 240);
                  }
                  if (this.field_L > var4) {
                    continue;
                  }
                  break;
                }
              }
            }
            this.field_t = param0.c((byte) -117, 9);
            for (var5Lifetime2 = 0; this.field_t > var5Lifetime2; var5Lifetime2++) {
              this.field_i[var5Lifetime2] = new rn(param0);
            }
            param0.b((byte) -76);
            var4 = 0;
            var5Lifetime2 = param1;
            while (var5Lifetime2 < 375) {
              if (null != this.field_b[var5Lifetime2]) {
                var5Lifetime2++;
                continue;
              }
              var4 = var5Lifetime2;
              break;
            }
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < this.field_t; var5Lifetime1++) {
            this.a(var5Lifetime1, var4, 2, var4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("bh.FA(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_F = null;
        field_a = null;
        field_y = null;
        field_g = (byte[][]) null;
        field_H = null;
        if (param0 != 0) {
          field_g = (byte[][]) null;
        }
        field_M = null;
    }

    private final void a(int param0, boolean param1, int param2, int param3, wo param4) {
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rn var13 = null;
        int var8Lifetime1;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_e != 1) {
            return;
          }
          if (param2 != 27228) {
            this.field_w = 87;
          }
          var13 = this.field_i[param0];
          var7 = var13.a(param4, (byte) -91) ? 1 : 0;
          var10 = param3;
          if (var10 == 15) {
            if (0 <= param4.c((byte) -128) &&
              var7 != 0) {
              var13.a(23, (byte) -128);
            }
          } else {
            if (var10 != 23) {
              if (17 == var10) {
                var8 = var13.field_l + 64;
                var9 = 64 + var13.field_g;
                param4.a(false, var8, var9);
              } else {
                if (var10 == 9) {
                  this.field_s = true;
                  var13.a(27, (byte) -127);
                  param4.field_c = 0;
                  param4.field_O = 0;
                } else {
                  if (var10 == 19) {
                    if (var7 != 0) {
                      var12 = 0;
                      var10 = var12;
                      while (var12 < this.field_f.length) {
                        if (param4 != this.field_f[var12]) {
                          this.field_f[var12].d((byte) 4);
                        }
                        var12++;
                      }
                    }
                  } else {
                    if (var10 == 6 &&
                      var7 != 0 &&
                      var13.field_A == 5) {
                      var13.field_t = 500;
                      var13.field_k = (short) 0;
                    }
                  }
                }
              }
            } else {
              if (var7 != 0) {
                var13.a(23, (byte) -125);
                var13.field_k = (short) 0;
              }
            }
          }
          var8Lifetime1 = param4.a(param0, var7 != 0, this.field_w, param1, var13.field_p, param2 ^ 11421);
          if (var8Lifetime1 >= 0 &&
            var8Lifetime1 != var13.field_p) {
            var13.a(var8Lifetime1, true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_39_0 = var6;
          stackIn_39_1 = new StringBuilder().append("bh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        int discarded$0 = 0;
        if (param0 != -15531) {
          wo var3 = (wo) null;
          discarded$0 = this.a(-76, false, 34, true, (wo) null);
        }
        return this.field_B;
    }

    final boolean a(boolean param0, boolean[] param1, int param2, int[] param3, boolean param4) {
        int stackIn_17_0 = 0;
        int stackIn_131_0 = 0;
        wo stackIn_194_0 = null;
        int stackIn_194_1 = 0;
        boolean stackIn_196_2 = false;
        jg stackIn_229_0 = null;
        RuntimeException stackIn_276_0 = null;
        StringBuilder stackIn_276_1 = null;
        String stackIn_277_2 = null;
        StringBuilder stackIn_279_1 = null;
        String stackIn_280_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wo var10_ref_wo = null;
        int var11 = 0;
        rn var12_ref_rn = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var12Lifetime1;
        int var10Lifetime4;
        int var11Lifetime1Lifetime1;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          this.field_n = this.field_n + 1;
          for (var6_int = 0; this.field_f.length > var6_int; var6_int++) {
            if (!param1[var6_int]) {
              this.field_f[var6_int].g(param2 ^ -247);
            }
          }
          if (this.field_w != 0 &&
            this.field_w != 3) {
            stackIn_17_0 = 0;
          } else {
            if (this.field_n > 10) {
              stackIn_17_0 = (jq.a((byte) 29) < 10) ? 1 : 0;
            } else {
              stackIn_17_0 = 0;
            }
          }
          var6_intLifetime1 = stackIn_17_0;
          var7 = this.field_e;
          if (var7 != 0) {
            if (var7 != 2) {
              if (var7 != 6) {
                if (var7 == 7) {
                  if (this.field_n < 50) {
                    for (var7 = 0; this.field_f.length > var7; var7++) {
                      this.field_f[var7].b(0, -7394);
                    }
                  } else {
                    this.field_t = 0;
                    this.field_L = 0;
                    if (!this.field_C &&
                      param4 &&
                      this.field_n == 50) {
                      gm.a(27, (byte) -55);
                    }
                  }
                  for (var7 = 0; var7 < param3.length; var7++) {
                    param3[var7] = 0;
                  }
                } else {
                  if (var7 != 3) {
                    if (4 == var7) {
                      if (this.field_n > 10 &&
                        jq.a((byte) 29) < 10) {
                        this.field_e = 7;
                        if (!this.field_C &&
                          param4) {
                          qg.a(1, 250, 28, 0);
                        }
                      }
                    } else {
                      if (5 == var7) {
                        if (this.field_n == 50) {
                          if (this.field_w != 2) {
                            return true;
                          }
                          if (on.a((byte) -90, 0)) {
                            this.a(true, (byte) 79);
                          }
                        }
                      } else {
                        if (var7 == 1 && (this.field_w == 0 ||
                          this.field_w == 3) && this.field_n < 10) {
                          param3[0] = b.a(param3[0], -2);
                        }
                      }
                    }
                  } else {
                    if (!this.field_C &&
                      this.field_n > 10 &&
                      jq.a((byte) 29) < 10) {
                      if (this.field_w == 0) {
                        ln.field_d.a(2, false);
                        lc.field_d = false;
                        an.field_c = true;
                      } else {
                        if (am.field_b) {
                          if (lc.field_b == am.field_n) {
                            gj.a((byte) 102, false, am.field_n, 15);
                          }
                        } else {
                          if (ed.field_q) {
                            bs.a(11, (byte) -47, 0);
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                if (0 == this.field_w) {
                  if (this.field_n > 10 &&
                    jq.a((byte) 29) < 10 &&
                    !this.field_f[0].f(-1)) {
                    this.field_e = 7;
                    if (!this.field_C &&
                      param4) {
                      qg.a(1, 250, 28, 0);
                    }
                    this.field_n = 0;
                  }
                } else {
                  if (this.field_n == 250) {
                    this.field_e = 7;
                    this.field_n = 0;
                  }
                }
              }
            } else {
              if (this.field_n < 50) {
                for (var7 = 0; var7 < this.field_f.length; var7++) {
                  this.field_f[var7].b(0, -7394);
                }
              } else {
                this.field_L = 0;
                this.field_t = 0;
              }
              if (this.field_n == 100 &&
                this.field_w != 3) {
                for (var7 = 0; this.field_f.length > var7; var7++) {
                  this.field_f[var7].a((byte) -88);
                }
                if (!this.field_m) {
                  this.field_e = 6;
                } else {
                  this.field_e = 4;
                }
                this.field_n = 0;
                this.b((byte) -106);
              }
            }
          } else {
            if (this.field_n != 200 &&
              var6_intLifetime1 == 0) {
              this.field_s = true;
            } else {
              this.field_n = 0;
              this.field_s = false;
              param3[0] = 0;
              this.field_e = 1;
              if (param0 &&
                on.a((byte) -105, 0) &&
                this.field_w == 2) {
                if (null != this.field_r) {
                  this.field_r.c(0);
                }
                this.a(true, (byte) 116);
              }
            }
          }
          var7Lifetime1 = 0;
          var8 = 0;
          for (var9 = 0; var9 < this.field_L; var9++) {
            if (this.field_b[var9] != null) {
              this.field_b[var9].field_d = (byte) 0;
              if (this.field_b[var9].field_p == 1 ||
                this.field_b[var9].field_p == 2 ||
                this.field_b[var9].field_p == 7) {
                var10 = 0;
                for (var11 = 0; var11 < this.field_f.length; var11++) {
                  if (128 <= Math.abs(this.field_b[var9].field_s - this.field_f[var11].field_k)) {
                    continue;
                  }
                  var10 = 1;
                  if (this.field_b[var9].field_p == 7) {
                    var8 = 1;
                  } else {
                    var7Lifetime1 = 1;
                  }
                  break;
                }
                if (var10 != 0) {
                  this.field_b[var9].c(false);
                } else {
                  this.field_b[var9].c(0);
                }
              }
              stackIn_131_0 = (!this.field_b[var9].b(7579)) ? 0 : 1;
              var10Lifetime4 = stackIn_131_0;
              if (this.field_b[var9].field_p == 22 &&
                this.field_b[var9].field_k > 50) {
                this.a(this.field_b[var9].field_s, 2, 54, this.field_b[var9].field_g + 64, this.field_b[var9].field_l + 64, param4);
              }
              if (var10Lifetime4 != 0) {
                this.field_b[var9] = null;
              }
            }
          }
          if (!this.field_C &&
            param4) {
            if (var8 == 0) {
              mn.b(6, 1);
            } else {
              fr.a(1, 83);
            }
            if (var7Lifetime1 == 0) {
              mn.b(param2 ^ 134, 0);
            } else {
              fr.a(0, 127);
            }
          }
          for (var9Lifetime1 = 0; var9Lifetime1 < this.field_t; var9Lifetime1++) {
            this.field_i[var9Lifetime1].field_d = (byte) 0;
            if (this.field_i[var9Lifetime1].field_p == 1 ||
              this.field_i[var9Lifetime1].field_p == 2) {
              var10Lifetime1 = 0;
              for (var11Lifetime1 = 0; var11Lifetime1 < this.field_f.length; var11Lifetime1++) {
                if (this.field_i[var9Lifetime1].a(this.field_f[var11Lifetime1].field_y, -98, this.field_f[var11Lifetime1].field_E, this.field_f[var11Lifetime1].field_k) >= 57600) {
                  continue;
                }
                var10Lifetime1 = 1;
                break;
              }
              if (var10Lifetime1 == 0) {
                this.field_i[var9Lifetime1].c(0);
              } else {
                this.field_i[var9Lifetime1].c(false);
              }
            }
            if (!this.field_i[var9Lifetime1].b(7579)) {
              var11Lifetime1Lifetime1 = this.field_i[var9Lifetime1].field_D;
              var12 = this.field_i[var9Lifetime1].field_E;
              this.a(var9Lifetime1, var11Lifetime1Lifetime1, param2 - 126, var12);
              if (this.field_i[var9Lifetime1].field_B == this.field_i[var9Lifetime1].field_x) {
                this.field_i[var9Lifetime1].field_v = 0;
              }
              if (22 == this.field_i[var9Lifetime1].field_p &&
                50 < this.field_i[var9Lifetime1].field_k) {
                this.a(this.field_i[var9Lifetime1].field_s, 2, 119, 64 + this.field_i[var9Lifetime1].field_g, 64 + this.field_i[var9Lifetime1].field_l, param4);
              }
            } else {
              this.a(var9Lifetime1, false);
            }
          }
          if (this.field_e != 0) {
            this.field_I = this.field_I - 1;
          }
          for (var9Lifetime2 = 0; this.field_f.length > var9Lifetime2; var9Lifetime2++) {
            if (!param1[var9Lifetime2]) {
              var10_ref_wo = this.field_f[var9Lifetime2];
              var11Lifetime2 = 0;
              if (var9Lifetime2 < param3.length) {
                var11Lifetime2 = param3[var9Lifetime2];
              }
              if (wo.a(var11Lifetime2, param2 - 29401)) {
                if (this.e(5)) {
                  this.j(0);
                } else {
                  var10_ref_wo.c(3);
                }
              }
              if (this.e(5)) {
                var10_ref_wo.a((byte) 68, 0);
              } else {
                var10_ref_wo.a((byte) 86, qm.a(var11Lifetime2, (byte) -115));
                if (he.a((byte) -100, var11Lifetime2)) {
                  var10_ref_wo.e((byte) -122);
                }
              }
              if (var10_ref_wo.j((byte) 114)) {
                this.a(var10_ref_wo.field_k, var10_ref_wo.field_w, param2 ^ 176, var10_ref_wo.field_y, var10_ref_wo.field_E, param4);
              }
              stackIn_194_0 = var10_ref_wo;
              stackIn_194_1 = 80;
              stackIn_196_2 = (this.field_e == 1) || (this.field_e == 5);
              ((wo) (Object) stackIn_194_0).a((byte) stackIn_194_1, stackIn_196_2);
              this.a(var9Lifetime2, var10_ref_wo, param4, (byte) -91);
              if (var10_ref_wo.field_d != -1) {
                var12_ref_rn = this.field_i[var10_ref_wo.field_d];
                if (var12_ref_rn != null) {
                  var10_ref_wo.field_E = 64 + var12_ref_rn.field_l;
                  var10_ref_wo.field_k = var12_ref_rn.field_s;
                  var10_ref_wo.field_y = var12_ref_rn.field_g + 64;
                }
              }
              if (this.field_e != 3 &&
                var10_ref_wo.f((byte) 72)) {
                this.field_e = 3;
                if (this.field_w == 1) {
                  var14 = 0;
                  var12Lifetime1 = var14;
                  while (this.field_f.length > var14) {
                    this.field_f[var14].k(8);
                    var14++;
                  }
                }
                this.b((byte) -96);
                return false;
              }
              if (this.field_e == 1 &&
                var10_ref_wo.e(false) &&
                var10_ref_wo.i(param2 + 10821)) {
                if (this.field_w != 2) {
                  this.field_n = 0;
                  if (var9Lifetime2 != 0) {
                    this.field_B = true;
                  } else {
                    this.field_J = true;
                  }
                  this.field_e = 5;
                } else {
                  if (param0 &&
                    on.a((byte) -110, 0) &&
                    var10_ref_wo.k((byte) 102)) {
                    var10_ref_wo.d(param2 - 133);
                    this.a(true, (byte) 76);
                  }
                }
                if (var9Lifetime2 != 0) {
                  this.field_d = this.field_d + 1;
                } else {
                  this.field_p = this.field_p + 1;
                }
              }
            }
          }
          for (var9Lifetime3 = 0; this.field_L > var9Lifetime3; var9Lifetime3++) {
            stackIn_229_0 = this.field_b[var9Lifetime3];
            L28: {
              if (stackIn_229_0 != null &&
                this.field_b[var9Lifetime3].field_p == 23) {
                for (var10Lifetime2 = 0; this.field_f.length > var10Lifetime2; var10Lifetime2++) {
                  for (var11Lifetime3 = 0; 9 > var11Lifetime3; var11Lifetime3++) {
                    if (this.field_f[var10Lifetime2].field_L[var11Lifetime3] == var9Lifetime3) {
                      break L28;
                    }
                  }
                }
                if (!this.field_C &&
                  param4) {
                  gm.a(21, (byte) -55);
                }
                this.field_b[var9Lifetime3].a(28, (byte) -126);
              }
            }
          }
          if (param2 != 128) {
            this.field_d = 12;
          }
          for (var9Lifetime4 = 0; var9Lifetime4 < this.field_t; var9Lifetime4++) {
            L24: {
              if (this.field_i[var9Lifetime4].field_p == 23 &&
                this.field_i[var9Lifetime4].field_k > 20) {
                for (var10Lifetime3 = 0; this.field_f.length > var10Lifetime3; var10Lifetime3++) {
                  for (var11Lifetime4 = 0; var11Lifetime4 < 9; var11Lifetime4++) {
                    if (~var9Lifetime4 == ~this.field_f[var10Lifetime3].field_P[var11Lifetime4]) {
                      break L24;
                    }
                  }
                }
                if (!this.field_C &&
                  param4) {
                  gm.a(21, (byte) -55);
                }
                this.field_i[var9Lifetime4].a(28, (byte) -127);
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_276_0 = var6;
          stackIn_276_1 = new StringBuilder().append("bh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_277_2 = "null";
          } else {
            stackIn_277_2 = "{...}";
          }
          stackIn_279_1 = ((StringBuilder) (Object) stackIn_276_1).append(stackIn_277_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_280_2 = "null";
          } else {
            stackIn_280_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_276_0), ((StringBuilder) (Object) stackIn_279_1).append(stackIn_280_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean f(int param0) {
        if (param0 != 17940) {
          this.field_B = false;
        }
        return 1 == this.field_e ? true : false;
    }

    private final boolean e(int param0) {
        if (param0 != 5) {
          this.c((byte) 126);
        }
        return this.field_s;
    }

    final int h(int param0) {
        if (param0 != 9979) {
          return 87;
        }
        return this.field_e;
    }

    final boolean k(int param0) {
        if (param0 <= 68) {
          return false;
        }
        return this.field_J;
    }

    final void a(boolean param0, bh param1) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4Lifetime1;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var3_int = 0;
          if (param0) {
            return;
          }
          while (var3_int < this.field_f.length) {
            this.field_f[var3_int].a(param1.field_f[var3_int], 16777215);
            var4 = this.field_f[var3_int].field_H;
            mc.field_e = 1951;
            lj.field_k = 1986 + var4;
            sl.field_l = 1954;
            ci.field_b = 1982;
            var4Lifetime1 = this.field_f[var3_int].field_W;
            gi.field_u = var4Lifetime1 + 8768;
            aj.field_e = 5180;
            pn.field_R = 617;
            c.field_h = 9170;
            var3_int++;
          }
          this.field_L = param1.field_L;
          for (var3_intLifetime1 = 0; var3_intLifetime1 < 375; var3_intLifetime1++) {
            if (param1.field_b[var3_intLifetime1] != null) {
              if (this.field_b[var3_intLifetime1] != null) {
                this.field_b[var3_intLifetime1].a(param1.field_b[var3_intLifetime1], -88);
              } else {
                this.field_b[var3_intLifetime1] = new jg(param1.field_b[var3_intLifetime1]);
              }
            } else {
              this.field_b[var3_intLifetime1] = null;
            }
          }
          this.field_I = param1.field_I;
          this.field_w = param1.field_w;
          this.field_t = param1.field_t;
          for (var3_intLifetime2 = 0; this.field_t > var3_intLifetime2; var3_intLifetime2++) {
            if (null != this.field_i[var3_intLifetime2]) {
              this.field_i[var3_intLifetime2].a(param1.field_i[var3_intLifetime2], -95);
            } else {
              this.field_i[var3_intLifetime2] = new rn(param1.field_i[var3_intLifetime2]);
            }
          }
          this.field_J = param1.field_J;
          this.field_x = param1.field_x;
          this.field_D = param1.field_D;
          this.field_E = param1.field_E;
          this.field_K = param1.field_K;
          this.field_s = param1.field_s;
          this.field_B = param1.field_B;
          this.field_j = param1.field_j;
          this.field_A = param1.field_A;
          this.field_h = param1.field_h;
          this.field_u = param1.field_u;
          this.field_e = param1.field_e;
          this.field_C = param1.field_C;
          this.field_v = param1.field_v;
          this.field_n = param1.field_n;
          this.field_q = param1.field_q;
          this.field_p = param1.field_p;
          this.field_k = param1.field_k;
          this.field_d = param1.field_d;
          this.field_m = param1.field_m;
          this.field_z = param1.field_z;
          this.field_G = param1.field_G;
          this.field_o = param1.field_o;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("bh.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int param2, boolean param3, wo param4, int param5, int param6, byte param7) {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        jg var17 = null;
        jg var18 = null;
        jg var19 = null;
        jg var20 = null;
        int var21 = 0;
        int var10Lifetime1;
        var21 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!param3 &&
            param6 != 15 &&
            param6 != 16 &&
            param6 != 17 &&
            param6 != 23) {
            return;
          }
          if (this.field_e == 1) {
            var9_int = this.a(param5, param2, (byte) -82, param0);
            var12 = param6;
            if (var12 == 7) {
              for (var12 = 0; var12 < this.field_o; var12++) {
                if (1 + param5 == this.field_q[var12] &&
                  this.field_u[var12] == 1 + param2 &&
                  this.field_G[var12] == 1 + param0) {
                  var13 = -64 + this.field_j[var12] * 128;
                  var14 = -64 + 128 * this.field_x[var12];
                  var15 = (-1 + this.field_k[var12]) * 240;
                  param4.a(12649, param0 * 240, param2 * 128 + 64, var15, 64 + param5 * 128, var13, var14);
                  return;
                }
              }
            } else {
              if (var12 != 15) {
                if (var12 == 17) {
                  var11 = 128 * param2 + 64;
                  var10 = 128 * param5 + 64;
                  param4.a(false, var10, var11);
                  if (2 > param4.field_N) {
                    var12 = lj.a(param4.field_E - 40, false, 128);
                    var13 = lj.a(param4.field_E + 40, false, 128);
                    var14 = lj.a(param4.field_y + 40, false, 128);
                    var15 = lj.a(param4.field_y - 40, false, 128);
                    var16 = lj.a(param4.field_k, false, 240);
                    var17 = this.a((byte) 108, var15, var12, var16);
                    var18 = this.a((byte) 108, var15, var13, var16);
                    var19 = this.a((byte) 108, var14, var13, var16);
                    var20 = this.a((byte) 108, var14, var12, var16);
                    if (var17 != null &&
                      var17.field_p == 17 ||
                      var18 != null &&
                      17 == var18.field_p ||
                      var19 != null &&
                      var19.field_p == 17 ||
                      var20 != null &&
                      17 == var20.field_p) {
                      param4.field_N = 1;
                    }
                  }
                }
              } else {
                if (param4.c((byte) -127) >= 0) {
                  this.field_b[var9_int].a(23, (byte) -125);
                }
              }
            }
            if (param7 > -31) {
              this.field_q = (int[]) null;
            }
            var10Lifetime1 = this.a(param6, param1, 128, param3, param4);
            if (var10Lifetime1 >= 0) {
              if (param6 == var10Lifetime1) {
                return;
              }
              if (0 <= var9_int) {
                this.field_b[var9_int].a(var10Lifetime1, (byte) -127);
                return;
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_50_0 = var9;
          stackIn_50_1 = new StringBuilder().append("bh.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final int a(int param0, int param1, byte param2, int param3) {
        int var5;
        if (param0 >= 0 &&
          param1 >= 0 &&
          param0 < 5 &&
          param1 < 5 &&
          param3 >= 0 &&
          param3 < 15) {
          var5 = param3 * 25 + (param1 * 5 + param0);
          if (this.field_L <= var5) {
            return -1;
          }
          if (param2 < -62) {
            return var5;
          }
          return 70;
        }
        return -1;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        Object var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var18 = Vertigo2.field_L ? 1 : 0;
        var7 = null;
        var8 = param4 / 128;
        if (param2 < 37) {
          this.k(-108);
        }
        var9 = param3 / 128;
        if (!this.field_C) {
          var7 = this.a(false);
          ((ho) (var7)).field_j = param3;
          ((ho) (var7)).field_b = param4;
          ((ho) (var7)).field_c = param0;
          ((ho) (var7)).field_h = (byte)param1;
        }
        var10 = param0 / 240;
        var11 = 0;
        while (var11 < this.field_t) {
          var12 = this.field_i[var11].field_l;
          var13 = this.field_i[var11].field_g;
          var14 = this.field_i[var11].field_s;
          var15 = -var8 + (64 + var12) / 128;
          var16 = -var9 + (64 + var13) / 128;
          var17 = -var10 + (var14 + 120) / 240;
          if (-1 <= var15 &&
            1 >= var15 &&
            var16 >= -1 &&
            var16 <= 1 &&
            var17 >= -1 &&
            var17 <= 1) {
            if (var7 != null) {
              ((ho) (var7)).a(64 + var12, var13 + 64, var14, this.a(0, this.field_i[var11].field_p), -30439);
            }
            this.a(var11, false);
            var11--;
          }
          var11++;
        }
        for (var11Lifetime1 = 0; this.field_L > var11Lifetime1; var11Lifetime1++) {
          if (null != this.field_b[var11Lifetime1]) {
            var12Lifetime1 = this.field_b[var11Lifetime1].field_h;
            var13Lifetime1 = this.field_b[var11Lifetime1].field_r;
            var14Lifetime1 = this.field_b[var11Lifetime1].field_o;
            if (var14Lifetime1 == var10 &&
              (-var8 + var12Lifetime1) * (var12Lifetime1 - var8) <= 1 &&
              (-var9 + var13Lifetime1) * (var13Lifetime1 - var9) <= 1) {
              if (var7 != null) {
                ((ho) (var7)).a(64 + this.field_b[var11Lifetime1].field_l, this.field_b[var11Lifetime1].field_g + 64, this.field_b[var11Lifetime1].field_s, this.a(0, this.field_b[var11Lifetime1].field_p), -30439);
              }
              this.field_b[var11Lifetime1] = null;
            }
          }
        }
        if (!this.field_C &&
          param5) {
          gm.a(1, (byte) -55);
        }
    }

    private final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var10 = Vertigo2.field_L ? 1 : 0;
        this.field_n = 0;
        this.field_L = 375;
        this.field_t = 0;
        for (var2 = 0; var2 < this.field_L; var2++) {
          this.field_b[var2] = null;
        }
        if (this.field_w == 0 ||
          this.field_w == 3) {
          var2Lifetime1 = 0;
          var3 = 0;
          var4 = 0;
          var5 = var3 * 5 + (var2Lifetime1 + var4 * 25);
          if (this.field_b[var5] == null) {
            this.field_b[var5] = new jg(4, 0, 0, 0);
          }
          this.field_b[var5].a(4, (byte) -127);
          this.field_b[var5].field_h = var2Lifetime1;
          this.field_b[var5].field_r = var3;
          this.field_b[var5].field_o = var4;
          this.field_b[var5].field_l = 128 * var2Lifetime1;
          this.field_b[var5].field_g = 128 * var3;
          this.field_b[var5].field_s = var4 * 240;
          this.field_f[0].field_O = 0;
          this.field_f[0].field_c = 0;
          this.field_f[0].field_E = this.field_b[var5].field_l + 64;
          this.field_f[0].field_y = 64 + this.field_b[var5].field_g;
          this.field_f[0].field_k = -300;
          this.field_f[0].c(0, 10);
        }
        if (this.field_w == 1 ||
          this.field_w == 2) {
          var2Lifetime2 = 0;
          var3Lifetime1 = 2;
          var4Lifetime1 = 0;
          var5Lifetime1 = var3Lifetime1 * 5 + (var2Lifetime2 + 25 * var4Lifetime1);
          if (this.field_b[var5Lifetime1] == null) {
            this.field_b[var5Lifetime1] = new jg(4, 0, 0, 0);
          }
          this.field_b[var5Lifetime1].a(4, (byte) -125);
          this.field_b[var5Lifetime1].field_h = var2Lifetime2;
          this.field_b[var5Lifetime1].field_r = var3Lifetime1;
          this.field_b[var5Lifetime1].field_o = var4Lifetime1;
          this.field_b[var5Lifetime1].field_l = 128 * var2Lifetime2;
          this.field_b[var5Lifetime1].field_g = 128 * var3Lifetime1;
          this.field_b[var5Lifetime1].field_s = var4Lifetime1 * 240;
          this.field_f[0].field_O = 0;
          this.field_f[0].field_c = 0;
          this.field_f[0].field_E = 64 + this.field_b[var5Lifetime1].field_l;
          this.field_f[0].field_y = this.field_b[var5Lifetime1].field_g + 64;
          this.field_f[0].field_k = -300;
          this.field_f[0].c(0, 10);
          var6 = 2;
          var7 = 0;
          var8 = 0;
          var9 = 25 * var8 + (5 * var7 + var6);
          if (this.field_b[var9] == null) {
            this.field_b[var9] = new jg(3, 0, 0, 0);
          }
          this.field_b[var9].a(3, (byte) -123);
          this.field_b[var9].field_h = var6;
          this.field_b[var9].field_r = var7;
          this.field_b[var9].field_o = var8;
          this.field_b[var9].field_l = var6 * 128;
          this.field_b[var9].field_g = 128 * var7;
          this.field_b[var9].field_s = var8 * 240;
          this.field_f[0].field_O = 0;
          this.field_f[1].field_c = 0;
          this.field_f[1].field_E = 64 + this.field_b[var9].field_l;
          this.field_f[1].field_y = this.field_b[var9].field_g + 64;
          this.field_f[1].field_k = -300;
          this.field_f[1].c(512, 10);
        }
        if (param0 >= -79) {
          this.field_I = -89;
        }
    }

    final boolean d(int param0) {
        if (param0 != -2) {
          this.field_k = (int[]) null;
        }
        return this.field_s;
    }

    private final int a(int param0, boolean param1, int param2, boolean param3, wo param4) {
        int var6_int = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param2 != 128) {
            this.field_t = -85;
          }
          if (param4.a(703) &&
            1 == this.field_e) {
            if (param0 == 9) {
              this.field_s = true;
              param4.field_O = 0;
              param4.field_c = 0;
              stackIn_18_0 = 27;
              return stackIn_18_0;
            }
            if (param0 == 19 &&
              param3) {
              for (var6_int = 0; this.field_f.length > var6_int; var6_int++) {
                if (param4 != this.field_f[var6_int]) {
                  this.field_f[var6_int].d((byte) 4);
                }
              }
            }
            stackIn_20_0 = param4.a(-1, param3, this.field_w, param1, param0, 18113);
            return stackIn_20_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("bh.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final jg a(byte param0, int param1, int param2, int param3) {
        if (param2 < 0) {
          return null;
        }
        if (param1 < 0) {
          return null;
        }
        if (5 <= param2) {
          return null;
        }
        if (param1 >= 5) {
          return null;
        }
        if (0 > param3) {
          return null;
        }
        if (param3 >= 15) {
          return null;
        }
        if (param0 != 108) {
          this.field_L = -85;
        }
        int var5 = param3 * 25 + (5 * param1 + param2);
        if (var5 >= this.field_L) {
          return null;
        }
        return this.field_b[var5];
    }

    final int c(int param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        jg var6_ref_jg;
        int var7;
        int var8;
        int var9;
        int var5Lifetime1;
        var8 = Vertigo2.field_L ? 1 : 0;
        var3 = 0;
        var4 = 0;
        for (var5 = 0; this.field_L > var5; var5++) {
          var6_ref_jg = this.field_b[var5];
          if (var6_ref_jg != null) {
            var7 = var6_ref_jg.field_p;
            if (var7 == 1 ||
              3 == var7 ||
              param1 &&
              (var7 == 10 ||
              var7 == 26 ||
              var7 == 15 ||
              var7 == 23)) {
              var4++;
            }
            if (var7 != 2) {
              if (var7 != 4) {
                if (param1) {
                  if (5 != var7) {
                    if (var7 == 25) {
                      var4++;
                      var3++;
                    }
                  } else {
                    var4++;
                    var3++;
                  }
                }
              } else {
                var4++;
                var3++;
              }
            } else {
              var4++;
              var3++;
            }
          }
        }
        if (param0 != 3) {
          this.j(56);
        }
        var9 = 0;
        var5Lifetime1 = var9;
        while (this.field_t > var9) {
          if (this.field_i[var9].field_A != 10) {
            var6 = this.field_i[var9].field_p;
            if (1 == var6 ||
              var6 == 3 ||
              param1 &&
              (var6 == 10 ||
              var6 == 26 ||
              var6 == 15 ||
              var6 == 23)) {
              var4++;
            }
            if (var6 == 2 ||
              var6 == 4 ||
              param1 &&
              (var6 == 5 ||
              var6 == 25)) {
              var4++;
              var3++;
            }
          }
          var9++;
        }
        if (var4 == 0) {
          return 100;
        }
        return var3 * 100 / var4;
    }

    final jg[] c(int param0) {
        if (param0 <= 90) {
          field_a = (er[]) null;
        }
        return this.field_b;
    }

    private final void a(int param0, wo param1, boolean param2, byte param3) {
        int incrementValue$1 = 0;
        rn dupTemp$2 = null;
        rn dupTemp$0 = null;
        int var44 = 0;
        int stackIn_4_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_216_0 = 0;
        RuntimeException stackIn_222_0 = null;
        StringBuilder stackIn_222_1 = null;
        String stackIn_223_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        jg var23_ref_jg = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        jg var34_ref_jg = null;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var46 = 0;
        jg var47 = null;
        jg var48 = null;
        jg var49 = null;
        jg var50 = null;
        jg var51 = null;
        jg var52 = null;
        jg var53 = null;
        jg var54 = null;
        jg var55 = null;
        jg var56 = null;
        jg var57 = null;
        jg var58 = null;
        jg var59 = null;
        jg var60 = null;
        jg var61 = null;
        jg var62 = null;
        jg var63 = null;
        var46 = Vertigo2.field_L ? 1 : 0;
        try {
          var5_int = param1.field_E;
          var6 = param1.field_y;
          var7 = param1.field_k;
          var8 = param1.field_z ? 1 : 0;
          param1.field_C = (byte) 0;
          param1.field_z = false;
          var9 = lj.a(var5_int, false, 128);
          var10 = lj.a(var6, false, 128);
          var11 = lj.a(120 + var7, false, 240);
          var12 = -40 + var5_int;
          var13 = var5_int + 40;
          var14 = var6 - 40;
          var15 = 40 + var6;
          stackIn_4_0 = (param1.b(-1) != 4) ? 0 : 1;
          var16 = stackIn_4_0;
          var17 = 0;
          var18 = 0;
          var19 = 2147483647;
          for (var20 = 0; this.field_t > var20; var20++) {
            if (this.field_i[var20].b(var12, var14, var7, var15, var13, 0)) {
              incrementValue$1 = var17;
              var17++;
              param1.field_P[incrementValue$1] = var20;
              if (var19 > this.field_i[var20].field_s) {
                var19 = this.field_i[var20].field_s;
              }
              var18++;
              var21 = this.field_i[var20].field_p;
              param1.field_C = (byte)(param1.field_C | this.b(var21, false));
              this.a(var20, param2, 27228, var21, param1);
              dupTemp$2 = this.field_i[var20];
              dupTemp$2.field_d = (byte)(dupTemp$2.field_d | 1 << param0);
            }
          }
          if (0 < var18) {
            param1.field_k = var19;
          }
          if (var16 == 0) {
            for (var20 = 0; this.field_t > var20; var20++) {
              if (this.field_i[var20].field_A == 4 &&
                this.field_i[var20].b(var12, var14, var7, var15, var13, 0)) {
                dupTemp$0 = this.field_i[var20];
                dupTemp$0.field_d = (byte)(dupTemp$0.field_d | 1 << param0);
                if (0 <= this.field_i[var20].field_v) {
                  if (param1.f(-1)) {
                    param1.field_z = true;
                    param1.b(0, -7394);
                    var18--;
                    param1.field_k = this.field_i[var20].field_s;
                  }
                } else {
                  param1.field_k = param1.field_k + this.field_i[var20].field_v;
                }
              }
            }
          }
          var20 = -(var11 * 240) + var7;
          if (0 <= var20) {
            stackIn_34_0 = (var20 < 16) ? 1 : 0;
          } else {
            stackIn_34_0 = 0;
          }
          var21 = stackIn_34_0;
          if (var21 != 0 &&
            var16 == 0) {
            for (var22 = 0; this.field_L > var22; var22++) {
              var23_ref_jg = this.field_b[var22];
              var34_ref_jg = var23_ref_jg;
              var34_ref_jg = var23_ref_jg;
              if (var23_ref_jg != null &&
                var11 == var23_ref_jg.field_o) {
                var24 = this.field_b[var22].field_l;
                var25 = this.field_b[var22].field_g;
                if (13 == var23_ref_jg.field_p) {
                  if (48 + var24 <= var5_int) {
                    if (var5_int > var24 + 80) {
                      param1.field_c = param1.field_c + 14;
                    }
                  } else {
                    param1.field_c = param1.field_c - 14;
                  }
                  if (var6 >= var25 + 48) {
                    if (var25 + 80 < var6) {
                      param1.field_O = param1.field_O + 14;
                    }
                  } else {
                    param1.field_O = param1.field_O - 14;
                  }
                }
                if (var23_ref_jg.field_p == 14) {
                  if (var24 + 56 <= var5_int) {
                    if (var5_int > var24 + 72) {
                      param1.field_c = param1.field_c - 14;
                    }
                  } else {
                    param1.field_c = param1.field_c + 14;
                  }
                  if (var25 + 56 <= var6) {
                    if (72 + var25 < var6) {
                      param1.field_O = param1.field_O - 14;
                    }
                  } else {
                    param1.field_O = param1.field_O + 14;
                  }
                }
              }
            }
          }
          if (var16 == 0) {
            for (var22 = 0; this.field_t > var22; var22++) {
              if (this.field_i[var22].b(var12, var14, var7, var15, var13, 0)) {
                if (this.field_i[var22].field_A != 2) {
                  if (this.field_i[var22].field_A == 3) {
                    param1.field_y = param1.field_y + this.field_i[var22].field_v;
                  }
                } else {
                  param1.field_E = param1.field_E + this.field_i[var22].field_v;
                }
              }
            }
          }
          var22 = lj.a(var12, false, 128);
          var23 = lj.a(var13, false, 128);
          var24 = lj.a(var14, false, 128);
          var25 = lj.a(var15, false, 128);
          stackIn_76_0 = (var22 == var9) ? 0 : 1;
          var26 = stackIn_76_0;
          stackIn_79_0 = (var23 == var9) ? 0 : 1;
          var27 = stackIn_79_0;
          stackIn_82_0 = (var10 == var24) ? 0 : 1;
          var28 = stackIn_82_0;
          stackIn_85_0 = (var10 == var25) ? 0 : 1;
          var29 = stackIn_85_0;
          if (param3 >= -56) {
            field_c = -86;
          }
          stackIn_90_0 = (var18 <= 0) ? 0 : 1;
          var30 = stackIn_90_0;
          var31 = 0;
          var32 = Math.abs(param1.c((byte) -127));
          var33 = 0;
          do {
            if (var21 != 0) {
              var34_ref_jg = this.a((byte) 108, var10, var9, var11);
              if (var34_ref_jg != null) {
                var31 = param1.a(100, var31, this.a(var9, var10, (byte) -124, var11));
                var30 = 1;
                param1.field_C = (byte)(param1.field_C | this.b(var34_ref_jg.field_p, false));
                this.a(var11, param2, var10, var34_ref_jg.b(var12, var14, var7, var15, var13, 0), param1, var9, var34_ref_jg.field_p, (byte) -113);
              }
              if (var26 != 0) {
                var47 = this.a((byte) 108, var10, var22, var11);
                if (var47 != null) {
                  var31 = param1.a(71, var31, this.a(var22, var10, (byte) -113, var11));
                  var30 = 1;
                  param1.field_C = (byte)(param1.field_C | this.b(var47.field_p, false));
                  this.a(var11, param2, var10, false, param1, var22, var47.field_p, (byte) -108);
                }
              }
              if (var27 != 0) {
                var48 = this.a((byte) 108, var10, var23, var11);
                if (var48 != null) {
                  var31 = param1.a(127, var31, this.a(var23, var10, (byte) -96, var11));
                  var30 = 1;
                  param1.field_C = (byte)(param1.field_C | this.b(var48.field_p, false));
                  this.a(var11, param2, var10, false, param1, var23, var48.field_p, (byte) -79);
                }
              }
              if (var29 != 0) {
                var49 = this.a((byte) 108, var25, var9, var11);
                if (var49 != null) {
                  var30 = 1;
                  var31 = param1.a(-125, var31, this.a(var9, var25, (byte) -86, var11));
                  param1.field_C = (byte)(param1.field_C | this.b(var49.field_p, false));
                  this.a(var11, param2, var25, false, param1, var9, var49.field_p, (byte) -95);
                }
              }
              if (var28 != 0) {
                var50 = this.a((byte) 108, var24, var9, var11);
                if (var50 != null) {
                  var31 = param1.a(-89, var31, this.a(var9, var24, (byte) -76, var11));
                  var30 = 1;
                  param1.field_C = (byte)(param1.field_C | this.b(var50.field_p, false));
                  this.a(var11, param2, var24, false, param1, var9, var50.field_p, (byte) -33);
                }
              }
              if (var26 != 0 &&
                var28 != 0) {
                var51 = this.a((byte) 108, var24, var22, var11);
                if (var51 != null) {
                  var30 = 1;
                  var31 = param1.a(84, var31, this.a(var22, var24, (byte) -81, var11));
                  param1.field_C = (byte)(param1.field_C | this.b(var51.field_p, false));
                  this.a(var11, param2, var24, false, param1, var22, var51.field_p, (byte) -85);
                }
              }
              if (var27 != 0 &&
                var28 != 0) {
                var52 = this.a((byte) 108, var24, var23, var11);
                if (var52 != null) {
                  var31 = param1.a(110, var31, this.a(var23, var24, (byte) -63, var11));
                  var30 = 1;
                  param1.field_C = (byte)(param1.field_C | this.b(var52.field_p, false));
                  this.a(var11, param2, var24, false, param1, var23, var52.field_p, (byte) -107);
                }
              }
              if (var27 != 0 &&
                var29 != 0) {
                var53 = this.a((byte) 108, var25, var23, var11);
                if (var53 != null) {
                  var31 = param1.a(68, var31, this.a(var23, var25, (byte) -70, var11));
                  var30 = 1;
                  param1.field_C = (byte)(param1.field_C | this.b(var53.field_p, false));
                  this.a(var11, param2, var25, false, param1, var23, var53.field_p, (byte) -83);
                }
              }
              if (var26 != 0 &&
                var29 != 0) {
                var54 = this.a((byte) 108, var25, var22, var11);
                if (var54 != null) {
                  var31 = param1.a(-111, var31, this.a(var22, var25, (byte) -120, var11));
                  var30 = 1;
                  param1.field_C = (byte)(param1.field_C | this.b(var54.field_p, false));
                  this.a(var11, param2, var25, false, param1, var22, var54.field_p, (byte) -58);
                }
              }
            }
            var32--;
            var34 = param1.c((byte) -127);
            if (var34 >= 0) {
              if (var30 != 0) {
                if (!param1.field_A &&
                  var18 == 0) {
                  param1.field_k = 240 * var11;
                }
                param1.field_z = true;
                param1.b(0, -7394);
                var33 = 1;
                if (var8 == 0 &&
                  !this.field_C &&
                  param2) {
                  gm.a(13, (byte) -55);
                }
              } else {
                param1.field_k = param1.field_k + 1;
              }
            } else {
              param1.field_k = param1.field_k - 1;
            }
            var20 = param1.field_k - 240 * var11;
            if (lf.field_C) {
              var35 = 1;
              if (var26 != 0) {
                stackIn_151_0 = (var28 != 0) ? 1 : 0;
              } else {
                stackIn_151_0 = 0;
              }
              var36 = stackIn_151_0;
              if (var27 != 0) {
                stackIn_157_0 = (var28 != 0) ? 1 : 0;
              } else {
                stackIn_157_0 = 0;
              }
              var37 = stackIn_157_0;
              if (var27 != 0) {
                stackIn_163_0 = (var29 != 0) ? 1 : 0;
              } else {
                stackIn_163_0 = 0;
              }
              var38 = stackIn_163_0;
              if (var26 != 0) {
                stackIn_169_0 = (var29 != 0) ? 1 : 0;
              } else {
                stackIn_169_0 = 0;
              }
              var39 = stackIn_169_0;
              var40 = var26;
              var41 = var27;
              var42 = var29;
              var43 = var28;
              for (var44 = var11; var44 < 15; var44++) {
                if (var35 != 0) {
                  var55 = this.a((byte) 108, var10, var9, var44);
                  if (var55 != null) {
                    var35 = 0;
                    var55.field_d = (byte)(var55.field_d | 1 << param0);
                  }
                }
                if (var40 != 0) {
                  var56 = this.a((byte) 108, var10, var22, var44);
                  if (var56 != null) {
                    var40 = 0;
                    var56.field_d = (byte)(var56.field_d | 1 << param0);
                  }
                }
                if (var41 != 0) {
                  var57 = this.a((byte) 108, var10, var23, var44);
                  if (var57 != null) {
                    var57.field_d = (byte)(var57.field_d | 1 << param0);
                    var41 = 0;
                  }
                }
                if (var42 != 0) {
                  var58 = this.a((byte) 108, var25, var9, var44);
                  if (var58 != null) {
                    var42 = 0;
                    var58.field_d = (byte)(var58.field_d | 1 << param0);
                  }
                }
                if (var43 != 0) {
                  var59 = this.a((byte) 108, var24, var9, var44);
                  if (var59 != null) {
                    var43 = 0;
                    var59.field_d = (byte)(var59.field_d | 1 << param0);
                  }
                }
                if (var36 != 0) {
                  var60 = this.a((byte) 108, var24, var22, var44);
                  if (var60 != null) {
                    var36 = 0;
                    var60.field_d = (byte)(var60.field_d | 1 << param0);
                  }
                }
                if (var37 != 0) {
                  var61 = this.a((byte) 108, var24, var23, var44);
                  if (var61 != null) {
                    var37 = 0;
                    var61.field_d = (byte)(var61.field_d | 1 << param0);
                  }
                }
                if (var38 != 0) {
                  var62 = this.a((byte) 108, var25, var23, var44);
                  if (var62 != null) {
                    var62.field_d = (byte)(var62.field_d | 1 << param0);
                    var38 = 0;
                  }
                }
                if (var39 != 0) {
                  var63 = this.a((byte) 108, var25, var22, var44);
                  if (var63 != null) {
                    var39 = 0;
                    var63.field_d = (byte)(var63.field_d | 1 << param0);
                  }
                }
              }
            }
            if (var20 >= 0) {
              stackIn_216_0 = (var20 < 16) ? 1 : 0;
            } else {
              stackIn_216_0 = 0;
            }
            var21 = stackIn_216_0;
          } while (var32 > 0 &&
            var33 == 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_222_0 = var5;
          stackIn_222_1 = new StringBuilder().append("bh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_223_2 = "null";
          } else {
            stackIn_223_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_222_0), ((StringBuilder) (Object) stackIn_222_1).append(stackIn_223_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        if (this.field_t - 1 != param0) {
          qq.a(this.field_i, 1 + param0, this.field_i, param0, -param0 + 374);
        } else {
          this.field_i[param0] = null;
        }
        this.field_t = this.field_t - 1;
        if (param1) {
          this.field_w = -9;
        }
    }

    private final ho a(boolean param0) {
        if (sk.field_e == th.field_e.length - 1) {
          return th.field_e[0];
        }
        ho[] fieldTemp$0 = th.field_e;
        int fieldTemp$1 = sk.field_e + 1;
        sk.field_e = sk.field_e + 1;
        ho var2 = fieldTemp$0[fieldTemp$1];
        var2.b(-28233);
        if (param0) {
          this.field_x = (int[]) null;
        }
        return var2;
    }

    final int d(byte param0) {
        int stackIn_3_0 = 0;
        int stackIn_98_2 = 0;
        Object stackIn_100_0;
        Object stackIn_100_1;
        boolean stackIn_100_3;
        int stackIn_118_2 = 0;
        Object stackIn_120_0;
        Object stackIn_120_1;
        boolean stackIn_120_3;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        jg var6_ref_jg;
        int var7;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var7 = Vertigo2.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        stackIn_3_0 = (this.field_w == 2) ? 0 : 1;
        var4 = stackIn_3_0;
        for (var5 = 0; this.field_L > var5; var5++) {
          var6_ref_jg = this.field_b[var5];
          if (var6_ref_jg != null) {
            if (var6_ref_jg.field_p == 15 ||
              23 == var6_ref_jg.field_p) {
              var3++;
            }
            if (var6_ref_jg.field_p == 1 ||
              var6_ref_jg.field_p == 3 ||
              var6_ref_jg.field_p == 26 ||
              10 == var6_ref_jg.field_p &&
              var4 != 0) {
              var2++;
            }
            if (var6_ref_jg.field_p != 2 &&
              4 != var6_ref_jg.field_p &&
              var6_ref_jg.field_p != 25 &&
              var6_ref_jg.field_p == 5 &&
              var4 == 0) {
            }
          }
        }
        for (var5Lifetime1 = 0; this.field_t > var5Lifetime1; var5Lifetime1++) {
          if (this.field_i[var5Lifetime1].field_A != 10) {
            var6 = this.field_i[var5Lifetime1].field_p;
            if (var6 != 2 &&
              4 != var6 &&
              var6 != 25 &&
              var6 == 5 &&
              var4 == 0) {
            }
            if (var6 == 15 ||
              var6 == 23) {
              var3++;
            }
            if (var6 != 1) {
              if (var6 != 3) {
                if (var6 != 26) {
                  if (10 == var6 &&
                    var4 != 0) {
                    var2++;
                  }
                } else {
                  var2++;
                }
              } else {
                var2++;
              }
            } else {
              var2++;
            }
          }
        }
        if (param0 > -34) {
          this.field_C = false;
        }
        if (this.field_w != 0 &&
          this.field_w != 1 &&
          3 != this.field_w) {
          if (this.field_I > 0) {
            return -2;
          }
          if (this.field_e != 3 &&
            this.field_e != 2 &&
            this.field_e != 6 &&
            this.field_e != 7) {
            stackIn_118_2 = 3;
            if (this.field_w != 0 &&
              3 != this.field_w) {
              stackIn_120_0 = this;
              stackIn_120_1 = this;
              stackIn_120_3 = false;
            } else {
              stackIn_120_0 = this;
              stackIn_120_1 = this;
              stackIn_120_3 = true;
            }
            this.field_E = this.c(stackIn_118_2, stackIn_120_3);
            this.field_n = 0;
            this.field_e = 2;
            for (var5Lifetime2 = 0; this.field_f.length > var5Lifetime2; var5Lifetime2++) {
              this.field_f[var5Lifetime2].b((byte) -89);
            }
            return -2;
          }
          if (this.field_e != 3 &&
            this.field_e != 2 &&
            this.field_e != 6 && (7 != this.field_e ||
            this.field_n >= 142)) {
            if (this.field_E > 50) {
              return 0;
            }
            if (50 > this.field_E) {
              return 1;
            }
            return -1;
          }
          return -2;
        }
        if (var3 > 0) {
          return -2;
        }
        if (var2 != 0) {
          return -2;
        }
        if (this.field_e != 3 &&
          this.field_e != 2 &&
          this.field_e != 6 &&
          this.field_e != 7 &&
          this.field_e != 4) {
          stackIn_98_2 = 3;
          if (this.field_w != 0 &&
            this.field_w != 3) {
            stackIn_100_0 = this;
            stackIn_100_1 = this;
            stackIn_100_3 = false;
          } else {
            stackIn_100_0 = this;
            stackIn_100_1 = this;
            stackIn_100_3 = true;
          }
          this.field_E = this.c(stackIn_98_2, stackIn_100_3);
          this.field_n = 0;
          this.field_e = 2;
          for (var5Lifetime3 = 0; this.field_f.length > var5Lifetime3; var5Lifetime3++) {
            this.field_f[var5Lifetime3].b((byte) -82);
          }
          if (!this.field_C) {
            qg.a(1, 250, 28, 0);
            db.a(false, 12, (byte) 56, kc.field_b, false, 12);
          }
          return -2;
        }
        if (this.field_e != 3 &&
          this.field_e != 4 && (this.field_e != 2 ||
          3 == this.field_w &&
          100 <= this.field_n) && this.field_e != 6) {
          if (7 != this.field_e) {
            return 0;
          }
          if (this.field_n >= 142) {
            return 0;
          }
        }
        return -2;
    }

    private final int a(int param0, int param1) {
        int var3;
        int var4;
        int stackIn_22_0 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 0) {
          return 27;
        }
        var3 = param1;
        if (3 != var3 &&
          var3 != 1) {
          if (var3 == 26) {
            return 1;
          }
          if (var3 == 10) {
            if (this.field_w != 2) {
            }
            return 1;
          }
          if (var3 != 4 &&
            var3 != 2 &&
            25 != var3) {
            if (var3 != 5) {
              return 2;
            }
            stackIn_22_0 = (this.field_w == 2) ? 2 : 0;
            return stackIn_22_0;
          }
          return 0;
        }
        return 1;
    }

    private final int b(int param0, boolean param1) {
        int var3;
        int var4;
        fe[] var5;
        int stackIn_13_0 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param1) {
          var5 = (fe[]) null;
          bh.a(56, -78, -92, (String[]) null, 72, (cc) null, -2, 117, (String[]) null, 127, 35, (fe[]) null, 56);
        }
        var3 = param0;
        if (var3 == 3) {
          return 1;
        }
        if (var3 != 1 &&
          var3 != 26) {
          if (var3 == 4) {
            return 2;
          }
          if (var3 == 2) {
            return 2;
          }
          if (var3 == 25) {
            return 2;
          }
          stackIn_13_0 = 0;
        } else {
          stackIn_13_0 = 1;
        }
        return stackIn_13_0;
    }

    final void i(int param0) {
        this.field_s = false;
        if (param0 != -10) {
          this.field_q = (int[]) null;
        }
    }

    final ho a(byte param0) {
        int var2 = 8 / ((param0 - 8) / 57);
        if (sk.field_e == -1) {
          return null;
        }
        ho var3 = th.field_e[sk.field_e];
        sk.field_e = sk.field_e - 1;
        return var3;
    }

    final static void a(int param0, int param1, int param2, String[] param3, int param4, cc param5, int param6, int param7, String[] param8, int param9, int param10, fe[] param11, int param12) {
        int var16 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        fe[] var18 = null;
        int var14Lifetime1;
        var17 = Vertigo2.field_L ? 1 : 0;
        try {
          var13_int = 0;
          for (var14 = param0; var14 < param4; var14++) {
            var13_int = var13_int + (param5.a(param3[var14], 210, param2) + param5.field_z + param5.field_M + 6);
          }
          var14Lifetime1 = (param6 - var13_int) / (param4 - param0 - 1);
          var15 = param9;
          if (param10 != 128) {
            var18 = (fe[]) null;
            bh.a(100, 111, -35, (String[]) null, -77, (cc) null, -38, -114, (String[]) null, 20, 47, (fe[]) null, 8);
          }
          for (var16 = param0; var16 < param4; var16++) {
            param11[var16].e(param7, var15 - param12 / 2);
            va.field_s.a(16777215, (byte) 115, -1, param1 + param7 + 10, param8[var16], var15);
            param5.a(param3[var16], param7 + param1 + 10, 6 + var15, 210, 200, 16777215, -1, 0, 0, param2);
            var15 = var15 + (var14Lifetime1 + 6 + param5.a(param3[var16], 210, param2) - (-param5.field_z - param5.field_M));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_12_0 = var13;
          stackIn_12_1 = new StringBuilder().append("bh.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param12).append(')').toString());
        }
    }

    bh(int param0, wo[] param1, boolean param2, boolean param3) {
        int var5_int = 0;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.field_B = false;
        this.field_p = 0;
        this.field_k = new int[50];
        this.field_G = new int[50];
        this.field_x = new int[50];
        this.field_d = 0;
        this.field_j = new int[50];
        this.field_q = new int[50];
        this.field_J = false;
        this.field_u = new int[50];
        try {
          this.field_i = new rn[375];
          this.field_e = 0;
          this.field_b = new jg[375];
          stackIn_4_1 = (param2);
          this.field_C = stackIn_4_1;
          stackIn_7_1 = (param3);
          this.field_l = stackIn_7_1;
          this.field_n = 0;
          this.field_f = param1;
          this.field_w = param0;
          th.field_e = new ho[4];
          for (var5_int = 0; th.field_e.length > var5_int; var5_int++) {
            th.field_e[var5_int] = new ho();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("bh.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_F = "Kick";
        field_g = new byte[250][];
        field_H = "Accept unrated rematch";
        field_c = 0;
        field_M = new java.awt.Color(10040319);
    }
}
