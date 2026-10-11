/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sna extends tf {
    kv[] field_db;
    int field_N;
    kv[] field_eb;
    po field_jb;
    kv[] field_A;
    int field_mb;
    int field_V;
    private boolean field_P;
    int field_L;
    int field_r;
    boolean field_E;
    boolean field_t;
    int field_D;
    int field_cb;
    int field_hb;
    int field_ab;
    kv field_H;
    private int field_O;
    int field_o;
    int field_lb;
    int field_B;
    int field_M;
    int field_p;
    kv field_v;
    int field_ib;
    String field_pb;
    kv field_y;
    private int field_x;
    boolean field_qb;
    int field_I;
    int field_gb;
    int field_w;
    int field_W;
    private boolean field_q;
    kv field_J;
    kv[] field_X;
    int field_rb;
    private int field_bb;
    int field_Y;
    int field_G;
    private int field_S;
    kv field_U;
    int field_kb;
    private int field_Q;
    int field_ob;
    boolean field_u;
    static boolean field_s;
    String field_Z;
    private boolean field_tb;
    int field_sb;
    static gj field_fb;
    static String field_C;
    boolean field_ub;
    int field_nb;
    int field_R;
    kv[] field_K;
    eaa field_z;
    private int field_F;
    boolean field_T;

    public static void e(byte param0) {
        field_C = null;
        field_fb = null;
        if (param0 != -110) {
          sna.e((byte) -44);
        }
    }

    sna(String param0, sna param1, int param2, int param3, int param4, int param5, String param6) {
        this(ew.a((byte) 8, (CharSequence) ((Object) param0)), param1, param2, param3, param4, param5, param6);
    }

    final void a(boolean param0, sna param1, sna param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0) {
            this.field_W = 109;
          }
          if (param2 != null) {
            param1.field_rb = param2.field_p + (param2.field_rb + param3);
            param1.field_I = param2.field_I + param2.field_hb;
          } else {
            param1.field_I = 0;
            param1.field_rb = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("sna.R(").append(param0).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, sna param1) {
        try {
          if (param0 != -1) {
            this.field_Q = 109;
          }
          if (null == this.field_z) {
            this.field_z = new eaa();
          }
          this.field_z.a(param1, true);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "sna.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(sna param0, int param1) {
        boolean stackIn_81_1 = false;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 <= 1) {
            return;
          }
          if (param0 != null) {
            if (null != param0.field_J) {
              this.field_J = param0.field_J;
            }
            if (param0.field_L != 0) {
              this.field_L = param0.field_L;
            }
            if (param0.field_G >= 0) {
              this.field_G = param0.field_G;
            }
            if (param0.field_q) {
              this.field_q = param0.field_q;
            }
            if (param0.field_A != null) {
              this.field_A = param0.field_A;
            }
            if (param0.field_K != null) {
              this.field_K = param0.field_K;
            }
            if (param0.field_gb != 0) {
              this.field_gb = param0.field_gb;
            }
            if (param0.field_eb != null) {
              this.field_eb = param0.field_eb;
            }
            if (null != param0.field_db) {
              this.field_db = param0.field_db;
            }
            if (null != param0.field_jb) {
              this.field_jb = param0.field_jb;
            }
            if (null != param0.field_U) {
              this.field_U = param0.field_U;
            }
            if (param0.field_o >= 0) {
              this.field_o = param0.field_o;
            }
            if (param0.field_B != 0) {
              this.field_B = param0.field_B;
            }
            if (null != param0.field_X) {
              this.field_X = param0.field_X;
            }
            if (null != param0.field_pb) {
              this.field_pb = param0.field_pb;
            }
            if (param0.field_P) {
              this.field_P = param0.field_P;
            }
            if (null != param0.field_y) {
              this.field_y = param0.field_y;
            }
            if (null != param0.field_H) {
              this.field_H = param0.field_H;
            }
            if (param0.field_w >= 0) {
              this.field_w = param0.field_w;
            }
            if (0 <= param0.field_ab) {
              this.field_ab = param0.field_ab;
            }
            if (null != param0.field_Z) {
              this.field_Z = param0.field_Z;
            }
            if (param0.field_cb != 256) {
              this.field_cb = param0.field_cb;
            }
            if (param0.field_qb) {
              this.field_qb = param0.field_qb;
            }
            if (!param0.field_u) {
              this.field_u = param0.field_u;
            }
            if (param0.field_t) {
              this.field_t = param0.field_t;
            }
            if (param0.field_v != null) {
              this.field_v = param0.field_v;
            }
            if (param0.field_ub) {
              this.field_ub = param0.field_ub;
            }
            if (param0.field_x != 0) {
              this.field_x = param0.field_x;
            }
            if (0 != param0.field_Y) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_bb != -2147483648) {
              this.field_bb = param0.field_bb;
            }
            if (param0.field_N != 0) {
              this.field_N = param0.field_N;
            }
            stackIn_81_1 = (this.field_P) && (param0.field_tb);
            this.field_tb = stackIn_81_1;
            if (param0.field_r != -2147483648) {
              this.field_r = param0.field_r;
            }
            if (param0.field_V != -2147483648) {
              this.field_V = param0.field_V;
            }
            if (param0.field_O != 0) {
              this.field_O = param0.field_O;
            }
            if (param0.field_ob != -2147483648) {
              this.field_ob = param0.field_ob;
            }
            if (-2147483648 != param0.field_lb) {
              this.field_lb = param0.field_lb;
            }
            if (param0.field_Q != -2147483648) {
              this.field_Q = param0.field_Q;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_99_0 = var3;
          stackIn_99_1 = new StringBuilder().append("sna.V(");
          if (param0 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(param1).append(')').toString());
        }
    }

    sna(long param0, sna param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    sna(long param0, sna param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_W = 0;
        this.field_I = 0;
        if (param1 != 31407) {
          this.field_lb = -57;
        }
        this.field_hb = 0;
        this.field_kb = param3;
        this.field_mb = 0;
        this.field_sb = param2;
        this.field_p = param0;
        this.field_rb = param4;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        sna var10_ref_sna;
        int var10;
        int var11;
        int var9Lifetime1;
        var11 = BachelorFridge.field_y;
        var5 = -this.field_rb;
        var6 = var5 - this.field_I;
        var7 = this.field_p;
        var8 = var7 + this.field_hb;
        if (!param2) {
          var9 = 0;
          var10_ref_sna = (sna) (this.field_z.b((byte) 90));
          while (var10_ref_sna != null) {
            var10_ref_sna.field_I = var9 - var10_ref_sna.field_rb;
            var9 = var9 + (param3 + var10_ref_sna.field_p + var10_ref_sna.field_hb);
            var10_ref_sna = (sna) (this.field_z.c(0));
          }
          var8 = -param3 + var9;
        }
        var9Lifetime1 = -param1 + var8;
        if (var9Lifetime1 < var6) {
          var6 = var9Lifetime1;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        var10 = -param1 + var7;
        if (var10 < var5) {
          var5 = var10;
        }
        if (param0 != -24380) {
          return;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        this.field_I = -var6 + var5;
        this.field_p = var7;
        this.field_rb = -var5;
        this.field_hb = var8 - var7;
    }

    final void a(boolean param0, int param1) {
        this.a(false, false, 0, false, param1 ^ -2147475846, 0, dg.field_c, param0, dg.field_i, true, false);
        if (param1 != 7802) {
          this.field_jb = (po) null;
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 19842) {
          this.b(68, -125);
        }
        mu.field_k = !param1 ? true : false;
        on.field_x = !param1 ? true : false;
        this.a(true, 0, false, dg.field_i, dg.field_c, 0);
    }

    final int e(int param0) {
        if (param0 != -1) {
          this.b(54, -31);
        }
        return this.b(2147483647, param0 - 37);
    }

    final void d(byte param0) {
        sna var4 = null;
        int var3 = BachelorFridge.field_y;
        if (param0 < 115) {
          sna.e((byte) -89);
        }
        if (this.field_z != null) {
          var4 = (sna) (this.field_z.a(6));
          while (var4 != null) {
            var4.field_q = true;
            var4.d((byte) 118);
            var4 = (sna) (this.field_z.c((byte) 116));
          }
        }
    }

    private final void a(boolean param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6, boolean param7, int param8, boolean param9, boolean param10) {
        boolean stackIn_7_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        kv[] var16;
        kv var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        sna var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = BachelorFridge.field_y;
        this.field_D = this.field_kb + param5;
        this.field_M = param2 + this.field_rb;
        var12 = dg.field_f;
        var13 = dg.field_j;
        var14 = dg.field_h;
        if (param4 != -2147483648) {
          this.field_E = true;
        }
        var15 = dg.field_k;
        dg.c(this.field_D, this.field_M, this.field_D + this.field_sb, this.field_p + this.field_M);
        if (!this.field_q) {
          param0 = this.field_T;
          stackIn_7_0 = (this.field_ib != 0);
          param10 = stackIn_7_0;
          param3 = this.field_t;
        }
        param9 = param9 & this.field_u;
        var16 = this.field_eb;
        var17 = this.field_v;
        var18 = this.field_gb;
        var19 = 0;
        var20 = 0;
        if (!param9) {
          if (null != this.field_H) {
            var17 = this.field_H;
          }
          if (null != this.field_X) {
            var16 = this.field_X;
          }
          if (0 <= this.field_o) {
            var18 = this.field_o;
          }
        }
        if (param0) {
          if (0 <= this.field_ab) {
            var18 = this.field_ab;
          }
          if (null != this.field_A) {
            var16 = this.field_A;
          }
          if (this.field_bb != -2147483648) {
            var20 = this.field_bb;
          }
          if (this.field_Q != -2147483648) {
            var19 = this.field_Q;
          }
          if (this.field_U != null) {
            var17 = this.field_U;
          }
        }
        if (param10) {
          if (0 <= this.field_G) {
            var18 = this.field_G;
          }
          if (this.field_db != null) {
            var16 = this.field_db;
          }
          if (null != this.field_y) {
            var17 = this.field_y;
          }
          if (this.field_V != -2147483648) {
            var20 = this.field_V;
          }
          if (-2147483648 != this.field_lb) {
            var19 = this.field_lb;
          }
        }
        if (param3) {
          if (this.field_r != -2147483648) {
            var19 = this.field_r;
          }
          if (this.field_ob != -2147483648) {
            var20 = this.field_ob;
          }
          if (this.field_w >= 0) {
            var18 = this.field_w;
          }
          if (this.field_K != null) {
            var16 = this.field_K;
          }
          if (this.field_J != null) {
            var17 = this.field_J;
          }
        }
        var21 = this.field_x + var19;
        var22 = this.field_O + var20;
        if (!this.field_qb) {
          hp.a(this.field_sb, this.field_D, (byte) -121, this.field_p, var16, this.field_M);
        } else {
          hp.a(param8, param5, (byte) -89, param6, var16, param2);
        }
        if (var17 != null) {
          var23_int = var21 + this.field_D;
          if (1 == this.field_N) {
            var23_int = var23_int + (this.field_sb - var17.field_n) / 2;
          }
          var24 = this.field_M + var22;
          if (this.field_N == 2) {
            var23_int = var23_int + (this.field_sb - var17.field_n);
          }
          if (this.field_Y == 1) {
            var24 = var24 + (-var17.field_o + this.field_p) / 2;
          }
          if (2 == this.field_Y) {
            var24 = var24 + (this.field_p - var17.field_o);
          }
          if (this.field_F >= 256) {
            var17.e(var23_int, var24);
          } else {
            var17.a(var23_int, var24, this.field_F);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_Z &&
          null != this.field_jb) {
          var26 = this.field_Z;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param7 &&
            this.field_pb != null) {
            var23Lifetime2 = var26 + this.field_pb;
          }
          if (this.field_jb.a(var23Lifetime2) <= -(2 * this.field_L) + this.field_sb &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (1 == this.field_Y) {
              var22 = var22 + (-this.field_jb.field_B + this.field_p - this.field_jb.field_u) / 2;
            } else {
              if (2 == this.field_Y) {
                var22 = var22 + (this.field_p + (-this.field_jb.field_B - this.field_jb.field_u));
              }
            }
            if (0 == this.field_N) {
              this.field_jb.b(var23Lifetime2, var21 + this.field_D + this.field_L, var22 + this.field_M + this.field_jb.field_u, var18, -1, this.field_cb);
            } else {
              if (this.field_N == 1) {
                this.field_jb.a(var23Lifetime2, var21 + this.field_D + this.field_L + (this.field_sb - this.field_L * 2) / 2, this.field_jb.field_u + (this.field_M + var22), var18, -1, this.field_cb);
              } else {
                if (this.field_N != 2) {
                  this.field_jb.a(var23Lifetime2, this.field_D + this.field_L + var21, this.field_M + var22, -(2 * this.field_L) + this.field_sb, this.field_p, var18, -1, this.field_cb, this.field_N, this.field_Y, this.field_B);
                } else {
                  this.field_jb.c(var23Lifetime2, this.field_D - (-this.field_L - var21 + (-this.field_sb + this.field_L * 2)), this.field_jb.field_u + (this.field_M + var22), var18, -1, this.field_cb);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_jb.a(var23Lifetime2, var21 + (this.field_L + this.field_D), var22 + this.field_M, this.field_sb - 2 * this.field_L, this.field_p, var18, -1, this.field_cb, this.field_N, this.field_Y, this.field_B);
          }
        }
        if (null != this.field_z) {
          var23_ref = (sna) (this.field_z.b((byte) 90));
          while (var23_ref != null) {
            var23_ref.a(param0, this.field_tb, var20 + this.field_M, param3, -2147483648, this.field_D + var19, this.field_p, param7, this.field_sb, param9, param10);
            var23_ref = (sna) (this.field_z.c(0));
          }
        }
        dg.a(var12, var13, var14, var15);
    }

    final int b(int param0, int param1) {
        sna var5 = null;
        int var6 = 0;
        int var5_int = 0;
        int var7 = BachelorFridge.field_y;
        int var4 = -17 / ((65 - param1) / 59);
        int var3 = 0;
        int var5_intLifetime1;
        if (this.field_Z != null &&
          this.field_jb != null) {
          var5_int = this.field_jb.c(this.field_Z, param0);
          if (var5_int > var3) {
            var3 = var5_int;
          }
        }
        if (this.field_v != null) {
          var5_intLifetime1 = this.field_v.field_n;
          if (var3 < var5_intLifetime1) {
            var3 = var5_intLifetime1;
          }
        }
        if (this.field_z != null) {
          var5 = (sna) (this.field_z.b((byte) 90));
          while (var5 != null) {
            var6 = var5.field_sb + var5.field_kb;
            if (var3 < var6) {
              var3 = var6;
            }
            var5 = (sna) (this.field_z.c(0));
          }
        }
        return var3;
    }

    private final void a(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        boolean stackIn_30_1 = false;
        boolean stackIn_38_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        sna var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = BachelorFridge.field_y;
        if (this.field_mb > 0) {
          var7 = -(-this.field_mb >> 2);
        } else {
          var7 = this.field_mb >> 2;
        }
        this.field_mb = this.field_mb - var7;
        this.field_kb = this.field_kb + var7;
        if (this.field_I <= 0) {
          var7Lifetime1 = this.field_I >> 2;
        } else {
          var7Lifetime1 = -(-this.field_I >> 2);
        }
        this.field_rb = this.field_rb + var7Lifetime1;
        this.field_I = this.field_I - var7Lifetime1;
        if (this.field_W > 0) {
          var7Lifetime2 = -(-this.field_W >> 2);
        } else {
          var7Lifetime2 = this.field_W >> 2;
        }
        this.field_W = this.field_W - var7Lifetime2;
        this.field_sb = this.field_sb + var7Lifetime2;
        if (this.field_hb <= 0) {
          var7Lifetime3 = this.field_hb >> 2;
        } else {
          var7Lifetime3 = -(-this.field_hb >> 2);
        }
        this.field_D = this.field_kb + param1;
        this.field_M = this.field_rb + param5;
        param0 = param0 & this.field_u;
        this.field_hb = this.field_hb - var7Lifetime3;
        this.field_p = this.field_p + var7Lifetime3;
        var8 = dg.field_f;
        var9 = dg.field_j;
        var10 = dg.field_h;
        var11 = dg.field_k;
        dg.c(this.field_D, this.field_M, this.field_sb + this.field_D, this.field_M + this.field_p);
        var12 = param2 ? 1 : 0;
        if (!mu.field_k &&
          param0 &&
          lf.field_c != 0 &&
          dg.field_f <= nfa.field_a &&
          dg.field_h > nfa.field_a &&
          jc.field_r >= dg.field_j &&
          jc.field_r < dg.field_k) {
          var12 = 1;
          this.field_ib = lf.field_c;
          this.field_R = lf.field_c;
          this.field_S = -this.field_M + jc.field_r;
          this.field_nb = nfa.field_a - this.field_D;
        } else {
          this.field_R = 0;
          if (lf.field_c != 0) {
            this.field_ib = 0;
          }
        }
        stackIn_30_1 = (!on.field_x) && (dg.field_f <= mk.field_p) && (dg.field_h > mk.field_p) && (dg.field_j <= gd.field_m) && (gd.field_m < dg.field_k);
        this.field_E = stackIn_30_1;
        if (fia.field_t == 0) {
          this.field_ib = 0;
        }
        stackIn_38_1 = (this.field_E) && (this.field_ib == fia.field_t) && (param0);
        this.field_T = stackIn_38_1;
        if (null != this.field_z) {
          var13 = (sna) (this.field_z.a(6));
          while (var13 != null) {
            var13.a(param0, this.field_D, false, this.field_sb, this.field_p, this.field_M);
            var13 = (sna) (this.field_z.c((byte) 116));
          }
        }
        if (var12 != 0) {
          mu.field_k = true;
        }
        if (this.field_E) {
          on.field_x = true;
        }
        dg.a(var8, var9, var10, var11);
        if (this.field_ib != 0 &&
          this.field_ub) {
          this.field_rb = -param5 + (-this.field_S + gd.field_m);
          this.field_kb = -param1 + mk.field_p - this.field_nb;
          if (this.field_kb < 0) {
            this.field_kb = 0;
          }
          if (0 > this.field_rb) {
            this.field_rb = 0;
          }
          if (param3 - this.field_sb < this.field_kb) {
            this.field_kb = param3 - this.field_sb;
          }
          this.field_mb = 0;
          this.field_I = 0;
          this.field_D = this.field_kb + param1;
          if (param4 - this.field_p < this.field_rb) {
            this.field_rb = -this.field_p + param4;
          }
          this.field_M = this.field_rb + param5;
        }
    }

    public sna() {
        this.field_lb = -2147483648;
        this.field_G = -1;
        this.field_ab = -1;
        this.field_bb = -2147483648;
        this.field_V = -2147483648;
        this.field_o = -1;
        this.field_ob = -2147483648;
        this.field_P = false;
        this.field_Q = -2147483648;
        this.field_cb = 256;
        this.field_u = true;
        this.field_tb = false;
        this.field_w = -1;
        this.field_r = -2147483648;
        this.field_F = 256;
    }

    sna(long param0, sna param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_lb = -2147483648;
        this.field_G = -1;
        this.field_ab = -1;
        this.field_bb = -2147483648;
        this.field_V = -2147483648;
        this.field_o = -1;
        this.field_ob = -2147483648;
        this.field_P = false;
        this.field_Q = -2147483648;
        this.field_cb = 256;
        this.field_u = true;
        this.field_tb = false;
        this.field_w = -1;
        this.field_r = -2147483648;
        this.field_F = 256;
        try {
          this.field_sb = param4;
          this.field_rb = param3;
          this.field_kb = param2;
          this.field_p = param5;
          this.field_c = param0;
          this.a(param1, 56);
          if (param6 != null) {
            this.field_Z = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("sna.<init>(").append(param0).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_s = false;
        field_C = "<%0> must play 1 more rated game before playing with the current options.";
    }
}
