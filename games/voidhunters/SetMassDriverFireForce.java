/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMassDriverFireForce extends ConsoleCommand {
    static LoginMethod field_p;
    static boolean field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.submitSettingsChange(98, 62, arguments[0].intValue(78));
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("dua.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 < 88) {
          field_p = (LoginMethod) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    SetMassDriverFireForce(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String e(byte param0) {
        if (UiDraggableContainer.field_z < 2) {
          return GetSpinningBladeTopSpeed.connectingToUpdateServerText;
        }
        if (ByteStorageRanges.field_a != null) {
          if (!ByteStorageRanges.field_a.loadIndex((byte) -37)) {
            return PasswordValidator.waitingForTextMessage;
          }
          return WorldSpriteTiler.loadingTextMessage;
        }
        if (!CommonUiArchiveResources.commonUiArchive.loadIndex((byte) 115)) {
          return SetTorpedoProjectileOndamageParticles.field_o;
        }
        if (!CommonUiArchiveResources.commonUiArchive.isNamedGroupReady(32171, "commonui")) {
          return ConstantMonochromeTextureOperation.field_k + " - " + CommonUiArchiveResources.commonUiArchive.getNamedGroupLoadPercent("commonui", -2118) + "%";
        }
        if (!GetSalvoUsesAllEnergy.field_o.loadIndex((byte) 122)) {
          return TorpedoWeaponDefinition.field_b;
        }
        if (!GetSalvoUsesAllEnergy.field_o.isNamedGroupReady(32171, "commonui")) {
          return GetBombletSprayAimarc.field_p + " - " + GetSalvoUsesAllEnergy.field_o.getNamedGroupLoadPercent("commonui", -2118) + "%";
        }
        if (param0 >= -18) {
          field_o = true;
        }
        if (!BufferedFile.field_i.loadIndex((byte) -41)) {
          return SetUseLines.field_q;
        }
        if (!BufferedFile.field_i.loadAllGroups(35)) {
          return QuickChatHelpWindow.loadingExtraDataText + " - " + BufferedFile.field_i.getLoadPercent(-115) + "%";
        }
        return SetUseModels.field_p;
    }

    static {
        field_p = new LoginMethod("");
    }
}
