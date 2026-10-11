/*
 * Decompiled by CFR-JS 0.4.0.
 */
class SceneWidget extends dh {
    int field_Kb;
    static boolean field_J;
    static java.awt.Frame field_N;
    int field_Ib;
    int field_Lb;
    RgbSprite[] field_H;
    int field_qb;
    RgbSprite field_db;
    int field_Y;
    int field_ab;
    int field_lb;
    private boolean field_vb;
    boolean field_K;
    int field_xb;
    int field_Fb;
    int field_Z;
    int field_Mb;
    boolean field_P;
    int field_yb;
    int field_cb;
    private int field_Q;
    RgbSprite field_Pb;
    int field_sb;
    String field_S;
    private int field_Nb;
    static int field_Jb;
    private int field_X;
    static boolean field_pb;
    int field_Qb;
    RgbSprite[] field_bb;
    static SceneWidget field_ib;
    int field_W;
    int field_V;
    static String field_Bb;
    int field_gb;
    int field_Rb;
    String field_Db;
    int field_zb;
    int field_eb;
    RgbSprite field_Ob;
    private boolean field_R;
    boolean field_T;
    RgbSprite[] field_mb;
    RgbSprite[] field_Ab;
    static String[] field_jb;
    boolean field_U;
    boolean field_G;
    RgbSprite field_Hb;
    RgbSprite[] field_I;
    int field_ub;
    private int field_Gb;
    int field_ob;
    int field_rb;
    BitmapFont field_L;
    RgbSprite field_fb;
    int field_Eb;
    static int field_hb;
    private int field_O;
    boolean field_kb;
    int field_nb;
    int field_Cb;
    private int field_wb;
    NodeDeque field_M;
    private boolean field_tb;

