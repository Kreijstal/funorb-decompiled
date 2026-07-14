/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    static ll field_b;
    static int field_a;
    int field_c;

    public static void a(byte param0) {
        if (param0 != 50) {
            field_b = (ll) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(-1 != (param1 ^ -1))) {
            return 0;
        }
        if (!(0 >= param1)) {
            var2 = 1;
            if (65535 < param1) {
                param1 = param1 >> 16;
                var2 += 16;
            }
            if (-256 > param1) {
                param1 = param1 >> 8;
                var2 += 8;
            }
            if (!(15 >= param1)) {
                var2 += 4;
                param1 = param1 >> 4;
            }
            if (!(-4 >= param1)) {
                var2 += 2;
                param1 = param1 >> 2;
            }
            if (-2 > param1) {
                var2++;
                param1 = param1 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (!(65535 <= param1)) {
            var2 += 16;
            param1 = param1 >> 16;
        }
        if (255 < (param1 ^ -1)) {
            var2 += 8;
            param1 = param1 >> 8;
        }
        if (!(param1 >= -16)) {
            param1 = param1 >> 4;
            var2 += 4;
        }
        if (-4 > param1) {
            var2 += 2;
            param1 = param1 >> 2;
        }
        if (param1 < -2) {
            var2++;
            param1 = param1 >> 1;
        }
        int var3 = -26 / ((param0 - 61) / 35);
        return var2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static vt a(gk param0, int param1, int param2, int param3, gk param4) {
        int var5 = 0;
        if (!tn.a(param0, (byte) -127, param1, param3)) {
          return null;
        } else {
          var5 = 53 / ((param2 - -57) / 33);
          return gl.a(param4.a(param3, -10470, param1), 544);
        }
    }

    eo(int param0) {
        ((eo) this).field_c = param0;
    }

    static {
    }
}
