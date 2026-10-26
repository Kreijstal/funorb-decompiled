/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class wl extends GraphicsRenderer {
    private int field_ec;
    jaggl.OpenGL field_kc;
    static float[] field_Ub;
    private long field_gc;
    static int[] field_m;
    private java.awt.Canvas field_Wb;
    static Object field_r;
    static Object field_Kb;
    private int field_Yb;
    private Hashtable field_R;
    private long field_Db;
    static String field_zc;
    int field_bb;
    private int field_g;
    private lu field_pc;
    int field_Ab;
    private jk field_q;
    private vr field_vb;
    private hp field_yb;
    int field_Hb;
    private eb field_X;
    private boolean field_S;
    jaclib.memory.heap.NativeHeap field_mb;
    cs field_cc;
    private IntrusiveDeque field_jb;
    int field_hb;
    private wj field_y;
    private int field_fc;
    private up[] field_Fc;
    private er field_Ec;
    private tm field_j;
    private int field_rc;
    private up field_Rb;
    private int field_Y;
    private up field_qb;
    private up[] field_ob;
    private up[] field_Jb;
    private ph field_s;
    private int field_rb;
    private IntrusiveDeque field_Gc;
    int field_lb;
    int field_ib;
    private int field_yc;
    private IntrusiveDeque field_nb;
    private IntrusiveDeque field_Ac;
    private IntrusiveDeque field_zb;
    private IntrusiveDeque field_Gb;
    private IntrusiveDeque field_dc;
    private IntrusiveDeque field_f;
    private boolean field_uc;
    private boolean field_hc;
    private boolean field_k;
    private boolean field_P;
    private int field_z;
    private int field_Cb;
    private long field_l;
    private int field_O;
    tj field_h;
    tj field_H;
    private boolean field_V;
    int field_Lb;
    private int field_jc;
    private ee field_cb;
    private int field_e;
    private int field_oc;
    boolean field_u;
    private int field_Bb;
    private boolean field_xb;
    private boolean field_ac;
    private fq field_gb;
    private boolean field_tc;
    private boolean field_p;
    boolean field_v;
    private int field_L;
    private int field_Pb;
    float field_Fb;
    boolean field_eb;
    private int field_T;
    private int field_d;
    wj field_o;
    private float field_sc;
    int field_U;
    float field_ic;
    int field_E;
    float field_w;
    boolean field_i;
    private int field_db;
    boolean field_x;
    private boolean field_Bc;
    private int field_Q;
    private float field_D;
    private float field_fb;
    boolean field_G;
    private int field_kb;
    private int field_Ib;
    boolean field_Cc;
    nr field_Vb;
    private boolean field_vc;
    float field_wb;
    boolean field_J;
    private int field_Sb;
    private String field_sb;
    private float field_ab;
    private int field_W;
    private float[] field_pb;
    private int field_wc;
    private int field_K;
    private boolean field_xc;
    private int field_F;
    int field_Xb;
    private boolean field_Mb;
    private rt[] field_bc;
    private boolean field_Eb;
    private int field_ub;
    private boolean field_I;
    private float field_t;
    int field_C;
    float field_Tb;
    int field_tb;
    boolean field_Nb;
    private boolean field_M;
    private fq field_Qb;
    private boolean field_qc;
    private float field_Zb;
    boolean field_A;
    boolean field_nc;
    private int field_Z;
    private int field_mc;
    float[] field_n;
    private int field_N;
    int field_Dc;
    boolean field_lc;
    private int field_Ob;
    private String field_B;

    final RenderSprite a(vd param0, boolean param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        RenderSprite stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        RenderSprite var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var10 = new int[param0.field_h * param0.field_c];
          var12 = var10;
          var11 = var12;
          var3 = var11;
          var4 = 0;
          var5 = 0;
          if (param0.field_e != null) {
            for (var6_int = 0; var6_int < param0.field_c; var6_int++) {
              for (var7 = 0; param0.field_h > var7; var7++) {
                incrementValue$0 = var5;
                var5++;
                var3[incrementValue$0] = vo.a(param0.field_f[pg.a(255, (int) param0.field_d[var4])], param0.field_e[var4] << 24);
                var4++;
              }
            }
          } else {
            for (var6_int = 0; var6_int < param0.field_c; var6_int++) {
              for (var7 = 0; param0.field_h > var7; var7++) {
                incrementValue$1 = var4;
                var4++;
                var8 = param0.field_f[param0.field_d[incrementValue$1] & 255];
                incrementValue$2 = var5;
                var5++;
                stackIn_8_0 = var10;
                stackIn_8_1 = incrementValue$2;
                if (var8 == 0) {
                  stackIn_9_2 = 0;
                } else {
                  stackIn_9_2 = vo.a(var8, -16777216);
                }
                stackIn_8_0[stackIn_8_1] = stackIn_9_2;
              }
            }
          }
          var6 = this.a(97, param0.field_c, var12, 0, param0.field_h, param0.field_h);
          var6.a(param0.field_a, param0.field_i, param0.field_g, param0.field_b);
          stackIn_18_0 = var6;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("wl.HA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final void f(int param0, int param1) {
        if (param0 != this.field_db ||
          this.field_Ob != param1) {
          this.field_db = param0;
          this.field_Ob = param1;
          this.u(3);
          this.k(-107);
          if (this.field_N == 3) {
            this.d(5888);
          } else {
            if (2 == this.field_N) {
              this.d((byte) 125);
            }
          }
        }
    }

    final int[] a(int param0, int param1, byte param2, int param3, int param4) {
        int var7 = 0;
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param2 != -78) {
          up var9 = (up) null;
          this.a((up) null, (byte) -74);
        }
        int[] var10 = new int[param3 * param1];
        int[] var6 = var10;
        for (var7 = 0; param1 > var7; var7++) {
          jaggl.OpenGL.glReadPixelsi(param0, -param4 + (this.field_bb - var7), param3, 1, 32993, this.field_tb, var10, var7 * param3);
        }
        return var10;
    }

    private final void a(int param0, int param1, boolean param2) {
        this.a(true, param0, (byte) 125, param2);
        if (param1 != 4873) {
          this.c(80, -100);
        }
    }

    final void a(rt param0, int param1) {
        rt var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 != 1) {
            return;
          }
          var3 = this.field_bc[this.field_Pb];
          if (param0 != var3) {
            if (param0 == null) {
              jaggl.OpenGL.glDisable(var3.field_f);
            } else {
              if (var3 == null) {
                jaggl.OpenGL.glEnable(param0.field_f);
              } else {
                if (param0.field_f != var3.field_f) {
                  jaggl.OpenGL.glDisable(var3.field_f);
                  jaggl.OpenGL.glEnable(param0.field_f);
                }
              }
              jaggl.OpenGL.glBindTexture(param0.field_f, param0.a(125));
            }
            this.field_bc[this.field_Pb] = param0;
          }
          this.field_O = this.field_O & -2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("wl.TA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void m(int param0) {
        if (param0 != 5149) {
          this.c(-102, -84);
        }
    }

    wl(java.awt.Canvas param0, d param1, int param2) {
        super(param1);
        long dupTemp$4 = 0L;
        int var9 = 0;
        int stackIn_12_1 = 0;
        boolean stackIn_51_1 = false;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var4_int = 0;
        Throwable var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        Throwable var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        String var10 = null;
        Exception var11 = null;
        String var13 = null;
        int[] var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        CharSequence var21 = null;
        CharSequence var22 = null;
        CharSequence var23 = null;
        var18 = null;
        var19 = null;
        var20 = null;
        this.field_R = new Hashtable();
        this.field_Ab = 128;
        this.field_q = new jk();
        tj discarded$0 = new tj();
        tj discarded$1 = new tj();
        this.field_S = false;
        this.field_jb = new IntrusiveDeque();
        this.field_Fc = new up[4];
        this.field_Y = -1;
        this.field_rc = -1;
        this.field_fc = -1;
        this.field_ob = new up[4];
        this.field_Jb = new up[4];
        this.field_Ec = new er();
        this.field_s = new ph(16);
        this.field_Gc = new IntrusiveDeque();
        this.field_nb = new IntrusiveDeque();
        this.field_Ac = new IntrusiveDeque();
        this.field_zb = new IntrusiveDeque();
        this.field_Gb = new IntrusiveDeque();
        this.field_dc = new IntrusiveDeque();
        this.field_f = new IntrusiveDeque();
        tj discarded$2 = new tj();
        this.field_h = new tj();
        this.field_H = new tj();
        this.field_Lb = 0;
        this.field_Bb = 8448;
        this.field_ic = 1.0f;
        this.field_w = 1.0f;
        this.field_db = 50;
        this.field_U = -1;
        this.field_D = 1.0f;
        this.field_d = 0;
        this.field_L = 0;
        this.field_p = true;
        this.field_wb = 1.0f;
        this.field_W = 8448;
        this.field_wc = 0;
        this.field_Ib = 0;
        this.field_sc = 1.0f;
        this.field_ub = 512;
        this.field_pb = new float[16];
        this.field_oc = 0;
        this.field_T = 0;
        this.field_e = 0;
        this.field_C = -1;
        this.field_F = -1;
        this.field_vc = false;
        this.field_jc = 0;
        this.field_Dc = -1;
        this.field_mc = 512;
        this.field_n = new float[4];
        this.field_Ob = 3584;
        this.field_Zb = 0.0f;
        this.field_Q = 0;
        du discarded$3 = new du(8192);
        try {
          this.field_Wb = param0;
          this.field_Hb = param2;
          if (!ei.a("jaclib", (byte) -16)) {
            throw new RuntimeException("");
          }
          if (!ei.a("jaggl", (byte) -16)) {
            throw new RuntimeException("");
          }
          try {
            this.field_kc = new jaggl.OpenGL();
            dupTemp$4 = this.field_kc.init(param0, 8, 8, 8, 24, 0, this.field_Hb);
            this.field_Db = dupTemp$4;
            this.field_gc = dupTemp$4;
            if (0L == this.field_Db) {
              throw new RuntimeException("");
            }
            this.b(false);
            var4_int = this.e((byte) -94);
            if (var4_int != 0) {
              throw new RuntimeException("");
            }
            if (!this.field_V) {
              stackIn_12_1 = 5121;
            } else {
              stackIn_12_1 = 33639;
            }
            this.field_tb = stackIn_12_1;
            if (this.field_sb.indexOf("radeon") != -1) {
              var5_int = 0;
              var6 = 0;
              var7 = 0;
              var8 = ee.a((byte) 10, ' ', this.field_sb.replace('/', ' '));
              for (var9 = 0; var8.length > var9; var9++) {
                var13 = var8[var9];
                var10 = var13;
                var10 = var13;
                var10 = var13;
                try {
                  boolean decompiledFrameRemainder0 = true;
                  if (var13.length() > 0) {
                    if (120 == var13.charAt(0) &&
                      var13.length() >= 3) {
                      var21 = (CharSequence) ((Object) var13.substring(1, 3));
                      if (vl.a(10, var21)) {
                        var7 = 1;
                        var10 = var13.substring(1);
                      }
                    }
                    if (var10.equals("hd")) {
                      var6 = 1;
                    } else {
                      if (var10.startsWith("hd")) {
                        var6 = 1;
                        var10 = var10.substring(2);
                      }
                      if (var10.length() >= 4) {
                        var22 = (CharSequence) ((Object) var10.substring(0, 4));
                        if (vl.a(10, var22)) {
                          var23 = (CharSequence) ((Object) var10.substring(0, 4));
                          var5_int = td.a(var23, (byte) 38);
                          decompiledRegionSelector0 = 1;
                          decompiledFrameRemainder0 = false;
                        }
                      }
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    decompiledRegionSelector0 = 0;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var11 = (Exception) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 0;
                }
                if (decompiledRegionSelector0 == 0) {
                  continue;
                }
                break;
              }
              if (var6 == 0 ||
                var5_int < 4000) {
                this.field_J = false;
              }
              if (var7 == 0 &&
                var6 == 0) {
                if (var5_int >= 7000 &&
                  7999 >= var5_int) {
                  this.field_M = false;
                }
                if (var5_int >= 7000 &&
                  var5_int <= 9250) {
                  this.field_G = false;
                }
              }
              this.field_u = this.field_u & this.field_kc.a("GL_ARB_half_float_pixel");
              this.field_xb = this.field_M;
            }
            if (this.field_B.indexOf("intel") != -1) {
              this.field_A = false;
            }
            stackIn_51_1 = !(this.field_B.equals("s3 graphics"));
            this.field_Eb = stackIn_51_1;
            if (this.field_M) {
              try {
                var17 = new int[1];
                jaggl.OpenGL.glGenBuffersARB(1, var17, 0);
              } catch (java.lang.Throwable decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var5 = decompiledCaughtException;
                throw new RuntimeException("");
              }
            }
            fr.a(false, 0, true);
            this.field_S = true;
            this.field_X = new eb(this, this.field_a);
            this.x(-26394);
            this.field_cc = new cs(this);
            this.field_pc = new lu(this);
            if (this.field_pc.b(1)) {
              this.field_yb = new hp(this);
              if (!this.field_yb.e(0)) {
                this.field_yb.a((byte) -31);
                this.field_yb = null;
              }
            }
            this.field_vb = new vr(this);
            this.f((byte) -66);
            this.s(-11103);
            this.e();
            return;
          } catch (java.lang.Throwable decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var4 = decompiledCaughtException;
            var4.printStackTrace();
            this.c();
            throw new RuntimeException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_63_0 = var4_ref;
          stackIn_63_1 = new StringBuilder().append("wl.<init>(");
          if (param0 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param1 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        int incrementValue$0 = 0;
        int var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0) {
          this.d(56);
        }
        int var2 = 0;
        while (!this.field_kc.b()) {
          incrementValue$0 = var2;
          var2++;
          if (incrementValue$0 > 5) {
            throw new RuntimeException("");
          }
          IntrusiveNode.a(1000L, false);
        }
    }

    private final void a(float param0, float param1, float param2, int param3) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (this.field_Bc) {
          jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glTranslatef(param1, param2, param0);
        jaggl.OpenGL.glMatrixMode(param3);
        this.field_Bc = true;
    }

    final void K(int[] param0) {
        try {
          param0[3] = this.field_Q;
          param0[0] = this.field_L;
          param0[2] = this.field_d;
          param0[1] = this.field_e;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wl.K(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7;
        float var8;
        float var9;
        this.j(1);
        this.b((byte) -122, param5);
        var7 = (float)param2 - (float)param0;
        var8 = (float)param3 - (float)param1;
        if (0.0f == var7 &&
          0.0f == var8) {
          var7 = 1.0f;
        } else {
          var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
          var8 = var8 * var9;
          var7 = var7 * var9;
        }
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param0, (float)param1 + 0.3499999940395355f);
        jaggl.OpenGL.glVertex2f(var7 + (float)param2 + 0.3499999940395355f, 0.3499999940395355f + (var8 + (float)param3));
        jaggl.OpenGL.glEnd();
    }

    final synchronized void b(int param0, int param1, int param2) {
        int var5 = 40 / ((69 - param2) / 47);
        iq var4 = new iq(param1);
        var4.key = (long)param0;
        this.field_Ac.addLast(80, var4);
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
          param0 = 0;
        }
        if (this.field_bb < param3) {
          param3 = this.field_bb;
        }
        if (param2 > this.field_ec) {
          param2 = this.field_ec;
        }
        if (param1 < 0) {
          param1 = 0;
        }
        this.field_e = param1;
        this.field_Q = param3;
        this.field_d = param2;
        this.field_L = param0;
        jaggl.OpenGL.glEnable(3089);
        this.m(5149);
        this.v(0);
    }

    final q c(boolean param0) {
        if (!param0) {
          this.a(108, (byte) -128);
        }
        return this.field_cb == null ? null : this.field_cb.b((byte) 127);
    }

    final void a(byte param0) {
        if (this.field_O != 4) {
          this.h(-84);
          this.a(false, false);
          this.b(false, (byte) -125);
          this.c(false, param0 ^ -117);
          this.a(false, (byte) -28);
          this.g(-2, -100);
          this.b((byte) -103, 1);
          this.field_O = 4;
        }
        if (param0 != 10) {
          this.g(9);
        }
    }

    private final void f(int param0) {
        if (param0 != 8960) {
          this.d(-118);
        }
        this.field_kc.a();
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.j(1);
        this.b((byte) 35, param4);
        float var6 = 0.3499999940395355f + (float)param0;
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
        float var7 = 0.3499999940395355f + (float)param1;
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(var6, var7);
        jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
        jaggl.OpenGL.glEnd();
    }

    final int b(boolean param0, int param1) {
        if (!param0) {
          this.a(-87, -43, true);
        }
        if (param1 == 1) {
          return 7681;
        }
        if (param1 == 0) {
          return 8448;
        }
        if (param1 == 2) {
          return 34165;
        }
        if (param1 == 3) {
          return 260;
        }
        if (param1 != 4) {
          throw new IllegalArgumentException();
        }
        return 34023;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        if (this.field_Pb != 0) {
          jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
          jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
        } else {
          var4 = 0;
          if (this.field_Bb != param0) {
            jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
            this.field_Bb = param0;
            var4 = 1;
          }
          if (param2 != this.field_W) {
            jaggl.OpenGL.glTexEnvi(8960, 34162, param2);
            this.field_W = param2;
            var4 = 1;
          }
          if (var4 != 0) {
            this.field_O = this.field_O & -30;
          }
        }
        if (param1 != -26625) {
          this.field_Xb = 59;
        }
    }

    private final void o(int param0) {
        if (param0 != 0) {
          this.field_kc = (jaggl.OpenGL) null;
        }
        jaggl.OpenGL.glViewport(this.field_wc, this.field_T, this.field_ec, this.field_bb);
    }

    final void a(za param0) {
        hl discarded$2 = null;
        hl discarded$3 = null;
        du var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_mb = ((im) (param0)).field_g;
          if (null == this.field_gb) {
            var3 = new du(80);
            if (!this.field_V) {
              var3.b((byte) -90, -1.0f);
              var3.b((byte) -90, -1.0f);
              var3.b((byte) -90, 0.0f);
              var3.b((byte) -90, 0.0f);
              var3.b((byte) -90, 1.0f);
              var3.b((byte) -90, 1.0f);
              var3.b((byte) -90, -1.0f);
              var3.b((byte) -90, 0.0f);
              var3.b((byte) -90, 1.0f);
              var3.b((byte) -90, 1.0f);
              var3.b((byte) -90, 1.0f);
              var3.b((byte) -90, 1.0f);
              var3.b((byte) -90, 0.0f);
              var3.b((byte) -90, 1.0f);
              var3.b((byte) -90, 0.0f);
              var3.b((byte) -90, -1.0f);
              var3.b((byte) -90, 1.0f);
              var3.b((byte) -90, 0.0f);
              var3.b((byte) -90, 0.0f);
              var3.b((byte) -90, 0.0f);
            } else {
              var3.a((byte) 125, -1.0f);
              var3.a((byte) 127, -1.0f);
              var3.a((byte) 115, 0.0f);
              var3.a((byte) 108, 0.0f);
              var3.a((byte) 82, 1.0f);
              var3.a((byte) 64, 1.0f);
              var3.a((byte) 102, -1.0f);
              var3.a((byte) 90, 0.0f);
              var3.a((byte) 116, 1.0f);
              var3.a((byte) 82, 1.0f);
              var3.a((byte) 87, 1.0f);
              var3.a((byte) 102, 1.0f);
              var3.a((byte) 75, 0.0f);
              var3.a((byte) 81, 1.0f);
              var3.a((byte) 113, 0.0f);
              var3.a((byte) 60, -1.0f);
              var3.a((byte) 72, 1.0f);
              var3.a((byte) 104, 0.0f);
              var3.a((byte) 95, 0.0f);
              var3.a((byte) 60, 0.0f);
            }
            this.field_gb = this.a((byte) -49, 20, var3.payload, var3.position, false);
            discarded$2 = new hl(this.field_gb, 5126, 3, 0);
            discarded$3 = new hl(this.field_gb, 5126, 2, 12);
            this.field_q.a((byte) 102, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("wl.NA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final synchronized void d(int param0, int param1) {
        int var3 = 19 / ((param0 + 68) / 56);
        IntrusiveNode var4 = new IntrusiveNode();
        var4.key = (long)param1;
        this.field_dc.addLast(110, var4);
    }

    private final void l(int param0) {
        this.field_d = this.field_ec;
        if (param0 != 24643) {
          return;
        }
        this.field_Q = this.field_bb;
        this.field_L = 0;
        this.field_e = 0;
        jaggl.OpenGL.glDisable(3089);
        this.m(5149);
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.g(-2, -88);
        for (var2 = this.field_Xb - 1; var2 >= 0; var2--) {
          this.a(false, var2);
          this.a((rt) null, 1);
          jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.a(8448, param0 ^ 26689, 8448);
        this.a(34168, 770, param0 + 34242, 2);
        this.q(-127);
        this.field_Cb = 1;
        jaggl.OpenGL.glEnable(3042);
        jaggl.OpenGL.glBlendFunc(770, 771);
        this.field_z = 1;
        jaggl.OpenGL.glEnable(3008);
        jaggl.OpenGL.glAlphaFunc(516, 0.0f);
        this.field_k = true;
        jaggl.OpenGL.glColorMask(true, true, true, true);
        this.field_hc = true;
        this.a(false, true);
        this.b(true, (byte) -125);
        this.c(true, param0 - 61);
        this.a(true, (byte) -28);
        if (param0 != -66) {
          return;
        }
        this.p(param0 + 189);
        this.field_kc.setSwapInterval(0);
        jaggl.OpenGL.glShadeModel(7425);
        jaggl.OpenGL.glClearDepth(1.0f);
        jaggl.OpenGL.glDepthFunc(515);
        jaggl.OpenGL.glPolygonMode(1028, 6914);
        jaggl.OpenGL.glEnable(2884);
        jaggl.OpenGL.glCullFace(1029);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glColorMaterial(1028, 5634);
        jaggl.OpenGL.glEnable(2903);
        float[] var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
        for (var3 = 0; var3 < 8; var3++) {
          var4 = var3 + 16384;
          jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
          jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
          jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
        }
        jaggl.OpenGL.glEnable(16384);
        jaggl.OpenGL.glEnable(16385);
        jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
        jaggl.OpenGL.glFogi(2917, 9729);
        jaggl.OpenGL.glHint(3156, 4353);
        this.field_F = -1;
        this.l(24643);
    }

    private final void a(boolean param0, int param1, byte param2, boolean param3) {
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        Object var5;
        int var6;
        int var7;
        int var8;
        int var9;
        uh var10;
        int var11;
        int var12;
        int var13;
        var13 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param2 <= 124) {
          field_Ub = (float[]) null;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param1 == this.field_kb) {
          stackIn_6_0 = (this.field_qc) ? 0 : 1;
          if (this.field_vc) {
            stackIn_9_1 = 0;
          } else {
            stackIn_9_1 = 1;
          }
          decompiledFrameRemainder0 = (stackIn_6_0 != stackIn_9_1);
        }
        if (decompiledFrameRemainder0) {
          var5 = null;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          stackIn_14_0 = (this.field_qc) ? 3 : 0;
          var9 = stackIn_14_0;
          if (param1 >= 0) {
            var5 = this.field_X.a(param1, (byte) 14);
            var10 = this.field_a.a(false, param1);
            if (0 == var10.field_n &&
              0 == var10.field_j) {
              this.q(67);
            } else {
              stackIn_22_0 = (!var10.field_o) ? 128 : 64;
              var11 = stackIn_22_0;
              var12 = 50 * var11;
              this.a(0.0f, (float)(this.field_hb % var12 * var10.field_n) / (float)var12, (float)(var10.field_j * (this.field_hb % var12)) / (float)var12, 5888);
            }
            var6 = var10.field_e;
            if (!this.field_qc) {
              var8 = var10.field_h;
              var7 = var10.field_s;
              var9 = var10.field_c;
            }
          } else {
            this.q(116);
          }
          this.field_vb.a(var9, param3, 2147483647, var8, param0, var7);
          if (!this.field_vb.a(var6, -1896, (rt) (var5))) {
            this.a((rt) (var5), 1);
            this.a(var6, (byte) -39);
          }
          this.field_vc = this.field_qc;
          this.field_kb = param1;
        }
        this.field_O = this.field_O & -8;
    }

    private final void b(byte param0) {
        if (param0 != -67) {
          this.a((byte) -71);
        }
        if (this.field_ac &&
          !this.field_xc) {
          jaggl.OpenGL.glEnable(2896);
        } else {
          jaggl.OpenGL.glDisable(2896);
        }
    }

    final void b(byte param0, int param1) {
        int stackIn_10_0 = 0;
        int stackIn_11_1 = 0;
        boolean stackIn_15_1 = false;
        boolean stackIn_18_0 = false;
        int stackIn_19_1 = 0;
        boolean stackIn_27_1 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var3Lifetime1;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.field_Cb != param1) {
          if (param1 != 1) {
            if (2 != param1) {
              if (param1 == 128) {
                var4 = 1;
                var3 = 1;
                var5 = 3;
              } else {
                var3 = 1;
                var4 = 0;
                var5 = 0;
              }
            } else {
              var3 = 1;
              var4 = 0;
              var5 = 2;
            }
          } else {
            var5 = 1;
            var4 = 1;
            var3 = 1;
          }
          stackIn_10_0 = var3;
          stackIn_11_1 = (this.field_hc) ? 0 : 1;
          if (stackIn_10_0 == stackIn_11_1) {
            jaggl.OpenGL.glColorMask(var3 != 0, var3 != 0, var3 != 0, true);
            stackIn_15_1 = (var3 != 0);
            this.field_hc = stackIn_15_1;
          }
          stackIn_18_0 = this.field_k;
          stackIn_19_1 = (var4 != 0) ? 0 : 1;
          if ((stackIn_18_0 ? 1 : 0) == stackIn_19_1) {
            if (var4 != 0) {
              jaggl.OpenGL.glEnable(3008);
            } else {
              jaggl.OpenGL.glDisable(3008);
            }
            stackIn_27_1 = (var4 != 0);
            this.field_k = stackIn_27_1;
          }
          if (this.field_z != var5) {
            if (var5 != 1) {
              if (2 == var5) {
                jaggl.OpenGL.glEnable(3042);
                jaggl.OpenGL.glBlendFunc(1, 1);
              } else {
                if (var5 != 3) {
                  jaggl.OpenGL.glDisable(3042);
                } else {
                  jaggl.OpenGL.glEnable(3042);
                  jaggl.OpenGL.glBlendFunc(774, 1);
                }
              }
            } else {
              jaggl.OpenGL.glEnable(3042);
              jaggl.OpenGL.glBlendFunc(770, 771);
            }
            this.field_z = var5;
          }
          this.field_Cb = param1;
          this.field_O = this.field_O & -29;
        }
        var3Lifetime1 = 78 / ((param0 + 41) / 36);
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (this.field_d > param2) {
          this.field_d = param2;
        }
        if (this.field_Q > param3) {
          this.field_Q = param3;
        }
        if (param1 > this.field_e) {
          this.field_e = param1;
        }
        if (param0 > this.field_L) {
          this.field_L = param0;
        }
        jaggl.OpenGL.glEnable(3089);
        this.m(5149);
        this.v(0);
    }

    final synchronized void a(long param0, int param1) {
        if (param1 != 3) {
          return;
        }
        IntrusiveNode var4 = new IntrusiveNode();
        var4.key = param0;
        this.field_f.addLast(param1 + 98, var4);
    }

    private final void v(int param0) {
        if (param0 != 0) {
          return;
        }
        if (this.field_d >= this.field_L &&
          this.field_e <= this.field_Q) {
          jaggl.OpenGL.glScissor(this.field_wc + this.field_L, -this.field_Q + this.field_bb + this.field_T, -this.field_L + this.field_d, this.field_Q - this.field_e);
        } else {
          jaggl.OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    private final void n(int param0) {
        if (this.field_tc &&
          this.field_C >= 0) {
          jaggl.OpenGL.glEnable(2912);
        } else {
          jaggl.OpenGL.glDisable(2912);
        }
        if (param0 != -1) {
          this.a(-19, -108, -19);
        }
    }

    final void g(int param0) {
        if (this.field_O != 2) {
          this.h(-109);
          this.a(false, false);
          this.b(false, (byte) -125);
          this.c(false, -128);
          this.a(false, (byte) -28);
          this.g(-2, 115);
          this.field_O = 2;
        }
        if (param0 != 1025208104) {
          this.f((byte) 124);
        }
    }

    final void b(byte param0, up param1) {
        int fieldTemp$18 = 0;
        up dupTemp$19 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_i) {
            if (this.field_rc >= 0 &&
              this.field_Jb[this.field_rc] == param1) {
              fieldTemp$18 = this.field_rc;
              this.field_rc = this.field_rc - 1;
              this.field_Jb[fieldTemp$18] = null;
              param1.b(10383);
              if (this.field_rc < 0) {
                this.field_Rb = null;
                this.field_qb = null;
              } else {
                dupTemp$19 = this.field_Jb[this.field_rc];
                this.field_qb = dupTemp$19;
                this.field_Rb = dupTemp$19;
                this.field_Rb.a(param0 ^ 18952);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              throw new RuntimeException();
            }
          }
          if (decompiledFrameRemainder0) {
            this.a((byte) -94, param1);
            this.a(param1, (byte) 49);
          }
          if (param0 != -113) {
            this.field_v = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("wl.HB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(int param0, up param1) {
        int fieldTemp$0 = 0;
        try {
          if (~this.field_Y <= param0) {
            throw new RuntimeException();
          }
          if (this.field_Y >= 0) {
            this.field_ob[this.field_Y].b((byte) -40);
          }
          fieldTemp$0 = this.field_Y + 1;
          this.field_Y = this.field_Y + 1;
          this.field_ob[fieldTemp$0] = param1;
          this.field_qb = param1;
          this.field_qb.c(-1122);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wl.KC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (1 == param0) {
          this.a(7681, -26625, 7681);
        } else {
          if (param0 == 0) {
            this.a(8448, -26625, 8448);
          } else {
            if (param0 == 2) {
              this.a(34165, -26625, 7681);
            } else {
              if (param0 == 3) {
                this.a(260, -26625, 8448);
              } else {
                if (4 == param0) {
                  this.a(34023, param1 ^ 26662, 34023);
                }
              }
            }
          }
        }
        if (param1 != -39) {
          this.a(-44, -126, true);
        }
    }

    public static void y(int param0) {
        if (param0 != 32598) {
          wl.y(40);
        }
        field_m = null;
        field_Ub = null;
        field_r = null;
        field_zc = null;
        field_Kb = null;
    }

    final void a(byte param0, fq param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -120) {
            this.field_ob = (up[]) null;
          }
          if (this.field_Qb != param1) {
            if (this.field_M) {
              jaggl.OpenGL.glBindBufferARB(34962, param1.a(param0 + 6650));
            }
            this.field_Qb = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("wl.MC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(byte param0, boolean param1) {
        if ((!param1 ? 1 : 0) != (!this.field_xc ? 1 : 0)) {
          this.field_xc = param1 ? true : false;
          this.b((byte) -67);
        }
        if (param0 != -126) {
          fq var4 = (fq) null;
          this.a((byte) -46, (fq) null);
        }
    }

    private final int w(int param0) {
        if (param0 != 8705) {
          this.field_ob = (up[]) null;
        }
        return this.field_ib - (-this.field_lb - this.field_yc);
    }

    final void a(up param0, int param1) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_i) {
            this.b(param0, param1 ^ 32993);
            this.a(-4, param0);
          } else {
            if (this.field_rc >= 3) {
              throw new RuntimeException();
            }
            if (this.field_rc >= 0) {
              this.field_Jb[this.field_rc].b(param1 ^ 43026);
            }
            fieldTemp$1 = this.field_rc + 1;
            this.field_rc = this.field_rc + 1;
            this.field_Jb[fieldTemp$1] = param0;
            this.field_qb = param0;
            this.field_Rb = param0;
            this.field_Rb.a(param1 - 51990);
          }
          if (param1 != 32925) {
            this.field_D = -1.2460601329803467f;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wl.PC(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(boolean param0, int param1) {
        if (this.field_P != param0) {
          if (param0) {
            jaggl.OpenGL.glEnable(2929);
          } else {
            jaggl.OpenGL.glDisable(2929);
          }
          this.field_P = param0 ? true : false;
          this.field_O = this.field_O & -32;
        }
        if (param1 > -126) {
          this.field_dc = (IntrusiveDeque) null;
        }
    }

    final int XA() {
        return this.field_Ob;
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_jc = param1;
        this.field_ub = param2;
        this.field_mc = param3;
        this.field_Ib = param0;
        this.u(3);
        this.m(5149);
        if (this.field_N == 3) {
          this.d(5888);
        } else {
          if (this.field_N == 2) {
            this.d((byte) 90);
          }
        }
    }

    final synchronized void b(int param0) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int var2;
        int var4;
        iq var5;
        iq var6;
        iq var7;
        iq var8;
        iq var9;
        IntrusiveNode var10;
        IntrusiveNode var11;
        iq var12;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        while (!this.field_nb.isEmpty(true)) {
          var5 = (iq) (this.field_nb.removeFirst(123));
          incrementValue$3 = var2;
          var2++;
          in.field_b[incrementValue$3] = (int)var5.key;
          this.field_ib = this.field_ib - var5.field_f;
          if (1000 != var2) {
            continue;
          }
          jaggl.OpenGL.glDeleteBuffersARB(var2, in.field_b, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteBuffersARB(var2, in.field_b, 0);
          var2 = 0;
        }
        while (!this.field_Ac.isEmpty(true)) {
          var6 = (iq) (this.field_Ac.removeFirst(121));
          incrementValue$2 = var2;
          var2++;
          in.field_b[incrementValue$2] = (int)var6.key;
          this.field_lb = this.field_lb - var6.field_f;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteTextures(var2, in.field_b, 0);
          var2 = 0;
        }
        if (0 < var2) {
          jaggl.OpenGL.glDeleteTextures(var2, in.field_b, 0);
          var2 = 0;
        }
        while (!this.field_zb.isEmpty(true)) {
          var7 = (iq) (this.field_zb.removeFirst(124));
          incrementValue$1 = var2;
          var2++;
          in.field_b[incrementValue$1] = var7.field_f;
          if (1000 != var2) {
            continue;
          }
          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, in.field_b, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, in.field_b, 0);
          var2 = 0;
        }
        while (!this.field_Gb.isEmpty(true)) {
          var8 = (iq) (this.field_Gb.removeFirst(127));
          incrementValue$0 = var2;
          var2++;
          in.field_b[incrementValue$0] = (int)var8.key;
          this.field_yc = this.field_yc - var8.field_f;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, in.field_b, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, in.field_b, 0);
          var2 = 0;
        }
        while (!this.field_Gc.isEmpty(true)) {
          var9 = (iq) (this.field_Gc.removeFirst(121));
          jaggl.OpenGL.glDeleteLists((int)var9.key, var9.field_f);
        }
        while (!this.field_dc.isEmpty(true)) {
          var10 = this.field_dc.removeFirst(121);
          jaggl.OpenGL.glDeleteProgramARB((int)var10.key);
        }
        while (!this.field_f.isEmpty(true)) {
          var11 = this.field_f.removeFirst(127);
          jaggl.OpenGL.glDeleteObjectARB(var11.key);
        }
        while (!this.field_Gc.isEmpty(true)) {
          var12 = (iq) (this.field_Gc.removeFirst(124));
          jaggl.OpenGL.glDeleteLists((int)var12.key, var12.field_f);
        }
        this.field_X.a(64);
        if (this.w(8705) > 100663296 &&
          60000L + this.field_l < kh.a(-57)) {
          System.gc();
          this.field_l = kh.a(-109);
        }
        this.field_hb = param0;
    }

    final void c(int param0, int param1) {
        bg.field_a[0] = (float)pg.a(16711680, param1) / 16711680.0f;
        bg.field_a[1] = (float)pg.a(65280, param1) / 65280.0f;
        bg.field_a[param0] = (float)pg.a(255, param1) / 255.0f;
        bg.field_a[3] = (float)(param1 >>> 24) / 255.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, bg.field_a, 0);
    }

    private final void i(int param0) {
        if (param0 <= 44) {
          this.field_E = 48;
        }
        this.field_pb[14] = this.field_ab;
        this.field_pb[10] = this.field_fb;
    }

    private final void j(int param0) {
        if (this.field_O != param0) {
          this.h(-114);
          this.a(false, false);
          this.b(false, (byte) -125);
          this.c(false, -128);
          this.a(false, (byte) -28);
          this.a((rt) null, param0 ^ 0);
          this.g(-2, 103);
          this.a(1, (byte) -39);
          this.field_O = 1;
        }
    }

    private final void a(up param0, byte param1) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_Y >= 0 &&
            param0 == this.field_ob[this.field_Y]) {
            fieldTemp$1 = this.field_Y;
            this.field_Y = this.field_Y - 1;
            this.field_ob[fieldTemp$1] = null;
            param0.b((byte) -128);
            if (param1 <= 7) {
              this.field_ac = true;
            }
            if (this.field_Y >= 0) {
              this.field_qb = this.field_ob[this.field_Y];
              this.field_qb.c(-1122);
            } else {
              this.field_qb = null;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wl.LB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, byte param1) {
        if (param1 != -28) {
          this.field_D = -1.1227154731750488f;
        }
        if ((!param0 ? 1 : 0) == (this.field_uc ? 1 : 0)) {
          this.field_uc = param0 ? true : false;
          this.r(param1 ^ 102);
          this.field_O = this.field_O & -32;
        }
    }

    final void c() {
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        IntrusiveNode var1 = this.field_jb.first(268435455);
        while (var1 != null) {
          ((im) (var1)).a(-125);
          var1 = this.field_jb.next((byte) 103);
        }
        if (this.field_pc != null) {
          this.field_pc.a(1);
        }
        if (this.field_kc != null) {
          this.f(8960);
          var1_ref = this.field_R.keys();
          while (var1_ref.hasMoreElements()) {
            var2 = (java.awt.Canvas) (var1_ref.nextElement());
            var3 = (Long) (this.field_R.get(var2));
            this.field_kc.releaseSurface(var2, var3.longValue());
          }
          this.field_kc.release();
          this.field_kc = null;
        }
        if (this.field_S) {
          BitmapFont.a(120, true, false);
          this.field_S = false;
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != -85) {
          this.r(8);
        }
        iq var3 = new iq(param1);
        this.field_zb.addLast(118, var3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = (float)param1 + 0.3499999940395355f;
        float var9 = -1.0f + (var7 + (float)param2);
        float var10 = -1.0f + (var8 + (float)param3);
        this.j(1);
        this.b((byte) -124, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
        if (this.field_I) {
          jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(2);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (this.field_I) {
          jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void d(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.field_pb, 0);
        jaggl.OpenGL.glMatrixMode(5888);
        if (param0 <= 30) {
          this.a(false, -1, (byte) 62, true);
        }
    }

    private final void a(byte param0, up param1) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_fc >= 0 &&
            this.field_Fc[this.field_fc] == param1) {
            fieldTemp$1 = this.field_fc;
            this.field_fc = this.field_fc - 1;
            this.field_Fc[fieldTemp$1] = null;
            param1.a((byte) 97);
            if (param0 != -94) {
              return;
            }
            if (0 <= this.field_fc) {
              this.field_Rb = this.field_Fc[this.field_fc];
              this.field_Rb.c((byte) 109);
            } else {
              this.field_Rb = null;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wl.BD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void r(int param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = 70 % ((param0 + 17) / 58);
        stackIn_4_0 = (this.field_uc) && (this.field_p);
        jaggl.OpenGL.glDepthMask(stackIn_4_0);
    }

    final int e(int param0, int param1) {
        if (param1 == 6406) {
          return 1;
        }
        if (param1 == 6409) {
          return 1;
        }
        if (param1 != 6410 &&
          param1 != 34846 &&
          34844 != param1) {
          if (param1 == 6407) {
            return 3;
          }
          if (6408 != param1 &&
            param1 != 34847) {
            if (param1 == 34843) {
              return 6;
            }
            if (param1 == 34842) {
              return 8;
            }
            if (6402 == param1) {
              return 3;
            }
            if (param1 == 6401) {
              return 1;
            }
            if (param0 != -32334) {
              this.field_Vb = (nr) null;
            }
            throw new IllegalArgumentException("");
          }
          return 4;
        }
        return 2;
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = (float)param0 + 0.3499999940395355f;
        float var8 = (float)param1 + 0.3499999940395355f;
        float var9 = var7 + (float)param2;
        this.j(1);
        float var10 = var8 + (float)param3;
        this.b((byte) -118, param5);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
        if (this.field_I) {
          jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (this.field_I) {
          jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void u(int param0) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float var7;
        float[] var8;
        var8 = this.field_pb;
        var2 = var8;
        var3 = (float)(this.field_db * -this.field_Ib) / (float)this.field_ub;
        var4 = (float)((-this.field_Ib + this.field_ec) * this.field_db) / (float)this.field_ub;
        var5 = (float)(this.field_db * this.field_jc) / (float)this.field_mc;
        var6 = (float)(this.field_db * (-this.field_bb + this.field_jc)) / (float)this.field_mc;
        if (param0 != 3) {
          this.field_Eb = true;
        }
        if (var4 != var3 &&
          var5 != var6) {
          var7 = 2.0f * (float)this.field_db;
          var8[5] = var7 / (-var6 + var5);
          var8[7] = 0.0f;
          var8[2] = 0.0f;
          var8[12] = 0.0f;
          var8[1] = 0.0f;
          var8[13] = 0.0f;
          var8[4] = 0.0f;
          var8[8] = (var3 + var4) / (var4 - var3);
          var8[15] = 0.0f;
          var8[9] = (var5 + var6) / (-var6 + var5);
          var8[0] = var7 / (var4 - var3);
          var8[3] = 0.0f;
          this.field_fb = (float)(-(this.field_Ob + this.field_db)) / (float)(-this.field_db + this.field_Ob);
          var8[10] = (float)(-(this.field_Ob + this.field_db)) / (float)(-this.field_db + this.field_Ob);
          this.field_ab = -((float)this.field_Ob * var7) / (float)(-this.field_db + this.field_Ob);
          var8[14] = -((float)this.field_Ob * var7) / (float)(-this.field_db + this.field_Ob);
          var8[11] = -1.0f;
          var8[6] = 0.0f;
        } else {
          var8[4] = 0.0f;
          var8[15] = 1.0f;
          var8[7] = 0.0f;
          var8[10] = 1.0f;
          var8[6] = 0.0f;
          var8[8] = 0.0f;
          var8[13] = 0.0f;
          var8[9] = 0.0f;
          var8[5] = 1.0f;
          var8[12] = 0.0f;
          var8[3] = 0.0f;
          var8[11] = 0.0f;
          var8[1] = 0.0f;
          var8[0] = 1.0f;
          var8[2] = 0.0f;
          var8[14] = 0.0f;
        }
        this.i(121);
    }

    final fq a(byte param0, int param1, byte[] param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        lk stackIn_5_0 = null;
        fq stackIn_8_0 = null;
        om stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_M && (!param4 ||
            this.field_xb)) {
            stackIn_5_0 = new lk(this, param1, param2, param3, param4);
            return (fq) ((Object) stackIn_5_0);
          }
          if (param0 == -49) {
            stackIn_10_0 = new om(this, param1, param2, param3);
            return (fq) ((Object) stackIn_10_0);
          }
          stackIn_8_0 = (fq) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("wl.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final RenderSprite a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        tm stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new tm(this, param3, param4, param0, param1, param2);
          return (RenderSprite) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("wl.O(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void d(int param0) {
        float var2 = (float)(-this.field_Ib) * this.field_sc / (float)this.field_ub;
        float var3 = (float)(-this.field_jc) * this.field_sc / (float)this.field_mc;
        float var4 = this.field_sc * (float)(this.field_ec - this.field_Ib) / (float)this.field_ub;
        float var5 = (float)(this.field_bb - this.field_jc) * this.field_sc / (float)this.field_mc;
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        if (var4 != var2 &&
          var5 != var3) {
          jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field_db, (double)this.field_Ob);
        }
        jaggl.OpenGL.glMatrixMode(param0);
    }

    final boolean c(byte param0) {
        if (param0 != 16) {
          return false;
        }
        return this.field_vb.a((byte) -118, 3);
    }

    private final void q(int param0) {
        if (this.field_Bc) {
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glMatrixMode(5888);
          this.field_Bc = false;
        }
        int var2 = -124 % ((param0 - 6) / 58);
    }

    final void a(float param0, float param1, int param2) {
        this.field_D = param0;
        if (param2 < 8) {
          return;
        }
        this.field_Zb = param1;
        this.k(-91);
    }

    private final void k(int param0) {
        this.field_t = -this.field_Zb + (float)(this.field_Ob - this.field_oc);
        this.field_Tb = this.field_t - (float)this.field_C * this.field_D;
        if ((float)this.field_db > this.field_Tb) {
          this.field_Tb = (float)this.field_db;
        }
        if (param0 > -83) {
          this.field_G = true;
        }
        jaggl.OpenGL.glFogf(2915, this.field_Tb);
        jaggl.OpenGL.glFogf(2916, this.field_t);
        bg.field_a[2] = (float)pg.a(255, this.field_F) / 255.0f;
        bg.field_a[1] = (float)pg.a(this.field_F, 65280) / 65280.0f;
        bg.field_a[0] = (float)pg.a(this.field_F, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, bg.field_a, 0);
    }

    final void a(boolean param0, int param1) {
        if (param1 != this.field_Pb) {
          jaggl.OpenGL.glActiveTexture(param1 + 33984);
          this.field_Pb = param1;
        }
        if (param0) {
          this.field_mb = (jaclib.memory.heap.NativeHeap) null;
        }
    }

    final void b(int param0, int param1) throws lp {
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        try {
          this.field_kc.swapBuffers();
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
        }
    }

    final sm a(ra param0, gd param1) {
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = null;
          return (sm) (stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("wl.G(");
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
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final synchronized void c(int param0, int param1, int param2) {
        iq var4 = new iq(param1);
        var4.key = (long)param0;
        int var5 = 112 % ((param2 + 54) / 58);
        this.field_nb.addLast(96, var4);
    }

    final static int t(int param0) {
        try {
          int stackIn_15_0 = 0;
          int stackIn_20_0 = 0;
          int stackIn_29_0 = 0;
          int stackIn_34_0 = 0;
          int stackIn_37_0 = 0;
          int stackIn_39_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (ul.field_r.field_j >= 4) {
            if (ul.field_r.field_e == -1) {
              return 3;
            }
            if (ul.field_r.field_e != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (bm.field_z == 0) {
              wu.field_l = cs.field_d.a(2, hi.field_x, RendererManager.field_f);
              bm.field_z = bm.field_z + 1;
            }
            if (bm.field_z == 1) {
              if (wu.field_l.field_a == 2) {
                stackIn_15_0 = tj.a(-112, -1);
                return stackIn_15_0;
              }
              if (wu.field_l.field_a == 1) {
                bm.field_z = bm.field_z + 1;
              }
            }
            if (param0 != 19078) {
              stackIn_20_0 = -63;
              return stackIn_20_0;
            }
            if (2 == bm.field_z) {
              du.field_m = new vf((java.net.Socket) (wu.field_l.field_f), cs.field_d);
              var2 = new PacketBuffer(13);
              tr.a(var2, uk.field_g, SoundCache.field_e, IntKeyLookup.field_b, 0);
              var2.writeByte(-1336879960, 15);
              var2.writeInt((byte) 20, si.field_c);
              du.field_m.a(13, 0, 41, var2.payload);
              bm.field_z = bm.field_z + 1;
              AircraftDefinition.field_j = 30000L + kh.a(-70);
            }
            if (bm.field_z == 3) {
              if (du.field_m.b(-120) <= 0) {
                if (kh.a(-116) > AircraftDefinition.field_j) {
                  stackIn_34_0 = tj.a(-126, -2);
                  return stackIn_34_0;
                }
              } else {
                var1_int = du.field_m.a((byte) -116);
                if (var1_int != 0) {
                  stackIn_29_0 = tj.a(92, var1_int);
                  return stackIn_29_0;
                }
                bm.field_z = bm.field_z + 1;
              }
            }
            if (4 != bm.field_z) {
              stackIn_39_0 = -1;
              return stackIn_39_0;
            }
            ul.field_r.a(param0 ^ 16696, rs.field_C, du.field_m);
            wu.field_l = null;
            bm.field_z = 0;
            du.field_m = null;
            stackIn_37_0 = 0;
            return stackIn_37_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return tj.a(107, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(boolean param0, byte param1) {
        if (this.field_ac != param0) {
          this.field_ac = param0 ? true : false;
          this.b((byte) -67);
          this.field_O = this.field_O & -8;
        }
        if (param1 != -125) {
          RenderSprite var4 = (RenderSprite) null;
          this.a((RenderSprite) null, true);
        }
    }

    final boolean b() {
        return true;
    }

    final void a(float param0, float param1, float param2, float param3, byte param4) {
        bg.field_a[1] = param1;
        bg.field_a[2] = param0;
        bg.field_a[0] = param2;
        if (param4 != 35) {
          return;
        }
        bg.field_a[3] = param3;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, bg.field_a, 0);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        jaggl.OpenGL.glTexEnvi(8960, 34184 + param2, param1);
        if (param3 <= 74) {
          this.field_gb = (fq) null;
        }
        jaggl.OpenGL.glTexEnvi(8960, param2 + 34200, param0);
    }

    final synchronized void a(byte param0, int param1, int param2) {
        if (param0 != -126) {
          this.c(27);
        }
        iq var4 = new iq(param1);
        var4.key = (long)param2;
        this.field_Gb.addLast(93, var4);
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          if (param1 != -3) {
            java.awt.Component var3 = (java.awt.Component) null;
            wl.a((java.awt.Component) null, (byte) -81);
          }
          param0.removeKeyListener(ua.field_d);
          param0.removeFocusListener(ua.field_d);
          fb.field_a = -1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wl.UB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean d() {
        return this.field_yb != null && this.field_yb.a(-118);
    }

    final void a(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, param3 + param2, param0);
        jaggl.OpenGL.glTexEnvi(8960, 34192 + param3, param1);
    }

    final void e() {
        int var1;
        int var2;
        int var3;
        int var4;
        if (!this.field_Eb) {
          return;
        }
        if (this.field_ec > 0 &&
          0 < this.field_bb) {
          var1 = this.field_L;
          var2 = this.field_d;
          var3 = this.field_e;
          var4 = this.field_Q;
          this.l(24643);
          jaggl.OpenGL.glReadBuffer(1028);
          jaggl.OpenGL.glDrawBuffer(1029);
          this.p(65);
          this.a(false, false);
          this.b(false, (byte) -125);
          this.c(false, -127);
          this.a(false, (byte) -28);
          this.a((rt) null, 1);
          this.g(-2, 126);
          this.a(1, (byte) -39);
          this.b((byte) -97, 0);
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
          jaggl.OpenGL.glMatrixMode(5888);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glCopyPixels(0, 0, this.field_ec, this.field_bb, 6144);
          jaggl.OpenGL.glFlush();
          jaggl.OpenGL.glReadBuffer(1029);
          jaggl.OpenGL.glDrawBuffer(1029);
          this.KA(var1, var3, var2, var4);
          return;
        }
    }

    final void a(RenderSprite param0, boolean param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        cu var3 = null;
        gt var3_ref = null;
        RuntimeException var3_ref2 = null;
        wt var4 = null;
        int var6 = 0;
        gt var7 = null;
        gt var8 = null;
        cu var9 = null;
        cu var10 = null;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          this.field_j = (tm) (param0);
          if (this.field_A) {
            if (null == this.field_y) {
              this.field_y = new wj(this);
            }
            if (this.field_qb == this.field_y) {
              throw new RuntimeException();
            }
            this.a(this.field_y, 32925);
            if (param1) {
              var3 = (cu) (this.field_s.a((byte) 106, (long)(this.field_j.a() << 16 | this.field_j.b())));
              if (var3 == null) {
                var9 = new cu(this, 6402, this.field_j.a(), this.field_j.b());
                var3 = var9;
                this.field_rb = this.field_rb + var9.field_o;
                while (this.field_rb > 2097152) {
                  var4 = this.field_Ec.a(3);
                  if (var4 != null) {
                    var10 = (cu) (var4);
                    var10.d(-128);
                    var10.unlink(-126);
                    var10.d((byte) -108);
                    this.field_rb = this.field_rb - var10.field_o;
                    continue;
                  }
                  break;
                }
                this.field_s.a(106, (long)(this.field_j.a() << 16 | this.field_j.b()), var9);
              }
              this.field_Ec.a(var3, (byte) 123);
              this.field_y.a(var3, 8, (byte) 119);
            }
            this.field_y.a(0, this.field_j.field_j, -5531);
          } else {
            if (!this.field_Mb) {
              throw new RuntimeException("");
            }
            var3_ref = (gt) (this.field_s.a((byte) 106, (long)(this.field_j.a() << 16 | this.field_j.b())));
            if (var3_ref == null) {
              var7 = new gt(this, this.field_j.a(), this.field_j.b());
              var3_ref = var7;
              this.field_rb = this.field_rb + var7.field_n * 4;
              while (this.field_rb > 2097152) {
                var4 = this.field_Ec.a(3);
                if (var4 != null) {
                  var8 = (gt) (var4);
                  var8.d(-127);
                  var8.unlink(-126);
                  this.field_kc.releasePbuffer(var8.f(25766));
                  this.field_rb = this.field_rb - var8.field_n;
                  continue;
                }
                break;
              }
              this.field_s.a(115, (long)(this.field_j.a() << 16 | this.field_j.b()), var7);
            }
            this.field_Ec.a(var3_ref, (byte) 125);
            this.field_kc.setPbuffer(var3_ref.f(25766));
          }
          this.field_ec = param0.a();
          this.field_bb = param0.b();
          this.p(-123);
          this.o(0);
          this.l(24643);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_31_0 = var3_ref2;
          stackIn_31_1 = new StringBuilder().append("wl.R(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a() {
        if (this.field_A) {
          if (this.field_qb != this.field_y) {
            throw new RuntimeException();
          }
          this.field_y.a(0, (byte) -54);
          this.field_y.a(8, (byte) -24);
          this.b((byte) -113, this.field_y);
        } else {
          if (!this.field_Mb) {
            throw new RuntimeException("");
          }
          this.field_j.b(this.field_ec, 0, 0, 0, 0, -14164, this.field_bb);
          this.field_kc.setSurface(this.field_gc);
        }
        this.field_bb = this.field_Yb;
        this.field_ec = this.field_g;
        this.field_j = null;
        this.p(47);
        this.o(0);
        this.l(24643);
    }

    private final void a(boolean param0, boolean param1) {
        if (param1 != this.field_tc) {
          this.field_tc = param1 ? true : false;
          this.n(-1);
          this.field_O = this.field_O & -32;
        }
        if (param0) {
          this.c();
        }
    }

    final int[] Y() {
        return new int[]{this.field_Ib, this.field_jc, this.field_ub, this.field_mc};
    }

    private final void h(int param0) {
        if (this.field_N != 1) {
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadIdentity();
          if (0 < this.field_ec &&
            this.field_bb > 0) {
            jaggl.OpenGL.glOrtho(0.0, (double)this.field_ec, (double)this.field_bb, 0.0, -1.0, 1.0);
          }
          jaggl.OpenGL.glMatrixMode(5888);
          jaggl.OpenGL.glLoadIdentity();
          this.field_N = 1;
          this.field_O = this.field_O & -25;
        }
        if (param0 > -49) {
          field_m = (int[]) null;
        }
    }

    private final void s(int param0) {
        java.awt.Dimension var2 = null;
        if (null == this.field_Wb) {
          this.field_Yb = 0;
          this.field_g = 0;
        } else {
          var2 = this.field_Wb.getSize();
          this.field_Yb = var2.height;
          this.field_g = var2.width;
        }
        if (this.field_qb == null) {
          this.field_ec = this.field_g;
          this.field_bb = this.field_Yb;
          this.o(0);
        }
        this.p(-98);
        if (param0 != -11103) {
          this.f(-17, -62);
        }
        this.l(24643);
    }

    final void a(sm param0) {
    }

    final BitmapFont a(vs param0, vd[] param1, boolean param2) {
        RuntimeException var4 = null;
        mu stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new mu(this, param0, param1, param2);
          return (BitmapFont) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("wl.E(");
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
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int e(byte param0) {
        int stackIn_29_0 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        String var3 = null;
        String[] var4 = null;
        int var5_int = 0;
        NumberFormatException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var9 = null;
        int[] var11 = null;
        int[] var13 = null;
        var2 = 0;
        this.field_B = jaggl.OpenGL.glGetString(7936).toLowerCase();
        this.field_sb = jaggl.OpenGL.glGetString(7937).toLowerCase();
        if (this.field_B.indexOf("microsoft") != -1) {
          var2 = var2 | 1;
        }
        if (this.field_B.indexOf("brian paul") != -1 ||
          this.field_B.indexOf("mesa") != -1) {
          var2 = var2 | 1;
        }
        var3 = jaggl.OpenGL.glGetString(7938);
        var4 = ee.a((byte) 10, ' ', var3.replace('.', ' '));
        if (var4.length < 2) {
          var2 = var2 | 4;
        } else {
          try {
            var5_int = td.a((CharSequence) ((Object) var4[0]), (byte) 38);
            var6 = td.a((CharSequence) ((Object) var4[1]), (byte) 38);
            this.field_Z = var6 + 10 * var5_int;
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (NumberFormatException) (Object) decompiledCaughtException;
            var2 = var2 | 4;
          }
        }
        if (12 > this.field_Z) {
          var2 = var2 | 2;
        }
        if (!this.field_kc.a("GL_ARB_multitexture")) {
          var2 = var2 | 8;
        }
        if (!this.field_kc.a("GL_ARB_texture_env_combine")) {
          var2 = var2 | 32;
        }
        var11 = new int[1];
        var9 = var11;
        var7 = var9;
        var13 = var7;
        jaggl.OpenGL.glGetIntegerv(34018, var13, 0);
        if (param0 != -94) {
          this.field_pc = (lu) null;
        }
        this.field_Xb = var11[0];
        jaggl.OpenGL.glGetIntegerv(34929, var11, 0);
        this.field_Sb = var11[0];
        jaggl.OpenGL.glGetIntegerv(34930, var11, 0);
        this.field_K = var11[0];
        if (this.field_Xb < 2 ||
          this.field_Sb < 2 ||
          2 > this.field_K) {
          var2 = var2 | 16;
        }
        this.field_V = jaclib.memory.Stream.b();
        this.field_Mb = this.field_kc.arePbuffersAvailable();
        this.field_M = this.field_kc.a("GL_ARB_vertex_buffer_object");
        this.field_I = this.field_kc.a("GL_ARB_multisample");
        this.field_x = this.field_kc.a("GL_ARB_vertex_program");
        this.field_kc.a("GL_ARB_fragment_program");
        this.field_v = this.field_kc.a("GL_ARB_vertex_shader");
        this.field_lc = this.field_kc.a("GL_ARB_fragment_shader");
        this.field_G = this.field_kc.a("GL_EXT_texture3D");
        this.field_u = this.field_kc.a("GL_ARB_texture_rectangle");
        this.field_nc = this.field_kc.a("GL_ARB_texture_cube_map");
        this.field_J = this.field_kc.a("GL_ARB_texture_float");
        this.field_Cc = false;
        this.field_A = this.field_kc.a("GL_EXT_framebuffer_object");
        this.field_i = this.field_kc.a("GL_EXT_framebuffer_blit");
        this.field_Nb = this.field_kc.a("GL_EXT_framebuffer_multisample");
        this.field_eb = rr.field_b.startsWith("mac");
        jaggl.OpenGL.glGetFloatv(2834, bg.field_a, 0);
        stackIn_29_0 = (var2 == 0) ? 0 : var2;
        return stackIn_29_0;
    }

    private final void g(int param0, int param1) {
        this.a(param0, 4873, true);
        int var3 = -24 % ((param1 - 44) / 50);
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
          this.h(-59);
          this.a((rt) null, 1);
          this.b((byte) -118, 0);
          jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
          jaggl.OpenGL.glRasterPos2i(param0, param1);
          jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, this.field_tb, param4, param5);
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wl.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void b(up param0, int param1) {
        int fieldTemp$0 = 0;
        try {
          if (this.field_fc >= 3) {
            throw new RuntimeException();
          }
          if (this.field_fc >= 0) {
            this.field_Fc[this.field_fc].a((byte) 125);
          }
          if (param1 < 95) {
            this.c((byte) -104);
          }
          fieldTemp$0 = this.field_fc + 1;
          this.field_fc = this.field_fc + 1;
          this.field_Fc[fieldTemp$0] = param0;
          this.field_Rb = param0;
          this.field_Rb.c((byte) 82);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wl.QB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final gd a(int param0, int param1) {
        return null;
    }

    final int i() {
        return this.field_db;
    }

    private final void p(int param0) {
        if (this.field_N != 0) {
          this.field_O = this.field_O & -32;
          this.field_N = 0;
        }
        int var2 = 39 % ((param0 + 31) / 58);
    }

    final za c(int param0) {
        im var2 = new im(param0);
        this.field_jb.addLast(87, var2);
        return (za) ((Object) var2);
    }

    private final void x(int param0) {
        wj discarded$17 = null;
        this.field_bc = new rt[this.field_Xb];
        this.field_Vb = new nr(this, 3553, 6408, 1, 1);
        nr discarded$0 = new nr(this, 3553, 6408, 1, 1);
        nr discarded$3 = new nr(this, 3553, 6408, 1, 1);
        if (param0 != -26394) {
          this.field_Bc = false;
        }
        nb discarded$4 = new nb(this);
        nb discarded$5 = new nb(this);
        nb discarded$6 = new nb(this);
        nb discarded$7 = new nb(this);
        nb discarded$8 = new nb(this);
        nb discarded$9 = new nb(this);
        nb discarded$10 = new nb(this);
        nb discarded$11 = new nb(this);
        nb discarded$12 = new nb(this);
        nb discarded$16 = new nb(this);
        if (this.field_A) {
          this.field_o = new wj(this);
          discarded$17 = new wj(this);
        }
    }

    static {
        field_Ub = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        field_zc = "MY HIGHSCORES";
        field_m = new int[2];
    }
}
