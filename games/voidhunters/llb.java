/*
 * Decompiled by CFR-JS 0.4.0.
 */
class llb extends fgb {
    int field_u;
    int field_o;
    int field_v;
    boolean field_Z;
    int field_B;
    phb field_tb;
    int field_P;
    boolean field_Q;
    int field_L;
    int field_db;
    int field_r;
    int field_t;
    int field_K;
    int field_fb;
    phb field_ob;
    boolean field_S;
    int field_D;
    int field_hb;
    int field_G;
    private boolean field_W;
    phb[] field_nb;
    private int field_bb;
    boolean field_J;
    int field_X;
    phb[] field_gb;
    String field_R;
    int field_ib;
    phb[] field_A;
    phb field_q;
    private int field_sb;
    private int field_n;
    int field_w;
    static String field_V;
    boolean field_O;
    static String field_H;
    int field_E;
    private int field_ab;
    int field_I;
    phb[] field_mb;
    phb[] field_ub;
    phb field_cb;
    no field_eb;
    int field_U;
    int field_jb;
    boolean field_y;
    String field_s;
    private int field_p;
    int field_rb;
    static String field_kb;
    private int field_x;
    int field_C;
    boolean field_T;
    boolean field_pb;
    int field_Y;
    int field_qb;
    ij field_lb;
    int field_F;
    int field_M;
    private boolean field_N;
    phb field_z;

