/*
 * Decompiled by CFR-JS 0.4.0.
 */
class km extends ke {
    int field_fb;
    e field_C;
    mg[] field_x;
    mg field_y;
    mg field_qb;
    private int field_U;
    private int field_wb;
    int field_tb;
    int field_J;
    static bg field_yb;
    private int field_M;
    mg field_sb;
    int field_ab;
    int field_w;
    String field_V;
    private boolean field_mb;
    int field_E;
    int field_K;
    int field_Bb;
    mg field_rb;
    int field_kb;
    boolean field_X;
    boolean field_G;
    int field_Q;
    int field_db;
    static volatile boolean field_Db;
    private int field_v;
    static int field_pb;
    int field_R;
    p field_W;
    static String field_P;
    int field_Cb;
    int field_hb;
    int field_D;
    int field_bb;
    private int field_I;
    int field_F;
    boolean field_S;
    int field_nb;
    private int field_Ab;
    int field_H;
    int field_O;
    private boolean field_Z;
    mg field_jb;
    private int field_ob;
    mg[] field_L;
    boolean field_Y;
    int field_zb;
    mg[] field_vb;
    private boolean field_gb;
    static int field_B;
    String field_eb;
    int field_ub;
    int field_lb;
    mg[] field_cb;
    mg[] field_T;
    int field_z;
    private int field_N;
    boolean field_xb;
    int field_A;
    boolean field_ib;

    final void a(boolean param0, int param1) {
        this.a(param0, 0, df.field_e, 0, 0, df.field_f, false, false, false, false, true);
        if (param1 != 24960) {
          this.field_mb = true;
        }
    }

    final void b(int param0, km param1) {
        boolean stackIn_94_1 = false;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 18003) {
            this.a(true, (byte) -11);
          }
          if (param1 != null) {
            if (param1.field_x != null) {
              this.field_x = param1.field_x;
            }
            if (param1.field_xb) {
              this.field_xb = param1.field_xb;
            }
            if (param1.field_gb) {
              this.field_gb = param1.field_gb;
            }
            if (param1.field_eb != null) {
              this.field_eb = param1.field_eb;
            }
            if (0 <= param1.field_A) {
              this.field_A = param1.field_A;
            }
            if (null != param1.field_jb) {
              this.field_jb = param1.field_jb;
            }
            if (null != param1.field_sb) {
              this.field_sb = param1.field_sb;
            }
            if (0 != param1.field_z) {
              this.field_z = param1.field_z;
            }
            if (param1.field_T != null) {
              this.field_T = param1.field_T;
            }
            if (null != param1.field_y) {
              this.field_y = param1.field_y;
            }
            if (param1.field_C != null) {
              this.field_C = param1.field_C;
            }
            if (0 <= param1.field_ab) {
              this.field_ab = param1.field_ab;
            }
            if (null != param1.field_L) {
              this.field_L = param1.field_L;
            }
            if (param1.field_ib) {
              this.field_ib = param1.field_ib;
            }
            if (param1.field_db >= 0) {
              this.field_db = param1.field_db;
            }
            if (null != param1.field_V) {
              this.field_V = param1.field_V;
            }
            if (null != param1.field_vb) {
              this.field_vb = param1.field_vb;
            }
            if (null != param1.field_qb) {
              this.field_qb = param1.field_qb;
            }
            if (!param1.field_Y) {
              this.field_Y = param1.field_Y;
            }
            if (param1.field_E != 0) {
              this.field_E = param1.field_E;
            }
            if (param1.field_fb != 0) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_H != 256) {
              this.field_H = param1.field_H;
            }
            if (param1.field_rb != null) {
              this.field_rb = param1.field_rb;
            }
            if (0 <= param1.field_bb) {
              this.field_bb = param1.field_bb;
            }
            if (param1.field_cb != null) {
              this.field_cb = param1.field_cb;
            }
            if (param1.field_mb) {
              this.field_mb = param1.field_mb;
            }
            if (-2147483648 != param1.field_N) {
              this.field_N = param1.field_N;
            }
            if (0 != param1.field_v) {
              this.field_v = param1.field_v;
            }
            if (param1.field_hb != -2147483648) {
              this.field_hb = param1.field_hb;
            }
            if (param1.field_R != -2147483648) {
              this.field_R = param1.field_R;
            }
            if (param1.field_lb != 0) {
              this.field_lb = param1.field_lb;
            }
            if (0 != param1.field_D) {
              this.field_D = param1.field_D;
            }
            if (-2147483648 != param1.field_O) {
              this.field_O = param1.field_O;
            }
            if (param1.field_zb != -2147483648) {
              this.field_zb = param1.field_zb;
            }
            if (param1.field_X) {
              this.field_X = param1.field_X;
            }
            stackIn_94_1 = (this.field_gb) && (param1.field_Z);
            this.field_Z = stackIn_94_1;
            if (param1.field_wb != 0) {
              this.field_wb = param1.field_wb;
            }
            if (-2147483648 != param1.field_I) {
              this.field_I = param1.field_I;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("km.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(')').toString());
        }
    }

