/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetPedrosRepairModeSwitchtime extends ConsoleCommand {
    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(32, 62, arguments[0].intValue(109));
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ria.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void openServerList(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException var2_ref = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
              param1.getAppletContext().showDocument(OpenGlModel.updateUrlSessionSettings(var2, (byte) 118, param1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = (Exception) (Object) decompiledCaughtException;
              var2_ref2.printStackTrace();
            }
            if (param0 == 32) {
              return;
            }
            SetPedrosRepairModeSwitchtime.drawQuickChatMenu((byte) -84);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("ria.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void drawQuickChatMenu(byte param0) {
        if (param0 > 6) {
          if (LegacyOpenGlTurbulenceEffect.quickChatMenuOpen) {
            SoftwareRasterizer2D.darkenRectangle(SoftwareRasterizer2D.clipLeft, SoftwareRasterizer2D.clipTop, -SoftwareRasterizer2D.clipLeft + SoftwareRasterizer2D.clipRight, -SoftwareRasterizer2D.clipTop + SoftwareRasterizer2D.clipBottom);
            GetGrapplingHookFireForce.quickChatMenuRoot.draw(false, -111);
          }
          return;
        }
        SetPedrosRepairModeSwitchtime.getKeyboardIdleTicks(76);
        if (LegacyOpenGlTurbulenceEffect.quickChatMenuOpen) {
          SoftwareRasterizer2D.darkenRectangle(SoftwareRasterizer2D.clipLeft, SoftwareRasterizer2D.clipTop, -SoftwareRasterizer2D.clipLeft + SoftwareRasterizer2D.clipRight, -SoftwareRasterizer2D.clipTop + SoftwareRasterizer2D.clipBottom);
          GetGrapplingHookFireForce.quickChatMenuRoot.draw(false, -111);
        }
    }

    final static int getKeyboardIdleTicks(int param0) {
        if (param0 != 32) {
          SetPedrosRepairModeSwitchtime.getKeyboardIdleTicks(9);
          return GetUseCircleOutline.keyboardIdleTicks;
        }
        return GetUseCircleOutline.keyboardIdleTicks;
    }

    SetPedrosRepairModeSwitchtime(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
