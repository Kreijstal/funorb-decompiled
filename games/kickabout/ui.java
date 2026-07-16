/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends vv {
    static boolean field_y;
    byte field_x;
    static vc[] field_w;
    static boolean field_t;
    iw field_v;
    int field_u;

    final static void a(String param0, byte param1, String param2) {
        if (!(null == rk.field_f)) {
            rk.field_f.q(-123);
        }
        pb.field_E = new pd(param0, param2, false, true, true);
        we.field_a.a((byte) -122, (fd) (Object) pb.field_E);
        if (param1 != 111) {
            field_y = true;
        }
    }

    final static v g(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        var1 = 2147483647;
        var2 = 0;
        var3 = param0;
        L0: while (true) {
          if (var3 >= e.field_n.length) {
            return e.field_n[var2];
          } else {
            var4 = e.field_n[var3].field_a;
            if (var1 > var4) {
              var1 = var4;
              var2 = var3;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_w = null;
        if (!param0) {
            Object var2 = null;
            ui.a((String) null, (byte) 7, (String) null);
        }
    }

    final static void h(int param0) {
        ol.field_R = true;
        if (param0 != -15396) {
            field_w = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param3 != 2147483647) {
            Object var5 = null;
            ui.a((String) null, (byte) 63, (String) null);
        }
        mu.a(bw.field_a[param1], true, param0, ad.field_d[param1], param2, true);
    }

    final int a(int param0) {
        if (param0 != 0) {
            return 103;
        }
        if (!(((ui) this).field_v != null)) {
            return 0;
        }
        return ((ui) this).field_v.field_n * 100 / (-((ui) this).field_x + ((ui) this).field_v.field_f.length);
    }

    final byte[] b(int param0) {
        L0: {
          if (((ui) this).field_p) {
            break L0;
          } else {
            if (((ui) this).field_v.field_n < -((ui) this).field_x + ((ui) this).field_v.field_f.length) {
              break L0;
            } else {
              L1: {
                if (param0 == 12802) {
                  break L1;
                } else {
                  v discarded$2 = ui.g(64);
                  break L1;
                }
              }
              return ((ui) this).field_v.field_f;
            }
          }
        }
        throw new RuntimeException();
    }

    ui() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = true;
        field_y = false;
    }
}
