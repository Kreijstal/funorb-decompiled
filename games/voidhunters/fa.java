/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends ksa {
    int field_g;
    int field_f;
    static gd[] field_d;
    static String[] field_e;

    public static void c(byte param0) {
        field_d = null;
        field_e = null;
        int var1 = 11 / ((5 - param0) / 58);
    }

    final static void a(String param0, int param1, boolean param2) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          rg.field_b = true;
          if (!param2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        kmb.field_c = stackIn_3_0 != 0;
        hwa.field_o = new os(klb.field_r, vob.field_r, param0, tla.field_c, kmb.field_c);
        if (param1 >= -119) {
          field_d = null;
          klb.field_r.a(false, (shb) (Object) hwa.field_o);
          return;
        } else {
          klb.field_r.a(false, (shb) (Object) hwa.field_o);
          return;
        }
    }

    private fa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new gd[109];
        field_e = new String[]{"BAASAicADQESAg--BR4AHgEPAR4AD-8HIwkeAR4AD-8MJgIeAA--Aw8EEgUNDhIPDRANEQ0", "BwENAiYADQENAg0DGwQbBRsDGwUqBh8AGQEN-wcqCCoJHwANARn-CioMGw0nABsBGwIbAw0EDQUNDg0QLQ", "AwEeAQ8EIgANAQ0CHgAsAQ8EGwUN-wUNBg0HDQgNCSIAGwIeAA8BLAMNBA0GDQweAA--Dg8PDw", "BQANAycADQENAx4AGAEnAC0BDQQYBRgEDQUNBRAJIw0QDyYADQENAh4AJgAYARgEDQUtARgEDQUNEg0", "BgANAi0DHwAXAScBDQINAx4AGgENBRf-BCEAFwIX-wUfACYAFwIeAA0BGgMNBA3-ARf-Bi0IDQkuCi4LDQ"};
    }
}
