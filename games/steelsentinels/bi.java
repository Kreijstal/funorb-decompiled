/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static kg field_f;
    static int[][] field_e;
    static int field_d;
    static String field_a;
    static String field_g;
    static String field_c;
    static String[] field_b;

    final static void a(int param0) {
        jm var1 = null;
        kj var2 = null;
        Object var3 = null;
        var1 = (jm) (Object) ri.field_c.e(13058);
        if (var1 != null) {
          if (param0 != 2158) {
            var3 = null;
            boolean discarded$9 = bi.a(false, -110, true, (CharSequence) null);
            var2 = rf.field_d;
            int discarded$10 = var2.i(0);
            int discarded$11 = var2.i(0);
            int discarded$12 = var2.i(0);
            int discarded$13 = var2.i(0);
            var1.b(param0 + -2154);
            return;
          } else {
            var2 = rf.field_d;
            int discarded$14 = var2.i(0);
            int discarded$15 = var2.i(0);
            int discarded$16 = var2.i(0);
            int discarded$17 = var2.i(0);
            var1.b(param0 + -2154);
            return;
          }
        } else {
          pm.m(103);
          return;
        }
    }

    final static void b(int param0) {
        ne.field_N.field_f = 0;
        ne.field_N.field_t = 0;
        if (param0 >= -49) {
            boolean discarded$0 = bi.b(12, -123);
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static boolean b(int param0, int param1) {
        int var2 = 0;
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        var2 = 76 % ((param0 - 58) / 44);
        if (param1 != -44) {
          if (-45 != param1) {
            if (-49 != (param1 ^ -1)) {
              if (31 != param1) {
                if (46 != param1) {
                  if ((param1 ^ -1) != -53) {
                    if (45 != param1) {
                      if (47 == param1) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      return stackIn_15_0 != 0;
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
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        int var1 = -15 % ((7 - param0) / 47);
        field_b = null;
        field_e = null;
        field_g = null;
        field_a = null;
        field_c = null;
    }

    final static boolean a(String param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (null != gj.field_b) {
          if (!param1) {
            return true;
          } else {
            L0: {
              if ((param0.toLowerCase().indexOf(gj.field_b.toLowerCase()) ^ -1) > -1) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static boolean a(boolean param0, int param1, boolean param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SteelSentinels.field_G;
        if ((param1 ^ -1) <= -3) {
          if ((param1 ^ -1) >= -37) {
            var4 = 0;
            var5 = param2 ? 1 : 0;
            var6 = 0;
            var7 = param3.length();
            var8 = 0;
            L0: while (true) {
              if (var7 > var8) {
                L1: {
                  var9 = param3.charAt(var8);
                  if (0 != var8) {
                    break L1;
                  } else {
                    if (45 != var9) {
                      if (var9 != 43) {
                        break L1;
                      } else {
                        if (!param0) {
                          break L1;
                        } else {
                          var8++;
                          continue L0;
                        }
                      }
                    } else {
                      var4 = 1;
                      var8++;
                      var8++;
                      continue L0;
                    }
                  }
                }
                L2: {
                  L3: {
                    if (var9 < 48) {
                      break L3;
                    } else {
                      if (var9 <= 57) {
                        var9 -= 48;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (65 > var9) {
                      break L4;
                    } else {
                      if (90 >= var9) {
                        var9 -= 55;
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var9 < 97) {
                      break L5;
                    } else {
                      if (var9 > 122) {
                        break L5;
                      } else {
                        var9 -= 87;
                        break L2;
                      }
                    }
                  }
                  return false;
                }
                if (var9 >= param1) {
                  return false;
                } else {
                  L6: {
                    if (var4 != 0) {
                      var9 = -var9;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var10 = var6 * param1 + var9;
                  if (var6 == var10 / param1) {
                    var6 = var10;
                    var5 = 1;
                    var8++;
                    continue L0;
                  } else {
                    return false;
                  }
                }
              } else {
                return var5 != 0;
              }
            }
          } else {
            throw new IllegalArgumentException("" + param1);
          }
        } else {
          throw new IllegalArgumentException("" + param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = null;
        field_a = "Show lobby chat from my friends";
        field_e = new int[][]{new int[0], new int[0], new int[1], new int[1], new int[1], new int[1], new int[1], new int[1], new int[0], new int[1], new int[1], new int[1], new int[1], new int[1], new int[0], new int[1], new int[1], new int[0], new int[1], new int[3], new int[1], new int[1], new int[0], new int[0], new int[1], new int[0], new int[0], new int[1], new int[0], new int[1]};
        field_c = "Return to lobby";
        field_g = "<%0> wants to join";
        field_b = new String[]{"Range", "Rate of fire", "Reload speed", "Area of effect", "Energy efficiency", "Kinetic damage", "Explosive damage", "Energy damage", "EMP"};
    }
}
