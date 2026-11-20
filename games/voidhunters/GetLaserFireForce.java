/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetLaserFireForce extends ConsoleCommand {
    final static TextureLineShape decodeTextureLineShape(PacketBuffer param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        TextureLineShape stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 66 % ((70 - param1) / 39);
          stackIn_1_0 = new TextureLineShape(param0.readShort(true), param0.readShort(true), param0.readShort(true), param0.readShort(true), param0.readUnsignedMedium((byte) -123), param0.readUnsignedByte((byte) -90));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("frb.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String getSettingValueText(int param0, int param1) {
        if (param1 <= 73) {
          PacketBuffer var3 = (PacketBuffer) null;
          GetLaserFireForce.decodeTextureLineShape((PacketBuffer) null, (byte) -91);
          if (MatchingFieldValidator.field_g != null) {
            return Integer.toString(MatchingFieldValidator.field_g.state.getVisibleSnapshot(1).settings.values[param0]);
          }
          return "Unknown";
        }
        if (MatchingFieldValidator.field_g != null) {
          return Integer.toString(MatchingFieldValidator.field_g.state.getVisibleSnapshot(1).settings.values[param0]);
        }
        return "Unknown";
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        PacketBuffer var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            var4 = (PacketBuffer) null;
            GetLaserFireForce.decodeTextureLineShape((PacketBuffer) null, (byte) -82);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.getSettingValueText(100, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("frb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetLaserFireForce(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
