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
            field_o = null;
        }
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
        int var1 = -105 % ((16 - param0) / 51);
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
        ((qo) this).field_n = 48;
        int var3 = param1.field_m * param1.field_o + param1.field_t * 12;
        var3 = var3 - (12 * param0.field_A + param0.field_o * param0.field_m);
        int var4 = param1.field_m * param1.field_s + 12 * param1.field_u;
        var4 = var4 - (12 * param0.field_t + param0.field_s * param0.field_m);
        int var5 = var3;
        if (var5 < -var3) {
            var5 = -var3;
        }
        if (var4 > var5) {
            var5 = var4;
        }
        if (var5 < -var4) {
            var5 = -var4;
        }
        var3 = (var5 + -6) * var3 / var5;
        var4 = var4 * (var5 - 6) / var5;
        ((qo) this).field_m = var4;
        ((qo) this).field_j = param1;
        ((qo) this).field_l = var3;
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
