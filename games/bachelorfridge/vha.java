/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vha extends bca {
    final void a(op param0, int param1) {
        ((vha) this).a(param0, (byte) -2);
        int var3 = 93 / ((12 - param1) / 35);
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new nma(param1, (vha) this);
    }

    vha(lu param0) {
        super(param0);
        ((vha) this).field_k = param0.e((byte) 55);
        ((vha) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((vha) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    vha(int param0, nq param1) {
        super(param0, param1);
    }

    final static pp b(lu param0, int param1) {
        nq var2 = null;
        int var3 = 0;
        int var4 = 0;
        if (param1 > -114) {
          return null;
        } else {
          var2 = qi.a(param0, (byte) 85);
          var3 = param0.b(16711935);
          var4 = param0.b(16711935);
          return (pp) (Object) new cn(var2, var3, var4);
        }
    }

    static {
    }
}
