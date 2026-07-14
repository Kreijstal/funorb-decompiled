/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends hf implements of {
    static int field_R;
    private int field_E;
    static int field_Q;
    private ba field_P;

    final void a(int param0, int param1, lk param2, int param3) {
        this.a(param0, param1, param2, param3 ^ 0);
        ((v) this).field_E = -param1 + eg.field_b + -((v) this).field_o;
        if (param3 != 3) {
            ((v) this).k(25);
        }
    }

    final String b(byte param0) {
        if (param0 == -79) {
          if (((v) this).field_j) {
            if (null == ((v) this).field_n) {
              return null;
            } else {
              wc.a(ij.field_e, -16923, eg.field_b + (-((v) this).field_E + ((v) this).field_h));
              return ((v) this).field_n;
            }
          } else {
            return null;
          }
        } else {
          ((v) this).k(107);
          if (((v) this).field_j) {
            if (null == ((v) this).field_n) {
              return null;
            } else {
              wc.a(ij.field_e, -16923, eg.field_b + (-((v) this).field_E + ((v) this).field_h));
              return ((v) this).field_n;
            }
          } else {
            return null;
          }
        }
    }

    final void k(int param0) {
        this.k(param0 ^ 0);
        if (param0 != 64) {
          return;
        } else {
          L0: {
            if (null != ((v) this).field_P) {
              ((v) this).field_P.a(param0 + -171);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public final ba a(int param0) {
        int var2 = -99 / ((28 - param0) / 48);
        return ((v) this).field_P;
    }

    final void a(byte param0, ba param1) {
        ((v) this).field_P = param1;
        if (param0 != 68) {
            lk var4 = (lk) null;
            ((v) this).a(-14, 64, (lk) null, 35);
        }
    }

    v(String param0, pl param1, int param2) {
        super(param0, param1, param2);
    }

    final static int g(byte param0) {
        if (param0 != -111) {
            field_R = 8;
            return cc.field_e;
        }
        return cc.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = 64;
    }
}
