/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends td {
    final ii a(op param0, int param1) {
        iba var4 = null;
        aga var3 = ((fc) this).field_h.a(79, param0);
        if (param1 != 3) {
            fc.a(68, -10, (byte) -83, -44, 25, 72);
            var4 = new iba(((fc) this).field_g, new nq(var3));
            var4.field_q = ((fc) this).field_k;
            var4.field_r = ((fc) this).field_n;
            return (ii) (Object) var4;
        }
        var4 = new iba(((fc) this).field_g, new nq(var3));
        var4.field_q = ((fc) this).field_k;
        var4.field_r = ((fc) this).field_n;
        return (ii) (Object) var4;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6 = 0;
        var6 = 26 % ((param2 - 38) / 47);
        if (param0 == param1) {
          eda.a(param3, param4, param1, false, param5);
          return;
        } else {
          if (param4 + -param1 < eo.field_l) {
            vda.a(param0, param5, param3, param1, (byte) -115, param4);
            return;
          } else {
            if (pw.field_x < param1 + param4) {
              vda.a(param0, param5, param3, param1, (byte) -115, param4);
              return;
            } else {
              if (param3 + -param0 < an.field_q) {
                vda.a(param0, param5, param3, param1, (byte) -115, param4);
                return;
              } else {
                if (param3 + param0 > ha.field_n) {
                  vda.a(param0, param5, param3, param1, (byte) -115, param4);
                  return;
                } else {
                  dw.a(param3, param0, 0, param1, param5, param4);
                  return;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, kv param2, int param3, byte param4, int param5) {
        int var8 = BachelorFridge.field_y;
        int var6 = 0;
        int var7 = -110 % ((param4 - 7) / 37);
        while (var6 < param2.field_v.length) {
            param2.field_v[var6] = hga.field_U.field_e[var6];
            var6++;
        }
    }

    fc(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((fc) this).field_k = param2;
        ((fc) this).field_n = param3;
    }

    static {
    }
}
