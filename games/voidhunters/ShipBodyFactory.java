/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShipBodyFactory implements GameStateFactory {
    static ToolkitFontMetrics[] field_b;
    static String field_a;

    final static void a(byte param0, boolean param1) {
        int var6 = 0;
        Widget dupTemp$0 = null;
        int var11 = 0;
        int stackIn_4_0 = 0;
        Widget stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_7_4 = 0;
        int stackIn_58_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Widget var7_ref_llb = null;
        int var7 = 0;
        int var8 = 0;
        Widget var8_ref_llb = null;
        IconTextWidget var9_ref_cna = null;
        int var9 = 0;
        int var10 = 0;
        IconTextWidget var10_ref_cna = null;
        int var12 = 0;
        int var13 = 0;
        Widget var14 = null;
        var13 = VoidHunters.field_G;
        try {
          GetShieldsDirectionalArcParticleLife.field_p = SoftwareRasterizer2D.width;
          SetGrapplingHookRopeBreakLength.field_p = SoftwareRasterizer2D.height;
          if (param1) {
            stackIn_4_0 = CarouselPlayerEventFactory.field_a;
          } else {
            stackIn_4_0 = SetExplosionPushMultiplier.field_p;
          }
          lkb.a(stackIn_4_0, (byte) -106);
          GetReverbWidth.field_o.a(0, -92, -2 + WaterTextures.field_g.height - 40, 0, WaterTextures.field_g.width);
          SetPhasedEnergyBeamPulsetime.field_o.setBounds(0, -11, SetOndamageParticleLife.field_o.width, 0, DialogMessagePanel.field_w);
          stackIn_6_0 = SecondaryNodeDequeIterator.field_a;
          stackIn_6_1 = 0;
          stackIn_6_2 = param0 + 25;
          stackIn_6_3 = SetOndamageParticleLife.field_o.width;
          if (GetGrapplingHooksDamageableBySourcePlayer.field_o) {
            stackIn_7_4 = 2 + (40 + ResourceNode.field_a + 2);
          } else {
            stackIn_7_4 = 0;
          }
          ((Widget) (Object) stackIn_6_0).setBounds(stackIn_6_1, stackIn_6_2, stackIn_6_3 - stackIn_7_4, 2 + DialogMessagePanel.field_w, 18);
          GetPointDefenceLaserProjectileDamage.field_o.setBounds(-40 + (-2 + SetOndamageParticleLife.field_o.width) - ResourceNode.field_a, param0 + 18, ResourceNode.field_a + 42, DialogMessagePanel.field_w + 2, 18);
          WaterTextures.field_f.setBoundsAndLayout(SetOndamageParticleLife.field_o.width, 2, -1, -DialogMessagePanel.field_w + (SetOndamageParticleLife.field_o.height - 2) - 20, 2 + (DialogMessagePanel.field_w + 20), 0, ResourceNode.field_a);
          GetShipToShipRamDamage.field_q.setBounds(0, -41, WaterTextures.field_g.width, WaterTextures.field_g.height - 40, 40);
          GetWeaponParticleSpeedDownshift.field_q.setBounds(0, 121, ThreeSliceButtonStyle.field_r.width, 0, 30);
          if (param0 != 100) {
            ShipBodyFactory.a((byte) -23, true);
          }
          SetPhysicsCollisionGrapplingHookForceMultiplier.field_o.setBounds(0, 124, ThreeSliceButtonStyle.field_r.width, 30, -32 + ThreeSliceButtonStyle.field_r.height - 40);
          var2_int = 3 + PasswordValidator.field_l;
          if (SetMutatorVotes.field_o.length < 2) {
            var2_int--;
          }
          if (param1) {
            var2_int--;
          }
          var3 = -2 + ((1 + var2_int) / 2 - 13 + (SetPhysicsCollisionGrapplingHookForceMultiplier.field_o.height - 5)) / (var2_int + 1);
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -10 + (SetPhysicsCollisionGrapplingHookForceMultiplier.field_o.height - (var3 + 2) * var2_int);
          if (40 < var4) {
            var4 = 40;
          }
          ProxySocketConnector.field_e.setBounds(5, param0 + 19, -5 + (-5 + SetPhysicsCollisionGrapplingHookForceMultiplier.field_o.width), 5, var4);
          var5 = 5 + (var4 + 2);
          for (var6 = 0; PasswordValidator.field_l + 4 > var6; var6++) {
            if ((1 != var6 ||
              !(SetMutatorVotes.field_o.length < 2)) && (var6 != 3 ||
              !(GetDebrisThrowable.field_r <= 1))) {
              if (!param1 &&
                var6 == 3) {
                var7_ref_llb = GetLaserAimarc.field_o[var6];
                GetLaserAimarc.field_o[var6].height = 0;
                var7_ref_llb.width = 0;
                for (var8 = 0; var8 < SetReloadBarHeight.field_q[var6].length; var8++) {
                  if (SetReloadBarHeight.field_q[var6][var8] != null) {
                    var9_ref_cna = SetReloadBarHeight.field_q[var6][var8];
                    SetReloadBarHeight.field_q[var6][var8].height = 0;
                    var9_ref_cna.width = 0;
                  }
                }
              } else if (param1 &&
                0 == var6) {
                dupTemp$0 = GetLaserAimarc.field_o[var6];
                var14 = dupTemp$0;
                var7_ref_llb = dupTemp$0;
                GetLaserAimarc.field_o[var6].height = 0;
                var14.width = 0;
                for (var8 = 0; SetReloadBarHeight.field_q[var6].length > var8; var8++) {
                  if (SetReloadBarHeight.field_q[var6][var8] != null) {
                    var9_ref_cna = SetReloadBarHeight.field_q[var6][var8];
                    SetReloadBarHeight.field_q[var6][var8].height = 0;
                    var9_ref_cna.width = 0;
                  }
                }
              } else {
                if (param1) {
                  if (var6 >= 4) {
                    if (PrimitiveType.field_d != null) {
                      stackIn_58_0 = (PrimitiveType.field_d[-4 + var6]) ? 1 : 0;
                    } else {
                      stackIn_58_0 = 0;
                    }
                  } else {
                    stackIn_58_0 = 0;
                  }
                } else {
                  stackIn_58_0 = 0;
                }
                var7 = stackIn_58_0;
                if (var7 != 0) {
                  var8_ref_llb = GetLaserAimarc.field_o[var6];
                  GetLaserAimarc.field_o[var6].height = 0;
                  var8_ref_llb.width = 0;
                  for (var9 = 0; SetReloadBarHeight.field_q[var6].length > var9; var9++) {
                    if (SetReloadBarHeight.field_q[var6][var9] != null) {
                      var10_ref_cna = SetReloadBarHeight.field_q[var6][var9];
                      SetReloadBarHeight.field_q[var6][var9].height = 0;
                      var10_ref_cna.width = 0;
                    }
                  }
                } else {
                  GetLaserAimarc.field_o[var6].setBounds(5, 118, 103, var5, var3);
                  var8 = 110;
                  if (param1) {
                    SetReloadBarHeight.field_q[var6][0].setBoundsAndLayout(var5, var8, -118, 2, MissionListFactory.field_a, 38, var3);
                    var8 += 40;
                  } else {
                    if (SetReloadBarHeight.field_q[var6][0] != null) {
                      var9_ref_cna = SetReloadBarHeight.field_q[var6][0];
                      SetReloadBarHeight.field_q[var6][0].height = 0;
                      var9_ref_cna.width = 0;
                    }
                  }
                  var9 = -var8 + (-5 + ThreeSliceButtonStyle.field_r.width + 2);
                  var10 = -1 + SetReloadBarHeight.field_q[var6].length;
                  for (var11 = 0; var11 < var10; var11++) {
                    var12 = var9 * var11 / var10;
                    SetReloadBarHeight.field_q[var6][var11 + 1].setBoundsAndLayout(var5, var8 + var12, -122, 2, MissionListFactory.field_a, var9 * (var11 + 1) / var10 - 2 - var12, var3);
                  }
                  var5 = var5 + (2 + var3);
                }
              }
            }
          }
          SetUseCircleFill.field_o.setBounds(-360 + SoftwareRasterizer2D.width >> 1, 117, 360, 10, -130 + (SoftwareRasterizer2D.height - 14));
          ProjectileHit.field_d.setBounds(0, 124, SetUseCircleFill.field_o.width, 0, 24);
          SetUseModels.field_o.setBounds(0, 124, SetUseCircleFill.field_o.width, 24, -24 + SetUseCircleFill.field_o.height);
          SetUseModels.field_o.field_gb = ShieldInfo.createGradientNineSliceSprites(11579568, SetUseModels.field_o.height, 1, 8421504, 92, 3);
          DualLinkNode.field_f.setBounds(5, 124, SetUseModels.field_o.width - 10, 5, -2 + (-24 + SetUseModels.field_o.height) - 10);
          LegacyOpenGlTextureCache.field_a.setBounds((SetUseModels.field_o.width - 80) / 2, 24, 80, -29 + SetUseModels.field_o.height, 24);
          GetThrusterForce.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var2), "ok.C(" + param0 + ',' + param1 + ')');
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 47 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new ShipBody());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          ShipBodyFactory.a((byte) 101, true);
        }
        return (SerializableGameState[]) ((Object) new ShipBody[param1]);
    }

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        field_b = null;
        int var1 = -7 % ((63 - param0) / 50);
    }

    static {
        field_a = "Voters: <%0>";
    }
}
