/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends bm implements mc {
    static int field_K;
    private int field_M;
    static gb field_N;
    private sp field_L;
    static String field_J;

    public final sp a(int param0) {
        if (param0 != 0) {
            ((kk) this).g((byte) -126);
            return ((kk) this).field_L;
        }
        return ((kk) this).field_L;
    }

    final void a(sp param0, int param1) {
        ((kk) this).field_L = param0;
        if (param1 != 1472) {
            field_N = (gb) null;
        }
    }

    final void g(byte param0) {
        this.g(param0);
        if (null != ((kk) this).field_L) {
            ((kk) this).field_L.a((byte) 115);
        }
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        this.a((byte) 46, param1, param2, param3);
        if (param0 <= 13) {
          sp discarded$2 = ((kk) this).a(113);
          ((kk) this).field_M = -((kk) this).field_p + (ic.field_b - param3);
          return;
        } else {
          ((kk) this).field_M = -((kk) this).field_p + (ic.field_b - param3);
          return;
        }
    }

    final static int a(la param0, byte param1) {
        la var3 = null;
        if (param0 != la.field_a) {
          if (param0 != la.field_j) {
            if (param0 != la.field_e) {
              if (la.field_h != param0) {
                if (param0 != la.field_b) {
                  if (la.field_f != param0) {
                    if (param0 != la.field_d) {
                      if (param0 == la.field_i) {
                        return 5126;
                      } else {
                        if (param1 >= -91) {
                          var3 = (la) null;
                          int discarded$2 = kk.a((la) null, (byte) -56);
                          throw new IllegalArgumentException("");
                        } else {
                          throw new IllegalArgumentException("");
                        }
                      }
                    } else {
                      return 5131;
                    }
                  } else {
                    return 5125;
                  }
                } else {
                  return 5123;
                }
              } else {
                return 5121;
              }
            } else {
              return 5124;
            }
          } else {
            return 5122;
          }
        } else {
          return 5120;
        }
    }

    kk(String param0, no param1, int param2) {
        super(param0, param1, param2);
    }

    final String c(byte param0) {
        if (param0 < -41) {
          if (((kk) this).field_g) {
            if (((kk) this).field_k == null) {
              return null;
            } else {
              gq.a(true, ((kk) this).field_q + (-((kk) this).field_M + ic.field_b), cf.field_g);
              return ((kk) this).field_k;
            }
          } else {
            return null;
          }
        } else {
          return (String) null;
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_N = (gb) null;
            field_J = null;
            field_N = null;
            return;
        }
        field_J = null;
        field_N = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = 0;
        field_N = new gb(0.5, 20, 0, 100, 1, 7.0, 9.0, 16, 0);
        field_J = "Login: ";
    }
}
