/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundPlaybackHandle extends IntrusiveNode {
    static ClientUiComponent field_p;
    static String field_m;
    static int musicGain;
    static int dialogViewportWidth;
    int unscaledVolume;
    IntrusiveNode lifetimeNode;
    RawPcmStream stream;

    final static void writePlayerAdmissionCancellation(int packetOpcode, long accountId, byte obfuscationGuard) {
        int var5 = 0;
        CipherPacketBuffer var4 = vl.outgoingPacket;
        int var5Lifetime1;
        if (obfuscationGuard >= 88) {
          var4.writeCipheredOpcode(32161, packetOpcode);
          var4.position = var4.position + 1;
          var5 = var4.position;
          var4.writeByte(1, 7);
          var4.writeLong(accountId, 38359632);
          var4.writeByteLengthPrefix(-var5 + var4.position, 5930);
          return;
        }
        SoundPlaybackHandle.giveSelectedTileToPlayer(-87, -88);
        var4.writeCipheredOpcode(32161, packetOpcode);
        var4.position = var4.position + 1;
        var5Lifetime1 = var4.position;
        var4.writeByte(1, 7);
        var4.writeLong(accountId, 38359632);
        var4.writeByteLengthPrefix(-var5Lifetime1 + var4.position, 5930);
    }

    final static String giveSelectedTileToPlayer(int obfuscationGuard, int ownerPlayer) {
        GameplayController guardedControllerSecondAlias;
        int selectedTileIndex;
        GameplayController guardedControllerAlias;
        GameplayController guardedController;
        GameplayController controllerAlias;
        GameplayController controller;
        int guardedSelectedTileIndex;
        if (obfuscationGuard == 128) {
          controller = rd.gameplayController;
          controllerAlias = controller;
          if (controllerAlias == null) {
            return "No game in progress.";
          }
          selectedTileIndex = controllerAlias.selectedTileIndex;
          if (0 <= selectedTileIndex &&
            selectedTileIndex < controllerAlias.battlefield.tiles.length) {
            if (-1 <= ownerPlayer &&
              controllerAlias.battlefield.playerCount > ownerPlayer) {
              controller.battlefield.tiles[selectedTileIndex].ownerPlayer = ownerPlayer;
              return "Done.";
            }
            return "Invalid owner; use -1 to " + controllerAlias.battlefield.playerCount;
          }
          return "Please select a tile before using this.";
        }
        dialogViewportWidth = 113;
        guardedController = rd.gameplayController;
        guardedControllerAlias = guardedController;
        guardedControllerSecondAlias = guardedControllerAlias;
        if (guardedControllerAlias == null) {
          return "No game in progress.";
        }
        guardedSelectedTileIndex = guardedControllerAlias.selectedTileIndex;
        if (0 > guardedSelectedTileIndex) {
          return "Please select a tile before using this.";
        }
        if (guardedSelectedTileIndex >= guardedControllerAlias.battlefield.tiles.length) {
          return "Please select a tile before using this.";
        }
        if (-1 > ownerPlayer) {
          return "Invalid owner; use -1 to " + guardedControllerAlias.battlefield.playerCount;
        }
        if (guardedControllerAlias.battlefield.playerCount <= ownerPlayer) {
          return "Invalid owner; use -1 to " + guardedControllerAlias.battlefield.playerCount;
        }
        guardedController.battlefield.tiles[guardedSelectedTileIndex].ownerPlayer = ownerPlayer;
        return "Done.";
    }

    public static void a(byte param0) {
        field_m = null;
        field_p = null;
        if (param0 >= -33) {
          bj var2 = (bj) null;
          SoundPlaybackHandle.a(54, (bj) null, -6);
        }
    }

    final static void a(int param0, bj param1, int param2) {
        CipherPacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = vl.outgoingPacket;
          var3.writeCipheredOpcode(32161, param0);
          var3.writeByte(1, param1.field_n);
          var3.writeShort(true, param1.field_m);
          if (param2 == -17006) {
            return;
          }
          SoundPlaybackHandle.writePlayerAdmissionCancellation(102, 77L, (byte) -50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("te.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    SoundPlaybackHandle(RawPcmStream stream, IntrusiveNode lifetimeNode) {
        try {
          this.stream = stream;
          this.unscaledVolume = stream.getTargetVolume();
          this.lifetimeNode = lifetimeNode;
          this.stream.setVolume(128 + ResourceProtocolClient.effectsGain * this.unscaledVolume >> 8);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "te.<init>(" + (stream != null ? "{...}" : "null") + ',' + (lifetimeNode != null ? "{...}" : "null") + ')');
        }
    }

    static {
        musicGain = 256;
        field_m = "To server list";
        dialogViewportWidth = 640;
    }
}
