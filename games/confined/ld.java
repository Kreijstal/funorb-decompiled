/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld {
    static int field_l;
    int field_g;
    int field_e;
    static double field_f;
    static int[] field_d;
    int field_c;
    int field_i;
    static String field_b;
    static String field_j;
    int field_a;
    int field_h;
    static df field_k;

    final static boolean a(byte param0, char param1) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        if (param0 == -21) {
          if (48 > param1) {
            if (param1 < 65) {
              if (param1 >= 97) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 <= 90) {
                stackIn_67_0 = 1;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param1 < 97) {
                      break L1;
                    } else {
                      if (param1 > 122) {
                        break L1;
                      } else {
                        stackIn_64_0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackIn_64_0 = 0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (param1 > 57) {
              if (param1 < 65) {
                if (param1 >= 97) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L2: {
                    L3: {
                      if (param1 < 97) {
                        break L3;
                      } else {
                        if (param1 > 122) {
                          break L3;
                        } else {
                          stackIn_50_0 = 1;
                          break L2;
                        }
                      }
                    }
                    stackIn_50_0 = 0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackIn_45_0 = 1;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackIn_40_0 = 1;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          ld.a((byte) -32, '');
          if (48 <= param1) {
            if (param1 > 57) {
              if (param1 < 65) {
                if (param1 >= 97) {
                  if (param1 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L4: {
                    L5: {
                      if (param1 < 97) {
                        break L5;
                      } else {
                        if (param1 > 122) {
                          break L5;
                        } else {
                          stackIn_28_0 = 1;
                          break L4;
                        }
                      }
                    }
                    stackIn_28_0 = 0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackIn_23_0 = 1;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param1 < 65) {
              if (param1 >= 97) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 > 90) {
                if (param1 >= 97) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_j = null;
        field_b = null;
        field_k = null;
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_b = "Hold <%0> to charge, and release to fire";
        field_l = 0;
        field_j = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
