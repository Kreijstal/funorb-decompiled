/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    final static lkb a(byte param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        int var2 = param1.length();
        if (param0 != -74) {
            return null;
        }
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return ira.field_b;
    }

    final static void a(byte param0) {
        if (param0 < 126) {
            return;
        }
        cea.a(-88, 17);
    }

    static {
    }
}
