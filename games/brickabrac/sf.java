/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends vb implements je {
    static jp[] field_V;
    static int field_Z;
    private int field_ab;
    static String field_bb;
    static String field_X;
    static jp[] field_U;
    private ia field_W;
    static jp field_cb;
    static jp field_Y;

    final void n(int param0) {
        if (param0 < 7) {
          L0: {
            sf.o(8);
            super.n(90);
            if (((sf) this).field_W != null) {
              ((sf) this).field_W.a(false);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            super.n(90);
            if (((sf) this).field_W != null) {
              ((sf) this).field_W.a(false);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(ia param0, byte param1) {
        try {
            if (param1 != -68) {
                ((sf) this).n(48);
            }
            ((sf) this).field_W = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "sf.AB(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    sf(String param0, uh param1, int param2) {
        super(param0, param1, param2);
    }

    public final ia a(int param0) {
        if (param0 != -11011) {
            return null;
        }
        return ((sf) this).field_W;
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((sf) this).field_ab = -param2 + -((sf) this).field_o + pq.field_k;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "sf.WA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final String d(int param0) {
        if (((sf) this).field_q) {
          if (((sf) this).field_z != null) {
            if (param0 < 6) {
              ((sf) this).field_ab = -5;
              ap.a(-((sf) this).field_ab - (-((sf) this).field_t - pq.field_k), po.field_a, (byte) 79);
              return ((sf) this).field_z;
            } else {
              ap.a(-((sf) this).field_ab - (-((sf) this).field_t - pq.field_k), po.field_a, (byte) 79);
              return ((sf) this).field_z;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void o(int param0) {
        field_U = null;
        field_cb = null;
        field_bb = null;
        field_X = null;
        field_Y = null;
        if (param0 != -16124) {
          sf.o(121);
          field_V = null;
          return;
        } else {
          field_V = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = "The account name you use to access RuneScape and other Jagex.com games";
        field_bb = "Unpacking music";
    }
}
