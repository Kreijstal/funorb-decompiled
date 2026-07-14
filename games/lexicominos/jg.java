/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends tj {
    private g field_o;
    private boolean field_l;
    private String field_n;
    static db field_m;

    jg(rl param0, rl param1) {
        super(param0);
        ((jg) this).field_n = "";
        ((jg) this).field_l = false;
        ((jg) this).field_o = new g(param0, param1);
    }

    final String a(byte param0, String param1) {
        if (((jg) this).field_o.a(0, param1) == ni.field_b) {
          return ((jg) this).field_o.a((byte) -126, param1);
        } else {
          if (((jg) this).a(param0 ^ -126, param1) != ni.field_b) {
            if (param0 != -126) {
              ((jg) this).field_n = null;
              return fj.field_x;
            } else {
              return fj.field_x;
            }
          } else {
            return me.field_t;
          }
        }
    }

    final static mb c(boolean param0) {
        if (param0) {
            return null;
        }
        if (bk.field_c == c.field_m) {
            throw new IllegalStateException();
        }
        if (!(c.field_o != bk.field_c)) {
            bk.field_c = c.field_m;
            return li.field_T;
        }
        return null;
    }

    final static db[] a(int param0, int param1) {
        db[] var3 = new db[9];
        db[] var2 = var3;
        var3[param1] = gf.a((byte) -76, 64, param0);
        return var2;
    }

    public static void e(int param0) {
        if (param0 != -25048) {
            jg.e(-58);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final sc a(int param0, String param1) {
        la var3 = null;
        sc stackIn_7_0 = null;
        sc stackIn_12_0 = null;
        sc stackOut_11_0 = null;
        sc stackOut_10_0 = null;
        sc stackOut_6_0 = null;
        sc stackOut_5_0 = null;
        if (((jg) this).field_o.a(param0, param1) == ni.field_b) {
          return ni.field_b;
        } else {
          if (!param1.equals((Object) (Object) ((jg) this).field_n)) {
            var3 = ua.a(param1, 99);
            if (!var3.b(12)) {
              return be.field_q;
            } else {
              L0: {
                ((jg) this).field_n = param1;
                ((jg) this).field_l = var3.a(12);
                if (((jg) this).field_l) {
                  stackOut_11_0 = rh.field_p;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_10_0 = ni.field_b;
                  stackIn_12_0 = stackOut_10_0;
                  break L0;
                }
              }
              return stackIn_12_0;
            }
          } else {
            L1: {
              if (((jg) this).field_l) {
                stackOut_6_0 = rh.field_p;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = ni.field_b;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0;
          }
        }
    }

    static {
    }
}
