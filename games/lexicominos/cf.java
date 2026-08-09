/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cf extends ca {
    final static boolean a(char param0, byte param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        if (param1 == 78) {
          if (160 != param0) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_20_0 = 1;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          cf.c(5);
          if (160 != param0) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_8_0 = 1;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(fc param0, byte param1) {
        RuntimeException runtimeException = null;
        fc var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              vk.a(param0.field_w, 0, param0.field_F);
              if (param1 == 50) {
                break L1;
              } else {
                var3 = (fc) null;
                cf.a((fc) null, (byte) -22);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("cf.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static String c(int param0) {
        if (param0 != 32) {
            return (String) null;
        }
        return si.field_q;
    }

    cf() {
    }

    static {
    }
}
