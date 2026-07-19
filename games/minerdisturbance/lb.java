/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends pi {
    static ea[] field_x;
    static String field_t;
    int field_n;
    int field_s;
    int field_p;
    lb field_v;
    static kh field_y;
    static boolean field_q;
    int field_o;
    static int field_r;
    static int field_w;
    int field_u;

    final static bj a(int param0, int param1) {
        if (param0 != 1) {
            return (bj) null;
        }
        return eg.a(74, param1, false, false, true, 1);
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = 0;
        if (param0) {
          lb.a(-94);
          var3 = param1 >>> -1033791905;
          return -var3 + (var3 + param1) / param2;
        } else {
          var3 = param1 >>> -1033791905;
          return -var3 + (var3 + param1) / param2;
        }
    }

    public static void a(int param0) {
        field_x = null;
        if (param0 != 0) {
            return;
        }
        field_y = null;
        field_t = null;
    }

    lb(int param0, int param1, int param2, int param3, int param4) {
        this.field_n = param0;
        this.field_u = param2;
        this.field_p = param3;
        this.field_s = param1;
        this.field_o = param4;
    }

    static {
        field_t = "Torch: Illuminates the caves and shafts around you.";
        field_q = false;
        field_r = 0;
        field_y = new kh();
        field_w = 33;
    }
}
