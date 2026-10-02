/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static String achievementsText;

    final static void c(int param0) {
        if (param0 >= -9) {
            achievementsText = (String) null;
        }
    }

    final static boolean b(int param0) {
        if (param0 != 255) {
            bl.a(-112, (byte) -119);
            if (mi.field_C < 20) {
                return true;
            }
            if (!fj.f(-31456)) {
                return true;
            }
            if (ik.field_a <= 0) {
                return false;
            }
            if (!ck.b(0)) {
                return true;
            }
            return false;
        }
        if (mi.field_C < 20) {
            return true;
        }
        if (!fj.f(-31456)) {
            return true;
        }
        if (ik.field_a <= 0) {
            return false;
        }
        if (!ck.b(0)) {
            return true;
        }
        return false;
    }

    final static int a(int param0, byte param1) {
        param0 = (-715827883 & param0 >>> 1) + (1431655765 & param0);
        if (param1 == 70) {
            param0 = (param0 & 858993459) - -(param0 >>> 2 & 858993459);
            param0 = param0 + (param0 >>> 4) & 252645135;
            param0 = param0 + (param0 >>> 8);
            param0 = param0 + (param0 >>> 16);
            return param0 & 255;
        }
        achievementsText = (String) null;
        param0 = (param0 & 858993459) - -(param0 >>> 2 & 858993459);
        param0 = param0 + (param0 >>> 4) & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return param0 & 255;
    }

    public static void a(int param0) {
        if (param0 != -9751) {
            bl.a(31, (byte) -123);
            achievementsText = null;
            return;
        }
        achievementsText = null;
    }

    static {
        achievementsText = "Achievements";
    }
}
