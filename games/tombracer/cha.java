/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cha {
    java.awt.Image field_a;
    static String field_b;
    static String field_h;
    static String field_c;
    int field_e;
    int field_f;
    static mla field_d;
    int[] field_g;

    public static void a(boolean param0) {
        field_b = null;
        field_c = null;
        if (!param0) {
          field_c = null;
          field_d = null;
          field_h = null;
          return;
        } else {
          field_d = null;
          field_h = null;
          return;
        }
    }

    final void a(int param0) {
        if (param0 != -19216) {
          field_h = null;
          bea.a(((cha) this).field_g, ((cha) this).field_f, ((cha) this).field_e);
          return;
        } else {
          bea.a(((cha) this).field_g, ((cha) this).field_f, ((cha) this).field_e);
          return;
        }
    }

    final static int a(goa param0, goa param1, int param2) {
        Object var4 = null;
        Object var5 = null;
        if (param2 != 2) {
          var4 = null;
          int discarded$2 = cha.a((goa) null, (goa) null, -60);
          var5 = null;
          return fja.a(param0, (String) null, false, 0, param1, 94, 0);
        } else {
          var5 = null;
          return fja.a(param0, (String) null, false, 0, param1, 94, 0);
        }
    }

    final static void a(int param0, int param1, ha param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        param2.KA(param0, param4, param0 + param3, param3 + param4);
        param2.za(param0 + param3, param3 + param4, param3, param6, param7);
        param2.KA(-param3 + param5 + param0, param4, param0 - -param5, param4 + param3);
        param2.za(param0 + param5 + -param3, param3 + param4, param3, param6, param7);
        param2.KA(param5 + (param0 + -param3), -param3 + param4 + param8, param5 + param0, param4 - -param8);
        param2.za(-param3 + (param0 - -param5), param8 + param4 - param3, param3, param6, param7);
        param2.KA(param0, param8 + (param4 + -param3), param3 + param0, param8 + param4);
        param2.za(param0 + param3, param8 + param4 + -param3, param3, param6, param7);
        param2.la();
        param2.aa(param3 + param0, param4, param5 - param3 * 2, param3, param6, param7);
        param2.aa(param3 + param0, param4 + param8 + -param3, -(2 * param3) + param5, param3, param6, param7);
        param2.aa(param0, param4 - -param3, param3, param8 - param3 * 2, param6, param7);
        param2.aa(-param3 + (param0 - -param5), param3 + param4, param3, -(param1 * param3) + param8, param6, param7);
        param2.aa(param0 + param3, param4 + param3, param5 + -(2 * param3), param8 + -(param3 * 2), param6, param7);
    }

    abstract void a(int param0, int param1, java.awt.Component param2, byte param3);

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Clan";
        field_c = "Your request to join has been declined.";
        field_h = "Round Winner";
        field_d = new mla();
    }
}
