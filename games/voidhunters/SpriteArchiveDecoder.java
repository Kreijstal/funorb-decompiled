/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteArchiveDecoder {
    static Widget field_a;
    static String field_c;
    static int field_b;

    final static void a(int param0, byte param1, int param2) {
        IsaacPacketBuffer var3 = null;
        IsaacPacketBuffer var3Lifetime1;
        if (param1 < -82) {
          var3 = RequestNewestBlackboxRecording.field_p;
          var3.writeIsaacByte(24335, param0);
          var3.writeByte(0, 3);
          var3.writeByte(0, 8);
          var3.writeShort(param2, true);
          return;
        }
        ResourceArchive var4 = (ResourceArchive) null;
        SpriteArchiveDecoder.decodeSpriteArchiveFile(-92, -5, (ResourceArchive) null, 15);
        var3Lifetime1 = RequestNewestBlackboxRecording.field_p;
        var3Lifetime1.writeIsaacByte(24335, param0);
        var3Lifetime1.writeByte(0, 3);
        var3Lifetime1.writeByte(0, 8);
        var3Lifetime1.writeShort(param2, true);
    }

    final static void logError(String param0, int param1) {
        System.out.println("Error: " + LiteralStrings.replaceLiteral("\n", "%0a", param0, 0));
        if (param1 != 3) {
          SpriteArchiveDecoder.clearSharedReferences(111);
        }
    }

    public static void clearSharedReferences(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 2) {
          field_a = (Widget) null;
        }
    }

    final static boolean decodeSpriteArchiveFile(int param0, int param1, ResourceArchive param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            SpriteArchiveDecoder.clearSharedReferences(36);
          }
          var5 = param2.fetchFile(param0, param3, (byte) 13);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          SetUseSprites.decodeSpriteSheet(0, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("pa.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        NebulaFieldFactory discarded$0 = new NebulaFieldFactory();
        field_c = "Hull piece";
    }
}