    km(long param0, km param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void a(boolean param0, byte param1) {
        ch.field_b = !param0 ? true : false;
        if (param1 < 88) {
          km.e(36);
        }
        vl.field_d = !param0 ? true : false;
        this.a(df.field_f, df.field_e, 0, true, true, 0);
    }

    public static void f(int param0) {
        field_yb = null;
        if (param0 != 2147483647) {
          return;
        }
        field_P = null;
    }

    final void b(byte param0) {
        km var4 = null;
        int var3 = Virogrid.field_F ? 1 : 0;
        if (param0 != 42) {
          return;
        }
        if (null != this.field_W) {
          var4 = (km) (this.field_W.b(false));
          while (var4 != null) {
            var4.field_mb = true;
            var4.b((byte) 42);
            var4 = (km) (this.field_W.e(9003));
          }
        }
    }

    km(long param0, km param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(int param0, km param1) {
        if (param0 != 0) {
          return;
        }
        try {
          if (this.field_W == null) {
            this.field_W = new p();
          }
          this.field_W.a(param1, (byte) -36);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "km.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(byte param0) {
        int var8_int = 0;
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        oc var4 = null;
        hn var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        hg var28 = null;
        long[][] var35 = null;
        int[][] var36 = null;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Virogrid.field_F ? 1 : 0;
        try {
          var28 = sh.field_qb;
          var2 = var28.g(11132);
          if (var2 == 0) {
            var3 = var28.c((byte) 87);
            var4 = (oc) (fn.field_a.a((byte) -77));
            while (var4 != null) {
              if (var4.field_j != var3) {
                var4 = (oc) (fn.field_a.a(16213));
                continue;
              }
              break;
            }
            if (var4 == null) {
              tn.a(false);
              return;
            }
            var5 = var28.g(11132);
            if (var5 != 0) {
              var6 = var4.field_g;
              qd.field_m[0].field_g = mi.field_d;
              qd.field_m[0].field_e = false;
              var7 = var4.field_m;
              qd.field_m[0].field_d = null;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                qd.field_m[var8_int].field_g = var28.h(param0 ^ -59);
                qd.field_m[var8_int].field_e = false;
                if (var28.g(11132) == 1) {
                  qd.field_m[var8_int].field_d = var28.h(param0 - 204);
                } else {
                  qd.field_m[var8_int].field_d = null;
                }
              }
              var8 = new String[3][var6];
              var9 = new String[3][var6];
              var35 = new long[3][var6];
              var36 = new int[3][var6 * var7];
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.g(11132);
              if (var18 > 0) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var28.g(11132);
                  var21 = qd.field_m[var20].field_g;
                  var22 = var28.e((byte) -60);
                  var24 = var28.field_l;
                  if (var19 < var6) {
                    var8[0][var12] = var21;
                    var9[0][var12] = qd.field_m[var20].field_d;
                    var35[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var25 < var7; var25++) {
                      incrementValue$0 = var15;
                      var15++;
                      var36[0][incrementValue$0] = var28.d((byte) 93);
                    }
                  }
                  if (var21 != null &&
                    jc.a(var21, true)) {
                    var8[1][var13] = mi.field_d;
                    var9[1][var13] = null;
                    var35[1][var13] = var22;
                    var13++;
                    var28.field_l = var24;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$1 = var16;
                      var16++;
                      var36[1][incrementValue$1] = var28.d((byte) 103);
                    }
                  }
                  if (var6 > var14 &&
                    !qd.field_m[var20].field_e) {
                    qd.field_m[var20].field_e = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = qd.field_m[var20].field_d;
                    var35[2][var14] = var22;
                    var14++;
                    var28.field_l = var24;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$2 = var17;
                      var17++;
                      var36[2][incrementValue$2] = var28.d((byte) 127);
                    }
                  }
                }
              }
            }
            var4.a(false);
          } else if (var2 == 1) {
            var3 = var28.c((byte) 83);
            var28.e((byte) -60);
            var4_ref = (hn) (qn.field_P.a((byte) -44));
            while (var4_ref != null) {
              if (~var3 != ~var4_ref.field_j) {
                var4_ref = (hn) (qn.field_P.a(16213));
                continue;
              }
              break;
            }
            if (var4_ref == null) {
              tn.a(false);
              return;
            }
            var4_ref.a(false);
          } else {
            en.a("HS1: " + rg.a(true), (Throwable) null, 1);
            tn.a(false);
          }
          if (param0 != 76) {
            field_yb = (bg) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "km.CA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        this.field_Cb = 0;
        this.field_tb = param0;
        this.field_ob = 0;
        this.field_ub = param1;
        this.field_F = param4;
        if (param3 >= -40) {
          this.field_ib = true;
        }
        this.field_kb = 0;
        this.field_K = param2;
        this.field_M = 0;
    }

