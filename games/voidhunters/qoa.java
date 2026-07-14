/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qoa extends rqa {
    static int field_o;
    static String field_p;

    qoa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != 9099) {
            qoa.a(-21, -94, -54);
        }
    }

    final static void a(int param0, int param1, int param2) {
        uo.field_o = param1;
        ata.field_H = param0;
        if (param2 != 143) {
            qoa.a(-87);
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          qoa.a(4);
          si.a(143, 62, param0[0].a(49));
          return new nc((Object) (Object) "void");
        } else {
          si.a(143, 62, param0[0].a(49));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "CONGRATULATIONS, YOU ARE NOW QUALIFIED FOR BATTLE<br>PRESS ESCAPE TO OPEN THE MENU";
        field_o = 16;
    }
}
