/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MapClearanceArea implements DiffableState {
    static QuickChatDynamicCommand field_b;
    static int field_c;
    static int field_a;

    public void copyTo(byte param0, SerializableGameState param1) {
        try {
          if (param0 <= 54) {
            SerializableGameState var4 = (SerializableGameState) null;
            this.differsFrom((byte) -58, (SerializableGameState) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "dmb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public boolean differsFrom(byte param0, SerializableGameState param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -110 % ((22 - param0) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("dmb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          if (param1) {
            ResourceArchive var4 = (ResourceArchive) null;
            MapClearanceArea.loadSprites(-64, (byte) 110, (ResourceArchive) null, -56);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "dmb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        try {
          if (obfuscationGuard >= -19) {
            field_b = (QuickChatDynamicCommand) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "dmb.F(" + (other != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 > -99) {
          ResourceArchive var2 = (ResourceArchive) null;
          MapClearanceArea.loadSprites(-84, (byte) -24, (ResourceArchive) null, 25);
          field_b = null;
          return;
        }
        field_b = null;
    }

    public void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          if (param1 > -109) {
            ResourceArchive var4 = (ResourceArchive) null;
            MapClearanceArea.loadSprites(34, (byte) -8, (ResourceArchive) null, 110);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "dmb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static Sprite[] loadSprites(int param0, byte param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Sprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 75) {
            MapClearanceArea.clearSharedReferences((byte) -84);
          }
          if (SpriteArchiveDecoder.decodeSpriteArchiveFile(param3, 2, param2, param0)) {
            stackIn_6_0 = UiValueTrack.createDecodedSprites(false);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (Sprite[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("dmb.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void clearNebulae(World param0, boolean param1);

    static {
        field_b = new QuickChatDynamicCommand(7, 0, 1, 1);
    }
}
