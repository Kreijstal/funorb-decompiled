/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class qq extends ok implements tb {
    static String field_yb;
    private boolean field_tb;
    static String field_zb;
    private gj field_Ab;
    private boolean field_sb;
    private lr field_wb;
    private boolean field_ub;
    static int field_xb;
    private boolean field_vb;

    final static void o(byte param0) {
        kh.field_Vb = new vh("decision box", (vh) null);
        ia.a(true, kh.field_Vb);
        hk.field_t = new vh("decision button a", (vh) null);
        rl.field_b = new vh("decision button b", (vh) null);
        if (param0 >= -103) {
          qq.o((byte) -98);
          ar.a(29022, hk.field_t);
          ar.a(29022, rl.field_b);
          kh.field_Vb.a(-104, hk.field_t);
          kh.field_Vb.a(-104, rl.field_b);
          return;
        } else {
          ar.a(29022, hk.field_t);
          ar.a(29022, rl.field_b);
          kh.field_Vb.a(-104, hk.field_t);
          kh.field_Vb.a(-104, rl.field_b);
          return;
        }
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        if (!param2) {
          if ((param1 ^ -1) == -14) {
            ((qq) this).k(17);
            return true;
          } else {
            return super.a(param0, param1, false, param3);
          }
        } else {
          return true;
        }
    }

    final void k(int param0) {
        if (param0 == 17) {
          if (!((qq) this).field_R) {
            return;
          } else {
            ((qq) this).field_R = false;
            if (!((qq) this).field_sb) {
              if (((qq) this).field_tb) {
                bh.b(false);
                return;
              } else {
                return;
              }
            } else {
              kr.a(false);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void m(byte param0) {
        wk var2 = null;
        ((qq) this).field_Ab.a(4210752, 19365, 2121792);
        if (param0 != -33) {
          ((qq) this).field_tb = false;
          var2 = new wk((qq) this, ((qq) this).field_wb, ag.field_g);
          var2.a(15, ti.field_c, param0 + 34);
          ((qq) this).d((ei) (Object) var2, param0 + 63);
          return;
        } else {
          var2 = new wk((qq) this, ((qq) this).field_wb, ag.field_g);
          var2.a(15, ti.field_c, param0 + 34);
          ((qq) this).d((ei) (Object) var2, param0 + 63);
          return;
        }
    }

    public static void n(byte param0) {
        if (param0 >= -62) {
            field_zb = null;
            field_yb = null;
            field_zb = null;
            return;
        }
        field_yb = null;
        field_zb = null;
    }

    final void a(String param0, int param1, int param2) {
        wk var5 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        wk stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        wk stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        wk stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        String stackIn_23_2 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        wk stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        wk stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        String stackOut_22_2 = null;
        wk stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        String stackOut_21_2 = null;
        if (!((qq) this).field_vb) {
          L0: {
            ((qq) this).field_vb = true;
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (param2 != (param1 ^ -1)) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((qq) this).field_ub = stackIn_5_1 != 0;
          ((qq) this).field_Ab.a(4210752, param2 ^ -19110, 8405024);
          var5 = new wk((qq) this, ((qq) this).field_wb, param0);
          if (param1 == 5) {
            var5.a(11, hb.field_c, 1);
            var5.a(17, dj.field_e, 1);
            if (param1 != 3) {
              if (4 == param1) {
                var5.a(8, lg.field_w, 1);
                ((qq) this).d((ei) (Object) var5, 30);
                return;
              } else {
                if (-7 == (param1 ^ -1)) {
                  var5.a(9, e.field_f, 1);
                  ((qq) this).d((ei) (Object) var5, 30);
                  return;
                } else {
                  if (param1 == 9) {
                    fe discarded$4 = var5.a(lg.field_y, -94, (cc) this);
                    ((qq) this).d((ei) (Object) var5, 30);
                    return;
                  } else {
                    ((qq) this).d((ei) (Object) var5, 30);
                    return;
                  }
                }
              }
            } else {
              var5.a(7, o.field_w, 1);
              ((qq) this).d((ei) (Object) var5, 30);
              return;
            }
          } else {
            if ((param1 ^ -1) != -257) {
              L1: {
                stackOut_20_0 = (wk) var5;
                stackOut_20_1 = -1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (!((qq) this).field_sb) {
                  stackOut_22_0 = (wk) (Object) stackIn_22_0;
                  stackOut_22_1 = stackIn_22_1;
                  stackOut_22_2 = jk.field_a;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L1;
                } else {
                  stackOut_21_0 = (wk) (Object) stackIn_21_0;
                  stackOut_21_1 = stackIn_21_1;
                  stackOut_21_2 = ap.field_F;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L1;
                }
              }
              ((wk) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_23_2, 1);
              if (param1 != 3) {
                if (4 == param1) {
                  var5.a(8, lg.field_w, 1);
                  ((qq) this).d((ei) (Object) var5, 30);
                  return;
                } else {
                  if (-7 == (param1 ^ -1)) {
                    var5.a(9, e.field_f, 1);
                    ((qq) this).d((ei) (Object) var5, 30);
                    return;
                  } else {
                    if (param1 == 9) {
                      fe discarded$5 = var5.a(lg.field_y, -94, (cc) this);
                      ((qq) this).d((ei) (Object) var5, 30);
                      return;
                    } else {
                      ((qq) this).d((ei) (Object) var5, 30);
                      return;
                    }
                  }
                }
              } else {
                var5.a(7, o.field_w, 1);
                ((qq) this).d((ei) (Object) var5, 30);
                return;
              }
            } else {
              fe discarded$6 = var5.a(ap.field_F, -101, (cc) this);
              if (param1 != 3) {
                if (4 == param1) {
                  var5.a(8, lg.field_w, 1);
                  ((qq) this).d((ei) (Object) var5, 30);
                  return;
                } else {
                  if (-7 == (param1 ^ -1)) {
                    var5.a(9, e.field_f, 1);
                    ((qq) this).d((ei) (Object) var5, 30);
                    return;
                  } else {
                    if (param1 == 9) {
                      fe discarded$7 = var5.a(lg.field_y, -94, (cc) this);
                      ((qq) this).d((ei) (Object) var5, 30);
                      return;
                    } else {
                      ((qq) this).d((ei) (Object) var5, 30);
                      return;
                    }
                  }
                }
              } else {
                var5.a(7, o.field_w, 1);
                ((qq) this).d((ei) (Object) var5, 30);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public void a(boolean param0, int param1, int param2, fe param3, int param4) {
        if (((qq) this).field_ub) {
          lf.a(3, (byte) 121);
          ((qq) this).k(17);
          if (param0) {
            return;
          } else {
            ((qq) this).field_wb = null;
            return;
          }
        } else {
          ui.a("tochangedisplayname.ws", hk.d(97), false);
          if (param0) {
            return;
          } else {
            ((qq) this).field_wb = null;
            return;
          }
        }
    }

    qq(lq param0, lr param1, String param2, boolean param3, boolean param4) {
        super(param0, (ei) (Object) new wk((qq) null, param1, param2), 77, 10, 10);
        ((qq) this).field_vb = false;
        ((qq) this).field_sb = param3 ? true : false;
        ((qq) this).field_wb = param1;
        ((qq) this).field_tb = param4 ? true : false;
        ((qq) this).field_ub = false;
        ((qq) this).field_Ab = new gj(13, 50, 274, 30, 15, 2113632, 4210752);
        ((qq) this).field_Ab.field_N = true;
        ((qq) this).a(true, (ei) (Object) ((qq) this).field_Ab);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_yb = "The objective of eight-ball pool is to \"pot\" all of your group of balls and then the black ball (number 8). Before we get to that, we \"break\", and the first thing you might want to do is <u=ffffff>move the cue ball</u>. <col=99ff99>Hold</col> down the <img=0> <col=99ff99>left mouse button over the cue ball and drag</col> it to where you would like to place it.";
        field_xb = 0;
        field_zb = "You and <%0> are <%2>.";
    }
}
