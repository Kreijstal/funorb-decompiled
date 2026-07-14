/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends ii implements jo, vg {
    static String[] field_N;
    private boolean field_X;
    private boolean field_P;
    private ck field_K;
    static String field_T;
    private boolean field_M;
    static String field_W;
    private rm field_O;
    static long field_Q;
    static String field_L;
    private ck field_U;
    private String field_S;
    private ck field_V;
    private rm field_R;

    final void i(int param0) {
        ((dn) this).field_O.p(72);
        ((dn) this).field_R.p(50);
        if (param0 != 22377) {
            dn.b(true);
        }
    }

    final void a(int param0, String param1) {
        rm var3 = null;
        String var4 = null;
        if (param0 != -12349) {
          return;
        } else {
          var3 = ((dn) this).field_O;
          var4 = param1;
          var3.a(var4, false, (byte) 64);
          ((dn) this).field_R.p(param0 + 12457);
          return;
        }
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        if (param1 != 98) {
          return;
        } else {
          L0: {
            if (((dn) this).field_U != param0) {
              if (((dn) this).field_V != param0) {
                if (((dn) this).field_K == param0) {
                  if (((dn) this).field_X) {
                    wk.a(-1);
                    break L0;
                  } else {
                    if (!((dn) this).field_M) {
                      ue.a(param1 + -178);
                      break L0;
                    } else {
                      li.c(param1 + 218);
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                nh.c(true);
                break L0;
              }
            } else {
              this.j(-24327);
              break L0;
            }
          }
          return;
        }
    }

    final String a(int param0) {
        if (param0 != -16) {
            return null;
        }
        if (!(((dn) this).field_O.field_w != null)) {
            return "";
        }
        return ((dn) this).field_O.field_w;
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        L0: {
          if (param3 >= 55) {
            break L0;
          } else {
            String discarded$2 = ((dn) this).a(-70);
            break L0;
          }
        }
        if (super.a(param0, param1, param2, (byte) 61)) {
          return true;
        } else {
          if (param2 == 98) {
            return ((dn) this).a(param0, (byte) 71);
          } else {
            if (-100 == (param2 ^ -1)) {
              return ((dn) this).a((byte) -5, param0);
            } else {
              return false;
            }
          }
        }
    }

    public final void a(rm param0, byte param1) {
        if (!(param0 != ((dn) this).field_O)) {
            boolean discarded$0 = ((dn) this).field_R.a(34, (lm) this);
        }
        if (((dn) this).field_R == param0) {
            this.j(-24327);
        }
        if (param1 >= -117) {
            ((dn) this).field_O = null;
        }
    }

    final static void b(boolean param0) {
        if (!tl.field_l) {
            throw new IllegalStateException();
        }
        oj.field_b = true;
        t.a(param0, 0);
        kh.field_n = 0;
    }

    final static byte[] a(Object param0, boolean param1, byte param2) {
        byte[] var3 = null;
        Object var4 = null;
        un var5 = null;
        L0: {
          if (param2 == 48) {
            break L0;
          } else {
            var4 = null;
            byte[] discarded$2 = dn.a((Object) null, true, (byte) 79);
            break L0;
          }
        }
        if (param0 != null) {
          if (!(param0 instanceof byte[])) {
            if (param0 instanceof un) {
              var5 = (un) param0;
              return var5.b((byte) 60);
            } else {
              throw new IllegalArgumentException();
            }
          } else {
            var3 = (byte[]) param0;
            if (param1) {
              return gg.a((byte) -92, var3);
            } else {
              return var3;
            }
          }
        } else {
          return null;
        }
    }

    private final void j(int param0) {
        if (param0 != -24327) {
          return;
        } else {
          L0: {
            L1: {
              if (n.a((byte) 118)) {
                break L1;
              } else {
                if ((((dn) this).field_O.field_w.length() ^ -1) >= -1) {
                  break L0;
                } else {
                  if (((dn) this).field_R.field_w.length() > 0) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
            ck.a(((dn) this).field_R.field_w, 11, ((dn) this).field_O.field_w);
            break L0;
          }
          return;
        }
    }

    public static void f(byte param0) {
        field_L = null;
        int var1 = -53 % ((param0 - -56) / 38);
        field_W = null;
        field_N = null;
        field_T = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(((dn) this).field_S == null)) {
            int discarded$0 = lp.field_C.a(((dn) this).field_S, 20 + ((dn) this).field_q + param1, param3 + ((dn) this).field_v + 15, -40 + ((dn) this).field_x, ((dn) this).field_s, 16777215, -1, 1, 0, lp.field_C.field_H);
        }
        if (!(null == ((dn) this).field_V)) {
            gf.b(10 + param1, param3 - -134, ((dn) this).field_x - 20, 4210752);
        }
        super.a(param0, param1, param2 ^ param2, param3);
    }

    dn(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ca) null);
        na var6 = null;
        se var7 = null;
        String var8 = null;
        ba var9 = null;
        dg var12 = null;
        dg var13 = null;
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
        ck stackIn_16_1 = null;
        ck stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        ck stackIn_17_1 = null;
        ck stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        ck stackIn_18_1 = null;
        ck stackIn_18_2 = null;
        String stackIn_18_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_15_0 = null;
        ck stackOut_15_1 = null;
        ck stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        ck stackOut_17_1 = null;
        ck stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        ck stackOut_16_1 = null;
        ck stackOut_16_2 = null;
        String stackOut_16_3 = null;
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
          ((dn) this).field_M = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param2) {
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
          ((dn) this).field_X = stackIn_6_1 != 0;
          ((dn) this).field_S = param1;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param3) {
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
          ((dn) this).field_P = stackIn_9_1 != 0;
          if (!((dn) this).field_X) {
            break L3;
          } else {
            L4: {
              if (((dn) this).field_P) {
                break L4;
              } else {
                if (!((dn) this).field_M) {
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
          ((dn) this).field_O = (rm) (Object) new uh(param0, (pg) this, 100);
          ((dn) this).field_R = (rm) (Object) new uh("", (pg) this, 20);
          if (!((dn) this).field_X) {
            L6: {
              ((dn) this).field_U = new ck(uo.field_e, (pg) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (!((dn) this).field_M) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = gk.field_O;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = kd.field_b;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new ck(stackIn_18_3, (pg) null);
            ((dn) this).field_K = stackIn_18_1;
            if (!((dn) this).field_P) {
              break L5;
            } else {
              ((dn) this).field_V = new ck(qp.field_c, (pg) this);
              break L5;
            }
          } else {
            ((dn) this).field_U = new ck(kn.field_a, (pg) null);
            ((dn) this).field_K = new ck(db.field_u, (pg) null);
            ((dn) this).field_O.field_B = false;
            break L5;
          }
        }
        L7: {
          ((dn) this).field_O.field_o = (ca) (Object) new mc(10000536);
          ((dn) this).field_R.field_o = (ca) (Object) new ic(10000536);
          var6 = new na();
          ((dn) this).field_U.field_o = (ca) (Object) var6;
          if (null == ((dn) this).field_K) {
            break L7;
          } else {
            ((dn) this).field_K.field_o = (ca) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (null == ((dn) this).field_V) {
            break L8;
          } else {
            ((dn) this).field_V.field_o = (ca) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((dn) this).field_O.field_i = rj.field_y;
          if (((dn) this).field_V == null) {
            break L9;
          } else {
            ((dn) this).field_V.field_i = hj.field_U;
            break L9;
          }
        }
        L10: {
          if (!((dn) this).field_X) {
            if (((dn) this).field_M) {
              ((dn) this).field_K.field_i = oh.field_n;
              ((dn) this).field_K.field_o = (ca) (Object) new oa();
              break L10;
            } else {
              ((dn) this).field_K.field_o = (ca) (Object) new oa();
              break L10;
            }
          } else {
            ((dn) this).field_K.field_i = gd.field_D;
            break L10;
          }
        }
        L11: {
          ((dn) this).field_v = 15;
          var7 = lp.field_C;
          if (((dn) this).field_S == null) {
            break L11;
          } else {
            ((dn) this).field_v = ((dn) this).field_v + (5 + var7.a(((dn) this).field_S, -40 + ((dn) this).field_x, var7.field_H));
            break L11;
          }
        }
        L12: {
          var8 = cp.field_T;
          var9 = gb.a(m.c(true), -119);
          if (ba.field_e == var9) {
            var8 = me.field_e;
            break L12;
          } else {
            if (var9 != gg.field_c) {
              break L12;
            } else {
              var8 = hf.field_ub;
              break L12;
            }
          }
        }
        L13: {
          var12 = new dg(10, ((dn) this).field_v, -20 + ((dn) this).field_x, 25, (lm) (Object) ((dn) this).field_O, false, 80, 3, var7, 16777215, var8);
          ((dn) this).b((byte) -54, (lm) (Object) new dg(10, ((dn) this).field_v, -20 + ((dn) this).field_x, 25, (lm) (Object) ((dn) this).field_O, false, 80, 3, var7, 16777215, var8));
          ((dn) this).field_v = ((dn) this).field_v + (((lm) (Object) var12).field_s - -5);
          var13 = new dg(10, ((dn) this).field_v, -20 + ((dn) this).field_x, 25, (lm) (Object) ((dn) this).field_R, false, 80, 3, var7, 16777215, fk.field_r);
          ((dn) this).b((byte) -54, (lm) (Object) new dg(10, ((dn) this).field_v, -20 + ((dn) this).field_x, 25, (lm) (Object) ((dn) this).field_R, false, 80, 3, var7, 16777215, fk.field_r));
          ((dn) this).field_U.field_n = (pg) this;
          ((dn) this).field_v = ((dn) this).field_v + (((lm) (Object) var13).field_s + 5);
          if (null == ((dn) this).field_V) {
            break L13;
          } else {
            ((dn) this).field_V.field_n = (pg) this;
            break L13;
          }
        }
        L14: {
          if (((dn) this).field_K == null) {
            break L14;
          } else {
            ((dn) this).field_K.field_n = (pg) this;
            break L14;
          }
        }
        L15: {
          if (((dn) this).field_V != null) {
            ((dn) this).field_U.b(0, -95 + ((dn) this).field_x, ((dn) this).field_v, 85, 30);
            ((dn) this).field_v = ((dn) this).field_v + 60;
            break L15;
          } else {
            ((dn) this).field_U.b(0, ((dn) this).field_x + -16, ((dn) this).field_v, 8, 30);
            ((dn) this).field_v = ((dn) this).field_v + 35;
            break L15;
          }
        }
        L16: {
          if (null == ((dn) this).field_V) {
            break L16;
          } else {
            ((dn) this).field_V.b(0, ((dn) this).field_x - 6 + -10, ((dn) this).field_v, 8, 30);
            ((dn) this).field_v = ((dn) this).field_v + 35;
            break L16;
          }
        }
        L17: {
          if (((dn) this).field_K == null) {
            break L17;
          } else {
            L18: {
              if (((dn) this).field_X) {
                break L18;
              } else {
                if (!((dn) this).field_M) {
                  ((dn) this).field_K.b(0, 40, ((dn) this).field_v, 8, 20);
                  ((dn) this).field_v = ((dn) this).field_v + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((dn) this).field_K.b(0, ((dn) this).field_x + -6 + -10, ((dn) this).field_v, 8, 30);
            ((dn) this).field_v = ((dn) this).field_v + 35;
            break L17;
          }
        }
        L19: {
          ((dn) this).b(0, ((dn) this).field_x, 0, 0, ((dn) this).field_v + 3);
          ((dn) this).b((byte) -55, (lm) (Object) ((dn) this).field_U);
          if (null == ((dn) this).field_V) {
            break L19;
          } else {
            ((dn) this).b((byte) -128, (lm) (Object) ((dn) this).field_V);
            break L19;
          }
        }
        L20: {
          if (((dn) this).field_K == null) {
            break L20;
          } else {
            ((dn) this).b((byte) -104, (lm) (Object) ((dn) this).field_K);
            break L20;
          }
        }
    }

    public final void a(rm param0, int param1) {
        if (param1 != 10000536) {
            Object var4 = null;
            ((dn) this).a((rm) null, (byte) 51);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new String[]{"Fire Immunity", "Immune to dragonfire."};
        field_W = "Goblin Scout";
        field_T = "MEMBERS ONLY";
        field_L = "<col=2E5D17>Advance</col>";
    }
}
