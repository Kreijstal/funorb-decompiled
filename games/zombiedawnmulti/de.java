/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static ul field_e;
    static ip field_h;
    static int[] field_c;
    static qh field_b;
    static cj field_f;
    static String field_a;
    static String field_d;
    static volatile int field_g;

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        if (param0 != 19091) {
          de.a(-77);
          field_e = null;
          field_h = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_h = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void a(go param0, byte param1, Object param2) {
        java.awt.AWTEvent stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        java.awt.AWTEvent stackOut_8_0;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (null == param0.field_j) {
              break L0;
            } else {
              L1: {
                if (param1 == 99) {
                  break L1;
                } else {
                  de.a(-110);
                  break L1;
                }
              }
              var3_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (50 <= var3_int) {
                      break L4;
                    } else {
                      stackOut_8_0 = param0.field_j.peekEvent();
                      stackIn_13_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (stackIn_9_0 == null) {
                          break L4;
                        } else {
                          vd.a(false, 1L);
                          var3_int++;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackIn_13_0 = param2;
                  break L3;
                }
                if (stackIn_13_0 != null) {
                  try {
                    L5: {
                      param0.field_j.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                      break L5;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3 = (Exception) (Object) decompiledCaughtException;
                    return;
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("de.B(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
    }

    static {
        field_c = new int[8192];
        field_h = new ip();
        field_a = "Play the game without logging in just yet";
        field_d = "This entry doesn't match";
        field_g = 0;
    }
}
