/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends rqa {
    static phb[][] field_o;

    public static void e(int param0) {
        int var1 = -101 % ((-37 - param0) / 42);
        field_o = null;
    }

    final static int f(int param0) {
        if (param0 != 255) {
            int discarded$0 = mg.f(-9);
            return 255 * pob.field_b / 32;
        }
        return 255 * pob.field_b / 32;
    }

    mg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        jk var1 = null;
        mm var1_ref = null;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        var1 = (jk) (Object) cta.field_q.d(0);
        L0: while (true) {
          if (var1 == null) {
            var1_ref = (mm) (Object) kja.field_E.d(0);
            L1: while (true) {
              if (var1_ref == null) {
                var1 = (jk) (Object) mea.field_e.d(param0);
                L2: while (true) {
                  if (var1 == null) {
                    return;
                  } else {
                    L3: {
                      if (-1 > (var1.field_yb ^ -1)) {
                        var1.field_yb = var1.field_yb - 1;
                        if (0 == var1.field_yb) {
                          var1.field_Db = 0;
                          if (var1.i(param0 + -128)) {
                            var1.b(-3846);
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          var1 = (jk) (Object) mea.field_e.a((byte) 11);
                          continue L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var1 = (jk) (Object) mea.field_e.a((byte) 11);
                    continue L2;
                  }
                }
              } else {
                L4: {
                  if (var1_ref.field_Db < -1) {
                    var1_ref.field_Db = var1_ref.field_Db - 1;
                    if (-1 != var1_ref.field_Db) {
                      break L4;
                    } else {
                      var1_ref.field_ec = 0;
                      if (var1_ref.e((byte) 74)) {
                        var1_ref.b(-3846);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var1_ref = (mm) (Object) kja.field_E.a((byte) 118);
                continue L1;
              }
            }
          } else {
            L5: {
              if (var1.field_yb >= -1) {
                break L5;
              } else {
                var1.field_yb = var1.field_yb - 1;
                if (-1 != var1.field_yb) {
                  break L5;
                } else {
                  var1.field_Db = 0;
                  if (!var1.i(param0 ^ -124)) {
                    break L5;
                  } else {
                    var1.b(param0 ^ -3846);
                    break L5;
                  }
                }
              }
            }
            var1 = (jk) (Object) cta.field_q.a((byte) 62);
            continue L0;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(216, 62, param0[0].a(71));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
    }
}
