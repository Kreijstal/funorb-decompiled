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
            if (this.field_W != null) {
              this.field_W.a(false);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            super.n(90);
            if (this.field_W != null) {
              this.field_W.a(false);
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
                this.n(48);
            }
            this.field_W = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "sf.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    sf(String param0, uh param1, int param2) {
        super(param0, param1, param2);
    }

    public final ia a(int param0) {
        if (param0 != -11011) {
            return (ia) null;
        }
        return this.field_W;
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_ab = -param2 + -this.field_o + pq.field_k;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "sf.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String d(int param0) {
        if (this.field_q) {
          if (this.field_z != null) {
            if (param0 < 6) {
              this.field_ab = -5;
              ap.a(-this.field_ab - (-this.field_t - pq.field_k), po.field_a, (byte) 79);
              return this.field_z;
            } else {
              ap.a(-this.field_ab - (-this.field_t - pq.field_k), po.field_a, (byte) 79);
              return this.field_z;
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
        field_X = "The account name you use to access RuneScape and other Jagex.com games";
        field_bb = "Unpacking music";
    }
}
