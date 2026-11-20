/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetSpinningBladeAimarc extends ConsoleCommand {
    static int field_o;

    SetSpinningBladeAimarc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void e(byte param0) {
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

    final static UiTheme f(byte param0) {
        if (param0 == 62) {
          if (GetMissionResnetResourceTickTime.field_p == null) {
            GetMissionResnetResourceTickTime.field_p = new UiTheme();
            GetMissionResnetResourceTickTime.field_p.initializeDefaultStyles(SetShipToShipRamDamage.field_o, -24763);
            GetMissionResnetResourceTickTime.field_p.tooltipPaddingRight = 5;
            GetMissionResnetResourceTickTime.field_p.tooltipBackgroundColor = 2763306;
            GetMissionResnetResourceTickTime.field_p.font = SetTorpedoProjectileLife.field_o;
            GetMissionResnetResourceTickTime.field_p.tooltipPaddingBottom = 4;
            GetMissionResnetResourceTickTime.field_p.tooltipPaddingLeft = 6;
            GetMissionResnetResourceTickTime.field_p.tooltipLineSpacing = 14;
            GetMissionResnetResourceTickTime.field_p.tooltipPaddingTop = 0;
            GetMissionResnetResourceTickTime.field_p.tooltipBorderColor = 7697781;
          }
          return GetMissionResnetResourceTickTime.field_p;
        }
        SetSpinningBladeAimarc.f((byte) -106);
        if (GetMissionResnetResourceTickTime.field_p == null) {
          GetMissionResnetResourceTickTime.field_p = new UiTheme();
          GetMissionResnetResourceTickTime.field_p.initializeDefaultStyles(SetShipToShipRamDamage.field_o, -24763);
          GetMissionResnetResourceTickTime.field_p.tooltipPaddingRight = 5;
          GetMissionResnetResourceTickTime.field_p.tooltipBackgroundColor = 2763306;
          GetMissionResnetResourceTickTime.field_p.font = SetTorpedoProjectileLife.field_o;
          GetMissionResnetResourceTickTime.field_p.tooltipPaddingBottom = 4;
          GetMissionResnetResourceTickTime.field_p.tooltipPaddingLeft = 6;
          GetMissionResnetResourceTickTime.field_p.tooltipLineSpacing = 14;
          GetMissionResnetResourceTickTime.field_p.tooltipPaddingTop = 0;
          GetMissionResnetResourceTickTime.field_p.tooltipBorderColor = 7697781;
        }
        return GetMissionResnetResourceTickTime.field_p;
    }

    static {
        field_o = 30;
    }
}
