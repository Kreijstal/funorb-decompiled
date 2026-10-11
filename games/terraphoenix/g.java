/*
 * Decompiled by CFR-JS 0.4.0.
 */
class g extends wa {
    private int field_U;
    ci[] field_eb;
    ci[] field_V;
    int field_pb;
    private ci[] field_sb;
    private int field_J;
    static int field_cb;
    private int field_db;
    private int field_jb;
    private int field_F;
    int field_ib;
    private ci field_fb;
    private boolean field_Z;
    private int field_Cb;
    private String field_K;
    int field_lb;
    static String field_ab;
    private int field_hb;
    private int field_Q;
    private int field_A;
    int field_R;
    private ci field_y;
    private jj field_L;
    private int field_v;
    int field_x;
    private ci field_xb;
    private int field_O;
    int field_W;
    static String field_qb;
    private int field_P;
    boolean field_z;
    ci[] field_X;
    private boolean field_Ab;
    boolean field_zb;
    private int field_wb;
    int field_gb;
    static String field_nb;
    private int field_E;
    private int field_u;
    private String field_B;
    private int field_vb;
    private int field_ub;
    private int field_M;
    private pk field_S;
    private boolean field_T;
    ci field_ob;
    private ci field_w;
    boolean field_kb;
    private int field_H;
    private ci[] field_yb;
    static boolean field_tb;
    private int field_bb;
    private int field_Y;
    private int field_G;
    private boolean field_I;
    private boolean field_mb;
    private int field_rb;
    int field_Bb;
    private int field_C;
    private boolean field_D;
    int field_N;

    final void a(byte param0, boolean param1) {
        if (param0 != -36) {
          this.field_Bb = -103;
        }
        this.a(l.field_k, 0, false, true, l.field_j, true, param1, false, 0, false, false);
    }

    public static void d(int param0) {
        field_ab = null;
        field_nb = null;
        if (param0 != -1) {
          field_tb = false;
        }
        field_qb = null;
    }

    private final void a(int param0, int param1, byte param2, int param3, boolean param4, int param5) {
        boolean stackIn_35_1 = false;
        boolean stackIn_40_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        g var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = Terraphoenix.field_V;
        if (this.field_F > 0) {
          var7 = -(-this.field_F >> 2);
        } else {
          var7 = this.field_F >> 2;
        }
        this.field_F = this.field_F - var7;
        this.field_R = this.field_R + var7;
        if (this.field_gb <= 0) {
          var7Lifetime1 = this.field_gb >> 2;
        } else {
          var7Lifetime1 = -(-this.field_gb >> 2);
        }
        if (param2 != -8) {
          field_nb = (String) null;
        }
        this.field_gb = this.field_gb - var7Lifetime1;
        this.field_ib = this.field_ib + var7Lifetime1;
        if (this.field_C > 0) {
          var7Lifetime2 = -(-this.field_C >> 2);
        } else {
          var7Lifetime2 = this.field_C >> 2;
        }
        this.field_C = this.field_C - var7Lifetime2;
        this.field_x = this.field_x + var7Lifetime2;
        if (0 >= this.field_W) {
          var7Lifetime3 = this.field_W >> 2;
        } else {
          var7Lifetime3 = -(-this.field_W >> 2);
        }
        param4 = param4 & this.field_zb;
        this.field_Bb = this.field_ib + param0;
        this.field_vb = param5 + this.field_R;
        this.field_W = this.field_W - var7Lifetime3;
        this.field_lb = this.field_lb + var7Lifetime3;
        var8 = l.field_b;
        var9 = l.field_d;
        var10 = l.field_f;
        var11 = l.field_c;
        l.i(this.field_vb, this.field_Bb, this.field_x + this.field_vb, this.field_Bb + this.field_lb);
        var12 = 0;
        if (!mm.field_b &&
          param4 &&
          ma.field_I != 0 &&
          mm.field_c >= l.field_b &&
          mm.field_c < l.field_f &&
          l.field_d <= lm.field_c &&
          l.field_c > lm.field_c) {
          this.field_pb = ma.field_I;
          var12 = 1;
          this.field_Y = -this.field_Bb + lm.field_c;
          this.field_Q = -this.field_vb + mm.field_c;
          this.field_N = ma.field_I;
        } else {
          this.field_pb = 0;
          if (ma.field_I != 0) {
            this.field_N = 0;
          }
        }
        if (oh.field_f == 0) {
          this.field_N = 0;
        }
        stackIn_35_1 = (!gi.field_w) && (ef.field_j >= l.field_b) && (l.field_f > ef.field_j) && (jb.field_b >= l.field_d) && (l.field_c > jb.field_b);
        this.field_D = stackIn_35_1;
        stackIn_40_1 = (this.field_D) && (this.field_N == oh.field_f) && (param4);
        this.field_Z = stackIn_40_1;
        if (null != this.field_L) {
          var13 = (g) (this.field_L.c((byte) 127));
          while (var13 != null) {
            var13.a(this.field_Bb, this.field_lb, (byte) -8, this.field_x, param4, this.field_vb);
            var13 = (g) (this.field_L.b(-115));
          }
        }
        if (var12 != 0) {
          mm.field_b = true;
        }
        if (this.field_D) {
          gi.field_w = true;
        }
        l.c(var8, var9, var10, var11);
        if (this.field_N != 0 &&
          this.field_kb) {
          this.field_ib = jb.field_b - (this.field_Y + param0);
          this.field_R = -this.field_Q + (ef.field_j - param5);
          if (this.field_R < 0) {
            this.field_R = 0;
          }
          if (this.field_ib < 0) {
            this.field_ib = 0;
          }
          if (this.field_R > -this.field_x + param3) {
            this.field_R = param3 - this.field_x;
          }
          this.field_F = 0;
          if (param1 - this.field_lb < this.field_ib) {
            this.field_ib = -this.field_lb + param1;
          }
          this.field_gb = 0;
          this.field_vb = param5 + this.field_R;
          this.field_Bb = param0 + this.field_ib;
        }
    }

