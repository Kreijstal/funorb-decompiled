/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp implements kh {
    private int field_f;
    private ka field_a;
    static String field_k;
    private int field_g;
    static String field_c;
    static String field_j;
    private int field_b;
    private int field_d;
    static String field_e;
    private int field_i;
    private int field_h;

    final static int a(int param0, int param1) {
        int var2 = -125 / ((param1 - -11) / 51);
        int var3 = 0;
        if (0 == param0) {
            var3 = ol.field_B;
        }
        if ((param0 ^ -1) == -2) {
            var3 = va.field_D;
        }
        if (!((param0 ^ -1) != -3)) {
            var3 = cd.field_c;
        }
        return var3;
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        pi var12 = null;
        kb stackIn_3_0 = null;
        kb stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 instanceof pi) {
            stackOut_2_0 = (kb) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (kb) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (pi) (Object) stackIn_3_0;
          qn.f(param0.field_B + param1, param4 + param0.field_p, param0.field_l, param0.field_w, ((kp) this).field_d);
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = param0.field_l - 2 * var12.field_R;
        var8 = param0.field_B + param1 - -var12.field_R;
        if (param2 > -79) {
          return;
        } else {
          var9 = param4 - (-param0.field_p + -var12.field_S);
          qn.h(var8, var9, var7 + var8, var9, ((kp) this).field_b);
          var10 = var12.d((byte) -39) + -1;
          L2: while (true) {
            if (var10 < 0) {
              L3: {
                if (null != ((kp) this).field_a) {
                  ((kp) this).field_a.c(var12.field_v, var8 - -(var7 / 2), ((kp) this).field_a.field_v + var9 + var12.field_S, ((kp) this).field_g, ((kp) this).field_i);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              qn.a(var7 * var12.a(var10, (byte) -47) / var12.a(-1) + var8, var9, ((kp) this).field_h, ((kp) this).field_f);
              var10--;
              continue L2;
            }
          }
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_e = null;
        if (param0 != 2) {
          field_c = null;
          field_j = null;
          field_c = null;
          return;
        } else {
          field_j = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(boolean param0, int param1, kl param2, int param3) {
        byte[] var5 = null;
        byte[] var4 = null;
        if (param0) {
            kp.a(81);
            var5 = param2.a((byte) 72, param3, param1);
            var4 = var5;
            if (!(var5 != null)) {
                return false;
            }
            b.a(var5, -1);
            return true;
        }
        var5 = param2.a((byte) 72, param3, param1);
        var4 = var5;
        if (!(var5 != null)) {
            return false;
        }
        b.a(var5, -1);
        return true;
    }

    kp(ka param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((kp) this).field_b = param3;
        ((kp) this).field_a = param0;
        ((kp) this).field_f = param6;
        ((kp) this).field_g = param1;
        ((kp) this).field_d = param4;
        ((kp) this).field_i = param2;
        ((kp) this).field_h = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You cannot use equipment on portals.";
        field_j = "Prayer";
        field_e = "There are no valid types of game that match your preferences.";
    }
}
