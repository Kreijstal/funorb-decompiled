/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends kd {
    static td field_i;
    static int field_o;
    static String field_j;
    static int field_l;
    private String field_k;
    static wf field_m;
    private int field_h;
    int field_n;

    final void c(byte param0) {
        if (param0 <= -17) {
          int fieldTemp$4 = ((gd) this).field_h - 1;
          ((gd) this).field_h = ((gd) this).field_h - 1;
          if (tb.field_a.field_E > fieldTemp$4) {
            ((gd) this).b((byte) -123);
            return;
          } else {
            return;
          }
        } else {
          field_i = null;
          int fieldTemp$5 = ((gd) this).field_h - 1;
          ((gd) this).field_h = ((gd) this).field_h - 1;
          if (tb.field_a.field_E <= fieldTemp$5) {
            return;
          } else {
            ((gd) this).b((byte) -123);
            return;
          }
        }
    }

    final void a(byte param0) {
        tb.field_a.a(((gd) this).field_k, ((gd) this).field_n, ((gd) this).field_h, 0, -1);
        if (param0 != -34) {
            ((gd) this).c((byte) -119);
        }
    }

    final static boolean d(byte param0) {
        if (param0 != -53) {
            boolean discarded$0 = gd.d((byte) 85);
            return nh.field_a.b(-79);
        }
        return nh.field_a.b(-79);
    }

    public static void e(byte param0) {
        field_j = null;
        field_m = null;
        field_i = null;
    }

    gd(int param0, int param1, int param2) {
        ((gd) this).field_k = Integer.toString(param0);
        ((gd) this).field_h = param2;
        ((gd) this).field_n = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Please check if address is correct";
    }
}
