/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends pc {
    static mk field_F;
    static int field_H;
    static wh field_C;
    static int field_D;
    static String field_G;

    final static void e() {
        if (!(gl.field_c)) {
            throw new IllegalStateException();
        }
        jd.field_z = true;
        int discarded$0 = 1;
        fl.a(false);
        hp.field_s = 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -75) {
            field_D = 123;
        }
        ((of) this).field_A = !((of) this).field_A ? true : false;
        super.a(param0, param1, -106, param3);
    }

    final static void a(db param0, int param1, db param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
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
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            wc.field_q = bl.a(param2, "initialset", "level-complete").a();
            re.field_h = bl.a(param2, "initialset", "crystal1-appear").a();
            jj.field_a = bl.a(param2, "initialset", "crystal2-appear").a();
            cb.field_p = bl.a(param2, "initialset", "bomb-appear").a();
            lp.field_b = bl.a(param2, "initialset", "ball-appear").a();
            ti.field_m = bl.a(param2, "initialset", "key-appear").a();
            ad.field_k = bl.a(param2, "initialset", "spider-appear").a();
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 7) {
                cj.field_x = bl.a(param2, "initialset", "penalty-appear").a();
                qp.field_i = bl.a(param2, "initialset", "crystal1-disappear").a();
                ck.field_cb = bl.a(param2, "initialset", "crystal2-disappear").a();
                cf.field_d = bl.a(param2, "initialset", "ball-disappear").a();
                de.field_l = bl.a(param2, "initialset", "key-disappear").a();
                rd.field_i = bl.a(param2, "initialset", "spider-disappear").a();
                var3_int = 0;
                L2: while (true) {
                  if (7 <= var3_int) {
                    bp.field_a = bl.a(param2, "initialset", "penalty-disappear").a();
                    je.field_f = ha.a(param0, "initialset", "score-count").b();
                    dn.field_e = bl.a(param2, "initialset", "score-end").a();
                    break L0;
                  } else {
                    oj.field_L[var3_int] = bl.a(param2, "initialset", "bonus" + var3_int + "-disappear").a();
                    var3_int++;
                    continue L2;
                  }
                }
              } else {
                d.field_b[var3_int] = bl.a(param2, "initialset", "bonus" + var3_int + "-appear").a();
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("of.B(");
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(23).append(44);
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
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    of(String param0, bi param1, boolean param2) {
        this(param0, param1);
        try {
            ((of) this).field_A = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "of.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private of(String param0, bi param1) {
        this(param0, pi.field_j.field_p, param1);
        try {
            ((of) this).field_i = pi.field_j.field_i;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "of.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (oi.field_c == null) {
                break L1;
              } else {
                if (gj.field_k != ek.field_h) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public static void h() {
        field_F = null;
        field_C = null;
        field_G = null;
    }

    private of(String param0, wo param1, bi param2) {
        super(param0, param1, param2);
        try {
            ((of) this).field_i = pi.field_j.field_i;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "of.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new mk();
        field_G = "'<%1>' levels complete<br><col=<%0>>Proceeding to Bonus Levels";
        field_C = new wh(3);
    }
}
