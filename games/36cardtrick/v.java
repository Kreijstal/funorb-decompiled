/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends hf implements of {
    static int field_R;
    private int field_E;
    static int field_Q;
    private ba field_P;

    final void a(int param0, int param1, lk param2, int param3) {
        try {
            super.a(param0, param1, param2, param3 ^ 0);
            this.field_E = -param1 + eg.field_b + -this.field_o;
            if (param3 != 3) {
                this.k(25);
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "v.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String b(byte param0) {
        if (param0 == -79) {
          if (this.field_j) {
            if (null == this.field_n) {
              return null;
            } else {
              wc.a(ij.field_e, -16923, eg.field_b + (-this.field_E + this.field_h));
              return this.field_n;
            }
          } else {
            return null;
          }
        } else {
          this.k(107);
          if (this.field_j) {
            if (null == this.field_n) {
              return null;
            } else {
              wc.a(ij.field_e, -16923, eg.field_b + (-this.field_E + this.field_h));
              return this.field_n;
            }
          } else {
            return null;
          }
        }
    }

    final void k(int param0) {
        super.k(param0 ^ 0);
        if (param0 != 64) {
          return;
        } else {
          L0: {
            if (null != this.field_P) {
              this.field_P.a(param0 + -171);
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
        return this.field_P;
    }

    final void a(byte param0, ba param1) {
        try {
            this.field_P = param1;
            if (param0 != 68) {
                lk var4 = (lk) null;
                this.a(-14, 64, (lk) null, 35);
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "v.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        field_Q = 64;
    }
}
