/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ej extends tc implements mm {
    private jd field_r;
    float[] field_P;
    nn field_l;
    private at field_p;
    private int field_o;
    private int field_L;
    private id[] field_u;
    nn field_U;
    private float[] field_T;
    private int field_B;
    float[][] field_A;
    private int field_q;
    float[][] field_K;
    private int field_t;
    ha field_D;
    float[] field_V;
    static String field_R;
    ir field_m;
    float[][][] field_n;
    private int field_k;
    private sm field_Q;
    private sm field_F;
    private cl field_S;
    private at field_H;
    private float[] field_v;
    static ka field_G;
    private int field_y;
    float[] field_N;
    private float[] field_C;
    private boolean field_w;
    private cl field_M;
    cl field_J;
    float[][][] field_I;
    private at field_O;
    private int field_E;
    private int field_x;
    int field_z;
    private int field_s;

    public static void a(int param0) {
        if (param0 != -27464) {
          ej.b(-7, -126, -85, -67);
        }
        field_R = null;
        field_G = null;
    }

    private final float a(int param0, int param1, int param2, byte param3) {
        float stackIn_64_0 = 0.0f;
        float stackIn_66_0 = 0.0f;
        float stackIn_67_1 = 0.0f;
        float var5;
        int var6;
        ne var7;
        int var8_int;
        float var8;
        int var9;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 >= 0 &&
          param2 >= 0 &&
          param0 < this.field_D.field_v &&
          param2 < this.field_D.field_db) {
          if (param3 != -90) {
            this.i(104);
          }
          var5 = 0.0f;
          var6 = param2 * this.field_D.field_v + param0;
          var7 = this.field_D.field_Eb[var6];
          var8_int = param1;
          if (var8_int != 29 &&
            var8_int != 30 &&
            var8_int != 31 &&
            var8_int != 32 &&
            var8_int != 33) {
            if (var8_int != 23 &&
              24 != var8_int) {
              if ((var8_int == 47 ||
                48 == var8_int ||
                var8_int == 49 ||
                var8_int == 50 ||
                var8_int == 51 ||
                52 == var8_int ||
                53 == var8_int) && var7.field_c != null) {
                if (uc.field_d[param1][6] > var7.field_c.field_Y) {
                  stackIn_64_0 = (float)var7.field_c.field_Y;
                } else {
                  stackIn_64_0 = (float)uc.field_d[param1][6];
                }
                var8 = stackIn_64_0;
                stackIn_66_0 = var5;
                if (this.field_z == var7.field_c.field_O) {
                  stackIn_67_1 = -var8;
                } else {
                  stackIn_67_1 = var8;
                }
                var5 = stackIn_66_0 + stackIn_67_1;
              }
            } else if (var7.c(62) &&
              var7.field_c == null) {
              var8 = this.a(20, param3 ^ -89, var6);
              if (1.0f > var8) {
                var8 = 1.0f;
              }
              var5 = var5 + var8;
            }
          } else {
            if (null != var7.field_c &&
              this.field_z == var7.field_c.field_O) {
              var8_int = 0;
              if (0 < param0 &&
                this.field_D.field_Eb[-1 + var6].field_c == null) {
                var8_int = 1;
              } else if (param2 > 0 &&
                this.field_D.field_Eb[-this.field_D.field_v + var6].field_c == null) {
                var8_int = 1;
              } else if (param2 < this.field_D.field_db - 1 &&
                null == this.field_D.field_Eb[var6 + this.field_D.field_v].field_c) {
                var8_int = 1;
              } else {
                if (-1 + this.field_D.field_v > param0 &&
                  this.field_D.field_Eb[1 + var6].field_c == null) {
                  var8_int = 1;
                }
              }
              if (var7.field_c.field_bb) {
                var5 = 0.0f;
              } else {
                if (var8_int != 0) {
                  var5 = this.a(var7.field_c.field_N, 1, var6);
                  if (var5 < 1.0f) {
                    var5 = 1.0f;
                  }
                } else {
                  var5 = 0.0f;
                }
              }
            }
          }
          return var5;
        }
        return -3.4028234663852886e+38f;
    }

    final boolean a(mn param0, int param1) {
        bd var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            var3 = param0.a(58, this.field_D);
            if (var3 != null) {
              var3.a(64, this.field_D);
              return true;
            }
          }
          if (param1 <= -123) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ej.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int var8 = 0;
        float stackIn_7_0 = 0.0f;
        float var4;
        int var5;
        int var6;
        ne var7;
        int var9;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0.0f;
        var5 = param0 % this.field_D.field_v;
        var6 = param0 / this.field_D.field_v;
        var7 = this.field_D.field_Eb[param0];
        if (!var7.a(param1)) {
          return;
        }
        if (var7.d(-60)) {
          stackIn_7_0 = (var7.field_a != this.field_z) ? 101.0f : 0.0f;
          var4 = stackIn_7_0;
        }
        if (this.field_z != var7.field_a) {
          if (var7.field_h != 9 &&
            var7.field_h != 14) {
            if (8 == var7.field_h) {
              var4 = 21.0f;
            }
          } else {
            var4 = 81.0f;
          }
          if (var7.field_a > -1 &&
            this.field_z != var7.field_a) {
            var4 = var4 * this.field_P[9];
          }
          if (null != var7.field_c &&
            var7.field_c.field_O == this.field_z &&
            var7.field_c.i(-21428)) {
            var4 = 0.0f;
          }
        }
        if (0.0f < var4) {
          for (var8 = 0; var8 < 7; var8++) {
            this.field_m.a(-101, var6, (float)param2 * var4, var8, 9, this.field_n, var5);
          }
        }
        this.field_v[param0] = (float)param2 * var4;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var11_int = 0;
        int var13 = 0;
        int var6;
        float[] var7;
        int var8;
        int var9;
        int var10;
        float var11;
        int var12;
        int var14;
        int var12Lifetime1;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = 0;
        if (param1 != -14092) {
          this.field_E = 123;
        }
        while (var6 < 8) {
          if (this.field_I[var6].length < param3) {
            return;
          }
          var7 = this.field_I[var6][param3 - 1];
          if (var7 != null) {
            var8 = param2 % this.field_D.field_v;
            var9 = param2 / this.field_D.field_v;
            if (param0 != 0) {
              var10 = 0;
              for (var11_int = -param0; param0 > var11_int; var11_int++) {
                for (var12 = -param0; param0 > var12; var12++) {
                  if (param0 == Math.abs(var11_int) + Math.abs(var12) &&
                    var8 + var11_int >= 0 &&
                    var9 + var12 >= 0 &&
                    this.field_D.field_v > var11_int + var8 &&
                    this.field_D.field_db > var12 + var9) {
                    var10++;
                  }
                }
              }
              var11 = (float)param4 * this.field_P[55] / (float)var10;
              for (var12Lifetime1 = -param0; param0 > var12Lifetime1; var12Lifetime1++) {
                for (var13 = -param0; var13 < param0; var13++) {
                  if (~param0 == ~(Math.abs(var12Lifetime1) + Math.abs(var13)) &&
                    0 <= var12Lifetime1 + var8 &&
                    var13 + var9 >= 0 &&
                    this.field_D.field_v > var12Lifetime1 + var8 &&
                    var9 + var13 < this.field_D.field_db) {
                    this.field_m.a(var7, false, var11, var6, (byte) -4, 0, var9 + var13, var8 + var12Lifetime1);
                  }
                }
              }
            } else {
              this.field_m.a(var7, false, this.field_P[55] * (float)param4, var6, (byte) -4, 0, var9, var8);
            }
          }
          var6++;
        }
    }

    final boolean h(int param0) {
        int var2;
        ne[] var3_ref_ne__;
        int var3;
        int var4;
        ne var5;
        int var6;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_t = this.field_t + 1;
        if (this.field_D.field_l.b(false) > 0) {
          return false;
        }
        if (this.field_w) {
          if (0 != this.field_t % 2) {
            return false;
          }
          vi.b(-128);
          this.c((byte) -117);
          vi.b(111);
          return false;
        }
        var2 = this.field_k;
        if (var2 == 0) {
          if (this.field_t >= 30) {
            this.b(1, 4);
          }
          return false;
        }
        boolean decompiledFrameCompleted0 = true;
        if (1 == var2) {
          if (this.field_t == 0) {
            if (0 == this.field_D.field_t[this.field_z].b(false) &&
              null != this.field_D.field_K) {
              var2 = 0;
              var3_ref_ne__ = this.field_D.field_Eb;
              var4 = 0;
              while (true) {
                if (var3_ref_ne__.length > var4) {
                  var5 = var3_ref_ne__[var4];
                  if (var5.a(this.field_z, (byte) 91) &&
                    var5.d(param0 + 5026) &&
                    null == var5.field_c) {
                    var2 = 1;
                  } else {
                    var4++;
                    continue;
                  }
                }
                if (var2 != 0) {
                  break;
                }
                var3 = 0;
                for (var4 = 0; this.field_D.field_W > var4; var4++) {
                  if (var3 == 0) {
                    if (var4 != this.field_z &&
                      0 != (1 & this.field_D.a((byte) 78) >> var4) &&
                      !this.field_D.c(var4, -16985, this.field_D.field_K.field_w)) {
                      var3 = 1;
                    }
                    continue;
                  }
                  break;
                }
                if (var3 == 0) {
                  this.field_D.a(0, this.field_D.field_u | 1 << this.field_z);
                }
                this.b(7, param0 ^ -5090);
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.field_S = null;
              this.field_o = 0;
              this.field_w = true;
              this.field_M = (cl) (this.field_p.e((byte) 122));
              this.field_L = 0;
              this.b(2, 4);
            }
          } else {
            this.field_L = 0;
            this.b(2, 4);
          }
        } else {
          switch (var2) {
            case 2:
              this.a(-113, false);
              break;
            case 3:
              if (this.field_t == 0) {
                this.a(this.field_p, 0);
                this.field_S = null;
                this.field_M = (cl) (this.field_p.e((byte) 127));
                this.f(0);
              } else {
                this.f(0);
              }
              break;
            case 4:
              this.a(param0 + 4972, true);
              break;
            case 7:
              if (this.field_t < 50) {
                return false;
              }
              return true;
            case 6:
              this.e(-24236);
              break;
            case 5:
              this.i(0);
              break;
            case 8:
              this.g(-25523);
              break;
            default:
              break;
          }
        }
        if (param0 == -5094) {
        }
        return false;
    }

    private final void a(int param0, boolean param1) {
        if (null == this.field_D.field_K) {
          this.b(param1 ? 5 : 8, 4);
          return;
        }
        this.a(param1, this.field_L, 23);
        if (param0 > -89) {
          this.field_H = (at) null;
        }
        this.field_L = this.field_L + 1;
        if (5 <= this.field_L) {
          this.field_L = 0;
          this.b(!param1 ? 8 : 5, 4);
        }
    }

    final sm a(cl param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        sm stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 29 % ((param1 + 27) / 60);
          stackIn_1_0 = this.field_Q;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ej.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(byte param0) {
        int stackIn_53_0 = 0;
        float[][] stackIn_56_0 = null;
        int var2;
        float[] var2_ref_float__;
        Object var3_ref;
        int var3;
        int var4_int;
        float[] var4;
        float[][] var5_ref_float____;
        int var5;
        tc var6;
        int var7;
        float[] var8;
        float[] var9;
        ne var10;
        ne var11;
        jd var12;
        float[][] var13;
        float[] var14;
        float[][] var15;
        int var2Lifetime1;
        int var2Lifetime2;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_o == 0) {
          this.a((byte) 108, this.field_A);
          this.a((byte) 111, this.field_K);
          for (var2 = 0; this.field_n.length > var2; var2++) {
            this.a((byte) 73, this.field_n[var2]);
          }
          this.field_o = this.field_o + 1;
          this.field_x = 0;
          this.field_s = 9;
          this.field_r = null;
          return;
        }
        if (this.field_o == 1) {
          if (this.field_D.field_W <= this.field_x) {
            this.field_o = this.field_o + 1;
          } else {
            var2Lifetime1 = this.field_x;
            var12 = this.field_r;
            var3_ref = var12;
            stackIn_53_0 = (this.field_D.o(var2Lifetime1, -1) != this.field_D.o(this.field_z, -1)) ? 0 : 1;
            var4_int = stackIn_53_0;
            if (var4_int == 0) {
              stackIn_56_0 = this.field_K;
            } else {
              stackIn_56_0 = this.field_A;
            }
            var15 = stackIn_56_0;
            var13 = var15;
            var5_ref_float____ = var13;
            if (this.field_s > 8) {
              if (var12 == null) {
                var6 = this.field_D.field_t[var2Lifetime1].field_d.field_b;
              } else {
                var6 = var12.field_b;
              }
              if (!(var6 instanceof jd)) {
                var3_ref = null;
              } else {
                var3_ref = (jd) (var6);
              }
              this.field_r = (jd) (var3_ref);
              this.field_s = 0;
            }
            if (var3_ref == null) {
              this.field_x = this.field_x + 1;
              this.field_s = 9;
            } else {
              if (!((jd) (var3_ref)).field_S) {
                if (0 != this.field_s) {
                  if (var4_int != 0) {
                    this.field_s = 8;
                  } else {
                    this.a(1, -1 + this.field_s, 19551, (jd) (var3_ref));
                  }
                } else {
                  this.field_m.a(var15, 1, -19545, (jd) (var3_ref));
                }
              }
              this.field_s = this.field_s + 1;
              ((jd) (var3_ref)).field_X = false;
            }
          }
        } else {
          if (this.field_o == 2) {
            for (var2Lifetime1 = 0; this.field_V.length > var2Lifetime1; var2Lifetime1++) {
              this.field_V[var2Lifetime1] = 0.0f;
            }
            var14 = this.field_n[0][9];
            var9 = var14;
            var8 = var9;
            var2_ref_float__ = var8;
            for (var3 = 0; var3 < var14.length; var3++) {
              var8[var3] = 0.0f;
            }
            for (var3 = 0; var3 < this.field_D.field_Eb.length; var3++) {
              var4 = this.field_C;
              var5 = var3;
              this.field_T[var3] = 0.0f;
              var4[var5] = 0.0f;
              var10 = this.field_D.field_Eb[var3];
              var11 = var10;
              var11 = var10;
              this.a(var3, false, 1);
              if (!var10.d(-16)) {
              }
            }
            this.field_o = this.field_o + 1;
          } else {
            if (this.field_o == 3) {
              for (var2Lifetime1 = 0; this.field_I.length > var2Lifetime1; var2Lifetime1++) {
                for (var3 = 0; var3 < this.field_I[var2Lifetime1].length; var3++) {
                  if (null != this.field_I[var2Lifetime1][var3]) {
                    for (var4_int = 0; this.field_I[var2Lifetime1][var3].length > var4_int; var4_int++) {
                      this.field_I[var2Lifetime1][var3][var4_int] = 0.0f;
                    }
                  }
                }
              }
              for (var2Lifetime1 = 0; var2Lifetime1 < this.field_D.field_Eb.length; var2Lifetime1++) {
                var11 = this.field_D.field_Eb[var2Lifetime1];
                var4_int = var11.a((byte) -107);
                if (var4_int != 0) {
                  this.a(var4_int, 1, var2Lifetime1, 29);
                }
                if (null != var11.field_c) {
                  var4_int = var11.field_c.field_E;
                  if (var4_int != 0) {
                    this.a(3, -14092, var2Lifetime1, var4_int, 1);
                  }
                }
              }
              this.field_o = this.field_o + 1;
            } else {
              this.field_w = false;
              this.field_o = 0;
            }
          }
        }
        var2Lifetime2 = 9 % ((param0 + 68) / 49);
    }

    private final void g(int param0) {
        cl var3 = null;
        if (null == this.field_M) {
          this.b(3, param0 ^ -25527);
          return;
        }
        if (this.field_M.field_o.field_S ||
          this.field_M.field_o.field_O != this.field_z) {
          var3 = (cl) (this.field_p.a((byte) 123));
          cl var2 = var3;
          this.field_M.d(-115);
          this.field_M = var3;
          return;
        }
        if (param0 != -25523) {
          this.field_m = (ir) null;
        }
        this.field_M.f(-119);
        this.field_S = this.field_M;
        this.field_M = (cl) (this.field_p.a((byte) 123));
    }

    private final void a(int param0, jd param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param0 <= 56) {
            return;
          }
          for (var4_int = 0; var4_int < 8; var4_int++) {
            this.a(param2, var4_int, 19551, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ej.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(jd param0, byte param1) {
        try {
          if (param1 != -2) {
            field_G = (ka) null;
          }
          this.a(80, param0);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ej.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, boolean param3) {
        int var9 = 0;
        Object var5;
        int var6;
        float[][] var6_ref_float____;
        int var7_int;
        jd var7;
        cl var8;
        float[][][] var8_array;
        float[][] var10;
        int var11;
        float[][][] var12;
        int var13;
        float[][] var14;
        float[][][] var15;
        float[][] var16;
        float[][] var17;
        float[][][] var18;
        float[][] var19;
        int var6Lifetime1;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3) {
          this.field_o = 0;
          this.field_w = true;
          while (this.field_w) {
            this.c((byte) 29);
          }
        }
        var5 = null;
        if (param2 != 18) {
          this.f(22);
        }
        for (var6 = 0; var6 < fs.field_b.length; var6++) {
          fs.field_b[var6] = 0.0f;
        }
        var7_int = param0;
        if (var7_int != 0) {
          if (var7_int != 1) {
            if (var7_int == 2) {
              var5 = this.field_K[param1];
            } else {
              if (var7_int != 3) {
                if (var7_int == 4) {
                  var5 = null;
                  if (rd.field_j != null) {
                    var7 = rd.field_j.field_T;
                    if (var7 != null) {
                      var8 = (cl) (this.field_p.e((byte) 114));
                      while (var8 != null) {
                        if (var7 != var8.field_o) {
                          var8 = (cl) (this.field_p.a((byte) 123));
                          continue;
                        }
                        var8.a(false, (byte) -127);
                        break;
                      }
                    }
                  }
                }
              } else {
                var17 = this.field_I[1];
                var14 = var17;
                var6_ref_float____ = var14;
                if (var6_ref_float____ != null &&
                  0 < var17.length) {
                  var7_int = param1 % var17.length;
                  var18 = this.field_I;
                  var15 = var18;
                  var12 = var15;
                  var8_array = var12;
                  for (var9 = 0; var9 < var18.length; var9++) {
                    var19 = var18[var9];
                    var16 = var19;
                    var10 = var16;
                    if (var10 != null &&
                      var7_int < var19.length &&
                      var19[var7_int] != null) {
                      var5 = var19[var7_int];
                      break;
                    }
                  }
                }
              }
            }
          } else {
            var5 = this.field_n[param1 % this.field_n[4].length][9];
          }
        }
        if (var5 != null) {
          var13 = 0;
          var6Lifetime1 = var13;
          while (java.lang.reflect.Array.getLength(var5) > var13) {
            fs.field_b[var13] = ((float[]) (var5))[var13];
            var13++;
          }
        }
    }

    private final float a(int param0, int param1, int param2) {
        int var11 = 0;
        float var4;
        int var5;
        int var6;
        float var7;
        float var8;
        float var9;
        float var10;
        int var12;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0.0f;
        var5 = 0;
        var6 = bw.field_m[param0][0];
        var4 = var4 + this.field_P[43] * (this.field_K[8][param2] * (float)fk.field_d[var6][0]);
        if (var5 != 0) {
          System.out.println("Analyzing " + dn.field_Pb[param0] + " base score " + var4);
        }
        var7 = 0.0f;
        var8 = 0.0f;
        var9 = (float)param1;
        var10 = 1.0f;
        for (var11 = 0; 8 > var11; var11++) {
          var9 = var9 + this.field_n[var6][var11][param2];
          var10 = var10 + this.field_K[var11][param2];
          if (var11 != 4 ||
            c.a(param0, (byte) -69)) {
            var7 = var7 + this.field_n[var6][var11][param2] * (float)fk.field_d[var6][var11] * this.field_P[28];
          }
          if (var6 != 4 ||
            4 == var11 ||
            2 == var11 ||
            var11 == 3) {
            var8 = var8 + this.field_K[var11][param2] * (float)fk.field_d[var11][var6] * this.field_P[29];
          }
        }
        if (var5 != 0) {
          System.out.println("summoning enemy vuln: " + var7 + ", total " + var9);
        }
        var4 = var4 + var7 / var9;
        if (var5 != 0) {
          System.out.println("summoning enemy power: " + var8 + ", total " + var10);
        }
        var4 = var4 - var8 / var10;
        if (var5 != 0) {
          System.out.println("Damage-wise: " + dn.field_Pb[param0] + " score " + var4);
        }
        return var4;
    }

    private final void e(int param0) {
        jd var2;
        int[] var3;
        if (param0 != -24236) {
          var3 = (int[]) null;
          this.a((int[]) null, -30, (byte) -27);
        }
        var2 = this.field_D.c(this.field_y, true, this.field_E);
        if (var2 != null) {
          this.a(80, var2);
          this.b(3, param0 + 24240);
        } else {
          if (this.field_t > this.field_B + 100) {
            this.b(7, 4);
          }
        }
    }

    private final void a(int[] param0, int param1, byte param2) {
        int var4_int = 0;
        int var6 = 0;
        cl discarded$1 = null;
        int var5 = 0;
        int var7 = 0;
        jd var8 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          for (var4_int = 0; param0.length > var4_int; var4_int++) {
            var5 = 0;
            if (-1 != param0[var4_int]) {
              for (var6 = 0; var6 < var4_int; var6++) {
                if (param0[var4_int] != param0[var6]) {
                  continue;
                }
                var5 = 1;
                break;
              }
              if (var5 == 0) {
                this.a(param0[var4_int], false, param1);
              }
            }
          }
          if (param2 < 79) {
            var8 = (jd) null;
            discarded$1 = this.b((jd) null, (byte) -90);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ej.J(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0, float[][] param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var3_int = 0;
          var4 = -13 % ((30 - param0) / 40);
          while (param1.length > var3_int) {
            for (var5 = 0; param1[var3_int].length > var5; var5++) {
              param1[var3_int][var5] = 0.0f;
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ej.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int a(bv param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_G = (ka) null;
          }
          var2_int = de.a(-108, param0, 4, 14, 30, 20);
          stackIn_3_0 = var2_int;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ej.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(jd param0, byte param1) {
        cl var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var4 = 123 % ((param1 - 53) / 41);
          var3 = (cl) (this.field_p.e((byte) 95));
          while (var3 != null) {
            if (var3.field_o == param0) {
              var3.a(false, (byte) -124);
              return;
            }
            var3 = (cl) (this.field_p.a((byte) 123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ej.EA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4;
        sm var5;
        int var6;
        jb var7;
        int var8_int;
        wa var8;
        int var9_int;
        to var9;
        float var10;
        int var11;
        int var12;
        int var13;
        int var9_intLifetime1;
        float var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var11Lifetime2;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_D == null) {
          return;
        }
        if (this.field_D.field_B[this.field_z] == null) {
          return;
        }
        if (param2 != 23) {
          return;
        }
        var4 = this.field_D.field_B[this.field_z][param1];
        if (var4 == -1) {
          return;
        }
        var5 = this.field_F;
        var5.b((byte) -120);
        if (!param0) {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    var8_int = var4;
                    if (var8_int != 29) {
                      if (var8_int != 30 &&
                        31 != var8_int &&
                        var8_int != 32 &&
                        33 != var8_int &&
                        var8_int != 23 &&
                        var8_int != 24 &&
                        var8_int != 47 &&
                        48 != var8_int) {
                        if (49 == var8_int) {
                          var6 = uc.field_d[var4][7];
                          var8_int = var6;
                          if (-var6 + this.field_D.field_db <= var8_int) {
                            break L1;
                          }
                          var9_int = var6;
                          if (this.field_D.field_v - var6 <= var9_int) {
                            var8_int++;
                            break L2;
                          }
                          var10 = 0.0f;
                          var11 = -var6 + var8_int;
                          if (var8_int + var6 < var11) {
                            break L3;
                          }
                          var12 = -var6 + var9_int;
                          if (var9_int + var6 < var12) {
                            var11++;
                            break L4;
                          }
                          var10 = var10 + this.a(var12, var4, var11, (byte) -90);
                          var12++;
                          break L5;
                        }
                        if (50 == var8_int) {
                          var6 = uc.field_d[var4][7];
                          var8_int = var6;
                          if (-var6 + this.field_D.field_db <= var8_int) {
                            break L1;
                          }
                          var9_int = var6;
                          if (this.field_D.field_v - var6 <= var9_int) {
                            var8_int++;
                            break L2;
                          }
                          var10 = 0.0f;
                          var11 = -var6 + var8_int;
                          if (var8_int + var6 < var11) {
                            break L3;
                          }
                          var12 = -var6 + var9_int;
                          break L5;
                        }
                        if (var8_int != 51 &&
                          52 != var8_int &&
                          var8_int != 53) {
                          return;
                        }
                      }
                      var6 = uc.field_d[var4][7];
                      var8_int = var6;
                      break L2;
                    }
                    var6 = uc.field_d[var4][7];
                    var8_int = var6;
                    if (-var6 + this.field_D.field_db <= var8_int) {
                      break L1;
                    }
                    var9_int = var6;
                    if (this.field_D.field_v - var6 <= var9_int) {
                      var8_int++;
                      break L2;
                    }
                    var10 = 0.0f;
                    var11 = -var6 + var8_int;
                    if (var8_int + var6 < var11) {
                      break L3;
                    }
                    var12 = -var6 + var9_int;
                    if (var9_int + var6 < var12) {
                      var11++;
                      break L4;
                    }
                    var10 = var10 + this.a(var12, var4, var11, (byte) -90);
                    var12++;
                  }
                  while (var9_int + var6 >= var12) {
                    var10 = var10 + this.a(var12, var4, var11, (byte) -90);
                    var12++;
                  }
                  var11++;
                }
                while (true) {
                  if (var8_int + var6 >= var11) {
                    for (var12Lifetime3 = -var6 + var9_int; var9_int + var6 >= var12Lifetime3; var12Lifetime3++) {
                      var10 = var10 + this.a(var12Lifetime3, var4, var11, (byte) -90);
                    }
                    var11++;
                    continue;
                  }
                  if (var10 != 0.0f) {
                    var5.a(param1, var9_int, var8_int, var10, (byte) 71, this.field_z);
                  }
                  var9_int++;
                  while (this.field_D.field_v - var6 <= var9_int) {
                    var8_int++;
                    if (-var6 + this.field_D.field_db <= var8_int) {
                      break L1;
                    }
                    var9_int = var6;
                  }
                  var10 = 0.0f;
                  var11 = -var6 + var8_int;
                }
              }
              while (true) {
                if (var10 != 0.0f) {
                  var5.a(param1, var9_int, var8_int, var10, (byte) 71, this.field_z);
                }
                var9_int++;
                while (this.field_D.field_v - var6 <= var9_int) {
                  var8_int++;
                  if (-var6 + this.field_D.field_db <= var8_int) {
                    break L1;
                  }
                  var9_int = var6;
                }
                var10 = 0.0f;
                for (var11Lifetime2 = -var6 + var8_int; var8_int + var6 >= var11Lifetime2; var11Lifetime2++) {
                  for (var12Lifetime2 = -var6 + var9_int; var9_int + var6 >= var12Lifetime2; var12Lifetime2++) {
                    var10 = var10 + this.a(var12Lifetime2, var4, var11Lifetime2, (byte) -90);
                  }
                }
              }
            }
            while (-var6 + this.field_D.field_db > var8_int) {
              for (var9_intLifetime1 = var6; this.field_D.field_v - var6 > var9_intLifetime1; var9_intLifetime1++) {
                var10Lifetime1 = 0.0f;
                for (var11Lifetime1 = -var6 + var8_int; var8_int + var6 >= var11Lifetime1; var11Lifetime1++) {
                  for (var12Lifetime1 = -var6 + var9_intLifetime1; var9_intLifetime1 + var6 >= var12Lifetime1; var12Lifetime1++) {
                    var10Lifetime1 = var10Lifetime1 + this.a(var12Lifetime1, var4, var11Lifetime1, (byte) -90);
                  }
                }
                if (var10Lifetime1 != 0.0f) {
                  var5.a(param1, var9_intLifetime1, var8_int, var10Lifetime1, (byte) 71, this.field_z);
                }
              }
              var8_int++;
            }
          }
          var7 = var5.a((byte) -102);
          if (var7 != null) {
            this.field_D.field_J = true;
            var8 = new wa(var4, var7.field_s, var7.field_q);
            var9 = new to(var8, -1, this.field_z);
            this.a(var9, -126);
          }
        }
        return;
    }

    final void a(int param0, jd param1) {
        cl var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 == null) {
            return;
          }
          if (this.field_z != param1.field_O) {
            return;
          }
          if (param1.field_p != null &&
            this == param1.field_p.field_r) {
            return;
          }
          var3 = this.b(param1, (byte) -98);
          var3.f(param0 ^ 14);
          if (param0 != 80) {
            ej.a(-94);
          }
          this.field_m.a(this.field_A, 1, param0 ^ -19465, var3.field_o);
          if (6 == this.field_k) {
            this.b(3, 4);
            this.field_M = (cl) (this.field_p.a(true, var3));
            this.field_t = 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ej.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        int var2_int;
        float var2;
        int var3;
        int var4;
        int var5;
        jd var6;
        jd var7;
        jd var8;
        if (null != this.field_S) {
          if (this.field_S.field_o.field_X) {
            if (!this.field_S.field_o.field_S) {
              this.field_m.a(this.field_A, 1, -19545, this.field_S.field_o);
              if (this.field_S.field_o.field_E != 0) {
                this.a(3, -14092, this.field_D.field_v * this.field_S.field_o.field_w + this.field_S.field_o.field_J, this.field_S.field_o.field_E, 1);
              }
            }
            this.field_S.field_o.field_X = false;
            var2_int = this.field_S.field_u;
            var3 = this.field_S.field_n;
            var4 = this.field_S.field_m;
            this.a(new int[]{var2_int, var3, var4}, -1, (byte) 113);
            this.field_S.field_n = -1;
            this.field_S.field_u = -1;
            this.field_S.field_m = -1;
          }
          var7 = this.field_S.field_l;
          var8 = var7;
          if (var8 != null &&
            var8.field_X) {
            this.field_m.a(this.field_K, 1, -19545, var8);
            if (var8.field_E != 0) {
              this.a(3, -14092, var8.field_w * this.field_D.field_v + var8.field_J, var8.field_E, 1);
            }
            this.a(66, var8, 1);
            this.field_m.a(this.field_n[var7.g(0)], 1, param0 - 19545, var8);
            var8.field_X = false;
          }
        }
        this.field_S = this.field_M;
        if (param0 != 0) {
          return;
        }
        if (null == this.field_M) {
          this.b(4, param0 + 4);
          return;
        }
        this.field_J = this.field_M;
        var2 = this.field_M.a(true, (byte) -124);
        if (-3.4028234663852886e+38f != var2) {
          this.field_m.a(this.field_A, -1, param0 ^ -19545, this.field_M.field_o);
          var3 = this.field_M.field_o.field_w * this.field_D.field_v + this.field_M.field_o.field_J;
          if (this.field_M.field_o.field_E != 0) {
            this.a(3, -14092, var3, this.field_M.field_o.field_E, -1);
          }
          var4 = -1;
          var5 = -1;
          var6 = this.field_M.field_l;
          if (var6 != null) {
            this.field_m.a(this.field_K, -1, -19545, var6);
            this.a(77, var6, -1);
            var4 = this.field_D.field_v * var6.field_w + var6.field_J;
            if (var6.field_E != 0) {
              this.a(3, -14092, var4, var6.field_E, -1);
            }
          }
          if (this.field_M.field_k.a(0)) {
            var5 = this.field_M.field_k.field_s + this.field_D.field_v * this.field_M.field_k.field_q;
          }
          this.a(new int[]{var3, var4, var5}, -1, (byte) 98);
          this.field_M.field_n = var4;
          this.field_M.field_m = var5;
          this.field_M.field_u = var3;
          this.field_M.g(4);
          this.field_M.field_o.field_X = true;
          if (var6 != null) {
            var6.field_X = true;
          }
        }
        if (-3.4028234663852886e+38f != var2 &&
          this.field_M.field_k.field_r != -2 &&
          this.field_M.field_o.field_B > 0) {
          return;
        }
        this.field_M = (cl) (this.field_p.a((byte) 123));
        return;
    }

    final void a(byte param0) {
        int var2_int = 0;
        jd var2;
        jd var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.b(0, param0 + 127);
        this.field_q = 0;
        this.field_H.b(param0 ^ -28);
        this.field_O.b(param0 ^ -42);
        for (var2_int = 0; var2_int < this.field_D.field_t.length; var2_int++) {
          var3 = (jd) (this.field_D.field_t[var2_int].e((byte) 112));
          while (var3 != null) {
            var3.field_X = true;
            var3 = (jd) (this.field_D.field_t[var2_int].a((byte) 123));
          }
        }
        if (param0 != -123) {
          this.field_D = (ha) null;
        }
        var2 = (jd) (this.field_D.field_t[this.field_z].e((byte) 99));
        while (var2 != null) {
          if (var2.field_p != null &&
            this != var2.field_p.field_r) {
            var2.field_p.d(param0 ^ -11);
            var2.field_p = null;
          }
          if (var2.field_p == null) {
            var2.field_p = new cl(this, var2);
            this.field_p.a(param0 + 873, var2.field_p);
          }
          var2 = (jd) (this.field_D.field_t[this.field_z].a((byte) 123));
        }
        this.field_M = (cl) (this.field_p.e((byte) 108));
        this.field_S = null;
    }

    private final void a(at param0, int param1) {
        int var3_int = 0;
        Object var4 = null;
        cl var4_ref = null;
        Object var5 = null;
        cl var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var3_int = 1;
          while (var3_int != 0) {
            var3_int = 0;
            var4 = null;
            var5_ref = (cl) (this.field_p.e((byte) 113));
            while (var5_ref != null) {
              var4_ref = (cl) (this.field_p.a((byte) 123));
              if (var4_ref == null) {
                break;
              }
              if (var5_ref.a((byte) -87, var4_ref)) {
                var5_ref.d(-122);
                var3_int = 1;
                ro.a(var4_ref, var5_ref, true);
              }
              var5_ref = var4_ref;
            }
          }
          if (param1 != 0) {
            this.field_t = 6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ej.AA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param3 != 29) {
          cl var6 = (cl) null;
          this.a((cl) null, (byte) -87);
        }
        this.a(0, param3 ^ -14103, param2, param0, param1);
    }

    private final void i(int param0) {
        int var18 = 0;
        int stackIn_75_0 = 0;
        float var3;
        double var4;
        double var6;
        double var8;
        double var10;
        int var12;
        int var13_int;
        jb var13;
        int var14;
        int[] var15;
        int var16;
        int var17;
        int var19;
        int var20;
        int var21;
        float var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        jd var29;
        cl var30;
        float var31;
        int var32;
        Object var33;
        sm var34;
        ne var35;
        ne var36;
        jd var37;
        int var13_intLifetime1;
        float var22Lifetime1;
        int var28Lifetime1;
        int var28Lifetime2;
        ne var36Lifetime1;
        ne var36Lifetime2;
        var33 = null;
        var32 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 0) {
          this.field_T = (float[]) null;
        }
        var34 = this.field_F;
        if (this.field_D.field_H[this.field_z] - this.field_q >= 50) {
          var3 = 1.401298464324817e-45f;
          var4 = 0.3;
          var6 = 0.0;
          var8 = 0.0;
          var10 = 0.0;
          var34.b((byte) -122);
          var37 = (jd) (this.field_D.field_t[this.field_z].e((byte) 89));
          while (var37 != null) {
            if (var37.i(-21428)) {
              var4 = var4 - (double)(this.field_P[22] * 2.0f / (float)this.field_D.field_W);
            } else {
              if (!var37.f((byte) -125)) {
                if (var37.s(param0 + 127)) {
                  var10 = var10 - (double)this.field_P[18];
                }
              } else {
                var6 = var6 - (double)this.field_P[14];
              }
            }
            if (!var37.p((byte) -113) &&
              !var37.d((byte) 105)) {
              var8 = var8 + (double)this.field_P[27];
            } else {
              var8 = var8 - (double)this.field_P[16];
            }
            var37 = (jd) (this.field_D.field_t[this.field_z].a((byte) 123));
          }
          for (var13_int = 0; this.field_D.field_Eb.length > var13_int; var13_int++) {
            var35 = this.field_D.field_Eb[var13_int];
            var36 = var35;
            var36Lifetime2 = var35;
            if (this.field_z != var35.field_a &&
              var35.a(false)) {
              var4 = var4 + (double)(this.field_P[21] * 2.0f / (float)this.field_D.field_W);
            }
            if (var35.c(83)) {
              var10 = var10 + (double)this.field_P[17];
              var6 = var6 + (double)this.field_P[13];
            }
          }
          var12 = 0;
          for (var13_intLifetime1 = 0; this.field_D.field_Eb.length > var13_intLifetime1; var13_intLifetime1++) {
            var36Lifetime1 = this.field_D.field_Eb[var13_intLifetime1];
            if (null == var36Lifetime1.field_c &&
              var36Lifetime1.d(-37) &&
              this.field_z == var36Lifetime1.field_a) {
              var15 = this.field_D.field_E[this.field_z];
              var16 = var13_intLifetime1 % this.field_D.field_v;
              var17 = var13_intLifetime1 / this.field_D.field_v;
              for (var18 = 0; var18 < 75; var18++) {
                if (var18 != 72 &&
                  var18 != 39 &&
                  var18 != 7 &&
                  var18 != 34 &&
                  var18 != 51 &&
                  var18 != 27) {
                  var19 = bw.field_m[var18][1];
                  if ((var36Lifetime1.field_h != 11 ||
                    var36Lifetime1.field_g == var19) &&
                    (-1 != var19 ||
                    (this.field_D.field_a[this.field_z][var19 + 1] & 1 << b.a(false, var18)) != 0)) {
                    var20 = this.field_D.b(var17, -26813, var18, var16, this.field_z) ? 1 : 0;
                    var21 = var20;
                    if (var20 == 0) {
                      this.field_D.field_H[this.field_z] = this.field_D.field_H[this.field_z] + this.field_D.k(-116, this.field_z);
                      stackIn_75_0 = (!this.field_D.b(var17, param0 ^ -26813, var18, var16, this.field_z)) ? 0 : 1;
                      var21 = stackIn_75_0;
                      this.field_D.field_H[this.field_z] = this.field_D.field_H[this.field_z] - this.field_D.k(-101, this.field_z);
                    }
                    if (var21 != 0) {
                      var22 = 0.0f;
                      var23 = bw.field_m[var18][4];
                      var22 = var22 + (float)var23 * this.field_P[26];
                      var22Lifetime1 = this.a(var18, 1, var13_intLifetime1);
                      var25 = bw.field_m[var18][1];
                      if (var25 != -1) {
                        var24 = var15[var25];
                        if (var24 == bw.field_m[var18][2]) {
                          var22Lifetime1 = var22Lifetime1 + (float)var24 * this.field_P[23];
                        }
                      }
                      var22Lifetime1 = var22Lifetime1 - this.field_P[25] * (float)bw.field_m[var18][8] * 0.029999999329447746f;
                      var26 = bw.field_m[var18][10];
                      var27 = bw.field_m[var18][12];
                      if (18 == var27) {
                        var22Lifetime1 = var22Lifetime1 - this.field_P[45];
                      }
                      if ((var26 & 2) != 0 ||
                        (16 & var26) != 0) {
                        var22Lifetime1 = (float)((double)var22Lifetime1 + var8);
                        for (var28 = 0; var28 < 8; var28++) {
                          var22Lifetime1 = var22Lifetime1 + this.field_P[15] * this.field_A[var28][var13_intLifetime1];
                        }
                      }
                      if ((32 & var26) != 0) {
                        var22Lifetime1 = (float)((double)var22Lifetime1 + var10);
                      }
                      if (21 == var18) {
                        var22Lifetime1 = (float)((double)var22Lifetime1 + var6);
                      }
                      if (var18 == 0 ||
                        3 == var18) {
                        var22Lifetime1 = (float)((double)var22Lifetime1 + var4);
                        for (var28Lifetime1 = 0; var28Lifetime1 < 8; var28Lifetime1++) {
                          var22Lifetime1 = var22Lifetime1 + this.field_P[44] * this.field_A[var28Lifetime1][var13_intLifetime1];
                          var22Lifetime1 = var22Lifetime1 - this.field_K[var28Lifetime1][var13_intLifetime1] * this.field_P[44];
                        }
                      }
                      var28Lifetime2 = 1;
                      if (var18 == 74) {
                        var28Lifetime2 = 2;
                      }
                      var29 = new jd(var16, var17, var18, this.field_z, var23, var23, var28Lifetime2, 0, 0, this.field_D, 0, 0, -1, true, 0);
                      var30 = new cl(this, var29);
                      var30.f(-86);
                      var31 = var30.a(false, (byte) -127);
                      var22Lifetime1 = var22Lifetime1 + var31;
                      if (var20 != 0) {
                        var34.a(var17, var18, var22Lifetime1, this.field_z, var16, true);
                        var12 = 1;
                        if (var3 < var22Lifetime1) {
                          var3 = var22Lifetime1;
                        }
                      } else {
                        if (var21 != 0) {
                          var22Lifetime1 = var22Lifetime1 - this.field_P[42];
                          var34.a((byte) -68, var18, var22Lifetime1);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if (var12 != 0) {
            var13 = var34.a((byte) -84);
            if (var13 != null) {
              this.b(6, 4);
              this.field_B = this.field_t;
              var14 = var13.field_r;
              var13.a((byte) 5, this);
              if (var14 != -1) {
                if (0 > var14) {
                  return;
                }
                this.field_q = this.field_q + bw.field_m[var14][8];
              }
            }
          }
          this.b(7, param0 ^ 4);
        } else {
          this.b(7, param0 ^ 4);
        }
    }

    final static boolean b(int param0, int param1, int param2, int param3) {
        int var4;
        int stackIn_22_0 = 0;
        if (param2 != -14) {
          field_G = (ka) null;
        }
        if (null != ik.field_d &&
          rs.field_q == 13) {
          ik.field_d = null;
          return true;
        }
        if (!hf.field_c) {
          if (!iu.field_h &&
            rs.field_q != 9 &&
            rs.field_q != 10 &&
            rs.field_q != 11) {
            if (80 != rs.field_q) {
              return false;
            }
            if (!os.e(-1)) {
              return false;
            }
            hf.field_c = true;
            return true;
          }
          return cd.a(param0, param1, false);
        }
        if (!os.e(-1)) {
          return false;
        }
        stackIn_22_0 = (!ro.b(param3, (byte) -59, param0)) ? 0 : 1;
        var4 = stackIn_22_0;
        if (80 == rs.field_q ||
          84 == rs.field_q) {
          hf.field_c = false;
          var4 = 1;
        }
        if (rs.field_q == 13) {
          rd.b(8445);
          hf.field_c = false;
          var4 = 1;
        }
        return var4 != 0;
    }

    private final void b(int param0, int param1) {
        this.field_k = param0;
        if (param1 != 4) {
          return;
        }
        this.field_t = -1;
    }

    private final void a(int param0, int param1, int param2, jd param3) {
        float var5_float = 0.0f;
        if (param2 != 19551) {
          return;
        }
        try {
          var5_float = (float)param3.g((byte) 122);
          if (param3.c(false)) {
            var5_float = var5_float * this.field_P[59];
          }
          this.field_m.a(param2 ^ -19507, param3.field_w, (float)param0 * var5_float, param1, param3.g(0), this.field_n, param3.field_J);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ej.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final cl b(jd param0, byte param1) {
        int var4 = 0;
        float[] array$0 = null;
        cl stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        cl var3 = null;
        RuntimeException var3_ref = null;
        id var5 = null;
        int var6 = 0;
        mn var7 = null;
        id[] var8 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (this.field_u != null) {
            var8 = this.field_u;
            for (var4 = 0; var4 < var8.length; var4++) {
              var5 = var8[var4];
              if (var5 != null &&
                param0.field_N == var5.field_a) {
                param0.field_K = var5.field_e;
                if (0 >= var5.field_b) {
                  break;
                }
                param0.field_t = var5.field_b;
                param0.field_Y = var5.field_b;
                break;
              }
            }
          }
          var3 = new cl(this, param0);
          this.field_p.a((byte) -119, (tc) (var3));
          if (param1 > -66) {
            var7 = (mn) null;
            this.a((mn) null, 49);
          }
          if (param0.field_H != 0 &&
            null == this.field_I[param0.g(0)][-1 + param0.field_H]) {
            array$0 = new float[this.field_D.field_Eb.length];
            this.field_I[param0.g(0)][param0.field_H - 1] = array$0;
          }
          stackIn_16_0 = var3;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ej.FA(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    ej(ha param0, int param1, boolean param2, id[] param3) {
        int var5_int = 0;
        jd var6 = null;
        cl discarded$0 = null;
        jd var6Lifetime1;
        try {
          this.field_H = new at();
          this.field_O = new at();
          this.field_p = new at();
          this.field_D = param0;
          this.field_z = param1;
          this.field_P = new float[62];
          ns.a(false, 3, li.field_n);
          this.field_D.field_k.a((byte) -119, (tc) (this));
          aj.a(this.field_P, 117);
          this.field_u = param3;
          var5_int = 0;
          var6 = (jd) (this.field_D.field_t[this.field_z].e((byte) 104));
          while (var6 != null) {
            if (var5_int < var6.field_H) {
              var5_int = var6.field_H;
            }
            var6 = (jd) (this.field_D.field_t[this.field_z].a((byte) 123));
          }
          this.field_I = new float[8][var5_int][];
          this.field_U = new nn(this.field_D);
          this.field_l = new nn(this.field_D);
          this.field_A = new float[10][this.field_D.field_Eb.length];
          this.field_K = new float[10][this.field_D.field_Eb.length];
          this.field_n = new float[8][10][this.field_D.field_Eb.length];
          this.field_V = new float[this.field_D.field_Eb.length];
          this.field_N = new float[this.field_D.field_Eb.length];
          this.field_J = null;
          this.field_m = new ir(this.field_D.field_Eb, this.field_D.field_v, this.field_D.field_db);
          this.field_v = new float[this.field_D.field_Eb.length];
          this.field_T = new float[this.field_D.field_Eb.length];
          this.field_C = new float[this.field_D.field_Eb.length];
          var6Lifetime1 = (jd) (this.field_D.field_t[this.field_z].e((byte) 126));
          while (var6Lifetime1 != null) {
            discarded$0 = this.b(var6Lifetime1, (byte) -68);
            var6Lifetime1 = (jd) (this.field_D.field_t[this.field_z].a((byte) 123));
          }
          this.field_Q = (sm) ((Object) new aw(this));
          this.field_F = (sm) ((Object) new ge(this));
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_R = "Unpacking models";
    }
}
