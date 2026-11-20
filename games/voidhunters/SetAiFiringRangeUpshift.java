/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetAiFiringRangeUpshift extends ConsoleCommand {
    static int field_p;
    static LoginForm field_o;

    public static void clearSharedReferences(int param0) {
        if (param0 != 26468) {
          return;
        }
        field_o = null;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(192, 62, arguments[0].intValue(85));
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
          stackIn_7_1 = new StringBuilder().append("jt.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetAiFiringRangeUpshift(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void drawSkinnedPanelBackground(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        ToolkitSprite var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ToolkitSprite var14 = null;
        ToolkitSprite var15 = null;
        ToolkitSprite var16 = null;
        ToolkitSprite var17 = null;
        ToolkitSprite var18 = null;
        ToolkitSprite var19 = null;
        ToolkitSprite var20 = null;
        ToolkitSprite var21 = null;
        int var7 = -51 % ((-20 - param3) / 43);
        if (!OpenGlTexture1D.field_i) {
          GetMachineGunPulsetime.fillRectangle(3377322, -77, param1, param0, param2, param6);
          UiToggleButtonRenderer.drawRectangle(116, param6, param2, param0, 16777215, param1);
        } else {
          var8 = OpenGlVertexNormal.field_d[param4];
          var9 = var8.getWidth();
          var10 = var8.getHeight();
          var11 = 16777215 | param5 << 24;
          var12 = 0;
          var13 = 1;
          var8.draw(param6, param0, var12, var11, var13);
          var14 = OpenGlVertexNormal.field_d[param4 + 1];
          var14.drawTiled(param6 + var9, param0, param1 - (var9 << 1), var10, var12, var11, var13);
          var15 = OpenGlVertexNormal.field_d[2 + param4];
          var15.draw(param1 + (param6 - var9), param0, var12, var11, var13);
          var16 = OpenGlVertexNormal.field_d[3 + param4];
          var16.drawTiled(param6, param0 + var10, var9, param2 - (var10 << 1), var12, var11, var13);
          var17 = OpenGlVertexNormal.field_d[4 + param4];
          var17.drawTiled(var9 + param6, param0 + var10, param1 - (var9 << 1), -(var10 << 1) + param2, var12, var11, var13);
          var18 = OpenGlVertexNormal.field_d[param4 + 5];
          var18.drawTiled(-var9 + param1 + param6, param0 + var10, var9, -(var10 << 1) + param2, var12, var11, var13);
          var19 = OpenGlVertexNormal.field_d[param4 + 6];
          var19.draw(param6, param2 + param0 - var10, var12, var11, var13);
          var20 = OpenGlVertexNormal.field_d[7 + param4];
          var20.drawTiled(param6 + var9, -var10 + param0 + param2, param1 - (var9 << 1), var10, var12, var11, var13);
          var21 = OpenGlVertexNormal.field_d[param4 + 8];
          var21.draw(param6 - (-param1 + var9), param0 + (param2 - var10), var12, var11, var13);
        }
    }

    static {
        field_p = 50;
    }
}