    final static int e(int param0) {
        if (param0 > -53) {
          km.a(-109, -67, 3);
        }
        return ng.field_Q;
    }

    final int a(int param0, byte param1) {
        km var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        int var3 = 0;
        int var4_intLifetime1;
        if (null != this.field_V &&
          null != this.field_C) {
          var4_int = this.field_C.c(this.field_V, param0);
          if (var4_int > var3) {
            var3 = var4_int;
          }
        }
        if (null != this.field_qb) {
          var4_intLifetime1 = this.field_qb.field_u;
          if (var4_intLifetime1 > var3) {
            var3 = var4_intLifetime1;
          }
        }
        if (param1 < 68) {
          this.a(-4, -89, -47, true, false, 60);
        }
        if (null != this.field_W) {
          var4 = (km) (this.field_W.a((byte) -46));
          while (var4 != null) {
            var5 = var4.field_tb + var4.field_K;
            if (var5 > var3) {
              var3 = var5;
            }
            var4 = (km) (this.field_W.a(16213));
          }
        }
        return var3;
    }

    private final void a(int param0, int param1, int param2, boolean param3, boolean param4, int param5) {
        boolean stackIn_31_1 = false;
        boolean stackIn_39_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        km var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = Virogrid.field_F ? 1 : 0;
        if (this.field_M > 0) {
          var7 = -(-this.field_M >> 2);
        } else {
          var7 = this.field_M >> 2;
        }
        this.field_M = this.field_M - var7;
        this.field_tb = this.field_tb + var7;
        if (this.field_Cb > 0) {
          var7Lifetime1 = -(-this.field_Cb >> 2);
        } else {
          var7Lifetime1 = this.field_Cb >> 2;
        }
        this.field_Cb = this.field_Cb - var7Lifetime1;
        this.field_F = this.field_F + var7Lifetime1;
        if (this.field_ob > 0) {
          var7Lifetime2 = -(-this.field_ob >> 2);
        } else {
          var7Lifetime2 = this.field_ob >> 2;
        }
        this.field_K = this.field_K + var7Lifetime2;
        this.field_ob = this.field_ob - var7Lifetime2;
        if (0 < this.field_kb) {
          var7Lifetime3 = -(-this.field_kb >> 2);
        } else {
          var7Lifetime3 = this.field_kb >> 2;
        }
        this.field_ub = this.field_ub + var7Lifetime3;
        if (!param4) {
          return;
        }
        this.field_Bb = param5 + this.field_tb;
        this.field_J = this.field_F + param2;
        this.field_kb = this.field_kb - var7Lifetime3;
        param3 = param3 & this.field_Y;
        var8 = df.field_i;
        var9 = df.field_g;
        var10 = df.field_k;
        var11 = df.field_h;
        df.h(this.field_Bb, this.field_J, this.field_Bb + this.field_K, this.field_J + this.field_ub);
        var12 = 0;
        if (!vl.field_d &&
          param3 &&
          oi.field_g != 0 &&
          ii.field_b >= df.field_i &&
          df.field_k > ii.field_b &&
          a.field_y >= df.field_g &&
          df.field_h > a.field_y) {
          this.field_U = -this.field_J + a.field_y;
          this.field_nb = oi.field_g;
          var12 = 1;
          this.field_w = oi.field_g;
          this.field_Q = -this.field_Bb + ii.field_b;
        } else {
          this.field_nb = 0;
          if (oi.field_g != 0) {
            this.field_w = 0;
          }
        }
        stackIn_31_1 = (!ch.field_b) && (df.field_i <= nl.field_u) && (df.field_k > nl.field_u) && (hk.field_Jb >= df.field_g) && (hk.field_Jb < df.field_h);
        this.field_G = stackIn_31_1;
        if (0 == j.field_e) {
          this.field_w = 0;
        }
        stackIn_39_1 = (this.field_G) && (j.field_e == this.field_w) && (param3);
        this.field_S = stackIn_39_1;
        if (this.field_W != null) {
          var13 = (km) (this.field_W.b(false));
          while (var13 != null) {
            var13.a(this.field_ub, this.field_K, this.field_J, param3, param4, this.field_Bb);
            var13 = (km) (this.field_W.e(9003));
          }
        }
        if (this.field_G) {
          ch.field_b = true;
        }
        if (var12 != 0) {
          vl.field_d = true;
        }
        df.a(var8, var9, var10, var11);
        if (this.field_w != 0 &&
          this.field_X) {
          this.field_F = hk.field_Jb + (-this.field_U - param2);
          this.field_tb = nl.field_u + (-this.field_Q - param5);
          if (this.field_tb < 0) {
            this.field_tb = 0;
          }
          if (0 > this.field_F) {
            this.field_F = 0;
          }
          if (-this.field_K + param1 < this.field_tb) {
            this.field_tb = -this.field_K + param1;
          }
          this.field_M = 0;
          this.field_Bb = param5 + this.field_tb;
          if (param0 - this.field_ub < this.field_F) {
            this.field_F = param0 - this.field_ub;
          }
          this.field_Cb = 0;
          this.field_J = param2 + this.field_F;
        }
    }

