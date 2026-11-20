/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetShieldsDirectionalArcParticleSpeedDownshift extends ConsoleCommand {
    static ValidationState debouncingInput;
    static int field_q;
    static int blockedShipTeam;
    static String field_s;
    static String field_r;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          LogoMaterial.field_b = arguments[0].intValue(114);
          if (obfuscationGuard > -119) {
            field_s = (String) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tg.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static ToolkitFontMetrics a(int param0, ResourceArchive param1, String param2, String param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        ToolkitFontMetrics stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param1.fetchNamedFile(param3, true, param2);
          var4 = var5;
          if (var5 == null) {
            return null;
          }
          if (param0 != 14223) {
            field_r = (String) null;
          }
          stackIn_6_0 = new ToolkitFontMetrics(var5);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("tg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    SetShieldsDirectionalArcParticleSpeedDownshift(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, Widget param1, int param2) {
        PlayerContextMenu var12 = null;
        Sprite var13 = null;
        String var14 = null;
        PlayerContextMenu var15 = null;
        Sprite var16 = null;
        String var17 = null;
        PlayerContextMenu var18 = null;
        Sprite var19 = null;
        String var20 = null;
        PlayerContextMenu var21 = null;
        String var23 = null;
        PlayerContextMenu var24 = null;
        Sprite var25 = null;
        String var26 = null;
        PlayerContextMenu var27 = null;
        Sprite var28 = null;
        String var29 = null;
        PlayerContextMenu var30 = null;
        Sprite var31 = null;
        String var32 = null;
        PlayerContextMenu var33 = null;
        Sprite var34 = null;
        String var35 = null;
        PlayerContextMenu var36 = null;
        Sprite var37 = null;
        String var38 = null;
        PlayerContextMenu var39 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite var22 = null;
        Sprite var22Lifetime1;
        Sprite var22Lifetime2;
        Sprite var22Lifetime3;
        Sprite var22Lifetime4;
        Sprite var22Lifetime5;
        Sprite var22Lifetime6;
        try {
          PlayerContextMenus.prepareContextMenu(0L, param1, param2, (int[]) null, (String) null, (ScrollPaneWidget) null, (String) null, 80, -1);
          if (param2 == 0) {
            var12 = GetLagStandardDeviationOut.field_o;
            var13 = GetGrapplingHookAimspeed.field_o[0];
            var22 = var13;
            var22Lifetime2 = var13;
            var14 = GetSniperCannonProjectileLife.field_s;
            var12.menu.addItem(-1, 11, var13, var14);
            var15 = GetLagStandardDeviationOut.field_o;
            var16 = GetGrapplingHookAimspeed.field_o[1];
            var22Lifetime3 = var16;
            var22Lifetime4 = var16;
            var17 = GetMissilesHitSourceTeam.field_p;
            var15.menu.addItem(-1, 12, var16, var17);
            var18 = GetLagStandardDeviationOut.field_o;
            var19 = GetGrapplingHookAimspeed.field_o[2];
            var22Lifetime5 = var19;
            var22Lifetime6 = var19;
            var20 = FullscreenConfirmationDialog.field_M;
            var18.menu.addItem(-1, 13, var19, var20);
          }
          if (param2 == 1) {
            var21 = GetLagStandardDeviationOut.field_o;
            var22Lifetime1 = GetGrapplingHookAimspeed.field_o[0];
            var23 = SetBurstFireMaxEnergy.field_p;
            var21.menu.addItem(-1, 11, var22Lifetime1, var23);
            var24 = GetLagStandardDeviationOut.field_o;
            var25 = GetGrapplingHookAimspeed.field_o[1];
            var26 = GetPointDefenceLaserEnergyUsed.field_o;
            var24.menu.addItem(-1, 12, var25, var26);
            var27 = GetLagStandardDeviationOut.field_o;
            var28 = GetGrapplingHookAimspeed.field_o[2];
            var29 = PasswordValidator.field_j;
            var27.menu.addItem(-1, 13, var28, var29);
          }
          if (2 == param2) {
            var30 = GetLagStandardDeviationOut.field_o;
            var31 = GetGrapplingHookAimspeed.field_o[0];
            var32 = SetMassDriverReload.field_o;
            var30.menu.addItem(-1, 11, var31, var32);
            var33 = GetLagStandardDeviationOut.field_o;
            var34 = GetGrapplingHookAimspeed.field_o[1];
            var35 = GetCountermeasureLauncherEnergyUsed.field_p;
            var33.menu.addItem(-1, 12, var34, var35);
            var36 = GetLagStandardDeviationOut.field_o;
            var37 = GetGrapplingHookAimspeed.field_o[2];
            var38 = SetMissionDebrisVotingChancestep.field_o;
            var36.menu.addItem(-1, 13, var37, var38);
          }
          if (param0 < 35) {
            blockedShipTeam = -28;
          }
          var39 = GetLagStandardDeviationOut.field_o;
          var4 = param1.screenX;
          var5 = param1.screenY;
          var6 = param1.width;
          var7 = param1.height;
          var39.menu.layoutPopup(var4, -29060, var5, var6, var7);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "tg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_s = null;
        if (param0 != -32514) {
          blockedShipTeam = 71;
          debouncingInput = null;
          field_r = null;
          return;
        }
        debouncingInput = null;
        field_r = null;
    }

    static {
        debouncingInput = new ValidationState();
        field_s = "Activate self destruct";
        field_r = "Report abuse";
    }
}
