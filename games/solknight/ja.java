/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static o field_a;

    final static void b(int param0) {
        Object var1 = null;
        ud var1_ref = null;
        int var2 = 0;
        var1 = null;
        var2 = SolKnight.field_L ? 1 : 0;
        kj.field_P.b();
        ql.field_r.b();
        vg.field_M = vg.field_M - 1;
        if (param0 == 200) {
          if (vg.field_M == 0) {
            vg.field_M = 200;
            var1_ref = (ud) (Object) uc.field_j.a((byte) 51);
            L0: while (true) {
              if (var1_ref == null) {
                L1: {
                  if (null == la.field_j) {
                    break L1;
                  } else {
                    var1_ref = (ud) (Object) la.field_j.a((byte) 51);
                    L2: while (true) {
                      if (var1_ref == null) {
                        break L1;
                      } else {
                        L3: {
                          if (var1_ref.field_m.a(false)) {
                            break L3;
                          } else {
                            var1_ref.c(10);
                            break L3;
                          }
                        }
                        var1_ref = (ud) (Object) la.field_j.b(-46);
                        continue L2;
                      }
                    }
                  }
                }
                L4: {
                  if (null == ua.field_I) {
                    break L4;
                  } else {
                    if (ua.field_I.d(144)) {
                      break L4;
                    } else {
                      dj.field_j = null;
                      return;
                    }
                  }
                }
                return;
              } else {
                L5: {
                  if (var1_ref.field_m.a(false)) {
                    break L5;
                  } else {
                    var1_ref.c(param0 ^ 194);
                    break L5;
                  }
                }
                var1_ref = (ud) (Object) uc.field_j.b(-105);
                continue L0;
              }
            }
          } else {
            L6: {
              if (null == ua.field_I) {
                break L6;
              } else {
                if (ua.field_I.d(144)) {
                  break L6;
                } else {
                  dj.field_j = null;
                  return;
                }
              }
            }
            return;
          }
        } else {
          ja.a((byte) -48);
          if (vg.field_M == 0) {
            vg.field_M = 200;
            var1_ref = (ud) (Object) uc.field_j.a((byte) 51);
            L7: while (true) {
              if (var1_ref == null) {
                if (null != la.field_j) {
                  var1_ref = (ud) (Object) la.field_j.a((byte) 51);
                  L8: while (true) {
                    if (var1_ref != null) {
                      L9: {
                        if (var1_ref.field_m.a(false)) {
                          break L9;
                        } else {
                          var1_ref.c(10);
                          break L9;
                        }
                      }
                      var1_ref = (ud) (Object) la.field_j.b(-46);
                      continue L8;
                    } else {
                      L10: {
                        if (null == ua.field_I) {
                          break L10;
                        } else {
                          if (ua.field_I.d(144)) {
                            break L10;
                          } else {
                            dj.field_j = null;
                            break L10;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if (null != ua.field_I) {
                    if (!ua.field_I.d(144)) {
                      dj.field_j = null;
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
                  if (var1_ref.field_m.a(false)) {
                    break L11;
                  } else {
                    var1_ref.c(param0 ^ 194);
                    break L11;
                  }
                }
                var1_ref = (ud) (Object) uc.field_j.b(-105);
                continue L7;
              }
            }
          } else {
            L12: {
              if (null == ua.field_I) {
                break L12;
              } else {
                if (ua.field_I.d(144)) {
                  break L12;
                } else {
                  dj.field_j = null;
                  return;
                }
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, int param1, byte param2) {
        if (param2 != -41) {
            return;
        }
        ql.field_v = param0;
        ch.field_b = param1;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -43) {
            ja.b(70);
        }
    }

    final static void a(int param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        int[] var5 = md.field_t;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var2 < var3) {
            int incrementValue$0 = var2;
            var2++;
            var5[incrementValue$0] = 0;
            int incrementValue$1 = var2;
            var2++;
            var5[incrementValue$1] = 0;
            int incrementValue$2 = var2;
            var2++;
            var5[incrementValue$2] = 0;
            int incrementValue$3 = var2;
            var2++;
            var5[incrementValue$3] = 0;
            int incrementValue$4 = var2;
            var2++;
            var5[incrementValue$4] = 0;
            int incrementValue$5 = var2;
            var2++;
            var5[incrementValue$5] = 0;
            int incrementValue$6 = var2;
            var2++;
            var5[incrementValue$6] = 0;
            int incrementValue$7 = var2;
            var2++;
            var5[incrementValue$7] = 0;
        }
    }

    static {
    }
}
