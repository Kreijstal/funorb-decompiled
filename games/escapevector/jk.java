/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    private int field_a;
    private int field_d;
    static volatile int field_b;
    private int field_c;

    final static void a(String[] args, String param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              ui.field_b = ia.field_y;
              if (-256 != (param3 ^ -1)) {
                L2: {
                  if ((param3 ^ -1) > -101) {
                    break L2;
                  } else {
                    if (param3 <= 105) {
                      var4 = args;
                      mb.a(var4, 4);
                      co.field_a = rg.a(args, (byte) -63);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                co.field_a = bm.a(param1, param3, param2 ^ -97);
                break L1;
              } else {
                L3: {
                  if ((gf.field_a ^ -1) <= -14) {
                    stackIn_5_0 = 0;
                    break L3;
                  } else {
                    stackIn_5_0 = 1;
                    break L3;
                  }
                }
                co.field_a = fc.a(stackIn_5_0 != 0, (byte) -79);
                mb.a((String[]) null, param2 + 105);
                break L1;
              }
            }
            if (param2 == -101) {
              break L0;
            } else {
              field_b = 26;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4_ref);

            stackIn_16_1 = new StringBuilder().append("jk.A(");

            if (args == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param2 != 14714) {
            this.field_a = 40;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 1 << param2;
        if (!(0 != (this.field_a & var4))) {
            return;
        }
        if (param1 != this.field_d) {
            return;
        }
        oe var5 = ma.field_a;
        int var6 = -69 / ((19 - param0) / 47);
        if (!(var5 != null)) {
            return;
        }
        this.a(param1, param2, 14714);
        var5.a(param2, false, this.field_c, this.field_c ^ 255);
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -6) {
                break L1;
              } else {
                field_b = 86;
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

            stackIn_5_1 = new StringBuilder().append("jk.C(");

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
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    jk(int param0, int param1, int param2) {
        this.field_d = param0;
        this.field_a = param1;
        this.field_c = param2;
    }

    static {
        field_b = -1;
    }
}
