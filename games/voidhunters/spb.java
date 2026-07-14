/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class spb {
    static String field_a;

    final static void a(byte param0) {
        if (null == psb.field_b) {
          return;
        } else {
          if (param0 == -95) {
            kl.a((java.awt.Canvas) (Object) psb.field_b, -28);
            psb.field_b.a(bm.field_o, -32335);
            psb.field_b = null;
            if (efb.field_b != null) {
              efb.field_b.c(param0 + -29579);
              igb.field_a.requestFocus();
              return;
            } else {
              igb.field_a.requestFocus();
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0) {
        if (param0 >= -54) {
            return true;
        }
        if (!(fva.field_p)) {
            return false;
        }
        if (ow.field_b == 0) {
            return true;
        }
        return false;
    }

    final static void a(byte param0, dqb param1) {
        eob.field_o = param1;
        int var2 = 12 % ((param0 - 19) / 37);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Find opponent";
    }
}
