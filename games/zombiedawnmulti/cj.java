/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cj extends qo {
    ja field_O;
    int field_Y;
    private int field_hb;
    int field_U;
    static String[] field_C;
    static String field_Eb;
    int field_V;
    private int field_y;
    boolean field_Z;
    private boolean field_bb;
    boolean field_fb;
    int field_N;
    private int field_E;
    int field_x;
    int field_qb;
    ja field_rb;
    boolean field_ib;
    int field_J;
    int field_z;
    int field_Q;
    int field_lb;
    boolean field_pb;
    int field_zb;
    static int[] field_F;
    private int field_A;
    int field_Db;
    String field_wb;
    ja[] field_gb;
    int field_mb;
    fm field_yb;
    static String field_B;
    static String field_db;
    ja[] field_ab;
    ja[] field_Bb;
    ja field_nb;
    private int field_v;
    int field_M;
    static volatile boolean field_ub;
    int field_H;
    private int field_G;
    int field_R;
    int field_P;
    int field_jb;
    String field_vb;
    ja field_cb;
    int field_w;
    int field_ob;
    int field_sb;
    int field_T;
    private int field_D;
    private boolean field_kb;
    private boolean field_W;
    ja[] field_S;
    ja[] field_X;
    ja field_K;
    boolean field_L;
    private int field_tb;
    boolean field_Ab;
    th field_Cb;
    int field_eb;
    int field_I;
    int field_xb;

    final void a(byte param0, cj param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null == this.field_Cb) {
            this.field_Cb = new th();
          }
          this.field_Cb.a(param1, false);
          if (param0 != 50) {
            this.field_y = 24;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("cj.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void c(boolean param0, int param1) {
        if (param1 == -1) {
          this.a(oo.field_b, true, oo.field_l, false, false, false, param0, false, 0, param1 ^ -80, 0);
          return;
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 == -11838) {
          me.field_g = !param1 ? true : false;
          bp.field_q = !param1 ? true : false;
          this.a(-100, true, oo.field_l, 0, 0, oo.field_b);
          return;
        }
    }

    final void a(byte param0, int param1, int param2, boolean param3) {
        cj var10_ref_cj = null;
        int var9 = 0;
        int var11 = ZombieDawnMulti.field_E ? 1 : 0;
        int var5 = -this.field_Q;
        int var9Lifetime1;
        if (param0 <= 35) {
          this.f(-65);
        }
        int var6 = -this.field_mb + var5;
        int var7 = this.field_z;
        int var8 = var7 + this.field_I;
        if (!param3) {
          var9 = 0;
          var10_ref_cj = (cj) (this.field_Cb.c(84));
          while (var10_ref_cj != null) {
            var10_ref_cj.field_mb = var9 - var10_ref_cj.field_Q;
            var9 = var9 + (param2 + (var10_ref_cj.field_z + var10_ref_cj.field_I));
            var10_ref_cj = (cj) (this.field_Cb.b(6));
          }
          var8 = -param2 + var9;
        }
        var9Lifetime1 = -param1 + var8;
        if (var9Lifetime1 < var6) {
          var6 = var9Lifetime1;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        int var10 = var7 - param1;
        if (var5 > var10) {
          var5 = var10;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        this.field_I = var8 - var7;
        this.field_z = var7;
        this.field_mb = var5 - var6;
        this.field_Q = -var5;
    }

    final void b(byte param0, cj param1) {
        boolean stackIn_92_1 = false;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -32) {
            this.f(-125);
          }
          if (param1 != null) {
            if (null != param1.field_O) {
              this.field_O = param1.field_O;
            }
            if (param1.field_M != 0) {
              this.field_M = param1.field_M;
            }
            if (param1.field_X != null) {
              this.field_X = param1.field_X;
            }
            if (null != param1.field_vb) {
              this.field_vb = param1.field_vb;
            }
            if (param1.field_ib) {
              this.field_ib = param1.field_ib;
            }
            if (param1.field_V != 0) {
              this.field_V = param1.field_V;
            }
            if (param1.field_H >= 0) {
              this.field_H = param1.field_H;
            }
            if (!param1.field_Z) {
              this.field_Z = param1.field_Z;
            }
            if (0 <= param1.field_xb) {
              this.field_xb = param1.field_xb;
            }
            if (null != param1.field_cb) {
              this.field_cb = param1.field_cb;
            }
            if (param1.field_Y != 256) {
              this.field_Y = param1.field_Y;
            }
            if (null != param1.field_Bb) {
              this.field_Bb = param1.field_Bb;
            }
            if (param1.field_S != null) {
              this.field_S = param1.field_S;
            }
            if (param1.field_rb != null) {
              this.field_rb = param1.field_rb;
            }
            if (param1.field_Ab) {
              this.field_Ab = param1.field_Ab;
            }
            if (param1.field_ob >= 0) {
              this.field_ob = param1.field_ob;
            }
            if (0 <= param1.field_Db) {
              this.field_Db = param1.field_Db;
            }
            if (param1.field_W) {
              this.field_W = param1.field_W;
            }
            if (null != param1.field_yb) {
              this.field_yb = param1.field_yb;
            }
            if (param1.field_J != 0) {
              this.field_J = param1.field_J;
            }
            if (param1.field_ab != null) {
              this.field_ab = param1.field_ab;
            }
            if (param1.field_kb) {
              this.field_kb = param1.field_kb;
            }
            if (null != param1.field_nb) {
              this.field_nb = param1.field_nb;
            }
            if (param1.field_wb != null) {
              this.field_wb = param1.field_wb;
            }
            if (param1.field_gb != null) {
              this.field_gb = param1.field_gb;
            }
            if (null != param1.field_K) {
              this.field_K = param1.field_K;
            }
            if (param1.field_N != -2147483648) {
              this.field_N = param1.field_N;
            }
            if (param1.field_E != -2147483648) {
              this.field_E = param1.field_E;
            }
            if (param1.field_P != -2147483648) {
              this.field_P = param1.field_P;
            }
            if (param1.field_D != 0) {
              this.field_D = param1.field_D;
            }
            if (param1.field_sb != -2147483648) {
              this.field_sb = param1.field_sb;
            }
            if (0 != param1.field_R) {
              this.field_R = param1.field_R;
            }
            if (param1.field_tb != -2147483648) {
              this.field_tb = param1.field_tb;
            }
            if (0 != param1.field_v) {
              this.field_v = param1.field_v;
            }
            stackIn_92_1 = (this.field_kb) && (param1.field_bb);
            this.field_bb = stackIn_92_1;
            if (param1.field_fb) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_lb != 0) {
              this.field_lb = param1.field_lb;
            }
            if (param1.field_eb == -2147483648) {
              return;
            }
            this.field_eb = param1.field_eb;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_102_0 = var3;
          stackIn_102_1 = new StringBuilder().append("cj.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    final void a(int param0, cj param1, int param2, cj param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 != null) {
            param1.field_Q = param0 + param3.field_z + param3.field_Q;
            param1.field_mb = param3.field_I + param3.field_mb;
          } else {
            param1.field_mb = 0;
            param1.field_Q = 0;
          }
          if (param2 != 1300) {
            this.a(56, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("cj.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, int param8, int param9, int param10) {
        boolean stackIn_6_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        ja[] var16;
        ja var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        cj var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_w = this.field_x + param10;
        this.field_qb = this.field_Q + param8;
        var12 = oo.field_f;
        var13 = oo.field_e;
        var14 = oo.field_g;
        var15 = oo.field_d;
        if (param9 < 73) {
          this.a(73, true, 27, false, true, false, false, false, -51, 107, 60);
        }
        oo.e(this.field_w, this.field_qb, this.field_zb + this.field_w, this.field_qb + this.field_z);
        if (!this.field_W) {
          param5 = this.field_Ab;
          param7 = this.field_L;
          stackIn_6_0 = (this.field_jb != 0);
          param4 = stackIn_6_0;
        }
        param1 = param1 & this.field_Z;
        var16 = this.field_ab;
        var17 = this.field_rb;
        var18 = this.field_M;
        var19 = 0;
        var20 = 0;
        if (!param1) {
          if (null != this.field_cb) {
            var17 = this.field_cb;
          }
          if (this.field_H >= 0) {
            var18 = this.field_H;
          }
          if (null != this.field_Bb) {
            var16 = this.field_Bb;
          }
        }
        if (param7) {
          if (this.field_X != null) {
            var16 = this.field_X;
          }
          if (null != this.field_K) {
            var17 = this.field_K;
          }
          if (-2147483648 != this.field_E) {
            var20 = this.field_E;
          }
          if (this.field_ob >= 0) {
            var18 = this.field_ob;
          }
          if (this.field_tb != -2147483648) {
            var19 = this.field_tb;
          }
        }
        if (param4) {
          if (this.field_N != -2147483648) {
            var20 = this.field_N;
          }
          if (this.field_xb >= 0) {
            var18 = this.field_xb;
          }
          if (this.field_sb != -2147483648) {
            var19 = this.field_sb;
          }
          if (null != this.field_nb) {
            var17 = this.field_nb;
          }
          if (null != this.field_S) {
            var16 = this.field_S;
          }
        }
        if (param5) {
          if (null != this.field_gb) {
            var16 = this.field_gb;
          }
          if (this.field_P != -2147483648) {
            var20 = this.field_P;
          }
          if (this.field_Db >= 0) {
            var18 = this.field_Db;
          }
          if (null != this.field_O) {
            var17 = this.field_O;
          }
          if (this.field_eb != -2147483648) {
            var19 = this.field_eb;
          }
        }
        var21 = var19 + this.field_D;
        var22 = var20 + this.field_v;
        if (!this.field_ib) {
          s.a(this.field_qb, 0, var16, this.field_w, this.field_z, this.field_zb);
        } else {
          s.a(param8, 0, var16, param10, param2, param0);
        }
        if (var17 != null) {
          var23_int = var21 + this.field_w;
          var24 = this.field_qb + var22;
          if (this.field_R == 1) {
            var23_int = var23_int + (this.field_zb - var17.field_z) / 2;
          }
          if (1 == this.field_lb) {
            var24 = var24 + (this.field_z - var17.field_u) / 2;
          }
          if (this.field_R == 2) {
            var23_int = var23_int + (this.field_zb - var17.field_z);
          }
          if (2 == this.field_lb) {
            var24 = var24 + (this.field_z - var17.field_u);
          }
          if (256 > this.field_hb) {
            var17.c(var23_int, var24, this.field_hb);
          } else {
            var17.g(var23_int, var24);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_wb != null &&
          this.field_yb != null) {
          var26 = this.field_wb;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param6 &&
            null != this.field_vb) {
            var23Lifetime2 = var26 + this.field_vb;
          }
          if (this.field_yb.a(var23Lifetime2) <= -(2 * this.field_V) + this.field_zb &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.field_lb != 1) {
              if (this.field_lb == 2) {
                var22 = var22 + (-this.field_yb.field_r + (this.field_z - this.field_yb.field_C));
              }
            } else {
              var22 = var22 + (-this.field_yb.field_r + (this.field_z - this.field_yb.field_C)) / 2;
            }
            if (this.field_R == 0) {
              this.field_yb.b(var23Lifetime2, var21 + (this.field_w + this.field_V), this.field_qb + (var22 + this.field_yb.field_C), var18, -1, this.field_Y);
            } else {
              if (1 == this.field_R) {
                this.field_yb.a(var23Lifetime2, (this.field_zb - 2 * this.field_V) / 2 + (this.field_V + (this.field_w + var21)), this.field_yb.field_C + (this.field_qb + var22), var18, -1, this.field_Y);
              } else {
                if (this.field_R != 2) {
                  this.field_yb.a(var23Lifetime2, var21 + this.field_V + this.field_w, this.field_qb + var22, this.field_zb - 2 * this.field_V, this.field_z, var18, -1, this.field_Y, this.field_R, this.field_lb, this.field_J);
                } else {
                  this.field_yb.c(var23Lifetime2, -(this.field_V * 2) + (this.field_zb + this.field_V + (this.field_w + var21)), this.field_yb.field_C + (this.field_qb + var22), var18, -1, this.field_Y);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_yb.a(var23Lifetime2, this.field_w + (this.field_V + var21), var22 + this.field_qb, this.field_zb - this.field_V * 2, this.field_z, var18, -1, this.field_Y, this.field_R, this.field_lb, this.field_J);
          }
        }
        if (null != this.field_Cb) {
          var23_ref = (cj) (this.field_Cb.c(39));
          while (var23_ref != null) {
            var23_ref.a(this.field_zb, param1, this.field_z, this.field_bb, param4, param5, param6, param7, var20 + this.field_qb, 80, var19 + this.field_w);
            var23_ref = (cj) (this.field_Cb.b(6));
          }
        }
        oo.h(var12, var13, var14, var15);
    }

    public static void c(boolean param0) {
        field_C = null;
        field_db = null;
        if (param0) {
          cj.g(-31);
        }
        field_Eb = null;
        field_B = null;
        field_F = null;
    }

    cj(long param0, cj param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    cj(long param0, cj param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_Q = param1;
        this.field_mb = 0;
        this.field_I = 0;
        this.field_zb = param2;
        if (param4 == -3344) {
          this.field_x = param3;
          this.field_z = param0;
          this.field_A = 0;
          this.field_y = 0;
          return;
        }
    }

    final void f(int param0) {
        cj var4 = null;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 > -127) {
          this.field_z = -78;
        }
        if (null != this.field_Cb) {
          var4 = (cj) (this.field_Cb.a((byte) -81));
          while (var4 != null) {
            var4.field_W = true;
            var4.f(-128);
            var4 = (cj) (this.field_Cb.c((byte) 123));
          }
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        boolean stackIn_34_1 = false;
        boolean stackIn_39_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        cj var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_A <= 0) {
          var7 = this.field_A >> 2;
        } else {
          var7 = -(-this.field_A >> 2);
        }
        this.field_x = this.field_x + var7;
        this.field_A = this.field_A - var7;
        if (this.field_mb <= 0) {
          var7Lifetime1 = this.field_mb >> 2;
        } else {
          var7Lifetime1 = -(-this.field_mb >> 2);
        }
        this.field_Q = this.field_Q + var7Lifetime1;
        this.field_mb = this.field_mb - var7Lifetime1;
        if (this.field_y > 0) {
          var7Lifetime2 = -(-this.field_y >> 2);
        } else {
          var7Lifetime2 = this.field_y >> 2;
        }
        this.field_zb = this.field_zb + var7Lifetime2;
        this.field_y = this.field_y - var7Lifetime2;
        if (this.field_I > 0) {
          var7Lifetime3 = -(-this.field_I >> 2);
        } else {
          var7Lifetime3 = this.field_I >> 2;
        }
        this.field_w = param3 + this.field_x;
        this.field_qb = param4 + this.field_Q;
        this.field_z = this.field_z + var7Lifetime3;
        param1 = param1 & this.field_Z;
        this.field_I = this.field_I - var7Lifetime3;
        var8 = oo.field_f;
        var9 = oo.field_e;
        var10 = oo.field_g;
        var11 = oo.field_d;
        oo.e(this.field_w, this.field_qb, this.field_zb + this.field_w, this.field_z + this.field_qb);
        var12 = 0;
        if (!bp.field_q &&
          param1 &&
          kd.field_b != 0 &&
          oo.field_f <= vb.field_f &&
          vb.field_f < oo.field_g &&
          ka.field_t >= oo.field_e &&
          ka.field_t < oo.field_d) {
          this.field_T = kd.field_b;
          this.field_G = -this.field_qb + ka.field_t;
          this.field_jb = kd.field_b;
          var12 = 1;
          this.field_U = vb.field_f - this.field_w;
        } else {
          if (kd.field_b != 0) {
            this.field_jb = 0;
          }
          this.field_T = 0;
        }
        if (pq.field_f == 0) {
          this.field_jb = 0;
        }
        stackIn_34_1 = (!me.field_g) && (oo.field_f <= bd.field_g) && (bd.field_g < oo.field_g) && (oo.field_e <= bo.field_d) && (oo.field_d > bo.field_d);
        this.field_pb = stackIn_34_1;
        stackIn_39_1 = (this.field_pb) && (this.field_jb == pq.field_f) && (param1);
        this.field_L = stackIn_39_1;
        if (this.field_Cb != null) {
          var13 = (cj) (this.field_Cb.a((byte) -44));
          while (var13 != null) {
            var13.a(-120, param1, this.field_z, this.field_w, this.field_qb, this.field_zb);
            var13 = (cj) (this.field_Cb.c((byte) 109));
          }
        }
        if (this.field_pb) {
          me.field_g = true;
        }
        if (param0 > -6) {
          this.field_wb = (String) null;
        }
        if (var12 != 0) {
          bp.field_q = true;
        }
        oo.h(var8, var9, var10, var11);
        if (0 != this.field_jb &&
          this.field_fb) {
          this.field_x = -param3 - this.field_U + bd.field_g;
          this.field_Q = -this.field_G + (bo.field_d - param4);
          if (this.field_x < 0) {
            this.field_x = 0;
          }
          if (param5 - this.field_zb < this.field_x) {
            this.field_x = param5 - this.field_zb;
          }
          if (this.field_Q < 0) {
            this.field_Q = 0;
          }
          if (-this.field_z + param2 < this.field_Q) {
            this.field_Q = -this.field_z + param2;
          }
          this.field_A = 0;
          this.field_w = param3 + this.field_x;
          this.field_mb = 0;
          this.field_qb = param4 + this.field_Q;
        }
    }

    final static void d(boolean param0, int param1) {
        if (!df.field_H) {
          return;
        }
        fk.a(hl.field_d[param1], true);
        if (param0) {
          return;
        }
        td.field_b = null;
    }

    final static String g(int param0) {
        if (2 > fn.field_i) {
          return lo.field_f;
        }
        if (null != cp.field_P) {
          if (!cp.field_P.a((byte) -122)) {
            return ud.field_Y;
          }
          return nh.field_n;
        }
        if (!ra.field_l.a((byte) -110)) {
          return bc.field_a;
        }
        if (!ra.field_l.a(false, "commonui")) {
          return ei.field_e + " - " + ra.field_l.a(0, "commonui") + "%";
        }
        if (!fe.field_L.a((byte) -123)) {
          return sm.field_b;
        }
        if (!fe.field_L.a(false, "commonui")) {
          return bc.field_b + " - " + fe.field_L.a(0, "commonui") + "%";
        }
        if (!wm.field_V.a((byte) -117)) {
          return pd.field_a;
        }
        if (!wm.field_V.a(param0 ^ param0)) {
          return s.field_h + " - " + wm.field_V.b(param0 - 18006) + "%";
        }
        return op.field_l;
    }

    final static int a(ka param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = wj.field_g;
          if (param1 >= -45) {
            cj.c(false);
          }
          if (param0.field_l == 2) {
            if (!param0.field_k) {
              if (0 == param0.field_i &&
                param0.field_o == 0) {
                var2_intLifetime1 = pq.field_m[param0.field_l];
              } else {
                var2_intLifetime1 = wp.field_c[param0.field_l];
              }
            } else {
              var2_intLifetime1 = wj.field_g;
            }
          } else {
            if (param0.field_l == 4) {
              var2_intLifetime1 = wp.field_c[param0.field_l];
            } else {
              if (ie.field_sb != param0.field_a) {
                var2_intLifetime1 = wp.field_c[param0.field_l];
              } else {
                var2_intLifetime1 = pq.field_m[param0.field_l];
              }
            }
          }
          stackIn_17_0 = var2_intLifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("cj.S(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final int e(int param0) {
        if (param0 != 0) {
          this.field_U = 72;
        }
        return this.a(param0 - 1, 2147483647);
    }

    final int a(int param0, int param1) {
        cj var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3 = 0;
        int var4_intLifetime1;
        if (this.field_wb != null &&
          this.field_yb != null) {
          var4_int = this.field_yb.c(this.field_wb, param1);
          if (var3 < var4_int) {
            var3 = var4_int;
          }
        }
        if (this.field_rb != null) {
          var4_intLifetime1 = this.field_rb.field_z;
          if (var3 < var4_intLifetime1) {
            var3 = var4_intLifetime1;
          }
        }
        if (this.field_Cb != null) {
          var4 = (cj) (this.field_Cb.c(param0 + 112));
          while (var4 != null) {
            var5 = var4.field_zb + var4.field_x;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (cj) (this.field_Cb.b(6));
          }
        }
        if (param0 != -1) {
          cj var7 = (cj) null;
          this.a(-56, (cj) null, 17, (cj) null);
        }
        return var3;
    }

    public cj() {
        this.field_hb = 256;
        this.field_bb = false;
        this.field_N = -2147483648;
        this.field_Db = -1;
        this.field_H = -1;
        this.field_sb = -2147483648;
        this.field_kb = false;
        this.field_Y = 256;
        this.field_E = -2147483648;
        this.field_P = -2147483648;
        this.field_Z = true;
        this.field_tb = -2147483648;
        this.field_eb = -2147483648;
        this.field_ob = -1;
        this.field_xb = -1;
    }

    cj(long param0, cj param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_hb = 256;
        this.field_bb = false;
        this.field_N = -2147483648;
        this.field_Db = -1;
        this.field_H = -1;
        this.field_sb = -2147483648;
        this.field_kb = false;
        this.field_Y = 256;
        this.field_E = -2147483648;
        this.field_P = -2147483648;
        this.field_Z = true;
        this.field_tb = -2147483648;
        this.field_eb = -2147483648;
        this.field_ob = -1;
        this.field_xb = -1;
        try {
          this.field_zb = param4;
          this.field_e = param0;
          this.field_z = param5;
          this.field_Q = param3;
          this.field_x = param2;
          this.b((byte) -32, param1);
          if (param6 != null) {
            this.field_wb = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("cj.<init>(").append(param0).append(',');
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
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_Eb = "Connection lost. <%0>";
        field_C = new String[]{"All scores", "My scores", "Best each"};
        field_F = new int[8192];
        field_B = "Hammer";
        field_db = "Use on one of your zombies to make it travel faster than its stench.";
        field_ub = true;
    }
}
