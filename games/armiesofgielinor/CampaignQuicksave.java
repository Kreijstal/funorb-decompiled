/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CampaignQuicksave {
    static String field_a;
    int damageTaken;
    int missionId;
    byte[] snapshotBytes;
    int eliminatedPlayerMask;
    int campaignIndex;
    static String field_i;
    boolean hasLostUnit;
    int[] playerMana;
    private int receivedBytes;

    final boolean appendSnapshotChunk(int length, int obfuscationGuard, CipherPacketBuffer packet) {
        RuntimeException var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.snapshotBytes) {
            return true;
          }
          packet.readBytes(0, length, this.receivedBytes, this.snapshotBytes);
          if (obfuscationGuard != -1) {
            return true;
          }
          this.receivedBytes = this.receivedBytes + length;
          stackIn_9_0 = !(this.receivedBytes < this.snapshotBytes.length);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("sl.B(").append(length).append(',').append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void write(int sourceOffset, PacketBuffer packet) {
        try {
          this.writeHeader(8, packet);
          packet.writeBytes(this.snapshotBytes, sourceOffset, this.snapshotBytes.length, 104);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "sl.D(" + sourceOffset + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    private final void writeHeader(int obfuscationGuard, PacketBuffer packet) {
        int playerIndex = 0;
        int var4 = 0;
        PacketBuffer stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          packet.writeByte(1, this.campaignIndex);
          packet.writeByte(obfuscationGuard - 7, this.missionId);
          packet.writeShort(true, this.damageTaken);
          stackIn_3_0 = (PacketBuffer) (packet);
          stackIn_3_1 = true;
          if (this.hasLostUnit) {
            stackIn_4_2 = 1;
          } else {
            stackIn_4_2 = 0;
          }
          ((PacketBuffer) (Object) stackIn_3_0).writeShort(stackIn_3_1, stackIn_4_2);
          if (this.playerMana != null) {
            packet.writeByte(1, this.playerMana.length);
            for (playerIndex = 0; this.playerMana.length > playerIndex; playerIndex++) {
              packet.writeInt((byte) -74, this.playerMana[playerIndex]);
            }
          } else {
            packet.writeByte(1, 0);
          }
          packet.writeByte(1, this.eliminatedPlayerMask);
          packet.writeInt((byte) -72, this.snapshotBytes.length);
          if (obfuscationGuard != 8) {
            CampaignQuicksave.a(25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("sl.A(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        int var1 = -54 % ((param0 + 65) / 39);
    }

    CampaignQuicksave(PacketBuffer packet, int formatVersion, boolean receiveInChunks) {
        int playerIndex = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int manaCount = 0;
        RuntimeException var4 = null;
        int snapshotLength;
        try {
          this.receivedBytes = -1;
          this.campaignIndex = packet.readUnsignedByte(0);
          this.missionId = packet.readUnsignedByte(0);
          this.damageTaken = packet.readUnsignedShort((byte) -104);
          stackIn_4_1 = (packet.readUnsignedShort((byte) -104) == 1);
          this.hasLostUnit = stackIn_4_1;
          if (formatVersion > 7) {
            manaCount = packet.readUnsignedByte(0);
            if (manaCount > 0) {
              this.playerMana = new int[manaCount];
              for (playerIndex = 0; playerIndex < this.playerMana.length; playerIndex++) {
                this.playerMana[playerIndex] = packet.readInt(1);
              }
            }
            if (formatVersion > 8) {
              this.eliminatedPlayerMask = packet.readUnsignedByte(0);
            }
          }
          snapshotLength = packet.readInt(1);
          if (snapshotLength < 100000 &&
            snapshotLength > 0) {
            this.snapshotBytes = new byte[snapshotLength];
            if (receiveInChunks) {
              this.receivedBytes = 0;
              return;
            }
            this.receivedBytes = -1;
            packet.readBytes(0, snapshotLength, 0, this.snapshotBytes);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("sl.<init>(");
          if (packet == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(formatVersion).append(',').append(receiveInChunks).append(')').toString());
        }
    }

    CampaignQuicksave(int campaignIndex, int missionId, Battlefield battlefield, int damageTaken, boolean hasLostUnit) {
        PacketBuffer var7 = null;
        try {
          this.missionId = missionId;
          this.campaignIndex = campaignIndex;
          this.receivedBytes = -1;
          var7 = new PacketBuffer(30000);
          battlefield.writeLegacySnapshot(var7, -25771, battlefield.campaignMission.playerSlot);
          this.snapshotBytes = var7.copyWrittenBytes((byte) -82);
          this.eliminatedPlayerMask = battlefield.eliminatedPlayerMask;
          this.hasLostUnit = hasLostUnit ? true : false;
          this.damageTaken = damageTaken;
          this.playerMana = new int[battlefield.playerMana.length];
          vm.a(battlefield.playerMana, 0, this.playerMana, 0, battlefield.playerMana.length);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "sl.<init>(" + campaignIndex + ',' + missionId + ',' + (battlefield != null ? "{...}" : "null") + ',' + damageTaken + ',' + hasLostUnit + ')');
        }
    }

    static {
        field_a = "Elixirs to improve the abilities of your units.";
        field_i = "Rating";
    }
}
