/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends td {
    final static void a(int param0, int param1, int param2, String param3, String param4, int param5) {
        pf var6 = null;
        int var7 = 0;
        Object var8 = null;
        pf var9 = null;
        var9 = sja.field_fb;
        var6 = var9;
        var9.c(param5, (byte) 98);
        var9.field_g = var9.field_g + 1;
        if (param2 > 39) {
          L0: {
            var7 = var9.field_g;
            var9.d(param1, 0);
            if ((param1 ^ -1) == -3) {
              var9.a((byte) -50, param4);
              break L0;
            } else {
              break L0;
            }
          }
          if (param3 == null) {
            var9.b(param0, -127);
            var9.b((byte) -38, -var7 + var9.field_g);
            return;
          } else {
            int discarded$2 = nu.a(param3, (lu) (Object) var9, -21840);
            var9.b((byte) -38, -var7 + var9.field_g);
            return;
          }
        } else {
          L1: {
            var8 = null;
            no.a(86, -49, 36, (String) null, (String) null, 123);
            var7 = var9.field_g;
            var9.d(param1, 0);
            if ((param1 ^ -1) == -3) {
              var9.a((byte) -50, param4);
              break L1;
            } else {
              break L1;
            }
          }
          if (param3 == null) {
            var9.b(param0, -127);
            var9.b((byte) -38, -var7 + var9.field_g);
            return;
          } else {
            int discarded$3 = nu.a(param3, (lu) (Object) var9, -21840);
            var9.b((byte) -38, -var7 + var9.field_g);
            return;
          }
        }
    }

    no(int param0, aga param1) {
        super(param0, param1);
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        tl var4 = null;
        Object var5 = null;
        var3 = ((no) this).field_h.a(31, param0);
        var4 = new tl(((no) this).field_g, new nq(var3));
        var4.field_t = ((no) this).field_n;
        var4.field_u = ((no) this).field_k;
        if (param1 != 3) {
          var5 = null;
          no.a(89, 77, 35, (String) null, (String) null, -3);
          var4.field_o.a((bw) (Object) new dh(), true);
          return (ii) (Object) var4;
        } else {
          var4.field_o.a((bw) (Object) new dh(), true);
          return (ii) (Object) var4;
        }
    }

    static {
    }
}
