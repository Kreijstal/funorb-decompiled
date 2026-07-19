/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static long field_d;
    static String field_b;
    static int field_a;
    static int field_e;
    static int field_f;
    static String field_c;

    final static void a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          ih.b((byte) 108);
          if (qd.field_j != null) {
            nd.a(-26621, qd.field_j);
            break L0;
          } else {
            break L0;
          }
        }
        dd.a(-91);
        ra.a(126);
        if (param0) {
          L1: {
            field_d = -85L;
            if (param0) {
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            } else {
              stackOut_11_0 = 1;
              stackIn_13_0 = stackOut_11_0;
              break L1;
            }
          }
          L2: {
            id.a(stackIn_13_0 != 0);
            if (qb.e((byte) 58)) {
              pg.field_fb.f(1, 950);
              ue.a((byte) -96, 0);
              break L2;
            } else {
              break L2;
            }
          }
          oj.c(-2290);
          return;
        } else {
          stackOut_4_0 = 1;
          stackIn_6_0 = stackOut_4_0;
          L3: {
            id.a(stackIn_6_0 != 0);
            if (qb.e((byte) 58)) {
              pg.field_fb.f(1, 950);
              ue.a((byte) -96, 0);
              break L3;
            } else {
              break L3;
            }
          }
          oj.c(-2290);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -6081) {
            field_e = -69;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        field_b = "Email (Login):";
        field_e = -1;
        field_c = "Names cannot contain consecutive spaces";
    }
}
