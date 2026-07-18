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
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (!param2) {
              if (param1 != 13) {
                stackOut_6_0 = super.a(param0, param1, false, param3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                ((qq) this).k(17);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("qq.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
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
        field_yb = null;
        field_zb = null;
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException var4 = null;
        wk var5 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        wk stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        wk stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        wk stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_11_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        wk stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        wk stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        wk stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            if (!((qq) this).field_vb) {
              L1: {
                ((qq) this).field_vb = true;
                stackOut_2_0 = this;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (param2 != ~param1) {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackOut_3_1 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L1;
                }
              }
              L2: {
                ((qq) this).field_ub = stackIn_5_1 != 0;
                ((qq) this).field_Ab.a(4210752, param2 ^ -19110, 8405024);
                var5 = new wk((qq) this, ((qq) this).field_wb, param0);
                if (param1 == 5) {
                  var5.a(11, hb.field_c, 1);
                  var5.a(17, dj.field_e, 1);
                  break L2;
                } else {
                  if (param1 != 256) {
                    L3: {
                      stackOut_8_0 = (wk) var5;
                      stackOut_8_1 = -1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (!((qq) this).field_sb) {
                        stackOut_10_0 = (wk) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = jk.field_a;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L3;
                      } else {
                        stackOut_9_0 = (wk) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = ap.field_F;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L3;
                      }
                    }
                    ((wk) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2, 1);
                    break L2;
                  } else {
                    fe discarded$2 = var5.a(ap.field_F, -101, (cc) this);
                    break L2;
                  }
                }
              }
              L4: {
                if (param1 != 3) {
                  if (4 == param1) {
                    var5.a(8, lg.field_w, 1);
                    break L4;
                  } else {
                    if (param1 == 6) {
                      var5.a(9, e.field_f, 1);
                      break L4;
                    } else {
                      if (param1 == 9) {
                        fe discarded$3 = var5.a(lg.field_y, -94, (cc) this);
                        break L4;
                      } else {
                        ((qq) this).d((ei) (Object) var5, 30);
                        return;
                      }
                    }
                  }
                } else {
                  var5.a(7, o.field_w, 1);
                  break L4;
                }
              }
              ((qq) this).d((ei) (Object) var5, 30);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("qq.R(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public void a(boolean param0, int param1, int param2, fe param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (((qq) this).field_ub) {
                lf.a(3, (byte) 121);
                ((qq) this).k(17);
                break L1;
              } else {
                ui.a("tochangedisplayname.ws", hk.d(97), false);
                break L1;
              }
            }
            if (param0) {
              break L0;
            } else {
              ((qq) this).field_wb = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("qq.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param4 + ')');
        }
    }

    qq(lq param0, lr param1, String param2, boolean param3, boolean param4) {
        super(param0, (ei) (Object) new wk((qq) null, param1, param2), 77, 10, 10);
        try {
            ((qq) this).field_vb = false;
            ((qq) this).field_sb = param3 ? true : false;
            ((qq) this).field_wb = param1;
            ((qq) this).field_tb = param4 ? true : false;
            ((qq) this).field_ub = false;
            ((qq) this).field_Ab = new gj(13, 50, 274, 30, 15, 2113632, 4210752);
            ((qq) this).field_Ab.field_N = true;
            ((qq) this).a(true, (ei) (Object) ((qq) this).field_Ab);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "qq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
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
