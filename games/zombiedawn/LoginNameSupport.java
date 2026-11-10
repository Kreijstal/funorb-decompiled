/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginNameSupport {
    static Zombie field_c;
    static NameListEntry[] field_b;
    static String field_a;

    public static void releaseStatics(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 0) {
          LoginNameSupport.releaseStatics(61);
        }
    }

    final static LoginNameValue createLoginNameValue(byte param0) {
        String var1 = ArmySoldier.getActiveLoginIdentifier((byte) 115);
        if (param0 != -8) {
          field_a = (String) null;
        }
        if (var1 != null &&
          var1.indexOf('@') >= 0) {
          var1 = "";
        }
        return new LoginNameValue(ArmySoldier.getActiveLoginIdentifier((byte) -21), DualLinkNode.isEmailLoginSelected(0));
    }

    static {
        int var0 = 0;
        field_b = new NameListEntry[255];
        for (var0 = 0; var0 < field_b.length; var0++) {
          field_b[var0] = new NameListEntry();
        }
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
