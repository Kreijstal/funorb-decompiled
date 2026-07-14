/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oca extends jm {
    private int field_q;
    static String field_p;
    static sna field_n;
    static String field_o;
    private int field_m;

    final void a(boolean param0, op param1) {
        param1.field_a[((oca) this).field_q][((oca) this).field_m].field_m = true;
        if (param0) {
            Object var4 = null;
            ((oca) this).b((lu) null, (byte) 17);
        }
    }

    final void b(lu param0, byte param1) {
        param0.d(((oca) this).field_q, 0);
        param0.d(((oca) this).field_m, 0);
        int var3 = 118 % ((37 - param1) / 38);
    }

    final void a(ub param0, int param1) {
        if (param1 > -2) {
            return;
        }
        param0.field_o.b(30996, ((oca) this).field_q, ((oca) this).field_m);
    }

    public static void d(byte param0) {
        if (param0 > -20) {
          oca.d((byte) 63);
          field_o = null;
          field_n = null;
          field_p = null;
          return;
        } else {
          field_o = null;
          field_n = null;
          field_p = null;
          return;
        }
    }

    oca(int param0, int param1) {
        ((oca) this).field_m = param1;
        ((oca) this).field_q = param0;
        ((oca) this).field_j = 1;
    }

    oca(lu param0) {
        ((oca) this).field_j = 1;
        ((oca) this).field_q = param0.b(16711935);
        ((oca) this).field_m = param0.b(16711935);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
