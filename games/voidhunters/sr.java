/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr {
    int field_f;
    int field_d;
    boolean field_a;
    int field_g;
    int field_e;
    boolean field_c;
    int field_b;

    final void a(int param0, ds param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 == 11) {
                break L1;
              } else {
                var6 = null;
                this.a(-11, (ds) null, -118, true);
                break L1;
              }
            }
            L2: while (true) {
              var4_int = param1.e((byte) -127);
              if (var4_int == 0) {
                break L0;
              } else {
                this.a(param0, param1, var4_int, false);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("sr.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, ds param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            if (!param3) {
              break L0;
            } else {
              ((sr) this).field_b = 77;
              break L0;
            }
          }
          if (1 != param2) {
            if (param2 == 2) {
              ((sr) this).field_g = param1.e(1869) + 1;
              ((sr) this).field_b = param1.e(1869) + 1;
              return;
            } else {
              if (param2 != 3) {
                if (param2 == 4) {
                  ((sr) this).field_f = param1.e((byte) -108);
                  return;
                } else {
                  if (param2 != 5) {
                    if (6 != param2) {
                      if (param2 == 7) {
                        ((sr) this).field_a = true;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((sr) this).field_c = true;
                      return;
                    }
                  } else {
                    ((sr) this).field_d = param1.e((byte) -126);
                    return;
                  }
                }
              } else {
                byte discarded$2 = param1.d((byte) -114);
                return;
              }
            }
          } else {
            ((sr) this).field_e = param1.e(1869);
            if (((sr) this).field_e == 65535) {
              ((sr) this).field_e = -1;
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("sr.B(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L1;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    sr() {
        ((sr) this).field_a = false;
        ((sr) this).field_d = 1;
        ((sr) this).field_f = 2;
        ((sr) this).field_e = -1;
        ((sr) this).field_c = false;
        ((sr) this).field_g = 64;
        ((sr) this).field_b = 64;
    }

    static {
    }
}
