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
        try {
            lb.a("", param0, -1);
            dl.a(param0, -6242);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "rk.A(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 41);
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
        ((rk) this).field_d = new int[]{0, 0, 0, 0};
        ((rk) this).field_a = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        var2 = param0;
        if (var2 == 0) {
          ((rk) this).field_a[3] = 4;
          ((rk) this).field_a[5] = 24;
          ((rk) this).field_a[18] = 2;
          ((rk) this).field_a[0] = 24;
          ((rk) this).field_a[1] = 4;
          ((rk) this).field_a[2] = 4;
          ((rk) this).field_d[1] = 2;
          return;
        } else {
          if (var2 == 1) {
            ((rk) this).field_a[5] = 16;
            ((rk) this).field_a[3] = 2;
            ((rk) this).field_a[18] = 1;
            ((rk) this).field_a[2] = 2;
            ((rk) this).field_a[1] = 4;
            ((rk) this).field_a[0] = 24;
            ((rk) this).field_d[1] = 1;
            return;
          } else {
            L0: {
              if (var2 != 2) {
                break L0;
              } else {
                ((rk) this).field_a[3] = 1;
                ((rk) this).field_a[2] = 1;
                ((rk) this).field_a[0] = 24;
                ((rk) this).field_a[5] = 8;
                ((rk) this).field_a[1] = 4;
                break L0;
              }
            }
            return;
          }
        }
    }

    rk() {
        ((rk) this).field_d = new int[]{0, 0, 0, 0};
        ((rk) this).field_a = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = "Loading sound effects";
    }
}
