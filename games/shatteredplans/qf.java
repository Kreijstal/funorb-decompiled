/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qf {
    int field_a;
    kk field_f;
    static byte[][] field_d;
    static String field_c;
    static String field_b;
    static qr field_e;

    public static void a() {
        field_d = null;
        field_c = null;
        field_b = null;
        field_e = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (hp.field_m != null) {
          if (!hp.field_m.b(true)) {
            if (tc.field_G != null) {
              if (!tc.field_G.h(0)) {
                if (param0 == 0) {
                  int discarded$12 = 97;
                  if (!ac.d()) {
                    if (ph.a(4, param1, param3, param2)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  boolean discarded$13 = qf.a(-33, 11, -33, 82);
                  int discarded$14 = 97;
                  if (!ac.d()) {
                    if (!ph.a(4, param1, param3, param2)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                tc.field_G = null;
                ai.a(3);
                return true;
              }
            } else {
              if (param0 == 0) {
                int discarded$15 = 97;
                if (!ac.d()) {
                  if (ph.a(4, param1, param3, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                boolean discarded$16 = qf.a(-33, 11, -33, 82);
                int discarded$17 = 97;
                if (!ac.d()) {
                  if (ph.a(4, param1, param3, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            }
          } else {
            ai.a(param0 + 3);
            return true;
          }
        } else {
          if (tc.field_G != null) {
            if (!tc.field_G.h(0)) {
              if (param0 == 0) {
                int discarded$18 = 97;
                if (!ac.d()) {
                  if (ph.a(4, param1, param3, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                boolean discarded$19 = qf.a(-33, 11, -33, 82);
                int discarded$20 = 97;
                if (!ac.d()) {
                  if (ph.a(4, param1, param3, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              tc.field_G = null;
              ai.a(3);
              return true;
            }
          } else {
            if (param0 == 0) {
              int discarded$21 = 97;
              if (!ac.d()) {
                if (ph.a(4, param1, param3, param2)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              boolean discarded$22 = qf.a(-33, 11, -33, 82);
              int discarded$23 = 97;
              if (!ac.d()) {
                if (ph.a(4, param1, param3, param2)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        int var1 = 125 / ((param0 - -68) / 50);
        u.field_a = vc.a((byte) -39, 50);
        tk.field_C = (nq) (Object) rs.field_Cb;
        rp.field_K = new pf();
        ui.field_m = 0;
        kc.field_i = 0;
        di.field_m = 0;
        p.field_n = false;
        bj.field_L = 0;
        Object var2 = null;
        jo.a(32767, (gh) null, true, 50);
        int discarded$0 = -123;
        kg.f();
    }

    final static int a(byte param0, int param1, Random param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 0) {
                break L1;
              } else {
                boolean discarded$4 = qf.a(119, 68, -5, 5);
                break L1;
              }
            }
            int discarded$5 = -11;
            stackOut_2_0 = hi.a(param1, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("qf.B(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    qf(kk param0, int param1) {
        try {
            ((qf) this).field_a = param1;
            ((qf) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b() {
        int discarded$0 = 0;
        jh.a(ii.field_u, ho.field_j, un.field_g, me.field_d);
        int var1 = 57;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Staff impersonation";
        field_d = new byte[1000][];
        field_c = "The fates of the children of Earth rest in your hands.";
    }
}
