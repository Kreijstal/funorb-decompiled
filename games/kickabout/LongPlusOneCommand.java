/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LongPlusOneCommand extends ConsoleCommand {
    static int[] field_B;
    static UiLayoutNode field_D;
    static String field_A;

    public static void releaseStatics(int param0) {
        field_B = null;
        field_A = null;
        if (param0 == 1) {
          field_D = null;
          return;
        }
        CommonGame var2 = (CommonGame) null;
        LongPlusOneCommand.drawGoalkeeperDiagnostics((CommonGame) null, 1, -15);
        field_D = null;
    }

    final static String getCurrentLoginPassword(int param0) {
        if (PlayerModelPreview.field_f == ClubStateFactory.field_f) {
          return AccountRegistrationResponse.field_i;
        }
        if (param0 != 10326) {
          LongPlusOneCommand.getCurrentLoginPassword(113);
          return NetworkGameClient.field_y;
        }
        return NetworkGameClient.field_y;
    }

    final ConsoleValue execute(byte param0, ConsoleValue[] param1) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 84) {
            stackIn_4_0 = new ConsoleValue(DiagnosticsOverlaySupport.increment(param1[0].asLong(true), -126));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ev.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    LongPlusOneCommand(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void drawGoalkeeperDiagnostics(CommonGame param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        FootballerAgent var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = Kickabout.field_G;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var15Lifetime1;
        int var16Lifetime1;
        SocialPlayerRow.computeGoalkeeperTarget(param2, 0, param0.field_V);
        int var3_int = SocialListLayoutSupport.worldToScreenX(0, param0.field_V.pixelX(true));
        int var4 = IntKeyLookup.projectPitchY((byte) -110, param0.field_V.pixelY(879306160));
        SoftwareRasterizer.drawLineBlendedInclusive(var3_int, var4, SocialListLayoutSupport.worldToScreenX(0, TriangleMesh.field_B[0]), IntKeyLookup.projectPitchY((byte) -70, FootballerAiOverlaySupport.field_a[0]), 16777215, 64);
        SoftwareRasterizer.drawLineBlendedInclusive(var3_int, var4, SocialListLayoutSupport.worldToScreenX(0, TriangleMesh.field_B[1]), IntKeyLookup.projectPitchY((byte) -68, FootballerAiOverlaySupport.field_a[1]), 16777215, 64);
        SoftwareRasterizer.drawLine(SocialListLayoutSupport.worldToScreenX(0, TriangleMesh.field_B[0]), IntKeyLookup.projectPitchY((byte) -92, FootballerAiOverlaySupport.field_a[0]), SocialListLayoutSupport.worldToScreenX(0, TriangleMesh.field_B[1]), IntKeyLookup.projectPitchY((byte) -98, FootballerAiOverlaySupport.field_a[1]), 16777215);
        if (param1 <= 22) {
          return;
        }
        try {
          var5 = SocialListLayoutSupport.worldToScreenX(0, TrinketSlot.field_zb[0]);
          var6 = IntKeyLookup.projectPitchY((byte) -102, TrinketSlot.field_zb[1]);
          SoftwareRasterizer.drawLine(SocialListLayoutSupport.worldToScreenX(0, TriangleMesh.field_B[0] + TriangleMesh.field_B[1] >> 1), IntKeyLookup.projectPitchY((byte) -86, FootballerAiOverlaySupport.field_a[0] + FootballerAiOverlaySupport.field_a[1] >> 1), var5, var6, 16777215);
          SoftwareRasterizer.drawLine(-4 + var5, var6 - 4, var5 + 4, 4 + var6, 16776960);
          SoftwareRasterizer.drawLine(var5 - 4, var6 + 4, var5 + 4, var6 - 4, 16776960);
          var7 = param0.field_P[param2][0];
          SoftwareRasterizer.drawHorizontalLineAlpha(SocialListLayoutSupport.worldToScreenX(0, 372), IntKeyLookup.projectPitchY((byte) -110, var7.pixelY(true)), SocialListLayoutSupport.worldToScreenX(0, 523) - SocialListLayoutSupport.worldToScreenX(0, 372), 16776960, 128);
          var8 = 4474111;
          var9 = var7.pixelX(-105) - param0.field_V.pixelX(true);
          var10 = var7.pixelY(true) - param0.field_V.pixelY(879306160);
          var11 = GameSoundEffect.keeperReach(var7, 170);
          if (var11 * var11 > var10 * var10 + var9 * var9) {
            var8 = 16711680;
          }
          var12 = var11 * InstrumentNoteMask.field_i >> 8;
          SoftwareRasterizer.drawCircle(SocialListLayoutSupport.worldToScreenX(0, var7.pixelX(-101)), IntKeyLookup.projectPitchY((byte) -125, var7.pixelY(true)), var12, var8);
          var12Lifetime1 = 28 * InstrumentNoteMask.field_i >> 8;
          SoftwareRasterizer.drawCircle(SocialListLayoutSupport.worldToScreenX(0, var7.pixelX(-120)), IntKeyLookup.projectPitchY((byte) -64, var7.pixelY(true)), var12Lifetime1, 16777215);
          var12Lifetime2 = 250 * InstrumentNoteMask.field_i >> 8;
          var13 = 0 == param2 ? 1344 : 0;
          var9Lifetime1 = -param0.field_V.pixelX(true) + 448;
          var10Lifetime1 = -param0.field_V.pixelY(879306160) + var13;
          var14 = 3407616;
          if (var9Lifetime1 * var9Lifetime1 + var10Lifetime1 * var10Lifetime1 < 62500) {
            var14 = 16711680;
          }
          SoftwareRasterizer.drawCircle(SocialListLayoutSupport.worldToScreenX(0, 448), IntKeyLookup.projectPitchY((byte) -65, var13), var12Lifetime2, var14);
          if (-1 == param0.field_V.possessorTeam) {
            if (param0.field_V.velocityY == 0) {
            } else {
              if (param2 != 1) {
                var15 = (-param0.field_V.positionY + 88080384) / param0.field_V.velocityY;
              } else {
                var15 = -param0.field_V.positionY / param0.field_V.velocityY;
              }
              if (var15 > 0 &&
                20 > var15) {
                var16 = param0.field_V.positionX + var15 * param0.field_V.velocityX >> 16;
                if (param2 != 1) {
                  SoftwareRasterizer.drawVerticalLine(SocialListLayoutSupport.worldToScreenX(0, var16) - 10, IntKeyLookup.projectPitchY((byte) -126, 1344), 20, 16776960);
                } else {
                  SoftwareRasterizer.drawVerticalLine(-10 + SocialListLayoutSupport.worldToScreenX(0, var16), IntKeyLookup.projectPitchY((byte) -118, 0), 20, 16711935);
                }
              }
            }
          }
          var15Lifetime1 = SocialListLayoutSupport.worldToScreenX(0, var7.pixelX(-116));
          var16Lifetime1 = IntKeyLookup.projectPitchY((byte) -82, var7.pixelY(true));
          SoftwareRasterizer.fillRectangleAlpha(var15Lifetime1 - 50, -6 + var16Lifetime1, 100, 12, 65793, 208);
          ConsoleTokenCursor.field_d.drawCentered("DMG=" + var7.field_o + "  A=" + var7.action + "  T=" + var7.actionTime, var15Lifetime1, var16Lifetime1 + 4, 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ev.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        field_B = new int[32];
        for (var0 = 0; var0 < 16; var0++) {
          for (var1 = 0; var1 < 2; var1++) {
            var2 = var0 << 2;
            var3 = 7;
            var4 = 0 == var1 ? 10 : 50;
            if (var0 == 15) {
              var3 = 0;
              var4 = var1 * 123 + 1;
              var2 = 0;
            }
            if (var0 == 14) {
              var2 = 0;
              var4 = 20 + 20 * var1;
              var3 = 0;
            }
            field_B[var0 + 16 * var1] = PainterStyle.bitwiseOr(PainterStyle.bitwiseOr(var3 << 7, var2 << 10), var4);
          }
        }
        field_A = "Passwords must be between 5 and 20 letters and numbers";
    }
}
