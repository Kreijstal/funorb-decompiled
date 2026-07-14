/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qla extends rqa {
    static String field_o;

    public static void e(byte param0) {
        field_o = null;
        if (param0 < 121) {
            qla.e((byte) -70);
        }
    }

    qla(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(faa param0, byte param1, boolean[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (param2 == null) {
          param0.a(-632, 0, param3);
          return;
        } else {
          if (-1 != (param2.length ^ -1)) {
            var4 = 1 % ((81 - param1) / 33);
            param0.a(-632, param2.length, param3);
            var5 = 0;
            L0: while (true) {
              if (var5 >= param2.length) {
                return;
              } else {
                boolean discarded$2 = vq.a(param0, 118, param2[var5]);
                var5++;
                continue L0;
              }
            }
          } else {
            param0.a(-632, 0, param3);
            return;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_o = null;
            si.a(60, 62, param0[0].a(43));
            return new nc((Object) (Object) "void");
        }
        si.a(60, 62, param0[0].a(43));
        return new nc((Object) (Object) "void");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Sorry, your ship is too large to save";
    }
}
