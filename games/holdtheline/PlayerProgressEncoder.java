/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerProgressEncoder {
    static long field_b;
    static String field_d;
    static RotatedSpriteAsset field_c;
    static SpriteAsset field_a;

    public static void clearSharedReferences(int param0) {
        int var1 = 6 / ((param0 + 63) / 37);
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final static byte[] encodePlayerProgress(byte param0) {
        int var4 = 0;
        int var3 = 0;
        int var5 = HoldTheLine.field_D;
        IsaacPacketBuffer var6 = new IsaacPacketBuffer(64);
        int var3Lifetime1;
        int var3Lifetime2;
        var6.beginBitWriting((byte) 0);
        var6.writeBits(-90, 1, NameAvailabilityResult.field_e ? 1 : 0);
        var6.writeBits(103, 1, ChatMessage.field_l ? 1 : 0);
        var6.writeBits(81, 1, !QuickChatPhraseDefinition.field_s ? 0 : 1);
        if (param0 >= -31) {
          field_b = 14L;
        }
        int var2 = hk.field_d + ao.field_b * 4;
        var6.writeBits(93, 4, var2);
        for (var3 = 1; 4 > var3; var3++) {
          ArchiveLoadProgress.a(-110, var3, 0, var6);
        }
        for (var3Lifetime1 = 1; var3Lifetime1 < 4; var3Lifetime1++) {
          for (var4 = 0; 4 > var4; var4++) {
            ArchiveLoadProgress.a(-98, var4, var3Lifetime1, var6);
          }
        }
        for (var3Lifetime2 = 0; var3Lifetime2 < 4; var3Lifetime2++) {
          dm.a(var6, var3Lifetime2, 255);
        }
        var6.endBitWriting((byte) 0);
        return var6.payload;
    }

    static {
    }
}
