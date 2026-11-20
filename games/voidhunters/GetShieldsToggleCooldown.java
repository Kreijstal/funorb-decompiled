/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetShieldsToggleCooldown extends ConsoleCommand {
    static String field_o;

    final static void readPackedScoreRow(PacketBuffer param0, boolean param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        if (!param1) {
          return;
        }
        try {
          SetCountermeasuresPulseRadius.field_q = param0.readUnsignedShort(1869) << 5;
          var2_int = param0.readUnsignedByte((byte) -107);
          SetCountermeasuresPulseRadius.field_q = SetCountermeasuresPulseRadius.field_q + (var2_int >> 3);
          SecondaryNodeQueue.field_d = (7 & var2_int) << 18;
          SecondaryNodeQueue.field_d = SecondaryNodeQueue.field_d + (param0.readUnsignedShort(1869) << 2);
          var2_intLifetime1 = param0.readUnsignedByte((byte) -118);
          QuickChatCategoryLoader.field_b = var2_intLifetime1 << 15 & 2064384;
          SecondaryNodeQueue.field_d = SecondaryNodeQueue.field_d + (var2_intLifetime1 >> 6);
          QuickChatCategoryLoader.field_b = QuickChatCategoryLoader.field_b + (param0.readUnsignedByte((byte) -98) << 7);
          var2_intLifetime2 = param0.readUnsignedByte((byte) -126);
          QuickChatCategoryLoader.field_b = QuickChatCategoryLoader.field_b + (var2_intLifetime2 >> 1);
          GetCountermeasureLauncherFireForce.field_o = 65536 & var2_intLifetime2 << 16;
          GetCountermeasureLauncherFireForce.field_o = GetCountermeasureLauncherFireForce.field_o + param0.readUnsignedShort(1869);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_o = null;
        if (param0 < 105) {
          field_o = (String) null;
        }
    }

    GetShieldsToggleCooldown(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            GetShieldsToggleCooldown.clearSharedReferences((byte) -83);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.getSettingValueText(209, 82));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_o = "Make copy of clicked object";
    }
}
