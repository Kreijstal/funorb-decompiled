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
        Throwable decompiledCaughtException = null;
        if (nr.field_q != null) {
          var1 = nr.field_q;
          synchronized (var1) {
            L0: {
              nr.field_q = null;
              break L0;
            }
          }
          L1: {
            if (param0 == 98) {
              break L1;
            } else {
              gs.a(65);
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (param0 == 98) {
              break L2;
            } else {
              gs.a(65);
              break L2;
            }
          }
          return;
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            var1_int = param0;
            L1: while (true) {
              if (e.field_n.length <= var1_int) {
                break L0;
              } else {
                e.field_n[var1_int].c(-118);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "gs.D(" + param0 + ')');
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
          field_c = (sj) null;
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
        field_f = "Join <%0>'s game";
        field_a = new int[]{0, 5, 31, 49, 57, 58, 64, 67, 75, 76, 92, 98, 98, 100};
        field_b = false;
        field_g = false;
    }
}
