/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij implements nl {
    private int field_p;
    static String field_f;
    private int field_i;
    private int field_h;
    static int field_d;
    private int field_e;
    private int field_l;
    private int field_o;
    private int field_c;
    private int field_j;
    static String field_a;
    private int field_m;
    private fm field_n;
    private int field_g;
    static cj[] field_k;
    private int field_b;

    public static void a(boolean param0) {
        field_a = null;
        field_k = null;
        field_f = null;
        if (!param0) {
            Object var2 = null;
            bm discarded$0 = ij.a((byte[]) null, 45);
        }
    }

    final static bm a(byte[] param0, int param1) {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 100;
        int var3 = 100;
        byte[] var4 = new byte[param0.length - -8];
        for (var5 = 0; (var5 ^ -1) > -7; var5++) {
            br.a(var5, var4, -117, re.a(param0, var5, (byte) 110));
        }
        br.a(6, var4, -93, var2);
        br.a(param1, var4, -123, var3);
        for (var5 = 6; param0.length / 4 > var5; var5++) {
            br.a(2 + var5, var4, -72, re.a(param0, var5, (byte) 51));
        }
        return bo.a(var4, param1 + 17);
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, ja param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var9 = -param2 + param5 + (param7.field_r - -param3);
          var10 = param1 + (param5 + (param3 + param7.field_r));
          var11 = (param7.field_w >> 1585933505) + (param7.field_y - -param0);
          oo.e(var9, 0, var10, var11 + param6);
          param7.e(param3 + -1, -1 + param0, param8);
          param7.e(-1 + param3, 1 + param0, param8);
          oo.b(b.field_f);
          oo.e(1 + var9, 0, 1 + var10, param6 + var11);
          param7.e(1 + param3, param0 + -1, param8);
          param7.e(1 + param3, param0 - -1, param8);
          oo.b(b.field_f);
          var10 = param7.field_x + (param7.field_r + (param3 - param5)) - param2;
          var9 = param7.field_r - -param7.field_x - (-param3 - (-param5 - param1));
          oo.e(var9, -param6 + var11, var10, 480);
          param7.e(-1 + param3, param0 - 1, param8);
          param7.e(param3 + -1, 1 + param0, param8);
          oo.b(b.field_f);
          oo.e(1 + var9, -param6 + var11, 1 + var10, 480);
          param7.e(1 + param3, param0 - 1, param8);
          param7.e(1 + param3, param0 - -1, param8);
          if (!param4) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        oo.b(b.field_f);
    }

    final static gh a(boolean param0, boolean param1) {
        gh var2 = new gh(true);
        if (param0) {
            Object var3 = null;
            bm discarded$0 = ij.a((byte[]) null, 33);
        }
        var2.field_e = param1 ? true : false;
        return var2;
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        fj var12 = null;
        cf stackIn_3_0 = null;
        cf stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param4 instanceof fj) {
            stackOut_2_0 = (cf) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (cf) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (fj) (Object) stackIn_3_0;
          if (var12 != null) {
            param0 = param0 & var12.field_F;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          if (param0) {
            var7 = 16777215;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          oo.e(param4.field_y + param3, param1 + param4.field_i, param4.field_n, param4.field_w, ((ij) this).field_o);
          var8 = ((ij) this).field_g + (param4.field_y + param3);
          var9 = ((ij) this).field_e + (param1 + param4.field_i);
          oo.f(var8, var9, ((ij) this).field_l, ((ij) this).field_i, 5592405);
          oo.e(var8, var9, ((ij) this).field_l, ((ij) this).field_i, var7);
          if (param2 == -15112) {
            break L3;
          } else {
            var11 = null;
            ij.a(100, -43, 108, -70, true, -27, -48, (ja) null, -23);
            break L3;
          }
        }
        L4: {
          if (var12.field_G) {
            oo.g(var8, var9, ((ij) this).field_l + var8, var9 - -((ij) this).field_i, 1);
            oo.g(var8 + ((ij) this).field_l, var9, var8, var9 + ((ij) this).field_i, 1);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (((ij) this).field_n != null) {
            var10 = ((ij) this).field_b + ((ij) this).field_g + ((ij) this).field_l;
            int discarded$1 = ((ij) this).field_n.a(param4.field_j, param3 + param4.field_y - -var10, ((ij) this).field_p + param1 - -param4.field_i, param4.field_n - ((ij) this).field_b - var10, -(((ij) this).field_b << 1042141249) + param4.field_w, ((ij) this).field_j, ((ij) this).field_m, ((ij) this).field_c, ((ij) this).field_h, 0);
            break L5;
          } else {
            break L5;
          }
        }
    }

    ij(fm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((ij) this).field_c = 1;
        ((ij) this).field_h = 1;
        ((ij) this).field_j = param3;
        ((ij) this).field_p = param2;
        ((ij) this).field_b = param1;
        ((ij) this).field_m = param4;
        ((ij) this).field_o = param9;
        ((ij) this).field_e = param6;
        ((ij) this).field_l = param8;
        ((ij) this).field_g = param5;
        ((ij) this).field_n = param0;
        ((ij) this).field_i = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
        field_f = "You must play <%1> more rated games before playing with the current options.";
        field_a = "Year";
    }
}
