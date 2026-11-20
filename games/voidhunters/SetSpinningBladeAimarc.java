/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetSpinningBladeAimarc extends ConsoleCommand {
    static int field_o;

    SetSpinningBladeAimarc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void restoreMouseCursor(byte param0) {
        java.awt.Canvas var1 = null;
        if (param0 == -128) {
          if (ShipComponentFactory.field_a) {
            ShipComponentFactory.field_a = false;
            var1 = SetThrusterBindingMoveAndTurnHasOppositeMove.e((byte) 123);
            SetTorpedoProjectiles.field_o.movePointer((java.awt.Component) ((Object) var1), GetTorpedoReload.field_q, GetUseDetailLines.field_o, 14);
            SetTorpedoProjectiles.field_o.setCursorVisible((java.awt.Component) ((Object) var1), true, (byte) -122);
            PlayerGameData.field_b = GetUseDetailLines.field_o;
            OpenGlFaceAttachment.field_b = GetTorpedoReload.field_q;
          }
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
          SetMachineGunEnergyUsed.a(134, 62, arguments[0].intValue(45));
          if (obfuscationGuard >= -119) {
            field_o = -111;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("brb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static UiTheme getLoginUiTheme(byte param0) {
        if (param0 == 62) {
          if (GetMissionResnetResourceTickTime.loginUiTheme == null) {
            GetMissionResnetResourceTickTime.loginUiTheme = new UiTheme();
            GetMissionResnetResourceTickTime.loginUiTheme.initializeDefaultStyles(SetShipToShipRamDamage.field_o, -24763);
            GetMissionResnetResourceTickTime.loginUiTheme.tooltipPaddingRight = 5;
            GetMissionResnetResourceTickTime.loginUiTheme.tooltipBackgroundColor = 2763306;
            GetMissionResnetResourceTickTime.loginUiTheme.font = SetTorpedoProjectileLife.field_o;
            GetMissionResnetResourceTickTime.loginUiTheme.tooltipPaddingBottom = 4;
            GetMissionResnetResourceTickTime.loginUiTheme.tooltipPaddingLeft = 6;
            GetMissionResnetResourceTickTime.loginUiTheme.tooltipLineSpacing = 14;
            GetMissionResnetResourceTickTime.loginUiTheme.tooltipPaddingTop = 0;
            GetMissionResnetResourceTickTime.loginUiTheme.tooltipBorderColor = 7697781;
          }
          return GetMissionResnetResourceTickTime.loginUiTheme;
        }
        SetSpinningBladeAimarc.getLoginUiTheme((byte) -106);
        if (GetMissionResnetResourceTickTime.loginUiTheme == null) {
          GetMissionResnetResourceTickTime.loginUiTheme = new UiTheme();
          GetMissionResnetResourceTickTime.loginUiTheme.initializeDefaultStyles(SetShipToShipRamDamage.field_o, -24763);
          GetMissionResnetResourceTickTime.loginUiTheme.tooltipPaddingRight = 5;
          GetMissionResnetResourceTickTime.loginUiTheme.tooltipBackgroundColor = 2763306;
          GetMissionResnetResourceTickTime.loginUiTheme.font = SetTorpedoProjectileLife.field_o;
          GetMissionResnetResourceTickTime.loginUiTheme.tooltipPaddingBottom = 4;
          GetMissionResnetResourceTickTime.loginUiTheme.tooltipPaddingLeft = 6;
          GetMissionResnetResourceTickTime.loginUiTheme.tooltipLineSpacing = 14;
          GetMissionResnetResourceTickTime.loginUiTheme.tooltipPaddingTop = 0;
          GetMissionResnetResourceTickTime.loginUiTheme.tooltipBorderColor = 7697781;
        }
        return GetMissionResnetResourceTickTime.loginUiTheme;
    }

    static {
        field_o = 30;
    }
}
