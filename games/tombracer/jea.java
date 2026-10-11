/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jea extends um {
    int field_t;
    int field_ab;
    iu field_R;
    iu[] field_C;
    boolean field_eb;
    int field_P;
    boolean field_L;
    vna field_J;
    iu field_B;
    int field_hb;
    il field_H;
    boolean field_cb;
    int field_p;
    boolean field_o;
    boolean field_pb;
    private boolean field_Q;
    boolean field_F;
    int field_ob;
    iu field_rb;
    int field_N;
    iu field_lb;
    int field_ib;
    iu[] field_n;
    iu[] field_db;
    int field_A;
    int field_z;
    int field_x;
    String field_sb;
    int field_bb;
    int field_E;
    int field_W;
    int field_O;
    int field_q;
    int field_V;
    iu[] field_w;
    int field_qb;
    int field_K;
    int field_gb;
    int field_v;
    int field_G;
    private int field_I;
    private boolean field_D;
    String field_r;
    int field_fb;
    int field_s;
    int field_S;
    iu field_U;
    boolean field_X;
    private int field_Y;
    boolean field_Z;
    private int field_u;
    int field_y;
    private int field_jb;
    int field_T;
    iu[] field_M;
    static String field_nb;
    private int field_kb;
    private int field_mb;

    public static void c(byte param0) {
        if (param0 > -15) {
          return;
        }
        field_nb = null;
    }

    final void b(int param0, jea param1) {
        try {
          if (null == this.field_J) {
            this.field_J = new vna();
          }
          if (param0 >= -121) {
            this.a(33, true, 32, -78, -54, -31);
          }
          this.field_J.b((byte) -115, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jea.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, jea param1) {
        boolean stackIn_91_1 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        jea var4 = null;
        try {
          if (param1 != null) {
            if (param1.field_lb != null) {
              this.field_lb = param1.field_lb;
            }
            if (!param1.field_X) {
              this.field_X = param1.field_X;
            }
            if (param1.field_s != 256) {
              this.field_s = param1.field_s;
            }
            if (param1.field_ib != 0) {
              this.field_ib = param1.field_ib;
            }
            if (null != param1.field_sb) {
              this.field_sb = param1.field_sb;
            }
            if (param1.field_db != null) {
              this.field_db = param1.field_db;
            }
            if (param1.field_Q) {
              this.field_Q = param1.field_Q;
            }
            if (param1.field_P != 0) {
              this.field_P = param1.field_P;
            }
            if (param1.field_U != null) {
              this.field_U = param1.field_U;
            }
            if (param1.field_n != null) {
              this.field_n = param1.field_n;
            }
            if (param1.field_hb >= 0) {
              this.field_hb = param1.field_hb;
            }
            if (param1.field_ab >= 0) {
              this.field_ab = param1.field_ab;
            }
            if (null != param1.field_R) {
              this.field_R = param1.field_R;
            }
            if (param1.field_r != null) {
              this.field_r = param1.field_r;
            }
            if (null != param1.field_rb) {
              this.field_rb = param1.field_rb;
            }
            if (param1.field_x != 0) {
              this.field_x = param1.field_x;
            }
            if (param1.field_w != null) {
              this.field_w = param1.field_w;
            }
            if (param1.field_eb) {
              this.field_eb = param1.field_eb;
            }
            if (param1.field_N >= 0) {
              this.field_N = param1.field_N;
            }
            if (param1.field_H != null) {
              this.field_H = param1.field_H;
            }
            if (param1.field_cb) {
              this.field_cb = param1.field_cb;
            }
            if (param1.field_Z) {
              this.field_Z = param1.field_Z;
            }
            if (param1.field_M != null) {
              this.field_M = param1.field_M;
            }
            if (param1.field_C != null) {
              this.field_C = param1.field_C;
            }
            if (null != param1.field_B) {
              this.field_B = param1.field_B;
            }
            if (param1.field_gb >= 0) {
              this.field_gb = param1.field_gb;
            }
            if (param1.field_fb != -2147483648) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_v != -2147483648) {
              this.field_v = param1.field_v;
            }
            if (param1.field_bb != 0) {
              this.field_bb = param1.field_bb;
            }
            this.field_D = param1.field_D;
            if (param1.field_W != -2147483648) {
              this.field_W = param1.field_W;
            }
            if (param1.field_V != 0) {
              this.field_V = param1.field_V;
            }
            if (param1.field_jb != -2147483648) {
              this.field_jb = param1.field_jb;
            }
            if (param1.field_ob != -2147483648) {
              this.field_ob = param1.field_ob;
            }
            if (-2147483648 != param1.field_u) {
              this.field_u = param1.field_u;
            }
            stackIn_91_1 = (this.field_Z) && (param1.field_L);
            this.field_L = stackIn_91_1;
            if (param1.field_S != 0) {
              this.field_S = param1.field_S;
            }
            if (0 != param1.field_z) {
              this.field_z = param1.field_z;
            }
            if (param1.field_F) {
              this.field_F = param1.field_F;
            }
          }
          if (param0) {
            var4 = (jea) null;
            this.a(-110, (jea) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_104_0 = var3;
          stackIn_104_1 = new StringBuilder().append("jea.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
        }
    }

    final int a(int param0, boolean param1) {
        jea var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var4_intLifetime1;
        if (param1) {
          jea var7 = (jea) null;
          this.b(-22, (jea) null);
        }
        int var3 = 0;
        if (null != this.field_r &&
          null != this.field_H) {
          var4_int = this.field_H.c(this.field_r, param0);
          if (var3 < var4_int) {
            var3 = var4_int;
          }
        }
        if (null != this.field_R) {
          var4_intLifetime1 = this.field_R.field_n;
          if (var3 < var4_intLifetime1) {
            var3 = var4_intLifetime1;
          }
        }
        if (this.field_J != null) {
          var4 = (jea) (this.field_J.f(-80));
          while (var4 != null) {
            var5 = var4.field_G + var4.field_qb;
            if (var5 > var3) {
              var3 = var5;
            }
            var4 = (jea) (this.field_J.e(115));
          }
        }
        return var3;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        jea var11_ref_jea = null;
        int var10 = 0;
        int var12 = TombRacer.field_G ? 1 : 0;
        int var5 = -87 / ((1 - param2) / 57);
        int var6 = -this.field_T;
        int var7 = -this.field_K + var6;
        int var8 = this.field_t;
        int var9 = var8 + this.field_O;
        int var10Lifetime1;
        if (!param0) {
          var10 = 0;
          var11_ref_jea = (jea) (this.field_J.f(-80));
          while (var11_ref_jea != null) {
            var11_ref_jea.field_K = -var11_ref_jea.field_T + var10;
            var10 = var10 + (param1 + (var11_ref_jea.field_O + var11_ref_jea.field_t));
            var11_ref_jea = (jea) (this.field_J.e(127));
          }
          var9 = var10 - param1;
        }
        var10Lifetime1 = var9 - param3;
        if (var7 > var10Lifetime1) {
          var7 = var10Lifetime1;
        }
        if (var7 < 0) {
          var7 = 0;
        }
        int var11 = -param3 + var8;
        if (var6 > var11) {
          var6 = var11;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        this.field_O = var9 - var8;
        this.field_K = -var7 + var6;
        this.field_T = -var6;
        this.field_t = var8;
    }

    final void c(int param0, boolean param1) {
        ula.field_w = !param1 ? true : false;
        int var3 = -103 / ((-16 - param0) / 34);
        ow.field_s = !param1 ? true : false;
        this.a(-1, true, bea.field_a, bea.field_g, 0, 0);
    }

    final void a(int param0) {
        jea var4 = null;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_J != null) {
          var4 = (jea) (this.field_J.b(param0 ^ -10967));
          while (var4 != null) {
            var4.field_Q = true;
            var4.a(-10966);
            var4 = (jea) (this.field_J.a(-1));
          }
        }
        if (param0 != -10966) {
          this.field_mb = 18;
        }
    }

    final static void a(int param0, int param1, aca param2) {
        kh var3 = null;
        aca var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = ql.field_k;
          var3.k(param0, param1 ^ -3719);
          var3.i(param2.field_f, 0);
          var3.f(param1 ^ -1477660827, param2.field_j);
          if (param1 != 1325) {
            var4 = (aca) null;
            jea.a(-121, 50, (aca) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("jea.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    jea(long param0, jea param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        boolean stackIn_31_1 = false;
        boolean stackIn_38_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        jea var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = TombRacer.field_G ? 1 : 0;
        if (this.field_Y > 0) {
          var7 = -(-this.field_Y >> 2);
        } else {
          var7 = this.field_Y >> 2;
        }
        this.field_qb = this.field_qb + var7;
        this.field_Y = this.field_Y - var7;
        if (param0 <= ~this.field_K) {
          var7Lifetime1 = this.field_K >> 2;
        } else {
          var7Lifetime1 = -(-this.field_K >> 2);
        }
        this.field_T = this.field_T + var7Lifetime1;
        this.field_K = this.field_K - var7Lifetime1;
        if (0 >= this.field_mb) {
          var7Lifetime2 = this.field_mb >> 2;
        } else {
          var7Lifetime2 = -(-this.field_mb >> 2);
        }
        this.field_G = this.field_G + var7Lifetime2;
        this.field_mb = this.field_mb - var7Lifetime2;
        if (this.field_O > 0) {
          var7Lifetime3 = -(-this.field_O >> 2);
        } else {
          var7Lifetime3 = this.field_O >> 2;
        }
        param1 = param1 & this.field_X;
        this.field_O = this.field_O - var7Lifetime3;
        this.field_t = this.field_t + var7Lifetime3;
        this.field_q = this.field_qb + param4;
        this.field_A = param5 + this.field_T;
        var8 = bea.field_b;
        var9 = bea.field_h;
        var10 = bea.field_d;
        var11 = bea.field_k;
        bea.g(this.field_q, this.field_A, this.field_G + this.field_q, this.field_t + this.field_A);
        var12 = 0;
        if (!ow.field_s &&
          param1 &&
          0 != hf.field_b &&
          jm.field_m >= bea.field_b &&
          jm.field_m < bea.field_d &&
          bea.field_h <= lba.field_p &&
          bea.field_k > lba.field_p) {
          this.field_E = hf.field_b;
          this.field_kb = -this.field_A + lba.field_p;
          var12 = 1;
          this.field_p = jm.field_m - this.field_q;
          this.field_y = hf.field_b;
        } else {
          if (0 != hf.field_b) {
            this.field_E = 0;
          }
          this.field_y = 0;
        }
        stackIn_31_1 = (!ula.field_w) && (jba.field_j >= bea.field_b) && (jba.field_j < bea.field_d) && (sta.field_B >= bea.field_h) && (bea.field_k > sta.field_B);
        this.field_pb = stackIn_31_1;
        if (ksa.field_p == 0) {
          this.field_E = 0;
        }
        stackIn_38_1 = (this.field_pb) && (this.field_E == ksa.field_p) && (param1);
        this.field_o = stackIn_38_1;
        if (this.field_J != null) {
          var13 = (jea) (this.field_J.b(3));
          while (var13 != null) {
            var13.a(-1, param1, this.field_t, this.field_G, this.field_q, this.field_A);
            var13 = (jea) (this.field_J.a(-1));
          }
        }
        if (this.field_pb) {
          ula.field_w = true;
        }
        if (var12 != 0) {
          ow.field_s = true;
        }
        bea.b(var8, var9, var10, var11);
        if (0 != this.field_E &&
          this.field_F) {
          this.field_qb = -param4 + jba.field_j - this.field_p;
          this.field_T = -param5 - this.field_kb + sta.field_B;
          if (this.field_qb < 0) {
            this.field_qb = 0;
          }
          if (-this.field_G + param3 < this.field_qb) {
            this.field_qb = param3 - this.field_G;
          }
          if (0 > this.field_T) {
            this.field_T = 0;
          }
          this.field_K = 0;
          this.field_q = param4 + this.field_qb;
          if (this.field_T > param2 - this.field_t) {
            this.field_T = -this.field_t + param2;
          }
          this.field_Y = 0;
          this.field_A = this.field_T + param5;
        }
    }

    final int b(byte param0) {
        if (param0 != 69) {
          return 93;
        }
        return this.a(2147483647, false);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_T = param3;
        this.field_K = 0;
        if (param2 == -23776) {
          this.field_G = param0;
          this.field_Y = 0;
          this.field_mb = 0;
          this.field_O = 0;
          this.field_qb = param4;
          this.field_t = param1;
          return;
        }
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, int param7, int param8, boolean param9, int param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        iu[] var16;
        iu var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        jea var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = TombRacer.field_G ? 1 : 0;
        this.field_q = param7 + this.field_qb;
        this.field_A = param8 + this.field_T;
        var12 = bea.field_b;
        var13 = bea.field_h;
        var14 = bea.field_d;
        var15 = bea.field_k;
        bea.g(this.field_q, this.field_A, this.field_G + this.field_q, this.field_A + this.field_t);
        if (!this.field_Q) {
          param0 = this.field_o;
          stackIn_5_0 = (0 != this.field_E);
          param4 = stackIn_5_0;
          param6 = this.field_cb;
        }
        param5 = param5 & this.field_X;
        var16 = this.field_w;
        var17 = this.field_R;
        var18 = this.field_ib;
        var19 = param1;
        if (!param5) {
          if (null != this.field_B) {
            var17 = this.field_B;
          }
          if (null != this.field_M) {
            var16 = this.field_M;
          }
          if (this.field_hb >= 0) {
            var18 = this.field_hb;
          }
        }
        var20 = 0;
        if (param0) {
          if (this.field_jb != -2147483648) {
            var20 = this.field_jb;
          }
          if (this.field_C != null) {
            var16 = this.field_C;
          }
          if (this.field_u != -2147483648) {
            var19 = this.field_u;
          }
          if (this.field_ab >= 0) {
            var18 = this.field_ab;
          }
          if (null != this.field_rb) {
            var17 = this.field_rb;
          }
        }
        if (param4) {
          if (null != this.field_U) {
            var17 = this.field_U;
          }
          if (-2147483648 != this.field_ob) {
            var20 = this.field_ob;
          }
          if (this.field_db != null) {
            var16 = this.field_db;
          }
          if (this.field_W != -2147483648) {
            var19 = this.field_W;
          }
          if (0 <= this.field_N) {
            var18 = this.field_N;
          }
        }
        if (param6) {
          if (this.field_n != null) {
            var16 = this.field_n;
          }
          if (this.field_gb >= 0) {
            var18 = this.field_gb;
          }
          if (this.field_v != -2147483648) {
            var20 = this.field_v;
          }
          if (this.field_fb != -2147483648) {
            var19 = this.field_fb;
          }
          if (null != this.field_lb) {
            var17 = this.field_lb;
          }
        }
        var21 = var19 + this.field_S;
        var22 = var20 + this.field_V;
        if (this.field_eb) {
          rsa.a(param2, var16, param8, -117, param10, param7);
        } else {
          rsa.a(this.field_t, var16, this.field_A, param1 ^ -120, this.field_G, this.field_q);
        }
        if (var17 != null) {
          var23_int = this.field_q + var21;
          var24 = this.field_A + var22;
          if (this.field_z == 1) {
            var23_int = var23_int + (this.field_G - var17.field_n) / 2;
          }
          if (2 == this.field_z) {
            var23_int = var23_int + (-var17.field_n + this.field_G);
          }
          if (this.field_bb == 1) {
            var24 = var24 + (-var17.field_k + this.field_t) / 2;
          }
          if (this.field_bb == 2) {
            var24 = var24 + (-var17.field_k + this.field_t);
          }
          if (256 <= this.field_I) {
            var17.b(var23_int, var24);
          } else {
            var17.c(var23_int, var24, this.field_I);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_r &&
          this.field_H != null) {
          var26 = this.field_r;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param3 &&
            this.field_sb != null) {
            var23Lifetime2 = var26 + this.field_sb;
          }
          if (this.field_H.b(var23Lifetime2) <= -(2 * this.field_x) + this.field_G &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.field_bb != 1) {
              if (2 == this.field_bb) {
                var22 = var22 + (-this.field_H.field_w - this.field_H.field_k + this.field_t);
              }
            } else {
              var22 = var22 + (-this.field_H.field_k - this.field_H.field_w + this.field_t) / 2;
            }
            if (this.field_z == 0) {
              this.field_H.b(var23Lifetime2, var21 + this.field_x + this.field_q, var22 + (this.field_A + this.field_H.field_w), var18, -1, this.field_s);
            } else {
              if (this.field_z == 1) {
                this.field_H.c(var23Lifetime2, (-(this.field_x * 2) + this.field_G) / 2 + this.field_q + this.field_x + var21, this.field_A + var22 + this.field_H.field_w, var18, -1, this.field_s);
              } else {
                if (2 != this.field_z) {
                  this.field_H.a(var23Lifetime2, var21 + this.field_q + this.field_x, var22 + this.field_A, -(2 * this.field_x) + this.field_G, this.field_t, var18, -1, this.field_s, this.field_z, this.field_bb, this.field_P);
                } else {
                  this.field_H.a(var23Lifetime2, var21 + (this.field_q + this.field_x + this.field_G - this.field_x * 2), this.field_A + (var22 + this.field_H.field_w), var18, -1, this.field_s);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_H.a(var23Lifetime2, var21 + (this.field_x + this.field_q), var22 + this.field_A, this.field_G - 2 * this.field_x, this.field_t, var18, -1, this.field_s, this.field_z, this.field_bb, this.field_P);
          }
        }
        if (this.field_J != null) {
          var23_ref = (jea) (this.field_J.f(-80));
          while (var23_ref != null) {
            var23_ref.a(param0, 0, this.field_t, param3, param4, param5, param6, var19 + this.field_q, this.field_A + var20, this.field_L, this.field_G);
            var23_ref = (jea) (this.field_J.e(108));
          }
        }
        bea.b(var12, var13, var14, var15);
    }

    jea(long param0, jea param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void b(int param0, boolean param1) {
        this.a(false, 0, bea.field_a, param1, false, true, false, 0, 0, false, bea.field_g);
        if (param0 <= 34) {
          this.field_v = -101;
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!param0) {
            return false;
          }
          param2 = dfa.a('_', "", param2, 0);
          var3 = hua.a(param2, 0);
          stackIn_8_0 = (param1.indexOf(param2) != -1) || (param1.indexOf(var3) != -1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("jea.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, jea param1) {
        uja var3 = null;
        jea var4 = null;
        int var5 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (null != this.field_J) {
            var3 = new uja(this.field_J);
            var4 = (jea) (var3.a(true));
            while (var4 != null) {
              var4.a(-124, param1);
              var4 = (jea) (var3.a(-1));
            }
          }
          if (param0 > -64) {
            return;
          }
          stackIn_11_1 = (param1 == this);
          this.field_L = stackIn_11_1;
          if (this.field_D) {
            this.field_cb = this.field_L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("jea.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void a(int param0, jea param1, jea param2, byte param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != null) {
            param2.field_T = param1.field_T + param1.field_t + param0;
            param2.field_K = param1.field_K + param1.field_O;
          } else {
            param2.field_T = 0;
            param2.field_K = 0;
          }
          if (param3 != -122) {
            this.a(-65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jea.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    public jea() {
        this.field_ab = -1;
        this.field_L = false;
        this.field_N = -1;
        this.field_ob = -2147483648;
        this.field_s = 256;
        this.field_X = true;
        this.field_Z = false;
        this.field_gb = -1;
        this.field_D = false;
        this.field_jb = -2147483648;
        this.field_u = -2147483648;
        this.field_v = -2147483648;
        this.field_fb = -2147483648;
        this.field_I = 256;
        this.field_hb = -1;
        this.field_W = -2147483648;
    }

    jea(long param0, jea param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_ab = -1;
        this.field_L = false;
        this.field_N = -1;
        this.field_ob = -2147483648;
        this.field_s = 256;
        this.field_X = true;
        this.field_Z = false;
        this.field_gb = -1;
        this.field_D = false;
        this.field_jb = -2147483648;
        this.field_u = -2147483648;
        this.field_v = -2147483648;
        this.field_fb = -2147483648;
        this.field_I = 256;
        this.field_hb = -1;
        this.field_W = -2147483648;
        try {
          this.field_qb = param2;
          this.field_G = param4;
          this.field_d = param0;
          this.field_t = param5;
          this.field_T = param3;
          this.a(false, param1);
          if (param6 != null) {
            this.field_r = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jea.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_nb = "<%0>'s game";
    }
}