    final void a(llb param0, int param1, llb param2, int param3) {
        int var5_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = -5 % ((-59 - param3) / 34);
          if (param0 != null) {
            param2.field_db = param0.field_db + param0.field_E;
            param2.field_K = param1 + (param0.field_K + param0.field_G);
          } else {
            param2.field_db = 0;
            param2.field_K = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("llb.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_sb = 0;
        this.field_K = param3;
        this.field_E = 0;
        this.field_db = 0;
        this.field_x = 0;
        this.field_hb = param2;
        this.field_G = param4;
        int var6 = -17 / ((param1 - 80) / 36);
        this.field_L = param0;
    }

    llb(long param0, llb param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void a(int param0, llb param1) {
        boolean stackIn_88_1 = false;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 18445) {
            this.a(25, 12, -107, false);
          }
          if (param1 != null) {
            if (null != param1.field_s) {
              this.field_s = param1.field_s;
            }
            if (param1.field_D != 0) {
              this.field_D = param1.field_D;
            }
            if (null != param1.field_A) {
              this.field_A = param1.field_A;
            }
            if (param1.field_I != 256) {
              this.field_I = param1.field_I;
            }
            if (param1.field_J) {
              this.field_J = param1.field_J;
            }
            if (param1.field_N) {
              this.field_N = param1.field_N;
            }
            if (param1.field_T) {
              this.field_T = param1.field_T;
            }
            if (0 <= param1.field_qb) {
              this.field_qb = param1.field_qb;
            }
            if (param1.field_R != null) {
              this.field_R = param1.field_R;
            }
            if (null != param1.field_cb) {
              this.field_cb = param1.field_cb;
            }
            if (!param1.field_y) {
              this.field_y = param1.field_y;
            }
            if (param1.field_z != null) {
              this.field_z = param1.field_z;
            }
            if (param1.field_w != 0) {
              this.field_w = param1.field_w;
            }
            if (param1.field_nb != null) {
              this.field_nb = param1.field_nb;
            }
            if (param1.field_U >= 0) {
              this.field_U = param1.field_U;
            }
            if (param1.field_ib >= 0) {
              this.field_ib = param1.field_ib;
            }
            if (param1.field_S) {
              this.field_S = param1.field_S;
            }
            if (null != param1.field_ob) {
              this.field_ob = param1.field_ob;
            }
            if (null != param1.field_mb) {
              this.field_mb = param1.field_mb;
            }
            if (null != param1.field_q) {
              this.field_q = param1.field_q;
            }
            if (0 != param1.field_Y) {
              this.field_Y = param1.field_Y;
            }
            if (param1.field_jb >= 0) {
              this.field_jb = param1.field_jb;
            }
            if (null != param1.field_ub) {
              this.field_ub = param1.field_ub;
            }
            if (param1.field_gb != null) {
              this.field_gb = param1.field_gb;
            }
            if (null != param1.field_eb) {
              this.field_eb = param1.field_eb;
            }
            if (null != param1.field_tb) {
              this.field_tb = param1.field_tb;
            }
            if (param1.field_X != -2147483648) {
              this.field_X = param1.field_X;
            }
            if (param1.field_B != 0) {
              this.field_B = param1.field_B;
            }
            if (param1.field_rb != -2147483648) {
              this.field_rb = param1.field_rb;
            }
            if (param1.field_Z) {
              this.field_Z = param1.field_Z;
            }
            if (param1.field_P != -2147483648) {
              this.field_P = param1.field_P;
            }
            if (param1.field_F != 0) {
              this.field_F = param1.field_F;
            }
            this.field_W = param1.field_W;
            if (param1.field_t != 0) {
              this.field_t = param1.field_t;
            }
            stackIn_88_1 = (this.field_T) && (param1.field_pb);
            this.field_pb = stackIn_88_1;
            if (param1.field_fb != -2147483648) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_bb != -2147483648) {
              this.field_bb = param1.field_bb;
            }
            if (param1.field_v != 0) {
              this.field_v = param1.field_v;
            }
            if (-2147483648 == param1.field_p) {
              return;
            }
            this.field_p = param1.field_p;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_103_0 = var3;
          stackIn_103_1 = new StringBuilder().append("llb.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(')').toString());
        }
    }

    final void b(boolean param0, int param1) {
        int var3 = -119 % ((param1 + 29) / 40);
        this.a(false, dma.field_j, false, dma.field_g, true, false, true, param0, false, 0, 0);
    }

    final void g(int param0) {
        llb var4 = null;
        int var3 = VoidHunters.field_G;
        if (param0 >= 104) {
          if (null != this.field_lb) {
            var4 = (llb) (this.field_lb.b((byte) 121));
            while (var4 != null) {
              var4.field_N = true;
              var4.g(127);
              var4 = (llb) (this.field_lb.a(-1155566844));
            }
          }
          return;
        }
    }

    llb(String param0, llb param1, int param2, int param3, int param4, int param5, String param6) {
        this(qua.a((CharSequence) ((Object) param0), true), param1, param2, param3, param4, param5, param6);
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, int param4, int param5) {
        boolean stackIn_35_1 = false;
        boolean stackIn_40_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        llb var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = VoidHunters.field_G;
        if (this.field_sb > 0) {
          var7 = -(-this.field_sb >> 2);
        } else {
          var7 = this.field_sb >> 2;
        }
        this.field_L = this.field_L + var7;
        this.field_sb = this.field_sb - var7;
        if (0 < this.field_db) {
          var7Lifetime1 = -(-this.field_db >> 2);
        } else {
          var7Lifetime1 = this.field_db >> 2;
        }
        this.field_db = this.field_db - var7Lifetime1;
        this.field_K = this.field_K + var7Lifetime1;
        if (this.field_x > 0) {
          var7Lifetime2 = -(-this.field_x >> 2);
        } else {
          var7Lifetime2 = this.field_x >> 2;
        }
        this.field_x = this.field_x - var7Lifetime2;
        this.field_hb = this.field_hb + var7Lifetime2;
        if (this.field_E > 0) {
          var7Lifetime3 = -(-this.field_E >> 2);
        } else {
          var7Lifetime3 = this.field_E >> 2;
        }
        this.field_M = param1 + this.field_L;
        if (!param0) {
          this.field_w = -107;
        }
        this.field_G = this.field_G + var7Lifetime3;
        this.field_u = param4 + this.field_K;
        this.field_E = this.field_E - var7Lifetime3;
        param3 = param3 & this.field_y;
        var8 = dma.field_d;
        var9 = dma.field_c;
        var10 = dma.field_a;
        var11 = dma.field_f;
        dma.g(this.field_M, this.field_u, this.field_hb + this.field_M, this.field_G + this.field_u);
        var12 = 0;
        if (!ru.field_o &&
          param3 &&
          pba.field_o != 0 &&
          oq.field_H >= dma.field_d &&
          oq.field_H < dma.field_a &&
          qs.field_a >= dma.field_c &&
          dma.field_f > qs.field_a) {
          this.field_C = pba.field_o;
          var12 = 1;
          this.field_r = oq.field_H - this.field_M;
          this.field_n = -this.field_u + qs.field_a;
          this.field_o = pba.field_o;
        } else {
          if (pba.field_o != 0) {
            this.field_C = 0;
          }
          this.field_o = 0;
        }
        if (hu.field_b == 0) {
          this.field_C = 0;
        }
        stackIn_35_1 = (!dca.field_p) && (kc.field_b >= dma.field_d) && (kc.field_b < dma.field_a) && (dma.field_c <= uia.field_b) && (dma.field_f > uia.field_b);
        this.field_Q = stackIn_35_1;
        stackIn_40_1 = (this.field_Q) && (this.field_C == hu.field_b) && (param3);
        this.field_O = stackIn_40_1;
        if (this.field_lb != null) {
          var13 = (llb) (this.field_lb.b((byte) 119));
          while (var13 != null) {
            var13.a(true, this.field_M, this.field_G, param3, this.field_u, this.field_hb);
            var13 = (llb) (this.field_lb.a(-1155566844));
          }
        }
        if (this.field_Q) {
          dca.field_p = true;
        }
        if (var12 != 0) {
          ru.field_o = true;
        }
        dma.b(var8, var9, var10, var11);
        if (this.field_C != 0 &&
          this.field_Z) {
          this.field_K = -this.field_n + uia.field_b - param4;
          this.field_L = -param1 - this.field_r + kc.field_b;
          if (this.field_L < 0) {
            this.field_L = 0;
          }
          if (this.field_L > -this.field_hb + param5) {
            this.field_L = param5 - this.field_hb;
          }
          if (this.field_K < 0) {
            this.field_K = 0;
          }
          if (this.field_K > -this.field_G + param2) {
            this.field_K = param2 - this.field_G;
          }
          this.field_M = this.field_L + param1;
          this.field_sb = 0;
          this.field_db = 0;
          this.field_u = param4 + this.field_K;
        }
    }

    public static void f(int param0) {
        field_kb = null;
        field_H = null;
        field_V = null;
        if (param0 != -2147483648) {
          llb.f(97);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        llb var10_ref_llb = null;
        int var9 = 0;
        int var11 = VoidHunters.field_G;
        int var5 = -this.field_K;
        int var9Lifetime1;
        if (param1 > -69) {
          this.a(50, -50, -75, 81, -93);
        }
        int var6 = var5 - this.field_db;
        int var7 = this.field_G;
        int var8 = this.field_E + var7;
        if (!param3) {
          var9 = 0;
          var10_ref_llb = (llb) (this.field_lb.d(0));
          while (var10_ref_llb != null) {
            var10_ref_llb.field_db = -var10_ref_llb.field_K + var9;
            var9 = var9 + (param0 + (var10_ref_llb.field_G + var10_ref_llb.field_E));
            var10_ref_llb = (llb) (this.field_lb.a((byte) 72));
          }
          var8 = -param0 + var9;
        }
        var9Lifetime1 = -param2 + var8;
        if (var6 > var9Lifetime1) {
          var6 = var9Lifetime1;
        }
        if (0 > var6) {
          var6 = 0;
        }
        int var10 = var7 - param2;
        if (var5 > var10) {
          var5 = var10;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        this.field_G = var7;
        this.field_E = -var7 + var8;
        this.field_K = -var5;
        this.field_db = -var6 + var5;
    }

    final int a(int param0, byte param1) {
        llb var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = VoidHunters.field_G;
        int var3 = 0;
        int var4_intLifetime1;
        if (null != this.field_R &&
          null != this.field_eb) {
          var4_int = this.field_eb.b(this.field_R, param0);
          if (var3 < var4_int) {
            var3 = var4_int;
          }
        }
        if (null != this.field_tb) {
          var4_intLifetime1 = this.field_tb.field_m;
          if (var3 < var4_intLifetime1) {
            var3 = var4_intLifetime1;
          }
        }
        if (param1 != 114) {
          llb var7 = (llb) null;
          this.b(-75, (llb) null);
        }
        if (null != this.field_lb) {
          var4 = (llb) (this.field_lb.d(param1 - 114));
          while (var4 != null) {
            var5 = var4.field_hb + var4.field_L;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (llb) (this.field_lb.a((byte) 17));
          }
        }
        return var3;
    }

    final void b(int param0, llb param1) {
        try {
          if (param0 != -561) {
            this.field_I = -90;
          }
          if (this.field_lb == null) {
            this.field_lb = new ij();
          }
          this.field_lb.b(-10258, param1);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "llb.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    llb(long param0, llb param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(boolean param0, llb param1) {
        wc var3 = null;
        llb var4 = null;
        int var5 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = VoidHunters.field_G;
        try {
          if (this.field_lb != null) {
            var3 = new wc(this.field_lb);
            var4 = (llb) (var3.c(570));
            while (var4 != null) {
              var4.a(param0, param1);
              var4 = (llb) (var3.a(19072));
            }
          }
          stackIn_8_1 = (param1 == this);
          this.field_pb = stackIn_8_1;
          if (this.field_W) {
            this.field_J = this.field_pb;
          }
          if (param0) {
            this.field_r = -44;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("llb.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int e(int param0) {
        if (param0 < 4) {
          this.field_x = -24;
        }
        return this.a(2147483647, (byte) 114);
    }

    final void a(boolean param0, int param1) {
        if (param1 == 1332) {
          ru.field_o = !param0 ? true : false;
          dca.field_p = !param0 ? true : false;
          this.a(true, 0, dma.field_j, true, 0, dma.field_g);
          return;
        }
    }

    private final void a(boolean param0, int param1, boolean param2, int param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8, int param9, int param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        phb[] var16;
        phb var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        llb var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = VoidHunters.field_G;
        this.field_u = param10 + this.field_K;
        this.field_M = this.field_L + param9;
        var12 = dma.field_d;
        var13 = dma.field_c;
        var14 = dma.field_a;
        var15 = dma.field_f;
        dma.g(this.field_M, this.field_u, this.field_M + this.field_hb, this.field_G + this.field_u);
        if (!this.field_N) {
          param0 = this.field_O;
          param2 = this.field_J;
          stackIn_5_0 = (this.field_C != 0);
          param5 = stackIn_5_0;
        }
        param6 = param6 & this.field_y;
        var16 = this.field_gb;
        if (!param4) {
          return;
        }
        var17 = this.field_tb;
        var18 = this.field_Y;
        var19 = 0;
        if (!param6) {
          if (null != this.field_z) {
            var17 = this.field_z;
          }
          if (null != this.field_ub) {
            var16 = this.field_ub;
          }
          if (0 <= this.field_jb) {
            var18 = this.field_jb;
          }
        }
        var20 = 0;
        if (param0) {
          if (this.field_cb != null) {
            var17 = this.field_cb;
          }
          if (this.field_qb >= 0) {
            var18 = this.field_qb;
          }
          if (-2147483648 != this.field_bb) {
            var20 = this.field_bb;
          }
          if (this.field_mb != null) {
            var16 = this.field_mb;
          }
          if (-2147483648 != this.field_p) {
            var19 = this.field_p;
          }
        }
        if (param5) {
          if (this.field_A != null) {
            var16 = this.field_A;
          }
          if (null != this.field_ob) {
            var17 = this.field_ob;
          }
          if (this.field_fb != -2147483648) {
            var19 = this.field_fb;
          }
          if (this.field_ib >= 0) {
            var18 = this.field_ib;
          }
          if (this.field_rb != -2147483648) {
            var20 = this.field_rb;
          }
        }
        if (param2) {
          if (this.field_X != -2147483648) {
            var19 = this.field_X;
          }
          if (this.field_U >= 0) {
            var18 = this.field_U;
          }
          if (-2147483648 != this.field_P) {
            var20 = this.field_P;
          }
          if (null != this.field_q) {
            var17 = this.field_q;
          }
          if (null != this.field_nb) {
            var16 = this.field_nb;
          }
        }
        var21 = var19 + this.field_t;
        var22 = this.field_v + var20;
        if (!this.field_S) {
          abb.a(3, this.field_G, this.field_hb, this.field_u, var16, this.field_M);
        } else {
          abb.a(3, param1, param3, param10, var16, param9);
        }
        if (var17 != null) {
          var23_int = var21 + this.field_M;
          if (1 == this.field_F) {
            var23_int = var23_int + (this.field_hb - var17.field_m) / 2;
          }
          var24 = var22 + this.field_u;
          if (2 == this.field_F) {
            var23_int = var23_int + (-var17.field_m + this.field_hb);
          }
          if (this.field_B == 1) {
            var24 = var24 + (-var17.field_n + this.field_G) / 2;
          }
          if (this.field_B == 2) {
            var24 = var24 + (-var17.field_n + this.field_G);
          }
          if (256 > this.field_ab) {
            var17.d(var23_int, var24, this.field_ab);
          } else {
            var17.a(var23_int, var24);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_R &&
          null != this.field_eb) {
          var26 = this.field_R;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param7 &&
            this.field_s != null) {
            var23Lifetime2 = var26 + this.field_s;
          }
          if (this.field_eb.b(var23Lifetime2) <= this.field_hb - this.field_w * 2 &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.field_B != 1) {
              if (2 == this.field_B) {
                var22 = var22 + (-this.field_eb.field_k + (this.field_G - this.field_eb.field_A));
              }
            } else {
              var22 = var22 + (-this.field_eb.field_A - this.field_eb.field_k + this.field_G) / 2;
            }
            if (0 == this.field_F) {
              this.field_eb.a(var23Lifetime2, this.field_M + (this.field_w + var21), var22 + (this.field_u + this.field_eb.field_k), var18, -1, this.field_I);
            } else {
              if (this.field_F == 1) {
                this.field_eb.b(var23Lifetime2, var21 + this.field_w + (this.field_M + (-(this.field_w * 2) + this.field_hb) / 2), this.field_u + (var22 + this.field_eb.field_k), var18, -1, this.field_I);
              } else {
                if (2 != this.field_F) {
                  this.field_eb.a(var23Lifetime2, this.field_M - (-this.field_w - var21), this.field_u + var22, this.field_hb - this.field_w * 2, this.field_G, var18, -1, this.field_I, this.field_F, this.field_B, this.field_D);
                } else {
                  this.field_eb.c(var23Lifetime2, this.field_hb - (this.field_w * 2 - this.field_M - this.field_w - var21), this.field_eb.field_k + this.field_u + var22, var18, -1, this.field_I);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_eb.a(var23Lifetime2, var21 + (this.field_M + this.field_w), var22 + this.field_u, this.field_hb - 2 * this.field_w, this.field_G, var18, -1, this.field_I, this.field_F, this.field_B, this.field_D);
          }
        }
        if (null != this.field_lb) {
          var23_ref = (llb) (this.field_lb.d(0));
          while (var23_ref != null) {
            var23_ref.a(param0, this.field_G, param2, this.field_hb, true, param5, param6, param7, this.field_pb, var19 + this.field_M, this.field_u + var20);
            var23_ref = (llb) (this.field_lb.a((byte) 109));
          }
        }
        dma.b(var12, var13, var14, var15);
        return;
    }

    public llb() {
        this.field_W = false;
        this.field_y = true;
        this.field_U = -1;
        this.field_X = -2147483648;
        this.field_P = -2147483648;
        this.field_p = -2147483648;
        this.field_I = 256;
        this.field_fb = -2147483648;
        this.field_T = false;
        this.field_ab = 256;
        this.field_qb = -1;
        this.field_rb = -2147483648;
        this.field_jb = -1;
        this.field_ib = -1;
        this.field_pb = false;
        this.field_bb = -2147483648;
    }

    llb(long param0, llb param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_W = false;
        this.field_y = true;
        this.field_U = -1;
        this.field_X = -2147483648;
        this.field_P = -2147483648;
        this.field_p = -2147483648;
        this.field_I = 256;
        this.field_fb = -2147483648;
        this.field_T = false;
        this.field_ab = 256;
        this.field_qb = -1;
        this.field_rb = -2147483648;
        this.field_jb = -1;
        this.field_ib = -1;
        this.field_pb = false;
        this.field_bb = -2147483648;
        try {
          this.field_G = param5;
          this.field_b = param0;
          this.field_K = param3;
          this.field_L = param2;
          this.field_hb = param4;
          this.a(18445, param1);
          if (param6 != null) {
            this.field_R = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "llb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_V = "Quality";
        field_kb = "Toggle repair mode";
        field_H = "<%0> can no longer respawn";
    }
}
