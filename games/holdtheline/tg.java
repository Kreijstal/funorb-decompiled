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
        if (param1 == 5) {
          if ((d.field_c[param0] ^ -1) != 0) {
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
        } else {
          return;
        }
    }

    tg(float param0, int param1, boolean param2) {
        this.field_c = param2 ? true : false;
        this.field_b = param1;
        this.field_e = param0;
    }

    abstract qm a(boolean param0, float param1);

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -16) {
            return;
        }
        field_a = null;
        field_f = null;
        field_g = null;
    }

    static {
        field_d = new fd();
        field_a = new int[]{2, 5, 5};
        field_f = "More suggestions";
        field_g = new sh();
    }
}
