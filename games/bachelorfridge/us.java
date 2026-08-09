/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class us {
    static kv field_b;
    static String field_a;
    static eaa field_e;
    static ee field_c;
    static String field_d;

    final static tn a(int param0) {
        if (param0 != -4127) {
            us.a(23);
            return (tn) ((Object) new ru());
        }
        return (tn) ((Object) new ru());
    }

    public static void b(int param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 != 12745) {
            field_e = (eaa) null;
        }
    }

    final static boolean a(vr param0, vr param1, vr param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1.a(0)) {
                break L1;
              } else {
                if (!param1.a("commonui", 20637)) {
                  break L1;
                } else {
                  L2: {
                    if (param3 >= 23) {
                      break L2;
                    } else {
                      field_a = (String) null;
                      break L2;
                    }
                  }
                  if (!param0.a(0)) {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (param0.a("commonui", 20637)) {
                      L3: {
                        if (!param2.a(0)) {
                          break L3;
                        } else {
                          if (param2.a("button.gif", 20637)) {
                            stackIn_18_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("us.A(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    static {
        field_a = "You need 5 or more creatures to delete one.";
        field_e = new eaa();
        field_d = "Breaking real-world laws";
    }
}
