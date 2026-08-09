/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends pc {
    static mk field_F;
    static int field_H;
    static wh field_C;
    static int field_D;
    static String field_G;

    final static void e(byte param0) {
        if (!(gl.field_c)) {
            throw new IllegalStateException();
        }
        jd.field_z = true;
        fl.a(false, 1);
        if (param0 >= -36) {
            field_C = (wh) null;
        }
        hp.field_s = 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -75) {
            field_D = 123;
        }
        this.field_A = !this.field_A ? true : false;
        super.a(param0, param1, -106, param3);
    }

    final static void a(db param0, int param1, db param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
                L2: {
                  cj.field_x = bl.a(param2, "initialset", "penalty-appear").a();
                  qp.field_i = bl.a(param2, "initialset", "crystal1-disappear").a();
                  ck.field_cb = bl.a(param2, "initialset", "crystal2-disappear").a();
                  cf.field_d = bl.a(param2, "initialset", "ball-disappear").a();
                  de.field_l = bl.a(param2, "initialset", "key-disappear").a();
                  rd.field_i = bl.a(param2, "initialset", "spider-disappear").a();
                  if (param1 >= 22) {
                    break L2;
                  } else {
                    field_D = -59;
                    break L2;
                  }
                }
                var3_int = 0;
                L3: while (true) {
                  if (7 <= var3_int) {
                    bp.field_a = bl.a(param2, "initialset", "penalty-disappear").a();
                    je.field_f = ha.a(param0, "initialset", "score-count").b();
                    dn.field_e = bl.a(param2, "initialset", "score-end").a();
                    break L0;
                  } else {
                    oj.field_L[var3_int] = bl.a(param2, "initialset", "bonus" + var3_int + "-disappear").a();
                    var3_int++;
                    continue L3;
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
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("of.B(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
    }

    of(String param0, bi param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_A = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private of(String param0, bi param1) {
        this(param0, pi.field_j.field_p, param1);
        try {
            this.field_i = pi.field_j.field_i;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (oi.field_c == null) {
                break L1;
              } else {
                if (gj.field_k != ek.field_h) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public static void h(int param0) {
        field_F = null;
        field_C = null;
        field_G = null;
        if (param0 != 3) {
            field_G = (String) null;
        }
    }

    private of(String param0, wo param1, bi param2) {
        super(param0, param1, param2);
        try {
            this.field_i = pi.field_j.field_i;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_F = new mk();
        field_G = "'<%1>' levels complete<br><col=<%0>>Proceeding to Bonus Levels";
        field_C = new wh(3);
    }
}
