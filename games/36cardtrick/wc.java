/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends qg {
    static ag field_B;
    static bj field_A;

    final static void j(int param0) {
        if (param0 != -9636) {
            wc.a(-106, -89, 43);
        }
    }

    final static void a(int param0, int param1, int param2) {
        ca.field_a = param2;
        ug.field_h = param0;
        if (param1 != -16923) {
            field_B = (ag) null;
        }
    }

    private wc(int param0, int param1, int param2, int param3, ci param4, pl param5, lk param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((wc) this).field_y = param6;
    }

    public static void i(int param0) {
        field_B = null;
        if (param0 != -21693) {
            field_A = (bj) null;
            field_A = null;
            return;
        }
        field_A = null;
    }

    final void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        qi var7 = null;
        this.a(param0, param1, param2, param3, param4, param5);
        var7 = sh.field_i;
        if (var7 != null) {
          if (((wc) this).a(-77, param3, param5, param2, param4)) {
            if (!(((wc) this).field_k instanceof wa)) {
              if (((qi) var7).field_k instanceof wa) {
                ((wa) ((qi) var7).field_k).a((wc) this, 15254, var7);
                sh.field_i = null;
                return;
              } else {
                return;
              }
            } else {
              ((wa) ((wc) this).field_k).a((wc) this, 15254, var7);
              sh.field_i = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new ag();
        field_A = null;
    }
}
