/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends ms {
    byte[] field_k;
    int field_l;
    long field_m;

    final static void a(int param0) {
        ah var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ah var5 = null;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var5 = aa.field_a[0];
        var1 = var5;
        if (param0 >= 18) {
          L0: {
            if (ar.field_G != 1) {
              L1: {
                L2: {
                  if (hw.field_b[99]) {
                    break L2;
                  } else {
                    if (hw.field_b[Sumoblitz.field_I]) {
                      break L2;
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_9_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_8_0 = 256;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
              L3: {
                L4: {
                  stackOut_9_0 = stackIn_9_0;
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (hw.field_b[98]) {
                    break L4;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (hw.field_b[nv.field_c]) {
                      break L4;
                    } else {
                      stackOut_11_0 = stackIn_11_0;
                      stackOut_11_1 = 0;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      break L3;
                    }
                  }
                }
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = -256;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L3;
              }
              L5: {
                L6: {
                  var3 = stackIn_13_0 + stackIn_13_1;
                  if (hw.field_b[96]) {
                    break L6;
                  } else {
                    if (hw.field_b[rp.field_d]) {
                      break L6;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                }
                stackOut_16_0 = -256;
                stackIn_17_0 = stackOut_16_0;
                break L5;
              }
              L7: {
                L8: {
                  stackOut_17_0 = stackIn_17_0;
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (hw.field_b[97]) {
                    break L8;
                  } else {
                    stackOut_18_0 = stackIn_18_0;
                    stackIn_21_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (!hw.field_b[ad.field_o]) {
                      stackOut_21_0 = stackIn_21_0;
                      stackOut_21_1 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      break L7;
                    } else {
                      stackOut_19_0 = stackIn_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      break L8;
                    }
                  }
                }
                stackOut_20_0 = stackIn_20_0;
                stackOut_20_1 = 256;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                break L7;
              }
              L9: {
                var2 = stackIn_22_0 + stackIn_22_1;
                if (var2 == 0) {
                  break L9;
                } else {
                  if (var3 != -1) {
                    var5.b(-109, var3 / 22, var2 / 22);
                    kp.field_a = true;
                    if (hw.field_b[83]) {
                      if (!var5.n(123)) {
                        var5.b(false);
                        if (-2 == (var5.field_l ^ -1)) {
                          if (!var5.j(20)) {
                            gn.a(33, true);
                            return;
                          } else {
                            gn.a(29, true);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        var5.k((byte) -90);
                        return;
                      }
                    } else {
                      var5.m(-95);
                      return;
                    }
                  } else {
                    break L9;
                  }
                }
              }
              if (-1 != var2) {
                var5.b(-119, var3, var2);
                kp.field_a = true;
                break L0;
              } else {
                if (-1 != (var3 ^ -1)) {
                  var5.b(-119, var3, var2);
                  kp.field_a = true;
                  if (hw.field_b[83]) {
                    if (!var5.n(123)) {
                      var5.b(false);
                      if (-2 == (var5.field_l ^ -1)) {
                        if (!var5.j(20)) {
                          gn.a(33, true);
                          return;
                        } else {
                          gn.a(29, true);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      var5.k((byte) -90);
                      return;
                    }
                  } else {
                    var5.m(-95);
                    return;
                  }
                } else {
                  break L0;
                }
              }
            } else {
              var5.a(false, pi.field_e << 912686984, ko.field_p << -490324056);
              kp.field_a = true;
              break L0;
            }
          }
          if (hw.field_b[83]) {
            if (!var5.n(123)) {
              var5.b(false);
              if (-2 == (var5.field_l ^ -1)) {
                if (!var5.j(20)) {
                  gn.a(33, true);
                  return;
                } else {
                  gn.a(29, true);
                  return;
                }
              } else {
                return;
              }
            } else {
              var5.k((byte) -90);
              return;
            }
          } else {
            var5.m(-95);
            return;
          }
        } else {
          return;
        }
    }

    ub(long param0, int param1, byte[] param2) {
        ((ub) this).field_l = param1;
        ((ub) this).field_k = param2;
        ((ub) this).field_m = param0;
    }

    final static wb[] a(ki param0, String param1, byte param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.a(0, param1);
        if (param2 != -56) {
          return null;
        } else {
          var5 = param0.a(var4, param3, (byte) 126);
          return kr.a(19889, param0, var5, var4);
        }
    }

    static {
    }
}
