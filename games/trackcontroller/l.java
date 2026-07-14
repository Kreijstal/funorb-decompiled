/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends di {
    static ba field_m;
    static String field_n;

    l(lb param0) {
        super(param0);
    }

    final static String h(int param0) {
        if (fd.field_h != oe.field_b) {
          if (param0 == 0) {
            if (oe.field_b == rk.field_X) {
              return vh.field_p;
            } else {
              if (!sa.field_Q.b((byte) 121)) {
                return vh.field_p;
              } else {
                return qg.field_c;
              }
            }
          } else {
            field_m = null;
            if (oe.field_b == rk.field_X) {
              return vh.field_p;
            } else {
              if (!sa.field_Q.b((byte) 121)) {
                return vh.field_p;
              } else {
                return qg.field_c;
              }
            }
          }
        } else {
          return th.field_n;
        }
    }

    final ud a(int param0, String param1) {
        if (param0 > -106) {
            return null;
        }
        int var3 = ha.a(param1, -125) == null ? 1 : 0;
        if (!(var3 != 0)) {
            return ef.field_b;
        }
        return TrackController.field_G;
    }

    public static void g(int param0) {
        if (param0 != 0) {
            return;
        }
        field_n = null;
        field_m = null;
    }

    final String a(String param0, int param1) {
        if (param1 == 426) {
          if (((l) this).a(-124, param0) == ef.field_b) {
            return ob.field_v;
          } else {
            return hf.field_a;
          }
        } else {
          field_m = null;
          if (((l) this).a(-124, param0) == ef.field_b) {
            return ob.field_v;
          } else {
            return hf.field_a;
          }
        }
    }

    final static boolean a(kk param0, kk param1, byte param2, kk param3) {
        int var4 = 0;
        if (param0.c(90)) {
          if (param0.b("commonui", (byte) -3)) {
            if (param1.c(-83)) {
              if (param1.b("commonui", (byte) -3)) {
                L0: {
                  if (!param3.c(88)) {
                    break L0;
                  } else {
                    if (!param3.b("button.gif", (byte) -3)) {
                      break L0;
                    } else {
                      var4 = 71 / ((param2 - -69) / 32);
                      return true;
                    }
                  }
                }
                return false;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        Object var3 = null;
        if (rl.field_N != 11) {
          ob.a(qh.field_i, 209, pb.field_a, qi.field_k);
          if (param0 <= 52) {
            var3 = null;
            l.a((byte) 125, (java.awt.Canvas) null);
            qd.a(param1, 0, 0, 2901);
            return;
          } else {
            qd.a(param1, 0, 0, 2901);
            return;
          }
        } else {
          rg.a(false);
          ob.a(qh.field_i, 209, pb.field_a, qi.field_k);
          if (param0 > 52) {
            qd.a(param1, 0, 0, 2901);
            return;
          } else {
            var3 = null;
            l.a((byte) 125, (java.awt.Canvas) null);
            qd.a(param1, 0, 0, 2901);
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        fc var2 = null;
        int var3 = 0;
        cf var4 = null;
        var3 = TrackController.field_F ? 1 : 0;
        var4 = (cf) (Object) kd.field_b.b(param0 + 30424);
        if (param0 == -30422) {
          L0: while (true) {
            if (var4 == null) {
              var2 = fh.field_b.b(2);
              L1: while (true) {
                if (var2 != null) {
                  nk.a(param1, -120);
                  var2 = fh.field_b.a(param0 ^ -30432);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              md.a(param1, var4, 99);
              var4 = (cf) (Object) kd.field_b.a(10);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Prev page";
        field_m = new ba();
    }
}
