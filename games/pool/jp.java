/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp extends ch implements jn, tb {
    static String field_W;
    private fe field_Q;
    private ga field_O;
    static int field_V;
    static ee field_N;
    static dd field_T;
    private fe field_U;
    static eg field_P;
    mp field_S;
    static String field_R;

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        if (param0) {
          if (((jp) this).field_U != param3) {
            if (((jp) this).field_Q != param3) {
              return;
            } else {
              this.i(-123);
              return;
            }
          } else {
            mb.b(3);
            return;
          }
        } else {
          return;
        }
    }

    private final int a(String param0, String param1, int param2, int param3, ei param4, int param5) {
        if (param5 != -17870) {
          field_R = null;
          return this.a(param3, param1, param4, 35, param0, 101, param2);
        } else {
          return this.a(param3, param1, param4, 35, param0, 101, param2);
        }
    }

    public final void a(String param0, int param1) {
        ga var3 = null;
        String var4 = null;
        if (param1 != 35) {
          field_N = null;
          var3 = ((jp) this).field_O;
          var4 = param0;
          ((sl) (Object) var3).a((byte) -124, false, var4);
          return;
        } else {
          var3 = ((jp) this).field_O;
          var4 = param0;
          ((sl) (Object) var3).a((byte) -124, false, var4);
          return;
        }
    }

    public static void a(boolean param0) {
        field_N = null;
        field_T = null;
        field_R = null;
        if (param0) {
          field_V = 80;
          field_W = null;
          field_P = null;
          return;
        } else {
          field_W = null;
          field_P = null;
          return;
        }
    }

    final void a(ei param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((jp) this).field_Q.field_I = this.h(-23086);
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (98 == param1) {
            return ((jp) this).a(param3, 3);
          } else {
            if (param1 == 99) {
              return ((jp) this).b(param3, 0);
            } else {
              return false;
            }
          }
        }
    }

    private final boolean a(int param0, sc param1) {
        ip var3 = null;
        na var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var3 = param1.a(91);
        if (var3 != null) {
          if (param0 != 60) {
            L0: {
              ((jp) this).field_U = null;
              var4 = var3.c(-31873);
              if (var4 != kr.field_e) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              var4 = var3.c(-31873);
              if (var4 != kr.field_e) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    private final void i(int param0) {
        Object var3 = null;
        if (!this.h(-23086)) {
          return;
        } else {
          L0: {
            qi.a(87, ((jp) this).field_O.field_m);
            if (param0 < -104) {
              break L0;
            } else {
              var3 = null;
              int discarded$2 = this.a(-86, (String) null, (ei) null, -74, (String) null, -122, 47);
              break L0;
            }
          }
          return;
        }
    }

    public jp() {
        super(0, 0, 496, 0, (fp) null);
        ((jp) this).field_O = new ga("", (cc) null, 12);
        am var1 = new am(qk.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, lc.field_O.field_C, -1, 2147483647, true);
        ei var2 = new ei(ij.field_s, (fp) (Object) var1, (cc) null);
        ((jp) this).field_Q = new fe(wn.field_c, (cc) null);
        ((jp) this).field_U = new fe(be.field_K, (cc) null);
        ((jp) this).field_O.field_p = sg.field_H;
        ((jp) this).field_O.a((byte) -111, (ip) (Object) new ua((sl) (Object) ((jp) this).field_O));
        ((jp) this).field_Q.field_I = false;
        ((jp) this).field_Q.field_z = (fp) (Object) new ng();
        ((jp) this).field_U.field_z = (fp) (Object) new pd();
        ((jp) this).field_O.field_z = (fp) (Object) new om(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(270, 20, 50, false, var3);
        ((jp) this).a(true, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(ac.field_l, se.field_k, 170, var3, (ei) (Object) ((jp) this).field_O, -17870));
        ((jp) this).field_Q.a(var5, -var5 + 496 >> -999274911, 40, false, var3);
        ((jp) this).field_U.a(60, 3 + var4, 40, false, var3 + 15);
        ((jp) this).field_U.field_t = (cc) this;
        ((jp) this).field_Q.field_t = (cc) this;
        ((jp) this).a(true, (ei) (Object) ((jp) this).field_Q);
        ((jp) this).a(true, (ei) (Object) ((jp) this).field_U);
        ((jp) this).field_S = new mp((jn) this);
        ((jp) this).field_S.a(-60 + (-((jp) this).field_O.field_C + ((jp) this).field_l) + -((jp) this).field_O.field_l, ((jp) this).field_O.field_C + (((jp) this).field_O.field_l + 60), 150, false, 20);
        ((jp) this).a(true, (ei) (Object) ((jp) this).field_S);
        ((jp) this).a(496, 0, var4 + 55 + var3, false, 0);
    }

    final static dd a(int param0, byte param1, di param2, int param3) {
        if (vj.a(param3, param2, param0, (byte) 121)) {
          if (param1 <= 12) {
            jp.a(true);
            return ok.j((byte) -104);
          } else {
            return ok.j((byte) -104);
          }
        } else {
          return null;
        }
    }

    public final void a(int param0) {
        Object var3 = null;
        if (param0 != 16777215) {
          var3 = null;
          ((jp) this).a((ei) null, -124, -55, 87);
          ((ua) (Object) ((jp) this).field_O.a(95)).i(param0 + -16777197);
          return;
        } else {
          ((ua) (Object) ((jp) this).field_O.a(95)).i(param0 + -16777197);
          return;
        }
    }

    private final boolean h(int param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -23086) {
          var3 = null;
          ((jp) this).a(true, 119, 35, (fe) null, -96);
          if (this.a(60, (sc) (Object) ((jp) this).field_O)) {
            return true;
          } else {
            return false;
          }
        } else {
          L0: {
            if (!this.a(60, (sc) (Object) ((jp) this).field_O)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    private final int a(int param0, String param1, ei param2, int param3, String param4, int param5, int param6) {
        ck var9 = null;
        n var10 = null;
        var10 = new n(20, param0, param6 + 120, 25, param2, false, 120, 3, lc.field_O, 16777215, param4);
        ((jp) this).a(true, (ei) (Object) var10);
        var9 = new ck(((sc) (Object) param2).a(-75), param1, 126, param0 - -var10.field_y, 25 + param6, param3);
        var9.field_t = (cc) this;
        ((jp) this).a(true, (ei) (Object) var9);
        if (param5 <= 67) {
          field_R = null;
          return var10.field_y + var9.field_y;
        } else {
          return var10.field_y + var9.field_y;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "to keep fullscreen or";
        field_R = "Please remove <%0> from your ignore list first.";
    }
}
