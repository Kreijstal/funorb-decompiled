/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends TargetedChatMessage {
    static Sprite field_r;
    static String field_s;
    static int field_t;
    static String field_q;

    final static void a(String param0, boolean param1, byte param2, boolean param3) {
        try {
          MenuButton.f(-1);
          ByteArrayStorage.field_e.deactivateAll(104);
          no.field_e = new ri(MenuWindow.field_B, (String) null, TertiaryNodeList.field_b, param3, param1);
          if (param2 > -50) {
            field_s = (String) null;
          }
          ae.field_f = new hk(ByteArrayStorage.field_e, no.field_e);
          ByteArrayStorage.field_e.addDialog(true, ae.field_f);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "jm.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void clearStatics(int param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        if (param0 != 22595) {
          field_r = (Sprite) null;
        }
    }

    jm(long param0, String param1) {
        super(param0, param1);
    }

    final MessageKind getKind(byte param0) {
        int var2 = -78 / ((param0 + 7) / 41);
        return tm.field_p;
    }

    static {
        field_s = "Members";
        field_q = "<%0> points, <%1> points per turn.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$88c6728ee5b1(String param0, boolean param1, int param2, boolean param3) {
        try {
          MenuButton.f(-1);
          ByteArrayStorage.field_e.deactivateAll(104);
          no.field_e = new ri(MenuWindow.field_B, (String) null, TertiaryNodeList.field_b, param3, param1);
          if (param2 > -50) {
            field_s = (String) null;
          }
          ae.field_f = new hk(ByteArrayStorage.field_e, no.field_e);
          ByteArrayStorage.field_e.addDialog(true, ae.field_f);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "jm.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }
}
