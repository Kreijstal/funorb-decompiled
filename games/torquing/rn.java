/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn implements el {
    private uc field_c;
    static byte field_e;
    private int field_k;
    private int field_h;
    static String field_a;
    static int field_j;
    private int field_i;
    private int field_g;
    static volatile int field_b;
    private int field_l;
    private int field_d;
    static volatile int field_f;

    public static void a(byte param0) {
        if (param0 < 104) {
            rn.a(43);
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ri var12 = null;
        gm stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        gm stackOut_1_0 = null;
        L0: {
          var11 = Torquing.field_u;
          if (!(param4 instanceof ri)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (gm) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (gm) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (ri) (Object) stackIn_3_0;
          ph.d(param2 + param4.field_w, param1 - -param4.field_k, param4.field_p, param4.field_o, ((rn) this).field_i);
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 >= 89) {
          var7 = -(2 * var12.field_F) + param4.field_p;
          var8 = param4.field_w + param2 + var12.field_F;
          var9 = var12.field_C + (param1 + param4.field_k);
          ph.a(var8, var9, var7 + var8, var9, ((rn) this).field_g);
          var10 = var12.a(0) + -1;
          L2: while (true) {
            if (0 > var10) {
              if (((rn) this).field_c != null) {
                ((rn) this).field_c.c(var12.field_m, var7 / 2 + var8, var12.field_C + var9 + ((rn) this).field_c.field_q, ((rn) this).field_l, ((rn) this).field_d);
                return;
              } else {
                return;
              }
            } else {
              ph.d(var8 - -(var7 * var12.b(var10, 0) / var12.a((byte) -108)), var9, ((rn) this).field_k, ((rn) this).field_h);
              var10--;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = param0 >> 719091120;
        if (param1 != -18) {
          field_b = 126;
          var4 = param0 & 65535;
          var5 = param2 >> 2096882704;
          var6 = param2 & 65535;
          return var4 * var5 + (var3 * param2 - -(var4 * var6 >> 1664227344));
        } else {
          var4 = param0 & 65535;
          var5 = param2 >> 2096882704;
          var6 = param2 & 65535;
          return var4 * var5 + (var3 * param2 - -(var4 * var6 >> 1664227344));
        }
    }

    rn(uc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((rn) this).field_g = param3;
        ((rn) this).field_l = param1;
        ((rn) this).field_d = param2;
        ((rn) this).field_h = param6;
        ((rn) this).field_c = param0;
        ((rn) this).field_k = param5;
        ((rn) this).field_i = param4;
    }

    final static void a(int param0) {
        oh.field_c = 0;
        if (param0 > -3) {
            field_j = 64;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_e = (byte) 1;
        field_a = "EXCLUSIVE";
        field_f = 0;
        field_b = -1;
    }
}
