/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static String field_b;
    int[] field_a;
    static bg[] field_e;
    static int field_c;
    int[] field_d;
    static ci[] field_f;

    final static void a(java.applet.Applet param0, boolean param1) {
        if (!param1) {
            return;
        }
        try {
            lb.a("", param0, -1);
            dl.a(param0, -6242);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "rk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            rk.a(-124);
            field_e = null;
            field_b = null;
            field_f = null;
            return;
        }
        field_e = null;
        field_b = null;
        field_f = null;
    }

    rk(int param0) {
        int var2 = 0;
        this.field_d = new int[]{0, 0, 0, 0};
        this.field_a = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        var2 = param0;
        if (var2 == 0) {
          this.field_a[3] = 4;
          this.field_a[5] = 24;
          this.field_a[18] = 2;
          this.field_a[0] = 24;
          this.field_a[1] = 4;
          this.field_a[2] = 4;
          this.field_d[1] = 2;
          return;
        } else {
          if (var2 == 1) {
            this.field_a[5] = 16;
            this.field_a[3] = 2;
            this.field_a[18] = 1;
            this.field_a[2] = 2;
            this.field_a[1] = 4;
            this.field_a[0] = 24;
            this.field_d[1] = 1;
            return;
          } else {
            L0: {
              if (-3 != (var2 ^ -1)) {
                break L0;
              } else {
                this.field_a[3] = 1;
                this.field_a[2] = 1;
                this.field_a[0] = 24;
                this.field_a[5] = 8;
                this.field_a[1] = 4;
                break L0;
              }
            }
            return;
          }
        }
    }

    rk() {
        this.field_d = new int[]{0, 0, 0, 0};
        this.field_a = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    static {
        field_c = 0;
        field_b = "Loading sound effects";
    }
}
