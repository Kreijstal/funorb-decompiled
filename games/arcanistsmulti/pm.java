/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    static String field_g;
    static rc field_h;
    static String[] field_f;
    static h field_e;
    static ll[] field_d;
    static qb field_a;
    static sa field_b;
    static int field_c;

    final static boolean a(char param0, int param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (!hn.a(param0, 17769)) {
            if (param0 != (char)param1) {
              if (160 != param0) {
                if (param0 != 32) {
                  if (param0 == 95) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_c = 72;
          field_h = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_b = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_h = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_b = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    final static ri a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = param1.length();
        if (0 != var2) {
          if (var2 > 64) {
            return b.field_e;
          } else {
            if (param1.charAt(0) != 34) {
              var3 = 0;
              if (param0 == -58) {
                var4 = 0;
                L0: while (true) {
                  if (var2 > var4) {
                    var5 = param1.charAt(var4);
                    if (var5 == 46) {
                      L1: {
                        if (var4 == 0) {
                          break L1;
                        } else {
                          if (var4 == -1 + var2) {
                            break L1;
                          } else {
                            if (var3 != 0) {
                              break L1;
                            } else {
                              var3 = 1;
                              var4++;
                              var4++;
                              continue L0;
                            }
                          }
                        }
                      }
                      return n.field_b;
                    } else {
                      if (tl.field_b.indexOf(var5) == -1) {
                        return n.field_b;
                      } else {
                        var3 = 0;
                        var4++;
                        var4++;
                        continue L0;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              if (34 == param1.charAt(-1 + var2)) {
                var3 = 0;
                var4 = 1;
                L2: while (true) {
                  if (-1 + var2 > var4) {
                    var5 = param1.charAt(var4);
                    if (92 == var5) {
                      L3: {
                        if (var3 != 0) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L3;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L3;
                        }
                      }
                      var3 = stackIn_16_0;
                      var4++;
                      continue L2;
                    } else {
                      L4: {
                        if (var5 != 34) {
                          break L4;
                        } else {
                          if (var3 == 0) {
                            return n.field_b;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L2;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return n.field_b;
              }
            }
          }
        } else {
          return uh.field_i;
        }
    }

    final static qb[] a(int param0, qb param1) {
        qb[] var2 = null;
        qb[] var3 = null;
        if (param0 <= 29) {
          field_a = null;
          var3 = new qb[9];
          var2 = var3;
          var3[4] = param1;
          return var2;
        } else {
          var3 = new qb[9];
          var2 = var3;
          var3[4] = param1;
          return var2;
        }
    }

    final static void a(uj[] param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        uj var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = param0.length;
        if (param1 != -1) {
          return;
        } else {
          var3 = 1;
          L0: while (true) {
            if (var2 <= var3) {
              return;
            } else {
              var4 = param0[var3];
              var5 = var3 + -1;
              L1: while (true) {
                L2: {
                  if ((var5 ^ -1) > -1) {
                    break L2;
                  } else {
                    if (!cg.a((byte) -111, param0[var5], var4)) {
                      break L2;
                    } else {
                      param0[var5 + 1] = param0[var5];
                      var5--;
                      continue L1;
                    }
                  }
                }
                param0[1 + var5] = var4;
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Explode on contact with the landscape. Hold the mouse to increase the velocity of the attack.";
    }
}
