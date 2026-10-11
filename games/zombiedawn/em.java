/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends eh implements hh {
    int field_W;
    private int field_R;
    static sn field_J;
    private boolean field_Q;
    private int field_M;
    private an field_S;
    private ij field_F;
    private an field_C;
    private an field_N;
    private boolean field_X;
    int field_D;
    private an field_L;
    static boolean field_H;
    private int field_V;
    private int field_G;
    private int field_O;
    int field_E;
    static int field_U;
    static String[] field_K;
    private boolean field_T;
    private an field_I;

    private final void j(byte param0) {
        int var2 = this.field_S != null ? this.field_S.field_n + this.field_S.field_j : this.field_I.field_j;
        int var3 = this.field_C == null ? -this.field_F.field_n + (this.field_I.field_n + this.field_I.field_j) : this.field_C.field_j - this.field_F.field_n;
        int var4 = 10 % ((param0 + 16) / 63);
        this.a(var2 < var3 ? (-var2 + this.field_F.field_j << 16) / (var3 - var2) : 0, (byte) -98);
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        var8 = ZombieDawn.field_J;
        try {
          var5_int = -106 % ((46 - param1) / 42);
          super.a(param0, (byte) 114, param2, param3);
          if ((!(this.field_F.field_z instanceof an) ||
            ((an) (this.field_F.field_z)).field_C) && 1 == this.field_F.field_m) {
            if (!this.field_X) {
              this.f((byte) -69);
            } else {
              var6 = this.field_D;
              this.k((byte) 33);
              if (var6 != this.field_D &&
                this.field_v instanceof un) {
                ((un) (this.field_v)).a(this.field_D, this, -77, this.field_D);
              }
            }
            if (!this.field_Q) {
              this.a(-734046384);
            } else {
              var6Lifetime2 = this.field_E;
              this.j((byte) 117);
              if (this.field_E != var6Lifetime2 &&
                this.field_v instanceof un) {
                ((un) (this.field_v)).a(this.field_D, this, -63, this.field_E);
              }
            }
          }
          if (this.field_I.field_C &&
            1 == this.field_I.field_z) {
            if (!this.field_Q) {
              if (!this.field_X) {
                return;
              }
              if ((this.field_F.field_i >> 1) + param3 + this.field_F.field_k >= ha.field_b) {
                this.b(-this.field_V + this.field_D, -4218);
                return;
              }
              this.b(this.field_V + this.field_D, -4218);
              return;
            }
            if (!this.field_X) {
              if (ei.field_K > (this.field_F.field_n >> 1) + (param2 + this.field_F.field_j)) {
                this.b(this.field_M + this.field_E, (byte) -121);
                return;
              }
              this.b(-this.field_M + this.field_E, (byte) -121);
              return;
            }
            var6Lifetime1 = -(this.field_F.field_i >> 1) - this.field_F.field_k - this.field_k + (-param3 + ha.field_b);
            var7 = -this.field_j + ei.field_K + (-param2 - (this.field_F.field_n >> 1) - this.field_F.field_j);
            if (Math.abs(var7) <= Math.abs(var6Lifetime1)) {
              if (0 >= var6Lifetime1) {
                this.b(this.field_D - this.field_V, -4218);
                return;
              }
              this.b(this.field_D + this.field_V, -4218);
              return;
            }
            if (var7 <= 0) {
              this.b(this.field_E - this.field_M, (byte) -121);
              return;
            }
            this.b(this.field_M + this.field_E, (byte) -121);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_39_0 = var5;
          stackIn_39_1 = new StringBuilder().append("em.D(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          var5_int = 66 % ((param0 + 83) / 32);
          if (super.a(-120, param1, param2, param3)) {
            return true;
          }
          if (this.field_T &&
            this.field_F.e(-17741)) {
            if (param1 == 98) {
              this.b(this.field_E - this.field_W, (byte) -121);
              return true;
            }
            if (99 == param1) {
              this.b(this.field_E + this.field_W, (byte) -121);
              return true;
            }
            if (param1 == 96) {
              this.b(this.field_D - this.field_G, -4218);
              return true;
            }
            if (97 == param1) {
              this.b(this.field_G + this.field_D, -4218);
              return true;
            }
            if (param1 == 104) {
              this.b(this.field_E - this.h((byte) -49), (byte) -121);
              return true;
            }
            if (105 == param1) {
              this.b(this.field_E + this.h((byte) -49), (byte) -121);
              return true;
            }
            if (param1 == 102) {
              if (this.field_Q &&
                bo.field_p[82]) {
                this.b(0, (byte) -121);
                return true;
              }
              if (this.field_X) {
                this.b(0, -4218);
                return true;
              }
            } else {
              if (param1 == 103) {
                if (this.field_Q &&
                  bo.field_p[82]) {
                  this.b(65536, (byte) -121);
                  return true;
                }
                if (this.field_X) {
                  this.b(65536, -4218);
                  return true;
                }
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_45_0 = var5;
          stackIn_45_1 = new StringBuilder().append("em.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (param0 <= param2) {
          this.field_F.a(115, this.field_F.field_j, this.field_F.field_k, this.field_I.field_i, this.field_F.field_n);
          this.a(1, false);
        } else {
          var4 = param2 * this.field_I.field_i / param0;
          if (this.field_O > var4) {
            var4 = this.field_O;
          }
          this.field_F.a(-100, this.field_F.field_j, this.field_F.field_k, var4, this.field_F.field_n);
          this.a(1, true);
        }
        this.f((byte) -118);
        var4Lifetime1 = 7 % ((-29 - param1) / 44);
    }

    private final void a(int param0) {
        int var3 = 0;
        int var2 = null == this.field_S ? this.field_I.field_j : this.field_S.field_n + this.field_S.field_j;
        if (param0 == -734046384) {
          var3 = null != this.field_C ? this.field_C.field_j - this.field_F.field_n : -this.field_F.field_n + (this.field_I.field_j + this.field_I.field_n);
          this.field_F.field_j = var2 + ((var3 - var2) * this.field_E >> 16);
          return;
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 <= -52) {
          var2 = null == this.field_L ? this.field_I.field_k : this.field_L.field_i + this.field_L.field_k;
          var3 = null == this.field_N ? this.field_I.field_k + this.field_I.field_i - this.field_F.field_i : -this.field_F.field_i + this.field_N.field_k;
          this.field_F.field_k = ((-var2 + var3) * this.field_D >> 16) + var2;
          return;
        }
        this.field_X = false;
        var2Lifetime1 = null == this.field_L ? this.field_I.field_k : this.field_L.field_i + this.field_L.field_k;
        var3Lifetime1 = null == this.field_N ? this.field_I.field_k + this.field_I.field_i - this.field_F.field_i : -this.field_F.field_i + this.field_N.field_k;
        this.field_F.field_k = ((-var2Lifetime1 + var3Lifetime1) * this.field_D >> 16) + var2Lifetime1;
    }

    private final void b(int param0, int param1) {
        this.a(param0, -61);
        if (param1 == -4218) {
          if (this.field_v instanceof un) {
            ((un) (this.field_v)).a(this.field_D, this.field_E, this, 13483);
          }
          return;
        }
    }

    final static vn i(byte param0) {
        int var5_int = 0;
        int var6 = ZombieDawn.field_J;
        int var1 = uf.field_n[0] * bn.field_c[0];
        int var2 = 26 % ((-31 - param0) / 37);
        byte[] var3 = vj.field_m[0];
        int[] var4 = new int[var1];
        for (var5_int = 0; var1 > var5_int; var5_int++) {
          var4[var5_int] = j.field_a[eg.a(255, (int) var3[var5_int])];
        }
        vn var5 = new vn(gl.field_F, kd.field_pb, sl.field_d[0], bo.field_o[0], bn.field_c[0], uf.field_n[0], var4);
        no.f((byte) -110);
        return var5;
    }

    final void a(int param0, byte param1) {
        int var4 = ZombieDawn.field_J;
        if (param1 > -57) {
          return;
        }
        if (param0 < 0) {
          this.field_E = 0;
          this.a(-734046384);
          return;
        }
        if (param0 > 65536) {
          this.field_E = 65536;
          this.a(-734046384);
          return;
        }
        this.field_E = param0;
        this.a(-734046384);
    }

    private final void b(int param0, byte param1) {
        this.a(param0, (byte) -77);
        if (this.field_v instanceof un) {
          ((un) (this.field_v)).a(this.field_E, this.field_E, this, 13483);
        }
        if (param1 == -121) {
          return;
        }
        this.b(47, -73, 104);
    }

    private final void a(boolean param0, int param1) {
        an stackIn_8_0 = null;
        an stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        an stackIn_17_0 = null;
        boolean stackIn_20_1 = false;
        an stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        an stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        an stackIn_36_0 = null;
        boolean stackIn_37_1 = false;
        an stackIn_42_0 = null;
        boolean stackIn_44_1 = false;
        an stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        an stackIn_56_0 = null;
        boolean stackIn_57_1 = false;
        an stackIn_64_0 = null;
        boolean stackIn_66_1 = false;
        an stackIn_70_0 = null;
        boolean stackIn_71_1 = false;
        an stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        an stackIn_85_0 = null;
        boolean stackIn_86_1 = false;
        stackIn_42_0 = this.field_I;
        if (param0) {
          stackIn_44_1 = true;
        } else {
          if (this.field_X) {
            stackIn_42_0.field_C = true;
            boolean decompiledFrameRemainder1 = true;
            if (this.field_F.field_z instanceof an) {
              stackIn_17_0 = (an) (this.field_F.field_z);
              if (param0) {
                stackIn_17_0.field_C = true;
                if (null != this.field_S) {
                  stackIn_8_0 = this.field_S;
                  stackIn_8_0.field_C = true;
                }
                if (this.field_C != null) {
                  stackIn_12_0 = this.field_C;
                  stackIn_13_1 = (!param0) ? false : true;
                  stackIn_12_0.field_C = stackIn_13_1;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                stackIn_20_1 = (!this.field_X) ? false : true;
                stackIn_17_0.field_C = stackIn_20_1;
              }
            }
            if (decompiledFrameRemainder1) {
              if (null == this.field_S) {
                if (this.field_C != null) {
                  stackIn_36_0 = this.field_C;
                  stackIn_37_1 = (!param0) ? false : true;
                  stackIn_36_0.field_C = stackIn_37_1;
                }
              } else {
                stackIn_24_0 = this.field_S;
                stackIn_25_1 = (!param0) ? false : true;
                stackIn_24_0.field_C = stackIn_25_1;
                if (this.field_C != null) {
                  stackIn_28_0 = this.field_C;
                  stackIn_29_1 = (!param0) ? false : true;
                  stackIn_28_0.field_C = stackIn_29_1;
                }
              }
            }
            if (param1 != 30789) {
              this.field_C = (an) null;
            }
            return;
          }
          stackIn_44_1 = false;
        }
        stackIn_42_0.field_C = stackIn_44_1;
        boolean decompiledFrameRemainder0 = true;
        if (this.field_F.field_z instanceof an) {
          stackIn_64_0 = (an) (this.field_F.field_z);
          if (param0) {
            stackIn_66_1 = true;
          } else {
            if (this.field_X) {
              stackIn_64_0.field_C = true;
              if (null != this.field_S) {
                stackIn_51_0 = this.field_S;
                stackIn_52_1 = (!param0) ? false : true;
                stackIn_51_0.field_C = stackIn_52_1;
              }
              if (this.field_C == null) {
                if (param1 == 30789) {
                  return;
                }
                this.field_C = (an) null;
                return;
              }
              stackIn_56_0 = this.field_C;
              stackIn_57_1 = (!param0) ? false : true;
              stackIn_56_0.field_C = stackIn_57_1;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_66_1 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_64_0.field_C = stackIn_66_1;
          }
        }
        if (decompiledFrameRemainder0) {
          if (null == this.field_S) {
            if (this.field_C != null) {
              stackIn_85_0 = this.field_C;
              stackIn_86_1 = (!param0) ? false : true;
              stackIn_85_0.field_C = stackIn_86_1;
            }
            if (param1 == 30789) {
              return;
            }
            this.field_C = (an) null;
            return;
          }
          stackIn_70_0 = this.field_S;
          stackIn_71_1 = (!param0) ? false : true;
          stackIn_70_0.field_C = stackIn_71_1;
          if (this.field_C == null) {
            if (param1 == 30789) {
              return;
            }
            this.field_C = (an) null;
            return;
          }
          stackIn_74_0 = this.field_C;
          stackIn_75_1 = (!param0) ? false : true;
          stackIn_74_0.field_C = stackIn_75_1;
        }
        if (param1 != 30789) {
          this.field_C = (an) null;
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ZombieDawn.field_J;
        try {
          if (param3 == 1 &&
            this.field_T) {
            if (this.field_Q &&
              this.field_S == param2) {
              this.b(this.field_E - this.field_W, (byte) -121);
            } else {
              if (this.field_Q &&
                this.field_C == param2) {
                this.b(this.field_W + this.field_E, (byte) -121);
              } else {
                if (this.field_X &&
                  param2 == this.field_L) {
                  this.b(-this.field_G + this.field_D, param1 ^ 4220);
                } else {
                  if (this.field_X &&
                    param2 == this.field_N) {
                    this.b(this.field_G + this.field_D, -4218);
                  }
                }
              }
            }
          }
          if (param1 != -6) {
            this.field_Q = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("em.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 > param2) {
          var4 = this.field_I.field_n * param2 / param1;
          if (this.field_R > var4) {
            var4 = this.field_R;
          }
          this.field_F.a(param0 ^ 30641, this.field_F.field_j, this.field_F.field_k, this.field_F.field_i, var4);
          this.a(true, 30789);
          this.a(-734046384);
          if (param0 != -30674) {
            this.e((byte) 16);
            return;
          }
          return;
        }
        this.field_F.a(26, this.field_F.field_j, this.field_F.field_k, this.field_F.field_i, this.field_I.field_n);
        this.a(false, param0 ^ -3989);
        this.a(-734046384);
        if (param0 != -30674) {
          this.e((byte) 16);
          return;
        }
    }

    public static void g(byte param0) {
        field_K = null;
        if (param0 >= -19) {
          return;
        }
        field_J = null;
    }

    private final int h(byte param0) {
        if (param0 == -49) {
          return (this.field_F.field_n << 16) / this.field_I.field_n;
        }
        this.a(-46);
        return (this.field_F.field_n << 16) / this.field_I.field_n;
    }

    em(int param0, int param1, int param2, int param3, io param4, io param5, io param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        ij dupTemp$0 = null;
        an dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.field_R = 0;
        this.field_M = 8192;
        this.field_D = 32768;
        this.field_G = 1024;
        this.field_V = 8192;
        this.field_W = 1024;
        this.field_O = 0;
        this.field_T = true;
        this.field_E = 32768;
        try {
          this.field_B = new ga[6];
          dupTemp$0 = new ij(param0, param1, param7, param8, (io) null, (sk) null, new an(0, 0, param7, param8, param6, (sk) null), false, false);
          this.field_F = dupTemp$0;
          this.field_B[0] = (ga) ((Object) dupTemp$0);
          dupTemp$1 = new an(param0, param1, param7, param8, param5, (sk) null);
          this.field_I = dupTemp$1;
          this.field_B[1] = (ga) ((Object) dupTemp$1);
          this.field_O = param9;
          stackIn_4_1 = (param11);
          this.field_X = stackIn_4_1;
          stackIn_7_1 = (param12);
          this.field_Q = stackIn_7_1;
          this.field_R = param10;
          this.a(param13, -89);
          this.a(param14, (byte) -95);
          this.a(-119, param1, param0, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_11_0 = var16;
          stackIn_11_1 = new StringBuilder().append("em.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    private final void k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 >= 15) {
          var2 = null == this.field_L ? this.field_I.field_k : this.field_L.field_i + this.field_L.field_k;
          var3 = null == this.field_N ? -this.field_F.field_i + (this.field_I.field_i + this.field_I.field_k) : -this.field_F.field_i + this.field_N.field_k;
          this.a(var2 < var3 ? (this.field_F.field_k - var2 << 16) / (var3 - var2) : 0, 89);
          return;
        }
        this.field_V = 106;
        var2Lifetime1 = null == this.field_L ? this.field_I.field_k : this.field_L.field_i + this.field_L.field_k;
        var3Lifetime1 = null == this.field_N ? -this.field_F.field_i + (this.field_I.field_i + this.field_I.field_k) : -this.field_F.field_i + this.field_N.field_k;
        this.a(var2Lifetime1 < var3Lifetime1 ? (this.field_F.field_k - var2Lifetime1 << 16) / (var3Lifetime1 - var2Lifetime1) : 0, 89);
    }

    final boolean a(byte param0, ga param1) {
        ij var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 67) {
            return false;
          }
          var3 = this.field_F;
          if (var3 == null) {
            return false;
          }
          if (!((ga) ((Object) var3)).a((byte) 104, param1)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("em.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void e(byte param0) {
        int var3 = ZombieDawn.field_J;
        if (this.field_L != null) {
          this.field_L.field_k = 0;
          this.field_L.field_j = -this.field_L.field_n + this.field_n >> 1;
          this.field_I.field_k = this.field_L.field_k + this.field_L.field_i;
        } else {
          this.field_I.field_k = 0;
        }
        if (this.field_N != null) {
          this.field_N.field_k = -this.field_N.field_i + this.field_i;
          this.field_N.field_j = -this.field_N.field_n + this.field_n >> 1;
          this.field_I.field_i = -this.field_N.field_i + (this.field_i - this.field_I.field_k);
        } else {
          this.field_I.field_i = -this.field_I.field_k + this.field_i;
        }
        if (param0 < 38) {
          em.g((byte) 122);
          this.f((byte) -119);
          if (this.field_S == null) {
            this.field_I.field_j = 0;
          } else {
            this.field_S.field_j = 0;
            this.field_S.field_k = this.field_i - this.field_S.field_i >> 1;
            this.field_I.field_j = this.field_S.field_j + this.field_S.field_n;
          }
          if (null != this.field_C) {
            this.field_C.field_k = this.field_i - this.field_C.field_i >> 1;
            this.field_C.field_j = -this.field_C.field_n + this.field_n;
            this.field_I.field_n = -this.field_C.field_n + this.field_n - this.field_I.field_j;
          } else {
            this.field_I.field_n = this.field_n - this.field_I.field_j;
          }
          this.a(-734046384);
          if (!this.field_Q) {
            this.field_F.field_n = this.field_I.field_n;
            this.field_F.field_j = 0;
            if (!this.field_X) {
              this.field_F.field_i = this.field_I.field_i;
              this.field_F.field_k = 0;
            }
            this.field_F.a(true);
            return;
          }
          if (!this.field_X) {
            this.field_F.field_i = this.field_I.field_i;
            this.field_F.field_k = 0;
          }
          this.field_F.a(true);
          return;
        }
        this.f((byte) -119);
        if (this.field_S == null) {
          this.field_I.field_j = 0;
          if (null != this.field_C) {
            this.field_C.field_k = this.field_i - this.field_C.field_i >> 1;
            this.field_C.field_j = -this.field_C.field_n + this.field_n;
            this.field_I.field_n = -this.field_C.field_n + this.field_n - this.field_I.field_j;
          } else {
            this.field_I.field_n = this.field_n - this.field_I.field_j;
          }
          this.a(-734046384);
          if (!this.field_Q) {
            this.field_F.field_n = this.field_I.field_n;
            this.field_F.field_j = 0;
            if (!this.field_X) {
              this.field_F.field_i = this.field_I.field_i;
              this.field_F.field_k = 0;
            }
            this.field_F.a(true);
            return;
          }
          if (!this.field_X) {
            this.field_F.field_i = this.field_I.field_i;
            this.field_F.field_k = 0;
          }
          this.field_F.a(true);
          return;
        }
        this.field_S.field_j = 0;
        this.field_S.field_k = this.field_i - this.field_S.field_i >> 1;
        this.field_I.field_j = this.field_S.field_j + this.field_S.field_n;
        if (null != this.field_C) {
          this.field_C.field_k = this.field_i - this.field_C.field_i >> 1;
          this.field_C.field_j = -this.field_C.field_n + this.field_n;
          this.field_I.field_n = -this.field_C.field_n + this.field_n - this.field_I.field_j;
          this.a(-734046384);
          if (!this.field_Q) {
            this.field_F.field_n = this.field_I.field_n;
            this.field_F.field_j = 0;
          }
          if (!this.field_X) {
            this.field_F.field_i = this.field_I.field_i;
            this.field_F.field_k = 0;
          }
          this.field_F.a(true);
          return;
        }
        this.field_I.field_n = this.field_n - this.field_I.field_j;
        this.a(-734046384);
        if (!this.field_Q) {
          this.field_F.field_n = this.field_I.field_n;
          this.field_F.field_j = 0;
          if (!this.field_X) {
            this.field_F.field_i = this.field_I.field_i;
            this.field_F.field_k = 0;
          }
          this.field_F.a(true);
          return;
        }
        if (!this.field_X) {
          this.field_F.field_i = this.field_I.field_i;
          this.field_F.field_k = 0;
        }
        this.field_F.a(true);
    }

    private final void a(int param0, boolean param1) {
        an stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        an stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        an stackIn_21_0 = null;
        boolean stackIn_24_1 = false;
        an stackIn_30_0 = null;
        boolean stackIn_31_1 = false;
        an stackIn_36_0 = null;
        boolean stackIn_37_1 = false;
        an stackIn_41_0 = null;
        boolean stackIn_43_1 = false;
        an stackIn_52_0 = null;
        boolean stackIn_53_1 = false;
        an stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        an stackIn_63_0 = null;
        boolean stackIn_65_1 = false;
        an stackIn_71_0 = null;
        boolean stackIn_72_1 = false;
        an stackIn_77_0 = null;
        boolean stackIn_78_1 = false;
        stackIn_41_0 = this.field_I;
        if (param1) {
          stackIn_43_1 = true;
        } else {
          if (this.field_Q) {
            stackIn_41_0.field_C = true;
            if (this.field_F.field_z instanceof an) {
              stackIn_21_0 = (an) (this.field_F.field_z);
              if (param1) {
                stackIn_21_0.field_C = true;
                if (param0 != 1) {
                  return;
                }
                if (null != this.field_L) {
                  stackIn_10_0 = this.field_L;
                  stackIn_11_1 = (!param1) ? false : true;
                  stackIn_10_0.field_C = stackIn_11_1;
                }
                if (null != this.field_N) {
                  stackIn_16_0 = this.field_N;
                  stackIn_17_1 = (!param1) ? false : true;
                  stackIn_16_0.field_C = stackIn_17_1;
                }
                return;
              }
              stackIn_24_1 = (!this.field_Q) ? false : true;
              stackIn_21_0.field_C = stackIn_24_1;
            }
            if (param0 != 1) {
              return;
            }
            if (null != this.field_L) {
              stackIn_30_0 = this.field_L;
              stackIn_31_1 = (!param1) ? false : true;
              stackIn_30_0.field_C = stackIn_31_1;
            }
            if (null != this.field_N) {
              stackIn_36_0 = this.field_N;
              stackIn_37_1 = (!param1) ? false : true;
              stackIn_36_0.field_C = stackIn_37_1;
            }
            return;
          }
          stackIn_43_1 = false;
        }
        stackIn_41_0.field_C = stackIn_43_1;
        if (this.field_F.field_z instanceof an) {
          stackIn_63_0 = (an) (this.field_F.field_z);
          if (param1) {
            stackIn_65_1 = true;
          } else {
            if (this.field_Q) {
              stackIn_63_0.field_C = true;
              if (param0 != 1) {
                return;
              }
              if (null != this.field_L) {
                stackIn_52_0 = this.field_L;
                stackIn_53_1 = (!param1) ? false : true;
                stackIn_52_0.field_C = stackIn_53_1;
              }
              if (null != this.field_N) {
                stackIn_58_0 = this.field_N;
                stackIn_59_1 = (!param1) ? false : true;
                stackIn_58_0.field_C = stackIn_59_1;
              }
              return;
            }
            stackIn_65_1 = false;
          }
          stackIn_63_0.field_C = stackIn_65_1;
        }
        if (param0 != 1) {
          return;
        }
        if (null != this.field_L) {
          stackIn_71_0 = this.field_L;
          stackIn_72_1 = (!param1) ? false : true;
          stackIn_71_0.field_C = stackIn_72_1;
        }
        if (null != this.field_N) {
          stackIn_77_0 = this.field_N;
          stackIn_78_1 = (!param1) ? false : true;
          stackIn_77_0.field_C = stackIn_78_1;
        }
    }

    private final void a(int param0, int param1) {
        int var4 = ZombieDawn.field_J;
        int var3 = 73 % ((param1 - 20) / 61);
        if (param0 < 0) {
          this.field_D = 0;
          this.f((byte) -76);
          return;
        }
        if (param0 <= 65536) {
          this.field_D = param0;
          this.f((byte) -76);
          return;
        }
        this.field_D = 65536;
        this.f((byte) -76);
    }

    static {
        field_H = true;
        field_J = new sn("email");
        field_U = -1;
        field_K = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
