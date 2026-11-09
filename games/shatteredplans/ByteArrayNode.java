/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteArrayNode extends IntrusiveNode {
    byte[] field_n;
    static rs field_i;
    static String field_m;
    static int[] field_h;
    static String field_o;
    static String field_l;
    static sg[][] field_p;
    static int field_k;
    int field_j;

    final static void a(String param0, int param1, boolean param2) {
        try {
          ToggleButton.field_D = param2;
          FleetMove.field_C = true;
          DateInputWidget.field_G = new AccountStatusDialog(ByteArrayStorage.field_e, CipherPacketBuffer.field_p, param0, TertiaryNodeList.field_b, ToggleButton.field_D);
          ByteArrayStorage.field_e.addDialog(true, DateInputWidget.field_G);
          int var3_int = -116 / ((-1 - param1) / 54);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "fk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_l = null;
        if (param0 >= 76) {
          field_m = null;
          field_p = (sg[][]) null;
          field_h = null;
          field_i = null;
          return;
        }
        ByteArrayNode.a((byte) 91);
        field_m = null;
        field_p = (sg[][]) null;
        field_h = null;
        field_i = null;
    }

    ByteArrayNode(byte[] param0) {
        try {
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "fk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Remove <%0> from ignore list";
        field_l = "C: Show Chat";
        field_h = new int[8192];
        field_o = "Spectate <%0>'s game";
    }
}
