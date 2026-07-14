/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qpa {
    static String field_b;
    static String field_a;

    public static void a(boolean param0) {
        if (!param0) {
            field_b = null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static String a(byte param0, byte[] param1) {
        Object var3 = null;
        if (param0 != -125) {
          var3 = null;
          String discarded$2 = qpa.a((byte) -116, (byte[]) null);
          return tja.a(0, 0, param1.length, param1);
        } else {
          return tja.a(0, 0, param1.length, param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_a = "Missiles";
    }
}
