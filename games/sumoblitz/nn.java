/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nn {
    static ri[] field_a;

    final static void a(br param0, byte param1) {
        int var2 = 0;
        int var4 = 0;
        br var5 = null;
        br var9 = null;
        br var10 = null;
        br var11 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (null == param0.field_e) {
          return;
        } else {
          if (param1 >= 43) {
            if (param0.field_h != 0) {
              var2 = 0;
              L0: while (true) {
                if (kb.field_a > var2) {
                  var11 = aj.field_D[var2];
                  if (var11.field_g != 2) {
                    var2++;
                    var2++;
                    continue L0;
                  } else {
                    if (param0.field_h == var11.field_h) {
                      if (var11.field_c == param0.field_c) {
                        return;
                      } else {
                        var2++;
                        continue L0;
                      }
                    } else {
                      var2++;
                      continue L0;
                    }
                  }
                } else {
                  L1: {
                    if (null == param0.field_b) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  dl.a(param0, (byte) 76);
                  return;
                }
              }
            } else {
              if (0 != param0.field_c) {
                var2 = 0;
                L2: while (true) {
                  if (kb.field_a > var2) {
                    var10 = aj.field_D[var2];
                    if (var10.field_g != 2) {
                      var2++;
                      var2++;
                      continue L2;
                    } else {
                      if (param0.field_h == var10.field_h) {
                        if (var10.field_c == param0.field_c) {
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
                      if (null == param0.field_b) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    dl.a(param0, (byte) 76);
                    return;
                  }
                }
              } else {
                L4: {
                  if (null == param0.field_b) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                dl.a(param0, (byte) 76);
                return;
              }
            }
          } else {
            field_a = null;
            if (param0.field_h == 0) {
              if (0 != param0.field_c) {
                var2 = 0;
                L5: while (true) {
                  if (kb.field_a > var2) {
                    var9 = aj.field_D[var2];
                    if (var9.field_g != 2) {
                      var2++;
                      var2++;
                      continue L5;
                    } else {
                      if (param0.field_h == var9.field_h) {
                        if (var9.field_c == param0.field_c) {
                          return;
                        } else {
                          var2++;
                          continue L5;
                        }
                      } else {
                        var2++;
                        continue L5;
                      }
                    }
                  } else {
                    L6: {
                      if (null == param0.field_b) {
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    dl.a(param0, (byte) 76);
                    return;
                  }
                }
              } else {
                L7: {
                  if (null == param0.field_b) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                dl.a(param0, (byte) 76);
                return;
              }
            } else {
              var2 = 0;
              if (kb.field_a > var2) {
                var5 = aj.field_D[var2];
                if (var5.field_g == 2) {
                  if (param0.field_h == var5.field_h) {
                    if (var5.field_c == param0.field_c) {
                      return;
                    } else {
                      L8: {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        if (null == param0.field_b) {
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      dl.a(param0, (byte) 76);
                      return;
                    }
                  } else {
                    L9: {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      if (null == param0.field_b) {
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    dl.a(param0, (byte) 76);
                    return;
                  }
                } else {
                  var2++;
                  L10: {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    if (null == param0.field_b) {
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  dl.a(param0, (byte) 76);
                  return;
                }
              } else {
                L11: {
                  if (null == param0.field_b) {
                    break L11;
                  } else {
                    break L11;
                  }
                }
                dl.a(param0, (byte) 76);
                return;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        lk.f(param1, param4, 1 + param2, 10000536);
        lk.f(param1, param4 - -param0, 1 + param2, 12105912);
        var5 = 1;
        if (param3 != -84) {
          return;
        } else {
          L0: {
            var6 = param0;
            if (lk.field_i <= var5 + param4) {
              break L0;
            } else {
              var5 = -param4 + lk.field_i;
              break L0;
            }
          }
          L1: {
            if (param4 + var6 <= lk.field_e) {
              break L1;
            } else {
              var6 = lk.field_e + -param4;
              break L1;
            }
          }
          var7 = var5;
          L2: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 152 + 48 * var7 / param0;
              var9 = var8 << -1856017616 | var8 << 984406600 | var8;
              lk.field_a[param1 + lk.field_b * (var7 + param4)] = var9;
              lk.field_a[(param4 - -var7) * lk.field_b + (param1 - -param2)] = var9;
              var7++;
              continue L2;
            }
          }
        }
    }

    abstract byte[] a(int param0, int param1, int param2);

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = 53 / ((55 - param1) / 52);
        L0: while (true) {
          if (param0 > var2) {
            if (qn.field_d[var2]) {
              var2++;
              continue L0;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    abstract byte[] a(boolean param0);

    abstract void a(byte[] param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, wb[] param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Sumoblitz.field_L ? 1 : 0;
        if (param4 != null) {
          if (param1 <= 0) {
            return;
          } else {
            var6 = param4[0].field_z;
            var7 = param4[2].field_z;
            var8 = param4[1].field_z;
            param4[0].b(param5, param2, param0);
            var9 = -64 % ((param3 - -25) / 61);
            param4[2].b(-var7 + param1 + param5, param2, param0);
            lk.b(mo.field_t);
            lk.e(param5 + var6, param2, -var7 + (param1 + param5), param2 - -param4[1].field_w);
            var10 = param5 - -var6;
            var11 = -var7 + param1 + param5;
            param5 = var10;
            L0: while (true) {
              if (param5 >= var11) {
                lk.a(mo.field_t);
                return;
              } else {
                param4[1].b(param5, param2, param0);
                param5 = param5 + var8;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        int var1 = 65 / ((-2 - param0) / 57);
        field_a = null;
    }

    final static void b(int param0, int param1) {
        if (param1 > -95) {
            nn.a(27, 41, -94, (byte) -104, 35);
        }
    }

    static {
    }
}
