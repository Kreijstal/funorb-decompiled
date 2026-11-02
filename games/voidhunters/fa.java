/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends IntrusiveNode {
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
        try {
          rg.field_b = true;
          kmb.field_c = param2 ? true : false;
          SetPointDefenceLaserAimarc.field_o = new os(GetLagStandardDeviationIn.field_r, GetBoostersCooldown.field_r, param0, tla.field_c, kmb.field_c);
          if (param1 >= -119) {
            field_d = (gd[]) null;
          }
          GetLagStandardDeviationIn.field_r.a(false, SetPointDefenceLaserAimarc.field_o);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "fa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private fa() throws Throwable {
        throw new Error();
    }

    static {
        field_d = new gd[109];
        field_e = new String[]{"BAASAicADQESAg--BR4AHgEPAR4AD-8HIwkeAR4AD-8MJgIeAA--Aw8EEgUNDhIPDRANEQ0", "BwENAiYADQENAg0DGwQbBRsDGwUqBh8AGQEN-wcqCCoJHwANARn-CioMGw0nABsBGwIbAw0EDQUNDg0QLQ", "AwEeAQ8EIgANAQ0CHgAsAQ8EGwUN-wUNBg0HDQgNCSIAGwIeAA8BLAMNBA0GDQweAA--Dg8PDw", "BQANAycADQENAx4AGAEnAC0BDQQYBRgEDQUNBRAJIw0QDyYADQENAh4AJgAYARgEDQUtARgEDQUNEg0", "BgANAi0DHwAXAScBDQINAx4AGgENBRf-BCEAFwIX-wUfACYAFwIeAA0BGgMNBA3-ARf-Bi0IDQkuCi4LDQ"};
    }
}
