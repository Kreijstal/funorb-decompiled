/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetShowTutorial extends ConsoleCommand {
    static boolean field_o;
    static LoginMethod field_p;

    SetShowTutorial(String param0, Class[] param1, String param2) {
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
          SetUseExtraBackground.showTutorial = arguments[0].booleanValue(false);
          if (obfuscationGuard > -119) {
            field_o = true;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hha.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 0) {
          return;
        }
        field_p = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 == 255) {
          DelayedPacket.drawLine(param5, param2, param0, param3, -16777216, param4);
          return;
        }
        if (param1 != 66) {
          SetShowTutorial.a(38, (byte) -85, -31, 24, 124, 91, -113);
          if (OpenGlTexture1D.field_i) {
            SetMassDriverProjectileLife.a(param6 << 24 | param4, (byte) 73, param3, param0, param5, param2);
            return;
          }
          SoftwareRasterizer2D.drawLineAlpha(param0, param3, param2, param5, param4, param6);
          return;
        }
        if (OpenGlTexture1D.field_i) {
          SetMassDriverProjectileLife.a(param6 << 24 | param4, (byte) 73, param3, param0, param5, param2);
          return;
        }
        SoftwareRasterizer2D.drawLineAlpha(param0, param3, param2, param5, param4, param6);
    }

    static {
        field_p = new LoginMethod("usename");
    }
}
