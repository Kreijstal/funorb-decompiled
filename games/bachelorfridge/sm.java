/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends bca {
    static sna field_s;
    static java.math.BigInteger field_q;
    static int field_r;

    final void a(op param0, int param1) {
        ((sm) this).a(param0, (byte) -2);
        int var3 = -93 % ((12 - param1) / 35);
    }

    sm(lu param0) {
        super(param0);
        ((sm) this).field_k = param0.e((byte) 59);
        ((sm) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((sm) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new vq(param1, (sm) this);
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
          if (!bp.e(-29919)) {
            sja.field_fb.c(81, (byte) 126);
            sja.field_fb.d(param1, 0);
            sja.field_fb.d(param2, 0);
            sja.field_fb.d(param3, 0);
            return;
          } else {
            return;
          }
        } else {
          String discarded$5 = sm.e(-51);
          if (bp.e(-29919)) {
            return;
          } else {
            sja.field_fb.c(81, (byte) 126);
            sja.field_fb.d(param1, 0);
            sja.field_fb.d(param2, 0);
            sja.field_fb.d(param3, 0);
            return;
          }
        }
    }

    sm(int param0, nq param1) {
        super(param0, param1);
    }

    final static String e(int param0) {
        int var1 = -30 / ((19 - param0) / 63);
        return ig.field_m.g(-32);
    }

    public static void d(int param0) {
        if (param0 != -1) {
            String discarded$0 = sm.e(-8);
            field_s = null;
            field_q = null;
            return;
        }
        field_s = null;
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 33;
        field_q = new java.math.BigInteger("65537");
    }
}
