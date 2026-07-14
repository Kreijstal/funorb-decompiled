/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static uc field_a;
    static li field_c;
    static hl field_b;

    final static void a(byte param0, nj param1) {
        int var2 = 0;
        int var3 = 0;
        nj var4 = null;
        int var5 = 0;
        var5 = stellarshard.field_B;
        var2 = 79 / ((param0 - 16) / 36);
        if (param1.field_m == null) {
          return;
        } else {
          L0: {
            L1: {
              if (0 != param1.field_a) {
                break L1;
              } else {
                if (0 == param1.field_i) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= gi.field_g) {
                break L0;
              } else {
                var4 = ai.field_d[var3];
                if ((var4.field_p ^ -1) == -3) {
                  if (var4.field_a == param1.field_a) {
                    if (param1.field_i == var4.field_i) {
                      return;
                    } else {
                      var3++;
                      continue L2;
                    }
                  } else {
                    var3++;
                    continue L2;
                  }
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (param1.field_k != null) {
              break L3;
            } else {
              break L3;
            }
          }
          vd.a(param1, -128);
          return;
        }
    }

    final static wb a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var6 = stellarshard.field_B;
        var2 = param0.length();
        if (var2 != 0) {
          if (-65 > var2) {
            return bg.field_a;
          } else {
            if (param0.charAt(0) == 34) {
              if (-35 != param0.charAt(-1 + var2)) {
                return h.field_a;
              } else {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (var4 < var2 - 1) {
                    var5 = param0.charAt(var4);
                    if (var5 != 92) {
                      if (var5 != 34) {
                        var3 = 0;
                        var4++;
                        continue L0;
                      } else {
                        if (var3 == 0) {
                          return h.field_a;
                        } else {
                          var3 = 0;
                          var4++;
                          continue L0;
                        }
                      }
                    } else {
                      L1: {
                        if (var3 != 0) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L1;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L1;
                        }
                      }
                      var3 = stackIn_17_0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              var3 = 0;
              var4 = 0;
              L2: while (true) {
                if (var4 >= var2) {
                  if (param1 != 1) {
                    field_a = null;
                    return null;
                  } else {
                    return null;
                  }
                } else {
                  var5 = param0.charAt(var4);
                  if (var5 != 46) {
                    if (-1 == vk.field_c.indexOf(var5)) {
                      return h.field_a;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L2;
                    }
                  } else {
                    L3: {
                      if (var4 == 0) {
                        break L3;
                      } else {
                        if (var4 == -1 + var2) {
                          break L3;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    return h.field_a;
                  }
                }
              }
            }
          }
        } else {
          return uj.field_d;
        }
    }

    public static void b(byte param0) {
        if (param0 != -30) {
            return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static int a(byte param0) {
        int var1 = -110 % ((76 - param0) / 49);
        return -od.field_r + dd.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new uc();
        field_c = new li(7, 0, 1, 1);
    }
}
