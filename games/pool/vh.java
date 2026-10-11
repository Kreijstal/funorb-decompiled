/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vh extends o {
    int field_zb;
    int field_O;
    static int field_L;
    int field_M;
    int field_mb;
    int field_N;
    private int field_bb;
    int field_V;
    private boolean field_U;
    dd field_hb;
    private boolean field_ub;
    private int field_wb;
    private int field_rb;
    boolean field_pb;
    static String field_S;
    boolean field_Jb;
    dd[] field_Y;
    dd field_ab;
    boolean field_db;
    int field_ib;
    dd[] field_X;
    dd[] field_Gb;
    private int field_lb;
    int field_H;
    int field_eb;
    int field_Eb;
    boolean field_J;
    static hq field_Ab;
    private int field_vb;
    dd field_xb;
    String field_kb;
    int field_Cb;
    int field_K;
    lr field_I;
    int field_Bb;
    int field_Z;
    int field_sb;
    String field_nb;
    ko field_T;
    dd field_yb;
    int field_Fb;
    int field_tb;
    boolean field_W;
    dd[] field_Kb;
    int field_R;
    dd field_G;
    private boolean field_fb;
    dd[] field_F;
    int field_Db;
    int field_qb;
    int field_P;
    int field_jb;
    boolean field_Ib;
    private int field_Hb;
    int field_Q;
    int field_cb;
    int field_E;
    int field_gb;
    int field_ob;

    final vh a(long param0, byte param1) {
        vh var5;
        int var6;
        vh var7;
        var6 = Pool.field_O;
        if (param0 == this.field_c) {
          return this;
        }
        if (param1 != 31) {
          return (vh) null;
        }
        if (this.field_T == null) {
          return null;
        }
        var7 = (vh) (this.field_T.c((byte) 111));
        while (var7 != null) {
          var5 = var7.a(param0, (byte) 31);
          if (var5 != null) {
            return var5;
          }
          var7 = (vh) (this.field_T.f((byte) -5));
        }
        return null;
    }

    final int a(int param0, int param1) {
        vh var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var4_intLifetime1;
        if (param0 >= -54) {
          this.d((byte) 74);
        }
        int var3 = 0;
        if (null != this.field_nb &&
          this.field_I != null) {
          var4_int = this.field_I.a(this.field_nb, param1);
          if (var4_int > var3) {
            var3 = var4_int;
          }
        }
        if (this.field_hb != null) {
          var4_intLifetime1 = this.field_hb.field_w;
          if (var4_intLifetime1 > var3) {
            var3 = var4_intLifetime1;
          }
        }
        if (this.field_T != null) {
          var4 = (vh) (this.field_T.c((byte) 69));
          while (var4 != null) {
            var5 = var4.field_qb + var4.field_gb;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (vh) (this.field_T.f((byte) -5));
          }
        }
        return var3;
    }

    final void a(byte param0, vh param1) {
        boolean stackIn_96_1 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (param1.field_hb != null) {
              this.field_hb = param1.field_hb;
            }
            if (null != param1.field_Y) {
              this.field_Y = param1.field_Y;
            }
            if (param1.field_F != null) {
              this.field_F = param1.field_F;
            }
            if (null != param1.field_nb) {
              this.field_nb = param1.field_nb;
            }
            if (param1.field_ab != null) {
              this.field_ab = param1.field_ab;
            }
            if (0 <= param1.field_P) {
              this.field_P = param1.field_P;
            }
            if (null != param1.field_Gb) {
              this.field_Gb = param1.field_Gb;
            }
            if (0 <= param1.field_Bb) {
              this.field_Bb = param1.field_Bb;
            }
            if (param1.field_tb != 0) {
              this.field_tb = param1.field_tb;
            }
            if (param1.field_N != 0) {
              this.field_N = param1.field_N;
            }
            if (param1.field_xb != null) {
              this.field_xb = param1.field_xb;
            }
            if (param1.field_Ib) {
              this.field_Ib = param1.field_Ib;
            }
            if (param1.field_X != null) {
              this.field_X = param1.field_X;
            }
            if (!param1.field_pb) {
              this.field_pb = param1.field_pb;
            }
            if (param1.field_J) {
              this.field_J = param1.field_J;
            }
            if (0 <= param1.field_zb) {
              this.field_zb = param1.field_zb;
            }
            if (param1.field_ub) {
              this.field_ub = param1.field_ub;
            }
            if (param1.field_I != null) {
              this.field_I = param1.field_I;
            }
            if (param1.field_M != 0) {
              this.field_M = param1.field_M;
            }
            if (param1.field_yb != null) {
              this.field_yb = param1.field_yb;
            }
            if (param1.field_Kb != null) {
              this.field_Kb = param1.field_Kb;
            }
            if (null != param1.field_kb) {
              this.field_kb = param1.field_kb;
            }
            if (null != param1.field_G) {
              this.field_G = param1.field_G;
            }
            if (param1.field_Eb != 256) {
              this.field_Eb = param1.field_Eb;
            }
            if (param1.field_U) {
              this.field_U = param1.field_U;
            }
            if (param1.field_K >= 0) {
              this.field_K = param1.field_K;
            }
            if (param1.field_Fb != 0) {
              this.field_Fb = param1.field_Fb;
            }
            if (param1.field_Z != -2147483648) {
              this.field_Z = param1.field_Z;
            }
            if (-2147483648 != param1.field_Q) {
              this.field_Q = param1.field_Q;
            }
            if (param1.field_cb != 0) {
              this.field_cb = param1.field_cb;
            }
            if (param1.field_H != -2147483648) {
              this.field_H = param1.field_H;
            }
            if (param1.field_Jb) {
              this.field_Jb = param1.field_Jb;
            }
            if (0 != param1.field_V) {
              this.field_V = param1.field_V;
            }
            if (param1.field_O != -2147483648) {
              this.field_O = param1.field_O;
            }
            if (param1.field_wb != -2147483648) {
              this.field_wb = param1.field_wb;
            }
            if (param1.field_vb != -2147483648) {
              this.field_vb = param1.field_vb;
            }
            stackIn_96_1 = (this.field_U) && (param1.field_fb);
            this.field_fb = stackIn_96_1;
            if (param1.field_ob != 0) {
              this.field_ob = param1.field_ob;
            }
          }
          if (param0 != -87) {
            this.field_U = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_104_0 = var3;
          stackIn_104_1 = new StringBuilder().append("vh.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
        }
    }

    final void d(byte param0) {
        vh var3 = null;
        if (null != this.field_T) {
          var3 = (vh) (this.field_T.a((byte) -127));
          while (var3 != null) {
            var3.field_ub = true;
            var3.d((byte) -128);
            var3 = (vh) (this.field_T.b((byte) -46));
          }
        }
        if (param0 >= -123) {
          this.field_mb = -106;
        }
    }

    final void a(byte param0, boolean param1) {
        this.a(false, 0, (byte) 85, false, false, qh.field_f, 0, qh.field_l, param1, false, true);
        if (param0 != -79) {
          this.field_Cb = 21;
        }
    }

    private final void a(boolean param0, int param1, byte param2, boolean param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9, boolean param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        dd[] var16;
        dd var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        vh var23_ref;
        int var24;
        String var25;
        String var23Lifetime1;
        String var23Lifetime2;
        this.field_ib = this.field_eb + param6;
        this.field_sb = this.field_qb + param1;
        var12 = qh.field_b;
        var13 = qh.field_c;
        var14 = qh.field_j;
        var15 = qh.field_g;
        qh.d(this.field_sb, this.field_ib, this.field_gb + this.field_sb, this.field_ib + this.field_Db);
        if (!this.field_ub) {
          param4 = this.field_W;
          stackIn_5_0 = (this.field_jb != 0);
          param0 = stackIn_5_0;
          param3 = this.field_Ib;
        }
        param10 = param10 & this.field_pb;
        var16 = this.field_F;
        var17 = this.field_hb;
        var18 = this.field_N;
        var19 = 0;
        var20 = 0;
        if (!param10) {
          if (this.field_Y != null) {
            var16 = this.field_Y;
          }
          if (this.field_zb >= 0) {
            var18 = this.field_zb;
          }
          if (null != this.field_ab) {
            var17 = this.field_ab;
          }
        }
        if (param4) {
          if (this.field_Gb != null) {
            var16 = this.field_Gb;
          }
          if (this.field_xb != null) {
            var17 = this.field_xb;
          }
          if (this.field_wb != -2147483648) {
            var19 = this.field_wb;
          }
          if (this.field_K >= 0) {
            var18 = this.field_K;
          }
          if (this.field_vb != -2147483648) {
            var20 = this.field_vb;
          }
        }
        if (param0) {
          if (this.field_H != -2147483648) {
            var19 = this.field_H;
          }
          if (this.field_P >= 0) {
            var18 = this.field_P;
          }
          if (this.field_Q != -2147483648) {
            var20 = this.field_Q;
          }
          if (null != this.field_G) {
            var17 = this.field_G;
          }
          if (this.field_X != null) {
            var16 = this.field_X;
          }
        }
        if (param3) {
          if (this.field_Kb != null) {
            var16 = this.field_Kb;
          }
          if (this.field_yb != null) {
            var17 = this.field_yb;
          }
          if (this.field_Bb >= 0) {
            var18 = this.field_Bb;
          }
          if (this.field_O != -2147483648) {
            var20 = this.field_O;
          }
          if (this.field_Z != -2147483648) {
            var19 = this.field_Z;
          }
        }
        var21 = var19 + this.field_V;
        if (param2 != 85) {
          this.field_V = -109;
        }
        var22 = var20 + this.field_ob;
        if (!this.field_J) {
          nj.a(var16, (byte) -85, this.field_gb, this.field_sb, this.field_ib, this.field_Db);
        } else {
          nj.a(var16, (byte) -107, param7, param1, param6, param5);
        }
        if (var17 != null) {
          var23_int = var21 + this.field_sb;
          var24 = this.field_ib + var22;
          if (this.field_Fb == 1) {
            var23_int = var23_int + (-var17.field_w + this.field_gb) / 2;
          }
          if (this.field_Fb == 2) {
            var23_int = var23_int + (-var17.field_w + this.field_gb);
          }
          if (this.field_cb == 1) {
            var24 = var24 + (this.field_Db - var17.field_y) / 2;
          }
          if (this.field_cb == 2) {
            var24 = var24 + (-var17.field_y + this.field_Db);
          }
          if (this.field_lb >= 256) {
            var17.c(var23_int, var24);
          } else {
            var17.a(var23_int, var24, this.field_lb);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_nb &&
          this.field_I != null) {
          var25 = this.field_nb;
          var23 = var25;
          var23Lifetime1 = var25;
          var23Lifetime2 = var25;
          if (param8 &&
            null != this.field_kb) {
            var23Lifetime2 = var25 + this.field_kb;
          }
          if (this.field_I.b(var23Lifetime2) <= this.field_gb - this.field_tb * 2 &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.field_cb != 1) {
              if (this.field_cb == 2) {
                var22 = var22 + (this.field_Db - (this.field_I.field_w + this.field_I.field_C));
              }
            } else {
              var22 = var22 + (this.field_Db - (this.field_I.field_C + this.field_I.field_w)) / 2;
            }
            if (0 == this.field_Fb) {
              this.field_I.b(var23Lifetime2, this.field_tb + (this.field_sb + var21), this.field_I.field_C + (var22 + this.field_ib), var18, -1, this.field_Eb);
            } else {
              if (this.field_Fb == 1) {
                this.field_I.a(var23Lifetime2, (-(this.field_tb * 2) + this.field_gb) / 2 + var21 + (this.field_sb + this.field_tb), this.field_I.field_C + var22 + this.field_ib, var18, -1, this.field_Eb);
              } else {
                if (this.field_Fb != 2) {
                  this.field_I.a(var23Lifetime2, this.field_tb + (this.field_sb + var21), this.field_ib + var22, -(2 * this.field_tb) + this.field_gb, this.field_Db, var18, -1, this.field_Eb, this.field_Fb, this.field_cb, this.field_M);
                } else {
                  this.field_I.c(var23Lifetime2, this.field_tb + (this.field_sb + var21 - (-this.field_gb + this.field_tb * 2)), this.field_I.field_C + var22 + this.field_ib, var18, -1, this.field_Eb);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_I.a(var23Lifetime2, this.field_tb + this.field_sb + var21, this.field_ib + var22, this.field_gb - this.field_tb * 2, this.field_Db, var18, -1, this.field_Eb, this.field_Fb, this.field_cb, this.field_M);
          }
        }
        if (null != this.field_T) {
          var23_ref = (vh) (this.field_T.c((byte) -87));
          while (var23_ref != null) {
            var23_ref.a(param0, this.field_sb + var19, (byte) 85, param3, param4, this.field_Db, this.field_ib + var20, this.field_gb, param8, this.field_fb, param10);
            var23_ref = (vh) (this.field_T.f((byte) -5));
          }
        }
        qh.c(var12, var13, var14, var15);
    }

    final void a(vh param0, int param1, vh param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 > -40) {
            this.field_Bb = 69;
          }
          if (param0 == null) {
            param2.field_eb = 0;
            param2.field_E = 0;
          } else {
            param2.field_E = param0.field_E + param0.field_Cb;
            param2.field_eb = param0.field_eb + (param0.field_Db + param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("vh.JA(");
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
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 != 8) {
          field_L = -59;
        }
        field_S = null;
        field_Ab = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        vh var10_ref_vh = null;
        int var10 = 0;
        int var9 = 0;
        int var9Lifetime1;
        if (param3 == -1) {
          var5 = -this.field_eb;
          var6 = -this.field_E + var5;
          var7 = this.field_Db;
          var8 = this.field_Cb + var7;
          if (!param2) {
            var9 = 0;
            var10_ref_vh = (vh) (this.field_T.c((byte) -82));
            while (var10_ref_vh != null) {
              var10_ref_vh.field_E = var9 - var10_ref_vh.field_eb;
              var9 = var9 + (param0 + var10_ref_vh.field_Cb + var10_ref_vh.field_Db);
              var10_ref_vh = (vh) (this.field_T.f((byte) -5));
            }
            var8 = -param0 + var9;
          }
          var9Lifetime1 = var8 - param1;
          if (var6 > var9Lifetime1) {
            var6 = var9Lifetime1;
          }
          if (var6 < 0) {
            var6 = 0;
          }
          var10 = -param1 + var7;
          if (var5 > var10) {
            var5 = var10;
          }
          if (var5 < 0) {
            var5 = 0;
          }
          this.field_Db = var7;
          this.field_eb = -var5;
          this.field_E = var5 - var6;
          this.field_Cb = -var7 + var8;
          return;
        }
    }

    final void a(boolean param0, boolean param1) {
        rc.field_d = !param0 ? true : false;
        if (param1) {
          this.field_hb = (dd) null;
        }
        cl.field_f = !param0 ? true : false;
        this.a(0, true, qh.field_l, qh.field_f, (byte) 107, 0);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        this.field_E = 0;
        this.field_Cb = 0;
        this.field_bb = 0;
        this.field_eb = param0;
        this.field_rb = 0;
        this.field_Db = param4;
        this.field_gb = param3;
        if (param1 != 2147483647) {
          this.b(23, -24, 46, 74, -74);
        }
        this.field_qb = param2;
    }

    private final void a(int param0, boolean param1, int param2, int param3, byte param4, int param5) {
        boolean stackIn_33_1 = false;
        boolean stackIn_38_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        vh var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        if (this.field_rb > 0) {
          var7 = -(-this.field_rb >> 2);
        } else {
          var7 = this.field_rb >> 2;
        }
        this.field_qb = this.field_qb + var7;
        this.field_rb = this.field_rb - var7;
        if (0 < this.field_E) {
          var7Lifetime1 = -(-this.field_E >> 2);
        } else {
          var7Lifetime1 = this.field_E >> 2;
        }
        this.field_eb = this.field_eb + var7Lifetime1;
        this.field_E = this.field_E - var7Lifetime1;
        if (0 < this.field_bb) {
          var7Lifetime2 = -(-this.field_bb >> 2);
        } else {
          var7Lifetime2 = this.field_bb >> 2;
        }
        this.field_gb = this.field_gb + var7Lifetime2;
        this.field_bb = this.field_bb - var7Lifetime2;
        if (0 >= this.field_Cb) {
          var7Lifetime3 = this.field_Cb >> 2;
        } else {
          var7Lifetime3 = -(-this.field_Cb >> 2);
        }
        this.field_sb = this.field_qb + param5;
        param1 = param1 & this.field_pb;
        this.field_ib = param0 + this.field_eb;
        this.field_Cb = this.field_Cb - var7Lifetime3;
        this.field_Db = this.field_Db + var7Lifetime3;
        var8 = qh.field_b;
        var9 = qh.field_c;
        var11 = 123 % ((28 - param4) / 34);
        var10 = qh.field_j;
        var12 = qh.field_g;
        qh.d(this.field_sb, this.field_ib, this.field_sb + this.field_gb, this.field_Db + this.field_ib);
        var13 = 0;
        if (!rc.field_d &&
          param1 &&
          0 != ne.field_s &&
          qh.field_b <= lq.field_W &&
          lq.field_W < qh.field_j &&
          qh.field_c <= ua.field_o &&
          qh.field_g > ua.field_o) {
          this.field_Hb = ua.field_o - this.field_ib;
          var13 = 1;
          this.field_R = ne.field_s;
          this.field_mb = lq.field_W - this.field_sb;
          this.field_jb = ne.field_s;
        } else {
          if (0 != ne.field_s) {
            this.field_jb = 0;
          }
          this.field_R = 0;
        }
        if (0 == cd.field_b) {
          this.field_jb = 0;
        }
        stackIn_33_1 = (!cl.field_f) && (qh.field_b <= wn.field_i) && (wn.field_i < qh.field_j) && (gg.field_f >= qh.field_c) && (qh.field_g > gg.field_f);
        this.field_db = stackIn_33_1;
        stackIn_38_1 = (this.field_db) && (this.field_jb == cd.field_b) && (param1);
        this.field_W = stackIn_38_1;
        if (this.field_T != null) {
          var14 = (vh) (this.field_T.a((byte) -127));
          while (var14 != null) {
            var14.a(this.field_ib, param1, this.field_gb, this.field_Db, (byte) 63, this.field_sb);
            var14 = (vh) (this.field_T.b((byte) -46));
          }
        }
        if (var13 != 0) {
          rc.field_d = true;
        }
        if (this.field_db) {
          cl.field_f = true;
        }
        qh.c(var8, var9, var10, var12);
        if (this.field_jb != 0 &&
          this.field_Jb) {
          this.field_qb = -param5 + (wn.field_i - this.field_mb);
          this.field_eb = -param0 + (gg.field_f - this.field_Hb);
          if (this.field_qb < 0) {
            this.field_qb = 0;
          }
          if (this.field_eb < 0) {
            this.field_eb = 0;
          }
          if (param2 - this.field_gb < this.field_qb) {
            this.field_qb = param2 - this.field_gb;
          }
          this.field_sb = param5 + this.field_qb;
          this.field_rb = 0;
          if (param3 - this.field_Db < this.field_eb) {
            this.field_eb = -this.field_Db + param3;
          }
          this.field_E = 0;
          this.field_ib = this.field_eb + param0;
        }
    }

    vh(String param0, vh param1, int param2, int param3, int param4, int param5, String param6) {
        this(qo.a(112, (CharSequence) ((Object) param0)), param1, param2, param3, param4, param5, param6);
    }

    vh(String param0, vh param1) {
        this(qo.a(109, (CharSequence) ((Object) param0)), param1, 0, 0, 0, 0, (String) null);
    }

    vh(long param0, vh param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    vh(long param0, vh param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(int param0, vh param1) {
        try {
          int var3_int = 118 / ((param0 + 50) / 43);
          if (this.field_T == null) {
            this.field_T = new ko();
          }
          this.field_T.b((byte) -83, param1);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "vh.MA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(boolean param0) {
        if (!param0) {
          return -108;
        }
        return this.a(-126, 2147483647);
    }

    final static dd a(int param0, di param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        dd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -28) {
            field_Ab = (hq) null;
          }
          if (vj.a(param0, param1, param3, (byte) 121)) {
            stackIn_6_0 = aj.f((byte) 89);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (dd) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("vh.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public vh() {
        this.field_H = -2147483648;
        this.field_lb = 256;
        this.field_pb = true;
        this.field_wb = -2147483648;
        this.field_K = -1;
        this.field_O = -2147483648;
        this.field_Bb = -1;
        this.field_vb = -2147483648;
        this.field_zb = -1;
        this.field_U = false;
        this.field_Z = -2147483648;
        this.field_Eb = 256;
        this.field_P = -1;
        this.field_Q = -2147483648;
        this.field_fb = false;
    }

    vh(long param0, vh param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_H = -2147483648;
        this.field_lb = 256;
        this.field_pb = true;
        this.field_wb = -2147483648;
        this.field_K = -1;
        this.field_O = -2147483648;
        this.field_Bb = -1;
        this.field_vb = -2147483648;
        this.field_zb = -1;
        this.field_U = false;
        this.field_Z = -2147483648;
        this.field_Eb = 256;
        this.field_P = -1;
        this.field_Q = -2147483648;
        this.field_fb = false;
        try {
          this.field_c = param0;
          this.field_gb = param4;
          this.field_eb = param3;
          this.field_Db = param5;
          this.field_qb = param2;
          this.a((byte) -87, param1);
          if (param6 != null) {
            this.field_nb = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "vh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_S = "From <%0>: ";
    }
}
