/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dr extends td {
    static ee field_p;

    public static void c(boolean param0) {
        if (!param0) {
            return;
        }
        field_p = null;
    }

    dr(int param0, aga param1) {
        super(param0, param1);
    }

    final static ee b(int param0) {
        ee var1 = null;
        var1 = new ee(ok.field_Bb, kh.field_r, fl.field_j[0], fd.field_D[0], lq.field_A[0], eha.field_s[0], baa.field_P[0], hk.field_f);
        if (param0 != -32124) {
          field_p = null;
          al.b(-18073);
          return var1;
        } else {
          al.b(-18073);
          return var1;
        }
    }

    final static int[] c(int param0) {
        if (!o.d((byte) 80)) {
          if (bf.field_h[wca.field_n].c((byte) 95)) {
            if (!bf.field_h[wca.field_n].field_i) {
              return bf.field_h[wca.field_n].field_c[bf.field_h[wca.field_n].field_a - 1];
            } else {
              if (param0 >= 90) {
                return null;
              } else {
                return null;
              }
            }
          } else {
            if (!bf.field_h[wca.field_n].field_i) {
              if (!bf.field_h[wca.field_n].field_i) {
                return bf.field_h[wca.field_n].field_c[bf.field_h[wca.field_n].field_a - 1];
              } else {
                if (param0 >= 90) {
                  return null;
                } else {
                  return null;
                }
              }
            } else {
              return bf.field_h[wca.field_n].field_c[bf.field_h[wca.field_n].field_e];
            }
          }
        } else {
          return null;
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        wga var4 = null;
        var3 = ((dr) this).field_h.a(param1 ^ 20, param0);
        var4 = new wga(((dr) this).field_g, new nq(var3));
        var4.field_o.a((bw) (Object) new iv(new nq(var3), false, 1, 0, 33), true);
        if (param1 != 3) {
          return null;
        } else {
          return (ii) (Object) var4;
        }
    }

    static {
    }
}
