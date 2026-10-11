/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kc extends to {
    int field_I;
    int field_z;
    int field_x;
    private int field_O;
    qb field_R;
    qb[] field_hb;
    private int field_F;
    qb[] field_v;
    private boolean field_Q;
    int field_gb;
    int field_sb;
    int field_V;
    qb field_w;
    int field_eb;
    qb[] field_Ab;
    int field_u;
    private boolean field_E;
    private int field_qb;
    int field_ib;
    int field_t;
    int field_B;
    qb field_vb;
    qb[] field_K;
    boolean field_C;
    private boolean field_pb;
    private int field_fb;
    int field_J;
    boolean field_yb;
    static qb[] field_kb;
    int field_X;
    int field_ob;
    int field_P;
    vn field_G;
    private int field_mb;
    static int[] field_N;
    int field_U;
    int field_T;
    String field_L;
    int field_bb;
    private int field_tb;
    int field_Y;
    qb field_lb;
    int field_zb;
    boolean field_A;
    dj field_Z;
    static String field_M;
    boolean field_ub;
    private int field_y;
    int field_cb;
    qb field_W;
    qb[] field_xb;
    String field_rb;
    int field_wb;
    int field_S;
    static int field_D;
    private int field_jb;
    int field_nb;
    int field_db;
    boolean field_H;
    boolean field_ab;

    private final void a(boolean param0, boolean param1, boolean param2, int param3, boolean param4, int param5, int param6, byte param7, boolean param8, boolean param9, int param10) {
        boolean stackIn_4_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        qb[] var16;
        qb var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24_int;
        String var24;
        kc var24_ref;
        int var25;
        int var26;
        String var27;
        String var24Lifetime1;
        String var24Lifetime2;
        var26 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_nb = param10 + this.field_db;
        this.field_V = this.field_T + param6;
        var12 = de.field_i;
        var13 = de.field_c;
        var14 = de.field_h;
        var15 = de.field_k;
        de.a(this.field_V, this.field_nb, this.field_x + this.field_V, this.field_nb + this.field_I);
        param2 = param2 & this.field_ub;
        if (!this.field_E) {
          param8 = this.field_C;
          param1 = this.field_ab;
          stackIn_4_0 = (this.field_P != 0);
          param0 = stackIn_4_0;
        }
        var16 = this.field_v;
        var17 = this.field_W;
        var18 = this.field_ob;
        var19 = 0;
        if (!param2) {
          if (this.field_K != null) {
            var16 = this.field_K;
          }
          if (this.field_sb >= 0) {
            var18 = this.field_sb;
          }
          if (null != this.field_R) {
            var17 = this.field_R;
          }
        }
        var20 = 0;
        if (param8) {
          if (this.field_lb != null) {
            var17 = this.field_lb;
          }
          if (this.field_F != -2147483648) {
            var20 = this.field_F;
          }
          if (this.field_mb != -2147483648) {
            var19 = this.field_mb;
          }
          if (this.field_Ab != null) {
            var16 = this.field_Ab;
          }
          if (this.field_eb >= 0) {
            var18 = this.field_eb;
          }
        }
        if (param0) {
          if (this.field_wb != -2147483648) {
            var20 = this.field_wb;
          }
          if (this.field_xb != null) {
            var16 = this.field_xb;
          }
          if (this.field_Y != -2147483648) {
            var19 = this.field_Y;
          }
          if (this.field_J >= 0) {
            var18 = this.field_J;
          }
          if (this.field_vb != null) {
            var17 = this.field_vb;
          }
        }
        if (param1) {
          if (this.field_S != -2147483648) {
            var20 = this.field_S;
          }
          if (null != this.field_hb) {
            var16 = this.field_hb;
          }
          if (this.field_zb >= 0) {
            var18 = this.field_zb;
          }
          if (null != this.field_w) {
            var17 = this.field_w;
          }
          if (this.field_ib != -2147483648) {
            var19 = this.field_ib;
          }
        }
        var21 = this.field_qb + var19;
        var22 = this.field_tb + var20;
        if (!this.field_yb) {
          gl.a(this.field_I, this.field_V, -27327, this.field_x, var16, this.field_nb);
        } else {
          gl.a(param3, param6, -27327, param5, var16, param10);
        }
        var23 = 32 / ((25 - param7) / 47);
        if (var17 != null) {
          var24_int = var21 + this.field_V;
          var25 = var22 + this.field_nb;
          if (1 == this.field_X) {
            var24_int = var24_int + (-var17.field_n + this.field_x) / 2;
          }
          if (this.field_gb == 1) {
            var25 = var25 + (-var17.field_w + this.field_I) / 2;
          }
          if (this.field_X == 2) {
            var24_int = var24_int + (this.field_x - var17.field_n);
          }
          if (2 == this.field_gb) {
            var25 = var25 + (-var17.field_w + this.field_I);
          }
          if (this.field_O >= 256) {
            var17.c(var24_int, var25);
          } else {
            var17.c(var24_int, var25, this.field_O);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_rb &&
          this.field_Z != null) {
          var27 = this.field_rb;
          var24 = var27;
          var24Lifetime1 = var27;
          var24Lifetime2 = var27;
          if (param4 &&
            null != this.field_L) {
            var24Lifetime2 = var27 + this.field_L;
          }
          if (this.field_Z.b(var24Lifetime2) <= this.field_x - this.field_t * 2 &&
            var24Lifetime2.indexOf("<br>") < 0) {
            if (this.field_gb != 1) {
              if (this.field_gb == 2) {
                var22 = var22 + (this.field_I - (this.field_Z.field_m + this.field_Z.field_C));
              }
            } else {
              var22 = var22 + (-this.field_Z.field_m + this.field_I - this.field_Z.field_C) / 2;
            }
            if (this.field_X == 0) {
              this.field_Z.a(var24Lifetime2, var21 + (this.field_t + this.field_V), this.field_Z.field_C + (var22 + this.field_nb), var18, -1, this.field_u);
            } else {
              if (1 == this.field_X) {
                this.field_Z.b(var24Lifetime2, (this.field_x - 2 * this.field_t) / 2 + (this.field_t + this.field_V + var21), var22 + this.field_nb + this.field_Z.field_C, var18, -1, this.field_u);
              } else {
                if (2 == this.field_X) {
                  this.field_Z.c(var24Lifetime2, this.field_x - (this.field_t * 2 - this.field_t - this.field_V - var21), this.field_Z.field_C + var22 + this.field_nb, var18, -1, this.field_u);
                } else {
                  this.field_Z.a(var24Lifetime2, this.field_t + (this.field_V + var21), this.field_nb + var22, this.field_x - this.field_t * 2, this.field_I, var18, -1, this.field_u, this.field_X, this.field_gb, this.field_z);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_Z.a(var24Lifetime2, this.field_t + (this.field_V + var21), var22 + this.field_nb, this.field_x - 2 * this.field_t, this.field_I, var18, -1, this.field_u, this.field_X, this.field_gb, this.field_z);
          }
        }
        if (this.field_G != null) {
          var24_ref = (kc) (this.field_G.b(12623));
          while (var24_ref != null) {
            var24_ref.a(param0, param1, param2, this.field_I, param4, this.field_x, this.field_V + var19, (byte) 84, param8, this.field_Q, this.field_nb + var20);
            var24_ref = (kc) (this.field_G.a(0));
          }
        }
        de.h(var12, var13, var14, var15);
    }

    final void b(boolean param0, byte param1) {
        fd.field_i = !param0 ? true : false;
        ui.field_v = !param0 ? true : false;
        if (param1 < 28) {
          this.field_xb = (qb[]) null;
        }
        this.a(de.field_e, 0, true, -1, de.field_j, 0);
    }

    final int a(int param0, int param1) {
        kc var5 = null;
        int var6 = 0;
        int var5_int = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = -124 % ((param1 + 82) / 32);
        int var4 = 0;
        int var5_intLifetime1;
        if (this.field_rb != null &&
          null != this.field_Z) {
          var5_int = this.field_Z.c(this.field_rb, param0);
          if (var5_int > var4) {
            var4 = var5_int;
          }
        }
        if (null != this.field_W) {
          var5_intLifetime1 = this.field_W.field_n;
          if (var4 < var5_intLifetime1) {
            var4 = var5_intLifetime1;
          }
        }
        if (null != this.field_G) {
          var5 = (kc) (this.field_G.b(12623));
          while (var5 != null) {
            var6 = var5.field_x + var5.field_T;
            if (var6 > var4) {
              var4 = var6;
            }
            var5 = (kc) (this.field_G.a(0));
          }
        }
        return var4;
    }

    final void a(kc param0, byte param1) {
        boolean stackIn_93_1 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 < 113) {
            this.field_ub = true;
          }
          if (param0 != null) {
            if (null != param0.field_R) {
              this.field_R = param0.field_R;
            }
            if (!param0.field_ub) {
              this.field_ub = param0.field_ub;
            }
            if (param0.field_J >= 0) {
              this.field_J = param0.field_J;
            }
            if (null != param0.field_L) {
              this.field_L = param0.field_L;
            }
            if (param0.field_ob != 0) {
              this.field_ob = param0.field_ob;
            }
            if (param0.field_lb != null) {
              this.field_lb = param0.field_lb;
            }
            if (param0.field_E) {
              this.field_E = param0.field_E;
            }
            if (param0.field_Z != null) {
              this.field_Z = param0.field_Z;
            }
            if (param0.field_yb) {
              this.field_yb = param0.field_yb;
            }
            if (param0.field_sb >= 0) {
              this.field_sb = param0.field_sb;
            }
            if (null != param0.field_w) {
              this.field_w = param0.field_w;
            }
            if (param0.field_u != 256) {
              this.field_u = param0.field_u;
            }
            if (null != param0.field_v) {
              this.field_v = param0.field_v;
            }
            if (param0.field_z != 0) {
              this.field_z = param0.field_z;
            }
            if (param0.field_ab) {
              this.field_ab = param0.field_ab;
            }
            if (param0.field_eb >= 0) {
              this.field_eb = param0.field_eb;
            }
            if (param0.field_pb) {
              this.field_pb = param0.field_pb;
            }
            if (null != param0.field_Ab) {
              this.field_Ab = param0.field_Ab;
            }
            if (param0.field_vb != null) {
              this.field_vb = param0.field_vb;
            }
            if (null != param0.field_K) {
              this.field_K = param0.field_K;
            }
            if (param0.field_rb != null) {
              this.field_rb = param0.field_rb;
            }
            if (null != param0.field_hb) {
              this.field_hb = param0.field_hb;
            }
            if (param0.field_W != null) {
              this.field_W = param0.field_W;
            }
            if (param0.field_xb != null) {
              this.field_xb = param0.field_xb;
            }
            if (param0.field_zb >= 0) {
              this.field_zb = param0.field_zb;
            }
            if (param0.field_t != 0) {
              this.field_t = param0.field_t;
            }
            if (param0.field_mb != -2147483648) {
              this.field_mb = param0.field_mb;
            }
            if (param0.field_gb != 0) {
              this.field_gb = param0.field_gb;
            }
            if (param0.field_F != -2147483648) {
              this.field_F = param0.field_F;
            }
            if (-2147483648 != param0.field_ib) {
              this.field_ib = param0.field_ib;
            }
            if (param0.field_qb != 0) {
              this.field_qb = param0.field_qb;
            }
            if (param0.field_S != -2147483648) {
              this.field_S = param0.field_S;
            }
            if (0 != param0.field_tb) {
              this.field_tb = param0.field_tb;
            }
            if (param0.field_Y != -2147483648) {
              this.field_Y = param0.field_Y;
            }
            stackIn_93_1 = (this.field_pb) && (param0.field_Q);
            this.field_Q = stackIn_93_1;
            if (param0.field_X != 0) {
              this.field_X = param0.field_X;
            }
            if (param0.field_wb != -2147483648) {
              this.field_wb = param0.field_wb;
            }
            if (!param0.field_H) {
              return;
            }
            this.field_H = param0.field_H;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_104_0 = var3;
          stackIn_104_1 = new StringBuilder().append("kc.FA(");
          if (param0 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, kc param1, kc param2, int param3) {
        kc var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 == null) {
            param2.field_db = 0;
            param2.field_bb = 0;
          } else {
            param2.field_db = param1.field_I + (param1.field_db + param3);
            param2.field_bb = param1.field_bb + param1.field_B;
          }
          if (param0 <= 104) {
            var6 = (kc) null;
            this.a((kc) null, -87);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kc.IA(").append(param0).append(',');
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
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        this.field_I = param3;
        this.field_db = param2;
        this.field_bb = 0;
        this.field_T = param1;
        this.field_x = param0;
        if (param4 == -120) {
          this.field_jb = 0;
          this.field_fb = 0;
          this.field_B = 0;
          return;
        }
    }

    kc(long param0, kc param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void e(byte param0) {
        kc var4 = null;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 20) {
          this.e((byte) -84);
        }
        if (null != this.field_G) {
          var4 = (kc) (this.field_G.a(true));
          while (var4 != null) {
            var4.field_E = true;
            var4.e((byte) 20);
            var4 = (kc) (this.field_G.b((byte) 120));
          }
        }
    }

    final void a(kc param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_G == null) {
            this.field_G = new vn();
          }
          this.field_G.b(param0, -1);
          if (param1 < 6) {
            this.field_z = -117;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("kc.AA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_M = null;
        field_kb = null;
        if (param0 != -21224) {
          kc.d(53);
        }
        field_N = null;
    }

    final void a(boolean param0, int param1, boolean param2, int param3) {
        kc var10_ref_kc = null;
        int var10 = 0;
        int var9 = 0;
        int var11 = ArcanistsMulti.field_G ? 1 : 0;
        int var5 = -this.field_db;
        int var6 = -this.field_bb + var5;
        int var7 = this.field_I;
        int var8 = var7 + this.field_B;
        int var9Lifetime1;
        if (!param2) {
          var9 = 0;
          var10_ref_kc = (kc) (this.field_G.b(12623));
          while (var10_ref_kc != null) {
            var10_ref_kc.field_bb = var9 - var10_ref_kc.field_db;
            var9 = var9 + (var10_ref_kc.field_B + (var10_ref_kc.field_I + param1));
            var10_ref_kc = (kc) (this.field_G.a(0));
          }
          var8 = var9 - param1;
        }
        if (param0) {
          var9Lifetime1 = -param3 + var8;
          if (var6 > var9Lifetime1) {
            var6 = var9Lifetime1;
          }
          if (var6 < 0) {
            var6 = 0;
          }
          var10 = -param3 + var7;
          if (var10 < var5) {
            var5 = var10;
          }
          if (var5 < 0) {
            var5 = 0;
          }
          this.field_B = var8 - var7;
          this.field_I = var7;
          this.field_bb = var5 - var6;
          this.field_db = -var5;
          return;
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        boolean stackIn_30_1 = false;
        boolean stackIn_38_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        kc var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 < this.field_fb) {
          var7 = -(-this.field_fb >> 2);
        } else {
          var7 = this.field_fb >> 2;
        }
        this.field_fb = this.field_fb - var7;
        this.field_T = this.field_T + var7;
        if (this.field_bb <= 0) {
          var7Lifetime1 = this.field_bb >> 2;
        } else {
          var7Lifetime1 = -(-this.field_bb >> 2);
        }
        this.field_bb = this.field_bb - var7Lifetime1;
        this.field_db = this.field_db + var7Lifetime1;
        if (this.field_jb <= 0) {
          var7Lifetime2 = this.field_jb >> 2;
        } else {
          var7Lifetime2 = -(-this.field_jb >> 2);
        }
        this.field_jb = this.field_jb - var7Lifetime2;
        this.field_x = this.field_x + var7Lifetime2;
        if (this.field_B > 0) {
          var7Lifetime3 = -(-this.field_B >> 2);
        } else {
          var7Lifetime3 = this.field_B >> 2;
        }
        this.field_B = this.field_B - var7Lifetime3;
        this.field_V = this.field_T + param5;
        this.field_I = this.field_I + var7Lifetime3;
        this.field_nb = this.field_db + param1;
        param2 = param2 & this.field_ub;
        var8 = de.field_i;
        var9 = de.field_c;
        var10 = de.field_h;
        var11 = de.field_k;
        de.a(this.field_V, this.field_nb, this.field_V + this.field_x, this.field_nb + this.field_I);
        var12 = 0;
        if (!fd.field_i &&
          param2 &&
          re.field_r != 0 &&
          de.field_i <= pb.field_h &&
          de.field_h > pb.field_h &&
          de.field_c <= ja.field_s &&
          ja.field_s < de.field_k) {
          var12 = 1;
          this.field_cb = -this.field_V + pb.field_h;
          this.field_P = re.field_r;
          this.field_y = -this.field_nb + ja.field_s;
          this.field_U = re.field_r;
        } else {
          if (re.field_r != 0) {
            this.field_P = 0;
          }
          this.field_U = 0;
        }
        stackIn_30_1 = (!ui.field_v) && (an.field_g >= de.field_i) && (de.field_h > an.field_g) && (me.field_I >= de.field_c) && (de.field_k > me.field_I);
        this.field_A = stackIn_30_1;
        if (wk.field_m == 0) {
          this.field_P = 0;
        }
        stackIn_38_1 = (this.field_A) && (this.field_P == wk.field_m) && (param2);
        this.field_C = stackIn_38_1;
        if (this.field_G != null) {
          var13 = (kc) (this.field_G.a(true));
          while (var13 != null) {
            var13.a(this.field_x, this.field_nb, param2, -1, this.field_I, this.field_V);
            var13 = (kc) (this.field_G.b((byte) 31));
          }
        }
        if (this.field_A) {
          ui.field_v = true;
        }
        if (var12 != 0) {
          fd.field_i = true;
        }
        de.h(var8, var9, var10, var11);
        if (~this.field_P != param3 &&
          this.field_H) {
          this.field_db = me.field_I + (-this.field_y - param1);
          this.field_T = -param5 + (-this.field_cb + an.field_g);
          if (this.field_T < 0) {
            this.field_T = 0;
          }
          if (this.field_T > param0 - this.field_x) {
            this.field_T = param0 - this.field_x;
          }
          if (this.field_db < 0) {
            this.field_db = 0;
          }
          this.field_V = this.field_T + param5;
          this.field_fb = 0;
          if (param4 - this.field_I < this.field_db) {
            this.field_db = param4 - this.field_I;
          }
          this.field_bb = 0;
          this.field_nb = param1 + this.field_db;
        }
    }

    final int c(int param0) {
        if (param0 != -25921) {
          this.a(97, -108, -2, -111, (byte) -5);
        }
        return this.a(2147483647, -119);
    }

    kc(long param0, kc param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void a(boolean param0, boolean param1) {
        this.a(false, false, param1, de.field_j, param0, de.field_e, 0, (byte) -78, false, false, 0);
    }

    protected kc() {
        this.field_O = 256;
        this.field_eb = -1;
        this.field_u = 256;
        this.field_mb = -2147483648;
        this.field_Q = false;
        this.field_Y = -2147483648;
        this.field_F = -2147483648;
        this.field_ib = -2147483648;
        this.field_J = -1;
        this.field_S = -2147483648;
        this.field_pb = false;
        this.field_ub = true;
        this.field_wb = -2147483648;
        this.field_zb = -1;
        this.field_sb = -1;
    }

    kc(long param0, kc param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_O = 256;
        this.field_eb = -1;
        this.field_u = 256;
        this.field_mb = -2147483648;
        this.field_Q = false;
        this.field_Y = -2147483648;
        this.field_F = -2147483648;
        this.field_ib = -2147483648;
        this.field_J = -1;
        this.field_S = -2147483648;
        this.field_pb = false;
        this.field_ub = true;
        this.field_wb = -2147483648;
        this.field_zb = -1;
        this.field_sb = -1;
        try {
          this.field_T = param2;
          this.field_I = param5;
          this.field_x = param4;
          this.field_e = param0;
          this.field_db = param3;
          this.a(param1, (byte) 124);
          if (param6 != null) {
            this.field_rb = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("kc.<init>(").append(param0).append(',');
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
        field_N = new int[8192];
        field_D = 0;
        field_M = "You must be a member to use familiars.";
    }
}
