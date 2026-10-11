/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cr extends fh {
    int field_K;
    private int field_zb;
    int field_ab;
    int field_H;
    private int field_hb;
    private int field_rb;
    int field_C;
    boolean field_jb;
    int field_kb;
    private int field_fb;
    er field_W;
    String field_J;
    boolean field_pb;
    int field_O;
    boolean field_X;
    er field_mb;
    int field_qb;
    int field_tb;
    private boolean field_nb;
    String field_S;
    private boolean field_sb;
    int field_R;
    int field_xb;
    int field_B;
    static int[] field_P;
    boolean field_G;
    int field_wb;
    int field_U;
    er[] field_Bb;
    static boolean[] field_eb;
    int field_bb;
    nj field_M;
    static String field_Z;
    int field_ob;
    boolean field_V;
    int field_Cb;
    static er field_E;
    int field_db;
    er[] field_T;
    er[] field_Q;
    int field_N;
    int field_Fb;
    int field_L;
    private int field_F;
    boolean field_lb;
    private int field_vb;
    int field_A;
    er[] field_gb;
    er[] field_cb;
    er field_I;
    er field_Ab;
    private boolean field_ib;
    cc field_z;
    int field_Gb;
    er field_Db;
    private int field_Eb;
    int field_D;
    private int field_yb;
    int field_Y;
    int field_ub;

    final void a(byte param0, cr param1, cr param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 <= 2) {
            this.a(22, -78, 66, true);
          }
          if (param1 == null) {
            param2.field_N = 0;
            param2.field_L = 0;
          } else {
            param2.field_N = param3 + (param1.field_db + param1.field_N);
            param2.field_L = param1.field_kb + param1.field_L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("cr.AA(").append(param0).append(',');
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
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        cr var10_ref_cr = null;
        int var9 = 0;
        int var11 = Vertigo2.field_L ? 1 : 0;
        int var5 = -this.field_N;
        int var6 = var5 - this.field_L;
        int var7 = this.field_db;
        int var8 = var7 + this.field_kb;
        int var9Lifetime1;
        if (!param3) {
          var9 = 0;
          var10_ref_cr = (cr) (this.field_M.a((byte) 100));
          while (var10_ref_cr != null) {
            var10_ref_cr.field_L = -var10_ref_cr.field_N + var9;
            var9 = var9 + (param2 + var10_ref_cr.field_kb + var10_ref_cr.field_db);
            var10_ref_cr = (cr) (this.field_M.b(126));
          }
          var8 = var9 - param2;
        }
        var9Lifetime1 = -param0 + var8;
        if (var6 > var9Lifetime1) {
          var6 = var9Lifetime1;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        int var10 = -param0 + var7;
        if (var5 > var10) {
          var5 = var10;
        }
        if (param1 > var5) {
          var5 = 0;
        }
        this.field_db = var7;
        this.field_L = -var6 + var5;
        this.field_kb = -var7 + var8;
        this.field_N = -var5;
    }

    final void a(cr param0, int param1) {
        boolean stackIn_101_1 = false;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != null) {
            if (param0.field_R != 0) {
              this.field_R = param0.field_R;
            }
            if (param0.field_Bb != null) {
              this.field_Bb = param0.field_Bb;
            }
            if (param0.field_A != 0) {
              this.field_A = param0.field_A;
            }
            if (!param0.field_lb) {
              this.field_lb = param0.field_lb;
            }
            if (null != param0.field_z) {
              this.field_z = param0.field_z;
            }
            if (null != param0.field_Q) {
              this.field_Q = param0.field_Q;
            }
            if (param0.field_jb) {
              this.field_jb = param0.field_jb;
            }
            if (0 <= param0.field_D) {
              this.field_D = param0.field_D;
            }
            if (param0.field_ib) {
              this.field_ib = param0.field_ib;
            }
            if (null != param0.field_I) {
              this.field_I = param0.field_I;
            }
            if (param0.field_sb) {
              this.field_sb = param0.field_sb;
            }
            if (param0.field_V) {
              this.field_V = param0.field_V;
            }
            if (0 <= param0.field_H) {
              this.field_H = param0.field_H;
            }
            if (param0.field_mb != null) {
              this.field_mb = param0.field_mb;
            }
            if (param0.field_cb != null) {
              this.field_cb = param0.field_cb;
            }
            if (param0.field_gb != null) {
              this.field_gb = param0.field_gb;
            }
            if (param0.field_Ab != null) {
              this.field_Ab = param0.field_Ab;
            }
            if (param0.field_U != 256) {
              this.field_U = param0.field_U;
            }
            if (null != param0.field_W) {
              this.field_W = param0.field_W;
            }
            if (null != param0.field_Db) {
              this.field_Db = param0.field_Db;
            }
            if (null != param0.field_S) {
              this.field_S = param0.field_S;
            }
            if (null != param0.field_T) {
              this.field_T = param0.field_T;
            }
            if (param0.field_K >= 0) {
              this.field_K = param0.field_K;
            }
            if (param0.field_qb != 0) {
              this.field_qb = param0.field_qb;
            }
            if (null != param0.field_J) {
              this.field_J = param0.field_J;
            }
            if (param0.field_B >= 0) {
              this.field_B = param0.field_B;
            }
            if (param0.field_X) {
              this.field_X = param0.field_X;
            }
            if (param0.field_hb != 0) {
              this.field_hb = param0.field_hb;
            }
            if (param0.field_ab != 0) {
              this.field_ab = param0.field_ab;
            }
            if (param0.field_rb != 0) {
              this.field_rb = param0.field_rb;
            }
            if (param0.field_Cb != -2147483648) {
              this.field_Cb = param0.field_Cb;
            }
            if (param0.field_O != 0) {
              this.field_O = param0.field_O;
            }
            if (param0.field_yb != -2147483648) {
              this.field_yb = param0.field_yb;
            }
            if (param0.field_Gb != -2147483648) {
              this.field_Gb = param0.field_Gb;
            }
            if (param0.field_F != -2147483648) {
              this.field_F = param0.field_F;
            }
            if (param0.field_Y != -2147483648) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_bb != -2147483648) {
              this.field_bb = param0.field_bb;
            }
            stackIn_101_1 = (this.field_sb) && (param0.field_nb);
            this.field_nb = stackIn_101_1;
          }
          if (param1 > -4) {
            this.field_Fb = 105;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_107_0 = var3;
          stackIn_107_1 = new StringBuilder().append("cr.Q(");
          if (param0 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, boolean param2, int param3, int param4, boolean param5, int param6, boolean param7, boolean param8, int param9, boolean param10) {
        boolean stackIn_4_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        er[] var16;
        er var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24_int;
        String var24;
        cr var24_ref;
        int var25;
        int var26;
        String var27;
        String var24Lifetime1;
        String var24Lifetime2;
        var26 = Vertigo2.field_L ? 1 : 0;
        this.field_ob = this.field_wb + param4;
        this.field_C = this.field_N + param3;
        var12 = bi.field_d;
        var13 = bi.field_f;
        var14 = bi.field_i;
        var15 = bi.field_c;
        bi.c(this.field_ob, this.field_C, this.field_Fb + this.field_ob, this.field_C + this.field_db);
        param2 = param2 & this.field_lb;
        if (!this.field_ib) {
          param0 = this.field_pb;
          param7 = this.field_V;
          stackIn_4_0 = (this.field_xb != 0);
          param10 = stackIn_4_0;
        }
        var16 = this.field_Bb;
        var17 = this.field_Db;
        var18 = this.field_A;
        var19 = 0;
        var20 = 0;
        if (!param2) {
          if (0 <= this.field_D) {
            var18 = this.field_D;
          }
          if (this.field_I != null) {
            var17 = this.field_I;
          }
          if (this.field_gb != null) {
            var16 = this.field_gb;
          }
        }
        var21 = -98 % ((param6 + 17) / 32);
        if (param0) {
          if (this.field_W != null) {
            var17 = this.field_W;
          }
          if (-2147483648 != this.field_yb) {
            var20 = this.field_yb;
          }
          if (this.field_F != -2147483648) {
            var19 = this.field_F;
          }
          if (this.field_B >= 0) {
            var18 = this.field_B;
          }
          if (this.field_Q != null) {
            var16 = this.field_Q;
          }
        }
        if (param10) {
          if (this.field_cb != null) {
            var16 = this.field_cb;
          }
          if (this.field_Ab != null) {
            var17 = this.field_Ab;
          }
          if (0 <= this.field_H) {
            var18 = this.field_H;
          }
          if (-2147483648 != this.field_Gb) {
            var19 = this.field_Gb;
          }
          if (-2147483648 != this.field_bb) {
            var20 = this.field_bb;
          }
        }
        if (param7) {
          if (this.field_Cb != -2147483648) {
            var19 = this.field_Cb;
          }
          if (-2147483648 != this.field_Y) {
            var20 = this.field_Y;
          }
          if (0 <= this.field_K) {
            var18 = this.field_K;
          }
          if (null != this.field_T) {
            var16 = this.field_T;
          }
          if (this.field_mb != null) {
            var17 = this.field_mb;
          }
        }
        var22 = var19 + this.field_hb;
        var23 = this.field_rb + var20;
        if (this.field_jb) {
          bc.a(param9, param3, (byte) 102, var16, param1, param4);
        } else {
          bc.a(this.field_db, this.field_C, (byte) 82, var16, this.field_Fb, this.field_ob);
        }
        if (var17 != null) {
          var24_int = this.field_ob + var22;
          var25 = this.field_C + var23;
          if (this.field_O == 1) {
            var24_int = var24_int + (-var17.field_x + this.field_Fb) / 2;
          }
          if (this.field_ab == 1) {
            var25 = var25 + (this.field_db - var17.field_B) / 2;
          }
          if (this.field_O == 2) {
            var24_int = var24_int + (this.field_Fb - var17.field_x);
          }
          if (this.field_ab == 2) {
            var25 = var25 + (this.field_db - var17.field_B);
          }
          if (this.field_vb < 256) {
            var17.c(var24_int, var25, this.field_vb);
          } else {
            var17.e(var24_int, var25);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_S &&
          null != this.field_z) {
          var27 = this.field_S;
          var24 = var27;
          var24Lifetime1 = var27;
          var24Lifetime2 = var27;
          if (param5 &&
            this.field_J != null) {
            var24Lifetime2 = var27 + this.field_J;
          }
          if (this.field_z.c(var24Lifetime2) <= this.field_Fb - 2 * this.field_R &&
            var24Lifetime2.indexOf("<br>") < 0) {
            if (this.field_ab != 1) {
              if (this.field_ab == 2) {
                var23 = var23 + (this.field_db - this.field_z.field_M - this.field_z.field_z);
              }
            } else {
              var23 = var23 + (-this.field_z.field_M + (this.field_db - this.field_z.field_z)) / 2;
            }
            if (this.field_O == 0) {
              this.field_z.a(var24Lifetime2, this.field_R + (this.field_ob + var22), var23 + (this.field_C + this.field_z.field_z), var18, -1, this.field_U);
            } else {
              if (1 == this.field_O) {
                this.field_z.b(var24Lifetime2, var22 + this.field_ob - (-this.field_R - (-(2 * this.field_R) + this.field_Fb) / 2), this.field_z.field_z + var23 + this.field_C, var18, -1, this.field_U);
              } else {
                if (2 != this.field_O) {
                  this.field_z.a(var24Lifetime2, var22 + this.field_ob + this.field_R, var23 + this.field_C, -(2 * this.field_R) + this.field_Fb, this.field_db, var18, -1, this.field_U, this.field_O, this.field_ab, this.field_qb);
                } else {
                  this.field_z.c(var24Lifetime2, -(this.field_R * 2) + this.field_Fb + (this.field_ob + this.field_R) + var22, this.field_z.field_z + this.field_C + var23, var18, -1, this.field_U);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_z.a(var24Lifetime2, this.field_R + (this.field_ob + var22), this.field_C + var23, -(2 * this.field_R) + this.field_Fb, this.field_db, var18, -1, this.field_U, this.field_O, this.field_ab, this.field_qb);
          }
        }
        if (null != this.field_M) {
          var24_ref = (cr) (this.field_M.a((byte) 100));
          while (var24_ref != null) {
            var24_ref.a(param0, this.field_Fb, param2, var20 + this.field_C, var19 + this.field_ob, param5, -102, param7, this.field_nb, this.field_db, param10);
            var24_ref = (cr) (this.field_M.b(83));
          }
        }
        bi.g(var12, var13, var14, var15);
    }

    cr(long param0, cr param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void b(boolean param0, int param1) {
        this.a(false, bi.field_e, true, param1, 0, param0, 41, false, false, bi.field_j, false);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 71) {
          cr.b(-45, 118, -102, 29, 12);
        }
        this.field_L = 0;
        this.field_db = param2;
        this.field_wb = param4;
        this.field_kb = 0;
        this.field_N = param3;
        this.field_Eb = 0;
        this.field_Fb = param1;
        this.field_zb = 0;
    }

    cr(long param0, cr param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != -1) {
          String var6 = (String) null;
          cr.b((String) null, 22);
        }
        if (param3 >= ap.field_e &&
          ib.field_a >= param3) {
          param0 = pk.a((byte) -14, cj.field_D, param0, ua.field_e);
          param1 = pk.a((byte) -14, cj.field_D, param1, ua.field_e);
          ce.a(param3, (byte) -76, param0, param4, param1);
        }
    }

    public static void a(boolean param0) {
        field_eb = null;
        field_E = null;
        field_Z = null;
        if (param0) {
          field_Z = (String) null;
        }
        field_P = null;
    }

    final void a(int param0, boolean param1) {
        gi.field_o = !param1 ? true : false;
        sj.field_e = !param1 ? true : false;
        this.a(param0 ^ 1074455266, param0, 0, bi.field_j, true, bi.field_e);
    }

    final int b(int param0, int param1) {
        cr var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var4_intLifetime1;
        if (param0 != 2) {
          cr var7 = (cr) null;
          this.a((byte) -126, (cr) null, (cr) null, 126);
        }
        int var3 = 0;
        if (this.field_S != null &&
          null != this.field_z) {
          var4_int = this.field_z.a(this.field_S, param1);
          if (var4_int > var3) {
            var3 = var4_int;
          }
        }
        if (this.field_Db != null) {
          var4_intLifetime1 = this.field_Db.field_x;
          if (var3 < var4_intLifetime1) {
            var3 = var4_intLifetime1;
          }
        }
        if (this.field_M != null) {
          var4 = (cr) (this.field_M.a((byte) 100));
          while (var4 != null) {
            var5 = var4.field_Fb + var4.field_wb;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (cr) (this.field_M.b(param0 + 120));
          }
        }
        return var3;
    }

    final int j(int param0) {
        if (param0 != -21391) {
          cr var3 = (cr) null;
          this.a((cr) null, 10);
        }
        return this.b(param0 + 21393, 2147483647);
    }

    final static wp b(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        wp stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = param1;
          while (true) {
            if (var2_int <= var3) {
              stackIn_10_0 = bp.field_A;
              return stackIn_10_0;
            }
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_7_0 = null;
          return (wp) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("cr.M(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(cr param0, int param1) {
        try {
          if (null == this.field_M) {
            this.field_M = new nj();
          }
          if (param1 < 117) {
            this.field_lb = false;
          }
          this.field_M.a(param0, false);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "cr.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        boolean stackIn_35_1 = false;
        boolean stackIn_40_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        cr var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = Vertigo2.field_L ? 1 : 0;
        if (this.field_zb <= 0) {
          var7 = this.field_zb >> 2;
        } else {
          var7 = -(-this.field_zb >> 2);
        }
        this.field_zb = this.field_zb - var7;
        this.field_wb = this.field_wb + var7;
        if (0 >= this.field_L) {
          var7Lifetime1 = this.field_L >> 2;
        } else {
          var7Lifetime1 = -(-this.field_L >> 2);
        }
        this.field_N = this.field_N + var7Lifetime1;
        this.field_L = this.field_L - var7Lifetime1;
        if (this.field_Eb > 0) {
          var7Lifetime2 = -(-this.field_Eb >> 2);
        } else {
          var7Lifetime2 = this.field_Eb >> 2;
        }
        this.field_Eb = this.field_Eb - var7Lifetime2;
        if (param0 != 1074455266) {
          this.a(58, -12, 77, false);
        }
        this.field_Fb = this.field_Fb + var7Lifetime2;
        if (this.field_kb <= 0) {
          var7Lifetime3 = this.field_kb >> 2;
        } else {
          var7Lifetime3 = -(-this.field_kb >> 2);
        }
        this.field_kb = this.field_kb - var7Lifetime3;
        this.field_ob = this.field_wb + param2;
        this.field_db = this.field_db + var7Lifetime3;
        this.field_C = this.field_N + param1;
        param4 = param4 & this.field_lb;
        var8 = bi.field_d;
        var9 = bi.field_f;
        var10 = bi.field_i;
        var11 = bi.field_c;
        bi.c(this.field_ob, this.field_C, this.field_Fb + this.field_ob, this.field_C + this.field_db);
        var12 = 0;
        if (!sj.field_e &&
          param4 &&
          kf.field_c != 0 &&
          sd.field_N >= bi.field_d &&
          sd.field_N < bi.field_i &&
          no.field_e >= bi.field_f &&
          no.field_e < bi.field_c) {
          this.field_tb = kf.field_c;
          this.field_ub = -this.field_ob + sd.field_N;
          var12 = 1;
          this.field_xb = kf.field_c;
          this.field_fb = -this.field_C + no.field_e;
        } else {
          this.field_tb = 0;
          if (kf.field_c != 0) {
            this.field_xb = 0;
          }
        }
        if (q.field_v == 0) {
          this.field_xb = 0;
        }
        stackIn_35_1 = (!gi.field_o) && (bi.field_d <= ed.field_n) && (ed.field_n < bi.field_i) && (gb.field_d >= bi.field_f) && (bi.field_c > gb.field_d);
        this.field_G = stackIn_35_1;
        stackIn_40_1 = (this.field_G) && (q.field_v == this.field_xb) && (param4);
        this.field_pb = stackIn_40_1;
        if (this.field_M != null) {
          var13 = (cr) (this.field_M.c((byte) -12));
          while (var13 != null) {
            var13.a(1074455266, this.field_C, this.field_ob, this.field_db, param4, this.field_Fb);
            var13 = (cr) (this.field_M.b(false));
          }
        }
        if (var12 != 0) {
          sj.field_e = true;
        }
        if (this.field_G) {
          gi.field_o = true;
        }
        bi.g(var8, var9, var10, var11);
        if (this.field_xb != 0 &&
          this.field_X) {
          this.field_N = gb.field_d - this.field_fb - param1;
          this.field_wb = -this.field_ub + (ed.field_n - param2);
          if (this.field_wb < 0) {
            this.field_wb = 0;
          }
          if (this.field_wb > param5 - this.field_Fb) {
            this.field_wb = param5 - this.field_Fb;
          }
          if (0 > this.field_N) {
            this.field_N = 0;
          }
          if (param3 - this.field_db < this.field_N) {
            this.field_N = -this.field_db + param3;
          }
          this.field_L = 0;
          this.field_zb = 0;
          this.field_ob = param2 + this.field_wb;
          this.field_C = this.field_N + param1;
        }
    }

    final void i(int param0) {
        cr var4 = null;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (null != this.field_M) {
          var4 = (cr) (this.field_M.c((byte) -99));
          while (var4 != null) {
            var4.field_ib = true;
            var4.i(-2147483648);
            var4 = (cr) (this.field_M.b(false));
          }
        }
        if (param0 != -2147483648) {
          field_P = (int[]) null;
        }
    }

    final static er a(int param0, r param1, byte param2, int param3) {
        RuntimeException var4 = null;
        r var5 = null;
        Object stackIn_4_0 = null;
        er stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -85) {
            var5 = (r) null;
            cr.a(0, (r) null, (byte) 109, 59);
          }
          if (hq.a(124, param3, param0, param1)) {
            stackIn_6_0 = ej.a((byte) 89);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (er) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("cr.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected cr() {
        this.field_H = -1;
        this.field_B = -1;
        this.field_sb = false;
        this.field_U = 256;
        this.field_Cb = -2147483648;
        this.field_bb = -2147483648;
        this.field_lb = true;
        this.field_F = -2147483648;
        this.field_nb = false;
        this.field_Gb = -2147483648;
        this.field_vb = 256;
        this.field_K = -1;
        this.field_D = -1;
        this.field_yb = -2147483648;
        this.field_Y = -2147483648;
    }

    cr(long param0, cr param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_H = -1;
        this.field_B = -1;
        this.field_sb = false;
        this.field_U = 256;
        this.field_Cb = -2147483648;
        this.field_bb = -2147483648;
        this.field_lb = true;
        this.field_F = -2147483648;
        this.field_nb = false;
        this.field_Gb = -2147483648;
        this.field_vb = 256;
        this.field_K = -1;
        this.field_D = -1;
        this.field_yb = -2147483648;
        this.field_Y = -2147483648;
        try {
          this.field_wb = param2;
          this.field_k = param0;
          this.field_N = param3;
          this.field_Fb = param4;
          this.field_db = param5;
          this.a(param1, -44);
          if (param6 != null) {
            this.field_S = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("cr.<init>(").append(param0).append(',');
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
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_Z = "Not yet achieved";
        field_eb = new boolean[112];
    }
}
