/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nl {
    static cn field_g;
    static pp field_a;
    static String[] field_f;
    static String[] field_b;
    static md field_e;
    static String field_c;
    static int field_d;

    public static void a(byte param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 >= -93) {
          nl.a((byte) -115);
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    abstract void a(byte param0, java.awt.Component param1);

    final static boolean a(int param0, byte param1) {
        int var2;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        var2 = nk.field_Fb[param0];
        if (var2 == 18) {
          L0: {
            if (0 >= mo.field_e) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = 1;
              break L0;
            }
          }
          return stackIn_5_0 != 0;
        } else {
          if ((var2 ^ -1) != -20) {
            if ((var2 ^ -1) != -27) {
              if (25 != var2) {
                if ((var2 ^ -1) == -25) {
                  L1: {
                    if (-7 != (mo.field_e ^ -1)) {
                      stackIn_26_0 = 0;
                      break L1;
                    } else {
                      stackIn_26_0 = 1;
                      break L1;
                    }
                  }
                  return stackIn_26_0 != 0;
                } else {
                  if (27 != var2) {
                    if (param1 != -124) {
                      field_g = (cn) null;
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    if (6 == mo.field_e) {
                      if (!kn.field_e) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                L2: {
                  if (-7 != (mo.field_e ^ -1)) {
                    stackIn_20_0 = 0;
                    break L2;
                  } else {
                    stackIn_20_0 = 1;
                    break L2;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              L3: {
                if (-7 != (mo.field_e ^ -1)) {
                  stackIn_15_0 = 0;
                  break L3;
                } else {
                  stackIn_15_0 = 1;
                  break L3;
                }
              }
              return stackIn_15_0 != 0;
            }
          } else {
            L4: {
              if (mo.field_e >= -1 + en.field_a.length) {
                stackIn_10_0 = 0;
                break L4;
              } else {
                stackIn_10_0 = 1;
                break L4;
              }
            }
            return stackIn_10_0 != 0;
          }
        }
    }

    abstract void a(boolean param0, java.awt.Component param1);

    abstract int a(int param0);

    static {
        field_f = new String[]{null, "Also, there are different strategies that can be employed in combat. All <%raiders> can either <%advance>, <%charge>, or attempt to <%flee>.<br><br><%advance> orders your raider to enter a room normally.<br><br><%col_charge>Charging</col> is a more aggressive attack: one point of the raider's <%defence> is transferred to <%attack>."};
        field_b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_c = "Please Wait";
    }
}
