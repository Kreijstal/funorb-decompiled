/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends hf implements ai {
    static int field_T;
    private wp field_P;
    private long field_W;
    private wp field_Q;
    private pk field_S;
    static dt field_O;
    static String field_R;
    static int field_U;
    static ri[] field_V;

    final void a(int param0, int param1, pk param2, int param3) {
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          super.a(param0, 74, param2, param3);
          if (!sl.field_d) {
            break L0;
          } else {
            param2.c((byte) 116);
            break L0;
          }
        }
        var7 = -26 / ((param1 - -25) / 45);
        var5 = -((qk) this).field_W + wq.a(-118);
        var8 = (int)((10999L - var5) / 1000L);
        if (var8 > 0) {
          ((qk) this).field_S.field_m = "" + var8;
          if (((qk) this).field_D) {
            L1: {
              if (null == gk.field_o) {
                this.e(true);
                ((qk) this).field_E.a((byte) 97, (pk) (Object) new u(((qk) this).field_E, am.field_e));
                break L1;
              } else {
                break L1;
              }
            }
            if (null != gk.field_o) {
              L2: {
                if (gk.field_o.field_a) {
                  this.e(true);
                  ((qk) this).field_E.a((byte) 122, (pk) (Object) new u(((qk) this).field_E, am.field_e));
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            if (null != gk.field_o) {
              if (gk.field_o.field_a) {
                this.e(true);
                ((qk) this).field_E.a((byte) 122, (pk) (Object) new u(((qk) this).field_E, am.field_e));
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          ib.d(1);
          this.e(true);
          ((qk) this).field_E.a((byte) 121, (pk) (Object) new u(((qk) this).field_E, ta.field_f));
          if (((qk) this).field_D) {
            L3: {
              if (null == gk.field_o) {
                this.e(true);
                ((qk) this).field_E.a((byte) 97, (pk) (Object) new u(((qk) this).field_E, am.field_e));
                break L3;
              } else {
                break L3;
              }
            }
            if (null != gk.field_o) {
              L4: {
                if (gk.field_o.field_a) {
                  this.e(true);
                  ((qk) this).field_E.a((byte) 122, (pk) (Object) new u(((qk) this).field_E, am.field_e));
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            if (null != gk.field_o) {
              if (!gk.field_o.field_a) {
                return;
              } else {
                this.e(true);
                ((qk) this).field_E.a((byte) 122, (pk) (Object) new u(((qk) this).field_E, am.field_e));
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int var5 = 0;
        var5 = param3;
        if (-100 != var5) {
          if (-99 != var5) {
            if (param2 <= 9) {
              ((qk) this).field_W = 89L;
              return super.a(param0, param1, (byte) 13, param3);
            } else {
              return super.a(param0, param1, (byte) 13, param3);
            }
          } else {
            boolean discarded$4 = ((qk) this).field_P.a((pk) this, (byte) 61);
            return true;
          }
        } else {
          boolean discarded$5 = ((qk) this).field_Q.a((pk) this, (byte) 61);
          return true;
        }
    }

    qk(dg param0) {
        super(param0, 200, 200);
        ((qk) this).field_W = wq.a(-97);
        pk var3 = new pk(ha.field_d, (qm) null);
        var3.field_p = 100;
        var3.field_v = 50;
        var3.field_q = ((qk) this).field_q;
        var3.field_r = 0;
        var3.field_w = (mh) (Object) new gm(jm.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((qk) this).a(var3, 89);
        ((qk) this).field_S = new pk(ha.field_d, (qm) null);
        ((qk) this).field_S.field_v = var3.field_p + (var3.field_v + 20);
        ((qk) this).field_S.field_q = ((qk) this).field_q;
        ((qk) this).field_S.field_r = 0;
        ((qk) this).field_S.field_p = 80;
        ((qk) this).field_S.field_w = (mh) (Object) new gm(tq.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((qk) this).a(((qk) this).field_S, 117);
        ((qk) this).field_P = this.a((qm) this, 20556, km.field_m);
        ((qk) this).field_Q = this.a((qm) this, 20556, up.field_b);
    }

    private final wp a(qm param0, int param1, String param2) {
        wp var4 = null;
        int var5 = 0;
        var4 = new wp(param2, param0);
        var4.field_w = (mh) (Object) new ue();
        var5 = ((qk) this).field_p + -6;
        ((qk) this).field_p = ((qk) this).field_p + 38;
        var4.a(114, 15, var5, 30, -16 + ((qk) this).field_q - 14);
        ((qk) this).a((pk) (Object) var4, param1 + -20458);
        if (param1 != 20556) {
          return null;
        } else {
          ((qk) this).c(false);
          return var4;
        }
    }

    private final void e(boolean param0) {
        if (param0) {
          if (!((qk) this).field_D) {
            return;
          } else {
            ((qk) this).field_D = false;
            return;
          }
        } else {
          ((qk) this).field_W = -123L;
          if (!((qk) this).field_D) {
            return;
          } else {
            ((qk) this).field_D = false;
            return;
          }
        }
    }

    public static void g(byte param0) {
        field_R = null;
        if (param0 != -43) {
            qk.g((byte) -2);
            field_V = null;
            field_O = null;
            return;
        }
        field_V = null;
        field_O = null;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        if (((qk) this).field_P == param2) {
          this.e(true);
          if (param1 == 710) {
            return;
          } else {
            field_U = 24;
            return;
          }
        } else {
          if (param2 != ((qk) this).field_Q) {
            if (param1 != 710) {
              field_U = 24;
              return;
            } else {
              return;
            }
          } else {
            ib.d(param1 ^ 711);
            this.e(true);
            if (param1 == 710) {
              return;
            } else {
              field_U = 24;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = 0;
        field_R = "Unfortunately we are unable to create an account for you at this time.";
    }
}
