/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends el {
    private int field_l;
    static String field_p;
    static hj field_k;
    static String field_i;
    private mi field_j;
    private int field_n;
    private int field_m;
    static String field_o;

    final static void c() {
        v.field_c = 0;
    }

    final void a(boolean param0, int param1, int param2, byte param3, boolean param4, int param5, int param6) {
        L0: {
          param5 = param5 + param1;
          param6 = param6 + param2;
          if (!param4) {
            param5 = param5 + ((qo) this).field_l * (-((qo) this).field_n + 48) * param1 / 288;
            param6 = param6 + ((qo) this).field_m * (48 - ((qo) this).field_n) * param2 / 288;
            break L0;
          } else {
            break L0;
          }
        }
        param2 = param2 * ((qo) this).field_n / 48;
        if (param3 >= -59) {
          return;
        } else {
          param1 = param1 * ((qo) this).field_n / 48;
          super.a(param0, param1, param2, (byte) -84, param4, param5 + -param1, param6 - param2);
          return;
        }
    }

    public static void b(byte param0) {
        field_i = null;
        field_k = null;
        field_p = null;
        int var1 = 0;
        field_o = null;
    }

    final fb a(int param0) {
        int var2 = 0;
        fb discarded$2 = super.a(-103);
        var2 = 14 % ((param0 - 36) / 62);
        if (((qo) this).field_a.field_B >= fg.field_j[((qo) this).field_a.field_w] << uc.field_c[((qo) this).field_a.field_w]) {
          ((qo) this).field_n = ((qo) this).field_n - 1;
          if (((qo) this).field_n != 0) {
            ((qo) this).field_j.field_E = ((qo) this).field_j.field_E + 1;
            return (fb) this;
          } else {
            ((qo) this).field_j.field_E = 0;
            return null;
          }
        } else {
          ((qo) this).field_j.field_E = ((qo) this).field_j.field_E + 1;
          return (fb) this;
        }
    }

    qo(fq param0, mi param1) {
        super(param0, 22);
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((qo) this).field_n = 48;
        try {
          L0: {
            L1: {
              var3_int = param1.field_m * param1.field_o + param1.field_t * 12;
              var3_int = var3_int - (12 * param0.field_A + param0.field_o * param0.field_m);
              var4 = param1.field_m * param1.field_s + 12 * param1.field_u;
              var4 = var4 - (12 * param0.field_t + param0.field_s * param0.field_m);
              var5 = var3_int;
              if (var5 >= -var3_int) {
                break L1;
              } else {
                var5 = -var3_int;
                break L1;
              }
            }
            L2: {
              if (var4 <= var5) {
                break L2;
              } else {
                var5 = var4;
                break L2;
              }
            }
            L3: {
              if (var5 >= -var4) {
                break L3;
              } else {
                var5 = -var4;
                break L3;
              }
            }
            var3_int = (var5 + -6) * var3_int / var5;
            var4 = var4 * (var5 - 6) / var5;
            ((qo) this).field_m = var4;
            ((qo) this).field_j = param1;
            ((qo) this).field_l = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("qo.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "More suggestions";
        field_i = "FULL ACCESS";
        field_o = "Close";
    }
}
