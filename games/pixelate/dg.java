/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static boolean field_a;
    static ResourceArchive field_d;
    static SecondaryNodeHashTable field_f;
    static String field_b;
    static String[] field_c;
    static String field_e;

    final static void sendQuickChatMessage(boolean param0, int param1, int param2, String param3, String param4, int param5) {
        int var7 = 0;
        CipherPacketBuffer var8 = ChatMessage.field_f;
        var8.writeOpcode(param5, 15514);
        var8.position = var8.position + 1;
        if (!param0) {
          return;
        }
        try {
          var7 = var8.position;
          var8.writeByte(160, param1);
          if (param1 == 2) {
            var8.writeString((byte) -41, param4);
          }
          if (param3 != null) {
            DebouncedValidator.writeCompressedString(!param0 ? true : false, param3, var8);
          } else {
            var8.writeShort(1276387944, param2);
          }
          var8.backpatchByteLength(var8.position - var7, -1);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "dg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 == 1048576) {
          field_e = null;
          field_b = null;
          field_d = null;
          field_f = null;
          return;
        }
        dg.releaseStatics(-108);
        field_e = null;
        field_b = null;
        field_d = null;
        field_f = null;
    }

    final static void playMenuMusic(int param0, byte param1) {
        if (param1 < -82) {
          qh.a((byte) -93, 1048576, bj.field_c[param0], true);
          return;
        }
        field_e = (String) null;
        qh.a((byte) -93, 1048576, bj.field_c[param0], true);
    }

    static {
        field_a = true;
        field_b = "To <%0>: ";
        field_c = new String[]{"By rating", "By win percentage"};
        field_e = "Show all lobby chat";
    }
}
