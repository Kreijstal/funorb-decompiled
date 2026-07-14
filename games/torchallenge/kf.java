/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static int field_b;
    static k field_e;
    static int field_c;
    static ji field_a;
    static int field_d;

    final static void a(int param0, bf param1) {
        int var2 = 0;
        bf var3 = null;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (param1.field_n != null) {
          L0: {
            L1: {
              if (param1.field_k != 0) {
                break L1;
              } else {
                if (param1.field_m == -1) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (vd.field_f <= var2) {
                break L0;
              } else {
                var3 = we.field_i[var2];
                if (-3 == var3.field_b) {
                  if (param1.field_k == var3.field_k) {
                    if (var3.field_m == param1.field_m) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (param1.field_j != null) {
              break L3;
            } else {
              break L3;
            }
          }
          if (param0 == 1) {
            ib.a(true, param1);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 >= -69) {
            field_d = -39;
        }
    }

    final static int a(qe param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        var4 = -1;
        var5 = 0;
        if (!vg.a(param0.field_F, -1)) {
          L0: {
            if (param2 == 8) {
              break L0;
            } else {
              field_d = 52;
              break L0;
            }
          }
          return -1;
        } else {
          if (n.field_kb != null) {
            L1: {
              if (-1 < (param0.field_H ^ -1)) {
                break L1;
              } else {
                if (param0.field_H >= ol.field_g.field_a) {
                  break L1;
                } else {
                  if (n.field_kb[param0.field_o][param0.field_H] == null) {
                    n.field_kb[param0.field_o][param0.field_H] = new int[8];
                    var3 = 0;
                    L2: while (true) {
                      if ((var3 ^ -1) <= -9) {
                        n.field_kb[param0.field_o][param0.field_H][0] = param1;
                        return 1;
                      } else {
                        n.field_kb[param0.field_o][param0.field_H][var3] = -1;
                        var3++;
                        continue L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param0.field_H < 0) {
                break L3;
              } else {
                if (param0.field_H >= ol.field_g.field_a) {
                  break L3;
                } else {
                  if (n.field_kb[param0.field_o][param0.field_H] == null) {
                    break L3;
                  } else {
                    var7 = 0;
                    var3 = var7;
                    L4: while (true) {
                      if (8 <= var7) {
                        if (var4 >= 0) {
                          n.field_kb[param0.field_o][param0.field_H][var4] = param1;
                          return 1;
                        } else {
                          return 1;
                        }
                      } else {
                        if (n.field_kb[param0.field_o][param0.field_H][var7] != param1) {
                          if (n.field_kb[param0.field_o][param0.field_H][var7] > -1) {
                            if (-1 > var4) {
                              var4 = var7;
                              var7++;
                              continue L4;
                            } else {
                              var7++;
                              continue L4;
                            }
                          } else {
                            var7++;
                            continue L4;
                          }
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
              }
            }
            return -1;
          } else {
            return -1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new k(13, 0, 1, 0);
        field_d = 0;
        field_a = null;
    }
}
