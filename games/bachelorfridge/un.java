/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    byte[] field_j;
    static int[] field_a;
    byte[] field_b;
    int field_g;
    static kv field_m;
    static int field_i;
    int field_d;
    int field_e;
    int field_l;
    int field_h;
    static String field_f;
    int field_c;
    int field_k;

    public static void a(int param0) {
        field_f = null;
        if (param0 != 2) {
          boolean discarded$2 = un.a(false, -119, 88, 16);
          field_a = null;
          field_m = null;
          return;
        } else {
          field_a = null;
          field_m = null;
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 >= 82) {
          if (Math.abs(param2) >= Math.abs(param1)) {
            if (Math.abs(param2) <= Math.abs(param1)) {
              if (-1 >= (param2 ^ -1)) {
                if (0 < param2) {
                  L0: {
                    if ((param1 ^ -1) > -1) {
                      stackOut_21_0 = 4;
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    } else {
                      stackOut_20_0 = 3;
                      stackIn_22_0 = stackOut_20_0;
                      break L0;
                    }
                  }
                  return stackIn_22_0;
                } else {
                  return 0;
                }
              } else {
                L1: {
                  if ((param1 ^ -1) <= -1) {
                    stackOut_15_0 = 2;
                    stackIn_16_0 = stackOut_15_0;
                    break L1;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L1;
                  }
                }
                return stackIn_16_0;
              }
            } else {
              L2: {
                if (-1 > param2) {
                  stackOut_10_0 = 2;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 4;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                }
              }
              return stackIn_11_0;
            }
          } else {
            L3: {
              if (param1 > -1) {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_4_0 = 3;
                stackIn_6_0 = stackOut_4_0;
                break L3;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return -51;
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        if (param0) {
          if (gk.field_a[param1] > gk.field_a[param3]) {
            return true;
          } else {
            if (gk.field_a[param1] >= gk.field_a[param3]) {
              if (uc.field_k[param3] >= uc.field_k[param1]) {
                if (uc.field_k[param1] >= uc.field_k[param3]) {
                  if (param2 == -17596) {
                    var4 = uda.field_X[param3] + sc.field_o[param3] + mba.field_a[param3];
                    var5 = sc.field_o[param1] + mba.field_a[param1] - -uda.field_X[param1];
                    if (var4 < var5) {
                      return true;
                    } else {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L0: {
                          if (param1 <= param3) {
                            stackOut_44_0 = 0;
                            stackIn_45_0 = stackOut_44_0;
                            break L0;
                          } else {
                            stackOut_43_0 = 1;
                            stackIn_45_0 = stackOut_43_0;
                            break L0;
                          }
                        }
                        return stackIn_45_0 != 0;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          if (uc.field_k[param1] > uc.field_k[param3]) {
            return true;
          } else {
            if (uc.field_k[param1] < uc.field_k[param3]) {
              return false;
            } else {
              if (gk.field_a[param3] < gk.field_a[param1]) {
                return true;
              } else {
                if (gk.field_a[param1] >= gk.field_a[param3]) {
                  if (param2 == -17596) {
                    var4 = uda.field_X[param3] + sc.field_o[param3] + mba.field_a[param3];
                    var5 = sc.field_o[param1] + mba.field_a[param1] - -uda.field_X[param1];
                    if (var4 < var5) {
                      return true;
                    } else {
                      if (var4 > var5) {
                        return false;
                      } else {
                        if (param1 <= param3) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "We've filled your shopping bag with some free food! Click on the shopping bag to see what you have in stock.";
    }
}
