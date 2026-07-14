/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var13 = StarCannon.field_A;
          var5 = param0 + param4;
          var6 = param3 + param1;
          if (ki.field_l < param4) {
            stackOut_2_0 = param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ki.field_l;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (ki.field_e < param3) {
            stackOut_5_0 = param3;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = ki.field_e;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (var5 < ki.field_g) {
            stackOut_8_0 = var5;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = ki.field_g;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (var6 < ki.field_i) {
            stackOut_11_0 = var6;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = ki.field_i;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var10 = stackIn_12_0;
          if (param4 < ki.field_l) {
            break L4;
          } else {
            if (param4 < ki.field_g) {
              var11 = param4 + var8 * ki.field_j;
              var12 = var10 + (1 - var8) >> -849429215;
              L5: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  break L4;
                } else {
                  ki.field_a[var11] = 16777215;
                  var11 = var11 + 2 * ki.field_j;
                  continue L5;
                }
              }
            } else {
              break L4;
            }
          }
        }
        L6: {
          if (param3 < ki.field_e) {
            break L6;
          } else {
            if (var6 < ki.field_i) {
              var11 = var7 + param3 * ki.field_j;
              var12 = var9 + 1 + -var7 >> -1804781407;
              L7: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  break L6;
                } else {
                  ki.field_a[var11] = 16777215;
                  var11 += 2;
                  continue L7;
                }
              }
            } else {
              break L6;
            }
          }
        }
        L8: {
          if (param2 == -140110815) {
            break L8;
          } else {
            field_a = 57;
            break L8;
          }
        }
        L9: {
          if (ki.field_l > var5) {
            break L9;
          } else {
            if (ki.field_g <= var5) {
              break L9;
            } else {
              var11 = ((-param4 + var5 & 1) + var8) * ki.field_j - -var5;
              var12 = -var8 + 1 - -var10 >> -140110815;
              L10: while (true) {
                var12--;
                if (0 > var12) {
                  break L9;
                } else {
                  ki.field_a[var11] = 16777215;
                  var11 = var11 + ki.field_j * 2;
                  continue L10;
                }
              }
            }
          }
        }
        L11: {
          if (param3 < ki.field_e) {
            break L11;
          } else {
            if (var6 >= ki.field_i) {
              break L11;
            } else {
              var11 = (-param3 + var6 & 1) + (var7 + ki.field_j * var6);
              var12 = -var7 + (1 - -var9) >> 1999135681;
              L12: while (true) {
                var12--;
                if ((var12 ^ -1) > -1) {
                  break L11;
                } else {
                  ki.field_a[var11] = 16777215;
                  var11 += 2;
                  continue L12;
                }
              }
            }
          }
        }
    }

    final static id[] a(boolean param0, ue param1, int param2, int param3) {
        if (!param0) {
            return null;
        }
        if (!qb.a((byte) 126, param3, param2, param1)) {
            return null;
        }
        return tj.h(126);
    }

    final static void a(int param0, int param1, int param2, byte param3, boolean param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        if (param1 >= param5) {
          return;
        } else {
          if (param2 > 1 + param1) {
            L0: {
              if (param2 <= 5 + param1) {
                break L0;
              } else {
                if (param0 != param6) {
                  var7 = (param6 >> 1339871713) + (param0 >> -1979953311) - -(1 & (param6 & param0));
                  var8 = param1;
                  var9 = param0;
                  var10 = 100 / ((-53 - param3) / 63);
                  var11 = param6;
                  var12 = param1;
                  L1: while (true) {
                    if (var12 >= param2) {
                      ji.a(param0, param1, var8, (byte) -124, param4, param5, var9);
                      ji.a(var11, var8, param2, (byte) -128, param4, param5, param6);
                      return;
                    } else {
                      L2: {
                        var13 = jk.field_c[var12];
                        if (!param4) {
                          stackOut_21_0 = fg.field_b[var13];
                          stackIn_22_0 = stackOut_21_0;
                          break L2;
                        } else {
                          stackOut_20_0 = tk.field_f[var13];
                          stackIn_22_0 = stackOut_20_0;
                          break L2;
                        }
                      }
                      var14 = stackIn_22_0;
                      if (var7 < var14) {
                        L3: {
                          jk.field_c[var12] = jk.field_c[var8];
                          if (var9 > var14) {
                            var9 = var14;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        jk.field_c[var8] = var13;
                        var12++;
                        continue L1;
                      } else {
                        if (var11 < var14) {
                          var11 = var14;
                          var12++;
                          continue L1;
                        } else {
                          var12++;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            var7 = -1 + param2;
            L4: while (true) {
              if (param1 >= var7) {
                return;
              } else {
                var8 = param1;
                L5: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L4;
                  } else {
                    var9 = jk.field_c[var8];
                    var10 = jk.field_c[1 + var8];
                    if (mj.a(var9, param4, -24153, var10)) {
                      jk.field_c[var8] = var10;
                      jk.field_c[var8 - -1] = var9;
                      var8++;
                      continue L5;
                    } else {
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    static {
    }
}
