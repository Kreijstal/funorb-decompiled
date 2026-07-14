/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_a;
    static String field_b;

    final static void a(int param0) {
        da.field_b = false;
        if (param0 != -464379825) {
            field_a = 5;
        }
        int discarded$0 = rd.field_j.f(96);
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_a = -21;
        }
    }

    final static void a(boolean param0, pb param1) {
        cg.field_h = param1.d((byte) 72) << 2053368837;
        int var2 = param1.f(-128);
        cg.field_h = cg.field_h + (var2 >> 1421443875);
        sa.field_a = (7 & var2) << 1218813234;
        sa.field_a = sa.field_a + (param1.d((byte) 72) << 37676290);
        var2 = param1.f(123);
        pc.field_c = 2064384 & var2 << -464379825;
        sa.field_a = sa.field_a + (var2 >> 1736280646);
        pc.field_c = pc.field_c + (param1.f(-107) << -1330418201);
        var2 = param1.f(90);
        if (param0) {
            return;
        }
        nl.field_b = 65536 & var2 << 700350160;
        pc.field_c = pc.field_c + (var2 >> 1656520321);
        nl.field_b = nl.field_b + param1.d((byte) 72);
    }

    final static StringBuilder a(StringBuilder param0, char param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Main.field_T;
        int var4 = param0.length();
        param0.setLength(param2);
        if (param3 != 2053368837) {
            field_b = (String) null;
        }
        for (var5 = var4; var5 < param2; var5++) {
            param0.setCharAt(var5, param1);
        }
        return param0;
    }

    static {
    }
}
