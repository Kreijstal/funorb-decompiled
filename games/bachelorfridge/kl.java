/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends td {
    final ii a(op param0, int param1) {
        aga var3 = null;
        la var4 = null;
        var3 = ((kl) this).field_h.a(45, param0);
        var4 = new la(((kl) this).field_g, new nq(var3));
        if (param1 != 3) {
          return null;
        } else {
          var4.field_t = ((kl) this).field_n;
          var4.field_q = ((kl) this).field_k;
          return (ii) (Object) var4;
        }
    }

    final static void a(int param0, int param1) {
        pf var2 = null;
        var2 = sja.field_fb;
        var2.c(param1, (byte) 125);
        var2.d(1, 0);
        if (param0 <= 19) {
          return;
        } else {
          var2.d(3, 0);
          return;
        }
    }

    final static void a(byte param0, kv param1) {
        kka.field_h = param1;
        if (param0 <= 1) {
            return;
        }
    }

    kl(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((kl) this).field_k = param2;
        ((kl) this).field_n = param3;
    }

    static {
    }
}
