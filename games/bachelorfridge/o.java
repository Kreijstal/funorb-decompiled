/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends pp {
    static String field_i;

    public static void e(byte param0) {
        field_i = null;
        if (param0 != -7) {
            o.e((byte) -68);
        }
    }

    final void a(lu param0, byte param1) {
        int var3 = 33 / ((param1 - 34) / 58);
        this.a(param0, (byte) 95);
        param0.b(((o) this).field_f, -115);
    }

    o(int param0) {
        ((o) this).field_f = param0;
    }

    final static boolean d(byte param0) {
        if (param0 < 44) {
            field_i = null;
        }
        return (wca.field_n ^ -1) <= -12 ? true : false;
    }

    final void a(aga param0, op param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        aga var6 = null;
        int var7 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          if (param2 == 12) {
            break L0;
          } else {
            boolean discarded$3 = o.d((byte) 28);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= param1.field_z) {
            return;
          } else {
            var5 = 0;
            L2: while (true) {
              if (var5 >= param1.field_B) {
                var4++;
                continue L1;
              } else {
                var6 = param1.field_a[var4][var5].field_l;
                if (var6 != null) {
                  boolean discarded$4 = var6.g(-116, ((o) this).field_f);
                  var5++;
                  continue L2;
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Join <%0>'s game";
    }
}
