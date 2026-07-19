/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends hl {
    od field_p;
    static String field_r;
    int field_s;
    static String field_o;
    static String[] field_i;
    static String field_m;
    int field_l;
    int field_k;
    int field_n;
    static String field_q;
    int field_j;

    public static void a(int param0) {
        w discarded$2 = null;
        if (param0 <= 22) {
          discarded$2 = od.a(true);
          field_q = null;
          field_o = null;
          field_i = null;
          field_m = null;
          field_r = null;
          return;
        } else {
          field_q = null;
          field_o = null;
          field_i = null;
          field_m = null;
          field_r = null;
          return;
        }
    }

    final static w a(boolean param0) {
        if (param0) {
            od.a(-87);
            return (w) ((Object) new mk());
        }
        return (w) ((Object) new mk());
    }

    od(int param0, int param1, int param2, int param3, int param4) {
        this.field_s = param2;
        this.field_l = param4;
        this.field_n = param3;
        this.field_j = param1;
        this.field_k = param0;
    }

    static {
        field_r = "Names can only contain letters, numbers, spaces and underscores";
        field_i = new String[]{"The Championship", "The Championship II", "Power-ups", "Power-ups II", "Power-ups III", "Two-player", "Other modes"};
        field_o = "Passwords must be between 5 and 20 letters and numbers";
        field_q = "OFF";
        field_m = "Name is available";
    }
}
