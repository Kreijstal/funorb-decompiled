/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dqa extends mna {
    ne[] field_f;
    static jea field_e;

    final static jua a(int param0) {
        if (kl.field_a != fta.field_c) {
          if (mua.field_a != kl.field_a) {
            if (param0 == 3239) {
              return null;
            } else {
              return null;
            }
          } else {
            kl.field_a = fta.field_c;
            return ki.field_n;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static void a(String param0, int param1, String param2, int param3, int param4) {
        Object var6 = null;
        pq.field_g.field_sb = param2;
        pq.field_g.field_G = pq.field_g.field_G + mka.field_b.field_G;
        pq.field_g.field_ib = param3;
        pq.field_g.field_r = param0;
        mka.field_b.field_qb = mka.field_b.field_qb + mka.field_b.field_G;
        mka.field_b.field_G = param1;
        if (param4 < 118) {
          var6 = null;
          dqa.a((cn) null, (cn) null, (byte) 102, (cn) null);
          pq.field_g.field_G = pq.field_g.field_G - mka.field_b.field_G;
          mka.field_b.field_qb = mka.field_b.field_qb - mka.field_b.field_G;
          return;
        } else {
          pq.field_g.field_G = pq.field_g.field_G - mka.field_b.field_G;
          mka.field_b.field_qb = mka.field_b.field_qb - mka.field_b.field_G;
          return;
        }
    }

    dqa(ne[] param0) {
        ((dqa) this).field_f = param0;
    }

    public static void a(byte param0) {
        if (param0 != 11) {
            return;
        }
        field_e = null;
    }

    final static int a(boolean param0, int param1, int param2) {
        if (!param0) {
            return 28;
        }
        return (1 << -1 + param2) + param1;
    }

    final static void a(cn param0, cn param1, byte param2, cn param3) {
        qra.field_l = (d) (Object) new sja(param1, param0, param3);
        if (param2 != 55) {
            field_e = null;
        }
    }

    static {
    }
}
