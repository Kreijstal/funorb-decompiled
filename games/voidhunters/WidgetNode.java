/*
 * Decompiled by CFR-JS 0.4.0.
 */
class WidgetNode extends DualLinkNode {
    static NodeHashTable field_k;
    static Widget field_l;
    static long[] field_m;

    public static void clearSharedReferences(int param0) {
        field_l = null;
        if (param0 != 8) {
          field_m = (long[]) null;
          field_k = null;
          field_m = null;
          return;
        }
        field_k = null;
        field_m = null;
    }

    WidgetNode() {
    }

    final static void writePendingRequest(int param0, int param1, PendingRequest param2) {
        IsaacPacketBuffer var3 = null;
        try {
          if (param0 <= 13) {
            PendingRequest var4 = (PendingRequest) null;
            WidgetNode.writePendingRequest(-2, -20, (PendingRequest) null);
          }
          var3 = RequestNewestBlackboxRecording.field_p;
          var3.writeIsaacByte(24335, param1);
          var3.writeByte(0, param2.field_g);
          var3.writeShort(param2.field_d, true);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "fgb.DA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new NodeHashTable(8);
    }
}
