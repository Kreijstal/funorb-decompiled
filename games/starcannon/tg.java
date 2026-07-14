/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends ik {
    int field_v;
    static sk field_x;
    uf field_t;
    static int field_y;
    static String field_w;
    byte[] field_u;

    final byte[] f(int param0) {
        if (!((tg) this).field_r) {
          if (param0 != 0) {
            ((tg) this).field_t = null;
            return ((tg) this).field_u;
          } else {
            return ((tg) this).field_u;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static ma d(byte param0) {
        if (param0 != 10) {
          field_x = null;
          return new ma(we.a(29084), ek.a(-86));
        } else {
          return new ma(we.a(29084), ek.a(-86));
        }
    }

    public static void h(int param0) {
        field_x = null;
        field_w = null;
        int var1 = 34 % ((-11 - param0) / 38);
    }

    final int e(int param0) {
        if (param0 == -29144) {
          if (((tg) this).field_r) {
            return 0;
          } else {
            return 100;
          }
        } else {
          int discarded$6 = ((tg) this).e(69);
          if (((tg) this).field_r) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    final static ig a(int param0, String param1) {
        if (jl.field_a != ie.field_x) {
          if (param0 <= -27) {
            if (ie.field_x == s.field_f) {
              if (!param1.equals((Object) (Object) te.field_a)) {
                mf.field_a = null;
                ie.field_x = jl.field_a;
                te.field_a = param1;
                return null;
              } else {
                ie.field_x = cl.field_k;
                return mf.field_a;
              }
            } else {
              mf.field_a = null;
              ie.field_x = jl.field_a;
              te.field_a = param1;
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    tg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new sk();
        field_w = "Player names can be up to 12 letters, numbers and underscores";
    }
}
