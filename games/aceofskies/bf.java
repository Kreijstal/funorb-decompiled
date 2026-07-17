/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import jaclib.memory.Stream;

abstract class bf extends ha {
    Object field_Fb;
    em field_Tb;
    jaclib.memory.heap.NativeHeapBuffer field_Q;
    private jagex3.graphics2.hw.NativeInterface field_i;
    int field_Z;
    private jaclib.memory.heap.NativeHeap field_Qb;
    gk field_d;
    private Hashtable field_gb;
    private kp field_nc;
    long field_peer;
    int field_jb;
    int field_jc;
    ec field_ec;
    int field_j;
    boolean field_Lb;
    int field_qb;
    ec field_t;
    private ec field_A;
    private ec field_tb;
    boolean field_Pb;
    private int field_v;
    float[] field_Jb;
    float[] field_N;
    boolean field_J;
    int field_Ib;
    float field_Wb;
    private boolean field_hb;
    boolean field_ib;
    int field_V;
    int field_q;
    private int field_Yb;
    st[] field_f;
    boolean field_pc;
    qo field_bb;
    sf[] field_D;
    boolean field_mb;
    private int field_lb;
    private sk field_nb;
    private float[] field_yb;
    private boolean field_Zb;
    private int field_O;
    as[] field_w;
    private int field_ab;
    private float[] field_W;
    qr field_zb;
    int field_x;
    float field_fb;
    boolean field_Vb;
    private float[] field_U;
    float field_Hb;
    private float field_T;
    float field_g;
    int field_r;
    private int field_hc;
    private sb field_z;
    as[] field_H;
    boolean field_Db;
    private int field_M;
    private hr field_kb;
    private boolean field_S;
    boolean field_Ab;
    int field_Nb;
    private boolean field_e;
    int field_p;
    private lm field_wb;
    int field_fc;
    boolean field_Y;
    private int field_Ub;
    boolean field_I;
    private float field_db;
    float field_Xb;
    private int field_eb;
    float field_ub;
    int field_cc;
    private boolean field_Bb;
    int field_Mb;
    int field_kc;
    int field_ic;
    float[] field_Gb;
    int field_gc;
    ec[] field_L;
    private int field_bc;
    private float field_mc;
    jj field_Kb;
    private int field_m;
    private int field_oc;
    int field_B;
    private boolean field_dc;
    boolean field_o;
    int field_X;
    int field_F;
    private jaclib.memory.Stream field_l;
    int field_Rb;
    private sk[] field_Ob;
    private int field_Sb;
    int field_R;
    float field_rb;
    float field_y;
    private int field_E;
    private jj[] field_u;
    private boolean field_qc;
    private float[] field_n;
    int field_lc;
    boolean field_ob;
    private int field_G;
    int field_h;
    private fa field_xb;
    private tl field_ac;
    private po field_sb;
    private fa field_P;
    private po field_vb;
    private po field_pb;
    private po field_cb;
    private ti field_C;
    private tl field_s;
    fa field_Eb;
    private tl field_K;
    private po field_k;
    boolean field_Cb;

    final void T(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (param0 > ((bf) this).field_R) {
            ((bf) this).field_R = param0;
            var5 = 1;
        }
        if (((bf) this).field_gc > param2) {
            var5 = 1;
            ((bf) this).field_gc = param2;
        }
        if (!(param1 <= ((bf) this).field_Nb)) {
            ((bf) this).field_Nb = param1;
            var5 = 1;
        }
        if (!(((bf) this).field_V <= param3)) {
            ((bf) this).field_V = param3;
            var5 = 1;
        }
        if (var5 != 0) {
            if (!(((bf) this).field_Cb)) {
                ((bf) this).field_Cb = true;
                ((bf) this).r(0);
            }
            ((bf) this).I(80);
            int discarded$0 = -7;
            this.K();
        }
    }

    private final void n() {
        int var2 = 0;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        ((bf) this).m(-109);
        ((bf) this).t((byte) -69);
        ((bf) this).T(0);
        ((bf) this).k((byte) 127);
        ((bf) this).V(0);
        ((bf) this).s((byte) -94);
        ((bf) this).l(-30535);
        ((bf) this).d(false);
        ((bf) this).w(0);
        ((bf) this).b(false);
        ((bf) this).h((byte) -117);
        ((bf) this).p((byte) -128);
        ((bf) this).l((byte) 127);
        ((bf) this).u((byte) -66);
        for (var2 = -1 + ((bf) this).field_h; var2 >= 0; var2--) {
            ((bf) this).a(var2, (byte) 98);
            ((bf) this).N(0);
            ((bf) this).m((byte) -127);
            ((bf) this).f(-21041);
        }
        ((bf) this).g(0);
        ((bf) this).Q(112);
        ((bf) this).C(-122);
        ((bf) this).b((byte) 82);
        ((bf) this).v(5);
    }

    final int i() {
        return ((bf) this).field_Mb;
    }

    abstract void b(boolean param0);

    abstract ti c(boolean param0, int param1);

    final void U(int param0, int param1, int param2, int param3, int param4) {
        ((bf) this).c(param0, param1, param2 + param0, param1, param3, param4);
    }

    abstract void N(int param0);