    final void a(g param0, int param1) {
        try {
          if (this.field_L == null) {
            this.field_L = new jj();
          }
          if (param1 != -14951) {
            this.field_w = (ci) null;
          }
          this.field_L.a(param0, -16611);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "g.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        gi.field_w = !param1 ? true : false;
        mm.field_b = !param1 ? true : false;
        this.a(0, l.field_j, (byte) -8, l.field_k, true, 0);
        if (param0 >= -7) {
          this.field_ob = (ci) null;
        }
    }

    g(long param0, g param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(int param0, g param1) {
        boolean stackIn_84_1 = false;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 0) {
            this.a((byte) -44, false);
          }
          if (param1 != null) {
            if (param1.field_U >= 0) {
              this.field_U = param1.field_U;
            }
            if (param1.field_V != null) {
              this.field_V = param1.field_V;
            }
            if (param1.field_M >= 0) {
              this.field_M = param1.field_M;
            }
            if (param1.field_Ab) {
              this.field_Ab = param1.field_Ab;
            }
            if (null != param1.field_xb) {
              this.field_xb = param1.field_xb;
            }
            if (null != param1.field_yb) {
              this.field_yb = param1.field_yb;
            }
            if (null != param1.field_B) {
              this.field_B = param1.field_B;
            }
            if (param1.field_X != null) {
              this.field_X = param1.field_X;
            }
            if (param1.field_mb) {
              this.field_mb = param1.field_mb;
            }
            if (param1.field_y != null) {
              this.field_y = param1.field_y;
            }
            if (256 != param1.field_E) {
              this.field_E = param1.field_E;
            }
            if (null != param1.field_sb) {
              this.field_sb = param1.field_sb;
            }
            if (0 != param1.field_A) {
              this.field_A = param1.field_A;
            }
            if (param1.field_I) {
              this.field_I = param1.field_I;
            }
            if (param1.field_z) {
              this.field_z = param1.field_z;
            }
            if (param1.field_G >= 0) {
              this.field_G = param1.field_G;
            }
            if (0 <= param1.field_rb) {
              this.field_rb = param1.field_rb;
            }
            if (!param1.field_zb) {
              this.field_zb = param1.field_zb;
            }
            if (param1.field_K != null) {
              this.field_K = param1.field_K;
            }
            if (param1.field_v != 0) {
              this.field_v = param1.field_v;
            }
            if (param1.field_w != null) {
              this.field_w = param1.field_w;
            }
            if (param1.field_O != 0) {
              this.field_O = param1.field_O;
            }
            if (null != param1.field_eb) {
              this.field_eb = param1.field_eb;
            }
            if (param1.field_S != null) {
              this.field_S = param1.field_S;
            }
            if (null != param1.field_fb) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_ob != null) {
              this.field_ob = param1.field_ob;
            }
            if (0 != param1.field_wb) {
              this.field_wb = param1.field_wb;
            }
            if (param1.field_hb != -2147483648) {
              this.field_hb = param1.field_hb;
            }
            if (param1.field_P != -2147483648) {
              this.field_P = param1.field_P;
            }
            if (param1.field_H != 0) {
              this.field_H = param1.field_H;
            }
            stackIn_84_1 = (this.field_I) && (param1.field_T);
            this.field_T = stackIn_84_1;
            if (0 != param1.field_ub) {
              this.field_ub = param1.field_ub;
            }
            if (param1.field_bb != 0) {
              this.field_bb = param1.field_bb;
            }
            if (param1.field_db != -2147483648) {
              this.field_db = param1.field_db;
            }
            if (param1.field_kb) {
              this.field_kb = param1.field_kb;
            }
            if (-2147483648 != param1.field_u) {
              this.field_u = param1.field_u;
            }
            if (-2147483648 != param1.field_Cb) {
              this.field_Cb = param1.field_Cb;
            }
            if (-2147483648 != param1.field_J) {
              this.field_J = param1.field_J;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_105_0 = var3;
          stackIn_105_1 = new StringBuilder().append("g.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, boolean param2, boolean param3, int param4, boolean param5, boolean param6, boolean param7, int param8, boolean param9, boolean param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        ci[] var16;
        ci var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        g var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = Terraphoenix.field_V;
        this.field_vb = this.field_R + param1;
        this.field_Bb = param8 + this.field_ib;
        var12 = l.field_b;
        var13 = l.field_d;
        var14 = l.field_f;
        var15 = l.field_c;
        l.i(this.field_vb, this.field_Bb, this.field_vb + this.field_x, this.field_Bb + this.field_lb);
        param5 = param5 & this.field_zb;
        if (!this.field_Ab) {
          param10 = this.field_Z;
          stackIn_5_0 = (this.field_N != 0);
          param9 = stackIn_5_0;
          param7 = this.field_mb;
        }
        if (!param3) {
          g.d(120);
        }
        var16 = this.field_X;
        var17 = this.field_ob;
        var18 = this.field_O;
        var19 = 0;
        if (!param5) {
          if (this.field_xb != null) {
            var17 = this.field_xb;
          }
          if (this.field_U >= 0) {
            var18 = this.field_U;
          }
          if (this.field_sb != null) {
            var16 = this.field_sb;
          }
        }
        var20 = 0;
        if (param10) {
          if (this.field_fb != null) {
            var17 = this.field_fb;
          }
          if (this.field_V != null) {
            var16 = this.field_V;
          }
          if (this.field_Cb != -2147483648) {
            var20 = this.field_Cb;
          }
          if (this.field_P != -2147483648) {
            var19 = this.field_P;
          }
          if (0 <= this.field_M) {
            var18 = this.field_M;
          }
        }
        if (param9) {
          if (this.field_J != -2147483648) {
            var19 = this.field_J;
          }
          if (-2147483648 != this.field_hb) {
            var20 = this.field_hb;
          }
          if (0 <= this.field_rb) {
            var18 = this.field_rb;
          }
          if (this.field_eb != null) {
            var16 = this.field_eb;
          }
          if (this.field_y != null) {
            var17 = this.field_y;
          }
        }
        if (param7) {
          if (this.field_yb != null) {
            var16 = this.field_yb;
          }
          if (this.field_db != -2147483648) {
            var19 = this.field_db;
          }
          if (0 <= this.field_G) {
            var18 = this.field_G;
          }
          if (this.field_u != -2147483648) {
            var20 = this.field_u;
          }
          if (null != this.field_w) {
            var17 = this.field_w;
          }
        }
        var21 = this.field_wb + var19;
        var22 = var20 + this.field_bb;
        if (this.field_z) {
          jl.a(var16, param4, param8, param0, (byte) -104, param1);
        } else {
          jl.a(var16, this.field_lb, this.field_Bb, this.field_x, (byte) 91, this.field_vb);
        }
        if (var17 != null) {
          var23_int = var21 + this.field_vb;
          if (this.field_ub == 1) {
            var23_int = var23_int + (this.field_x - var17.field_q) / 2;
          }
          var24 = this.field_Bb + var22;
          if (this.field_ub == 2) {
            var23_int = var23_int + (this.field_x - var17.field_q);
          }
          if (this.field_H == 1) {
            var24 = var24 + (-var17.field_u + this.field_lb) / 2;
          }
          if (2 == this.field_H) {
            var24 = var24 + (-var17.field_u + this.field_lb);
          }
          if (this.field_jb >= 256) {
            var17.b(var23_int, var24);
          } else {
            var17.a(var23_int, var24, this.field_jb);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_B != null &&
          this.field_S != null) {
          var26 = this.field_B;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param6 &&
            this.field_K != null) {
            var23Lifetime2 = var26 + this.field_K;
          }
          if (this.field_S.b(var23Lifetime2) <= -(this.field_v * 2) + this.field_x &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (1 == this.field_H) {
              var22 = var22 + (-this.field_S.field_p + this.field_lb - this.field_S.field_s) / 2;
            } else {
              if (2 == this.field_H) {
                var22 = var22 + (-this.field_S.field_s + (this.field_lb - this.field_S.field_p));
              }
            }
            if (0 == this.field_ub) {
              this.field_S.a(var23Lifetime2, this.field_v + (this.field_vb + var21), var22 + this.field_Bb + this.field_S.field_s, var18, -1, this.field_E);
            } else {
              if (this.field_ub == 1) {
                this.field_S.b(var23Lifetime2, this.field_v + this.field_vb + var21 + (-(this.field_v * 2) + this.field_x) / 2, this.field_S.field_s + var22 + this.field_Bb, var18, -1, this.field_E);
              } else {
                if (this.field_ub != 2) {
                  this.field_S.a(var23Lifetime2, var21 + this.field_vb + this.field_v, var22 + this.field_Bb, this.field_x - this.field_v * 2, this.field_lb, var18, -1, this.field_E, this.field_ub, this.field_H, this.field_A);
                } else {
                  this.field_S.c(var23Lifetime2, this.field_x - (2 * this.field_v - this.field_vb - this.field_v - var21), this.field_S.field_s + (this.field_Bb + var22), var18, -1, this.field_E);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_S.a(var23Lifetime2, this.field_v + (this.field_vb + var21), var22 + this.field_Bb, this.field_x - this.field_v * 2, this.field_lb, var18, -1, this.field_E, this.field_ub, this.field_H, this.field_A);
          }
        }
        if (null != this.field_L) {
          var23_ref = (g) (this.field_L.d(9272));
          while (var23_ref != null) {
            var23_ref.a(this.field_x, this.field_vb + var19, this.field_T, true, this.field_lb, param5, param6, param7, var20 + this.field_Bb, param9, param10);
            var23_ref = (g) (this.field_L.e((byte) -119));
          }
        }
        l.c(var12, var13, var14, var15);
    }

    private g(long param0, g param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_J = -2147483648;
        this.field_Cb = -2147483648;
        this.field_hb = -2147483648;
        this.field_P = -2147483648;
        this.field_db = -2147483648;
        this.field_zb = true;
        this.field_T = false;
        this.field_u = -2147483648;
        this.field_jb = 256;
        this.field_U = -1;
        this.field_rb = -1;
        this.field_I = false;
        this.field_G = -1;
        this.field_M = -1;
        this.field_E = 256;
        try {
          this.field_g = param0;
          this.field_lb = param5;
          this.field_ib = param3;
          this.field_R = param2;
          this.field_x = param4;
          this.a(0, param1);
          if (param6 != null) {
            this.field_B = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "g.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_ab = "Use this alternative as your account name";
        field_cb = 0;
        field_qb = "Return to Main Menu";
        field_nb = "Email (Login):";
    }
}
