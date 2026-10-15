/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static long lastWallMillis;
    static int field_b;
    static BitPacketBuffer incomingPackets;
    static RgbSprite field_d;
    static int field_a;

    final static void b(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        Mesh3D var4_ref_fr = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        Mesh3D var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = BrickABrac.field_J ? 1 : 0;
        try {
          kk.field_e = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = TextHotspotRegion.logoMeshes.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_fr = TextHotspotRegion.logoMeshes[var3];
            var4_ref_fr.ensureBounds(23);
            HuffmanCodec.a(var3, (byte) 77);
            var5 = var4_ref_fr.minX + var4_ref_fr.maxX >> 1;
            var6 = var4_ref_fr.maxY + var4_ref_fr.minY >> 1;
            var7 = var4_ref_fr.maxZ + var4_ref_fr.minZ >> 1;
            var8 = kk.field_e[9] >> 2;
            var9 = kk.field_e[10] >> 2;
            var10_int = kk.field_e[11] >> 2;
            var11 = var10_int * MatchResultScreen.field_w[5] + (MatchResultScreen.field_w[4] * var9 + MatchResultScreen.field_w[3] * var8) >> 14;
            var12 = var8 * MatchResultScreen.field_w[6] + (var9 * MatchResultScreen.field_w[7] + var10_int * MatchResultScreen.field_w[8]) >> 14;
            var13 = var9 * MatchResultScreen.field_w[10] + (var8 * MatchResultScreen.field_w[9] + MatchResultScreen.field_w[11] * var10_int) >> 14;
            var2[var3] = var7 * var13 + var12 * var6 + var5 * var11 >> 16;
          }
          var3Lifetime1 = kk.field_e[9] >> 8;
          var4 = kk.field_e[10] >> 8;
          var5Lifetime1 = kk.field_e[11] >> 8;
          var6Lifetime1 = MatchResultScreen.field_t << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = InteractiveGameClient.sine8192(var6Lifetime1, -4097) >> 8;
          var9Lifetime1 = BrickABrac.cosine8192(2048, var6Lifetime1) >> 8;
          if (-1 != MusicPatch.pointerX &&
            -1 != ResourcePreparationEntry.pointerY) {
            var8Lifetime1 = -ResourcePreparationEntry.pointerY + 240;
            var9Lifetime1 = -128;
            var7Lifetime1 = MusicPatch.pointerX - 320;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + var12Lifetime1 * var12Lifetime1 + var13Lifetime1 * var13Lifetime1));
          if (param0 >= -114) {
            field_a = -44;
          }
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          for (var15 = 0; TextHotspotRegion.logoMeshes.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < TextHotspotRegion.logoMeshes.length; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = TextHotspotRegion.logoMeshes[var16];
            HuffmanCodec.a(var16, (byte) 77);
            for (var18 = 0; var18 < 3; var18++) {
              MatchResultScreen.field_w[var18] = MatchResultScreen.field_w[var18] + BoundedFile.logoOriginalCenters[var15][var18];
            }
            MusicVoice.transformAndProjectMesh(kk.field_e, -16283, MatchResultScreen.field_w, false, true, var17, false);
            SocialListEntry.shadeAndDrawMesh(var14, var7Lifetime1, var12Lifetime1, var9Lifetime1, var17, (byte) -105, var13Lifetime1, var8Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "jl.D(" + param0 + ')');
        }
    }

    final static boolean pollKeyEvent(byte obfuscationGuard) {
        Object var1 = null;
        Object keyboardMonitor = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        keyboardMonitor = DualLinkDeque.keyboardInput;
        synchronized (keyboardMonitor) {
          if (IntrusiveHashTable.keyEventReadIndex == fm.keyEventFrameEnd) {
            return false;
          }
          MeshAttributeRecord.currentKeyCode = ProxyAuthenticationRequiredException.keyEventCodes[IntrusiveHashTable.keyEventReadIndex];
          ResourceArchiveFactory.currentKeyCharacter = TimedSplashScreen.keyEventCharacters[IntrusiveHashTable.keyEventReadIndex];
          if (obfuscationGuard != 5) {
            return true;
          }
          IntrusiveHashTable.keyEventReadIndex = IntrusiveHashTable.keyEventReadIndex + 1 & 127;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    public static void a(int param0) {
        incomingPackets = null;
        field_d = null;
        if (param0 != 31186) {
          String var2 = (String) null;
          jl.requestAddFriend(-88, (String) null, -64);
        }
    }

    final static String requestAddFriend(int obfuscationGuard, String name, int opcode) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int bodyStart = 0;
        BitPacketBuffer packet = null;
        CharSequence nameCharacters = null;
        try {
          nameCharacters = (CharSequence) ((Object) name);
          if (!DualLinkNode.isValidSocialName(nameCharacters, false)) {
            stackIn_3_0 = LobbyGame.field_Xb;
            return stackIn_3_0;
          }
          if (LevelMetadata.field_m != 2) {
            stackIn_7_0 = kd.field_b;
            return stackIn_7_0;
          }
          if (SpaceBackground.isLocalPlayerName(name, -19)) {
            stackIn_11_0 = rj.field_a;
            return stackIn_11_0;
          }
          if (LevelPack.isFriend(0, name)) {
            stackIn_14_0 = rd.a(TextChoiceDialogStyles.field_d, new String[]{name}, (byte) 103);
            return stackIn_14_0;
          }
          if (LevelPackSelectScreen.friendCount >= 100 &&
            ResourceArchiveFactory.windowModeCapabilityWord <= 0) {
            stackIn_18_0 = er.field_e;
            return stackIn_18_0;
          }
          if (200 <= LevelPackSelectScreen.friendCount) {
            stackIn_21_0 = er.field_e;
            return stackIn_21_0;
          }
          if (AchievementBrowserScreen.isIgnoredPlayer(121, name)) {
            stackIn_24_0 = rd.a(ConstructionBackground.field_u, new String[]{name}, (byte) 103);
            return stackIn_24_0;
          }
          if (obfuscationGuard != 24943) {
            lastWallMillis = -99L;
          }
          packet = TextFieldValidator.outgoingPackets;
          packet.writeCipheredOpcode(-13413, opcode);
          packet.position = packet.position + 1;
          bodyStart = packet.position;
          packet.writeByte(-107, 0);
          packet.writeCp1252String(name, obfuscationGuard - 24944);
          packet.backfillByteLength((byte) 122, -bodyStart + packet.position);
          stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("jl.B(").append(obfuscationGuard).append(',');
          if (name == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(opcode).append(')').toString());
        }
    }

    static {
        field_b = 64;
    }
}
