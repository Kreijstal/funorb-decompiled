/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nra implements dja {
    static int field_b;
    static String field_a;

    final static void b(byte param0) {
        int var1_int = 0;
        int var2 = VoidHunters.field_G;
        if (vjb.field_a) {
          return;
        }
        fka.a("Initing text...", (byte) -82);
        vjb.field_a = true;
        if (null != ifa.field_g) {
          return;
        }
        try {
          ocb.field_m = new String[10];
          ocb.field_m[9] = SetCountermeasureLauncherFireForce.field_q;
          ocb.field_m[0] = bab.field_a;
          ocb.field_m[4] = SetMessageFadetime.field_p;
          ocb.field_m[6] = ro.field_b;
          ocb.field_m[2] = SetMessageFadetime.field_p;
          ocb.field_m[5] = SetMissilesExplosionPower.field_o;
          ocb.field_m[1] = SetSalvoaim.field_q;
          for (var1_int = 0; var1_int < ocb.field_m.length; var1_int++) {
            if (ocb.field_m[var1_int] != null) {
              ocb.field_m[var1_int] = ocb.field_m[var1_int].toUpperCase();
            }
          }
          ifa.field_g = new String[25];
          ifa.field_g[9] = fma.field_b;
          ifa.field_g[18] = ita.field_D;
          ifa.field_g[22] = GetSalvoaim.field_p;
          ifa.field_g[20] = veb.field_c;
          ifa.field_g[6] = null;
          ifa.field_g[21] = SetCountermeasureLauncherFireForce.field_q;
          ifa.field_g[3] = SetMissilesExplosionPower.field_o;
          ifa.field_g[24] = MissionEvent.field_f + ":";
          ifa.field_g[11] = tua.field_b;
          ifa.field_g[14] = fpa.field_d;
          ifa.field_g[2] = nna.field_D;
          ifa.field_g[15] = GetFightersPerPlayerMaximum.field_q;
          ifa.field_g[13] = ujb.field_d;
          ifa.field_g[19] = llb.field_V + ":";
          ifa.field_g[5] = ffb.field_b;
          ifa.field_g[7] = bw.field_a;
          ifa.field_g[4] = mo.field_j;
          ifa.field_g[12] = SetBombletSprayRandomness.field_o;
          ifa.field_g[1] = GetAiFiringRangeUpshift.field_p;
          ifa.field_g[17] = SetUseLines.field_o;
          ifa.field_g[16] = GetSniperCannonProjectileOndamageParticles.field_p;
          ifa.field_g[0] = SetPhasedEnergyBeamPulsetime.field_p;
          ifa.field_g[23] = gmb.field_b;
          for (var1_int = 0; ifa.field_g.length > var1_int; var1_int++) {
            if (null != ifa.field_g[var1_int]) {
              ifa.field_g[var1_int] = SetFogOfWarSensorRange.a(-1, ifa.field_g[var1_int]);
            }
          }
          SetSpinningBladeSpinupSpeed.field_o = new String[56];
          SetSpinningBladeSpinupSpeed.field_o[53] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[14] = SetDebrisSurvives.field_o;
          SetSpinningBladeSpinupSpeed.field_o[13] = vn.field_i;
          SetSpinningBladeSpinupSpeed.field_o[7] = SetAutozoomAmountMultiply.field_o;
          SetSpinningBladeSpinupSpeed.field_o[51] = GetRepairModeActiveTime.field_q;
          SetSpinningBladeSpinupSpeed.field_o[39] = GetMutatorVotes.field_o;
          SetSpinningBladeSpinupSpeed.field_o[5] = GetAngularForceDownshift.field_r;
          SetSpinningBladeSpinupSpeed.field_o[28] = SetPhysicsCollisionForceMultiplier.field_o;
          SetSpinningBladeSpinupSpeed.field_o[22] = SetAutoAfkTimeout.field_o;
          SetSpinningBladeSpinupSpeed.field_o[16] = bc.field_a;
          SetSpinningBladeSpinupSpeed.field_o[12] = ne.field_m;
          SetSpinningBladeSpinupSpeed.field_o[30] = wsb.field_c;
          SetSpinningBladeSpinupSpeed.field_o[0] = ev.field_c;
          SetSpinningBladeSpinupSpeed.field_o[26] = dqb.field_c;
          SetSpinningBladeSpinupSpeed.field_o[19] = SetUseExtraBackground.field_r;
          SetSpinningBladeSpinupSpeed.field_o[10] = wgb.field_h;
          SetSpinningBladeSpinupSpeed.field_o[29] = vla.field_C;
          SetSpinningBladeSpinupSpeed.field_o[38] = SetArmageddonWarning.field_p;
          SetSpinningBladeSpinupSpeed.field_o[54] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[9] = gm.field_I;
          SetSpinningBladeSpinupSpeed.field_o[2] = SetFighterRepairAmount.field_q;
          SetSpinningBladeSpinupSpeed.field_o[42] = GetDetachmentMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[34] = kc.field_a;
          SetSpinningBladeSpinupSpeed.field_o[15] = GetLaserEnergyUsed.field_q;
          SetSpinningBladeSpinupSpeed.field_o[36] = GetRepairModeActiveTime.field_q;
          SetSpinningBladeSpinupSpeed.field_o[45] = GetGrapplingHookCooldown.field_o;
          SetSpinningBladeSpinupSpeed.field_o[40] = kab.field_p;
          SetSpinningBladeSpinupSpeed.field_o[31] = GetWorldWidthUpshift.field_r;
          SetSpinningBladeSpinupSpeed.field_o[48] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[23] = kl.field_a;
          SetSpinningBladeSpinupSpeed.field_o[21] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[1] = iob.field_e;
          SetSpinningBladeSpinupSpeed.field_o[25] = SetShieldsDirectionalArcParticleLife.field_p;
          SetSpinningBladeSpinupSpeed.field_o[3] = fdb.field_S;
          SetSpinningBladeSpinupSpeed.field_o[6] = kmb.field_b;
          SetSpinningBladeSpinupSpeed.field_o[50] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[41] = pn.field_a;
          SetSpinningBladeSpinupSpeed.field_o[27] = Lo.field_p;
          SetSpinningBladeSpinupSpeed.field_o[47] = asa.field_d;
          SetSpinningBladeSpinupSpeed.field_o[35] = SetLaserProjectiles.field_p;
          SetSpinningBladeSpinupSpeed.field_o[37] = lm.field_a;
          SetSpinningBladeSpinupSpeed.field_o[33] = SetBombletSprayProjectileDamage.field_p;
          SetSpinningBladeSpinupSpeed.field_o[4] = pfa.field_a;
          SetSpinningBladeSpinupSpeed.field_o[18] = SetPlayerRepairAmount.field_o;
          SetSpinningBladeSpinupSpeed.field_o[44] = GetPhasedEnergyBeamReload.field_r;
          SetSpinningBladeSpinupSpeed.field_o[24] = grb.field_i;
          SetSpinningBladeSpinupSpeed.field_o[43] = woa.field_e;
          SetSpinningBladeSpinupSpeed.field_o[17] = SetGrapplingHookMaxLength.field_o;
          SetSpinningBladeSpinupSpeed.field_o[20] = ubb.field_k;
          ShipSpawnedCondition.field_e = new String[56];
          SetSpinningBladeSpinupSpeed.field_o[8] = GetBoostersCooldown.field_q;
          SetSpinningBladeSpinupSpeed.field_o[46] = SetMpSandboxEnemySpawnLimit.field_o;
          SetSpinningBladeSpinupSpeed.field_o[49] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[32] = SetTeamSelectionSpeedup.field_q;
          SetSpinningBladeSpinupSpeed.field_o[52] = GetPedrosRepairMode.field_o;
          SetSpinningBladeSpinupSpeed.field_o[11] = ufb.field_c;
          SetSpinningBladeSpinupSpeed.field_o[55] = GetPedrosRepairMode.field_o;
          ShipSpawnedCondition.field_e[30] = fib.field_h;
          ShipSpawnedCondition.field_e[39] = fib.field_h;
          ShipSpawnedCondition.field_e[20] = fib.field_h;
          ShipSpawnedCondition.field_e[24] = Hardpoint.field_b;
          ShipSpawnedCondition.field_e[44] = nva.field_I;
          ShipSpawnedCondition.field_e[22] = SetPhysicsCollisionPhantomForceMultiplier.field_o;
          ShipSpawnedCondition.field_e[46] = jjb.field_f;
          ShipSpawnedCondition.field_e[16] = jw.field_a;
          ShipSpawnedCondition.field_e[19] = fib.field_h;
          ShipSpawnedCondition.field_e[38] = fib.field_h;
          ShipSpawnedCondition.field_e[23] = GetSniperCannonProjectileLife.field_o;
          ShipSpawnedCondition.field_e[26] = SetBombletSprayAimspeed.field_o;
          ShipSpawnedCondition.field_e[18] = pb.field_n;
          if (param0 > -91) {
            field_b = 108;
          }
          ShipSpawnedCondition.field_e[15] = pwa.field_a;
          ShipSpawnedCondition.field_e[13] = GetSpinningBladeAimspeed.field_o;
          ShipSpawnedCondition.field_e[41] = fib.field_h;
          ShipSpawnedCondition.field_e[51] = SetSpecialOrderBoxHeight.field_q;
          GetBlueprintSaveTime.field_o = new String[13];
          ShipSpawnedCondition.field_e[29] = fib.field_h;
          ShipSpawnedCondition.field_e[31] = fib.field_h;
          ShipSpawnedCondition.field_e[37] = SetSpecialOrderBoxHeight.field_q;
          ShipSpawnedCondition.field_e[32] = fib.field_h;
          ShipSpawnedCondition.field_e[33] = fib.field_h;
          ShipSpawnedCondition.field_e[27] = ej.field_b;
          ShipSpawnedCondition.field_e[47] = SetGrapplingHookSpringConstant.field_o;
          ShipSpawnedCondition.field_e[25] = rg.field_c;
          ShipSpawnedCondition.field_e[42] = kha.field_d;
          ShipSpawnedCondition.field_e[34] = fib.field_h;
          ShipSpawnedCondition.field_e[40] = fib.field_h;
          ShipSpawnedCondition.field_e[35] = SetSpecialOrderBoxHeight.field_q;
          ShipSpawnedCondition.field_e[43] = GetMissionVariablesHudY.field_p;
          ShipSpawnedCondition.field_e[45] = ifa.field_h;
          ShipSpawnedCondition.field_e[36] = SetSpecialOrderBoxHeight.field_q;
          GetBlueprintSaveTime.field_o[6] = SetBloomCoefficientPercentage.field_p;
          GetBlueprintSaveTime.field_o[0] = SetDebrisFoundInPairs.field_o;
          GetBlueprintSaveTime.field_o[4] = hla.field_b;
          GetBlueprintSaveTime.field_o[3] = gl.field_c;
          GetBlueprintSaveTime.field_o[5] = gia.field_j;
          GetBlueprintSaveTime.field_o[2] = qpa.field_a;
          GetBlueprintSaveTime.field_o[7] = abb.field_b;
          GetGrapplingHookSpringConstant.field_o = new String[SetSpinningBladeSpinupSpeed.field_o.length + 72];
          GetGrapplingHookSpringConstant.field_o[12] = GetSalvoDamageMultiplier.field_o;
          GetGrapplingHookSpringConstant.field_o[2] = SetBombletSprayAimspeed.field_p;
          GetGrapplingHookSpringConstant.field_o[18] = SetSniperCannonRandomness.field_p;
          GetGrapplingHookSpringConstant.field_o[13] = kmb.field_e;
          GetGrapplingHookSpringConstant.field_o[23] = bab.field_b;
          GetGrapplingHookSpringConstant.field_o[33] = SetClientSideDragging.field_o;
          GetGrapplingHookSpringConstant.field_o[38] = vqa.field_f;
          GetGrapplingHookSpringConstant.field_o[45] = oma.field_b;
          GetGrapplingHookSpringConstant.field_o[52] = pl.field_e;
          GetGrapplingHookSpringConstant.field_o[27] = ii.field_g;
          GetGrapplingHookSpringConstant.field_o[43] = GetUseCircleFill.field_p;
          GetGrapplingHookSpringConstant.field_o[8] = kl.field_e;
          GetGrapplingHookSpringConstant.field_o[54] = SetMissilesDamageSourceTeam.field_p;
          GetGrapplingHookSpringConstant.field_o[35] = World.field_d;
          GetGrapplingHookSpringConstant.field_o[3] = fob.field_b;
          GetGrapplingHookSpringConstant.field_o[9] = SetShieldsDirectionalArcParticleSpeedDownshift.field_s;
          GetGrapplingHookSpringConstant.field_o[17] = GetShieldsToggleCooldown.field_o;
          GetGrapplingHookSpringConstant.field_o[58] = nnb.field_f;
          GetGrapplingHookSpringConstant.field_o[31] = SetMassDriverReload.field_q;
          GetGrapplingHookSpringConstant.field_o[30] = tgb.field_d;
          GetGrapplingHookSpringConstant.field_o[28] = ti.field_k;
          GetGrapplingHookSpringConstant.field_o[56] = cd.field_a;
          GetGrapplingHookSpringConstant.field_o[55] = bob.field_l;
          GetGrapplingHookSpringConstant.field_o[37] = GetMissileLauncherEnergyUsed.field_o;
          GetGrapplingHookSpringConstant.field_o[10] = jw.field_d;
          GetGrapplingHookSpringConstant.field_o[21] = hob.field_e;
          GetGrapplingHookSpringConstant.field_o[40] = SetThrusterBindingBalanceThreshold.field_r;
          GetGrapplingHookSpringConstant.field_o[16] = bl.field_y;
          GetGrapplingHookSpringConstant.field_o[5] = jb.field_b;
          GetGrapplingHookSpringConstant.field_o[24] = MissionState.field_c;
          GetGrapplingHookSpringConstant.field_o[1] = dfa.field_c;
          GetGrapplingHookSpringConstant.field_o[19] = kja.field_G;
          GetGrapplingHookSpringConstant.field_o[57] = ImageProducerRasterBuffer.field_i;
          GetGrapplingHookSpringConstant.field_o[26] = SetShipPersistence.field_p;
          GetGrapplingHookSpringConstant.field_o[49] = fj.field_c;
          GetGrapplingHookSpringConstant.field_o[53] = eca.field_d;
          GetGrapplingHookSpringConstant.field_o[32] = GetMissionDebrisVotingChancestep.field_o;
          GetGrapplingHookSpringConstant.field_o[42] = mbb.field_a;
          GetGrapplingHookSpringConstant.field_o[51] = wca.field_c;
          GetGrapplingHookSpringConstant.field_o[25] = SetMinimapHeight.field_q;
          GetGrapplingHookSpringConstant.field_o[7] = ng.field_a;
          GetGrapplingHookSpringConstant.field_o[20] = lh.field_b;
          GetGrapplingHookSpringConstant.field_o[14] = tla.field_k;
          GetGrapplingHookSpringConstant.field_o[48] = SetShieldsDirectionalIdleEnergyUsage.field_o;
          GetGrapplingHookSpringConstant.field_o[36] = SetUseExtraBackground.field_s;
          GetGrapplingHookSpringConstant.field_o[50] = GetThrusterBindingBalanceThreshold.field_o;
          GetGrapplingHookSpringConstant.field_o[34] = ffb.field_a;
          GetGrapplingHookSpringConstant.field_o[44] = pgb.field_p;
          GetGrapplingHookSpringConstant.field_o[41] = hab.field_e;
          GetGrapplingHookSpringConstant.field_o[0] = qh.field_L;
          GetGrapplingHookSpringConstant.field_o[46] = SetLaserEnergyUsed.field_o;
          GetGrapplingHookSpringConstant.field_o[22] = bi.field_g;
          GetGrapplingHookSpringConstant.field_o[39] = di.field_m;
          GetGrapplingHookSpringConstant.field_o[4] = llb.field_kb;
          GetGrapplingHookSpringConstant.field_o[47] = pjb.field_Db;
          GetGrapplingHookSpringConstant.field_o[15] = fkb.field_z;
          GetGrapplingHookSpringConstant.field_o[29] = ifa.field_e;
          GetGrapplingHookSpringConstant.field_o[6] = ssa.field_b;
          GetGrapplingHookSpringConstant.field_o[11] = ShipBlueprint.field_b;
          for (var1_int = 0; var1_int < SetSpinningBladeSpinupSpeed.field_o.length; var1_int++) {
            GetGrapplingHookSpringConstant.field_o[var1_int + 72] = SetReverbGain.a(SetMachineGunFireForce.field_o, new String[]{SetSpinningBladeSpinupSpeed.field_o[var1_int]}, 126);
          }
          ShipCondition.field_f = new String[31];
          ShipCondition.field_f[2] = enb.field_a;
          ThrusterBehaviour.field_a = new String[31];
          ShipCondition.field_f[24] = GetComponentBreakingExplosionForceMultiplier.field_o;
          ShipCondition.field_f[30] = GetMachineGunPulsetime.field_o;
          ShipCondition.field_f[29] = ob.field_m;
          ShipCondition.field_f[20] = etb.field_a;
          ShipCondition.field_f[26] = tob.field_l;
          ShipCondition.field_f[8] = GetFightersPerPlayerMaximum.field_s;
          ShipCondition.field_f[4] = GetTorpedoAcceleration.field_o;
          ShipCondition.field_f[7] = SetCarouselConstant.field_o;
          ShipCondition.field_f[6] = GetSniperCannonAimspeed.field_o;
          ShipCondition.field_f[3] = iwa.field_a;
          ShipCondition.field_f[22] = kla.field_b;
          ShipCondition.field_f[0] = ii.field_a;
          ShipCondition.field_f[15] = qn.field_d;
          ShipCondition.field_f[27] = GetBombletSprayEnergyUsed.field_o;
          ShipCondition.field_f[5] = GetReloadBarHeight.field_o;
          ShipCondition.field_f[14] = GetSpecialOrderBarX.field_o;
          ShipCondition.field_f[13] = ara.field_g;
          ShipCondition.field_f[1] = SetThrusterAutobalancing.field_o;
          ShipCondition.field_f[25] = etb.field_b;
          ShipCondition.field_f[10] = ata.field_G;
          ShipCondition.field_f[23] = cs.field_b;
          ShipCondition.field_f[16] = SetPointDefenceLaserEnergyUsed.field_p;
          ShipCondition.field_f[9] = GetMessageMaxage.field_o;
          ShipCondition.field_f[12] = PartitionZone.field_g;
          ShipCondition.field_f[21] = oe.field_a;
          ShipCondition.field_f[11] = SetReloadBarHeight.field_o;
          ShipCondition.field_f[18] = SetMinimapHeight.field_o;
          ShipCondition.field_f[28] = pca.field_l;
          ShipCondition.field_f[17] = SetBombletSprayProjectiles.field_o;
          ShipCondition.field_f[19] = SetUseBackgroundInFullscreen.field_p;
          ThrusterBehaviour.field_a[0] = SetMissilesHitSourceTeam.field_q;
          ThrusterBehaviour.field_a[9] = GetReloadBarWidth.field_p;
          ThrusterBehaviour.field_a[7] = dtb.field_a;
          ThrusterBehaviour.field_a[8] = LoadSettings.field_r;
          ThrusterBehaviour.field_a[1] = fia.field_a;
          ThrusterBehaviour.field_a[5] = ola.field_q;
          ThrusterBehaviour.field_a[3] = LoadBlackboxRecording.field_p;
          ThrusterBehaviour.field_a[2] = kma.field_c;
          ThrusterBehaviour.field_a[13] = GetMomentOfInertiaPredivideDownshift.field_o;
          ThrusterBehaviour.field_a[10] = fpb.field_c;
          ThrusterBehaviour.field_a[6] = GrappleLauncherBehaviour.field_c;
          kr.field_a = new String[5];
          ThrusterBehaviour.field_a[4] = oib.field_b;
          ThrusterBehaviour.field_a[12] = qeb.field_c;
          ThrusterBehaviour.field_a[11] = GetPhasedEnergyBeamAimarc.field_o;
          kr.field_a[1] = SetReverbDamp.field_p;
          kr.field_a[0] = uu.field_c;
          kr.field_a[3] = SetMachineGunReload.field_q;
          kr.field_a[2] = SetGrapplingHookCooldown.field_p;
          SetPhasedEnergyBeamProjectiles.field_o = new String[9];
          SetPhasedEnergyBeamProjectiles.field_o[1] = ptb.field_f;
          SetPhasedEnergyBeamProjectiles.field_o[2] = GetDebrisCollisionDamage.field_o;
          SetPhasedEnergyBeamProjectiles.field_o[8] = igb.field_b + " " + ti.field_i;
          SetPhasedEnergyBeamProjectiles.field_o[4] = ppb.field_d;
          SetPhasedEnergyBeamProjectiles.field_o[5] = ri.field_b;
          SetPhasedEnergyBeamProjectiles.field_o[0] = DualLinkNode.field_h;
          SetPhasedEnergyBeamProjectiles.field_o[3] = igb.field_b;
          SetPhasedEnergyBeamProjectiles.field_o[6] = ptb.field_f + " " + ti.field_i;
          SetPhasedEnergyBeamProjectiles.field_o[7] = GetDebrisCollisionDamage.field_o + " " + ti.field_i;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "nra.F(" + param0 + ')');
        }
    }

    public final tv a(byte param0) {
        int var2 = -11 % ((-64 - param0) / 50);
        return (tv) ((Object) new AwardVictoryToTeamAction());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          return (tv[]) null;
        }
        return (tv[]) ((Object) new AwardVictoryToTeamAction[param1]);
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static int[] a(boolean param0, int[] param1, int param2, int param3, boolean param4) {
        int var5_int = 0;
        int[] stackIn_3_0 = null;
        int[] stackIn_8_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        var8 = VoidHunters.field_G;
        try {
          if (param3 != 28849) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          if (param1 != null &&
            0 != param1.length) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            if (!param4) {
              var10 = new int[1 + param1.length];
              var14 = var10;
              var12 = var14;
              var5 = var12;
              decompiledFrameRemainder0 = !(param0);
              if (decompiledFrameRemainder0) {
                for (var6 = 0; param1.length > var6; var6++) {
                  var10[var6] = param1[var6];
                }
              }
            } else {
              for (var5_int = 0; var5_int < param1.length; var5_int++) {
                if (param2 == param1[var5_int]) {
                  stackIn_19_0 = (int[]) (param1);
                  return stackIn_19_0;
                }
              }
              var10 = new int[1 + param1.length];
              var14 = var10;
              var12 = var14;
              var5 = var12;
              decompiledFrameRemainder0 = !(param0);
              if (decompiledFrameRemainder0) {
                for (var6 = 0; param1.length > var6; var6++) {
                  var10[var6] = param1[var6];
                }
              }
            }
            if (decompiledFrameRemainder0) {
              var5[param1.length] = param2;
              decompiledFrameRemainder1 = false;
            }
            if (decompiledFrameRemainder1) {
              var6Lifetime1 = 0;
              for (var7 = 0; var7 < param1.length; var7++) {
                if (param1[var7] < param2) {
                  var6Lifetime1++;
                  continue;
                }
                break;
              }
              for (var7Lifetime1 = 0; var7Lifetime1 < var6Lifetime1; var7Lifetime1++) {
                var5[var7Lifetime1] = param1[var7Lifetime1];
              }
              var14[var6Lifetime1] = param2;
              for (var7Lifetime2 = var6Lifetime1; param1.length > var7Lifetime2; var7Lifetime2++) {
                var5[var7Lifetime2 + 1] = param1[var7Lifetime2];
              }
            }
            stackIn_39_0 = var5;
            return stackIn_39_0;
          }
          var13 = new int[1];
          var11 = var13;
          var9 = var11;
          var5Lifetime1 = var9;
          var13[0] = param2;
          stackIn_8_0 = var5Lifetime1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_42_0 = var5_ref;
          stackIn_42_1 = new StringBuilder().append("nra.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
          field_a = (String) null;
        }
        field_a = null;
    }

    static {
        field_b = 1024;
        field_a = "You need to play <%0> more rated games to unlock this option.";
    }
}
