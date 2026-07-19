/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends wf {
    static ej field_g;
    static String field_e;
    private int field_i;
    private int field_j;
    private int field_h;
    private int field_l;
    private int field_f;
    private String field_k;

    public static void a(byte param0) {
        field_e = null;
        int var1 = -17 % ((19 - param0) / 35);
        field_g = null;
    }

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 47) {
          L0: {
            this.field_j = -72;
            if (this.field_i >= this.field_h + (kn.field_b.field_e - this.field_f)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_i >= this.field_h + (kn.field_b.field_e - this.field_f)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(int param0) {
        int var2 = -39 / ((param0 - -45) / 55);
        int fieldTemp$0 = this.field_i + 1;
        this.field_i = this.field_i + 1;
        return this.field_l + (this.field_h + this.field_f) < fieldTemp$0 ? true : false;
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (this.field_f <= this.field_i) {
          if (this.field_i < this.field_f + this.field_h) {
            rb.field_j.a(102, this.field_j | -16777216, -1, gp.field_w + -50, 320, this.field_k);
            return;
          } else {
            var2 = this.field_i - this.field_f - this.field_h;
            var3 = (this.field_l + -var2 << -1892655192) / this.field_l;
            if (-1 <= (var3 ^ -1)) {
              return;
            } else {
              var4 = 80 * var2 / this.field_l;
              rb.field_j.a(99, this.field_j | var3 << 746661016, -1, param0 + (gp.field_w - var4), sh.field_u >> 2051331681, this.field_k);
              return;
            }
          }
        } else {
          var2 = (this.field_i << -1356388696) / this.field_f;
          var3 = (-this.field_i + this.field_f) * 80 / this.field_f;
          rb.field_j.a(122, var2 << 1043097080 | this.field_j, -1, var3 + (-50 + gp.field_w), 320, this.field_k);
          return;
        }
    }

    tb(String param0, int param1) {
        try {
            this.field_f = 20;
            this.field_j = param1;
            this.field_k = param0;
            this.field_l = 80;
            this.field_i = 0;
            this.field_h = 150;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "tb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    tb(String param0, int param1, int param2) {
        try {
            this.field_f = 20;
            this.field_h = param2;
            this.field_i = 0;
            this.field_j = param1;
            this.field_k = param0;
            this.field_l = 80;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "tb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = new ej(7, 0, 1, 1);
        field_e = "That name is not available";
    }
}
