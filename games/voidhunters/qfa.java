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
            ((qfa) this).field_ic = -58L;
        }
        ((qfa) this).field_Xb[14] = ((qfa) this).field_Wb;
        ((qfa) this).field_Xb[10] = ((qfa) this).field_mb;
    }

    private final void a(boolean param0, boolean param1, int param2, int param3) {
        aia var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        opa var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          L1: {
            var13 = VoidHunters.field_G;
            if (param3 != ((qfa) this).field_o) {
              break L1;
            } else {
              L2: {
                stackOut_1_0 = ((qfa) this).field_Yb;
                stackIn_3_0 = stackOut_1_0;
                stackIn_2_0 = stackOut_1_0;
                if (((qfa) this).field_kb) {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  break L2;
                } else {
                  stackOut_2_0 = stackIn_2_0;
                  stackOut_2_1 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  break L2;
                }
              }
              if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L3: {
            var5 = null;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (!((qfa) this).field_kb) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L3;
            } else {
              stackOut_7_0 = 3;
              stackIn_9_0 = stackOut_7_0;
              break L3;
            }
          }
          L4: {
            var9 = stackIn_9_0;
            if (param3 >= 0) {
              L5: {
                L6: {
                  var5 = ((qfa) this).field_r.a((byte) -125, param3);
                  var10 = ((qfa) this).field_a.a(-20292, param3);
                  if (0 != var10.field_p) {
                    break L6;
                  } else {
                    if (var10.field_d != 0) {
                      break L6;
                    } else {
                      this.k(param2 + 0);
                      break L5;
                    }
                  }
                }
                L7: {
                  if (!var10.field_h) {
                    stackOut_16_0 = 128;
                    stackIn_17_0 = stackOut_16_0;
                    break L7;
                  } else {
                    stackOut_15_0 = 64;
                    stackIn_17_0 = stackOut_15_0;
                    break L7;
                  }
                }
                var11 = stackIn_17_0;
                var12 = 50 * var11;
                this.a(0.0f, (float)(((qfa) this).field_Mc % var12 * var10.field_p) / (float)var12, 5890, (float)(var10.field_d * (((qfa) this).field_Mc % var12)) / (float)var12);
                break L5;
              }
              L8: {
                if (((qfa) this).field_kb) {
                  break L8;
                } else {
                  var8 = var10.field_o;
                  var7 = var10.field_n;
                  var9 = var10.field_c;
                  break L8;
                }
              }
              var6 = var10.field_f;
              break L4;
            } else {
              this.k(param2 ^ 0);
              break L4;
            }
          }
          L9: {
            ((qfa) this).field_d.a(param0, param1, var7, -109, var9, var8);
            if (((qfa) this).field_d.a((pib) (Object) var5, 74, var6)) {
              break L9;
            } else {
              ((qfa) this).a(58, (pib) (Object) var5);
              ((qfa) this).c(param2 + 0, var6);
              break L9;
            }
          }
          ((qfa) this).field_Yb = ((qfa) this).field_kb;
          ((qfa) this).field_o = param3;
          break L0;
        }
        L10: {
          if (param2 == 0) {
            break L10;
          } else {
            ((qfa) this).field_yb = null;
            break L10;
          }
        }
        ((qfa) this).field_x = ((qfa) this).field_x & -8;
    }

    final void h(int param0, int param1) {
        if (param1 != ((qfa) this).field_Z) {
            jaggl.OpenGL.glActiveTexture(33984 + param1);
            ((qfa) this).field_Z = param1;
        }
        if (param0 != 33984) {
            Object var4 = null;
            ((qfa) this).b(46, (jaa) null);
        }
    }

    final void b(boolean param0, int param1) {
        tdb.field_o[3] = (float)(param1 >>> -1748731848) / 255.0f;
        tdb.field_o[2] = (float)dla.a(param1, 255) / 255.0f;
        if (!param0) {
            ((qfa) this).field_U = true;
        }
        tdb.field_o[0] = (float)dla.a(16711680, param1) / 16711680.0f;
        tdb.field_o[1] = (float)dla.a(param1, 65280) / 65280.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, tdb.field_o, 0);
    }

    final aja a(ima param0, boolean param1) {
        int[] var3 = null;
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
        int[] var13 = null;
        int[] var14 = null;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          var10 = new int[param0.field_f * param0.field_e];
          var14 = var10;
          var13 = var14;
          var12 = var13;
          var11 = var12;
          var3 = var11;
          var4 = 0;
          var5 = 0;
          if (param0.field_a != null) {
            var6_int = 0;
            L1: while (true) {
              if (param0.field_e <= var6_int) {
                break L0;
              } else {
                var7 = 0;
                L2: while (true) {
                  if (param0.field_f <= var7) {
                    var6_int++;
                    continue L1;
                  } else {
                    var5++;
                    var3[var5] = knb.a(param0.field_b[dla.a(255, (int) param0.field_h[var4])], param0.field_a[var4] << -85105096);
                    var4++;
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var6_int = 0;
            L3: while (true) {
              if (param0.field_e <= var6_int) {
                break L0;
              } else {
                var7 = 0;
                L4: while (true) {
                  if (param0.field_f <= var7) {
                    var6_int++;
                    continue L3;
                  } else {
                    L5: {
                      var4++;
                      var8 = param0.field_b[param0.field_h[var4] & 255];
                      var5++;
                      stackOut_5_0 = (int[]) var10;
                      stackOut_5_1 = var5;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var8 == 0) {
                        stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        break L5;
                      } else {
                        stackOut_6_0 = (int[]) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = knb.a(var8, -16777216);
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        break L5;
                      }
                    }
                    stackIn_8_0[stackIn_8_1] = stackIn_8_2;
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        var6 = ((qfa) this).a(param0.field_f, param0.field_f, var14, 0, (byte) 96, param0.field_e);
        var6.a(param0.field_c, param0.field_g, param0.field_i, param0.field_d);
        return var6;
    }

    final void b(int param0, int param1, boolean param2) {
        int var4 = 0;
        if (((qfa) this).field_Z == 0) {
            var4 = 0;
            if (param0 != ((qfa) this).field_Bc) {
                jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
                var4 = 1;
                ((qfa) this).field_Bc = param0;
            }
            if (param1 != ((qfa) this).field_tb) {
                jaggl.OpenGL.glTexEnvi(8960, 34162, param1);
                ((qfa) this).field_tb = param1;
                var4 = 1;
            }
            // ifeq L104
            ((qfa) this).field_x = ((qfa) this).field_x & -30;
        } else {
            jaggl.OpenGL.glTexEnvi(8960, 34161, param0);
            jaggl.OpenGL.glTexEnvi(8960, 34162, param1);
        }
        if (param2) {
            ((qfa) this).field_jb = null;
        }
    }

    final void a(za param0) {
        mb var3 = null;
        L0: {
          ((qfa) this).field_Kb = ((gpa) (Object) param0).field_e;
          if (((qfa) this).field_z != null) {
            break L0;
          } else {
            L1: {
              var3 = new mb(80);
              if (!((qfa) this).field_ac) {
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
                break L1;
              } else {
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
                break L1;
              }
            }
            ((qfa) this).field_z = ((qfa) this).a(var3.field_h, 20, var3.field_e, false, (byte) 121);
            od discarded$2 = new od(((qfa) this).field_z, 5126, 3, 0);
            od discarded$3 = new od(((qfa) this).field_z, 5126, 2, 12);
            ((qfa) this).field_Ec.a(8, (qfa) this);
            break L0;
          }
        }
    }

    final void KA(int param0, int param1, int param2, int param3) {
        if (((qfa) this).field_Sb < param2) {
            param2 = ((qfa) this).field_Sb;
        }
        if (((qfa) this).field_Y < param3) {
            param3 = ((qfa) this).field_Y;
        }
        if (!(param1 >= 0)) {
            param1 = 0;
        }
        if (!((param0 ^ -1) <= -1)) {
            param0 = 0;
        }
        ((qfa) this).field_fb = param1;
        ((qfa) this).field_oc = param0;
        ((qfa) this).field_ab = param2;
        ((qfa) this).field_C = param3;
        jaggl.OpenGL.glEnable(3089);
        this.o(124);
        this.l(10);
    }

    final void b(int param0, jaa param1) {
        if (!(3 > ((qfa) this).field_rc)) {
            throw new RuntimeException();
        }
        if (((qfa) this).field_rc >= param0) {
            ((qfa) this).field_Gb[((qfa) this).field_rc].a((byte) 90);
        }
        ((qfa) this).field_rc = ((qfa) this).field_rc + 1;
        ((qfa) this).field_Gb[((qfa) this).field_rc + 1] = param1;
        ((qfa) this).field_lc = param1;
        ((qfa) this).field_lc.c(31636);
    }

    final void a(int param0, uq param1) {
        if (param0 != 34962) {
            ((qfa) this).a(0.2658414840698242f, 1.4282253980636597f, 20);
        }
        if (!(param1 == ((qfa) this).field_T)) {
            if (((qfa) this).field_cb) {
                jaggl.OpenGL.glBindBufferARB(34962, param1.a(true));
            }
            ((qfa) this).field_T = param1;
        }
    }

    final void a(byte param0, jaa param1) {
        if (param0 >= -105) {
            ((qfa) this).a(34, -50, (byte) 51);
        }
        if (((qfa) this).field_Ob) {
            ((qfa) this).a(75, param1);
            ((qfa) this).b(0, param1);
        } else {
            if (((qfa) this).field_zc >= 3) {
                throw new RuntimeException();
            }
            if (((qfa) this).field_zc >= 0) {
                ((qfa) this).field_p[((qfa) this).field_zc].b((byte) -128);
            }
            ((qfa) this).field_zc = ((qfa) this).field_zc + 1;
            ((qfa) this).field_p[((qfa) this).field_zc + 1] = param1;
            ((qfa) this).field_lc = param1;
            ((qfa) this).field_W = param1;
            ((qfa) this).field_W.b(-5574);
        }
    }

    final void c(int param0, boolean param1) {
        if (param0 != 32925) {
            ((qfa) this).field_vb = -92;
        }
        if (param1 != ((qfa) this).field_j) {
            ((qfa) this).field_j = param1 ? true : false;
            this.e(false);
        }
    }

    final static void a(int param0, boolean param1) {
        sga.field_p = param1 ? true : false;
        int var2 = -9 % ((param0 - 13) / 33);
        osa.field_e = param1 ? true : false;
    }

    final ka a(cbb param0, int param1, int param2, int param3, int param4) {
        return (ka) (Object) new ne((qfa) this, param0, param1, param3, param4, param2);
    }

    final void t(int param0) {
        ((qfa) this).field_oc = 0;
        ((qfa) this).field_C = ((qfa) this).field_Y;
        ((qfa) this).field_fb = 0;
        ((qfa) this).field_ab = ((qfa) this).field_Sb;
        jaggl.OpenGL.glDisable(3089);
        int var2 = -12 % ((45 - param0) / 61);
        this.o(107);
    }

    final void a(aja param0, boolean param1) {
        tob var3 = null;
        tob var3_ref = null;
        nv var3_ref2 = null;
        fh var4 = null;
        int var6 = 0;
        nv var7 = null;
        nv var8 = null;
        tob var9 = null;
        tob var10 = null;
        L0: {
          var6 = VoidHunters.field_G;
          ((qfa) this).field_qc = (tla) (Object) param0;
          if (!((qfa) this).field_U) {
            if (((qfa) this).field_O) {
              L1: {
                var3 = (tob) (Object) ((qfa) this).field_Ic.a((long)(((qfa) this).field_qc.d() << -112855472 | ((qfa) this).field_qc.a()), 116);
                if (var3 != null) {
                  break L1;
                } else {
                  var9 = new tob((qfa) this, ((qfa) this).field_qc.d(), ((qfa) this).field_qc.a());
                  var3_ref = var9;
                  ((qfa) this).field_Gc = ((qfa) this).field_Gc + 4 * var9.field_m;
                  L2: while (true) {
                    L3: {
                      if (-2097153 <= (((qfa) this).field_Gc ^ -1)) {
                        break L3;
                      } else {
                        var4 = ((qfa) this).field_E.b(1);
                        if (var4 == null) {
                          break L3;
                        } else {
                          var10 = (tob) (Object) var4;
                          var10.d((byte) -35);
                          var10.b(-3846);
                          ((qfa) this).field_c.releasePbuffer(var10.f(-128));
                          ((qfa) this).field_Gc = ((qfa) this).field_Gc - var10.field_m;
                          continue L2;
                        }
                      }
                    }
                    ((qfa) this).field_Ic.a((long)(((qfa) this).field_qc.d() << -1298095344 | ((qfa) this).field_qc.a()), (ksa) (Object) var9, (byte) -120);
                    break L1;
                  }
                }
              }
              ((qfa) this).field_E.a((fh) (Object) var3_ref, (byte) -22);
              ((qfa) this).field_c.setPbuffer(var3_ref.f(-128));
              break L0;
            } else {
              throw new RuntimeException("");
            }
          } else {
            L4: {
              if (((qfa) this).field_jb == null) {
                ((qfa) this).field_jb = new rpa((qfa) this);
                break L4;
              } else {
                break L4;
              }
            }
            if ((Object) (Object) ((qfa) this).field_lc != (Object) (Object) ((qfa) this).field_jb) {
              L5: {
                ((qfa) this).a((byte) -109, (jaa) (Object) ((qfa) this).field_jb);
                if (!param1) {
                  break L5;
                } else {
                  L6: {
                    var3_ref2 = (nv) (Object) ((qfa) this).field_Ic.a((long)(((qfa) this).field_qc.d() << 1088783632 | ((qfa) this).field_qc.a()), 100);
                    if (var3_ref2 != null) {
                      break L6;
                    } else {
                      var7 = new nv((qfa) this, 6402, ((qfa) this).field_qc.d(), ((qfa) this).field_qc.a());
                      var3_ref = (tob) (Object) var7;
                      ((qfa) this).field_Gc = ((qfa) this).field_Gc + var7.field_m;
                      L7: while (true) {
                        L8: {
                          if ((((qfa) this).field_Gc ^ -1) >= -2097153) {
                            break L8;
                          } else {
                            var4 = ((qfa) this).field_E.b(1);
                            if (var4 == null) {
                              break L8;
                            } else {
                              var8 = (nv) (Object) var4;
                              var8.d((byte) -35);
                              var8.b(-3846);
                              var8.e((byte) 124);
                              ((qfa) this).field_Gc = ((qfa) this).field_Gc - var8.field_m;
                              continue L7;
                            }
                          }
                        }
                        ((qfa) this).field_Ic.a((long)(((qfa) this).field_qc.d() << 475764976 | ((qfa) this).field_qc.a()), (ksa) (Object) var7, (byte) -124);
                        break L6;
                      }
                    }
                  }
                  ((qfa) this).field_E.a((fh) (Object) var3_ref, (byte) -22);
                  ((qfa) this).field_jb.a(8, (nv) (Object) var3_ref, (byte) -20);
                  break L5;
                }
              }
              ((qfa) this).field_jb.a(0, (byte) -126, (aia) (Object) ((qfa) this).field_qc.field_f);
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        }
        ((qfa) this).field_Sb = param0.d();
        ((qfa) this).field_Y = param0.a();
        this.f((byte) -61);
        this.f(27818);
        ((qfa) this).t(-70);
    }

    final boolean a() {
        return true;
    }

    final void s(int param0, int param1, int param2, int param3, int param4) {
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = VoidHunters.field_G;
          if ((param2 ^ -1) > -1) {
            param2 = -param2;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 + param2 < ((qfa) this).field_oc) {
          return;
        } else {
          L1: {
            if (((qfa) this).field_ab < -param2 + param0) {
              break L1;
            } else {
              if (((qfa) this).field_fb > param2 + param1) {
                break L1;
              } else {
                if (((qfa) this).field_C >= -param2 + param1) {
                  this.m(-88);
                  ((qfa) this).d(param4, 114);
                  jaggl.OpenGL.glColor4ub((byte)(param3 >> -1050627216), (byte)(param3 >> -1637302616), (byte)param3, (byte)(param3 >> -2060627592));
                  if (1 >= param2) {
                    jaggl.OpenGL.glBegin(7);
                    jaggl.OpenGL.glVertex2f((float)(param0 - -1), (float)(1 + param1));
                    jaggl.OpenGL.glVertex2f((float)(param0 - -1), (float)(param1 + -1));
                    jaggl.OpenGL.glVertex2f((float)(param0 + -1), (float)(param1 - 1));
                    jaggl.OpenGL.glVertex2f((float)(param0 - 1), (float)(1 + param1));
                    jaggl.OpenGL.glEnd();
                    return;
                  } else {
                    L2: {
                      var6 = (float)param0 + 0.3499999940395355f;
                      jaggl.OpenGL.glBegin(2);
                      var7 = (float)param1 + 0.3499999940395355f;
                      var8 = 262144 / (param2 * 6);
                      if (64 >= var8) {
                        var8 = 64;
                        break L2;
                      } else {
                        if (-513 > (var8 ^ -1)) {
                          var8 = 512;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var8 = wsb.a(var8, 1302374146);
                    jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
                    var9 = -var8 + 16384;
                    L3: while (true) {
                      if (0 >= var9) {
                        jaggl.OpenGL.glEnd();
                        return;
                      } else {
                        jaggl.OpenGL.glVertex2f(var6 + (float)param2 * kn.field_o[var9], var7 + (float)param2 * kn.field_r[var9]);
                        var9 = var9 - var8;
                        continue L3;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    final da a(sw param0, ima[] param1, boolean param2) {
        return (da) (Object) new fn((qfa) this, param0, param1, param2);
    }

    final void xa(float param0) {
        if (!(param0 == ((qfa) this).field_pc)) {
            ((qfa) this).field_pc = param0;
            this.e((byte) -122);
        }
    }

    private final void i(int param0) {
        if (param0 != 3) {
            return;
        }
        if (!((((qfa) this).field_Jb ^ -1) == -2)) {
            jaggl.OpenGL.glMatrixMode(5889);
            jaggl.OpenGL.glLoadIdentity();
            if (((qfa) this).field_Sb > 0) {
                if (0 < ((qfa) this).field_Y) {
                    jaggl.OpenGL.glOrtho(0.0, (double)((qfa) this).field_Sb, (double)((qfa) this).field_Y, 0.0, -1.0, 1.0);
                }
            }
            jaggl.OpenGL.glMatrixMode(5888);
            jaggl.OpenGL.glLoadIdentity();
            ((qfa) this).field_Jb = 1;
            ((qfa) this).field_x = ((qfa) this).field_x & -25;
        }
    }

    final boolean h() {
        return false;
    }

    final void K(int[] param0) {
        param0[0] = ((qfa) this).field_oc;
        param0[2] = ((qfa) this).field_ab;
        param0[3] = ((qfa) this).field_C;
        param0[1] = ((qfa) this).field_fb;
    }

    private final void r(int param0) {
        float var2 = (float)(-((qfa) this).field_lb) * ((qfa) this).field_Cb / (float)((qfa) this).field_Qb;
        float var3 = ((qfa) this).field_Cb * (float)(-((qfa) this).field_gc) / (float)((qfa) this).field_yc;
        float var4 = (float)(-((qfa) this).field_lb + ((qfa) this).field_Sb) * ((qfa) this).field_Cb / (float)((qfa) this).field_Qb;
        float var5 = (float)(-((qfa) this).field_gc + ((qfa) this).field_Y) * ((qfa) this).field_Cb / (float)((qfa) this).field_yc;
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        if (param0 >= -80) {
            return;
        }
        if (var2 != var4) {
            if (var3 != var5) {
                jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)((qfa) this).field_ob, (double)((qfa) this).field_bb);
            }
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final int[] na(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int[] var8 = new int[param2 * param3];
        int[] var5 = var8;
        for (var6 = 0; var6 < param3; var6++) {
            jaggl.OpenGL.glReadPixelsi(param0, -var6 + -param1 + ((qfa) this).field_Y, param2, 1, 32993, ((qfa) this).field_cc, var8, var6 * param2);
        }
        return var8;
    }

    final boolean c() {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (((qfa) this).field_A == null) {
              break L1;
            } else {
              L2: {
                if ((((qfa) this).field_Kc ^ -1) >= -2) {
                  break L2;
                } else {
                  if (!((qfa) this).field_sc) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        jaggl.OpenGL.glLineWidth((float)param5);
        ((qfa) this).b(param0, param1, param2, param3, param4, param6);
        jaggl.OpenGL.glLineWidth(1.0f);
    }

    final void b(byte param0, jaa param1) {
        L0: {
          if (((qfa) this).field_rc < 0) {
            break L0;
          } else {
            if (param1 == ((qfa) this).field_Gb[((qfa) this).field_rc]) {
              L1: {
                ((qfa) this).field_rc = ((qfa) this).field_rc - 1;
                ((qfa) this).field_Gb[((qfa) this).field_rc] = null;
                param1.a((byte) 55);
                if (0 <= ((qfa) this).field_rc) {
                  ((qfa) this).field_lc = ((qfa) this).field_Gb[((qfa) this).field_rc];
                  ((qfa) this).field_lc.c(31636);
                  break L1;
                } else {
                  ((qfa) this).field_lc = null;
                  break L1;
                }
              }
              L2: {
                if (param0 == 101) {
                  break L2;
                } else {
                  int discarded$2 = ((qfa) this).e(-34, -7);
                  break L2;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    private final void s(int param0) {
        ((qfa) this).field_w = -((qfa) this).field_u + (float)(-((qfa) this).field_ub + ((qfa) this).field_bb);
        ((qfa) this).field_wb = ((qfa) this).field_w - (float)((qfa) this).field_jc * ((qfa) this).field_Q;
        if (!(((qfa) this).field_wb >= (float)((qfa) this).field_ob)) {
            ((qfa) this).field_wb = (float)((qfa) this).field_ob;
        }
        jaggl.OpenGL.glFogf(param0, ((qfa) this).field_wb);
        jaggl.OpenGL.glFogf(2916, ((qfa) this).field_w);
        tdb.field_o[1] = (float)dla.a(((qfa) this).field_J, 65280) / 65280.0f;
        tdb.field_o[2] = (float)dla.a(((qfa) this).field_J, 255) / 255.0f;
        tdb.field_o[0] = (float)dla.a(((qfa) this).field_J, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, tdb.field_o, 0);
    }

    final boolean n() {
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.m(-125);
        ((qfa) this).d(param9, 126);
        jaggl.OpenGL.glBegin(4);
        jaggl.OpenGL.glColor4ub((byte)(param6 >> 1887091632), (byte)(param6 >> 706434024), (byte)param6, (byte)(param6 >> -1140492488));
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param0, (float)param1 + 0.3499999940395355f);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 232477776), (byte)(param7 >> 683011304), (byte)param7, (byte)(param7 >> -965313640));
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param2, 0.3499999940395355f + (float)param3);
        jaggl.OpenGL.glColor4ub((byte)(param8 >> -313381392), (byte)(param8 >> 419515048), (byte)param8, (byte)(param8 >> -1253720712));
        jaggl.OpenGL.glVertex2f((float)param4 + 0.3499999940395355f, 0.3499999940395355f + (float)param5);
        jaggl.OpenGL.glEnd();
    }

    final void c(boolean param0) {
        if (!(((qfa) this).field_x == 4)) {
            this.i(3);
            this.a(false, -119);
            this.b(-20951, false);
            this.a((byte) 32, false);
            this.a(false, (byte) 66);
            this.i(5888, -2);
            ((qfa) this).d(1, 74);
            ((qfa) this).field_x = 4;
        }
        if (param0) {
            ((qfa) this).T(-60, 98, 93, -48);
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        hua var4 = new hua(param0);
        var4.field_b = (long)param1;
        ((qfa) this).field_ec.b(-10258, (ksa) (Object) var4);
        if (param2 < 8) {
            ((qfa) this).field_s = null;
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 102 / ((param1 - 17) / 41);
        if (!(param0 == ((qfa) this).field_Ub)) {
            ((qfa) this).field_Ub = param0 ? true : false;
            this.b((byte) 98);
            ((qfa) this).field_x = ((qfa) this).field_x & -32;
        }
    }

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = (float)param1 + 0.3499999940395355f;
        float var9 = -1.0f + (var7 + (float)param2);
        float var10 = -1.0f + ((float)param3 + var8);
        this.m(-71);
        ((qfa) this).d(param5, 124);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> -2106934416), (byte)(param4 >> -662840120), (byte)param4, (byte)(param4 >> 1941830808));
        if (((qfa) this).field_y) {
            jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(2);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (!(!((qfa) this).field_y)) {
            jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void w(int param0) {
        int var3 = VoidHunters.field_G;
        int var2 = 0;
        if (param0 < 40) {
            ((qfa) this).field_Cc = null;
        }
        while (!((qfa) this).field_c.a()) {
            var2++;
            if (!(5 >= var2)) {
                throw new RuntimeException("");
            }
            gdb.b(50, 1000L);
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, 34176 - -param0, param3);
        jaggl.OpenGL.glTexEnvi(8960, param1 - -param0, param2);
    }

    final uq a(byte[] param0, int param1, int param2, boolean param3, byte param4) {
        if (((qfa) this).field_cb) {
            if (param3) {
                // ifeq L36
            }
            return (uq) (Object) new oaa((qfa) this, param1, param0, param2, param3);
        }
        if (param4 < 115) {
            return null;
        }
        return (uq) (Object) new dda((qfa) this, param1, param0, param2);
    }

    private final void o(int param0) {
        if (param0 <= 98) {
            ((qfa) this).t(-19);
        }
    }

    final void a(int param0, pib param1) {
        int var4 = VoidHunters.field_G;
        pib var3 = ((qfa) this).field_wc[((qfa) this).field_Z];
        if (var3 != param1) {
            if (param1 == null) {
                jaggl.OpenGL.glDisable(var3.field_b);
            } else {
                if (var3 == null) {
                    jaggl.OpenGL.glEnable(param1.field_b);
                } else {
                    if (!(param1.field_b == var3.field_b)) {
                        jaggl.OpenGL.glDisable(var3.field_b);
                        jaggl.OpenGL.glEnable(param1.field_b);
                    }
                }
                jaggl.OpenGL.glBindTexture(param1.field_b, param1.b(23307));
            }
            ((qfa) this).field_wc[((qfa) this).field_Z] = param1;
        }
        ((qfa) this).field_x = ((qfa) this).field_x & -2;
        if (param0 < 24) {
            ((qfa) this).field_kb = true;
        }
    }

    final synchronized void a(byte param0, long param1) {
        if (param0 != 18) {
            ((qfa) this).field_Fc = -96;
        }
        ksa var4 = new ksa();
        var4.field_b = param1;
        ((qfa) this).field_zb.b(-10258, var4);
    }

    final wib b(int param0, int param1) {
        return null;
    }

    private final void a(byte param0, boolean param1) {
        if (param0 != 32) {
            ((qfa) this).field_Lc = false;
        }
        if (((qfa) this).field_R != param1) {
            if (param1) {
                jaggl.OpenGL.glEnable(2929);
            } else {
                jaggl.OpenGL.glDisable(2929);
            }
            ((qfa) this).field_R = param1 ? true : false;
            ((qfa) this).field_x = ((qfa) this).field_x & -32;
        }
    }

    final void u() {
        ((qfa) this).field_fc.c(124);
    }

    final void o() {
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = VoidHunters.field_G;
        ksa var1 = ((qfa) this).field_D.d(0);
        while (var1 != null) {
            ((gpa) (Object) var1).a(false);
            var1 = ((qfa) this).field_D.a((byte) 25);
        }
        if (!(((qfa) this).field_fc == null)) {
            ((qfa) this).field_fc.a(true);
        }
        if (null != ((qfa) this).field_c) {
            this.h((byte) -46);
            var1 = (ksa) (Object) ((qfa) this).field_hb.keys();
            while (((Enumeration) (Object) var1).hasMoreElements()) {
                var2 = (java.awt.Canvas) ((Enumeration) (Object) var1).nextElement();
                var3 = (Long) ((qfa) this).field_hb.get((Object) (Object) var2);
                ((qfa) this).field_c.releaseSurface(var2, var3.longValue());
            }
            ((qfa) this).field_c.release();
            ((qfa) this).field_c = null;
        }
        if (((qfa) this).field_m) {
            uhb.a((byte) 102, true, false);
            ((qfa) this).field_m = false;
        }
    }

    private final void d(int param0) {
        if (param0 <= 111) {
            Object var3 = null;
            ((qfa) this).SA(15, 87, -102, 81, (int[]) null, -122, 82);
        }
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(((qfa) this).field_Xb, 0);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    private final void v(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float[] var6 = null;
        var5 = VoidHunters.field_G;
        this.i(param0 ^ 5122, -2);
        var2 = ((qfa) this).field_Dc - 1;
        L0: while (true) {
          if (var2 < 0) {
            ((qfa) this).b(8448, 8448, false);
            ((qfa) this).c(2, 34192, param0, 34168);
            this.k(param0 ^ 770);
            ((qfa) this).field_e = 1;
            jaggl.OpenGL.glEnable(3042);
            jaggl.OpenGL.glBlendFunc(770, 771);
            ((qfa) this).field_xb = 1;
            jaggl.OpenGL.glEnable(3008);
            jaggl.OpenGL.glAlphaFunc(516, 0.0f);
            ((qfa) this).field_db = true;
            jaggl.OpenGL.glColorMask(true, true, true, true);
            ((qfa) this).field_Lb = true;
            this.a(true, -123);
            this.b(-20951, true);
            this.a((byte) 32, true);
            this.a(true, (byte) -75);
            this.f((byte) -25);
            ((qfa) this).field_c.setSwapInterval(0);
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
            var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
            var3 = 0;
            L1: while (true) {
              if (8 <= var3) {
                jaggl.OpenGL.glEnable(16384);
                jaggl.OpenGL.glEnable(16385);
                jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
                jaggl.OpenGL.glFogi(2917, 9729);
                jaggl.OpenGL.glHint(3156, 4353);
                ((qfa) this).field_Jc = -1;
                ((qfa) this).field_J = -1;
                ((qfa) this).t(107);
                return;
              } else {
                var4 = var3 + 16384;
                jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
                jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
                jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
                var3++;
                continue L1;
              }
            }
          } else {
            ((qfa) this).h(33984, var2);
            ((qfa) this).a(param0 + -729, (pib) null);
            jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
            var2--;
            continue L0;
          }
        }
    }

    private final void f(byte param0) {
        if (0 != ((qfa) this).field_Jb) {
            ((qfa) this).field_Jb = 0;
            ((qfa) this).field_x = ((qfa) this).field_x & -32;
        }
        if (param0 > -4) {
            ((qfa) this).field_jb = null;
        }
    }

    private final void m(int param0) {
        if (!(((qfa) this).field_x == 1)) {
            this.i(3);
            this.a(false, -127);
            this.b(-20951, false);
            this.a((byte) 32, false);
            this.a(false, (byte) 122);
            ((qfa) this).a(115, (pib) null);
            this.i(5888, -2);
            ((qfa) this).c(0, 1);
            ((qfa) this).field_x = 1;
        }
        int var2 = 89 % ((param0 - -17) / 44);
    }

    final int XA() {
        return ((qfa) this).field_bb;
    }

    final boolean b() {
        if (null != ((qfa) this).field_A) {
            if (!((qfa) this).field_A.e((byte) 117)) {
                if (!((qfa) this).field_fc.a(2998, (mea) (Object) ((qfa) this).field_A)) {
                    return false;
                }
                ((qfa) this).field_r.b(-58);
            }
            return true;
        }
        return false;
    }

    private final void a(float param0, float param1, int param2, float param3) {
        jaggl.OpenGL.glMatrixMode(param2);
        if (((qfa) this).field_Vb) {
            jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glTranslatef(param1, param3, param0);
        jaggl.OpenGL.glMatrixMode(5888);
        ((qfa) this).field_Vb = true;
    }

    private final void f(int param0) {
        jaggl.OpenGL.glViewport(((qfa) this).field_N, ((qfa) this).field_Fb, ((qfa) this).field_Sb, ((qfa) this).field_Y);
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
        ((qfa) this).field_Nc.b(-10258, (ksa) (Object) var4);
        if (param1 <= 14) {
            ((qfa) this).field_w = 0.8722803592681885f;
        }
    }

    private final void c(byte param0) {
        ((qfa) this).field_wc = new pib[((qfa) this).field_Dc];
        ((qfa) this).field_qb = new aia((qfa) this, 3553, 6408, 1, 1);
        aia discarded$0 = new aia((qfa) this, 3553, 6408, 1, 1);
        aia discarded$1 = new aia((qfa) this, 3553, 6408, 1, 1);
        ne discarded$2 = new ne((qfa) this);
        ne discarded$3 = new ne((qfa) this);
        ne discarded$4 = new ne((qfa) this);
        ne discarded$5 = new ne((qfa) this);
        ne discarded$6 = new ne((qfa) this);
        ne discarded$7 = new ne((qfa) this);
        ne discarded$8 = new ne((qfa) this);
        ne discarded$10 = new ne((qfa) this);
        if (param0 > -54) {
            ((qfa) this).c(102, -80);
        }
        ne discarded$11 = new ne((qfa) this);
        ne discarded$13 = new ne((qfa) this);
        if (((qfa) this).field_U) {
            ((qfa) this).field_pb = new rpa((qfa) this);
            rpa discarded$14 = new rpa((qfa) this);
        }
    }

    final void a(pw param0) {
        ((qfa) this).field_Db.a(false, param0);
        ((qfa) this).field_F.a(false, (pw) (Object) ((qfa) this).field_Db);
        ((qfa) this).field_F.b(5);
        ((qfa) this).field_Bb.a((pw) (Object) ((qfa) this).field_F, 14);
        if (-2 != (((qfa) this).field_Jb ^ -1)) {
            this.b(true);
        }
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.3499999940395355f + (float)param0;
        float var8 = 0.3499999940395355f + (float)param1;
        float var9 = (float)param2 + var7;
        float var10 = var8 + (float)param3;
        this.m(80);
        ((qfa) this).d(param5, 67);
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 1768708912), (byte)(param4 >> 491600392), (byte)param4, (byte)(param4 >> -717469448));
        if (!(!((qfa) this).field_y)) {
            jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (!(!((qfa) this).field_y)) {
            jaggl.OpenGL.glEnable(32925);
        }
    }

    final boolean s() {
        return null != ((qfa) this).field_A && ((qfa) this).field_A.e((byte) 57);
    }

    final void a(float param0, float param1, int param2) {
        ((qfa) this).field_u = param0;
        ((qfa) this).field_Q = param1;
        this.s(2915);
        if (param2 != 0) {
            ((qfa) this).field_k = false;
        }
    }

    final void a(float param0, float param1, boolean param2, float param3, float param4) {
        if (param2) {
            ((qfa) this).field_Qb = 91;
        }
        tdb.field_o[3] = param0;
        tdb.field_o[0] = param4;
        tdb.field_o[1] = param1;
        tdb.field_o[2] = param3;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, tdb.field_o, 0);
    }

    final void P(int param0, int param1, int param2, int param3, int param4) {
        this.m(106);
        ((qfa) this).d(param4, 62);
        float var6 = (float)param0 + 0.3499999940395355f;
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 2038225936), (byte)(param3 >> 949524232), (byte)param3, (byte)(param3 >> 956297624));
        float var7 = (float)param1 + 0.3499999940395355f;
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(var6, var7);
        jaggl.OpenGL.glVertex2f(var6, (float)param2 + var7);
        jaggl.OpenGL.glEnd();
    }

    private final void g(byte param0) {
        jaggl.OpenGL.glLightfv(16384, 4611, ((qfa) this).field_Eb, 0);
        if (param0 <= 67) {
            ((qfa) this).field_Gc = 124;
        }
        jaggl.OpenGL.glLightfv(16385, 4611, ((qfa) this).field_Tb, 0);
    }

    final void c(int param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (param1 != 1) {
            if (param1 != 0) {
              if (param1 == -3) {
                ((qfa) this).b(34165, 7681, false);
                break L0;
              } else {
                if (-4 != param1) {
                  if ((param1 ^ -1) != -5) {
                    break L0;
                  } else {
                    ((qfa) this).b(34023, 34023, false);
                    break L0;
                  }
                } else {
                  ((qfa) this).b(260, 8448, false);
                  break L0;
                }
              }
            } else {
              ((qfa) this).b(8448, 8448, false);
              break L0;
            }
          } else {
            ((qfa) this).b(7681, 7681, false);
            break L0;
          }
        }
        L1: {
          if (param0 == 0) {
            break L1;
          } else {
            qfa.a(117, false);
            break L1;
          }
        }
    }

    private final void i(int param0, int param1) {
        if (param0 != 5888) {
            za discarded$0 = ((qfa) this).e(-78);
        }
        this.a(false, param1, true);
    }

    final boolean e() {
        return ((qfa) this).field_d.a(8, 3);
    }

    final static int[] a(int param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        if (param0 != 1) {
            qfa.a(69, false);
        }
        int[] var8 = new int[param1.length];
        int[] var2 = var8;
        int var3 = 0;
        for (var4 = -2 + param1.length; 0 <= var4; var4 -= 2) {
            var5 = param1[var4];
            var6 = param1[1 + var4];
            var8[var3] = -var5;
            var8[1 + var3] = var6;
            var3 += 2;
        }
        return var2;
    }

    final void a(jaa param0, byte param1) {
        if (-1 >= (((qfa) this).field_Oc ^ -1)) {
            // if_acmpne L26
        } else {
            throw new RuntimeException();
        }
        ((qfa) this).field_Oc = ((qfa) this).field_Oc - 1;
        ((qfa) this).field_kc[((qfa) this).field_Oc] = null;
        param0.d(70);
        if (param1 >= -68) {
            ((qfa) this).field_ic = -61L;
        }
        if (0 > ((qfa) this).field_Oc) {
            ((qfa) this).field_W = null;
        } else {
            ((qfa) this).field_W = ((qfa) this).field_kc[((qfa) this).field_Oc];
            ((qfa) this).field_W.a(-62);
        }
    }

    final aja a(int param0, int param1, boolean param2) {
        return (aja) (Object) new tla((qfa) this, param0, param1, param2);
    }

    private final void a(boolean param0, int param1, boolean param2) {
        this.a(true, param2, 0, param1);
        if (param0) {
            Object var5 = null;
            ((qfa) this).K((int[]) null);
        }
    }

    private final void l(int param0) {
        if (param0 != 10) {
            ((qfa) this).c(78);
        }
        if (((qfa) this).field_oc <= ((qfa) this).field_ab) {
            // if_icmpgt L86
            jaggl.OpenGL.glScissor(((qfa) this).field_oc + ((qfa) this).field_N, -((qfa) this).field_C + ((qfa) this).field_Y + ((qfa) this).field_Fb, ((qfa) this).field_ab + -((qfa) this).field_oc, ((qfa) this).field_C - ((qfa) this).field_fb);
        } else {
            jaggl.OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    final hf a(ekb param0, wib param1) {
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        boolean discarded$0 = ((qfa) this).field_fc.a(param0, param1, param2, param3, -5214);
    }

    final void DA(int param0, int param1, int param2, int param3) {
        L0: {
          ((qfa) this).field_yc = param3;
          ((qfa) this).field_Qb = param2;
          ((qfa) this).field_gc = param1;
          ((qfa) this).field_lb = param0;
          this.q(-2);
          this.o(100);
          if ((((qfa) this).field_Jb ^ -1) == -4) {
            this.r(-108);
            break L0;
          } else {
            if (2 == ((qfa) this).field_Jb) {
              this.d(118);
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    final void za(int param0, int param1, int param2, int param3, int param4) {
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = VoidHunters.field_G;
          if ((param2 ^ -1) <= -1) {
            break L0;
          } else {
            param2 = -param2;
            break L0;
          }
        }
        if (((qfa) this).field_oc > param2 + param0) {
          return;
        } else {
          L1: {
            if (((qfa) this).field_ab < -param2 + param0) {
              break L1;
            } else {
              if (((qfa) this).field_fb > param1 + param2) {
                break L1;
              } else {
                if (((qfa) this).field_C < param1 + -param2) {
                  break L1;
                } else {
                  this.m(-63);
                  ((qfa) this).d(param4, 69);
                  jaggl.OpenGL.glColor4ub((byte)(param3 >> -278248688), (byte)(param3 >> 188865608), (byte)param3, (byte)(param3 >> 1545398136));
                  var6 = 0.3499999940395355f + (float)param0;
                  var7 = (float)param1 + 0.3499999940395355f;
                  var8 = param2 << -1663794911;
                  if ((float)var8 >= ((qfa) this).field_Mb) {
                    L2: {
                      if ((float)var8 > ((qfa) this).field_Ac) {
                        L3: {
                          jaggl.OpenGL.glBegin(6);
                          jaggl.OpenGL.glVertex2f(var6, var7);
                          var9 = 262144 / (6 * param2);
                          if (var9 <= 64) {
                            var9 = 64;
                            break L3;
                          } else {
                            if (-513 > (var9 ^ -1)) {
                              var9 = 512;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var9 = wsb.a(var9, 1302374146);
                        jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
                        var10 = -var9 + 16384;
                        L4: while (true) {
                          if (-1 <= (var10 ^ -1)) {
                            jaggl.OpenGL.glVertex2f(var6 + (float)param2, var7);
                            jaggl.OpenGL.glEnd();
                            break L2;
                          } else {
                            jaggl.OpenGL.glVertex2f(kn.field_o[var10] * (float)param2 + var6, kn.field_r[var10] * (float)param2 + var7);
                            var10 = var10 - var9;
                            continue L4;
                          }
                        }
                      } else {
                        jaggl.OpenGL.glEnable(2832);
                        jaggl.OpenGL.glPointSize((float)var8);
                        jaggl.OpenGL.glBegin(0);
                        jaggl.OpenGL.glVertex2f(var6, var7);
                        jaggl.OpenGL.glEnd();
                        jaggl.OpenGL.glDisable(2832);
                        break L2;
                      }
                    }
                    return;
                  } else {
                    jaggl.OpenGL.glBegin(7);
                    jaggl.OpenGL.glVertex2f(var6 + 1.0f, 1.0f + var7);
                    jaggl.OpenGL.glVertex2f(1.0f + var6, var7 - 1.0f);
                    jaggl.OpenGL.glVertex2f(var6 - 1.0f, -1.0f + var7);
                    jaggl.OpenGL.glVertex2f(-1.0f + var6, var7 + 1.0f);
                    jaggl.OpenGL.glEnd();
                    return;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        if (param0 >= -55) {
            return;
        }
        hua var4 = new hua(param1);
        var4.field_b = (long)param2;
        ((qfa) this).field_xc.b(-10258, (ksa) (Object) var4);
    }

    final void v() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (!((qfa) this).field_Hb) {
          return;
        } else {
          L0: {
            if (0 >= ((qfa) this).field_Sb) {
              break L0;
            } else {
              if (0 < ((qfa) this).field_Y) {
                var1 = ((qfa) this).field_oc;
                var2 = ((qfa) this).field_ab;
                var3 = ((qfa) this).field_fb;
                var4 = ((qfa) this).field_C;
                ((qfa) this).t(-79);
                jaggl.OpenGL.glReadBuffer(1028);
                jaggl.OpenGL.glDrawBuffer(1029);
                this.f((byte) -74);
                this.a(false, -115);
                this.b(-20951, false);
                this.a((byte) 32, false);
                this.a(false, (byte) 85);
                ((qfa) this).a(111, (pib) null);
                this.i(5888, -2);
                ((qfa) this).c(0, 1);
                ((qfa) this).d(0, 127);
                jaggl.OpenGL.glMatrixMode(5889);
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                jaggl.OpenGL.glMatrixMode(5888);
                jaggl.OpenGL.glLoadIdentity();
                jaggl.OpenGL.glRasterPos2i(0, 0);
                jaggl.OpenGL.glCopyPixels(0, 0, ((qfa) this).field_Sb, ((qfa) this).field_Y, 6144);
                jaggl.OpenGL.glFlush();
                jaggl.OpenGL.glReadBuffer(1029);
                jaggl.OpenGL.glDrawBuffer(1029);
                ((qfa) this).KA(var1, var3, var2, var4);
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    qfa(java.awt.Canvas param0, d param1, int param2) {
        super(param1);
        String var13_ref = null;
        Throwable var4 = null;
        int var4_int = 0;
        Throwable var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object[] var8 = null;
        String[] var8_array = null;
        int var9 = 0;
        String var10 = null;
        Exception var11 = null;
        Object var13 = null;
        int[] var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        CharSequence var21 = null;
        CharSequence var22 = null;
        CharSequence var23 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_48_0 = null;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        var13_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = null;
                    var20 = null;
                    ((qfa) this).field_hb = new Hashtable();
                    ((qfa) this).field_X = 128;
                    ((qfa) this).field_Ec = new vf();
                    epb discarded$3 = new epb();
                    epb discarded$4 = new epb();
                    ((qfa) this).field_m = false;
                    ((qfa) this).field_D = new ij();
                    ((qfa) this).field_zc = -1;
                    ((qfa) this).field_rc = -1;
                    ((qfa) this).field_p = new jaa[4];
                    ((qfa) this).field_kc = new jaa[4];
                    ((qfa) this).field_Oc = -1;
                    ((qfa) this).field_Gb = new jaa[4];
                    ((qfa) this).field_E = new vga();
                    ((qfa) this).field_Ic = new gnb(16);
                    ((qfa) this).field_v = new ij();
                    ((qfa) this).field_xc = new ij();
                    ((qfa) this).field_Nc = new ij();
                    ((qfa) this).field_hc = new ij();
                    ((qfa) this).field_ec = new ij();
                    ((qfa) this).field_Cc = new ij();
                    ((qfa) this).field_zb = new ij();
                    ((qfa) this).field_Db = new epb();
                    ((qfa) this).field_F = new epb();
                    ((qfa) this).field_Bb = new epb();
                    ((qfa) this).field_i = 1.0f;
                    ((qfa) this).field_J = -1;
                    ((qfa) this).field_yc = 512;
                    ((qfa) this).field_Xb = new float[16];
                    ((qfa) this).field_tb = 8448;
                    ((qfa) this).field_Jc = -1;
                    ((qfa) this).field_G = -1.0f;
                    ((qfa) this).field_H = -1.0f;
                    ((qfa) this).field_oc = 0;
                    ((qfa) this).field_jc = -1;
                    ((qfa) this).field_Qb = 512;
                    ((qfa) this).field_M = 0;
                    ((qfa) this).field_C = 0;
                    ((qfa) this).field_Pb = new float[4];
                    ((qfa) this).field_N = 0;
                    ((qfa) this).field_ob = 50;
                    ((qfa) this).field_u = 0.0f;
                    ((qfa) this).field_L = new float[4];
                    ((qfa) this).field_lb = 0;
                    ((qfa) this).field_Mb = -1.0f;
                    ((qfa) this).field_gc = 0;
                    ((qfa) this).field_nb = 1.0f;
                    ((qfa) this).field_Hc = -1;
                    ((qfa) this).field_Yb = false;
                    ((qfa) this).field_ab = 0;
                    ((qfa) this).field_Eb = new float[4];
                    ((qfa) this).field_h = true;
                    ((qfa) this).field_Fc = -1;
                    ((qfa) this).field_K = new fsb[u.field_p];
                    ((qfa) this).field_ub = 0;
                    ((qfa) this).field_Ac = -1.0f;
                    ((qfa) this).field_fb = 0;
                    ((qfa) this).field_bb = 3584;
                    ((qfa) this).field_Fb = 0;
                    ((qfa) this).field_Cb = 1.0f;
                    ((qfa) this).field_nc = 1.0f;
                    ((qfa) this).field_Bc = 8448;
                    ((qfa) this).field_Q = 1.0f;
                    ((qfa) this).field_Tb = new float[4];
                    mb discarded$5 = new mb(8192);
                    ((qfa) this).field_ib = param0;
                    ((qfa) this).field_Kc = param2;
                    if (gpb.a("jaclib", (byte) 114)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    throw new RuntimeException("");
                }
                case 2: {
                    if (gpb.a("jaggl", (byte) 114)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    throw new RuntimeException("");
                }
                case 4: {
                    try {
                        ((qfa) this).field_c = new jaggl.OpenGL();
                        ((qfa) this).field_uc = ((qfa) this).field_c.init(param0, 8, 8, 8, 24, 0, ((qfa) this).field_Kc);
                        ((qfa) this).field_ic = ((qfa) this).field_c.init(param0, 8, 8, 8, 24, 0, ((qfa) this).field_Kc);
                        if (((qfa) this).field_uc != 0L) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.w(127);
                        var4_int = this.d((byte) 109);
                        if (-1 == (var4_int ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = this;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (((qfa) this).field_ac) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 5121;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 33639;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((qfa) this).field_cc = stackIn_11_1;
                        if ((((qfa) this).field_Nb.indexOf("radeon") ^ -1) == 0) {
                            statePc = 46;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int = 0;
                        var6 = 0;
                        var7 = 0;
                        var8_array = up.a((byte) -67, ' ', ((qfa) this).field_Nb.replace('/', ' '));
                        var9 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var9 >= var8_array.length) {
                            statePc = 34;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var13_ref = var8_array[var9];
                        var10 = var13_ref;
                        var10 = var13_ref;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var13_ref.length() <= 0) {
                            statePc = 33;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var13_ref.charAt(0) != 120) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var13_ref.length() < 3) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var21 = (CharSequence) (Object) var13_ref.substring(1, 3);
                        if (!hwa.a(var21, 10)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var10 = var13_ref.substring(1);
                        var7 = 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var10.equals((Object) (Object) "hd")) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6 = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (!var10.startsWith("hd")) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = (stateCaught_26 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10 = var10.substring(2);
                        var6 = 1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = (stateCaught_27 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var10.length() < 4) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var22 = (CharSequence) (Object) var10.substring(0, 4);
                        if (!hwa.a(var22, 10)) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var23 = (CharSequence) (Object) var10.substring(0, 4);
                        var5_int = lob.a(-86, var23);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof Exception ? 32 : 61);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var11 = (Exception) (Object) caughtException;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var6 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var5_int <= -4001) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((qfa) this).field_I = false;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var7 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var6 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (-7001 > var5_int) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var5_int < -9251) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((qfa) this).field_tc = false;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (7000 > var5_int) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-8000 < var5_int) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((qfa) this).field_cb = false;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((qfa) this).field_g = ((qfa) this).field_g & ((qfa) this).field_c.a("GL_ARB_half_float_pixel");
                        ((qfa) this).field_k = ((qfa) this).field_cb;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((((qfa) this).field_Ab.indexOf("intel") ^ -1) == 0) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((qfa) this).field_U = false;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = this;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_49_0 = stackOut_48_0;
                        if (((qfa) this).field_Ab.equals((Object) (Object) "s3 graphics")) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = this;
                        stackOut_49_1 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_51_1 = stackOut_49_1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = this;
                        stackOut_50_1 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((qfa) this).field_Hb = stackIn_51_1 != 0;
                        if (((qfa) this).field_cb) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var17 = new int[1];
                        jaggl.OpenGL.glGenBuffersARB(1, var17, 0);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var5 = caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ocb.a(false, (byte) 33, true);
                        ((qfa) this).field_m = true;
                        ((qfa) this).field_r = new rlb((qfa) this, ((qfa) this).field_a);
                        this.c((byte) -92);
                        ((qfa) this).field_yb = new nk((qfa) this);
                        ((qfa) this).field_fc = new kha((qfa) this);
                        if (!((qfa) this).field_fc.a(-128)) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        ((qfa) this).field_A = new mpb((qfa) this);
                        if (((qfa) this).field_A.f((byte) 72)) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        ((qfa) this).field_A.c((byte) 66);
                        ((qfa) this).field_A = null;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        ((qfa) this).field_d = new fbb((qfa) this);
                        this.v(770);
                        this.p(-1001);
                        ((qfa) this).v();
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    var4 = caughtException;
                    var4.printStackTrace();
                    ((qfa) this).o();
                    throw new RuntimeException("");
                }
                case 62: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void g(int param0, int param1) {
        ksa var3 = new ksa();
        int var4 = -64 % ((60 - param1) / 52);
        var3.field_b = (long)param0;
        ((qfa) this).field_Cc.b(-10258, var3);
    }

    private final void q(int param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float[] var8 = null;
        var8 = ((qfa) this).field_Xb;
        var2 = var8;
        if (param0 == -2) {
          L0: {
            L1: {
              var3 = (float)(((qfa) this).field_ob * -((qfa) this).field_lb) / (float)((qfa) this).field_Qb;
              var4 = (float)(((qfa) this).field_ob * (-((qfa) this).field_lb + ((qfa) this).field_Sb)) / (float)((qfa) this).field_Qb;
              var5 = (float)(((qfa) this).field_gc * ((qfa) this).field_ob) / (float)((qfa) this).field_yc;
              var6 = (float)((((qfa) this).field_gc + -((qfa) this).field_Y) * ((qfa) this).field_ob) / (float)((qfa) this).field_yc;
              if (var4 == var3) {
                break L1;
              } else {
                if (var5 != var6) {
                  var7 = 2.0f * (float)((qfa) this).field_ob;
                  var2[1] = 0.0f;
                  var2[5] = var7 / (var5 - var6);
                  var2[6] = 0.0f;
                  var2[7] = 0.0f;
                  var2[12] = 0.0f;
                  ((qfa) this).field_Wb = -(var7 * (float)((qfa) this).field_bb) / (float)(-((qfa) this).field_ob + ((qfa) this).field_bb);
                  var2[14] = -(var7 * (float)((qfa) this).field_bb) / (float)(-((qfa) this).field_ob + ((qfa) this).field_bb);
                  var2[8] = (var4 + var3) / (var4 - var3);
                  var2[2] = 0.0f;
                  var2[3] = 0.0f;
                  var2[0] = var7 / (-var3 + var4);
                  var2[4] = 0.0f;
                  var2[11] = -1.0f;
                  var2[9] = (var6 + var5) / (var5 - var6);
                  var2[15] = 0.0f;
                  ((qfa) this).field_mb = (float)(-(((qfa) this).field_bb + ((qfa) this).field_ob)) / (float)(-((qfa) this).field_ob + ((qfa) this).field_bb);
                  var2[10] = (float)(-(((qfa) this).field_bb + ((qfa) this).field_ob)) / (float)(-((qfa) this).field_ob + ((qfa) this).field_bb);
                  var2[13] = 0.0f;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
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
            break L0;
          }
          this.d(false);
          return;
        } else {
          return;
        }
    }

    final void a(float param0, float param1, float param2) {
        pba.field_q = param2;
        u.field_q = param1;
        mqa.field_o = param0;
    }

    final pw d() {
        return (pw) (Object) new epb();
    }

    final void T(int param0, int param1, int param2, int param3) {
        if (param2 < ((qfa) this).field_ab) {
            ((qfa) this).field_ab = param2;
        }
        if (!(param1 <= ((qfa) this).field_fb)) {
            ((qfa) this).field_fb = param1;
        }
        if (!(((qfa) this).field_C <= param3)) {
            ((qfa) this).field_C = param3;
        }
        if (!(((qfa) this).field_oc >= param0)) {
            ((qfa) this).field_oc = param0;
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
        float var9 = 0.0f;
        this.m(-97);
        ((qfa) this).d(param5, 124);
        float var7 = (float)param2 - (float)param0;
        float var8 = (float)(-param1) + (float)param3;
        if (0.0f == var7) {
            // ifne L50
            var7 = 1.0f;
        } else {
            var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
            var7 = var7 * var9;
            var8 = var8 * var9;
        }
        jaggl.OpenGL.glColor4ub((byte)(param4 >> 695307952), (byte)(param4 >> -1289785560), (byte)param4, (byte)(param4 >> 478806392));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)param0, 0.3499999940395355f + (float)param1);
        jaggl.OpenGL.glVertex2f(var7 + (float)param2 + 0.3499999940395355f, 0.3499999940395355f + ((float)param3 + var8));
        jaggl.OpenGL.glEnd();
    }

    final int j(int param0, int param1) {
        L0: {
          if (param1 == 25887) {
            break L0;
          } else {
            ((qfa) this).j();
            break L0;
          }
        }
        if (-2 == (param0 ^ -1)) {
          return 7681;
        } else {
          if (param0 != 0) {
            if (param0 == 2) {
              return 34165;
            } else {
              if (3 != param0) {
                if (4 != param0) {
                  throw new IllegalArgumentException();
                } else {
                  return 34023;
                }
              } else {
                return 260;
              }
            }
          } else {
            return 8448;
          }
        }
    }

    final int e(int param0, int param1) {
        if (6406 == param0) {
          return 1;
        } else {
          if (-6410 != (param0 ^ -1)) {
            L0: {
              if ((param0 ^ -1) == -6411) {
                break L0;
              } else {
                if ((param0 ^ -1) == -34847) {
                  break L0;
                } else {
                  if (34844 == param0) {
                    break L0;
                  } else {
                    if ((param0 ^ -1) != -6408) {
                      L1: {
                        if (6408 == param0) {
                          break L1;
                        } else {
                          if (34847 == param0) {
                            break L1;
                          } else {
                            if (param0 != 34843) {
                              if (34842 == param0) {
                                return 8;
                              } else {
                                if (param0 != -6403) {
                                  if (-6402 != param0) {
                                    if (param1 == 2) {
                                      throw new IllegalArgumentException("");
                                    } else {
                                      return -127;
                                    }
                                  } else {
                                    return 1;
                                  }
                                } else {
                                  return 3;
                                }
                              }
                            } else {
                              return 6;
                            }
                          }
                        }
                      }
                      return 4;
                    } else {
                      return 3;
                    }
                  }
                }
              }
            }
            return 2;
          } else {
            return 1;
          }
        }
    }

    final boolean r() {
        return !((qfa) this).field_U && ((qfa) this).field_O;
    }

    final int t() {
        return 4;
    }

    final int[] Y() {
        return new int[]{((qfa) this).field_lb, ((qfa) this).field_gc, ((qfa) this).field_Qb, ((qfa) this).field_yc};
    }

    private final void p(int param0) {
        java.awt.Dimension var2 = null;
        if (null == ((qfa) this).field_ib) {
            ((qfa) this).field_rb = 0;
            ((qfa) this).field_vb = 0;
        } else {
            var2 = ((qfa) this).field_ib.getSize();
            ((qfa) this).field_vb = var2.height;
            ((qfa) this).field_rb = var2.width;
        }
        if (param0 != -1001) {
            this.r(-4);
        }
        if (!(((qfa) this).field_lc != null)) {
            ((qfa) this).field_Sb = ((qfa) this).field_rb;
            ((qfa) this).field_Y = ((qfa) this).field_vb;
            this.f(27818);
        }
        this.f((byte) -92);
        ((qfa) this).t(108);
    }

    final void GA(int param0) {
        ((qfa) this).d(0, 100);
        jaggl.OpenGL.glClearColor((float)(param0 & 16711680) / 16711680.0f, (float)(65280 & param0) / 65280.0f, (float)(255 & param0) / 255.0f, (float)(param0 >>> -1583281640) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    private final void g(int param0) {
        int var2 = 0;
        fsb var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        var2 = 0;
        L0: while (true) {
          if (((qfa) this).field_P <= var2) {
            L1: while (true) {
              if (var2 >= ((qfa) this).field_Rb) {
                L2: {
                  if (param0 > 16) {
                    break L2;
                  } else {
                    this.m(-35);
                    break L2;
                  }
                }
                ((qfa) this).field_Rb = ((qfa) this).field_P;
                return;
              } else {
                jaggl.OpenGL.glDisable(var2 + 16386);
                var2++;
                continue L1;
              }
            }
          } else {
            var3 = ((qfa) this).field_K[var2];
            var4 = 16386 + var2;
            we.field_o[0] = (float)var3.c((byte) -79);
            we.field_o[1] = (float)var3.a(true);
            we.field_o[2] = (float)var3.d((byte) 47);
            we.field_o[3] = 1.0f;
            jaggl.OpenGL.glLightfv(var4, 4611, we.field_o, 0);
            var5 = var3.a(-62);
            var6 = var3.d(-392138175) / 255.0f;
            we.field_o[2] = var6 * (float)dla.a(255, var5);
            we.field_o[0] = var6 * (float)dla.a(var5 >> -1179188048, 255);
            we.field_o[1] = (float)dla.a(var5 >> 837707208, 255) * var6;
            jaggl.OpenGL.glLightfv(var4, 4609, we.field_o, 0);
            jaggl.OpenGL.glLightf(var4, 4617, 1.0f / (float)(var3.c(16777215) * var3.c(16777215)));
            jaggl.OpenGL.glEnable(var4);
            var2++;
            continue L0;
          }
        }
    }

    private final void j(int param0) {
        tdb.field_o[2] = ((qfa) this).field_H * ((qfa) this).field_i;
        tdb.field_o[3] = 1.0f;
        tdb.field_o[0] = ((qfa) this).field_H * ((qfa) this).field_nb;
        tdb.field_o[1] = ((qfa) this).field_H * ((qfa) this).field_nc;
        jaggl.OpenGL.glLightfv(param0, 4609, tdb.field_o, 0);
        tdb.field_o[1] = -((qfa) this).field_G * ((qfa) this).field_nc;
        tdb.field_o[2] = -((qfa) this).field_G * ((qfa) this).field_i;
        tdb.field_o[0] = -((qfa) this).field_G * ((qfa) this).field_nb;
        tdb.field_o[3] = 1.0f;
        jaggl.OpenGL.glLightfv(16385, 4609, tdb.field_o, 0);
    }

    private final int d(byte param0) {
        int var2 = 0;
        String var3 = null;
        String[] var4 = null;
        NumberFormatException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int[] var9 = null;
        int stackIn_30_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((qfa) this).field_Ab = jaggl.OpenGL.glGetString(7936).toLowerCase();
                    var2 = 0;
                    ((qfa) this).field_Nb = jaggl.OpenGL.glGetString(7937).toLowerCase();
                    if (0 != (((qfa) this).field_Ab.indexOf("microsoft") ^ -1)) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var2 = var2 | 1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (((qfa) this).field_Ab.indexOf("brian paul") != 0) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (0 == ((qfa) this).field_Ab.indexOf("mesa")) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2 = var2 | 1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var3 = jaggl.OpenGL.glGetString(7938);
                    var4 = up.a((byte) -67, ' ', var3.replace('.', ' '));
                    if ((var4.length ^ -1) <= -3) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var2 = var2 | 4;
                    statePc = 12;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        var5_int = lob.a(107, (CharSequence) (Object) var4[0]);
                        var6 = lob.a(46, (CharSequence) (Object) var4[1]);
                        ((qfa) this).field_f = 10 * var5_int + var6;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var5 = (NumberFormatException) (Object) caughtException;
                    var2 = var2 | 4;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (12 <= ((qfa) this).field_f) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var2 = var2 | 2;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (!((qfa) this).field_c.a("GL_ARB_multitexture")) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var2 = var2 | 8;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (!((qfa) this).field_c.a("GL_ARB_texture_env_combine")) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var2 = var2 | 32;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var9 = new int[1];
                    jaggl.OpenGL.glGetIntegerv(34018, var9, 0);
                    ((qfa) this).field_Dc = var9[0];
                    if (param0 > 76) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return -61;
                }
                case 22: {
                    jaggl.OpenGL.glGetIntegerv(34929, var9, 0);
                    ((qfa) this).field_t = var9[0];
                    jaggl.OpenGL.glGetIntegerv(34930, var9, 0);
                    ((qfa) this).field_dc = var9[0];
                    if ((((qfa) this).field_Dc ^ -1) > -3) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (2 > ((qfa) this).field_t) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (((qfa) this).field_dc < 2) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var2 = var2 | 16;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    ((qfa) this).field_ac = jaclib.memory.Stream.a();
                    ((qfa) this).field_O = ((qfa) this).field_c.arePbuffersAvailable();
                    ((qfa) this).field_cb = ((qfa) this).field_c.a("GL_ARB_vertex_buffer_object");
                    ((qfa) this).field_y = ((qfa) this).field_c.a("GL_ARB_multisample");
                    ((qfa) this).field_Zb = ((qfa) this).field_c.a("GL_ARB_vertex_program");
                    boolean discarded$2 = ((qfa) this).field_c.a("GL_ARB_fragment_program");
                    ((qfa) this).field_bc = ((qfa) this).field_c.a("GL_ARB_vertex_shader");
                    ((qfa) this).field_B = ((qfa) this).field_c.a("GL_ARB_fragment_shader");
                    ((qfa) this).field_tc = ((qfa) this).field_c.a("GL_EXT_texture3D");
                    ((qfa) this).field_g = ((qfa) this).field_c.a("GL_ARB_texture_rectangle");
                    ((qfa) this).field_S = ((qfa) this).field_c.a("GL_ARB_texture_cube_map");
                    ((qfa) this).field_I = ((qfa) this).field_c.a("GL_ARB_texture_float");
                    ((qfa) this).field_n = false;
                    ((qfa) this).field_U = ((qfa) this).field_c.a("GL_EXT_framebuffer_object");
                    ((qfa) this).field_Ob = ((qfa) this).field_c.a("GL_EXT_framebuffer_blit");
                    ((qfa) this).field_gb = ((qfa) this).field_c.a("GL_EXT_framebuffer_multisample");
                    ((qfa) this).field_sc = ((qfa) this).field_Ob & ((qfa) this).field_gb;
                    ((qfa) this).field_eb = fjb.field_b.startsWith("mac");
                    jaggl.OpenGL.glGetFloatv(2834, tdb.field_o, 0);
                    ((qfa) this).field_Ac = tdb.field_o[1];
                    ((qfa) this).field_Mb = tdb.field_o[0];
                    if (var2 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = var2;
                    stackIn_30_0 = stackOut_28_0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    return stackIn_30_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 <= 67) {
            return;
        }
        hua var3 = new hua(param1);
        ((qfa) this).field_hc.b(-10258, (ksa) (Object) var3);
    }

    final boolean k() {
        return true;
    }

    final boolean q() {
        return true;
    }

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.m(54);
        ((qfa) this).d(param4, 107);
        float var6 = 0.3499999940395355f + (float)param0;
        float var7 = (float)param1 + 0.3499999940395355f;
        jaggl.OpenGL.glColor4ub((byte)(param3 >> -495500048), (byte)(param3 >> 1188027464), (byte)param3, (byte)(param3 >> -642194312));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(var6, var7);
        jaggl.OpenGL.glVertex2f((float)param2 + var6, var7);
        jaggl.OpenGL.glEnd();
    }

    private final void b(boolean param0) {
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMultMatrixf(((qfa) this).field_F.a(param0), 0);
        if (!(!((qfa) this).field_Yb)) {
            ((qfa) this).field_d.field_b.e(34336);
        }
        this.g((byte) 95);
        this.g(22);
    }

    final rtb a(boolean param0) {
        if (param0) {
            return null;
        }
        if (null == ((qfa) this).field_s) {
            return null;
        }
        return ((qfa) this).field_s.a((byte) -123);
    }

    final void a(hf param0) {
    }

    final void j() {
        if (!((qfa) this).field_U) {
            if (!((qfa) this).field_O) {
                throw new RuntimeException("");
            }
            ((qfa) this).field_qc.c(0, ((qfa) this).field_Sb, 0, 0, 101, 0, ((qfa) this).field_Y);
            boolean discarded$0 = ((qfa) this).field_c.setSurface(((qfa) this).field_ic);
        } else {
            if ((Object) (Object) ((qfa) this).field_jb != (Object) (Object) ((qfa) this).field_lc) {
                throw new RuntimeException();
            }
            ((qfa) this).field_jb.a(0, (byte) -14);
            ((qfa) this).field_jb.a(8, (byte) -6);
            ((qfa) this).a((jaa) (Object) ((qfa) this).field_jb, 2896);
        }
        ((qfa) this).field_Sb = ((qfa) this).field_rb;
        ((qfa) this).field_qc = null;
        ((qfa) this).field_Y = ((qfa) this).field_vb;
        this.f((byte) -100);
        this.f(27818);
        ((qfa) this).t(119);
    }

    final void n(int param0) {
        if (param0 != 27841) {
            this.b(28, false);
        }
        if (-3 != (((qfa) this).field_x ^ -1)) {
            this.i(3);
            this.a(false, -128);
            this.b(-20951, false);
            this.a((byte) 32, false);
            this.a(false, (byte) -103);
            this.i(5888, -2);
            ((qfa) this).field_x = 2;
        }
    }

    final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          if (((qfa) this).field_e == param0) {
            break L0;
          } else {
            L1: {
              if (1 != param0) {
                if ((param0 ^ -1) == -3) {
                  var4 = 0;
                  var5 = 2;
                  var3 = 1;
                  break L1;
                } else {
                  if (128 != param0) {
                    var3 = 1;
                    var5 = 0;
                    var4 = 0;
                    break L1;
                  } else {
                    var3 = 1;
                    var5 = 3;
                    var4 = 1;
                    break L1;
                  }
                }
              } else {
                var3 = 1;
                var4 = 1;
                var5 = 1;
                break L1;
              }
            }
            L2: {
              if (((qfa) this).field_Lb) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L2;
              }
            }
            L3: {
              stackOut_11_0 = stackIn_11_0;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (var3 != 0) {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L3;
              } else {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L3;
              }
            }
            L4: {
              if (stackIn_14_0 == stackIn_14_1) {
                break L4;
              } else {
                L5: {
                  jaggl.OpenGL.glColorMask(var3 != 0, var3 != 0, var3 != 0, true);
                  stackOut_15_0 = this;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var3 == 0) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L5;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L5;
                  }
                }
                ((qfa) this).field_Lb = stackIn_18_1 != 0;
                break L4;
              }
            }
            L6: {
              if (var4 != 0) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L6;
              } else {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
                break L6;
              }
            }
            L7: {
              stackOut_22_0 = stackIn_22_0;
              stackIn_24_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if (((qfa) this).field_db) {
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L7;
              } else {
                stackOut_23_0 = stackIn_23_0;
                stackOut_23_1 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L7;
              }
            }
            L8: {
              if (stackIn_25_0 != stackIn_25_1) {
                L9: {
                  if (var4 == 0) {
                    jaggl.OpenGL.glDisable(3008);
                    break L9;
                  } else {
                    jaggl.OpenGL.glEnable(3008);
                    break L9;
                  }
                }
                L10: {
                  stackOut_30_0 = this;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (var4 == 0) {
                    stackOut_32_0 = this;
                    stackOut_32_1 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    break L10;
                  } else {
                    stackOut_31_0 = this;
                    stackOut_31_1 = 1;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    break L10;
                  }
                }
                ((qfa) this).field_db = stackIn_33_1 != 0;
                break L8;
              } else {
                break L8;
              }
            }
            L11: {
              if (var5 == ((qfa) this).field_xb) {
                break L11;
              } else {
                L12: {
                  if (1 != var5) {
                    if (2 == var5) {
                      jaggl.OpenGL.glEnable(3042);
                      jaggl.OpenGL.glBlendFunc(1, 1);
                      break L12;
                    } else {
                      if (3 != var5) {
                        jaggl.OpenGL.glDisable(3042);
                        break L12;
                      } else {
                        jaggl.OpenGL.glEnable(3042);
                        jaggl.OpenGL.glBlendFunc(774, 1);
                        break L12;
                      }
                    }
                  } else {
                    jaggl.OpenGL.glEnable(3042);
                    jaggl.OpenGL.glBlendFunc(770, 771);
                    break L12;
                  }
                }
                ((qfa) this).field_xb = var5;
                break L11;
              }
            }
            ((qfa) this).field_e = param0;
            ((qfa) this).field_x = ((qfa) this).field_x & -29;
            break L0;
          }
        }
        L13: {
          if (param1 >= 57) {
            break L13;
          } else {
            this.i(101, -67);
            break L13;
          }
        }
    }

    final int i() {
        return ((qfa) this).field_ob;
    }

    private final void b(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 84) {
            break L0;
          } else {
            ((qfa) this).a(85, 1, 117, -49);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((qfa) this).field_Ub) {
              break L2;
            } else {
              if (!((qfa) this).field_h) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        jaggl.OpenGL.glDepthMask(stackIn_6_0 != 0);
    }

    final boolean w() {
        return true;
    }

    private final void a(boolean param0, int param1) {
        if (param1 >= -114) {
            return;
        }
        if ((!((qfa) this).field_Lc ? 1 : 0) != (!param0 ? 1 : 0)) {
            ((qfa) this).field_Lc = param0 ? true : false;
            this.h(0);
            ((qfa) this).field_x = ((qfa) this).field_x & -32;
        }
    }

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
        int var7 = 0;
        float var8 = 0.0f;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (param0 == ((qfa) this).field_Jc) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            var7 = stackIn_3_0;
            if (var7 != 0) {
              break L2;
            } else {
              if (param1 != ((qfa) this).field_H) {
                break L2;
              } else {
                if (((qfa) this).field_G != param2) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
          }
          L3: {
            ((qfa) this).field_G = param2;
            ((qfa) this).field_H = param1;
            ((qfa) this).field_Jc = param0;
            if (var7 == 0) {
              break L3;
            } else {
              ((qfa) this).field_nc = (float)(65280 & ((qfa) this).field_Jc) / 65280.0f;
              ((qfa) this).field_nb = (float)(((qfa) this).field_Jc & 16711680) / 16711680.0f;
              ((qfa) this).field_i = (float)(((qfa) this).field_Jc & 255) / 255.0f;
              this.e((byte) -115);
              break L3;
            }
          }
          this.j(16384);
          break L1;
        }
        L4: {
          L5: {
            if (((qfa) this).field_L[0] != param3) {
              break L5;
            } else {
              if (param4 != ((qfa) this).field_L[1]) {
                break L5;
              } else {
                if (((qfa) this).field_L[2] == param5) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
          }
          ((qfa) this).field_L[1] = param4;
          ((qfa) this).field_L[0] = param3;
          ((qfa) this).field_L[2] = param5;
          ((qfa) this).field_Pb[2] = -param5;
          ((qfa) this).field_Pb[1] = -param4;
          ((qfa) this).field_Pb[0] = -param3;
          var8 = (float)(1.0 / Math.sqrt((double)(param5 * param5 + (param3 * param3 + param4 * param4))));
          ((qfa) this).field_Eb[1] = param4 * var8;
          ((qfa) this).field_Eb[0] = param3 * var8;
          ((qfa) this).field_Eb[2] = param5 * var8;
          ((qfa) this).field_Tb[0] = -((qfa) this).field_Eb[0];
          ((qfa) this).field_Tb[2] = -((qfa) this).field_Eb[2];
          ((qfa) this).field_Tb[1] = -((qfa) this).field_Eb[1];
          this.g((byte) 84);
          break L4;
        }
    }

    private final void k(int param0) {
        if (!(!((qfa) this).field_Vb)) {
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            ((qfa) this).field_Vb = false;
        }
        if (param0 != 0) {
            ((qfa) this).c(true);
        }
    }

    final void c(int param0, int param1, int param2) {
        ((qfa) this).field_Fb = param0;
        ((qfa) this).field_N = param1;
        this.f(27818);
        this.l(param2 + 10);
        if (param2 != 0) {
            ((qfa) this).field_Gb = null;
        }
    }

    final void a(jaa param0, int param1) {
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (param1 == 2896) {
          L0: {
            if (!((qfa) this).field_Ob) {
              L1: {
                if (0 > ((qfa) this).field_zc) {
                  break L1;
                } else {
                  if (param0 == ((qfa) this).field_p[((qfa) this).field_zc]) {
                    ((qfa) this).field_zc = ((qfa) this).field_zc - 1;
                    ((qfa) this).field_p[((qfa) this).field_zc] = null;
                    param0.b((byte) -75);
                    if ((((qfa) this).field_zc ^ -1) > -1) {
                      ((qfa) this).field_lc = null;
                      ((qfa) this).field_W = null;
                      break L0;
                    } else {
                      ((qfa) this).field_lc = ((qfa) this).field_p[((qfa) this).field_zc];
                      ((qfa) this).field_W = ((qfa) this).field_p[((qfa) this).field_zc];
                      ((qfa) this).field_W.b(param1 + -8470);
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              ((qfa) this).a(param0, (byte) -120);
              ((qfa) this).b((byte) 101, param0);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean m() {
        return false;
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        int var4 = 0;
        hua var5 = null;
        hua var6 = null;
        hua var7 = null;
        hua var8 = null;
        hua var9 = null;
        ksa var10 = null;
        ksa var11 = null;
        hua var12 = null;
        var4 = VoidHunters.field_G;
        param0 = param0 & 2147483647;
        var2 = 0;
        L0: while (true) {
          if (((qfa) this).field_xc.b(-67)) {
            L1: {
              if ((var2 ^ -1) >= -1) {
                break L1;
              } else {
                jaggl.OpenGL.glDeleteBuffersARB(var2, cm.field_j, 0);
                var2 = 0;
                break L1;
              }
            }
            L2: while (true) {
              if (((qfa) this).field_Nc.b(121)) {
                L3: {
                  L4: {
                    if (var2 > 0) {
                      jaggl.OpenGL.glDeleteTextures(var2, cm.field_j, 0);
                      var2 = 0;
                      break L4;
                    } else {
                      L5: while (true) {
                        if (((qfa) this).field_hc.b(114)) {
                          break L3;
                        } else {
                          var7 = (hua) (Object) ((qfa) this).field_hc.a(true);
                          var2++;
                          cm.field_j[var2] = var7.field_d;
                          if ((var2 ^ -1) != -1001) {
                            continue L5;
                          } else {
                            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, cm.field_j, 0);
                            var2 = 0;
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L6: while (true) {
                    if (((qfa) this).field_hc.b(114)) {
                      break L3;
                    } else {
                      var7 = (hua) (Object) ((qfa) this).field_hc.a(true);
                      var2++;
                      cm.field_j[var2] = var7.field_d;
                      if (var2 == -1001) {
                        jaggl.OpenGL.glDeleteFramebuffersEXT(var2, cm.field_j, 0);
                        var2 = 0;
                        continue L6;
                      } else {
                        continue L6;
                      }
                    }
                  }
                }
                L7: {
                  if (-1 < var2) {
                    jaggl.OpenGL.glDeleteFramebuffersEXT(var2, cm.field_j, 0);
                    var2 = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: while (true) {
                  if (((qfa) this).field_ec.b(105)) {
                    L9: {
                      if (var2 <= 0) {
                        break L9;
                      } else {
                        jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, cm.field_j, 0);
                        var2 = 0;
                        break L9;
                      }
                    }
                    L10: while (true) {
                      if (((qfa) this).field_v.b(124)) {
                        L11: while (true) {
                          if (((qfa) this).field_Cc.b(112)) {
                            L12: while (true) {
                              if (((qfa) this).field_zb.b(106)) {
                                L13: while (true) {
                                  if (((qfa) this).field_v.b(-104)) {
                                    L14: {
                                      ((qfa) this).field_r.a(true);
                                      if (-100663297 <= (this.u(97) ^ -1)) {
                                        break L14;
                                      } else {
                                        if (60000L + ((qfa) this).field_vc >= wt.a(false)) {
                                          break L14;
                                        } else {
                                          System.gc();
                                          ((qfa) this).field_vc = wt.a(false);
                                          break L14;
                                        }
                                      }
                                    }
                                    ((qfa) this).field_Mc = param0;
                                    return;
                                  } else {
                                    var12 = (hua) (Object) ((qfa) this).field_v.a(true);
                                    jaggl.OpenGL.glDeleteLists((int)var12.field_b, var12.field_d);
                                    continue L13;
                                  }
                                }
                              } else {
                                var11 = ((qfa) this).field_zb.a(true);
                                jaggl.OpenGL.glDeleteObjectARB(var11.field_b);
                                continue L12;
                              }
                            }
                          } else {
                            var10 = ((qfa) this).field_Cc.a(true);
                            jaggl.OpenGL.glDeleteProgramARB((int)var10.field_b);
                            continue L11;
                          }
                        }
                      } else {
                        var9 = (hua) (Object) ((qfa) this).field_v.a(true);
                        jaggl.OpenGL.glDeleteLists((int)var9.field_b, var9.field_d);
                        continue L10;
                      }
                    }
                  } else {
                    var8 = (hua) (Object) ((qfa) this).field_ec.a(true);
                    var2++;
                    cm.field_j[var2] = (int)var8.field_b;
                    ((qfa) this).field_q = ((qfa) this).field_q - var8.field_d;
                    if ((var2 ^ -1) != -1001) {
                      continue L8;
                    } else {
                      jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, cm.field_j, 0);
                      var2 = 0;
                      continue L8;
                    }
                  }
                }
              } else {
                var6 = (hua) (Object) ((qfa) this).field_Nc.a(true);
                var2++;
                cm.field_j[var2] = (int)var6.field_b;
                ((qfa) this).field_sb = ((qfa) this).field_sb - var6.field_d;
                if (-1001 == (var2 ^ -1)) {
                  jaggl.OpenGL.glDeleteTextures(var2, cm.field_j, 0);
                  var2 = 0;
                  continue L2;
                } else {
                  continue L2;
                }
              }
            }
          } else {
            var5 = (hua) (Object) ((qfa) this).field_xc.a(true);
            var2++;
            cm.field_j[var2] = (int)var5.field_b;
            ((qfa) this).field_mc = ((qfa) this).field_mc - var5.field_d;
            if (-1001 != (var2 ^ -1)) {
              continue L0;
            } else {
              jaggl.OpenGL.glDeleteBuffersARB(var2, cm.field_j, 0);
              var2 = 0;
              continue L0;
            }
          }
        }
    }

    private final int u(int param0) {
        int var2 = 0 / ((param0 - 29) / 37);
        return ((qfa) this).field_mc + ((qfa) this).field_sb - -((qfa) this).field_q;
    }

    private final void e(boolean param0) {
        L0: {
          L1: {
            if (!((qfa) this).field_l) {
              break L1;
            } else {
              if (!((qfa) this).field_j) {
                jaggl.OpenGL.glEnable(2896);
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glDisable(2896);
          break L0;
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            ((qfa) this).field_M = 70;
            break L2;
          }
        }
    }

    final aja a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        return (aja) (Object) new tla((qfa) this, param3, param4, param0, param1, param2);
    }

    private final void b(int param0, boolean param1) {
        if (!((!param1 ? 1 : 0) != (((qfa) this).field_l ? 1 : 0))) {
            ((qfa) this).field_l = param1 ? true : false;
            this.e(false);
            ((qfa) this).field_x = ((qfa) this).field_x & -8;
        }
        if (param0 != -20951) {
            ((qfa) this).field_Vb = true;
        }
    }

    final void f(int param0, int param1) {
        if (param0 == ((qfa) this).field_ob) {
            // if_icmpeq L82
        }
        ((qfa) this).field_ob = param0;
        ((qfa) this).field_bb = param1;
        this.q(-2);
        this.s(2915);
        if (((qfa) this).field_Jb == 3) {
            this.r(-105);
        } else {
            if (!((((qfa) this).field_Jb ^ -1) != -3)) {
                this.d(115);
            }
        }
    }

    final boolean p() {
        return true;
    }

    final void b(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, param0 + param3, param2);
        jaggl.OpenGL.glTexEnvi(8960, 34200 - -param0, param1);
    }

    final za e(int param0) {
        gpa var2 = new gpa(param0);
        ((qfa) this).field_D.b(-10258, (ksa) (Object) var2);
        return (za) (Object) var2;
    }

    private final void h(int param0) {
        L0: {
          L1: {
            if (!((qfa) this).field_Lc) {
              break L1;
            } else {
              if (-1 >= (((qfa) this).field_jc ^ -1)) {
                jaggl.OpenGL.glEnable(2912);
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glDisable(2912);
          break L0;
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            ((qfa) this).a(-73, -124, 96);
            break L2;
          }
        }
    }

    final void a(int param0, jaa param1) {
        if (3 <= ((qfa) this).field_Oc) {
            throw new RuntimeException();
        }
        if (param0 < 41) {
            rtb discarded$0 = ((qfa) this).a(false);
        }
        if (!(-1 < (((qfa) this).field_Oc ^ -1))) {
            ((qfa) this).field_kc[((qfa) this).field_Oc].d(105);
        }
        ((qfa) this).field_Oc = ((qfa) this).field_Oc + 1;
        ((qfa) this).field_kc[((qfa) this).field_Oc + 1] = param1;
        ((qfa) this).field_W = param1;
        ((qfa) this).field_W.a(86);
    }

    final void a(int param0, int param1) throws jkb {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          ((qfa) this).field_c.swapBuffers();
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var3 = (Exception) (Object) decompiledCaughtException;
    }

    private final void e(byte param0) {
        tdb.field_o[3] = 1.0f;
        tdb.field_o[2] = ((qfa) this).field_pc * ((qfa) this).field_i;
        tdb.field_o[0] = ((qfa) this).field_nb * ((qfa) this).field_pc;
        tdb.field_o[1] = ((qfa) this).field_nc * ((qfa) this).field_pc;
        jaggl.OpenGL.glLightModelfv(2899, tdb.field_o, 0);
        if (param0 >= -33) {
            this.e(false);
        }
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        this.i(3);
        ((qfa) this).a(61, (pib) null);
        ((qfa) this).d(0, 127);
        jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
        jaggl.OpenGL.glRasterPos2i(param0, param1);
        jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((qfa) this).field_cc, param4, param5);
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
    }

    final boolean f() {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (!((qfa) this).field_y) {
              break L1;
            } else {
              L2: {
                if (!((qfa) this).s()) {
                  break L2;
                } else {
                  if (!((qfa) this).field_sc) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    private final void h(byte param0) {
        boolean discarded$5 = ((qfa) this).field_c.b();
        if (param0 != -46) {
            this.o(46);
        }
    }

    final boolean x() {
        return ((qfa) this).field_U || ((qfa) this).field_O;
    }

    static {
    }
}
