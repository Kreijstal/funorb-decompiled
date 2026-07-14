/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends ct {
    static int[] field_C;
    int field_F;
    static String field_A;
    static String field_D;
    static hd field_E;

    final static kg a(boolean param0, int param1, tf param2, int param3) {
        ut var4 = null;
        ut var5 = null;
        nr var6 = null;
        int var7 = 0;
        ut[] stackIn_1_0 = null;
        ut[] stackIn_2_0 = null;
        ut[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ut stackIn_4_0 = null;
        ut stackIn_5_0 = null;
        ut stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ut[] stackOut_0_0 = null;
        ut[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ut[] stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        ut stackOut_3_0 = null;
        ut stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ut stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          var7 = Kickabout.field_G;
          stackOut_0_0 = oe.field_p;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0) {
            stackOut_2_0 = (ut[]) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (ut[]) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0[stackIn_3_1];
          var5 = new ut(var4.field_o, var4.field_v);
          iw.a(-55, var5);
          stackOut_3_0 = j.a(-5275);
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param0) {
            stackOut_5_0 = (ut) (Object) stackIn_5_0;
            stackOut_5_1 = -10;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = (ut) (Object) stackIn_4_0;
            stackOut_4_1 = -120;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        ((ut) (Object) stackIn_6_0).d(stackIn_6_1, 0);
        var4.c(0, 0);
        var6 = (nr) (Object) param2.g(24009);
        L2: while (true) {
          if (var6 == null) {
            if (param1 > -41) {
              field_D = null;
              ta.e(120);
              return eo.a(var5);
            } else {
              ta.e(120);
              return eo.a(var5);
            }
          } else {
            var6.a(param3, -2);
            var6 = (nr) (Object) param2.c(33);
            continue L2;
          }
        }
    }

    pj(fd param0) {
        super(param0.field_t, param0.field_g, param0.field_n, param0.field_i, (gj) null, (jv) null);
        param0.a(((pj) this).field_i, 1, 0, ((pj) this).field_n, 0);
        ((pj) this).field_F = 256;
        ((pj) this).field_z = param0;
    }

    public static void h(byte param0) {
        field_C = null;
        field_E = null;
        field_A = null;
        if (param0 <= 110) {
            field_E = null;
            field_D = null;
            return;
        }
        field_D = null;
    }

    public pj() {
        super(0, 0, 0, 0, (gj) null, (jv) null);
        ((pj) this).field_F = 256;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(0 == param0)) {
            return;
        }
        if (null == ((pj) this).field_z) {
            return;
        }
        if (-1 == (((pj) this).field_F ^ -1)) {
            return;
        }
        if (!(256 != ((pj) this).field_F)) {
            ((pj) this).field_z.a(param0, 65, ((pj) this).field_t + param2, ((pj) this).field_g + param3);
            return;
        }
        ut var6 = new ut(((pj) this).field_z.field_n, ((pj) this).field_z.field_i);
        iw.a(-46, var6);
        ((pj) this).field_z.a(param0, (int) (char)param1, 0, 0);
        ta.e(127);
        var6.b(param2 - -((pj) this).field_t, ((pj) this).field_g + param3, ((pj) this).field_F);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Money: ";
        field_A = "draw?";
    }
}
