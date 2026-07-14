/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static im field_b;
    static java.awt.Font field_a;

    final static byte[] a(Object param0, boolean param1, int param2) {
        byte[] var3 = null;
        ll var4 = null;
        if (param0 != null) {
          if (param2 == 25966) {
            if (param0 instanceof byte[]) {
              var3 = (byte[]) param0;
              if (!param1) {
                return var3;
              } else {
                return n.a(var3, (byte) 117);
              }
            } else {
              if (param0 instanceof ll) {
                var4 = (ll) param0;
                return var4.a((byte) 99);
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            field_a = null;
            if (param0 instanceof byte[]) {
              var3 = (byte[]) param0;
              if (!param1) {
                return var3;
              } else {
                return n.a(var3, (byte) 117);
              }
            } else {
              if (param0 instanceof ll) {
                var4 = (ll) param0;
                return var4.a((byte) 99);
              } else {
                throw new IllegalArgumentException();
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != -14) {
            field_a = null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(boolean param0, int param1, int param2, pf param3) {
        ui.field_b = param3;
        if (param0) {
            return;
        }
        ak.field_z = param1;
        df.field_d = param2;
    }

    final static qg a(int param0, int param1, ki param2, int param3) {
        if (param3 == 26052) {
          if (!pk.a(param3 + -26108, param0, param2, param1)) {
            return null;
          } else {
            return bd.b(true);
          }
        } else {
          field_b = null;
          if (!pk.a(param3 + -26108, param0, param2, param1)) {
            return null;
          } else {
            return bd.b(true);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new im();
    }
}
