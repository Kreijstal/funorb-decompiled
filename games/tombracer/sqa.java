/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sqa {
    static String field_a;
    vna field_b;

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != -3) {
            return false;
        }
        return ega.a(10, param0, true, true);
    }

    abstract void a(byte param0);

    final void a(int param0, fm param1) {
        ((sqa) this).field_b.b((byte) -122, (vg) (Object) param1);
        if (param0 >= -84) {
            field_a = null;
        }
    }

    final static boolean a(int param0, int param1, int[] param2, String param3, long param4) {
        int var6 = 0;
        var6 = -60 % ((0 - param1) / 49);
        if (param2 != null) {
          if (-3 == (param0 ^ -1)) {
            if (ota.a(param4, (byte) 13, param3)) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    abstract void a(int param0, boolean param1);

    public static void b(byte param0) {
        field_a = null;
        if (param0 > -127) {
            field_a = null;
        }
    }

    protected sqa() {
        ((sqa) this).field_b = new vna();
    }

    final void c(byte param0) {
        if (param0 < 108) {
            ((sqa) this).c((byte) 15);
            ((sqa) this).field_b.d(8);
            return;
        }
        ((sqa) this).field_b.d(8);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Try again";
    }
}
