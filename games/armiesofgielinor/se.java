/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static String field_b;
    static int field_e;
    static MusicTrack field_h;
    static boolean field_f;
    static fo field_g;
    static int field_d;
    static int field_a;
    static boolean field_c;

    final static String requestAddIgnoredAccount(String name, int packetOpcode, int obfuscationGuard) {
        RuntimeException var3 = null;
        int payloadStart = 0;
        CipherPacketBuffer packet = null;
        CharSequence nameCharacters = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -29) {
            se.a(93);
          }
          nameCharacters = (CharSequence) ((Object) name);
          if (!hg.isValidSocialTargetName((byte) -90, nameCharacters)) {
            stackIn_5_0 = SectorCacheStore.field_d;
            return stackIn_5_0;
          }
          if (gt.isLocalAccountName(name, (byte) -114)) {
            stackIn_8_0 = MoveAttackRequest.field_F;
            return stackIn_8_0;
          }
          if (2 != th.socialListState) {
            stackIn_11_0 = ct.field_m;
            return stackIn_11_0;
          }
          if (IndexedSpriteBase.isIgnoredAccount(name, -3404)) {
            stackIn_14_0 = fo.a(4800, ts.field_k, new String[]{name});
            return stackIn_14_0;
          }
          if (vg.ignoreCount >= 100) {
            stackIn_17_0 = wh.field_d;
            return stackIn_17_0;
          }
          if (jj.isFriend(89, name)) {
            stackIn_20_0 = fo.a(4800, PopupPresentation.field_p, new String[]{name});
            return stackIn_20_0;
          }
          packet = vl.outgoingPacket;
          packet.writeCipheredOpcode(32161, packetOpcode);
          packet.position = packet.position + 1;
          payloadStart = packet.position;
          packet.writeByte(1, 2);
          packet.writeNullTerminatedString(name, 13851);
          packet.writeByteLengthPrefix(packet.position - payloadStart, 5930);
          stackIn_22_0 = null;
          return (String) (stackIn_22_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("se.A(");
          if (name == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(packetOpcode).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_f = false;
        }
        field_b = null;
        field_g = null;
        field_h = null;
    }

    final static RgbSprite[] a(byte param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        RgbSprite[] var1;
        int var3;
        int[] var6;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var1 = new RgbSprite[iw.decodedSpriteCount];
        for (var2 = 0; iw.decodedSpriteCount > var2; var2++) {
          var3 = c.decodedSpriteHeights[var2] * qm.decodedSpriteWidths[var2];
          var20 = AnimationPlayer.decodedSpriteIndices[var2];
          if (!MapTile.decodedSpriteHasAlpha[var2]) {
            var9 = new int[var3];
            var21 = var9;
            for (var6_int = 0; var6_int < var3; var6_int++) {
              var9[var6_int] = MovementPresentation.decodedSpritePalette[rn.bitwiseAnd(255, (int) var20[var6_int])];
            }
            var1[var2] = new RgbSprite(lg.decodedSpriteCanvasWidth, wr.decodedSpriteCanvasHeight, j.decodedSpriteOffsetXs[var2], CampaignMenuButton.decodedSpriteOffsetYs[var2], qm.decodedSpriteWidths[var2], c.decodedSpriteHeights[var2], var21);
          } else {
            var22 = CampaignMenuEntry.decodedSpriteAlphas[var2];
            var16 = new int[var3];
            var13 = var16;
            var6 = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6[var7] = oe.bitwiseOr(MovementPresentation.decodedSpritePalette[rn.bitwiseAnd((int) var20[var7], 255)], rn.bitwiseAnd((int) var22[var7], 255) << 24);
            }
            var1[var2] = (RgbSprite) ((Object) new nj(lg.decodedSpriteCanvasWidth, wr.decodedSpriteCanvasHeight, j.decodedSpriteOffsetXs[var2], CampaignMenuButton.decodedSpriteOffsetYs[var2], qm.decodedSpriteWidths[var2], c.decodedSpriteHeights[var2], var16));
          }
        }
        if (param0 != 32) {
          return (RgbSprite[]) null;
        }
        rj.releaseSpriteDecodeBuffers((byte) 101);
        return var1;
    }

    static {
        field_b = "Enter name of friend to delete from list";
        field_a = 480;
        field_c = false;
        field_f = false;
    }
}
