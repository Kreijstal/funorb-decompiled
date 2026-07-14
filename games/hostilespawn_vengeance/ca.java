/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca {
    static int field_a;
    static bd field_b;
    static int field_c;
    static int field_d;

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 1) {
          var2 = null;
          boolean discarded$2 = ca.a((gb) null, (gb) null, (gb) null, 106);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static boolean a(gb param0, gb param1, gb param2, int param3) {
        int stackIn_14_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        if (param2.a(-15879)) {
          if (param2.a(param3 ^ -8088, "commonui")) {
            if (param3 == 0) {
              L0: {
                if (!param1.a(-15879)) {
                  break L0;
                } else {
                  if (!param1.a(-8088, "commonui")) {
                    break L0;
                  } else {
                    L1: {
                      L2: {
                        if (!param0.a(param3 + -15879)) {
                          break L2;
                        } else {
                          if (!param0.a(-8088, "button.gif")) {
                            break L2;
                          } else {
                            stackOut_23_0 = 1;
                            stackIn_25_0 = stackOut_23_0;
                            break L1;
                          }
                        }
                      }
                      stackOut_24_0 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      break L1;
                    }
                    return stackIn_25_0 != 0;
                  }
                }
              }
              return false;
            } else {
              ca.a(-34);
              if (param1.a(-15879)) {
                if (!param1.a(-8088, "commonui")) {
                  return false;
                } else {
                  L3: {
                    L4: {
                      if (!param0.a(param3 + -15879)) {
                        break L4;
                      } else {
                        if (!param0.a(-8088, "button.gif")) {
                          break L4;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L3;
                  }
                  return stackIn_14_0 != 0;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(double param0, int param1, double param2, boolean param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param3) {
          L0: {
            ca.a(-0.43438423387122027, 123, -0.7999001328488745, true, -39);
            dn.field_b = 0;
            bc.field_i = param2;
            of.field_d = dn.field_i;
            vi.field_h = param0;
            qi.field_N = param4;
            eh.field_c.a(lm.field_A[23], 100, wj.field_O);
            if (1 != param1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          HostileSpawn.field_F = stackIn_8_0 != 0;
          return;
        } else {
          L1: {
            dn.field_b = 0;
            bc.field_i = param2;
            of.field_d = dn.field_i;
            vi.field_h = param0;
            qi.field_N = param4;
            eh.field_c.a(lm.field_A[23], 100, wj.field_O);
            if (1 != param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          HostileSpawn.field_F = stackIn_4_0 != 0;
          return;
        }
    }

    abstract void a(vi param0, int param1);

    abstract bl a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_d = 64;
    }
}
