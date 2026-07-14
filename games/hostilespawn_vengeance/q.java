/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_k;
    static int field_d;
    static int field_h;
    static bd field_c;
    static bn field_b;
    static String field_l;
    static na field_j;
    static ql field_g;
    static String field_a;
    static int[][] field_e;
    static b field_i;
    static bd field_f;
    static String[] field_m;
    static int field_n;

    final static void b(int param0) {
        Object var1 = null;
        qb var1_ref = null;
        int var2 = 0;
        var1 = null;
        var2 = HostileSpawn.field_I ? 1 : 0;
        uj.field_m.f();
        if (param0 == 14470) {
          eb.field_e.f();
          de.field_n = de.field_n - 1;
          if (de.field_n == 0) {
            de.field_n = 200;
            var1_ref = (qb) (Object) jn.field_H.g(param0 ^ -14500);
            L0: while (true) {
              if (var1_ref == null) {
                L1: {
                  if (ej.field_g == null) {
                    break L1;
                  } else {
                    var1_ref = (qb) (Object) ej.field_g.g(-27);
                    L2: while (true) {
                      if (var1_ref == null) {
                        break L1;
                      } else {
                        L3: {
                          if (!var1_ref.field_j.a(param0 + -11470)) {
                            var1_ref.b(-17);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var1_ref = (qb) (Object) ej.field_g.a(12684);
                        continue L2;
                      }
                    }
                  }
                }
                L4: {
                  if (uh.field_l == null) {
                    break L4;
                  } else {
                    if (!uh.field_l.f(323697071)) {
                      id.field_t = null;
                      break L4;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                L5: {
                  if (!var1_ref.field_j.a(3000)) {
                    var1_ref.b(param0 ^ -14511);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var1_ref = (qb) (Object) jn.field_H.a(12684);
                continue L0;
              }
            }
          } else {
            L6: {
              if (uh.field_l == null) {
                break L6;
              } else {
                if (!uh.field_l.f(323697071)) {
                  id.field_t = null;
                  break L6;
                } else {
                  return;
                }
              }
            }
            return;
          }
        } else {
          field_l = null;
          eb.field_e.f();
          de.field_n = de.field_n - 1;
          if (de.field_n == 0) {
            de.field_n = 200;
            var1_ref = (qb) (Object) jn.field_H.g(param0 ^ -14500);
            L7: while (true) {
              if (var1_ref == null) {
                if (ej.field_g != null) {
                  var1_ref = (qb) (Object) ej.field_g.g(-27);
                  L8: while (true) {
                    if (var1_ref != null) {
                      L9: {
                        if (!var1_ref.field_j.a(param0 + -11470)) {
                          var1_ref.b(-17);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var1_ref = (qb) (Object) ej.field_g.a(12684);
                      continue L8;
                    } else {
                      L10: {
                        if (uh.field_l == null) {
                          break L10;
                        } else {
                          if (!uh.field_l.f(323697071)) {
                            id.field_t = null;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if (uh.field_l != null) {
                    if (uh.field_l.f(323697071)) {
                      return;
                    } else {
                      id.field_t = null;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L11: {
                  if (!var1_ref.field_j.a(3000)) {
                    var1_ref.b(param0 ^ -14511);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var1_ref = (qb) (Object) jn.field_H.a(12684);
                continue L7;
              }
            }
          } else {
            L12: {
              if (uh.field_l == null) {
                break L12;
              } else {
                if (!uh.field_l.f(323697071)) {
                  id.field_t = null;
                  break L12;
                } else {
                  return;
                }
              }
            }
            return;
          }
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_f = null;
        field_g = null;
        field_l = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_j = null;
        if (param0 != 50) {
          String discarded$2 = q.c(-56);
          field_i = null;
          field_b = null;
          return;
        } else {
          field_i = null;
          field_b = null;
          return;
        }
    }

    final static String c(int param0) {
        if (param0 != -1) {
            return null;
        }
        if (od.field_I == ti.field_b) {
            return qi.field_G;
        }
        return fc.field_y;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        jn.a(256, 50);
        field_l = "You destroyed the main reactor for this level. Activate another reactor to restore power to the lift.";
        field_i = null;
        field_a = "Find a way back to the lift.";
        field_n = 5701664;
        field_m = new String[]{"Highscores: Kerrus", "Highscores: Vengeance"};
    }
}
