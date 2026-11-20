/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetBoostersCooldown extends ConsoleCommand {
    final static ResourceArchive getOrCreateToolkitResourceArchive(byte param0, int param1) {
        int var2 = 59 / ((7 - param0) / 45);
        if (QuickChatHelpWindow.field_xb != null) {
          return QuickChatHelpWindow.field_xb;
        }
        if (-1 != param1) {
          return SetAutoAfkTimeout.createArchive(true, false, -65, true, param1, 1);
        }
        return QuickChatHelpWindow.field_xb;
    }

    SetBoostersCooldown(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void drawToolkitTooltip(GraphicsToolkit param0, ToolkitFontMetrics param1, ToolkitFont param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        if (param3 >= -123) {
          return;
        }
        try {
          BitmapFont var11 = (BitmapFont) null;
          TooltipDisplay.updateAndDrawTooltip(param4, param9, param1, param8, param2, param7, param0, param6, -115, (BitmapFont) null, param5);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "pj.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ToolkitFont var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.submitSettingsChange(218, 62, arguments[0].intValue(109));
          if (obfuscationGuard > -119) {
            var4 = (ToolkitFont) null;
            SetBoostersCooldown.drawToolkitTooltip((GraphicsToolkit) null, (ToolkitFontMetrics) null, (ToolkitFont) null, 34, 113, 21, -90, -26, 89, -84);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pj.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