    final void a(int param0, km param1, km param2, byte param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 == null) {
            param1.field_F = 0;
            param1.field_Cb = 0;
          } else {
            param1.field_F = param0 + (param2.field_ub + param2.field_F);
            param1.field_Cb = param2.field_kb + param2.field_Cb;
          }
          if (param3 < 60) {
            this.field_ab = -41;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("km.AA(").append(param0).append(',');
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
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final int c(byte param0) {
        if (param0 < 31) {
          this.a(true, -46, -65, 118);
        }
        return this.a(2147483647, (byte) 105);
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, boolean param6, boolean param7, boolean param8, boolean param9, boolean param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        mg[] var16;
        mg var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        km var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = Virogrid.field_F ? 1 : 0;
        this.field_J = param1 + this.field_F;
        this.field_Bb = param4 + this.field_tb;
        var12 = df.field_i;
        var13 = df.field_g;
        var14 = df.field_k;
        var15 = df.field_h;
        df.h(this.field_Bb, this.field_J, this.field_Bb + this.field_K, this.field_J + this.field_ub);
        param10 = param10 & this.field_Y;
        if (!this.field_mb) {
          param8 = this.field_S;
          param9 = this.field_xb;
          stackIn_5_0 = (this.field_w != 0);
          param7 = stackIn_5_0;
        }
        var16 = this.field_vb;
        var17 = this.field_qb;
        var18 = this.field_E;
        var19 = param3;
        if (!param10) {
          if (null != this.field_L) {
            var16 = this.field_L;
          }
          if (this.field_db >= 0) {
            var18 = this.field_db;
          }
          if (this.field_rb != null) {
            var17 = this.field_rb;
          }
        }
        var20 = 0;
        if (param8) {
          if (this.field_N != -2147483648) {
            var19 = this.field_N;
          }
          if (null != this.field_x) {
            var16 = this.field_x;
          }
          if (null != this.field_sb) {
            var17 = this.field_sb;
          }
          if (this.field_ab >= 0) {
            var18 = this.field_ab;
          }
          if (this.field_I != -2147483648) {
            var20 = this.field_I;
          }
        }
        if (param7) {
          if (0 <= this.field_A) {
            var18 = this.field_A;
          }
          if (null != this.field_T) {
            var16 = this.field_T;
          }
          if (this.field_R != -2147483648) {
            var19 = this.field_R;
          }
          if (this.field_O != -2147483648) {
            var20 = this.field_O;
          }
          if (this.field_y != null) {
            var17 = this.field_y;
          }
        }
        if (param9) {
          if (null != this.field_jb) {
            var17 = this.field_jb;
          }
          if (null != this.field_cb) {
            var16 = this.field_cb;
          }
          if (this.field_zb != -2147483648) {
            var20 = this.field_zb;
          }
          if (this.field_hb != -2147483648) {
            var19 = this.field_hb;
          }
          if (this.field_bb >= 0) {
            var18 = this.field_bb;
          }
        }
        var21 = var19 + this.field_v;
        var22 = this.field_wb + var20;
        if (this.field_ib) {
          tm.a(param4, param1, false, param2, param5, var16);
        } else {
          tm.a(this.field_Bb, this.field_J, false, this.field_K, this.field_ub, var16);
        }
        if (var17 != null) {
          var23_int = this.field_Bb + var21;
          var24 = var22 + this.field_J;
          if (this.field_lb == 1) {
            var23_int = var23_int + (-var17.field_u + this.field_K) / 2;
          }
          if (1 == this.field_D) {
            var24 = var24 + (this.field_ub - var17.field_z) / 2;
          }
          if (this.field_lb == 2) {
            var23_int = var23_int + (-var17.field_u + this.field_K);
          }
          if (this.field_D == 2) {
            var24 = var24 + (-var17.field_z + this.field_ub);
          }
          if (256 <= this.field_Ab) {
            var17.d(var23_int, var24);
          } else {
            var17.a(var23_int, var24, this.field_Ab);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_V &&
          this.field_C != null) {
          var26 = this.field_V;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param0 &&
            this.field_eb != null) {
            var23Lifetime2 = var26 + this.field_eb;
          }
          if (this.field_C.a(var23Lifetime2) <= this.field_K - 2 * this.field_z &&
            0 > var23Lifetime2.indexOf("<br>")) {
            if (this.field_D != 1) {
              if (this.field_D == 2) {
                var22 = var22 + (-this.field_C.field_H + (-this.field_C.field_G + this.field_ub));
              }
            } else {
              var22 = var22 + (-this.field_C.field_G + (this.field_ub - this.field_C.field_H)) / 2;
            }
            if (this.field_lb == 0) {
              this.field_C.c(var23Lifetime2, this.field_Bb + (this.field_z + var21), var22 + (this.field_J + this.field_C.field_H), var18, -1, this.field_H);
            } else {
              if (this.field_lb == 1) {
                this.field_C.b(var23Lifetime2, (this.field_K - 2 * this.field_z) / 2 + (this.field_z + this.field_Bb + var21), this.field_C.field_H + this.field_J + var22, var18, -1, this.field_H);
              } else {
                if (2 != this.field_lb) {
                  this.field_C.a(var23Lifetime2, this.field_z + this.field_Bb + var21, this.field_J + var22, -(this.field_z * 2) + this.field_K, this.field_ub, var18, -1, this.field_H, this.field_lb, this.field_D, this.field_fb);
                } else {
                  this.field_C.a(var23Lifetime2, this.field_z + this.field_Bb + (var21 - (this.field_z * 2 - this.field_K)), this.field_J + (var22 + this.field_C.field_H), var18, -1, this.field_H);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_C.a(var23Lifetime2, this.field_z + (this.field_Bb + var21), var22 + this.field_J, -(2 * this.field_z) + this.field_K, this.field_ub, var18, -1, this.field_H, this.field_lb, this.field_D, this.field_fb);
          }
        }
        if (null != this.field_W) {
          var23_ref = (km) (this.field_W.a((byte) -49));
          while (var23_ref != null) {
            var23_ref.a(param0, var20 + this.field_J, this.field_K, 0, this.field_Bb + var19, this.field_ub, this.field_Z, param7, param8, param9, param10);
            var23_ref = (km) (this.field_W.a(16213));
          }
        }
        df.a(var12, var13, var14, var15);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        km var10_ref_km = null;
        int var9 = 0;
        int var11 = Virogrid.field_F ? 1 : 0;
        int var5 = -this.field_F;
        int var6 = -this.field_Cb + var5;
        int var7 = this.field_ub;
        int var8 = this.field_kb + var7;
        int var9Lifetime1;
        if (!param0) {
          var9 = 0;
          var10_ref_km = (km) (this.field_W.a((byte) -74));
          while (var10_ref_km != null) {
            var10_ref_km.field_Cb = var9 - var10_ref_km.field_F;
            var9 = var9 + (var10_ref_km.field_ub + var10_ref_km.field_kb + param1);
            var10_ref_km = (km) (this.field_W.a(16213));
          }
          var8 = -param1 + var9;
        }
        var9Lifetime1 = -param3 + var8;
        if (var9Lifetime1 < var6) {
          var6 = var9Lifetime1;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        int var10 = var7 - param3;
        if (var10 < var5) {
          var5 = var10;
        }
        if (var5 < param2) {
          var5 = 0;
        }
        this.field_Cb = var5 - var6;
        this.field_F = -var5;
        this.field_kb = -var7 + var8;
        this.field_ub = var7;
    }

    final static void a(int param0, int param1, int param2) {
        uh.field_c = param0;
        sk.field_d = param1;
        int var3 = -21 / ((-5 - param2) / 60);
    }

    protected km() {
        this.field_R = -2147483648;
        this.field_hb = -2147483648;
        this.field_db = -1;
        this.field_bb = -1;
        this.field_Ab = 256;
        this.field_I = -2147483648;
        this.field_H = 256;
        this.field_zb = -2147483648;
        this.field_gb = false;
        this.field_Y = true;
        this.field_Z = false;
        this.field_O = -2147483648;
        this.field_N = -2147483648;
        this.field_A = -1;
        this.field_ab = -1;
    }

    km(long param0, km param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_R = -2147483648;
        this.field_hb = -2147483648;
        this.field_db = -1;
        this.field_bb = -1;
        this.field_Ab = 256;
        this.field_I = -2147483648;
        this.field_H = 256;
        this.field_zb = -2147483648;
        this.field_gb = false;
        this.field_Y = true;
        this.field_Z = false;
        this.field_O = -2147483648;
        this.field_N = -2147483648;
        this.field_A = -1;
        this.field_ab = -1;
        try {
          this.field_ub = param5;
          this.field_F = param3;
          this.field_K = param4;
          this.field_tb = param2;
          this.field_d = param0;
          this.b(18003, param1);
          if (param6 != null) {
            this.field_V = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "km.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_pb = 0;
        field_P = "Names cannot contain consecutive spaces";
        field_Db = false;
    }
}
