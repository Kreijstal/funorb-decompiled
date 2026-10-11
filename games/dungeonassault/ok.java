/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ok extends ko {
    int field_G;
    private boolean field_Cb;
    private cn field_C;
    private int field_Z;
    private md field_F;
    private int field_xb;
    static int[] field_S;
    private int field_vb;
    int field_lb;
    private int field_Eb;
    private int field_ub;
    static String field_jb;
    private boolean field_bb;
    cn field_L;
    private int field_H;
    int field_B;
    private int field_db;
    private boolean field_qb;
    private String field_K;
    private int field_Db;
    private int field_M;
    private int field_eb;
    boolean field_hb;
    private cn[] field_rb;
    private int field_W;
    static tf field_Y;
    private cn[] field_Fb;
    private boolean field_ib;
    private int field_nb;
    private int field_x;
    private int field_tb;
    private int field_pb;
    private boolean field_kb;
    private int field_Ab;
    se field_y;
    int field_fb;
    int field_ob;
    private int field_yb;
    private int field_I;
    private boolean field_A;
    private cn[] field_U;
    private String field_Q;
    private cn field_ab;
    static int[] field_X;
    private int field_sb;
    private boolean field_V;
    private cn[] field_R;
    private int field_Bb;
    private int field_T;
    private int field_N;
    private int field_mb;
    private boolean field_O;
    private cn field_P;
    private cn[] field_E;
    int field_D;
    private int field_zb;
    private int field_wb;
    private cn field_cb;
    int field_gb;
    private int field_J;
    static int field_z;

    final void a(int param0, boolean param1) {
        im.field_a = !param1 ? true : false;
        ti.field_i = !param1 ? true : false;
        this.a(gf.field_c, 0, 7183, 0, true, gf.field_i);
        if (param0 != -2) {
          this.field_sb = 49;
        }
    }

    final void e(int param0) {
        ok var4 = null;
        int var3 = DungeonAssault.field_K;
        if (param0 == 30509) {
          if (null != this.field_F) {
            var4 = (ok) (this.field_F.d(-14205));
            while (var4 != null) {
              var4.field_O = true;
              var4.e(30509);
              var4 = (ok) (this.field_F.g(20));
            }
          }
          return;
        }
    }

    ok(long param0, ok param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    ok(long param0, ok param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    private final void a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8, int param9, int param10) {
        boolean stackIn_4_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        cn[] var16;
        cn var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        ok var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = DungeonAssault.field_K;
        this.field_ub = param2 + this.field_D;
        this.field_zb = param0 + this.field_gb;
        var12 = gf.field_j;
        var13 = gf.field_f;
        var14 = gf.field_h;
        var15 = gf.field_e;
        gf.a(this.field_zb, this.field_ub, this.field_ob + this.field_zb, this.field_ub + this.field_B);
        if (!this.field_O) {
          param5 = this.field_Cb;
          param7 = this.field_hb;
          stackIn_4_0 = (0 != this.field_I);
          param3 = stackIn_4_0;
        }
        param4 = param4 & this.field_kb;
        var16 = this.field_U;
        var17 = this.field_L;
        var18 = this.field_fb;
        var19 = param10;
        if (!param4) {
          if (null != this.field_C) {
            var17 = this.field_C;
          }
          if (this.field_wb >= 0) {
            var18 = this.field_wb;
          }
          if (this.field_Fb != null) {
            var16 = this.field_Fb;
          }
        }
        var20 = 0;
        if (param7) {
          if (this.field_Eb != -2147483648) {
            var20 = this.field_Eb;
          }
          if (this.field_ab != null) {
            var17 = this.field_ab;
          }
          if (this.field_Z >= 0) {
            var18 = this.field_Z;
          }
          if (this.field_mb != -2147483648) {
            var19 = this.field_mb;
          }
          if (null != this.field_rb) {
            var16 = this.field_rb;
          }
        }
        if (param3) {
          if (this.field_R != null) {
            var16 = this.field_R;
          }
          if (-2147483648 != this.field_eb) {
            var20 = this.field_eb;
          }
          if (0 <= this.field_Db) {
            var18 = this.field_Db;
          }
          if (-2147483648 != this.field_nb) {
            var19 = this.field_nb;
          }
          if (null != this.field_P) {
            var17 = this.field_P;
          }
        }
        if (param5) {
          if (this.field_H != -2147483648) {
            var20 = this.field_H;
          }
          if (this.field_tb >= 0) {
            var18 = this.field_tb;
          }
          if (null != this.field_cb) {
            var17 = this.field_cb;
          }
          if (this.field_E != null) {
            var16 = this.field_E;
          }
          if (this.field_W != -2147483648) {
            var19 = this.field_W;
          }
        }
        var21 = var19 + this.field_M;
        var22 = this.field_yb + var20;
        if (!this.field_ib) {
          sn.a(-33, this.field_B, var16, this.field_zb, this.field_ub, this.field_ob);
        } else {
          sn.a(param10 + 100, param1, var16, param0, param2, param9);
        }
        if (var17 != null) {
          var23_int = this.field_zb + var21;
          if (this.field_lb == 1) {
            var23_int = var23_int + (this.field_ob - var17.field_E) / 2;
          }
          var24 = this.field_ub + var22;
          if (2 == this.field_lb) {
            var23_int = var23_int + (-var17.field_E + this.field_ob);
          }
          if (this.field_vb == 1) {
            var24 = var24 + (this.field_B - var17.field_G) / 2;
          }
          if (this.field_vb == 2) {
            var24 = var24 + (-var17.field_G + this.field_B);
          }
          if (256 > this.field_Ab) {
            var17.d(var23_int, var24, this.field_Ab);
          } else {
            var17.h(var23_int, var24);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_Q &&
          null != this.field_y) {
          var26 = this.field_Q;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param6 &&
            null != this.field_K) {
            var23Lifetime2 = var26 + this.field_K;
          }
          if (this.field_y.b(var23Lifetime2) <= -(2 * this.field_xb) + this.field_ob &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.field_vb != 1) {
              if (this.field_vb == 2) {
                var22 = var22 + (this.field_B - this.field_y.field_E - this.field_y.field_H);
              }
            } else {
              var22 = var22 + (-this.field_y.field_E + (-this.field_y.field_H + this.field_B)) / 2;
            }
            if (0 == this.field_lb) {
              this.field_y.a(var23Lifetime2, var21 + (this.field_xb + this.field_zb), this.field_y.field_H + (this.field_ub + var22), var18, -1, this.field_J);
            } else {
              if (this.field_lb == 1) {
                this.field_y.b(var23Lifetime2, var21 + (this.field_xb + this.field_zb + (-(2 * this.field_xb) + this.field_ob) / 2), this.field_y.field_H + var22 + this.field_ub, var18, -1, this.field_J);
              } else {
                if (2 != this.field_lb) {
                  this.field_y.a(var23Lifetime2, var21 + (this.field_xb + this.field_zb), var22 + this.field_ub, -(2 * this.field_xb) + this.field_ob, this.field_B, var18, -1, this.field_J, this.field_lb, this.field_vb, this.field_Bb);
                } else {
                  this.field_y.c(var23Lifetime2, -(2 * this.field_xb) + (this.field_ob + (var21 + this.field_xb)) + this.field_zb, this.field_y.field_H + (this.field_ub + var22), var18, -1, this.field_J);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_y.a(var23Lifetime2, var21 + this.field_zb + this.field_xb, var22 + this.field_ub, this.field_ob - 2 * this.field_xb, this.field_B, var18, -1, this.field_J, this.field_lb, this.field_vb, this.field_Bb);
          }
        }
        if (null != this.field_F) {
          var23_ref = (ok) (this.field_F.e(-24172));
          while (var23_ref != null) {
            var23_ref.a(this.field_zb + var19, this.field_B, var20 + this.field_ub, param3, param4, param5, param6, param7, this.field_A, this.field_ob, 0);
            var23_ref = (ok) (this.field_F.a(4));
          }
        }
        gf.e(var12, var13, var14, var15);
    }

    final static void a(int param0, String[] param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != cd.field_f) {
            cd.field_f.field_W.a((byte) -104, param1);
          }
          if (param0 != 2) {
            field_Y = (tf) null;
          }
          if (null != pj.field_c) {
            pj.field_c.field_P.a((byte) -126, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ok.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 < 59) {
          ok.f(124);
        }
        this.a(0, gf.field_c, 0, false, true, false, param0, false, false, gf.field_i, 0);
    }

    private final void a(byte param0, ok param1) {
        boolean stackIn_78_1 = false;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (param1.field_Cb) {
              this.field_Cb = param1.field_Cb;
            }
            if (param1.field_fb != 0) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_J != 256) {
              this.field_J = param1.field_J;
            }
            if (param1.field_L != null) {
              this.field_L = param1.field_L;
            }
            if (param1.field_cb != null) {
              this.field_cb = param1.field_cb;
            }
            if (null != param1.field_K) {
              this.field_K = param1.field_K;
            }
            if (param1.field_O) {
              this.field_O = param1.field_O;
            }
            if (param1.field_Z >= 0) {
              this.field_Z = param1.field_Z;
            }
            if (param1.field_C != null) {
              this.field_C = param1.field_C;
            }
            if (param1.field_R != null) {
              this.field_R = param1.field_R;
            }
            if (null != param1.field_Fb) {
              this.field_Fb = param1.field_Fb;
            }
            if (null != param1.field_P) {
              this.field_P = param1.field_P;
            }
            if (param1.field_Q != null) {
              this.field_Q = param1.field_Q;
            }
            if (param1.field_ib) {
              this.field_ib = param1.field_ib;
            }
            if (param1.field_tb >= 0) {
              this.field_tb = param1.field_tb;
            }
            if (param1.field_Db >= 0) {
              this.field_Db = param1.field_Db;
            }
            if (param1.field_ab != null) {
              this.field_ab = param1.field_ab;
            }
            if (0 != param1.field_xb) {
              this.field_xb = param1.field_xb;
            }
            if (param1.field_wb >= 0) {
              this.field_wb = param1.field_wb;
            }
            if (param1.field_qb) {
              this.field_qb = param1.field_qb;
            }
            if (null != param1.field_y) {
              this.field_y = param1.field_y;
            }
            if (0 != param1.field_Bb) {
              this.field_Bb = param1.field_Bb;
            }
            if (!param1.field_kb) {
              this.field_kb = param1.field_kb;
            }
            if (param1.field_rb != null) {
              this.field_rb = param1.field_rb;
            }
            if (param1.field_E != null) {
              this.field_E = param1.field_E;
            }
            if (param1.field_U != null) {
              this.field_U = param1.field_U;
            }
            if (0 != param1.field_lb) {
              this.field_lb = param1.field_lb;
            }
            if (param1.field_Eb != -2147483648) {
              this.field_Eb = param1.field_Eb;
            }
            if (0 != param1.field_vb) {
              this.field_vb = param1.field_vb;
            }
            if (param1.field_eb != -2147483648) {
              this.field_eb = param1.field_eb;
            }
            stackIn_78_1 = (this.field_qb) && (param1.field_A);
            this.field_A = stackIn_78_1;
            if (param1.field_nb != -2147483648) {
              this.field_nb = param1.field_nb;
            }
            if (param1.field_mb != -2147483648) {
              this.field_mb = param1.field_mb;
            }
            if (param1.field_H != -2147483648) {
              this.field_H = param1.field_H;
            }
            if (0 != param1.field_yb) {
              this.field_yb = param1.field_yb;
            }
            if (param1.field_bb) {
              this.field_bb = param1.field_bb;
            }
            if (param1.field_W != -2147483648) {
              this.field_W = param1.field_W;
            }
            if (param1.field_M != 0) {
              this.field_M = param1.field_M;
            }
          }
          if (param0 < 27) {
            field_Y = (tf) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_100_0 = var3;
          stackIn_100_1 = new StringBuilder().append("ok.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 != -16218) {
          return;
        }
        field_jb = null;
        field_S = null;
        field_Y = null;
        field_X = null;
    }

    private final void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        boolean stackIn_33_1 = false;
        boolean stackIn_38_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        ok var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = DungeonAssault.field_K;
        if (this.field_sb <= 0) {
          var7 = this.field_sb >> 2;
        } else {
          var7 = -(-this.field_sb >> 2);
        }
        this.field_sb = this.field_sb - var7;
        this.field_gb = this.field_gb + var7;
        if (this.field_pb <= 0) {
          var7Lifetime1 = this.field_pb >> 2;
        } else {
          var7Lifetime1 = -(-this.field_pb >> 2);
        }
        this.field_D = this.field_D + var7Lifetime1;
        this.field_pb = this.field_pb - var7Lifetime1;
        if (this.field_T > 0) {
          var7Lifetime2 = -(-this.field_T >> 2);
        } else {
          var7Lifetime2 = this.field_T >> 2;
        }
        this.field_T = this.field_T - var7Lifetime2;
        this.field_ob = this.field_ob + var7Lifetime2;
        if (this.field_x > 0) {
          var7Lifetime3 = -(-this.field_x >> 2);
        } else {
          var7Lifetime3 = this.field_x >> 2;
        }
        if (param2 != 7183) {
          return;
        }
        param4 = param4 & this.field_kb;
        this.field_ub = this.field_D + param3;
        this.field_x = this.field_x - var7Lifetime3;
        this.field_zb = this.field_gb + param1;
        this.field_B = this.field_B + var7Lifetime3;
        var8 = gf.field_j;
        var9 = gf.field_f;
        var10 = gf.field_h;
        var11 = gf.field_e;
        gf.a(this.field_zb, this.field_ub, this.field_ob + this.field_zb, this.field_B + this.field_ub);
        var12 = 0;
        if (!ti.field_i &&
          param4 &&
          no.field_d != 0 &&
          gf.field_j <= lc.field_c &&
          lc.field_c < gf.field_h &&
          hm.field_k >= gf.field_f &&
          gf.field_e > hm.field_k) {
          var12 = 1;
          this.field_db = lc.field_c - this.field_zb;
          this.field_I = no.field_d;
          this.field_G = no.field_d;
          this.field_N = -this.field_ub + hm.field_k;
        } else {
          this.field_G = 0;
          if (0 != no.field_d) {
            this.field_I = 0;
          }
        }
        if (la.field_g == 0) {
          this.field_I = 0;
        }
        stackIn_33_1 = (!im.field_a) && (hj.field_S >= gf.field_j) && (gf.field_h > hj.field_S) && (eh.field_h >= gf.field_f) && (gf.field_e > eh.field_h);
        this.field_V = stackIn_33_1;
        stackIn_38_1 = (this.field_V) && (la.field_g == this.field_I) && (param4);
        this.field_hb = stackIn_38_1;
        if (null != this.field_F) {
          var13 = (ok) (this.field_F.d(-14205));
          while (var13 != null) {
            var13.a(this.field_B, this.field_zb, 7183, this.field_ub, param4, this.field_ob);
            var13 = (ok) (this.field_F.g(20));
          }
        }
        if (this.field_V) {
          im.field_a = true;
        }
        if (var12 != 0) {
          ti.field_i = true;
        }
        gf.e(var8, var9, var10, var11);
        if (this.field_I != 0 &&
          this.field_bb) {
          this.field_gb = -param1 - this.field_db + hj.field_S;
          this.field_D = -param3 + (eh.field_h - this.field_N);
          if (0 > this.field_gb) {
            this.field_gb = 0;
          }
          if (this.field_D < 0) {
            this.field_D = 0;
          }
          if (-this.field_ob + param5 < this.field_gb) {
            this.field_gb = -this.field_ob + param5;
          }
          if (-this.field_B + param0 < this.field_D) {
            this.field_D = param0 - this.field_B;
          }
          this.field_sb = 0;
          this.field_pb = 0;
          this.field_zb = this.field_gb + param1;
          this.field_ub = this.field_D + param3;
        }
    }

    final void a(ok param0, byte param1) {
        try {
          if (param1 != 124) {
            this.field_xb = 89;
          }
          if (this.field_F == null) {
            this.field_F = new md();
          }
          this.field_F.a(param0, false);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ok.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private ok(long param0, ok param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_Eb = -2147483648;
        this.field_eb = -2147483648;
        this.field_H = -2147483648;
        this.field_qb = false;
        this.field_Db = -1;
        this.field_Z = -1;
        this.field_Ab = 256;
        this.field_A = false;
        this.field_mb = -2147483648;
        this.field_tb = -1;
        this.field_W = -2147483648;
        this.field_nb = -2147483648;
        this.field_kb = true;
        this.field_wb = -1;
        this.field_J = 256;
        try {
          this.field_D = param3;
          this.field_h = param0;
          this.field_gb = param2;
          this.field_B = param5;
          this.field_ob = param4;
          this.a((byte) 30, param1);
          if (param6 != null) {
            this.field_Q = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ok.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_jb = "Enchantress";
        field_S = new int[8192];
        field_X = new int[]{0, 16777164, 16776960, 16763904, 16737792, 16720384, 16711680, 12255232, 4456448, 0};
        field_z = 48;
    }
}
