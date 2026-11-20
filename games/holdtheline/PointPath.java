/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PointPath {
    int field_b;
    boolean field_c;
    static ValidationState field_d;
    float field_e;
    static sh field_g;
    static int[] field_a;
    static String field_f;

    final static void a(int param0, int param1, int param2) {
        if (param1 != 5) {
          return;
        }
        if (d.field_c[param0] == -1) {
          d.field_c[param0] = param2;
          GrowableStringList.a(0);
          return;
        }
        if (d.field_c[param0] > param2) {
          d.field_c[param0] = param2;
          GrowableStringList.a(0);
          return;
        }
    }

    PointPath(float param0, int param1, boolean param2) {
        this.field_c = param2 ? true : false;
        this.field_b = param1;
        this.field_e = param0;
    }

    abstract Point2i pointAt(boolean param0, float param1);

    public static void clearSharedReferences(byte param0) {
        field_d = null;
        if (param0 != -16) {
          return;
        }
        field_a = null;
        field_f = null;
        field_g = null;
    }

    static {
        field_d = new ValidationState();
        field_a = new int[]{2, 5, 5};
        field_f = "More suggestions";
        field_g = new sh();
    }
}
