/*
 * Decompiled by CFR-JS 0.4.0.
 */
class le extends cf {
    private boolean field_C;
    String field_fb;
    int field_W;
    boolean field_B;
    static int field_D;
    int field_G;
    private int field_M;
    int field_sb;
    static bd field_xb;
    static ac field_ub;
    static int field_gb;
    private int field_O;
    int field_N;
    private bd[] field_V;
    private int field_U;
    private int field_ob;
    private int field_x;
    private bd field_P;
    int field_J;
    private bd field_cb;
    int field_L;
    int field_Q;
    bd field_pb;
    private int field_hb;
    vm field_ab;
    private bd[] field_Ab;
    static int field_eb;
    static int field_bb;
    private int field_w;
    int field_z;
    int field_zb;
    boolean field_S;
    private int field_E;
    boolean field_jb;
    private int field_wb;
    private String field_F;
    private int field_Z;
    private int field_kb;
    int field_X;
    bd[] field_Bb;
    boolean field_Db;
    int field_mb;
    vl field_I;
    boolean field_Eb;
    private boolean field_y;
    private int field_rb;
    private int field_db;
    private bd field_vb;
    private bd[] field_yb;
    private boolean field_Cb;
    private int field_H;
    private int field_A;
    bd[] field_nb;
    int field_R;
    int field_K;
    int field_qb;
    int field_ib;
    int field_T;
    int field_v;
    bd field_Y;
    private boolean field_lb;
    int field_tb;

    final void a(int param0, boolean param1) {
        int var3 = 44 / ((29 - param0) / 41);
        this.a(false, 0, param1, (byte) 82, true, si.field_e, false, 0, false, false, si.field_k);
    }

    final static void c(byte param0) {
        if (null != ag.field_t) {
          ag.field_t.a(-98);
          ag.field_t = null;
        }
        if (param0 < 38) {
          field_ub = (ac) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_X = 0;
        this.field_z = 0;
        int var6 = -67 / ((50 - param3) / 45);
        this.field_ib = 0;
        this.field_tb = param4;
        this.field_qb = param1;
        this.field_N = 0;
        this.field_zb = param0;
        this.field_sb = param2;
    }

    private final void a(int param0, int param1, int param2, boolean param3, byte param4, int param5) {
        boolean stackIn_36_1 = false;
        boolean stackIn_41_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        le var13;
        int var14;
        le var15;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_ib > 0) {
          var7 = -(-this.field_ib >> 2);
        } else {
          var7 = this.field_ib >> 2;
        }
        this.field_ib = this.field_ib - var7;
        this.field_tb = this.field_tb + var7;
        if (0 < this.field_z) {
          var7Lifetime1 = -(-this.field_z >> 2);
        } else {
          var7Lifetime1 = this.field_z >> 2;
        }
        this.field_z = this.field_z - var7Lifetime1;
        this.field_zb = this.field_zb + var7Lifetime1;
        if (this.field_X <= 0) {
          var7Lifetime2 = this.field_X >> 2;
        } else {
          var7Lifetime2 = -(-this.field_X >> 2);
        }
        this.field_qb = this.field_qb + var7Lifetime2;
        this.field_X = this.field_X - var7Lifetime2;
        if (param4 != 48) {
          var15 = (le) null;
          this.a((le) null, 87);
        }
        if (this.field_N > 0) {
          var7Lifetime3 = -(-this.field_N >> 2);
        } else {
          var7Lifetime3 = this.field_N >> 2;
        }
        this.field_mb = this.field_zb + param2;
        param3 = param3 & this.field_jb;
        this.field_K = this.field_tb + param0;
        this.field_sb = this.field_sb + var7Lifetime3;
        this.field_N = this.field_N - var7Lifetime3;
        var8 = si.field_b;
        var9 = si.field_j;
        var10 = si.field_l;
        var11 = si.field_a;
        si.f(this.field_K, this.field_mb, this.field_qb + this.field_K, this.field_sb + this.field_mb);
        var12 = 0;
        if (!ob.field_n &&
          param3 &&
          pf.field_o != 0 &&
          si.field_b <= ec.field_a &&
          si.field_l > ec.field_a &&
          si.field_j <= rc.field_b &&
          rc.field_b < si.field_a) {
          var12 = 1;
          this.field_E = -this.field_mb + rc.field_b;
          this.field_wb = ec.field_a - this.field_K;
          this.field_W = pf.field_o;
          this.field_Q = pf.field_o;
        } else {
          this.field_Q = 0;
          if (pf.field_o != 0) {
            this.field_W = 0;
          }
        }
        if (0 == ig.field_L) {
          this.field_W = 0;
        }
        stackIn_36_1 = (!wc.field_u) && (j.field_c >= si.field_b) && (si.field_l > j.field_c) && (si.field_j <= rb.field_m) && (rb.field_m < si.field_a);
        this.field_Eb = stackIn_36_1;
        stackIn_41_1 = (this.field_Eb) && (ig.field_L == this.field_W) && (param3);
        this.field_S = stackIn_41_1;
        if (this.field_I != null) {
          var13 = (le) (this.field_I.b((byte) 117));
          while (var13 != null) {
            var13.a(this.field_K, this.field_sb, this.field_mb, param3, (byte) 48, this.field_qb);
            var13 = (le) (this.field_I.a((byte) 110));
          }
        }
        if (this.field_Eb) {
          wc.field_u = true;
        }
        if (var12 != 0) {
          ob.field_n = true;
        }
        si.d(var8, var9, var10, var11);
        if (this.field_W != 0 &&
          this.field_Db) {
          this.field_zb = -param2 - this.field_E + rb.field_m;
          this.field_tb = j.field_c + (-this.field_wb - param0);
          if (this.field_tb < 0) {
            this.field_tb = 0;
          }
          if (this.field_zb < 0) {
            this.field_zb = 0;
          }
          if (this.field_tb > -this.field_qb + param5) {
            this.field_tb = -this.field_qb + param5;
          }
          this.field_K = param0 + this.field_tb;
          this.field_z = 0;
          this.field_ib = 0;
          if (this.field_zb > -this.field_sb + param1) {
            this.field_zb = param1 - this.field_sb;
          }
          this.field_mb = this.field_zb + param2;
        }
    }

