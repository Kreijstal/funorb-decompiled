/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class ci extends ei {
    jc field_I;
    int field_U;
    private boolean field_W;
    int field_bb;
    int field_cb;
    private boolean field_B;
    km field_hb;
    private int field_yb;
    int field_kb;
    km[] field_D;
    int field_G;
    int field_eb;
    km[] field_Q;
    int field_N;
    private int field_C;
    int field_O;
    private boolean field_ob;
    int field_V;
    String field_db;
    int field_z;
    int field_pb;
    private int field_Cb;
    int field_qb;
    static String field_J;
    boolean field_Db;
    private int field_lb;
    km[] field_Ab;
    String field_S;
    int field_P;
    int field_R;
    private int field_E;
    int field_fb;
    km field_nb;
    int field_M;
    int field_L;
    int field_wb;
    km[] field_ab;
    boolean field_rb;
    boolean field_gb;
    int field_vb;
    static ed field_ub;
    km field_jb;
    km field_Bb;
    km field_sb;
    boolean field_tb;
    private int field_X;
    km[] field_Z;
    boolean field_w;
    int field_ib;
    int field_mb;
    private int field_Y;
    static nb field_zb;
    int field_K;
    int field_T;
    boolean field_F;
    int field_y;
    int field_A;
    lh field_xb;
    static String field_x;
    private int field_H;

    final void a(int param0, int param1, boolean param2, int param3) {
        ci var10_ref_ci = null;
        int var9 = 0;
        int var11 = Chess.field_G;
        int var5 = -this.field_V;
        int var6 = -this.field_vb + var5;
        int var7 = this.field_pb;
        int var8 = var7 + this.field_N;
        int var9Lifetime1;
        if (param3 >= -67) {
          this.field_P = 127;
        }
        if (!param2) {
          var9 = 0;
          var10_ref_ci = (ci) (this.field_I.g(-18110));
          while (var10_ref_ci != null) {
            var10_ref_ci.field_vb = -var10_ref_ci.field_V + var9;
            var9 = var9 + (var10_ref_ci.field_pb - (-var10_ref_ci.field_N - param0));
            var10_ref_ci = (ci) (this.field_I.a((byte) -96));
          }
          var8 = var9 - param0;
        }
        var9Lifetime1 = var8 - param1;
        if (var9Lifetime1 < var6) {
          var6 = var9Lifetime1;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        int var10 = -param1 + var7;
        if (var5 > var10) {
          var5 = var10;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        this.field_vb = var5 - var6;
        this.field_V = -var5;
        this.field_pb = var7;
        this.field_N = var8 - var7;
    }

    final void a(ci param0, int param1) {
        boolean stackIn_83_1 = false;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -2147483648) {
            return;
          }
          if (param0 != null) {
            if (param0.field_Q != null) {
              this.field_Q = param0.field_Q;
            }
            if (0 <= param0.field_T) {
              this.field_T = param0.field_T;
            }
            if (param0.field_w) {
              this.field_w = param0.field_w;
            }
            if (param0.field_K != 0) {
              this.field_K = param0.field_K;
            }
            if (param0.field_P >= 0) {
              this.field_P = param0.field_P;
            }
            if (param0.field_db != null) {
              this.field_db = param0.field_db;
            }
            if (param0.field_z != 0) {
              this.field_z = param0.field_z;
            }
            if (param0.field_ib != 0) {
              this.field_ib = param0.field_ib;
            }
            if (param0.field_Bb != null) {
              this.field_Bb = param0.field_Bb;
            }
            if (null != param0.field_S) {
              this.field_S = param0.field_S;
            }
            if (null != param0.field_hb) {
              this.field_hb = param0.field_hb;
            }
            if (param0.field_ab != null) {
              this.field_ab = param0.field_ab;
            }
            if (param0.field_W) {
              this.field_W = param0.field_W;
            }
            if (param0.field_A >= 0) {
              this.field_A = param0.field_A;
            }
            if (param0.field_O >= 0) {
              this.field_O = param0.field_O;
            }
            if (param0.field_jb != null) {
              this.field_jb = param0.field_jb;
            }
            if (null != param0.field_Z) {
              this.field_Z = param0.field_Z;
            }
            if (null != param0.field_nb) {
              this.field_nb = param0.field_nb;
            }
            if (null != param0.field_xb) {
              this.field_xb = param0.field_xb;
            }
            if (param0.field_gb) {
              this.field_gb = param0.field_gb;
            }
            if (param0.field_B) {
              this.field_B = param0.field_B;
            }
            if (param0.field_eb != 256) {
              this.field_eb = param0.field_eb;
            }
            if (param0.field_Ab != null) {
              this.field_Ab = param0.field_Ab;
            }
            if (param0.field_sb != null) {
              this.field_sb = param0.field_sb;
            }
            if (!param0.field_tb) {
              this.field_tb = param0.field_tb;
            }
            if (null != param0.field_D) {
              this.field_D = param0.field_D;
            }
            if (param0.field_yb != -2147483648) {
              this.field_yb = param0.field_yb;
            }
            if (param0.field_y != -2147483648) {
              this.field_y = param0.field_y;
            }
            if (0 != param0.field_cb) {
              this.field_cb = param0.field_cb;
            }
            if (param0.field_bb != -2147483648) {
              this.field_bb = param0.field_bb;
            }
            stackIn_83_1 = (this.field_B) && (param0.field_ob);
            this.field_ob = stackIn_83_1;
            if (param0.field_H != 0) {
              this.field_H = param0.field_H;
            }
            if (param0.field_C != 0) {
              this.field_C = param0.field_C;
            }
            if (param0.field_rb) {
              this.field_rb = param0.field_rb;
            }
            if (-2147483648 != param0.field_Y) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_R != -2147483648) {
              this.field_R = param0.field_R;
            }
            if (param0.field_fb != 0) {
              this.field_fb = param0.field_fb;
            }
            if (-2147483648 == param0.field_G) {
              return;
            }
            this.field_G = param0.field_G;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_103_0 = var3;
          stackIn_103_1 = new StringBuilder().append("ci.IA(");
          if (param0 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param1).append(')').toString());
        }
    }

    ci(long param0, ci param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    private final void a(boolean param0, int param1, boolean param2, boolean param3, int param4, boolean param5, byte param6, boolean param7, int param8, boolean param9, int param10) {
        boolean stackIn_7_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        km[] var16;
        km var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        ci var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = Chess.field_G;
        this.field_U = this.field_mb + param10;
        this.field_wb = param1 + this.field_V;
        var12 = wb.field_i;
        var13 = wb.field_a;
        var14 = wb.field_j;
        if (param6 < 49) {
          this.field_Ab = (km[]) null;
        }
        var15 = wb.field_b;
        wb.e(this.field_U, this.field_wb, this.field_M + this.field_U, this.field_pb + this.field_wb);
        param9 = param9 & this.field_tb;
        if (!this.field_W) {
          param5 = this.field_gb;
          param3 = this.field_F;
          stackIn_7_0 = (this.field_kb != 0);
          param7 = stackIn_7_0;
        }
        var16 = this.field_Ab;
        var17 = this.field_jb;
        var18 = this.field_ib;
        var19 = 0;
        if (!param9) {
          if (0 <= this.field_A) {
            var18 = this.field_A;
          }
          if (null != this.field_D) {
            var16 = this.field_D;
          }
          if (null != this.field_nb) {
            var17 = this.field_nb;
          }
        }
        var20 = 0;
        if (param3) {
          if (this.field_yb != -2147483648) {
            var19 = this.field_yb;
          }
          if (this.field_Y != -2147483648) {
            var20 = this.field_Y;
          }
          if (null != this.field_Bb) {
            var17 = this.field_Bb;
          }
          if (this.field_Q != null) {
            var16 = this.field_Q;
          }
          if (this.field_O >= 0) {
            var18 = this.field_O;
          }
        }
        if (param7) {
          if (0 <= this.field_P) {
            var18 = this.field_P;
          }
          if (this.field_Z != null) {
            var16 = this.field_Z;
          }
          if (this.field_G != -2147483648) {
            var20 = this.field_G;
          }
          if (this.field_bb != -2147483648) {
            var19 = this.field_bb;
          }
          if (this.field_hb != null) {
            var17 = this.field_hb;
          }
        }
        if (param5) {
          if (this.field_T >= 0) {
            var18 = this.field_T;
          }
          if (-2147483648 != this.field_R) {
            var20 = this.field_R;
          }
          if (null != this.field_ab) {
            var16 = this.field_ab;
          }
          if (this.field_sb != null) {
            var17 = this.field_sb;
          }
          if (this.field_y != -2147483648) {
            var19 = this.field_y;
          }
        }
        var21 = this.field_C + var19;
        var22 = var20 + this.field_H;
        if (this.field_w) {
          em.a(param1, var16, param4, param10, 24599, param8);
        } else {
          em.a(this.field_wb, var16, this.field_M, this.field_U, 24599, this.field_pb);
        }
        if (var17 != null) {
          var23_int = var21 + this.field_U;
          if (this.field_fb == 1) {
            var23_int = var23_int + (-var17.field_v + this.field_M) / 2;
          }
          var24 = var22 + this.field_wb;
          if (this.field_cb == 1) {
            var24 = var24 + (-var17.field_u + this.field_pb) / 2;
          }
          if (this.field_fb == 2) {
            var23_int = var23_int + (-var17.field_v + this.field_M);
          }
          if (this.field_cb == 2) {
            var24 = var24 + (-var17.field_u + this.field_pb);
          }
          if (this.field_X < 256) {
            var17.b(var23_int, var24, this.field_X);
          } else {
            var17.b(var23_int, var24);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_db != null &&
          null != this.field_xb) {
          var26 = this.field_db;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param0 &&
            null != this.field_S) {
            var23Lifetime2 = var26 + this.field_S;
          }
          if (this.field_xb.b(var23Lifetime2) <= -(this.field_z * 2) + this.field_M &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.field_cb == 1) {
              var22 = var22 + (-this.field_xb.field_t + (this.field_pb - this.field_xb.field_C)) / 2;
            } else {
              if (this.field_cb == 2) {
                var22 = var22 + (this.field_pb + (-this.field_xb.field_t - this.field_xb.field_C));
              }
            }
            if (0 == this.field_fb) {
              this.field_xb.a(var23Lifetime2, var21 + this.field_z + this.field_U, this.field_xb.field_C + (var22 + this.field_wb), var18, -1, this.field_eb);
            } else {
              if (this.field_fb == 1) {
                this.field_xb.b(var23Lifetime2, var21 + (this.field_z + this.field_U) + (this.field_M - 2 * this.field_z) / 2, this.field_wb + (var22 + this.field_xb.field_C), var18, -1, this.field_eb);
              } else {
                if (this.field_fb != 2) {
                  this.field_xb.a(var23Lifetime2, var21 + (this.field_U + this.field_z), var22 + this.field_wb, -(this.field_z * 2) + this.field_M, this.field_pb, var18, -1, this.field_eb, this.field_fb, this.field_cb, this.field_K);
                } else {
                  this.field_xb.c(var23Lifetime2, this.field_z + this.field_U + (var21 + this.field_M - this.field_z * 2), this.field_wb + var22 + this.field_xb.field_C, var18, -1, this.field_eb);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_xb.a(var23Lifetime2, var21 + (this.field_U + this.field_z), var22 + this.field_wb, -(2 * this.field_z) + this.field_M, this.field_pb, var18, -1, this.field_eb, this.field_fb, this.field_cb, this.field_K);
          }
        }
        if (this.field_I != null) {
          var23_ref = (ci) (this.field_I.g(-18110));
          while (var23_ref != null) {
            var23_ref.a(param0, var20 + this.field_wb, this.field_ob, param3, this.field_M, param5, (byte) 76, param7, this.field_pb, param9, this.field_U + var19);
            var23_ref = (ci) (this.field_I.a((byte) -110));
          }
        }
        wb.b(var12, var13, var14, var15);
    }

    final int a(int param0, int param1) {
        ci var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = Chess.field_G;
        int var3 = 0;
        int var4_intLifetime1;
        if (this.field_db != null &&
          null != this.field_xb) {
          var4_int = this.field_xb.c(this.field_db, param0);
          if (var4_int > var3) {
            var3 = var4_int;
          }
        }
        if (null != this.field_jb) {
          var4_intLifetime1 = this.field_jb.field_v;
          if (var4_intLifetime1 > var3) {
            var3 = var4_intLifetime1;
          }
        }
        if (param1 >= -61) {
          this.field_V = -29;
        }
        if (this.field_I != null) {
          var4 = (ci) (this.field_I.g(-18110));
          while (var4 != null) {
            var5 = var4.field_M + var4.field_mb;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (ci) (this.field_I.a((byte) -109));
          }
        }
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_M = param1;
        this.field_E = 0;
        this.field_vb = 0;
        this.field_pb = param3;
        this.field_mb = param0;
        this.field_Cb = 0;
        this.field_V = param4;
        if (param2 != -2147483648) {
          this.a(false, true);
        }
        this.field_N = 0;
    }

    final void a(byte param0, ci param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null == this.field_I) {
            this.field_I = new jc();
          }
          this.field_I.a((o) (param1), (byte) 87);
          if (param0 < 122) {
            this.field_rb = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ci.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void i(int param0) {
        field_zb = null;
        field_J = null;
        field_x = null;
        field_ub = null;
        if (param0 >= -122) {
          field_ub = (ed) null;
        }
    }

    final int e(byte param0) {
        int var2 = 78 / ((-7 - param0) / 37);
        return this.a(2147483647, -66);
    }

    final static boolean g(int param0) {
        int var2 = 0;
        fl var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        fl var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          var4 = (fl) (vj.field_c.g(-18110));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (param0 != 2147483647) {
            return true;
          }
          for (var2 = 0; var2 < var1.field_l; var2++) {
            if (null != var4.field_w[var2] &&
              0 == var4.field_w[var2].field_f) {
              return false;
            }
            if (null != var4.field_u[var2] &&
              0 == var4.field_u[var2].field_f) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1_ref), "ci.KA(" + param0 + ')');
        }
    }

    ci(long param0, ci param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static um a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          da var8 = null;
          um stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            var7 = null;
            if (null != ol.field_N.field_a) {
              kj.field_a = new lc(ol.field_N.field_a, 5200, 0);
              ol.field_N.field_a = null;
              var6 = new gd(255, kj.field_a, new lc(ol.field_N.field_n, 12000, 0), 2097152);
            }
            if (null != kj.field_a) {
              if (hj.field_n == null) {
                hj.field_n = new lc[ol.field_N.field_r.length];
              }
              if (null == hj.field_n[param1]) {
                hj.field_n[param1] = new lc(ol.field_N.field_r[param1], 12000, 0);
                ol.field_N.field_r[param1] = null;
              }
              var7 = new gd(param1, kj.field_a, hj.field_n[param1], 2097152);
            }
            if (param0 != -17288) {
              field_J = (String) null;
            }
            var8 = ge.field_fb.a((byte) 14, param4, param1, (gd) (var6), (gd) (var7));
            if (param3) {
              var8.a((byte) 108);
            }
            stackIn_15_0 = new um(var8, param5, param2);
            return stackIn_15_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        ci var4 = null;
        int var3 = Chess.field_G;
        if (param0 != 0) {
          this.a(true, -11, false, true, -127, false, (byte) -40, true, -4, true, 43);
        }
        if (this.field_I != null) {
          var4 = (ci) (this.field_I.b(28937));
          while (var4 != null) {
            var4.field_W = true;
            var4.h(0);
            var4 = (ci) (this.field_I.a(true));
          }
        }
    }

    final void a(boolean param0, boolean param1) {
        this.a(param1, 0, false, false, wb.field_h, false, (byte) 125, param0, wb.field_c, true, 0);
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        boolean stackIn_32_1 = false;
        boolean stackIn_40_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        ci var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = Chess.field_G;
        if (param5 <= 113) {
          ci.g(-55);
        }
        if (this.field_E > 0) {
          var7 = -(-this.field_E >> 2);
        } else {
          var7 = this.field_E >> 2;
        }
        this.field_E = this.field_E - var7;
        this.field_mb = this.field_mb + var7;
        if (this.field_vb > 0) {
          var7Lifetime1 = -(-this.field_vb >> 2);
        } else {
          var7Lifetime1 = this.field_vb >> 2;
        }
        this.field_V = this.field_V + var7Lifetime1;
        this.field_vb = this.field_vb - var7Lifetime1;
        if (0 < this.field_Cb) {
          var7Lifetime2 = -(-this.field_Cb >> 2);
        } else {
          var7Lifetime2 = this.field_Cb >> 2;
        }
        this.field_Cb = this.field_Cb - var7Lifetime2;
        this.field_M = this.field_M + var7Lifetime2;
        if (this.field_N <= 0) {
          var7Lifetime3 = this.field_N >> 2;
        } else {
          var7Lifetime3 = -(-this.field_N >> 2);
        }
        this.field_pb = this.field_pb + var7Lifetime3;
        param1 = param1 & this.field_tb;
        this.field_U = param0 + this.field_mb;
        this.field_wb = this.field_V + param3;
        this.field_N = this.field_N - var7Lifetime3;
        var8 = wb.field_i;
        var9 = wb.field_a;
        var10 = wb.field_j;
        var11 = wb.field_b;
        wb.e(this.field_U, this.field_wb, this.field_U + this.field_M, this.field_pb + this.field_wb);
        var12 = 0;
        if (!fg.field_b &&
          param1 &&
          th.field_d != 0 &&
          wb.field_i <= re.field_m &&
          re.field_m < wb.field_j &&
          ag.field_f >= wb.field_a &&
          wb.field_b > ag.field_f) {
          this.field_L = th.field_d;
          this.field_kb = th.field_d;
          this.field_qb = -this.field_U + re.field_m;
          this.field_lb = ag.field_f - this.field_wb;
          var12 = 1;
        } else {
          if (th.field_d != 0) {
            this.field_kb = 0;
          }
          this.field_L = 0;
        }
        stackIn_32_1 = (!gd.field_e) && (wb.field_i <= hn.field_k) && (wb.field_j > hn.field_k) && (rf.field_b >= wb.field_a) && (wb.field_b > rf.field_b);
        this.field_Db = stackIn_32_1;
        if (wh.field_f == 0) {
          this.field_kb = 0;
        }
        stackIn_40_1 = (this.field_Db) && (this.field_kb == wh.field_f) && (param1);
        this.field_F = stackIn_40_1;
        if (this.field_I != null) {
          var13 = (ci) (this.field_I.b(28937));
          while (var13 != null) {
            var13.a(this.field_U, param1, this.field_M, this.field_wb, this.field_pb, 127);
            var13 = (ci) (this.field_I.a(true));
          }
        }
        if (var12 != 0) {
          fg.field_b = true;
        }
        if (this.field_Db) {
          gd.field_e = true;
        }
        wb.b(var8, var9, var10, var11);
        if (this.field_kb != 0 &&
          this.field_rb) {
          this.field_mb = -this.field_qb + hn.field_k - param0;
          this.field_V = rf.field_b + (-this.field_lb - param3);
          if (this.field_mb < 0) {
            this.field_mb = 0;
          }
          if (this.field_V < 0) {
            this.field_V = 0;
          }
          if (-this.field_M + param2 < this.field_mb) {
            this.field_mb = param2 - this.field_M;
          }
          this.field_E = 0;
          this.field_vb = 0;
          this.field_U = param0 + this.field_mb;
          if (this.field_V > -this.field_pb + param4) {
            this.field_V = param4 - this.field_pb;
          }
          this.field_wb = param3 + this.field_V;
        }
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Chess.field_G;
        try {
          var4_int = -1;
          for (var5 = param2; var5 < param3; var5++) {
            var4_int = dn.field_e[(param1[var5] ^ var4_int) & 255] ^ var4_int >>> 8;
          }
          if (param0 >= -31) {
            field_J = (String) null;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ci.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void j(int param0) {
        if (param0 > -36) {
          return;
        }
        String var2 = (String) null;
        ld.a(oc.field_o, (String) null, 0);
    }

    final static boolean f(int param0) {
        if (param0 > -10) {
          return false;
        }
        return pd.field_Rb.field_Fb == gb.field_t ? true : false;
    }

    final void a(boolean param0, byte param1) {
        gd.field_e = !param0 ? true : false;
        if (param1 != 88) {
          this.field_I = (jc) null;
        }
        fg.field_b = !param0 ? true : false;
        this.a(0, true, wb.field_h, 0, wb.field_c, 122);
    }

    protected ci() {
        this.field_yb = -2147483648;
        this.field_B = false;
        this.field_ob = false;
        this.field_R = -2147483648;
        this.field_P = -1;
        this.field_bb = -2147483648;
        this.field_eb = 256;
        this.field_G = -2147483648;
        this.field_T = -1;
        this.field_O = -1;
        this.field_X = 256;
        this.field_y = -2147483648;
        this.field_A = -1;
        this.field_Y = -2147483648;
        this.field_tb = true;
    }

    final void a(boolean param0, ci param1, int param2, ci param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!param0) {
            this.e((byte) -117);
          }
          if (param1 == null) {
            param3.field_vb = 0;
            param3.field_V = 0;
          } else {
            param3.field_vb = param1.field_vb + param1.field_N;
            param3.field_V = param1.field_pb + param1.field_V + param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ci.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    ci(long param0, ci param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_yb = -2147483648;
        this.field_B = false;
        this.field_ob = false;
        this.field_R = -2147483648;
        this.field_P = -1;
        this.field_bb = -2147483648;
        this.field_eb = 256;
        this.field_G = -2147483648;
        this.field_T = -1;
        this.field_O = -1;
        this.field_X = 256;
        this.field_y = -2147483648;
        this.field_A = -1;
        this.field_Y = -2147483648;
        this.field_tb = true;
        try {
          this.field_mb = param2;
          this.field_pb = param5;
          this.field_V = param3;
          this.field_e = param0;
          this.field_M = param4;
          this.a(param1, -2147483648);
          if (param6 != null) {
            this.field_db = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ci.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_ub = new ed();
        field_x = "Auto-respond to <%0>";
    }
}
