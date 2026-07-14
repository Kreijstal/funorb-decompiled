/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs {
    static sj field_c;
    static boolean field_b;
    static String field_f;
    static int[] field_a;
    static boolean field_g;
    static sj field_d;
    static boolean field_e;

    final static void a(byte param0) {
        L0: {
          if (param0 == -106) {
            break L0;
          } else {
            gs.a((byte) -44);
            break L0;
          }
        }
        if (dr.field_a) {
          if (0 == (wt.field_x ^ -1)) {
            if (us.field_j != -1) {
              bw.field_e[2].c(us.field_k + (-re.field_k + wt.field_x - 6 - -1), -1 + (us.field_j - kw.field_h));
              bw.field_e[3].c(wt.field_x + 6 + -us.field_k, -kw.field_h + (us.field_j - 1));
              bw.field_e[0].c(-kw.field_h + (wt.field_x + -1), 1 + (us.field_k + -6) + (-re.field_k + us.field_j));
              bw.field_e[1].c(-kw.field_h + (wt.field_x + -1), -us.field_k + 6 + us.field_j);
              return;
            } else {
              return;
            }
          } else {
            bw.field_e[2].c(us.field_k + (-re.field_k + wt.field_x - 6 - -1), -1 + (us.field_j - kw.field_h));
            bw.field_e[3].c(wt.field_x + 6 + -us.field_k, -kw.field_h + (us.field_j - 1));
            bw.field_e[0].c(-kw.field_h + (wt.field_x + -1), 1 + (us.field_k + -6) + (-re.field_k + us.field_j));
            bw.field_e[1].c(-kw.field_h + (wt.field_x + -1), -us.field_k + 6 + us.field_j);
            return;
          }
        } else {
          return;
        }
    }

    final static void d(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (nr.field_q != null) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 == 98) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    gs.a(65);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) nr.field_q;
                    // monitorenter nr.field_q
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        nr.field_q = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    if (param0 == 98) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    gs.a(65);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = Kickabout.field_G;
        for (var1 = param0; e.field_n.length > var1; var1++) {
            e.field_n[var1].c(-118);
        }
    }

    final static void c(int param0) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          iw.field_l = false;
          if (-1 != (un.field_e.h((byte) -111) ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        kb.field_C = stackIn_3_0 != 0;
        if (param0 != 25957) {
          field_c = null;
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        gu.b(0, (byte) 60, vc.field_E[1]);
        ji.k(param0);
        tc.a(vi.field_n, param0 ^ 8710, ih.field_c, rm.field_C);
        ui.a(1, kn.a(ih.field_c, param0 ^ 77, vi.field_n, rm.field_C), vc.field_E[2], 2147483647);
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 > -80) {
            return;
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Join <%0>'s game";
        field_a = new int[]{0, 5, 31, 49, 57, 58, 64, 67, 75, 76, 92, 98, 98, 100};
        field_b = false;
        field_g = false;
    }
}
