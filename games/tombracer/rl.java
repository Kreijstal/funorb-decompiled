/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends pd {
    private wf field_x;
    static String field_s;
    static ka[] field_t;
    static String field_v;
    static boolean[][] field_u;
    static int field_w;

    rl(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((rl) this).field_x = new wf(param0, param1);
    }

    final int a(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((rl) this).a(false, (kh) null);
            return 7;
        }
        return 7;
    }

    final void g(byte param0) {
        if (param0 != 3) {
            return;
        }
        ((rl) this).field_x = ((rl) this).field_x.e(-1);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        ((rl) this).field_x.a(-29928, param1);
    }

    public static void d(boolean param0) {
        field_t = null;
        if (!param0) {
          field_v = null;
          field_u = null;
          field_s = null;
          field_v = null;
          return;
        } else {
          field_u = null;
          field_s = null;
          field_v = null;
          return;
        }
    }

    final static int r(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        boolean discarded$12 = ej.field_a.a(gv.field_u, true, oi.field_b, -116);
        ej.field_a.g((byte) -127);
        L0: while (true) {
          if (!es.a(true)) {
            if ((bf.field_a ^ -1) != 0) {
              var1 = bf.field_a;
              jsa.a(false, -1);
              return var1;
            } else {
              if (nfa.field_p) {
                return 3;
              } else {
                if (gsa.field_y != wt.field_d) {
                  if (!gva.field_b.b(108)) {
                    return 1;
                  } else {
                    if (param0 <= -87) {
                      if (gsa.field_y == kl.field_a) {
                        return 2;
                      } else {
                        return -1;
                      }
                    } else {
                      field_u = null;
                      if (gsa.field_y == kl.field_a) {
                        return 2;
                      } else {
                        return -1;
                      }
                    }
                  }
                } else {
                  return 1;
                }
              }
            }
          } else {
            boolean discarded$13 = ej.field_a.a((byte) 116, fna.field_h, kda.field_td);
            continue L0;
          }
        }
    }

    final boolean a(int param0, hca param1) {
        if (param0 > -114) {
            return false;
        }
        param1.a(((rl) this).field_x, (byte) 3);
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Finish Order";
        field_s = "Portals";
        field_w = 0;
    }
}
