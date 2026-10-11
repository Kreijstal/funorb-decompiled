/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends ba {
    boolean field_Lb;
    int field_X;
    int field_rb;
    jp[] field_D;
    int field_Fb;
    private int field_J;
    boolean field_Nb;
    boolean field_eb;
    int field_R;
    private int field_W;
    private int field_M;
    jp field_T;
    private int field_qb;
    int field_db;
    dh field_O;
    int field_S;
    private boolean field_Kb;
    int field_ub;
    int field_E;
    int field_Db;
    private int field_sb;
    private int field_yb;
    String field_Cb;
    static re field_H;
    boolean field_G;
    int field_Ob;
    int field_Q;
    jp field_K;
    int field_Ib;
    jp[] field_Gb;
    int field_U;
    jp[] field_pb;
    int field_cb;
    private boolean field_fb;
    int field_zb;
    int field_Y;
    int field_Eb;
    int field_L;
    static int[] field_F;
    boolean field_nb;
    static int field_gb;
    jp[] field_Ab;
    jp field_wb;
    boolean field_kb;
    vl field_bb;
    static mf field_lb;
    static tf field_ab;
    static jp field_ib;
    int field_N;
    String field_Mb;
    private int field_xb;
    int field_jb;
    static String field_Z;
    private boolean field_Bb;
    private int field_hb;
    int field_I;
    int field_V;
    static String field_mb;
    int field_vb;
    jp field_tb;
    int field_P;
    jp[] field_Jb;
    int field_C;
    static oe[] field_ob;
    jp field_Hb;

    mh(long param0, mh param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        boolean stackIn_31_1 = false;
        boolean stackIn_39_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        mh var13;
        int var14;
        mh var15;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = BrickABrac.field_J ? 1 : 0;
        if (param1 != 886229954) {
          var15 = (mh) null;
          this.a((byte) -43, (mh) null);
        }
        if (0 >= this.field_J) {
          var7 = this.field_J >> 2;
        } else {
          var7 = -(-this.field_J >> 2);
        }
        this.field_P = this.field_P + var7;
        this.field_J = this.field_J - var7;
        if (this.field_Db > 0) {
          var7Lifetime1 = -(-this.field_Db >> 2);
        } else {
          var7Lifetime1 = this.field_Db >> 2;
        }
        this.field_zb = this.field_zb + var7Lifetime1;
        this.field_Db = this.field_Db - var7Lifetime1;
        if (0 < this.field_xb) {
          var7Lifetime2 = -(-this.field_xb >> 2);
        } else {
          var7Lifetime2 = this.field_xb >> 2;
        }
        this.field_Ib = this.field_Ib + var7Lifetime2;
        this.field_xb = this.field_xb - var7Lifetime2;
        if (this.field_C > 0) {
          var7Lifetime3 = -(-this.field_C >> 2);
        } else {
          var7Lifetime3 = this.field_C >> 2;
        }
        this.field_C = this.field_C - var7Lifetime3;
        this.field_db = this.field_zb + param4;
        this.field_cb = this.field_cb + var7Lifetime3;
        this.field_Eb = param2 + this.field_P;
        param5 = param5 & this.field_eb;
        var8 = lb.field_i;
        var9 = lb.field_b;
        var10 = lb.field_f;
        var11 = lb.field_j;
        lb.d(this.field_Eb, this.field_db, this.field_Ib + this.field_Eb, this.field_cb + this.field_db);
        var12 = 0;
        if (!wc.field_d &&
          param5 &&
          ki.field_e != 0 &&
          lb.field_i <= tb.field_fb &&
          lb.field_f > tb.field_fb &&
          qo.field_O >= lb.field_b &&
          lb.field_j > qo.field_O) {
          this.field_L = ki.field_e;
          this.field_U = -this.field_Eb + tb.field_fb;
          this.field_Ob = ki.field_e;
          var12 = 1;
          this.field_yb = -this.field_db + qo.field_O;
        } else {
          this.field_L = 0;
          if (0 != ki.field_e) {
            this.field_Ob = 0;
          }
        }
        stackIn_31_1 = (!qa.field_u) && (lb.field_i <= pq.field_k) && (lb.field_f > pq.field_k) && (po.field_a >= lb.field_b) && (lb.field_j > po.field_a);
        this.field_G = stackIn_31_1;
        if (0 == cb.field_q) {
          this.field_Ob = 0;
        }
        stackIn_39_1 = (this.field_G) && (this.field_Ob == cb.field_q) && (param5);
        this.field_kb = stackIn_39_1;
        if (this.field_bb != null) {
          var13 = (mh) (this.field_bb.f(param1 ^ 886229954));
          while (var13 != null) {
            var13.a(this.field_Ib, 886229954, this.field_Eb, this.field_cb, this.field_db, param5);
            var13 = (mh) (this.field_bb.b(33));
          }
        }
        if (this.field_G) {
          qa.field_u = true;
        }
        if (var12 != 0) {
          wc.field_d = true;
        }
        lb.e(var8, var9, var10, var11);
        if (this.field_Ob != 0 &&
          this.field_nb) {
          this.field_zb = po.field_a - this.field_yb - param4;
          this.field_P = -this.field_U + pq.field_k - param2;
          if (0 > this.field_P) {
            this.field_P = 0;
          }
          if (this.field_P > -this.field_Ib + param0) {
            this.field_P = -this.field_Ib + param0;
          }
          if (this.field_zb < 0) {
            this.field_zb = 0;
          }
          if (-this.field_cb + param3 < this.field_zb) {
            this.field_zb = param3 - this.field_cb;
          }
          this.field_Db = 0;
          this.field_Eb = param2 + this.field_P;
          this.field_J = 0;
          this.field_db = param4 + this.field_zb;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, boolean param4, boolean param5, boolean param6, int param7, boolean param8, int param9, boolean param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        jp[] var17;
        jp var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24_int;
        String var24;
        mh var24_ref;
        int var25;
        int var26;
        String var27;
        String var24Lifetime1;
        String var24Lifetime2;
        var26 = BrickABrac.field_J ? 1 : 0;
        this.field_Eb = this.field_P + param9;
        this.field_db = param1 + this.field_zb;
        var13 = -125 / ((param2 - 22) / 33);
        var12 = lb.field_i;
        var14 = lb.field_b;
        var15 = lb.field_f;
        var16 = lb.field_j;
        lb.d(this.field_Eb, this.field_db, this.field_Eb + this.field_Ib, this.field_db + this.field_cb);
        if (!this.field_Kb) {
          param0 = this.field_Nb;
          param4 = this.field_kb;
          stackIn_5_0 = (this.field_Ob != 0);
          param6 = stackIn_5_0;
        }
        param5 = param5 & this.field_eb;
        var17 = this.field_Jb;
        var18 = this.field_wb;
        var19 = this.field_X;
        var20 = 0;
        if (!param5) {
          if (this.field_I >= 0) {
            var19 = this.field_I;
          }
          if (this.field_Ab != null) {
            var17 = this.field_Ab;
          }
          if (this.field_Hb != null) {
            var18 = this.field_Hb;
          }
        }
        var21 = 0;
        if (param4) {
          if (this.field_Gb != null) {
            var17 = this.field_Gb;
          }
          if (this.field_Y >= 0) {
            var19 = this.field_Y;
          }
          if (this.field_sb != -2147483648) {
            var20 = this.field_sb;
          }
          if (null != this.field_T) {
            var18 = this.field_T;
          }
          if (this.field_M != -2147483648) {
            var21 = this.field_M;
          }
        }
        if (param6) {
          if (null != this.field_tb) {
            var18 = this.field_tb;
          }
          if (this.field_D != null) {
            var17 = this.field_D;
          }
          if (-2147483648 != this.field_E) {
            var21 = this.field_E;
          }
          if (this.field_Fb >= 0) {
            var19 = this.field_Fb;
          }
          if (this.field_ub != -2147483648) {
            var20 = this.field_ub;
          }
        }
        if (param0) {
          if (this.field_vb >= 0) {
            var19 = this.field_vb;
          }
          if (null != this.field_K) {
            var18 = this.field_K;
          }
          if (this.field_rb != -2147483648) {
            var20 = this.field_rb;
          }
          if (this.field_pb != null) {
            var17 = this.field_pb;
          }
          if (-2147483648 != this.field_N) {
            var21 = this.field_N;
          }
        }
        var22 = this.field_qb + var20;
        var23 = this.field_hb + var21;
        if (!this.field_Lb) {
          nh.a(this.field_Ib, this.field_cb, -40, this.field_Eb, var17, this.field_db);
        } else {
          nh.a(param3, param7, -40, param9, var17, param1);
        }
        if (var18 != null) {
          var24_int = var22 + this.field_Eb;
          var25 = var23 + this.field_db;
          if (1 == this.field_S) {
            var24_int = var24_int + (this.field_Ib - var18.field_x) / 2;
          }
          if (2 == this.field_S) {
            var24_int = var24_int + (-var18.field_x + this.field_Ib);
          }
          if (1 == this.field_Q) {
            var25 = var25 + (this.field_cb - var18.field_z) / 2;
          }
          if (this.field_Q == 2) {
            var25 = var25 + (this.field_cb - var18.field_z);
          }
          if (256 > this.field_W) {
            var18.b(var24_int, var25, this.field_W);
          } else {
            var18.c(var24_int, var25);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_Mb &&
          this.field_O != null) {
          var27 = this.field_Mb;
          var24 = var27;
          var24Lifetime1 = var27;
          var24Lifetime2 = var27;
          if (param8 &&
            this.field_Cb != null) {
            var24Lifetime2 = var27 + this.field_Cb;
          }
          if (this.field_O.c(var24Lifetime2) <= -(this.field_V * 2) + this.field_Ib &&
            var24Lifetime2.indexOf("<br>") < 0) {
            if (this.field_Q != 1) {
              if (this.field_Q == 2) {
                var23 = var23 + (-this.field_O.field_F + this.field_cb - this.field_O.field_P);
              }
            } else {
              var23 = var23 + (this.field_cb - this.field_O.field_F - this.field_O.field_P) / 2;
            }
            if (this.field_S == 0) {
              this.field_O.c(var24Lifetime2, var22 + (this.field_Eb + this.field_V), this.field_db + var23 + this.field_O.field_F, var19, -1, this.field_jb);
            } else {
              if (this.field_S == 1) {
                this.field_O.b(var24Lifetime2, var22 + this.field_V + this.field_Eb + (-(this.field_V * 2) + this.field_Ib) / 2, this.field_db - (-var23 - this.field_O.field_F), var19, -1, this.field_jb);
              } else {
                if (this.field_S != 2) {
                  this.field_O.a(var24Lifetime2, var22 + (this.field_V + this.field_Eb), var23 + this.field_db, -(2 * this.field_V) + this.field_Ib, this.field_cb, var19, -1, this.field_jb, this.field_S, this.field_Q, this.field_R);
                } else {
                  this.field_O.a(var24Lifetime2, this.field_Eb + this.field_V - (-var22 + this.field_V * 2) + this.field_Ib, this.field_db + (var23 + this.field_O.field_F), var19, -1, this.field_jb);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_O.a(var24Lifetime2, var22 + (this.field_V + this.field_Eb), var23 + this.field_db, -(this.field_V * 2) + this.field_Ib, this.field_cb, var19, -1, this.field_jb, this.field_S, this.field_Q, this.field_R);
          }
        }
        if (this.field_bb != null) {
          var24_ref = (mh) (this.field_bb.d(-46));
          while (var24_ref != null) {
            var24_ref.a(param0, this.field_db + var21, 89, this.field_Ib, param4, param5, param6, this.field_cb, param8, var20 + this.field_Eb, this.field_Bb);
            var24_ref = (mh) (this.field_bb.a((byte) 116));
          }
        }
        lb.e(var12, var14, var15, var16);
    }

    final void a(byte param0, mh param1) {
        boolean stackIn_79_1 = false;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 > -65) {
            return;
          }
          if (param1 != null) {
            if (null != param1.field_Hb) {
              this.field_Hb = param1.field_Hb;
            }
            if (null != param1.field_Cb) {
              this.field_Cb = param1.field_Cb;
            }
            if (null != param1.field_K) {
              this.field_K = param1.field_K;
            }
            if (param1.field_X != 0) {
              this.field_X = param1.field_X;
            }
            if (param1.field_O != null) {
              this.field_O = param1.field_O;
            }
            if (param1.field_Fb >= 0) {
              this.field_Fb = param1.field_Fb;
            }
            if (param1.field_vb >= 0) {
              this.field_vb = param1.field_vb;
            }
            if (param1.field_Jb != null) {
              this.field_Jb = param1.field_Jb;
            }
            if (param1.field_pb != null) {
              this.field_pb = param1.field_pb;
            }
            if (param1.field_fb) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_Y >= 0) {
              this.field_Y = param1.field_Y;
            }
            if (param1.field_T != null) {
              this.field_T = param1.field_T;
            }
            if (param1.field_V != 0) {
              this.field_V = param1.field_V;
            }
            if (!param1.field_eb) {
              this.field_eb = param1.field_eb;
            }
            if (null != param1.field_Ab) {
              this.field_Ab = param1.field_Ab;
            }
            if (param1.field_Kb) {
              this.field_Kb = param1.field_Kb;
            }
            if (null != param1.field_Gb) {
              this.field_Gb = param1.field_Gb;
            }
            if (param1.field_R != 0) {
              this.field_R = param1.field_R;
            }
            if (param1.field_wb != null) {
              this.field_wb = param1.field_wb;
            }
            if (param1.field_Mb != null) {
              this.field_Mb = param1.field_Mb;
            }
            if (param1.field_Nb) {
              this.field_Nb = param1.field_Nb;
            }
            if (null != param1.field_tb) {
              this.field_tb = param1.field_tb;
            }
            if (param1.field_D != null) {
              this.field_D = param1.field_D;
            }
            if (param1.field_Lb) {
              this.field_Lb = param1.field_Lb;
            }
            if (param1.field_jb != 256) {
              this.field_jb = param1.field_jb;
            }
            if (param1.field_I >= 0) {
              this.field_I = param1.field_I;
            }
            if (param1.field_N != -2147483648) {
              this.field_N = param1.field_N;
            }
            if (param1.field_S != 0) {
              this.field_S = param1.field_S;
            }
            if (param1.field_rb != -2147483648) {
              this.field_rb = param1.field_rb;
            }
            stackIn_79_1 = (this.field_fb) && (param1.field_Bb);
            this.field_Bb = stackIn_79_1;
            if (-2147483648 != param1.field_ub) {
              this.field_ub = param1.field_ub;
            }
            if (param1.field_nb) {
              this.field_nb = param1.field_nb;
            }
            if (-2147483648 != param1.field_sb) {
              this.field_sb = param1.field_sb;
            }
            if (param1.field_qb != 0) {
              this.field_qb = param1.field_qb;
            }
            if (param1.field_Q != 0) {
              this.field_Q = param1.field_Q;
            }
            if (param1.field_hb != 0) {
              this.field_hb = param1.field_hb;
            }
            if (param1.field_E != -2147483648) {
              this.field_E = param1.field_E;
            }
            if (param1.field_M != -2147483648) {
              this.field_M = param1.field_M;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_102_0 = var3;
          stackIn_102_1 = new StringBuilder().append("mh.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    mh(long param0, mh param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    public static void c(byte param0) {
        field_Z = null;
        field_ab = null;
        field_ob = null;
        field_ib = null;
        field_H = null;
        field_F = null;
        if (param0 > 60) {
          field_mb = null;
          field_lb = null;
          return;
        }
    }

    final static boolean a(boolean param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (rk.a((byte) -95, param1)) {
          return true;
        }
        if (param1 != 45 &&
          param1 != 160 &&
          32 != param1 &&
          95 != param1) {
          if (param0) {
            return false;
          }
          field_gb = -56;
          return false;
        }
        return true;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        mh var10_ref_mh = null;
        int var9 = 0;
        int var11 = BrickABrac.field_J ? 1 : 0;
        int var5 = -this.field_zb;
        int var6 = var5 - this.field_Db;
        int var7 = this.field_cb;
        int var8 = this.field_C + var7;
        int var9Lifetime1;
        if (!param3) {
          var9 = 0;
          var10_ref_mh = (mh) (this.field_bb.d(param2 ^ 2147483544));
          while (var10_ref_mh != null) {
            var10_ref_mh.field_Db = var9 - var10_ref_mh.field_zb;
            var9 = var9 + (param1 + var10_ref_mh.field_cb + var10_ref_mh.field_C);
            var10_ref_mh = (mh) (this.field_bb.a((byte) 116));
          }
          var8 = -param1 + var9;
        }
        var9Lifetime1 = var8 - param0;
        if (var9Lifetime1 < var6) {
          var6 = var9Lifetime1;
        }
        if (0 > var6) {
          var6 = 0;
        }
        int var10 = -param0 + var7;
        if (var10 < var5) {
          var5 = var10;
        }
        if (0 > var5) {
          var5 = 0;
        }
        this.field_Db = var5 - var6;
        this.field_C = -var7 + var8;
        this.field_cb = var7;
        this.field_zb = -var5;
        if (param2 != -2147483648) {
          mh.c((byte) -123);
        }
    }

    final void c(boolean param0) {
        mh var4 = null;
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (null != this.field_bb) {
          var4 = (mh) (this.field_bb.f(0));
          while (var4 != null) {
            var4.field_Kb = true;
            var4.c(true);
            var4 = (mh) (this.field_bb.b(118));
          }
        }
        if (!param0) {
          this.field_R = -7;
        }
    }

    final void a(boolean param0, int param1) {
        qa.field_u = !param0 ? true : false;
        if (param1 == -15211) {
          wc.field_d = !param0 ? true : false;
          this.a(lb.field_c, 886229954, 0, lb.field_d, 0, true);
          return;
        }
    }

    final void a(boolean param0, boolean param1) {
        this.a(false, 0, -109, lb.field_c, false, param0, false, lb.field_d, param1, 0, false);
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != 64) {
          this.a(105, -91, -77, false);
        }
        this.field_zb = param1;
        this.field_cb = param0;
        this.field_J = 0;
        this.field_xb = 0;
        this.field_C = 0;
        this.field_Ib = param3;
        this.field_Db = 0;
        this.field_P = param2;
    }

    final void a(mh param0, int param1, mh param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 != 17290) {
            return;
          }
          if (param0 != null) {
            param2.field_zb = param1 + param0.field_zb + param0.field_cb;
            param2.field_Db = param0.field_C + param0.field_Db;
          } else {
            param2.field_zb = 0;
            param2.field_Db = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("mh.CA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(mh param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null == this.field_bb) {
            this.field_bb = new vl();
          }
          this.field_bb.a(param0, (byte) 3);
          if (param1 != 0) {
            this.a(-97, -100, 116, 23, -11, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("mh.P(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    protected mh() {
        this.field_rb = -2147483648;
        this.field_W = 256;
        this.field_E = -2147483648;
        this.field_sb = -2147483648;
        this.field_M = -2147483648;
        this.field_ub = -2147483648;
        this.field_Y = -1;
        this.field_Fb = -1;
        this.field_fb = false;
        this.field_eb = true;
        this.field_jb = 256;
        this.field_Bb = false;
        this.field_vb = -1;
        this.field_N = -2147483648;
        this.field_I = -1;
    }

    mh(long param0, mh param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_rb = -2147483648;
        this.field_W = 256;
        this.field_E = -2147483648;
        this.field_sb = -2147483648;
        this.field_M = -2147483648;
        this.field_ub = -2147483648;
        this.field_Y = -1;
        this.field_Fb = -1;
        this.field_fb = false;
        this.field_eb = true;
        this.field_jb = 256;
        this.field_Bb = false;
        this.field_vb = -1;
        this.field_N = -2147483648;
        this.field_I = -1;
        try {
          this.field_zb = param3;
          this.field_g = param0;
          this.field_Ib = param4;
          this.field_P = param2;
          this.field_cb = param5;
          this.a((byte) -67, param1);
          if (param6 != null) {
            this.field_Mb = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("mh.<init>(").append(param0).append(',');
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
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        mh var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        int var3 = param1;
        int var4_intLifetime1;
        if (this.field_Mb != null &&
          null != this.field_O) {
          var4_int = this.field_O.b(this.field_Mb, param0);
          if (var3 < var4_int) {
            var3 = var4_int;
          }
        }
        if (this.field_wb != null) {
          var4_intLifetime1 = this.field_wb.field_x;
          if (var4_intLifetime1 > var3) {
            var3 = var4_intLifetime1;
          }
        }
        if (this.field_bb != null) {
          var4 = (mh) (this.field_bb.d(-85));
          while (var4 != null) {
            var5 = var4.field_P + var4.field_Ib;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (mh) (this.field_bb.a((byte) 116));
          }
        }
        return var3;
    }

    final int g(int param0) {
        if (param0 < 59) {
          this.field_N = -89;
        }
        return this.a(2147483647, 0);
    }

    static {
        field_H = new re(1);
        field_Z = "Game";
        field_gb = -1;
        field_mb = "Log in / Create account";
        field_F = new int[9000];
        field_ob = new oe[8];
        field_ab = new tf();
    }
}
