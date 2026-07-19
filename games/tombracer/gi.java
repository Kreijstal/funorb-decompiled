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
        boolean discarded$0 = false;
        if (!param0) {
            discarded$0 = this.a(true);
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
          var4 = this.field_i.l(93);
          var5 = 10309393;
          var6 = 11184810;
          var7 = 20;
          var8 = var7 * this.field_g.field_P + 50;
          var9 = var3;
          var10 = 40 + var9;
          qa.a(var8, 300, (byte) 65, -150 + var2, aq.field_a, var9 - 16);
          oka.a(rl.field_v.toUpperCase(), 16777215, qf.field_j, -1, 4 + var9, var2, 0);
          var11 = 0;
          L0: while (true) {
            if (this.field_g.field_c.field_e.length > var11) {
              var12 = this.field_g.field_c.field_e[var11];
              if (var14 == 0) {
                L1: {
                  L2: {
                    if (0 != (var12 ^ -1)) {
                      break L2;
                    } else {
                      if (var14 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (var12 == var4) {
                        break L4;
                      } else {
                        var13 = var6;
                        if (var14 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var13 = var5;
                    break L3;
                  }
                  L5: {
                    if (this.field_g.field_G[var12].b(0)) {
                      break L5;
                    } else {
                      L6: {
                        if (this.field_g.field_G[var12].e(-31170)) {
                          break L6;
                        } else {
                          if (this.field_i.field_k.e(2) >= 0) {
                            break L6;
                          } else {
                            oka.a((dta.field_b[var11] + "  ...").toUpperCase(), 16777215, qf.field_j, -1, var11 * var7 + var10, var2, 0);
                            if (var14 != 0) {
                              break L6;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      oka.a((re.field_b + "  " + this.field_i.a(var12, false)).toUpperCase(), var13, qf.field_j, -1, var10 - -(var11 * var7), var2, 0);
                      if (var14 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  oka.a((dta.field_b[var11] + "  " + this.field_i.a(var12, false) + "  " + dea.a(this.field_g.field_G[var12].field_c, (byte) -8)).toUpperCase(), var13, qf.field_j, -1, var7 * var11 + var10, var2, 0);
                  break L1;
                }
                var11++;
                if (var14 == 0) {
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
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
