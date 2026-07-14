/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi implements ui {
    private int field_a;
    private int field_l;
    private int field_c;
    static int[] field_d;
    private kg field_i;
    private int field_o;
    static ci field_e;
    static boolean field_p;
    private int field_b;
    private int field_g;
    private int field_n;
    static fa field_f;
    private int field_j;
    private int field_m;
    static long field_q;
    private int field_k;
    private int field_h;

    final static int b(int param0) {
        if (param0 >= -5) {
            int discarded$0 = wi.b(35);
            return (int)(1000000000L / fg.field_j);
        }
        return (int)(1000000000L / fg.field_j);
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        int var1 = -57 % ((param0 - 3) / 47);
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bf var12 = null;
        qg stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        qg stackOut_1_0 = null;
        L0: {
          if (!(param4 instanceof bf)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (qg) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (qg) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (bf) (Object) stackIn_3_0;
          if (var12 != null) {
            param2 = param2 & var12.field_t;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          if (param2) {
            var7 = 16777215;
            break L2;
          } else {
            break L2;
          }
        }
        sb.a(param4.field_p + param0, param4.field_n + param1, param4.field_l, param4.field_h, ((wi) this).field_k);
        var8 = param0 - (-param4.field_p + -((wi) this).field_b);
        var9 = param4.field_n + param1 + ((wi) this).field_g;
        sb.c(var8, var9, ((wi) this).field_n, ((wi) this).field_c, 5592405);
        sb.a(var8, var9, ((wi) this).field_n, ((wi) this).field_c, var7);
        if (var12.field_y) {
          L3: {
            sb.e(var8, var9, var8 - -((wi) this).field_n, ((wi) this).field_c + var9, 1);
            sb.e(var8 - -((wi) this).field_n, var9, var8, var9 + ((wi) this).field_c, 1);
            var10 = -41 % ((51 - param3) / 47);
            if (null != ((wi) this).field_i) {
              var11 = ((wi) this).field_a + (((wi) this).field_n - -((wi) this).field_b);
              int discarded$2 = ((wi) this).field_i.a(param4.field_k, param4.field_p + (param0 + var11), ((wi) this).field_h + param1 + param4.field_n, param4.field_l + -((wi) this).field_a + -var11, param4.field_h - (((wi) this).field_a << -1429484863), ((wi) this).field_j, ((wi) this).field_l, ((wi) this).field_o, ((wi) this).field_m, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            var10 = -41 % ((51 - param3) / 47);
            if (null != ((wi) this).field_i) {
              var11 = ((wi) this).field_a + (((wi) this).field_n - -((wi) this).field_b);
              int discarded$3 = ((wi) this).field_i.a(param4.field_k, param4.field_p + (param0 + var11), ((wi) this).field_h + param1 + param4.field_n, param4.field_l + -((wi) this).field_a + -var11, param4.field_h - (((wi) this).field_a << -1429484863), ((wi) this).field_j, ((wi) this).field_l, ((wi) this).field_o, ((wi) this).field_m, 0);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    wi(kg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((wi) this).field_o = 1;
        ((wi) this).field_m = 1;
        ((wi) this).field_l = param4;
        ((wi) this).field_c = param7;
        ((wi) this).field_n = param8;
        ((wi) this).field_g = param6;
        ((wi) this).field_k = param9;
        ((wi) this).field_j = param3;
        ((wi) this).field_h = param2;
        ((wi) this).field_i = param0;
        ((wi) this).field_a = param1;
        ((wi) this).field_b = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_f = null;
    }
}
