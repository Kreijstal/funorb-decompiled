/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ma {
    static String field_u;
    int field_p;
    static int field_m;
    int field_l;
    long field_w;
    int field_v;
    int field_x;
    int field_A;
    int[] field_z;
    int field_n;
    int field_B;
    static int field_s;
    static String field_t;
    static int field_q;
    static ko field_o;
    static String field_y;
    static int[] field_r;

    public static void a(int param0) {
        field_u = null;
        field_y = null;
        field_t = null;
        field_o = null;
        field_r = null;
    }

    final static void a(di param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        oc var5 = null;
        int[] var6 = null;
        oq var7 = null;
        int var8 = 0;
        oq var9 = null;
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
        try {
          L0: {
            var7 = new oq(param0.a(false, "", "logo.fo3d"));
            var9 = var7;
            var3 = var9.g(-123);
            var9.p(8);
            cf.field_a = ro.a(24, var9);
            qe.field_S = new oc[var3];
            qp.field_gc = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                var9.o(8);
                var8 = 0;
                var4 = var8;
                L2: while (true) {
                  if (var3 <= var8) {
                    break L0;
                  } else {
                    var5 = qe.field_S[var8];
                    var5.a(6, 1, 6, 6, 1);
                    var5.a((byte) 103);
                    var6 = new int[]{var5.field_n - -var5.field_q >> 1, var5.field_N - -var5.field_b >> 1, var5.field_F + var5.field_f >> 1};
                    qp.field_gc[var8] = var6;
                    var5.a(0, -var6[0], -var6[2], -var6[1]);
                    var8++;
                    continue L2;
                  }
                }
              } else {
                qe.field_S[var4] = fm.a(-16336, var7);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("oj.A(");
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + -106 + 41);
        }
    }

    final static boolean c(int param0) {
        int var1 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var1 = 38 / ((param0 - 45) / 37);
            if (null != vl.field_m) {
              break L1;
            } else {
              if (sh.h((byte) 86)) {
                break L1;
              } else {
                if (fc.field_b != null) {
                  break L1;
                } else {
                  if (!wj.i(-1)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = tp.field_e != null ? 1 : 0;
        if (qi.field_a == 9) {
            if (fj.a(ro.field_s, rn.field_g, 17, hg.field_a, hp.field_a)) {
                if (hg.field_a != 2) {
                    if (var3 != 0) {
                        return false;
                    }
                }
                return hj.a(hg.field_a, rn.field_g, hp.field_a, ro.field_s, (byte) 76);
            }
        }
        if (!(qi.field_a != 10)) {
            if (!(var3 == 0)) {
                return false;
            }
            r.c((byte) -65);
            return true;
        }
        if (11 == qi.field_a) {
            if (!nr.field_T) {
                return false;
            }
            if (tq.field_t == 2) {
                if (!(tq.a(false, hj.field_c, ie.field_e))) {
                    return false;
                }
            }
            if (2 != tq.field_t) {
                if (var3 != 0) {
                    return false;
                }
            }
            if (vl.j(12000)) {
                Object var4 = null;
                ub.a((byte) -127, (String) null, param1, ie.field_e, tq.field_t, uh.field_x);
            }
            return true;
        }
        return false;
    }

    oj(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            int fieldTemp$0 = kh.field_Wb;
            kh.field_Wb = kh.field_Wb + 1;
            ((oj) this).field_B = fieldTemp$0 & 65535;
            ((oj) this).field_A = param4;
            ((oj) this).field_n = param2;
            ((oj) this).field_l = param0;
            ((oj) this).field_x = param3;
            ((oj) this).field_p = param1;
            ((oj) this).field_z = param6;
            ((oj) this).field_v = param5;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "oj.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "You gained 1 life!";
        field_m = 4;
        field_t = "Loading graphics";
        field_q = -1;
        field_o = new ko();
        field_r = new int[8192];
    }
}
