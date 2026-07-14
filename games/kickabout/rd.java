/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static String field_a;
    int field_m;
    int field_g;
    boolean field_j;
    static vl field_h;
    static int field_i;
    static String field_c;
    int field_k;
    static String field_d;
    static String field_b;
    boolean[][][] field_l;
    long field_f;
    static String[] field_e;

    final static boolean a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -16143) {
          if (-1 >= (param1 ^ -1)) {
            if (1582 <= param1) {
              if (param1 % 4 != 0) {
                return false;
              } else {
                if (0 != param1 % 100) {
                  return true;
                } else {
                  if (param1 % 400 != 0) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              L0: {
                if (-1 != (param1 % 4 ^ -1)) {
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  break L0;
                } else {
                  stackOut_28_0 = 1;
                  stackIn_30_0 = stackOut_28_0;
                  break L0;
                }
              }
              return stackIn_30_0 != 0;
            }
          } else {
            L1: {
              if (0 != (param1 + 1) % 4) {
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L1;
              } else {
                stackOut_23_0 = 1;
                stackIn_25_0 = stackOut_23_0;
                break L1;
              }
            }
            return stackIn_25_0 != 0;
          }
        } else {
          field_h = null;
          if (-1 >= (param1 ^ -1)) {
            if (1582 <= param1) {
              if (param1 % 4 != 0) {
                return false;
              } else {
                if (0 != param1 % 100) {
                  return true;
                } else {
                  if (param1 % 400 != 0) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              L2: {
                if (-1 != (param1 % 4 ^ -1)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L3: {
              if (0 != (param1 + 1) % 4) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final boolean a(long param0, int param1, int param2) {
        int var5 = 0;
        var5 = 43 / ((25 - param1) / 53);
        if (((rd) this).field_j) {
          if (-3 >= (param2 ^ -1)) {
            if ((((rd) this).field_f ^ -1L) != 0L) {
              if ((((rd) this).field_f ^ -1L) == (param0 ^ -1L)) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          if ((((rd) this).field_f ^ -1L) != 0L) {
            if ((((rd) this).field_f ^ -1L) == (param0 ^ -1L)) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
          rd.a(true);
          field_e = null;
          field_c = null;
          field_h = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          field_h = null;
          field_d = null;
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 == -1) {
          if (-1 != (((rd) this).field_m ^ -1)) {
            if ((((rd) this).field_m ^ -1) != -14) {
              if (((rd) this).field_m == 23) {
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
          return false;
        }
    }

    final boolean a(int param0, byte[] param1, byte param2) {
        if (param2 > -8) {
            return true;
        }
        if (!(((rd) this).field_g != -1)) {
            return false;
        }
        return !gf.a(param1, ((rd) this).field_g, param0, 3231) ? true : false;
    }

    final boolean a(int param0, byte param1, int[] param2) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == 54) {
          if ((param0 ^ -1) > -3) {
            if ((((rd) this).field_k ^ -1) == 0) {
              return false;
            } else {
              L0: {
                if (c.a(((rd) this).field_k, 0, param2)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$8 = ((rd) this).a(93L, 123, -46);
          if ((param0 ^ -1) > -3) {
            if ((((rd) this).field_k ^ -1) == 0) {
              return false;
            } else {
              L1: {
                if (c.a(((rd) this).field_k, 0, param2)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    rd(int param0, int param1, boolean param2, long param3, String param4) {
        ((rd) this).field_f = param3;
        ((rd) this).field_k = param0;
        ((rd) this).field_j = param2 ? true : false;
        ((rd) this).field_g = param1;
        ((rd) this).field_l = ih.a(21656, param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Hide game chat";
        field_i = 250;
        field_d = "tackles and kicks";
        field_b = "Select a home pitch to host games on.";
        field_h = new vl("");
    }
}
