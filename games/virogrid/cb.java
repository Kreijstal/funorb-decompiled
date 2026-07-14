/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cb {
    static hh field_a;
    static String field_b;
    static ob field_c;
    static mg[] field_d;

    abstract int a(int param0);

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param0 == -13079) {
          if (!wg.field_f) {
            if (ac.field_e) {
              return vl.a((byte) 103, param3, param2);
            } else {
              if (bi.a(param3, param2, true)) {
                return true;
              } else {
                if (dh.field_n) {
                  return false;
                } else {
                  return fn.a(param1, param2, (byte) -97);
                }
              }
            }
          } else {
            return fh.field_c.a(um.field_Gb, nm.field_d, -99);
          }
        } else {
          field_c = null;
          if (!wg.field_f) {
            if (ac.field_e) {
              return vl.a((byte) 103, param3, param2);
            } else {
              if (bi.a(param3, param2, true)) {
                return true;
              } else {
                if (dh.field_n) {
                  return false;
                } else {
                  return fn.a(param1, param2, (byte) -97);
                }
              }
            }
          } else {
            return fh.field_c.a(um.field_Gb, nm.field_d, -99);
          }
        }
    }

    abstract void b(int param0, java.awt.Component param1);

    public static void b(int param0) {
        field_a = null;
        if (param0 != 3981) {
            return;
        }
        field_c = null;
        field_b = null;
        field_d = null;
    }

    abstract void a(int param0, java.awt.Component param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Zoom in";
        field_a = new hh();
    }
}
