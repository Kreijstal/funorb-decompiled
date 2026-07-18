/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tg {
    int field_b;
    boolean field_c;
    static fd field_d;
    float field_e;
    static sh field_g;
    static int[] field_a;
    static String field_f;

    final static void a(int param0, int param1, int param2) {
        if (d.field_c[param0] != -1) {
          if (d.field_c[param0] <= param2) {
            return;
          } else {
            d.field_c[param0] = param2;
            tn.a(0);
            return;
          }
        } else {
          d.field_c[param0] = param2;
          tn.a(0);
          return;
        }
    }

    tg(float param0, int param1, boolean param2) {
        ((tg) this).field_c = param2 ? true : false;
        ((tg) this).field_b = param1;
        ((tg) this).field_e = param0;
    }

    abstract qm a(boolean param0, float param1);

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        field_f = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new fd();
        field_a = new int[]{2, 5, 5};
        field_f = "More suggestions";
        field_g = new sh();
    }
}
