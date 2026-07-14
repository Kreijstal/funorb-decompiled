/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo implements ur {
    private int field_a;
    static int field_b;
    private int field_c;
    private int field_k;
    static boolean field_d;
    private int field_e;
    private int field_f;
    static int[] field_h;
    static String[] field_g;
    private int field_j;
    private cc field_i;

    final static void a(ed param0, int param1, int param2, int param3, int param4) {
        int var5 = 110 % ((param3 - -26) / 41);
        param0.f(12, 116);
        param0.d(17, -1783);
        param0.d(param4, -1783);
        param0.d(param1, -1783);
        param0.f(param2, -107);
    }

    public static void a(int param0) {
        if (param0 != 2) {
            jo.a(40);
            field_g = null;
            field_h = null;
            return;
        }
        field_g = null;
        field_h = null;
    }

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jf var12 = null;
        iq stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        iq stackOut_1_0 = null;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          if (!(param3 instanceof jf)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (iq) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (iq) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var12 = (jf) (Object) stackIn_3_0;
        if (param2) {
          L1: {
            if (var12 == null) {
              break L1;
            } else {
              break L1;
            }
          }
          bi.b(param1 - -param3.field_o, param4 + param3.field_t, param3.field_n, param3.field_s, ((jo) this).field_e);
          var7 = param3.field_n + -(2 * var12.field_K);
          var8 = var12.field_K + param3.field_o + param1;
          var9 = param4 + (param3.field_t + var12.field_L);
          bi.a(var8, var9, var7 + var8, var9, ((jo) this).field_a);
          var10 = var12.a((byte) -104) - 1;
          L2: while (true) {
            if (var10 < 0) {
              if (null != ((jo) this).field_i) {
                ((jo) this).field_i.c(var12.field_w, var7 / 2 + var8, var12.field_L + ((jo) this).field_i.field_D + var9, ((jo) this).field_f, ((jo) this).field_c);
                return;
              } else {
                return;
              }
            } else {
              bi.f(var8 + var12.a(var10, (byte) 122) * var7 / var12.c(param2), var9, ((jo) this).field_j, ((jo) this).field_k);
              var10--;
              continue L2;
            }
          }
        } else {
          L3: {
            ((jo) this).field_c = -7;
            if (var12 == null) {
              break L3;
            } else {
              break L3;
            }
          }
          bi.b(param1 - -param3.field_o, param4 + param3.field_t, param3.field_n, param3.field_s, ((jo) this).field_e);
          var7 = param3.field_n + -(2 * var12.field_K);
          var8 = var12.field_K + param3.field_o + param1;
          var9 = param4 + (param3.field_t + var12.field_L);
          bi.a(var8, var9, var7 + var8, var9, ((jo) this).field_a);
          var10 = var12.a((byte) -104) - 1;
          L4: while (true) {
            if (var10 < 0) {
              if (null == ((jo) this).field_i) {
                return;
              } else {
                ((jo) this).field_i.c(var12.field_w, var7 / 2 + var8, var12.field_L + ((jo) this).field_i.field_D + var9, ((jo) this).field_f, ((jo) this).field_c);
                return;
              }
            } else {
              bi.f(var8 + var12.a(var10, (byte) 122) * var7 / var12.c(param2), var9, ((jo) this).field_j, ((jo) this).field_k);
              var10--;
              continue L4;
            }
          }
        }
    }

    jo(cc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((jo) this).field_k = param6;
        ((jo) this).field_c = param2;
        ((jo) this).field_a = param3;
        ((jo) this).field_i = param0;
        ((jo) this).field_f = param1;
        ((jo) this).field_j = param5;
        ((jo) this).field_e = param4;
    }

    static {
    }
}
