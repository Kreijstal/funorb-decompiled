/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends ib implements hf, en {
    static String field_L;
    static jp field_Q;
    private String field_N;
    static boolean field_R;
    private d field_M;
    private d field_O;
    private boolean field_V;
    private boolean field_K;
    private d field_U;
    static jp field_I;
    private vb field_P;
    static int field_W;
    static String field_J;
    private boolean field_S;
    private vb field_T;

    final static void a(byte param0) {
        if (ld.field_t != -rn.field_i + 0) {
            if (-rn.field_i + 250 != ld.field_t) {
            }
        }
        ld.field_t = ld.field_t + 1;
        int var1 = -127 / ((29 - param0) / 32);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (((hk) this).field_N != null) {
            int discarded$0 = a.field_u.a(((hk) this).field_N, ((hk) this).field_o + (param1 - -20), param0 - (-((hk) this).field_w + -15), -40 + ((hk) this).field_t, ((hk) this).field_s, 16777215, -1, 1, 0, a.field_u.field_F);
        }
        if (!(null == ((hk) this).field_O)) {
            lb.c(param1 - -10, param0 - -134, ((hk) this).field_t + -20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (98 == param0) {
            return ((hk) this).b(param2, (byte) -78);
          } else {
            if (param0 != 99) {
              return false;
            } else {
              return ((hk) this).a(param2, (byte) -122);
            }
          }
        }
    }

    final static void a(dh param0, byte param1, mf param2) {
        int var3 = 0;
        kn var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int[] var14 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        var3 = cd.field_e;
        wd.field_w = new mh(0L, (mh) null);
        if (param2 != null) {
          param2.field_l = 0;
          param2.field_b = false;
          pj.field_c = new so(var3, param2, param2);
          nh.field_c = new rg(var3, param2, param2, (bp) (Object) new rm());
          var4 = gj.b(0);
          if (var4 == null) {
            rk.a("QC2", (Throwable) null, param1 + -14);
            return;
          } else {
            hb.a(var4, false);
            var10 = null;
            ko.field_j = ug.a(1513239, 1127256, (byte) 123, 65793, 4020342, 5138823, 65793, 1513239, (dh) null, 0, 65793, 2245737, 8947848);
            nb.field_e = ug.a(0, 0, (byte) 122, 0, 0, 0, 0, 0, param0, 16764006, 0, 0, 0);
            cp.field_K = ug.a(0, 0, (byte) 113, 0, 0, 0, 0, 0, param0, 16777215, 0, 0, 0);
            var5 = lb.field_c;
            var6 = lb.field_d;
            var14 = lb.field_l;
            uf.field_e = new jp(10, 14);
            uf.field_e.g();
            var8 = 2;
            L0: while (true) {
              if (7 <= var8) {
                L1: {
                  if (param1 == 90) {
                    break L1;
                  } else {
                    hk.i((byte) 86);
                    break L1;
                  }
                }
                lb.a(var14, var5, var6);
                fe.field_kb = e.a(nb.field_e, ko.field_j, var4, 4, cp.field_K);
                wd.field_w.field_bb = new vl();
                return;
              } else {
                lb.g(var8, var8 - -1, 14 - (var8 << -2024081311), 16777215);
                var8++;
                continue L0;
              }
            }
          }
        } else {
          rk.a("QC1", (Throwable) null, param1 ^ 118);
          return;
        }
    }

    public final void a(vb param0, int param1) {
        if (((hk) this).field_P == param0) {
            boolean discarded$0 = ((hk) this).field_T.a(true, (oc) this);
        }
        if (param0 == ((hk) this).field_T) {
            this.a(25);
        }
        if (param1 != -40) {
            ((hk) this).a(-38, -29, -91, (byte) 20);
        }
    }

    final String j(byte param0) {
        Object var3 = null;
        L0: {
          if (param0 == -76) {
            break L0;
          } else {
            var3 = null;
            ((hk) this).a(113, (String) null);
            break L0;
          }
        }
        if (null == ((hk) this).field_P.field_A) {
          return "";
        } else {
          return ((hk) this).field_P.field_A;
        }
    }

    final void a(int param0, String param1) {
        vb var3 = ((hk) this).field_P;
        String var4 = param1;
        if (param0 < 53) {
            ((hk) this).h(-119);
        }
        var3.a(var4, -12592, false);
        ((hk) this).field_T.c(false);
    }

    final static void a(byte param0, mf param1) {
        pg.field_k = new km[22];
        wg.a(-74, (km) (Object) new rp());
        wg.a(-68, (km) (Object) cf.a(1, -2635));
        wg.a(-90, (km) (Object) cf.a(2, -2635));
        wg.a(-111, (km) (Object) cf.a(3, -2635));
        wg.a(-109, (km) (Object) cf.a(4, -2635));
        wg.a(-93, (km) (Object) new ah());
        wg.a(-114, (km) (Object) new lf());
        wg.a(-114, (km) (Object) new md());
        wg.a(-104, (km) (Object) new bl());
        wg.a(-66, (km) (Object) new cc());
        wg.a(-55, (km) (Object) new hq());
        wg.a(-75, (km) (Object) new uk());
        wg.a(-63, (km) (Object) new de(param1));
        wg.a(-60, (km) (Object) new ud(13, 0));
        wg.a(-105, (km) (Object) new fp());
        wg.a(-69, (km) (Object) new ud(15, 1));
        wg.a(-71, (km) (Object) new ol());
        wg.a(-54, (km) (Object) cf.a(17, -2635));
        wg.a(-70, (km) (Object) new vq());
        wg.a(-63, (km) (Object) new gn());
        wg.a(-91, (km) (Object) new ab());
        int var2 = -5 / ((param0 - 70) / 42);
        wg.a(-73, (km) (Object) new vp());
        si.field_k = rd.a(0, (byte) 19);
    }

    public final void a(vb param0, byte param1) {
        if (param1 >= -39) {
            ((hk) this).h(68);
        }
    }

    final static void a(int param0, byte param1) {
        kd.field_c = tf.field_f[param0];
        int var2 = -14 % ((param1 - -33) / 34);
        wn.field_a = ua.field_b[param0];
        d.field_C = he.field_L[param0];
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (param2 > -22) {
            ((hk) this).field_O = null;
        }
        if (((hk) this).field_U == param4) {
            this.a(25);
        } else {
            if (((hk) this).field_O == param4) {
                fr.d(-1);
            } else {
                if (param4 != ((hk) this).field_M) {
                } else {
                    if (((hk) this).field_K) {
                        dg.a(true);
                    } else {
                        if (!((hk) this).field_S) {
                            hb.g(29);
                        } else {
                            ln.a(-107);
                        }
                    }
                }
            }
        }
    }

    final static void h(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0;
        int stackOut_2_0;
        if (param0 < 4) {
          return;
        } else {
          L0: {
            var1 = nn.field_g.c(ag.field_D[20]);
            var2 = nn.field_g.c(ag.field_D[21]);
            if (var2 < var1) {
              stackOut_3_0 = var1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = var2;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          dg.field_d = stackIn_4_0 + 4;
          og.field_Zb = og.field_Zb + (dg.field_d - -120);
          return;
        }
    }

    hk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ub) null);
        hi var6 = null;
        dh var7 = null;
        String var8 = null;
        me var9 = null;
        ma var12 = null;
        ma var13 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_16_0 = null;
        d stackIn_16_1 = null;
        d stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        d stackIn_17_1 = null;
        d stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        d stackIn_18_1 = null;
        d stackIn_18_2 = null;
        String stackIn_18_3 = null;
        Object stackOut_0_0;
        Object stackOut_2_0;
        int stackOut_2_1;
        Object stackOut_1_0;
        int stackOut_1_1;
        Object stackOut_3_0;
        Object stackOut_5_0;
        int stackOut_5_1;
        Object stackOut_4_0;
        int stackOut_4_1;
        Object stackOut_6_0;
        Object stackOut_8_0;
        int stackOut_8_1;
        Object stackOut_7_0;
        int stackOut_7_1;
        Object stackOut_15_0;
        d stackOut_15_1;
        d stackOut_15_2;
        Object stackOut_17_0;
        d stackOut_17_1;
        d stackOut_17_2;
        String stackOut_17_3;
        Object stackOut_16_0;
        d stackOut_16_1;
        d stackOut_16_2;
        String stackOut_16_3;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((hk) this).field_S = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param3) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((hk) this).field_V = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param2) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((hk) this).field_K = stackIn_9_1 != 0;
          ((hk) this).field_N = param1;
          if (!((hk) this).field_K) {
            break L3;
          } else {
            L4: {
              if (((hk) this).field_V) {
                break L4;
              } else {
                if (!((hk) this).field_S) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalStateException();
          }
        }
        L5: {
          ((hk) this).field_P = (vb) (Object) new sf(param0, (uh) this, 100);
          ((hk) this).field_T = (vb) (Object) new sf("", (uh) this, 20);
          if (!((hk) this).field_K) {
            L6: {
              ((hk) this).field_U = new d(ok.field_a, (uh) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (!((hk) this).field_S) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = dp.field_s;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = nd.field_d;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new d((String) (Object) stackIn_18_3, (uh) null);
            ((hk) this).field_M = (d) (Object) stackIn_18_1;
            if (!((hk) this).field_V) {
              break L5;
            } else {
              ((hk) this).field_O = new d(bd.field_a, (uh) this);
              break L5;
            }
          } else {
            ((hk) this).field_U = new d(oa.field_Tb, (uh) null);
            ((hk) this).field_M = new d(wc.field_a, (uh) null);
            ((hk) this).field_P.field_J = false;
            break L5;
          }
        }
        L7: {
          ((hk) this).field_P.field_l = (ub) (Object) new r(10000536);
          ((hk) this).field_T.field_l = (ub) (Object) new ob(10000536);
          var6 = new hi();
          ((hk) this).field_U.field_l = (ub) (Object) var6;
          if (null == ((hk) this).field_M) {
            break L7;
          } else {
            ((hk) this).field_M.field_l = (ub) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (((hk) this).field_O == null) {
            break L8;
          } else {
            ((hk) this).field_O.field_l = (ub) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((hk) this).field_P.field_z = sf.field_X;
          if (((hk) this).field_O == null) {
            break L9;
          } else {
            ((hk) this).field_O.field_z = ie.field_q;
            break L9;
          }
        }
        L10: {
          if (((hk) this).field_K) {
            ((hk) this).field_M.field_z = pn.field_o;
            break L10;
          } else {
            if (((hk) this).field_S) {
              ((hk) this).field_M.field_z = wp.field_i;
              ((hk) this).field_M.field_l = (ub) (Object) new bb();
              break L10;
            } else {
              ((hk) this).field_M.field_l = (ub) (Object) new bb();
              break L10;
            }
          }
        }
        L11: {
          ((hk) this).field_w = 15;
          var7 = a.field_u;
          if (((hk) this).field_N == null) {
            break L11;
          } else {
            ((hk) this).field_w = ((hk) this).field_w + (5 + var7.b(((hk) this).field_N, -40 + ((hk) this).field_t, var7.field_F));
            break L11;
          }
        }
        L12: {
          var8 = p.field_p;
          var9 = qi.a(uc.e((byte) -115), -28432);
          if (uc.field_k == var9) {
            var8 = sq.field_a;
            break L12;
          } else {
            if (ll.field_d != var9) {
              break L12;
            } else {
              var8 = fc.field_c;
              break L12;
            }
          }
        }
        L13: {
          var12 = new ma(10, ((hk) this).field_w, ((hk) this).field_t + -20, 25, (oc) (Object) ((hk) this).field_P, false, 80, 3, var7, 16777215, var8);
          ((hk) this).a((oc) (Object) new ma(10, ((hk) this).field_w, ((hk) this).field_t + -20, 25, (oc) (Object) ((hk) this).field_P, false, 80, 3, var7, 16777215, var8), true);
          ((hk) this).field_w = ((hk) this).field_w + (5 + ((oc) (Object) var12).field_s);
          var13 = new ma(10, ((hk) this).field_w, ((hk) this).field_t + -20, 25, (oc) (Object) ((hk) this).field_T, false, 80, 3, var7, 16777215, wc.field_c);
          ((hk) this).a((oc) (Object) new ma(10, ((hk) this).field_w, ((hk) this).field_t + -20, 25, (oc) (Object) ((hk) this).field_T, false, 80, 3, var7, 16777215, wc.field_c), true);
          ((hk) this).field_U.field_i = (uh) this;
          ((hk) this).field_w = ((hk) this).field_w + (5 + ((oc) (Object) var13).field_s);
          if (null == ((hk) this).field_O) {
            break L13;
          } else {
            ((hk) this).field_O.field_i = (uh) this;
            break L13;
          }
        }
        L14: {
          if (((hk) this).field_M == null) {
            break L14;
          } else {
            ((hk) this).field_M.field_i = (uh) this;
            break L14;
          }
        }
        L15: {
          if (null == ((hk) this).field_O) {
            ((hk) this).field_U.a(30, 8, ((hk) this).field_w, (byte) -119, ((hk) this).field_t + -16);
            ((hk) this).field_w = ((hk) this).field_w + 35;
            break L15;
          } else {
            ((hk) this).field_U.a(30, 85, ((hk) this).field_w, (byte) -119, -95 + ((hk) this).field_t);
            ((hk) this).field_w = ((hk) this).field_w + 60;
            break L15;
          }
        }
        L16: {
          if (null == ((hk) this).field_O) {
            break L16;
          } else {
            ((hk) this).field_O.a(30, 8, ((hk) this).field_w, (byte) -119, -6 + ((hk) this).field_t + -10);
            ((hk) this).field_w = ((hk) this).field_w + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((hk) this).field_M) {
            break L17;
          } else {
            L18: {
              if (((hk) this).field_K) {
                break L18;
              } else {
                if (((hk) this).field_S) {
                  break L18;
                } else {
                  ((hk) this).field_M.a(20, 8, ((hk) this).field_w, (byte) -119, 40);
                  ((hk) this).field_w = ((hk) this).field_w + 25;
                  break L17;
                }
              }
            }
            ((hk) this).field_M.a(30, 8, ((hk) this).field_w, (byte) -119, -10 + (((hk) this).field_t + -6));
            ((hk) this).field_w = ((hk) this).field_w + 35;
            break L17;
          }
        }
        L19: {
          ((hk) this).a(((hk) this).field_w - -3, 0, 0, (byte) -119, ((hk) this).field_t);
          ((hk) this).a((oc) (Object) ((hk) this).field_U, true);
          if (null == ((hk) this).field_O) {
            break L19;
          } else {
            ((hk) this).a((oc) (Object) ((hk) this).field_O, true);
            break L19;
          }
        }
        L20: {
          if (((hk) this).field_M == null) {
            break L20;
          } else {
            ((hk) this).a((oc) (Object) ((hk) this).field_M, true);
            break L20;
          }
        }
    }

    public static void i(byte param0) {
        field_J = null;
        if (param0 != 88) {
            return;
        }
        field_I = null;
        field_Q = null;
        field_L = null;
    }

    private final void a(int param0) {
        if (!fr.a((byte) 114)) {
            // if_icmpge L61
            // if_icmplt L41
        } else {
            ah.a(((hk) this).field_P.field_A, 11455, ((hk) this).field_T.field_A);
        }
        if (param0 != 25) {
            ((hk) this).field_O = null;
        }
    }

    final void h(int param0) {
        if (param0 >= -101) {
            Object var3 = null;
            ((hk) this).a(64, -27, (byte) 58, 71, (d) null);
        }
        ((hk) this).field_P.c(false);
        ((hk) this).field_T.c(false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Options";
        field_J = "Add friend";
        field_W = 0;
    }
}
