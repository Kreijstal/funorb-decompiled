/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lu {
    private wj field_b;
    static String field_a;
    private wl field_d;
    private kp field_c;

    final void a(int param0) {
        wf var2 = null;
        int var3 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        ((lu) this).field_b = null;
        if (param0 == 1) {
          if (!((lu) this).field_c.a(true)) {
            var2 = ((lu) this).field_c.d(268435455);
            L0: while (true) {
              if (var2 != ((lu) this).field_c.field_e) {
                ((eq) (Object) var2).a((byte) -93);
                var2 = var2.field_a;
                continue L0;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -3) {
            lu.a((byte) 61);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final boolean b(int param0) {
        if (param0 != 1) {
            return false;
        }
        return ((lu) this).field_b != null ? true : false;
    }

    lu(wl param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        ((lu) this).field_c = new kp();
        try {
          L0: {
            L1: {
              ((lu) this).field_d = param0;
              if (!((lu) this).field_d.field_A) {
                break L1;
              } else {
                if (((lu) this).field_d.field_u) {
                  ((lu) this).field_b = new wj(((lu) this).field_d);
                  if (((lu) this).field_d.field_Hb <= 1) {
                    break L1;
                  } else {
                    if (!((lu) this).field_d.field_i) {
                      break L1;
                    } else {
                      if (((lu) this).field_d.field_Nb) {
                        ((lu) this).field_b = new wj(((lu) this).field_d);
                        break L1;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("lu.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "To server list";
    }
}
