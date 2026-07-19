/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int field_a;
    static String field_e;
    static bi field_f;
    static String field_c;
    static String field_d;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != 0) {
          ef.a(-116);
          field_f = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static boolean a(char param0, boolean param1) {
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        if (!param1) {
          if (param0 < 48) {
            if (param0 < 65) {
              L0: {
                if (param0 < 97) {
                  break L0;
                } else {
                  if (122 < param0) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              if (param0 <= 90) {
                stackOut_28_0 = 1;
                stackIn_30_0 = stackOut_28_0;
                return stackIn_30_0 != 0;
              } else {
                L1: {
                  L2: {
                    if (param0 < 97) {
                      break L2;
                    } else {
                      if (122 < param0) {
                        break L2;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L1;
                      }
                    }
                  }
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                }
                return stackIn_27_0 != 0;
              }
            }
          } else {
            if (param0 > 57) {
              if (param0 >= 65) {
                if (param0 > 90) {
                  if (param0 >= 97) {
                    if (122 < param0) {
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
              } else {
                if (param0 >= 97) {
                  if (122 < param0) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(boolean param0) {
        kc.field_b = new pf();
        if (!param0) {
            field_f = (bi) null;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if ((param0 & 7) == 0) {
            break L0;
          } else {
            var2 = -(7 & param0) + 8;
            break L0;
          }
        }
        if (param1 != 57) {
          return 23;
        } else {
          var3 = var2 + param0;
          return var3;
        }
    }

    static {
        field_c = "PEACE!";
        field_e = "The '<%0>' setting needs to be changed.";
        field_d = ", ";
        field_b = "This is <%0>'s RuneScape clan if they have one.";
    }
}
