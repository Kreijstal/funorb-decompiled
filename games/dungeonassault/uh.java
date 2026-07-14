/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends rm implements qn {
    private dp field_W;
    private int field_U;
    static String field_V;

    public static void i(byte param0) {
        if (param0 != -41) {
            field_V = null;
            field_V = null;
            return;
        }
        field_V = null;
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        super.a(param0, param1, param2, param3);
        ((uh) this).field_U = -((uh) this).field_q + hj.field_S + -param0;
        if (!param3) {
            Object var6 = null;
            ((uh) this).a((dp) null, -106);
        }
    }

    final void a(dp param0, int param1) {
        ((uh) this).field_W = param0;
        if (param1 != 10508) {
            ((uh) this).field_U = 28;
        }
    }

    public final dp a(int param0) {
        if (param0 >= -74) {
            field_V = null;
            return ((uh) this).field_W;
        }
        return ((uh) this).field_W;
    }

    final void n(int param0) {
        super.n(param0);
        if (null != ((uh) this).field_W) {
            ((uh) this).field_W.b(2899);
        }
    }

    final String c(byte param0) {
        if (param0 >= 3) {
          if (((uh) this).field_u) {
            if (((uh) this).field_i == null) {
              return null;
            } else {
              vj.a((byte) 121, eh.field_h, -((uh) this).field_U + (((uh) this).field_x + hj.field_S));
              return ((uh) this).field_i;
            }
          } else {
            return null;
          }
        } else {
          ((uh) this).n(111);
          if (((uh) this).field_u) {
            if (((uh) this).field_i == null) {
              return null;
            } else {
              vj.a((byte) 121, eh.field_h, -((uh) this).field_U + (((uh) this).field_x + hj.field_S));
              return ((uh) this).field_i;
            }
          } else {
            return null;
          }
        }
    }

    uh(String param0, pg param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "You have not yet been raided.";
    }
}
