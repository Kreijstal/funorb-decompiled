/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ak extends tp {
    int field_O;
    private int field_jb;
    private int field_Y;
    int field_hb;
    boolean field_rb;
    private boolean field_lb;
    tf field_ob;
    int field_Q;
    private int field_F;
    private int field_Ab;
    int field_Z;
    int field_tb;
    int field_N;
    tf field_xb;
    int field_wb;
    int field_ub;
    int field_V;
    private int field_w;
    String field_qb;
    int field_J;
    static ak field_E;
    boolean field_U;
    int field_gb;
    static ak field_T;
    tf[] field_eb;
    int field_K;
    tf field_B;
    boolean field_A;
    int field_Bb;
    tf field_z;
    tf[] field_zb;
    boolean field_R;
    tf[] field_ab;
    String field_cb;
    boolean field_vb;
    int field_kb;
    int field_y;
    int field_mb;
    jl field_Db;
    bb field_L;
    static int[] field_db;
    private int field_I;
    tf field_H;
    private boolean field_X;
    int field_Cb;
    int field_yb;
    private boolean field_fb;
    boolean field_W;
    int field_C;
    int field_S;
    tf[] field_M;
    int field_sb;
    int field_pb;
    int field_D;
    private int field_x;
    tf[] field_bb;
    private int field_G;
    int field_P;
    int field_nb;
    static int field_ib;

    final void a(ak param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_L == null) {
            this.field_L = new bb();
          }
          this.field_L.a(22125, param0);
          if (param1 != 26) {
            this.a(false, -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ak.M(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(byte param0, int param1) {
        int var3;
        int var4_int;
        ak var4;
        int var5;
        int var6;
        int var4_intLifetime1;
        var6 = Pixelate.field_H ? 1 : 0;
        if (param0 != 95) {
          return 37;
        }
        var3 = 0;
        if (null != this.field_cb &&
          null != this.field_Db) {
          var4_int = this.field_Db.a(this.field_cb, param1);
          if (var4_int > var3) {
            var3 = var4_int;
          }
        }
        if (null != this.field_H) {
          var4_intLifetime1 = this.field_H.field_A;
          if (var4_intLifetime1 > var3) {
            var3 = var4_intLifetime1;
          }
        }
        if (null != this.field_L) {
          var4 = (ak) (this.field_L.c(1504642273));
          while (var4 != null) {
            var5 = var4.field_K + var4.field_D;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (ak) (this.field_L.f(1504642273));
          }
        }
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_G = 0;
        this.field_D = param2;
        this.field_F = 0;
        this.field_K = param4;
        if (param3 == 256) {
          this.field_wb = 0;
          this.field_nb = param1;
          this.field_S = param0;
          this.field_Z = 0;
          return;
        }
    }

    final void a(int param0, byte param1, boolean param2, int param3) {
        ak var10_ref_ak = null;
        int var9 = 0;
        int var11 = Pixelate.field_H ? 1 : 0;
        int var5 = -this.field_S;
        int var6 = var5 - this.field_wb;
        int var7 = this.field_nb;
        int var8 = var7 + this.field_Z;
        int var9Lifetime1;
        if (!param2) {
          var9 = 0;
          var10_ref_ak = (ak) (this.field_L.c(1504642273));
          while (var10_ref_ak != null) {
            var10_ref_ak.field_wb = -var10_ref_ak.field_S + var9;
            var9 = var9 + (var10_ref_ak.field_nb - (-var10_ref_ak.field_Z - param0));
            var10_ref_ak = (ak) (this.field_L.f(1504642273));
          }
          var8 = -param0 + var9;
        }
        var9Lifetime1 = -param3 + var8;
        if (var6 > var9Lifetime1) {
          var6 = var9Lifetime1;
        }
        if (param1 >= -127) {
          this.field_A = false;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        int var10 = -param3 + var7;
        if (var10 < var5) {
          var5 = var10;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        this.field_nb = var7;
        this.field_Z = var8 - var7;
        this.field_wb = -var6 + var5;
        this.field_S = -var5;
    }

    final void a(int param0, boolean param1) {
        cg.field_I = !param1 ? true : false;
        bm.field_q = !param1 ? true : false;
        if (param0 != -28476) {
          ak var4 = (ak) null;
          this.a((ak) null, (byte) 61);
        }
        this.a(t.field_j, 0, true, t.field_d, 0, 59);
    }

    ak(long param0, ak param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void a(boolean param0, int param1) {
        this.a(false, 0, false, param0, t.field_j, false, (byte) -50, param1, t.field_d, false, true);
    }

    final void a(ak param0, int param1, int param2, ak param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 == null) {
            param0.field_S = 0;
            param0.field_wb = 0;
          } else {
            param0.field_wb = param3.field_Z + param3.field_wb;
            param0.field_S = param1 + (param3.field_nb + param3.field_S);
          }
          if (param2 != -1) {
            this.field_Q = -9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ak.R(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, boolean param2, boolean param3, int param4, boolean param5, byte param6, int param7, int param8, boolean param9, boolean param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        tf[] var16;
        tf var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        ak var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = Pixelate.field_H ? 1 : 0;
        this.field_gb = this.field_S + param7;
        this.field_tb = param1 + this.field_D;
        var12 = t.field_e;
        var13 = t.field_f;
        var14 = t.field_h;
        var15 = t.field_a;
        t.d(this.field_tb, this.field_gb, this.field_K + this.field_tb, this.field_gb + this.field_nb);
        if (!this.field_fb) {
          param0 = this.field_U;
          stackIn_5_0 = (this.field_J != 0);
          param5 = stackIn_5_0;
          param9 = this.field_W;
        }
        param10 = param10 & this.field_rb;
        var16 = this.field_zb;
        var17 = this.field_H;
        if (param6 != -50) {
          this.a(87, -55, true, -68, -112, 15);
        }
        var18 = this.field_N;
        var19 = 0;
        var20 = 0;
        if (!param10) {
          if (0 <= this.field_O) {
            var18 = this.field_O;
          }
          if (null != this.field_xb) {
            var17 = this.field_xb;
          }
          if (null != this.field_M) {
            var16 = this.field_M;
          }
        }
        if (param9) {
          if (this.field_x != -2147483648) {
            var20 = this.field_x;
          }
          if (null != this.field_ab) {
            var16 = this.field_ab;
          }
          if (this.field_Y != -2147483648) {
            var19 = this.field_Y;
          }
          if (null != this.field_B) {
            var17 = this.field_B;
          }
          if (this.field_y >= 0) {
            var18 = this.field_y;
          }
        }
        if (param5) {
          if (null != this.field_ob) {
            var17 = this.field_ob;
          }
          if (this.field_pb >= 0) {
            var18 = this.field_pb;
          }
          if (this.field_bb != null) {
            var16 = this.field_bb;
          }
          if (this.field_V != -2147483648) {
            var20 = this.field_V;
          }
          if (this.field_Q != -2147483648) {
            var19 = this.field_Q;
          }
        }
        if (param0) {
          if (this.field_Cb >= 0) {
            var18 = this.field_Cb;
          }
          if (this.field_sb != -2147483648) {
            var20 = this.field_sb;
          }
          if (this.field_z != null) {
            var17 = this.field_z;
          }
          if (-2147483648 != this.field_hb) {
            var19 = this.field_hb;
          }
          if (null != this.field_eb) {
            var16 = this.field_eb;
          }
        }
        var21 = this.field_w + var19;
        var22 = var20 + this.field_I;
        if (!this.field_A) {
          dk.a(this.field_K, this.field_tb, (byte) 75, this.field_nb, this.field_gb, var16);
        } else {
          dk.a(param4, param1, (byte) 75, param8, param7, var16);
        }
        if (var17 != null) {
          var23_int = this.field_tb + var21;
          var24 = var22 + this.field_gb;
          if (this.field_Bb == 1) {
            var23_int = var23_int + (-var17.field_A + this.field_K) / 2;
          }
          if (2 == this.field_Bb) {
            var23_int = var23_int + (-var17.field_A + this.field_K);
          }
          if (this.field_kb == 1) {
            var24 = var24 + (-var17.field_B + this.field_nb) / 2;
          }
          if (this.field_kb == 2) {
            var24 = var24 + (this.field_nb - var17.field_B);
          }
          if (this.field_jb >= 256) {
            var17.b(var23_int, var24);
          } else {
            var17.a(var23_int, var24, this.field_jb);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_cb != null &&
          this.field_Db != null) {
          var26 = this.field_cb;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param3 &&
            null != this.field_qb) {
            var23Lifetime2 = var26 + this.field_qb;
          }
          if (this.field_Db.c(var23Lifetime2) <= this.field_K - 2 * this.field_C &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.field_kb != 1) {
              if (this.field_kb == 2) {
                var22 = var22 + (this.field_nb - this.field_Db.field_z - this.field_Db.field_w);
              }
            } else {
              var22 = var22 + (-this.field_Db.field_z + (-this.field_Db.field_w + this.field_nb)) / 2;
            }
            if (this.field_Bb == 0) {
              this.field_Db.b(var23Lifetime2, this.field_tb + (this.field_C + var21), this.field_Db.field_w + this.field_gb + var22, var18, -1, this.field_yb);
            } else {
              if (this.field_Bb == 1) {
                this.field_Db.a(var23Lifetime2, (-(2 * this.field_C) + this.field_K) / 2 + var21 + (this.field_tb + this.field_C), this.field_Db.field_w + (this.field_gb + var22), var18, -1, this.field_yb);
              } else {
                if (2 != this.field_Bb) {
                  this.field_Db.a(var23Lifetime2, this.field_C + this.field_tb + var21, this.field_gb + var22, this.field_K - this.field_C * 2, this.field_nb, var18, -1, this.field_yb, this.field_Bb, this.field_kb, this.field_mb);
                } else {
                  this.field_Db.c(var23Lifetime2, this.field_K - (this.field_C * 2 - var21 - (this.field_tb + this.field_C)), this.field_gb + (var22 + this.field_Db.field_w), var18, -1, this.field_yb);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_Db.a(var23Lifetime2, var21 + this.field_C + this.field_tb, var22 + this.field_gb, -(this.field_C * 2) + this.field_K, this.field_nb, var18, -1, this.field_yb, this.field_Bb, this.field_kb, this.field_mb);
          }
        }
        if (this.field_L != null) {
          var23_ref = (ak) (this.field_L.c(param6 + 1504642323));
          while (var23_ref != null) {
            var23_ref.a(param0, this.field_tb + var19, this.field_X, param3, this.field_K, param5, (byte) -50, var20 + this.field_gb, this.field_nb, param9, param10);
            var23_ref = (ak) (this.field_L.f(1504642273));
          }
        }
        t.f(var12, var13, var14, var15);
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        boolean stackIn_31_1 = false;
        boolean stackIn_39_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        ak var14;
        int var15;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var15 = Pixelate.field_H ? 1 : 0;
        if (this.field_G <= 0) {
          var7 = this.field_G >> 2;
        } else {
          var7 = -(-this.field_G >> 2);
        }
        this.field_G = this.field_G - var7;
        this.field_D = this.field_D + var7;
        if (this.field_wb <= 0) {
          var7Lifetime1 = this.field_wb >> 2;
        } else {
          var7Lifetime1 = -(-this.field_wb >> 2);
        }
        this.field_S = this.field_S + var7Lifetime1;
        this.field_wb = this.field_wb - var7Lifetime1;
        if (0 < this.field_F) {
          var7Lifetime2 = -(-this.field_F >> 2);
        } else {
          var7Lifetime2 = this.field_F >> 2;
        }
        var8 = 81 % ((param5 + 17) / 33);
        this.field_F = this.field_F - var7Lifetime2;
        this.field_K = this.field_K + var7Lifetime2;
        if (0 >= this.field_Z) {
          var7Lifetime3 = this.field_Z >> 2;
        } else {
          var7Lifetime3 = -(-this.field_Z >> 2);
        }
        param2 = param2 & this.field_rb;
        this.field_gb = param4 + this.field_S;
        this.field_nb = this.field_nb + var7Lifetime3;
        this.field_Z = this.field_Z - var7Lifetime3;
        this.field_tb = this.field_D + param1;
        var9 = t.field_e;
        var10 = t.field_f;
        var11 = t.field_h;
        var12 = t.field_a;
        t.d(this.field_tb, this.field_gb, this.field_K + this.field_tb, this.field_gb + this.field_nb);
        var13 = 0;
        if (!cg.field_I &&
          param2 &&
          nm.field_c != 0 &&
          uo.field_a >= t.field_e &&
          uo.field_a < t.field_h &&
          ji.field_c >= t.field_f &&
          ji.field_c < t.field_a) {
          var13 = 1;
          this.field_Ab = -this.field_gb + ji.field_c;
          this.field_P = nm.field_c;
          this.field_ub = -this.field_tb + uo.field_a;
          this.field_J = nm.field_c;
        } else {
          if (0 != nm.field_c) {
            this.field_J = 0;
          }
          this.field_P = 0;
        }
        stackIn_31_1 = (!bm.field_q) && (t.field_e <= uf.field_d) && (uf.field_d < t.field_h) && (bg.field_k >= t.field_f) && (t.field_a > bg.field_k);
        this.field_R = stackIn_31_1;
        if (0 == ef.field_b) {
          this.field_J = 0;
        }
        stackIn_39_1 = (this.field_R) && (ef.field_b == this.field_J) && (param2);
        this.field_W = stackIn_39_1;
        if (null != this.field_L) {
          var14 = (ak) (this.field_L.g(1504642273));
          while (var14 != null) {
            var14.a(this.field_K, this.field_tb, param2, this.field_nb, this.field_gb, -123);
            var14 = (ak) (this.field_L.j(0));
          }
        }
        if (this.field_R) {
          bm.field_q = true;
        }
        if (var13 != 0) {
          cg.field_I = true;
        }
        t.f(var9, var10, var11, var12);
        if (this.field_J != 0 &&
          this.field_vb) {
          this.field_D = -this.field_ub + (uf.field_d - param1);
          this.field_S = bg.field_k - this.field_Ab - param4;
          if (this.field_D < 0) {
            this.field_D = 0;
          }
          if (0 > this.field_S) {
            this.field_S = 0;
          }
          if (this.field_D > param0 - this.field_K) {
            this.field_D = -this.field_K + param0;
          }
          this.field_G = 0;
          this.field_wb = 0;
          this.field_tb = param1 + this.field_D;
          if (this.field_S > -this.field_nb + param3) {
            this.field_S = param3 - this.field_nb;
          }
          this.field_gb = param4 + this.field_S;
        }
    }

    ak(long param0, ak param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static void i(int param0) {
        jp.a(-117);
        uo.b(false);
        hc.field_M = null;
        mj.a(false);
        if (param0 != 0) {
          ak.a((byte) -43);
        }
    }

    final static void c(boolean param0) {
        ce.field_d = 0;
        if (!param0) {
          return;
        }
        ib.b(20558);
    }

    final void a(int param0, ak param1) {
        boolean stackIn_98_1 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (param1.field_fb) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_A) {
              this.field_A = param1.field_A;
            }
            if (param1.field_C != 0) {
              this.field_C = param1.field_C;
            }
            if (null != param1.field_z) {
              this.field_z = param1.field_z;
            }
            if (null != param1.field_M) {
              this.field_M = param1.field_M;
            }
            if (param1.field_Cb >= 0) {
              this.field_Cb = param1.field_Cb;
            }
            if (null != param1.field_H) {
              this.field_H = param1.field_H;
            }
            if (256 != param1.field_yb) {
              this.field_yb = param1.field_yb;
            }
            if (param1.field_ob != null) {
              this.field_ob = param1.field_ob;
            }
            if (param1.field_pb >= 0) {
              this.field_pb = param1.field_pb;
            }
            if (null != param1.field_bb) {
              this.field_bb = param1.field_bb;
            }
            if (param1.field_eb != null) {
              this.field_eb = param1.field_eb;
            }
            if (param1.field_lb) {
              this.field_lb = param1.field_lb;
            }
            if (null != param1.field_ab) {
              this.field_ab = param1.field_ab;
            }
            if (param1.field_B != null) {
              this.field_B = param1.field_B;
            }
            if (param1.field_y >= 0) {
              this.field_y = param1.field_y;
            }
            if (!param1.field_rb) {
              this.field_rb = param1.field_rb;
            }
            if (null != param1.field_cb) {
              this.field_cb = param1.field_cb;
            }
            if (0 != param1.field_N) {
              this.field_N = param1.field_N;
            }
            if (param1.field_xb != null) {
              this.field_xb = param1.field_xb;
            }
            if (null != param1.field_Db) {
              this.field_Db = param1.field_Db;
            }
            if (param1.field_O >= 0) {
              this.field_O = param1.field_O;
            }
            if (param1.field_mb != 0) {
              this.field_mb = param1.field_mb;
            }
            if (param1.field_U) {
              this.field_U = param1.field_U;
            }
            if (param1.field_qb != null) {
              this.field_qb = param1.field_qb;
            }
            if (null != param1.field_zb) {
              this.field_zb = param1.field_zb;
            }
            if (param1.field_sb != -2147483648) {
              this.field_sb = param1.field_sb;
            }
            if (param1.field_kb != 0) {
              this.field_kb = param1.field_kb;
            }
            if (param1.field_vb) {
              this.field_vb = param1.field_vb;
            }
            if (param1.field_I != 0) {
              this.field_I = param1.field_I;
            }
            if (param1.field_hb != -2147483648) {
              this.field_hb = param1.field_hb;
            }
            if (param1.field_V != -2147483648) {
              this.field_V = param1.field_V;
            }
            if (0 != param1.field_Bb) {
              this.field_Bb = param1.field_Bb;
            }
            if (-2147483648 != param1.field_Y) {
              this.field_Y = param1.field_Y;
            }
            if (-2147483648 != param1.field_x) {
              this.field_x = param1.field_x;
            }
            if (0 != param1.field_w) {
              this.field_w = param1.field_w;
            }
            if (-2147483648 != param1.field_Q) {
              this.field_Q = param1.field_Q;
            }
            stackIn_98_1 = (this.field_lb) && (param1.field_X);
            this.field_X = stackIn_98_1;
          }
          if (param0 != -27813) {
            ak.c(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_104_0 = var3;
          stackIn_104_1 = new StringBuilder().append("ak.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_E = null;
        field_db = null;
        if (param0 != 59) {
          return;
        }
        field_T = null;
    }

    final void h(int param0) {
        ak var4 = null;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (this.field_L != null) {
          var4 = (ak) (this.field_L.g(1504642273));
          while (var4 != null) {
            var4.field_fb = true;
            var4.h(-257);
            var4 = (ak) (this.field_L.j(0));
          }
        }
        if (param0 != -257) {
          this.field_fb = true;
        }
    }

    final int g(int param0) {
        if (param0 != 0) {
          return -99;
        }
        return this.a((byte) 95, 2147483647);
    }

    protected ak() {
        this.field_Y = -2147483648;
        this.field_rb = true;
        this.field_lb = false;
        this.field_jb = 256;
        this.field_O = -1;
        this.field_hb = -2147483648;
        this.field_y = -1;
        this.field_V = -2147483648;
        this.field_X = false;
        this.field_yb = 256;
        this.field_Cb = -1;
        this.field_pb = -1;
        this.field_sb = -2147483648;
        this.field_Q = -2147483648;
        this.field_x = -2147483648;
    }

    ak(long param0, ak param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_Y = -2147483648;
        this.field_rb = true;
        this.field_lb = false;
        this.field_jb = 256;
        this.field_O = -1;
        this.field_hb = -2147483648;
        this.field_y = -1;
        this.field_V = -2147483648;
        this.field_X = false;
        this.field_yb = 256;
        this.field_Cb = -1;
        this.field_pb = -1;
        this.field_sb = -2147483648;
        this.field_Q = -2147483648;
        this.field_x = -2147483648;
        try {
          this.field_e = param0;
          this.field_K = param4;
          this.field_nb = param5;
          this.field_S = param3;
          this.field_D = param2;
          this.a(-27813, param1);
          if (param6 != null) {
            this.field_cb = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ak.<init>(").append(param0).append(',');
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
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_db = new int[]{10, 10, 20, 20, 20, 20};
    }
}
