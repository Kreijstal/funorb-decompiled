/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends rqa {
    static rbb field_p;
    static int field_o;

    final static void a(int param0, int param1, phb[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        if (param2 != null) {
          if (-1 <= (param4 ^ -1)) {
            return;
          } else {
            var5 = param2[0].field_m;
            var6 = param2[2].field_m;
            var7 = param2[1].field_m;
            param2[0].a(param3, param1);
            param2[2].a(param4 + (param3 - var6), param1);
            dma.a(ola.field_o);
            dma.g(var5 + param3, param1, param4 + param3 - var6, param1 - -param2[param0].field_n);
            var8 = param3 - -var5;
            var9 = -var6 + param4 + param3;
            param3 = var8;
            L0: while (true) {
              if (param3 >= var9) {
                dma.b(ola.field_o);
                return;
              } else {
                param2[1].a(param3, param1);
                param3 = param3 + var7;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    eg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = null;
          return new nc((Object) (Object) frb.a(71, 96));
        } else {
          return new nc((Object) (Object) frb.a(71, 96));
        }
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 > -43) {
            field_o = -91;
        }
    }

    final static void e(byte param0) {
        if (fda.e((byte) 104)) {
            return;
        }
        if (!wh.g(-127)) {
            return;
        }
        kc var1 = es.field_b;
        if (!(var1 != null)) {
            return;
        }
        if (!(!bqa.a(false))) {
            var1 = new kc();
            es.field_b.b((byte) 87, (tv) (Object) var1);
            var1.field_f = null;
        }
        byte[] var20 = dab.a(-30234, (tv) (Object) var1);
        byte[] var11 = var20;
        byte[] var2 = var11;
        if (var2 == null) {
            nkb.a(false, "Failed to write player gamedata");
            return;
        }
        if (-201 > (var20.length ^ -1)) {
            nkb.a(false, "Failed to write player gamedata");
            return;
        }
        nkb.a(false, "Submitting " + var20.length + " bytes to clientdata");
        if (param0 > -35) {
            field_o = -50;
        } else {
            dnb discarded$0 = jla.a(var20, (byte) 64, 6);
            return;
        }
        dnb discarded$1 = jla.a(var20, (byte) 64, 6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 2;
    }
}
