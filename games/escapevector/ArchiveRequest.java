/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    static int field_t;
    static int field_v;
    static String field_q;
    volatile boolean field_u;
    static PcmSample field_w;
    boolean field_r;
    boolean field_s;

    final static void writeProgressQuery(int opcode, ProgressQuery query, int guard) {
        if (guard != -755) {
          return;
        }
        try {
          CipherPacketBuffer var3 = QuickChatDynamicCommand.outgoingPackets;
          var3.writeCipheredOpcode(opcode, true);
          var3.writeByte(2, -123);
          var3.writeByte(0, -123);
          var3.writeByte(query.campaignId, -123);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "oa.E(" + opcode + ',' + (query != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 5) {
          ArchiveRequest.releaseStatics(16);
          field_w = null;
          field_q = null;
          return;
        }
        field_w = null;
        field_q = null;
    }

    abstract int progress(int guard);

    abstract byte[] getBytes(boolean guard);

    ArchiveRequest() {
        this.field_u = true;
    }

    static {
        field_q = "End Game";
        field_v = 5;
    }
}
