/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends le {
    static int field_j;
    int field_i;
    int field_h;

    final static void a(int param0) {
        Object var1 = null;
        hn var1_ref = null;
        int var2 = 0;
        var1 = null;
        var2 = ZombieDawn.field_J;
        sh.field_d.g();
        cf.field_fb.g();
        if (param0 <= -30) {
          d.field_b = d.field_b - 1;
          if (d.field_b == 0) {
            d.field_b = 200;
            var1_ref = (hn) (Object) fj.field_i.b((byte) 26);
            L0: while (true) {
              if (var1_ref == null) {
                L1: {
                  if (sf.field_n == null) {
                    break L1;
                  } else {
                    var1_ref = (hn) (Object) sf.field_n.b((byte) 26);
                    L2: while (true) {
                      if (var1_ref == null) {
                        break L1;
                      } else {
                        L3: {
                          if (!var1_ref.field_k.a((byte) 73)) {
                            var1_ref.b(-27598);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var1_ref = (hn) (Object) sf.field_n.a(false);
                        continue L2;
                      }
                    }
                  }
                }
                L4: {
                  if (uh.field_o == null) {
                    break L4;
                  } else {
                    if (uh.field_o.c((byte) -34)) {
                      break L4;
                    } else {
                      te.field_kb = null;
                      return;
                    }
                  }
                }
                return;
              } else {
                L5: {
                  if (!var1_ref.field_k.a((byte) 73)) {
                    var1_ref.b(-27598);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var1_ref = (hn) (Object) fj.field_i.a(false);
                continue L0;
              }
            }
          } else {
            L6: {
              if (uh.field_o == null) {
                break L6;
              } else {
                if (uh.field_o.c((byte) -34)) {
                  break L6;
                } else {
                  te.field_kb = null;
                  return;
                }
              }
            }
            return;
          }
        } else {
          field_j = 75;
          d.field_b = d.field_b - 1;
          if (d.field_b == 0) {
            d.field_b = 200;
            var1_ref = (hn) (Object) fj.field_i.b((byte) 26);
            L7: while (true) {
              if (var1_ref == null) {
                if (sf.field_n != null) {
                  var1_ref = (hn) (Object) sf.field_n.b((byte) 26);
                  L8: while (true) {
                    if (var1_ref != null) {
                      L9: {
                        if (!var1_ref.field_k.a((byte) 73)) {
                          var1_ref.b(-27598);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var1_ref = (hn) (Object) sf.field_n.a(false);
                      continue L8;
                    } else {
                      L10: {
                        if (uh.field_o == null) {
                          break L10;
                        } else {
                          if (uh.field_o.c((byte) -34)) {
                            break L10;
                          } else {
                            te.field_kb = null;
                            break L10;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if (uh.field_o != null) {
                    if (!uh.field_o.c((byte) -34)) {
                      te.field_kb = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L11: {
                  if (!var1_ref.field_k.a((byte) 73)) {
                    var1_ref.b(-27598);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var1_ref = (hn) (Object) fj.field_i.a(false);
                continue L7;
              }
            }
          } else {
            L12: {
              if (uh.field_o == null) {
                break L12;
              } else {
                if (uh.field_o.c((byte) -34)) {
                  break L12;
                } else {
                  te.field_kb = null;
                  return;
                }
              }
            }
            return;
          }
        }
    }

    final static void a(boolean param0) {
        se.field_j = oj.b(0);
        wo.field_xb = new dn();
        if (param0) {
            return;
        }
        ad.c((byte) 122);
    }

    private mg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 64;
    }
}
