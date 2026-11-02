/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static ClientConnectionState field_d;
    static int campaignBaseChannelGain;
    static String[] field_c;
    static String field_a;

    final static boolean a(boolean param0) {
        if (param0) {
          gi.releaseStatics(11);
          return SocketFactory.nameCheckPending == mh.accountNameCheckState ? true : false;
        }
        return SocketFactory.nameCheckPending == mh.accountNameCheckState ? true : false;
    }

    public static void releaseStatics(int obfuscationGuard) {
        field_a = null;
        field_c = null;
        if (obfuscationGuard != 180) {
          gi.releaseStatics(-55);
          field_d = null;
          return;
        }
        field_d = null;
    }

    static {
        campaignBaseChannelGain = 180;
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_d = new ClientConnectionState();
        field_a = "Vile toxins to weaken your enemies.";
    }
}
