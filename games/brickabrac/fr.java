/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fr {
    byte[] field_p;
    short[] field_n;
    int[] field_s;
    int field_d;
    byte field_A;
    int field_y;
    short field_C;
    int[] field_I;
    short[] field_L;
    short[] field_P;
    int[] field_i;
    short[] field_H;
    short[] field_m;
    short[] field_z;
    int[] field_O;
    short[] field_K;
    short[] field_v;
    int[] field_u;
    short field_o;
    short[] field_J;
    short[] field_Q;
    int field_x;
    int field_f;
    int[] field_D;
    int[] field_F;
    int field_q;
    int field_N;
    short[] field_h;
    int[] field_g;
    int[] field_E;
    short[] field_c;
    short[] field_j;
    short[] field_b;
    short field_w;
    private boolean field_r;
    static vl field_M;
    short[] field_a;
    short[] field_G;
    static int field_k;
    short[] field_B;
    static int[] field_l;
    static oe[] field_e;
    short[] field_t;

    final static boolean a(byte param0) {
        if (param0 <= 33) {
            fr.d(-80);
        }
        return cg.field_l;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        for (var5 = param1; this.field_w > var5; var5++) {
            this.field_B[var5] = (short)(this.field_B[var5] + param2);
            this.field_Q[var5] = (short)(this.field_Q[var5] + param3);
            this.field_P[var5] = (short)(this.field_P[var5] + param0);
        }
        this.b(-107);
    }

    final static void a(mf param0, byte param1) {
        RuntimeException var2 = null;
        mh var3 = null;
        mh var5 = null;
        mh var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              ok.field_g = pl.a("basic", "display_name_changed", (byte) 109, param0);
              gf.field_f = new hj(0L, rq.field_b, hk.field_J, oo.field_y);
              f.field_c = new hj(0L, rq.field_b, ab.field_z, ng.field_e);
              rg.field_c = new mh(0L, (mh) null);
              sj.field_d = new mh(0L, ad.field_l);
              sj.field_d.field_S = 1;
              gk.field_c = new mh(0L, rp.field_t, n.field_a);
              qj.field_u = new mh(0L, ik.field_a, bc.field_c);
              mo.field_R = new mh(0L, tk.field_t);
              rg.field_c.a(sj.field_d, 0);
              rg.field_c.a(gk.field_c, 0);
              rg.field_c.a(qj.field_u, 0);
              rg.field_c.a(gf.field_f, 0);
              rg.field_c.a(mo.field_R, 0);
              gf.field_f.field_Qb.field_Qb.a((byte) -102, ad.field_l);
              var5 = gf.field_f.field_Qb.field_Qb;
              var6 = var5;
              gf.field_f.field_Qb.field_Qb.field_Q = 1;
              if (param1 > 58) {
                break L1;
              } else {
                field_k = 109;
                break L1;
              }
            }
            var6.field_S = 1;
            f.field_c.field_Qb.field_Qb.a((byte) -115, ad.field_l);
            var3 = f.field_c.field_Qb.field_Qb;
            f.field_c.field_Qb.field_Qb.field_Q = 1;
            var3.field_S = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("fr.I(");
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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, dh param1, dh param2, boolean param3) {
        try {
            m.field_b = param0;
            kp.field_b = param1;
            ni.field_Wb = param2;
            pp.a(lb.field_c / 2, lb.field_d / 2, (byte) 19);
            if (!param3) {
                field_k = -98;
            }
            tn.a(param1.field_B, param1.field_P + param1.field_B, 256, param2.field_B, param2.field_P + param2.field_B);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "fr.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (param1 <= 124) {
            return;
        }
        for (var6 = 0; var6 < this.field_w; var6++) {
            this.field_B[var6] = (short)(param0 * this.field_B[var6] / param2);
            this.field_Q[var6] = (short)(param4 * this.field_Q[var6] / param2);
            this.field_P[var6] = (short)(param3 * this.field_P[var6] / param2);
        }
        this.b(-122);
    }

    public static void b(byte param0) {
        field_M = null;
        if (param0 != -52) {
            field_l = (int[]) null;
        }
        field_e = null;
        field_l = null;
    }

    private final void b(int param0) {
        this.field_r = false;
        if (param0 >= -84) {
            this.b(-62);
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (!pe.field_o.c(124)) {
          L0: {
            if (param0 == 1) {
              break L0;
            } else {
              field_M = (vl) null;
              break L0;
            }
          }
          L1: {
            if (pe.field_o.field_n) {
              if ((pe.field_o.field_w.field_j & 1 << pe.field_o.field_k) != 0) {
                ag.field_D[12] = mi.field_a;
                break L1;
              } else {
                if (pe.field_o.field_w.field_j != 0) {
                  ag.field_D[12] = qm.field_c;
                  break L1;
                } else {
                  if ((1 << pe.field_o.field_k | pe.field_o.field_v) != (1 << pe.field_o.field_w.field_k) + -1) {
                    ag.field_D[12] = s.field_a;
                    break L1;
                  } else {
                    ag.field_D[12] = oa.field_Pb;
                    break L1;
                  }
                }
              }
            } else {
              if ((1 << pe.field_o.field_k & pe.field_o.field_w.field_j) != 0) {
                ag.field_D[12] = ff.field_g;
                break L1;
              } else {
                if (0 == pe.field_o.field_w.field_j) {
                  if ((pe.field_o.field_v | 1 << pe.field_o.field_k) != -1 + (1 << pe.field_o.field_w.field_k)) {
                    ag.field_D[12] = bn.field_t;
                    break L1;
                  } else {
                    ag.field_D[12] = bm.field_b;
                    break L1;
                  }
                } else {
                  ag.field_D[12] = pq.field_m;
                  break L1;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        if (!this.field_r) {
          this.field_r = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          if (param0 == 23) {
            var6 = -32768;
            var7 = -32768;
            var8 = 0;
            L0: while (true) {
              if (this.field_w <= var8) {
                this.field_x = var7;
                this.field_f = var2;
                this.field_y = var3;
                this.field_q = var4;
                this.field_d = var6;
                this.field_N = var5;
                return;
              } else {
                L1: {
                  var9 = this.field_B[var8];
                  var10 = this.field_Q[var8];
                  var11 = this.field_P[var8];
                  if (var10 < var3) {
                    var3 = var10;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var10 > var6) {
                    var6 = var10;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var9 >= var2) {
                    break L3;
                  } else {
                    var2 = var9;
                    break L3;
                  }
                }
                L4: {
                  if (var9 <= var5) {
                    break L4;
                  } else {
                    var5 = var9;
                    break L4;
                  }
                }
                L5: {
                  if (var7 < var11) {
                    var7 = var11;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (var11 < var4) {
                  var4 = var11;
                  var8++;
                  continue L0;
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, String param1, String param2) {
        try {
            if (null != ej.field_I) {
                ej.field_I.m(17);
            }
            eo.field_k = new hk(param2, param1, false, true, param0);
            rj.field_c.b((byte) 114, eo.field_k);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "fr.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        o.field_c = new dk();
        if (param0 != -1) {
            return;
        }
        rj.field_c.b((byte) 120, o.field_c);
    }

    fr() {
        this.field_A = (byte) 0;
        this.field_r = false;
    }

    static {
        field_M = new vl();
        field_e = new oe[8];
        field_l = new int[]{44, 45, 8, 23};
    }
}
