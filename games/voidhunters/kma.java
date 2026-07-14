/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kma extends eka implements ntb {
    static String field_d;
    static String field_c;

    public final void a(tv param0, int param1) {
        if (param1 >= -19) {
            return;
        }
        super.a(param0, -20);
    }

    final int a(byte param0) {
        if (param0 > -100) {
            field_c = null;
            return 1024;
        }
        return 1024;
    }

    final static void a(String param0, boolean param1, int param2, String param3) {
        ht.field_h = param0;
        qsb.field_d = param3;
        fa.a(uta.field_p, -127, param1);
        if (param2 != -17833) {
            field_d = null;
        }
    }

    public final void b(byte param0, tv param1) {
        super.b((byte) 75, param1);
        if (param0 < 54) {
            field_d = null;
        }
    }

    final static int a(int param0, int param1, int param2, String param3) {
        Object var5 = null;
        if (param2 != 200) {
          var5 = null;
          kma.a((String) null, false, -23, (String) null);
          return maa.a(param1, (byte) -126, param0, param3, 200);
        } else {
          return maa.a(param1, (byte) -126, param0, param3, 200);
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = -85 % ((param0 - 22) / 59);
        return super.a((byte) 122, param1);
    }

    public static void c(int param0) {
        field_c = null;
        field_d = null;
        int var1 = 84 % ((param0 - 36) / 50);
    }

    public kma() {
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -127);
        if (param1 > -109) {
            int discarded$0 = ((kma) this).b((byte) 105);
        }
    }

    final int b(byte param0) {
        if (param0 <= 98) {
            kma.c(-99);
            return 16;
        }
        return 16;
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Names cannot start or end with space or underscore";
        field_c = "One team has a VIP, the other team wants to destroy them";
    }
}
