/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends gg {
    int field_m;
    static int field_n;
    int[] field_h;
    static int field_p;
    int field_l;
    int field_i;
    int field_o;
    int field_k;
    int field_j;

    final static void a(byte param0, hf param1) {
        int var2 = 0;
        int var4 = 0;
        Object var5 = null;
        hf var6 = null;
        hf var8 = null;
        hf var15 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param1.field_e != null) {
          if (param0 == -70) {
            L0: {
              if (0 != param1.field_j) {
                break L0;
              } else {
                if (-1 != (param1.field_a ^ -1)) {
                  break L0;
                } else {
                  L1: {
                    if (null == param1.field_g) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  qg.a(param1, (byte) -92);
                  return;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (field_p > var2) {
                var15 = kc.field_K[var2];
                if (var15.field_i != 2) {
                  var2++;
                  var2++;
                  continue L2;
                } else {
                  if (var15.field_j == param1.field_j) {
                    if (param1.field_a == var15.field_a) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              } else {
                L3: {
                  if (null == param1.field_g) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                qg.a(param1, (byte) -92);
                return;
              }
            }
          } else {
            var5 = null;
            al.a((gb) null, (gb) null, (byte) 2, (java.math.BigInteger) null, (java.math.BigInteger) null);
            if (0 == param1.field_j) {
              if (-1 != (param1.field_a ^ -1)) {
                var2 = 0;
                L4: while (true) {
                  if (field_p > var2) {
                    var8 = kc.field_K[var2];
                    if (var8.field_i != 2) {
                      var2++;
                      var2++;
                      continue L4;
                    } else {
                      if (var8.field_j == param1.field_j) {
                        if (param1.field_a == var8.field_a) {
                          return;
                        } else {
                          var2++;
                          continue L4;
                        }
                      } else {
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    L5: {
                      if (null == param1.field_g) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    qg.a(param1, (byte) -92);
                    return;
                  }
                }
              } else {
                L6: {
                  if (null == param1.field_g) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                qg.a(param1, (byte) -92);
                return;
              }
            } else {
              var2 = 0;
              if (field_p > var2) {
                var6 = kc.field_K[var2];
                if (var6.field_i == 2) {
                  if (var6.field_j == param1.field_j) {
                    if (param1.field_a == var6.field_a) {
                      return;
                    } else {
                      L7: {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        if (null == param1.field_g) {
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      qg.a(param1, (byte) -92);
                      return;
                    }
                  } else {
                    L8: {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      if (null == param1.field_g) {
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    qg.a(param1, (byte) -92);
                    return;
                  }
                } else {
                  var2++;
                  L9: {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    if (null == param1.field_g) {
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  qg.a(param1, (byte) -92);
                  return;
                }
              } else {
                L10: {
                  if (null == param1.field_g) {
                    break L10;
                  } else {
                    break L10;
                  }
                }
                qg.a(param1, (byte) -92);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int[] param4, int param5, int param6, int param7) {
        ((al) this).field_k = param2;
        ((al) this).field_l = param0;
        ((al) this).field_i = param1;
        ((al) this).field_h = param4;
        int var9 = 10 % ((param3 - -67) / 56);
        ((al) this).field_o = param7;
        ((al) this).field_j = param6;
        ((al) this).field_m = param5;
    }

    final static void a(gb param0, gb param1, byte param2, java.math.BigInteger param3, java.math.BigInteger param4) {
        ci.a(param0.field_l, param0.field_m, 8, param3, 0, param4, param1);
        if (param2 <= 71) {
            Object var6 = null;
            al.a((gb) null, (gb) null, (byte) 9, (java.math.BigInteger) null, (java.math.BigInteger) null);
        }
    }

    al() {
    }

    static {
    }
}
