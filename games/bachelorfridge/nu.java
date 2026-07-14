/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nu {
    static kia field_h;
    static kv field_e;
    static String field_g;
    static sna field_c;
    static boolean field_b;
    static String field_a;
    static sna field_f;
    static String field_d;

    abstract void a(byte param0, byte[] param1);

    abstract byte[] a(boolean param0);

    public static void a(int param0) {
        if (param0 <= 64) {
          field_a = null;
          field_e = null;
          field_h = null;
          field_g = null;
          field_a = null;
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_h = null;
          field_g = null;
          field_a = null;
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        }
    }

    final static int a(String param0, lu param1, int param2) {
        int var3 = 0;
        byte[] var4 = null;
        CharSequence var5 = null;
        var3 = param1.field_g;
        var5 = (CharSequence) (Object) param0;
        var4 = bv.a(18019, var5);
        param1.b(var4.length, true);
        if (param2 != -21840) {
          return -15;
        } else {
          param1.field_g = param1.field_g + jka.field_l.a(var4, var4.length, param2 + 42697, param1.field_h, 0, param1.field_g);
          return -var3 + param1.field_g;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Exploiting a bug";
        field_g = "You will win in <%0> turns!";
        field_d = "<%0> is already on your ignore list.";
    }
}
