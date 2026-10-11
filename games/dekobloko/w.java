/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w extends km {
    static pf field_H;
    ck[] field_Q;
    int field_nb;
    int field_W;
    mm field_J;
    boolean field_Kb;
    int field_pb;
    String field_Y;
    String field_T;
    private int field_yb;
    int field_gb;
    boolean field_Hb;
    int field_Bb;
    int field_vb;
    ck field_tb;
    int field_ob;
    private boolean field_O;
    ck[] field_lb;
    ck field_bb;
    int field_E;
    static ud field_Eb;
    int field_ub;
    private int field_Jb;
    ck[] field_Ab;
    boolean field_Gb;
    int field_F;
    int field_mb;
    ck[] field_S;
    int field_xb;
    private int field_V;
    private boolean field_L;
    int field_fb;
    private int field_Lb;
    private boolean field_cb;
    int field_Z;
    int field_db;
    int field_Ib;
    static lm field_kb;
    int field_Mb;
    ck field_R;
    private int field_zb;
    boolean field_ab;
    int field_rb;
    private int field_K;
    int field_Db;
    static ck field_qb;
    static int field_Fb;
    int field_G;
    boolean field_jb;
    ck field_sb;
    boolean field_U;
    ck[] field_eb;
    private int field_Cb;
    int field_P;
    int field_ib;
    ck field_I;
    private int field_hb;
    vj field_M;
    int field_N;
    int field_X;
    int field_wb;

    w(long param0, w param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final static void a(int param0, int param1, fa param2) {
        uf var6 = null;
        int var4 = 0;
        try {
          var6 = we.field_b;
          var6.f(param1, -4);
          var6.field_n = var6.field_n + 1;
          var4 = var6.field_n;
          var6.a(true, 1);
          if (null != param2.field_p) {
            var6.a(true, param2.field_p.length);
            var6.a(false, param2.field_p.length, param2.field_p, 0);
          } else {
            var6.a(true, 0);
          }
          int var5 = 120 % ((param0 - 60) / 53);
          var6.a((byte) -15, var4);
          var6.field_n = var6.field_n - 4;
          param2.field_s = var6.i(7553);
          var6.b(var6.field_n - var4, true);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "w.NA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_K = param1;
        this.field_F = 0;
        this.field_vb = param4;
        this.field_Ib = param2;
        this.field_Mb = 0;
        this.field_N = param3;
        this.field_mb = param0;
        this.field_yb = 0;
    }

    public static void f(byte param0) {
        field_qb = null;
        field_kb = null;
        int var1 = 10 % ((-8 - param0) / 47);
        field_H = null;
        field_Eb = null;
    }

    final int a(boolean param0) {
        if (!param0) {
          return -120;
        }
        return this.a((byte) 84, 2147483647);
    }

    private final void a(boolean param0, int param1, boolean param2, boolean param3, int param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        ck[] var16;
        ck var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        w var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = client.field_A ? 1 : 0;
        this.field_E = this.field_vb + param4;
        this.field_pb = param7 + this.field_Ib;
        var12 = hk.field_c;
        var13 = hk.field_h;
        var14 = hk.field_g;
        var15 = hk.field_b;
        hk.f(this.field_E, this.field_pb, this.field_E + this.field_mb, this.field_N + this.field_pb);
        param3 = param3 & this.field_Hb;
        if (!this.field_L) {
          param2 = this.field_jb;
          stackIn_5_0 = (0 != this.field_gb);
          param9 = stackIn_5_0;
          param6 = this.field_ab;
        }
        var16 = this.field_lb;
        var17 = this.field_I;
        var18 = this.field_G;
        var19 = 0;
        if (!param3) {
          if (0 <= this.field_P) {
            var18 = this.field_P;
          }
          if (this.field_Ab != null) {
            var16 = this.field_Ab;
          }
          if (null != this.field_tb) {
            var17 = this.field_tb;
          }
        }
        var20 = 0;
        if (param2) {
          if (this.field_Bb >= 0) {
            var18 = this.field_Bb;
          }
          if (this.field_R != null) {
            var17 = this.field_R;
          }
          if (null != this.field_S) {
            var16 = this.field_S;
          }
          if (this.field_V != -2147483648) {
            var19 = this.field_V;
          }
          if (this.field_hb != -2147483648) {
            var20 = this.field_hb;
          }
        }
        if (param9) {
          if (null != this.field_bb) {
            var17 = this.field_bb;
          }
          if (this.field_fb >= 0) {
            var18 = this.field_fb;
          }
          if (this.field_Z != -2147483648) {
            var19 = this.field_Z;
          }
          if (null != this.field_eb) {
            var16 = this.field_eb;
          }
          if (this.field_db != -2147483648) {
            var20 = this.field_db;
          }
        }
        if (param6) {
          if (this.field_rb >= 0) {
            var18 = this.field_rb;
          }
          if (this.field_nb != -2147483648) {
            var20 = this.field_nb;
          }
          if (null != this.field_Q) {
            var16 = this.field_Q;
          }
          if (null != this.field_sb) {
            var17 = this.field_sb;
          }
          if (-2147483648 != this.field_ib) {
            var19 = this.field_ib;
          }
        }
        var21 = this.field_Cb + var19;
        if (param10 != -29696) {
          return;
        }
        var22 = var20 + this.field_Lb;
        if (!this.field_Gb) {
          vk.a(this.field_N, (byte) 50, var16, this.field_mb, this.field_pb, this.field_E);
        } else {
          vk.a(param5, (byte) 50, var16, param1, param7, param4);
        }
        if (var17 != null) {
          var23_int = var21 + this.field_E;
          var24 = this.field_pb + var22;
          if (this.field_X == 1) {
            var23_int = var23_int + (this.field_mb - var17.field_K) / 2;
          }
          if (this.field_W == 1) {
            var24 = var24 + (this.field_N - var17.field_C) / 2;
          }
          if (2 == this.field_X) {
            var23_int = var23_int + (-var17.field_K + this.field_mb);
          }
          if (this.field_W == 2) {
            var24 = var24 + (this.field_N - var17.field_C);
          }
          if (this.field_zb < 256) {
            var17.c(var23_int, var24, this.field_zb);
          } else {
            var17.c(var23_int, var24);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_Y &&
          this.field_J != null) {
          var26 = this.field_Y;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param0 &&
            this.field_T != null) {
            var23Lifetime2 = var26 + this.field_T;
          }
          if (this.field_J.a(var23Lifetime2) <= this.field_mb - 2 * this.field_ub &&
            0 > var23Lifetime2.indexOf("<br>")) {
            if (this.field_W != 1) {
              if (this.field_W == 2) {
                var22 = var22 + (-this.field_J.field_R + (-this.field_J.field_K + this.field_N));
              }
            } else {
              var22 = var22 + (this.field_N - this.field_J.field_R - this.field_J.field_K) / 2;
            }
            if (this.field_X == 0) {
              this.field_J.c(var23Lifetime2, this.field_ub + (this.field_E + var21), this.field_J.field_R + (var22 + this.field_pb), var18, -1, this.field_wb);
            } else {
              if (this.field_X == 1) {
                this.field_J.b(var23Lifetime2, (-(2 * this.field_ub) + this.field_mb) / 2 + (this.field_E - (-this.field_ub - var21)), this.field_J.field_R + (this.field_pb + var22), var18, -1, this.field_wb);
              } else {
                if (2 == this.field_X) {
                  this.field_J.a(var23Lifetime2, -(this.field_ub * 2) + (this.field_mb + this.field_E + this.field_ub) + var21, this.field_pb + (var22 + this.field_J.field_R), var18, -1, this.field_wb);
                } else {
                  this.field_J.a(var23Lifetime2, var21 + this.field_ub + this.field_E, var22 + this.field_pb, -(2 * this.field_ub) + this.field_mb, this.field_N, var18, -1, this.field_wb, this.field_X, this.field_W, this.field_Db);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_J.a(var23Lifetime2, var21 + this.field_ub + this.field_E, this.field_pb + var22, -(this.field_ub * 2) + this.field_mb, this.field_N, var18, -1, this.field_wb, this.field_X, this.field_W, this.field_Db);
          }
        }
        if (this.field_M != null) {
          var23_ref = (w) (this.field_M.c((byte) -124));
          while (var23_ref != null) {
            var23_ref.a(param0, this.field_mb, param2, param3, var19 + this.field_E, this.field_N, param6, this.field_pb + var20, this.field_O, param9, -29696);
            var23_ref = (w) (this.field_M.d(true));
          }
        }
        hk.b(var12, var13, var14, var15);
        return;
    }

    final static lm a(byte[] param0, byte param1) {
        lm var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        Object stackIn_2_0 = null;
        lm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (lm) (stackIn_2_0);
          }
          var2 = new lm(param0, sg.field_d, fh.field_a, tm.field_a, hc.field_c, tc.field_Nb);
          oa.a(127);
          if (param1 != -5) {
            var3 = (byte[]) null;
            w.a((byte[]) null, (byte) -7);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("w.AA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, boolean param3) {
        w var10_ref_w = null;
        int var9 = 0;
        int var11 = client.field_A ? 1 : 0;
        int var5 = -this.field_Ib;
        int var6 = var5 - this.field_Mb;
        int var7 = this.field_N;
        int var8 = var7 + this.field_F;
        int var9Lifetime1;
        if (!param3) {
          var9 = 0;
          var10_ref_w = (w) (this.field_M.c((byte) 118));
          while (var10_ref_w != null) {
            var10_ref_w.field_Mb = -var10_ref_w.field_Ib + var9;
            var9 = var9 + (var10_ref_w.field_F + var10_ref_w.field_N + param1);
            var10_ref_w = (w) (this.field_M.d(true));
          }
          var8 = -param1 + var9;
        }
        if (param0 != -94) {
          this.field_U = true;
        }
        var9Lifetime1 = -param2 + var8;
        if (var6 > var9Lifetime1) {
          var6 = var9Lifetime1;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        int var10 = var7 - param2;
        if (var5 > var10) {
          var5 = var10;
        }
        if (0 > var5) {
          var5 = 0;
        }
        this.field_F = var8 - var7;
        this.field_N = var7;
        this.field_Mb = var5 - var6;
        this.field_Ib = -var5;
    }

    w(long param0, w param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
          this.field_ub = -111;
        }
        gb.field_Zb = !param1 ? true : false;
        sl.field_c = !param1 ? true : false;
        this.a(0, (byte) 127, true, hk.field_i, hk.field_j, 0);
    }

    final void a(w param0, int param1) {
        try {
          if (param1 != -16834) {
            w var4 = (w) null;
            this.a((w) null, -88);
          }
          if (null == this.field_M) {
            this.field_M = new vj();
          }
          this.field_M.a(param0, 2777);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "w.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        w var4 = null;
        int var3 = client.field_A ? 1 : 0;
        if (this.field_M != null) {
          var4 = (w) (this.field_M.b(true));
          while (var4 != null) {
            var4.field_L = true;
            var4.d(-92);
            var4 = (w) (this.field_M.c(true));
          }
        }
        if (param0 >= -16) {
          field_kb = (lm) null;
        }
    }

    private final void a(int param0, byte param1, boolean param2, int param3, int param4, int param5) {
        boolean stackIn_31_1 = false;
        boolean stackIn_38_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        w var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = client.field_A ? 1 : 0;
        if (this.field_yb <= 0) {
          var7 = this.field_yb >> 2;
        } else {
          var7 = -(-this.field_yb >> 2);
        }
        this.field_vb = this.field_vb + var7;
        this.field_yb = this.field_yb - var7;
        if (this.field_Mb <= 0) {
          var7Lifetime1 = this.field_Mb >> 2;
        } else {
          var7Lifetime1 = -(-this.field_Mb >> 2);
        }
        this.field_Ib = this.field_Ib + var7Lifetime1;
        this.field_Mb = this.field_Mb - var7Lifetime1;
        if (this.field_K > 0) {
          var7Lifetime2 = -(-this.field_K >> 2);
        } else {
          var7Lifetime2 = this.field_K >> 2;
        }
        this.field_mb = this.field_mb + var7Lifetime2;
        this.field_K = this.field_K - var7Lifetime2;
        if (this.field_F <= 0) {
          var7Lifetime3 = this.field_F >> 2;
        } else {
          var7Lifetime3 = -(-this.field_F >> 2);
        }
        this.field_pb = param5 + this.field_Ib;
        this.field_F = this.field_F - var7Lifetime3;
        param2 = param2 & this.field_Hb;
        this.field_N = this.field_N + var7Lifetime3;
        this.field_E = this.field_vb + param0;
        var8 = hk.field_c;
        var9 = hk.field_h;
        var10 = hk.field_g;
        var11 = hk.field_b;
        hk.f(this.field_E, this.field_pb, this.field_mb + this.field_E, this.field_N + this.field_pb);
        var12 = 0;
        if (!gb.field_Zb &&
          param2 &&
          0 != ig.field_Yb &&
          he.field_S >= hk.field_c &&
          hk.field_g > he.field_S &&
          hk.field_h <= nf.field_h &&
          nf.field_h < hk.field_b) {
          this.field_xb = -this.field_E + he.field_S;
          this.field_Jb = -this.field_pb + nf.field_h;
          this.field_gb = ig.field_Yb;
          var12 = 1;
          this.field_ob = ig.field_Yb;
        } else {
          this.field_ob = 0;
          if (ig.field_Yb != 0) {
            this.field_gb = 0;
          }
        }
        stackIn_31_1 = (!sl.field_c) && (hk.field_c <= bh.field_g) && (bh.field_g < hk.field_g) && (hk.field_h <= pm.field_f) && (pm.field_f < hk.field_b);
        this.field_Kb = stackIn_31_1;
        if (0 == be.field_n) {
          this.field_gb = 0;
        }
        stackIn_38_1 = (this.field_Kb) && (be.field_n == this.field_gb) && (param2);
        this.field_jb = stackIn_38_1;
        if (null != this.field_M) {
          var13 = (w) (this.field_M.b(true));
          while (var13 != null) {
            var13.a(this.field_E, (byte) 126, param2, this.field_N, this.field_mb, this.field_pb);
            var13 = (w) (this.field_M.c(true));
          }
        }
        if (this.field_Kb) {
          sl.field_c = true;
        }
        if (var12 != 0) {
          gb.field_Zb = true;
        }
        hk.b(var8, var9, var10, var11);
        if (this.field_gb != 0 &&
          this.field_U) {
          this.field_vb = -param0 + bh.field_g - this.field_xb;
          this.field_Ib = -this.field_Jb + pm.field_f - param5;
          if (this.field_vb < 0) {
            this.field_vb = 0;
          }
          if (0 > this.field_Ib) {
            this.field_Ib = 0;
          }
          if (-this.field_mb + param4 < this.field_vb) {
            this.field_vb = param4 - this.field_mb;
          }
          this.field_yb = 0;
          this.field_Mb = 0;
          if (param3 - this.field_N < this.field_Ib) {
            this.field_Ib = param3 - this.field_N;
          }
          this.field_E = param0 + this.field_vb;
          this.field_pb = this.field_Ib + param5;
        }
        if (param1 < 125) {
          this.field_E = 12;
        }
    }

    final void a(int param0, boolean param1) {
        this.a(param1, hk.field_j, false, true, 0, hk.field_i, false, 0, false, false, -29696);
        if (param0 != 1141039778) {
          this.field_sb = (ck) null;
        }
    }

    final void a(int param0, w param1) {
        boolean stackIn_66_1 = false;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (param1.field_lb != null) {
              this.field_lb = param1.field_lb;
            }
            if (param1.field_rb >= 0) {
              this.field_rb = param1.field_rb;
            }
            if (param1.field_ab) {
              this.field_ab = param1.field_ab;
            }
            if (param1.field_bb != null) {
              this.field_bb = param1.field_bb;
            }
            if (null != param1.field_Y) {
              this.field_Y = param1.field_Y;
            }
            if (param1.field_S != null) {
              this.field_S = param1.field_S;
            }
            if (param1.field_Gb) {
              this.field_Gb = param1.field_Gb;
            }
            if (param1.field_Q != null) {
              this.field_Q = param1.field_Q;
            }
            if (param1.field_Ab != null) {
              this.field_Ab = param1.field_Ab;
            }
            if (null != param1.field_T) {
              this.field_T = param1.field_T;
            }
            if (0 <= param1.field_fb) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_P >= 0) {
              this.field_P = param1.field_P;
            }
            if (param1.field_ub != 0) {
              this.field_ub = param1.field_ub;
            }
            if (null != param1.field_tb) {
              this.field_tb = param1.field_tb;
            }
            if (param1.field_L) {
              this.field_L = param1.field_L;
            }
            if (param1.field_Db != 0) {
              this.field_Db = param1.field_Db;
            }
            if (!param1.field_Hb) {
              this.field_Hb = param1.field_Hb;
            }
            if (0 <= param1.field_Bb) {
              this.field_Bb = param1.field_Bb;
            }
            if (param1.field_eb != null) {
              this.field_eb = param1.field_eb;
            }
            if (null != param1.field_R) {
              this.field_R = param1.field_R;
            }
            if (param1.field_I != null) {
              this.field_I = param1.field_I;
            }
            if (param1.field_G != 0) {
              this.field_G = param1.field_G;
            }
            if (param1.field_wb != 256) {
              this.field_wb = param1.field_wb;
            }
            if (null != param1.field_J) {
              this.field_J = param1.field_J;
            }
            if (null != param1.field_sb) {
              this.field_sb = param1.field_sb;
            }
            if (param1.field_cb) {
              this.field_cb = param1.field_cb;
            }
            stackIn_66_1 = (this.field_cb) && (param1.field_O);
            this.field_O = stackIn_66_1;
            if (param1.field_db != -2147483648) {
              this.field_db = param1.field_db;
            }
            if (0 != param1.field_Lb) {
              this.field_Lb = param1.field_Lb;
            }
            if (0 != param1.field_X) {
              this.field_X = param1.field_X;
            }
            if (param1.field_hb != -2147483648) {
              this.field_hb = param1.field_hb;
            }
            if (param1.field_nb != -2147483648) {
              this.field_nb = param1.field_nb;
            }
            if (param1.field_ib != -2147483648) {
              this.field_ib = param1.field_ib;
            }
            if (param1.field_Cb != 0) {
              this.field_Cb = param1.field_Cb;
            }
            if (param1.field_V != -2147483648) {
              this.field_V = param1.field_V;
            }
            if (param1.field_W != 0) {
              this.field_W = param1.field_W;
            }
            if (param1.field_Z != -2147483648) {
              this.field_Z = param1.field_Z;
            }
            if (param1.field_U) {
              this.field_U = param1.field_U;
            }
          }
          if (param0 >= -111) {
            this.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_97_0 = var3;
          stackIn_97_1 = new StringBuilder().append("w.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(')').toString());
        }
    }

    final void a(w param0, w param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 != 0) {
            return;
          }
          if (param0 == null) {
            param1.field_Ib = 0;
            param1.field_Mb = 0;
          } else {
            param1.field_Mb = param0.field_Mb + param0.field_F;
            param1.field_Ib = param0.field_N + (param0.field_Ib + param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("w.KA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(byte param0, int param1) {
        w var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = client.field_A ? 1 : 0;
        int var3 = 0;
        int var4_intLifetime1;
        if (this.field_Y != null &&
          this.field_J != null) {
          var4_int = this.field_J.b(this.field_Y, param1);
          if (var4_int > var3) {
            var3 = var4_int;
          }
        }
        if (param0 != 84) {
          this.field_hb = -71;
        }
        if (this.field_I != null) {
          var4_intLifetime1 = this.field_I.field_K;
          if (var3 < var4_intLifetime1) {
            var3 = var4_intLifetime1;
          }
        }
        if (null != this.field_M) {
          var4 = (w) (this.field_M.c((byte) -125));
          while (var4 != null) {
            var5 = var4.field_mb + var4.field_vb;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (w) (this.field_M.d(true));
          }
        }
        return var3;
    }

    protected w() {
        this.field_nb = -2147483648;
        this.field_Bb = -1;
        this.field_V = -2147483648;
        this.field_O = false;
        this.field_Z = -2147483648;
        this.field_db = -2147483648;
        this.field_cb = false;
        this.field_Hb = true;
        this.field_rb = -1;
        this.field_fb = -1;
        this.field_zb = 256;
        this.field_ib = -2147483648;
        this.field_P = -1;
        this.field_wb = 256;
        this.field_hb = -2147483648;
    }

    w(long param0, w param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_nb = -2147483648;
        this.field_Bb = -1;
        this.field_V = -2147483648;
        this.field_O = false;
        this.field_Z = -2147483648;
        this.field_db = -2147483648;
        this.field_cb = false;
        this.field_Hb = true;
        this.field_rb = -1;
        this.field_fb = -1;
        this.field_zb = 256;
        this.field_ib = -2147483648;
        this.field_P = -1;
        this.field_wb = 256;
        this.field_hb = -2147483648;
        try {
          this.field_mb = param4;
          this.field_i = param0;
          this.field_N = param5;
          this.field_vb = param2;
          this.field_Ib = param3;
          this.a(-119, param1);
          if (param6 != null) {
            this.field_Y = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("w.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_Fb = 100;
    }
}
