/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static String field_c;
    static String field_d;
    static int field_a;
    static String field_b;

    public static void a(byte param0) {
        int var1 = 80 % ((param0 - -41) / 47);
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = DungeonAssault.field_K;
          var6 = wh.field_g.field_d;
          if (2 == param3) {
            param0 = param0 - var6;
            param4 = param4 + var6;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          jh.c();
          if (2 != param1) {
            break L1;
          } else {
            param0 = param0 - var6;
            break L1;
          }
        }
        gf.e(param4, param5, param4 + param0, 8 + param5);
        var7 = 0;
        if (param2 != -14561) {
          vd.a(-78, 112, -21, -44, 75, -60);
          L2: while (true) {
            if (param0 <= var7) {
              L3: {
                jh.b();
                jh.b();
                jh.b();
                if (param3 == -3) {
                  wh.field_g.j(-var6 + param4, param5);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (-3 == param1) {
                wh.field_g.h(param0 + param4, param5);
                if ((param3 ^ -1) == -2) {
                  var7 = 0;
                  L4: while (true) {
                    if (8 <= var7) {
                      if (param1 == 1) {
                        var7 = 0;
                        L5: while (true) {
                          if (var7 < 8) {
                            qe.b(param0 + (param4 - (1 - -var7)), param5, 8, 0, 192 - 24 * var7);
                            var7++;
                            continue L5;
                          } else {
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      qe.b(param4 - -var7, param5, 8, 0, -(24 * var7) + 192);
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  if (param1 == 1) {
                    var7 = 0;
                    L6: while (true) {
                      if (var7 < 8) {
                        qe.b(param0 + (param4 - (1 - -var7)), param5, 8, 0, 192 - 24 * var7);
                        var7++;
                        continue L6;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L7: {
                  if ((param3 ^ -1) != -2) {
                    break L7;
                  } else {
                    var7 = 0;
                    L8: while (true) {
                      if (8 <= var7) {
                        break L7;
                      } else {
                        qe.b(param4 - -var7, param5, 8, 0, -(24 * var7) + 192);
                        var7++;
                        continue L8;
                      }
                    }
                  }
                }
                if (param1 == 1) {
                  var7 = 0;
                  L9: while (true) {
                    if (var7 < 8) {
                      qe.b(param0 + (param4 - (1 - -var7)), param5, 8, 0, 192 - 24 * var7);
                      var7++;
                      continue L9;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              bk.field_e.b(var7 + param4, param5);
              var7 = var7 + bk.field_e.field_d;
              continue L2;
            }
          }
        } else {
          L10: while (true) {
            if (param0 <= var7) {
              L11: {
                jh.b();
                jh.b();
                jh.b();
                if (param3 == -3) {
                  wh.field_g.j(-var6 + param4, param5);
                  break L11;
                } else {
                  break L11;
                }
              }
              if (-3 != param1) {
                L12: {
                  if ((param3 ^ -1) != -2) {
                    break L12;
                  } else {
                    var7 = 0;
                    L13: while (true) {
                      if (8 <= var7) {
                        break L12;
                      } else {
                        qe.b(param4 - -var7, param5, 8, 0, -(24 * var7) + 192);
                        var7++;
                        continue L13;
                      }
                    }
                  }
                }
                if (param1 == 1) {
                  var7 = 0;
                  L14: while (true) {
                    if (var7 < 8) {
                      qe.b(param0 + (param4 - (1 - -var7)), param5, 8, 0, 192 - 24 * var7);
                      var7++;
                      continue L14;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L15: {
                  wh.field_g.h(param0 + param4, param5);
                  if ((param3 ^ -1) != -2) {
                    break L15;
                  } else {
                    var7 = 0;
                    L16: while (true) {
                      if (8 <= var7) {
                        break L15;
                      } else {
                        qe.b(param4 - -var7, param5, 8, 0, -(24 * var7) + 192);
                        var7++;
                        continue L16;
                      }
                    }
                  }
                }
                if (param1 == 1) {
                  var7 = 0;
                  L17: while (true) {
                    if (var7 < 8) {
                      qe.b(param0 + (param4 - (1 - -var7)), param5, 8, 0, 192 - 24 * var7);
                      var7++;
                      continue L17;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              bk.field_e.b(var7 + param4, param5);
              var7 = var7 + bk.field_e.field_d;
              continue L10;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "ACHIEVEMENTS";
        field_a = 94;
        field_d = "End Game";
        field_b = "<col=8B1717>Disarm</col>";
    }
}
