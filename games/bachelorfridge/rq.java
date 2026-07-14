/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends kj {
    static int field_f;
    private int field_h;
    static int field_g;

    rq(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, int param2) {
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (15 <= ((rq) this).field_h) {
          if (((rq) this).field_h >= 30) {
            ena.field_l.a(param2, param0 + -32);
            if (param1 != 0) {
              ((rq) this).a(120, 124, -85);
              return;
            } else {
              return;
            }
          } else {
            it.field_i.a(param2, param0 + -32);
            if (param1 == 0) {
              return;
            } else {
              ((rq) this).a(120, 124, -85);
              return;
            }
          }
        } else {
          rw.field_a.a(param2, -32 + param0);
          if (param1 == 0) {
            return;
          } else {
            ((rq) this).a(120, 124, -85);
            return;
          }
        }
    }

    final boolean b(int param0) {
        if (param0 <= 21) {
            return true;
        }
        ((rq) this).field_h = ((rq) this).field_h + 1;
        if (((rq) this).field_h + 1 >= 75) {
            return true;
        }
        return false;
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            field_f = -101;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 200;
        field_g = 49;
    }
}
