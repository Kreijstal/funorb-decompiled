/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static uf field_a;
    static int field_c;
    static int field_b;

    final static byte[] a(int param0, boolean param1, Object param2) {
        byte[] var3 = null;
        ah var4 = null;
        if (param2 != null) {
          if (param0 == 0) {
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (!param1) {
                return var3;
              } else {
                return rd.a((byte) -82, var3);
              }
            } else {
              if (param2 instanceof ah) {
                var4 = (ah) param2;
                return var4.a(0);
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        if (param0 >= -94) {
            qf.b(88);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (nk.field_a == null) {
          il.field_b = new q();
          ed.field_c.a(10768, (lk) (Object) il.field_b);
          if (param0 != 0) {
            field_b = 53;
            return;
          } else {
            return;
          }
        } else {
          nk.field_a.a(true);
          il.field_b = new q();
          ed.field_c.a(10768, (lk) (Object) il.field_b);
          if (param0 == 0) {
            return;
          } else {
            field_b = 53;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new uf();
        field_b = 0;
    }
}
