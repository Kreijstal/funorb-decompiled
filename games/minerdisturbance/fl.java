/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl implements ad {
    private int field_i;
    private int field_m;
    static bj field_f;
    private we field_k;
    static int field_c;
    static boolean field_d;
    private int field_g;
    private int field_e;
    static String[] field_b;
    static String field_h;
    static ln[] field_j;
    private int field_a;
    private int field_l;

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ne var12 = null;
        fe stackIn_3_0 = null;
        fe stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = MinerDisturbance.field_ab;
          if (param2 instanceof ne) {
            stackOut_2_0 = (fe) param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (fe) (Object) stackOut_1_0;
            break L0;
          }
        }
        var12 = (ne) (Object) stackIn_3_0;
        eh.e(param1 + param2.field_u, param3 + param2.field_t, param2.field_v, param2.field_q, ((fl) this).field_l);
        if (param0 == 12088) {
          L1: {
            if (var12 != null) {
              break L1;
            } else {
              break L1;
            }
          }
          var7 = -(var12.field_J * 2) + param2.field_v;
          var8 = param1 + (param2.field_u + var12.field_J);
          var9 = var12.field_P + (param2.field_t + param3);
          eh.d(var8, var9, var8 + var7, var9, ((fl) this).field_m);
          var10 = var12.m(22302) - 1;
          L2: while (true) {
            if ((var10 ^ -1) > -1) {
              L3: {
                if (((fl) this).field_k != null) {
                  ((fl) this).field_k.b(var12.field_s, var7 / 2 + var8, var12.field_P + (((fl) this).field_k.field_G + var9), ((fl) this).field_e, ((fl) this).field_g);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              eh.c(var7 * var12.a(var10, true) / var12.a((byte) -84) + var8, var9, ((fl) this).field_a, ((fl) this).field_i);
              var10--;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_j = null;
        if (param0 != -1) {
            field_c = -85;
        }
        field_h = null;
        field_b = null;
    }

    final static void a(byte param0) {
        int var1 = -104 % ((param0 - -15) / 41);
        Object var2 = null;
        ed.a((String) null, "", -1);
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        String var3 = qh.a(param2, param1, false);
        if (var3 != null) {
            return var3;
        }
        for (var4 = 0; var4 < param1.length(); var4++) {
            if (!(rb.a((byte) 121, param1.charAt(var4)))) {
                return ti.field_K;
            }
        }
        var4 = -56 % ((param0 - -37) / 55);
        return null;
    }

    fl(we param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((fl) this).field_a = param5;
        ((fl) this).field_i = param6;
        ((fl) this).field_g = param2;
        ((fl) this).field_m = param3;
        ((fl) this).field_l = param4;
        ((fl) this).field_k = param0;
        ((fl) this).field_e = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_h = "<%0> <times> 750 = <%1>";
        field_b = new String[255];
    }
}
