/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LoginCredentials {
    static String field_c;
    static String field_d;
    static int field_a;
    static String[] field_f;
    static boolean field_b;
    static String field_e;
    private static String field_z;

    abstract LoginCredentialType getCredentialType(byte param0);

    public static void releaseStatics(int param0) {
        int var1 = -47 % ((58 - param0) / 45);
        field_f = null;
        field_d = null;
        field_e = null;
        field_c = null;
    }

    abstract void writeTo(int param0, PacketBuffer param1);

    static {
        field_z = "hm.E(";
        field_c = "<%0> cannot join; the game has started.";
        field_f = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_d = "Please select options in the following rows:  ";
        field_e = "Unpacking graphics";
    }
}
