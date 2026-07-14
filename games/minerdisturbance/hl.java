/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl implements uj {
    static String field_c;
    static int field_b;
    static wh field_a;

    public final void a(boolean param0) {
        if (param0) {
            field_a = null;
            bc.field_a = 4;
            tb.field_a = 2;
            return;
        }
        bc.field_a = 4;
        tb.field_a = 2;
    }

    final static int a(String param0, boolean param1, int param2) {
        if (param2 == -15388) {
          if (!param1) {
            return gh.field_b.a(param0);
          } else {
            return ta.field_b.a(param0);
          }
        } else {
          boolean discarded$6 = hl.b((byte) 12);
          if (!param1) {
            return gh.field_b.a(param0);
          } else {
            return ta.field_b.a(param0);
          }
        }
    }

    final static boolean b(byte param0) {
        int var1 = 0;
        var1 = -4 / ((58 - param0) / 61);
        if (20 <= af.field_u) {
          if (bi.a(-11)) {
            if ((a.field_d ^ -1) < -1) {
              if (wc.b(false)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public final String a(byte param0) {
        int var2 = 29 / ((param0 - -33) / 62);
        return "Make Boulders";
    }

    public static void b(boolean param0) {
        if (param0) {
            field_c = null;
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static int a(int param0) {
        if (param0 >= -63) {
            return -104;
        }
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Burnt the Brightest";
    }
}
