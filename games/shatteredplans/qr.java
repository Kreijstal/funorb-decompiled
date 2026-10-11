/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qr extends hm {
    static nk[] field_A;
    int field_I;
    private int field_E;
    boolean field_s;
    private int field_X;
    int field_N;
    bi field_Z;
    private int field_D;
    int field_x;
    int field_V;
    bi field_ob;
    int field_w;
    int field_kb;
    int field_t;
    int field_hb;
    int field_y;
    bi field_pb;
    int field_ub;
    int field_Y;
    private int field_tb;
    boolean field_r;
    int field_G;
    bi field_U;
    nq field_nb;
    int field_T;
    bi[] field_lb;
    bi field_fb;
    pf field_M;
    bi[] field_vb;
    int field_J;
    int field_W;
    String field_u;
    int field_jb;
    int field_gb;
    int field_rb;
    private int field_O;
    private boolean field_ib;
    private boolean field_H;
    private int field_cb;
    private int field_S;
    bi[] field_wb;
    int field_qb;
    int field_K;
    bi[] field_F;
    boolean field_P;
    bi[] field_sb;
    int field_B;
    int field_Q;
    static String field_R;
    private int field_eb;
    boolean field_bb;
    private boolean field_C;
    boolean field_v;
    String field_z;
    int field_db;
    int field_mb;
    int field_ab;
    boolean field_L;

    final static String a(String param0, byte param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = param0.length();
          if (param1 >= -15) {
            field_A = (nk[]) null;
          }
          var5 = param3.length();
          var6 = param2.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = -var5 + var6;
          if (0 != var8) {
            var9_int = 0;
            while (true) {
              var9_int = param0.indexOf(param3, var9_int);
              if (var9_int < 0) {
                break;
              }
              var7 = var7 + var8;
              var9_int = var9_int + var5;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          while (true) {
            var11 = param0.indexOf(param3, var10);
            if (var11 < 0) {
              discarded$0 = var9.append(param0.substring(var10));
              stackIn_14_0 = var9.toString();
              return stackIn_14_0;
            }
            discarded$1 = var9.append(param0.substring(var10, var11));
            discarded$2 = var9.append(param2);
            var10 = var11 + var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("qr.L(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static dc a(int param0, int param1, String[] param2, vr param3, int param4, int param5) {
        try {
          dc stackIn_17_0 = null;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10_int = 0;
          jn var10 = null;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          dc var15 = null;
          hs var16 = null;
          vl var17 = null;
          pc var18 = null;
          var14 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            var15 = new dc(param0, param3, param4, param2);
            var7 = param2.length;
            var8 = var7 * md.field_J[param5];
            if (param1 != 50) {
              qr.a(false, (byte) 41);
            }
            var9 = 0;
            while (50 > var9) {
              try {
                var10_int = lr.a((byte) 27);
                var11 = var8 * 100 / 45;
                var12 = (int)Math.sqrt((double)var11);
                var13 = param4;
                if (var13 != 0 &&
                  var13 != 2) {
                  if (1 == var13) {
                    var17 = new vl(var10_int, var15.field_v.length);
                    var15.field_g = var17.a((byte) -128);
                  } else {
                    if (var13 != 3) {
                      throw new RuntimeException("Cannot generate map for unknown gametype " + param4);
                    }
                    var18 = new pc(var12, var12, var10_int, var8, var15.field_v.length);
                    var15.field_g = var18.a((byte) -127);
                  }
                } else {
                  var16 = new hs(var12, var12, var10_int, var8, var15.field_v.length);
                  var15.field_g = var16.a((byte) -126);
                }
                var15.field_g.a(var15.field_v, param3, param1 - 46);
                var15.e(param1 - 50);
                var15.b(param1 - 151);
                stackIn_17_0 = var15;
                return stackIn_17_0;
              } catch (jn decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var10 = (jn) (Object) decompiledCaughtException;
                var9++;
              }
            }
            return null;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var6;
            stackIn_22_1 = new StringBuilder().append("qr.R(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
            if (param3 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, byte param1) {
        qr var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = 0;
        int var4_intLifetime1;
        if (null != this.field_z &&
          this.field_nb != null) {
          var4_int = this.field_nb.c(this.field_z, param0);
          if (var4_int > var3) {
            var3 = var4_int;
          }
        }
        if (null != this.field_pb) {
          var4_intLifetime1 = this.field_pb.field_o;
          if (var4_intLifetime1 > var3) {
            var3 = var4_intLifetime1;
          }
        }
        if (param1 >= -56) {
          this.a(false, false, true, 31, 106, -74, false, -100, false, false, -72);
        }
        if (null != this.field_M) {
          var4 = (qr) (this.field_M.d(0));
          while (var4 != null) {
            var5 = var4.field_hb + var4.field_K;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (qr) (this.field_M.a((byte) -71));
          }
        }
        return var3;
    }

    final void a(int param0, qr param1) {
        if (null == this.field_M) {
          this.field_M = new pf();
        }
        if (param0 != 4) {
          return;
        }
        try {
          this.field_M.a((byte) -113, param1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "qr.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, qr param1, qr param2, byte param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 == null) {
            param2.field_w = 0;
            param2.field_db = 0;
          } else {
            param2.field_db = param1.field_mb + (param1.field_db + param0);
            param2.field_w = param1.field_w + param1.field_gb;
          }
          if (param3 < 38) {
            this.field_s = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("qr.O(").append(param0).append(',');
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
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(boolean param0, int param1) {
        this.a(false, true, false, 0, 0, -2147483648, false, gf.field_k, false, param0, gf.field_b);
        int var3 = 114 % ((param1 - 25) / 62);
    }

    final static void a(boolean param0, byte param1) {
        jb.a(param0, (byte) -27);
        if (param1 <= 107) {
          vr var3 = (vr) null;
          qr.a(46, -4, (String[]) null, (vr) null, -66, -4);
        }
        mj.a(0, param0);
    }

    final void a(int param0, boolean param1, boolean param2, int param3) {
        qr var10_ref_qr = null;
        int var10 = 0;
        int var9 = 0;
        int var11 = ShatteredPlansClient.field_F ? 1 : 0;
        int var5 = -this.field_db;
        int var6 = var5 - this.field_w;
        int var7 = this.field_mb;
        int var8 = var7 + this.field_gb;
        int var9Lifetime1;
        if (!param2) {
          var9 = 0;
          var10_ref_qr = (qr) (this.field_M.d(0));
          while (var10_ref_qr != null) {
            var10_ref_qr.field_w = -var10_ref_qr.field_db + var9;
            var9 = var9 + (var10_ref_qr.field_mb + var10_ref_qr.field_gb + param3);
            var10_ref_qr = (qr) (this.field_M.a((byte) -71));
          }
          var8 = -param3 + var9;
        }
        var9Lifetime1 = var8 - param0;
        if (param1) {
          if (var6 > var9Lifetime1) {
            var6 = var9Lifetime1;
          }
          if (var6 < 0) {
            var6 = 0;
          }
          var10 = -param0 + var7;
          if (var5 > var10) {
            var5 = var10;
          }
          if (var5 < 0) {
            var5 = 0;
          }
          this.field_mb = var7;
          this.field_w = var5 - var6;
          this.field_db = -var5;
          this.field_gb = -var7 + var8;
          return;
        }
    }

    final void e(byte param0) {
        qr var4 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_M != null) {
          var4 = (qr) (this.field_M.f(3725));
          while (var4 != null) {
            var4.field_H = true;
            var4.e((byte) -123);
            var4 = (qr) (this.field_M.b(-125));
          }
        }
        if (param0 >= -122) {
          this.field_pb = (bi) null;
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        boolean stackIn_34_1 = false;
        boolean stackIn_39_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        qr var14;
        int var15;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        if (0 >= this.field_cb) {
          var7 = this.field_cb >> 2;
        } else {
          var7 = -(-this.field_cb >> 2);
        }
        this.field_cb = this.field_cb - var7;
        this.field_hb = this.field_hb + var7;
        if (this.field_w > 0) {
          var7Lifetime1 = -(-this.field_w >> 2);
        } else {
          var7Lifetime1 = this.field_w >> 2;
        }
        this.field_db = this.field_db + var7Lifetime1;
        this.field_w = this.field_w - var7Lifetime1;
        var8 = 92 / ((-17 - param4) / 43);
        if (0 < this.field_S) {
          var7Lifetime2 = -(-this.field_S >> 2);
        } else {
          var7Lifetime2 = this.field_S >> 2;
        }
        this.field_K = this.field_K + var7Lifetime2;
        this.field_S = this.field_S - var7Lifetime2;
        if (0 < this.field_gb) {
          var7Lifetime3 = -(-this.field_gb >> 2);
        } else {
          var7Lifetime3 = this.field_gb >> 2;
        }
        this.field_gb = this.field_gb - var7Lifetime3;
        param3 = param3 & this.field_s;
        this.field_B = param0 + this.field_hb;
        this.field_mb = this.field_mb + var7Lifetime3;
        this.field_N = this.field_db + param1;
        var9 = gf.field_i;
        var10 = gf.field_a;
        var11 = gf.field_l;
        var12 = gf.field_f;
        gf.i(this.field_B, this.field_N, this.field_B + this.field_K, this.field_N + this.field_mb);
        var13 = 0;
        if (!us.field_c &&
          param3 &&
          je.field_d != 0 &&
          gf.field_i <= nh.field_p &&
          gf.field_l > nh.field_p &&
          td.field_P >= gf.field_a &&
          td.field_P < gf.field_f) {
          this.field_Q = -this.field_B + nh.field_p;
          var13 = 1;
          this.field_X = -this.field_N + td.field_P;
          this.field_rb = je.field_d;
          this.field_ub = je.field_d;
        } else {
          if (je.field_d != 0) {
            this.field_ub = 0;
          }
          this.field_rb = 0;
        }
        if (rf.field_n == 0) {
          this.field_ub = 0;
        }
        stackIn_34_1 = (!pa.field_j) && (gf.field_i <= pd.field_k) && (gf.field_l > pd.field_k) && (gf.field_a <= bb.field_b) && (gf.field_f > bb.field_b);
        this.field_v = stackIn_34_1;
        stackIn_39_1 = (this.field_v) && (this.field_ub == rf.field_n) && (param3);
        this.field_L = stackIn_39_1;
        if (null != this.field_M) {
          var14 = (qr) (this.field_M.f(3725));
          while (var14 != null) {
            var14.a(this.field_B, this.field_N, this.field_K, param3, -93, this.field_mb);
            var14 = (qr) (this.field_M.b(-125));
          }
        }
        if (this.field_v) {
          pa.field_j = true;
        }
        if (var13 != 0) {
          us.field_c = true;
        }
        gf.d(var9, var10, var11, var12);
        if (this.field_ub != 0 &&
          this.field_P) {
          this.field_db = -param1 + (bb.field_b - this.field_X);
          this.field_hb = -param0 - this.field_Q + pd.field_k;
          if (this.field_hb < 0) {
            this.field_hb = 0;
          }
          if (this.field_hb > param2 - this.field_K) {
            this.field_hb = -this.field_K + param2;
          }
          if (this.field_db < 0) {
            this.field_db = 0;
          }
          this.field_cb = 0;
          if (this.field_db > -this.field_mb + param5) {
            this.field_db = param5 - this.field_mb;
          }
          this.field_B = param0 + this.field_hb;
          this.field_w = 0;
          this.field_N = param1 + this.field_db;
        }
    }

    final static void f(int param0) {
        ha.field_a = null;
        if (param0 > -40) {
          field_R = (String) null;
        }
        rm.field_a = null;
    }

    final void a(qr param0, boolean param1) {
        boolean stackIn_101_1 = false;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != null) {
            if (null != param0.field_z) {
              this.field_z = param0.field_z;
            }
            if (param0.field_r) {
              this.field_r = param0.field_r;
            }
            if (null != param0.field_Z) {
              this.field_Z = param0.field_Z;
            }
            if (!param0.field_s) {
              this.field_s = param0.field_s;
            }
            if (param0.field_bb) {
              this.field_bb = param0.field_bb;
            }
            if (param0.field_kb != 0) {
              this.field_kb = param0.field_kb;
            }
            if (param0.field_lb != null) {
              this.field_lb = param0.field_lb;
            }
            if (param0.field_wb != null) {
              this.field_wb = param0.field_wb;
            }
            if (param0.field_H) {
              this.field_H = param0.field_H;
            }
            if (param0.field_I != 256) {
              this.field_I = param0.field_I;
            }
            if (param0.field_qb >= 0) {
              this.field_qb = param0.field_qb;
            }
            if (param0.field_jb >= 0) {
              this.field_jb = param0.field_jb;
            }
            if (param0.field_C) {
              this.field_C = param0.field_C;
            }
            if (null != param0.field_u) {
              this.field_u = param0.field_u;
            }
            if (null != param0.field_ob) {
              this.field_ob = param0.field_ob;
            }
            if (param0.field_W >= 0) {
              this.field_W = param0.field_W;
            }
            if (param0.field_ab >= 0) {
              this.field_ab = param0.field_ab;
            }
            if (null != param0.field_vb) {
              this.field_vb = param0.field_vb;
            }
            if (null != param0.field_F) {
              this.field_F = param0.field_F;
            }
            if (null != param0.field_pb) {
              this.field_pb = param0.field_pb;
            }
            if (param0.field_fb != null) {
              this.field_fb = param0.field_fb;
            }
            if (param0.field_Y != 0) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_U != null) {
              this.field_U = param0.field_U;
            }
            if (0 != param0.field_x) {
              this.field_x = param0.field_x;
            }
            if (null != param0.field_nb) {
              this.field_nb = param0.field_nb;
            }
            if (null != param0.field_sb) {
              this.field_sb = param0.field_sb;
            }
            if (param0.field_V != -2147483648) {
              this.field_V = param0.field_V;
            }
            if (-2147483648 != param0.field_T) {
              this.field_T = param0.field_T;
            }
            if (0 != param0.field_y) {
              this.field_y = param0.field_y;
            }
            if (param0.field_t != -2147483648) {
              this.field_t = param0.field_t;
            }
            if (-2147483648 != param0.field_O) {
              this.field_O = param0.field_O;
            }
            if (param0.field_E != 0) {
              this.field_E = param0.field_E;
            }
            if (0 != param0.field_tb) {
              this.field_tb = param0.field_tb;
            }
            if (param0.field_P) {
              this.field_P = param0.field_P;
            }
            if (0 != param0.field_G) {
              this.field_G = param0.field_G;
            }
            if (param0.field_J != -2147483648) {
              this.field_J = param0.field_J;
            }
            if (param0.field_D != -2147483648) {
              this.field_D = param0.field_D;
            }
            stackIn_101_1 = (this.field_C) && (param0.field_ib);
            this.field_ib = stackIn_101_1;
          }
          if (param1) {
            this.a(true, -124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_107_0 = var3;
          stackIn_107_1 = new StringBuilder().append("qr.P(");
          if (param0 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        this.field_db = param3;
        this.field_hb = param4;
        if (param2 <= 38) {
          this.field_F = (bi[]) null;
        }
        this.field_gb = 0;
        this.field_cb = 0;
        this.field_w = 0;
        this.field_K = param0;
        this.field_mb = param1;
        this.field_S = 0;
    }

    final static void a(int[] param0, byte[] param1, byte[] param2, String[][] param3, String[] param4, int param5, String[][] param6, bc param7, bc param8, int param9, bc param10, bi[][] param11, int param12, boolean param13, bi[][] param14) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        int[] var16 = null;
        nk[] var17 = null;
        try {
          var15_int = 87 / ((40 - param12) / 61);
          var17 = (nk[]) null;
          var16 = (int[]) null;
          ga.a((nk[]) null, param5, param10, (int[]) null, param11, param4, param9, param7, param1, param3, param8, param2, param13, param6, 16384, param0, param14);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_4_0 = var15;
          stackIn_4_1 = new StringBuilder().append("qr.FA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param7 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param8 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param11 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    qr(long param0, qr param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final int e(boolean param0) {
        if (param0) {
          this.a(55, true, true, 26);
        }
        return this.a(2147483647, (byte) -93);
    }

    final void a(boolean param0, int param1) {
        us.field_c = !param0 ? true : false;
        pa.field_j = !param0 ? true : false;
        if (param1 != -20429) {
          this.field_z = (String) null;
        }
        this.a(0, 0, gf.field_b, true, -98, gf.field_k);
    }

    private final void a(boolean param0, boolean param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10) {
        boolean stackIn_7_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        bi[] var16;
        bi var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        qr var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_B = param3 + this.field_hb;
        this.field_N = param4 + this.field_db;
        var12 = gf.field_i;
        var13 = gf.field_a;
        var14 = gf.field_l;
        var15 = gf.field_f;
        gf.i(this.field_B, this.field_N, this.field_B + this.field_K, this.field_mb + this.field_N);
        param1 = param1 & this.field_s;
        if (param5 != -2147483648) {
          qr.a((int[]) null, (byte[]) null, (byte[]) null, (String[][]) null, (String[]) null, 117, (String[][]) null, (bc) null, (bc) null, 119, (bc) null, (bi[][]) null, 82, false, (bi[][]) null);
        }
        if (!this.field_H) {
          param6 = this.field_bb;
          param8 = this.field_L;
          stackIn_7_0 = (this.field_ub != 0);
          param2 = stackIn_7_0;
        }
        var16 = this.field_F;
        var17 = this.field_pb;
        var18 = this.field_x;
        var19 = 0;
        if (!param1) {
          if (this.field_ob != null) {
            var17 = this.field_ob;
          }
          if (this.field_W >= 0) {
            var18 = this.field_W;
          }
          if (this.field_wb != null) {
            var16 = this.field_wb;
          }
        }
        var20 = 0;
        if (param8) {
          if (this.field_D != -2147483648) {
            var19 = this.field_D;
          }
          if (null != this.field_fb) {
            var17 = this.field_fb;
          }
          if (this.field_lb != null) {
            var16 = this.field_lb;
          }
          if (this.field_jb >= 0) {
            var18 = this.field_jb;
          }
          if (-2147483648 != this.field_O) {
            var20 = this.field_O;
          }
        }
        if (param2) {
          if (0 <= this.field_qb) {
            var18 = this.field_qb;
          }
          if (null != this.field_vb) {
            var16 = this.field_vb;
          }
          if (this.field_U != null) {
            var17 = this.field_U;
          }
          if (this.field_t != -2147483648) {
            var19 = this.field_t;
          }
          if (this.field_J != -2147483648) {
            var20 = this.field_J;
          }
        }
        if (param6) {
          if (this.field_V != -2147483648) {
            var19 = this.field_V;
          }
          if (this.field_T != -2147483648) {
            var20 = this.field_T;
          }
          if (null != this.field_sb) {
            var16 = this.field_sb;
          }
          if (null != this.field_Z) {
            var17 = this.field_Z;
          }
          if (this.field_ab >= 0) {
            var18 = this.field_ab;
          }
        }
        var21 = this.field_E + var19;
        var22 = this.field_tb + var20;
        if (this.field_r) {
          em.a(param7, param10, 7, param4, var16, param3);
        } else {
          em.a(this.field_mb, this.field_K, 7, this.field_N, var16, this.field_B);
        }
        if (var17 != null) {
          var23_int = this.field_B + var21;
          if (this.field_y == 1) {
            var23_int = var23_int + (-var17.field_o + this.field_K) / 2;
          }
          var24 = var22 + this.field_N;
          if (1 == this.field_G) {
            var24 = var24 + (this.field_mb - var17.field_p) / 2;
          }
          if (this.field_y == 2) {
            var23_int = var23_int + (-var17.field_o + this.field_K);
          }
          if (this.field_G == 2) {
            var24 = var24 + (-var17.field_p + this.field_mb);
          }
          if (256 > this.field_eb) {
            var17.a(var23_int, var24, this.field_eb);
          } else {
            var17.f(var23_int, var24);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_z &&
          null != this.field_nb) {
          var26 = this.field_z;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param9 &&
            this.field_u != null) {
            var23Lifetime2 = var26 + this.field_u;
          }
          if (this.field_nb.c(var23Lifetime2) <= -(2 * this.field_kb) + this.field_K &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.field_G == 1) {
              var22 = var22 + (-this.field_nb.field_q + this.field_mb - this.field_nb.field_J) / 2;
            } else {
              if (2 == this.field_G) {
                var22 = var22 + (-this.field_nb.field_J + (-this.field_nb.field_q + this.field_mb));
              }
            }
            if (this.field_y == 0) {
              this.field_nb.d(var23Lifetime2, var21 + (this.field_B + this.field_kb), this.field_nb.field_J + var22 + this.field_N, var18, -1, this.field_I);
            } else {
              if (this.field_y == 1) {
                this.field_nb.a(var23Lifetime2, var21 + this.field_B + this.field_kb + (this.field_K - this.field_kb * 2) / 2, this.field_N + var22 + this.field_nb.field_J, var18, -1, this.field_I);
              } else {
                if (this.field_y != 2) {
                  this.field_nb.a(var23Lifetime2, this.field_kb + this.field_B + var21, var22 + this.field_N, this.field_K - 2 * this.field_kb, this.field_mb, var18, -1, this.field_I, this.field_y, this.field_G, this.field_Y);
                } else {
                  this.field_nb.c(var23Lifetime2, this.field_K + (-(this.field_kb * 2) + var21) + (this.field_B + this.field_kb), var22 + (this.field_N + this.field_nb.field_J), var18, -1, this.field_I);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_nb.a(var23Lifetime2, var21 + (this.field_kb + this.field_B), this.field_N + var22, this.field_K - 2 * this.field_kb, this.field_mb, var18, -1, this.field_I, this.field_y, this.field_G, this.field_Y);
          }
        }
        if (null != this.field_M) {
          var23_ref = (qr) (this.field_M.d(0));
          while (var23_ref != null) {
            var23_ref.a(this.field_ib, param1, param2, this.field_B + var19, var20 + this.field_N, -2147483648, param6, this.field_mb, param8, param9, this.field_K);
            var23_ref = (qr) (this.field_M.a((byte) -71));
          }
        }
        gf.d(var12, var13, var14, var15);
    }

    final static void a(bc param0, byte param1) {
        bi var6 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var6 = new bi(param0.a(true, "", "final_frame.jpg"), (java.awt.Component) ((Object) tm.field_i));
          var3 = var6.field_z;
          var4 = var6.field_w;
          wh.a(false);
          if (param1 <= 22) {
            vr var5 = (vr) null;
            qr.a(-15, 122, (String[]) null, (vr) null, -98, -12);
          }
          qa.field_q = new bi(var3, 3 * var4 / 4);
          qa.field_q.e();
          var6.c(0, 0);
          ak.field_z = new bi(var3, -qa.field_q.field_w + var4);
          ak.field_z.e();
          var6.c(0, -qa.field_q.field_w);
          ak.field_z.field_x = qa.field_q.field_w;
          ln.f((byte) 85);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "qr.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    qr(long param0, qr param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    public static void e(int param0) {
        field_A = null;
        if (param0 != -14115) {
          return;
        }
        field_R = null;
    }

    protected qr() {
        this.field_W = -1;
        this.field_T = -2147483648;
        this.field_I = 256;
        this.field_D = -2147483648;
        this.field_qb = -1;
        this.field_V = -2147483648;
        this.field_jb = -1;
        this.field_O = -2147483648;
        this.field_J = -2147483648;
        this.field_ib = false;
        this.field_s = true;
        this.field_C = false;
        this.field_eb = 256;
        this.field_ab = -1;
        this.field_t = -2147483648;
    }

    qr(long param0, qr param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_W = -1;
        this.field_T = -2147483648;
        this.field_I = 256;
        this.field_D = -2147483648;
        this.field_qb = -1;
        this.field_V = -2147483648;
        this.field_jb = -1;
        this.field_O = -2147483648;
        this.field_J = -2147483648;
        this.field_ib = false;
        this.field_s = true;
        this.field_C = false;
        this.field_eb = 256;
        this.field_ab = -1;
        this.field_t = -2147483648;
        try {
          this.field_K = param4;
          this.field_hb = param2;
          this.field_mb = param5;
          this.field_b = param0;
          this.field_db = param3;
          this.a(param1, false);
          if (param6 != null) {
            this.field_z = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("qr.<init>(").append(param0).append(',');
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
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_R = "Checking";
    }
}
