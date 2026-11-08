/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatusRequestHelpers {
    static byte[] field_a;
    static String field_c;
    static String field_g;
    static int field_d;
    static String field_e;
    static String field_b;
    static int[] field_f;

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_f = null;
        int var1 = 70 % ((param0 + 45) / 36);
        field_a = null;
        field_g = null;
        field_e = null;
        field_b = null;
    }

    final static PendingStatQuery queueStatusRequest(int param0, byte param1) {
        PendingStatQuery var2 = new PendingStatQuery();
        SecondaryNodeDequeIterator.field_a.addLast(var2, false);
        int var3 = -10 % ((42 - param1) / 44);
        GameSession.sendStatQueryRequest((byte) 53, param0);
        return var2;
    }

    static int bitAnd(int param0, int param1) {
        return param0 & param1;
    }

    final static Archive createArchive(int param0, boolean param1, boolean param2, int param3, byte param4) {
        if (param4 < -47) {
          return ArchiveFactoryHelpers.createResourceArchive(param2, param0, false, param3, (byte) 122, param1);
        }
        StatusRequestHelpers.queueStatusRequest(-52, (byte) 50);
        return ArchiveFactoryHelpers.createResourceArchive(param2, param0, false, param3, (byte) 122, param1);
    }

    static {
        field_a = new byte[]{(byte)7};
        field_c = "Players: <%0>/<%1>";
        field_g = "You have 1 unread message!";
        field_b = "Send private Quick Chat to <%0>";
        field_f = new int[8192];
    }
}
