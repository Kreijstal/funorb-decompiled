/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends td {
    final ii a(op param0, int param1) {
        aga var4 = null;
        oga var5 = null;
        aga var6 = null;
        var6 = ((ab) this).field_h.a(29, param0);
        var4 = ((ab) this).field_j.a(18, param0);
        if (var4 != null) {
          if (!var4.i(75)) {
            var5 = new oga(((ab) this).field_g, new nq(var6), ((ab) this).field_j);
            var5.field_o.a((bw) (Object) new iv(new nq(var4), false, 1, 0, 37), true);
            if (param1 != 3) {
              return null;
            } else {
              var5.field_o.a((bw) (Object) new rla(new nq(var4), var6.field_D), true);
              return (ii) (Object) var5;
            }
          } else {
            return (ii) (Object) new ew(new nq(var6));
          }
        } else {
          return (ii) (Object) new ew(new nq(var6));
        }
    }

    ab(int param0, aga param1, nq param2) {
        super(param0, param1);
        ((ab) this).field_j = param2;
    }

    static {
    }
}
