/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qfa extends ha {
    private long field_ic;
    private int field_Sb;
    private Hashtable field_hb;
    private java.awt.Canvas field_ib;
    private long field_uc;
    private int field_vb;
    int field_Y;
    static int field_Ib;
    private int field_rb;
    jaggl.OpenGL field_c;
    private rlb field_r;
    private kha field_fc;
    int field_X;
    int field_Kc;
    private mpb field_A;
    private vf field_Ec;
    private fbb field_d;
    private ij field_D;
    nk field_yb;
    private boolean field_m;
    jaclib.memory.heap.NativeHeap field_Kb;
    int field_Mc;
    private tla field_qc;
    private int field_rc;
    private vga field_E;
    private jaa[] field_kc;
    private jaa[] field_p;
    private rpa field_jb;
    private int field_zc;
    private jaa[] field_Gb;
    private jaa field_lc;
    private int field_Oc;
    private jaa field_W;
    private gnb field_Ic;
    private int field_Gc;
    private int field_q;
    int field_mc;
    private ij field_v;
    int field_sb;
    private ij field_xc;
    private ij field_Nc;
    private ij field_hc;
    private ij field_ec;
    private ij field_Cc;
    private ij field_zb;
    private boolean field_db;
    private int field_x;
    private int field_xb;
    private long field_vc;
    private boolean field_R;
    private boolean field_Ub;
    private int field_e;
    private epb field_Db;
    private boolean field_Lb;
    epb field_F;
    epb field_Bb;
    private int field_tb;
    private float[] field_L;
    boolean field_I;
    private int field_t;
    private uq field_T;
    int field_jc;
    private bu field_s;
    boolean field_bc;
    private boolean field_cb;
    private int field_f;
    private float[] field_Xb;
    private boolean field_Vb;
    rpa field_pb;
    float field_i;
    private int field_ab;
    private int field_yc;
    int field_cc;
    private int field_Fb;
    boolean field_eb;
    int field_Dc;
    private int field_J;
    private int field_oc;
    boolean field_g;
    private boolean field_Yb;
    private float field_Wb;
    aia field_qb;
    boolean field_n;
    int field_V;
    private boolean field_l;
    boolean field_B;
    private float[] field_Pb;
    private int field_P;
    private int field_Jc;
    int field_Fc;
    private int field_Rb;
    private String field_Nb;
    private String field_Ab;
    boolean field_Zb;
    private float field_G;
    private int field_lb;
    private boolean field_j;
    int field_M;
    private float field_mb;
    boolean field_gb;
    private uq field_z;
    private boolean field_sc;
    private float field_u;
    private boolean field_k;
    private boolean field_ac;
    private float field_w;
    private boolean field_O;
    float field_pc;
    private float field_H;
    private int field_Jb;
    private int field_Qb;
    private int field_Z;
    int field_Hc;
    float field_wb;
    private boolean field_kb;
    private int field_ob;
    boolean field_Ob;
    private int field_C;
    float field_nb;
    private int field_bb;
    boolean field_tc;
    private int field_N;
    private pib[] field_wc;
    private boolean field_Hb;
    private int field_dc;
    private int field_gc;
    private int field_Bc;
    private float field_Mb;
    private float field_Ac;
    private boolean field_h;
    float[] field_Eb;
    private int field_ub;
    private fsb[] field_K;
    private int field_fb;
    float field_nc;
    boolean field_U;
    private boolean field_Lc;
    private float field_Q;
    private boolean field_y;
    private float field_Cb;
    boolean field_S;
    private float[] field_Tb;
    private int field_o;

    private final void d(boolean param0) {
        if (param0) {
          this.field_ic = -58L;
        }
        this.field_Xb[14] = this.field_Wb;
        this.field_Xb[10] = this.field_mb;
    }

    private final void a(boolean param0, boolean param1, int param2, int param3) {
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        Object var5;
        int var6;
        int var7;
        int var8;
        int var9;
        opa var10;
        int var11;
        int var12;
        int var13;
        boolean decompiledFrameRemainder0 = true;
        var13 = VoidHunters.field_G;
        if (param3 == this.field_o) {
          stackIn_3_0 = this.field_Yb;
          if (this.field_kb) {
            stackIn_4_1 = 0;
          } else {
            stackIn_4_1 = 1;
          }
          decompiledFrameRemainder0 = ((stackIn_3_0 ? 1 : 0) == stackIn_4_1);
        }
        if (decompiledFrameRemainder0) {
          var5 = null;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          stackIn_9_0 = (!this.field_kb) ? 0 : 3;
          var9 = stackIn_9_0;
          if (param3 >= 0) {
            var5 = this.field_r.a((byte) -125, param3);
            var10 = this.field_a.a(-20292, param3);
            if (0 == var10.field_p &&
              var10.field_d == 0) {
              this.k(param2 + 0);
            } else {
              stackIn_17_0 = (!var10.field_h) ? 128 : 64;
              var11 = stackIn_17_0;
              var12 = 50 * var11;
              this.a(0.0f, (float)(this.field_Mc % var12 * var10.field_p) / (float)var12, 5890, (float)(var10.field_d * (this.field_Mc % var12)) / (float)var12);
            }
            if (!this.field_kb) {
              var8 = var10.field_o;
              var7 = var10.field_n;
              var9 = var10.field_c;
            }
            var6 = var10.field_f;
          } else {
            this.k(param2 ^ 0);
          }
          this.field_d.a(param0, param1, var7, -109, var9, var8);
          if (!this.field_d.a((pib) (var5), 74, var6)) {
            this.a(58, (pib) (var5));
            this.c(param2 + 0, var6);
          }
          this.field_Yb = this.field_kb;
          this.field_o = param3;
        }
        if (param2 != 0) {
          this.field_yb = (nk) null;
        }
        this.field_x = this.field_x & -8;
    }

    final void h(int param0, int param1) {
        if (param1 != this.field_Z) {
          jaggl.OpenGL.glActiveTexture(33984 + param1);
          this.field_Z = param1;
        }
        if (param0 != 33984) {
          jaa var4 = (jaa) null;
          this.b(46, (jaa) null);
        }
    }

    final void b(boolean param0, int param1) {
        tdb.field_o[3] = (float)(param1 >>> 24) / 255.0f;
        tdb.field_o[2] = (float)dla.a(param1, 255) / 255.0f;
        if (!param0) {
          this.field_U = true;
        }
        tdb.field_o[0] = (float)dla.a(16711680, param1) / 16711680.0f;
        tdb.field_o[1] = (float)dla.a(param1, 65280) / 65280.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, tdb.field_o, 0);
    }

    final aja a(ima param0, boolean param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        aja stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        aja var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var9 = VoidHunters.field_G;
        try {
          var10 = new int[param0.field_f * param0.field_e];
          var12 = var10;
          var11 = var12;
          var3 = var11;
          var4 = 0;
          var5 = 0;
          if (param0.field_a != null) {
            for (var6_int = 0; param0.field_e > var6_int; var6_int++) {
              for (var7 = 0; param0.field_f > var7; var7++) {
                incrementValue$0 = var5;
                var5++;
                var3[incrementValue$0] = knb.a(param0.field_b[dla.a(255, (int) param0.field_h[var4])], param0.field_a[var4] << 24);
                var4++;
              }
            }
          } else {
            for (var6_int = 0; param0.field_e > var6_int; var6_int++) {
              for (var7 = 0; param0.field_f > var7; var7++) {
                incrementValue$1 = var4;
                var4++;
                var8 = param0.field_b[param0.field_h[incrementValue$1] & 255];
                incrementValue$2 = var5;
                var5++;
                stackIn_8_0 = var10;
                stackIn_8_1 = incrementValue$2;
                if (var8 == 0) {
                  stackIn_9_2 = 0;
                } else {
                  stackIn_9_2 = knb.a(var8, -16777216);
                }
                stackIn_8_0[stackIn_8_1] = stackIn_9_2;
              }
            }
          }
          var6 = this.a(param0.field_f, param0.field_f, var12, 0, (byte) 96, param0.field_e);
          var6.a(param0.field_c, param0.field_g, param0.field_i, param0.field_d);
          stackIn_18_0 = var6;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("qfa.AB(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0, int param1, boolean param2) {
        int var4;
        if (this.field_Z != 0) {
          jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
          jaggl.OpenGL.glTexEnvi(8960, 34162, param1);
        } else {
          var4 = 0;
          if (param0 != this.field_Bc) {
            jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
            var4 = 1;
            this.field_Bc = param0;
          }
          if (param1 != this.field_tb) {
            jaggl.OpenGL.glTexEnvi(8960, 34162, param1);
            this.field_tb = param1;
            var4 = 1;
          }
          if (var4 != 0) {
            this.field_x = this.field_x & -30;
          }
        }
        if (param2) {
          this.field_jb = (rpa) null;
        }
    }

    final void a(za param0) {
        mb var3 = null;
        od discarded$0 = null;
        od discarded$1 = null;
        try {
          this.field_Kb = ((gpa) (param0)).field_e;
          if (this.field_z == null) {
            var3 = new mb(80);
            if (this.field_ac) {
              var3.b(-1.0f, 1724347896);
              var3.b(-1.0f, 1724347896);
              var3.b(0.0f, 1724347896);
              var3.b(0.0f, 1724347896);
              var3.b(1.0f, 1724347896);
              var3.b(1.0f, 1724347896);
              var3.b(-1.0f, 1724347896);
              var3.b(0.0f, 1724347896);
              var3.b(1.0f, 1724347896);
              var3.b(1.0f, 1724347896);
              var3.b(1.0f, 1724347896);
              var3.b(1.0f, 1724347896);
              var3.b(0.0f, 1724347896);
              var3.b(1.0f, 1724347896);
              var3.b(0.0f, 1724347896);
              var3.b(-1.0f, 1724347896);
              var3.b(1.0f, 1724347896);
              var3.b(0.0f, 1724347896);
              var3.b(0.0f, 1724347896);
              var3.b(0.0f, 1724347896);
            } else {
              var3.a(-1.0f, 1059949744);
              var3.a(-1.0f, 1059949744);
              var3.a(0.0f, 1059949744);
              var3.a(0.0f, 1059949744);
              var3.a(1.0f, 1059949744);
              var3.a(1.0f, 1059949744);
              var3.a(-1.0f, 1059949744);
              var3.a(0.0f, 1059949744);
              var3.a(1.0f, 1059949744);
              var3.a(1.0f, 1059949744);
              var3.a(1.0f, 1059949744);
              var3.a(1.0f, 1059949744);
              var3.a(0.0f, 1059949744);
              var3.a(1.0f, 1059949744);
              var3.a(0.0f, 1059949744);
              var3.a(-1.0f, 1059949744);
              var3.a(1.0f, 1059949744);
              var3.a(0.0f, 1059949744);
              var3.a(0.0f, 1059949744);
              var3.a(0.0f, 1059949744);
            }
            this.field_z = this.a(var3.field_h, 20, var3.field_e, false, (byte) 121);
            discarded$0 = new od(this.field_z, 5126, 3, 0);
            discarded$1 = new od(this.field_z, 5126, 2, 12);
            this.field_Ec.a(8, this);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qfa.GB(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (this.field_Sb < param2) {
          param2 = this.field_Sb;
        }
        if (this.field_Y < param3) {
          param3 = this.field_Y;
        }
        if (param1 < 0) {
          param1 = 0;
        }
        if (param0 < 0) {
          param0 = 0;
        }
        this.field_fb = param1;
        this.field_oc = param0;
        this.field_ab = param2;
        this.field_C = param3;
        jaggl.OpenGL.glEnable(3089);
        this.o(124);
        this.l(10);
    }

    final void b(int param0, jaa param1) {
        int fieldTemp$0 = 0;
        try {
          if (3 <= this.field_rc) {
            throw new RuntimeException();
          }
          if (this.field_rc >= param0) {
            this.field_Gb[this.field_rc].a((byte) 90);
          }
          fieldTemp$0 = this.field_rc + 1;
          this.field_rc = this.field_rc + 1;
          this.field_Gb[fieldTemp$0] = param1;
          this.field_lc = param1;
          this.field_lc.c(31636);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qfa.WD(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, uq param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 34962) {
            this.a(0.2658414840698242f, 1.4282253980636597f, 20);
          }
          if (param1 != this.field_T) {
            if (this.field_cb) {
              jaggl.OpenGL.glBindBufferARB(34962, param1.a(true));
            }
            this.field_T = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qfa.FC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(byte param0, jaa param1) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 >= -105) {
            this.a(34, -50, (byte) 51);
          }
          if (!this.field_Ob) {
            if (this.field_zc >= 3) {
              throw new RuntimeException();
            }
            if (this.field_zc >= 0) {
              this.field_p[this.field_zc].b((byte) -128);
            }
            fieldTemp$1 = this.field_zc + 1;
            this.field_zc = this.field_zc + 1;
            this.field_p[fieldTemp$1] = param1;
            this.field_lc = param1;
            this.field_W = param1;
            this.field_W.b(-5574);
          } else {
            this.a(75, param1);
            this.b(0, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("qfa.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void c(int param0, boolean param1) {
        if (param0 != 32925) {
          this.field_vb = -92;
        }
        if (param1 != this.field_j) {
          this.field_j = param1 ? true : false;
          this.e(false);
        }
    }

    final static void a(int param0, boolean param1) {
        sga.field_p = param1 ? true : false;
        int var2 = -9 % ((param0 - 13) / 33);
        osa.field_e = param1 ? true : false;
    }

    final ka a(cbb param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        ne stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new ne(this, param0, param1, param3, param4, param2);
          return (ka) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("qfa.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void t(int param0) {
        this.field_oc = 0;
        this.field_C = this.field_Y;
        this.field_fb = 0;
        this.field_ab = this.field_Sb;
        jaggl.OpenGL.glDisable(3089);
        int var2 = -12 % ((45 - param0) / 61);
        this.o(107);
    }

    final void a(aja param0, boolean param1) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        tob var3 = null;
        nv var3_ref = null;
        RuntimeException var3_ref2 = null;
        fh var4 = null;
        int var6 = 0;
        nv var7 = null;
        nv var8 = null;
        tob var9 = null;
        tob var10 = null;
        var6 = VoidHunters.field_G;
        try {
          this.field_qc = (tla) (param0);
          if (!this.field_U) {
            if (!this.field_O) {
              throw new RuntimeException("");
            }
            var3 = (tob) (this.field_Ic.a((long)(this.field_qc.d() << 16 | this.field_qc.a()), 116));
            if (var3 == null) {
              var9 = new tob(this, this.field_qc.d(), this.field_qc.a());
              var3 = var9;
              this.field_Gc = this.field_Gc + 4 * var9.field_m;
              while (this.field_Gc > 2097152) {
                var4 = this.field_E.b(1);
                if (var4 != null) {
                  var10 = (tob) (var4);
                  var10.d((byte) -35);
                  var10.b(-3846);
                  this.field_c.releasePbuffer(var10.f(-128));
                  this.field_Gc = this.field_Gc - var10.field_m;
                  continue;
                }
                break;
              }
              this.field_Ic.a((long)(this.field_qc.d() << 16 | this.field_qc.a()), var9, (byte) -120);
            }
            this.field_E.a((fh) (var3), (byte) -22);
            this.field_c.setPbuffer(var3.f(-128));
          } else {
            if (this.field_jb == null) {
              this.field_jb = new rpa(this);
            }
            if (this.field_lc == this.field_jb) {
              throw new RuntimeException();
            }
            this.a((byte) -109, (jaa) (this.field_jb));
            if (param1) {
              var3_ref = (nv) (this.field_Ic.a((long)(this.field_qc.d() << 16 | this.field_qc.a()), 100));
              if (var3_ref == null) {
                var7 = new nv(this, 6402, this.field_qc.d(), this.field_qc.a());
                var3_ref = var7;
                this.field_Gc = this.field_Gc + var7.field_m;
                while (this.field_Gc > 2097152) {
                  var4 = this.field_E.b(1);
                  if (var4 != null) {
                    var8 = (nv) (var4);
                    var8.d((byte) -35);
                    var8.b(-3846);
                    var8.e((byte) 124);
                    this.field_Gc = this.field_Gc - var8.field_m;
                    continue;
                  }
                  break;
                }
                this.field_Ic.a((long)(this.field_qc.d() << 16 | this.field_qc.a()), var7, (byte) -124);
              }
              this.field_E.a((fh) (var3_ref), (byte) -22);
              this.field_jb.a(8, var3_ref, (byte) -20);
            }
            this.field_jb.a(0, (byte) -126, this.field_qc.field_f);
          }
          this.field_Sb = param0.d();
          this.field_Y = param0.a();
          this.f((byte) -61);
          this.f(27818);
          this.t(-70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_29_0 = var3_ref2;
          stackIn_29_1 = new StringBuilder().append("qfa.A(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a() {
        return true;
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        int var9 = 0;
        float var6;
        float var7;
        int var8;
        int var10;
        var10 = VoidHunters.field_G;
        if (param2 < 0) {
          param2 = -param2;
        }
        if (param0 + param2 < this.field_oc) {
          return;
        }
        if (this.field_ab >= -param2 + param0 &&
          this.field_fb <= param2 + param1 &&
          this.field_C >= -param2 + param1) {
          this.m(-88);
          this.d(param4, 114);
          jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
          if (1 >= param2) {
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glVertex2f((float)(param0 + 1), (float)(1 + param1));
            jaggl.OpenGL.glVertex2f((float)(param0 + 1), (float)(param1 - 1));
            jaggl.OpenGL.glVertex2f((float)(param0 - 1), (float)(param1 - 1));
            jaggl.OpenGL.glVertex2f((float)(param0 - 1), (float)(1 + param1));
            jaggl.OpenGL.glEnd();
            return;
          }
          var6 = (float)param0 + 0.3499999940395355f;
          jaggl.OpenGL.glBegin(2);
          var7 = (float)param1 + 0.3499999940395355f;
          var8 = 262144 / (param2 * 6);
          if (64 >= var8) {
            var8 = 64;
          } else {
            if (var8 > 512) {
              var8 = 512;
            }
          }
          var8 = wsb.a(var8, 1302374146);
          jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
          for (var9 = -var8 + 16384; 0 < var9; var9 = var9 - var8) {
            jaggl.OpenGL.glVertex2f(var6 + (float)param2 * kn.field_o[var9], var7 + (float)param2 * kn.field_r[var9]);
          }
          jaggl.OpenGL.glEnd();
          return;
        }
    }

    final da a(sw param0, ima[] param1, boolean param2) {
        RuntimeException var4 = null;
        fn stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new fn(this, param0, param1, param2);
          return (da) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("qfa.BA(");
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
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final void xa(float param0) {
        if (param0 != this.field_pc) {
          this.field_pc = param0;
          this.e((byte) -122);
        }
    }

    private final void i(int param0) {
        if (param0 != 3) {
          return;
        }
        if (this.field_Jb != 1) {
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadIdentity();
          if (this.field_Sb > 0 &&
            0 < this.field_Y) {
            jaggl.OpenGL.glOrtho(0.0, (double)this.field_Sb, (double)this.field_Y, 0.0, -1.0, 1.0);
          }
          jaggl.OpenGL.glMatrixMode(5888);
          jaggl.OpenGL.glLoadIdentity();
          this.field_Jb = 1;
          this.field_x = this.field_x & -25;
        }
    }

    final boolean h() {
        return false;
    }

    final void K(int[] param0) {
        try {
          param0[0] = this.field_oc;
          param0[2] = this.field_ab;
          param0[3] = this.field_C;
          param0[1] = this.field_fb;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qfa.K(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void r(int param0) {
        float var2 = (float)(-this.field_lb) * this.field_Cb / (float)this.field_Qb;
        float var3 = this.field_Cb * (float)(-this.field_gc) / (float)this.field_yc;
        float var4 = (float)(-this.field_lb + this.field_Sb) * this.field_Cb / (float)this.field_Qb;
        float var5 = (float)(-this.field_gc + this.field_Y) * this.field_Cb / (float)this.field_yc;
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        if (param0 >= -80) {
          return;
        }
        if (var2 != var4 &&
          var3 != var5) {
          jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field_ob, (double)this.field_bb);
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final int[] na(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int[] var8 = new int[param2 * param3];
        int[] var5 = var8;
        for (var6 = 0; var6 < param3; var6++) {
          jaggl.OpenGL.glReadPixelsi(param0, -var6 - param1 + this.field_Y, param2, 1, 32993, this.field_cc, var8, var6 * param2);
        }
        return var8;
    }

    final boolean c() {
        boolean stackIn_6_0 = false;
        boolean decompiledFrameRemainder0 = true;
        if (this.field_A != null && (this.field_Kc <= 1 ||
          this.field_sc)) {
          stackIn_6_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_6_0 = false;
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        jaggl.OpenGL.glLineWidth((float)param5);
        this.b(param0, param1, param2, param3, param4, param6);
        jaggl.OpenGL.glLineWidth(1.0f);
    }

    final void b(byte param0, jaa param1) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_rc >= 0 &&
            param1 == this.field_Gb[this.field_rc]) {
            fieldTemp$1 = this.field_rc;
            this.field_rc = this.field_rc - 1;
            this.field_Gb[fieldTemp$1] = null;
            param1.a((byte) 55);
            if (0 <= this.field_rc) {
              this.field_lc = this.field_Gb[this.field_rc];
              this.field_lc.c(31636);
            } else {
              this.field_lc = null;
            }
            if (param0 != 101) {
              this.e(-34, -7);
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("qfa.DC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void s(int param0) {
        this.field_w = -this.field_u + (float)(-this.field_ub + this.field_bb);
        this.field_wb = this.field_w - (float)this.field_jc * this.field_Q;
        if (this.field_wb < (float)this.field_ob) {
          this.field_wb = (float)this.field_ob;
        }
        jaggl.OpenGL.glFogf(param0, this.field_wb);
        jaggl.OpenGL.glFogf(2916, this.field_w);
        tdb.field_o[1] = (float)dla.a(this.field_J, 65280) / 65280.0f;
        tdb.field_o[2] = (float)dla.a(this.field_J, 255) / 255.0f;
        tdb.field_o[0] = (float)dla.a(this.field_J, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, tdb.field_o, 0);
    }

    final boolean n() {
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.m(-125);
        this.d(param9, 126);
        jaggl.OpenGL.glBegin(4);
        jaggl.OpenGL.glColor4ub((byte)(param6 >> 16), (byte)(param6 >> 8), (byte)param6, (byte)(param6 >> 24));
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param0, (float)param1 + 0.3499999940395355f);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 16), (byte)(param7 >> 8), (byte)param7, (byte)(param7 >> 24));
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param2, 0.3499999940395355f + (float)param3);
        jaggl.OpenGL.glColor4ub((byte)(param8 >> 16), (byte)(param8 >> 8), (byte)param8, (byte)(param8 >> 24));
        jaggl.OpenGL.glVertex2f((float)param4 + 0.3499999940395355f, 0.3499999940395355f + (float)param5);
        jaggl.OpenGL.glEnd();
    }

    final void c(boolean param0) {
        if (this.field_x != 4) {
          this.i(3);
          this.a(false, -119);
          this.b(-20951, false);
          this.a((byte) 32, false);
          this.a(false, (byte) 66);
          this.i(5888, -2);
          this.d(1, 74);
          this.field_x = 4;
        }
        if (param0) {
          this.T(-60, 98, 93, -48);
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        hua var4 = new hua(param0);
        var4.field_b = (long)param1;
        this.field_ec.b(-10258, var4);
        if (param2 < 8) {
          this.field_s = (bu) null;
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 102 / ((param1 - 17) / 41);
        if (param0 != this.field_Ub) {
          this.field_Ub = param0 ? true : false;
          this.b((byte) 98);
          this.field_x = this.field_x & -32;
        }
    }

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = (float)param1 + 0.3499999940395355f;
        float var9 = -1.0f + (var7 + (float)param2);
        float var10 = -1.0f + ((float)param3 + var8);
        this.m(-71);
        this.d(param5, 124);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
        if (this.field_y) {
          jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(2);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (this.field_y) {
          jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void w(int param0) {
        int incrementValue$0 = 0;
        int var3 = VoidHunters.field_G;
        int var2 = 0;
        if (param0 < 40) {
          this.field_Cc = (ij) null;
        }
        while (!this.field_c.a()) {
          incrementValue$0 = var2;
          var2++;
          if (5 < incrementValue$0) {
            throw new RuntimeException("");
          }
          gdb.b(50, 1000L);
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, 34176 + param0, param3);
        jaggl.OpenGL.glTexEnvi(8960, param1 + param0, param2);
    }

    final uq a(byte[] param0, int param1, int param2, boolean param3, byte param4) {
        RuntimeException var6 = null;
        oaa stackIn_5_0 = null;
        uq stackIn_8_0 = null;
        dda stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_cb && (!param3 ||
            this.field_k)) {
            stackIn_5_0 = new oaa(this, param1, param0, param2, param3);
            return (uq) ((Object) stackIn_5_0);
          }
          if (param4 >= 115) {
            stackIn_10_0 = new dda(this, param1, param0, param2);
            return (uq) ((Object) stackIn_10_0);
          }
          stackIn_8_0 = (uq) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("qfa.ME(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void o(int param0) {
        if (param0 <= 98) {
          this.t(-19);
        }
    }

    final void a(int param0, pib param1) {
        pib var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = VoidHunters.field_G;
        try {
          var3 = this.field_wc[this.field_Z];
          if (var3 != param1) {
            if (param1 != null) {
              if (var3 != null) {
                if (param1.field_b != var3.field_b) {
                  jaggl.OpenGL.glDisable(var3.field_b);
                  jaggl.OpenGL.glEnable(param1.field_b);
                }
              } else {
                jaggl.OpenGL.glEnable(param1.field_b);
              }
              jaggl.OpenGL.glBindTexture(param1.field_b, param1.b(23307));
            } else {
              jaggl.OpenGL.glDisable(var3.field_b);
            }
            this.field_wc[this.field_Z] = param1;
          }
          this.field_x = this.field_x & -2;
          if (param0 < 24) {
            this.field_kb = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("qfa.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized void a(byte param0, long param1) {
        if (param0 != 18) {
          this.field_Fc = -96;
        }
        ksa var4 = new ksa();
        var4.field_b = param1;
        this.field_zb.b(-10258, var4);
    }

    final wib b(int param0, int param1) {
        return null;
    }

    private final void a(byte param0, boolean param1) {
        if (param0 != 32) {
          this.field_Lc = false;
        }
        if (this.field_R != param1) {
          if (param1) {
            jaggl.OpenGL.glEnable(2929);
          } else {
            jaggl.OpenGL.glDisable(2929);
          }
          this.field_R = param1 ? true : false;
          this.field_x = this.field_x & -32;
        }
    }

    final void u() {
        this.field_fc.c(124);
    }

    final void o() {
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = VoidHunters.field_G;
        ksa var1 = this.field_D.d(0);
        while (var1 != null) {
          ((gpa) (var1)).a(false);
          var1 = this.field_D.a((byte) 25);
        }
        if (this.field_fc != null) {
          this.field_fc.a(true);
        }
        if (null != this.field_c) {
          this.h((byte) -46);
          var1_ref = this.field_hb.keys();
          while (var1_ref.hasMoreElements()) {
            var2 = (java.awt.Canvas) (var1_ref.nextElement());
            var3 = (Long) (this.field_hb.get(var2));
            this.field_c.releaseSurface(var2, var3.longValue());
          }
          this.field_c.release();
          this.field_c = null;
        }
        if (this.field_m) {
          uhb.a((byte) 102, true, false);
          this.field_m = false;
        }
    }

    private final void d(int param0) {
        if (param0 <= 111) {
          int[] var3 = (int[]) null;
          this.SA(15, 87, -102, 81, (int[]) null, -122, 82);
        }
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.field_Xb, 0);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    private final void v(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        this.i(param0 ^ 5122, -2);
        for (var2 = this.field_Dc - 1; var2 >= 0; var2--) {
          this.h(33984, var2);
          this.a(param0 - 729, (pib) null);
          jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.b(8448, 8448, false);
        this.c(2, 34192, param0, 34168);
        this.k(param0 ^ 770);
        this.field_e = 1;
        jaggl.OpenGL.glEnable(3042);
        jaggl.OpenGL.glBlendFunc(770, 771);
        this.field_xb = 1;
        jaggl.OpenGL.glEnable(3008);
        jaggl.OpenGL.glAlphaFunc(516, 0.0f);
        this.field_db = true;
        jaggl.OpenGL.glColorMask(true, true, true, true);
        this.field_Lb = true;
        this.a(true, -123);
        this.b(-20951, true);
        this.a((byte) 32, true);
        this.a(true, (byte) -75);
        this.f((byte) -25);
        this.field_c.setSwapInterval(0);
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
        for (var3 = 0; 8 > var3; var3++) {
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
        this.field_Jc = -1;
        this.field_J = -1;
        this.t(107);
    }

    private final void f(byte param0) {
        if (0 != this.field_Jb) {
          this.field_Jb = 0;
          this.field_x = this.field_x & -32;
        }
        if (param0 > -4) {
          this.field_jb = (rpa) null;
        }
    }

    private final void m(int param0) {
        if (this.field_x != 1) {
          this.i(3);
          this.a(false, -127);
          this.b(-20951, false);
          this.a((byte) 32, false);
          this.a(false, (byte) 122);
          this.a(115, (pib) null);
          this.i(5888, -2);
          this.c(0, 1);
          this.field_x = 1;
        }
        int var2 = 89 % ((param0 + 17) / 44);
    }

    final int XA() {
        return this.field_bb;
    }

    final boolean b() {
        if (null != this.field_A) {
          if (!this.field_A.e((byte) 117)) {
            if (!this.field_fc.a(2998, this.field_A)) {
              return false;
            }
            this.field_r.b(-58);
          }
          return true;
        }
        return false;
    }

    private final void a(float param0, float param1, int param2, float param3) {
        jaggl.OpenGL.glMatrixMode(param2);
        if (this.field_Vb) {
          jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glTranslatef(param1, param3, param0);
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_Vb = true;
    }

    private final void f(int param0) {
        jaggl.OpenGL.glViewport(this.field_N, this.field_Fb, this.field_Sb, this.field_Y);
        if (param0 != 27818) {
          this.m(14);
        }
    }

    final boolean l() {
        return true;
    }

    final synchronized void a(int param0, int param1, int param2) {
        hua var4 = new hua(param2);
        var4.field_b = (long)param0;
        this.field_Nc.b(-10258, var4);
        if (param1 <= 14) {
          this.field_w = 0.8722803592681885f;
        }
    }

    private final void c(byte param0) {
        rpa discarded$16 = null;
        this.field_wc = new pib[this.field_Dc];
        this.field_qb = new aia(this, 3553, 6408, 1, 1);
        aia discarded$0 = new aia(this, 3553, 6408, 1, 1);
        aia discarded$1 = new aia(this, 3553, 6408, 1, 1);
        ne discarded$2 = new ne(this);
        ne discarded$3 = new ne(this);
        ne discarded$4 = new ne(this);
        ne discarded$5 = new ne(this);
        ne discarded$6 = new ne(this);
        ne discarded$7 = new ne(this);
        ne discarded$8 = new ne(this);
        ne discarded$11 = new ne(this);
        if (param0 > -54) {
          this.c(102, -80);
        }
        ne discarded$12 = new ne(this);
        ne discarded$15 = new ne(this);
        if (this.field_U) {
          this.field_pb = new rpa(this);
          discarded$16 = new rpa(this);
        }
    }

    final void a(pw param0) {
        try {
          this.field_Db.a(false, param0);
          this.field_F.a(false, this.field_Db);
          this.field_F.b(5);
          this.field_Bb.a(this.field_F, 14);
          if (this.field_Jb != 1) {
            this.b(true);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qfa.FB(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = 0.3499999940395355f + (float)param1;
        float var9 = (float)param2 + var7;
        float var10 = var8 + (float)param3;
        this.m(80);
        this.d(param5, 67);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
        if (this.field_y) {
          jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (this.field_y) {
          jaggl.OpenGL.glEnable(32925);
        }
    }

    final boolean s() {
        return null != this.field_A && this.field_A.e((byte) 57);
    }

    final void a(float param0, float param1, int param2) {
        this.field_u = param0;
        this.field_Q = param1;
        this.s(2915);
        if (param2 != 0) {
          this.field_k = false;
        }
    }

    final void a(float param0, float param1, boolean param2, float param3, float param4) {
        if (param2) {
          this.field_Qb = 91;
        }
        tdb.field_o[3] = param0;
        tdb.field_o[0] = param4;
        tdb.field_o[1] = param1;
        tdb.field_o[2] = param3;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, tdb.field_o, 0);
    }

    final void P(int param0, int param1, int param2, int param3, int param4) {
        this.m(106);
        this.d(param4, 62);
        float var6 = (float)param0 + 0.3499999940395355f;
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
        float var7 = (float)param1 + 0.3499999940395355f;
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(var6, var7);
        jaggl.OpenGL.glVertex2f(var6, (float)param2 + var7);
        jaggl.OpenGL.glEnd();
    }

    private final void g(byte param0) {
        jaggl.OpenGL.glLightfv(16384, 4611, this.field_Eb, 0);
        if (param0 <= 67) {
          this.field_Gc = 124;
        }
        jaggl.OpenGL.glLightfv(16385, 4611, this.field_Tb, 0);
    }

    final void c(int param0, int param1) {
        int var4;
        var4 = VoidHunters.field_G;
        if (param1 != 1) {
          if (param1 != 0) {
            if (param1 == 2) {
              this.b(34165, 7681, false);
            } else {
              if (param1 != 3) {
                if (param1 == 4) {
                  this.b(34023, 34023, false);
                }
              } else {
                this.b(260, 8448, false);
              }
            }
          } else {
            this.b(8448, 8448, false);
          }
        } else {
          this.b(7681, 7681, false);
        }
        if (param0 != 0) {
          qfa.a(117, false);
        }
    }

    private final void i(int param0, int param1) {
        if (param0 != 5888) {
          this.e(-78);
        }
        this.a(false, param1, true);
    }

    final boolean e() {
        return this.field_d.a(8, 3);
    }

    final static int[] a(int param0, int[] param1) {
        int var4 = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          if (param0 != 1) {
            qfa.a(69, false);
          }
          var8 = new int[param1.length];
          var2 = var8;
          var3 = 0;
          for (var4 = -2 + param1.length; 0 <= var4; var4 -= 2) {
            var5 = param1[var4];
            var6 = param1[1 + var4];
            var8[var3] = -var5;
            var8[1 + var3] = var6;
            var3 += 2;
          }
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("qfa.BD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(jaa param0, byte param1) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_Oc >= 0 &&
            param0 == this.field_kc[this.field_Oc]) {
            fieldTemp$1 = this.field_Oc;
            this.field_Oc = this.field_Oc - 1;
            this.field_kc[fieldTemp$1] = null;
            param0.d(70);
            if (param1 >= -68) {
              this.field_ic = -61L;
            }
            if (0 <= this.field_Oc) {
              this.field_W = this.field_kc[this.field_Oc];
              this.field_W.a(-62);
            } else {
              this.field_W = null;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("qfa.FD(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final aja a(int param0, int param1, boolean param2) {
        return (aja) ((Object) new tla(this, param0, param1, param2));
    }

    private final void a(boolean param0, int param1, boolean param2) {
        this.a(true, param2, 0, param1);
        if (param0) {
          int[] var5 = (int[]) null;
          this.K((int[]) null);
        }
    }

    private final void l(int param0) {
        if (param0 != 10) {
          this.c(78);
        }
        if (this.field_oc <= this.field_ab &&
          this.field_fb <= this.field_C) {
          jaggl.OpenGL.glScissor(this.field_oc + this.field_N, -this.field_C + this.field_Y + this.field_Fb, this.field_ab - this.field_oc, this.field_C - this.field_fb);
        } else {
          jaggl.OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    final hf a(ekb param0, wib param1) {
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
          return (hf) (stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("qfa.OB(");
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
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_fc.a(param0, param1, param2, param3, -5214);
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_yc = param3;
        this.field_Qb = param2;
        this.field_gc = param1;
        this.field_lb = param0;
        this.q(-2);
        this.o(100);
        if (this.field_Jb == 3) {
          this.r(-108);
        } else {
          if (2 == this.field_Jb) {
            this.d(118);
          }
        }
    }

    final void za(int param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        float var6;
        float var7;
        int var8;
        int var9;
        int var11;
        var11 = VoidHunters.field_G;
        if (param2 < 0) {
          param2 = -param2;
        }
        if (this.field_oc > param2 + param0) {
          return;
        }
        if (this.field_ab >= -param2 + param0 &&
          this.field_fb <= param1 + param2 &&
          this.field_C >= param1 - param2) {
          this.m(-63);
          this.d(param4, 69);
          jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
          var6 = 0.3499999940395355f + (float)param0;
          var7 = (float)param1 + 0.3499999940395355f;
          var8 = param2 << 1;
          if ((float)var8 < this.field_Mb) {
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glVertex2f(var6 + 1.0f, 1.0f + var7);
            jaggl.OpenGL.glVertex2f(1.0f + var6, var7 - 1.0f);
            jaggl.OpenGL.glVertex2f(var6 - 1.0f, -1.0f + var7);
            jaggl.OpenGL.glVertex2f(-1.0f + var6, var7 + 1.0f);
            jaggl.OpenGL.glEnd();
            return;
          }
          if (!((float)var8 <= this.field_Ac)) {
            jaggl.OpenGL.glBegin(6);
            jaggl.OpenGL.glVertex2f(var6, var7);
            var9 = 262144 / (6 * param2);
            if (var9 <= 64) {
              var9 = 64;
            } else {
              if (var9 > 512) {
                var9 = 512;
              }
            }
            var9 = wsb.a(var9, 1302374146);
            jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
            for (var10 = -var9 + 16384; var10 > 0; var10 = var10 - var9) {
              jaggl.OpenGL.glVertex2f(kn.field_o[var10] * (float)param2 + var6, kn.field_r[var10] * (float)param2 + var7);
            }
            jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
            jaggl.OpenGL.glEnd();
            return;
          }
          jaggl.OpenGL.glEnable(2832);
          jaggl.OpenGL.glPointSize((float)var8);
          jaggl.OpenGL.glBegin(0);
          jaggl.OpenGL.glVertex2f(var6, var7);
          jaggl.OpenGL.glEnd();
          jaggl.OpenGL.glDisable(2832);
          return;
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        if (param0 >= -55) {
          return;
        }
        hua var4 = new hua(param1);
        var4.field_b = (long)param2;
        this.field_xc.b(-10258, var4);
    }

    final void v() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (this.field_Hb) {
          if (0 >= this.field_Sb ||
            0 >= this.field_Y) {
            return;
          }
          var1 = this.field_oc;
          var2 = this.field_ab;
          var3 = this.field_fb;
          var4 = this.field_C;
          this.t(-79);
          jaggl.OpenGL.glReadBuffer(1028);
          jaggl.OpenGL.glDrawBuffer(1029);
          this.f((byte) -74);
          this.a(false, -115);
          this.b(-20951, false);
          this.a((byte) 32, false);
          this.a(false, (byte) 85);
          this.a(111, (pib) null);
          this.i(5888, -2);
          this.c(0, 1);
          this.d(0, 127);
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
          jaggl.OpenGL.glMatrixMode(5888);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glCopyPixels(0, 0, this.field_Sb, this.field_Y, 6144);
          jaggl.OpenGL.glFlush();
          jaggl.OpenGL.glReadBuffer(1029);
          jaggl.OpenGL.glDrawBuffer(1029);
          this.KA(var1, var3, var2, var4);
          return;
        }
    }

    qfa(java.awt.Canvas param0, d param1, int param2) {
        super(param1);
        long dupTemp$3 = 0L;
        int var9 = 0;
        int stackIn_12_1 = 0;
        boolean stackIn_52_1 = false;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
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
        this.field_hb = new Hashtable();
        this.field_X = 128;
        this.field_Ec = new vf();
        epb discarded$0 = new epb();
        epb discarded$1 = new epb();
        this.field_m = false;
        this.field_D = new ij();
        this.field_zc = -1;
        this.field_rc = -1;
        this.field_p = new jaa[4];
        this.field_kc = new jaa[4];
        this.field_Oc = -1;
        this.field_Gb = new jaa[4];
        this.field_E = new vga();
        this.field_Ic = new gnb(16);
        this.field_v = new ij();
        this.field_xc = new ij();
        this.field_Nc = new ij();
        this.field_hc = new ij();
        this.field_ec = new ij();
        this.field_Cc = new ij();
        this.field_zb = new ij();
        this.field_Db = new epb();
        this.field_F = new epb();
        this.field_Bb = new epb();
        this.field_i = 1.0f;
        this.field_J = -1;
        this.field_yc = 512;
        this.field_Xb = new float[16];
        this.field_tb = 8448;
        this.field_Jc = -1;
        this.field_G = -1.0f;
        this.field_H = -1.0f;
        this.field_oc = 0;
        this.field_jc = -1;
        this.field_Qb = 512;
        this.field_M = 0;
        this.field_C = 0;
        this.field_Pb = new float[4];
        this.field_N = 0;
        this.field_ob = 50;
        this.field_u = 0.0f;
        this.field_L = new float[4];
        this.field_lb = 0;
        this.field_Mb = -1.0f;
        this.field_gc = 0;
        this.field_nb = 1.0f;
        this.field_Hc = -1;
        this.field_Yb = false;
        this.field_ab = 0;
        this.field_Eb = new float[4];
        this.field_h = true;
        this.field_Fc = -1;
        this.field_K = new fsb[u.field_p];
        this.field_ub = 0;
        this.field_Ac = -1.0f;
        this.field_fb = 0;
        this.field_bb = 3584;
        this.field_Fb = 0;
        this.field_Cb = 1.0f;
        this.field_nc = 1.0f;
        this.field_Bc = 8448;
        this.field_Q = 1.0f;
        this.field_Tb = new float[4];
        mb discarded$2 = new mb(8192);
        try {
          this.field_ib = param0;
          this.field_Kc = param2;
          if (!gpb.a("jaclib", (byte) 114)) {
            throw new RuntimeException("");
          }
          if (!gpb.a("jaggl", (byte) 114)) {
            throw new RuntimeException("");
          }
          try {
            this.field_c = new jaggl.OpenGL();
            dupTemp$3 = this.field_c.init(param0, 8, 8, 8, 24, 0, this.field_Kc);
            this.field_uc = dupTemp$3;
            this.field_ic = dupTemp$3;
            if (this.field_uc == 0L) {
              throw new RuntimeException("");
            }
            this.w(127);
            var4_int = this.d((byte) 109);
            if (var4_int != 0) {
              throw new RuntimeException("");
            }
            if (this.field_ac) {
              stackIn_12_1 = 33639;
            } else {
              stackIn_12_1 = 5121;
            }
            this.field_cc = stackIn_12_1;
            if (this.field_Nb.indexOf("radeon") != -1) {
              var5_int = 0;
              var6 = 0;
              var7 = 0;
              var8 = up.a((byte) -67, ' ', this.field_Nb.replace('/', ' '));
              for (var9 = 0; var9 < var8.length; var9++) {
                var13 = var8[var9];
                var10 = var13;
                var10 = var13;
                var10 = var13;
                try {
                  boolean decompiledFrameRemainder0 = true;
                  if (var13.length() > 0) {
                    if (var13.charAt(0) == 120 &&
                      var13.length() >= 3) {
                      var21 = (CharSequence) ((Object) var13.substring(1, 3));
                      if (hwa.a(var21, 10)) {
                        var10 = var13.substring(1);
                        var7 = 1;
                      }
                    }
                    if (var10.equals("hd")) {
                      var6 = 1;
                    } else {
                      if (var10.startsWith("hd")) {
                        var10 = var10.substring(2);
                        var6 = 1;
                      }
                      if (var10.length() >= 4) {
                        var22 = (CharSequence) ((Object) var10.substring(0, 4));
                        if (hwa.a(var22, 10)) {
                          var23 = (CharSequence) ((Object) var10.substring(0, 4));
                          var5_int = lob.a(-86, var23);
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
                this.field_I = false;
              }
              if (var7 == 0 &&
                var6 == 0) {
                if (var5_int >= 7000 &&
                  var5_int <= 9250) {
                  this.field_tc = false;
                }
                if (7000 <= var5_int &&
                  var5_int <= 7999) {
                  this.field_cb = false;
                }
              }
              this.field_g = this.field_g & this.field_c.a("GL_ARB_half_float_pixel");
              this.field_k = this.field_cb;
            }
            if (this.field_Ab.indexOf("intel") != -1) {
              this.field_U = false;
            }
            stackIn_52_1 = !(this.field_Ab.equals("s3 graphics"));
            this.field_Hb = stackIn_52_1;
            if (this.field_cb) {
              try {
                var17 = new int[1];
                jaggl.OpenGL.glGenBuffersARB(1, var17, 0);
              } catch (java.lang.Throwable decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var5 = decompiledCaughtException;
                throw new RuntimeException("");
              }
            }
            ocb.a(false, (byte) 33, true);
            this.field_m = true;
            this.field_r = new rlb(this, this.field_a);
            this.c((byte) -92);
            this.field_yb = new nk(this);
            this.field_fc = new kha(this);
            if (this.field_fc.a(-128)) {
              this.field_A = new mpb(this);
              if (!this.field_A.f((byte) 72)) {
                this.field_A.c((byte) 66);
                this.field_A = null;
              }
            }
            this.field_d = new fbb(this);
            this.v(770);
            this.p(-1001);
            this.v();
            return;
          } catch (java.lang.Throwable decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var4 = decompiledCaughtException;
            var4.printStackTrace();
            this.o();
            throw new RuntimeException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_65_0 = var4_ref;
          stackIn_65_1 = new StringBuilder().append("qfa.<init>(");
          if (param0 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',');
          if (param1 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void g(int param0, int param1) {
        ksa var3 = new ksa();
        int var4 = -64 % ((60 - param1) / 52);
        var3.field_b = (long)param0;
        this.field_Cc.b(-10258, var3);
    }

    private final void q(int param0) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float[] var8;
        float var7;
        var8 = this.field_Xb;
        var2 = var8;
        if (param0 != -2) {
          return;
        }
        var3 = (float)(this.field_ob * -this.field_lb) / (float)this.field_Qb;
        var4 = (float)(this.field_ob * (-this.field_lb + this.field_Sb)) / (float)this.field_Qb;
        var5 = (float)(this.field_gc * this.field_ob) / (float)this.field_yc;
        var6 = (float)((this.field_gc - this.field_Y) * this.field_ob) / (float)this.field_yc;
        if (var4 != var3 &&
          var5 != var6) {
          var7 = 2.0f * (float)this.field_ob;
          var2[1] = 0.0f;
          var2[5] = var7 / (var5 - var6);
          var2[6] = 0.0f;
          var2[7] = 0.0f;
          var2[12] = 0.0f;
          this.field_Wb = -(var7 * (float)this.field_bb) / (float)(-this.field_ob + this.field_bb);
          var2[14] = -(var7 * (float)this.field_bb) / (float)(-this.field_ob + this.field_bb);
          var2[8] = (var4 + var3) / (var4 - var3);
          var2[2] = 0.0f;
          var2[3] = 0.0f;
          var2[0] = var7 / (-var3 + var4);
          var2[4] = 0.0f;
          var2[11] = -1.0f;
          var2[9] = (var6 + var5) / (var5 - var6);
          var2[15] = 0.0f;
          this.field_mb = (float)(-(this.field_bb + this.field_ob)) / (float)(-this.field_ob + this.field_bb);
          var2[10] = (float)(-(this.field_bb + this.field_ob)) / (float)(-this.field_ob + this.field_bb);
          var2[13] = 0.0f;
        } else {
          var8[8] = 0.0f;
          var8[12] = 0.0f;
          var8[6] = 0.0f;
          var8[14] = 0.0f;
          var8[10] = 1.0f;
          var8[15] = 1.0f;
          var8[11] = 0.0f;
          var8[3] = 0.0f;
          var8[2] = 0.0f;
          var8[13] = 0.0f;
          var8[0] = 1.0f;
          var8[5] = 1.0f;
          var8[1] = 0.0f;
          var8[7] = 0.0f;
          var8[4] = 0.0f;
          var8[9] = 0.0f;
        }
        this.d(false);
    }

    final void a(float param0, float param1, float param2) {
        pba.field_q = param2;
        u.field_q = param1;
        mqa.field_o = param0;
    }

    final pw d() {
        return (pw) ((Object) new epb());
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (param2 < this.field_ab) {
          this.field_ab = param2;
        }
        if (param1 > this.field_fb) {
          this.field_fb = param1;
        }
        if (this.field_C > param3) {
          this.field_C = param3;
        }
        if (this.field_oc < param0) {
          this.field_oc = param0;
        }
        jaggl.OpenGL.glEnable(3089);
        this.o(111);
        this.l(10);
    }

    final void ya() {
        this.a(true, (byte) -67);
        jaggl.OpenGL.glClear(256);
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7;
        float var8;
        float var9;
        this.m(-97);
        this.d(param5, 124);
        var7 = (float)param2 - (float)param0;
        var8 = (float)(-param1) + (float)param3;
        if (0.0f == var7 &&
          var8 == 0.0f) {
          var7 = 1.0f;
        } else {
          var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
          var7 = var7 * var9;
          var8 = var8 * var9;
        }
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 16), (byte)(param4 >> 8), (byte)param4, (byte)(param4 >> 24));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param0, 0.3499999940395355f + (float)param1);
        jaggl.OpenGL.glVertex2f(var7 + (float)param2 + 0.3499999940395355f, 0.3499999940395355f + ((float)param3 + var8));
        jaggl.OpenGL.glEnd();
    }

    final int j(int param0, int param1) {
        if (param1 != 25887) {
          this.j();
        }
        if (param0 == 1) {
          return 7681;
        }
        if (param0 == 0) {
          return 8448;
        }
        if (param0 == 2) {
          return 34165;
        }
        if (3 == param0) {
          return 260;
        }
        if (4 != param0) {
          throw new IllegalArgumentException();
        }
        return 34023;
    }

    final int e(int param0, int param1) {
        if (6406 == param0) {
          return 1;
        }
        if (param0 == 6409) {
          return 1;
        }
        if (param0 != 6410 &&
          param0 != 34846 &&
          34844 != param0) {
          if (param0 == 6407) {
            return 3;
          }
          if (6408 != param0 &&
            34847 != param0) {
            if (param0 == 34843) {
              return 6;
            }
            if (34842 == param0) {
              return 8;
            }
            if (param0 == 6402) {
              return 3;
            }
            if (param0 == 6401) {
              return 1;
            }
            if (param1 == 2) {
              throw new IllegalArgumentException("");
            }
            return -127;
          }
          return 4;
        }
        return 2;
    }

    final boolean r() {
        return !this.field_U && this.field_O;
    }

    final int t() {
        return 4;
    }

    final int[] Y() {
        return new int[]{this.field_lb, this.field_gc, this.field_Qb, this.field_yc};
    }

    private final void p(int param0) {
        java.awt.Dimension var2 = null;
        if (null == this.field_ib) {
          this.field_rb = 0;
          this.field_vb = 0;
        } else {
          var2 = this.field_ib.getSize();
          this.field_vb = var2.height;
          this.field_rb = var2.width;
        }
        if (param0 != -1001) {
          this.r(-4);
        }
        if (this.field_lc == null) {
          this.field_Sb = this.field_rb;
          this.field_Y = this.field_vb;
          this.f(27818);
        }
        this.f((byte) -92);
        this.t(108);
    }

    final void GA(int param0) {
        this.d(0, 100);
        jaggl.OpenGL.glClearColor((float)(param0 & 16711680) / 16711680.0f, (float)(65280 & param0) / 65280.0f, (float)(255 & param0) / 255.0f, (float)(param0 >>> 24) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    private final void g(int param0) {
        fsb var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var2 = 0;
        int var7 = VoidHunters.field_G;
        for (var2 = 0; this.field_P > var2; var2++) {
          var3 = this.field_K[var2];
          var4 = 16386 + var2;
          we.field_o[0] = (float)var3.c((byte) -79);
          we.field_o[1] = (float)var3.a(true);
          we.field_o[2] = (float)var3.d((byte) 47);
          we.field_o[3] = 1.0f;
          jaggl.OpenGL.glLightfv(var4, 4611, we.field_o, 0);
          var5 = var3.a(-62);
          var6 = var3.d(-392138175) / 255.0f;
          we.field_o[2] = var6 * (float)dla.a(255, var5);
          we.field_o[0] = var6 * (float)dla.a(var5 >> 16, 255);
          we.field_o[1] = (float)dla.a(var5 >> 8, 255) * var6;
          jaggl.OpenGL.glLightfv(var4, 4609, we.field_o, 0);
          jaggl.OpenGL.glLightf(var4, 4617, 1.0f / (float)(var3.c(16777215) * var3.c(16777215)));
          jaggl.OpenGL.glEnable(var4);
        }
        while (var2 < this.field_Rb) {
          jaggl.OpenGL.glDisable(var2 + 16386);
          var2++;
        }
        if (param0 <= 16) {
          this.m(-35);
        }
        this.field_Rb = this.field_P;
    }

    private final void j(int param0) {
        tdb.field_o[2] = this.field_H * this.field_i;
        tdb.field_o[3] = 1.0f;
        tdb.field_o[0] = this.field_H * this.field_nb;
        tdb.field_o[1] = this.field_H * this.field_nc;
        jaggl.OpenGL.glLightfv(param0, 4609, tdb.field_o, 0);
        tdb.field_o[1] = -this.field_G * this.field_nc;
        tdb.field_o[2] = -this.field_G * this.field_i;
        tdb.field_o[0] = -this.field_G * this.field_nb;
        tdb.field_o[3] = 1.0f;
        jaggl.OpenGL.glLightfv(16385, 4609, tdb.field_o, 0);
    }

    private final int d(byte param0) {
        int stackIn_30_0 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        String var3 = null;
        String[] var4 = null;
        int var5_int = 0;
        NumberFormatException var5 = null;
        int var6 = 0;
        int[] var9 = null;
        this.field_Ab = jaggl.OpenGL.glGetString(7936).toLowerCase();
        var2 = 0;
        this.field_Nb = jaggl.OpenGL.glGetString(7937).toLowerCase();
        if (this.field_Ab.indexOf("microsoft") != -1) {
          var2 = var2 | 1;
        }
        if (this.field_Ab.indexOf("brian paul") != -1 ||
          this.field_Ab.indexOf("mesa") != -1) {
          var2 = var2 | 1;
        }
        var3 = jaggl.OpenGL.glGetString(7938);
        var4 = up.a((byte) -67, ' ', var3.replace('.', ' '));
        if (var4.length >= 2) {
          try {
            var5_int = lob.a(107, (CharSequence) ((Object) var4[0]));
            var6 = lob.a(46, (CharSequence) ((Object) var4[1]));
            this.field_f = 10 * var5_int + var6;
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (NumberFormatException) (Object) decompiledCaughtException;
            var2 = var2 | 4;
          }
        } else {
          var2 = var2 | 4;
        }
        if (12 > this.field_f) {
          var2 = var2 | 2;
        }
        if (!this.field_c.a("GL_ARB_multitexture")) {
          var2 = var2 | 8;
        }
        if (!this.field_c.a("GL_ARB_texture_env_combine")) {
          var2 = var2 | 32;
        }
        var9 = new int[1];
        jaggl.OpenGL.glGetIntegerv(34018, var9, 0);
        this.field_Dc = var9[0];
        if (param0 <= 76) {
          return -61;
        }
        jaggl.OpenGL.glGetIntegerv(34929, var9, 0);
        this.field_t = var9[0];
        jaggl.OpenGL.glGetIntegerv(34930, var9, 0);
        this.field_dc = var9[0];
        if (this.field_Dc < 2 ||
          2 > this.field_t ||
          this.field_dc < 2) {
          var2 = var2 | 16;
        }
        this.field_ac = jaclib.memory.Stream.a();
        this.field_O = this.field_c.arePbuffersAvailable();
        this.field_cb = this.field_c.a("GL_ARB_vertex_buffer_object");
        this.field_y = this.field_c.a("GL_ARB_multisample");
        this.field_Zb = this.field_c.a("GL_ARB_vertex_program");
        this.field_c.a("GL_ARB_fragment_program");
        this.field_bc = this.field_c.a("GL_ARB_vertex_shader");
        this.field_B = this.field_c.a("GL_ARB_fragment_shader");
        this.field_tc = this.field_c.a("GL_EXT_texture3D");
        this.field_g = this.field_c.a("GL_ARB_texture_rectangle");
        this.field_S = this.field_c.a("GL_ARB_texture_cube_map");
        this.field_I = this.field_c.a("GL_ARB_texture_float");
        this.field_n = false;
        this.field_U = this.field_c.a("GL_EXT_framebuffer_object");
        this.field_Ob = this.field_c.a("GL_EXT_framebuffer_blit");
        this.field_gb = this.field_c.a("GL_EXT_framebuffer_multisample");
        this.field_sc = this.field_Ob & this.field_gb;
        this.field_eb = fjb.field_b.startsWith("mac");
        jaggl.OpenGL.glGetFloatv(2834, tdb.field_o, 0);
        this.field_Ac = tdb.field_o[1];
        this.field_Mb = tdb.field_o[0];
        stackIn_30_0 = (var2 == 0) ? 0 : var2;
        return stackIn_30_0;
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 <= 67) {
          return;
        }
        hua var3 = new hua(param1);
        this.field_hc.b(-10258, var3);
    }

    final boolean k() {
        return true;
    }

    final boolean q() {
        return true;
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.m(54);
        this.d(param4, 107);
        float var6 = 0.3499999940395355f + (float)param0;
        float var7 = (float)param1 + 0.3499999940395355f;
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(var6, var7);
        jaggl.OpenGL.glVertex2f((float)param2 + var6, var7);
        jaggl.OpenGL.glEnd();
    }

    private final void b(boolean param0) {
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMultMatrixf(this.field_F.a(param0), 0);
        if (this.field_Yb) {
          this.field_d.field_b.e(34336);
        }
        this.g((byte) 95);
        this.g(22);
    }

    final rtb a(boolean param0) {
        if (param0) {
          return (rtb) null;
        }
        if (null == this.field_s) {
          return null;
        }
        return this.field_s.a((byte) -123);
    }

    final void a(hf param0) {
    }

    final void j() {
        if (!this.field_U) {
          if (!this.field_O) {
            throw new RuntimeException("");
          }
          this.field_qc.c(0, this.field_Sb, 0, 0, 101, 0, this.field_Y);
          this.field_c.setSurface(this.field_ic);
        } else {
          if (this.field_jb != this.field_lc) {
            throw new RuntimeException();
          }
          this.field_jb.a(0, (byte) -14);
          this.field_jb.a(8, (byte) -6);
          this.a(this.field_jb, 2896);
        }
        this.field_Sb = this.field_rb;
        this.field_qc = null;
        this.field_Y = this.field_vb;
        this.f((byte) -100);
        this.f(27818);
        this.t(119);
    }

    final void n(int param0) {
        if (param0 != 27841) {
          this.b(28, false);
        }
        if (this.field_x != 2) {
          this.i(3);
          this.a(false, -128);
          this.b(-20951, false);
          this.a((byte) 32, false);
          this.a(false, (byte) -103);
          this.i(5888, -2);
          this.field_x = 2;
        }
    }

    final void d(int param0, int param1) {
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        boolean stackIn_18_1 = false;
        int stackIn_22_0 = 0;
        int stackIn_25_1 = 0;
        boolean stackIn_33_1 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = VoidHunters.field_G;
        if (this.field_e != param0) {
          if (1 != param0) {
            if (param0 == 2) {
              var4 = 0;
              var5 = 2;
              var3 = 1;
            } else {
              if (128 != param0) {
                var3 = 1;
                var5 = 0;
                var4 = 0;
              } else {
                var3 = 1;
                var5 = 3;
                var4 = 1;
              }
            }
          } else {
            var3 = 1;
            var4 = 1;
            var5 = 1;
          }
          stackIn_11_0 = (this.field_Lb) ? 0 : 1;
          stackIn_14_1 = (var3 != 0) ? 0 : 1;
          if (stackIn_11_0 != stackIn_14_1) {
            jaggl.OpenGL.glColorMask(var3 != 0, var3 != 0, var3 != 0, true);
            stackIn_18_1 = (var3 != 0);
            this.field_Lb = stackIn_18_1;
          }
          stackIn_22_0 = (var4 != 0) ? 0 : 1;
          stackIn_25_1 = (this.field_db) ? 0 : 1;
          if (stackIn_22_0 != stackIn_25_1) {
            if (var4 == 0) {
              jaggl.OpenGL.glDisable(3008);
            } else {
              jaggl.OpenGL.glEnable(3008);
            }
            stackIn_33_1 = (var4 != 0);
            this.field_db = stackIn_33_1;
          }
          if (var5 != this.field_xb) {
            if (1 != var5) {
              if (2 == var5) {
                jaggl.OpenGL.glEnable(3042);
                jaggl.OpenGL.glBlendFunc(1, 1);
              } else {
                if (3 != var5) {
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
            this.field_xb = var5;
          }
          this.field_e = param0;
          this.field_x = this.field_x & -29;
        }
        if (param1 < 57) {
          this.i(101, -67);
        }
    }

    final int i() {
        return this.field_ob;
    }

    private final void b(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 < 84) {
          this.a(85, 1, 117, -49);
        }
        stackIn_6_0 = (this.field_Ub) && (this.field_h);
        jaggl.OpenGL.glDepthMask(stackIn_6_0);
    }

    final boolean w() {
        return true;
    }

    private final void a(boolean param0, int param1) {
        if (param1 >= -114) {
          return;
        }
        if ((!this.field_Lc ? 1 : 0) != (!param0 ? 1 : 0)) {
          this.field_Lc = param0 ? true : false;
          this.h(0);
          this.field_x = this.field_x & -32;
        }
    }

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
        int stackIn_3_0 = 0;
        int var7;
        float var8;
        stackIn_3_0 = (param0 == this.field_Jc) ? 0 : 1;
        var7 = stackIn_3_0;
        if (var7 != 0 ||
          param1 != this.field_H ||
          this.field_G != param2) {
          this.field_G = param2;
          this.field_H = param1;
          this.field_Jc = param0;
          if (var7 != 0) {
            this.field_nc = (float)(65280 & this.field_Jc) / 65280.0f;
            this.field_nb = (float)(this.field_Jc & 16711680) / 16711680.0f;
            this.field_i = (float)(this.field_Jc & 255) / 255.0f;
            this.e((byte) -115);
          }
          this.j(16384);
        }
        if (this.field_L[0] != param3 ||
          param4 != this.field_L[1] ||
          this.field_L[2] != param5) {
          this.field_L[1] = param4;
          this.field_L[0] = param3;
          this.field_L[2] = param5;
          this.field_Pb[2] = -param5;
          this.field_Pb[1] = -param4;
          this.field_Pb[0] = -param3;
          var8 = (float)(1.0 / Math.sqrt((double)(param5 * param5 + (param3 * param3 + param4 * param4))));
          this.field_Eb[1] = param4 * var8;
          this.field_Eb[0] = param3 * var8;
          this.field_Eb[2] = param5 * var8;
          this.field_Tb[0] = -this.field_Eb[0];
          this.field_Tb[2] = -this.field_Eb[2];
          this.field_Tb[1] = -this.field_Eb[1];
          this.g((byte) 84);
        }
    }

    private final void k(int param0) {
        if (this.field_Vb) {
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glMatrixMode(5888);
          this.field_Vb = false;
        }
        if (param0 != 0) {
          this.c(true);
        }
    }

    final void c(int param0, int param1, int param2) {
        this.field_Fb = param0;
        this.field_N = param1;
        this.f(27818);
        this.l(param2 + 10);
        if (param2 != 0) {
          this.field_Gb = (jaa[]) null;
        }
    }

    final void a(jaa param0, int param1) {
        int fieldTemp$3 = 0;
        jaa dupTemp$4 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          if (param1 != 2896) {
            return;
          }
          if (!this.field_Ob) {
            if (0 <= this.field_zc &&
              param0 == this.field_p[this.field_zc]) {
              fieldTemp$3 = this.field_zc;
              this.field_zc = this.field_zc - 1;
              this.field_p[fieldTemp$3] = null;
              param0.b((byte) -75);
              if (this.field_zc < 0) {
                this.field_lc = null;
                this.field_W = null;
                return;
              }
              dupTemp$4 = this.field_p[this.field_zc];
              this.field_lc = dupTemp$4;
              this.field_W = dupTemp$4;
              this.field_W.b(param1 - 8470);
              return;
            }
            throw new RuntimeException();
          }
          this.a(param0, (byte) -120);
          this.b((byte) 101, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("qfa.SD(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean m() {
        return false;
    }

    final synchronized void c(int param0) {
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int var2;
        int var4;
        hua var5;
        hua var6;
        hua var7;
        hua var8;
        hua var9;
        ksa var10;
        ksa var11;
        hua var12;
        var4 = VoidHunters.field_G;
        param0 = param0 & 2147483647;
        var2 = 0;
        while (!this.field_xc.b(-67)) {
          var5 = (hua) (this.field_xc.a(true));
          incrementValue$4 = var2;
          var2++;
          cm.field_j[incrementValue$4] = (int)var5.field_b;
          this.field_mc = this.field_mc - var5.field_d;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteBuffersARB(var2, cm.field_j, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteBuffersARB(var2, cm.field_j, 0);
          var2 = 0;
        }
        while (!this.field_Nc.b(121)) {
          var6 = (hua) (this.field_Nc.a(true));
          incrementValue$3 = var2;
          var2++;
          cm.field_j[incrementValue$3] = (int)var6.field_b;
          this.field_sb = this.field_sb - var6.field_d;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteTextures(var2, cm.field_j, 0);
          var2 = 0;
        }
        boolean decompiledFrameCompleted0 = true;
        L4: {
          if (var2 <= 0) {
            do {
              if (this.field_hc.b(114)) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var7 = (hua) (this.field_hc.a(true));
              incrementValue$0 = var2;
              var2++;
              cm.field_j[incrementValue$0] = var7.field_d;
            } while (var2 != 1000);
            if (decompiledFrameCompleted0) {
              jaggl.OpenGL.glDeleteFramebuffersEXT(var2, cm.field_j, 0);
              var2 = 0;
              break L4;
            }
          }
          if (decompiledFrameCompleted0) {
            jaggl.OpenGL.glDeleteTextures(var2, cm.field_j, 0);
            var2 = 0;
          }
        }
        if (decompiledFrameCompleted0) {
          while (!this.field_hc.b(114)) {
            var7 = (hua) (this.field_hc.a(true));
            incrementValue$1 = var2;
            var2++;
            cm.field_j[incrementValue$1] = var7.field_d;
            if (var2 != 1000) {
              continue;
            }
            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, cm.field_j, 0);
            var2 = 0;
          }
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, cm.field_j, 0);
          var2 = 0;
        }
        while (!this.field_ec.b(105)) {
          var8 = (hua) (this.field_ec.a(true));
          incrementValue$2 = var2;
          var2++;
          cm.field_j[incrementValue$2] = (int)var8.field_b;
          this.field_q = this.field_q - var8.field_d;
          stackIn_28_0 = ~var2;
          stackIn_28_1 = -1001;
          if (stackIn_28_0 != stackIn_28_1) {
            continue;
          }
          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, cm.field_j, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, cm.field_j, 0);
          var2 = 0;
        }
        while (!this.field_v.b(124)) {
          var9 = (hua) (this.field_v.a(true));
          jaggl.OpenGL.glDeleteLists((int)var9.field_b, var9.field_d);
        }
        while (!this.field_Cc.b(112)) {
          var10 = this.field_Cc.a(true);
          jaggl.OpenGL.glDeleteProgramARB((int)var10.field_b);
        }
        while (!this.field_zb.b(106)) {
          var11 = this.field_zb.a(true);
          jaggl.OpenGL.glDeleteObjectARB(var11.field_b);
        }
        while (!this.field_v.b(-104)) {
          var12 = (hua) (this.field_v.a(true));
          jaggl.OpenGL.glDeleteLists((int)var12.field_b, var12.field_d);
        }
        this.field_r.a(true);
        if (!(this.u(97) <= 100663296) &&
          !(60000L + this.field_vc >= wt.a(false))) {
          System.gc();
          this.field_vc = wt.a(false);
        }
        this.field_Mc = param0;
        return;
    }

    private final int u(int param0) {
        int var2 = 0 / ((param0 - 29) / 37);
        return this.field_mc + this.field_sb + this.field_q;
    }

    private final void e(boolean param0) {
        if (this.field_l &&
          !this.field_j) {
          jaggl.OpenGL.glEnable(2896);
        } else {
          jaggl.OpenGL.glDisable(2896);
        }
        if (param0) {
          this.field_M = 70;
        }
    }

    final aja a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        tla stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new tla(this, param3, param4, param0, param1, param2);
          return (aja) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("qfa.W(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void b(int param0, boolean param1) {
        if ((!param1 ? 1 : 0) == (this.field_l ? 1 : 0)) {
          this.field_l = param1 ? true : false;
          this.e(false);
          this.field_x = this.field_x & -8;
        }
        if (param0 != -20951) {
          this.field_Vb = true;
        }
    }

    final void f(int param0, int param1) {
        if (param0 != this.field_ob ||
          param1 != this.field_bb) {
          this.field_ob = param0;
          this.field_bb = param1;
          this.q(-2);
          this.s(2915);
          if (this.field_Jb == 3) {
            this.r(-105);
          } else {
            if (this.field_Jb == 2) {
              this.d(115);
            }
          }
        }
    }

    final boolean p() {
        return true;
    }

    final void b(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, param0 + param3, param2);
        jaggl.OpenGL.glTexEnvi(8960, 34200 + param0, param1);
    }

    final za e(int param0) {
        gpa var2 = new gpa(param0);
        this.field_D.b(-10258, var2);
        return (za) ((Object) var2);
    }

    private final void h(int param0) {
        if (this.field_Lc &&
          this.field_jc >= 0) {
          jaggl.OpenGL.glEnable(2912);
        } else {
          jaggl.OpenGL.glDisable(2912);
        }
        if (param0 != 0) {
          this.a(-73, -124, 96);
        }
    }

    final void a(int param0, jaa param1) {
        int fieldTemp$0 = 0;
        try {
          if (3 <= this.field_Oc) {
            throw new RuntimeException();
          }
          if (param0 < 41) {
            this.a(false);
          }
          if (this.field_Oc >= 0) {
            this.field_kc[this.field_Oc].d(105);
          }
          fieldTemp$0 = this.field_Oc + 1;
          this.field_Oc = this.field_Oc + 1;
          this.field_kc[fieldTemp$0] = param1;
          this.field_W = param1;
          this.field_W.a(86);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qfa.ND(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) throws jkb {
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        try {
          this.field_c.swapBuffers();
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
        }
    }

    private final void e(byte param0) {
        tdb.field_o[3] = 1.0f;
        tdb.field_o[2] = this.field_pc * this.field_i;
        tdb.field_o[0] = this.field_nb * this.field_pc;
        tdb.field_o[1] = this.field_nc * this.field_pc;
        jaggl.OpenGL.glLightModelfv(2899, tdb.field_o, 0);
        if (param0 >= -33) {
          this.e(false);
        }
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
          this.i(3);
          this.a(61, (pib) null);
          this.d(0, 127);
          jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
          jaggl.OpenGL.glRasterPos2i(param0, param1);
          jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, this.field_cc, param4, param5);
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qfa.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean f() {
        boolean stackIn_6_0 = false;
        boolean decompiledFrameRemainder0 = true;
        if (this.field_y && (!this.s() ||
          this.field_sc)) {
          stackIn_6_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_6_0 = false;
        }
        return stackIn_6_0;
    }

    private final void h(byte param0) {
        this.field_c.b();
        if (param0 != -46) {
          this.o(46);
        }
    }

    final boolean x() {
        return this.field_U || this.field_O;
    }

    static {
    }
}
