/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetBurstFireReload extends ConsoleCommand {
    final static Sprite[] createBorderedSpriteTiles(int param0, int param1, int param2) {
        if (param0 == -26998) {
          return GetPhasedEnergyBeamProjectiles.createBorderedSpriteTiles(param2, param1, 1, true);
        }
        SetBurstFireReload.createBorderedSpriteTiles(25, -128, -53);
        return GetPhasedEnergyBeamProjectiles.createBorderedSpriteTiles(param2, param1, 1, true);
    }

    final static void a(String param0, int param1, int param2, int param3, int param4, String param5) {
        IsaacPacketBuffer var8 = null;
        int var7 = 0;
        try {
          var8 = RequestNewestBlackboxRecording.field_p;
          IsaacPacketBuffer var6 = var8;
          var8.writeIsaacByte(24335, param3);
          var8.position = var8.position + 1;
          var7 = var8.position;
          var8.writeByte(0, param4);
          if (param4 == 2) {
            var8.writeString(true, param5);
          }
          if (param1 != -25719) {
            SetBurstFireReload.createBorderedSpriteTiles(124, -32, -6);
          }
          if (param0 == null) {
            var8.writeShort(param2, true);
          } else {
            SetAutoAfkTimeout.writeHuffmanString(param0, var8, -113);
          }
          var8.writeLengthByte(-var7 + var8.position, -129);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "va.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        String var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.submitSettingsChange(45, 62, arguments[0].intValue(50));
          if (obfuscationGuard > -119) {
            var4 = (String) null;
            SetBurstFireReload.a((String) null, 24, 98, -9, 52, (String) null);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("va.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetBurstFireReload(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
