/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerJoinFactory implements GameStateFactory {
    static Widget field_c;
    static int pendingAccountUiResult;
    static String field_a;

    final static void fillGradientRectangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (OpenGlTexture1D.field_i) {
          param5 = param5 | -16777216;
          param2 = param2 | -16777216;
          GetDebrisCarryOver.fillGradientTriangle(8, param0 + param1, 1, param2, param4, param3 + param4, param1 + param0, param0, param2, param4, param5);
          GetDebrisCarryOver.fillGradientTriangle(8, param0, 1, param5, param4, param3 + param4, param1 + param0, param0, param2, param3 + param4, param5);
          if (param6 != 0) {
            field_a = (String) null;
            return;
          }
          return;
        }
        SoftwareRasterizer2D.fillRectangle(param4, param0, param3, param1, param2);
        if (param6 != 0) {
          field_a = (String) null;
          return;
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new PlayerJoin[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -88 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new PlayerJoin());
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 != -5254) {
          return;
        }
        field_c = null;
    }

    final static boolean pollIncomingPacketPayload(byte param0) {
        if (PartitioningManagerFactory.field_a == -1) {
          if (!ShipBlueprint.pollReplyBytes(1, 30000)) {
            return false;
          }
          PartitioningManagerFactory.field_a = AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -126);
          AccountNameAvailabilityReplies.field_b.position = 0;
        }
        if (param0 <= 9) {
          PlayerJoinFactory.pollIncomingPacketPayload((byte) -116);
          if (PartitioningManagerFactory.field_a == -2) {
            if (ShipBlueprint.pollReplyBytes(2, 30000)) {
              PartitioningManagerFactory.field_a = AccountNameAvailabilityReplies.field_b.readUnsignedShort(1869);
              AccountNameAvailabilityReplies.field_b.position = 0;
              return ShipBlueprint.pollReplyBytes(PartitioningManagerFactory.field_a, 30000);
            }
            return false;
          }
          return ShipBlueprint.pollReplyBytes(PartitioningManagerFactory.field_a, 30000);
        }
        if (PartitioningManagerFactory.field_a == -2) {
          if (ShipBlueprint.pollReplyBytes(2, 30000)) {
            PartitioningManagerFactory.field_a = AccountNameAvailabilityReplies.field_b.readUnsignedShort(1869);
            AccountNameAvailabilityReplies.field_b.position = 0;
            return ShipBlueprint.pollReplyBytes(PartitioningManagerFactory.field_a, 30000);
          }
          return false;
        }
        return ShipBlueprint.pollReplyBytes(PartitioningManagerFactory.field_a, 30000);
    }

    static {
        field_a = "Remove name";
        pendingAccountUiResult = -1;
    }
}
