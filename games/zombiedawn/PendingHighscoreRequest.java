/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingHighscoreRequest extends IntrusiveNode {
    int field_h;
    int field_i;
    static Sprite field_j;

    final static boolean isPacketPayloadReady(int param0) {
        if (param0 != -2887) {
          field_j = (Sprite) null;
          if (MeshDepthBuckets.field_b == -1) {
            if (!Blast.fillIncomingBuffer((byte) -128, 1)) {
              return false;
            }
            MeshDepthBuckets.field_b = MatchingTextValidator.field_g.readUnsignedByte((byte) -117);
            MatchingTextValidator.field_g.position = 0;
          }
          if (-2 == MeshDepthBuckets.field_b) {
            if (!Blast.fillIncomingBuffer((byte) -110, 2)) {
              return false;
            }
            MeshDepthBuckets.field_b = MatchingTextValidator.field_g.readUnsignedShort(2);
            MatchingTextValidator.field_g.position = 0;
          }
          return Blast.fillIncomingBuffer((byte) 103, MeshDepthBuckets.field_b);
        }
        if (MeshDepthBuckets.field_b == -1) {
          if (!Blast.fillIncomingBuffer((byte) -128, 1)) {
            return false;
          }
          MeshDepthBuckets.field_b = MatchingTextValidator.field_g.readUnsignedByte((byte) -117);
          MatchingTextValidator.field_g.position = 0;
        }
        if (-2 == MeshDepthBuckets.field_b) {
          if (!Blast.fillIncomingBuffer((byte) -110, 2)) {
            return false;
          }
          MeshDepthBuckets.field_b = MatchingTextValidator.field_g.readUnsignedShort(2);
          MatchingTextValidator.field_g.position = 0;
        }
        return Blast.fillIncomingBuffer((byte) 103, MeshDepthBuckets.field_b);
    }

    private PendingHighscoreRequest() throws Throwable {
        throw new Error();
    }

    public static void releaseStatics(int param0) {
        field_j = null;
        if (param0 != 2) {
          PendingHighscoreRequest.isPacketPayloadReady(52);
        }
    }

    static {
    }
}
