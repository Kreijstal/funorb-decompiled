/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetSniperCannonRandomness extends ConsoleCommand {
    static String field_p;
    static int field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.submitSettingsChange(77, 62, arguments[0].intValue(40));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("fb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetSniperCannonRandomness(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void handleRecordReply(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        IsaacPacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ByteIndexedRecordWriteRequest var11 = null;
        IntegerRecordReadQueueEntry var12 = null;
        IsaacPacketBuffer var13 = null;
        IntegerRecordReadQueueEntry var14 = null;
        var8 = VoidHunters.field_G;
        try {
          var13 = AccountNameAvailabilityReplies.field_b;
          var2 = var13.readUnsignedByte((byte) -89);
          if (var2 == param0) {
            var10 = SetSniperCannonEnergyUsed.createEightIntBuffer((byte) -85);
            var3 = var10;
            var9 = var10;
            var4 = var9;
            var5 = var13;
            var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte((byte) -89);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((PacketBuffer) ((Object) var5)).readInt(92);
            }
            var14 = (IntegerRecordReadQueueEntry) (GetLagStandardDeviationIn.pendingRecordReads.first(0));
            if (var14 != null) {
              var14.unlink(param0 ^ -3846);
              return;
            }
            FighterBayWeaponDefinition.closeGameConnection(-121);
            return;
          }
          if (var2 != 1) {
            if (var2 != 2) {
              FractalNoiseVolumeGenerator.reportClientError((Throwable) null, "A1: " + SetCountermeasuresPulsetime.e(-13514), 0);
              FighterBayWeaponDefinition.closeGameConnection(param0 - 117);
            } else {
              var12 = (IntegerRecordReadQueueEntry) (GetLagStandardDeviationIn.pendingRecordReads.first(0));
              if (var12 == null) {
                FighterBayWeaponDefinition.closeGameConnection(-119);
                return;
              }
              SetSniperCannonEnergyUsed.createEightIntBuffer((byte) -80);
              var12.unlink(-3846);
            }
          } else {
            var11 = (ByteIndexedRecordWriteRequest) (OpenGlVertexBufferObject.pendingByteIndexedRecordWrites.first(0));
            if (var11 == null) {
              FighterBayWeaponDefinition.closeGameConnection(-125);
              return;
            }
            var11.unlink(-3846);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var1), "fb.C(" + param0 + ')');
        }
    }

    final static String encodeBase64Unpadded(byte[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -116) {
            stackIn_4_0 = TextEncodings.encodeBase64Unpadded(1, param0.length, 0, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("fb.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != 42) {
          SetSniperCannonRandomness.clearSharedReferences((byte) -19);
        }
        field_p = null;
    }

    static {
        field_p = "Spawn asteroid at mouse";
    }
}