    final void b(SceneWidget param0, int param1) {
        boolean stackIn_95_1 = false;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != null) {
            if (param0.field_vb) {
              this.field_vb = param0.field_vb;
            }
            if (null != param0.field_S) {
              this.field_S = param0.field_S;
            }
            if (param0.field_db != null) {
              this.field_db = param0.field_db;
            }
            if (null != param0.field_Pb) {
              this.field_Pb = param0.field_Pb;
            }
            if (null != param0.field_fb) {
              this.field_fb = param0.field_fb;
            }
            if (param0.field_rb >= 0) {
              this.field_rb = param0.field_rb;
            }
            if (!param0.field_T) {
              this.field_T = param0.field_T;
            }
            if (param0.field_I != null) {
              this.field_I = param0.field_I;
            }
            if (null != param0.field_bb) {
              this.field_bb = param0.field_bb;
            }
            if (param0.field_P) {
              this.field_P = param0.field_P;
            }
            if (null != param0.field_H) {
              this.field_H = param0.field_H;
            }
            if (param0.field_Ob != null) {
              this.field_Ob = param0.field_Ob;
            }
            if (param0.field_Mb >= 0) {
              this.field_Mb = param0.field_Mb;
            }
            if (null != param0.field_Db) {
              this.field_Db = param0.field_Db;
            }
            if (param0.field_L != null) {
              this.field_L = param0.field_L;
            }
            if (param0.field_G) {
              this.field_G = param0.field_G;
            }
            if (param0.field_nb != 0) {
              this.field_nb = param0.field_nb;
            }
            if (param0.field_R) {
              this.field_R = param0.field_R;
            }
            if (param0.field_ub != 0) {
              this.field_ub = param0.field_ub;
            }
            if (param0.field_Ab != null) {
              this.field_Ab = param0.field_Ab;
            }
            if (0 <= param0.field_xb) {
              this.field_xb = param0.field_xb;
            }
            if (0 <= param0.field_yb) {
              this.field_yb = param0.field_yb;
            }
            if (param0.field_mb != null) {
              this.field_mb = param0.field_mb;
            }
            if (null != param0.field_Hb) {
              this.field_Hb = param0.field_Hb;
            }
            if (param0.field_Ib != 0) {
              this.field_Ib = param0.field_Ib;
            }
            if (param0.field_V != 256) {
              this.field_V = param0.field_V;
            }
            if (-2147483648 != param0.field_ob) {
              this.field_ob = param0.field_ob;
            }
            if (param0.field_sb != 0) {
              this.field_sb = param0.field_sb;
            }
            if (0 != param0.field_Fb) {
              this.field_Fb = param0.field_Fb;
            }
            if (param0.field_Q != -2147483648) {
              this.field_Q = param0.field_Q;
            }
            if (param0.field_Qb != -2147483648) {
              this.field_Qb = param0.field_Qb;
            }
            if (param0.field_O != -2147483648) {
              this.field_O = param0.field_O;
            }
            if (param0.field_U) {
              this.field_U = param0.field_U;
            }
            if (param0.field_Kb != 0) {
              this.field_Kb = param0.field_Kb;
            }
            stackIn_95_1 = (this.field_vb) && (param0.field_tb);
            this.field_tb = stackIn_95_1;
            if (param0.field_qb != 0) {
              this.field_qb = param0.field_qb;
            }
            if (param0.field_Z != -2147483648) {
              this.field_Z = param0.field_Z;
            }
            if (-2147483648 != param0.field_ab) {
              this.field_ab = param0.field_ab;
            }
          }
          if (param1 != 6402) {
            this.a(true, -21, false, false, false, true, -17, -32, (byte) -30, 93, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_108_0 = var3;
          stackIn_108_1 = new StringBuilder().append("gh.DA(");
          if (param0 == null) {
            stackIn_109_2 = "null";
          } else {
            stackIn_109_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_108_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_jb = null;
        field_N = null;
        if (param0) {
          field_J = true;
        }
        field_Bb = null;
        field_ib = null;
    }

    final int g(int param0) {
        if (param0 != -2147483648) {
          SceneWidget var3 = (SceneWidget) null;
          this.a((SceneWidget) null, 37);
        }
        return this.b(param0 + 2147483550, 2147483647);
    }

    private final SceneWidget a(long param0, int param1) {
        SceneWidget var7 = null;
        SceneWidget var5 = null;
        int var6 = SteelSentinels.obfuscationControl;
        if (~this.key == ~param0) {
          return this;
        }
        if (this.field_M != null) {
          var7 = (SceneWidget) (this.field_M.first(13058));
          while (var7 != null) {
            var5 = var7.a(param0, 3318);
            if (var5 != null) {
              return var5;
            }
            var7 = (SceneWidget) (this.field_M.next((byte) -96));
          }
        }
        if (param1 == 3318) {
          return null;
        }
        this.field_Rb = -50;
        return null;
    }

    final void a(byte param0, boolean param1) {
        db.field_d = !param1 ? true : false;
        int var3 = -36 % ((65 - param0) / 41);
        bh.field_f = !param1 ? true : false;
        this.a(true, SoftwareRaster.field_c, 0, SoftwareRaster.field_j, (byte) -123, 0);
    }

    final static int i(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = SteelSentinels.obfuscationControl;
        try {
          ag.field_p.a((byte) 86, true, FunOrbClient.field_u, bd.field_d);
          ag.field_p.h((byte) -4);
          while (dl.f(22759)) {
            ag.field_p.a(true, ei.field_q, de.field_c);
          }
          if (-1 != ma.field_V) {
            var1_int = ma.field_V;
            hc.a(-1, 0);
            stackIn_6_0 = var1_int;
            return stackIn_6_0;
          }
          if (kc.field_A) {
            stackIn_10_0 = 3;
            return stackIn_10_0;
          }
          if (nj.field_ab == jn.field_b) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (param0 <= 96) {
            SceneWidget.a(true);
          }
          if (!gf.field_a.a((byte) -72)) {
            stackIn_19_0 = 1;
            return stackIn_19_0;
          }
          if (cb.field_j != nj.field_ab) {
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_22_0 = 2;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "gh.N(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1, SceneWidget param2, SceneWidget param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 == null) {
            param3.field_eb = 0;
            param3.field_gb = 0;
          } else {
            param3.field_gb = param2.field_gb + param2.field_lb;
            param3.field_eb = param0 + (param2.field_eb + param2.field_Lb);
          }
          if (param1 < 64) {
            this.field_bb = (RgbSprite[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("gh.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(SceneWidget param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null == this.field_M) {
            this.field_M = new NodeDeque();
          }
          this.field_M.addLast(3, param0);
          if (param1 < 117) {
            this.a(46, 9, 12, -84, 107);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gh.T(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4, boolean param5, int param6, int param7, byte param8, int param9, boolean param10) {
        boolean stackIn_6_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        RgbSprite[] var16;
        RgbSprite var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        SceneWidget var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = SteelSentinels.obfuscationControl;
        this.field_cb = this.field_eb + param9;
        this.field_Rb = param1 + this.field_Y;
        var12 = SoftwareRaster.field_i;
        var13 = SoftwareRaster.field_l;
        var14 = SoftwareRaster.field_b;
        var15 = SoftwareRaster.field_d;
        if (param8 <= 15) {
          this.field_ub = -78;
        }
        SoftwareRaster.h(this.field_Rb, this.field_cb, this.field_zb + this.field_Rb, this.field_cb + this.field_Lb);
        param0 = param0 & this.field_T;
        if (!this.field_R) {
          param4 = this.field_kb;
          stackIn_6_0 = (0 != this.field_W);
          param2 = stackIn_6_0;
          param5 = this.field_G;
        }
        var16 = this.field_I;
        var17 = this.field_Pb;
        var18 = this.field_nb;
        var19 = 0;
        var20 = 0;
        if (!param0) {
          if (null != this.field_Ob) {
            var17 = this.field_Ob;
          }
          if (null != this.field_H) {
            var16 = this.field_H;
          }
          if (this.field_yb >= 0) {
            var18 = this.field_yb;
          }
        }
        if (param4) {
          if (null != this.field_db) {
            var17 = this.field_db;
          }
          if (0 <= this.field_rb) {
            var18 = this.field_rb;
          }
          if (null != this.field_Ab) {
            var16 = this.field_Ab;
          }
          if (this.field_Q != -2147483648) {
            var20 = this.field_Q;
          }
          if (this.field_O != -2147483648) {
            var19 = this.field_O;
          }
        }
        if (param2) {
          if (-2147483648 != this.field_ab) {
            var20 = this.field_ab;
          }
          if (null != this.field_fb) {
            var17 = this.field_fb;
          }
          if (this.field_Z != -2147483648) {
            var19 = this.field_Z;
          }
          if (0 <= this.field_xb) {
            var18 = this.field_xb;
          }
          if (null != this.field_mb) {
            var16 = this.field_mb;
          }
        }
        if (param5) {
          if (-2147483648 != this.field_Qb) {
            var19 = this.field_Qb;
          }
          if (this.field_ob != -2147483648) {
            var20 = this.field_ob;
          }
          if (this.field_Hb != null) {
            var17 = this.field_Hb;
          }
          if (this.field_bb != null) {
            var16 = this.field_bb;
          }
          if (0 <= this.field_Mb) {
            var18 = this.field_Mb;
          }
        }
        var21 = this.field_qb + var19;
        var22 = this.field_sb + var20;
        if (!this.field_P) {
          hb.a((byte) -64, var16, this.field_zb, this.field_cb, this.field_Rb, this.field_Lb);
        } else {
          hb.a((byte) -120, var16, param6, param9, param1, param7);
        }
        if (var17 != null) {
          var23_int = var21 + this.field_Rb;
          if (this.field_Kb == 1) {
            var23_int = var23_int + (this.field_zb - var17.field_z) / 2;
          }
          var24 = this.field_cb + var22;
          if (this.field_Fb == 1) {
            var24 = var24 + (-var17.field_B + this.field_Lb) / 2;
          }
          if (this.field_Kb == 2) {
            var23_int = var23_int + (this.field_zb - var17.field_z);
          }
          if (2 == this.field_Fb) {
            var24 = var24 + (-var17.field_B + this.field_Lb);
          }
          if (this.field_X >= 256) {
            var17.a(var23_int, var24);
          } else {
            var17.b(var23_int, var24, this.field_X);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_S &&
          this.field_L != null) {
          var26 = this.field_S;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param10 &&
            this.field_Db != null) {
            var23Lifetime2 = var26 + this.field_Db;
          }
          if (this.field_L.c(var23Lifetime2) <= this.field_zb - 2 * this.field_ub &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.field_Fb != 1) {
              if (2 == this.field_Fb) {
                var22 = var22 + (-this.field_L.field_G + (-this.field_L.field_F + this.field_Lb));
              }
            } else {
              var22 = var22 + (-this.field_L.field_F + this.field_Lb - this.field_L.field_G) / 2;
            }
            if (this.field_Kb == 0) {
              this.field_L.a(var23Lifetime2, var21 + this.field_Rb + this.field_ub, this.field_L.field_G + var22 + this.field_cb, var18, -1, this.field_V);
            } else {
              if (this.field_Kb == 1) {
                this.field_L.c(var23Lifetime2, (this.field_zb - this.field_ub * 2) / 2 + this.field_Rb + (this.field_ub + var21), this.field_L.field_G + var22 + this.field_cb, var18, -1, this.field_V);
              } else {
                if (this.field_Kb != 2) {
                  this.field_L.a(var23Lifetime2, this.field_Rb + (this.field_ub + var21), var22 + this.field_cb, this.field_zb - this.field_ub * 2, this.field_Lb, var18, -1, this.field_V, this.field_Kb, this.field_Fb, this.field_Ib);
                } else {
                  this.field_L.b(var23Lifetime2, -(this.field_ub * 2) - (-this.field_zb - (var21 + this.field_ub) - this.field_Rb), this.field_L.field_G + (this.field_cb + var22), var18, -1, this.field_V);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_L.a(var23Lifetime2, this.field_Rb - (-this.field_ub - var21), var22 + this.field_cb, -(this.field_ub * 2) + this.field_zb, this.field_Lb, var18, -1, this.field_V, this.field_Kb, this.field_Fb, this.field_Ib);
          }
        }
        if (null != this.field_M) {
          var23_ref = (SceneWidget) (this.field_M.first(13058));
          while (var23_ref != null) {
            var23_ref.a(param0, this.field_Rb + var19, param2, this.field_tb, param4, param5, this.field_zb, this.field_Lb, (byte) 81, this.field_cb + var20, param10);
            var23_ref = (SceneWidget) (this.field_M.next((byte) -78));
          }
        }
        SoftwareRaster.a(var12, var13, var14, var15);
    }

    final SceneWidget a(String param0, boolean param1) {
        RuntimeException var3 = null;
        java.applet.Applet var4 = null;
        CharSequence var5 = null;
        SceneWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var4 = (java.applet.Applet) null;
            SceneWidget.a(25, (java.applet.Applet) null);
          }
          var5 = (CharSequence) ((Object) param0);
          stackIn_3_0 = this.a(ke.a(var5, (byte) -48), 3318);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gh.EA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    SceneWidget(String param0, SceneWidget param1) {
        this(ke.a((CharSequence) ((Object) param0), (byte) -48), param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(boolean param0, int param1, int param2, int param3, byte param4, int param5) {
        boolean stackIn_33_1 = false;
        boolean stackIn_38_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        SceneWidget var14;
        int var15;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        var15 = SteelSentinels.obfuscationControl;
        var7 = 10 / ((param4 + 71) / 51);
        if (this.field_Gb > 0) {
          var8 = -(-this.field_Gb >> 2);
        } else {
          var8 = this.field_Gb >> 2;
        }
        this.field_Gb = this.field_Gb - var8;
        this.field_Y = this.field_Y + var8;
        if (this.field_gb <= 0) {
          var8Lifetime1 = this.field_gb >> 2;
        } else {
          var8Lifetime1 = -(-this.field_gb >> 2);
        }
        this.field_gb = this.field_gb - var8Lifetime1;
        this.field_eb = this.field_eb + var8Lifetime1;
        if (this.field_wb > 0) {
          var8Lifetime2 = -(-this.field_wb >> 2);
        } else {
          var8Lifetime2 = this.field_wb >> 2;
        }
        this.field_wb = this.field_wb - var8Lifetime2;
        this.field_zb = this.field_zb + var8Lifetime2;
        if (this.field_lb <= 0) {
          var8Lifetime3 = this.field_lb >> 2;
        } else {
          var8Lifetime3 = -(-this.field_lb >> 2);
        }
        this.field_cb = param2 + this.field_eb;
        param0 = param0 & this.field_T;
        this.field_Rb = param5 + this.field_Y;
        this.field_Lb = this.field_Lb + var8Lifetime3;
        this.field_lb = this.field_lb - var8Lifetime3;
        var9 = SoftwareRaster.field_i;
        var10 = SoftwareRaster.field_l;
        var11 = SoftwareRaster.field_b;
        var12 = SoftwareRaster.field_d;
        SoftwareRaster.h(this.field_Rb, this.field_cb, this.field_zb + this.field_Rb, this.field_Lb + this.field_cb);
        var13 = 0;
        if (!db.field_d &&
          param0 &&
          lb.field_gc != 0 &&
          SoftwareRaster.field_i <= oa.field_S &&
          oa.field_S < SoftwareRaster.field_b &&
          rj.field_j >= SoftwareRaster.field_l &&
          SoftwareRaster.field_d > rj.field_j) {
          this.field_Eb = lb.field_gc;
          this.field_Nb = -this.field_cb + rj.field_j;
          this.field_Cb = -this.field_Rb + oa.field_S;
          var13 = 1;
          this.field_W = lb.field_gc;
        } else {
          if (lb.field_gc != 0) {
            this.field_W = 0;
          }
          this.field_Eb = 0;
        }
        if (0 == nc.field_d) {
          this.field_W = 0;
        }
        stackIn_33_1 = (!bh.field_f) && (SoftwareRaster.field_i <= oh.field_f) && (oh.field_f < SoftwareRaster.field_b) && (SoftwareRaster.field_l <= pi.field_c) && (pi.field_c < SoftwareRaster.field_d);
        this.field_K = stackIn_33_1;
        stackIn_38_1 = (this.field_K) && (this.field_W == nc.field_d) && (param0);
        this.field_kb = stackIn_38_1;
        if (this.field_M != null) {
          var14 = (SceneWidget) (this.field_M.b(1063677678));
          while (var14 != null) {
            var14.a(param0, this.field_zb, this.field_cb, this.field_Lb, (byte) 1, this.field_Rb);
            var14 = (SceneWidget) (this.field_M.a(-2137));
          }
        }
        if (this.field_K) {
          bh.field_f = true;
        }
        if (var13 != 0) {
          db.field_d = true;
        }
        SoftwareRaster.a(var9, var10, var11, var12);
        if (this.field_W != 0 &&
          this.field_U) {
          this.field_Y = -this.field_Cb + oh.field_f - param5;
          this.field_eb = -param2 - this.field_Nb + pi.field_c;
          if (this.field_Y < 0) {
            this.field_Y = 0;
          }
          if (this.field_Y > param1 - this.field_zb) {
            this.field_Y = param1 - this.field_zb;
          }
          if (this.field_eb < 0) {
            this.field_eb = 0;
          }
          this.field_gb = 0;
          if (this.field_eb > -this.field_Lb + param3) {
            this.field_eb = -this.field_Lb + param3;
          }
          this.field_Gb = 0;
          this.field_Rb = param5 + this.field_Y;
          this.field_cb = param2 + this.field_eb;
        }
    }

    SceneWidget(long param0, SceneWidget param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
          RuntimeException var2 = null;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_6_0 = null;
          String stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          int var6Lifetime1;
          var8 = SteelSentinels.obfuscationControl;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (hn.a(param1, (byte) -96, "getcookies"));
              var5 = ka.a(';', false, var4);
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_6_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_6_0;
                }
              }
              var6Lifetime1 = -101 % ((param0 - 12) / 44);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            if (dn.field_Ub == null) {
              return param1.getParameter("settings");
            }
            stackIn_14_0 = dn.field_Ub;
            return stackIn_14_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var2;
            stackIn_17_1 = new StringBuilder().append("gh.GA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, byte param1) {
        this.a(true, 0, false, false, false, false, SoftwareRaster.field_c, SoftwareRaster.field_j, (byte) 126, 0, param0);
        if (param1 < 125) {
          this.field_Lb = -23;
        }
    }

    final void h(int param0) {
        SceneWidget var4 = null;
        int var3 = SteelSentinels.obfuscationControl;
        if (null != this.field_M) {
          var4 = (SceneWidget) (this.field_M.b(1063677678));
          while (var4 != null) {
            var4.field_R = true;
            var4.h(42);
            var4 = (SceneWidget) (this.field_M.a(-2137));
          }
        }
        int var2 = 126 % ((param0 + 23) / 57);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_Gb = 0;
        this.field_gb = 0;
        this.field_lb = param0;
        this.field_eb = param1;
        this.field_wb = 0;
        this.field_Lb = param2;
        this.field_zb = param4;
        this.field_Y = param3;
    }

    final int b(int param0, int param1) {
        SceneWidget var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = SteelSentinels.obfuscationControl;
        int var4_intLifetime1;
        if (param0 >= -82) {
          return 28;
        }
        int var3 = 0;
        if (null != this.field_S &&
          null != this.field_L) {
          var4_int = this.field_L.a(this.field_S, param1);
          if (var3 < var4_int) {
            var3 = var4_int;
          }
        }
        if (this.field_Pb != null) {
          var4_intLifetime1 = this.field_Pb.field_z;
          if (var3 < var4_intLifetime1) {
            var3 = var4_intLifetime1;
          }
        }
        if (null != this.field_M) {
          var4 = (SceneWidget) (this.field_M.first(13058));
          while (var4 != null) {
            var5 = var4.field_Y + var4.field_zb;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (SceneWidget) (this.field_M.next((byte) -110));
          }
        }
        return var3;
    }

    final void a(int param0, byte param1, int param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        SceneWidget var10_ref_gh;
        int var10;
        int var11;
        int var9Lifetime1;
        var11 = SteelSentinels.obfuscationControl;
        var5 = -this.field_eb;
        var6 = -this.field_gb + var5;
        var7 = this.field_Lb;
        var8 = this.field_lb + var7;
        if (!param3) {
          var9 = 0;
          var10_ref_gh = (SceneWidget) (this.field_M.first(13058));
          while (var10_ref_gh != null) {
            var10_ref_gh.field_gb = var9 - var10_ref_gh.field_eb;
            var9 = var9 + (var10_ref_gh.field_Lb - (-var10_ref_gh.field_lb - param2));
            var10_ref_gh = (SceneWidget) (this.field_M.next((byte) -128));
          }
          var8 = -param2 + var9;
        }
        var9Lifetime1 = -param0 + var8;
        if (var9Lifetime1 < var6) {
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
        this.field_gb = var5 - var6;
        this.field_lb = -var7 + var8;
        if (param1 != -108) {
          this.a(false, -80, true, false, true, true, -109, -101, (byte) 10, 55, false);
        }
        this.field_eb = -var5;
        this.field_Lb = var7;
    }

    SceneWidget(long param0, SceneWidget param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    public SceneWidget() {
        this.field_vb = false;
        this.field_Q = -2147483648;
        this.field_Qb = -2147483648;
        this.field_T = true;
        this.field_Mb = -1;
        this.field_V = 256;
        this.field_ab = -2147483648;
        this.field_rb = -1;
        this.field_X = 256;
        this.field_yb = -1;
        this.field_O = -2147483648;
        this.field_xb = -1;
        this.field_Z = -2147483648;
        this.field_ob = -2147483648;
        this.field_tb = false;
    }

    SceneWidget(long param0, SceneWidget param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_vb = false;
        this.field_Q = -2147483648;
        this.field_Qb = -2147483648;
        this.field_T = true;
        this.field_Mb = -1;
        this.field_V = 256;
        this.field_ab = -2147483648;
        this.field_rb = -1;
        this.field_X = 256;
        this.field_yb = -1;
        this.field_O = -2147483648;
        this.field_xb = -1;
        this.field_Z = -2147483648;
        this.field_ob = -2147483648;
        this.field_tb = false;
        try {
          this.field_zb = param4;
          this.key = param0;
          this.field_eb = param3;
          this.field_Lb = param5;
          this.field_Y = param2;
          this.b(param1, 6402);
          if (param6 != null) {
            this.field_S = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "gh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_jb = new String[]{": <col=ff0000>LOCKED</col>", ": COMPLETE", "- <col=ffffff>TIME: <%0></col>", ": <col=8fdfff>AVAILABLE</col>", "Locked", "Complete", "Available"};
        field_Bb = "to over <%0> great games";
    }
}
