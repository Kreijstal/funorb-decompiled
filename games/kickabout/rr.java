/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rr {
    static boolean field_f;
    static String field_e;
    static String[] field_g;
    static String field_a;
    static String field_d;
    static String field_h;
    static String field_c;
    static ji field_b;

    final static io[] a(int[] param0, io[] param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        if (param0 == null) {
            return null;
        }
        io[] var6 = new io[param0.length];
        io[] var3 = var6;
        for (var4 = param2; var4 < param0.length; var4++) {
            var6[var4] = param1[param0[var4]];
        }
        return var3;
    }

    final static boolean a(int param0, char param1) {
        if (param1 >= 32) {
            if (!(param1 > 126)) {
                return true;
            }
        }
        if (param1 >= 160) {
            if (param1 <= 255) {
                return true;
            }
        }
        int var2 = -23 / ((-53 - param0) / 55);
        if (param1 != 8364) {
            if (param1 != 338) {
                if (param1 != 8212) {
                    if (param1 != 339) {
                        if (param1 != 376) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    final static int a(int param0, CharSequence param1) {
        if (param0 != 10) {
            return -120;
        }
        return kt.a(param1, true, (byte) -103, 10);
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_c = null;
        int var1 = -50 / ((-58 - param0) / 50);
        field_a = null;
    }

    final static void a(String param0, byte param1, long param2) {
        at.field_Kb = param0;
        if (param1 != -70) {
            boolean discarded$0 = rr.a(36, '+');
        }
        ov.field_b = 2;
        CharSequence var5 = (CharSequence) (Object) param0;
        qi.field_o = mo.a(param1 ^ -70, var5);
        ik.field_A = param2;
        la.a(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> must play <%1> more rated games before playing with the current options.";
        field_g = new String[]{"Tutorial", "Sprinting", "Sprinting", "Sprinting", "Dribbling", "Passing", "Passing", "Charging Up", "Tackling", "Tackling", "Tackling", "The Gauntlet", "Lobbing", "Lobbing", "Switching Player", "The Hotshot", "Scoring a Goal", "Scoring a Goal", "Choosing A Formation", "Choosing A Lineup", "Sandbox Mode"};
        field_d = "Too High";
        field_h = "TAB - hide chat temporarily";
        field_f = false;
        field_a = "<%0> scores a goal, extending their lead over <%1> with a score of <%2> to <%3>.";
        field_c = "Invalid date";
    }
}
