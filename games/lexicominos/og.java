/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og implements rd {
    private int field_d;
    static String field_c;
    static String field_b;
    private le field_i;
    private int field_a;
    private int field_e;
    private int field_g;
    static int[][] field_f;
    private int field_k;
    private int field_h;
    static String field_j;

    public static void a(byte param0) {
        field_f = null;
        field_c = null;
        int var1 = -100 % ((param0 - 73) / 46);
        field_b = null;
        field_j = null;
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wi var12 = null;
        w stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        w stackOut_1_0 = null;
        L0: {
          var11 = Lexicominos.field_L ? 1 : 0;
          if (!(param3 instanceof wi)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (w) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (w) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (wi) (Object) stackIn_3_0;
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        lf.a(param3.field_t + param1, param3.field_o + param0, param3.field_j, param3.field_v, ((og) this).field_d);
        var7 = -(var12.field_G * 2) + param3.field_j;
        var8 = var12.field_G + param3.field_t + param1;
        var9 = param0 - (-param3.field_o - var12.field_H);
        if (param4 == -3284) {
          lf.b(var8, var9, var7 + var8, var9, ((og) this).field_h);
          var10 = -1 + var12.e(false);
          L2: while (true) {
            if (-1 < (var10 ^ -1)) {
              if (((og) this).field_i == null) {
                return;
              } else {
                ((og) this).field_i.a(var12.field_u, var7 / 2 + var8, var12.field_H + var9 - -((og) this).field_i.field_C, ((og) this).field_e, ((og) this).field_g);
                return;
              }
            } else {
              lf.c(var12.a(var10, (byte) -37) * var7 / var12.i(-1) + var8, var9, ((og) this).field_a, ((og) this).field_k);
              var10--;
              continue L2;
            }
          }
        } else {
          ((og) this).field_g = 108;
          lf.b(var8, var9, var7 + var8, var9, ((og) this).field_h);
          var10 = -1 + var12.e(false);
          L3: while (true) {
            if (-1 < (var10 ^ -1)) {
              if (((og) this).field_i == null) {
                return;
              } else {
                ((og) this).field_i.a(var12.field_u, var7 / 2 + var8, var12.field_H + var9 - -((og) this).field_i.field_C, ((og) this).field_e, ((og) this).field_g);
                return;
              }
            } else {
              lf.c(var12.a(var10, (byte) -37) * var7 / var12.i(-1) + var8, var9, ((og) this).field_a, ((og) this).field_k);
              var10--;
              continue L3;
            }
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != 23440) {
            return false;
        }
        return 250 < mc.field_k ? true : false;
    }

    og(le param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((og) this).field_d = param4;
        ((og) this).field_e = param1;
        ((og) this).field_i = param0;
        ((og) this).field_h = param3;
        ((og) this).field_g = param2;
        ((og) this).field_a = param5;
        ((og) this).field_k = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Retry";
        field_f = new int[][]{new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10]};
    }
}
