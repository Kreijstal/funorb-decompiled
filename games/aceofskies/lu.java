/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lu {
    private wj field_b;
    static String field_a;
    private wl field_d;
    private kp field_c;

    final void a(int param0) {
        wf var2;
        int var3;
        var3 = AceOfSkies.field_G ? 1 : 0;
        this.field_b = null;
        if (param0 == 1) {
          if (!this.field_c.a(true)) {
            var2 = this.field_c.d(268435455);
            L0: while (true) {
              if (var2 != this.field_c.field_e) {
                ((eq) ((Object) var2)).a((byte) -93);
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
        return this.field_b != null ? true : false;
    }

    lu(wl param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = new kp();
        try {
          L0: {
            L1: {
              this.field_d = param0;
              if (!this.field_d.field_A) {
                break L1;
              } else {
                if (this.field_d.field_u) {
                  this.field_b = new wj(this.field_d);
                  if (this.field_d.field_Hb <= 1) {
                    break L1;
                  } else {
                    if (!this.field_d.field_i) {
                      break L1;
                    } else {
                      if (this.field_d.field_Nb) {
                        this.field_b = new wj(this.field_d);
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
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("lu.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    static {
        field_a = "To server list";
    }
}
