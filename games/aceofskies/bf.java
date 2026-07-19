/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

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
        if (param0 > this.field_R) {
            this.field_R = param0;
            var5 = 1;
        }
        if (this.field_gc > param2) {
            var5 = 1;
            this.field_gc = param2;
        }
        if (!(param1 <= this.field_Nb)) {
            this.field_Nb = param1;
            var5 = 1;
        }
        if (!(this.field_V <= param3)) {
            this.field_V = param3;
            var5 = 1;
        }
        if (var5 != 0) {
            if (!(this.field_Cb)) {
                this.field_Cb = true;
                this.r(0);
            }
            this.I(80);
            this.K(-7);
        }
    }

    private final void n(int param0) {
        int var2 = 0;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        this.m(-109);
        this.t((byte) -69);
        this.T(0);
        this.k((byte) 127);
        this.V(0);
        this.s((byte) -94);
        this.l(-30535);
        this.d(false);
        this.w(param0);
        this.b(false);
        this.h((byte) -117);
        this.p((byte) -128);
        this.l((byte) 127);
        this.u((byte) -66);
        for (var2 = -1 + this.field_h; var2 >= 0; var2--) {
            this.a(var2, (byte) 98);
            this.N(0);
            this.m((byte) -127);
            this.f(-21041);
        }
        this.g(param0 + 0);
        this.Q(112);
        this.C(param0 + -122);
        this.b((byte) 82);
        this.v(5);
    }

    final int i() {
        return this.field_Mb;
    }

    abstract void b(boolean param0);

    abstract ti c(boolean param0, int param1);

    final void U(int param0, int param1, int param2, int param3, int param4) {
        this.c(param0, param1, param2 + param0, param1, param3, param4);
    }

    abstract void N(int param0);

    final void a(boolean param0, boolean param1, int param2, int param3) {
        int discarded$1 = 0;
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
            if (param2 != this.field_ab) {
              break L1;
            } else {
              L2: {
                if (this.field_dc) {
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
                if (this.field_Bb) {
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
            if (!this.field_Bb) {
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
                  var5 = this.field_z.a((byte) -69, param2);
                  var10 = this.field_a.a(false, param2);
                  if (var10.field_n != 0) {
                    break L7;
                  } else {
                    if (var10.field_j == 0) {
                      this.f(param3 + -21044);
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
                var13 = this.d(12343);
                var13.a((float)(this.field_r % var12 * var10.field_n) / (float)var12, (byte) 107, (float)(this.field_r % var12 * var10.field_j) / (float)var12, 0.0f);
                this.a(tr.field_a, (byte) -87);
                break L6;
              }
              var6 = var10.field_e;
              if (!this.field_Bb) {
                var9 = var10.field_c;
                var7 = var10.field_s;
                var8 = var10.field_h;
                break L5;
              } else {
                break L5;
              }
            } else {
              this.f(-21041);
              break L5;
            }
          }
          L9: {
            this.a((byte) 122, param1, var8, param0, var9, var7);
            if (null == this.field_nb) {
              this.a((jj) (var5), -9135);
              this.b(var6, false);
              break L9;
            } else {
              this.field_nb.a(var6, 86, (jj) (var5));
              break L9;
            }
          }
          this.field_ab = param2;
          this.field_dc = this.field_Bb;
          break L0;
        }
        L10: {
          if (param3 == 3) {
            break L10;
          } else {
            discarded$1 = this.i((byte) -128);
            break L10;
          }
        }
        this.field_Yb = this.field_Yb & -8;
    }

    final void a(byte param0, boolean param1) {
        if (!(this.field_ib == param1)) {
            this.field_ib = param1 ? true : false;
            this.d(false);
            this.field_Yb = this.field_Yb & -32;
        }
        if (param0 != -1) {
            tl var4 = (tl) null;
            this.a(-26, (tl) null, 50);
        }
    }

    abstract void a(nf param0, boolean param1);

    final ec J(int param0) {
        int var2 = -63 % ((param0 - -67) / 41);
        return this.field_L[this.field_F];
    }

    abstract bp a(int param0, int param1, int param2, hd param3, int param4, byte[] param5);

    final ec t(int param0) {
        if (param0 != -11198) {
            return (ec) null;
        }
        return this.field_t;
    }

    final void e(boolean param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        qr var3 = null;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        if (!param0) {
            return;
        }
        if (param1 == this.field_G) {
        } else {
            if (param1 == 1) {
                var5 = 1;
                var4 = 1;
                var3 = pi.field_x;
            } else {
                if (-3 == (param1 ^ -1)) {
                    var3 = ne.field_i;
                    var5 = 0;
                    var4 = 1;
                } else {
                    if (-129 == (param1 ^ -1)) {
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
            if (!(var5 != (!this.field_Vb ? 1 : 0))) {
                this.field_Vb = var5 != 0 ? true : false;
                this.u((byte) -122);
            }
            if ((!this.field_Db ? 1 : 0) == var4) {
                this.field_Db = var4 != 0 ? true : false;
                this.p((byte) -128);
            }
            if (!(var3 == this.field_zb)) {
                this.field_zb = var3;
                this.l((byte) 88);
            }
            this.field_Yb = this.field_Yb & -29;
            this.field_G = param1;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = this.o((byte) 42);
        this.F(103);
        this.a((byte) -74, param4);
        this.a((byte) 122, 0, bs.field_a);
        this.a(bs.field_a, 0, 0);
        this.e(true, param5);
        this.field_ec.b((float)(param3 + -1), (float)(param2 - 1), 1.0f, -125);
        this.field_ec.b(-var7 + (float)param1, (byte) -125, 0.0f, -var7 + (float)param0);
        this.q((byte) 127);
        this.b((byte) -120, false);
        this.a(bm.field_x, (byte) 127, 4);
        this.b((byte) -114, true);
        this.a(dl.field_p, 0, 0);
        this.a((byte) 125, 0, dl.field_p);
    }

    private final void P(int param0) {
        this.field_ac = this.a(true, (byte) 91);
        boolean discarded$0 = this.field_ac.a(12, -120, param0);
        this.field_xb = this.a(new pl[]{new pl(rl.field_b)}, param0 + -152);
    }

    final ec y(int param0) {
        if (param0 >= -66) {
            this.field_i = (jagex3.graphics2.hw.NativeInterface) null;
        }
        return this.field_ec;
    }

    final void a(boolean param0, boolean param1) {
        if ((!this.field_o ? 1 : 0) != (!param0 ? 1 : 0)) {
            this.field_o = param0 ? true : false;
            this.b(false);
            this.field_Yb = this.field_Yb & -32;
        }
        if (param1) {
            this.U(78, 60, 115, 111, 3);
        }
    }

    final void a(boolean param0, int param1) {
        if ((!this.field_pc ? 1 : 0) != (!param0 ? 1 : 0)) {
            this.field_pc = param0 ? true : false;
            this.T(0);
        }
        if (param1 != -26973) {
            this.c(127, -1, -89, 21, -67, 63);
        }
    }

    abstract void l(byte param0);

    final void a(byte param0, int param1) {
        jaclib.memory.Stream discarded$0 = null;
        if (param0 != -74) {
            jaclib.memory.Buffer var4 = (jaclib.memory.Buffer) null;
            discarded$0 = this.a(39, (jaclib.memory.Buffer) null);
        }
        if (param1 != this.field_cc) {
            this.field_cc = param1;
            this.g(param0 ^ -74);
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != -32) {
            this.field_peer = 66L;
        }
        if (!((this.field_Y ? 1 : 0) != (!param1 ? 1 : 0))) {
            this.field_Y = param1 ? true : false;
            this.w(param0 ^ -32);
            this.field_Yb = this.field_Yb & -32;
        }
    }

    final void b(int param0, boolean param1) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if ((param0 ^ -1) == -2) {
            this.a(bd.field_C, true, bd.field_C);
        } else {
            if (-1 == (param0 ^ -1)) {
                this.a(ru.field_a, true, ru.field_a);
            } else {
                if (param0 == 2) {
                    this.a(du.field_l, true, bd.field_C);
                } else {
                    if (param0 == 3) {
                        this.a(lo.field_j, true, ru.field_a);
                    } else {
                        if (!(4 != param0)) {
                            this.a(fs.field_d, true, fs.field_d);
                        }
                    }
                }
            }
        }
        if (param1) {
            this.V(-59);
        }
    }

    abstract void a(boolean param0, ia param1, int param2, int param3);

    final void q(byte param0) {
        this.field_Lb = false;
        this.L(50);
        if (param0 <= 50) {
            this.a((byte) 51);
        }
    }

    abstract qi a(int param0, boolean param1, hd param2, int param3, byte param4, int param5, int param6, byte[] param7);

    final qi a(byte[] param0, int param1, boolean param2, int param3, hd param4, boolean param5) {
        RuntimeException var7 = null;
        qi stackIn_2_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qi stackOut_3_0 = null;
        qi stackOut_1_0 = null;
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
              stackOut_3_0 = this.a(param3, param5, param4, param1, (byte) 108, 0, 0, param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (qi) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var7);
            stackOut_5_1 = new StringBuilder().append("bf.VE(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void s(int param0) {
        this.a(qp.field_j, (byte) 123, param0);
    }

    private final void K(int param0) {
        if (param0 != -7) {
            this.field_z = (sb) null;
        }
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
          var7 = -100 / ((69 - param0) / 43);
          if (param3) {
            break L0;
          } else {
            L1: {
              if (-5 == (param4 ^ -1)) {
                break L1;
              } else {
                if (8 == param4) {
                  break L1;
                } else {
                  if ((param4 ^ -1) != -10) {
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
          if (param4 == this.field_eb) {
            if (this.field_eb == 0) {
              break L4;
            } else {
              L5: {
                this.field_Ob[2147483647 & this.field_eb].a(false, param1);
                if (param5 != this.field_Sb) {
                  break L5;
                } else {
                  if (param2 == this.field_hc) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              this.field_Ob[this.field_eb & 2147483647].a(1786747298, param5, param2);
              this.field_hc = param2;
              this.field_Sb = param5;
              break L4;
            }
          } else {
            L6: {
              if (0 == this.field_eb) {
                break L6;
              } else {
                this.field_Ob[2147483647 & this.field_eb].a(true);
                break L6;
              }
            }
            L7: {
              if (0 == param4) {
                this.field_nb = null;
                break L7;
              } else {
                this.field_nb = this.field_Ob[param4 & 2147483647];
                this.field_nb.a(param1, (byte) 8);
                this.field_nb.a(false, param1);
                this.field_nb.a(1786747298, param5, param2);
                break L7;
              }
            }
            this.field_eb = param4;
            this.field_hc = param2;
            this.field_Sb = param5;
            break L4;
          }
        }
    }

    private final void k(int param0) {
        this.field_e = false;
        if (param0 != -23858) {
            this.field_peer = -76L;
        }
        this.u(12221);
        if (!(this.field_bb != aj.field_v)) {
            this.g(false);
        }
    }

    abstract void V(int param0);

    private final void g(byte param0) {
        float[] var2 = null;
        float[] var3 = null;
        L0: {
          if (param0 < -99) {
            break L0;
          } else {
            this.field_C = (ti) null;
            break L0;
          }
        }
        L1: {
          if (!this.field_Zb) {
            L2: {
              L3: {
                var3 = this.field_yb;
                var2 = var3;
                if (this.field_Z == 0) {
                  break L3;
                } else {
                  if (0 == this.field_jb) {
                    break L3;
                  } else {
                    var3[12] = -1.0f;
                    var3[7] = 0.0f;
                    var3[10] = 0.5f;
                    var3[3] = 0.0f;
                    var3[2] = 0.0f;
                    var3[0] = 2.0f / (float)this.field_Z;
                    var3[8] = 0.0f;
                    var3[6] = 0.0f;
                    var3[4] = 0.0f;
                    var3[11] = 0.0f;
                    var3[14] = 0.5f;
                    var3[9] = 0.0f;
                    var3[13] = 1.0f;
                    var3[15] = 1.0f;
                    var3[1] = 0.0f;
                    var3[5] = -2.0f / (float)this.field_jb;
                    break L2;
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
              break L2;
            }
            this.field_Zb = true;
            break L1;
          } else {
            break L1;
          }
        }
    }

    final int H(int param0) {
        if (param0 <= 20) {
            return 17;
        }
        return this.field_v;
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
        if (-7 == (var3 ^ -1)) {
          return (sk) ((Object) new cf((bf) (this)));
        } else {
          if (var3 == 1) {
            return (sk) ((Object) new oj((bf) (this)));
          } else {
            if (2 != var3) {
              if (-8 == (var3 ^ -1)) {
                return (sk) ((Object) new ta((bf) (this)));
              } else {
                return (sk) ((Object) new ae((bf) (this)));
              }
            } else {
              return (sk) ((Object) new u((bf) (this), this.field_Tb));
            }
          }
        }
    }

    private final void e(boolean param0) {
        if (!param0) {
            this.w((byte) 95);
        }
        this.field_S = false;
        if (null != this.field_nb) {
            this.field_nb.b(-126);
        }
        this.v(5);
    }

    private final void u(int param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float[] var8 = null;
        L0: {
          if (!this.field_e) {
            L1: {
              L2: {
                var8 = this.field_n;
                var2 = var8;
                var3 = (float)(this.field_Mb * -this.field_Ub) / (float)this.field_oc;
                var4 = (float)((this.field_Z + -this.field_Ub) * this.field_Mb) / (float)this.field_oc;
                var5 = (float)(this.field_Mb * this.field_lb) / (float)this.field_M;
                var6 = (float)(this.field_Mb * (this.field_lb + -this.field_jb)) / (float)this.field_M;
                if (var4 == var3) {
                  break L2;
                } else {
                  if (var5 == var6) {
                    break L2;
                  } else {
                    var7 = 2.0f * (float)this.field_Mb;
                    var8[1] = 0.0f;
                    var8[8] = (var3 + var4) / (-var3 + var4);
                    var8[4] = 0.0f;
                    this.field_T = (float)this.field_x / (float)(-this.field_x + this.field_Mb);
                    var8[10] = (float)this.field_x / (float)(-this.field_x + this.field_Mb);
                    var8[7] = 0.0f;
                    this.field_mc = (float)(this.field_Mb * this.field_x) / (float)(this.field_Mb - this.field_x);
                    var8[14] = (float)(this.field_Mb * this.field_x) / (float)(this.field_Mb - this.field_x);
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
                    break L1;
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
              break L1;
            }
            this.e((byte) 93);
            this.field_e = true;
            break L0;
          } else {
            break L0;
          }
        }
        L3: {
          if (param0 == 12221) {
            break L3;
          } else {
            this.field_s = (tl) null;
            break L3;
          }
        }
    }

    abstract void j(int param0);

    private final void A(int param0) {
        fa discarded$4 = null;
        int var2 = 0;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        double var6 = 0.0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        L0: {
          var10 = AceOfSkies.field_G ? 1 : 0;
          this.field_K = this.a(false, (byte) 118);
          if (param0 == -32) {
            break L0;
          } else {
            this.field_fb = 0.25540614128112793f;
            break L0;
          }
        }
        boolean discarded$3 = this.field_K.a(12, -125, 3096);
        var2 = 0;
        L1: while (true) {
          L2: {
            if (4 <= var2) {
              break L2;
            } else {
              var3 = this.field_K.a(true, (byte) -59);
              if (var3 != null) {
                var4 = this.a(-105, var3);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var5 = 0;
                L3: while (true) {
                  if (256 < var5) {
                    var4.a();
                    if (this.field_K.a((byte) -60)) {
                      break L2;
                    } else {
                      var2++;
                      continue L1;
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
                      continue L3;
                    } else {
                      var4.a(var9);
                      var4.a(var8);
                      var4.a(0.0f);
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                var2++;
                continue L1;
              }
            }
          }
          discarded$4 = this.a(new pl[]{new pl(rl.field_b)}, -127);
          return;
        }
    }

    final void a(byte param0) {
        if (param0 <= 35) {
            this.field_Ub = -59;
        }
        this.field_ec.a((byte) -59);
        this.field_Lb = true;
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
        this.field_nc = new kp();
        this.field_Lb = true;
        this.field_ec = new ec();
        ec discarded$3 = new ec();
        ec discarded$4 = new ec();
        this.field_t = new ec();
        this.field_A = new ec();
        this.field_tb = new ec();
        this.field_v = 0;
        this.field_Wb = 1.0f;
        this.field_Jb = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.field_Zb = false;
        this.field_mb = true;
        this.field_V = 0;
        this.field_Hb = 1.0f;
        this.field_W = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.field_q = 0;
        this.field_S = false;
        this.field_fb = -1.0f;
        this.field_M = 512;
        this.field_Ub = 0;
        this.field_Db = true;
        this.field_g = 1.0f;
        this.field_db = 1.0f;
        this.field_N = this.field_W;
        this.field_yb = new float[16];
        this.field_ib = false;
        this.field_p = -1;
        this.field_I = true;
        this.field_Nb = 0;
        this.field_x = 3584;
        this.field_lb = 0;
        this.field_e = false;
        this.field_ab = -1;
        this.field_Gb = new float[]{0.0f, 0.0f, -1.0f, 0.0f};
        this.field_Rb = 0;
        this.field_F = 0;
        this.field_X = -1;
        this.field_Ob = new sk[10];
        this.field_Ab = true;
        this.field_bc = -1;
        this.field_hb = false;
        this.field_ub = -1.0f;
        this.field_kc = 128;
        this.field_bb = ps.field_d;
        this.field_Mb = 50;
        this.field_eb = 0;
        this.field_Y = false;
        this.field_Ib = 0;
        this.field_U = new float[16];
        this.field_oc = 512;
        this.field_zb = pi.field_x;
        this.field_E = -1;
        this.field_rb = 1.0f;
        this.field_dc = false;
        this.field_R = 0;
        this.field_pc = false;
        this.field_qc = false;
        this.field_ob = false;
        this.field_hc = 0;
        this.field_n = new float[16];
        this.field_Sb = 0;
        this.field_G = 1;
        this.field_gc = 0;
        this.field_Vb = true;
        this.field_l = new jaclib.memory.Stream();
        ec discarded$5 = new ec();
        try {
          L0: {
            try {
              L1: {
                L2: {
                  this.field_lc = param4;
                  this.field_d = param3;
                  this.field_Fb = param1;
                  var11 = param0.getSize();
                  this.field_Z = var11.width;
                  this.field_jb = var11.height;
                  this.field_m = param5;
                  fr.a(false, 0, true);
                  if (null == this.field_a) {
                    this.field_i = new jagex3.graphics2.hw.NativeInterface(0, this.field_m);
                    this.field_z = null;
                    break L2;
                  } else {
                    this.field_z = new sb((bf) (this), this.field_a);
                    this.field_i = new jagex3.graphics2.hw.NativeInterface(this.field_a.a(28060), this.field_m);
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= this.field_a.a(28060)) {
                        break L2;
                      } else {
                        L4: {
                          var9 = this.field_a.a(false, var8);
                          if (var9 == null) {
                            break L4;
                          } else {
                            this.field_i.initTextureMetrics(var8, var9.field_r, var9.field_b);
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
              this.a(-9);
              throw new RuntimeException("");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var7_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var7_ref);
            stackOut_10_1 = new StringBuilder().append("bf.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ',' + param5 + ')');
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
                this.field_Zb = false;
                break L1;
              }
            }
            stackOut_2_0 = this.a(0, true, param3, param4, 0, param0, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var6);
            stackOut_4_1 = new StringBuilder().append("bf.ID(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    final void c(byte param0) {
        Enumeration var3 = null;
        java.awt.Canvas var4 = null;
        Object discarded$0 = null;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        Hashtable var2 = new Hashtable();
        if (this.field_gb != null) {
            if (!(this.field_gb.isEmpty())) {
                var3 = this.field_gb.keys();
                while (var3.hasMoreElements()) {
                    var4 = (java.awt.Canvas) (var3.nextElement());
                    discarded$0 = var2.put(var4, this.a(-15083, var4));
                }
            }
        }
        if (param0 != 61) {
            this.field_pc = true;
        }
        this.field_gb = var2;
        this.h(26339);
        this.P(24);
        this.A(-32);
        this.field_wb.a((bf) (this), 0);
    }

    final void a(int param0, byte param1) {
        if (!(param0 == this.field_F)) {
            this.field_F = param0;
            this.w((byte) -73);
        }
        if (param1 < 24) {
            this.field_P = (fa) null;
        }
    }

    final int j(byte param0) {
        if (param0 != 5) {
            this.D(-28);
        }
        return this.field_bc;
    }

    abstract void a(jb param0, int param1, boolean param2, byte param3);

    final za c(int param0) {
        gi var2 = new gi(param0);
        this.field_nc.a(107, var2);
        return (za) ((Object) var2);
    }

    final void f(byte param0) {
        fa discarded$8 = null;
        fa discarded$9 = null;
        fa discarded$10 = null;
        po discarded$11 = null;
        po discarded$12 = null;
        po discarded$13 = null;
        po discarded$14 = null;
        po discarded$15 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        this.field_u = new jj[this.field_h];
        this.field_f = new st[this.field_h];
        this.field_H = new as[this.field_h];
        this.field_w = new as[this.field_h];
        this.field_L = new ec[this.field_h];
        var2 = 0;
        L0: while (true) {
          if (this.field_h <= var2) {
            L1: {
              this.field_D = new sf[-2 + this.field_fc];
              this.field_Kb = (jj) ((Object) this.a(la.field_h, 8, 1, 1, lc.field_g));
              this.a(new gi(262144));
              this.field_Eb = this.a(new pl[]{new pl(new rl[]{rl.field_b, rl.field_j})}, -127);
              discarded$8 = this.a(new pl[]{new pl(new rl[]{rl.field_b, rl.field_c})}, param0 + -229);
              discarded$9 = this.a(new pl[]{new pl(rl.field_b), new pl(rl.field_c), new pl(rl.field_j), new pl(rl.field_m)}, -127);
              discarded$10 = this.a(new pl[]{new pl(rl.field_b), new pl(rl.field_c), new pl(rl.field_j)}, param0 ^ -28);
              discarded$11 = new po((bf) (this), 0, 0, false, false);
              this.field_cb = new po((bf) (this), 0, 0, true, true);
              if (param0 == 101) {
                break L1;
              } else {
                this.R(-44);
                break L1;
              }
            }
            L2: {
              discarded$12 = new po((bf) (this), 0, 0, false, false);
              this.field_vb = new po((bf) (this), 0, 0, true, true);
              discarded$13 = new po((bf) (this), 0, 0, false, false);
              this.field_k = new po((bf) (this), 0, 0, true, true);
              discarded$14 = new po((bf) (this), 0, 0, false, false);
              this.field_sb = new po((bf) (this), 0, 0, true, true);
              discarded$15 = new po((bf) (this), 0, 0, false, false);
              this.field_pb = new po((bf) (this), 0, 0, true, true);
              this.field_wb = new lm((bf) (this));
              this.field_C = this.c(true, param0 ^ 8799);
              this.c((byte) 61);
              this.field_Tb = new em((bf) (this));
              this.field_Ob[1] = this.b(1, (byte) 34);
              this.field_Ob[2] = this.b(2, (byte) 88);
              this.field_Ob[4] = this.b(4, (byte) 109);
              this.field_Ob[5] = this.b(5, (byte) 87);
              this.field_Ob[6] = this.b(6, (byte) 82);
              this.field_Ob[7] = this.b(7, (byte) 80);
              this.field_Ob[3] = this.b(3, (byte) 41);
              this.field_Ob[8] = this.b(8, (byte) 45);
              this.field_Ob[9] = this.b(9, (byte) 115);
              if (this.field_Ob[2].e(3)) {
                break L2;
              } else {
                this.field_Ob[2] = this.b(0, (byte) 44);
                break L2;
              }
            }
            L3: {
              if (!this.field_Ob[4].e(3)) {
                this.field_Ob[4] = this.field_Ob[2];
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_Ob[8].e(3)) {
                break L4;
              } else {
                this.field_Ob[8] = this.field_Ob[4];
                break L4;
              }
            }
            L5: {
              if (!this.field_Ob[9].e(3)) {
                this.field_Ob[9] = this.field_Ob[8];
                break L5;
              } else {
                break L5;
              }
            }
            this.G(-122);
            this.U(param0 ^ 101);
            this.e();
            return;
          } else {
            this.field_w[var2] = ru.field_a;
            this.field_H[var2] = ru.field_a;
            this.field_f[var2] = mq.field_g;
            this.field_L[var2] = new ec();
            var2++;
            continue L0;
          }
        }
    }

    void k(byte param0) {
        this.field_ic = this.field_B;
        if (param0 < 123) {
            return;
        }
        this.field_B = 0;
    }

    final void x(int param0) {
        if (!((this.field_Yb ^ -1) == -5)) {
            this.c(true);
            this.a(false, false);
            this.b(false, 256);
            this.a((byte) -1, false);
            this.a(-32, false);
            this.a(false, false, -2, 3);
            this.e(true, 1);
            this.b(0, false);
            this.field_Yb = 4;
        }
        if (param0 != -23608) {
            this.field_I = false;
        }
    }

    final ec v(byte param0) {
        if (!this.field_S) {
            this.field_tb.a(this.field_t, (byte) -93, this.field_ec);
            this.field_S = true;
        }
        int var2 = 28 % ((-8 - param0) / 33);
        return this.field_tb;
    }

    final void aa(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.F(86);
        this.a((byte) -74, param4);
        this.a((byte) 121, 0, bs.field_a);
        this.a(bs.field_a, 0, 0);
        this.e(true, param5);
        this.field_ec.b((float)param3, (float)param2, 1.0f, -84);
        this.field_ec.a(param1, param0, 0, 125);
        this.q((byte) 110);
        this.b((byte) -126, false);
        this.s(2);
        this.b((byte) -116, true);
        this.a(dl.field_p, 0, 0);
        this.a((byte) 127, 0, dl.field_p);
    }

    final int M(int param0) {
        if (param0 != 7693) {
            this.T(-76);
        }
        return this.field_F;
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
            param1[param0] = this.field_N[3];
            param1[4] = this.field_N[1];
            param1[8] = this.field_N[2];
            param1[0] = this.field_N[0];
            param1[2] = this.field_N[8];
            param1[13] = this.field_N[7];
            param1[5] = this.field_N[5];
            param1[1] = this.field_N[4];
            param1[9] = this.field_N[6];
            param1[3] = this.field_N[12];
            param1[14] = this.field_N[11];
            param1[10] = this.field_N[10];
            param1[6] = this.field_N[9];
            param1[7] = this.field_N[13];
            param1[11] = this.field_N[14];
            param1[15] = this.field_N[15];
            stackOut_0_0 = (float[]) (param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("bf.QE(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(jb param0, int param1, int param2) {
        try {
            if (param2 != 0) {
                jb var5 = (jb) null;
                this.a((jb) null, 23, true, (byte) 38);
            }
            this.a(param0, param1, false, (byte) 111);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "bf.NF(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
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
              if (param0 == this.field_u[this.field_F]) {
                break L1;
              } else {
                L2: {
                  this.field_u[this.field_F] = param0;
                  if (param0 == null) {
                    this.j(1);
                    break L2;
                  } else {
                    param0.a((byte) -50);
                    break L2;
                  }
                }
                this.field_Yb = this.field_Yb & -2;
                break L1;
              }
            }
            L3: {
              if (param1 == -9135) {
                break L3;
              } else {
                this.field_mb = true;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("bf.DG(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    private final boolean a(float param0, float param1, float param2, float param3, byte param4, float param5, float param6) {
        jaclib.memory.Buffer var10 = this.field_ac.a(true, (byte) -77);
        if (!(var10 != null)) {
            return false;
        }
        jaclib.memory.Stream var9 = this.a(-125, var10);
        if (!jaclib.memory.Stream.b()) {
            var9.a(param1);
            var9.a(param2);
            var9.a(param3);
            var9.a(param6);
            var9.a(param0);
            var9.a(param5);
        } else {
            var9.b(param1);
            var9.b(param2);
            var9.b(param3);
            var9.b(param6);
            var9.b(param0);
            var9.b(param5);
        }
        var9.a();
        if (param4 != 47) {
            this.field_gc = 66;
        }
        return this.field_ac.a((byte) -60);
    }

    final int[] Y() {
        return new int[]{this.field_Ub, this.field_lb, this.field_oc, this.field_M};
    }

    final go O(int param0) {
        if (param0 != 29190) {
            return (go) null;
        }
        if (this.field_kb == null) {
            return null;
        }
        return this.field_kb.a(0);
    }

    final int q(int param0) {
        if (param0 != 0) {
            return -88;
        }
        return this.field_E;
    }

    abstract tl a(boolean param0, byte param1);

    final pa a(vd param0, boolean param1) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
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
                if (-1 == (param0.field_h ^ -1)) {
                  break L2;
                } else {
                  if (-1 == (param0.field_c ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      var12 = new int[param0.field_c * param0.field_h];
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
                                  incrementValue$3 = var5;
                                  var5++;
                                  var9 = param0.field_f[255 & param0.field_d[incrementValue$3]];
                                  incrementValue$4 = var6;
                                  var6++;
                                  stackOut_14_0 = (int[]) (var4);
                                  stackOut_14_1 = incrementValue$4;
                                  stackIn_16_0 = stackOut_14_0;
                                  stackIn_16_1 = stackOut_14_1;
                                  stackIn_15_0 = stackOut_14_0;
                                  stackIn_15_1 = stackOut_14_1;
                                  if (-1 == (var9 ^ -1)) {
                                    stackOut_16_0 = (int[]) ((Object) stackIn_16_0);
                                    stackOut_16_1 = stackIn_16_1;
                                    stackOut_16_2 = 0;
                                    stackIn_17_0 = stackOut_16_0;
                                    stackIn_17_1 = stackOut_16_1;
                                    stackIn_17_2 = stackOut_16_2;
                                    break L6;
                                  } else {
                                    stackOut_15_0 = (int[]) ((Object) stackIn_15_0);
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
                                incrementValue$5 = var6;
                                var6++;
                                var4[incrementValue$5] = vo.a(param0.field_e[var5] << -415068424, param0.field_f[pg.a((int) param0.field_d[var5], 255)]);
                                var5++;
                                var8++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    var3_ref = this.a(110, param0.field_c, var12, 0, param0.field_h, param0.field_h);
                    break L1;
                  }
                }
              }
              var3_ref = this.a(105, 1, new int[]{0}, 0, 1, 1);
              break L1;
            }
            var3_ref.a(param0.field_a, param0.field_i, param0.field_g, param0.field_b);
            stackOut_21_0 = (pa) (var3_ref);
            stackIn_22_0 = stackOut_21_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("bf.HA(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        return stackIn_22_0;
    }

    final int n(byte param0) {
        if (param0 >= -81) {
            return 6;
        }
        return this.field_O;
    }

    final ec f(boolean param0) {
        boolean discarded$0 = false;
        if (param0) {
            discarded$0 = this.b();
        }
        return this.field_A;
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
            stackOut_0_0 = new rp((bf) (this), param3, param4, param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("bf.O(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (pa) ((Object) stackIn_1_0);
    }

    abstract qi a(int param0, boolean param1, boolean param2, int param3, int param4, int[] param5, int param6);

    abstract void l(int param0);

    abstract void Q(int param0);

    final void f(int param0, int param1) {
        L0: {
          L1: {
            if (this.field_Mb != param0) {
              break L1;
            } else {
              if (param1 != this.field_x) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          this.field_Mb = param0;
          this.field_x = param1;
          this.k(-23858);
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
              if (this.field_H[this.field_F] == param0) {
                break L1;
              } else {
                this.field_H[this.field_F] = param0;
                this.N(0);
                var4_int = 1;
                break L1;
              }
            }
            L2: {
              if (param1) {
                break L2;
              } else {
                this.field_m = -92;
                break L2;
              }
            }
            L3: {
              if (this.field_w[this.field_F] == param2) {
                break L3;
              } else {
                this.field_w[this.field_F] = param2;
                this.m((byte) -125);
                var4_int = 1;
                break L3;
              }
            }
            L4: {
              if (var4_int == 0) {
                break L4;
              } else {
                this.field_Yb = this.field_Yb & -30;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("bf.GF(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          L6: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    private final void e(byte param0) {
        this.field_n[14] = this.field_mc;
        this.field_n[10] = this.field_T;
        if (param0 <= 7) {
            this.field_f = (st[]) null;
        }
    }

    private final boolean i(int param0) {
        sk discarded$0 = null;
        if (param0 != -7865) {
            discarded$0 = this.b(61, (byte) -27);
        }
        return this.field_Ob[3].e(3);
    }

    private final void h(int param0) {
        int var2 = 0;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        L0: {
          var5 = AceOfSkies.field_G ? 1 : 0;
          this.field_s = this.a(false, (byte) 111);
          if (param0 == 26339) {
            break L0;
          } else {
            this.field_Wb = 0.4179408848285675f;
            break L0;
          }
        }
        boolean discarded$1 = this.field_s.a(28, param0 ^ -26259, 140);
        var2 = 0;
        L1: while (true) {
          L2: {
            if (-5 >= (var2 ^ -1)) {
              break L2;
            } else {
              var3 = this.field_s.a(true, (byte) -64);
              if (var3 != null) {
                L3: {
                  var4 = this.a(84, var3);
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
                if (this.field_s.a((byte) -60)) {
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
          this.field_P = this.a(new pl[]{new pl(new rl[]{rl.field_b, rl.field_j, rl.field_j})}, -128);
          return;
        }
    }

    final int XA() {
        return this.field_x;
    }

    final void S(int param0) {
        qo var2 = null;
        if (param0 != -32) {
            return;
        }
        if (!(this.field_bb == ps.field_d)) {
            var2 = this.field_bb;
            this.field_bb = ps.field_d;
            if (var2.b((byte) -92)) {
                this.e(true);
            }
            this.field_Yb = this.field_Yb & -32;
            this.field_N = this.field_W;
        }
    }

    final void d(boolean param0, int param1) {
        if (this.field_I != param0) {
            this.field_I = param0 ? true : false;
            this.b(false);
        }
        if (param1 >= -82) {
            this.a(-60, (byte) -4);
        }
    }

    private final void L(int param0) {
        float var2_float = 0.0f;
        if (!(this.field_bb != rh.field_e)) {
            var2_float = this.o((byte) 42);
            this.field_ec.b(var2_float, (byte) -127, 0.0f, var2_float);
        }
        this.field_S = false;
        int var2 = 59 % ((-19 - param0) / 51);
        this.b((byte) 103);
        if (null != this.field_nb) {
            this.field_nb.b((byte) -25);
        }
    }

    final jaclib.memory.heap.NativeHeapBuffer a(byte param0, int param1, boolean param2) {
        if (param0 != -77) {
            this.h(86);
        }
        return this.field_Qb.a(param1, param2);
    }

    abstract void b(byte param0);

    abstract go a(int param0, int param1, boolean param2, int[][] param3);

    final void b(boolean param0, int param1) {
        if (param1 != 256) {
            this.field_M = -28;
        }
        if (!(this.field_ob == param0)) {
            this.field_ob = param0 ? true : false;
            this.T(param1 + -256);
            this.field_Yb = this.field_Yb & -8;
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
            stackOut_0_0 = new ig((bf) (this), param0, param1, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("bf.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return (da) ((Object) stackIn_1_0);
    }

    abstract boolean a(la param0, int param1, hd param2);

    abstract void C(int param0);

    abstract void a(int param0, tl param1, int param2);

    final void K(int[] param0) {
        try {
            param0[1] = this.field_Nb;
            param0[3] = this.field_V;
            param0[0] = this.field_R;
            param0[2] = this.field_gc;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "bf.K(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final ec d(int param0) {
        ti discarded$0 = null;
        if (param0 != 12343) {
            discarded$0 = this.c(true, 123);
        }
        return this.field_L[this.field_F];
    }

    abstract void b(byte param0, boolean param1);

    abstract void T(int param0);

    abstract void d(boolean param0);

    final void r(byte param0) {
        if (param0 <= 102) {
            this.field_Ab = false;
        }
        if (-3 != (this.field_Yb ^ -1)) {
            this.c(true);
            this.a(false, false);
            this.b(false, 256);
            this.a((byte) -1, false);
            this.a(-32, false);
            this.a(false, false, -2, 3);
            this.field_Yb = 2;
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
            stackOut_0_0 = this.a(param2, param5, param3, false, 0, param1, 0, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("bf.ND(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ',' + param5 + ')');
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
              this.a(1, this.field_s, 0);
              this.a(this.field_P, (byte) 75);
              this.a(true, param0, param2, 0);
              if (param1 > 122) {
                break L1;
              } else {
                this.g(26);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("bf.KF(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int i(byte param0) {
        if (param0 >= -1) {
            return -116;
        }
        return this.field_qb + this.field_jc + this.field_j;
    }

    abstract void a(fa param0, byte param1);

    void c() {
        wf var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (!this.field_qc) {
            var1 = this.field_nc.d(268435455);
            while (var1 != null) {
                ((gi) ((Object) var1)).d(127);
                var1 = this.field_nc.b((byte) 103);
            }
            var1_ref = this.field_gb.keys();
            while (var1_ref.hasMoreElements()) {
                var2 = (java.awt.Canvas) (var1_ref.nextElement());
                this.a(0, var2, this.field_gb.get(var2));
            }
            da.a(63, true, false);
            this.field_i.release();
            this.field_qc = true;
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
              this.a(false, param1, true, param2, false);
              if (param0 > 117) {
                break L1;
              } else {
                this.field_Vb = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("bf.EE(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void g(int param0);

    final void o(int param0) {
        java.awt.Canvas var3 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        Enumeration var2 = this.field_gb.keys();
        while (var2.hasMoreElements()) {
            var3 = (java.awt.Canvas) (var2.nextElement());
            this.a(0, var3, this.field_gb.get(var3));
        }
        this.field_s.a(4665);
        this.field_ac.a(4665);
        this.field_K.a(4665);
        this.field_cb.b(0);
        this.field_vb.b(0);
        this.field_k.b(param0 + 0);
        this.field_sb.b(0);
        this.field_pb.b(param0);
        this.field_wb.a(126);
        this.field_C.a(4665);
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_lb = param1;
        this.field_oc = param2;
        this.field_Ub = param0;
        this.field_M = param3;
        this.E(-68);
        this.k(-23858);
        this.S(-32);
        this.K(-7);
    }

    private final void R(int param0) {
        if (param0 != -26661) {
            this.field_k = (po) null;
        }
        if (this.field_nb != null) {
            this.field_nb.a(10);
        }
        this.h((byte) -121);
    }

    private final void z(int param0) {
        if (param0 != 27304) {
            this.field_fb = 1.323685884475708f;
        }
    }

    final void c(boolean param0) {
        qo var2 = null;
        if (!param0) {
            this.c();
        }
        if (rh.field_e != this.field_bb) {
            var2 = this.field_bb;
            this.field_bb = rh.field_e;
            if (!(!var2.b((byte) -92))) {
                this.e(true);
            }
            this.g((byte) -122);
            this.field_N = this.field_yb;
            this.g(false);
            this.field_Yb = this.field_Yb & -25;
        }
    }

    abstract void h(byte param0);

    private final void g(boolean param0) {
        this.C(-79);
        if (null != this.field_nb) {
            this.field_nb.c(404277666);
        }
        if (param0) {
            this.field_ec = (ec) null;
        }
    }

    final void U(int param0) {
        this.field_gc = this.field_Z;
        this.field_V = this.field_jb;
        this.field_R = param0;
        this.field_Nb = 0;
        if (!(!this.field_Cb)) {
            this.field_Cb = false;
            this.r(0);
        }
        this.K(-7);
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
            this.field_l.a(param1);
            var3_int = 107 / ((param0 - -48) / 50);
            stackOut_0_0 = this.field_l;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("bf.RF(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
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
          this.a((byte) -74, param4);
          this.a((byte) 124, 0, bs.field_a);
          this.a(bs.field_a, 0, 0);
          this.e(true, param5);
          this.a((byte) 120);
          this.b((byte) -117, false);
          this.D(0);
          this.b((byte) -119, true);
          this.a(dl.field_p, 0, 0);
          this.a((byte) 123, 0, dl.field_p);
          return;
        } else {
          return;
        }
    }

    abstract void u(byte param0);

    final void a(za param0) {
        try {
            this.field_Qb = ((gi) ((Object) param0)).field_h;
            this.field_Q = this.field_Qb.a(32768, false);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "bf.NA(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void D(int param0) {
        this.a(1, this.field_ac, 0);
        this.a(this.field_xb, (byte) 75);
        this.a(true, wt.field_m, 1, param0);
    }

    final void f(int param0) {
        if (param0 != -21041) {
            this.a((byte) 82);
        }
        if (mq.field_g != this.field_f[this.field_F]) {
            this.field_f[this.field_F] = mq.field_g;
            this.field_L[this.field_F].a((byte) -59);
            this.B(15);
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
          if (param0 >= 25) {
            break L0;
          } else {
            this.KA(-57, 60, -65, 127);
            break L0;
          }
        }
        L1: {
          if (!this.field_hb) {
            L2: {
              L3: {
                var9 = this.field_U;
                var2 = var9;
                var3 = (float)this.field_Mb;
                var4 = (float)this.field_x;
                var5 = (float)(-this.field_lb) * this.field_db / (float)this.field_M;
                var6 = (float)(-this.field_Ub) * this.field_db / (float)this.field_oc;
                var7 = (float)(this.field_Z + -this.field_Ub) * this.field_db / (float)this.field_oc;
                var8 = (float)(-this.field_lb + this.field_jb) * this.field_db / (float)this.field_M;
                if (var7 == var6) {
                  break L3;
                } else {
                  if (var8 == var5) {
                    break L3;
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
                    break L2;
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
              break L2;
            }
            this.z(27304);
            this.field_hb = true;
            break L1;
          } else {
            break L1;
          }
        }
    }

    void b(int param0) {
        if (!(this.field_z == null)) {
            this.field_z.a((byte) 126);
        }
        this.field_r = param0 & 2147483647;
    }

    private final void F(int param0) {
        if (!(this.field_Yb == 1)) {
            this.c(true);
            this.a(false, false);
            this.b(false, 256);
            this.a((byte) -1, false);
            this.a(-32, false);
            this.a(false, false, -2, 3);
            this.b(1, false);
            this.a(this.field_Kb, -9135);
            this.field_Yb = 1;
        }
        if (param0 <= 40) {
            this.f(23);
        }
    }

    abstract void p(byte param0);

    abstract void I(int param0);

    final void KA(int param0, int param1, int param2, int param3) {
        if (param0 <= 0) {
            if (param2 >= -1 + this.field_Z) {
                if (0 >= param1) {
                    if (this.field_jb - 1 <= param3) {
                        this.U(0);
                        return;
                    }
                }
            }
        }
        this.field_Nb = param1 < 0 ? 0 : param1;
        this.field_R = (param0 ^ -1) <= -1 ? param0 : 0;
        this.field_V = this.field_Z >= param3 ? param3 : 0;
        this.field_gc = param2 <= this.field_Z ? param2 : 0;
        if (!(this.field_Cb)) {
            this.field_Cb = true;
            this.r(0);
        }
        this.I(97);
        this.K(-7);
    }

    void G(int param0) {
        this.n(0);
        int var2 = 23 % ((param0 - -65) / 51);
    }

    abstract qi a(la param0, int param1, int param2, int param3, hd param4);

    final void a(st param0, byte param1) {
        try {
            this.field_f[this.field_F] = param0;
            this.B(15);
            int var3_int = 19 / ((-7 - param1) / 55);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "bf.LD(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract void a(boolean param0, int param1, boolean param2, jb param3, boolean param4);

    abstract void t(byte param0);

    abstract float o(byte param0);

    private final void E(int param0) {
        if (param0 != -68) {
            this.field_hb = false;
        }
        this.field_hb = false;
        this.d((byte) 82);
        if (this.field_bb == nj.field_f) {
            this.g(false);
        }
    }

    abstract qi a(float[] param0, int param1, hd param2, boolean param3, int param4, int param5, int param6, boolean param7);

    abstract void w(byte param0);

    private final void B(int param0) {
        this.p(-118);
        if (!(null == this.field_nb)) {
            this.field_nb.d(18580);
        }
        if (param0 != 15) {
            this.z(1);
        }
    }

    static {
    }
}
