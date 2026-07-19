/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static String field_a;
    static String[] field_b;

    public static void a(byte param0) {
        if (param0 >= -50) {
            field_a = (String) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, byte param1, ak param2) {
        try {
            if (param1 != 84) {
                field_a = (String) null;
            }
            oh.field_j.a(param2, false);
            g.a(param0, param2, (byte) 50);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "vb.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new String[]{"Immortality", "The immortal nature of the <%0> means that it cannot be killed by any normal means."};
        field_a = "Your raider was trapped and killed.";
    }
}
