/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl implements dja {
    static cda[] field_c;
    static boolean field_b;
    static int field_a;

    public static void a(int param0) {
        int var1 = 108 / ((param0 - -48) / 59);
        field_c = null;
    }

    final static ha a(d param0, byte param1, int param2, java.awt.Canvas param3) {
        if (param1 != 16) {
            return null;
        }
        return (ha) (Object) new qfa(param3, param0, param2);
    }

    final static void a(byte param0, tjb param1) {
        if (param1 == null) {
          return;
        } else {
          if (param0 != -28) {
            field_a = 99;
            fkb.field_m = param1;
            tra.field_o.field_lb.e(param0 + 128);
            tra.field_o.b(-561, (llb) (Object) fkb.field_m);
            uga.field_d = true;
            return;
          } else {
            fkb.field_m = param1;
            tra.field_o.field_lb.e(param0 + 128);
            tra.field_o.b(-561, (llb) (Object) fkb.field_m);
            uga.field_d = true;
            return;
          }
        }
    }

    public final tv a(byte param0) {
        int var2 = 91 % ((param0 - -64) / 50);
        return (tv) (Object) new aib();
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = 110;
            return (tv[]) (Object) new aib[param1];
        }
        return (tv[]) (Object) new aib[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new cda[256];
        field_b = false;
        field_a = 1;
    }
}
