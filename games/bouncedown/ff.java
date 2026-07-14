/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends wd {
    static double field_C;
    static sg field_D;

    ff(String param0, sk param1, boolean param2) {
        this(param0, param1);
        ((ff) this).field_z = param2 ? true : false;
    }

    final static int a(boolean param0, int param1, int param2, int param3) {
        if (param2 != 8786) {
            int discarded$0 = ff.a(false, 44, -127, -97);
            return hf.a(false);
        }
        return hf.a(false);
    }

    final static we[] a(String param0, gk param1, byte param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param1.a(param3, false);
        if (param2 < 104) {
          ff.a(13);
          var5 = param1.a(var4, param0, -34);
          return la.a(var5, var4, param1, (byte) -72);
        } else {
          var5 = param1.a(var4, param0, -34);
          return la.a(var5, var4, param1, (byte) -72);
        }
    }

    private ff(String param0, fc param1, sk param2) {
        super(param0, param1, param2);
        ((ff) this).field_j = ma.field_m.field_a;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((ff) this).field_z) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((ff) this).field_z = stackIn_3_1 != 0;
        super.a(param0, param1, (byte) -109, param3);
        if (param2 >= -77) {
          field_D = null;
          return;
        } else {
          return;
        }
    }

    private ff(String param0, sk param1) {
        this(param0, ma.field_m.field_b, param1);
        ((ff) this).field_j = ma.field_m.field_a;
    }

    public static void a(int param0) {
        field_D = null;
        if (param0 != -22756) {
            Object var2 = null;
            we[] discarded$0 = ff.a((String) null, (gk) null, (byte) -2, (String) null);
        }
    }

    static {
    }
}
