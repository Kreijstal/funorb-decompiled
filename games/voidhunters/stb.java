/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class stb extends rqa {
    static String field_o;
    static int field_p;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_p = -102;
          return new nc((Object) (Object) frb.a(49, 122));
        } else {
          return new nc((Object) (Object) frb.a(49, 122));
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 3) {
            field_o = null;
        }
    }

    stb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1) {
        faa var2 = dpa.field_p;
        var2.h(24335, param1);
        int var3 = -33 / ((-71 - param0) / 46);
        var2.c(0, 1);
        var2.c(0, 3);
    }

    final static void a(int param0, int param1, faa param2, tv param3) {
        if ((param1 ^ -1) != -2) {
          if (param1 != param0) {
            if ((param1 ^ -1) == -4) {
              ((sjb) (Object) param3).a(param2, (byte) -30);
              return;
            } else {
              return;
            }
          } else {
            ((tva) (Object) param3).c(param2, 19537);
            if ((param1 ^ -1) == -4) {
              ((sjb) (Object) param3).a(param2, (byte) -30);
              return;
            } else {
              return;
            }
          }
        } else {
          param3.b(param2, -126);
          if (param1 == param0) {
            ((tva) (Object) param3).c(param2, 19537);
            if ((param1 ^ -1) != -4) {
              return;
            } else {
              ((sjb) (Object) param3).a(param2, (byte) -30);
              return;
            }
          } else {
            if ((param1 ^ -1) == -4) {
              ((sjb) (Object) param3).a(param2, (byte) -30);
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "More hull pieces";
        field_p = 0;
    }
}
