/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static String field_i;
    int field_a;
    int field_g;
    static String[][] field_d;
    int field_e;
    static bi field_b;
    wa field_c;
    int field_h;
    int field_f;

    final void a(int param0, int param1, int param2, int param3, wa param4, int param5, byte param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param6 == -34) {
                break L1;
              } else {
                wa.a((byte) -86, false, true);
                break L1;
              }
            }
            this.field_h = param5;
            this.field_g = param1;
            this.field_c = param4;
            this.field_f = param3;
            this.field_e = param0;
            this.field_a = param2;
            if (-1 < (this.field_h ^ -1)) {
              throw new RuntimeException();
            } else {
              L2: {
                if (-1 != (this.field_f ^ -1)) {
                  break L2;
                } else {
                  if (0 != this.field_a) {
                    break L2;
                  } else {
                    L3: {
                      if (this.field_e == 0) {
                        break L3;
                      } else {
                        if (this.field_h == 1) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var8);
            stackOut_12_1 = new StringBuilder().append("wa.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        int var3 = 123 / ((param0 - 33) / 54);
        String var4 = (String) null;
        jm.a((String) null, param2, (byte) -110, param1);
    }

    public static void a(int param0) {
        if (param0 != 27094) {
          field_i = (String) null;
          field_b = null;
          field_i = null;
          field_d = (String[][]) null;
          return;
        } else {
          field_b = null;
          field_i = null;
          field_d = (String[][]) null;
          return;
        }
    }

    final void b(int param0) {
        this.field_c = qq.field_D;
        qq.field_D = (wa) (this);
        int var2 = 111 % ((param0 - -71) / 45);
    }

    wa() {
        this.field_c = null;
    }

    static {
        field_i = "Average number of fleets committed to each operation.";
    }
}
