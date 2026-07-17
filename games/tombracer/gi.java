/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends me {
    gi(qh param0) {
        super(param0);
    }

    final void a(byte param0) {
        if (param0 >= -107) {
            return;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            boolean discarded$0 = ((gi) this).a(true);
            return false;
        }
        return false;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        var2 = (aaa.a(false) - koa.b(0) / 2) / 2;
        if (param0 < -13) {
          var3 = (koa.b(0) - -130) / 2;
          var4 = ((gi) this).field_i.l(93);
          var5 = 10309393;
          var6 = 11184810;
          var7 = 20;
          var8 = var7 * ((gi) this).field_g.field_P + 50;
          var9 = var3;
          var10 = 40 + var9;
          qa.a(var8, 300, (byte) 65, -150 + var2, aq.field_a, var9 - 16);
          oka.a(rl.field_v.toUpperCase(), 16777215, qf.field_j, -1, 4 + var9, var2, 0);
          var11 = 0;
          L0: while (true) {
            if (((gi) this).field_g.field_c.field_e.length > var11) {
              var12 = ((gi) this).field_g.field_c.field_e[var11];
              if (var12 != -1) {
                L1: {
                  if (var12 == var4) {
                    var13 = var5;
                    break L1;
                  } else {
                    var13 = var6;
                    break L1;
                  }
                }
                if (((gi) this).field_g.field_G[var12].b(0)) {
                  oka.a((dta.field_b[var11] + "  " + ((gi) this).field_i.a(var12, false) + "  " + dea.a(((gi) this).field_g.field_G[var12].field_c, (byte) -8)).toUpperCase(), var13, qf.field_j, -1, var7 * var11 + var10, var2, 0);
                  var11++;
                  continue L0;
                } else {
                  L2: {
                    if (((gi) this).field_g.field_G[var12].e(-31170)) {
                      break L2;
                    } else {
                      if (((gi) this).field_i.field_k.e(2) >= 0) {
                        break L2;
                      } else {
                        oka.a((dta.field_b[var11] + "  ...").toUpperCase(), 16777215, qf.field_j, -1, var11 * var7 + var10, var2, 0);
                        return;
                      }
                    }
                  }
                  oka.a((re.field_b + "  " + ((gi) this).field_i.a(var12, false)).toUpperCase(), var13, qf.field_j, -1, var10 - -(var11 * var7), var2, 0);
                  var11++;
                  continue L0;
                }
              } else {
                var11++;
                var11++;
                continue L0;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 42 / ((param2 - 29) / 57);
        return false;
    }

    static {
    }
}
