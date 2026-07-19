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
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 <= -17) {
          fieldTemp$4 = this.field_h - 1;
          this.field_h = this.field_h - 1;
          if (tb.field_a.field_E > fieldTemp$4) {
            this.b((byte) -123);
            return;
          } else {
            return;
          }
        } else {
          field_i = (td) null;
          fieldTemp$5 = this.field_h - 1;
          this.field_h = this.field_h - 1;
          if (tb.field_a.field_E <= fieldTemp$5) {
            return;
          } else {
            this.b((byte) -123);
            return;
          }
        }
    }

    final void a(byte param0) {
        tb.field_a.a(this.field_k, this.field_n, this.field_h, 0, -1);
        if (param0 != -34) {
            this.c((byte) -119);
        }
    }

    final static boolean d(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -53) {
            discarded$0 = gd.d((byte) 85);
            return nh.field_a.b(-79);
        }
        return nh.field_a.b(-79);
    }

    public static void e(byte param0) {
        if (param0 != -62) {
          field_m = (wf) null;
          field_j = null;
          field_m = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_m = null;
          field_i = null;
          return;
        }
    }

    gd(int param0, int param1, int param2) {
        this.field_k = Integer.toString(param0);
        this.field_h = param2;
        this.field_n = param1;
    }

    static {
        field_j = "Please check if address is correct";
    }
}
