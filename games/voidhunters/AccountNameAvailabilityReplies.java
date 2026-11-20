/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNameAvailabilityReplies {
    static IsaacPacketBuffer field_b;
    static long field_a;

    final static void handleNameAvailabilityReply(String param0, int param1, byte param2, String[] param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (param2 <= 34) {
            field_a = -92L;
          }
          SetShipTeamAction.field_b = SetSniperCannonFireForce.field_o;
          if (param1 == 255) {
            stackIn_12_0 = !(SetDebrisCarryOverPercentage.field_p >= 13);
            PrimitiveType.field_a = GpuIndexBufferOwner.createSuccessfulAccountResult(stackIn_12_0, 1);
            var6 = (String[]) null;
            WeaponDefinition.a((String[]) null, 11113);
            return;
          }
          if (param1 < 100) {
            PrimitiveType.field_a = GetArmageddonLength.createAccountErrorResult(param1, param0, (byte) -124);
            return;
          }
          if (param1 > 105) {
            PrimitiveType.field_a = GetArmageddonLength.createAccountErrorResult(param1, param0, (byte) -124);
            return;
          }
          var4 = param3;
          WeaponDefinition.a(var4, 11113);
          PrimitiveType.field_a = MissionCondition.createAccountNameSuggestions(param3, (byte) -123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("qga.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_b = null;
        int var1 = 94 / ((param0 - 55) / 45);
    }

    static {
    }
}
