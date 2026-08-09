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

    final static void c(byte param0) {
        v.field_c = 0;
        if (param0 != 107) {
            field_o = (String) null;
        }
    }

    final void a(boolean param0, int param1, int param2, byte param3, boolean param4, int param5, int param6) {
        L0: {
          param5 = param5 + param1;
          param6 = param6 + param2;
          if (!param4) {
            param5 = param5 + this.field_l * (-this.field_n + 48) * param1 / 288;
            param6 = param6 + this.field_m * (48 - this.field_n) * param2 / 288;
            break L0;
          } else {
            break L0;
          }
        }
        param2 = param2 * this.field_n / 48;
        if (param3 >= -59) {
          return;
        } else {
          param1 = param1 * this.field_n / 48;
          super.a(param0, param1, param2, (byte) -84, param4, param5 + -param1, param6 - param2);
          return;
        }
    }

    public static void b(byte param0) {
        field_i = null;
        field_k = null;
        field_p = null;
        int var1 = -105 % ((16 - param0) / 51);
        field_o = null;
    }

    final fb a(int param0) {
        int var2;
        fb discarded$1 = super.a(-103);
        var2 = 14 % ((param0 - 36) / 62);
        if (this.field_a.field_B >= fg.field_j[this.field_a.field_w] << uc.field_c[this.field_a.field_w]) {
          this.field_n = this.field_n - 1;
          if (this.field_n != 0) {
            this.field_j.field_E = this.field_j.field_E + 1;
            return (fb) (this);
          } else {
            this.field_j.field_E = 0;
            return null;
          }
        } else {
          this.field_j.field_E = this.field_j.field_E + 1;
          return (fb) (this);
        }
    }

    qo(fq param0, mi param1) {
        super(param0, 22);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        this.field_n = 48;
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
            this.field_m = var4;
            this.field_j = param1;
            this.field_l = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("qo.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_p = "More suggestions";
        field_i = "FULL ACCESS";
        field_o = "Close";
    }
}
