/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip {
    static hh field_b;
    static k field_a;
    static String field_c;
    static String field_d;

    final static boolean a(byte param0, CharSequence param1) {
        Object var3 = null;
        if (param0 >= -28) {
          var3 = null;
          ip.a(false, (nj) null);
          return ij.a(true, 10, param1, -98);
        } else {
          return ij.a(true, 10, param1, -98);
        }
    }

    final static nh a(int param0, int param1) {
        int var2 = -59 / ((-69 - param1) / 43);
        nh var3 = new nh();
        to.field_q.a((byte) 54, (q) (Object) var3);
        hj.a(false, param0);
        return var3;
    }

    public static void b(int param0) {
        int var1 = -39 % ((param0 - 6) / 32);
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static java.applet.Applet a(int param0) {
        if (wj.field_g != null) {
            return wj.field_g;
        }
        if (param0 != 9) {
            field_a = null;
            return (java.applet.Applet) (Object) vk.field_B;
        }
        return (java.applet.Applet) (Object) vk.field_B;
    }

    final static void a(boolean param0, nj param1) {
        mc var2 = null;
        nj var3 = null;
        int var4 = 0;
        var4 = Torquing.field_u;
        var2 = (mc) (Object) uj.field_a.b(0);
        L0: while (true) {
          if (var2 != null) {
            L1: {
              var3 = var2.field_j;
              if (var3.e()) {
                var2.f(0);
                break L1;
              } else {
                if (var3.field_m != param1.field_m) {
                  break L1;
                } else {
                  if (var3.k() != param1.k()) {
                    break L1;
                  } else {
                    if (var3.g() * 9 >= param1.g() * 10) {
                      break L1;
                    } else {
                      if (param1.g() * 9 >= var3.g() * 10) {
                        break L1;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            var2 = (mc) (Object) uj.field_a.f(-24059);
            continue L0;
          } else {
            uj.field_a.a((byte) 54, (q) (Object) new mc(param1));
            ni.a(param1, param0);
            return;
          }
        }
    }

    final static sm[] a(la param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.a(-1, param2);
        var5 = param0.a(param3, -101, var4);
        if (param1 >= -105) {
          field_a = null;
          return fq.a(param0, -25960, var5, var4);
        } else {
          return fq.a(param0, -25960, var5, var4);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new hh();
        field_a = new k(14, 0, 4, 1);
        field_d = "Retry";
    }
}