    final void a(boolean param0, boolean param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        uh var10 = null;
        int var11 = 0;
        int var12 = 0;
        ec var13 = null;
        int var14 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          L1: {
            var14 = AceOfSkies.field_G ? 1 : 0;
            if (param2 != ((bf) this).field_ab) {
              break L1;
            } else {
              L2: {
                if (((bf) this).field_dc) {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  break L2;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  break L2;
                }
              }
              L3: {
                stackOut_4_0 = stackIn_4_0;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (((bf) this).field_Bb) {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              if (stackIn_7_0 != stackIn_7_1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L4: {
            var5 = null;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (!((bf) this).field_Bb) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L4;
            } else {
              stackOut_10_0 = 3;
              stackIn_12_0 = stackOut_10_0;
              break L4;
            }
          }
          L5: {
            var9 = stackIn_12_0;
            if (0 <= param2) {
              L6: {
                L7: {
                  var5 = (Object) (Object) ((bf) this).field_z.a((byte) -69, param2);
                  var10 = ((bf) this).field_a.a(false, param2);
                  if (var10.field_n != 0) {
                    break L7;
                  } else {
                    if (var10.field_j == 0) {
                      ((bf) this).f(param3 + -21044);
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (!var10.field_o) {
                    stackOut_19_0 = 128;
                    stackIn_20_0 = stackOut_19_0;
                    break L8;
                  } else {
                    stackOut_18_0 = 64;
                    stackIn_20_0 = stackOut_18_0;
                    break L8;
                  }
                }
                var11 = stackIn_20_0;
                var12 = 50 * var11;
                var13 = ((bf) this).d(12343);
                var13.a((float)(((bf) this).field_r % var12 * var10.field_n) / (float)var12, (byte) 107, (float)(((bf) this).field_r % var12 * var10.field_j) / (float)var12, 0.0f);
                ((bf) this).a(tr.field_a, (byte) -87);
                break L6;
              }
              var6 = var10.field_e;
              if (!((bf) this).field_Bb) {
                var9 = var10.field_c;
                var7 = var10.field_s;
                var8 = var10.field_h;
                break L5;
              } else {
                break L5;
              }
            } else {
              ((bf) this).f(-21041);
              break L5;
            }
          }
          L9: {
            this.a((byte) 122, param1, var8, param0, var9, var7);
            if (null == ((bf) this).field_nb) {
              ((bf) this).a((jj) var5, -9135);
              ((bf) this).b(var6, false);
              break L9;
            } else {
              ((bf) this).field_nb.a(var6, 86, (jj) var5);
              break L9;
            }
          }
          ((bf) this).field_ab = param2;
          ((bf) this).field_dc = ((bf) this).field_Bb;
          break L0;
        }
        L10: {
          if (param3 == 3) {
            break L10;
          } else {
            int discarded$1 = ((bf) this).i((byte) -128);
            break L10;
          }
        }
        ((bf) this).field_Yb = ((bf) this).field_Yb & -8;
    }

    final void a(byte param0, boolean param1) {
        if (!(((bf) this).field_ib == param1)) {
            ((bf) this).field_ib = param1 ? true : false;
            ((bf) this).d(false);
            ((bf) this).field_Yb = ((bf) this).field_Yb & -32;
        }
        if (param0 != -1) {
            Object var4 = null;
            ((bf) this).a(-26, (tl) null, 50);
        }
    }

    abstract void a(nf param0, boolean param1);

    final ec J(int param0) {
        int var2 = -63 % ((param0 - -67) / 41);
        return ((bf) this).field_L[((bf) this).field_F];
    }

    abstract bp a(int param0, int param1, int param2, hd param3, int param4, byte[] param5);

    final ec t(int param0) {
        if (param0 != -11198) {
            return null;
        }
        return ((bf) this).field_t;
    }

    final void e(boolean param0, int param1) {
        int var4 = 0;
        qr var3 = null;
        int var5 = 0;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        if (!param0) {
            return;
        }
        if (param1 == ((bf) this).field_G) {
        } else {
            if (param1 == 1) {
                var5 = 1;
                var4 = 1;
                var3 = pi.field_x;
            } else {
                if (param1 == 2) {
                    var3 = ne.field_i;
                    var5 = 0;
                    var4 = 1;
                } else {
                    if (param1 == 128) {
                        var3 = uc.field_l;
                        var5 = 1;
                        var4 = 1;
                    } else {
                        var4 = 0;
                        var3 = cg.field_p;
                        var5 = 0;
                    }
                }
            }
            if (!(var5 != (!((bf) this).field_Vb ? 1 : 0))) {
                ((bf) this).field_Vb = var5 != 0 ? true : false;
                ((bf) this).u((byte) -122);
            }
            if ((!((bf) this).field_Db ? 1 : 0) == var4) {
                ((bf) this).field_Db = var4 != 0 ? true : false;
                ((bf) this).p((byte) -128);
            }
            if (!(var3 == ((bf) this).field_zb)) {
                ((bf) this).field_zb = var3;
                ((bf) this).l((byte) 88);
            }
            ((bf) this).field_Yb = ((bf) this).field_Yb & -29;
            ((bf) this).field_G = param1;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = ((bf) this).o((byte) 42);
        this.F(103);
        ((bf) this).a((byte) -74, param4);
        ((bf) this).a((byte) 122, 0, bs.field_a);
        ((bf) this).a(bs.field_a, 0, 0);
        ((bf) this).e(true, param5);
        ((bf) this).field_ec.b((float)(param3 + -1), (float)(param2 - 1), 1.0f, -125);
        ((bf) this).field_ec.b(-var7 + (float)param1, (byte) -125, 0.0f, -var7 + (float)param0);
        ((bf) this).q((byte) 127);
        ((bf) this).b((byte) -120, false);
        this.a(bm.field_x, (byte) 127, 4);
        ((bf) this).b((byte) -114, true);
        ((bf) this).a(dl.field_p, 0, 0);
        ((bf) this).a((byte) 125, 0, dl.field_p);
    }

    private final void P() {
        ((bf) this).field_ac = ((bf) this).a(true, (byte) 91);
        boolean discarded$0 = ((bf) this).field_ac.a(12, -120, 24);
        ((bf) this).field_xb = ((bf) this).a(new pl[1], -128);
    }

    final ec y(int param0) {
        if (param0 >= -66) {
            ((bf) this).field_i = null;
        }
        return ((bf) this).field_ec;
    }

    final void a(boolean param0, boolean param1) {
        if ((!((bf) this).field_o ? 1 : 0) != (!param0 ? 1 : 0)) {
            ((bf) this).field_o = param0 ? true : false;
            ((bf) this).b(false);
            ((bf) this).field_Yb = ((bf) this).field_Yb & -32;
        }
        if (param1) {
            ((bf) this).U(78, 60, 115, 111, 3);
        }
    }

    final void a(boolean param0, int param1) {
        if ((!((bf) this).field_pc ? 1 : 0) != (!param0 ? 1 : 0)) {
            ((bf) this).field_pc = param0 ? true : false;
            ((bf) this).T(0);
        }
        if (param1 != -26973) {
            ((bf) this).c(127, -1, -89, 21, -67, 63);
        }
    }

    abstract void l(byte param0);

    final void a(byte param0, int param1) {
        if (param0 != -74) {
            Object var4 = null;
            jaclib.memory.Stream discarded$0 = ((bf) this).a(39, (jaclib.memory.Buffer) null);
        }
        if (param1 != ((bf) this).field_cc) {
            ((bf) this).field_cc = param1;
            ((bf) this).g(param0 ^ -74);
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != -32) {
            ((bf) this).field_peer = 66L;
        }
        if (!((((bf) this).field_Y ? 1 : 0) != (!param1 ? 1 : 0))) {
            ((bf) this).field_Y = param1 ? true : false;
            ((bf) this).w(param0 ^ -32);
            ((bf) this).field_Yb = ((bf) this).field_Yb & -32;
        }
    }

    final void b(int param0, boolean param1) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if (param0 == 1) {
            ((bf) this).a(bd.field_C, true, bd.field_C);
        } else {
            if (param0 == 0) {
                ((bf) this).a(ru.field_a, true, ru.field_a);
            } else {
                if (param0 == 2) {
                    ((bf) this).a(du.field_l, true, bd.field_C);
                } else {
                    if (param0 == 3) {
                        ((bf) this).a(lo.field_j, true, ru.field_a);
                    } else {
                        if (!(4 != param0)) {
                            ((bf) this).a(fs.field_d, true, fs.field_d);
                        }
                    }
                }
            }
        }
        if (param1) {
            ((bf) this).V(-59);
        }
    }

    abstract void a(boolean param0, ia param1, int param2, int param3);

    final void q(byte param0) {
        ((bf) this).field_Lb = false;
        this.L(50);
        if (param0 <= 50) {
            ((bf) this).a((byte) 51);
        }
    }

    abstract qi a(int param0, boolean param1, hd param2, int param3, byte param4, int param5, int param6, byte[] param7);

    final qi a(byte[] param0, int param1, boolean param2, int param3, hd param4, boolean param5) {
        RuntimeException var7 = null;
        Object stackIn_2_0 = null;
        qi stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        qi stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2) {
              stackOut_3_0 = ((bf) this).a(param3, param5, param4, param1, (byte) 108, 0, 0, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (qi) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("bf.VE(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param5 + 41);
        }
        return stackIn_4_0;
    }

    final void s(int param0) {
        this.a(qp.field_j, (byte) 123, param0);
    }

    private final void K() {
    }

    private final void a(byte param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var8 = AceOfSkies.field_G ? 1 : 0;
          param3 = param3 & this.i(-7865);
          var7 = 100;
          if (param3) {
            break L0;
          } else {
            L1: {
              if (param4 == 4) {
                break L1;
              } else {
                if (8 == param4) {
                  break L1;
                } else {
                  if (param4 != 9) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              param4 = 2;
              if (4 == param4) {
                stackOut_7_0 = 1 & param5;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            param2 = stackIn_8_0;
            param5 = 0;
            break L0;
          }
        }
        L3: {
          if (0 == param4) {
            break L3;
          } else {
            if (param1) {
              param4 = param4 | -2147483648;
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (param4 == ((bf) this).field_eb) {
            if (((bf) this).field_eb == 0) {
              break L4;
            } else {
              L5: {
                ((bf) this).field_Ob[2147483647 & ((bf) this).field_eb].a(false, param1);
                if (param5 != ((bf) this).field_Sb) {
                  break L5;
                } else {
                  if (param2 == ((bf) this).field_hc) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              ((bf) this).field_Ob[((bf) this).field_eb & 2147483647].a(1786747298, param5, param2);
              ((bf) this).field_hc = param2;
              ((bf) this).field_Sb = param5;
              break L4;
            }
          } else {
            L6: {
              if (0 == ((bf) this).field_eb) {
                break L6;
              } else {
                ((bf) this).field_Ob[2147483647 & ((bf) this).field_eb].a(true);
                break L6;
              }
            }
            L7: {
              if (0 == param4) {
                ((bf) this).field_nb = null;
                break L7;
              } else {
                ((bf) this).field_nb = ((bf) this).field_Ob[param4 & 2147483647];
                ((bf) this).field_nb.a(param1, (byte) 8);
                ((bf) this).field_nb.a(false, param1);
                ((bf) this).field_nb.a(1786747298, param5, param2);
                break L7;
              }
            }
            ((bf) this).field_eb = param4;
            ((bf) this).field_hc = param2;
            ((bf) this).field_Sb = param5;
            break L4;
          }
        }
    }

    private final void k() {
        ((bf) this).field_e = false;
        int discarded$0 = 12221;
        this.u();
        if (!(((bf) this).field_bb != aj.field_v)) {
            this.g(false);
        }
    }

    abstract void V(int param0);

    private final void g() {
        float[] var2 = null;
        float[] var3 = null;
        L0: {
          if (!((bf) this).field_Zb) {
            L1: {
              L2: {
                var3 = ((bf) this).field_yb;
                var2 = var3;
                if (((bf) this).field_Z == 0) {
                  break L2;
                } else {
                  if (0 == ((bf) this).field_jb) {
                    break L2;
                  } else {
                    var3[12] = -1.0f;
                    var3[7] = 0.0f;
                    var3[10] = 0.5f;
                    var3[3] = 0.0f;
                    var3[2] = 0.0f;
                    var3[0] = 2.0f / (float)((bf) this).field_Z;
                    var3[8] = 0.0f;
                    var3[6] = 0.0f;
                    var3[4] = 0.0f;
                    var3[11] = 0.0f;
                    var3[14] = 0.5f;
                    var3[9] = 0.0f;
                    var3[13] = 1.0f;
                    var3[15] = 1.0f;
                    var3[1] = 0.0f;
                    var3[5] = -2.0f / (float)((bf) this).field_jb;
                    break L1;
                  }
                }
              }
              var2[5] = 1.0f;
              var2[13] = 0.0f;
              var2[11] = 0.0f;
              var2[10] = 1.0f;
              var2[9] = 0.0f;
              var2[0] = 1.0f;
              var2[3] = 0.0f;
              var2[15] = 1.0f;
              var2[7] = 0.0f;
              var2[8] = 0.0f;
              var2[12] = 0.0f;
              var2[4] = 0.0f;
              var2[6] = 0.0f;
              var2[14] = 0.0f;
              var2[2] = 0.0f;
              var2[1] = 0.0f;
              break L1;
            }
            ((bf) this).field_Zb = true;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final int H(int param0) {
        if (param0 <= 20) {
            return 17;
        }
        return ((bf) this).field_v;
    }

    abstract Object a(int param0, java.awt.Canvas param1);

    abstract void m(int param0);

    abstract void m(byte param0);

    abstract boolean a(byte param0, la param1, hd param2);

    sk b(int param0, byte param1) {
        int var3 = 0;
        L0: {
          if (param1 > 31) {
            break L0;
          } else {
            this.E(-25);
            break L0;
          }
        }
        var3 = param0;
        if (var3 == 6) {
          return (sk) (Object) new cf((bf) this);
        } else {
          if (var3 == 1) {
            return (sk) (Object) new oj((bf) this);
          } else {
            if (2 != var3) {
              if (var3 == 7) {
                return (sk) (Object) new ta((bf) this);
              } else {
                return (sk) (Object) new ae((bf) this);
              }
            } else {
              return (sk) (Object) new u((bf) this, ((bf) this).field_Tb);
            }
          }
        }
    }

    private final void e(boolean param0) {
        ((bf) this).field_S = false;
        if (null != ((bf) this).field_nb) {
            ((bf) this).field_nb.b(-126);
        }
        ((bf) this).v(5);
    }

    private final void u() {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float[] var8 = null;
        L0: {
          if (!((bf) this).field_e) {
            L1: {
              var8 = ((bf) this).field_n;
              var2 = var8;
              var3 = (float)(((bf) this).field_Mb * -((bf) this).field_Ub) / (float)((bf) this).field_oc;
              var4 = (float)((((bf) this).field_Z + -((bf) this).field_Ub) * ((bf) this).field_Mb) / (float)((bf) this).field_oc;
              var5 = (float)(((bf) this).field_Mb * ((bf) this).field_lb) / (float)((bf) this).field_M;
              var6 = (float)(((bf) this).field_Mb * (((bf) this).field_lb + -((bf) this).field_jb)) / (float)((bf) this).field_M;
              if (var4 == var3) {
                break L1;
              } else {
                if (var5 == var6) {
                  break L1;
                } else {
                  var7 = 2.0f * (float)((bf) this).field_Mb;
                  var8[1] = 0.0f;
                  var8[8] = (var3 + var4) / (-var3 + var4);
                  var8[4] = 0.0f;
                  ((bf) this).field_T = (float)((bf) this).field_x / (float)(-((bf) this).field_x + ((bf) this).field_Mb);
                  var8[10] = (float)((bf) this).field_x / (float)(-((bf) this).field_x + ((bf) this).field_Mb);
                  var8[7] = 0.0f;
                  ((bf) this).field_mc = (float)(((bf) this).field_Mb * ((bf) this).field_x) / (float)(((bf) this).field_Mb - ((bf) this).field_x);
                  var8[14] = (float)(((bf) this).field_Mb * ((bf) this).field_x) / (float)(((bf) this).field_Mb - ((bf) this).field_x);
                  var8[12] = 0.0f;
                  var8[13] = 0.0f;
                  var8[3] = 0.0f;
                  var8[11] = -1.0f;
                  var8[9] = (var6 + var5) / (var5 - var6);
                  var8[0] = var7 / (-var3 + var4);
                  var8[15] = 0.0f;
                  var8[6] = 0.0f;
                  var8[5] = var7 / (var5 - var6);
                  var8[2] = 0.0f;
                  this.e((byte) 93);
                  ((bf) this).field_e = true;
                  break L0;
                }
              }
            }
            var8[13] = 0.0f;
            var8[8] = 0.0f;
            var8[14] = 0.0f;
            var8[3] = 0.0f;
            var8[9] = 0.0f;
            var8[1] = 0.0f;
            var8[0] = 1.0f;
            var8[4] = 0.0f;
            var8[2] = 0.0f;
            var8[6] = 0.0f;
            var8[15] = 1.0f;
            var8[12] = 0.0f;
            var8[5] = 1.0f;
            var8[10] = 1.0f;
            var8[11] = 0.0f;
            var8[7] = 0.0f;
            this.e((byte) 93);
            ((bf) this).field_e = true;
            break L0;
          } else {
            break L0;
          }
        }
    }

    abstract void j(int param0);

    private final void A() {
        int var2 = 0;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        double var6 = 0.0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        var10 = AceOfSkies.field_G ? 1 : 0;
        ((bf) this).field_K = ((bf) this).a(false, (byte) 118);
        boolean discarded$3 = ((bf) this).field_K.a(12, -125, 3096);
        var2 = 0;
        L0: while (true) {
          L1: {
            if (4 <= var2) {
              break L1;
            } else {
              var3 = ((bf) this).field_K.a(true, (byte) -59);
              if (var3 != null) {
                var4 = ((bf) this).a(-105, var3);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var5 = 0;
                L2: while (true) {
                  if (256 < var5) {
                    var4.a();
                    if (((bf) this).field_K.a((byte) -60)) {
                      break L1;
                    } else {
                      var2++;
                      continue L0;
                    }
                  } else {
                    var6 = 3.141592653589793 * (double)(2 * var5) / 256.0;
                    var8 = (float)Math.cos(var6);
                    var9 = (float)Math.sin(var6);
                    if (jaclib.memory.Stream.b()) {
                      var4.b(var9);
                      var4.b(var8);
                      var4.b(0.0f);
                      var5++;
                      continue L2;
                    } else {
                      var4.a(var9);
                      var4.a(var8);
                      var4.a(0.0f);
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
          fa discarded$4 = ((bf) this).a(new pl[1], -127);
          return;
        }
    }

    final void a(byte param0) {
        if (param0 <= 35) {
            ((bf) this).field_Ub = -59;
        }
        ((bf) this).field_ec.a((byte) -59);
        ((bf) this).field_Lb = true;
        this.L(109);
    }

    bf(java.awt.Canvas param0, Object param1, d param2, gk param3, int param4, int param5) {
        super(param2);
        Throwable var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        uh var9 = null;
        java.awt.Dimension var11 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        ((bf) this).field_nc = new kp();
        ((bf) this).field_Lb = true;
        ((bf) this).field_ec = new ec();
        ec discarded$5 = new ec();
        ec discarded$6 = new ec();
        ((bf) this).field_t = new ec();
        ((bf) this).field_A = new ec();
        ((bf) this).field_tb = new ec();
        ((bf) this).field_v = 0;
        ((bf) this).field_Wb = 1.0f;
        ((bf) this).field_Jb = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        ((bf) this).field_Zb = false;
        ((bf) this).field_mb = true;
        ((bf) this).field_V = 0;
        ((bf) this).field_Hb = 1.0f;
        ((bf) this).field_W = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        ((bf) this).field_q = 0;
        ((bf) this).field_S = false;
        ((bf) this).field_fb = -1.0f;
        ((bf) this).field_M = 512;
        ((bf) this).field_Ub = 0;
        ((bf) this).field_Db = true;
        ((bf) this).field_g = 1.0f;
        ((bf) this).field_db = 1.0f;
        ((bf) this).field_N = ((bf) this).field_W;
        ((bf) this).field_yb = new float[16];
        ((bf) this).field_ib = false;
        ((bf) this).field_p = -1;
        ((bf) this).field_I = true;
        ((bf) this).field_Nb = 0;
        ((bf) this).field_x = 3584;
        ((bf) this).field_lb = 0;
        ((bf) this).field_e = false;
        ((bf) this).field_ab = -1;
        ((bf) this).field_Gb = new float[]{0.0f, 0.0f, -1.0f, 0.0f};
        ((bf) this).field_Rb = 0;
        ((bf) this).field_F = 0;
        ((bf) this).field_X = -1;
        ((bf) this).field_Ob = new sk[10];
        ((bf) this).field_Ab = true;
        ((bf) this).field_bc = -1;
        ((bf) this).field_hb = false;
        ((bf) this).field_ub = -1.0f;
        ((bf) this).field_kc = 128;
        ((bf) this).field_bb = ps.field_d;
        ((bf) this).field_Mb = 50;
        ((bf) this).field_eb = 0;
        ((bf) this).field_Y = false;
        ((bf) this).field_Ib = 0;
        ((bf) this).field_U = new float[16];
        ((bf) this).field_oc = 512;
        ((bf) this).field_zb = pi.field_x;
        ((bf) this).field_E = -1;
        ((bf) this).field_rb = 1.0f;
        ((bf) this).field_dc = false;
        ((bf) this).field_R = 0;
        ((bf) this).field_pc = false;
        ((bf) this).field_qc = false;
        ((bf) this).field_ob = false;
        ((bf) this).field_hc = 0;
        ((bf) this).field_n = new float[16];
        ((bf) this).field_Sb = 0;
        ((bf) this).field_G = 1;
        ((bf) this).field_gc = 0;
        ((bf) this).field_Vb = true;
        ((bf) this).field_l = new jaclib.memory.Stream();
        ec discarded$7 = new ec();
        try {
          L0: {
            try {
              L1: {
                L2: {
                  ((bf) this).field_lc = param4;
                  ((bf) this).field_d = param3;
                  ((bf) this).field_Fb = param1;
                  var11 = param0.getSize();
                  ((bf) this).field_Z = var11.width;
                  ((bf) this).field_jb = var11.height;
                  ((bf) this).field_m = param5;
                  int discarded$8 = 1;
                  int discarded$9 = 0;
                  fr.a(false);
                  if (null == ((bf) this).field_a) {
                    ((bf) this).field_i = new jagex3.graphics2.hw.NativeInterface(0, ((bf) this).field_m);
                    ((bf) this).field_z = null;
                    break L2;
                  } else {
                    ((bf) this).field_z = new sb((bf) this, ((bf) this).field_a);
                    ((bf) this).field_i = new jagex3.graphics2.hw.NativeInterface(((bf) this).field_a.a(28060), ((bf) this).field_m);
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= ((bf) this).field_a.a(28060)) {
                        break L2;
                      } else {
                        L4: {
                          var9 = ((bf) this).field_a.a(false, var8);
                          if (var9 == null) {
                            break L4;
                          } else {
                            ((bf) this).field_i.initTextureMetrics(var8, var9.field_r, var9.field_b);
                            break L4;
                          }
                        }
                        var8++;
                        continue L3;
                      }
                    }
                  }
                }
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7 = decompiledCaughtException;
              var7.printStackTrace();
              ((bf) this).a(-9);
              throw new RuntimeException("");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var7_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var7_ref;
            stackOut_10_1 = new StringBuilder().append("bf.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    abstract void c(int param0, byte param1);

    final boolean b() {
        return true;
    }

    final qi a(int[] param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        qi stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qi stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                ((bf) this).field_Zb = false;
                break L1;
              }
            }
            stackOut_2_0 = ((bf) this).a(0, true, param3, param4, 0, param0, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("bf.ID(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_3_0;
    }

    final void c(byte param0) {
        Enumeration var3 = null;
        java.awt.Canvas var4 = null;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        Hashtable var2 = new Hashtable();
        if (((bf) this).field_gb != null) {
            if (!(((bf) this).field_gb.isEmpty())) {
                var3 = ((bf) this).field_gb.keys();
                while (var3.hasMoreElements()) {
                    var4 = (java.awt.Canvas) var3.nextElement();
                    Object discarded$0 = var2.put((Object) (Object) var4, ((bf) this).a(-15083, var4));
                }
            }
        }
        if (param0 != 61) {
            ((bf) this).field_pc = true;
        }
        ((bf) this).field_gb = var2;
        this.h(26339);
        int discarded$1 = 24;
        this.P();
        int discarded$2 = -32;
        this.A();
        ((bf) this).field_wb.a((bf) this, 0);
    }

    final void a(int param0, byte param1) {
        if (!(param0 == ((bf) this).field_F)) {
            ((bf) this).field_F = param0;
            ((bf) this).w((byte) -73);
        }
        if (param1 < 24) {
            ((bf) this).field_P = null;
        }
    }

    final int j(byte param0) {
        if (param0 != 5) {
            this.D(-28);
        }
        return ((bf) this).field_bc;
    }

    abstract void a(jb param0, int param1, boolean param2, byte param3);

    final za c(int param0) {
        gi var2 = new gi(param0);
        ((bf) this).field_nc.a(107, (wf) (Object) var2);
        return (za) (Object) var2;
    }

    final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        ((bf) this).field_u = new jj[((bf) this).field_h];
        ((bf) this).field_f = new st[((bf) this).field_h];
        ((bf) this).field_H = new as[((bf) this).field_h];
        ((bf) this).field_w = new as[((bf) this).field_h];
        ((bf) this).field_L = new ec[((bf) this).field_h];
        var2 = 0;
        L0: while (true) {
          if (((bf) this).field_h <= var2) {
            L1: {
              ((bf) this).field_D = new sf[-2 + ((bf) this).field_fc];
              ((bf) this).field_Kb = (jj) (Object) ((bf) this).a(la.field_h, 8, 1, 1, lc.field_g);
              ((bf) this).a((za) (Object) new gi(262144));
              ((bf) this).field_Eb = ((bf) this).a(new pl[1], -127);
              fa discarded$8 = ((bf) this).a(new pl[1], param0 + -229);
              fa discarded$9 = ((bf) this).a(new pl[4], -127);
              fa discarded$10 = ((bf) this).a(new pl[3], param0 ^ -28);
              po discarded$11 = new po((bf) this, 0, 0, false, false);
              ((bf) this).field_cb = new po((bf) this, 0, 0, true, true);
              if (param0 == 101) {
                break L1;
              } else {
                this.R(-44);
                break L1;
              }
            }
            L2: {
              po discarded$12 = new po((bf) this, 0, 0, false, false);
              ((bf) this).field_vb = new po((bf) this, 0, 0, true, true);
              po discarded$13 = new po((bf) this, 0, 0, false, false);
              ((bf) this).field_k = new po((bf) this, 0, 0, true, true);
              po discarded$14 = new po((bf) this, 0, 0, false, false);
              ((bf) this).field_sb = new po((bf) this, 0, 0, true, true);
              po discarded$15 = new po((bf) this, 0, 0, false, false);
              ((bf) this).field_pb = new po((bf) this, 0, 0, true, true);
              ((bf) this).field_wb = new lm((bf) this);
              ((bf) this).field_C = ((bf) this).c(true, param0 ^ 8799);
              ((bf) this).c((byte) 61);
              ((bf) this).field_Tb = new em((bf) this);
              ((bf) this).field_Ob[1] = ((bf) this).b(1, (byte) 34);
              ((bf) this).field_Ob[2] = ((bf) this).b(2, (byte) 88);
              ((bf) this).field_Ob[4] = ((bf) this).b(4, (byte) 109);
              ((bf) this).field_Ob[5] = ((bf) this).b(5, (byte) 87);
              ((bf) this).field_Ob[6] = ((bf) this).b(6, (byte) 82);
              ((bf) this).field_Ob[7] = ((bf) this).b(7, (byte) 80);
              ((bf) this).field_Ob[3] = ((bf) this).b(3, (byte) 41);
              ((bf) this).field_Ob[8] = ((bf) this).b(8, (byte) 45);
              ((bf) this).field_Ob[9] = ((bf) this).b(9, (byte) 115);
              if (((bf) this).field_Ob[2].e(3)) {
                break L2;
              } else {
                ((bf) this).field_Ob[2] = ((bf) this).b(0, (byte) 44);
                break L2;
              }
            }
            L3: {
              if (!((bf) this).field_Ob[4].e(3)) {
                ((bf) this).field_Ob[4] = ((bf) this).field_Ob[2];
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((bf) this).field_Ob[8].e(3)) {
                break L4;
              } else {
                ((bf) this).field_Ob[8] = ((bf) this).field_Ob[4];
                break L4;
              }
            }
            L5: {
              if (!((bf) this).field_Ob[9].e(3)) {
                ((bf) this).field_Ob[9] = ((bf) this).field_Ob[8];
                break L5;
              } else {
                break L5;
              }
            }
            ((bf) this).G(-122);
            ((bf) this).U(param0 ^ 101);
            ((bf) this).e();
            return;
          } else {
            ((bf) this).field_w[var2] = ru.field_a;
            ((bf) this).field_H[var2] = ru.field_a;
            ((bf) this).field_f[var2] = mq.field_g;
            ((bf) this).field_L[var2] = new ec();
            var2++;
            continue L0;
          }
        }
    }

    void k(byte param0) {
        ((bf) this).field_ic = ((bf) this).field_B;
        if (param0 < 123) {
            return;
        }
        ((bf) this).field_B = 0;
    }

    final void x(int param0) {
        if (!(((bf) this).field_Yb == 4)) {
            ((bf) this).c(true);
            ((bf) this).a(false, false);
            ((bf) this).b(false, 256);
            ((bf) this).a((byte) -1, false);
            ((bf) this).a(-32, false);
            ((bf) this).a(false, false, -2, 3);
            ((bf) this).e(true, 1);
            ((bf) this).b(0, false);
            ((bf) this).field_Yb = 4;
        }
        if (param0 != -23608) {
            ((bf) this).field_I = false;
        }
    }

    final ec v(byte param0) {
        if (!((bf) this).field_S) {
            ((bf) this).field_tb.a((ao) (Object) ((bf) this).field_t, (byte) -93, (ao) (Object) ((bf) this).field_ec);
            ((bf) this).field_S = true;
        }
        int var2 = 28 % ((-8 - param0) / 33);
        return ((bf) this).field_tb;
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.F(86);
        ((bf) this).a((byte) -74, param4);
        ((bf) this).a((byte) 121, 0, bs.field_a);
        ((bf) this).a(bs.field_a, 0, 0);
        ((bf) this).e(true, param5);
        ((bf) this).field_ec.b((float)param3, (float)param2, 1.0f, -84);
        ((bf) this).field_ec.a(param1, param0, 0, 125);
        ((bf) this).q((byte) 110);
        ((bf) this).b((byte) -126, false);
        ((bf) this).s(2);
        ((bf) this).b((byte) -116, true);
        ((bf) this).a(dl.field_p, 0, 0);
        ((bf) this).a((byte) 127, 0, dl.field_p);
    }

    final int M(int param0) {
        if (param0 != 7693) {
            ((bf) this).T(-76);
        }
        return ((bf) this).field_F;
    }

    final float[] a(int param0, float[] param1) {
        RuntimeException var3 = null;
        float[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param1[param0] = ((bf) this).field_N[3];
            param1[4] = ((bf) this).field_N[1];
            param1[8] = ((bf) this).field_N[2];
            param1[0] = ((bf) this).field_N[0];
            param1[2] = ((bf) this).field_N[8];
            param1[13] = ((bf) this).field_N[7];
            param1[5] = ((bf) this).field_N[5];
            param1[1] = ((bf) this).field_N[4];
            param1[9] = ((bf) this).field_N[6];
            param1[3] = ((bf) this).field_N[12];
            param1[14] = ((bf) this).field_N[11];
            param1[10] = ((bf) this).field_N[10];
            param1[6] = ((bf) this).field_N[9];
            param1[7] = ((bf) this).field_N[13];
            param1[11] = ((bf) this).field_N[14];
            param1[15] = ((bf) this).field_N[15];
            stackOut_0_0 = (float[]) param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("bf.QE(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final void a(jb param0, int param1, int param2) {
        try {
            if (param2 != 0) {
                Object var5 = null;
                ((bf) this).a((jb) null, 23, true, (byte) 38);
            }
            ((bf) this).a(param0, param1, false, (byte) 111);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "bf.NF(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(jj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == ((bf) this).field_u[((bf) this).field_F]) {
                break L1;
              } else {
                L2: {
                  ((bf) this).field_u[((bf) this).field_F] = param0;
                  if (param0 == null) {
                    ((bf) this).j(1);
                    break L2;
                  } else {
                    param0.a((byte) -50);
                    break L2;
                  }
                }
                ((bf) this).field_Yb = ((bf) this).field_Yb & -2;
                break L1;
              }
            }
            L3: {
              if (param1 == -9135) {
                break L3;
              } else {
                ((bf) this).field_mb = true;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("bf.DG(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    private final boolean a(float param0, float param1, float param2, float param3, byte param4, float param5, float param6) {
        jaclib.memory.Stream var9 = null;
        jaclib.memory.Buffer var10 = null;
        var10 = ((bf) this).field_ac.a(true, (byte) -77);
        if (var10 == null) {
          return false;
        } else {
          L0: {
            var9 = ((bf) this).a(-125, var10);
            if (jaclib.memory.Stream.b()) {
              var9.b(param1);
              var9.b(param2);
              var9.b(param3);
              var9.b(param6);
              var9.b(param0);
              var9.b(param5);
              var9.a();
              break L0;
            } else {
              var9.a(param1);
              var9.a(param2);
              var9.a(param3);
              var9.a(param6);
              var9.a(param0);
              var9.a(param5);
              var9.a();
              break L0;
            }
          }
          return ((bf) this).field_ac.a((byte) -60);
        }
    }

    final int[] Y() {
        return new int[]{((bf) this).field_Ub, ((bf) this).field_lb, ((bf) this).field_oc, ((bf) this).field_M};
    }

    final go O(int param0) {
        if (param0 != 29190) {
            return null;
        }
        if (((bf) this).field_kb == null) {
            return null;
        }
        return ((bf) this).field_kb.a(0);
    }

    final int q(int param0) {
        if (param0 != 0) {
            return -88;
        }
        return ((bf) this).field_E;
    }

    abstract tl a(boolean param0, byte param1);

    final pa a(vd param0, boolean param1) {
        RuntimeException var3 = null;
        pa var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        pa stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        pa stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (-1 == param0.field_h) {
                  break L2;
                } else {
                  if (-1 == param0.field_c) {
                    break L2;
                  } else {
                    L3: {
                      var14 = new int[param0.field_c * param0.field_h];
                      var13 = var14;
                      var12 = var13;
                      var11 = var12;
                      var4 = var11;
                      var5 = 0;
                      var6 = 0;
                      if (null == param0.field_e) {
                        var7 = 0;
                        L4: while (true) {
                          if (var7 >= param0.field_c) {
                            break L3;
                          } else {
                            var8 = 0;
                            L5: while (true) {
                              if (var8 >= param0.field_h) {
                                var7++;
                                continue L4;
                              } else {
                                L6: {
                                  int incrementValue$3 = var5;
                                  var5++;
                                  var9 = param0.field_f[255 & param0.field_d[incrementValue$3]];
                                  int incrementValue$4 = var6;
                                  var6++;
                                  stackOut_14_0 = (int[]) var4;
                                  stackOut_14_1 = incrementValue$4;
                                  stackIn_16_0 = stackOut_14_0;
                                  stackIn_16_1 = stackOut_14_1;
                                  stackIn_15_0 = stackOut_14_0;
                                  stackIn_15_1 = stackOut_14_1;
                                  if (var9 == 0) {
                                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                                    stackOut_16_1 = stackIn_16_1;
                                    stackOut_16_2 = 0;
                                    stackIn_17_0 = stackOut_16_0;
                                    stackIn_17_1 = stackOut_16_1;
                                    stackIn_17_2 = stackOut_16_2;
                                    break L6;
                                  } else {
                                    stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                                    stackOut_15_1 = stackIn_15_1;
                                    stackOut_15_2 = vo.a(-16777216, var9);
                                    stackIn_17_0 = stackOut_15_0;
                                    stackIn_17_1 = stackOut_15_1;
                                    stackIn_17_2 = stackOut_15_2;
                                    break L6;
                                  }
                                }
                                stackIn_17_0[stackIn_17_1] = stackIn_17_2;
                                var8++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var7 = 0;
                        L7: while (true) {
                          if (var7 >= param0.field_c) {
                            break L3;
                          } else {
                            var8 = 0;
                            L8: while (true) {
                              if (param0.field_h <= var8) {
                                var7++;
                                continue L7;
                              } else {
                                int incrementValue$5 = var6;
                                var6++;
                                var4[incrementValue$5] = vo.a(param0.field_e[var5] << 24, param0.field_f[pg.a((int) param0.field_d[var5], 255)]);
                                var5++;
                                var8++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    var3_ref = ((bf) this).a(110, param0.field_c, var14, 0, param0.field_h, param0.field_h);
                    break L1;
                  }
                }
              }
              var3_ref = ((bf) this).a(105, 1, new int[1], 0, 1, 1);
              break L1;
            }
            var3_ref.a(param0.field_a, param0.field_i, param0.field_g, param0.field_b);
            stackOut_21_0 = (pa) var3_ref;
            stackIn_22_0 = stackOut_21_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("bf.HA(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 41);
        }
        return stackIn_22_0;
    }

    final int n(byte param0) {
        if (param0 >= -81) {
            return 6;
        }
        return ((bf) this).field_O;
    }

    final ec f(boolean param0) {
        if (param0) {
            boolean discarded$0 = ((bf) this).b();
        }
        return ((bf) this).field_A;
    }

    abstract void r(int param0);

    abstract void a(int param0, java.awt.Canvas param1, Object param2);

    final pa a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        rp stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        rp stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = new rp((bf) this, param3, param4, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("bf.O(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return (pa) (Object) stackIn_1_0;
    }

    abstract qi a(int param0, boolean param1, boolean param2, int param3, int param4, int[] param5, int param6);

    abstract void l(int param0);

    abstract void Q(int param0);

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if (((bf) this).field_Mb != param0) {
              break L1;
            } else {
              if (param1 != ((bf) this).field_x) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ((bf) this).field_Mb = param0;
          ((bf) this).field_x = param1;
          int discarded$2 = -23858;
          this.k();
          this.E(-68);
          this.R(-26661);
          break L0;
        }
    }

    abstract fa a(pl[] param0, int param1);

    final void a(as param0, boolean param1, as param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (((bf) this).field_H[((bf) this).field_F] == param0) {
                break L1;
              } else {
                ((bf) this).field_H[((bf) this).field_F] = param0;
                ((bf) this).N(0);
                var4_int = 1;
                break L1;
              }
            }
            L2: {
              if (param1) {
                break L2;
              } else {
                ((bf) this).field_m = -92;
                break L2;
              }
            }
            L3: {
              if (((bf) this).field_w[((bf) this).field_F] == param2) {
                break L3;
              } else {
                ((bf) this).field_w[((bf) this).field_F] = param2;
                ((bf) this).m((byte) -125);
                var4_int = 1;
                break L3;
              }
            }
            L4: {
              if (var4_int == 0) {
                break L4;
              } else {
                ((bf) this).field_Yb = ((bf) this).field_Yb & -30;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("bf.GF(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          L6: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    private final void e(byte param0) {
        ((bf) this).field_n[14] = ((bf) this).field_mc;
        ((bf) this).field_n[10] = ((bf) this).field_T;
    }

    private final boolean i(int param0) {
        return ((bf) this).field_Ob[3].e(3);
    }

    private final void h(int param0) {
        int var2 = 0;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        L0: {
          var5 = AceOfSkies.field_G ? 1 : 0;
          ((bf) this).field_s = ((bf) this).a(false, (byte) 111);
          if (param0 == 26339) {
            break L0;
          } else {
            ((bf) this).field_Wb = 0.4179408848285675f;
            break L0;
          }
        }
        boolean discarded$1 = ((bf) this).field_s.a(28, param0 ^ -26259, 140);
        var2 = 0;
        L1: while (true) {
          L2: {
            if (var2 >= 4) {
              break L2;
            } else {
              var3 = ((bf) this).field_s.a(true, (byte) -64);
              if (var3 != null) {
                L3: {
                  var4 = ((bf) this).a(84, var3);
                  if (jaclib.memory.Stream.b()) {
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(1.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(1.0f);
                    var4.b(0.0f);
                    var4.b(1.0f);
                    var4.b(1.0f);
                    var4.b(1.0f);
                    var4.b(0.0f);
                    var4.b(1.0f);
                    var4.b(1.0f);
                    var4.b(1.0f);
                    var4.b(1.0f);
                    var4.b(1.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(1.0f);
                    var4.b(0.0f);
                    var4.b(1.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    break L3;
                  } else {
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(1.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(1.0f);
                    var4.a(0.0f);
                    var4.a(1.0f);
                    var4.a(1.0f);
                    var4.a(1.0f);
                    var4.a(0.0f);
                    var4.a(1.0f);
                    var4.a(1.0f);
                    var4.a(1.0f);
                    var4.a(1.0f);
                    var4.a(1.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(1.0f);
                    var4.a(0.0f);
                    var4.a(1.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    break L3;
                  }
                }
                var4.a();
                if (((bf) this).field_s.a((byte) -60)) {
                  break L2;
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            }
          }
          ((bf) this).field_P = ((bf) this).a(new pl[1], -128);
          return;
        }
    }

    final int XA() {
        return ((bf) this).field_x;
    }

    final void S(int param0) {
        qo var2 = null;
        if (param0 != -32) {
            return;
        }
        if (!(((bf) this).field_bb == ps.field_d)) {
            var2 = ((bf) this).field_bb;
            ((bf) this).field_bb = ps.field_d;
            if (var2.b((byte) -92)) {
                this.e(true);
            }
            ((bf) this).field_Yb = ((bf) this).field_Yb & -32;
            ((bf) this).field_N = ((bf) this).field_W;
        }
    }

    final void d(boolean param0, int param1) {
        if (((bf) this).field_I != param0) {
            ((bf) this).field_I = param0 ? true : false;
            ((bf) this).b(false);
        }
        if (param1 >= -82) {
            ((bf) this).a(-60, (byte) -4);
        }
    }

    private final void L(int param0) {
        float var2_float = 0.0f;
        if (!(((bf) this).field_bb != rh.field_e)) {
            var2_float = ((bf) this).o((byte) 42);
            ((bf) this).field_ec.b(var2_float, (byte) -127, 0.0f, var2_float);
        }
        ((bf) this).field_S = false;
        int var2 = 59 % ((-19 - param0) / 51);
        ((bf) this).b((byte) 103);
        if (null != ((bf) this).field_nb) {
            ((bf) this).field_nb.b((byte) -25);
        }
    }

    final jaclib.memory.heap.NativeHeapBuffer a(byte param0, int param1, boolean param2) {
        if (param0 != -77) {
            this.h(86);
        }
        return ((bf) this).field_Qb.a(param1, param2);
    }

    abstract void b(byte param0);

    abstract go a(int param0, int param1, boolean param2, int[][] param3);

    final void b(boolean param0, int param1) {
        if (param1 != 256) {
            ((bf) this).field_M = -28;
        }
        if (!(((bf) this).field_ob == param0)) {
            ((bf) this).field_ob = param0 ? true : false;
            ((bf) this).T(param1 + -256);
            ((bf) this).field_Yb = ((bf) this).field_Yb & -8;
        }
    }

    final da a(vs param0, vd[] param1, boolean param2) {
        RuntimeException var4 = null;
        ig stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ig stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_0_0 = new ig((bf) this, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("bf.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
        return (da) (Object) stackIn_1_0;
    }

    abstract boolean a(la param0, int param1, hd param2);

    abstract void C(int param0);

    abstract void a(int param0, tl param1, int param2);

    final void K(int[] param0) {
        try {
            param0[1] = ((bf) this).field_Nb;
            param0[3] = ((bf) this).field_V;
            param0[0] = ((bf) this).field_R;
            param0[2] = ((bf) this).field_gc;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "bf.K(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final ec d(int param0) {
        if (param0 != 12343) {
            ti discarded$0 = ((bf) this).c(true, 123);
        }
        return ((bf) this).field_L[((bf) this).field_F];
    }

    abstract void b(byte param0, boolean param1);

    abstract void T(int param0);

    abstract void d(boolean param0);

    final void r(byte param0) {
        if (param0 <= 102) {
            ((bf) this).field_Ab = false;
        }
        if (((bf) this).field_Yb != 2) {
            ((bf) this).c(true);
            ((bf) this).a(false, false);
            ((bf) this).b(false, 256);
            ((bf) this).a((byte) -1, false);
            ((bf) this).a(-32, false);
            ((bf) this).a(false, false, -2, 3);
            ((bf) this).field_Yb = 2;
        }
    }

    abstract void p(int param0);

    abstract void v(int param0);

    final qi a(boolean param0, int param1, float[] param2, hd param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        qi stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        qi stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var7_int = -99 / ((-30 - param4) / 62);
            stackOut_0_0 = ((bf) this).a(param2, param5, param3, false, 0, param1, 0, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("bf.ND(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0;
    }

    abstract void w(int param0);

    abstract void s(byte param0);

    private final void a(ia param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((bf) this).a(1, ((bf) this).field_s, 0);
              ((bf) this).a(((bf) this).field_P, (byte) 75);
              ((bf) this).a(true, param0, param2, 0);
              if (param1 > 122) {
                break L1;
              } else {
                ((bf) this).g(26);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bf.KF(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final int i(byte param0) {
        if (param0 >= -1) {
            return -116;
        }
        return ((bf) this).field_qb + ((bf) this).field_jc + ((bf) this).field_j;
    }

    abstract void a(fa param0, byte param1);

    void c() {
        wf var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (!((bf) this).field_qc) {
            var1 = ((bf) this).field_nc.d(268435455);
            while (var1 != null) {
                ((gi) (Object) var1).d(127);
                var1 = ((bf) this).field_nc.b((byte) 103);
            }
            var1_ref = ((bf) this).field_gb.keys();
            while (var1_ref.hasMoreElements()) {
                var2 = (java.awt.Canvas) var1_ref.nextElement();
                ((bf) this).a(0, var2, ((bf) this).field_gb.get((Object) (Object) var2));
            }
            da.a(63, true, false);
            ((bf) this).field_i.release();
            ((bf) this).field_qc = true;
        }
    }

    final void a(byte param0, int param1, jb param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((bf) this).a(false, param1, true, param2, false);
              if (param0 > 117) {
                break L1;
              } else {
                ((bf) this).field_Vb = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bf.EE(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract void g(int param0);

    final void o(int param0) {
        java.awt.Canvas var3 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        Enumeration var2 = ((bf) this).field_gb.keys();
        while (var2.hasMoreElements()) {
            var3 = (java.awt.Canvas) var2.nextElement();
            ((bf) this).a(0, var3, ((bf) this).field_gb.get((Object) (Object) var3));
        }
        ((bf) this).field_s.a(4665);
        ((bf) this).field_ac.a(4665);
        ((bf) this).field_K.a(4665);
        ((bf) this).field_cb.b(0);
        ((bf) this).field_vb.b(0);
        ((bf) this).field_k.b(param0);
        ((bf) this).field_sb.b(0);
        ((bf) this).field_pb.b(param0);
        ((bf) this).field_wb.a(126);
        ((bf) this).field_C.a(4665);
    }

    final void DA(int param0, int param1, int param2, int param3) {
        ((bf) this).field_lb = param1;
        ((bf) this).field_oc = param2;
        ((bf) this).field_Ub = param0;
        ((bf) this).field_M = param3;
        this.E(-68);
        int discarded$0 = -23858;
        this.k();
        ((bf) this).S(-32);
        int discarded$1 = -7;
        this.K();
    }

    private final void R(int param0) {
        if (param0 != -26661) {
            ((bf) this).field_k = null;
        }
        if (((bf) this).field_nb != null) {
            ((bf) this).field_nb.a(10);
        }
        ((bf) this).h((byte) -121);
    }

    private final void z() {
    }

    final void c(boolean param0) {
        qo var2 = null;
        if (!param0) {
            ((bf) this).c();
        }
        if (rh.field_e != ((bf) this).field_bb) {
            var2 = ((bf) this).field_bb;
            ((bf) this).field_bb = rh.field_e;
            if (!(!var2.b((byte) -92))) {
                this.e(true);
            }
            int discarded$0 = -122;
            this.g();
            ((bf) this).field_N = ((bf) this).field_yb;
            this.g(false);
            ((bf) this).field_Yb = ((bf) this).field_Yb & -25;
        }
    }

    abstract void h(byte param0);

    private final void g(boolean param0) {
        ((bf) this).C(-79);
        if (null != ((bf) this).field_nb) {
            ((bf) this).field_nb.c(404277666);
        }
        ((bf) this).field_ec = null;
    }

    final void U(int param0) {
        ((bf) this).field_gc = ((bf) this).field_Z;
        ((bf) this).field_V = ((bf) this).field_jb;
        ((bf) this).field_R = param0;
        ((bf) this).field_Nb = 0;
        if (!(!((bf) this).field_Cb)) {
            ((bf) this).field_Cb = false;
            ((bf) this).r(0);
        }
        int discarded$0 = -7;
        this.K();
    }

    final jaclib.memory.Stream a(int param0, jaclib.memory.Buffer param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        jaclib.memory.Stream stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        jaclib.memory.Stream stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((bf) this).field_l.a(param1);
            var3_int = 107 / ((param0 - -48) / 50);
            stackOut_0_0 = ((bf) this).field_l;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("bf.RF(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        L0: {
          L1: {
            var7 = (float)(-param0) + (float)param2;
            var8 = (float)param3 - (float)param1;
            if (var7 != 0.0f) {
              break L1;
            } else {
              if (0.0f == var8) {
                var7 = 1.0f;
                break L0;
              } else {
                break L1;
              }
            }
          }
          var9 = (float)(1.0 / Math.sqrt((double)(var8 * var8 + var7 * var7)));
          var7 = var7 * var9;
          var8 = var8 * var9;
          break L0;
        }
        if (this.a(var8 + (float)param3, (float)param0, (float)param1, 0.0f, (byte) 47, 0.0f, var7 + (float)param2)) {
          this.F(84);
          ((bf) this).a((byte) -74, param4);
          ((bf) this).a((byte) 124, 0, bs.field_a);
          ((bf) this).a(bs.field_a, 0, 0);
          ((bf) this).e(true, param5);
          ((bf) this).a((byte) 120);
          ((bf) this).b((byte) -117, false);
          this.D(0);
          ((bf) this).b((byte) -119, true);
          ((bf) this).a(dl.field_p, 0, 0);
          ((bf) this).a((byte) 123, 0, dl.field_p);
          return;
        } else {
          return;
        }
    }

    abstract void u(byte param0);

    final void a(za param0) {
        try {
            ((bf) this).field_Qb = ((gi) (Object) param0).field_h;
            ((bf) this).field_Q = ((bf) this).field_Qb.a(32768, false);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "bf.NA(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    private final void D(int param0) {
        ((bf) this).a(1, ((bf) this).field_ac, 0);
        ((bf) this).a(((bf) this).field_xb, (byte) 75);
        ((bf) this).a(true, wt.field_m, 1, param0);
    }

    final void f(int param0) {
        if (param0 != -21041) {
            ((bf) this).a((byte) 82);
        }
        if (mq.field_g != ((bf) this).field_f[((bf) this).field_F]) {
            ((bf) this).field_f[((bf) this).field_F] = mq.field_g;
            ((bf) this).field_L[((bf) this).field_F].a((byte) -59);
            int discarded$0 = 15;
            this.B();
        }
    }

    private final void d(byte param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float[] var9 = null;
        L0: {
          if (!((bf) this).field_hb) {
            L1: {
              L2: {
                var9 = ((bf) this).field_U;
                var2 = var9;
                var3 = (float)((bf) this).field_Mb;
                var4 = (float)((bf) this).field_x;
                var5 = (float)(-((bf) this).field_lb) * ((bf) this).field_db / (float)((bf) this).field_M;
                var6 = (float)(-((bf) this).field_Ub) * ((bf) this).field_db / (float)((bf) this).field_oc;
                var7 = (float)(((bf) this).field_Z + -((bf) this).field_Ub) * ((bf) this).field_db / (float)((bf) this).field_oc;
                var8 = (float)(-((bf) this).field_lb + ((bf) this).field_jb) * ((bf) this).field_db / (float)((bf) this).field_M;
                if (var7 == var6) {
                  break L2;
                } else {
                  if (var8 == var5) {
                    break L2;
                  } else {
                    var9[2] = 0.0f;
                    var9[15] = 1.0f;
                    var9[9] = 0.0f;
                    var9[13] = (var8 + var5) / (-var5 + var8);
                    var9[0] = 2.0f / (-var6 + var7);
                    var9[1] = 0.0f;
                    var9[11] = 0.0f;
                    var9[7] = 0.0f;
                    var9[3] = 0.0f;
                    var9[5] = 2.0f / (-var5 + var8);
                    var9[6] = 0.0f;
                    var9[10] = 1.0f / (-var4 + var3);
                    var9[8] = 0.0f;
                    var9[14] = var3 / (-var4 + var3);
                    var9[4] = 0.0f;
                    var9[12] = (var6 + var7) / (var6 - var7);
                    break L1;
                  }
                }
              }
              var2[4] = 0.0f;
              var2[9] = 0.0f;
              var2[1] = 0.0f;
              var2[14] = 0.0f;
              var2[13] = 0.0f;
              var2[3] = 0.0f;
              var2[2] = 0.0f;
              var2[8] = 0.0f;
              var2[15] = 1.0f;
              var2[0] = 1.0f;
              var2[10] = 1.0f;
              var2[11] = 0.0f;
              var2[5] = 1.0f;
              var2[7] = 0.0f;
              var2[12] = 0.0f;
              var2[6] = 0.0f;
              break L1;
            }
            int discarded$1 = 27304;
            this.z();
            ((bf) this).field_hb = true;
            break L0;
          } else {
            break L0;
          }
        }
    }

    void b(int param0) {
        if (!(((bf) this).field_z == null)) {
            ((bf) this).field_z.a((byte) 126);
        }
        ((bf) this).field_r = param0 & 2147483647;
    }

    private final void F(int param0) {
        if (!(((bf) this).field_Yb == 1)) {
            ((bf) this).c(true);
            ((bf) this).a(false, false);
            ((bf) this).b(false, 256);
            ((bf) this).a((byte) -1, false);
            ((bf) this).a(-32, false);
            ((bf) this).a(false, false, -2, 3);
            ((bf) this).b(1, false);
            ((bf) this).a(((bf) this).field_Kb, -9135);
            ((bf) this).field_Yb = 1;
        }
        if (param0 <= 40) {
            ((bf) this).f(23);
        }
    }

    abstract void p(byte param0);

    abstract void I(int param0);

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 <= 0) {
            if (param2 >= -1 + ((bf) this).field_Z) {
                if (0 >= param1) {
                    if (((bf) this).field_jb - 1 <= param3) {
                        ((bf) this).U(0);
                        return;
                    }
                }
            }
        }
        ((bf) this).field_Nb = param1 < 0 ? 0 : param1;
        ((bf) this).field_R = param0 >= 0 ? param0 : 0;
        ((bf) this).field_V = ((bf) this).field_Z >= param3 ? param3 : 0;
        ((bf) this).field_gc = param2 <= ((bf) this).field_Z ? param2 : 0;
        if (!(((bf) this).field_Cb)) {
            ((bf) this).field_Cb = true;
            ((bf) this).r(0);
        }
        ((bf) this).I(97);
        int discarded$0 = -7;
        this.K();
    }

    void G(int param0) {
        int discarded$0 = 0;
        this.n();
        int var2 = 23 % ((param0 - -65) / 51);
    }

    abstract qi a(la param0, int param1, int param2, int param3, hd param4);

    final void a(st param0, byte param1) {
        try {
            ((bf) this).field_f[((bf) this).field_F] = param0;
            int discarded$0 = 15;
            this.B();
            int var3_int = 19 / ((-7 - param1) / 55);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "bf.LD(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    abstract void a(boolean param0, int param1, boolean param2, jb param3, boolean param4);

    abstract void t(byte param0);

    abstract float o(byte param0);

    private final void E(int param0) {
        if (param0 != -68) {
            ((bf) this).field_hb = false;
        }
        ((bf) this).field_hb = false;
        this.d((byte) 82);
        if (((bf) this).field_bb == nj.field_f) {
            this.g(false);
        }
    }

    abstract qi a(float[] param0, int param1, hd param2, boolean param3, int param4, int param5, int param6, boolean param7);

    abstract void w(byte param0);

    private final void B() {
        ((bf) this).p(-118);
        if (!(null == ((bf) this).field_nb)) {
            ((bf) this).field_nb.d(18580);
        }
    }

    static {
    }
}
