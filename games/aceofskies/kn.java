/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    static da field_a;
    static al[] field_c;
    static vs field_b;

    final static java.awt.Frame a(rk param0, int param1, int param2, int param3, int param4, int param5) {
        rm[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        rm[] var10 = null;
        en var11 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        if (param0.a((byte) 84)) {
          L0: {
            if (param3 == 0) {
              var10 = sk.a(param0, 1175069442);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (param1 == var10[var8].field_f) {
                      if (var10[var8].field_b == param2) {
                        L2: {
                          if (param4 == 0) {
                            break L2;
                          } else {
                            if (var10[var8].field_a == param4) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (param3 < var10[var8].field_d) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        param3 = var10[var8].field_d;
                        var7_int = 1;
                        var8++;
                        continue L1;
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          var11 = param0.a(param1, -83, param4, param2, param3);
          L4: while (true) {
            if (((en) var11).field_a != 0) {
              var7 = (java.awt.Frame) ((en) var11).field_f;
              if (var7 != null) {
                if (param5 == 29742) {
                  if (-3 == (((en) var11).field_a ^ -1)) {
                    ke.a(param5 ^ 30691, param0, var7);
                    return null;
                  } else {
                    return var7;
                  }
                } else {
                  return (java.awt.Frame) null;
                }
              } else {
                return null;
              }
            } else {
              wf.a(10L, false);
              continue L4;
            }
          }
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
            field_b = (vs) null;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static wp[] a(int param0) {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        int var1 = -37 / ((19 - param0) / 57);
        wp[] var2 = new wp[to.field_t];
        for (var3 = 0; var3 < to.field_t; var3++) {
            var2[var3] = new wp(pu.field_a, cc.field_i, lh.field_a[var3], lg.field_j[var3], ji.field_b[var3], ee.field_e[var3], fk.field_a[var3], ud.field_e);
        }
        kf.f(1);
        return var2;
    }

    static {
    }
}