    private final void a(boolean param0, int param1, boolean param2, byte param3, boolean param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10) {
        boolean stackIn_4_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        bd[] var17;
        bd var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24_int;
        String var24;
        le var24_ref;
        int var25;
        int var26;
        String var27;
        String var24Lifetime1;
        String var24Lifetime2;
        var26 = HostileSpawn.field_I ? 1 : 0;
        this.field_mb = param1 + this.field_zb;
        this.field_K = param7 + this.field_tb;
        var14 = -49 % ((param3 + 26) / 60);
        var12 = si.field_b;
        var13 = si.field_j;
        var15 = si.field_l;
        var16 = si.field_a;
        si.f(this.field_K, this.field_mb, this.field_K + this.field_qb, this.field_mb + this.field_sb);
        if (!this.field_y) {
          param0 = this.field_S;
          stackIn_4_0 = (this.field_W != 0);
          param9 = stackIn_4_0;
          param8 = this.field_Cb;
        }
        param4 = param4 & this.field_jb;
        var17 = this.field_nb;
        var18 = this.field_Y;
        var19 = this.field_T;
        var20 = 0;
        var21 = 0;
        if (!param4) {
          if (null != this.field_yb) {
            var17 = this.field_yb;
          }
          if (null != this.field_vb) {
            var18 = this.field_vb;
          }
          if (0 <= this.field_H) {
            var19 = this.field_H;
          }
        }
        if (param0) {
          if (this.field_O != -2147483648) {
            var20 = this.field_O;
          }
          if (this.field_Z != -2147483648) {
            var21 = this.field_Z;
          }
          if (this.field_pb != null) {
            var18 = this.field_pb;
          }
          if (null != this.field_Bb) {
            var17 = this.field_Bb;
          }
          if (this.field_v >= 0) {
            var19 = this.field_v;
          }
        }
        if (param9) {
          if (this.field_x != -2147483648) {
            var21 = this.field_x;
          }
          if (this.field_A >= 0) {
            var19 = this.field_A;
          }
          if (this.field_kb != -2147483648) {
            var20 = this.field_kb;
          }
          if (null != this.field_cb) {
            var18 = this.field_cb;
          }
          if (this.field_Ab != null) {
            var17 = this.field_Ab;
          }
        }
        if (param8) {
          if (this.field_V != null) {
            var17 = this.field_V;
          }
          if (null != this.field_P) {
            var18 = this.field_P;
          }
          if (this.field_hb != -2147483648) {
            var20 = this.field_hb;
          }
          if (this.field_M != -2147483648) {
            var21 = this.field_M;
          }
          if (this.field_w >= 0) {
            var19 = this.field_w;
          }
        }
        var22 = var20 + this.field_J;
        var23 = var21 + this.field_ob;
        if (!this.field_B) {
          hm.a(this.field_qb, var17, false, this.field_sb, this.field_mb, this.field_K);
        } else {
          hm.a(param5, var17, false, param10, param1, param7);
        }
        if (var18 != null) {
          var24_int = var22 + this.field_K;
          if (this.field_U == 1) {
            var24_int = var24_int + (this.field_qb - var18.field_u) / 2;
          }
          var25 = var23 + this.field_mb;
          if (this.field_G == 1) {
            var25 = var25 + (this.field_sb - var18.field_r) / 2;
          }
          if (this.field_U == 2) {
            var24_int = var24_int + (this.field_qb - var18.field_u);
          }
          if (this.field_G == 2) {
            var25 = var25 + (-var18.field_r + this.field_sb);
          }
          if (this.field_db < 256) {
            var18.b(var24_int, var25, this.field_db);
          } else {
            var18.e(var24_int, var25);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_fb != null &&
          this.field_ab != null) {
          var27 = this.field_fb;
          var24 = var27;
          var24Lifetime1 = var27;
          var24Lifetime2 = var27;
          if (param2 &&
            this.field_F != null) {
            var24Lifetime2 = var27 + this.field_F;
          }
          if (this.field_ab.a(var24Lifetime2) <= -(2 * this.field_L) + this.field_qb &&
            0 > var24Lifetime2.indexOf("<br>")) {
            if (this.field_G == 1) {
              var23 = var23 + (-this.field_ab.field_y + (this.field_sb - this.field_ab.field_F)) / 2;
            } else {
              if (this.field_G == 2) {
                var23 = var23 + (-this.field_ab.field_y + this.field_sb - this.field_ab.field_F);
              }
            }
            if (0 == this.field_U) {
              this.field_ab.b(var24Lifetime2, var22 + this.field_K + this.field_L, this.field_ab.field_y + this.field_mb + var23, var19, -1, this.field_rb);
            } else {
              if (this.field_U == 1) {
                this.field_ab.a(var24Lifetime2, (this.field_qb - this.field_L * 2) / 2 + var22 + (this.field_K + this.field_L), var23 + this.field_mb + this.field_ab.field_y, var19, -1, this.field_rb);
              } else {
                if (this.field_U == 2) {
                  this.field_ab.c(var24Lifetime2, this.field_K - (-this.field_L - var22 + this.field_L * 2) + this.field_qb, this.field_mb + (var23 + this.field_ab.field_y), var19, -1, this.field_rb);
                } else {
                  this.field_ab.a(var24Lifetime2, var22 + (this.field_L + this.field_K), var23 + this.field_mb, this.field_qb - this.field_L * 2, this.field_sb, var19, -1, this.field_rb, this.field_U, this.field_G, this.field_R);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_ab.a(var24Lifetime2, this.field_K + this.field_L + var22, this.field_mb + var23, this.field_qb - 2 * this.field_L, this.field_sb, var19, -1, this.field_rb, this.field_U, this.field_G, this.field_R);
          }
        }
        if (this.field_I != null) {
          var24_ref = (le) (this.field_I.g(-24));
          while (var24_ref != null) {
            var24_ref.a(param0, var21 + this.field_mb, param2, (byte) -88, param4, this.field_qb, this.field_lb, this.field_K + var20, param8, param9, this.field_sb);
            var24_ref = (le) (this.field_I.a(12684));
          }
        }
        si.d(var12, var13, var15, var16);
    }

    public static void e(int param0) {
        field_xb = null;
        field_ub = null;
        if (param0 != -3354) {
          field_gb = 4;
        }
    }

    final void a(boolean param0, le param1) {
        try {
          if (this.field_I == null) {
            this.field_I = new vl();
          }
          if (param0) {
            this.a(true, false);
          }
          this.field_I.a(param1, 92);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "le.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(le param0, int param1) {
        boolean stackIn_68_1 = false;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        le var4 = null;
        try {
          if (param0 != null) {
            if (null != param0.field_fb) {
              this.field_fb = param0.field_fb;
            }
            if (param0.field_yb != null) {
              this.field_yb = param0.field_yb;
            }
            if (param0.field_B) {
              this.field_B = param0.field_B;
            }
            if (null != param0.field_cb) {
              this.field_cb = param0.field_cb;
            }
            if (null != param0.field_Ab) {
              this.field_Ab = param0.field_Ab;
            }
            if (param0.field_H >= 0) {
              this.field_H = param0.field_H;
            }
            if (param0.field_L != 0) {
              this.field_L = param0.field_L;
            }
            if (null != param0.field_ab) {
              this.field_ab = param0.field_ab;
            }
            if (null != param0.field_pb) {
              this.field_pb = param0.field_pb;
            }
            if (param0.field_F != null) {
              this.field_F = param0.field_F;
            }
            if (param0.field_A >= 0) {
              this.field_A = param0.field_A;
            }
            if (null != param0.field_nb) {
              this.field_nb = param0.field_nb;
            }
            if (param0.field_V != null) {
              this.field_V = param0.field_V;
            }
            if (param0.field_C) {
              this.field_C = param0.field_C;
            }
            if (param0.field_Cb) {
              this.field_Cb = param0.field_Cb;
            }
            if (null != param0.field_Bb) {
              this.field_Bb = param0.field_Bb;
            }
            if (null != param0.field_vb) {
              this.field_vb = param0.field_vb;
            }
            if (param0.field_T != 0) {
              this.field_T = param0.field_T;
            }
            if (param0.field_R != 0) {
              this.field_R = param0.field_R;
            }
            if (0 <= param0.field_w) {
              this.field_w = param0.field_w;
            }
            if (param0.field_y) {
              this.field_y = param0.field_y;
            }
            if (!param0.field_jb) {
              this.field_jb = param0.field_jb;
            }
            if (param0.field_P != null) {
              this.field_P = param0.field_P;
            }
            if (256 != param0.field_rb) {
              this.field_rb = param0.field_rb;
            }
            if (param0.field_v >= 0) {
              this.field_v = param0.field_v;
            }
            if (param0.field_Y != null) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_O != -2147483648) {
              this.field_O = param0.field_O;
            }
            stackIn_68_1 = (this.field_C) && (param0.field_lb);
            this.field_lb = stackIn_68_1;
            if (0 != param0.field_ob) {
              this.field_ob = param0.field_ob;
            }
            if (0 != param0.field_G) {
              this.field_G = param0.field_G;
            }
            if (param0.field_kb != -2147483648) {
              this.field_kb = param0.field_kb;
            }
            if (0 != param0.field_U) {
              this.field_U = param0.field_U;
            }
            if (-2147483648 != param0.field_M) {
              this.field_M = param0.field_M;
            }
            if (param0.field_x != -2147483648) {
              this.field_x = param0.field_x;
            }
            if (param0.field_Z != -2147483648) {
              this.field_Z = param0.field_Z;
            }
            if (param0.field_J != 0) {
              this.field_J = param0.field_J;
            }
            if (param0.field_hb != -2147483648) {
              this.field_hb = param0.field_hb;
            }
            if (param0.field_Db) {
              this.field_Db = param0.field_Db;
            }
          }
          if (param1 != 7957) {
            var4 = (le) null;
            this.a(false, (le) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_100_0 = var3;
          stackIn_100_1 = new StringBuilder().append("le.JA(");
          if (param0 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param1).append(')').toString());
        }
    }

    le(long param0, le param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(boolean param0, boolean param1) {
        wc.field_u = !param0 ? true : false;
        ob.field_n = !param0 ? true : false;
        this.a(0, si.field_k, 0, param1, (byte) 48, si.field_e);
    }

    private le(long param0, le param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_M = -2147483648;
        this.field_hb = -2147483648;
        this.field_x = -2147483648;
        this.field_Z = -2147483648;
        this.field_jb = true;
        this.field_w = -1;
        this.field_kb = -2147483648;
        this.field_rb = 256;
        this.field_A = -1;
        this.field_C = false;
        this.field_O = -2147483648;
        this.field_db = 256;
        this.field_lb = false;
        this.field_H = -1;
        this.field_v = -1;
        try {
          this.field_tb = param2;
          this.field_sb = param5;
          this.field_zb = param3;
          this.field_qb = param4;
          this.field_c = param0;
          this.a(param1, 7957);
          if (param6 != null) {
            this.field_fb = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "le.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_gb = 0;
    }
}
