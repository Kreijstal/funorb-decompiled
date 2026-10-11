/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vcb extends oda implements oo {
    private htb field_A;
    private boolean field_G;
    private boolean field_y;
    private htb field_N;
    private int field_J;
    int field_K;
    private htb field_C;
    private int field_F;
    private int field_x;
    private boolean field_w;
    private int field_B;
    int field_L;
    private ef field_P;
    private int field_H;
    private htb field_D;
    static byte[][] field_E;
    static dja field_z;
    int field_M;
    private htb field_v;

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param1 == 1 &&
            this.field_y) {
            if (this.field_G &&
              this.field_A == param3) {
              this.a((byte) -17, -this.field_K + this.field_L);
            } else {
              if (this.field_G &&
                this.field_v == param3) {
                this.a((byte) -17, this.field_K + this.field_L);
              } else {
                if (this.field_w &&
                  this.field_D == param3) {
                  this.a(-51, this.field_M - this.field_H);
                } else {
                  if (this.field_w &&
                    this.field_C == param3) {
                    this.a(-23, this.field_M + this.field_H);
                  }
                }
              }
            }
          }
          if (param0 != 11) {
            this.field_G = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("vcb.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var5_intLifetime1;
        int var5_intLifetime2;
        var7 = VoidHunters.field_G;
        try {
          super.a(param0, param1, param2, param3);
          if ((!(this.field_P.field_t instanceof htb) ||
            ((htb) (this.field_P.field_t)).field_x) && this.field_P.field_n == 1) {
            if (this.field_w) {
              var5_int = this.field_M;
              this.h((byte) 79);
              if (var5_int != this.field_M &&
                this.field_l instanceof lt) {
                ((lt) (this.field_l)).a(this, this.field_M, this.field_M, true);
              }
            } else {
              this.i((byte) -8);
            }
            if (!this.field_G) {
              this.e(param2 ^ -981);
            } else {
              var5_intLifetime2 = this.field_L;
              this.g(127);
              if (var5_intLifetime2 != this.field_L &&
                this.field_l instanceof lt) {
                ((lt) (this.field_l)).a(this, this.field_L, this.field_M, true);
              }
            }
          }
          if (this.field_N.field_x &&
            1 == this.field_N.field_z) {
            if (this.field_G) {
              if (!this.field_w) {
                if (uia.field_b <= param0 - (-this.field_P.field_r - (this.field_P.field_f >> 1))) {
                  this.a((byte) -17, this.field_L - this.field_F);
                  return;
                }
                this.a((byte) -17, this.field_L + this.field_F);
                return;
              }
              var5_intLifetime1 = -this.field_P.field_g - (this.field_P.field_h >> 1) + (-param1 + kc.field_b) - this.field_g;
              var6 = uia.field_b - param0 + (-this.field_r - (this.field_P.field_r + (this.field_P.field_f >> 1)));
              if (Math.abs(var6) <= Math.abs(var5_intLifetime1)) {
                if (var5_intLifetime1 <= 0) {
                  this.a(-116, this.field_M - this.field_x);
                  return;
                }
                this.a(-15, this.field_x + this.field_M);
                return;
              }
              if (0 < var6) {
                this.a((byte) -17, this.field_L + this.field_F);
                return;
              }
              this.a((byte) -17, -this.field_F + this.field_L);
              return;
            }
            if (this.field_w) {
              if ((this.field_P.field_h >> 1) + (this.field_P.field_g + param1) >= kc.field_b) {
                this.a(107, -this.field_x + this.field_M);
                return;
              }
              this.a(-102, this.field_M + this.field_x);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_39_0 = var5;
          stackIn_39_1 = new StringBuilder().append("vcb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 != 21944) {
          shb var5 = (shb) null;
          this.a(-20, -95, (shb) null, 'J');
        }
        if (param0 < param2) {
          var4 = this.field_N.field_h * param0 / param2;
          if (var4 < this.field_J) {
            var4 = this.field_J;
          }
          this.field_P.a(this.field_P.field_g, var4, this.field_P.field_f, 1, this.field_P.field_r);
          this.a((byte) -63, true);
        } else {
          this.field_P.a(this.field_P.field_g, this.field_N.field_h, this.field_P.field_f, param1 ^ 21945, this.field_P.field_r);
          this.a((byte) -110, false);
        }
        this.i((byte) -8);
    }

    final void c(int param0, int param1) {
        int var4;
        rn var5;
        var4 = VoidHunters.field_G;
        if (param1 < 0) {
          this.field_L = 0;
        } else {
          if (param1 > 65536) {
            this.field_L = 65536;
          } else {
            this.field_L = param1;
          }
        }
        this.e(0);
        if (param0 != -3393) {
          var5 = (rn) null;
          vcb.a(33, (llb) null, (llb) null, (llb) null, (rn) null);
        }
    }

    private final void g(int param0) {
        int var2 = this.field_A == null ? this.field_N.field_r : this.field_A.field_f + this.field_A.field_r;
        int var3 = null != this.field_v ? -this.field_P.field_f + this.field_v.field_r : this.field_N.field_f + this.field_N.field_r - this.field_P.field_f;
        int var4 = 68 / ((9 - param0) / 59);
        this.c(-3393, var3 <= var2 ? 0 : (this.field_P.field_r - var2 << 16) / (var3 - var2));
    }

    private final void a(int param0, int param1) {
        this.b(param1, 65536);
        int var3 = -73 % ((param0 - 35) / 49);
        if (this.field_l instanceof lt) {
          ((lt) (this.field_l)).a(this.field_M, this.field_L, this, -125);
        }
    }

    private final void a(int param0, boolean param1) {
        htb stackIn_5_0 = null;
        boolean stackIn_7_1 = false;
        htb stackIn_12_0 = null;
        boolean stackIn_14_1 = false;
        htb stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        htb stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        if (param0 != 0) {
          this.h((byte) -20);
        }
        stackIn_5_0 = this.field_N;
        stackIn_7_1 = (param1) || (this.field_w);
        stackIn_5_0.field_x = stackIn_7_1;
        if (this.field_P.field_t instanceof htb) {
          stackIn_12_0 = (htb) (this.field_P.field_t);
          stackIn_14_1 = (param1) || (this.field_w);
          stackIn_12_0.field_x = stackIn_14_1;
        }
        if (this.field_A != null) {
          stackIn_18_0 = this.field_A;
          stackIn_19_1 = (!param1) ? false : true;
          stackIn_18_0.field_x = stackIn_19_1;
        }
        if (null != this.field_v) {
          stackIn_23_0 = this.field_v;
          stackIn_24_1 = (!param1) ? false : true;
          stackIn_23_0.field_x = stackIn_24_1;
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 > param0) {
          var4 = this.field_N.field_f * param0 / param1;
          if (this.field_B > var4) {
            var4 = this.field_B;
          }
          this.field_P.a(this.field_P.field_g, this.field_P.field_h, var4, 1, this.field_P.field_r);
          this.a(0, true);
        } else {
          this.field_P.a(this.field_P.field_g, this.field_P.field_h, this.field_N.field_f, 1, this.field_P.field_r);
          this.a(0, false);
        }
        this.e(0);
        if (param2 < 126) {
          rn var5 = (rn) null;
          vcb.a(-91, (llb) null, (llb) null, (llb) null, (rn) null);
        }
    }

    private final void h(byte param0) {
        if (param0 <= 49) {
          this.c(17, -59, -81);
        }
        int var2 = null != this.field_D ? this.field_D.field_g + this.field_D.field_h : this.field_N.field_g;
        int var3 = this.field_C != null ? this.field_C.field_g - this.field_P.field_h : this.field_N.field_h + this.field_N.field_g - this.field_P.field_h;
        this.b(var3 <= var2 ? 0 : (this.field_P.field_g - var2 << 16) / (var3 - var2), 65536);
    }

    vcb(int param0, int param1, int param2, int param3, wwa param4, wwa param5, wwa param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        ef dupTemp$0 = null;
        htb dupTemp$1 = null;
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
        this.field_F = 8192;
        this.field_x = 8192;
        this.field_B = 0;
        this.field_y = true;
        this.field_L = 32768;
        this.field_H = 1024;
        this.field_J = 0;
        this.field_K = 1024;
        this.field_M = 32768;
        try {
          this.field_u = new shb[6];
          dupTemp$0 = new ef(param0, param1, param7, param8, (wwa) null, (sba) null, new htb(0, 0, param7, param8, param6, (sba) null), false, false);
          this.field_P = dupTemp$0;
          this.field_u[0] = (shb) ((Object) dupTemp$0);
          dupTemp$1 = new htb(param0, param1, param7, param8, param5, (sba) null);
          this.field_N = dupTemp$1;
          this.field_u[1] = (shb) ((Object) dupTemp$1);
          stackIn_4_1 = (param11);
          this.field_w = stackIn_4_1;
          stackIn_7_1 = (param12);
          this.field_G = stackIn_7_1;
          this.field_J = param9;
          this.field_B = param10;
          this.b(param13, 65536);
          this.c(-3393, param14);
          this.a(param0, param2, param3, 1, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_11_0 = var16;
          stackIn_11_1 = new StringBuilder().append("vcb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    public static void j(byte param0) {
        if (param0 != -7) {
          field_E = (byte[][]) null;
        }
        field_E = (byte[][]) null;
        field_z = null;
    }

    private final int k(byte param0) {
        if (param0 != 110) {
          this.field_M = 17;
        }
        return (this.field_P.field_f << 16) / this.field_N.field_f;
    }

    private final void a(byte param0, boolean param1) {
        htb stackIn_3_0 = null;
        boolean stackIn_5_1 = false;
        htb stackIn_11_0 = null;
        boolean stackIn_13_1 = false;
        htb stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        htb stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        stackIn_3_0 = this.field_N;
        stackIn_5_1 = (param1) || (this.field_G);
        stackIn_3_0.field_x = stackIn_5_1;
        if (param0 > -34) {
          return;
        }
        if (this.field_P.field_t instanceof htb) {
          stackIn_11_0 = (htb) (this.field_P.field_t);
          stackIn_13_1 = (param1) || (this.field_G);
          stackIn_11_0.field_x = stackIn_13_1;
        }
        if (this.field_D != null) {
          stackIn_17_0 = this.field_D;
          stackIn_18_1 = (!param1) ? false : true;
          stackIn_17_0.field_x = stackIn_18_1;
        }
        if (this.field_C != null) {
          stackIn_22_0 = this.field_C;
          stackIn_23_1 = (!param1) ? false : true;
          stackIn_22_0.field_x = stackIn_23_1;
        }
    }

    private final void e(int param0) {
        int var2 = null == this.field_A ? this.field_N.field_r : this.field_A.field_f + this.field_A.field_r;
        int var3 = null == this.field_v ? this.field_N.field_r + (this.field_N.field_f - this.field_P.field_f) : this.field_v.field_r - this.field_P.field_f;
        this.field_P.field_r = (this.field_L * (-var2 + var3) >> 16) + var2;
        if (param0 != 0) {
          vcb.f(-79);
        }
    }

    private final void i(byte param0) {
        if (param0 != -8) {
          this.d(116);
        }
        int var2 = null == this.field_D ? this.field_N.field_g : this.field_D.field_h + this.field_D.field_g;
        int var3 = null != this.field_C ? -this.field_P.field_h + this.field_C.field_g : this.field_N.field_h + (this.field_N.field_g - this.field_P.field_h);
        this.field_P.field_g = ((var3 - var2) * this.field_M >> 16) + var2;
    }

    final static tjb a(int param0, llb param1, llb param2, llb param3, rn param4) {
        int var14 = 0;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        tjb stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        tjb[] var11 = null;
        int var12 = 0;
        rn var13_ref_rn = null;
        int var13 = 0;
        int var15 = 0;
        pi var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = VoidHunters.field_G;
        try {
          if (param4 == null) {
            stackIn_3_0 = null;
            return (tjb) (stackIn_3_0);
          }
          if (param4.field_l != null) {
            stackIn_7_0 = param4.field_l.length;
          } else {
            stackIn_7_0 = 0;
          }
          var5_int = stackIn_7_0;
          if (null == param4.field_n) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = param4.field_n.length;
          }
          var6 = stackIn_10_0;
          var7 = var5_int + var6;
          var8 = new String[var7];
          if (param0 != 0) {
            vcb.j((byte) 98);
          }
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          var11 = new tjb[var7];
          if (null != param4.field_l) {
            for (var12 = 0; var12 < param4.field_l.length; var12++) {
              var13_ref_rn = lnb.field_i.a((byte) -72, param4.field_l[var12]);
              var8[var12] = var13_ref_rn.field_p;
              var9[var12] = param4.field_q[var12];
              var11[var12] = vcb.a(0, param1, param2, param3, var13_ref_rn);
            }
          }
          if (param4.field_n != null) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; var14 < param4.field_n.length; var14++) {
              var15 = param4.field_n[var14];
              if (var15 == -1) {
                var8[var14 + var12Lifetime1] = cu.field_p;
                var9[var14 + var12Lifetime1] = param4.field_m[var14];
                var10[var12Lifetime1 + var14] = param4.field_n[var14];
              } else {
                var16 = usa.field_o.a(var15, -118);
                var8[var14 + var12Lifetime1] = var16.a(80);
                var9[var14 + var12Lifetime1] = param4.field_m[var14];
                if (var9[var12Lifetime1 + var14] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var14 + var12Lifetime1] = (char)var13;
                }
                var10[var14 + var12Lifetime1] = param4.field_n[var14];
              }
            }
          }
          stackIn_27_0 = new tjb(0L, param1, param2, param3, var11, var20, var8, var21);
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("vcb.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final void d(int param0) {
        int var3;
        var3 = VoidHunters.field_G;
        if (null != this.field_D) {
          this.field_D.field_g = 0;
          this.field_D.field_r = this.field_f - this.field_D.field_f >> 1;
          this.field_N.field_g = this.field_D.field_g + this.field_D.field_h;
        } else {
          this.field_N.field_g = 0;
        }
        if (this.field_C != null) {
          this.field_C.field_g = this.field_h - this.field_C.field_h;
          this.field_C.field_r = this.field_f - this.field_C.field_f >> 1;
          this.field_N.field_h = this.field_h + (-this.field_N.field_g - this.field_C.field_h);
        } else {
          this.field_N.field_h = -this.field_N.field_g + this.field_h;
        }
        this.i((byte) -8);
        if (this.field_A == null) {
          this.field_N.field_r = 0;
        } else {
          this.field_A.field_r = 0;
          this.field_A.field_g = this.field_h - this.field_A.field_h >> 1;
          this.field_N.field_r = this.field_A.field_r + this.field_A.field_f;
        }
        if (this.field_v != null) {
          this.field_v.field_r = this.field_f - this.field_v.field_f;
          this.field_v.field_g = -this.field_v.field_h + this.field_h >> 1;
          this.field_N.field_f = -this.field_N.field_r + (this.field_f - this.field_v.field_f);
        } else {
          this.field_N.field_f = this.field_f - this.field_N.field_r;
        }
        this.e(param0 ^ param0);
        if (!this.field_G) {
          this.field_P.field_f = this.field_N.field_f;
          this.field_P.field_r = 0;
        }
        if (!this.field_w) {
          this.field_P.field_h = this.field_N.field_h;
          this.field_P.field_g = 0;
        }
        this.field_P.a(false);
    }

    final boolean a(int param0, shb param1) {
        ef var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_L = -9;
          }
          var3 = this.field_P;
          if (var3 != null &&
            ((shb) ((Object) var3)).a(param0 ^ 0, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("vcb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 < 0) {
          this.field_M = 0;
        } else {
          if (param0 <= 65536) {
            this.field_M = param0;
          } else {
            this.field_M = 65536;
          }
        }
        if (param1 != 65536) {
          return;
        }
        this.i((byte) -8);
    }

    final static void f(int param0) {
        int var1 = 0;
        if (param0 != 32) {
          vcb.j((byte) -101);
        }
        if (hlb.field_p < 224) {
          var1 = hlb.field_p % 32;
          re.a(-var1 + hlb.field_p + 32, (byte) -100);
        } else {
          re.a(256, (byte) -126);
        }
    }

    private final void a(byte param0, int param1) {
        this.c(-3393, param1);
        if (this.field_l instanceof lt) {
          ((lt) (this.field_l)).a(this.field_L, this.field_L, this, param0 ^ 106);
        }
        if (param0 != -17) {
          this.i((byte) 62);
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_y &&
            this.field_P.e((byte) -120)) {
            if (98 == param1) {
              this.a((byte) -17, this.field_L - this.field_K);
              return true;
            }
            if (param1 == 99) {
              this.a((byte) -17, this.field_K + this.field_L);
              return true;
            }
            if (96 == param1) {
              this.a(param0 + 15923, this.field_M - this.field_H);
              return true;
            }
            if (param1 == 97) {
              this.a(116, this.field_M + this.field_H);
              return true;
            }
            if (param1 == 104) {
              this.a((byte) -17, this.field_L - this.k((byte) 110));
              return true;
            }
            if (param1 == 105) {
              this.a((byte) -17, this.field_L + this.k((byte) 110));
              return true;
            }
            if (102 == param1) {
              if (this.field_G &&
                si.field_o[82]) {
                this.a((byte) -17, 0);
                return true;
              }
              if (!this.field_w) {
                return false;
              }
              this.a(-119, 0);
              return true;
            }
            if (103 == param1) {
              if (this.field_G &&
                si.field_o[82]) {
                this.a((byte) -17, 65536);
                return true;
              }
              if (this.field_w) {
                this.a(param0 + 15790, 65536);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_44_0 = var5;
          stackIn_44_1 = new StringBuilder().append("vcb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_E = new byte[250][];
        field_z = (dja) ((Object) new ej());
    }
}
