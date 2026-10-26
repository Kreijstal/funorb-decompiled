/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ag extends DualLinkNode {
    static String field_o;
    boolean field_t;
    static sa field_n;
    volatile boolean field_p;
    static int field_r;
    boolean field_q;
    static int field_s;

    abstract byte[] a(boolean param0);

    final static void writeHighscoreQuery(int opcode, int payloadLength, HighscoreQuery query) {
        try {
          CipherPacketBuffer packet = q.outgoingPacket;
          packet.writeCipheredOpcode(64, opcode);
          packet.writeByte(-1336879960, payloadLength);
          packet.writeByte(-1336879960, 0);
          packet.writeShort(query.queryId, payloadLength ^ 23388);
          packet.writeByte(-1336879960, query.entryLimit);
          packet.writeByte(-1336879960, query.valuesPerEntry);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ag.E(" + opcode + ',' + payloadLength + ',' + (query != null ? "{...}" : "null") + ')');
        }
    }

    abstract int e(int param0);

    ag() {
        this.field_p = true;
    }

    public static void a(byte param0) {
        if (param0 != 34) {
          field_r = -109;
          field_n = null;
          field_o = null;
          return;
        }
        field_n = null;
        field_o = null;
    }

    static {
        field_o = "Return to game";
    }
}
