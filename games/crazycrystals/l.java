/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class l {
    static u field_b;
    static String field_c;
    static String field_a;
    static db field_d;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 != -101) {
            field_c = null;
        }
    }

    final static byte[] a(byte param0, boolean param1, Object param2) {
        byte[] var3 = null;
        qb var4 = null;
        if (param0 == 110) {
          if (param2 != null) {
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (!param1) {
                return var3;
              } else {
                return sm.a(30, var3);
              }
            } else {
              if (param2 instanceof qb) {
                var4 = (qb) param2;
                return var4.a(78);
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            return null;
          }
        } else {
          field_c = null;
          if (param2 != null) {
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (!param1) {
                return var3;
              } else {
                return sm.a(30, var3);
              }
            } else {
              if (param2 instanceof qb) {
                var4 = (qb) param2;
                return var4.a(78);
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            return null;
          }
        }
    }

    abstract l b(byte param0);

    void c(byte param0) {
        if (param0 < 123) {
            ((l) this).c((byte) 2);
        }
    }

    abstract l a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Three-Player Puzzles";
        field_b = new u();
        field_a = "Loading extra data";
    }
}
