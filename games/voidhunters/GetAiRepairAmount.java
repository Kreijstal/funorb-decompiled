/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetAiRepairAmount extends ConsoleCommand {
    final static void readQuickChatPolicy(int param0) {
        GetBloomThresholdPercentage.field_p = false;
        ConsoleSettingsScript.quickChatOnly = AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -90) == 0 ? true : false;
        if (param0 >= -65) {
          return;
        }
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
            GetAiRepairAmount.getCommonArchive(87);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(229, 87));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("g.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void printLoadSettingsCommand(byte param0) {
        System.out.println("load_settings(\"");
        SetFogOfWarOn.e((byte) 106);
        System.out.println("\")");
        if (param0 < 102) {
          GetAiRepairAmount.readQuickChatPolicy(-54);
        }
    }

    final static ResourceArchive getCommonArchive(int param0) {
        if (param0 != 0) {
          return (ResourceArchive) null;
        }
        return SetBlueprintSaveTime.getOrCreateCommonArchive(SetBombletSprayReload.commonArchiveId.id, 11835);
    }

    GetAiRepairAmount(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
