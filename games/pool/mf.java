/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends tm {
    static dd field_n;
    static int field_l;
    static boolean field_o;
    static int field_m;

    final boolean c(int param0) {
        if (param0 != 2) {
            field_o = true;
            return true;
        }
        return true;
    }

    final int a(int param0, boolean param1) {
        if (!param1) {
            return 118;
        }
        return rc.field_e[param0];
    }

    final static int a(int param0, double param1) {
        return ud.a(param1, 16, 1);
    }

    final void a(di param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            ((mf) this).field_a = new eg[]{((mf) this).g(-930305852), eg.a(param0, "", "balls/CLASSIC/ball1"), eg.a(param0, "", "balls/CLASSIC/ball2"), eg.a(param0, "", "balls/CLASSIC/ball3"), eg.a(param0, "", "balls/CLASSIC/ball4"), eg.a(param0, "", "balls/CLASSIC/ball5"), eg.a(param0, "", "balls/CLASSIC/ball6"), eg.a(param0, "", "balls/CLASSIC/ball7"), eg.a(param0, "", "balls/CLASSIC/ball8"), eg.a(param0, "", "balls/CLASSIC/ball9"), eg.a(param0, "", "balls/CLASSIC/ball10"), eg.a(param0, "", "balls/CLASSIC/ball11"), eg.a(param0, "", "balls/CLASSIC/ball12"), eg.a(param0, "", "balls/CLASSIC/ball13"), eg.a(param0, "", "balls/CLASSIC/ball14"), eg.a(param0, "", "balls/CLASSIC/ball15")};
            if (param1 == 117) {
              var3_int = 1;
              L1: while (true) {
                if (((mf) this).field_a.length <= var3_int) {
                  break L0;
                } else {
                  ((mf) this).field_a[var3_int].a(8, 8, 8, 4);
                  int discarded$1 = 0;
                  li.a(((mf) this).field_a[var3_int]);
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("mf.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, di param1) {
        try {
            dd[] dupTemp$0 = aj.a(param0 ^ param0, "", param1, "top_bar_balls_modern");
            ((mf) this).field_e = dupTemp$0;
            d.field_a = dupTemp$0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "mf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i() {
        field_n = null;
    }

    final static void j() {
        sa.field_f = new fn(tq.field_m, dg.field_J, qg.field_f, uo.field_Lb, (vh) (Object) e.field_e, ei.field_A);
    }

    mf() {
        ((mf) this).field_g = false;
    }

    final String a(byte param0, int param1) {
        if (param0 <= 9) {
            return null;
        }
        return 0 == param1 ? me.field_w : vf.field_Q;
    }

    final static void a(byte param0, int param1, nm param2, nm param3) {
        td.field_e = param2;
        qi.field_e = 2;
        fj.field_h = 8;
        try {
            rm.field_b = 8;
            bk.field_m = param3;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "mf.F(" + -91 + ',' + 2 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + 8 + ',' + 8 + ')');
        }
    }

    static {
    }
}
