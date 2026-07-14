/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h implements nn {
    static String field_f;
    private int field_g;
    private int field_a;
    private int field_c;
    static kb field_b;
    private int field_e;
    private int field_h;
    private vm field_d;
    private int field_i;

    public static void a(byte param0) {
        field_f = null;
        if (param0 != 76) {
            return;
        }
        field_b = null;
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        tb var12 = null;
        ag stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        ag stackOut_1_0 = null;
        L0: {
          var11 = HostileSpawn.field_I ? 1 : 0;
          if (!(param3 instanceof tb)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (ag) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (ag) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (tb) (Object) stackIn_3_0;
          si.c(param1 + param3.field_v, param3.field_m + param0, param3.field_s, param3.field_x, ((h) this).field_g);
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = param3.field_s - var12.field_G * 2;
        var8 = var12.field_G + param1 - -param3.field_v;
        var9 = var12.field_H + param0 + param3.field_m;
        si.g(var8, var9, var8 - -var7, var9, ((h) this).field_a);
        if (param2 == 15430) {
          var10 = var12.a((byte) 65) + -1;
          L2: while (true) {
            if (var10 < 0) {
              if (null == ((h) this).field_d) {
                return;
              } else {
                ((h) this).field_d.b(var12.field_n, var8 - -(var7 / 2), var12.field_H + var9 + ((h) this).field_d.field_u, ((h) this).field_c, ((h) this).field_i);
                return;
              }
            } else {
              si.e(var8 + var12.a(var10, -24584) * var7 / var12.j(11884), var9, ((h) this).field_h, ((h) this).field_e);
              var10--;
              continue L2;
            }
          }
        } else {
          field_f = null;
          var10 = var12.a((byte) 65) + -1;
          L3: while (true) {
            if (var10 < 0) {
              if (null == ((h) this).field_d) {
                return;
              } else {
                ((h) this).field_d.b(var12.field_n, var8 - -(var7 / 2), var12.field_H + var9 + ((h) this).field_d.field_u, ((h) this).field_c, ((h) this).field_i);
                return;
              }
            } else {
              si.e(var8 + var12.a(var10, -24584) * var7 / var12.j(11884), var9, ((h) this).field_h, ((h) this).field_e);
              var10--;
              continue L3;
            }
          }
        }
    }

    h(vm param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((h) this).field_h = param5;
        ((h) this).field_g = param4;
        ((h) this).field_c = param1;
        ((h) this).field_d = param0;
        ((h) this).field_e = param6;
        ((h) this).field_i = param2;
        ((h) this).field_a = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<col=ffffff>Close-range<nbsp>assault<nbsp>gun</col><br>The C.R.A.G. provides heavy stopping power for dealing with nearby targets. Accuracy and damage at range is very low.";
    }
}
