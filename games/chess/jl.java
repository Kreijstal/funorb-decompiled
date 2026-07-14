/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static String field_a;
    static String field_b;

    final static boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        if (0 == (sb.field_sb ^ -1)) {
            if (!(tk.a(-121, 1))) {
                return false;
            }
            sb.field_sb = tk.field_h.i(-117);
            tk.field_h.field_l = 0;
        }
        if (!(-2 != sb.field_sb)) {
            if (!(tk.a(60, 2))) {
                return false;
            }
            sb.field_sb = tk.field_h.f(674914976);
            tk.field_h.field_l = 0;
        }
        return tk.a(-121, sb.field_sb);
    }

    final static long a(CharSequence param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Chess.field_G;
        long var2 = 0L;
        if (param1) {
            Object var8 = null;
        }
        int var4 = param0.length();
        for (var5 = 0; var5 < var4; var5++) {
            var2 = var2 * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65) {
                // if_icmpgt L94
                var2 = var2 + (long)(var6 + 1 + -65);
            } else {
                if (var6 >= 97) {
                    // if_icmpgt L122
                    var2 = var2 + (long)(var6 + 1 + -97);
                } else {
                    if (var6 >= 48) {
                        if (!(var6 > 57)) {
                            var2 = var2 + (long)(-48 + (27 + var6));
                        }
                    }
                }
            }
            if ((var2 ^ -1L) <= -177917621779460414L) {
                break;
            }
        }
        while (var2 % 37L == 0L) {
            // ifeq L203
            var2 = var2 / 37L;
        }
        return var2;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -1699) {
            boolean discarded$0 = jl.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Add <%0> to friend list";
        field_b = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
