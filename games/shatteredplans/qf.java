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

    public static void a(int param0) {
        if (param0 != 9952) {
            return;
        }
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
                  if (!ac.d(97)) {
                    if (ph.a(4, param1, param3, param2)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  boolean discarded$4 = qf.a(-33, 11, -33, 82);
                  if (!ac.d(97)) {
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
                if (!ac.d(97)) {
                  if (ph.a(4, param1, param3, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                boolean discarded$5 = qf.a(-33, 11, -33, 82);
                if (!ac.d(97)) {
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
                if (!ac.d(97)) {
                  if (ph.a(4, param1, param3, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                boolean discarded$6 = qf.a(-33, 11, -33, 82);
                if (!ac.d(97)) {
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
              if (!ac.d(97)) {
                if (ph.a(4, param1, param3, param2)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              boolean discarded$7 = qf.a(-33, 11, -33, 82);
              if (!ac.d(97)) {
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
        kg.f((byte) -123);
    }

    final static int a(byte param0, int param1, Random param2) {
        if (param0 <= 0) {
            boolean discarded$0 = qf.a(119, 68, -5, 5);
            return hi.a(param1, param2, -11);
        }
        return hi.a(param1, param2, -11);
    }

    qf(kk param0, int param1) {
        ((qf) this).field_a = param1;
        ((qf) this).field_f = param0;
    }

    final static void b(byte param0) {
        jh.a(ii.field_u, ho.field_j, un.field_g, me.field_d, 0);
        int var1 = -114 / ((param0 - 34) / 56);
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
