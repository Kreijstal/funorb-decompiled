/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static String field_a;
    static int field_c;
    static wk field_e;
    static int field_b;
    static String field_f;
    static int[] field_d;

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        if (ei.field_q != 13) {
          var3 = -28 / ((35 - param0) / 54);
          if (ei.field_q != 102) {
            if (jk.field_i != null) {
              if (!jk.field_i.a(25542, param2, param1)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            jk.field_i.l(-128);
            return true;
          }
        } else {
          pm.a((byte) -126);
          return true;
        }
    }

    final static int a(byte param0, byte[] param1, int param2) {
        if (param0 != -107) {
            field_c = -102;
            return ok.a(0, param1, param2, (byte) 109);
        }
        return ok.a(0, param1, param2, (byte) 109);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        if (param0) {
            return;
        }
        field_f = null;
    }

    final static boolean a(byte param0) {
        if (param0 != -57) {
            field_e = null;
            return ve.a(ge.field_m, 1, 25);
        }
        return ve.a(ge.field_m, 1, 25);
    }

    final static void b(boolean param0) {
        if (param0) {
            ba.b(true);
            pa.a(12105, ti.field_m);
            return;
        }
        pa.a(12105, ti.field_m);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unpacking music";
        field_c = 0;
        field_f = null;
    }
}
