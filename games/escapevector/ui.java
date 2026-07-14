/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static fk field_a;
    static String field_d;
    int field_c;
    static al field_b;
    static volatile int field_e;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    final static int a(sn param0, sn param1, int param2) {
        int var3 = -113 % ((param2 - -13) / 50);
        Object var4 = null;
        return od.a((byte) -32, false, (String) null, param0, param1, 0, 0);
    }

    final static ed[] a(String param0, mf param1, String param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        if (param3 < 67) {
          field_b = null;
          var4 = param1.b(-1, param2);
          var5 = param1.a(var4, param0, true);
          return gm.a(var4, var5, param1, 8192);
        } else {
          var4 = param1.b(-1, param2);
          var5 = param1.a(var4, param0, true);
          return gm.a(var4, var5, param1, 8192);
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (be.field_b != null) {
          be.field_b.o(-18861);
          var1 = -22 / ((param0 - 26) / 51);
          rc.field_b = new oi();
          rd.field_c.a((hm) (Object) rc.field_b, 30);
          return;
        } else {
          var1 = -22 / ((param0 - 26) / 51);
          rc.field_b = new oi();
          rd.field_c.a((hm) (Object) rc.field_b, 30);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        gd.field_X = param0;
        pc.field_d = param1;
        lh.field_e = param2;
        if (param3 != -11997) {
            field_e = 84;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new fk(0);
        field_d = "Explosive is on hill - please land closer";
        field_e = 0;
    }
}
