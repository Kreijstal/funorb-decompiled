/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static vm field_b;
    static ea field_d;
    static java.awt.Image field_a;
    static int field_i;
    static int[] field_f;
    static ea field_c;
    static ea[] field_h;
    static bj field_g;
    static volatile long field_e;

    final static void a(int param0, ea[] param1, int param2, boolean param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = MinerDisturbance.field_ab;
          if (param1 == null) {
            break L0;
          } else {
            if (0 < param5) {
              var6 = param1[0].field_x;
              var7 = param1[2].field_x;
              if (param3) {
                field_b = null;
                var8 = param1[1].field_x;
                param1[0].b(param0, param4, param2);
                param1[2].b(-var7 + (param5 + param0), param4, param2);
                eh.b(en.field_b);
                eh.f(var6 + param0, param4, param0 + (param5 - var7), param1[1].field_A + param4);
                var9 = var6 + param0;
                var10 = -var7 + (param5 + param0);
                param0 = var9;
                L1: while (true) {
                  if (var10 <= param0) {
                    eh.a(en.field_b);
                    return;
                  } else {
                    param1[1].b(param0, param4, param2);
                    param0 = param0 + var8;
                    continue L1;
                  }
                }
              } else {
                var8 = param1[1].field_x;
                param1[0].b(param0, param4, param2);
                param1[2].b(-var7 + (param5 + param0), param4, param2);
                eh.b(en.field_b);
                eh.f(var6 + param0, param4, param0 + (param5 - var7), param1[1].field_A + param4);
                var9 = var6 + param0;
                var10 = -var7 + (param5 + param0);
                param0 = var9;
                L2: while (true) {
                  if (var10 <= param0) {
                    eh.a(en.field_b);
                    return;
                  } else {
                    param1[1].b(param0, param4, param2);
                    param0 = param0 + var8;
                    continue L2;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -77) {
          return;
        } else {
          field_a = null;
          field_c = null;
          field_f = null;
          field_g = null;
          field_d = null;
          field_h = null;
          return;
        }
    }

    final static ih a(int param0, bj param1, byte param2, int param3, bj param4) {
        if (cn.a(param0, 258, param3, param1)) {
          if (param2 < 30) {
            field_g = null;
            return ge.a(param4.a(false, param3, param0), -569);
          } else {
            return ge.a(param4.a(false, param3, param0), -569);
          }
        } else {
          return null;
        }
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, int param3, vf param4, int param5) {
        vk[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        vk[] var10 = null;
        ia var12 = null;
        java.awt.Frame var13 = null;
        ia var14 = null;
        java.awt.Frame var15 = null;
        var9 = MinerDisturbance.field_ab;
        if (param4.b((byte) 73)) {
          if (param1 == 0) {
            var10 = gn.a(-591, param4);
            var6 = var10;
            if (var6 != null) {
              var7_int = 0;
              var8 = 0;
              L0: while (true) {
                if (var10.length <= var8) {
                  if (var7_int != 0) {
                    var14 = param4.a(param1, param5, param2, param3, (byte) -122);
                    L1: while (true) {
                      if (0 == var14.field_c) {
                        gf.a(10L, -10309);
                        continue L1;
                      } else {
                        var15 = (java.awt.Frame) var14.field_a;
                        var7 = var15;
                        if (var15 != null) {
                          if (var14.field_c == 2) {
                            tf.a((byte) 108, param4, var15);
                            return null;
                          } else {
                            var8 = -69 % ((-42 - param0) / 41);
                            return var15;
                          }
                        } else {
                          return null;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  if (var10[var8].field_f == param2) {
                    if (var10[var8].field_c == param3) {
                      L2: {
                        if (param5 == 0) {
                          break L2;
                        } else {
                          if (param5 == var10[var8].field_b) {
                            break L2;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                      L3: {
                        if (var7_int == 0) {
                          break L3;
                        } else {
                          if (var10[var8].field_h > param1) {
                            break L3;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                      param1 = var10[var8].field_h;
                      var7_int = 1;
                      var8++;
                      continue L0;
                    } else {
                      var8++;
                      var8++;
                      continue L0;
                    }
                  } else {
                    var8++;
                    var8++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var12 = param4.a(param1, param5, param2, param3, (byte) -122);
            L4: while (true) {
              if (0 == var12.field_c) {
                gf.a(10L, -10309);
                continue L4;
              } else {
                var13 = (java.awt.Frame) var12.field_a;
                if (var13 != null) {
                  if (var12.field_c == 2) {
                    tf.a((byte) 108, param4, var13);
                    return null;
                  } else {
                    var8 = -69 % ((-42 - param0) / 41);
                    return var13;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        if (param0 < 102) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_e = 0L;
    }
}
