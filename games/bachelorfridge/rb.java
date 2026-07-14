/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends bca {
    nq field_q;
    static String field_r;

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          ((rb) this).a((op) null, -23);
          return (at) (Object) new mea(param1, (rb) this);
        } else {
          return (at) (Object) new mea(param1, (rb) this);
        }
    }

    rb(int param0, nq param1, nq param2) {
        super(param0, param1);
        ((rb) this).field_q = param2;
    }

    final void a(byte param0, lu param1) {
        this.a((byte) -124, param1);
        if (param0 > -12) {
          rb.d((byte) -104);
          er.a(((rb) this).field_q, 117, param1);
          return;
        } else {
          er.a(((rb) this).field_q, 117, param1);
          return;
        }
    }

    public static void d(byte param0) {
        field_r = null;
        int var1 = 53 % ((25 - param0) / 44);
    }

    rb(lu param0) {
        super(param0);
        ((rb) this).field_k = param0.e((byte) 91);
        ((rb) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if ((var2 ^ -1) > -1) {
                break;
            }
            ((rb) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((rb) this).field_q = qi.a(param0, (byte) 75);
    }

    final void a(op param0, int param1) {
        ((rb) this).a(param0, (byte) -2);
        int var3 = 68 % ((12 - param1) / 35);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Staff impersonation";
    }
}
