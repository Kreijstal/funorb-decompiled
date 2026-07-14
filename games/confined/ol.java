/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static bi field_c;
    static String field_b;
    static bc field_a;

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var5 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        int var4 = param0.length();
        param0.setLength(param1);
        for (var5 = var4; var5 < param1; var5++) {
            param0.setCharAt(var5, param3);
        }
        if (param2 != -1046) {
            ol.a(81, 67, -16, -58, 110);
        }
        return param0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 30613) {
            field_b = null;
        }
        nn.field_t[param3].d(param0, param4);
        pn.field_a.a(Integer.toString(param2), param0 + 39, 38 + param4, 16777215, -1);
    }

    final static void a(byte param0) {
        int var1 = -89 / ((param0 - -59) / 35);
        if (!(fd.field_j)) {
            throw new IllegalStateException();
        }
        qf.field_g = true;
        aa.a((byte) -113, true);
        rk.field_e = 0;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 0) {
            field_c = null;
        }
        field_a = null;
    }

    final static void a(int param0, byte param1, boolean param2) {
        fi.field_a = param0;
        li.field_l = param2 ? true : false;
        if (param1 < 84) {
            field_a = null;
        }
        cj.field_d = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Use the keyboard for your upgrades.";
    }
}
