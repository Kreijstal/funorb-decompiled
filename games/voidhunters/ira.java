/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ira extends mfb {
    static lkb field_b;
    static java.awt.Frame field_c;

    ira() {
    }

    final boolean h(byte param0) {
        if (param0 <= 18) {
            int discarded$0 = ((ira) this).a(false);
            return false;
        }
        return false;
    }

    final int b(boolean param0) {
        if (param0) {
            return 72;
        }
        return qh.field_J;
    }

    final int a(boolean param0) {
        if (param0) {
            field_b = null;
            return 41;
        }
        return 41;
    }

    final int b(int param0) {
        int var2 = -55 / ((7 - param0) / 47);
        return ljb.field_o;
    }

    final int f(byte param0) {
        if (param0 < 0) {
            field_c = null;
            return fja.field_o;
        }
        return fja.field_o;
    }

    final boolean e(int param0) {
        int var2 = -111 / ((param0 - 54) / 54);
        return true;
    }

    public static void l(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 17036) {
            Object var2 = null;
            boolean discarded$0 = ira.a(25L, (String) null, -89);
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((ira) this).c((byte) -16);
            return eg.field_o;
        }
        return eg.field_o;
    }

    final int g(byte param0) {
        if (param0 > -12) {
            int discarded$0 = ((ira) this).d((byte) -91);
            return nob.field_p;
        }
        return nob.field_p;
    }

    final int k(int param0) {
        if (param0 != 0) {
            return -72;
        }
        return 3;
    }

    final int c(byte param0) {
        int var2 = -86 % ((param0 - 75) / 46);
        return upb.field_a;
    }

    final static boolean a(long param0, String param1, int param2) {
        vu var4 = null;
        Object var5 = null;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        var4 = di.a(param1, 0);
        if (param2 == 41) {
          if (var4 != null) {
            if (null == var4.field_Ab) {
              L0: {
                L1: {
                  if (null == lqa.field_o) {
                    break L1;
                  } else {
                    if (null == pjb.a(param0, true)) {
                      break L1;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L0;
                    }
                  }
                }
                stackOut_29_0 = 0;
                stackIn_30_0 = stackOut_29_0;
                break L0;
              }
              return stackIn_30_0 != 0;
            } else {
              return true;
            }
          } else {
            L2: {
              L3: {
                if (null == lqa.field_o) {
                  break L3;
                } else {
                  if (null == pjb.a(param0, true)) {
                    break L3;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L2;
                  }
                }
              }
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L2;
            }
            return stackIn_23_0 != 0;
          }
        } else {
          var5 = null;
          boolean discarded$1 = ira.a(1L, (String) null, 31);
          if (var4 != null) {
            if (null != var4.field_Ab) {
              return true;
            } else {
              if (null != lqa.field_o) {
                if (null == pjb.a(param0, true)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            if (null != lqa.field_o) {
              if (null == pjb.a(param0, true)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final int g(int param0) {
        if (param0 != 2769) {
            return 6;
        }
        return uh.field_q;
    }

    final boolean h(int param0) {
        if (param0 != -2291) {
            field_b = null;
            return true;
        }
        return true;
    }

    final int d(byte param0) {
        if (param0 >= -52) {
            field_b = null;
            return mqa.field_s;
        }
        return mqa.field_s;
    }

    final int c(int param0) {
        if (param0 != 0) {
            return -95;
        }
        return asa.field_e;
    }

    final int a(byte param0) {
        int var2 = 106 % ((param0 - -48) / 43);
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new lkb();
    }
}
