/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class td {
    static int field_a;
    static int field_b;

    abstract byte[] a(int param0, boolean param1);

    final static void a(int param0, ResourceArchive param1, ResourceArchive param2, ResourceArchive param3, boolean param4) {
        try {
          if (param0 != 1) {
            field_b = 63;
          }
          pb.field_k = kg.a(2, "");
          pb.field_k.a(false, (byte) -48);
          DialogMessagePane.a(param2, 118, param3, param1);
          ProxyAuthenticationRequiredException.a(param0 ^ 127);
          RichTextWidget.field_F = wj.field_a;
          fh.field_B = wj.field_a;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "td.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 != 1) {
          return true;
        }
        return fe.field_g;
    }

    abstract int getGroupRequestProgressPercent(int param0, int param1);

    final static void a(byte param0) {
        eh.a(true);
        if (ch.field_h != null) {
          ContentTransitionDialog.a(ch.field_h, (byte) 86);
        }
        DisplayNameSelectionPanel.l(8927);
        mc.a(-660);
        hh.b((byte) 48);
        if (!wg.b(true)) {
          kc.a(param0);
          return;
        }
        hh.field_p.a(true, 1);
        jj.a(0, true);
        kc.a(param0);
    }

    abstract g b(int param0);

    static {
    }
}
