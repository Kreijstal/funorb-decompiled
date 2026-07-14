/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class um implements vc {
    private long field_b;
    static int field_a;

    final static tk a(byte param0, String param1) {
        Object var3 = null;
        if (gl.field_E.a(90)) {
          if (!param1.equals((Object) (Object) gl.field_E.c(0))) {
            gl.field_E = co.a(param1, -100);
            if (param0 != 110) {
              var3 = null;
              tk discarded$6 = um.a((byte) -101, (String) null);
              return gl.field_E;
            } else {
              return gl.field_E;
            }
          } else {
            if (param0 != 110) {
              var3 = null;
              tk discarded$7 = um.a((byte) -101, (String) null);
              return gl.field_E;
            } else {
              return gl.field_E;
            }
          }
        } else {
          if (param0 != 110) {
            var3 = null;
            tk discarded$8 = um.a((byte) -101, (String) null);
            return gl.field_E;
          } else {
            return gl.field_E;
          }
        }
    }

    public final void a(int param0) {
        ((um) this).field_b = pd.a(-22826);
        if (param0 != -7674) {
            ((um) this).field_b = -52L;
        }
    }

    public final String b(byte param0) {
        int var2 = 0;
        if (!((um) this).b(110)) {
          if (pd.a(-22826) < 350L + ((um) this).field_b) {
            return null;
          } else {
            var2 = -9 / ((-33 - param0) / 57);
            return ((um) this).c(-111);
          }
        } else {
          return null;
        }
    }

    abstract rh c(byte param0);

    abstract String c(int param0);

    public final rh a(byte param0) {
        if (param0 > -71) {
            ((um) this).field_b = 85L;
            if (((um) this).b(121)) {
                return di.field_L;
            }
            if (!(pd.a(-22826) >= ((um) this).field_b + 350L)) {
                return se.field_l;
            }
            return ((um) this).c((byte) -7);
        }
        if (((um) this).b(121)) {
            return di.field_L;
        }
        if (!(pd.a(-22826) >= ((um) this).field_b + 350L)) {
            return se.field_l;
        }
        return ((um) this).c((byte) -7);
    }

    static {
    }
}
