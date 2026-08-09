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
        int var5 = 0;
        ds var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 == 11) {
                break L1;
              } else {
                var6 = (ds) null;
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
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("sr.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, ds param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            if (!param3) {
              break L0;
            } else {
              this.field_b = 77;
              break L0;
            }
          }
          if (1 != param2) {
            if (-3 == (param2 ^ -1)) {
              this.field_g = param1.e(1869) + 1;
              this.field_b = param1.e(1869) + 1;
              return;
            } else {
              if (-4 != (param2 ^ -1)) {
                if ((param2 ^ -1) == -5) {
                  this.field_f = param1.e((byte) -108);
                  return;
                } else {
                  if ((param2 ^ -1) != -6) {
                    if (6 != param2) {
                      if (-8 == (param2 ^ -1)) {
                        this.field_a = true;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_c = true;
                      return;
                    }
                  } else {
                    this.field_d = param1.e((byte) -126);
                    return;
                  }
                }
              } else {
                param1.d((byte) -114);
                return;
              }
            }
          } else {
            this.field_e = param1.e(1869);
            if (this.field_e == 65535) {
              this.field_e = -1;
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("sr.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L1;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    sr() {
        this.field_a = false;
        this.field_d = 1;
        this.field_f = 2;
        this.field_e = -1;
        this.field_c = false;
        this.field_g = 64;
        this.field_b = 64;
    }

    static {
    }
}
