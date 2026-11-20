/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GameSession {
    private int[] playerChatTimers;
    private int radialMenuY;
    private int hoveredVoteOptionId;
    private int[] lastPlayerShipY;
    private int[] voteHighlightAlphas;
    private int debugOrderCategory;
    private int pendingSpecialOrderId;
    private int field_k;
    private boolean[] previousKeyStates;
    private int field_u;
    private boolean field_x;
    private npb field_K;
    private int field_U;
    private boolean blueprintOverwritePending;
    private TimingGraph updateTimingGraph;
    private int field_Q;
    private boolean fireHeld;
    boolean field_h;
    private int blueprintSaveStatus;
    private int field_R;
    private int[] lastPlayerShipX;
    private int blueprintSaveTick;
    private int blueprintSizeBytes;
    private boolean scoreboardVisible;
    private boolean field_ab;
    int localPlayerIndex;
    private boolean specialOrderActivated;
    private boolean field_X;
    boolean networked;
    private int field_r;
    private int radialMenuAlpha;
    private Ship field_W;
    private int[] playerChatOffsets;
    int field_B;
    static String field_D;
    private boolean radialMenuActive;
    private int field_o;
    private float manualZoomScale;
    private int activeSpecialOrderId;
    CommonGameState state;
    private TutorialController tutorialController;
    private int field_J;
    private int radialMenuX;
    private boolean autoZoomHeld;
    private int autoZoomTicks;
    private boolean uiBlocksWorldInput;
    private IntrusiveDeque specialOrderStatuses;
    private int lastEnemyShipSpawnTick;
    private int field_i;
    private int[] repairTargetPaths;
    private IntrusiveDeque specialOrderButtons;
    private TimingGraph renderTimingGraph;
    private int hoveredRespawnOption;

    private final Ship prepareInspectionShip(int param0, Ship param1, int param2, int param3) {
        Ship var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Ship stackIn_2_0 = null;
        Ship stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -11788) {
            stackIn_2_0 = (Ship) null;
            return stackIn_2_0;
          }
          if (1 == fra.field_a) {
            var5 = new Ship();
            param1.copyTo((byte) 61, var5);
            var5.aimAt(param2 ^ 11893, param0, param3);
            var6 = var5.getX(false) - var5.getCenterOfMassOffsetX(995401160);
            var7 = var5.getY((byte) -54) - var5.getCenterOfMassOffsetY((byte) 5);
            var5.chassis.updateWorldTransforms(true, var6, var7, var5.getAngle(0), 0, var5.getBoundingbox((byte) -55));
            param1 = var5;
          }
          stackIn_6_0 = (Ship) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_9_0 = var5_ref;
          stackIn_9_1 = new StringBuilder().append("uca.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void updateBlueprintSize(byte param0, Ship param1) {
        RuntimeException runtimeException = null;
        int[] var3 = null;
        ShipBlueprint var4 = null;
        int[] var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 108) {
            this.playerChatTimers = (int[]) null;
          }
          if (param1 != null &&
            param1.chassis != null &&
            this.blueprintSaveTick <= -Particle.field_d + SetMinimapWidth.field_o) {
            var5 = SetOndamageParticleLife.encodeComponentWords(param1.chassis, -115);
            var3 = var5;
            var4 = new ShipBlueprint();
            var4.description = var5;
            this.blueprintSizeBytes = (var4.getEncodedBitLength((byte) 115) + 7) / 8;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("uca.HD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean clearFogCircle(int param0, int param1, int param2, byte param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var11 = VoidHunters.field_G;
        var6 = TextLayout.approximateVectorLength(param1, (byte) 111, param4);
        var9 = -92 % ((param3 - 66) / 48);
        var7 = TextLayout.approximateVectorLength(-param1 + PartitionZoneFactory.field_a, (byte) 114, param4);
        var8 = TextLayout.approximateVectorLength(param1, (byte) 108, -param4 + MissionVariableFactory.field_a);
        var10 = TextLayout.approximateVectorLength(PartitionZoneFactory.field_a - param1, (byte) 107, MissionVariableFactory.field_a - param4);
        if (param2 > var6 &&
          var7 < param2 &&
          var8 < param2 &&
          param2 > var10) {
          LegacyOpenGlWaterTextures.fillRectangle(0, MissionVariableFactory.field_a, 17634, 0, 0, PartitionZoneFactory.field_a);
          return true;
        }
        if (param2 > 20000) {
          return false;
        }
        if (!OpenGlTexture1D.field_i) {
          SoftwareRasterizer2D.fillCircle(param1, param4, param2, 0);
        } else {
          GetDebrisGroupColour.field_r.fillCircle(param1, param4, param2, 0, 0);
        }
        return false;
    }

    private final String[] removeNullStrings(byte param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var6 = 0;
        String[] stackIn_17_0 = null;
        String[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_intLifetime1;
        var6 = VoidHunters.field_G;
        try {
          var3_int = 0;
          for (var4_int = 0; param1.length > var4_int; var4_int++) {
            if (param1[var4_int] != null) {
              var3_int++;
            }
          }
          if (param0 != -15) {
            this.field_o = -8;
          }
          if (param1.length == var3_int) {
            stackIn_19_0 = (String[]) (param1);
            return stackIn_19_0;
          }
          var4 = new String[var3_int];
          var3_intLifetime1 = 0;
          for (var5 = 0; var5 < param1.length; var5++) {
            if (null != param1[var5]) {
              incrementValue$1 = var3_intLifetime1;
              var3_intLifetime1++;
              var4[incrementValue$1] = param1[var5];
            }
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("uca.RB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void drawCarouselDebug(int param0) {
        int discarded$0 = 0;
        int var16_int = 0;
        StringBuilder stackIn_24_0 = null;
        String stackIn_25_1 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        IntrusiveDeque var16;
        Object var17;
        PlayerAction var17_ref;
        int var17_int;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        var17 = null;
        var22 = VoidHunters.field_G;
        var2 = 100;
        var3 = 15;
        var4 = this.state.carouselInfo.tick;
        var5 = this.state.carouselInfo.ticksBehind;
        var6 = FlipTextureOperation.field_l.getPingMillis(0);
        SetSelfDestructPrepareToggleCooldown.a(var2, -1, var3, "Tick=" + var4 + ", ticksbehind=" + var5 + ", lag=" + var6, 3, 16711935, (byte) -121);
        var7 = this.state.carouselInfo.getHistoryLength((byte) 110);
        var8 = -var7 + var4;
        var9 = var7 + var4;
        var10 = 3;
        var11 = 12;
        var12 = var2;
        if (param0 >= -53) {
          discarded$0 = this.getPressedActionHotkey(82);
        }
        var13 = var3;
        var14 = -2 + var10;
        var15 = -2 + var11;
        for (var16_int = var8; var9 > var16_int; var16_int++) {
          UiToggleButtonRenderer.drawRectangle(112, var12, var11, var13, 5592405, var10);
          var17_int = 0;
          if (var16_int == var4) {
            var17_int = 16711680;
          }
          if (var17_int != 0) {
            GetMachineGunPulsetime.a(var17_int, -102, var14, 1 + var13, var15, var12 + 1);
          }
          var12 = var12 + (-1 + var10);
        }
        var16 = this.state.carouselInfo.events;
        var17_ref = (PlayerAction) (var16.first(0));
        while (var17_ref != null) {
          var18 = var17_ref.tick - var4;
          var19 = 65280;
          if (var17_ref.needsApplication((byte) 53)) {
            var19 = 16711935;
          }
          if (var17_ref.isSystemEvent(112)) {
            var19 = 255;
          }
          var20 = var18 * (-1 + var10) + var2 + 1 + (-1 + var10) * var7;
          var21 = var3 + 1;
          if (!var17_ref.isConfirmed(122)) {
            GetMachineGunPulsetime.a(16755200, -55, var14, var21, 4 + var15, var20);
          }
          GetMachineGunPulsetime.a(var19, -50, var14, var21, var15, var20);
          if (PlayerGameData.field_b >= var20 &&
            PlayerGameData.field_b <= var20 + var14 &&
            var21 <= uia.field_b &&
            uia.field_b <= var21 + var15) {
            stackIn_24_0 = new StringBuilder().append("tick=").append(var17_ref.tick).append(",player=").append(var17_ref.field_k).append(",mousex=").append(var17_ref.mousex).append(",y=").append(var17_ref.mousey).append(",triggers=").append(var17_ref.triggers).append(",specialorder=");
            if (var17_ref.specialOrderSubmessage != null) {
              stackIn_25_1 = "yes";
            } else {
              stackIn_25_1 = "no";
            }
            GetMassDriverReload.a(((StringBuilder) (Object) stackIn_24_0).append(stackIn_25_1).toString(), -101);
          }
          var17_ref = (PlayerAction) (var16.next((byte) 127));
        }
    }

    private final void drawDebugPolygons(byte param0) {
        boolean discarded$0 = false;
        int[][] var12 = null;
        int[][] var18 = null;
        int var3 = 0;
        int[] var16 = null;
        int[] var14 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = VoidHunters.field_G;
        if (param0 != 121) {
          GameSnapshot var11 = (GameSnapshot) null;
          discarded$0 = this.isFogOfWarActive((byte) 34, (GameSnapshot) null);
        }
        if (GetPointDefenceLaserProjectiles.a(2048, param0 + 11163)) {
          var12 = WorldDebugArrow.debugPolygons;
          var18 = var12;
          if (var12 != null) {
            for (var3 = 0; var3 < var18.length; var3++) {
              var16 = var18[var3];
              var14 = var16;
              var4 = var14;
              for (var5 = 0; var5 < var16.length; var5 += 2) {
                var6 = var16[var5];
                var7 = var4[var5 + 1];
                var8 = var4[(2 + var5) % var16.length];
                var9 = var4[(var5 + 3) % var16.length];
                DelayedPacket.drawLine(ShipTeamConditionFactory.field_a.worldToScreenY(true, var9), ShipTeamConditionFactory.field_a.worldToScreenX(var8, (byte) 121), ShipTeamConditionFactory.field_a.worldToScreenX(var6, (byte) 120), ShipTeamConditionFactory.field_a.worldToScreenY(true, var7), -16777216, 16777215);
                SetMissileLauncherEnergyUsed.a(16711680, (byte) 7, ShipTeamConditionFactory.field_a.worldToScreenY(true, var7), (float)(int)(ShipTeamConditionFactory.field_a.scale * 16384.0f), 100, ShipTeamConditionFactory.field_a.worldToScreenX(var6, (byte) 115));
              }
            }
          }
        }
    }

    private final void saveShipBlueprint(Ship param0, int param1) {
        RuntimeException runtimeException = null;
        int[] var3 = null;
        ShipBlueprint var4 = null;
        int[] var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            null != param0.chassis &&
            this.blueprintSaveTick <= SetMinimapWidth.field_o - Particle.field_d) {
            GetDebrisThrowable.a(false, "Saving ship blueprint...");
            var5 = SetOndamageParticleLife.encodeComponentWords(param0.chassis, -126);
            var3 = var5;
            if (param1 >= -34) {
              return;
            }
            var4 = new ShipBlueprint();
            var4.description = var5;
            GetLaserRandomness.a((byte) 103, var4);
            this.blueprintSizeBytes = IntrusiveNode.a((byte) -6).payload.length;
            if (this.blueprintSizeBytes <= 192) {
              this.blueprintSaveStatus = 0;
              if (es.field_b == null) {
                es.field_b = new PlayerGameData();
              }
              es.field_b.blueprint = var4;
              if (!ModelFaceAttachment.a(false)) {
                GetMissionResnetResourceTickTime.savePlayerGameData((byte) -39);
              }
            } else {
              this.blueprintSaveStatus = 1;
            }
            this.blueprintSaveTick = SetMinimapWidth.field_o;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_17_0 = runtimeException;
          stackIn_17_1 = new StringBuilder().append("uca.U(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawLobbyGameEntries(int param0) {
        int var5 = 0;
        int var2;
        ToolkitRasterStateStack var3;
        int var4;
        LobbyGameEntry var6;
        int var8;
        int var7;
        var8 = VoidHunters.field_G;
        var2 = 97 / ((param0 - 43) / 43);
        if (!this.networked &&
          GraphicsPresentException.field_a) {
          var3 = ToolkitRasterStateCache.getStateStack(GetDebrisGroupColour.field_r, true);
          var4 = 30;
          for (var5 = 0; var5 < 100; var5++) {
            var6 = UnderlinedLinkRenderer.getLobbyGameById(var5, 1);
            if (var6 != null &&
              var6.field_ac) {
              var7 = this.drawLobbyGameEntry(var3, (byte) -107, var4, var6);
              var4 = var4 + var7;
            }
          }
        }
    }

    private final int getPressedActionHotkey(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = VoidHunters.field_G;
        var2 = 0;
        if (param0 < 32) {
          return 38;
        }
        while (GameSnapshotFactory.field_a.length > var2) {
          var3 = GameSnapshotFactory.field_a[var2];
          var4 = 0;
          if (SetMachineGunEnergyUsed.field_o[81]) {
            var4 = 10;
          }
          if (SetMachineGunEnergyUsed.field_o[82]) {
            var4 = 20;
          }
          if (SetMachineGunEnergyUsed.field_o[var3] &&
            !this.previousKeyStates[var3]) {
            return var2 + var4;
          }
          var2++;
        }
        return -1;
    }

    private final void handleSpecialOrderPointer(SpecialOrderButtonState param0, boolean param1, Ship param2, int param3, boolean param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (!param4) {
            if (1 == SetDebrisPartitioned.field_o &&
              PacketBuffer.field_g == 1) {
              if (this.pendingSpecialOrderId == -1 &&
                param1) {
                this.pendingSpecialOrderId = param0.specialOrderId;
                this.radialMenuActive = false;
              } else {
                this.pendingSpecialOrderId = -1;
              }
            }
          } else {
            if (param0.specialOrderId == 8 &&
              param2.getSelfDestructPrepared((byte) -91)) {
              GetMassDriverReload.a(SecondaryNodeDequeIterator.field_c, param3 - 208);
            } else {
              GetMassDriverReload.a(GetGrapplingHookSpringConstant.specialOrderLabels[param0.specialOrderId], -51);
            }
          }
          if (param3 != 80) {
            this.field_Q = 75;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("uca.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int calculateScaledEdgeFadeAlpha(int param0, int param1, int param2, int param3) {
        int var5 = this.calculateEdgeFadeAlpha(param1, param2, -124, param0);
        if (param3 != -8464) {
          return 71;
        }
        int var6 = (MissionVariableFactory.field_a + 100) * var5 >> 9;
        return var6;
    }

    private final void fillRadialSegment(int param0, int param1, int param2, int param3, int param4, int param5) {
        boolean discarded$0 = false;
        param1 = param1 & 16777215;
        int[] var9 = this.buildRadialSegmentPolygon(param5, param2, param0, (byte) -118);
        int[] var7 = var9;
        if (param3 >= -40) {
          GameSnapshot var8 = (GameSnapshot) null;
          discarded$0 = this.updateDebugOrderMenu((GameSnapshot) null, false, false);
        }
        ToolkitPolygonRasterizer.fillPolygon(GetDebrisGroupColour.field_r, var9, param4 << 24 | param1);
    }

    private final void drawFogOfWar(Ship param0, int param1, GameSnapshot param2, boolean param3) {
        int stackIn_4_0 = 0;
        int stackIn_85_0 = 0;
        Object stackIn_99_0 = null;
        ResourceNode stackIn_99_1 = null;
        int stackIn_105_0 = 0;
        int stackIn_131_0 = 0;
        Ship stackIn_144_0 = null;
        RuntimeException stackIn_155_0 = null;
        StringBuilder stackIn_155_1 = null;
        String stackIn_156_2 = null;
        StringBuilder stackIn_158_1 = null;
        String stackIn_159_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Ship[] var9_ref_sg__ = null;
        int var9 = 0;
        EscapePod[] var10_ref_it__ = null;
        int var10 = 0;
        int var11 = 0;
        ResourceNode[] var11_ref_rba__ = null;
        int var12 = 0;
        ResourceNode[] var12_ref_rba__ = null;
        EscapePod var13_ref_it = null;
        int var13 = 0;
        int var14 = 0;
        ResourceNode var14_ref_rba = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Ship[] var20 = null;
        Ship var21 = null;
        EscapePod[] var22 = null;
        ResourceNode[] var23 = null;
        ResourceNode var24 = null;
        Ship[] var25 = null;
        Ship var26 = null;
        EscapePod[] var29 = null;
        EscapePod var30 = null;
        ResourceNode[] var12_ref_rba__Lifetime1;
        ResourceNode var14_ref_rbaLifetime1;
        Ship var26Lifetime1;
        Ship var26Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var11Lifetime2;
        int var12Lifetime2;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var16Lifetime2Lifetime1;
        int var17Lifetime2Lifetime1;
        var19 = VoidHunters.field_G;
        try {
          var5_int = OpenGlTexture1D.field_i ? 1 : 0;
          stackIn_4_0 = (!jw.field_c) ? 0 : 1;
          var6 = stackIn_4_0;
          if (OpenGlTexture1D.field_i &&
            !GetWorldWidthUpshift.a(param1 + 15684)) {
            var6 = 1;
          }
          if (var6 == 0) {
            OpenGlTexture1D.field_i = false;
          }
          if (!OpenGlTexture1D.field_i && (null == OpenGlTransform3D.field_m ||
            OpenGlTransform3D.field_m.width != PartitionZoneFactory.field_a ||
            OpenGlTransform3D.field_m.height != MissionVariableFactory.field_a)) {
            GetDebrisThrowable.a(false, "Creating a new g1 fog of war sprite");
            OpenGlTransform3D.field_m = (Sprite) ((Object) new ArgbSprite(PartitionZoneFactory.field_a, MissionVariableFactory.field_a));
            if (var6 != 0) {
              GetGrapplingHooksDamageableBySourcePlayer.field_p = null;
            }
          }
          if ((OpenGlTexture1D.field_i ||
            var6 == 0) &&
            (GetGrapplingHooksDamageableBySourcePlayer.field_p == null ||
            GetGrapplingHooksDamageableBySourcePlayer.field_p.getPaddedWidth() != PartitionZoneFactory.field_a ||
            GetGrapplingHooksDamageableBySourcePlayer.field_p.getPaddedHeight() != MissionVariableFactory.field_a)) {
            GetDebrisThrowable.a(false, "Creating a new g2 fog of war sprite");
            GetGrapplingHooksDamageableBySourcePlayer.field_p = null;
            if (var6 != 0) {
              OpenGlTransform3D.field_m = null;
            }
            GetGrapplingHooksDamageableBySourcePlayer.field_p = GetDebrisGroupColour.field_r.createSprite(PartitionZoneFactory.field_a, MissionVariableFactory.field_a, true);
            if (var6 == 0) {
              GetDebrisThrowable.a(false, "Setting area");
              GetDebrisGroupColour.field_r.writePixels(0, 0, 1, 1, new int[]{1}, 0, 1);
            }
            GetDebrisThrowable.a(false, "Done");
          }
          regionExit1: {
            if (param3) {
              var7 = 0;
              if (!OpenGlTexture1D.field_i) {
                SetTorpedoEnergyUsed.a(107, OpenGlTransform3D.field_m);
                SoftwareRasterizer2D.fillRectangle(0, 0, PartitionZoneFactory.field_a, MissionVariableFactory.field_a, -1442840576);
              } else {
                SetUseBackground.field_o.pushRenderTarget(GetGrapplingHooksDamageableBySourcePlayer.field_p, 0);
                GetDebrisGroupColour.field_r.clearColor(-1442840576);
              }
              if (0 <= this.localPlayerIndex) {
                var8 = this.getLocalTeam((byte) -109);
                var9_ref_sg__ = param2.world.getShips(param1 + 16614);
                var20 = var9_ref_sg__;
                for (var11 = 0; var11 < var20.length; var11++) {
                  var21 = var20[var11];
                  var26 = var21;
                  var26Lifetime2 = var21;
                  if (var21 != null &&
                    var8 == var21.getTeam((byte) 121) &&
                    var21.canSpawnEscapePod(param1 ^ -15491) && (var8 != ToolkitRasterState.field_c ||
                    var21 == param0)) {
                    var13 = ShipTeamConditionFactory.field_a.worldToScreenX(var21.getX(false), (byte) 119);
                    var14 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var21.getY((byte) -118));
                    var15 = (int)((float)GetUseNiceTrails.fogOfWarSensorRange * ShipTeamConditionFactory.field_a.scale);
                    this.drawRangeCircle(var14, (byte) 66, var13, var15);
                  }
                }
                var10_ref_it__ = param2.world.getEscapePods(param1 + 15614);
                if (var10_ref_it__ != null) {
                  var22 = var10_ref_it__;
                  for (var12 = 0; var12 < var22.length; var12++) {
                    var13_ref_it = var22[var12];
                    if (var8 == var13_ref_it.team) {
                      var14Lifetime2 = ShipTeamConditionFactory.field_a.worldToScreenX(var13_ref_it.x, (byte) 123);
                      var15Lifetime2 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var13_ref_it.y);
                      var16 = (int)(ShipTeamConditionFactory.field_a.scale * (float)GetUseNiceTrails.fogOfWarSensorRange);
                      var17 = var13_ref_it.hyperdriveTimer * var16 / (3 * Particle.field_l);
                      this.drawRangeCircle(var15Lifetime2, (byte) -7, var14Lifetime2, var17);
                    }
                  }
                }
                var11_ref_rba__ = param2.world.getResNodes(1);
                if (var11_ref_rba__ != null) {
                  var23 = var11_ref_rba__;
                  var12_ref_rba__ = var23;
                  for (var13Lifetime2 = 0; var23.length > var13Lifetime2; var13Lifetime2++) {
                    var24 = var23[var13Lifetime2];
                    var14_ref_rba = var24;
                    if (null != var24 &&
                      var8 == var24.team) {
                      var15Lifetime3 = ShipTeamConditionFactory.field_a.worldToScreenX(var24.x, (byte) 117);
                      var16Lifetime1 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var24.y);
                      var17Lifetime1 = (int)((float)GetUseNiceTrails.fogOfWarSensorRange * ShipTeamConditionFactory.field_a.scale);
                      this.drawRangeCircle(var16Lifetime1, (byte) -115, var15Lifetime3, var17Lifetime1);
                    }
                  }
                }
                var25 = var9_ref_sg__;
                var13Lifetime3 = 0;
                scanLoop2: while (true) {
                  regionExit3: {
                    if (var13Lifetime3 < var25.length) {
                      var26Lifetime1 = var25[var13Lifetime3];
                      if (var26Lifetime1 != null &&
                        var26Lifetime1.getTeam((byte) 90) == var8 &&
                        var26Lifetime1.canSpawnEscapePod(param1 + 15726) && (var8 != ToolkitRasterState.field_c ||
                        param0 == var26Lifetime1)) {
                        var15Lifetime4 = ShipTeamConditionFactory.field_a.worldToScreenX(var26Lifetime1.getX(false), (byte) 125);
                        var16Lifetime2 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var26Lifetime1.getY((byte) 127));
                        var17Lifetime2 = (int)(ShipTeamConditionFactory.field_a.scale * (float)GetUseNiceTrails.fogOfWarSensorRange);
                        stackIn_85_0 = (!this.clearFogCircle(255, var15Lifetime4, var17Lifetime2, (byte) -126, var16Lifetime2)) ? 0 : 1;
                        var7 = stackIn_85_0;
                        if (var7 != 0) {
                          break regionExit3;
                        }
                      }
                      var13Lifetime3++;
                      continue;
                    }
                  }
                  regionExit4: {
                    regionExit5: {
                      if (var11_ref_rba__ != null) {
                        if (var7 != 0) {
                          if (var10_ref_it__ == null) {
                            break;
                          }
                          if (OpenGlTexture1D.field_i) {
                            break regionExit5;
                          }
                          bia.popRasterState((byte) 124);
                          if ((var7 == 0)) {
                            if (var6 != 0) {
                              OpenGlTransform3D.field_m.draw(0, 0);
                            } else {
                              GetGrapplingHooksDamageableBySourcePlayer.field_p.writePixels(0, 0, OpenGlTransform3D.field_m.width, OpenGlTransform3D.field_m.height, OpenGlTransform3D.field_m.pixels, 0, OpenGlTransform3D.field_m.width);
                              GetGrapplingHooksDamageableBySourcePlayer.field_p.draw(0, 0);
                            }
                          }
                          break regionExit4;
                        }
                        var12_ref_rba__Lifetime1 = var11_ref_rba__;
                        for (var13Lifetime3 = 0; var13Lifetime3 < var12_ref_rba__Lifetime1.length; var13Lifetime3++) {
                          var14_ref_rbaLifetime1 = var12_ref_rba__Lifetime1[var13Lifetime3];
                          stackIn_99_0 = null;
                          stackIn_99_1 = var14_ref_rbaLifetime1;
                          if (stackIn_99_0 != stackIn_99_1 &&
                            var14_ref_rbaLifetime1.team == var8) {
                            var15Lifetime4 = ShipTeamConditionFactory.field_a.worldToScreenX(var14_ref_rbaLifetime1.x, (byte) 126);
                            var16Lifetime2Lifetime1 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var14_ref_rbaLifetime1.y);
                            var17Lifetime2Lifetime1 = (int)(ShipTeamConditionFactory.field_a.scale * (float)GetUseNiceTrails.fogOfWarSensorRange);
                            stackIn_105_0 = (!this.clearFogCircle(255, var15Lifetime4, var17Lifetime2Lifetime1, (byte) -40, var16Lifetime2Lifetime1)) ? 0 : 1;
                            var7 = stackIn_105_0;
                            if (var7 != 0) {
                              break;
                            }
                          }
                        }
                      }
                      if (var10_ref_it__ == null) {
                        break;
                      }
                      if (var7 == 0) {
                        var29 = var10_ref_it__;
                        for (var13Lifetime3 = 0; var13Lifetime3 < var29.length; var13Lifetime3++) {
                          var30 = var29[var13Lifetime3];
                          if (var8 == var30.team) {
                            var15Lifetime4 = ShipTeamConditionFactory.field_a.worldToScreenX(var30.x, (byte) 112);
                            var16Lifetime2Lifetime1 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var30.y);
                            var17Lifetime2Lifetime1 = (int)((float)GetUseNiceTrails.fogOfWarSensorRange * ShipTeamConditionFactory.field_a.scale);
                            var18 = var17Lifetime2Lifetime1 * var30.hyperdriveTimer / (3 * Particle.field_l);
                            stackIn_131_0 = (!this.clearFogCircle(var30.hyperdriveTimer, var15Lifetime4, var18, (byte) -101, var16Lifetime2Lifetime1)) ? 0 : 1;
                            var7 = stackIn_131_0;
                            if (var7 != 0) {
                              break scanLoop2;
                            }
                          }
                        }
                        break;
                      }
                      if (!OpenGlTexture1D.field_i) {
                        bia.popRasterState((byte) 124);
                        if ((var7 == 0)) {
                          if (var6 != 0) {
                            OpenGlTransform3D.field_m.draw(0, 0);
                          } else {
                            GetGrapplingHooksDamageableBySourcePlayer.field_p.writePixels(0, 0, OpenGlTransform3D.field_m.width, OpenGlTransform3D.field_m.height, OpenGlTransform3D.field_m.pixels, 0, OpenGlTransform3D.field_m.width);
                            GetGrapplingHooksDamageableBySourcePlayer.field_p.draw(0, 0);
                          }
                        }
                        break regionExit4;
                      }
                    }
                    SetUseBackground.field_o.pop(true);
                    if (var7 == 0) {
                      GetGrapplingHooksDamageableBySourcePlayer.field_p.draw(0, 0);
                    }
                  }
                  OpenGlTexture1D.field_i = var5_int != 0;
                  if (((null != this.tutorialController)) &&
                    ((param0 != null)) &&
                    (!(!this.tutorialController.isHintVisible(4, -53)))) {
                    var8 = ShipTeamConditionFactory.field_a.worldToScreenX(param0.getX(false), (byte) 114);
                    var9 = ShipTeamConditionFactory.field_a.worldToScreenY(true, param0.getY((byte) -121));
                    var10 = 1 + (int)(ShipTeamConditionFactory.field_a.scale * (float)GetUseNiceTrails.fogOfWarSensorRange);
                    var11Lifetime2 = SetMinimapWidth.field_o * 10 % 8192;
                    for (var12Lifetime2 = 0; var12Lifetime2 < 100; var12Lifetime2++) {
                      var13Lifetime3 = var11Lifetime2 + var12Lifetime2 * 8192 / 100;
                      var14Lifetime3 = var8 + (GetNumStars.cosAngle(var13Lifetime3, (byte) 118) * var10 >> 16);
                      var15Lifetime4 = (var10 * TextureLineShape.sinAngle(var13Lifetime3, 48) >> 16) + var9;
                      CachedArchiveProvider.a(128, false, var14Lifetime3, var15Lifetime4, 1, 1, 16777215);
                    }
                  }
                  break regionExit1;
                }
              }
              if (OpenGlTexture1D.field_i) {
                SetUseBackground.field_o.pop(true);
                if (var7 == 0) {
                  GetGrapplingHooksDamageableBySourcePlayer.field_p.draw(0, 0);
                }
              } else {
                bia.popRasterState((byte) 124);
                if (var7 == 0) {
                  if (var6 != 0) {
                    OpenGlTransform3D.field_m.draw(0, 0);
                  } else {
                    GetGrapplingHooksDamageableBySourcePlayer.field_p.writePixels(0, 0, OpenGlTransform3D.field_m.width, OpenGlTransform3D.field_m.height, OpenGlTransform3D.field_m.pixels, 0, OpenGlTransform3D.field_m.width);
                    GetGrapplingHooksDamageableBySourcePlayer.field_p.draw(0, 0);
                  }
                }
              }
              OpenGlTexture1D.field_i = var5_int != 0;
              if (null != this.tutorialController) {
                stackIn_144_0 = (Ship) (param0);
                if (stackIn_144_0 != null &&
                  this.tutorialController.isHintVisible(4, -53)) {
                  var8Lifetime1 = ShipTeamConditionFactory.field_a.worldToScreenX(param0.getX(false), (byte) 114);
                  var9Lifetime1 = ShipTeamConditionFactory.field_a.worldToScreenY(true, param0.getY((byte) -121));
                  var10Lifetime1 = 1 + (int)(ShipTeamConditionFactory.field_a.scale * (float)GetUseNiceTrails.fogOfWarSensorRange);
                  var11Lifetime1 = SetMinimapWidth.field_o * 10 % 8192;
                  for (var12Lifetime1 = 0; var12Lifetime1 < 100; var12Lifetime1++) {
                    var13Lifetime1 = var11Lifetime1 + var12Lifetime1 * 8192 / 100;
                    var14Lifetime1 = var8Lifetime1 + (GetNumStars.cosAngle(var13Lifetime1, (byte) 118) * var10Lifetime1 >> 16);
                    var15Lifetime1 = (var10Lifetime1 * TextureLineShape.sinAngle(var13Lifetime1, 48) >> 16) + var9Lifetime1;
                    CachedArchiveProvider.a(128, false, var14Lifetime1, var15Lifetime1, 1, 1, 16777215);
                  }
                }
              }
            }
          }
          if (param1 != -15614) {
            this.networked = false;
          }
          OpenGlTexture1D.field_i = var5_int != 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_155_0 = var5;
          stackIn_155_1 = new StringBuilder().append("uca.UC(");
          if (param0 == null) {
            stackIn_156_2 = "null";
          } else {
            stackIn_156_2 = "{...}";
          }
          stackIn_158_1 = ((StringBuilder) (Object) stackIn_155_1).append(stackIn_156_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_159_2 = "null";
          } else {
            stackIn_159_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_155_0), ((StringBuilder) (Object) stackIn_158_1).append(stackIn_159_2).append(',').append(param3).append(')').toString());
        }
    }

    final void renderSession(byte param0, boolean param1) {
        World stackIn_58_0 = null;
        Player stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        Ship stackIn_59_3;
        long var3;
        Ship[] var6;
        ResourceNode[] var7;
        EscapePod[] var8;
        Object var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        GameSnapshot var15;
        int var16;
        int var17;
        Object var18_ref;
        int var18;
        Player var18_ref_tfa;
        long var19;
        int var19_int;
        int var20_int;
        Ship var20;
        int var21;
        int var22;
        Transform3D var23;
        GameSnapshot var24;
        ToolkitSprite var25;
        Debris var26;
        int var13Lifetime1;
        int var14Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        var18_ref = null;
        var22 = VoidHunters.field_G;
        var3 = SetUseTriFill.field_o.nanoTime((byte) -110);
        PartitionZoneFactory.field_a = GetBombletSprayEnergyUsed.field_p.width;
        MissionVariableFactory.field_a = GetBombletSprayEnergyUsed.field_p.height;
        SetMassDriverReload.field_p = PartitionZoneFactory.field_a >> 1;
        GetLaserAimarc.field_q = MissionVariableFactory.field_a >> 1;
        ShipTeamConditionFactory.field_a.screenOriginY = GetLaserAimarc.field_q;
        ShipTeamConditionFactory.field_a.screenOriginX = SetMassDriverReload.field_p;
        if (!param1) {
          this.field_i = this.field_i - 32;
          if (this.field_i < 0) {
            this.field_i = 0;
          }
        } else {
          this.field_i = this.field_i + 32;
          if (this.field_i > 255) {
            this.field_i = 255;
          }
        }
        if (0 == SetMinimapWidth.field_o % 50) {
          this.field_R = ffa.field_a;
        }
        if (GraphicsPresentException.field_a) {
          ShipTeamConditionFactory.field_a.screenOriginY = ShipTeamConditionFactory.field_a.screenOriginY - (-SetToggledScoreboard.field_o.screenY + SoftwareRasterizer2D.height >> 1);
        }
        if (SetPhasedEnergyBeamAimspeed.field_q == 1 &&
          ffa.field_a < 20 &&
          20 > this.field_R &&
          SetMinimapWidth.field_o % 50 == 49) {
          if (1 == GetUseSprites.field_o) {
            GetUseSprites.field_o = 0;
          } else {
            if (AwardVictoryToWinnerAction.field_b != 1) {
              if (1 == SetVariableActionFactory.field_c) {
                SetVariableActionFactory.field_c = 0;
              }
            } else {
              AwardVictoryToWinnerAction.field_b = 0;
            }
          }
        }
        if (1 == ul.field_a &&
          OpenGlTexture1D.field_i &&
          GetDebrisGroupColour.field_r.isBloomEnabled()) {
          GetDebrisGroupColour.field_r.beginPostProcessing(0, 0, PartitionZoneFactory.field_a, MissionVariableFactory.field_a);
          GetDebrisGroupColour.field_r.clearColor(0);
        }
        if (MachineGunWeaponDefinition.field_b == 1) {
          GetDebrisGroupColour.field_r.clearDepth();
          GetDebrisGroupColour.field_r.setAmbientLight(1.0f);
          GetDebrisGroupColour.field_r.setDirectionalLighting(14540253, 0.10000000149011612f, 0.20000000298023224f, -100.0f, -100.0f, 0.0f);
          GetDebrisGroupColour.field_r.setProjectionParameters(SetMassDriverReload.field_p, GetLaserAimarc.field_q, 512, 512);
          GetDebrisGroupColour.field_r.setDepthRange(32, 524288);
          var23 = GetDebrisGroupColour.field_r.createTransform();
          var23.setCamera((int)(ShipTeamConditionFactory.field_a.worldCenterX / 64.0f), (int)(-8.0f / ShipTeamConditionFactory.field_a.scale), (int)(-ShipTeamConditionFactory.field_a.worldCenterY / 64.0f), -4096, 0, 0);
          GetDebrisGroupColour.field_r.setViewTransform(var23);
        }
        ShipTeamConditionFactory.field_a.updateWorldBounds(MissionVariableFactory.field_a, 0, -116, PartitionZoneFactory.field_a, 0);
        var24 = this.state.b(1);
        PlayerAction.a(var24.world, ShipTeamConditionFactory.field_a, this.field_x, (byte) -59);
        var6 = this.state.a((byte) 33).getShips(1000);
        var7 = this.state.a((byte) 42).getResNodes(1);
        var8 = this.state.a((byte) 30).getEscapePods(0);
        var9 = null;
        var10 = ShipTeamConditionFactory.field_a.screenToWorldX(true, GetUseDetailLines.field_o);
        var11 = ShipTeamConditionFactory.field_a.screenToWorldY(0, GetTorpedoReload.field_q);
        if (this.localPlayerIndex >= 0) {
          var9 = var24.world.findShipByOwner(this.localPlayerIndex, 126);
        }
        var12 = this.isFogOfWarActive((byte) 46, var24) ? 1 : 0;
        this.updateShipVisibility(false, var7, (Ship) (var9), var8, var6, var12 != 0);
        for (var13 = 0; var13 < this.state.field_a; var13++) {
          var14 = 0;
          if (this.localPlayerIndex == var13) {
            var14 = 0;
          }
          var15 = (GameSnapshot) (this.state.carouselInfo.getStateStepsAgo(var14, -121));
          var16 = var10;
          var17 = var11;
          if (param1 &&
            GetUseDetailLines.field_o != -1 &&
            GetTorpedoReload.field_q != -1) {
            this.field_Q = var10;
            this.field_k = var11;
          } else {
            var17 = this.field_k;
            var16 = this.field_Q;
          }
          var18_ref_tfa = (Player) (var15.players[var13]);
          var19_int = 0;
          if (var13 == this.localPlayerIndex &&
            !this.state.carouselInfo.isReplay(1)) {
            if (var9 != null &&
              fra.field_a == 1 &&
              (128 & var18_ref_tfa.triggers) == 0 &&
              ((Ship) (var9)).getTargetBlueprint((byte) 28) == null &&
              (16 & var18_ref_tfa.triggers) == 0 &&
              !((Ship) (var9)).isSpecialOrderActive(4, 91)) {
              ((Ship) (var9)).copyTo((byte) 94, this.field_W);
              this.field_W.aimAt(-123, var17, var16);
              var20_int = this.field_W.getX(false) - this.field_W.getCenterOfMassOffsetX(995401160);
              var21 = this.field_W.getY((byte) -31) - this.field_W.getCenterOfMassOffsetY((byte) 5);
              var19_int = 1;
              this.field_W.chassis.updateWorldTransforms(true, var20_int, var21, this.field_W.getAngle(0), 0, this.field_W.getBoundingbox((byte) -71));
            }
          } else {
            var17 = var18_ref_tfa.aimtargety;
            var16 = var18_ref_tfa.aimtargetx;
          }
          if (this.state.carouselInfo.isReplay(1)) {
            var20 = var15.world.findShipByOwner(var13, 75);
            if (var20 != null) {
              GetCountermeasureLauncherAimarc.drawWorldArrow(var20.x, ShipTeamConditionFactory.field_a, var17, 3, var20.y, 16755200, 255, var16);
            }
          }
          stackIn_58_0 = var15.world;
          stackIn_58_1 = var18_ref_tfa;
          stackIn_58_2 = var17;
          if (var19_int != 0) {
            stackIn_59_3 = this.field_W;
          } else {
            stackIn_59_3 = null;
          }
          ((World) (Object) stackIn_58_0).drawPlayerShip(stackIn_58_1, stackIn_58_2, stackIn_59_3, ShipTeamConditionFactory.field_a, (byte) 19, (Ship) (var9), SetMinimapWidth.field_o, var16, var13);
        }
        var13Lifetime1 = this.state.carouselInfo.tick;
        var24.world.drawWorld(ShipTeamConditionFactory.field_a, (byte) 122, var13Lifetime1, (Ship) (var9));
        var24.world.drawArmageddonBounds(ShipTeamConditionFactory.field_a, -950, var24.missionState);
        if (var9 != null &&
          GetPointDefenceLaserProjectileInterceptDamage.field_o) {
          this.drawShipHeadingArrow((byte) -95, (Ship) (var9));
        }
        var14Lifetime1 = 0;
        if (ul.field_a == 1 &&
          OpenGlTexture1D.field_i) {
          GetDebrisGroupColour.field_r.applyPostProcessing();
        }
        this.drawShipHealthBars(var6, true);
        if (param0 < 73) {
          this.playerChatOffsets = (int[]) null;
        }
        this.drawFogOfWar((Ship) (var9), -15614, var24, var12 != 0);
        this.drawObjectiveMarkers(var24.missionState, (Ship) (var9), true, var24, this.getLocalTeam((byte) -88));
        if (this.localPlayerIndex >= 0 &&
          param1 &&
          !this.uiBlocksWorldInput &&
          !this.radialMenuActive &&
          -1 == this.pendingSpecialOrderId &&
          var9 != null &&
          GetBots.field_o != 1) {
          var14Lifetime1 = this.drawComponentInspection((byte) 36, var11, var10, var24.getPlayer(this.localPlayerIndex, (byte) 59), (Ship) (var9), var24.world);
        }
        if (this.field_ab) {
          this.field_ab = false;
        } else {
          this.field_J = -1;
        }
        if (this.field_J != -1) {
          this.field_o = this.field_o + 1;
        }
        this.drawMinimap(var24.world, 0, var6);
        this.drawPlayerNamesAndChat(4096);
        this.drawArmageddonCountdown(1, var24.world, var24.missionState);
        this.drawShipHud(var24, 16731136);
        this.drawEventMessages(var24, false, var13Lifetime1);
        if (!this.updateRespawnPanel(var24, (byte) -67, param1) && (!this.field_x ||
          this.tutorialController.isHintCompleteAndHidden((byte) 11, 1))) {
          this.drawRoundStatusHud(var24, 200);
        }
        var16Lifetime1 = 2 * Particle.field_l;
        var17Lifetime1 = Particle.field_l * 5;
        if (OpenGlTexture1D.field_i &&
          this.field_x &&
          var13Lifetime1 < var17Lifetime1) {
          var18 = 255;
          if (var13Lifetime1 > var17Lifetime1 - var16Lifetime1) {
            var18 = (-var13Lifetime1 + var17Lifetime1) * 255 / var16Lifetime1;
          }
          var25 = OpenGlVertexNormal.field_d[137];
          var25.draw(SetMassDriverReload.field_p - var25.getPaddedWidth() / 2, 0, 0, 16777215 | var18 << 24, 1);
        }
        this.drawRespawnWarnings(var24, 1);
        this.drawControlHints((byte) 70, (Ship) (var9));
        if (this.tutorialController != null &&
          param1) {
          this.tutorialController.updateAndDrawHints(var24, this.radialMenuX, this.field_x, ShipTeamConditionFactory.field_a, this.radialMenuY, MissionVariableFactory.field_a, this.radialMenuAlpha, this.pendingSpecialOrderId, (byte) -32, this.specialOrderButtons, PartitionZoneFactory.field_a, this.localPlayerIndex, (Ship) (var9));
        }
        if (var9 != null) {
          var18Lifetime1 = ((Ship) (var9)).getDragging(57);
          var26 = var24.world.getDebrisById(21363, var18Lifetime1);
          if (var26 != null &&
            ((Ship) (var9)).chassis.countComponents(1) + var26.chassis.countComponents(1) > OpenGlShader.field_a) {
            ArmBehaviour.a(2, 0, 200, MissionControl.field_a.toUpperCase());
          }
        }
        if (this.updateVotingPanel(-12, var24) ||
          this.uiBlocksWorldInput) {
          var14Lifetime1 = 4;
        }
        this.drawDebugOverlay(false);
        this.drawChatButton((byte) -41);
        if (1 == SetShipTeamAction.field_e) {
          this.drawWeaponAimArcs((Ship) (var9), false, var10, var11);
        }
        this.drawScoreboard(false);
        if (param1) {
          this.drawActionCursor(var14Lifetime1, var24, (byte) -96, (Ship) (var9));
        }
        this.drawSessionNotifications(var24, -1);
        this.drawBlueprintSaveStatus(true, (Ship) (var9));
        this.field_K.a(this.localPlayerIndex, 84, var24, (Ship) (var9));
        this.drawLobbyGameEntries(91);
        var19 = SetUseTriFill.field_o.nanoTime((byte) -110);
        if (GetPointDefenceLaserProjectiles.a(8192, 11284)) {
          this.renderTimingGraph.addSample(var19 - var3, (byte) -115);
          this.updateTimingGraph.draw(200, 99, 200, 0, 0);
          this.renderTimingGraph.draw(200, 122, 200, 0, 340);
        }
    }

    private final void drawBlueprintSaveStatus(boolean param0, Ship param1) {
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        String var5Lifetime1;
        String var8Lifetime1;
        String var5Lifetime2;
        String var5Lifetime3;
        var7 = VoidHunters.field_G;
        try {
          if (!SetShipTeamActionFactory.field_b) {
            return;
          }
          var3_int = 0;
          if (this.blueprintSaveTick != -1) {
            var4 = -this.blueprintSaveTick + SetMinimapWidth.field_o;
            if (var4 < Particle.field_d) {
              var5 = "No save result text";
              var8 = var5;
              var5Lifetime2 = var8;
              if (this.blueprintSaveStatus != 0) {
                if (1 != this.blueprintSaveStatus) {
                  var5Lifetime3 = ro.field_b;
                } else {
                  var9 = SetArmageddonTimerStart.field_o;
                  var6 = (100 * this.blueprintSizeBytes + 96) / 192;
                  var5Lifetime3 = var9 + "<br>" + SetReverbGain.a(GetMassDriverEnergyUsed.field_o, new String[]{Integer.toString(var6)}, 105);
                }
              } else {
                var8Lifetime1 = GetMissionTimeLimit.field_q;
                var5Lifetime3 = var8Lifetime1;
                var5Lifetime3 = var8Lifetime1;
                if (ArchiveLoadRequest.a(-117)) {
                  var5Lifetime3 = LaserWeaponDefinition.field_b;
                } else {
                  var5Lifetime3 = var8Lifetime1 + "<br>" + SetCountermeasureLauncherProjectiles.field_o;
                }
              }
              var3_int = 1;
              ArmBehaviour.a(1, 116, 200, var5Lifetime3);
            }
          }
          if (var3_int == 0 &&
            !this.networked &&
            param1 != null) {
            if (0 == SetMinimapWidth.field_o % Particle.field_l) {
              this.updateBlueprintSize((byte) 109, param1);
            }
            if (this.tutorialController != null &&
              !this.tutorialController.isHintVisible(3, -75) &&
              !this.tutorialController.isHintComplete(3, true)) {
              return;
            }
            if (null != this.tutorialController &&
              this.tutorialController.isHintVisible(3, -88) &&
              SetMinimapWidth.field_o % 20 > 10) {
              return;
            }
            var4 = (100 * this.blueprintSizeBytes + 96) / 192;
            var5Lifetime1 = SetReverbGain.a(GetMassDriverEnergyUsed.field_o, new String[]{Integer.toString(var4)}, 77);
            GetLagStandardDeviationOut.a(-1, var5Lifetime1, 16777215, 20, 11, 4266);
          }
          if (!param0) {
            this.scoreboardVisible = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("uca.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    private final boolean updateDebugOrderMenu(GameSnapshot param0, boolean param1, boolean param2) {
        int var4_int = 0;
        int var13 = 0;
        boolean stackIn_37_0 = false;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = VoidHunters.field_G;
        try {
          if (param2) {
            this.field_h = true;
          }
          if (param0.world.getDebug((byte) -113) &&
            !param1 &&
            ssa.b(2)) {
            for (var4_int = 0; SetFogOfWarSensorRange.field_o.length > var4_int; var4_int++) {
              var5 = TorpedoWeaponDefinition.field_c[var4_int];
              var6 = GetPhasedEnergyBeamProjectiles.a(96, var5);
              var7 = OpenGlTexture.b((byte) 118);
              var8 = -10 + (PartitionZoneFactory.field_a - var6);
              var9 = var7 * var4_int + 200 - var7;
              if (this.debugOrderCategory == -1 ||
                var4_int == this.debugOrderCategory) {
                if (var8 < GetUseDetailLines.field_o &&
                  GetUseDetailLines.field_o < var6 + var8 &&
                  var9 < GetTorpedoReload.field_q &&
                  var7 + var9 > GetTorpedoReload.field_q) {
                  GetMassDriverReload.a(var5, -23);
                  param1 = true;
                  if (SetDebrisPartitioned.field_o == 1 &&
                    PacketBuffer.field_g == 1) {
                    if (-1 == this.debugOrderCategory) {
                      this.debugOrderCategory = var4_int;
                      break;
                    }
                    this.debugOrderCategory = -1;
                    this.pendingSpecialOrderId = -1;
                    break;
                  }
                }
                if (var4_int == this.debugOrderCategory) {
                  var10 = SetFogOfWarSensorRange.field_o[var4_int][0];
                  var11 = SetFogOfWarSensorRange.field_o[var4_int][SetFogOfWarSensorRange.field_o[var4_int].length - 1];
                  var12 = 0;
                  for (var13 = var10; var13 <= var11; var13++) {
                    var14 = GetGrapplingHookSpringConstant.specialOrderLabels[var13];
                    var15 = GetPhasedEnergyBeamProjectiles.a(123, var14);
                    var16 = OpenGlTexture.b((byte) 118);
                    var17 = -var15 + (-10 + var8);
                    var18 = var16 * var12 + (200 - var7);
                    if (var17 < GetUseDetailLines.field_o &&
                      var17 + var15 > GetUseDetailLines.field_o &&
                      GetTorpedoReload.field_q > var18 &&
                      GetTorpedoReload.field_q < var16 + var18) {
                      param1 = true;
                      GetMassDriverReload.a(var14, -24);
                      if (SetDebrisPartitioned.field_o == 1 &&
                        PacketBuffer.field_g == 1) {
                        this.pendingSpecialOrderId = var13;
                        break;
                      }
                    }
                    var12++;
                  }
                }
              }
            }
          }
          stackIn_37_0 = param1;
          return stackIn_37_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_40_0 = var4;
          stackIn_40_1 = new StringBuilder().append("uca.NA(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void drawPlayerNamesAndChat(int param0) {
        boolean discarded$0 = false;
        int var3 = 0;
        int var25 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_23_0 = false;
        Ship var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String[] var9;
        int var10;
        String var11_ref_String;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var26;
        int var27;
        int var28;
        GameSnapshot var29;
        GameSnapshot var30;
        String var31;
        String var32;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        var28 = VoidHunters.field_G;
        if (param0 != 4096) {
          var29 = (GameSnapshot) null;
          discarded$0 = this.updateRespawnPanel((GameSnapshot) null, (byte) 96, false);
        }
        var30 = this.state.b(1);
        for (var3 = 0; this.state.field_a > var3; var3++) {
          var4 = var30.world.findShipByOwner(var3, 96);
          if (var4 != null) {
            this.lastPlayerShipX[var3] = var4.getX(false);
            this.lastPlayerShipY[var3] = var4.getY((byte) 118);
          }
          var5 = this.lastPlayerShipX[var3];
          var6 = this.lastPlayerShipY[var3];
          var7 = ShipTeamConditionFactory.field_a.worldToScreenX(var5, (byte) 127);
          var8 = ShipTeamConditionFactory.field_a.worldToScreenY(true, -(3 * NebulaField.field_d) + var6);
          var9 = this.getPlayerChatLines((byte) 120, var30.getPlayer(var3, (byte) 59).selectedTeam, var3);
          if (var9 != null) {
            stackIn_12_0 = (var9.length > 0) ? 1 : 0;
          } else {
            stackIn_12_0 = 0;
          }
          var10 = stackIn_12_0;
          if (var4 != null) {
            var8 = -6 + ShipTeamConditionFactory.field_a.worldToScreenY(true, var4.getBoundingbox((byte) -110)[2] - 3 * NebulaField.field_d);
            var11_ref_String = this.state.getPlayerName(1, var4.getOwner((byte) -117));
            if (var4.getOwner((byte) -117) != this.localPlayerIndex && (!var4.hasVisibilityFlag(1, (byte) 24) &&
              !var4.hasVisibilityFlag(2, (byte) -120) ||
              var10 != 0)) {
              stackIn_23_0 = (var4.getOwner((byte) -117) == this.localPlayerIndex);
              var12 = AlphaContainer.getTeamColor(stackIn_23_0, var4.getTeam((byte) 98), 13894143);
              GetLagStandardDeviationOut.a(-1, var11_ref_String, var12, var8, var7 - (GetPhasedEnergyBeamProjectiles.a(95, var11_ref_String) >> 1), param0 + 170);
            }
          }
          var11 = 16384;
          if (var10 != 0) {
            var31 = var9[var9.length - 1];
            var13 = GetPhasedEnergyBeamProjectiles.a(param0 ^ 4206, var31);
            var14 = ShipTeamConditionFactory.field_a.worldToScreenX(4096 + var5, (byte) 122);
            var15 = ShipTeamConditionFactory.field_a.worldToScreenY(true, -2048 + (var6 - (var11 << 1))) - OpenGlTexture.b((byte) 118);
            var16 = var14 - (var13 >> 1);
            var17 = var15;
            var18 = 0;
            var19 = 0;
            var20 = var16;
            var21 = var13 + var16;
            var22 = var17 - OpenGlTexture.b((byte) 118);
            var23 = OpenGlTexture.b((byte) 118) + var17;
            var24 = 64;
            if (var24 <= var22) {
              if (var23 > -var24 + MissionVariableFactory.field_a) {
                var19 = MissionVariableFactory.field_a + (-var24 - var23);
              }
            } else {
              var19 = var24 - var22;
            }
            if (var20 < var24) {
              var18 = var24 - var20;
            } else {
              if (-var24 + PartitionZoneFactory.field_a < var21) {
                var18 = PartitionZoneFactory.field_a + (-var24 - var21);
              }
            }
            for (var25 = 0; var25 < var9.length; var25++) {
              var32 = var9[var25];
              var13Lifetime1 = GetPhasedEnergyBeamProjectiles.a(param0 - 4218, var32);
              var26 = ShipTeamConditionFactory.field_a.worldToScreenX(2048 + var5, (byte) 115);
              var27 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var6 - 16384 - 16384);
              var14Lifetime1 = ShipTeamConditionFactory.field_a.worldToScreenX(var5 + 4096, (byte) 117);
              var15Lifetime1 = ShipTeamConditionFactory.field_a.worldToScreenY(true, -8192 + (var6 - (var11 << 1))) - OpenGlTexture.b((byte) 118);
              var16Lifetime1 = var14Lifetime1 - (var13Lifetime1 >> 1);
              var17Lifetime1 = var15Lifetime1 + -16 * (-var25 + var9.length - 1);
              DelayedPacket.drawLine(var27 + var19, var26 + var18, var7, -(OpenGlTexture.b((byte) 118) * 2) + var8, -16777216, 16777215);
              GetLagStandardDeviationOut.a(2, var32, 16777215, var17Lifetime1 + var19, var18 + var16Lifetime1, 4266);
            }
          }
        }
    }

    private final String[] revealStringLines(int param0, boolean param1, String[] param2) {
        int var7 = 0;
        String[] stackIn_8_0 = null;
        String[] stackIn_16_0 = null;
        String[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          param2 = this.removeNullStrings((byte) -15, param2);
          var4_int = 0;
          while (true) {
            if (var4_int >= param2.length) {
              if (!param1) {
                this.beginPacket(122);
              }
              stackIn_21_0 = new String[]{"get_cut_string_list error"};
              return stackIn_21_0;
            }
            var5 = 30 * (1 + var4_int);
            if (param0 >= var5 &&
              var4_int != -1 + param2.length) {
              var4_int++;
              continue;
            }
            break;
          }
          if (var4_int == 0) {
            stackIn_8_0 = new String[]{param2[0]};
            return stackIn_8_0;
          }
          var6 = new String[1 + var4_int];
          for (var7 = 0; var6.length > var7; var7++) {
            if (var6.length - 1 > var7) {
              var6[var7] = param2[var7];
            } else {
              var8 = (1 + var4_int - 1) * 30;
              var6[var7] = this.revealString(param0, var8, (byte) 32, param2[var7]);
            }
          }
          stackIn_16_0 = var6;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("uca.NC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final String revealString(int param0, int param1, byte param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == null) {
            return null;
          }
          var5_int = 16 * (-param1 + param0);
          if (param2 != 32) {
            this.updateVoteGrid((GameSnapshot) null, -92, -110, -123, -76, -28, -73, -90, -4, -119, -24, -119, true);
          }
          if (var5_int > 256) {
            var5_int = 256;
          }
          stackIn_8_0 = param3.substring(0, var5_int * param3.length() >> 8);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("uca.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void drawScoreboard(boolean param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        GameSnapshot var7;
        int var8;
        int var9;
        String[][] var10;
        int[] var11;
        int[] var12;
        int[] var13;
        int var14;
        int[][] var15;
        int var15_int;
        int[] var16;
        int var17;
        int var18;
        int[] var19;
        int var19_int;
        int var20;
        int[] var20_ref_int__;
        int var21;
        int var22;
        int var23;
        String var23_ref_String;
        int var24;
        String var25_ref_String;
        int var25;
        int var26;
        int var27;
        int[] var28;
        int var29;
        int var30;
        int var31;
        int[] var32;
        int[][] var33;
        int[] var34;
        Player var35;
        String var36;
        Ship var37;
        int[] var39;
        String var40;
        int[] var41;
        String var42;
        int[] var44;
        int[] var45;
        int[] var46;
        int[][] var47;
        int[] var48;
        int[] var50;
        int[] var51;
        int[] var53;
        int[] var54;
        int[] var55;
        int[] var58;
        int[] var59;
        int var4Lifetime1;
        int var14Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var29Lifetime1;
        int var19_intLifetime1;
        var31 = VoidHunters.field_G;
        if (!this.scoreboardVisible) {
          return;
        }
        var32 = new int[]{0, 1, 2, 3, 4, 5};
        var3 = this.state.field_a;
        var4 = 4;
        var5 = 20;
        if (param0) {
          this.blueprintSaveStatus = 75;
        }
        var6 = 2;
        var7 = this.state.b(1);
        var8 = var7.world.getObjectiveType(param0);
        var9 = ConsoleCharacterStream.a(74, var8) ? 1 : 0;
        var10 = new String[var32.length][1 + var3];
        var55 = new int[1 + var3];
        var46 = var55;
        var11 = var46;
        var54 = new int[var3 + 1];
        var45 = var54;
        var12 = var45;
        var13 = new int[var3 + 1];
        for (var14 = 0; var32.length > var14; var14++) {
          var15_int = var32[var14];
          var10[var14][0] = SetVariableActionFactory.field_e[var15_int];
          var12[0] = 8947848;
          var13[0] = 2147483647;
        }
        var14Lifetime1 = 10;
        var47 = new int[SettingsChange.field_b][1 + var3];
        var33 = var47;
        var15 = var33;
        var48 = new int[SettingsChange.field_b];
        var34 = var48;
        var16 = var34;
        for (var17 = 0; var47.length > var17; var17++) {
          for (var18 = 0; var18 < var47[var17].length; var18++) {
            var47[var17][var18] = -1;
          }
          var47[var17][0] = 0;
          var48[var17] = 1;
        }
        for (var17Lifetime1 = 0; var3 > var17Lifetime1; var17Lifetime1++) {
          if ((1 << var17Lifetime1 & this.state.disconnectedPlayerMask) != 0 &&
            SetMissionResnetResourceTickTime.field_p == 0) {
            var11[1 + var17Lifetime1] = SetAngularForceDownshift.orBits(var11[1 + var17Lifetime1], OpenGlGpuToolkit.field_Oc);
          } else {
            if (var17Lifetime1 == this.localPlayerIndex) {
              var11[1 + var17Lifetime1] = SetAngularForceDownshift.orBits(var11[1 + var17Lifetime1], GetBoostersActiveTime.field_o);
            }
            var35 = var7.getPlayer(var17Lifetime1, (byte) 59);
            if (!var35.connected &&
              this.state.field_h[var17Lifetime1] == null &&
              SetMissionResnetResourceTickTime.field_p == 0) {
              var11[var17Lifetime1 + 1] = SetAngularForceDownshift.orBits(var11[var17Lifetime1 + 1], OpenGlGpuToolkit.field_Oc);
            } else {
              if (!var7.missionState.isPreGamePhase((byte) -126) &&
                null == var7.world.findShipByOwner(var17Lifetime1, 92)) {
                var11[var17Lifetime1 + 1] = SetAngularForceDownshift.orBits(var11[var17Lifetime1 + 1], bsb.field_a);
              }
              var19_int = var35.selectedTeam;
              var12[1 + var17Lifetime1] = AlphaContainer.getTeamColor(false, var19_int, 13894143);
              if (var9 == 0 ||
                var7.missionState.isPreGamePhase((byte) -116)) {
                var19_int = 0;
                if (var9 == 0) {
                  var12[1 + var17Lifetime1] = AlphaContainer.getTeamColor(false, var17Lifetime1, 13894143);
                }
              }
              var13[var17Lifetime1 + 1] = var35.kills;
              if (var19_int < 0) {
                var19_int = SettingsChange.field_b - 1;
              }
              var20 = var48[var19_int];
              var47[var19_int][var20] = var17Lifetime1 + 1;
              var16[var19_int] = var16[var19_int] + 1;
              for (var21 = 0; var32.length > var21; var21++) {
                var22 = var32[var21];
                var23_ref_String = "";
                var26 = var22;
                if (var26 != 0) {
                  if (1 != var26) {
                    if (var26 != 2) {
                      if (var26 != 3) {
                        if (4 == var26) {
                          var23_ref_String = Integer.toString(var35.deaths);
                        } else {
                          if (var26 == 5) {
                            var25 = FlipTextureOperation.field_l.getPlayerPingMillis(true, var17Lifetime1);
                            if (var17Lifetime1 == this.localPlayerIndex) {
                              var25 = FlipTextureOperation.field_l.getPingMillis(0);
                            }
                            if (var25 < 0) {
                              var23_ref_String = "-";
                            } else {
                              var23_ref_String = Integer.toString(var25);
                            }
                          }
                        }
                      } else {
                        var23_ref_String = Integer.toString(var35.assists);
                      }
                    } else {
                      var23_ref_String = Integer.toString(var35.kills);
                    }
                  } else {
                    if ((bsb.field_a & var11[var17Lifetime1 + 1]) == 0) {
                      var37 = var7.world.findShipByOwner(var17Lifetime1, 126);
                      var27 = 0;
                      if (var37 != null) {
                        var27 = var37.chassis.countComponents(1);
                      }
                      var23_ref_String = Integer.toString(var27);
                    }
                  }
                } else {
                  var36 = this.state.getPlayerName(1, var17Lifetime1);
                  if (var36 != null &&
                    var36.length() > 0) {
                    var23_ref_String = var36;
                  }
                }
                var10[var21][var17Lifetime1 + 1] = var23_ref_String;
              }
            }
          }
        }
        for (var17Lifetime2 = 0; var47.length > var17Lifetime2; var17Lifetime2++) {
          var58 = var47[var17Lifetime2];
          var19_intLifetime1 = var48[var17Lifetime2];
          if (var19_intLifetime1 < var58.length) {
            var50 = new int[var19_intLifetime1];
            var39 = var50;
            var20_ref_int__ = var39;
            for (var21Lifetime1 = 0; var19_intLifetime1 > var21Lifetime1; var21Lifetime1++) {
              var20_ref_int__[var21Lifetime1] = var58[var21Lifetime1];
            }
            var15[var17Lifetime2] = var50;
          }
          if (var19_intLifetime1 > 1) {
            var14Lifetime1 = var14Lifetime1 + (var19_intLifetime1 * var5 + 10);
          }
        }
        var14Lifetime1 = -10 + var14Lifetime1;
        var17Lifetime3 = 5;
        var18Lifetime1 = 14;
        var51 = new int[var10.length];
        var41 = var51;
        var19 = var41;
        var20Lifetime1 = var18Lifetime1;
        for (var21Lifetime2 = 0; var10.length > var21Lifetime2; var21Lifetime2++) {
          for (var22Lifetime1 = 0; var10[var21Lifetime2].length > var22Lifetime1; var22Lifetime1++) {
            var40 = var10[var21Lifetime2][var22Lifetime1];
            var24 = GetPhasedEnergyBeamProjectiles.a(111, var40);
            if (var24 > var51[var21Lifetime2]) {
              var51[var21Lifetime2] = var24;
            }
          }
          var19[var21Lifetime2] = var19[var21Lifetime2] + (var17Lifetime3 << 1);
          var20Lifetime1 = var20Lifetime1 + var51[var21Lifetime2];
        }
        var21Lifetime3 = var20Lifetime1;
        var22Lifetime2 = 320;
        if (SetRepairModeCooldown.field_o) {
          var22Lifetime2 = 260;
        }
        if (var20Lifetime1 < var22Lifetime2) {
          var20Lifetime1 = var22Lifetime2;
          for (var23 = 0; var51.length > var23; var23++) {
            var19[var23] = var20Lifetime1 * var51[var23] / var21Lifetime3;
          }
        }
        if (SetRepairModeCooldown.field_o) {
          var4Lifetime1 = 112;
        } else {
          var6 = -(var20Lifetime1 / 2) + SetMassDriverReload.field_p;
          var4Lifetime1 = GetLaserAimarc.field_q - var14Lifetime1 / 2;
        }
        if (var9 != 0) {
          var23Lifetime1 = var7.missionState.getTeamScore(param0, 0);
          var42 = VoidHunters.getTeamName(0, -1) + ": <col=ffffff>" + Integer.toString(var23Lifetime1) + "</col>";
          var23Lifetime1 = var7.missionState.getTeamScore(false, 1);
          var25_ref_String = VoidHunters.getTeamName(1, -1) + ": <col=ffffff>" + Integer.toString(var23Lifetime1) + "</col>";
          var26Lifetime1 = GetPointDefenceLaserProjectiles.a(false, 1);
          BlackBoxRecording.a((byte) -115, 200, var14Lifetime1 + var26Lifetime1, var6, -var26Lifetime1 + var4Lifetime1, var20Lifetime1);
          SetSelfDestructPrepareToggleCooldown.a((var20Lifetime1 >> 1) + (var6 - tea.a(1, var42, 13879) / 2 - var20Lifetime1 / 4), 1, var4Lifetime1 - 10, var42, 1, AlphaContainer.getTeamColor(false, 0, 13894143), (byte) -124);
          SetSelfDestructPrepareToggleCooldown.a(-(tea.a(1, var25_ref_String, 13879) / 2) + var6 - (-(var20Lifetime1 >> 1) - var20Lifetime1 / 4), 1, -10 + var4Lifetime1, var25_ref_String, 1, AlphaContainer.getTeamColor(false, 1, 13894143), (byte) -95);
        } else {
          var23Lifetime1 = 4;
          BlackBoxRecording.a((byte) -115, 200, var14Lifetime1 + 2 * var23Lifetime1, var6, -var23Lifetime1 + (var4Lifetime1 - 5), var20Lifetime1);
        }
        var23Lifetime2 = var18Lifetime1 + var6;
        var24Lifetime1 = var4Lifetime1;
        for (var25Lifetime1 = 0; var25Lifetime1 < var47.length; var25Lifetime1++) {
          var59 = var47[var25Lifetime1];
          var27Lifetime1 = var59.length;
          if (var27Lifetime1 > 1) {
            var53 = new int[var59.length];
            var44 = var53;
            var28 = var44;
            for (var29 = 0; var29 < var59.length; var29++) {
              var30 = var13[var59[var29]];
              var28[var29] = -var30 + 2147483647;
            }
            for (var29Lifetime1 = 0; var59.length > var29Lifetime1; var29Lifetime1++) {
              SetTorpedoAcceleration.a(var53, (byte) 16, var59);
            }
            GetMachineGunPulsetime.a(0, -122, -var18Lifetime1 + var20Lifetime1 - var17Lifetime3, var24Lifetime1, var27Lifetime1 * var5, -var17Lifetime3 + var23Lifetime2);
            this.drawScoreboardColumns(var59, 18398, var24Lifetime1, var17Lifetime3, var18Lifetime1, var51, var54, var55, var5, var23Lifetime2, var6, var10);
            var24Lifetime1 = var24Lifetime1 + (var5 * var27Lifetime1 + 10);
          }
        }
        return;
    }

    private final void drawMissionControlDebug(int param0) {
        int var4_int = 0;
        int var12 = 0;
        int stackIn_29_0 = 0;
        StringBuilder stackIn_31_0 = null;
        String stackIn_32_1 = null;
        StringBuilder stackIn_34_0 = null;
        String stackIn_35_1 = null;
        int stackIn_46_0 = 0;
        StringBuilder stackIn_48_0 = null;
        String stackIn_49_1 = null;
        StringBuilder stackIn_51_0 = null;
        String stackIn_52_1 = null;
        StringBuilder stackIn_54_0 = null;
        String stackIn_55_1 = null;
        int stackIn_62_0;
        int stackIn_62_1;
        int stackIn_62_2;
        int stackIn_62_3;
        int stackIn_62_4;
        int stackIn_63_5;
        int stackIn_84_0 = 0;
        StringBuilder stackIn_86_0 = null;
        String stackIn_87_1 = null;
        StringBuilder stackIn_89_0 = null;
        String stackIn_90_1 = null;
        int stackIn_96_0;
        int stackIn_96_1;
        int stackIn_96_2;
        int stackIn_96_3;
        int stackIn_96_4;
        int stackIn_97_5;
        MissionVariable[] var3;
        MissionEvent[] var4;
        MissionVariable var5_ref_et;
        int var5;
        String var6_ref_String;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        MissionEvent var13;
        int var14;
        String var15;
        MissionCondition[] var16;
        MissionAction[] var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        WorldPoint[] var23;
        int var24;
        int var25;
        int var26;
        int var27;
        MissionVariable[] var28;
        WorldPoint[] var29;
        int var30;
        MissionState var31;
        MissionControl var32;
        String var33;
        String var34;
        WorldPoint var35;
        String var36;
        int var21Lifetime1;
        int var22Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        String var15Lifetime1;
        String var15Lifetime2;
        String var15Lifetime3;
        String var34Lifetime1;
        String var34Lifetime1Lifetime1;
        String var34Lifetime1Lifetime2;
        var27 = VoidHunters.field_G;
        if (param0 > -74) {
          this.updateChatControls((byte) -11, true);
        }
        if (GetPointDefenceLaserProjectiles.a(64, 11284)) {
          var31 = this.state.b(1).missionState;
          if (var31 != null) {
            var28 = var31.getCustomVariables(false);
            var3 = var28;
            if (var3 != null &&
              var28.length > 0) {
              GetLagStandardDeviationOut.a(-1, "Vars:", 16711680, 120, 100, 4266);
              for (var4_int = 0; var28.length > var4_int; var4_int++) {
                var5_ref_et = var28[var4_int];
                if (var5_ref_et != null) {
                  var6_ref_String = Integer.toString(var4_int);
                  if (var5_ref_et.label >= 1 &&
                    ParticleFactory.field_c.length > var5_ref_et.label) {
                    var6_ref_String = ParticleFactory.field_c[var5_ref_et.label];
                  }
                  GetLagStandardDeviationOut.a(-1, var6_ref_String + " = " + var28[var4_int].value, 16711680, 120 + var4_int * 20, 140, 4266);
                }
              }
            }
          }
          var32 = this.state.a((byte) 43).getMissionControl(0);
          if (var32 != null) {
            var4 = var32.getEvents(1);
            if (var4 != null) {
              var5 = 10;
              var6 = 180;
              var7 = PartitionZoneFactory.field_a - var5;
              var8 = OpenGlTexture.b((byte) 118) * 1;
              var9 = 8947848;
              var10 = -1;
              var11 = 16777215;
              for (var12 = 0; var4.length > var12; var12++) {
                var13 = var4[var12];
                if (var12 == var32.selectedEvent) {
                  stackIn_29_0 = (this.state.a((byte) 125).getDebug((byte) 126)) ? 1 : 0;
                } else {
                  stackIn_29_0 = 0;
                }
                var14 = stackIn_29_0;
                stackIn_31_0 = new StringBuilder();
                if (var14 == 0) {
                  stackIn_32_1 = "";
                } else {
                  stackIn_32_1 = "<col=ffffff>";
                }
                stackIn_34_0 = ((StringBuilder) (Object) stackIn_31_0).append(stackIn_32_1).append("Event: ");
                if (var14 == 0) {
                  stackIn_35_1 = "";
                } else {
                  stackIn_35_1 = "</col>";
                }
                var33 = ((StringBuilder) (Object) stackIn_34_0).append(stackIn_35_1).toString();
                var15 = var33;
                var34 = var15;
                var15Lifetime1 = var34;
                var15Lifetime2 = var33;
                var15Lifetime3 = var33;
                var16 = var13.getConditions((byte) -119);
                var17 = var13.getActions((byte) -42);
                var18 = 0;
                var19 = var5;
                var20 = var6 + var12 * var8;
                if (var16 != null &&
                  var16.length > 0) {
                  var15Lifetime3 = var33 + "if ";
                  var34Lifetime1 = var15Lifetime3;
                  var15Lifetime3 = var34Lifetime1;
                  var34Lifetime1Lifetime1 = var15Lifetime3;
                  var15Lifetime3 = var34Lifetime1Lifetime1;
                  for (var21 = 0; var21 < var16.length; var21++) {
                    if (var14 != 0) {
                      stackIn_46_0 = (var18 == var32.selectedConditionOrAction) ? 1 : 0;
                    } else {
                      stackIn_46_0 = 0;
                    }
                    var22 = stackIn_46_0;
                    stackIn_48_0 = new StringBuilder().append(var15Lifetime3);
                    if (var22 != 0) {
                      stackIn_49_1 = "<col=ffffff>";
                    } else {
                      stackIn_49_1 = "";
                    }
                    stackIn_51_0 = ((StringBuilder) (Object) stackIn_48_0).append(stackIn_49_1);
                    if (var16[var21].negated) {
                      stackIn_52_1 = "not ";
                    } else {
                      stackIn_52_1 = "";
                    }
                    stackIn_54_0 = ((StringBuilder) (Object) stackIn_51_0).append(stackIn_52_1).append(var16[var21].getDescription(-1));
                    if (var22 != 0) {
                      stackIn_55_1 = "</col>";
                    } else {
                      stackIn_55_1 = "";
                    }
                    var34Lifetime1Lifetime2 = ((StringBuilder) (Object) stackIn_54_0).append(stackIn_55_1).toString();
                    var15Lifetime3 = var34Lifetime1Lifetime2;
                    var15Lifetime3 = var34Lifetime1Lifetime2;
                    var15Lifetime3 = var34Lifetime1Lifetime2;
                    if (var14 != 0) {
                      var29 = var16[var21].getWorldPositions(this.state.a((byte) 106), -20605);
                      var23 = var29;
                      if (var23 != null) {
                        for (var24 = 0; var29.length > var24; var24++) {
                          var25 = ShipTeamConditionFactory.field_a.worldToScreenX(var29[var24].x, (byte) 118);
                          var26 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var29[var24].y);
                          stackIn_62_0 = var26;
                          stackIn_62_1 = var25;
                          stackIn_62_2 = var19;
                          stackIn_62_3 = var20;
                          stackIn_62_4 = -16777216;
                          if (var22 == 0) {
                            stackIn_63_5 = var9;
                          } else {
                            stackIn_63_5 = var11;
                          }
                          DelayedPacket.drawLine(stackIn_62_0, stackIn_62_1, stackIn_62_2, stackIn_62_3, stackIn_62_4, stackIn_63_5);
                        }
                      }
                    }
                    var18++;
                    if (var21 < -1 + var16.length) {
                      var15Lifetime3 = var34Lifetime1Lifetime2 + " and ";
                    }
                  }
                }
                if (var17 != null &&
                  var17.length > 0) {
                  if (var16 != null &&
                    var16.length > 0) {
                    var15Lifetime3 = var15Lifetime3 + " then ";
                  }
                  var30 = 0;
                  var21Lifetime1 = var30;
                  while (var30 < var17.length) {
                    if (var14 != 0) {
                      stackIn_84_0 = (var18 == var32.selectedConditionOrAction) ? 1 : 0;
                    } else {
                      stackIn_84_0 = 0;
                    }
                    var22Lifetime1 = stackIn_84_0;
                    stackIn_86_0 = new StringBuilder().append(var15Lifetime3);
                    if (var22Lifetime1 == 0) {
                      stackIn_87_1 = "";
                    } else {
                      stackIn_87_1 = "<col=ffffff>";
                    }
                    stackIn_89_0 = ((StringBuilder) (Object) stackIn_86_0).append(stackIn_87_1).append(var17[var30].getDescription(-1325));
                    if (var22Lifetime1 != 0) {
                      stackIn_90_1 = "</col>";
                    } else {
                      stackIn_90_1 = "";
                    }
                    var36 = ((StringBuilder) (Object) stackIn_89_0).append(stackIn_90_1).toString();
                    var15Lifetime3 = var36;
                    if (var14 != 0) {
                      var35 = var17[var30].getWorldPosition(this.state.a((byte) 55), 26964);
                      if (var35 != null) {
                        var24Lifetime1 = ShipTeamConditionFactory.field_a.worldToScreenX(var35.x, (byte) 118);
                        var25Lifetime1 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var35.y);
                        stackIn_96_0 = var25Lifetime1;
                        stackIn_96_1 = var24Lifetime1;
                        stackIn_96_2 = var19;
                        stackIn_96_3 = var20;
                        stackIn_96_4 = -16777216;
                        if (var22Lifetime1 != 0) {
                          stackIn_97_5 = var11;
                        } else {
                          stackIn_97_5 = var9;
                        }
                        DelayedPacket.drawLine(stackIn_96_0, stackIn_96_1, stackIn_96_2, stackIn_96_3, stackIn_96_4, stackIn_97_5);
                      }
                    }
                    if (-1 + var17.length > var30) {
                      var15Lifetime3 = var36 + ", ";
                    }
                    var18++;
                    var30++;
                  }
                }
                GetMachineGunPulsetime.a(var15Lifetime3, var9, var8, var19, -55, var20, var10, 0, 0, var7, 0);
              }
            }
          }
        }
    }

    private final void drawActionCursor(int param0, GameSnapshot param1, byte param2, Ship param3) {
        int stackIn_21_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          if (param0 != 3) {
            if (!AccountCreationDialog.field_Y &&
              !GuestPlayNoticePanel.hasActivePointerPosition(false)) {
              return;
            }
            if (this.localPlayerIndex >= 0) {
              boolean decompiledFrameRemainder0 = true;
              var5_int = GetUseDetailLines.field_o;
              var6 = GetTorpedoReload.field_q;
              var7 = 16777215;
              var8 = param1.getPlayer(this.localPlayerIndex, (byte) 59).triggers;
              if ((param0 != 0 ||
                (var8 & 128) != 0 ||
                this.pendingSpecialOrderId != -1) && 1 != param0) {
                stackIn_21_0 = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (param3 != null) {
                  stackIn_21_0 = (null == param3.getTargetBlueprint((byte) 28)) ? 1 : 0;
                } else {
                  stackIn_21_0 = 0;
                }
              }
              var9 = stackIn_21_0;
              if (param0 == 0 &&
                (var8 & 128) != 0) {
                param0 = 1;
              }
              if (param2 >= -56) {
                this.updateSession((byte) 106, true);
              }
              if (this.pendingSpecialOrderId != -1) {
                param0 = 5;
              }
              if (param3 != null &&
                this.localPlayerIndex == param3.getOwner((byte) -117) &&
                var9 != 0) {
                var10 = this.drawWeaponTargetGuide(var6, var5_int, param0, 0, param3);
                if (param0 == 0) {
                  param0 = var10;
                  if (param0 != 2) {
                    param0 = -1;
                  }
                }
              }
              if (!GuestPlayNoticePanel.hasActivePointerPosition(false)) {
                return;
              }
              if (param0 != 2) {
                if (5 != param0) {
                  if (param0 == -1) {
                    var7 = 16711680;
                    DelayedPacket.drawLine(8 + var6, 8 + var5_int, var5_int - 8, var6 - 8, -16777216, var7);
                    DelayedPacket.drawLine(-8 + var6, 8 + var5_int, var5_int - 8, var6 + 8, -16777216, var7);
                  } else {
                    if (param0 != 1) {
                      SetNumStars.drawCircle(6.0f, (byte) 95, var6, var7, var5_int);
                    } else {
                      DelayedPacket.drawLine(var6, 8 + var5_int, -8 + var5_int, var6, -16777216, var7);
                      DelayedPacket.drawLine(var6 + 8, var5_int, var5_int, -8 + var6, -16777216, var7);
                    }
                  }
                } else {
                  var7 = 16746496;
                  DelayedPacket.drawLine(var6, var5_int + 8, var5_int - 8, var6, -16777216, var7);
                  DelayedPacket.drawLine(var6 + 8, var5_int, var5_int, -8 + var6, -16777216, var7);
                  SetNumStars.drawCircle(6.0f, (byte) 83, var6, var7, var5_int);
                }
              } else {
                DelayedPacket.drawLine(var6, var5_int + 8, -8 + var5_int, var6, -16777216, var7);
                DelayedPacket.drawLine(8 + var6, var5_int, var5_int, -8 + var6, -16777216, var7);
                SetNumStars.drawCircle(6.0f, (byte) 98, var6, var7, var5_int);
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_53_0 = var5;
          stackIn_53_1 = new StringBuilder().append("uca.LB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(')').toString());
        }
    }

    private final boolean updateVotingPanel(int param0, GameSnapshot param1, boolean param2) {
        int discarded$0 = 0;
        int var35_int = 0;
        int var38 = 0;
        int stackIn_150_0 = 0;
        RuntimeException stackIn_153_0 = null;
        StringBuilder stackIn_153_1 = null;
        String stackIn_154_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var18_ref_String = null;
        int var19_int = 0;
        String var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22_int = 0;
        int[] var22 = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[][] var26_ref_int____ = null;
        int var26 = 0;
        int var27 = 0;
        int var28_int = 0;
        ToolkitSprite var28 = null;
        ToolkitSprite var29_ref_aja = null;
        int var29 = 0;
        int var30_int = 0;
        String var30 = null;
        int var31 = 0;
        String var32 = null;
        Object var33 = null;
        int var34 = 0;
        String var35 = null;
        Object var36 = null;
        Player var36_ref = null;
        int var37 = 0;
        int var39 = 0;
        MissionState var40 = null;
        String var41 = null;
        String var42 = null;
        int[][] var43 = null;
        String var44 = null;
        String var45 = null;
        int[] var46 = null;
        String var47 = null;
        int[] var49 = null;
        String var50 = null;
        String var51 = null;
        String var19Lifetime1;
        String var30Lifetime1;
        String var47Lifetime1;
        String var19Lifetime2;
        String var30Lifetime2;
        String var47Lifetime2;
        String var19Lifetime1Lifetime1;
        String var19Lifetime1Lifetime2;
        String var30Lifetime1Lifetime1;
        String var30Lifetime1Lifetime2;
        int var18Lifetime1;
        int var21Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var30_intLifetime1;
        int var18Lifetime1Lifetime1;
        int var24Lifetime1Lifetime1;
        var36 = null;
        var39 = VoidHunters.field_G;
        try {
          var40 = param1.missionState;
          var5 = var40.getMissionPhase(8);
          if (var5 != 1 &&
            2 != var5 &&
            3 != var5) {
            return false;
          }
          var6 = 0;
          var7 = 529;
          var8 = 120;
          var9 = SetMassDriverReload.field_p;
          var10 = MissionVariableFactory.field_a - (var8 >> 1);
          var11 = 80;
          if (var5 == 1 ||
            var5 == 2) {
            var10 = GetLaserAimarc.field_q - var11 / 2;
            var8 = 264;
          }
          var12 = var7;
          var13 = -(var12 / 2) + var9;
          var14 = -(var8 / 2) + var10;
          var15 = 9;
          if (param0 <= 112) {
            discarded$0 = this.getRadialSegmentAngle(false, 30, 83);
          }
          var16 = 1;
          var17 = this.hoveredVoteOptionId;
          this.hoveredVoteOptionId = -1;
          if (!param2) {
            this.field_U = this.field_U - 8;
            if (this.field_U < 0) {
              this.field_U = 0;
            }
            for (var18 = 0; this.voteHighlightAlphas.length > var18; var18++) {
              this.voteHighlightAlphas[var18] = this.voteHighlightAlphas[var18] - 16;
              if (this.voteHighlightAlphas[var18] < 0) {
                this.voteHighlightAlphas[var18] = 0;
              }
            }
          }
          if (var5 != 1 &&
            var5 != 2) {
            if (var5 == 3) {
              var41 = GetPhasedEnergyBeamRandomness.field_o.toUpperCase();
              var18_ref_String = var41;
              var18_ref_String = var41;
              if (param2) {
                var19_int = tea.a(var16, var41 + "00000000", 13879);
                var20 = var15 * 2;
                var7 = var20 + var19_int;
                var13 = var9 - var7 / 2;
                var21 = GetPointDefenceLaserProjectiles.a(false, var16) * 2 + GetPointDefenceLaserProjectiles.a(false, 4);
                if (var40.hasNextRound(24416) &&
                  var40.getVotedOptions(true) != null) {
                  var21 += 24;
                }
                CachedArchiveProvider.a(200, false, var13, var14, var21, var7, 1);
                SetSelfDestructPrepareToggleCooldown.a(-(tea.a(var16, var41, 13879) / 2) + var9, -1, GetPointDefenceLaserProjectiles.a(false, var16) + var14, var41, var16, 16777215, (byte) -124);
              }
            }
          } else {
            if (var13 <= GetUseDetailLines.field_o &&
              var14 <= GetTorpedoReload.field_q &&
              GetUseDetailLines.field_o < var13 + var12 &&
              GetTorpedoReload.field_q < var14 + var8) {
              var6 = 1;
            }
            var18_ref_String = SetReloadBarWidth.field_t;
            var19_int = 0;
            var20 = 14;
            if (var5 == 2) {
              var19_int = 14;
              var20 = 31;
              var18_ref_String = WeaponBehaviour.field_a;
            }
            var21 = 13750737;
            if (!param2) {
              this.ensureFallbackVote(var5, param1, -11, var20, var19_int);
            } else {
              PlayerVote.a(var13, var8, 255, 115, var12, var14);
              var42 = var18_ref_String.toUpperCase();
              SetSelfDestructPrepareToggleCooldown.a(-(tea.a(var16, var42, 13879) / 2) + var9, -1, var14 + UsernameAvailabilityValidator.getFontAscent(true, var16) + 9, var42, var16, var21, (byte) -95);
            }
            var22_int = 20;
            var23 = (var12 - var15) / 3;
            var24 = 55;
            if (2 == var5) {
              var24 = 45;
            }
            var25 = (-var22_int + (var8 - var15)) / var24;
            if (2 == var5) {
              var22_int = var22_int + var24;
              var23 = (-var15 + var12) / 4;
              var25--;
            }
            if (var5 == 1) {
              var26_ref_int____ = (int[][]) null;
              var43 = new int[][]{new int[]{11, 2, 0, 4, 12}, new int[]{1, 5, 3, 10}, new int[]{7, 9, 8, 6}};
              this.updateGroupedVoteGrid(ValidatedTextField.field_M, 1 + var23, var24 - 3, param1, 40, var13, var15 - 3, (byte) -92, 10 + var14, param2, var43, var22_int, var25);
            } else {
              this.updateVoteGrid(param1, var20, 2051269640, var24, var23, var13, var19_int, var15, var22_int, var25, 42, 10 + var14, param2);
            }
            if (this.hoveredVoteOptionId != -1 &&
              !param2 &&
              this.field_U < 255) {
              this.field_U = 255;
            }
            if (this.hoveredVoteOptionId == -1) {
              this.hoveredVoteOptionId = var17;
            }
            if (param2 &&
              this.hoveredVoteOptionId != -1 &&
              this.field_U > 0 &&
              OpenGlTexture1D.field_i) {
              var26 = SetMassDriverReload.field_p - var12 / 2;
              var27 = var8 + var14 + 8;
              var28_int = var11;
              var29_ref_aja = this.getVoteOptionSprite(this.hoveredVoteOptionId, false, 0);
              if (var29_ref_aja != null) {
                var29_ref_aja.draw(var26 + 13, var27 + 11, 0, 16777215 | this.field_U << 24, 1);
              }
              SetBuildViewAutozoomTimeout.a(true, this.field_U, -36 + var26, var27 - 24, 30);
              var30_int = var26 + 160;
              var31 = 29 + var27;
              OpenGlShaderProgram.a(var21, this.field_U, -1, ShipTeamCondition.field_f[this.hoveredVoteOptionId].toUpperCase(), (byte) -106, 2, var31, var30_int);
              var31 = var31 + (36 - GetPointDefenceLaserProjectiles.a(false, 2));
              var32 = ThrusterBehaviour.field_a[this.hoveredVoteOptionId];
              if (var32 != null) {
                IntIndexTable.a(var31, var28_int, var30_int, GetPointDefenceLaserProjectiles.a(false, 4), this.field_U, 0, var32, 4, 56035, -var15 - var30_int + var12 + var26, 0, (byte) -74, -1);
              }
              var33 = null;
              if (!ArchiveIndexLoader.field_g.isVoteOptionNew(this.hoveredVoteOptionId, (byte) -118)) {
                if (!ArchiveIndexLoader.field_g.isVoteOptionComingSoon(this.hoveredVoteOptionId, 4)) {
                  if (ArchiveIndexLoader.field_g.isVoteOptionLimitedTime(this.hoveredVoteOptionId, (byte) -43)) {
                    var33 = igb.field_b;
                  }
                } else {
                  var33 = GetDebrisCollisionDamage.field_o;
                }
              } else {
                var33 = MapClearanceRectangle.field_f;
              }
              if (ArchiveIndexLoader.field_g.isVoteOptionMembersOnly((byte) -126, this.hoveredVoteOptionId)) {
                if (var33 != null) {
                  var33 = (String) (var33) + " " + LegacyOpenGlEnvironmentMappedWaterEffect.field_i;
                } else {
                  if (!ArchiveLoadRequest.a(-118)) {
                    var33 = QuickChatDynamicCommand.field_b;
                  }
                }
              }
              if (var33 != null) {
                var44 = ((String) (var33)).toUpperCase();
                OpenGlShaderProgram.a(56035, this.field_U, -1, var44, (byte) -70, 2, var28_int + var27, var30_int);
              }
              SetMissileLauncherEnergyUsed.a(54236, (byte) 7, 25 + var27, 14.0f, this.field_U, var7 + var13 - 25);
              var34 = 0;
              for (var35_int = 0; param1.players.length > var35_int; var35_int++) {
                var36_ref = (Player) (param1.players[var35_int]);
                if (var36_ref.connected &&
                  var36_ref.votes != null) {
                  var37 = 0;
                  for (var38 = 0; var38 < var36_ref.votes.length; var38++) {
                    if (var36_ref.votes[var38] == this.hoveredVoteOptionId) {
                      var37++;
                    }
                  }
                  if (0 < var37) {
                    var34 = var34 + var37;
                  }
                }
              }
              var35 = Integer.toString(var34);
              SetSelfDestructPrepareToggleCooldown.a(-25 + var13 + var7 + (-(tea.a(1, var35, 13879) / 2) + 1), -1, var27 + 32, var35, 1, 1, (byte) -118);
            }
          }
          if (param2) {
            if (var40.hasNextRound(24416)) {
              var18Lifetime1 = var40.getVotedObjective(6472);
              var45 = SoftLruCache.field_a + "<col=01b5cc>" + ShipTeamCondition.field_f[var18Lifetime1] + "</col>";
              var19 = var45;
              var20 = GetTorqueDownshift.a(var18Lifetime1, -58);
              if (var20 > 1) {
                var19 = var45 + " (" + SetReverbGain.a(bw.field_c, new String[]{Integer.toString(var20 - (var40.getRoundsLeft((byte) 28) - 1))}, 107) + ")";
              }
              SetSelfDestructPrepareToggleCooldown.a(SetMassDriverReload.field_p - (tea.a(4, var19, 13879) >> 1), 1, GetPointDefenceLaserProjectiles.a(false, var16) * 7 / 4 + var14 + var15 - GetPointDefenceLaserProjectiles.a(false, 4), var19, 4, 16777215, (byte) -85);
              var21Lifetime1 = -1;
              if (0 <= this.localPlayerIndex) {
                var21Lifetime1 = param1.getPlayer(this.localPlayerIndex, (byte) 59).selectedTeam;
                if (GetDefaultFiringLeeway.a(param1, (byte) 116)) {
                  var21Lifetime1 = GpuSprite.swapTeamId(21957, var21Lifetime1);
                }
              }
              this.drawObjectiveInstructions(GetPointDefenceLaserProjectiles.a(false, var16) * 7 / 4 + (var15 + var14), 255, var18Lifetime1, var21Lifetime1, 2);
              var49 = var40.getVotedOptions(true);
              var46 = var49;
              var22 = var46;
              if (var22 != null) {
                var23Lifetime1 = 0;
                for (var24Lifetime1 = 14; var49.length > var24Lifetime1; var24Lifetime1++) {
                  if (var49[var24Lifetime1] > 0) {
                    var23Lifetime1++;
                  }
                }
                if (var23Lifetime1 <= 0) {
                  var18Lifetime1 = var40.getPhaseChangeCountdown((byte) 123);
                  if (var18Lifetime1 > 0) {
                    var50 = Integer.toString(var18Lifetime1 / Particle.field_l);
                    var19Lifetime2 = var50;
                    var30 = var19Lifetime2;
                    var19Lifetime2 = var50;
                    var19Lifetime2 = var50;
                    if (var50.length() == 1) {
                      var19Lifetime2 = "0" + var19Lifetime2;
                      var47 = var19Lifetime2;
                      var30Lifetime2 = var47;
                      var19Lifetime2 = var30Lifetime2;
                      var30Lifetime2 = var19Lifetime2;
                      var47Lifetime2 = var30Lifetime2;
                      var30Lifetime2 = var47Lifetime2;
                      var19Lifetime2 = var30Lifetime2;
                    }
                    SetSelfDestructPrepareToggleCooldown.a(var15 + (var13 + 3), -1, var14 + (var15 + 21), var19Lifetime2, var16, 16737792, (byte) -109);
                  }
                  return var6 != 0;
                }
                var24Lifetime1Lifetime1 = 32;
                var25Lifetime1 = SetMassDriverReload.field_p - var23Lifetime1 * var24Lifetime1Lifetime1 / 2;
                for (var26Lifetime1 = 14; var26Lifetime1 < var49.length; var26Lifetime1++) {
                  var27Lifetime1 = var49[var26Lifetime1];
                  if (var27Lifetime1 > 0) {
                    var28 = this.getVoteOptionSprite(var26Lifetime1, false, 1);
                    if (var28 != null) {
                      var29 = 2 * GetPointDefenceLaserProjectiles.a(false, var16) - (-GetPointDefenceLaserProjectiles.a(false, 4) - var14) - var28.getHeight() / 2;
                      for (var30_intLifetime1 = 0; var30_intLifetime1 >= 0; var30_intLifetime1--) {
                        var28.draw(var25Lifetime1 + var30_intLifetime1 * 2, 4 * var30_intLifetime1 + var29, 0, 16777215 | -(var30_intLifetime1 * 255 / var27Lifetime1) + 255 << 24, 1);
                      }
                      if (!(GetUseDetailLines.field_o < var25Lifetime1) &&
                        !(GetUseDetailLines.field_o > var28.getWidth() + var25Lifetime1) &&
                        !(var29 > GetTorpedoReload.field_q) &&
                        !(GetTorpedoReload.field_q > var28.getHeight() + var29)) {
                        var47Lifetime1 = ShipTeamCondition.field_f[var26Lifetime1];
                        var30Lifetime1 = var47Lifetime1;
                        var19Lifetime2 = var30Lifetime1;
                        var30Lifetime1Lifetime1 = var47Lifetime1;
                        var30Lifetime1Lifetime2 = var47Lifetime1;
                        if (var27Lifetime1 > 1) {
                          var30Lifetime1Lifetime2 = var47Lifetime1 + " <times>" + var27Lifetime1;
                          var19Lifetime2 = var30Lifetime1Lifetime2;
                          var19Lifetime2 = var30Lifetime1Lifetime2;
                        }
                        GetMassDriverReload.a(var30Lifetime1Lifetime2, -43);
                      }
                    }
                    var25Lifetime1 = var25Lifetime1 + var24Lifetime1Lifetime1;
                  }
                }
              }
            }
            var18Lifetime1Lifetime1 = var40.getPhaseChangeCountdown((byte) 123);
            if (var18Lifetime1Lifetime1 > 0) {
              var51 = Integer.toString(var18Lifetime1Lifetime1 / Particle.field_l);
              var19Lifetime1 = var51;
              var19Lifetime1Lifetime1 = var51;
              var19Lifetime1Lifetime2 = var51;
              if (var51.length() == 1) {
                var19Lifetime1Lifetime2 = "0" + var19Lifetime1Lifetime2;
              }
              SetSelfDestructPrepareToggleCooldown.a(var15 + (var13 + 3), -1, var14 + (var15 + 21), var19Lifetime1Lifetime2, var16, 16737792, (byte) -109);
            }
          }
          stackIn_150_0 = var6;
          return stackIn_150_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_153_0 = var4;
          stackIn_153_1 = new StringBuilder().append("uca.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_154_2 = "null";
          } else {
            stackIn_154_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_153_0), ((StringBuilder) (Object) stackIn_153_1).append(stackIn_154_2).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean updateRespawnPanel(GameSnapshot param0, byte param1, boolean param2) {
        int var24_int = 0;
        int var34_int = 0;
        int stackIn_20_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_98_0 = 0;
        Object stackIn_131_0;
        int stackIn_131_1;
        int stackIn_131_2;
        float stackIn_131_3;
        int stackIn_132_4 = 0;
        int stackIn_153_0 = 0;
        int stackIn_173_0;
        int stackIn_173_1;
        int stackIn_173_2;
        String stackIn_173_3;
        int stackIn_173_4;
        int stackIn_174_5;
        RuntimeException stackIn_184_0 = null;
        StringBuilder stackIn_184_1 = null;
        String stackIn_185_2 = null;
        RuntimeException decompiledCaughtException = null;
        Ship var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        EscapePod[] var7 = null;
        EscapePod[] var8_ref_it__ = null;
        int var8 = 0;
        int var9 = 0;
        PlayerAction var9_ref_hna = null;
        Random var10_ref_Random = null;
        int var10 = 0;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        float var17 = 0.0f;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Ship[] var23 = null;
        Ship var24 = null;
        int[][] var24_array = null;
        int var25_int = 0;
        Ship var25 = null;
        int var26 = 0;
        int var27 = 0;
        String var28 = null;
        String var29_ref_String = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        ToolkitSprite var34 = null;
        String var34_ref = null;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        String var43_ref_String = null;
        int var43 = 0;
        int var44 = 0;
        EscapePod var45 = null;
        int[][] var46 = null;
        String var48 = null;
        String var49 = null;
        PlayerAction var50 = null;
        String var51 = null;
        ToolkitSprite var52 = null;
        PlayerAction var53 = null;
        PlayerAction var54 = null;
        String var55 = null;
        int[][] var56 = null;
        int[] var59 = null;
        ToolkitSprite var34Lifetime1;
        ToolkitSprite var34Lifetime2;
        String var43_ref_StringLifetime1;
        String var43_ref_StringLifetime2;
        int var9Lifetime1;
        int var11Lifetime1;
        float var17Lifetime1;
        int var25_intLifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var30Lifetime1;
        int var31Lifetime1;
        int var33Lifetime1;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        var44 = VoidHunters.field_G;
        try {
          if (param1 > -30) {
            this.lastEnemyShipSpawnTick = 122;
          }
          if (this.localPlayerIndex >= 0) {
            var4 = param0.world.findShipByOwner(this.localPlayerIndex, 70);
            if (var4 == null) {
              var5 = this.getLocalTeam((byte) -122);
              if (param0.world.isTeamRespawnAllowed(var5, param0.missionState, -14368)) {
                var6 = param0.world.getRespawnProgress(-2003, this.localPlayerIndex);
                var7 = param0.world.getEscapePods(0);
                if (var7 != null) {
                  var8_ref_it__ = var7;
                  var9 = 0;
                  while (var8_ref_it__.length > var9) {
                    var45 = var8_ref_it__[var9];
                    if (var45.owner != this.localPlayerIndex) {
                      var9++;
                      continue;
                    }
                    return false;
                  }
                }
                if (es.field_b != null) {
                  stackIn_20_0 = (es.field_b.blueprint != null) ? 1 : 0;
                } else {
                  stackIn_20_0 = 0;
                }
                var8 = stackIn_20_0;
                if (ValidationStatusIcon.isBlueprintObjective(param0.world.getObjectiveType(false), -4)) {
                  var9_ref_hna = new PlayerAction();
                  var9_ref_hna.specialOrderSubmessage = new SpecialOrderSubmessage();
                  if (var8 == 0) {
                    var10_ref_Random = new Random();
                    var11 = TextHotspotRegion.randomBoundedInt(var10_ref_Random, fa.field_e.length, 122);
                    var12_ref_String = fa.field_e[var11];
                    var13_ref_int__ = GetResourceNodeCaptureTime.a(var12_ref_String, false, true);
                    var9_ref_hna.specialOrderSubmessage.blueprint = new ShipBlueprint();
                    var9_ref_hna.specialOrderSubmessage.blueprint.description = var13_ref_int__;
                  } else {
                    var9_ref_hna.specialOrderSubmessage.blueprint = es.field_b.blueprint;
                  }
                  this.submitPlayerAction(0, true, var9_ref_hna);
                  return false;
                }
                var9Lifetime1 = param0.getPlayer(this.localPlayerIndex, (byte) 59).spawnChoice;
                var10 = 3 + var9Lifetime1;
                var11Lifetime1 = 14;
                var12 = 350;
                var13 = SetMassDriverReload.field_p;
                var14 = var13 - (var12 >> 1);
                var15 = GetLaserAimarc.field_q - 170;
                if (GraphicsPresentException.field_a) {
                  var15 = var15 - (SoftwareRasterizer2D.height - SetToggledScoreboard.field_o.screenY);
                }
                var16 = 260;
                BlackBoxRecording.a((byte) -115, 200, var16, var14, var15, var12);
                var17 = 2.0f;
                if (var10 == 11 ||
                  var10 == 9) {
                  var17 = 1.7999999523162842f;
                }
                var18 = SetWaitForPlayers.a(9);
                var19 = SetRepairModeCooldown.e((byte) -124);
                var20 = var18;
                if (var8 != 0) {
                  stackIn_39_0 = (param0.world.getObjectiveType(false) == 13) ? 1 : 0;
                } else {
                  stackIn_39_0 = 0;
                }
                var21 = stackIn_39_0;
                if (var21 != 0) {
                  var18++;
                  var19++;
                }
                var22 = 0;
                var23 = new Ship[var18];
                for (var24_int = 0; SetWaitForPlayers.a(9) > var24_int; var24_int++) {
                  stackIn_47_0 = (!ArchiveIndexLoader.field_g.isComponentOptionVisible(var24_int + 3, (byte) 34)) ? 0 : 1;
                  var25_int = stackIn_47_0;
                  if (var25_int != 0) {
                    var23[var24_int] = ToolkitViewState.createPresetShip(var24_int + 3, (byte) 72);
                    var22++;
                  }
                }
                if (var21 != 0) {
                  var24 = MenuInputState.createShipFromComponentWords(es.field_b.blueprint.description, (byte) 41);
                  var23[var18 - 1] = var24;
                }
                var56 = new int[var18][];
                var46 = var56;
                var24_array = var46;
                for (var25_intLifetime1 = 0; var18 > var25_intLifetime1; var25_intLifetime1++) {
                  if (var23[var25_intLifetime1] != null) {
                    var23[var25_intLifetime1].updateBounds(0);
                    var59 = var23[var25_intLifetime1].getBoundingbox((byte) -52);
                    var24_array[var25_intLifetime1] = new int[4];
                    for (var27 = 0; var27 < 4; var27++) {
                      var56[var25_intLifetime1][var27] = var59[var27];
                    }
                  }
                }
                var25 = var23[var9Lifetime1];
                if (var9Lifetime1 >= var20) {
                  var26 = Math.max(var25.getBoundingbox((byte) -43)[1] - var25.getBoundingbox((byte) -77)[0], var25.getBoundingbox((byte) -78)[3] - var25.getBoundingbox((byte) -104)[2]);
                  var17 = 85000.0f / (float)var26;
                }
                this.drawShipPreview(16 * SetMinimapWidth.field_o % 8192, var15 + (var16 / 2 + 8), var17, var5, (byte) 100, var25, param0, (var12 >> 1) + var14);
                var26Lifetime1 = this.state.a((byte) 70).getObjectiveType(false);
                var27Lifetime1 = -1;
                if (this.localPlayerIndex >= 0) {
                  var27Lifetime1 = param0.getPlayer(this.localPlayerIndex, (byte) 59).selectedTeam;
                  if (this.state.a((byte) 26).areTeamsSwapped((byte) -49)) {
                    var27Lifetime1 = GpuSprite.swapTeamId(21957, var27Lifetime1);
                  }
                }
                if (var26Lifetime1 >= 0 &&
                  ShipTeamCondition.field_f.length > var26Lifetime1) {
                  var48 = OpenGlRenderbuffer.a(var26Lifetime1, var27Lifetime1, true);
                  SetSelfDestructPrepareToggleCooldown.a(var13 - (tea.a(3, var48, 13879) >> 1), -1, var15 + (var11Lifetime1 + GetPointDefenceLaserProjectiles.a(false, 2) + 2), var48, 4, 56035, (byte) -103);
                  var29_ref_String = ShipTeamCondition.field_f[var26Lifetime1].toUpperCase();
                  var30 = -(tea.a(1, var29_ref_String, 13879) >> 1) + var13;
                  var31 = var15 + var11Lifetime1 + 16;
                  SetSelfDestructPrepareToggleCooldown.a(var30, 1, var31, var29_ref_String, 1, 16777215, (byte) -106);
                }
                var28 = SetSpinningBladeSpinupSpeed.field_o[var10].toUpperCase();
                if (var9Lifetime1 >= var20) {
                  var28 = SetShipTeamActionFactory.field_d;
                }
                SetSelfDestructPrepareToggleCooldown.a(-(tea.a(2, var28, 13879) >> 1) + var13, -1, var15 + (var16 - var11Lifetime1), var28, 2, 16777215, (byte) -101);
                var29 = var12 / var22 + 2;
                var30Lifetime1 = 62;
                if (var30Lifetime1 > var29) {
                  var29 = 4 + var30Lifetime1;
                }
                var31Lifetime1 = 0;
                var32 = (var29 >> 1) + (-(var22 * (var29 >> 1)) + var13);
                var33 = var11Lifetime1 + var16 + var15;
                for (var34_int = 0; var34_int < var18; var34_int++) {
                  var35 = 1;
                  if (var20 > var34_int) {
                    stackIn_82_0 = (!ArchiveIndexLoader.field_g.isComponentOptionVisible(3 + var34_int, (byte) 34)) ? 0 : 1;
                    var35 = stackIn_82_0;
                  } else {
                    var33 = var33 - (var30Lifetime1 + var11Lifetime1);
                    var32 = var11Lifetime1 + (var30Lifetime1 >> 1) + (var12 + var14);
                  }
                  if (var35 != 0) {
                    var36 = var32 - (var30Lifetime1 >> 1);
                    var37 = var33;
                    var38 = ArchiveIndexLoader.field_g.isComponentOptionAvailable(ArchiveLoadRequest.a(-116), 3 + var34_int, (byte) -84) ? 1 : 0;
                    var39 = ArchiveIndexLoader.field_g.isComponentOptionComingSoon(-22549, 3 + var34_int) ? 1 : 0;
                    var40 = ArchiveIndexLoader.field_g.isComponentOptionMembersOnly(3 + var34_int, (byte) 24) ? 1 : 0;
                    BlackBoxRecording.a((byte) -115, 200, var30Lifetime1, var36, var37, var30Lifetime1);
                    if (param2) {
                      if (GetUseDetailLines.field_o >= var36) {
                        if (GetUseDetailLines.field_o < var30Lifetime1 + var36) {
                          if (GetTorpedoReload.field_q >= var37) {
                            stackIn_98_0 = (var37 + var30Lifetime1 <= GetTorpedoReload.field_q) ? 0 : 1;
                          } else {
                            stackIn_98_0 = 0;
                          }
                        } else {
                          stackIn_98_0 = 0;
                        }
                      } else {
                        stackIn_98_0 = 0;
                      }
                    } else {
                      stackIn_98_0 = 0;
                    }
                    var41 = stackIn_98_0;
                    var42 = var9Lifetime1;
                    if (var34_int == var9Lifetime1) {
                      CachedArchiveProvider.a(120, false, var36, var37, var30Lifetime1, var30Lifetime1, 56035);
                      UiToggleButtonRenderer.drawRectangle(125, var36, var30Lifetime1, var37, 56035, var30Lifetime1);
                      UiToggleButtonRenderer.drawRectangle(124, 1 + var36, var30Lifetime1 - 2, 1 + var37, 56035, -2 + var30Lifetime1);
                    } else {
                      if (var41 != 0) {
                        if (var38 != 0) {
                          CachedArchiveProvider.a(120, false, var36, var37, var30Lifetime1, var30Lifetime1, 56035);
                          if (GetBots.field_o == 1 &&
                            !this.field_X) {
                            this.field_X = true;
                            var42 = var34_int;
                          }
                        } else {
                          if (var39 == 0) {
                            GetMassDriverReload.a(QuickChatDynamicCommand.field_b, -20);
                          } else {
                            var49 = GetDebrisCollisionDamage.field_o;
                            var43_ref_String = var49;
                            var43_ref_StringLifetime1 = var49;
                            var43_ref_StringLifetime2 = var49;
                            if (var40 != 0) {
                              var43_ref_StringLifetime2 = var49 + " " + LegacyOpenGlEnvironmentMappedWaterEffect.field_i;
                            }
                            GetMassDriverReload.a(var43_ref_StringLifetime2, -54);
                          }
                        }
                      }
                    }
                    if (var42 != var9Lifetime1) {
                      var50 = new PlayerAction();
                      var50.mousex = ShipTeamConditionFactory.field_a.screenToWorldX(true, GetUseDetailLines.field_o);
                      var50.mousey = ShipTeamConditionFactory.field_a.screenToWorldY(0, GetTorpedoReload.field_q);
                      var50.specialOrderSubmessage = new SpecialOrderSubmessage();
                      var50.specialOrderSubmessage.spawnchoice = new SpawnChoice(var42);
                      this.submitPlayerAction(0, true, var50);
                      GetNebulaFadesOutWhenClose.a(-119, fa.field_d[7]);
                    }
                    if (var41 != 0 &&
                      var38 != 0) {
                      if (var34_int != this.hoveredRespawnOption &&
                        var34_int != var9Lifetime1) {
                        GetNebulaFadesOutWhenClose.a(-112, fa.field_d[0]);
                      }
                      var31Lifetime1 = 1;
                      this.hoveredRespawnOption = var34_int;
                    }
                    var43 = 0;
                    if (3 + var34_int == 11) {
                      var43 = -4;
                    } else {
                      if (var34_int + 3 == 9) {
                        var43 = 3;
                      }
                    }
                    if (var34_int >= var20) {
                      var17Lifetime1 = 27000.0f / (float)Math.max(-var56[var34_int][0] + var56[var34_int][1], -var56[var34_int][2] + var56[var34_int][3]);
                    } else {
                      var17Lifetime1 = 0.5f;
                    }
                    stackIn_131_0 = this;
                    stackIn_131_1 = 0;
                    stackIn_131_2 = var30Lifetime1 / 2 + var33;
                    stackIn_131_3 = var17Lifetime1;
                    if (var34_int != var9Lifetime1) {
                      stackIn_132_4 = var5;
                    } else {
                      stackIn_132_4 = -1;
                    }
                    this.drawShipPreview(stackIn_131_1, stackIn_131_2, stackIn_131_3, stackIn_132_4, (byte) -54, var23[var34_int], param0, var32 + var43);
                    if (var38 == 0) {
                      FixedPointTrigonometry.drawThickLine(16711680, 2, 16994, 4 + var37, 255, var36 + 4, -4 + (var30Lifetime1 + (var36 - 1)), -4 + var30Lifetime1 + (var37 - 1));
                      FixedPointTrigonometry.drawThickLine(16711680, 2, 16994, var30Lifetime1 + var37 - 1 - 4, 255, 4 + var36, -5 + (var36 + var30Lifetime1), 4 + var37);
                    }
                    if (var20 <= var34_int) {
                      OpenGlVertexNormal.field_d[111].draw(var32 + 2, -OpenGlVertexNormal.field_d[111].getPaddedHeight() + var33 + var30Lifetime1);
                    }
                    var32 = var32 + var29;
                  }
                }
                var33Lifetime1 = var11Lifetime1 + (var16 + var15);
                if (param0.world.getObjectiveType(false) == 13) {
                  var52 = OpenGlVertexNormal.field_d[129];
                  var34 = var52;
                  var34Lifetime1 = var52;
                  var34Lifetime2 = var52;
                  var35Lifetime1 = var30Lifetime1 + var33Lifetime1 + var11Lifetime1 * 2;
                  if (param2 &&
                    GetUseDetailLines.field_o >= -(var52.getWidth() / 2) + var13 &&
                    GetUseDetailLines.field_o < var52.getWidth() / 2 + var13) {
                    if (GetTorpedoReload.field_q < -(var52.getHeight() / 4) + var35Lifetime1) {
                      stackIn_153_0 = 0;
                    } else if (GetTorpedoReload.field_q < var52.getHeight() / 4 + var35Lifetime1) {
                      stackIn_153_0 = 1;
                    } else {
                      stackIn_153_0 = 0;
                    }
                  } else {
                    stackIn_153_0 = 0;
                  }
                  var36Lifetime1 = stackIn_153_0;
                  if (var36Lifetime1 != 0 ||
                    SetMachineGunEnergyUsed.field_o[84] &&
                    !this.field_X) {
                    var34Lifetime2 = OpenGlVertexNormal.field_d[130];
                    if ((1 == GetBots.field_o ||
                      SetMachineGunEnergyUsed.field_o[84] &&
                      (null == DialogMessagePanel.field_C ||
                      !DialogMessagePanel.field_C.isOpen(13462))) && !this.field_X) {
                      if (var9Lifetime1 >= var20) {
                        var54 = new PlayerAction();
                        var54.mousex = ShipTeamConditionFactory.field_a.screenToWorldX(true, GetUseDetailLines.field_o);
                        var54.mousey = ShipTeamConditionFactory.field_a.screenToWorldY(0, GetTorpedoReload.field_q);
                        var54.specialOrderSubmessage = new SpecialOrderSubmessage();
                        var54.specialOrderSubmessage.blueprint = es.field_b.blueprint;
                        this.submitPlayerAction(0, true, var54);
                      } else {
                        var53 = new PlayerAction();
                        var53.mousex = ShipTeamConditionFactory.field_a.screenToWorldX(true, GetUseDetailLines.field_o);
                        var53.mousey = ShipTeamConditionFactory.field_a.screenToWorldY(0, GetTorpedoReload.field_q);
                        var53.specialOrderSubmessage = new SpecialOrderSubmessage();
                        var53.specialOrderSubmessage.spawnchoice = new SpawnChoice(var9Lifetime1);
                        this.submitPlayerAction(0, true, var53);
                      }
                      GetNebulaFadesOutWhenClose.a(-116, fa.field_d[7]);
                      this.field_X = true;
                    }
                    var31Lifetime1 = 1;
                    var37Lifetime1 = var19;
                    if (this.hoveredRespawnOption != var37Lifetime1 &&
                      var37Lifetime1 != var9Lifetime1) {
                      GetNebulaFadesOutWhenClose.a(-119, fa.field_d[0]);
                    }
                    this.hoveredRespawnOption = var37Lifetime1;
                  }
                  var34Lifetime2.draw(-(var34Lifetime2.getWidth() / 2) + var13, -(var34Lifetime2.getHeight() / 2) + var35Lifetime1);
                  var55 = BombletSprayWeaponDefinition.field_c;
                  stackIn_173_0 = var13 - tea.a(2, var55, 13879) / 2;
                  stackIn_173_1 = -1;
                  stackIn_173_2 = 6 + var35Lifetime1;
                  stackIn_173_3 = var55;
                  stackIn_173_4 = 2;
                  if (var36Lifetime1 != 0) {
                    stackIn_174_5 = 15658751;
                  } else {
                    stackIn_174_5 = 13421772;
                  }
                  SetSelfDestructPrepareToggleCooldown.a(stackIn_173_0, stackIn_173_1, stackIn_173_2, stackIn_173_3, stackIn_173_4, stackIn_174_5, (byte) -102);
                } else {
                  var51 = Integer.toString(var6 / 50);
                  var34_ref = var51;
                  if (1 == var51.length()) {
                    var34_ref = "0" + var51;
                  }
                  SoftwareDepthBuffer.a(16541441, -var11Lifetime1 + (var15 + var16), -var11Lifetime1 + (var13 + var12 / 2), (byte) 74, -1, 1, var34_ref);
                }
                if (var31Lifetime1 == 0) {
                  this.hoveredRespawnOption = -1;
                }
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_184_0 = var4_ref;
          stackIn_184_1 = new StringBuilder().append("uca.FD(");
          if (param0 == null) {
            stackIn_185_2 = "null";
          } else {
            stackIn_185_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_184_0), ((StringBuilder) (Object) stackIn_184_1).append(stackIn_185_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void drawSpecialOrderTooltip(int param0) {
        SpecialOrderDefinition var2 = null;
        int var3 = 0;
        String var4 = null;
        if (this.pendingSpecialOrderId >= 0 &&
          this.pendingSpecialOrderId < 13) {
          var2 = CarouselPlayerEvent.specialOrderDefinitions[this.pendingSpecialOrderId];
          var3 = var2.getIconId((byte) 85);
          PlayerActionFactory.a(var3, 20 + GetUseDetailLines.field_o, (byte) 84, GetTorpedoReload.field_q);
          var4 = GetGrapplingHookSpringConstant.specialOrderLabels[this.pendingSpecialOrderId].toUpperCase();
          SetSelfDestructPrepareToggleCooldown.a(50 + GetUseDetailLines.field_o, 1, GetTorpedoReload.field_q + 20, var4, 2, 16777215, (byte) -92);
        }
        if (param0 != 15097) {
          this.drawDebugOverlay(true);
        }
    }

    private final void drawWorldGlow(int param0, int param1, int param2, int param3) {
        SetMissileLauncherEnergyUsed.a(param2 * 131586 + 8947848, (byte) 7, ShipTeamConditionFactory.field_a.worldToScreenY(true, param3), ShipTeamConditionFactory.field_a.scale * 512.0f, 200, ShipTeamConditionFactory.field_a.worldToScreenX(param1, (byte) 117));
        if (param0 != -7178) {
          this.toggleChatVisibility(true);
        }
    }

    private final void updateShipVisibility(boolean param0, ResourceNode[] param1, Ship param2, EscapePod[] param3, Ship[] param4, boolean param5) {
        String discarded$0 = null;
        int var9_int = 0;
        int var8 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        Ship[] var8_ref_sg__ = null;
        Nebula[] var9 = null;
        Ship var9_ref = null;
        Ship var10 = null;
        int var11 = 0;
        Ship var12 = null;
        int var13 = 0;
        int var14 = 0;
        Nebula var15 = null;
        int var16 = 0;
        String var17 = null;
        Ship[] var18 = null;
        Nebula[] var19 = null;
        Ship var20 = null;
        Ship var21 = null;
        World var22 = null;
        Ship[] var23 = null;
        Nebula[] var9Lifetime1;
        Ship var12Lifetime1;
        Nebula var15Lifetime1;
        Nebula[] var19Lifetime1;
        World var22Lifetime1;
        Ship[] var23Lifetime1;
        Ship var12Lifetime1Lifetime1;
        Nebula var15Lifetime1Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var13Lifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        var16 = VoidHunters.field_G;
        try {
          if (param0) {
            var17 = (String) null;
            discarded$0 = this.revealString(111, 15, (byte) -20, (String) null);
          }
          var7_int = this.getLocalTeam((byte) -126);
          var18 = param4;
          var8_ref_sg__ = var18;
          for (var9_int = 0; var9_int < var18.length; var9_int++) {
            var20 = var18[var9_int];
            var10 = var20;
            if (var10 != null) {
              var20.clearVisibilityFlags(90);
            }
          }
          if (param5) {
            for (var8 = 0; param4.length > var8; var8++) {
              var21 = param4[var8];
              var9_ref = var21;
              if (var9_ref != null && (var21.getTeam((byte) 103) != var7_int ||
                ToolkitRasterState.field_c == var7_int &&
                var9_ref != param2)) {
                this.markShipOutsideSensorRange(param2, param1, var21, param3, var7_int, -116, param4);
              }
            }
            var22 = this.state.a((byte) 90);
            var19 = var22.getNebulae((byte) -93);
            var9 = var19;
            if (var9 == null) {
              return;
            }
            if (0 >= var19.length) {
              return;
            }
            var23 = param4;
            for (var11 = 0; var11 < var23.length; var11++) {
              var12 = var23[var11];
              if (var12 != null &&
                var22.partitioningManager != null) {
                var13 = var22.partitioningManager.collectBodyIds(-1, var12.getBoundingbox((byte) -63), 0, -122);
                for (var14 = 0; var14 < var13; var14++) {
                  var15 = var9[PartitionZoneListFactory.field_a[var14]];
                  if (var15 != null &&
                    var15.containsPoint((byte) 100, var12.getX(false), var12.getY((byte) 117))) {
                    var12.addVisibilityFlags(0, 1);
                    break;
                  }
                }
              }
            }
            return;
          }
          var22Lifetime1 = this.state.a((byte) 90);
          var19Lifetime1 = var22Lifetime1.getNebulae((byte) -93);
          var9Lifetime1 = var19Lifetime1;
          if (var9Lifetime1 != null &&
            0 < var19Lifetime1.length) {
            var23Lifetime1 = param4;
            var11Lifetime1 = 0;
            if (var11Lifetime1 < var23Lifetime1.length) {
              var12Lifetime1 = var23Lifetime1[var11Lifetime1];
              if (var12Lifetime1 != null &&
                var22Lifetime1.partitioningManager != null) {
                var13Lifetime1 = var22Lifetime1.partitioningManager.collectBodyIds(-1, var12Lifetime1.getBoundingbox((byte) -63), 0, -122);
                for (var14Lifetime1 = 0; var14Lifetime1 < var13Lifetime1; var14Lifetime1++) {
                  var15Lifetime1 = var9Lifetime1[PartitionZoneListFactory.field_a[var14Lifetime1]];
                  if (var15Lifetime1 != null &&
                    var15Lifetime1.containsPoint((byte) 100, var12Lifetime1.getX(false), var12Lifetime1.getY((byte) 117))) {
                    var12Lifetime1.addVisibilityFlags(0, 1);
                    break;
                  }
                }
              }
              while (true) {
                var11Lifetime1++;
                if (var11Lifetime1 >= var23Lifetime1.length) {
                  return;
                }
                var12Lifetime1Lifetime1 = var23Lifetime1[var11Lifetime1];
                if (var12Lifetime1Lifetime1 == null) {
                  continue;
                }
                if (var22Lifetime1.partitioningManager == null) {
                  continue;
                }
                var13Lifetime1Lifetime1 = var22Lifetime1.partitioningManager.collectBodyIds(-1, var12Lifetime1Lifetime1.getBoundingbox((byte) -63), 0, -122);
                var14Lifetime1Lifetime1 = 0;
                while (var14Lifetime1Lifetime1 < var13Lifetime1Lifetime1) {
                  var15Lifetime1Lifetime1 = var9Lifetime1[PartitionZoneListFactory.field_a[var14Lifetime1Lifetime1]];
                  if (var15Lifetime1Lifetime1 != null &&
                    var15Lifetime1Lifetime1.containsPoint((byte) 100, var12Lifetime1Lifetime1.getX(false), var12Lifetime1Lifetime1.getY((byte) 117))) {
                    var12Lifetime1Lifetime1.addVisibilityFlags(0, 1);
                    break;
                  }
                  var14Lifetime1Lifetime1++;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_47_0 = var7;
          stackIn_47_1 = new StringBuilder().append("uca.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (param2 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
          if (param3 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',');
          if (param4 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void drawRespawnWarnings(GameSnapshot param0, int param1) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        String var9 = null;
        String var10 = null;
        int var7Lifetime1;
        try {
          var3_int = param0.world.isTeamRespawnEnabled(true, 0, param0.missionState) ? 1 : 0;
          var4 = param0.world.isTeamRespawnEnabled(true, param1, param0.missionState) ? 1 : 0;
          var5 = null;
          var6 = 16777215;
          if (var3_int == 0 &&
            var4 == 0) {
            var5_ref = GetLaserReload.field_o;
          } else {
            if (var3_int == 0) {
              var5_ref = SetReverbGain.a(Widget.field_H, new String[]{GpuVertexBufferOwner.teamNames[0]}, param1 + 74);
              var6 = AlphaContainer.getTeamColor(false, 0, 13894143);
            } else {
              if (var4 != 0) {
                if (var5 != null) {
                  var9 = ((String) (var5)).toUpperCase();
                  var7 = 2;
                  SetSelfDestructPrepareToggleCooldown.a(SetMassDriverReload.field_p - tea.a(var7, var9, param1 + 13878) / 2, 1, GetPointDefenceLaserProjectiles.a(false, var7) + 42, var9, var7, var6, (byte) -84);
                }
                return;
              }
              var5_ref = SetReverbGain.a(Widget.field_H, new String[]{GpuVertexBufferOwner.teamNames[1]}, 99);
              var6 = AlphaContainer.getTeamColor(false, 1, 13894143);
            }
          }
          if (var5_ref != null) {
            var10 = var5_ref.toUpperCase();
            var7Lifetime1 = 2;
            SetSelfDestructPrepareToggleCooldown.a(SetMassDriverReload.field_p - tea.a(var7Lifetime1, var10, param1 + 13878) / 2, 1, GetPointDefenceLaserProjectiles.a(false, var7Lifetime1) + 42, var10, var7Lifetime1, var6, (byte) -84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("uca.CC(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int calculateEdgeFadeAlpha(int param0, int param1, int param2, int param3) {
        if (param2 > -78) {
          this.checkObfuscationGuard((byte) -1);
        }
        int var5 = param3 - param0;
        int var6 = 0;
        if (param1 > var5) {
          var6 = (-var5 + param1) * 255 / param1;
        }
        if (param0 < param1) {
          var6 = (-param0 + param1) * 255 / param1;
        }
        return var6;
    }

    private final void drawShipHud(GameSnapshot param0, int param1) {
        boolean discarded$0 = false;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ToolkitSprite var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Ship var21 = null;
        Ship var22 = null;
        int var11Lifetime1;
        int var12Lifetime1;
        var20 = VoidHunters.field_G;
        try {
          if (param1 != 16731136) {
            var21 = (Ship) null;
            this.drawBlueprintBuildPreview(-18, (GameSnapshot) null, 77, false, (Ship) null);
          }
          var22 = param0.world.findShipByOwner(this.localPlayerIndex, 102);
          if (var22 != null) {
            if (5 == param0.missionState.getMissionPhase(8)) {
              if (GetSniperCannonAimarc.field_p > 0 &&
                HighscoreValueRequest.field_d > 0) {
                boolean decompiledFrameRemainder0 = true;
                var4_int = GetSniperCannonAimarc.field_p;
                var5 = PartitionZoneFactory.field_a - (12 + var4_int);
                var6 = -HighscoreValueRequest.field_d - 12 + (MissionVariableFactory.field_a + SetToggledScoreboard.field_o.screenY - SoftwareRasterizer2D.height);
                if ((this.tutorialController != null &&
                  !this.tutorialController.isHintComplete(1, true)) &&
                  (decompiledFrameRemainder0 = !(!this.tutorialController.isHintVisible(1, -34)))) {
                  decompiledFrameRemainder0 = !(SetMinimapWidth.field_o % 20 <= 10);
                }
                if (decompiledFrameRemainder0) {
                  var7_int = var22.getEnergyProgress(86);
                  if (var22.isReloading((byte) -90)) {
                    var7_int = var22.getReloadProgress((byte) -64);
                  }
                  var8 = var22.getMaxEnergy(true);
                  var9 = var7_int * var4_int / 255;
                  var10 = 256 * var7_int + 65536 * (-var7_int + 255);
                  if (this.field_i < 255) {
                    var6 = var6 + ((-this.field_i + 255) * (2 * HighscoreValueRequest.field_d) >> 8);
                    var5 = var5 + ((32 + var4_int) * (-this.field_i + 255) >> 8);
                  }
                  PlayerJoinFactory.a(var6, HighscoreValueRequest.field_d, GetGrapplingHookAimarc.a(param1 ^ -46080, var10), var9, var5, var10, 0);
                  for (var11 = 125; var11 < var8; var11 += 125) {
                    var12 = var11 * var4_int / var8 + var5;
                    DelayedPacket.drawLine(var6 + 2, var12, var12, var6, -16777216, 4473924);
                  }
                  var11Lifetime1 = 17;
                  var12Lifetime1 = 2;
                  if (OpenGlTexture1D.field_i) {
                    var13 = -1;
                    if (var22.isReloading((byte) -90)) {
                      var13 = -65536;
                    }
                    var14 = OpenGlVertexNormal.field_d[44];
                    if (!var22.isReloading((byte) -90)) {
                      var14.draw(var5 - var11Lifetime1, var6 - var12Lifetime1, 0, var13, 1);
                    } else {
                      var15 = 100 + Math.abs(-11 + SetMinimapWidth.field_o % 20);
                      var16 = var14.getWidth();
                      var17 = var14.getHeight();
                      var18 = var16 * var15 / 100;
                      var19 = var17 * var15 / 100;
                      var14.drawScaled(-var11Lifetime1 + (var5 - (-var16 + var18) / 2), -((var19 - var17) / 2) + (-var12Lifetime1 + var6), var18, var19, 2, 16731136, 1);
                      var14.drawScaled(var5 + (-var11Lifetime1 - (-var16 + var18) / 2), var6 - var12Lifetime1 - (-var17 + var19) / 2, var18, var19, 1, var13, 1);
                    }
                  }
                }
                if (null != this.tutorialController &&
                  this.tutorialController.isHintVisible(1, -53)) {
                  var7 = TorpedoWeaponDefinition.field_d;
                  GetLagStandardDeviationOut.a(-1, var7, 16777215, -10 + var6, var4_int / 2 + var5 - GetPhasedEnergyBeamProjectiles.a(-112, var7) / 2, 4266);
                }
              }
              discarded$0 = this.updateSpecialOrderMenu((byte) 61, true, param0);
            }
            if (param0.world.hasHomingProjectileTargeting(var22.getId(false), param1 - 16731016)) {
              var4 = SpawnChoiceFactory.field_a.toUpperCase();
              if (SetMinimapWidth.field_o % 20 > 10) {
                SetSelfDestructPrepareToggleCooldown.a(SetMassDriverReload.field_p - (tea.a(2, var4, 13879) >> 1), -1, -50 + MissionVariableFactory.field_a, var4, 2, 16711680, (byte) -122);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("uca.J(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawSessionNotifications(GameSnapshot param0, int param1) {
        int var3_int = 0;
        Player var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (this.lastEnemyShipSpawnTick != param1) {
            var3_int = SetMinimapWidth.field_o - this.lastEnemyShipSpawnTick;
            if (Particle.field_d > var3_int) {
              ArmBehaviour.a(1, 116, param1 ^ -201, GetMachineGunPulsetime.field_p);
            }
          }
          if (this.localPlayerIndex >= 0) {
            var3 = param0.getPlayer(this.localPlayerIndex, (byte) 59);
            var4 = var3.unassignedForAutobalanceTimer;
            if (var3 != null) {
              if (var4 <= 0) {
                return;
              }
              var5 = this.calculateScaledEdgeFadeAlpha(255, var4, 50, -8464);
              SetBombletSprayEnergyUsed.a(var5, (byte) -124, 1, ResourceArchive.field_b, 200);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("uca.WC(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updateSession(byte param0, boolean param1) {
        boolean stackIn_25_1 = false;
        int stackIn_38_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_70_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        GameSnapshot var9;
        Object var10;
        int var11;
        int var12;
        int var13_int;
        long var13_long;
        String var13;
        long var15;
        int var17;
        String var18;
        String var19;
        int var20;
        Ship var22;
        Ship var23;
        Ship var24;
        Player var25;
        int[] var28;
        int var12Lifetime1;
        int var13_intLifetime1;
        var17 = VoidHunters.field_G;
        this.uiBlocksWorldInput = false;
        if (ssa.b(2)) {
          GetPointDefenceLaserProjectileInterceptDamage.a(SetMachineGunEnergyUsed.field_o, this.previousKeyStates, (byte) 79);
        }
        this.updateChatControls((byte) 119, param1);
        var3 = 0;
        var4 = 0;
        var5 = -1;
        var6 = -1;
        var7 = -1;
        var8 = -1;
        this.activeSpecialOrderId = -1;
        var9 = this.state.b(1);
        var10 = null;
        if (this.localPlayerIndex >= 0) {
          var24 = var9.world.findShipByOwner(this.localPlayerIndex, 54);
          var10 = var24;
          if (!this.networked &&
            GetBuildViewAutozoomEndOnAction.a(61848)) {
            var28 = VariableConditionFactory.a(99);
            if (var24 != null) {
              var23 = MenuInputState.createShipFromComponentWords(var28, (byte) 27);
              var23.setTeam(17704, 1);
              var23.setAi(new ShipAI(), 4);
              this.state.b(1).world.addShip(var23, (byte) 92);
            } else {
              var22 = MenuInputState.createShipFromComponentWords(var28, (byte) 27);
              var22.setOwner(0, -117);
              this.state.b(1).world.addShip(var22, (byte) 124);
              this.state.b(1).world.clearTerrainAroundEntities(0);
            }
          }
          if (this.field_x) {
            this.tutorialController.updatePracticeScenario(MissionVariableFactory.field_a, var9, 127, PartitionZoneFactory.field_a, var24, this.localPlayerIndex, ShipTeamConditionFactory.field_a);
          }
          var25 = var9.getPlayer(this.localPlayerIndex, (byte) 59);
          var7 = var25.aimtargetx;
          var4 = var25.triggers;
          var8 = var25.aimtargety;
        }
        var11 = 0;
        if (param1) {
          var12 = DebugRequestFactory.field_a;
          if (TiledSpriteTextureOperation.field_r) {
            var12 = GrappleLauncherBehaviour.field_b;
          }
          if (SetRepairModeCooldown.field_o) {
            if (SetMachineGunEnergyUsed.field_o[var12] &&
              !this.previousKeyStates[var12]) {
              stackIn_25_1 = !(this.scoreboardVisible);
              this.scoreboardVisible = stackIn_25_1;
            }
          } else {
            this.scoreboardVisible = SetMachineGunEnergyUsed.field_o[var12];
          }
          if (GraphicsPresentException.field_a) {
            if (!SetFightersPerPlayerMaximum.field_p &&
              !LegacyOpenGlTurbulenceEffect.field_d) {
              stackIn_38_0 = 1;
            } else {
              if (this.localPlayerIndex < 0) {
                stackIn_38_0 = (!GetSniperCannonProjectiles.chatVisible) ? 1 : 0;
              } else {
                stackIn_38_0 = 0;
              }
            }
          } else {
            stackIn_38_0 = 1;
          }
          var13_int = stackIn_38_0;
          if (!this.uiBlocksWorldInput &&
            var13_int != 0) {
            this.updateCameraPanAndZoom(0, (Ship) (var10), var9);
          }
          boolean decompiledFrameRemainder0 = true;
          if (var13_int != 0 &&
            this.localPlayerIndex >= 0 && (GetUseDetailLines.field_o != -1 ||
            GetTorpedoReload.field_q != -1)) {
            var5 = ShipTeamConditionFactory.field_a.screenToWorldX(true, GetUseDetailLines.field_o);
            var6 = ShipTeamConditionFactory.field_a.screenToWorldY(0, GetTorpedoReload.field_q);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (var13_int == 0) {
              var5 = ShipTeamConditionFactory.field_a.screenToWorldX(true, GetUseDetailLines.field_o);
              var6 = ShipTeamConditionFactory.field_a.screenToWorldY(0, GetTorpedoReload.field_q);
            }
          }
          var3 = this.updateActionInput(var5, var6, var13_int != 0, var9, 2, var3);
          stackIn_53_0 = (!this.updateCameraFollowAndAutoZoom(var6, var9, var5, var3, -126)) ? 0 : 1;
          var11 = stackIn_53_0;
        }
        if (var11 == 0) {
          ShipTeamConditionFactory.field_a.scale = ShipTeamConditionFactory.field_a.scale + (this.manualZoomScale - ShipTeamConditionFactory.field_a.scale) / 4.0f;
        }
        sh.expireDebugArrows(20824);
        this.submitPlayerInputChanges(var5, var8, var3, var4, var6, var7, param1, 109);
        if (this.state.carouselInfo.isReplay(1) &&
          SetMachineGunEnergyUsed.field_o[35] &&
          !this.previousKeyStates[35]) {
          FlipTextureOperation.field_l.startBlackBoxReplay(this.state.carouselInfo, -128);
        }
        if (param0 < 61) {
          return;
        }
        this.checkObfuscationGuard((byte) 110);
        GetReverbWidth.a(ShipTeamConditionFactory.field_a, -8077);
        if (this.networked) {
          stackIn_70_0 = (FlipTextureOperation.field_l.sendReadyIfNeeded((byte) 110, this.state.carouselInfo, this.localPlayerIndex, RequestNewestBlackboxRecording.field_p)) ? 1 : 0;
        } else {
          stackIn_70_0 = 0;
        }
        var12Lifetime1 = stackIn_70_0;
        if (var12Lifetime1 == 0) {
          var13_long = SetUseTriFill.field_o.nanoTime((byte) -110);
          this.state.c(125);
          var15 = SetUseTriFill.field_o.nanoTime((byte) -110);
          this.updateTimingGraph.addSample(var15 - var13_long, (byte) -115);
          this.field_K.a(this.localPlayerIndex, var9, (byte) 70, var9.world.findShipByOwner(this.localPlayerIndex, 88));
        }
        var20 = 0;
        var13_intLifetime1 = var20;
        while (SetMachineGunEnergyUsed.field_o.length > var20) {
          this.previousKeyStates[var20] = SetMachineGunEnergyUsed.field_o[var20];
          var20++;
        }
        if (this.localPlayerIndex >= 0 &&
          this.networked &&
          Particle.field_E < GetCountermeasureLauncherEnergyUsed.field_o &&
          Particle.field_E < ProxySocketConnector.field_f) {
          if (var10 == null &&
            !var9.world.isTeamRespawnAllowed(this.getLocalTeam((byte) 107), var9.missionState, -14368)) {
            return;
          }
          var13 = SetReverbGain.a(OpenGlVertexNormal.field_b, new String[]{Integer.toString(Particle.field_E / (Particle.field_l * 60))}, 95);
          var19 = (String) null;
          var18 = (String) null;
          lh.a((byte) -123, 0, (String) null, (String) null, var13, 2);
          GetNebulaFadesOutWhenClose.a(AgeValidator.field_f, false, (byte) -85, -5);
        }
        return;
    }

    final void recordEnemyShipSpawn(int param0) {
        this.lastEnemyShipSpawnTick = SetMinimapWidth.field_o;
        if (param0 != -31407) {
          this.updateVoteGrid((GameSnapshot) null, -69, -35, -5, -16, -101, 6, -115, 36, 37, 76, -40, true);
        }
    }

    final void sendDrawAction(boolean param0) {
        int discarded$0 = 0;
        if (!this.networked) {
          throw new IllegalStateException();
        }
        RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, 59);
        if (!param0) {
          Ship var3 = (Ship) null;
          discarded$0 = this.drawWeaponTargetGuide(-44, -67, -14, -107, (Ship) null);
        }
    }

    private final void updateCameraPanAndZoom(int param0, Ship param1, GameSnapshot param2) {
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        float var9 = 0.0f;
        float var10 = 0.0f;
        GameSnapshot var11 = null;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          if (!this.networked) {
            stackIn_11_0 = 1;
          } else {
            if (SetFightersPerPlayerMaximum.field_p) {
              if (this.localPlayerIndex < 0) {
                stackIn_11_0 = (!GetSniperCannonProjectiles.chatVisible) ? 1 : 0;
              } else {
                stackIn_11_0 = 0;
              }
            } else {
              stackIn_11_0 = 1;
            }
          }
          boolean decompiledFrameRemainder2 = true;
          var4_int = stackIn_11_0;
          if (this.localPlayerIndex >= 0) {
            if (param1 != null) {
              stackIn_21_0 = 0;
              decompiledFrameRemainder2 = false;
            }
            else {
              if (param2.world.findEscapePodByOwner((byte) -121, this.localPlayerIndex) != null) {
                stackIn_21_0 = 0;
                decompiledFrameRemainder2 = false;
              }
            }
          }
          if (decompiledFrameRemainder2) {
            stackIn_21_0 = (var4_int != 0) ? 1 : 0;
          }
          var5 = stackIn_21_0;
          if (this.localPlayerIndex >= 0) {
            if (param1 == null &&
              param2.world.findEscapePodByOwner((byte) 38, this.localPlayerIndex) == null) {
              stackIn_33_0 = 1;
            } else {
              if (!param2.world.getDebug((byte) 33)) {
                stackIn_33_0 = (this.state.carouselInfo.isReplay(1)) ? 1 : 0;
              } else {
                stackIn_33_0 = 1;
              }
            }
          } else {
            stackIn_33_0 = 1;
          }
          var6 = stackIn_33_0;
          if (var5 != 0 &&
            SetMachineGunEnergyUsed.field_o[SetFixedaim.field_q] ||
            var6 != 0 &&
            SetMachineGunEnergyUsed.field_o[98]) {
            ShipTeamConditionFactory.field_a.worldCenterY = ShipTeamConditionFactory.field_a.worldCenterY - 8.0f / ShipTeamConditionFactory.field_a.scale;
          }
          if (var5 != 0 &&
            SetMachineGunEnergyUsed.field_o[SetCountermeasureLauncherAimspeed.field_q] ||
            var6 != 0 &&
            SetMachineGunEnergyUsed.field_o[99]) {
            ShipTeamConditionFactory.field_a.worldCenterY = ShipTeamConditionFactory.field_a.worldCenterY + 8.0f / ShipTeamConditionFactory.field_a.scale;
          }
          if (var5 != 0 &&
            SetMachineGunEnergyUsed.field_o[UnsupportedGpuMaterialEffect.field_f] ||
            var6 != 0 &&
            SetMachineGunEnergyUsed.field_o[97]) {
            ShipTeamConditionFactory.field_a.worldCenterX = ShipTeamConditionFactory.field_a.worldCenterX + 8.0f / ShipTeamConditionFactory.field_a.scale;
          }
          if (var5 != 0 &&
            SetMachineGunEnergyUsed.field_o[SetSalvoaim.field_p] ||
            var6 != 0 &&
            SetMachineGunEnergyUsed.field_o[96]) {
            ShipTeamConditionFactory.field_a.worldCenterX = ShipTeamConditionFactory.field_a.worldCenterX - 8.0f / ShipTeamConditionFactory.field_a.scale;
          }
          boolean decompiledFrameRemainder1 = true;
          if (var4_int != 0 && (SetMachineGunEnergyUsed.field_o[GetUseCircleOutline.field_p] &&
            !this.previousKeyStates[GetUseCircleOutline.field_p] ||
            SetMachineGunEnergyUsed.field_o[GetPointDefenceLaserRandomness.field_r] &&
            !this.previousKeyStates[GetPointDefenceLaserRandomness.field_r])) {
            stackIn_70_0 = 1;
            decompiledFrameRemainder1 = false;
          }
          else {
            stackIn_70_0 = 0;
          }
          boolean decompiledFrameRemainder0 = true;
          var7 = stackIn_70_0;
          if (var4_int != 0 && (SetMachineGunEnergyUsed.field_o[GetTorpedoProjectileLife.field_o] &&
            !this.previousKeyStates[GetTorpedoProjectileLife.field_o] ||
            SetMachineGunEnergyUsed.field_o[PlayerAction.field_n] &&
            !this.previousKeyStates[PlayerAction.field_n])) {
            stackIn_79_0 = 1;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_79_0 = 0;
          }
          var8 = stackIn_79_0;
          if (!(GetPointDefenceLaserPulsetime.field_o >= param0) ||
            var7 != 0) {
            if (0 >= this.autoZoomTicks) {
              this.manualZoomScale = this.manualZoomScale * 2.0f;
            } else {
              this.autoZoomTicks = 0;
            }
          }
          if (!(GetPointDefenceLaserPulsetime.field_o <= 0) ||
            var8 != 0) {
            if (this.autoZoomTicks > 0) {
              this.autoZoomTicks = 0;
            } else {
              this.manualZoomScale = this.manualZoomScale / 2.0f;
            }
          }
          var9 = 0.00006103515625f;
          var10 = 0.0078125f;
          var11 = (GameSnapshot) (this.state.carouselInfo.getVisibleState(28120));
          if (var11 != null && (var11.world.getDebug((byte) 41) ||
            this.state.carouselInfo.isReplay(1))) {
            var10 = var10 * 8.0f;
          }
          if (!(var9 > this.manualZoomScale)) {
            if (this.manualZoomScale > var10) {
              this.manualZoomScale = var10;
            }
          } else {
            this.manualZoomScale = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_104_0 = var4;
          stackIn_104_1 = new StringBuilder().append("uca.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          stackIn_107_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',');
          if (param2 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(')').toString());
        }
    }

    private final boolean isFogOfWarActive(byte param0, GameSnapshot param1) {
        RuntimeException var3 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 46) {
            this.voteHighlightAlphas = (int[]) null;
          }
          stackIn_9_0 = (GuestPlayNoticePanel.fogOfWarOn == 1) && (null != param1.missionState) && (param1.missionState.getMissionPhase(param0 ^ 38) == 5) && (!SetMissionTerrainDebrisProbability.field_p) && (!this.hasArmageddonStarted((byte) 94, param1.world, param1.missionState));
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("uca.EB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void drawBlueprintBuildPreview(int param0, GameSnapshot param1, int param2, boolean param3, Ship param4) {
        int var25 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        Camera2D var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        float var14_float = 0.0f;
        int var14 = 0;
        float var15_float = 0.0f;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Debris[] var24 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        Debris[] var29_ref_nbb__ = null;
        int var29 = 0;
        int var30_int = 0;
        String var30 = null;
        Debris var31 = null;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        Ship var36 = null;
        Ship var37 = null;
        var35 = VoidHunters.field_G;
        try {
          if (null != es.field_b &&
            es.field_b.blueprint != null &&
            null != es.field_b.blueprint.description) {
            var36 = MenuInputState.createShipFromComponentWords(es.field_b.blueprint.description, (byte) 60);
            var37 = var36;
            var7 = new Camera2D();
            var8 = 512;
            var9 = 256;
            var10 = (int)((float)var8 / var7.scale);
            var11 = (int)((float)var9 / var7.scale);
            var12 = var36.getBoundingbox((byte) -43)[1] - var36.getBoundingbox((byte) -93)[0];
            var13 = var36.getBoundingbox((byte) -72)[3] - var36.getBoundingbox((byte) -54)[2];
            if (var12 > var10 ||
              var13 > var11) {
              var14_float = (float)var12 / (float)var10;
              var15_float = (float)var13 / (float)var11;
              if (var14_float > var15_float) {
                var7.scale = var7.scale / var14_float;
              } else {
                var7.scale = var7.scale / var15_float;
              }
            }
            var14 = (int)((float)var12 * var7.scale);
            var15 = (int)(var7.scale * (float)var13);
            var16 = param0;
            if (-16 + (var16 - var14 / 2) < 0) {
              var16 = var14 / 2 + 16;
            }
            var17 = -12 - var15 / 2 + param2;
            var18 = 4;
            var19 = var16 - (var14 / 2 + var18);
            var20 = -(var15 / 2) + (var17 - var18);
            var21 = 2 * var18 + var14;
            var22 = var15 + 2 * var18;
            CachedArchiveProvider.a(200, false, var19, var20, var22, var21, 1);
            UiToggleButtonRenderer.drawRectangle(113, var19, var22, var20, 11184810, var21);
            var7.worldCenterX = (float)((var37.getBoundingbox((byte) -98)[0] + var37.getBoundingbox((byte) -49)[1]) / 2);
            var7.worldCenterY = (float)((var37.getBoundingbox((byte) -101)[2] + var37.getBoundingbox((byte) -39)[3]) / 2);
            var7.screenOriginY = var17;
            var7.screenOriginX = var16;
            var37.draw(var7, 122, (World) null);
            var23 = GetPointDefenceLaserProjectiles.a(param3, 3);
            var24 = param1.world.getDebris((byte) -33);
            for (var25 = 0; 56 > var25; var25++) {
              var26 = var37.chassis.countType(var25, 0) - param4.chassis.countType(var25, 0);
              if (0 < var26) {
                var27 = 0;
                var28 = 0;
                var29_ref_nbb__ = var24;
                var30_int = 0;
                scanLoop1: while (true) {
                  if (var29_ref_nbb__.length > var30_int) {
                    var31 = var29_ref_nbb__[var30_int];
                    if (var31 != null &&
                      var31.chassis.countType(var25, 0) > 0) {
                      var28 = 1;
                      var32 = var31.getX(false) - param4.getX(false);
                      var33 = var31.getY((byte) -116) - param4.getY((byte) -15);
                      var34 = TextLayout.approximateVectorLength(var32, (byte) 125, var33);
                      if (var34 < SettingsChangeFactory.field_c) {
                        var27 = 1;
                        break scanLoop1;
                      }
                    }
                    var30_int++;
                    continue;
                  }
                  break;
                }
                var29 = 16711680;
                if (var28 != 0) {
                  var29 = 16755200;
                }
                if (var27 != 0) {
                  var29 = 65280;
                }
                var30 = var26 + " x " + SetSpinningBladeSpinupSpeed.field_o[var25];
                SetSelfDestructPrepareToggleCooldown.a(var19 + var21 + 4, 1, var20 + var23, var30, 3, var29, (byte) -99);
                var23 = var23 + GetPointDefenceLaserProjectiles.a(param3, 3);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_39_0 = var6;
          stackIn_39_1 = new StringBuilder().append("uca.SC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    private final void drawDebugOverlay(boolean param0) {
        int var12 = 0;
        int incrementValue$0 = 0;
        StringBuilder stackIn_14_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        Camera2D stackIn_72_0 = null;
        boolean stackIn_73_1 = false;
        int var2;
        Player[] var2_ref_tfa__;
        String var2_ref_String;
        String var3;
        int var3_int;
        PlayerAction var3_ref;
        int var4;
        int var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11_int;
        String var11;
        String var13;
        int var14;
        int var15;
        Player[] var16;
        String[] var17;
        int var18;
        String var19;
        String var20;
        String var21;
        String var22;
        String var24;
        String var25;
        String var26;
        Object var27;
        SettingsChange var34;
        String var35;
        int var2Lifetime1;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var8Lifetime2;
        String var3Lifetime1;
        String var3Lifetime2;
        String var3Lifetime3;
        String var3Lifetime4;
        String var3Lifetime5;
        String var3Lifetime1Lifetime1;
        String var3Lifetime1Lifetime2;
        String var3Lifetime2Lifetime1;
        var27 = null;
        var15 = VoidHunters.field_G;
        for (var2 = 0; var2 < 14; var2++) {
          if (GetPointDefenceLaserProjectiles.a(1 << var2, 11284)) {
            var3_int = 8;
            var4 = 4;
            GetMachineGunPulsetime.a(16711680, -102, var3_int, 8, var4, var2 * var3_int + 300);
            UiToggleButtonRenderer.drawRectangle(119, 300 + var2 * var3_int, var4, 8, 16777215, var3_int);
          }
        }
        if (GetPointDefenceLaserProjectiles.a(128, 11284)) {
          var16 = (Player[]) (this.state.b(1).players);
          var2_ref_tfa__ = var16;
          var3 = "null";
          if (var2_ref_tfa__ != null) {
            var3 = "";
            for (var4Lifetime1 = 0; var4Lifetime1 < var16.length; var4Lifetime1++) {
              stackIn_14_0 = new StringBuilder().append(var3).append(" ");
              if (var16[var4Lifetime1].connected) {
                stackIn_15_1 = 1;
              } else {
                stackIn_15_1 = 0;
              }
              var3 = ((StringBuilder) (Object) stackIn_14_0).append(stackIn_15_1).toString();
            }
          }
          var19 = "Connected =" + var3;
          var3Lifetime4 = var19;
          var3Lifetime5 = var19;
          GetLagStandardDeviationOut.a(-1, var19, 16711935, 80, SetMassDriverReload.field_p, 4266);
        }
        if (GetPointDefenceLaserProjectiles.a(1, 11284)) {
          this.drawCarouselDebug(-106);
        }
        if (this.state.carouselInfo.outOfSync) {
          var20 = SetHealthBarHeight.field_o.toUpperCase();
          var3Lifetime1 = var20;
          var3Lifetime1Lifetime1 = var20;
          SetSelfDestructPrepareToggleCooldown.a(SetMassDriverReload.field_p - tea.a(2, var20, 13879) / 2, 1, 180, var20, 2, 16711935, (byte) -126);
          if (null == FlipTextureOperation.field_l.dataSender) {
            var3Lifetime1Lifetime2 = GetPhasedEnergyBeamPulseFadetime.field_o.toUpperCase();
          } else {
            var3Lifetime1Lifetime2 = SetWeaponParticleSpeedDownshift.field_o.toUpperCase();
          }
          SetSelfDestructPrepareToggleCooldown.a(SetMassDriverReload.field_p - tea.a(2, var3Lifetime1Lifetime2, 13879) / 2, 1, 200, var3Lifetime1Lifetime2, 2, 16711935, (byte) -127);
        }
        if (this.state.a((byte) 54).getDebug((byte) -77) &&
          ssa.b(2)) {
          var21 = "DEBUG MODE";
          var2_ref_String = var21;
          SetSelfDestructPrepareToggleCooldown.a(SetMassDriverReload.field_p - tea.a(2, var21, 13879) / 2, -1, 100, var2_ref_String, 2, 16777215, (byte) -105);
          for (var3_intLifetime1 = 0; SetFogOfWarSensorRange.field_o.length > var3_intLifetime1; var3_intLifetime1++) {
            var4Lifetime2 = SetFogOfWarSensorRange.field_o[var3_intLifetime1][0];
            var5 = SetFogOfWarSensorRange.field_o[var3_intLifetime1][-1 + SetFogOfWarSensorRange.field_o[var3_intLifetime1].length];
            var22 = TorpedoWeaponDefinition.field_c[var3_intLifetime1];
            stackIn_33_0 = (var3_intLifetime1 != this.debugOrderCategory) ? 0 : 1;
            regionExit1: {
              var7 = stackIn_33_0;
              var8 = 11184810;
              if (this.debugOrderCategory != -1) {
                if (var7 == 0) {
                  break regionExit1;
                }
                var8 = 16777215;
              }
              var9 = 200 + var3_intLifetime1 * OpenGlTexture.b((byte) 118);
              var10 = -10 + PartitionZoneFactory.field_a;
              GetShipPersistence.a(var22, var10, var9, var8, -1, (byte) -103);
              if (var7 != 0) {
                var11_int = 0;
                for (var12 = var4Lifetime2; var12 <= var5; var12++) {
                  var13 = GetGrapplingHookSpringConstant.specialOrderLabels[var12];
                  var8Lifetime2 = 11184810;
                  stackIn_48_0 = (~this.pendingSpecialOrderId != ~var12) ? 0 : 1;
                  var14 = stackIn_48_0;
                  if (var14 != 0) {
                    var8Lifetime2 = 16777215;
                  }
                  GetShipPersistence.a(var13, -10 + var10 - GetPhasedEnergyBeamProjectiles.a(-124, var22), var11_int * OpenGlTexture.b((byte) 118) + 200, var8Lifetime2, -1, (byte) -103);
                  var11_int++;
                }
              }
            }
          }
        }
        this.drawDebugPolygons((byte) 121);
        this.drawMissionControlDebug(-94);
        if (param0) {
          return;
        }
        this.drawSpatialPartitionDebug(-115);
        var2Lifetime1 = 0;
        var3_ref = (PlayerAction) (this.state.carouselInfo.events.first(0));
        while (var3_ref != null) {
          if (var3_ref.specialOrderSubmessage != null &&
            var3_ref.specialOrderSubmessage.settingsChange != null) {
            var34 = var3_ref.specialOrderSubmessage.settingsChange;
            var35 = CarouselCommongameInfoFactory.field_a[var34.id] + " changed to " + var34.value + " by " + this.state.getPlayerName(1, var3_ref.field_k);
            incrementValue$0 = var2Lifetime1;
            var2Lifetime1++;
            GetLagStandardDeviationOut.a(-1, var35, 16777215, 20 * incrementValue$0 + 300, SetMassDriverReload.field_p - (GetPhasedEnergyBeamProjectiles.a(-37, var35) >> 1), 4266);
          }
          var3_ref = (PlayerAction) (this.state.carouselInfo.events.next((byte) 22));
        }
        if (GetPointDefenceLaserProjectiles.a(2, 11284)) {
          SetMachineGunFireForce.drawDebugArrows((byte) -99, ShipTeamConditionFactory.field_a);
        }
        if (this.state.carouselInfo.isReplay(1)) {
          if (SetMinimapWidth.field_o % 20 > 10) {
            var24 = "Replay";
            var3Lifetime2 = var24;
            GetLagStandardDeviationOut.a(-1, var3Lifetime2, 16711680, 40, SetMassDriverReload.field_p - GetPhasedEnergyBeamProjectiles.a(-24, var24) / 2, 4266);
          }
          if (this.state.carouselInfo.isShowingClientState(33)) {
            var25 = "Client state";
            var3Lifetime2Lifetime1 = var25;
            GetLagStandardDeviationOut.a(-1, var3Lifetime2Lifetime1, 16777215, 80, SetMassDriverReload.field_p - GetPhasedEnergyBeamProjectiles.a(-71, var25) / 2, 4266);
          }
          stackIn_72_0 = ShipTeamConditionFactory.field_a;
          stackIn_73_1 = !(param0);
          var3_intLifetime2 = ((Camera2D) (Object) stackIn_72_0).screenToWorldX(stackIn_73_1, GetUseDetailLines.field_o);
          var4Lifetime3 = ShipTeamConditionFactory.field_a.screenToWorldY(0, GetTorpedoReload.field_q);
          GetLagStandardDeviationOut.a(1, "x=" + var3_intLifetime2, 16777215, GetTorpedoReload.field_q, 16 + GetUseDetailLines.field_o, 4266);
          GetLagStandardDeviationOut.a(1, "y=" + var4Lifetime3, 16777215, 12 + GetTorpedoReload.field_q, 16 + GetUseDetailLines.field_o, 4266);
          var26 = this.state.carouselInfo.getDebugDifferences((byte) -75);
          if (var26 != null) {
            var17 = SetFighterBayAimspeed.a((byte) -67, '\n', var26);
            var7Lifetime1 = 5;
            var8Lifetime1 = OpenGlTexture.b((byte) 118);
            var9Lifetime1 = MissionVariableFactory.field_a - var8Lifetime1 * (-1 + var17.length);
            var18 = 0;
            var10Lifetime1 = var18;
            while (var18 < var17.length) {
              var11 = var17[var18];
              CachedArchiveProvider.a(200, false, var7Lifetime1, var9Lifetime1 + (-var8Lifetime1 + 2), var8Lifetime1, GetPhasedEnergyBeamProjectiles.a(102, var11), 1118481);
              GetLagStandardDeviationOut.a(-1, var11, 16777215, var9Lifetime1, var7Lifetime1, 4266);
              var9Lifetime1 = var9Lifetime1 + var8Lifetime1;
              var18++;
            }
          }
        }
        if (ssa.b(2) &&
          SetMachineGunEnergyUsed.field_o[12]) {
          GetMachineGunPulsetime.a(1118481, -88, PartitionZoneFactory.field_a, 0, 200, 0);
          var3Lifetime3 = "Help:<br>F1 for gfx2, F2 for gfx1, F3 to rebuild toolkit, F4 for java toolkit<br>Alt 0-9, and Alt&Shift 0-9 to toggle debug flags.<br>Alt 0=Carousel, 1=Forces, 2=Hardpoints, 3=IDs, 4=Bounding boxes, 5=Teams and owners<br>Alt 6=Mission, 7=Connected players, 8=Spatial partitioning, 9=Spatial partitioning with ships<br>Alt Shift 0=FPS, 1=Mission generation, 2=AI<br><br>Hold 0 and press middle mouse to toggle debug mode<br><br>Press ` to toggle the console.<br>Type print_settings() to print all ingame settings to the java console<br>Type request_newest_blackbox_recording() to print the latest recording filename to the java console<br>Type load_blackbox_recording(id) to load the recording with that id<br>Press r to restart the recording playback<br><br>Useful console commands: set_lag(lag,deviation)";
          GetMachineGunPulsetime.a(var3Lifetime3, 16777215, MissionVariableFactory.field_a, 10, -120, 10, -1, 0, OpenGlTexture.b((byte) 118), PartitionZoneFactory.field_a, 0);
        }
        return;
    }

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          int[] var2 = (int[]) null;
          GameSession.buildPathPolyline(120, (byte) 120, (int[]) null, -35);
        }
        field_D = null;
    }

    final static int[] buildPathPolyline(int param0, byte param1, int[] param2, int param3) {
        int var8 = 0;
        int incrementValue$8 = 0;
        int dupTemp$9 = 0;
        int incrementValue$10 = 0;
        int dupTemp$11 = 0;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] stackIn_3_0 = null;
        int[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          var10 = new int[]{-ArchiveProvider.field_b, -ArchiveProvider.field_a, -ArchiveProvider.field_b / 2, 0, ArchiveProvider.field_b / 2, ArchiveProvider.field_a, ArchiveProvider.field_b, ArchiveProvider.field_a, ArchiveProvider.field_b / 2, 0, -ArchiveProvider.field_b / 2, -ArchiveProvider.field_a};
          var4 = var10;
          var5 = new int[]{0, -ArchiveProvider.field_b / 2, -ArchiveProvider.field_a, -ArchiveProvider.field_b, -ArchiveProvider.field_a, -ArchiveProvider.field_b / 2, 0, ArchiveProvider.field_b / 2, ArchiveProvider.field_a, ArchiveProvider.field_b, ArchiveProvider.field_a, ArchiveProvider.field_b / 2};
          var6 = new int[param2.length * 2 + 2];
          var7 = 0;
          var6[var7++] = param3;
          if (param1 != 9) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          var6[var7++] = param0;
          for (var8 = 0; var8 < param2.length; var8++) {
            incrementValue$8 = var7;
            var7++;
            dupTemp$9 = param3 + var10[param2[var8]];
            param3 = dupTemp$9;
            var6[incrementValue$8] = dupTemp$9;
            incrementValue$10 = var7;
            var7++;
            dupTemp$11 = param0 + var5[param2[var8]];
            param0 = dupTemp$11;
            var6[incrementValue$10] = dupTemp$11;
          }
          stackIn_8_0 = var6;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("uca.IB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void drawShipHeadingArrow(byte param0, Ship param1) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var3_int = 2 * param1.getBoundingExtent(-42);
        int var4 = var3_int * (GetNumStars.cosAngle(param1.getAngle(0), (byte) 91) >> 8) >> 8;
        int var5 = (TextureLineShape.sinAngle(param1.getAngle(0), 43) >> 8) * var3_int >> 8;
        var3_int = (int)(24.0f / ShipTeamConditionFactory.field_a.scale) + var3_int;
        int var6 = (GetNumStars.cosAngle(param1.getAngle(0), (byte) -99) >> 8) * var3_int >> 8;
        int var7 = var3_int * (TextureLineShape.sinAngle(param1.getAngle(0), 102) >> 8) >> 8;
        int var8 = (int)(0.05000000074505806f / ShipTeamConditionFactory.field_a.scale);
        if (param0 > -56) {
          return;
        }
        try {
          if (64 <= var8) {
            if (128 < var8) {
              var8 = 128;
            }
            var9 = param1.chassis.getFinalx(true);
            var10 = param1.chassis.getFinaly((byte) 55);
            var11 = AlphaContainer.getTeamColor(false, param1.getTeam((byte) 69), 13894143);
            GetCountermeasureLauncherAimarc.drawWorldArrow(var4 + var9, ShipTeamConditionFactory.field_a, var10 + var7, 3, var10 + var5, var11, var8, var6 + var9);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uca.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void drawPartitionBodiesDebug(int param0, World param1, int param2, Ship param3) {
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        PartitionZone var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ShipBody var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var14 = VoidHunters.field_G;
        try {
          if (param0 != -927) {
            return;
          }
          var5_int = param1.partitioningManager.findZonesInBounds((byte) -46, param3.getBoundingbox((byte) -82), param2);
          for (var6 = 0; var5_int > var6; var6++) {
            var7 = kpb.field_s[var6];
            var8 = 0;
            if (null != var7.ids) {
              var15 = 0;
              var9 = var15;
              while (var15 < var7.ids.length) {
                var10 = var7.ids[var15];
                var11 = param1.getBodyById((byte) -27, var10);
                var12 = ShipTeamConditionFactory.field_a.worldToScreenX(var7.gridx * 65536, (byte) 119);
                var13 = 20 + (ShipTeamConditionFactory.field_a.worldToScreenY(true, 65536 * var7.gridy) + var8 * OpenGlTexture.b((byte) 118));
                if (var11 == null) {
                  var8++;
                  GetLagStandardDeviationOut.a(-1, "Null body=" + var10, 16711680, var13, var12, 4266);
                } else {
                  var11.draw(ShipTeamConditionFactory.field_a, 16777215, param1, 16);
                  GetLagStandardDeviationOut.a(-1, "Body=" + var10, 65280, var13, var12, 4266);
                  var8++;
                }
                var15++;
              }
              this.drawPartitionZoneDebug(44, var7);
            } else {
              var9 = ShipTeamConditionFactory.field_a.worldToScreenX(65536 * var7.gridx, (byte) 113);
              var10 = 20 + (ShipTeamConditionFactory.field_a.worldToScreenY(true, var7.gridy * 65536) + var8 * OpenGlTexture.b((byte) 118));
              GetLagStandardDeviationOut.a(-1, "Null id list!", 16711680, var10, var9, 4266);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("uca.VC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final int drawComponentInspection(byte param0, int param1, int param2, Player param3, Ship param4, World param5) {
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8_int = 0;
        Debris var8 = null;
        int var9 = 0;
        String[] var10_ref_String__ = null;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        ShipComponent var14 = null;
        ShipComponent var15 = null;
        int var9Lifetime1;
        try {
          if (param0 != 36) {
            stackIn_2_0 = 116;
            return stackIn_2_0;
          }
          if (param4.isSpecialOrderActive(4, param0 + 41)) {
            stackIn_5_0 = 3;
            return stackIn_5_0;
          }
          if (param4.isSpecialOrderActive(9, 113)) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          if ((param3.triggers & 128) == 0 &&
            (16 & param3.triggers) == 0 && (-1 != GetUseDetailLines.field_o ||
            -1 != GetTorpedoReload.field_q) && null == param4.getTargetBlueprint((byte) 28)) {
            param4 = this.prepareInspectionShip(param1, param4, -11788, param2);
            var14 = param4.chassis.findComponentAtPoint(param1, param2, true);
            var15 = var14;
            if (var15 != null &&
              var15 != param4.chassis) {
              var15.drawTree((byte) 100, ShipTeamConditionFactory.field_a, true, param5, AlphaContainer.getTeamColor(true, param4.getTeam((byte) 105), 13894143));
              var8_int = 26 + ShipTeamConditionFactory.field_a.worldToScreenX(param2, (byte) 120);
              var9 = ShipTeamConditionFactory.field_a.worldToScreenY(true, param1) + 10;
              this.drawInspectionMarker(var8_int, 92, var9);
              if (this.field_J != var15.getComponentTypeId(0)) {
                this.field_o = 0;
              }
              this.field_ab = true;
              this.field_J = var15.getComponentTypeId(param0 ^ 36);
              var10_ref_String__ = this.revealStringLines(this.field_o, true, new String[]{TiledSpriteTextureOperation.a(var14, (byte) -120), GetSelfDestructActivateCooldown.a(var14.getDefinition((byte) -112).field_a, 94), ShipSpawnedCondition.field_e[var14.getComponentTypeId(param0 - 36)]});
              this.drawWorldInspectionText(var15.getFinalx(true), var15.getFinaly((byte) 85), var10_ref_String__, (byte) -96);
              stackIn_21_0 = 1;
              return stackIn_21_0;
            }
            var8 = param5.findNearestDraggableDebris(true, param4.getY((byte) 124), param2, param4.getX(false), param1);
            if (var8 != null) {
              var9Lifetime1 = var8.getBoundingExtent(-115) << 1;
              var10 = (var8.getBoundingbox((byte) -60)[0] + var8.getBoundingbox((byte) -88)[1]) / 2;
              var11 = (var8.getBoundingbox((byte) -64)[2] + var8.getBoundingbox((byte) -89)[3]) / 2;
              if (this.field_J != var8.chassis.getComponentTypeId(0)) {
                this.field_o = 0;
              }
              this.field_ab = true;
              this.field_J = var8.chassis.getComponentTypeId(param0 - 36);
              var12 = this.revealStringLines(this.field_o, true, new String[]{TiledSpriteTextureOperation.a(var8.chassis, (byte) -95), GetSelfDestructActivateCooldown.a(var8.chassis.getDefinition((byte) -112).field_a, 111), ShipSpawnedCondition.field_e[var8.chassis.getComponentTypeId(0)]});
              if (this.drawInspectionOutline(param1, var10, param2, false, var12, var11, var9Lifetime1)) {
                stackIn_28_0 = 1;
                return stackIn_28_0;
              }
            }
          }
          stackIn_30_0 = 0;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_33_0 = var7;
          stackIn_33_1 = new StringBuilder().append("uca.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param4 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param5 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final void submitPlayerAction(int param0, boolean param1, PlayerAction param2) {
        if (param0 > this.localPlayerIndex) {
          return;
        }
        try {
          param2.field_k = this.localPlayerIndex;
          FlipTextureOperation.field_l.submitLocalEvent(true, param2, this.state.carouselInfo, false, this.networked, TestActionLagSetting.actionLag, RequestNewestBlackboxRecording.field_p);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uca.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void drawRangeCircle(int param0, byte param1, int param2, int param3) {
        int var5 = TextLayout.approximateVectorLength(param2, (byte) 123, param0);
        int var6 = TextLayout.approximateVectorLength(-param2 + PartitionZoneFactory.field_a, (byte) 104, param0);
        int var7 = TextLayout.approximateVectorLength(param2, (byte) 112, MissionVariableFactory.field_a - param0);
        int var8 = TextLayout.approximateVectorLength(PartitionZoneFactory.field_a - param2, (byte) 114, -param0 + MissionVariableFactory.field_a);
        if (param3 <= 20000) {
          if (var5 < param3 && var6 < param3 && param3 > var7 &&
            var8 < param3) {
            return;
          }
          int var9 = 36 / ((param1 + 64) / 44);
          SetNumStars.drawCircle((float)(1 + param3), (byte) 98, param0, -7829368, param2);
          return;
        }
    }

    private final int getLocalTeam(byte param0) {
        GameSnapshot var4 = null;
        Ship var5 = null;
        int var2 = ToolkitRasterState.field_c;
        int var3 = 81 % ((-32 - param0) / 52);
        if (this.localPlayerIndex >= 0) {
          var4 = this.state.b(1);
          var2 = ((Player) (var4.players[this.localPlayerIndex])).selectedTeam;
          if (!ConsoleCharacterStream.a(59, var4.world.getObjectiveType(false))) {
            var2 = this.localPlayerIndex;
          }
          var5 = this.state.a((byte) 33).findShipByOwner(this.localPlayerIndex, 83);
          if (var5 != null) {
            var2 = var5.getTeam((byte) 84);
          }
        }
        return var2;
    }

    private final void drawShipHealthBars(Ship[] param0, boolean param1) {
        boolean discarded$1 = false;
        int var4 = 0;
        Ship[] var3 = null;
        Ship var5 = null;
        int var6 = 0;
        MissionState var7 = null;
        Ship[] var8 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = VoidHunters.field_G;
        try {
          if (!param1) {
            var7 = (MissionState) null;
            discarded$1 = this.hasArmageddonStarted((byte) -74, (World) null, (MissionState) null);
          }
          if (TextureFilterMode.field_d > 0) {
            if (0 >= NebulaField.field_d) {
              return;
            }
            var8 = param0;
            var3 = var8;
            for (var4 = 0; var4 < var8.length; var4++) {
              var5 = var8[var4];
              if (var5 != null && (!var5.hasVisibilityFlag(1, (byte) -111) ||
                var5.getOwner((byte) -117) == this.localPlayerIndex) && (!var5.hasVisibilityFlag(2, (byte) -116) &&
                !var5.isSpecialOrderActive(9, 56))) {
                var5.drawHealthBar(false, ShipTeamConditionFactory.field_a, 32);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("uca.PB(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final void beginPacket(int param0) {
        if (!this.networked) {
          throw new IllegalStateException();
        }
        RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, param0);
    }

    private final void drawScoreboardColumns(int[] param0, int param1, int param2, int param3, int param4, int[] param5, int[] param6, int[] param7, int param8, int param9, int param10, String[][] param11) {
        int var13_int = 0;
        int var15 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        int var14 = 0;
        int var16 = 0;
        String var17 = null;
        int var18 = 0;
        int var19 = 0;
        var19 = VoidHunters.field_G;
        try {
          if (param1 != 18398) {
            this.drawInspectionMarker(36, 17, 14);
          }
          for (var13_int = 0; param11.length > var13_int; var13_int++) {
            var14 = param2;
            for (var15 = 0; var15 < param0.length; var15++) {
              var16 = param0[var15];
              if ((param7[var16] & OpenGlGpuToolkit.field_Oc) == 0) {
                var17 = param11[var13_int][var16];
                var18 = var14 + (param8 >> 1);
                var14 = var14 + param8;
                if (var17 != null &&
                  0 < var17.length()) {
                  GetLagStandardDeviationOut.a(-1, var17, param6[var16], -2 + (OpenGlTexture.b((byte) 118) >> 1) + var18, param9 + param3, 4266);
                }
                if (var13_int == 0) {
                  if ((GetBoostersActiveTime.field_o & param7[var16]) != 0) {
                    GetPhasedEnergyBeamReload.a(var18, 2.0f, -52, param4 + param10, param6[var16]);
                  }
                  if ((param7[var16] & bsb.field_a) != 0) {
                    DelayedPacket.drawLine(var18, param9 - (-param3 - GetPhasedEnergyBeamProjectiles.a(99, var17)), param3 + param9, var18, -16777216, param6[var16]);
                  }
                }
              }
            }
            param9 = param9 + param5[var13_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_23_0 = var13;
          stackIn_23_1 = new StringBuilder().append("uca.LA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param6 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param7 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    private final void updateVoteGrid(GameSnapshot param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        int var16 = 0;
        int var14_int = 0;
        int var15 = 0;
        int var17 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var14 = null;
        var17 = VoidHunters.field_G;
        try {
          if (param2 != 2051269640) {
            return;
          }
          var14_int = 0;
          var15 = 0;
          for (var16 = param6; var16 < param1; var16++) {
            if (HighscoreTableRequest.isVoteOptionVisible(var16, (byte) -25)) {
              this.updateVoteOption(var16, var15, param10, param0, param5, param7, param3, 118, var14_int, param4, param8, param11, param12);
              var14_int++;
              if (param9 <= var14_int) {
                var15++;
                var14_int = 0;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_15_0 = var14;
          stackIn_15_1 = new StringBuilder().append("uca.JA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    private final void drawArmageddonCountdown(int param0, World param1, MissionState param2) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        try {
          if (param2.getMissionPhase(8) == 5) {
            var4_int = param2.getPhaseTimer((byte) -122);
            var5 = lga.getArmageddonStartTick((byte) -2, param1.getObjectiveType(false));
            var6 = var5 - Particle.field_l * AsteroidFactory.armageddonWarning;
            if (var6 < var4_int &&
              var5 >= var4_int) {
              var7 = (-var4_int + var5) / Particle.field_l;
              var8 = SetReverbGain.a(OpenGlDisplayLists.field_b, new String[]{Integer.toString(var7)}, 118).toUpperCase();
              var9 = 128 + (TextureLineShape.sinAngle(SetMinimapWidth.field_o * 128 % 8192, 44) * 127 >> 16);
              var10 = var9 << 8 | 16711680 | var9;
              SetSelfDestructPrepareToggleCooldown.a(SetMassDriverReload.field_p - tea.a(1, var8, 13879) / 2, 1, GetLaserAimarc.field_q / 2, var8, 1, var10, (byte) -92);
            }
          }
          if (param0 != 1) {
            this.renderTimingGraph = (TimingGraph) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("uca.CD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final boolean drawInspectionOutline(int param0, int param1, int param2, boolean param3, String[] param4, int param5, int param6) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        SpecialOrderButtonState var49 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var42Lifetime1;
        int var43Lifetime1;
        int var15Lifetime2;
        int var16Lifetime2;
        var48 = VoidHunters.field_G;
        try {
          var8_int = -param2 + param1;
          var9 = -param0 + param5;
          var10 = 2048;
          var11 = TextLayout.approximateVectorLength(var8_int, (byte) 114, var9);
          var12 = param6;
          if (var11 <= param6) {
            var12 = var12 << 1;
            var13 = 18;
            var14 = var12 / var13;
            for (var15 = 1; var15 < 1 + var13; var15++) {
              var16 = (var15 * var14 + SetMinimapWidth.field_o * 160) % var12;
              var16 = 8192 * var16 / var12;
              var17 = (GetNumStars.cosAngle(var16, (byte) 68) >> 8) * param6 >> 8;
              var18 = param6 * (TextureLineShape.sinAngle(var16, 96) >> 8) >> 8;
              var19 = var17 + param1;
              var20 = var18 + param5;
              this.drawWorldGlow(-7178, var19, var15, var20);
            }
            var15Lifetime2 = 26 + ShipTeamConditionFactory.field_a.worldToScreenX(param2, (byte) 112);
            var16Lifetime2 = ShipTeamConditionFactory.field_a.worldToScreenY(true, param0) + 10;
            this.drawInspectionMarker(var15Lifetime2, 78, var16Lifetime2);
            this.drawWorldInspectionText(param1, param5, param4, (byte) -96);
            return true;
          }
          var13Lifetime1 = GameSnapshotFactory.a(var9, (byte) -77, var8_int);
          var14Lifetime1 = GameKeyHandler.a(22433, -2048 + var13Lifetime1);
          var15Lifetime1 = GameKeyHandler.a(22433, 2048 + var13Lifetime1);
          if (param3) {
            var49 = (SpecialOrderButtonState) null;
            this.handleSpecialOrderHotkey((SpecialOrderButtonState) null, (byte) 103, -86, false);
          }
          var16Lifetime1 = GetNumStars.cosAngle(var15Lifetime1, (byte) 53) >> 8;
          var17Lifetime1 = TextureLineShape.sinAngle(var15Lifetime1, 44) >> 8;
          var18Lifetime1 = param1 + (param6 >> 8) * var16Lifetime1;
          var19Lifetime1 = (param6 >> 8) * var17Lifetime1 + param5;
          var20Lifetime1 = param2 + (var10 >> 8) * var16Lifetime1;
          var21 = param0 + var17Lifetime1 * (var10 >> 8);
          var22 = GetNumStars.cosAngle(var14Lifetime1, (byte) 105) >> 8;
          var23 = TextureLineShape.sinAngle(var14Lifetime1, 54) >> 8;
          var24 = param2 + (var10 >> 8) * var22;
          var25 = var23 * (var10 >> 8) + param0;
          var26 = (param6 >> 8) * var22 + param1;
          var27 = var23 * (param6 >> 8) + param5;
          var28 = var20Lifetime1 - var18Lifetime1;
          var29 = var21 - var19Lifetime1;
          var30 = var26 - var24;
          var31 = var27 - var25;
          var32 = var10;
          var33 = TextLayout.approximateVectorLength(var28, (byte) 110, var29) / 3;
          var34 = var12 + 2 * var33 + var32 >> 4;
          if (0 >= var34) {
            var34 = 1;
          }
          var35 = 4096;
          var32 = var35 * var32 / var34;
          var12 = var35 * var12 / var34;
          var33 = var35 * var33 / var34;
          var36 = var12;
          var37 = var33 + var36;
          var38 = var32 + var37;
          var39 = var33 + var38;
          if (var39 <= 0) {
            return false;
          }
          var40 = 28;
          var41 = var39 / var40;
          for (var42 = 1; var42 < 1 + var40; var42++) {
            var43 = (SetMinimapWidth.field_o * 160 + var42 * var41) % var39;
            if (var36 > var43) {
              var43 = var14Lifetime1 + var43 * 4096 / var12;
              var44 = (GetNumStars.cosAngle(var43, (byte) -80) >> 8) * (param6 >> 8);
              var45 = (param6 >> 8) * (TextureLineShape.sinAngle(var43, 114) >> 8);
              var46 = param1 + var44;
              var47 = var45 + param5;
              this.drawWorldGlow(-7178, var46, var42, var47);
            } else {
              if (var37 <= var43) {
                if (var43 >= var38) {
                  var44 = var43 - var38;
                  var45 = var24 + var30 * var44 / var33;
                  var46 = var25 + var44 * var31 / var33;
                  this.drawWorldGlow(-7178, var45, var42, var46);
                } else {
                  var43 = (-var37 + var43) * 4096 / var32 + var15Lifetime1;
                  var44 = (GetNumStars.cosAngle(var43, (byte) 94) >> 8) * (var10 >> 8);
                  var45 = (TextureLineShape.sinAngle(var43, 91) >> 8) * (var10 >> 8);
                  var46 = param2 + var44;
                  var47 = param0 + var45;
                  this.drawWorldGlow(-7178, var46, var42, var47);
                }
              } else {
                var44 = var43 - var36;
                var45 = var18Lifetime1 + var44 * var28 / var33;
                var46 = var44 * var29 / var33 + var19Lifetime1;
                this.drawWorldGlow(-7178, var45, var42, var46);
              }
            }
          }
          var42Lifetime1 = 26 + ShipTeamConditionFactory.field_a.worldToScreenX(param2, (byte) 113);
          var43Lifetime1 = 10 + ShipTeamConditionFactory.field_a.worldToScreenY(true, param0);
          this.drawInspectionMarker(var42Lifetime1, 124, var43Lifetime1);
          this.drawWorldInspectionText(param1, param5, param4, (byte) -96);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_28_0 = var8;
          stackIn_28_1 = new StringBuilder().append("uca.VA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void drawMinimap(World param0, int param1, Ship[] param2) {
        int var14_int = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Camera2D var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Asteroid[] var14 = null;
        Ship var15_ref_sg = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Asteroid var17_ref_crb = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Object var22 = null;
        Ship[] var23 = null;
        Ship var24 = null;
        IntrusiveDeque var25 = null;
        Asteroid[] var26 = null;
        Projectile var27 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        var22 = null;
        var21 = VoidHunters.field_G;
        try {
          if (GetAiFiringRangeUpshift.field_o > 0 &&
            UiVisualStyle.field_c > 0) {
            var4_int = GetAiFiringRangeUpshift.field_o;
            var5 = UiVisualStyle.field_c;
            var6 = 0;
            var7 = -var5 + MissionVariableFactory.field_a;
            var8 = new Camera2D();
            var8.worldCenterY = 0.0f;
            var8.worldCenterX = 0.0f;
            var8.scale = (float)Math.min(var4_int, var5) / (float)Math.max(param0.getWidth((byte) -122), param0.getHeight(1));
            var8.screenOriginY = var5 / 2;
            var8.screenOriginX = var4_int / 2;
            var9 = var8.worldToScreenX(-param0.getWidth((byte) -122) / 2, (byte) 126);
            var10 = var8.worldToScreenX(param0.getWidth((byte) -122) / 2, (byte) 122);
            var11 = var8.worldToScreenY(true, -param0.getHeight(1) / 2);
            var12 = var8.worldToScreenY(true, param0.getHeight(1) / 2);
            var7 = var7 + var11;
            var6 = var6 - var9;
            CachedArchiveProvider.a(200, false, var6 + var9, var11 + var7, -var11 + var12, var10 - var9, 0);
            SaveShipDesignOrderDefinition.pushClip(var7 + var11, var12 + var7, true, var6 + var10, var9 + var6);
            var23 = param2;
            for (var14_int = 0; var23.length > var14_int; var14_int++) {
              var24 = var23[var14_int];
              var15_ref_sg = var24;
              if (var15_ref_sg != null) {
                var16 = var6 + var8.worldToScreenX(var24.getX(false), (byte) 114);
                var17 = var8.worldToScreenY(true, var24.getY((byte) 124)) + var7;
                stackIn_12_0 = (var24.getOwner((byte) -117) == this.localPlayerIndex);
                var18 = AlphaContainer.getTeamColor(stackIn_12_0, var24.getTeam((byte) 95), param1 ^ 13894143);
                MouseWheelInput.a(var18, var17, var16, -119);
              }
            }
            var25 = this.state.a((byte) 33).getProjectiles(true);
            var27 = (Projectile) (var25.first(0));
            while (var27 != null) {
              var15 = var8.worldToScreenX(var27.getX(116), (byte) 115) + var6;
              var16Lifetime1 = var7 + var8.worldToScreenY(true, var27.getY((byte) -107));
              var17Lifetime1 = 16776960;
              MouseWheelInput.a(var17Lifetime1, var16Lifetime1, var15, -110);
              var27 = (Projectile) (var25.next((byte) 118));
            }
            var14 = this.state.a((byte) 65).getAsteroids(true);
            var26 = var14;
            for (var16Lifetime2 = param1; var26.length > var16Lifetime2; var16Lifetime2++) {
              var17_ref_crb = var26[var16Lifetime2];
              if (var17_ref_crb != null) {
                var18Lifetime1 = var6 + var8.worldToScreenX(var17_ref_crb.getX(false), (byte) 119);
                var19 = var7 + var8.worldToScreenY(true, var17_ref_crb.getY((byte) -24));
                var20 = 7829367;
                MouseWheelInput.a(var20, var19, var18Lifetime1, 82);
              }
            }
            var15Lifetime1 = var8.worldToScreenX(ShipTeamConditionFactory.field_a.screenToWorldX(true, 0), (byte) 115);
            var16Lifetime3 = var8.worldToScreenX(ShipTeamConditionFactory.field_a.screenToWorldX(true, PartitionZoneFactory.field_a), (byte) 117);
            var17Lifetime2 = var8.worldToScreenY(true, ShipTeamConditionFactory.field_a.screenToWorldY(0, 0));
            var18Lifetime2 = var8.worldToScreenY(true, ShipTeamConditionFactory.field_a.screenToWorldY(param1 ^ 0, MissionVariableFactory.field_a));
            GetMissilesHitSourceTeam.a(var6 + var15Lifetime1, var17Lifetime2 + var7, (byte) -128, var18Lifetime2 - var17Lifetime2, 100, 16777215, var16Lifetime3 - var15Lifetime1);
            GetMissionTerrainSpaceProbability.a(99);
            UiToggleButtonRenderer.drawRectangle(110, var9 + var6, var12 - var11, var7 + var11, 16777215, -var9 + var10);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_27_0 = runtimeException;
          stackIn_27_1 = new StringBuilder().append("uca.MA(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    private final void drawShipPreview(int param0, int param1, float param2, int param3, byte param4, Ship param5, GameSnapshot param6, int param7) {
        Camera2D var11 = null;
        if (param5 == null) {
          return;
        }
        try {
          var11 = new Camera2D();
          var11.screenOriginY = param1;
          int var10 = -20 % ((param4 - 8) / 41);
          var11.screenOriginX = param7;
          var11.scale = var11.scale * param2;
          param5.setPosition(0, 0, (byte) 92);
          param5.setAngle(param0, -116);
          param5.integrateMotion(false, true, param6.world);
          param5.draw(var11, AlphaContainer.getTeamColor(false, param3, 13894143), param6.world, 16);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uca.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    private final void drawChatButton(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ToolkitSprite var7 = null;
        String var8 = null;
        if (this.isChatAvailable((byte) 126) &&
          OpenGlTexture1D.field_i) {
          var2 = -(AdjustVariableActionFactory.field_a.width / 2) + SetMassDriverReload.field_p;
          var3 = MissionVariableFactory.field_a + (SetToggledScoreboard.field_o.screenY - SoftwareRasterizer2D.height) - AdjustVariableActionFactory.field_a.height;
          AdjustVariableActionFactory.field_a.x = var2;
          AdjustVariableActionFactory.field_a.screenX = var2;
          AdjustVariableActionFactory.field_a.y = var3;
          AdjustVariableActionFactory.field_a.screenY = var3;
          var4 = AdjustVariableActionFactory.field_a.x;
          var5 = AdjustVariableActionFactory.field_a.y;
          var6 = 0;
          var7 = OpenGlVertexNormal.field_d[115];
          var7.draw(var4, var5);
          if (AdjustVariableActionFactory.field_a.field_O) {
            var7.draw(var4, var5, 2, 1157627903, 1);
          }
          var8 = SetWeaponProjectileSpeedMultiply.field_o;
          SetSelfDestructPrepareToggleCooldown.a(var4 + (var7.getWidth() / 2 - tea.a(var6, var8, param0 + 13920) / 2), 1, var7.getHeight() / 2 + var5 + UsernameAvailabilityValidator.getFontAscent(true, var6) / 2, var8, var6, 16777215, (byte) -86);
        }
        if (param0 != -41) {
          this.field_U = -69;
        }
    }

    final void saveHintsAndOpenMainMenu(boolean param0, int param1) {
        int discarded$0 = 0;
        int var3 = 0;
        if (param1 != -10510) {
          GameSnapshot var4 = (GameSnapshot) null;
          discarded$0 = this.collectControlTriggers((GameSnapshot) null, true, -81, 32);
        }
        this.tutorialController.saveHintProgress((byte) 111);
        if (this.networked) {
        } else {
          if (GetPhasedEnergyBeamPulsetime.isGuestMode((byte) 118)) {
            var3 = param0 ? 1 : 0;
            GetNebulaFadesOutWhenClose.a(!ModelFaceAttachment.a(false) ? 0 : 7, var3 != 0, (byte) -85, 0);
          } else {
            var3 = param0 ? 1 : 0;
            GetNebulaFadesOutWhenClose.a(!ModelFaceAttachment.a(false) ? 0 : 7, var3 != 0, (byte) -85, 0);
          }
        }
    }

    private final void submitPlayerInputChanges(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_72_0 = 0;
        int var9;
        int var10;
        int var11;
        int var13;
        int var14;
        Ship var15;
        int var16;
        int var18;
        PlayerAction var19;
        Ship var20;
        PlayerAction var21;
        int[] var25;
        int var11Lifetime1;
        var18 = VoidHunters.field_G;
        var9 = 73 / ((param7 - 42) / 49);
        if (this.localPlayerIndex >= 0 &&
          param6) {
          if (~param3 == ~param2 &&
            this.activeSpecialOrderId == -1) {
            stackIn_8_0 = 0;
          } else {
            stackIn_8_0 = 1;
          }
          var10 = stackIn_8_0;
          if (this.activeSpecialOrderId == 0 &&
            null != this.tutorialController) {
            this.tutorialController.completeHint((byte) 79, 8);
          }
          if (fra.field_a == 1) {
            var11 = 0;
            if (0 != (16 & param2)) {
              var20 = this.state.b(1).world.findShipByOwner(this.localPlayerIndex, 56);
              if (var20 != null) {
                stackIn_17_0 = (!this.canShipFireAtPoint(param0, param4, var20, -7829)) ? 0 : 1;
                var11 = stackIn_17_0;
              }
              if (var11 == 0) {
                param2 = param2 & -17;
              }
            }
            if ((param2 & -17) == (param3 & -17) &&
              this.activeSpecialOrderId == -1) {
              stackIn_25_0 = 0;
            } else {
              stackIn_25_0 = 1;
            }
            var10 = stackIn_25_0;
            if (var10 == 0 &&
              (param2 & 16) != 0 && (CarouselPlayerEvent.field_m == 1 ||
              !this.fireHeld)) {
              var10 = var11;
            }
          }
          if ((param2 & 16) != 0) {
            this.fireHeld = true;
            if (var10 != 0 &&
              this.tutorialController != null &&
              this.tutorialController.isHintVisible(1, -23)) {
              this.tutorialController.completeHint((byte) 109, 1);
            }
          } else {
            this.fireHeld = false;
          }
          if (param0 == param5 &&
            param4 == param1) {
            stackIn_42_0 = 0;
          } else {
            stackIn_42_0 = 1;
          }
          var11Lifetime1 = stackIn_42_0;
          if (var10 != 0 ||
            var11Lifetime1 != 0) {
            var19 = new PlayerAction();
            var21 = var19;
            var19.triggers = param2;
            var13 = 1;
            if (fra.field_a == 1 &&
              (16 & param3) != 0 &&
              (16 & param2) != 0) {
              var13 = 0;
            }
            if (var13 == 0) {
              var21.mousex = -2;
              var21.mousey = -2;
            } else {
              var19.mousex = param0;
              var19.mousey = param4;
            }
            if (this.activeSpecialOrderId != -1) {
              var21.specialOrderSubmessage = new SpecialOrderSubmessage(this.activeSpecialOrderId);
              if (11 != this.activeSpecialOrderId) {
                if (this.activeSpecialOrderId == 12) {
                  var21.specialOrderSubmessage.blueprint = es.field_b.blueprint;
                }
              } else {
                if (!this.blueprintOverwritePending &&
                  null != es.field_b &&
                  es.field_b.blueprint != null) {
                  this.blueprintOverwritePending = true;
                } else {
                  this.saveShipBlueprint(this.state.b(1).world.findShipByOwner(this.localPlayerIndex, 99), -90);
                  this.blueprintOverwritePending = false;
                }
              }
            }
            var14 = 0;
            var15 = this.state.b(1).world.findShipByOwner(this.localPlayerIndex, 91);
            if (var15 != null) {
              stackIn_67_0 = (!var15.isSpecialOrderActive(4, 114)) ? 0 : 1;
              var14 = stackIn_67_0;
              if (var14 != 0 &&
                GetFightersPerPlayerMaximum.field_p == 1) {
                stackIn_72_0 = (!var15.isRepairModeFullyCharged(-121)) ? 0 : 1;
                var14 = stackIn_72_0;
              }
            }
            var16 = 0;
            if (var14 != 0) {
              var25 = var15.chassis.collectDamagedComponentPaths(GetMinimapWidth.field_o, param4, 0, (byte) -42, param0, 0, (int[]) null);
              this.repairTargetPaths = var15.chassis.collectDamagedComponentPaths(GetMinimapWidth.field_o, param1, 0, (byte) -84, param5, 0, (int[]) null);
              if (SetBlueprintSaveTime.a(this.repairTargetPaths, var25, (byte) 28)) {
                var16 = 1;
              }
            } else {
              this.repairTargetPaths = null;
            }
            if (var10 == 0 && ((param2 & 128) == 0 ||
              GetMomentOfInertiaPredivideDownshift.field_q != 0) && var16 == 0) {
              if ((SetMissilesTopSpeed.field_o == 0) &&
                (fra.field_a == 0) &&
                (0 == FlipTextureOperation.field_p)) {
                this.submitPlayerAction(0, var10 != 0, var21);
              }
            } else {
              this.submitPlayerAction(0, var10 != 0, var21);
            }
          }
        }
    }

    private final void drawSpatialPartitionDebug(int param0) {
        int var5 = 0;
        int var7 = 0;
        int var2;
        Ship var3;
        int var4;
        PartitionZone var6;
        int var8;
        Nebula var9;
        int var10;
        int var11;
        int var12;
        World var13;
        int var2Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var12 = VoidHunters.field_G;
        if (GetPointDefenceLaserProjectiles.a(256, 11284) ||
          GetPointDefenceLaserProjectiles.a(512, 11284)) {
          var13 = this.state.a((byte) 112);
          if (this.localPlayerIndex < 0) {
            var2 = 39 / ((param0 + 39) / 51);
            decompiledFrameRemainder0 = false;
          }
          else {
            var3 = var13.findShipByOwner(this.localPlayerIndex, 59);
            if (var3 != null) {
              if (GetPointDefenceLaserProjectiles.a(256, 11284)) {
                var4 = var13.partitioningManager.findZonesInBounds((byte) 115, var3.getBoundingbox((byte) -60), 0);
                for (var5 = 0; var4 > var5; var5++) {
                  var6 = kpb.field_s[var5];
                  for (var7 = 0; var7 < var6.ids.length; var7++) {
                    var8 = var6.ids[var7];
                    var9 = var13.getNebulae((byte) 116)[var8];
                    var10 = ShipTeamConditionFactory.field_a.worldToScreenX(var9.getX(true), (byte) 118);
                    var11 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var9.getY((byte) -116));
                    SetMissileLauncherEnergyUsed.a(16777215, (byte) 7, var11, 16384.0f * ShipTeamConditionFactory.field_a.scale, 100, var10);
                  }
                  this.drawPartitionZoneDebug(105, var6);
                }
                this.drawPartitionBodiesDebug(-927, var13, 2, var3);
                this.drawPartitionBodiesDebug(-927, var13, 3, var3);
              }
              if (GetPointDefenceLaserProjectiles.a(512, 11284)) {
                this.drawPartitionBodiesDebug(-927, var13, 1, var3);
              }
            }
          }
        }
        if (decompiledFrameRemainder0) {
          var2Lifetime1 = 39 / ((param0 + 39) / 51);
        }

    }

    private final void activatePendingSpecialOrder(boolean param0, int param1) {
        if (param1 >= -95) {
          return;
        }
        if (this.pendingSpecialOrderId != -1) {
          if (SetDebrisPartitioned.field_o != 1 ||
            PacketBuffer.field_g != 1 ||
            param0) {
            if (!(this.pendingSpecialOrderId >= CarouselPlayerEvent.specialOrderDefinitions.length) &&
              !CarouselPlayerEvent.specialOrderDefinitions[this.pendingSpecialOrderId].requiresPrimaryPress(false)) {
              this.activeSpecialOrderId = this.pendingSpecialOrderId;
              if (this.activeSpecialOrderId <= 8 ||
                !SetMachineGunEnergyUsed.field_o[81]) {
                this.specialOrderActivated = true;
                this.debugOrderCategory = -1;
                this.pendingSpecialOrderId = -1;
              }
            }
          } else {
            this.activeSpecialOrderId = this.pendingSpecialOrderId;
            if (this.activeSpecialOrderId <= 8 ||
              !SetMachineGunEnergyUsed.field_o[81]) {
              this.specialOrderActivated = true;
              this.debugOrderCategory = -1;
              this.pendingSpecialOrderId = -1;
            }
          }
        }
    }

    private final boolean isChatAvailable(byte param0) {
        int var2;
        boolean stackIn_6_0 = false;
        boolean decompiledFrameRemainder0 = true;
        var2 = 49 % ((56 - param0) / 56);
        if ((this.networked ||
          GraphicsPresentException.field_a) && null != AdjustVariableActionFactory.field_a) {
          stackIn_6_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_6_0 = false;
        }
        return stackIn_6_0;
    }

    private final void drawInspectionMarker(int param0, int param1, int param2) {
        ToolkitSprite var4 = null;
        if (OpenGlTexture1D.field_i) {
          var4 = OpenGlVertexNormal.field_d[5];
          var4.draw(param0 - (var4.getWidth() >> 1), -(var4.getHeight() >> 1) + param2);
        }
        if (param1 <= 76) {
          this.autoZoomHeld = true;
        }
    }

    private final String[] getPlayerChatLines(byte param0, int param1, int param2) {
        boolean discarded$0 = false;
        int var7 = 0;
        String var4;
        int var5;
        int var6;
        ChatMessage var8;
        String var9;
        int var10;
        var10 = VoidHunters.field_G;
        if (param0 <= 26) {
          discarded$0 = this.clearFogCircle(-96, -60, -66, (byte) 53, 121);
        }
        if (null == NullUiRenderer.field_b) {
          return null;
        }
        var4 = "";
        var5 = 0;
        var6 = 0;
        for (var7 = this.field_u; var7 < NullUiRenderer.field_b.length; var7++) {
          var8 = NullUiRenderer.field_b[var7];
          if (var8 != null &&
            SetPhasedEnergyBeamFireForce.a(true, var8.field_e, this.state.getPlayerName(1, param2))) {
            if (var5 >= this.playerChatOffsets[param2]) {
              if (var6 > 0) {
                var4 = var4 + "\n";
              }
              if (var8.channelType == 4) {
                var9 = VoidHunters.getTeamName(param1, -1);
                var4 = var4 + "<col=" + UiFocusProxy.toHexString(-18879, AlphaContainer.getTeamColor(false, param1, 13894143)) + ">(" + var9 + ") " + var8.text + "</col>";
              } else {
                var4 = var4 + var8.text;
              }
              var6++;
            }
            var5++;
          }
        }
        if (0 < var6 &&
          this.playerChatTimers[param2] > 0) {
          this.playerChatTimers[param2] = this.playerChatTimers[param2] - 1;
        }
        if (0 >= this.playerChatTimers[param2]) {
          this.playerChatOffsets[param2] = this.playerChatOffsets[param2] + 1;
          this.playerChatTimers[param2] = 250;
        }
        if (var4.length() > 0) {
          return SetFighterBayAimspeed.a((byte) -67, '\n', var4);
        }
        return null;
    }

    private final ToolkitSprite getVoteOptionSprite(int param0, boolean param1, int param2) {
        if (param0 >= 14) {
          param0--;
        }
        int var4 = 45 + (2 * param0 + param2);
        if (param1) {
          GameSnapshot var5 = (GameSnapshot) null;
          this.drawFogOfWar((Ship) null, 120, (GameSnapshot) null, false);
        }
        if (OpenGlVertexNormal.field_d.length <= var4) {
          return null;
        }
        return OpenGlVertexNormal.field_d[var4];
    }

    private final int updateActionInput(int param0, int param1, boolean param2, GameSnapshot param3, int param4, int param5) {
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        Ship var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        PlayerAction var10 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          this.uiBlocksWorldInput = this.uiBlocksWorldInput | this.updateVotingPanel(118, param3, false);
          this.uiBlocksWorldInput = this.uiBlocksWorldInput | this.updateDebugOrderMenu(param3, this.uiBlocksWorldInput, false);
          if (param4 != 2) {
            this.drawRangeCircle(-37, (byte) -48, -64, -75);
          }
          if (!param2) {
            this.field_X = true;
          } else {
            if ((PacketBuffer.field_g & 1) == 0 &&
              !SetMachineGunEnergyUsed.field_o[84]) {
              this.specialOrderActivated = false;
              this.field_X = false;
            }
            if (this.localPlayerIndex >= 0) {
              var7 = param3.world.findShipByOwner(this.localPlayerIndex, 95);
              if (var7 == null) {
                if (!param3.world.getDebug((byte) -124)) {
                  this.pendingSpecialOrderId = -1;
                } else {
                  this.activatePendingSpecialOrder(this.uiBlocksWorldInput, -96);
                }
                this.autoZoomHeld = false;
                this.autoZoomTicks = 0;
                var8 = param3.getPlayer(this.localPlayerIndex, (byte) 59).spawnChoice;
                var9 = this.getPressedActionHotkey(102);
                if (0 == var9) {
                  var9 = 10;
                }
                var9--;
                if (0 <= var9 &&
                  SetWaitForPlayers.a(9) > var9 &&
                  var8 != var9 &&
                  ArchiveIndexLoader.field_g.isComponentOptionAvailable(ArchiveLoadRequest.a(-114), 3 + var9, (byte) -84)) {
                  var10 = new PlayerAction();
                  var10.mousey = param1;
                  var10.mousex = param0;
                  var10.specialOrderSubmessage = new SpecialOrderSubmessage();
                  var10.specialOrderSubmessage.spawnchoice = new SpawnChoice(var9);
                  this.submitPlayerAction(param4 - 2, true, var10);
                }
              } else {
                stackIn_14_0 = (!this.uiBlocksWorldInput) ? 0 : 1;
                var8 = stackIn_14_0;
                if (var8 == 0) {
                  stackIn_19_0 = (!this.updateSpecialOrderMenu((byte) 8, false, param3)) ? 0 : 1;
                  var8 = stackIn_19_0;
                }
                if (var8 != 0) {
                  this.uiBlocksWorldInput = true;
                }
                this.activatePendingSpecialOrder(var8 != 0, -116);
                param5 = this.collectControlTriggers(param3, this.uiBlocksWorldInput, param5, 8186);
              }
              this.activeSpecialOrderId = this.resolveActiveSpecialOrder(-19706);
            } else {
              this.activeSpecialOrderId = this.resolveActiveSpecialOrder(-19706);
            }
          }
          stackIn_37_0 = param5;
          return stackIn_37_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_40_0 = var7_ref;
          stackIn_40_1 = new StringBuilder().append("uca.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int getMenuActionAtPoint(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var3_int = 0;
          if (!param0) {
            field_D = (String) null;
          }
          var4 = SetUseOffscreenRendering.field_o;
          while (ToolkitCanvasContext.menuLabels.length > var3_int) {
            var5 = GetMessageMax.menuActionIds[var3_int];
            if (var5 >= 0) {
              var6 = MapClearanceRectangle.$cfr$intArgs$a$62abead39cee(-107, true, ToolkitCanvasContext.menuLabels[var3_int]);
              var4 = var4 + ro.field_c;
              var7 = -(var6 >> 1) + PlayerVote.field_f;
              if (SetMachineGunAimarc.a(var4, (GraphicsHeap.field_d << 1) + var6, (ColorizeTextureOperation.field_m << 1) + GetAngularVelocitySustain.field_p, param1, (byte) -65, var7 - GraphicsHeap.field_d, param2)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (ro.field_c + ((ColorizeTextureOperation.field_m << 1) + GetAngularVelocitySustain.field_p));
            } else {
              var4 = var4 + GetSniperCannonProjectileLife.field_r;
            }
            var3_int++;
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "uca.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int[] buildRadialSegmentPolygon(int param0, int param1, int param2, byte param3) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = VoidHunters.field_G;
        int var5 = GameKeyHandler.a(22433, -(param2 / 2) + param0);
        int var6 = 64;
        int var7 = var6 << 1;
        int[] var17 = new int[var7 + (var6 << 1)];
        int[] var16 = var17;
        int[] var8 = var16;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        if (param3 != -118) {
          this.autoZoomTicks = -123;
        }
        int var9 = param1 / 8;
        for (var10 = 0; var6 > var10; var10++) {
          var11 = var10 << 1;
          var12 = GameKeyHandler.a(param3 + 22551, param2 * (-1 + (var6 - var10)) / var6 + var5);
          var13 = this.radialMenuX + (GetNumStars.cosAngle(var12, (byte) -99) * var9 >> 16);
          var14 = this.radialMenuY + (var9 * TextureLineShape.sinAngle(var12, 69) >> 16);
          var17[var11] = var13;
          var8[var11 + 1] = var14;
        }
        for (var10Lifetime1 = 0; var6 > var10Lifetime1; var10Lifetime1++) {
          var11Lifetime1 = (var10Lifetime1 << 1) + var7;
          var12Lifetime1 = GameKeyHandler.a(22433, var5 + var10Lifetime1 * param2 / var6);
          var13Lifetime1 = this.radialMenuX + (param1 * GetNumStars.cosAngle(var12Lifetime1, (byte) -106) >> 16);
          var14Lifetime1 = this.radialMenuY + (param1 * TextureLineShape.sinAngle(var12Lifetime1, param3 + 188) >> 16);
          var17[var11Lifetime1] = var13Lifetime1;
          var8[var11Lifetime1 + 1] = var14Lifetime1;
        }
        return var8;
    }

    final void sendRematchAction(boolean param0) {
        boolean discarded$0 = false;
        if (!this.networked) {
          throw new IllegalStateException();
        }
        RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, 61);
        if (!param0) {
          GameSnapshot var3 = (GameSnapshot) null;
          discarded$0 = this.updateCameraFollowAndAutoZoom(36, (GameSnapshot) null, -87, -56, -91);
        }
    }

    private final void drawPartitionZoneDebug(int param0, PartitionZone param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var3_int = param1.gridx * 65536;
          var4 = ShipTeamConditionFactory.field_a.worldToScreenX(var3_int, (byte) 124);
          var5 = param1.gridy * 65536;
          var6 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var5);
          var7 = ShipTeamConditionFactory.field_a.worldToScreenX(65536 + var3_int, (byte) 119);
          var8 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var5 + 65536);
          if (param0 < 39) {
            this.activeSpecialOrderId = -98;
          }
          UiToggleButtonRenderer.drawRectangle(120, var4, -var6 + var8, var6, 16755455, -var4 + var7);
          GetLagStandardDeviationOut.a(1, "Gridx=" + param1.gridx + ", gridy=" + param1.gridy, 16711935, var6, var4, 4266);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uca.TA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void updateVoteOption(int param0, int param1, int param2, GameSnapshot param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        int var18_int = 0;
        int var29_int = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var14 = null;
        int var15 = 0;
        int var16 = 0;
        String var17 = null;
        ToolkitSprite var18 = null;
        Object var19_ref = null;
        int var19 = 0;
        Player var19_ref_tfa = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        ToolkitSprite var29 = null;
        int var30 = 0;
        int var31 = 0;
        String var32 = null;
        ToolkitSprite var33 = null;
        PlayerAction var34 = null;
        PlayerAction var35 = null;
        ToolkitSprite var36 = null;
        String var37 = null;
        ToolkitSprite var29Lifetime1;
        ToolkitSprite var29Lifetime2;
        int var20Lifetime1;
        int var21Lifetime1;
        int var27Lifetime1;
        int var27Lifetime2;
        int var28Lifetime1;
        int var28Lifetime2;
        var19_ref = null;
        var31 = VoidHunters.field_G;
        try {
          if (param0 < 0) {
            return;
          }
          var37 = ShipTeamCondition.field_f[param0];
          var17 = var37;
          var17 = var37;
          if (param7 <= 99) {
            this.beginPacket(50);
          }
          var15 = 0;
          var16 = 0;
          var17 = "";
          for (var18_int = 0; var18_int < param3.players.length; var18_int++) {
            var19_ref_tfa = (Player) (param3.players[var18_int]);
            if (var19_ref_tfa.connected &&
              var19_ref_tfa.votes != null) {
              var20 = 0;
              for (var21 = 0; var19_ref_tfa.votes.length > var21; var21++) {
                if (var19_ref_tfa.votes[var21] == param0) {
                  var20++;
                }
              }
              if (0 < var20) {
                if (var15 > 0) {
                  var17 = var17 + ", ";
                }
                var32 = var17 + this.state.getPlayerName(1, var18_int);
                var17 = var32;
                if (1 < var20) {
                  var17 = var32 + " <times>" + var20;
                }
                if (this.localPlayerIndex == var18_int) {
                  var16 = var16 + var20;
                }
                var15 = var15 + var20;
              }
            }
          }
          var33 = OpenGlVertexNormal.field_d[param2];
          var29 = var33;
          var29Lifetime1 = var33;
          var19 = 3 + var33.getWidth();
          var20Lifetime1 = -param5 + param9;
          var21Lifetime1 = param6 - param5;
          var22 = param5 + (param1 * param9 + param4);
          var23 = param5 + param10 + (param11 + var21Lifetime1 + param8 * param6);
          if (var22 <= GetUseDetailLines.field_o &&
            GetTorpedoReload.field_q >= -var21Lifetime1 + var23 &&
            GetUseDetailLines.field_o < var22 + var20Lifetime1 &&
            GetTorpedoReload.field_q < var23 &&
            !param12) {
            this.hoveredVoteOptionId = param0;
            if (!ArchiveIndexLoader.field_g.isVoteOptionComingSoon(param0, 4)) {
              if (var15 == 0) {
                GetMassDriverReload.a(PartitioningManager.field_c, -46);
              } else {
                GetMassDriverReload.a(SetReverbGain.a(ShipBodyFactory.field_a, new String[]{var17}, 93), -35);
              }
            } else {
              GetMassDriverReload.a(GetDebrisCollisionDamage.field_o, -64);
            }
            if (ArchiveIndexLoader.field_g.isVoteOptionAvailable(param0, 11, ArchiveLoadRequest.a(-113))) {
              this.voteHighlightAlphas[param0] = Math.min(255, 64 + this.voteHighlightAlphas[param0]);
              if (SetDebrisPartitioned.field_o != 1) {
                if (SetDebrisPartitioned.field_o == 2) {
                  var35 = new PlayerAction();
                  var35.a(true, param0, -30790);
                  this.submitPlayerAction(0, true, var35);
                }
              } else {
                var34 = new PlayerAction();
                var34.a(false, param0, -30790);
                this.submitPlayerAction(0, true, var34);
              }
            }
          }
          if (param12) {
            var24 = 56035;
            var25 = var24;
            if (0 < var16) {
              var25 = 16763938;
            }
            var26 = -1;
            if (ArchiveIndexLoader.field_g.isVoteOptionNew(param0, (byte) 41)) {
              var26 = 16755200;
            } else {
              if (!ArchiveIndexLoader.field_g.isVoteOptionComingSoon(param0, 4)) {
                if (ArchiveIndexLoader.field_g.isVoteOptionLimitedTime(param0, (byte) -43)) {
                  var26 = 16776960;
                }
              } else {
                var26 = 11154176;
              }
            }
            if (var26 != -1) {
              GetMachineGunPulsetime.a(var26, -47, 2 + var20Lifetime1, var23 - (var21Lifetime1 + 1), 2 + var21Lifetime1, -1 + var22);
            }
            GetMachineGunPulsetime.a(1, -108, var20Lifetime1, var23 - var21Lifetime1, var21Lifetime1, var22);
            if (var15 > 0) {
              var27 = 2;
              var28 = 6;
              for (var29_int = 0; var29_int < var15; var29_int++) {
                GetPhasedEnergyBeamReload.a(var28 + (-var21Lifetime1 + var23), (float)var27, -102, -var28 + var20Lifetime1 + var22 - var29_int * (var28 + var27), var24);
              }
            }
            if (OpenGlTexture1D.field_i) {
              var27Lifetime1 = 3 + var22;
              var28Lifetime1 = -(var21Lifetime1 / 2) + (var23 - var33.getHeight() / 2);
              var29Lifetime2 = this.getVoteOptionSprite(param0, false, 1);
              if (var29Lifetime2 != null) {
                if (var15 <= 0) {
                  var29Lifetime2.draw(4 + var27Lifetime1, var28Lifetime1 + 4, 2, 577136230, 1);
                } else {
                  var29Lifetime2.draw(var27Lifetime1 + 4, 4 + var28Lifetime1);
                }
              }
              var33.draw(var27Lifetime1, var28Lifetime1);
              if (this.voteHighlightAlphas[param0] > 0) {
                var36 = OpenGlVertexNormal.field_d[1 + param2];
                var18 = var36;
                var30 = this.voteHighlightAlphas[param0];
                SetUseBackground.field_o.pushClip(var27Lifetime1, (var30 * var36.getWidth() >> 8) + var27Lifetime1, var28Lifetime1, var28Lifetime1 + var36.getHeight(), (byte) -105);
                var18.draw(var27Lifetime1, var28Lifetime1, 0, var30 << 24 | 16777215, 1);
                SetUseBackground.field_o.pop(true);
              }
            }
            var27Lifetime2 = 2;
            var28Lifetime2 = -(var27Lifetime2 * 2) + (var20Lifetime1 - var19);
            SetAutoaim.a(-1, var21Lifetime1, var19 + (var22 + var27Lifetime2), 10, 1, var37, var25, var28Lifetime2, 98, var23 - var21Lifetime1, 1, 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_79_0 = var14;
          stackIn_79_1 = new StringBuilder().append("uca.JD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    private final int drawWeaponTargetGuide(int param0, int param1, int param2, int param3, Ship param4) {
        int stackIn_4_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ShipComponent var10 = null;
        int var11 = 0;
        ShipComponentDefinition var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        WeaponDefinition var23 = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        var29 = VoidHunters.field_G;
        try {
          if (param1 == -1 &&
            param0 == -1) {
            stackIn_4_0 = param2;
            return stackIn_4_0;
          }
          var6_int = ShipTeamConditionFactory.field_a.screenToWorldX(true, param1);
          var7 = ShipTeamConditionFactory.field_a.screenToWorldY(0, param0);
          var8 = param4.chassis.collectWeapons(param3 ^ 126, param3);
          var9 = 0;
          scanLoop1: while (true) {
            if (var9 < var8) {
              var10 = GetPointDefenceLaserProjectileInterceptDamage.field_q[var9];
              if (!var10.isDestroyed((byte) 59)) {
                var11 = var10.getAimArc(114);
                if (0 != var11) {
                  var12 = var10.getDefinition((byte) -112);
                  var13 = var10.getWorldConnectionX(var12, (byte) -69);
                  var14 = var10.getWorldConnectionY(-102, var12);
                  var15 = var10.getUnrotatedWorldAngle((byte) -127);
                  var16 = var6_int - var13;
                  var17 = var7 - var14;
                  var18 = GameSnapshotFactory.a(var17, (byte) -77, var16);
                  var19 = GameKeyHandler.a(param3 + 22433, var18 - var15);
                  if (var11 >= Math.abs(var19)) {
                    param2 = 2;
                    if (!AccountCreationDialog.field_Y) {
                      break scanLoop1;
                    }
                    if ((1 & PacketBuffer.field_g) != 0) {
                      break scanLoop1;
                    }
                    var20 = ShipTeamConditionFactory.field_a.worldToScreenX(var13, (byte) 113);
                    var21 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var14);
                    if (var10.weaponbehaviour.isReadyToFire((byte) 118)) {
                      var22 = TextLayout.approximateVectorLength(var16, (byte) 116, var17);
                      var23 = SetShipDirectionArrow.weaponDefinitions[var10.weaponbehaviour.weapontype];
                      var24 = GetUseDetailLines.field_o;
                      var25 = GetTorpedoReload.field_q;
                      var26 = var23.getProjectileRange(122) << 3;
                      if (var22 > var26) {
                        var27 = var16 * 255 / var22 * var26 / 255;
                        var24 = ShipTeamConditionFactory.field_a.worldToScreenX(var27 + var13, (byte) 122);
                        var28 = var17 * 255 / var22 * var26 / 255;
                        var25 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var28 + var14);
                      }
                      SetShowTutorial.a(var20, (byte) 66, var24, var21, 16777215, var25, 30);
                    }
                  }
                }
              }
              var9++;
              continue;
            }
            break;
          }
          stackIn_26_0 = param2;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_29_0 = var6;
          stackIn_29_1 = new StringBuilder().append("uca.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    private final void updateRadialMenuActivation(int param0) {
        int var3;
        var3 = VoidHunters.field_G;
        if (this.pendingSpecialOrderId == -1 &&
          SetMachineGunEnergyUsed.field_o[81] &&
          !this.previousKeyStates[81] &&
          GetUseDetailLines.field_o != -1 &&
          GetTorpedoReload.field_q != -1 &&
          (GetBots.field_o & 2) == 0) {
          this.radialMenuActive = true;
          this.radialMenuY = GetTorpedoReload.field_q;
          this.radialMenuX = GetUseDetailLines.field_o;
        } else {
          if (!SetMachineGunEnergyUsed.field_o[81]) {
            this.radialMenuActive = false;
          }
        }
        if (this.radialMenuActive) {
          this.radialMenuAlpha = this.radialMenuAlpha + 32;
          if (255 < this.radialMenuAlpha) {
            this.radialMenuAlpha = 255;
          }
        } else {
          this.radialMenuAlpha = this.radialMenuAlpha - 32;
          if (this.radialMenuAlpha < 0) {
            this.radialMenuAlpha = 0;
          }
        }
        if (param0 != -17410) {
          this.field_Q = -15;
        }
    }

    private final void ensureFallbackVote(int param0, GameSnapshot param1, int param2, int param3, int param4) {
        int var11_int = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        PlayerAction var11 = null;
        int var12 = 0;
        Ship var13 = null;
        Player var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int var8Lifetime1;
        var12 = VoidHunters.field_G;
        try {
          var14 = param1.getPlayer(this.localPlayerIndex, (byte) 59);
          if (var14 != null) {
            var7 = 1;
            for (var8 = param4; var8 < param3; var8++) {
              if (bia.isVoteOptionAvailable(ArchiveLoadRequest.a(param2 ^ 127), (byte) -31, var8)) {
                var7 = 0;
              }
            }
            if (var7 != 0) {
              var8Lifetime1 = -3;
              if (param0 == 1) {
                var8Lifetime1 = -1;
              } else {
                if (param0 == 2) {
                  var8Lifetime1 = -2;
                }
              }
              var16 = var14.votes;
              var15 = var16;
              var9 = var15;
              var10 = 0;
              if (var9 != null) {
                for (var11_int = 0; var11_int < var16.length; var11_int++) {
                  if (var8Lifetime1 == var16[var11_int]) {
                    var10 = 1;
                  }
                }
              }
              if (var10 == 0) {
                var11 = new PlayerAction();
                var11.a(false, var8Lifetime1, -30790);
                this.submitPlayerAction(0, true, var11);
              }
            }
          }
          if (param2 != -11) {
            var13 = (Ship) null;
            this.handleSpecialOrderPointer((SpecialOrderButtonState) null, false, (Ship) null, 80, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_30_0 = var6;
          stackIn_30_1 = new StringBuilder().append("uca.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean updateCameraFollowAndAutoZoom(int param0, GameSnapshot param1, int param2, int param3, int param4) {
        int stackIn_58_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        World var8 = null;
        Ship var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        int[] var22 = null;
        float var13Lifetime1;
        float var14Lifetime1;
        float var15Lifetime1;
        var18 = VoidHunters.field_G;
        try {
          var6_int = 0;
          var7 = 77 % ((param4 + 85) / 33);
          var8 = this.state.a((byte) 90);
          if (this.localPlayerIndex >= 0) {
            var9 = param1.world.findShipByOwner(this.localPlayerIndex, 89);
            if (var9 != null) {
              var22 = var9.getBoundingbox((byte) -62);
              var11 = (var22[1] + var22[0]) / 2;
              var12 = (var22[3] + var22[2]) / 2;
              if (var22[1] < var22[0]) {
                var11 = var9.getX(false);
                var12 = var9.getY((byte) 1);
              }
              if (!var8.getDebug((byte) 96) &&
                !this.state.carouselInfo.isReplay(1)) {
                var13 = 30.0f;
                var14 = (float)var11 + var13 * (float)var9.getVelocityX((byte) -117);
                var15 = (float)var12 + (float)var9.getVelocityY(0) * var13;
                ShipTeamConditionFactory.field_a.worldCenterX = (var14 + 9.0f * ShipTeamConditionFactory.field_a.worldCenterX) / 10.0f;
                ShipTeamConditionFactory.field_a.worldCenterY = (9.0f * ShipTeamConditionFactory.field_a.worldCenterY + var15) / 10.0f;
                ShipTeamConditionFactory.field_a.updateWorldBounds(MissionVariableFactory.field_a, 0, -117, PartitionZoneFactory.field_a, 0);
                if (ShipTeamConditionFactory.field_a.worldBounds[0] > var22[0]) {
                  ShipTeamConditionFactory.field_a.worldCenterX = ShipTeamConditionFactory.field_a.worldCenterX + (float)((-ShipTeamConditionFactory.field_a.worldBounds[0] + var22[0]) / 2);
                }
                if (ShipTeamConditionFactory.field_a.worldBounds[2] > var22[2]) {
                  ShipTeamConditionFactory.field_a.worldCenterY = ShipTeamConditionFactory.field_a.worldCenterY + (float)((var22[2] - ShipTeamConditionFactory.field_a.worldBounds[2]) / 2);
                }
                if (var22[1] > ShipTeamConditionFactory.field_a.worldBounds[1]) {
                  ShipTeamConditionFactory.field_a.worldCenterX = ShipTeamConditionFactory.field_a.worldCenterX - (float)((ShipTeamConditionFactory.field_a.worldBounds[1] - var22[1]) / 2);
                }
                if (ShipTeamConditionFactory.field_a.worldBounds[3] < var22[3]) {
                  ShipTeamConditionFactory.field_a.worldCenterY = ShipTeamConditionFactory.field_a.worldCenterY - (float)((ShipTeamConditionFactory.field_a.worldBounds[3] - var22[3]) / 2);
                }
              }
              if (var9.isSpecialOrderActive(4, 44)) {
                this.autoZoomHeld = false;
                this.field_r = 1;
                if (GetFightersPerPlayerMaximum.field_p == 1) {
                  this.autoZoomTicks = 2;
                } else {
                  this.autoZoomTicks = SetShipTeamActionFactory.field_c;
                }
              } else {
                if ((param3 & 128) != 0 && (var9.getDragging(-109) != -1 &&
                  var9.getTargetBlueprint((byte) 28) == null ||
                  this.autoZoomTicks > 0) && 1 == GetPointDefenceLaserPulsetime.field_q) {
                  if (SetSniperCannonReload.field_o == 1) {
                    this.autoZoomHeld = true;
                  }
                  this.field_r = 0;
                  this.autoZoomTicks = SetShipTeamActionFactory.field_c;
                }
              }
              if (this.autoZoomTicks > 0) {
                var13Lifetime1 = (float)(var22[1] - var22[0]);
                var14Lifetime1 = (float)(-var22[2] + var22[3]);
                var15Lifetime1 = (float)SetMassDriverReload.field_p / var13Lifetime1;
                var16 = (float)GetLaserAimarc.field_q / var14Lifetime1;
                var17 = Math.min(var15Lifetime1, var16) * PerlinNoiseTextureOperation.field_n;
                if ((param3 & 128) == 0 &&
                  0 != param3) {
                  this.autoZoomHeld = false;
                }
                ShipTeamConditionFactory.field_a.scale = ShipTeamConditionFactory.field_a.scale + (-ShipTeamConditionFactory.field_a.scale + var17) / (float)SetMassDriverProjectileDamage.field_o;
                var6_int = 1;
                if (!this.autoZoomHeld) {
                  this.autoZoomTicks = this.autoZoomTicks - 1;
                }
              }
            } else {
              var10 = param1.missionState.getMissionPhase(8);
              if (0 == var10 ||
                1 == var10 ||
                var10 == 2) {
                this.manualZoomScale = 0.001953125f;
                ShipTeamConditionFactory.field_a.worldCenterX = 0.0f;
                ShipTeamConditionFactory.field_a.worldCenterY = 0.0f;
              }
            }
          }
          if (!var8.getDebug((byte) 39) &&
            !this.state.carouselInfo.isReplay(1)) {
            if (ShipTeamConditionFactory.field_a.worldCenterX < (float)(-var8.getWidth((byte) -122) / 2)) {
              ShipTeamConditionFactory.field_a.worldCenterX = (float)(-var8.getWidth((byte) -122) / 2);
            }
            if (ShipTeamConditionFactory.field_a.worldCenterY < (float)(-var8.getHeight(1) / 2)) {
              ShipTeamConditionFactory.field_a.worldCenterY = (float)(-var8.getHeight(1) / 2);
            }
            if (ShipTeamConditionFactory.field_a.worldCenterX > (float)(var8.getWidth((byte) -122) / 2)) {
              ShipTeamConditionFactory.field_a.worldCenterX = (float)(var8.getWidth((byte) -122) / 2);
            }
            if (ShipTeamConditionFactory.field_a.worldCenterY > (float)(var8.getHeight(1) / 2)) {
              ShipTeamConditionFactory.field_a.worldCenterY = (float)(var8.getHeight(1) / 2);
            }
          }
          stackIn_58_0 = var6_int;
          return stackIn_58_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_61_0 = var6;
          stackIn_61_1 = new StringBuilder().append("uca.MB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final String getPlayerName(int param0, byte param1) {
        if (param1 >= -90) {
          this.field_W = (Ship) null;
        }
        return this.state.getPlayerName(1, param0);
    }

    private final void drawWeaponAimArcs(Ship param0, boolean param1, int param2, int param3) {
        int var6 = 0;
        WeaponBehaviour stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        Camera2D stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        ShipComponent var7 = null;
        int var8 = 0;
        ShipComponentDefinition var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        var27 = VoidHunters.field_G;
        try {
          if (param0 != null &&
            this.localPlayerIndex == param0.getOwner((byte) -117) &&
            param0.justAttachedSomething) {
            var5_int = param0.chassis.collectWeapons(127, 0);
            for (var6 = 0; var6 < var5_int; var6++) {
              var7 = GetPointDefenceLaserProjectileInterceptDamage.field_q[var6];
              stackIn_8_0 = var7.weaponbehaviour;
              stackIn_9_1 = !(param1);
              if (((WeaponBehaviour) (Object) stackIn_8_0).a(stackIn_9_1)) {
                var8 = var7.getAimArc(114);
                if (var8 != 0) {
                  var9 = var7.getDefinition((byte) -112);
                  var10 = var7.getWorldConnectionX(var9, (byte) -69);
                  var11 = var7.getWorldConnectionY(-90, var9);
                  var12 = var7.getUnrotatedWorldAngle((byte) -127);
                  var13 = param2 - var10;
                  var14 = param3 - var11;
                  var15 = GameSnapshotFactory.a(var14, (byte) -77, var13);
                  var16 = GameKeyHandler.a(22433, -var12 + var15);
                  var17 = ShipTeamConditionFactory.field_a.worldToScreenX(var10, (byte) 122);
                  var18 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var11);
                  if (Math.abs(var16) <= var8) {
                    DelayedPacket.drawLine(ShipTeamConditionFactory.field_a.worldToScreenY(true, param3), ShipTeamConditionFactory.field_a.worldToScreenX(param2, (byte) 124), var17, var18, -16777216, 16711680);
                  }
                  var19 = 16777215;
                  var20 = GameKeyHandler.a(22433, var12 - var8);
                  var21 = GameKeyHandler.a(22433, var12 + var8);
                  var22 = var7.weaponbehaviour.getDefinition((byte) 24).getProjectileRange(123) << 3;
                  var23 = var10 + (GetNumStars.cosAngle(var20, (byte) 44) >> 8) * (var22 >> 8);
                  var24 = (var22 >> 8) * (TextureLineShape.sinAngle(var20, 70) >> 8) + var11;
                  var25 = (GetNumStars.cosAngle(var21, (byte) 61) >> 8) * (var22 >> 8) + var10;
                  var26 = (var22 >> 8) * (TextureLineShape.sinAngle(var21, 86) >> 8) + var11;
                  DelayedPacket.drawLine(ShipTeamConditionFactory.field_a.worldToScreenY(true, var24), ShipTeamConditionFactory.field_a.worldToScreenX(var23, (byte) 124), var17, var18, -16777216, var19);
                  stackIn_18_0 = ShipTeamConditionFactory.field_a;
                  stackIn_19_1 = !(param1);
                  DelayedPacket.drawLine(((Camera2D) (Object) stackIn_18_0).worldToScreenY(stackIn_19_1, var26), ShipTeamConditionFactory.field_a.worldToScreenX(var25, (byte) 115), var17, var18, -16777216, var19);
                }
              }
            }
          }
          if (param1) {
            this.blueprintOverwritePending = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("uca.IA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean updateSpecialOrderMenu(byte param0, boolean param1, GameSnapshot param2) {
        int stackIn_33_0 = 0;
        boolean stackIn_54_1 = false;
        int stackIn_143_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_223_0 = 0;
        RuntimeException stackIn_226_0 = null;
        StringBuilder stackIn_226_1 = null;
        String stackIn_227_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Ship var5 = null;
        int var6 = 0;
        int var7 = 0;
        SpecialOrderButtonState var7_ref_lw = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        SpecialOrderButtonState var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        String var34_ref_String = null;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37_int = 0;
        String var37 = null;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        SpecialOrderDefinition var41 = null;
        String var42 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var24Lifetime1;
        int var29Lifetime1;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var32Lifetime2;
        int var33Lifetime1;
        int var33Lifetime2;
        int var38Lifetime1;
        int var33Lifetime1Lifetime1;
        var40 = VoidHunters.field_G;
        try {
          if (null != this.tutorialController &&
            !this.tutorialController.isHintComplete(9, true) &&
            !this.tutorialController.isHintComplete(5, true) && ((!this.tutorialController.isHintVisible(9, -106) ||
            !(SetMinimapWidth.field_o % 20 <= 10) &&
            param1) &&
            (!this.tutorialController.isHintVisible(5, -99) ||
            !(SetMinimapWidth.field_o % 20 <= 10) &&
            param1))) {
            return false;
          }
          var4_int = 0;
          var5 = param2.world.findShipByOwner(this.localPlayerIndex, 111);
          if (param0 < 7) {
            return false;
          }
          if (var5 != null &&
            !var5.isSpecialOrderActive(9, 90) &&
            param2.missionState.getMissionPhase(8) == 5) {
            if (param1) {
              this.specialOrderStatuses.clear(96);
              var5.collectSpecialOrderStatuses(this.specialOrderStatuses, 9, this.field_x, param2.world.isBodyIdReserved(var5.getId(false), (byte) 21));
              if (this.tutorialController.isHintComplete(10, true)) {
                stackIn_33_0 = 1;
              } else {
                if (this.tutorialController.isHintVisible(10, -16)) {
                  if (SetMinimapWidth.field_o % 20 > 10) {
                    stackIn_33_0 = (param1) ? 1 : 0;
                  } else {
                    stackIn_33_0 = 1;
                  }
                } else {
                  stackIn_33_0 = 0;
                }
              }
              var6 = stackIn_33_0;
              if (var6 != 0) {
                if (!this.field_x &&
                  13 == param2.world.getObjectiveType(false) && (!this.networked ||
                  ComponentContact.field_d != 0)) {
                  this.specialOrderStatuses.addLast(-10258, new SpecialOrderStatus(10, 0));
                }
                if (SetShipTeamActionFactory.field_b) {
                  this.specialOrderStatuses.addLast(-10258, new SpecialOrderStatus(11, 0));
                  if (es.field_b != null &&
                    es.field_b.blueprint != null) {
                    var7 = 0;
                    if (null != var5.getTargetBlueprint((byte) 28)) {
                      var7 = 51;
                    }
                    if (es.field_b.blueprint.description != null &&
                      es.field_b.blueprint.description[0] != var5.chassis.getComponentTypeId(0)) {
                      var7 = 50;
                    }
                    this.specialOrderStatuses.addLast(-10258, new SpecialOrderStatus(12, var7));
                  }
                }
              }
              stackIn_54_1 = (-1 != var5.getDragging(-108)) && (var5.getTargetBlueprint((byte) 28) == null);
              this.synchronizeSpecialOrderButtons(stackIn_54_1, this.specialOrderStatuses, this.specialOrderButtons, -65);
              this.drawSpecialOrderTooltip(15097);
            }
            var6Lifetime1 = 0;
            var7_ref_lw = (SpecialOrderButtonState) (this.specialOrderButtons.first(0));
            while (var7_ref_lw != null) {
              if (var7_ref_lw.specialOrderId != 9 &&
                var7_ref_lw.specialOrderId != 8) {
                var7_ref_lw = (SpecialOrderButtonState) (this.specialOrderButtons.next((byte) 50));
                continue;
              }
              var6Lifetime1 = 1;
              break;
            }
            if (!param1) {
              this.updateRadialMenuActivation(-17410);
            }
            var7Lifetime1 = NodeHashTable.field_a;
            var8 = var7Lifetime1 + CarouselSlotStateDump.field_g;
            var9 = 8;
            var10 = 7680 / var9;
            if (this.radialMenuAlpha > 0 &&
              param1) {
              this.drawRadialMenuBackground(-97, var8, var10, var9);
            }
            var11 = 0;
            var12 = SetFighterBayAimarc.field_o;
            var13 = MissionVariableFactory.field_a - SoftwareRasterizer2D.height + SetToggledScoreboard.field_o.screenY;
            var14 = -GetSalvoDamageMultiplier.field_p + var13;
            if (this.field_i < 255) {
              var14 = var14 + (255 - this.field_i) / 4;
              var12 = var12 - (-this.field_i + 255) / 6;
            }
            var15 = (SpecialOrderButtonState) (this.specialOrderButtons.first(0));
            while (var15 != null) {
              var16 = chb.field_a;
              var17 = CarouselSlotStateDump.field_g;
              var18 = var12 + (var11 * var16 + 6 * var11);
              var19 = var14;
              var20 = this.getRadialSegmentAngle(false, var9, var15.specialOrderId);
              if (this.radialMenuAlpha > 0) {
                var21 = this.radialMenuX + (GetNumStars.cosAngle(var20, (byte) 47) * var7Lifetime1 >> 16) - var16 / 2;
                var22 = -(var17 / 2) + this.radialMenuY + (TextureLineShape.sinAngle(var20, 95) * var7Lifetime1 >> 16);
                if (this.radialMenuAlpha < 255) {
                  var23_int = -var18 + var21;
                  var24 = var22 - var19;
                  var18 = (this.radialMenuAlpha * var23_int >> 8) + var18;
                  var19 = var19 + (this.radialMenuAlpha * var24 >> 8);
                } else {
                  var19 = var22;
                  var18 = var21;
                }
              }
              var21Lifetime1 = 0;
              var22Lifetime1 = 1;
              if (var15.specialOrderId == 8) {
                if (!var5.getSelfDestructPrepared((byte) -109)) {
                  var18 = var12 - 3;
                  var19 = -var17 + var14 - 12;
                } else {
                  if (this.field_i < 255) {
                    var12 = var12 - (-this.field_i + 255) / 8;
                  }
                  var19 = -var17 + var14 - 12;
                  var18 = -3 + (6 + (var16 + var12));
                }
                var22Lifetime1 = 0;
                var21Lifetime1 = 1;
                var16 = 32;
              }
              if (var15.specialOrderId == 9) {
                var21Lifetime1 = 1;
                var19 = -12 + (-var17 + var14);
                var18 = var12 - 3;
                var16 = 32;
                var22Lifetime1 = 0;
              }
              if (var15.specialOrderId == 10) {
                var18 = var12;
                var19 = -12 + (-var17 + var14);
                if (SetShipTeamActionFactory.field_b &&
                  this.field_i < 255) {
                  var18 = var18 - (255 - this.field_i) / 12;
                }
                if (var6Lifetime1 != 0) {
                  var19 = var19 + (-var17 - 12);
                }
                var22Lifetime1 = 0;
                var21Lifetime1 = 0;
              }
              if (11 == var15.specialOrderId) {
                var18 = 6 + (var16 + var12);
                if (13 != param2.world.getObjectiveType(false) ||
                  this.networked &&
                  ComponentContact.field_d == 0 ||
                  this.field_x) {
                  var18 = var18 - (6 + var16);
                }
                if (this.field_i < 255) {
                  this.blueprintOverwritePending = false;
                  var18 = var18 - (-this.field_i + 255) / 8;
                }
                var19 = var14 - var17 - 12;
                if (var6Lifetime1 != 0) {
                  var19 = var19 + (-var17 - 12);
                }
                var22Lifetime1 = 0;
                if (this.blueprintOverwritePending) {
                  var23 = veb.field_a;
                  SetSelfDestructPrepareToggleCooldown.a(var18, 1, -GetPointDefenceLaserProjectiles.a(false, 3) + (var19 + 4), var23, 3, 16777215, (byte) -117);
                }
                var21Lifetime1 = 0;
              }
              if (var15.specialOrderId == 12) {
                var18 = 12 + (2 * var16 + var12);
                if (param2.world.getObjectiveType(false) != 13 ||
                  this.networked &&
                  ComponentContact.field_d == 0 ||
                  this.field_x) {
                  var18 = var18 - (6 + var16);
                }
                if (this.field_i < 255) {
                  var18 = var18 - (255 - this.field_i) / 4;
                }
                var19 = -12 + (-var17 + var14);
                var22Lifetime1 = 0;
                if (var6Lifetime1 != 0) {
                  var19 = var19 + (-var17 - 12);
                }
                var21Lifetime1 = 0;
              }
              var15.y = var19;
              var15.x = var18;
              var41 = CarouselPlayerEvent.specialOrderDefinitions[var15.specialOrderId];
              if (0 >= var15.nonPositiveStateCount) {
                if (var41.allowsActivationWithoutReadyComponents(83)) {
                  if (!var41.hidesReadyCount((byte) -117)) {
                    if (0 != var15.field_j) {
                      stackIn_143_0 = (var15.field_j == var41.getCooldown((byte) 64)) ? 1 : 0;
                    } else {
                      stackIn_143_0 = 1;
                    }
                  } else {
                    stackIn_143_0 = 1;
                  }
                } else {
                  stackIn_143_0 = 0;
                }
              } else {
                stackIn_143_0 = 1;
              }
              var24Lifetime1 = stackIn_143_0;
              var25 = 0;
              if (var15.specialOrderId < 8) {
                stackIn_149_0 = (this.radialMenuAlpha > 0) ? 1 : 0;
              } else {
                stackIn_149_0 = 0;
              }
              var26 = stackIn_149_0;
              if (var26 == 0 &&
                GetUseDetailLines.field_o >= var18 &&
                GetUseDetailLines.field_o <= var16 + var18 &&
                var19 <= GetTorpedoReload.field_q &&
                var19 + var17 >= GetTorpedoReload.field_q ||
                var26 != 0 &&
                this.isMouseInRadialSegment(var10, (byte) -3, var20, var8)) {
                this.handleSpecialOrderPointer(var15, var24Lifetime1 != 0, var5, 80, param1);
                var4_int = 1;
                var25 = 1;
              }
              var27 = var41.getShortcutKey(-1);
              if (!param1) {
                this.handleSpecialOrderHotkey(var15, (byte) -80, var27, var24Lifetime1 != 0);
              }
              if (param1) {
                var28 = var15.field_d;
                if (var28 < 50) {
                  for (var29 = 1; var29 < 5; var29++) {
                    var30 = 256 + (50 - var28) * var29 * (GetLaserAimarc.field_q >> 3);
                    var31 = var30 * var16 >> 8;
                    var32 = var30 * var17 >> 8;
                    var33 = 200;
                    if (var28 > 45) {
                      var33 = (-(var28 * 255) + 12750) / 5;
                    }
                    GetMissilesHitSourceTeam.a(-(var31 >> 1) + var18 + (var16 >> 1), (var17 >> 1) + var19 - (var32 >> 1), (byte) -128, var32, var33, 11184810, var31);
                  }
                }
                var29Lifetime1 = var41.getCooldown((byte) 64);
                if (this.pendingSpecialOrderId != var15.specialOrderId &&
                  var15.nonPositiveStateCount > 0) {
                }
                var30Lifetime1 = (-var15.field_j + var29Lifetime1 << 8) / var29Lifetime1;
                var31Lifetime1 = 0;
                if (var30Lifetime1 < 0 &&
                  var41.getActiveDuration(-25131) > 0) {
                  var32Lifetime1 = var15.field_j - var29Lifetime1;
                  var31Lifetime1 = 1;
                  var30Lifetime1 = (var32Lifetime1 << 8) / var41.getActiveDuration(-25131);
                }
                var32Lifetime2 = 11;
                if (var21Lifetime1 == 0) {
                  if (var26 == 0) {
                    GetMachineGunPulsetime.a(1907488, -55, var16 + 3, -2 + var19, 4 + var17, -2 + var18);
                  }
                  if (OpenGlTexture1D.field_i) {
                    var33Lifetime1 = -65536;
                    if (var31Lifetime1 == 0 &&
                      var15.specialOrderId != this.pendingSpecialOrderId) {
                      if (255 <= var30Lifetime1) {
                        var33Lifetime1 = -16711936;
                      }
                    } else {
                      var33Lifetime1 = -16744305;
                    }
                    if (var26 != 0) {
                      this.fillRadialSegment(var10, var33Lifetime1, var8, -122, this.radialMenuAlpha >> 1, var20);
                      if (var25 != 0) {
                        this.fillRadialSegment(var10, var33Lifetime1, var8, -62, this.radialMenuAlpha >> 1, var20);
                      }
                      var34_ref_String = GetBlueprintSaveTime.specialOrderShortLabels[var15.specialOrderId];
                      OpenGlShaderProgram.a(16777215, this.radialMenuAlpha, 1, var34_ref_String, (byte) -69, 3, var19, var16 / 2 + (var18 - tea.a(3, var34_ref_String, 13879) / 2));
                    } else {
                      OpenGlVertexNormal.field_d[101].draw(var18, var19, 0, var33Lifetime1, 1);
                      if (var25 != 0) {
                        OpenGlVertexNormal.field_d[101].draw(var18, var19, 0, -2004318072, 2);
                      }
                    }
                  }
                  if (var26 == 0) {
                    GetMachineGunPulsetime.a(0, -59, -1 + var16, var19 - (-var17 + var32Lifetime2), var32Lifetime2, var18);
                  }
                  if (var25 != 0 &&
                    var15.specialOrderId == 12) {
                    var33Lifetime1Lifetime1 = var16 / 2 + var18;
                    this.drawBlueprintBuildPreview(var33Lifetime1Lifetime1, param2, var19, false, var5);
                  }
                }
                var33Lifetime2 = CarouselPlayerEvent.specialOrderDefinitions[var15.specialOrderId].getIconId((byte) 87);
                if (8 == var15.specialOrderId &&
                  var5.getSelfDestructPrepared((byte) -90)) {
                  var33Lifetime2 = 114;
                }
                var34 = 0;
                var35 = 0;
                if (var30Lifetime1 < 256) {
                  IncrementVariableAction.a(var33Lifetime2, 100, var19 + var35, 0, var18 + var34);
                }
                var36 = var17 * var30Lifetime1 >> 8;
                SaveShipDesignOrderDefinition.pushClip(var17 + (var19 - var36), var17 + var19, true, var18 + var16, var18);
                PlayerActionFactory.a(var33Lifetime2, var34 + var18, (byte) 92, var35 + var19);
                GetMissionTerrainSpaceProbability.a(84);
                if (var30Lifetime1 < 255 &&
                  var26 == 0) {
                  var37_int = var16 * var30Lifetime1 >> 8;
                  GetMachineGunPulsetime.a(2059520, -68, var37_int, var17 + (var19 + 4), 4, var18);
                }
                if (!var41.hidesReadyCount((byte) -119)) {
                  var42 = Integer.toString(var15.nonPositiveStateCount);
                  var38 = 0;
                  SetSelfDestructPrepareToggleCooldown.a(-2 + (-tea.a(var38, var42, 13879) + var16) + var18, -1, var19 + (var17 - 2), var42, var38, 16776960, (byte) -88);
                }
                var37 = Integer.toString(var11 + 1);
                if (var27 != -1) {
                  var37 = SetTorpedoProjectileDamage.field_q[var27];
                }
                var38Lifetime1 = 16777215;
                if (var15.specialOrderId == this.pendingSpecialOrderId) {
                  var38Lifetime1 = 13404296;
                }
                var39 = 0;
                if (var26 == 0) {
                  UiToggleButtonRenderer.drawRectangle(125, 1 + var18, var32Lifetime2, -var32Lifetime2 + var19 + var17, 7698040, tea.a(var39, var37, 13879) + 3);
                }
                SetSelfDestructPrepareToggleCooldown.a(3 + var18, 1, var17 + (var19 - 2), var37, var39, var38Lifetime1, (byte) -81);
              }
              if (var22Lifetime1 != 0) {
                var11++;
              }
              var15 = (SpecialOrderButtonState) (this.specialOrderButtons.next((byte) 124));
            }
          }
          stackIn_223_0 = var4_int;
          return stackIn_223_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_226_0 = var4;
          stackIn_226_1 = new StringBuilder().append("uca.HB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_227_2 = "null";
          } else {
            stackIn_227_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_226_0), ((StringBuilder) (Object) stackIn_226_1).append(stackIn_227_2).append(')').toString());
        }
    }

    private final void updateGroupedVoteGrid(String[] param0, int param1, int param2, GameSnapshot param3, int param4, int param5, int param6, byte param7, int param8, boolean param9, int[][] param10, int param11, int param12) {
        int var16 = 0;
        int var23 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var15 = 0;
        int var17 = 0;
        String var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var24 = 0;
        int var25 = 0;
        boolean[] var26 = null;
        int var14_intLifetime1;
        int var15Lifetime1;
        int var17Lifetime1;
        int var14_intLifetime1Lifetime1;
        var25 = VoidHunters.field_G;
        try {
          var14_int = 0;
          var15 = 0;
          if (param7 > -74) {
            var26 = (boolean[]) null;
            GameSession.reportBooleanArrayDifferences((boolean[]) null, (boolean[]) null, -109);
          }
          for (var16 = 0; var16 < param10.length; var16++) {
            var14_intLifetime1 = 0;
            var15Lifetime1 = var16;
            var17 = -10;
            var18 = param0[var16];
            var19 = GetPhasedEnergyBeamProjectiles.a(-8, var18);
            var20 = OpenGlTexture.b((byte) 118);
            var21 = -(var19 / 2) + (param1 / 2 + param6) + (var15Lifetime1 * param1 + param5);
            var22 = var14_intLifetime1 * param2 + param8 + param11 + var20 + (param6 + 2);
            var14_intLifetime1Lifetime1 = 0;
            SetSelfDestructPrepareToggleCooldown.a(var21, -1, var22, var18, 4, 54236, (byte) -116);
            var17Lifetime1 = 0;
            for (var23 = 0; param10[var16].length > var23; var23++) {
              var24 = param10[var16][var23];
              if (HighscoreTableRequest.isVoteOptionVisible(var24, (byte) -25)) {
                this.updateVoteOption(var24, var15Lifetime1, param4, param3, param5, param6, param2, 109, var14_intLifetime1Lifetime1, param1, param11 + 18, var17Lifetime1 + param8, param9);
                var14_intLifetime1Lifetime1++;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_15_0 = var14;
          stackIn_15_1 = new StringBuilder().append("uca.DB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    private final void synchronizeSpecialOrderButtons(boolean param0, IntrusiveDeque param1, IntrusiveDeque param2, int param3) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        SpecialOrderStatus var5 = null;
        SpecialOrderButtonState var5_ref = null;
        int var5_int = 0;
        RuntimeException var5_ref2 = null;
        int var6 = 0;
        SpecialOrderButtonState var7 = null;
        int var8 = 0;
        SpecialOrderButtonState var9 = null;
        SpecialOrderButtonState var7Lifetime1;
        var8 = VoidHunters.field_G;
        try {
          var9 = (SpecialOrderButtonState) (param2.first(0));
          while (var9 != null) {
            var9.resetStatusCounts(-26857);
            var9 = (SpecialOrderButtonState) (param2.next((byte) 75));
          }
          var5 = (SpecialOrderStatus) (param1.first(0));
          while (var5 != null) {
            var6 = 0;
            var7 = (SpecialOrderButtonState) (param2.first(0));
            while (var7 != null) {
              if (var7.specialOrderId != var5.specialOrderId) {
                var7 = (SpecialOrderButtonState) (param2.next((byte) 101));
                continue;
              }
              var7.addStatus(-1746542610, var5.state);
              var6 = 1;
              break;
            }
            if (var6 == 0) {
              var7Lifetime1 = new SpecialOrderButtonState(var5.specialOrderId);
              var7Lifetime1.addStatus(-1746542610, var5.state);
              param2.addLast(-10258, var7Lifetime1);
            }
            var5 = (SpecialOrderStatus) (param1.next((byte) 127));
          }
          if (!param0) {
            var5_ref = (SpecialOrderButtonState) (param2.first(0));
            while (var5_ref != null) {
              if (var5_ref.statusCount <= 0) {
                var5_ref.unlink(-3846);
              }
              var5_ref = (SpecialOrderButtonState) (param2.next((byte) 20));
            }
          }
          var5_int = -18 / ((9 - param3) / 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref2 = decompiledCaughtException;
          stackIn_26_0 = var5_ref2;
          stackIn_26_1 = new StringBuilder().append("uca.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int getRadialSegmentAngle(boolean param0, int param1, int param2) {
        if (param2 >= 1) {
          param2--;
        }
        int var4 = param2 * 8192 / param1;
        if (param0) {
          this.drawLobbyGameEntries(-66);
        }
        return var4;
    }

    final int getMusicState(int param0) {
        int var10_int = 0;
        int var9 = 0;
        int stackIn_8_0 = 0;
        int var3_int;
        World var3;
        int var4;
        GameSnapshot var5;
        int var6_int;
        Ship[] var6;
        int var7;
        MissionState var7_ref_lbb;
        int var8_int;
        Ship var8;
        MissionVariable[] var9_ref_et__;
        Ship var10;
        MissionVariable var11_ref_et;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        GameSnapshot var16;
        int var4Lifetime1;
        int var7Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var15 = VoidHunters.field_G;
        var16 = this.state.b(1);
        if (null != var16.missionState &&
          5 == var16.missionState.getMissionPhase(8)) {
          var3_int = var16.missionState.getPhaseTimer((byte) -125);
          var4 = lga.getArmageddonStartTick((byte) -2, var16.world.getObjectiveType(false));
          if (var3_int > var4) {
            return 3;
          }
        }
        var3 = var16.world;
        stackIn_8_0 = (ConsoleCharacterStream.a(106, var3.getObjectiveType(false))) ? 0 : 1;
        var4Lifetime1 = stackIn_8_0;
        var5 = (GameSnapshot) (this.state.carouselInfo.getStateStepsAgo(20, param0 ^ 18637));
        if (this.localPlayerIndex >= 0) {
          var6_int = this.getLocalTeam((byte) 115);
          if (null != var5.missionState &&
            var5.missionState.getMissionPhase(8) == 6) {
            var7 = var5.missionState.getWinner((byte) 45);
            if ((var4Lifetime1 == 0 ||
              this.localPlayerIndex != var7) && (var4Lifetime1 != 0 ||
              var6_int != var7)) {
              return 6;
            }
            return 5;
          }
          var7_ref_lbb = var16.missionState;
          if (var7_ref_lbb != null &&
            6 != var7_ref_lbb.getMissionPhase(param0 ^ -18612)) {
            var8_int = 2147483647;
            var9_ref_et__ = var7_ref_lbb.getCustomVariables(false);
            if (var9_ref_et__ != null &&
              0 < var9_ref_et__.length) {
              for (var10_int = 0; var10_int < var9_ref_et__.length; var10_int++) {
                var11_ref_et = var9_ref_et__[var10_int];
                if (var11_ref_et != null) {
                  var12 = GetReloadBarWidth.field_o[var11_ref_et.label];
                  if (var11_ref_et.label == 4 ||
                    var11_ref_et.label == 5) {
                    var12 = GpuSprite.swapTeamId(param0 ^ -7551, var12);
                  }
                  var13 = IconTextWidget.field_zb[var11_ref_et.label];
                  var14 = var11_ref_et.value / var13;
                  if (var8_int > var14) {
                    var8_int = var14;
                  }
                }
              }
            }
            if (var8_int < 60) {
              return 2;
            }
          }
        }
        var6 = var3.getShips(param0 ^ -19284);
        if (param0 != -18620) {
          this.specialOrderActivated = false;
        }
        for (var7Lifetime1 = 0; var7Lifetime1 < var6.length; var7Lifetime1++) {
          var8 = var6[var7Lifetime1];
          if (var8 != null) {
            for (var9 = var7Lifetime1 + 1; var6.length > var9; var9++) {
              var10 = var6[var9];
              if (var10 != null &&
                var10.getTeam((byte) 119) != var8.getTeam((byte) 112) &&
                !var10.hasVisibilityFlag(1, (byte) 82)) {
                var11 = var8.getX(false) - var10.getX(false);
                var12Lifetime1 = var8.getY((byte) 119) - var10.getY((byte) -111);
                var13Lifetime1 = TextLayout.approximateVectorLength(var11, (byte) 120, var12Lifetime1);
                if (GetUseNiceTrails.fogOfWarSensorRange > var13Lifetime1) {
                  return 1;
                }
              }
            }
          }
        }
        return 0;
    }

    private final void drawRoundStatusHud(GameSnapshot param0, int param1) {
        String dupTemp$0 = null;
        int stackIn_38_0 = 0;
        String stackIn_49_0 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        String var10 = null;
        int var11 = 0;
        int var12_int = 0;
        MatchResults var12 = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        String var15_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String var17_ref_String = null;
        int var18_int = 0;
        String var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        Ship var22 = null;
        String var23 = null;
        MissionState var24 = null;
        String var25 = null;
        String var26 = null;
        String var7Lifetime1;
        String var15_ref_StringLifetime1;
        String var15_ref_StringLifetime2;
        String var7Lifetime2;
        int var5Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var17Lifetime1;
        int var11Lifetime2;
        int var11Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var21 = VoidHunters.field_G;
        try {
          var3_int = 2;
          if (!SetGrapplingHookAimarc.a(param0, (byte) -71)) {
            var4_ref_String = kmb.field_d.toUpperCase();
            var7 = var4_ref_String;
            var7Lifetime2 = var4_ref_String;
            var5 = MissionVariableFactory.field_a;
            if (null != AdjustVariableActionFactory.field_a) {
              var5 = AdjustVariableActionFactory.field_a.y;
            }
            SetSelfDestructPrepareToggleCooldown.a(SetMassDriverReload.field_p - (tea.a(var3_int, var4_ref_String, 13879) >> 1), 1, -OpenGlTexture.b((byte) 118) + var5, var4_ref_String, var3_int, 16777215, (byte) -87);
          }
          var4 = this.state.a((byte) 82).getObjectiveType(false);
          this.drawMissionStatusPanel((byte) -117, var4);
          var5Lifetime1 = param0.missionState.getPhaseTimer((byte) -123);
          if (param1 != 200) {
            var22 = (Ship) null;
            this.drawControlHints((byte) 78, (Ship) null);
          }
          var6 = param0.missionState.getMissionPhase(8);
          if (4 == var6 ||
            var6 == 5 ||
            6 == var6) {
            var7Lifetime1 = ShipTeamCondition.field_f[var4].toUpperCase();
            if (this.field_x) {
              var7Lifetime1 = GetWeaponParticleSpeedDownshift.field_p;
            }
            {
              var8 = 255;
              if ((var6 != 5 ||
                750 > var5Lifetime1) && var6 != 6) {
                if (var6 != 5) {
                } else if (var5Lifetime1 <= 700) {
                } else {
                  var8 = (750 - var5Lifetime1) * 255 / 50;
                }
              } else {
                var8 = 0;
              }
            }
            var9 = SetMassDriverReload.field_p - (tea.a(var3_int, var7Lifetime1, 13879) >> 1);
            var10_int = GetLaserAimarc.field_q - 100;
            if (var8 < 255) {
              var11 = PartitionZoneFactory.field_a + (-tea.a(var3_int, var7Lifetime1, 13879) - 5);
              var12_int = GetPointDefenceLaserProjectiles.a(false, var3_int) - 7;
              if (var8 != 0) {
                var13 = 255 - var8;
                var10_int = var13 * (-var10_int + var12_int) / 255 + var10_int;
                var9 = var13 * (-var9 + var11) / 255 + var9;
              } else {
                var9 = var11;
                var10_int = var12_int;
              }
            }
            SetSelfDestructPrepareToggleCooldown.a(var9, 1, var10_int, var7Lifetime1, var3_int, 112076, (byte) -108);
            var11Lifetime2 = -1;
            if (0 <= this.localPlayerIndex) {
              var11Lifetime2 = param0.getPlayer(this.localPlayerIndex, (byte) 59).selectedTeam;
              if (this.state.a((byte) 77).areTeamsSwapped((byte) -106)) {
                var11Lifetime2 = GpuSprite.swapTeamId(21957, var11Lifetime2);
              }
            }
            this.drawObjectiveInstructions(-78 + GetLaserAimarc.field_q, var8, var4, var11Lifetime2, 2);
          }
          var24 = this.state.b(param1 - 199).missionState;
          if (6 == var24.getMissionPhase(param1 ^ 192)) {
            stackIn_38_0 = (!ConsoleCharacterStream.a(36, param0.world.getObjectiveType(false))) ? 0 : 1;
            var8Lifetime1 = stackIn_38_0;
            var9Lifetime1 = var24.getWinner((byte) 123);
            var11Lifetime1 = 16777215;
            var12 = var24.getCurrentMatch((byte) -48);
            if (!var24.hasNextRound(24416) &&
              var12 != null) {
              var13Lifetime1 = var12.a(true);
              if (var13Lifetime1 == -1) {
                var10 = SetCountermeasureLauncherFireForce.field_p.toUpperCase();
              } else {
                var14 = GetBombletSprayReload.field_o;
                var15_ref_String = SetMomentOfInertiaPredivideDownshift.field_o;
                if (var8Lifetime1 != 0) {
                  var15_ref_StringLifetime1 = VoidHunters.getTeamName(var13Lifetime1, param1 ^ -201);
                } else {
                  var15_ref_StringLifetime1 = this.getPlayerName(var13Lifetime1, (byte) -98);
                }
                dupTemp$0 = var15_ref_StringLifetime1.toUpperCase();
                var23 = dupTemp$0;
                var15_ref_StringLifetime2 = dupTemp$0;
                if (var14 == 2) {
                  var16 = var12.a(var13Lifetime1, (byte) -88);
                  var17 = var12.a(GpuSprite.swapTeamId(21957, var13Lifetime1), (byte) -88);
                  var18_int = -var16 + var17;
                  var19 = 1000 * var18_int / Particle.field_l;
                  var20 = SetPointDefenceLaserAimspeed.a((byte) 10, var19);
                  var18 = var20;
                  var10 = SetReverbGain.a(gl.field_b.toUpperCase(), new String[]{var23, var20}, param1 ^ 177);
                } else {
                  if (var14 != 1) {
                    var10 = SetReverbGain.a(lh.field_a.toUpperCase(), new String[]{var23}, 92);
                  } else {
                    var16 = var12.a(-54, var13Lifetime1);
                    if (var16 != 1) {
                      stackIn_49_0 = SpecialOrderDefinition.field_b;
                    } else {
                      stackIn_49_0 = SetMachineGunProjectileDamage.field_o;
                    }
                    var17_ref_String = stackIn_49_0;
                    var10 = SetReverbGain.a(SetWaitForPlayers.field_o, new String[]{var23, Integer.toString(var16), var17_ref_String}, param1 ^ 191).toUpperCase();
                  }
                }
              }
              var11Lifetime1Lifetime1 = AlphaContainer.getTeamColor(false, var13Lifetime1, 13894143);
            } else {
              if (var9Lifetime1 == -1) {
                var10 = SetGrapplingHookMaxExtension8Force.field_r.toUpperCase();
                var18 = var10;
                var18 = var10;
              } else {
                var13_ref_String = SetMomentOfInertiaPredivideDownshift.field_o;
                if (var8Lifetime1 != 0) {
                  var13_ref_String = VoidHunters.getTeamName(var9Lifetime1, param1 - 201);
                  var18 = var13_ref_String;
                  var18 = var13_ref_String;
                } else {
                  var13_ref_String = this.getPlayerName(var9Lifetime1, (byte) -92);
                }
                var10 = SetReverbGain.a(kia.field_a, new String[]{var13_ref_String}, param1 ^ 147).toUpperCase();
              }
              var11Lifetime1Lifetime1 = AlphaContainer.getTeamColor(false, var9Lifetime1, 13894143);
            }
            var13Lifetime1Lifetime1 = 1;
            var14Lifetime1 = GetPointDefenceLaserProjectiles.a(false, var13Lifetime1Lifetime1);
            var15 = 16;
            var16 = tea.a(var13Lifetime1Lifetime1, var10, 13879) + 2 * var15;
            var17Lifetime1 = 2 * var14Lifetime1 + var15;
            CachedArchiveProvider.a(200, false, -(var16 / 2) + SetMassDriverReload.field_p, -(var17Lifetime1 / 2) + GetLaserAimarc.field_q + (GetPointDefenceLaserProjectiles.a(false, var3_int) + var14Lifetime1 / 2 + 8) / 2, var17Lifetime1, var16, 1);
            SetSelfDestructPrepareToggleCooldown.a(SetMassDriverReload.field_p - tea.a(var13Lifetime1Lifetime1, var10, 13879) / 2, -1, var14Lifetime1 / 2 + GetLaserAimarc.field_q, var10, var13Lifetime1Lifetime1, var11Lifetime1Lifetime1, (byte) -102);
            var25 = Integer.toString(var24.getPhaseChangeCountdown((byte) -127) / Particle.field_l);
            var18 = var25;
            var18 = var25;
            var18 = var25;
            if (1 == var25.length()) {
              var18 = "0" + var25;
            }
            var26 = SetReverbGain.a(GetMaxShipSize.field_p.toUpperCase(), new String[]{"<col=fc6701>" + var18 + "</col>"}, 77);
            SetSelfDestructPrepareToggleCooldown.a(SetMassDriverReload.field_p - tea.a(var3_int, var26, 13879) / 2, -1, 8 + var14Lifetime1 / 2 + (GetLaserAimarc.field_q + GetPointDefenceLaserProjectiles.a(false, var3_int)), var26, var3_int, 16777215, (byte) -88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_67_0 = var3;
          stackIn_67_1 = new StringBuilder().append("uca.GB(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean canShipFireAtPoint(int param0, int param1, Ship param2, int param3) {
        int discarded$1 = 0;
        int var6 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        ShipComponent var7 = null;
        ShipComponentDefinition var8 = null;
        int var9 = 0;
        Ship var10 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          if (param2.getTargetBlueprint((byte) 28) != null) {
            return false;
          }
          if (0 >= param2.getEnergyProgress(99)) {
            return false;
          }
          if (param2.isSpecialOrderActive(9, param3 + 7888)) {
            return false;
          }
          if (param2.isSpecialOrderActive(4, 55)) {
            return false;
          }
          if (param3 != -7829) {
            var10 = (Ship) null;
            discarded$1 = this.drawWeaponTargetGuide(81, -19, 26, 56, (Ship) null);
          }
          var5_int = param2.chassis.collectWeapons(127, 0);
          for (var6 = 0; var6 < var5_int; var6++) {
            var7 = GetPointDefenceLaserProjectileInterceptDamage.field_q[var6];
            if (!var7.isDestroyed((byte) 103) &&
              var7.weaponbehaviour.isReadyToFire((byte) 127)) {
              var8 = var7.getDefinition((byte) -112);
              if (var7.weaponbehaviour.canAimAtTarget(-26772, param1, param0, var8, var7)) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("uca.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void markShipOutsideSensorRange(Ship param0, ResourceNode[] param1, Ship param2, EscapePod[] param3, int param4, int param5, Ship[] param6) {
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        Ship var11_ref_sg = null;
        int var11 = 0;
        int var12_int = 0;
        ResourceNode var12 = null;
        EscapePod var12_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ResourceNode[] var17 = null;
        EscapePod[] var18 = null;
        int var19 = 0;
        ResourceNode var20 = null;
        EscapePod var21 = null;
        int var10Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        var16 = VoidHunters.field_G;
        try {
          var8_int = 1;
          var9 = param2.getBoundingExtent(-92);
          var10 = 0;
          scanLoop1: while (true) {
            if (var10 < param6.length) {
              var11_ref_sg = param6[var10];
              if (var11_ref_sg != null &&
                param4 == var11_ref_sg.getTeam((byte) 121) && (param4 != ToolkitRasterState.field_c ||
                var11_ref_sg == param0)) {
                var12_int = param2.x - var11_ref_sg.x;
                var13 = param2.y - var11_ref_sg.y;
                var14 = TextLayout.approximateVectorLength(var12_int, (byte) 109, var13);
                if (var14 < GetUseNiceTrails.fogOfWarSensorRange + var9) {
                  var8_int = 0;
                  break scanLoop1;
                }
              }
              var10++;
              continue;
            }
            break;
          }
          if (var8_int != 0 &&
            param1 != null) {
            var17 = param1;
            for (var11 = 0; var11 < var17.length; var11++) {
              var20 = var17[var11];
              var12 = var20;
              if (var12 != null &&
                param4 == var20.team) {
                var13Lifetime1 = -var20.x + param2.x;
                var14Lifetime1 = -var20.y + param2.y;
                var15 = TextLayout.approximateVectorLength(var13Lifetime1, (byte) 121, var14Lifetime1);
                if (var9 + GetUseNiceTrails.fogOfWarSensorRange > var15) {
                  var8_int = 0;
                  break;
                }
              }
            }
          }
          if (var8_int != 0 &&
            param3 != null) {
            var18 = param3;
            var19 = 0;
            var11Lifetime1 = var19;
            while (var18.length > var19) {
              var21 = var18[var19];
              var12_ref = var21;
              if (var12_ref != null &&
                param4 == var21.team) {
                var13Lifetime2 = param2.x - var21.x;
                var14Lifetime2 = param2.y - var21.y;
                var15Lifetime1 = TextLayout.approximateVectorLength(var13Lifetime2, (byte) 115, var14Lifetime2);
                if (var15Lifetime1 < var9 + GetUseNiceTrails.fogOfWarSensorRange) {
                  var8_int = 0;
                  break;
                }
              }
              var19++;
            }
          }
          if (var8_int != 0) {
            param2.addVisibilityFlags(0, 2);
          }
          var10Lifetime1 = 64 / ((-23 - param5) / 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_38_0 = var8;
          stackIn_38_1 = new StringBuilder().append("uca.SB(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param3 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(')').toString());
        }
    }

    private final void updateChatControls(byte param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        GameSnapshot var7;
        Player var8;
        String var9;
        int var3Lifetime1;
        int var4Lifetime1;
        if (this.isChatAvailable((byte) -103)) {
          if (!GetSniperCannonProjectiles.chatVisible) {
            AdjustVariableActionFactory.field_a.text = VariableConditionFactory.field_b;
          } else {
            AdjustVariableActionFactory.field_a.text = DateOfBirthTextFields.field_A;
          }
          var3 = -(AdjustVariableActionFactory.field_a.width / 2) + SetMassDriverReload.field_p;
          var4 = -AdjustVariableActionFactory.field_a.height + (MissionVariableFactory.field_a + (SetToggledScoreboard.field_o.screenY - SoftwareRasterizer2D.height));
          if (!SetFightersPerPlayerMaximum.field_p ||
            SetMissionTerrainDebrisProbability.field_p) {
            if (SetNebulaProximityFadeDownshift.field_o) {
              uia.field_b = GetTorpedoReload.field_q;
              PlayerGameData.field_b = GetUseDetailLines.field_o;
              qs.field_a = GetTorpedoReload.field_q;
              Particle.field_H = GetUseDetailLines.field_o;
            }
            var5 = -var3 + GetUseDetailLines.field_o;
            AdjustVariableActionFactory.field_a.y = 0;
            AdjustVariableActionFactory.field_a.x = 0;
            var6 = GetTorpedoReload.field_q - var4;
            PlayerGameData.field_b = var5;
            qs.field_a = var6;
            Particle.field_H = var5;
            uia.field_b = var6;
            AdjustVariableActionFactory.field_a.updateInput(param1, 1332);
            qs.field_a = GetTorpedoReload.field_q;
            Particle.field_H = GetUseDetailLines.field_o;
            PlayerGameData.field_b = GetUseDetailLines.field_o;
            uia.field_b = GetTorpedoReload.field_q;
            if (AdjustVariableActionFactory.field_a.field_O) {
              this.uiBlocksWorldInput = true;
            }
            if ((-SoftwareRasterizer2D.width + PartitionZoneFactory.field_a) / 2 < GetUseDetailLines.field_o &&
              GetUseDetailLines.field_o < -((-SoftwareRasterizer2D.width + PartitionZoneFactory.field_a) / 2) + PartitionZoneFactory.field_a &&
              GetTorpedoReload.field_q > -SoftwareRasterizer2D.height - (-SetToggledScoreboard.field_o.screenY - MissionVariableFactory.field_a)) {
              this.uiBlocksWorldInput = true;
            }
            if (AdjustVariableActionFactory.field_a.field_o == 1) {
              this.field_X = true;
              this.toggleChatVisibility(false);
            }
          }
          AdjustVariableActionFactory.field_a.y = var4;
          AdjustVariableActionFactory.field_a.x = var3;
          AdjustVariableActionFactory.field_a.screenX = var3;
          AdjustVariableActionFactory.field_a.screenY = var4;
        }
        if (param0 <= 32) {
          this.drawRadialMenuBackground(-112, -67, 51, 21);
        }
        if (this.networked) {
          var3Lifetime1 = -2;
          if (this.localPlayerIndex >= 0) {
            var7 = (GameSnapshot) (this.state.carouselInfo.getVisibleState(28120));
            var8 = var7.getPlayer(this.localPlayerIndex, (byte) 59);
            if (var8 != null) {
              var3Lifetime1 = var8.selectedTeam;
            }
          }
          if (GetLagStandardDeviationOut.field_p != var3Lifetime1) {
            GetLagStandardDeviationOut.field_p = var3Lifetime1;
            var4Lifetime1 = AlphaContainer.getTeamColor(false, var3Lifetime1, 13894143);
            FireMissilesOrderDefinition.setTeamChatColor(var4Lifetime1, 124);
            var9 = VoidHunters.getTeamName(var3Lifetime1, -1);
            GetBurstFireMaxEnergy.a(1043, var9);
          }
        }
    }

    private final void checkObfuscationGuard(byte param0) {
        int var2 = 11 % ((-23 - param0) / 62);
    }

    private final void toggleChatVisibility(boolean param0) {
        GetSniperCannonProjectiles.chatVisible = !GetSniperCannonProjectiles.chatVisible ? true : false;
        if (GetSniperCannonProjectiles.chatVisible) {
        }
        if (param0) {
          boolean[] var3 = (boolean[]) null;
          GameSession.reportBooleanArrayDifferences((boolean[]) null, (boolean[]) null, 123);
        }
    }

    private final int getHeldActionHotkey(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        int var2 = 0;
        if (param0 != 30) {
          this.playerChatTimers = (int[]) null;
        }
        while (var2 < GameSnapshotFactory.field_a.length) {
          var3 = GameSnapshotFactory.field_a[var2];
          var4 = 0;
          if (SetMachineGunEnergyUsed.field_o[81]) {
            var4 += 10;
          }
          if (SetMachineGunEnergyUsed.field_o[82]) {
            var4 += 20;
          }
          if (SetMachineGunEnergyUsed.field_o[74]) {
            var4 += 40;
          }
          if (SetMachineGunEnergyUsed.field_o[var3]) {
            return var4 + var2;
          }
          var2++;
        }
        return -1;
    }

    private final void drawWorldInspectionText(int param0, int param1, String[] param2, byte param3) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = VoidHunters.field_G;
        try {
          var5_int = param2.length;
          if (param3 != -96) {
            this.field_ab = true;
          }
          var6 = 3;
          for (var7 = 0; var7 < var5_int; var7++) {
            var8 = ShipTeamConditionFactory.field_a.worldToScreenX(param0, (byte) 114) - (GetPhasedEnergyBeamProjectiles.a(param3 + 215, param2[0]) >> 1);
            var9 = ShipTeamConditionFactory.field_a.worldToScreenY(true, -10000 + param1) - (var5_int - var7) * UsernameAvailabilityValidator.getFontAscent(true, var6);
            if (null != this.tutorialController &&
              this.tutorialController.isHintVisible(3, -22)) {
              var9 -= 20;
            }
            if (var7 > 0) {
              param2[var7] = " - " + param2[var7];
            }
            GetLagStandardDeviationOut.a(1, param2[var7], 16777215, var9, var8, 4266);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("uca.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void drawRadialMenuBackground(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = VoidHunters.field_G;
        int var5 = this.radialMenuAlpha >> 2;
        SetMissileLauncherEnergyUsed.a(1118481, (byte) 7, this.radialMenuY, (float)(param1 + 2), var5, this.radialMenuX);
        int var6 = 20 / ((59 - param0) / 60);
        for (var7 = 0; var7 < param3; var7++) {
          var8 = var7;
          var9 = var8 * 8192 / param3;
          this.fillRadialSegment(param2, 3092271, param1, -108, var5, var9);
        }
    }

    final static boolean reportBooleanArrayDifferences(boolean[] param0, boolean[] param1, int param2) {
        try {
          StringBuilder discarded$0 = null;
          int var5 = 0;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$1 = null;
          int stackIn_8_0 = 0;
          int stackIn_12_0 = 0;
          int stackIn_36_0 = 0;
          RuntimeException stackIn_39_0 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          StringBuilder stackIn_42_1 = null;
          String stackIn_43_2 = null;
          RuntimeException decompiledCaughtException = null;
          int var3_int = 0;
          RuntimeException var3 = null;
          StringBuilder var4 = null;
          int var6 = 0;
          boolean[] var7 = null;
          int var3_intLifetime1;
          var6 = VoidHunters.field_G;
          try {
            if (param1 == param0) {
              System.out.println("Using duplicate reference in debug diffs, but arrays are the same");
              new Throwable().printStackTrace();
              return false;
            }
            if (param0 == null) {
              stackIn_8_0 = (param1 == null) ? 0 : 1;
              var3_int = stackIn_8_0;
              if (var3_int != 0) {
                System.out.println("Before=" + param1 + ", after=" + param0);
              }
              stackIn_12_0 = var3_int;
              return stackIn_12_0 != 0;
            }
            if (param1 == null) {
              System.out.println("Before=" + param1 + ", after=" + param0);
              return true;
            }
            if (param1.length != param0.length) {
              System.out.println("Before length=" + param1.length + ", after length=" + param0.length);
              return true;
            }
            var3_intLifetime1 = 0;
            var4 = new StringBuilder();
            discarded$0 = var4.append("{");
            for (var5 = 0; param0.length > var5; var5++) {
              if (var5 > 0) {
                discarded$2 = var4.append(",");
              }
              if (param0[var5] == param1[var5]) {
                discarded$3 = var4.append("_");
              } else {
                var3_intLifetime1 = 1;
                discarded$4 = var4.append(param1[var5] + "->" + param0[var5]);
              }
            }
            discarded$1 = var4.append("}");
            if (param2 > -12) {
              var7 = (boolean[]) null;
              GameSession.reportBooleanArrayDifferences((boolean[]) null, (boolean[]) null, -20);
            }
            if (var3_intLifetime1 != 0) {
              System.out.println(var4);
            }
            stackIn_36_0 = var3_intLifetime1;
            return stackIn_36_0 != 0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            stackIn_39_0 = var3;
            stackIn_39_1 = new StringBuilder().append("uca.V(");
            if (param0 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
            if (param1 == null) {
              stackIn_43_2 = "null";
            } else {
              stackIn_43_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean hasArmageddonStarted(byte param0, World param1, MissionState param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_intLifetime1;
        try {
          if (param2.getMissionPhase(8) != 5) {
            var4_int = 121 % ((-35 - param0) / 50);
            return false;
          }
          var4_intLifetime1 = param2.getPhaseTimer((byte) -116);
          var5 = lga.getArmageddonStartTick((byte) -2, param1.getObjectiveType(false));
          return !(var5 >= var4_intLifetime1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("uca.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void handleMenuHotkeys(byte param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var4 = VoidHunters.field_G;
        if (SetBombletSprayProjectileDamage.field_o == 80 &&
          this.networked &&
          this.localPlayerIndex < 0) {
          this.toggleChatVisibility(false);
        }
        if (13 == SetBombletSprayProjectileDamage.field_o &&
          !SetDebrisGroupColour.b(false)) {
          var2 = 0;
          if (this.networked) {
            if (this.localPlayerIndex >= 0) {
              var2 = (this.state.field_e) ? 3 : 2;
            } else {
              var2 = 4;
            }
          } else {
            if (null != MatchingFieldValidator.field_g) {
              var2 = 1;
            }
          }
          var3 = var2;
          GetNebulaFadesOutWhenClose.a(AgeValidator.field_f, false, (byte) -85, var3);
          return;
        }
        var2Lifetime1 = 61 / ((param0 + 72) / 38);
    }

    private final void drawObjectiveMarker(int param0, int[] param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ToolkitSprite var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var6_int = param4;
          var7 = param0;
          if (param2 != -4298) {
            return;
          }
          var8 = GetSniperCannonAimspeed.a(100, param3);
          var9 = var8 / 2;
          var10 = OpenGlVertexNormal.field_d[4];
          if (!MissionAction.rectanglesIntersect(param1, ShipTeamConditionFactory.field_a.worldBounds, 122)) {
            var11 = -(int)ShipTeamConditionFactory.field_a.worldCenterX + var6_int;
            var12 = var7 - (int)ShipTeamConditionFactory.field_a.worldCenterY;
            var13 = SetMissionTerrainSpaceProbability.a(0, (int)ShipTeamConditionFactory.field_a.worldCenterY, (int)ShipTeamConditionFactory.field_a.worldCenterX, ShipTeamConditionFactory.field_a.worldBounds[2], var7, 16, ShipTeamConditionFactory.field_a.worldBounds[1], ShipTeamConditionFactory.field_a.worldBounds[0], ShipTeamConditionFactory.field_a.worldBounds[3], var6_int);
            if (0 <= var13) {
              var14 = (int)((float)var11 * 1.0f * (float)var13 / 65536.0f + ShipTeamConditionFactory.field_a.worldCenterX);
              var15 = (int)(ShipTeamConditionFactory.field_a.worldCenterY + (float)var13 * ((float)var12 * 1.0f) / 65536.0f);
              var16 = ShipTeamConditionFactory.field_a.worldToScreenX(var14, (byte) 114);
              var17 = ShipTeamConditionFactory.field_a.worldToScreenY(true, var15);
              if (OpenGlTexture1D.field_i) {
                var18 = GameSnapshotFactory.a(var12, (byte) -77, var11);
                var16 = var16 - (GetNumStars.cosAngle(var18, (byte) -122) * 28 >> 16);
                var17 = var17 - (28 * TextureLineShape.sinAngle(var18, 97) >> 16);
                var10.drawRotatedScaled((float)var16, (float)var17, 20.0f, 23.0f, 4096, -var18 << 3, 0, -1, 1);
              }
              PlayerActionFactory.a(param3, -var9 + var16, (byte) 88, -var9 + var17);
            }
          } else {
            var11 = var10.getPaddedHeight();
            var12 = ShipTeamConditionFactory.field_a.worldToScreenX(var6_int, (byte) 114);
            var13 = -(var11 / 2) + ShipTeamConditionFactory.field_a.worldToScreenY(true, param1[2]);
            var14 = (int)(0.32 / (double)ShipTeamConditionFactory.field_a.scale);
            if (255 < var14) {
              var14 = 255;
            }
            if (OpenGlTexture1D.field_i) {
              var10.drawRotatedScaled((float)var12, (float)var13, 20.0f, 23.0f, 4096, -16384, 0, var14 << 24 | 16777215, 1);
            }
            SetBuildViewAutozoomTimeout.a(true, var14, -var9 + var12, -var9 + var13, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("uca.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int resolveActiveSpecialOrder(int param0) {
        int var2_int = 0;
        Ship var2 = null;
        int[] var3 = null;
        String var4 = null;
        if (ssa.b(2) &&
          SetDebrisPartitioned.field_o == 1 &&
          2 == PacketBuffer.field_g) {
          var2_int = this.getHeldActionHotkey(30);
          if (-1 != var2_int) {
            this.activeSpecialOrderId = 13 + var2_int;
          }
        }
        if (param0 != -19706) {
          Ship var5 = (Ship) null;
          this.drawBlueprintSaveStatus(false, (Ship) null);
        }
        if (ssa.b(2) &&
          SetMachineGunEnergyUsed.field_o[6]) {
          var2 = this.state.b(1).world.findShipByOwner(this.localPlayerIndex, 124);
          if (var2 != null) {
            var3 = SetOndamageParticleLife.encodeComponentWords(var2.chassis, -111);
            if (var3 != null) {
              var4 = SetFightersPerPlayerMaximum.a(var3, false);
              GetDebrisThrowable.a(false, "Ship=new int[]" + var4 + ";");
            }
          }
        }
        return this.activeSpecialOrderId;
    }

    private final int drawLobbyGameEntry(ToolkitRasterStateStack param0, byte param1, int param2, LobbyGameEntry param3) {
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Sprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var10Lifetime1;
        int var11Lifetime1;
        try {
          var5_int = 4;
          param3.field_Sb.x = var5_int;
          param3.field_Sb.y = param2;
          param3.field_Sb.updateInput(true, 1332);
          if (param3.field_Sb.field_o != 0) {
            boolean decompiledFrameRemainder0 = true;
            if (param3.field_fc && (!param3.field_Gb ||
              !param3.field_cc &&
              !param3.field_ac)) {
              ArmBehaviourFactory.a(param3.getGameId((byte) -13), 11, 20694);
              decompiledFrameRemainder0 = false;
            }
            else {
              pa.a(11, (byte) -123, param3.getGameId((byte) -13));
            }
            if (MatchingFieldValidator.field_g != null) {
              this.tutorialController.saveHintProgress((byte) -111);
              GetNebulaFadesOutWhenClose.a(AgeValidator.field_f, true, (byte) -85, -2);
            }
            GetMessageFadetime.field_o = false;
            aeb.field_a = true;
            ColorKeyScaleTextureOperation.d(991426348);
            AgeValidator.field_f = -2;
            GetSniperCannonProjectiles.chatVisible = true;
            HardpointDefinition.a(true);
          }
          param3.field_Sb.draw(false, 38);
          param3.field_Tb.y = param3.field_Sb.height + param2;
          param3.field_Tb.x = var5_int + 2;
          param3.field_Tb.draw(false, -88);
          param3.field_dc.y = param2;
          param3.field_dc.x = var5_int - (-param3.field_Sb.width - 2);
          param3.field_dc.draw(false, -103);
          var6 = param3.field_Pb[0];
          var7 = SetTorpedoProjectileDamage.field_p[0][var6];
          var8 = 2 + param3.field_Tb.font.getStringWidth(param3.field_Tb.text);
          var9 = param3.field_dc.width + param3.field_Sb.width;
          if (var7 != null) {
            var9 = var9 + (4 + var7.width);
            var10 = 8 + (param3.field_Sb.width + var5_int) + param3.field_dc.x;
            var11 = 1 + param2;
            var7.draw(var10, var11);
            if (var10 <= PlayerGameData.field_b &&
              var10 + var7.width >= PlayerGameData.field_b &&
              uia.field_b >= var11 &&
              var11 + var7.height >= uia.field_b) {
              GetMassDriverReload.a(GetBombletSprayRandomness.field_q[0][var6], -53);
            }
            var8 = Math.max(var8, var9);
          }
          var10Lifetime1 = param3.field_Sb.height + param3.field_Tb.height;
          param0.pushClip(var5_int, var8 + var5_int, param2, var10Lifetime1 + param2, (byte) -30);
          GetDebrisGroupColour.field_r.writePixels(0, param2, SoftwareRasterizer2D.width, var10Lifetime1, SoftwareRasterizer2D.pixels, param2 * SoftwareRasterizer2D.width, SoftwareRasterizer2D.width);
          param0.pop(true);
          var11Lifetime1 = 6;
          var12 = 2;
          var13 = 12;
          var14 = var5_int + (var9 + var11Lifetime1);
          var15 = var12 + param2;
          var16 = var14 + var13;
          var17 = var15 + var13;
          var19 = -83 % ((param1 + 2) / 50);
          var18 = 11141120;
          if (GetUseDetailLines.field_o >= var14 &&
            var16 > GetUseDetailLines.field_o &&
            var15 <= GetTorpedoReload.field_q &&
            var17 >= GetTorpedoReload.field_q) {
            var18 = 16711680;
            GetMassDriverReload.a(SetReverbGain.a(NullUiRenderer.field_a, new String[]{param3.field_dc.text}, 78), -61);
            if (ArchiveLoadRequest.field_c == 1) {
              sh.a(param3.getGameId((byte) -13), -1, 11);
            }
          }
          FixedPointTrigonometry.drawThickLine(var18, 2, 16994, var15, 255, var14, var16, var17);
          FixedPointTrigonometry.drawThickLine(var18, 2, 16994, var15, 255, var16, var14, var17);
          stackIn_27_0 = var10Lifetime1;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("uca.K(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final void drawMissionStatusPanel(byte param0, int param1) {
        int var14 = 0;
        MissionVariable[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13_int;
        GameSnapshot var13;
        Object var15;
        Object var16;
        int var17;
        String var17_ref_String;
        int var18_int;
        String var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        ShipBody var23;
        int var24;
        int var25;
        int var26;
        Ship var27;
        MissionVariable var28;
        MissionVariable var29;
        Object var30;
        Object var31;
        Object var32;
        MissionState var33;
        MissionVariable var34;
        String var35;
        String var36;
        String var37;
        ObjectiveMarker var38;
        MissionVariable var39;
        String var40;
        String var41;
        String var42;
        ObjectiveMarker var43;
        Ship var44;
        Ship var45;
        Ship var46;
        int var13_intLifetime1;
        int var13_intLifetime2;
        int var17Lifetime1;
        int var18_intLifetime1;
        int var18_intLifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        int var21Lifetime1;
        int var22Lifetime1;
        int var25Lifetime1;
        var30 = null;
        var31 = null;
        var32 = null;
        var26 = VoidHunters.field_G;
        var33 = this.state.b(1).missionState;
        if (var33 != null &&
          !var33.isPreGamePhase((byte) 93)) {
          var4 = var33.getCustomVariables(false);
          var5 = 0;
          var6 = PartitionZoneFactory.field_a - 17;
          var7 = 37;
          var8 = 0;
          var9 = 4;
          var10 = 0;
          var11 = 8;
          var12 = 42;
          if (var4 != null &&
            var4.length > 0) {
            for (var13_int = 0; var4.length > var13_int; var13_int++) {
              var28 = var4[var13_int];
              var34 = var28;
              if (var34 != null &&
                1 <= var34.label &&
                var34.label < ParticleFactory.field_c.length) {
                var35 = ParticleFactory.field_c[var28.label];
                var36 = SetUseBackgroundInFullscreen.field_o[var28.label];
                var17 = IconTextWidget.field_zb[var28.label];
                var18_int = var4[var13_int].value;
                if (var17 > 1) {
                  var18_int = var18_int / var17;
                }
                var37 = var35 + ": " + var18_int + var36;
                var20 = tea.a(var9, var37, 13879) + (var11 << 1);
                if (var20 > var8) {
                  var8 = var20;
                }
                var5 = var5 + (UsernameAvailabilityValidator.getFontAscent(true, var9) + MidiNote.a(var9, (byte) -121));
              }
            }
          }
          if (GetDebrisCarryOver.field_p > 0) {
            for (var13_intLifetime1 = 0; GetDebrisCarryOver.field_p > var13_intLifetime1; var13_intLifetime1++) {
              var38 = SetKeepTeamColours.field_p[var13_intLifetime1];
              var15 = var38.target;
              if (var15 instanceof Ship) {
                var44 = (Ship) (var15);
                var17_ref_String = GetSniperCannonAimarc.a((byte) -87, param1, var44) + ":";
                var18_intLifetime1 = var12 + (var11 << 1) + tea.a(var9, var17_ref_String, 13879);
                if (var8 < var18_intLifetime1) {
                  var8 = var18_intLifetime1;
                }
                var5 = var5 + (UsernameAvailabilityValidator.getFontAscent(true, var9) + MidiNote.a(var9, (byte) -121));
              }
            }
          }
          GetMachineGunPulsetime.a(1118481, -115, var8, var7, var5 + 1, -var8 + (var11 + var6));
          UiToggleButtonRenderer.drawRectangle(107, -var8 + var6 + var11, var5 + 1, var7, 8947848, var8);
          if (var4 != null &&
            var4.length > 0) {
            for (var13_intLifetime2 = 0; var4.length > var13_intLifetime2; var13_intLifetime2++) {
              var29 = var4[var13_intLifetime2];
              var39 = var29;
              if (var39 != null &&
                var39.label >= 1 &&
                ParticleFactory.field_c.length > var39.label) {
                var40 = ParticleFactory.field_c[var29.label];
                var41 = SetUseBackgroundInFullscreen.field_o[var29.label];
                var17Lifetime1 = IconTextWidget.field_zb[var29.label];
                var18_intLifetime2 = var4[var13_intLifetime2].value;
                if (var17Lifetime1 > 1) {
                  var18_intLifetime2 = var18_intLifetime2 / var17Lifetime1;
                }
                var42 = var40 + ": " + var18_intLifetime2 + var41;
                var20Lifetime1 = -tea.a(var9, var42, 13879) + var6;
                var21 = UsernameAvailabilityValidator.getFontAscent(true, var9) + MidiNote.a(var9, (byte) -121);
                var22 = var7 + var21 + var10;
                var23_int = GetReloadBarWidth.field_o[var29.label];
                var24 = AlphaContainer.getTeamColor(false, var23_int, 13894143);
                if (var18_intLifetime2 > 0 &&
                  var18_intLifetime2 < 60) {
                  var25 = TextureLineShape.sinAngle(128 * SetMinimapWidth.field_o, 96) >> 9;
                  var24 = TextureRectangleShape.a((byte) 66, 16711680, var25, var24);
                }
                SetSelfDestructPrepareToggleCooldown.a(var20Lifetime1, -1, -MidiNote.a(var9, (byte) -121) + var22, var42, var9, var24, (byte) -117);
                var10 = var10 + (var21 - 1);
              }
            }
          }
          if (GetDebrisCarryOver.field_p > 0) {
            var5 += 6;
            var13 = (GameSnapshot) (this.state.carouselInfo.getStateStepsAgo(this.state.carouselInfo.getHistoryLength((byte) 121) - 1, -87));
            for (var14 = 0; GetDebrisCarryOver.field_p > var14; var14++) {
              var43 = SetKeepTeamColours.field_p[var14];
              var16 = var43.target;
              if (var16 instanceof Ship) {
                var45 = (Ship) (var16);
                var18 = GetSniperCannonAimarc.a((byte) -38, param1, var45) + ":";
                var19 = var45.getHealthProgress(0);
                var20Lifetime2 = AlphaContainer.getTeamColor(false, var45.getTeam((byte) 66), 13894143);
                var21Lifetime1 = UsernameAvailabilityValidator.getFontAscent(true, var9) + MidiNote.a(var9, (byte) -121);
                var22Lifetime1 = var7 - (-var21Lifetime1 - var10);
                SoftwareDepthBuffer.a(var20Lifetime2, -MidiNote.a(var9, (byte) -121) + var22Lifetime1, -3 + var6 - var12, (byte) 74, -1, var9, var18);
                var10 = var10 + (var21Lifetime1 - 1);
                SetMissionTerrainDebrisProbability.a(var20Lifetime2, var19, var22Lifetime1 - var21Lifetime1 / 2 - 2, 4, false, var12, -var12 + (var6 + 1), 2);
                if (var13 != null &&
                  var13.world != null) {
                  var23 = var13.world.getBodyById((byte) -27, var45.getId(false));
                  if (var23 != null &&
                    var23 instanceof Ship) {
                    var46 = (Ship) (var23);
                    if (var46.getHealthProgress(0) > var19) {
                      var25Lifetime1 = SetMinimapWidth.field_o * 16 % 255;
                      UiToggleButtonRenderer.drawRectangle(121, var6 - var12 + 1, 7, -3 + (var22Lifetime1 - var21Lifetime1 / 2), var25Lifetime1 << 16, 1 + var12);
                    }
                  }
                }
              }
            }
          }
        }
        if (param0 > -21) {
          var27 = (Ship) null;
          this.updateBlueprintSize((byte) -93, (Ship) null);
        }
    }

    private final boolean isMouseInRadialSegment(int param0, byte param1, int param2, int param3) {
        int var5 = GetUseDetailLines.field_o - this.radialMenuX;
        int var6 = GetTorpedoReload.field_q - this.radialMenuY;
        int var7 = GameSnapshotFactory.a(var6, (byte) -77, var5);
        int var8 = TextLayout.approximateVectorLength(var5, (byte) 112, var6);
        int var9 = -41 / ((param1 - 48) / 45);
        if (var8 > param3 / 8 &&
          var8 < param3 &&
          param0 / 2 > Math.abs(GameKeyHandler.a(22433, -param2 + var7))) {
          return true;
        }
        return false;
    }

    private final void drawControlHints(byte param0, Ship param1) {
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5_int = 0;
        Object var5 = null;
        String[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var3Lifetime1;
        String var3Lifetime2;
        String var3Lifetime3;
        String var3Lifetime4;
        String var3Lifetime1Lifetime1;
        String var3Lifetime2Lifetime1;
        String var3Lifetime2Lifetime2;
        int var4Lifetime1;
        int var7Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          if (this.autoZoomTicks > 0 &&
            !this.state.a((byte) 110).getDebug((byte) -79) &&
            this.field_r != 0 &&
            param1 != null) {
            var3 = TutorialProgressState.field_c;
            if (param1.isRepairModeFullyCharged(-22)) {
              var4 = ShipTeamConditionFactory.field_a.screenToWorldX(true, GetUseDetailLines.field_o);
              var5_int = ShipTeamConditionFactory.field_a.screenToWorldY(0, GetTorpedoReload.field_q);
              if (!param1.chassis.hasDamagedComponentInCircle(32609, var5_int, GetMinimapWidth.field_o, var4)) {
                var3 = SetPlayerRepairTime.field_o;
              }
            } else {
              var4 = param1.getRepairModeReload(108);
              if (param1.getRepairModeOn(32)) {
                var5_int = (-var4 + Particle.field_I) / (Particle.field_l / 10) + 1;
                var3 = SetReverbGain.a(SetMessageFadetime.field_o, new String[]{Integer.toString(var5_int)}, 125);
              } else {
                var5_int = var4 / (Particle.field_l / 10) + 1;
                var3 = SetReverbGain.a(SetRepairModePower.field_o, new String[]{Integer.toString(var5_int)}, 81);
              }
            }
            var11 = var3.toUpperCase();
            var3Lifetime3 = var11;
            var3Lifetime4 = var11;
            SetSelfDestructPrepareToggleCooldown.a(SetMassDriverReload.field_p - tea.a(2, var11, 13879) / 2, -1, 90, var11, 2, 16711680, (byte) -87);
          }
          var4Lifetime1 = this.getHeldActionHotkey(30);
          if (param0 < 65) {
            this.updateTimingGraph = (TimingGraph) null;
          }
          if (-1 != var4Lifetime1) {
            var4Lifetime1 += 13;
          }
          if (-1 != var4Lifetime1 &&
            var4Lifetime1 < GetGrapplingHookSpringConstant.specialOrderLabels.length && (this.state.a((byte) 90).getDebug((byte) 6) ||
            var4Lifetime1 == 13 &&
            ssa.b(2))) {
            var12 = GetGrapplingHookSpringConstant.specialOrderLabels[var4Lifetime1];
            var3Lifetime1 = var12;
            var3Lifetime1Lifetime1 = var12;
            GetLagStandardDeviationOut.a(-1, var12, 16777215, 120, SetMassDriverReload.field_p - GetPhasedEnergyBeamProjectiles.a(-80, var12) / 2, 4266);
          }
          if (this.networked) {
            var5 = null;
            var13 = SetThrusterParticleLife.field_o;
            var3Lifetime2 = var13;
            var3Lifetime2Lifetime1 = var13;
            var6 = 5;
            if (this.localPlayerIndex < 0) {
              var7 = DebugRequestFactory.field_a;
              if (TiledSpriteTextureOperation.field_r) {
                var7 = GrappleLauncherBehaviour.field_b;
              }
              var8 = SetTorpedoProjectileDamage.field_q[var7].toUpperCase();
              var5_array = new String[]{ComponentWordEncoder.field_b, FireBoostersOrderDefinition.field_d, var8};
              var3Lifetime2Lifetime2 = ProxyAuthenticationException.field_b + "<br>" + DirectByteStorage.field_b + "<br>" + var13;
              var6 = var6 + GetPointDefenceLaserProjectiles.a(false, 0);
              var9 = SpawnLocation.field_a;
              SetAutoaim.a(1, 100, 10, 0, 0, var9, 16777215, 100, -114, 0, 0, 0);
            } else {
              if (TiledSpriteTextureOperation.field_r) {
                var3Lifetime2Lifetime2 = SetTeamSelectionSpeedup.field_p + "<br>" + GetDebrisCarryOverPercentage.field_p + "<br>" + var13;
                var5_array = new String[]{SetTorpedoProjectileDamage.field_q[vu.field_Db].toUpperCase(), SetTorpedoProjectileDamage.field_q[GetBombletSprayProjectiles.field_p].toUpperCase(), SetTorpedoProjectileDamage.field_q[GrappleLauncherBehaviour.field_b].toUpperCase()};
              } else {
                var3Lifetime2Lifetime2 = SetTeamSelectionSpeedup.field_p + "<br>" + GetDebrisCarryOverPercentage.field_p + "<br>" + var13;
                var5_array = new String[]{SetTorpedoProjectileDamage.field_q[GetHealthBarWidth.field_q].toUpperCase(), SetTorpedoProjectileDamage.field_q[GetGrappleDebris.field_p].toUpperCase(), " " + SetTorpedoProjectileDamage.field_q[DebugRequestFactory.field_a].toUpperCase()};
              }
            }
            SetAutoaim.a(1, 100, 40, 0, 0, var3Lifetime2Lifetime2, 16777215, 100, 122, var6, 0, 0);
            if (var5_array != null) {
              for (var7Lifetime1 = 0; var7Lifetime1 < var5_array.length; var7Lifetime1++) {
                if (var5_array[var7Lifetime1] != null &&
                  var5_array[var7Lifetime1].length() != 0) {
                  UiToggleButtonRenderer.drawRectangle(116, -GetPhasedEnergyBeamProjectiles.a(-42, var5_array[var7Lifetime1]) + 27, -1 + GetPointDefenceLaserProjectiles.a(false, 0), var6 + 4 + GetPointDefenceLaserProjectiles.a(false, 0) * var7Lifetime1, 11184810, GetPhasedEnergyBeamProjectiles.a(-128, var5_array[var7Lifetime1]) + 5);
                  SoftwareDepthBuffer.a(16777215, (var7Lifetime1 + 1) * GetPointDefenceLaserProjectiles.a(false, 0) + var6, 30, (byte) 74, -1, 0, var5_array[var7Lifetime1]);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_47_0 = var3_ref;
          stackIn_47_1 = new StringBuilder().append("uca.MC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(')').toString());
        }
    }

    private final void handleSpecialOrderHotkey(SpecialOrderButtonState param0, byte param1, int param2, boolean param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 >= -76) {
            this.updateSession((byte) -40, true);
          }
          if (-1 != param2 &&
            SetMachineGunEnergyUsed.field_o[param2] &&
            !this.previousKeyStates[param2]) {
            if (SetMachineGunEnergyUsed.field_o[82]) {
              return;
            }
            if (this.pendingSpecialOrderId == -1 &&
              param3) {
              this.radialMenuActive = false;
              this.pendingSpecialOrderId = param0.specialOrderId;
              return;
            }
            this.pendingSpecialOrderId = -1;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("uca.GA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int collectControlTriggers(GameSnapshot param0, boolean param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          stackIn_3_0 = (param0.world.getDebug((byte) -100)) ? 0 : 1;
          var5_int = stackIn_3_0;
          if (SetMachineGunEnergyUsed.field_o[96] &&
            var5_int != 0 ||
            SetMachineGunEnergyUsed.field_o[SetSalvoaim.field_p]) {
            param2 = param2 | 4;
          }
          if (SetMachineGunEnergyUsed.field_o[97] &&
            var5_int != 0 ||
            SetMachineGunEnergyUsed.field_o[UnsupportedGpuMaterialEffect.field_f]) {
            param2 = param2 | 8;
          }
          if (SetMachineGunEnergyUsed.field_o[HerringboneTextureOperation.field_m]) {
            param2 = param2 | 32;
          }
          if (SetMachineGunEnergyUsed.field_o[SetUseRectOutline.field_o]) {
            param2 = param2 | 64;
          }
          if (SetMachineGunEnergyUsed.field_o[98] &&
            var5_int != 0 ||
            SetMachineGunEnergyUsed.field_o[SetFixedaim.field_q]) {
            param2 = param2 | 1;
          }
          if (SetMachineGunEnergyUsed.field_o[99] &&
            var5_int != 0 ||
            SetMachineGunEnergyUsed.field_o[SetCountermeasureLauncherAimspeed.field_q]) {
            param2 = param2 | 2;
          }
          if (this.pendingSpecialOrderId == -1) {
            stackIn_38_0 = (!this.specialOrderActivated) ? 1 : 0;
          } else {
            stackIn_38_0 = 0;
          }
          var6 = stackIn_38_0;
          if (PacketBuffer.field_g == 1 &&
            !param1 &&
            var6 != 0 &&
            0 == FlipTextureOperation.field_p &&
            !this.field_X) {
            param2 = param2 | 16;
          }
          if ((1 == SetMissilesTopSpeed.field_o ||
            FlipTextureOperation.field_p == 1) &&
            SetMachineGunEnergyUsed.field_o[83]) {
            param2 = param2 | 16;
          }
          if (param3 != 8186) {
            stackIn_52_0 = -13;
            return stackIn_52_0;
          }
          if ((PacketBuffer.field_g == 4 ||
            1 == FlipTextureOperation.field_p &&
            1 == PacketBuffer.field_g &&
            var6 != 0) && !param1) {
            this.debugOrderCategory = -1;
            this.pendingSpecialOrderId = -1;
            param2 = param2 | 128;
          }
          if (0 != (144 & param2)) {
            this.blueprintOverwritePending = false;
          }
          stackIn_64_0 = param2;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_67_0 = var5;
          stackIn_67_1 = new StringBuilder().append("uca.VB(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void drawObjectiveInstructions(int param0, int param1, int param2, int param3, int param4) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = VoidHunters.field_G;
        if (!(param2 < ThrusterBehaviour.field_a.length)) {
          return;
        }
        String var6 = OpenGlRenderbuffer.a(param2, param3, true);
        if (this.field_x) {
          var6 = SetPointDefenceLaserProjectileInterceptDamage.field_o;
        }
        int var7 = SetMassDriverReload.field_p - (tea.a(4, var6, 13879) >> 1);
        int var8 = param0 - OpenGlTexture.b((byte) 118) / param4;
        int var9 = 16777215;
        int var10 = 1;
        if (255 > param1) {
          if (param1 < 255) {
            var11 = PartitionZoneFactory.field_a - tea.a(4, var6, 13879) - 5;
            var12 = GetPointDefenceLaserProjectiles.a(false, 2) + OpenGlTexture.b((byte) 118) / 2;
            if (param1 == 0) {
              var7 = var11;
              var8 = var12;
            } else {
              var13 = 255 - param1;
              var7 = var13 * (-var7 + var11) / 255 + var7;
              var8 = (var12 - var8) * var13 / 255 + var8;
            }
          }
          SetSelfDestructPrepareToggleCooldown.a(var7, var10, var8, var6, 4, var9, (byte) -118);
        } else {
          SetSelfDestructPrepareToggleCooldown.a(var7, var10, var8, var6, 4, var9, (byte) -98);
        }
    }

    private final void drawObjectiveMarkers(MissionState param0, Ship param1, boolean param2, GameSnapshot param3, int param4) {
        int var6_int = 0;
        int var9 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        ResourceNode[] var6 = null;
        RuntimeException var6_ref = null;
        ObjectiveMarker var7 = null;
        Object var8 = null;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        ShipBody var14 = null;
        MapZone var15 = null;
        int[] var16 = null;
        ResourceNode[] var17 = null;
        ResourceNode var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        var12 = VoidHunters.field_G;
        try {
          if (!param2) {
            return;
          }
          if (3 != param0.getMissionPhase(8) &&
            param0.getMissionPhase(8) != 5) {
            return;
          }
          LoadSettings.a(param3, param4, ShipTeamConditionFactory.field_a, (byte) -84, param0);
          for (var6_int = 0; GetDebrisCarryOver.field_p > var6_int; var6_int++) {
            var7 = SetKeepTeamColours.field_p[var6_int];
            var8 = var7.target;
            if (!(var8 instanceof ShipBody)) {
              if (var8 instanceof MapZone) {
                var15 = (MapZone) (var8);
                var16 = new int[]{var15.x, var15.width + var15.x, var15.y, var15.y + var15.height};
                this.drawObjectiveMarker(var15.y + var15.height / 2, var16, -4298, var7.markerType, var15.width / 2 + var15.x);
              }
            } else {
              var14 = (ShipBody) (var8);
              if (param1 == null ||
                !(param1.getDragging(-118) >= 0) ||
                param1.getDragging(110) != var14.getId(false)) {
                this.drawObjectiveMarker(var14.y, var14.getBoundingbox((byte) -94), -4298, var7.markerType, var14.x);
              }
            }
          }
          var6 = param3.world.getResNodes(1);
          if (var6 == null) {
            return;
          }
          var20 = new int[4];
          var19 = var20;
          var13 = var19;
          var17 = var6;
          for (var9 = 0; var9 < var17.length; var9++) {
            var18 = var17[var9];
            if (var18 != null) {
              var11 = 0;
              var13[0] = var18.x - var18.radius;
              var13[2] = var18.y - var18.radius;
              var13[1] = var18.radius + var18.x;
              var13[3] = var18.radius + var18.y;
              if (var18.team == param4) {
                var11 = 1;
              }
              this.drawObjectiveMarker(var18.y, var20, -4298, var11, var18.x);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_34_0 = var6_ref;
          stackIn_34_1 = new StringBuilder().append("uca.DC(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean updateVotingPanel(int param0, GameSnapshot param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -12) {
            stackIn_4_0 = this.updateVotingPanel(param0 ^ -116, param1, true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("uca.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void drawEventMessages(GameSnapshot param0, boolean param1, int param2) {
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Message[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Message var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        int var15 = 0;
        Message[] var16 = null;
        String var17 = null;
        String var12Lifetime1;
        var15 = VoidHunters.field_G;
        try {
          var16 = param0.messageLog.getMessages((byte) 49);
          var4 = var16;
          var5 = Particle.field_s;
          if (param1) {
            this.blueprintSizeBytes = 17;
          }
          var6 = -var5 + Particle.field_c;
          if (var4 != null) {
            var7 = 0;
            for (var8 = 0; var8 < var16.length; var8++) {
              var9 = var16[var8];
              var10 = -var9.tick + param2;
              var11 = 255;
              if (var6 < var10) {
                var11 = 255 * (var5 - var10 + var6) / var5;
              }
              var17 = kr.field_a[var9.stringId];
              var12 = var17;
              var13 = this.state.getPlayerName(1, var9.aId);
              var14 = this.state.getPlayerName(1, var9.bId);
              var12Lifetime1 = SetReverbGain.a(var17, new String[]{var13, var14}, 85);
              SetThrusterForce.a(16777215, var11, PartitionZoneFactory.field_a - 5, 180, var12Lifetime1, (var7 >> 8) + 140, -1);
              var7 = var7 + OpenGlTexture.b((byte) 118) * var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("uca.LC(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    GameSession(boolean param0, String[] param1, int param2, boolean param3, int param4, int param5, boolean param6) {
        int var9_int = 0;
        int var8_int = 0;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var8 = null;
        String[] var9 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        this.blueprintSaveTick = -1;
        this.blueprintSaveStatus = 2;
        this.blueprintSizeBytes = 0;
        this.field_X = false;
        this.field_R = 50;
        this.field_ab = false;
        this.scoreboardVisible = false;
        this.autoZoomHeld = false;
        this.field_J = -1;
        this.field_o = 0;
        this.uiBlocksWorldInput = false;
        this.lastEnemyShipSpawnTick = -1;
        this.repairTargetPaths = null;
        this.updateTimingGraph = new TimingGraph();
        this.renderTimingGraph = new TimingGraph();
        this.hoveredRespawnOption = -1;
        try {
          stackIn_4_1 = (param6);
          this.field_x = stackIn_4_1;
          this.specialOrderStatuses = new IntrusiveDeque();
          this.specialOrderButtons = new IntrusiveDeque();
          this.pendingSpecialOrderId = -1;
          this.debugOrderCategory = -1;
          ssa.b(2);
          stackIn_7_1 = (param0);
          this.networked = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_h = stackIn_10_1;
          this.localPlayerIndex = param2;
          var13 = StrongCacheReference.field_m;
          var12 = var13;
          var11 = var12;
          var8 = var11;
          for (var9_int = 0; var9_int < 8; var9_int++) {
            var13[var9_int] = 0;
          }
          this.state = new CommonGameState(param1, -1, param4, param5, false);
          PartitionZoneFactory.field_a = GetBombletSprayEnergyUsed.field_p.width;
          MissionVariableFactory.field_a = GetBombletSprayEnergyUsed.field_p.height;
          AdjustVariableActionFactory.field_a = new Widget("chat_toggle", (Widget) null, 0, 440, 95, 20, DateOfBirthTextFields.field_A);
          AdjustVariableActionFactory.field_a.x = -(AdjustVariableActionFactory.field_a.width / 2) + PartitionZoneFactory.field_a / 2;
          AdjustVariableActionFactory.field_a.field_gb = FloatGradientNoiseSliceGenerator.field_e;
          AdjustVariableActionFactory.field_a.y = MissionVariableFactory.field_a - AdjustVariableActionFactory.field_a.height;
          AdjustVariableActionFactory.field_a.font = GrapplingHookFactory.field_a;
          AdjustVariableActionFactory.field_a.field_mb = ScreenSizeController.field_d;
          ShipTeamConditionFactory.field_a = new Camera2D();
          this.manualZoomScale = 0.001953125f;
          this.autoZoomTicks = 0;
          this.field_r = 0;
          GetDebrisCarryOver.initializeDebugArrows(false);
          this.previousKeyStates = new boolean[SetMachineGunEnergyUsed.field_o.length];
          this.lastPlayerShipX = new int[param1.length];
          this.lastPlayerShipY = new int[param1.length];
          this.playerChatTimers = new int[param1.length];
          this.playerChatOffsets = new int[param1.length];
          this.field_u = SetRepairModePower.field_q;
          for (var8_int = 0; var8_int < this.playerChatOffsets.length; var8_int++) {
            var9 = this.getPlayerChatLines((byte) 86, 0, var8_int);
            if (var9 != null &&
              var9.length != 0) {
              this.playerChatOffsets[var8_int] = var9.length;
            } else {
              this.playerChatOffsets[var8_int] = -1;
            }
          }
          this.tutorialController = new TutorialController();
          this.voteHighlightAlphas = new int[31];
          this.hoveredVoteOptionId = -1;
          this.field_K = new npb();
          this.field_W = new Ship();
          var8 = null;
          if (!this.networked &&
            GetBuildViewAutozoomEndOnAction.a(61848)) {
            var8 = MenuInputState.createShipFromComponentWords(VariableConditionFactory.a(108), (byte) 127);
          } else {
            if (this.field_x) {
              var8 = ToolkitViewState.createPresetShip(3, (byte) 65);
            }
          }
          if (var8 != null) {
            ((Ship) (var8)).setOwner(0, 114);
            this.state.b(1).world.addShip((Ship) (var8), (byte) 113);
            this.state.b(1).world.clearTerrainAroundEntities(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_31_0 = var8;
          stackIn_31_1 = new StringBuilder().append("uca.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) (stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_D = "Quick Chat lobby";
    }
}
