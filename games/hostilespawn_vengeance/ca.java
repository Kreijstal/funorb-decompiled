/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca {
    static int field_a;
    static bd field_b;
    static int field_c;
    static int field_d;

    public static void a(int param0) {
        gb var2;
        if (param0 != 1) {
          var2 = (gb) null;
          ca.a((gb) null, (gb) null, (gb) null, 106);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static boolean a(gb param0, gb param1, gb param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2.a(-15879)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2.a(param3 ^ -8088, "commonui")) {
                L1: {
                  if (param3 == 0) {
                    break L1;
                  } else {
                    ca.a(-34);
                    break L1;
                  }
                }
                L2: {
                  if (!param1.a(-15879)) {
                    break L2;
                  } else {
                    if (!param1.a(-8088, "commonui")) {
                      break L2;
                    } else {
                      L3: {
                        if (!param0.a(param3 + -15879)) {
                          break L3;
                        } else {
                          if (!param0.a(-8088, "button.gif")) {
                            break L3;
                          } else {
                            return true;
                          }
                        }
                      }
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("ca.K(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final static void a(double param0, int param1, double param2, boolean param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
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
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
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
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
        field_c = 0;
        field_d = 64;
    }
}
