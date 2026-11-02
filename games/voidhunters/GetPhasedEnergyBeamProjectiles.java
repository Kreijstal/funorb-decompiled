/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetPhasedEnergyBeamProjectiles extends ConsoleCommand {
    static int field_o;

    final static phb[] a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        phb[] var7 = new phb[9];
        phb[] var4 = var7;
        int var5Lifetime1;
        var7[0] = SetMaxShipSize.a(param0, (byte) -118, param2);
        if (param3) {
          for (var5 = 1; 9 > var5; var5++) {
            var7[var5] = var7[0];
          }
          var4[4] = SetMaxShipSize.a(param1, (byte) -123, 64);
          return var4;
        }
        field_o = 40;
        for (var5Lifetime1 = 1; 9 > var5Lifetime1; var5Lifetime1++) {
          var7[var5Lifetime1] = var7[0];
        }
        var4[4] = SetMaxShipSize.a(param1, (byte) -123, 64);
        return var4;
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
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(84, 116));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kga.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0) {
        GetFighterRepairAmount.field_p = new rq();
        GetMissionVariablesHudX.field_o.b(GetFighterRepairAmount.field_p, 99);
        if (param0 != 70) {
          field_o = 121;
        }
    }

    final static int a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 49 / ((param0 - 53) / 41);
          stackIn_1_0 = tea.a(SetAutoaim.field_p, param1, 13879);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("kga.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    GetPhasedEnergyBeamProjectiles(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int[] param1) {
        try {
          us.field_f = param1[48];
          qaa.field_b = param1[115];
          GetSalvoRepairTimeMultiplier.field_o = param1[75];
          CarouselSlotStateDump.field_i = param1[204];
          adb.field_a = param1[98];
          SetAiFiringRangeUpshift.field_p = param1[93];
          iea.field_d = param1[207];
          GetPhysicsCollisionGrapplingHookForceMultiplier.field_o = param1[109];
          hrb.field_a = param1[145];
          GetWorldWidthUpshift.field_q = param1[191];
          GetLaserBeamProjectileDamage.field_o = param1[82];
          osb.field_b = param1[158];
          nn.field_a = param1[192];
          sja.field_i = param1[51];
          GetDebrisFoundInPairs.field_p = param1[230];
          GetMassDriverAimarc.field_o = param1[104];
          SetMissionResnetResourceTickTime.field_p = param1[23];
          SetArmageddonLength.field_p = param1[99];
          SetMissilesCooldown.field_p = param1[210];
          GetReadyRoomMissionTime.field_p = param1[92];
          ShipSpawnedCondition.field_d = param1[185];
          Particle.field_v = param1[71];
          Particle.field_y = param1[225];
          gs.field_c = param1[55];
          GetPhasedEnergyBeamReload.field_q = param1[58];
          lob.field_b = param1[96];
          Particle.field_C = param1[196];
          uda.field_b = param1[119];
          Particle.field_t = param1[202];
          dcb.field_d = param1[17];
          PacketBuffer.field_d = param1[203];
          dcb.field_f = param1[4];
          hw.field_b = param1[9];
          GetBombletSprayProjectileDamage.field_p = param1[73];
          GetSpinningBladeAimspeed.field_p = param1[6];
          SetTorpedoFireForce.field_o = param1[121];
          rlb.field_e = param1[142];
          jga.field_a = param1[100];
          dr.field_a = param1[125];
          GetDebrisFoundInPairs.field_o = param1[64];
          WeaponBehaviour.field_d = param1[18];
          GetMomentOfInertiaPredivideDownshift.field_q = param1[37];
          bpa.field_a = param1[222];
          tua.field_a = param1[180];
          pca.field_m = param1[30];
          GetShieldsDirectionalRadius.field_p = param1[167];
          GetFighterRepairAmount.field_o = param1[116];
          SetLaserRandomness.field_o = param1[134];
          Particle.field_G = param1[70];
          pea.field_a = param1[149];
          ku.field_c = param1[63];
          Particle.field_e = param1[224];
          Particle.field_q = param1[214];
          SetShipAimLines.field_q = param1[166];
          bn.field_a = param1[124];
          GetFightersPerPlayerMaximum.field_p = param1[31];
          la.field_m = param1[83];
          SetTorpedoEnergyUsed.field_q = param1[94];
          rjb.field_u = param1[211];
          Particle.field_n = param1[220];
          Particle.field_I = param1[32];
          GetLagStandardDeviationIn.field_p = param1[85];
          gib.field_a = param1[206];
          ea.field_j = param1[187];
          SetMachineGunAimspeed.field_o = param1[7];
          gtb.field_c = param1[138];
          slb.field_a = param1[177];
          GetTorpedoAcceleration.field_p = param1[226];
          GetInnateThrusters.field_p = param1[24];
          Particle.field_k = param1[215];
          SetSniperCannonFireForce.field_q = param1[227];
          GetLaserEnergyUsed.field_r = param1[157];
          eta.field_b = param1[194];
          GetSalvoHoldable.field_p = param1[176];
          ava.field_a = param1[129];
          kmb.field_f = param1[49];
          fob.field_c = param1[193];
          Particle.field_p = param1[219];
          asa.field_e = param1[128];
          ooa.field_xb = param1[151];
          apb.field_a = param1[65];
          GetVelocitySustain.field_o = param1[38];
          SetGrapplingHookMaxLength.field_p = param1[186];
          kva.field_g = param1[56];
          jtb.field_m = param1[147];
          tea.field_b = param1[74];
          GetMissilesHitSourceTeam.field_o = param1[69];
          GetShipAimLines.field_p = param1[155];
          SetGrapplingHookRopeChangeRate.field_o = param1[91];
          SetMaxShipSize.field_o = param1[34];
          GetPedrosRepairModeSwitchtime.field_o = param1[12];
          fra.field_a = param1[26];
          bma.field_n = param1[118];
          GetMissionTerrainNebulaProbability.field_r = param1[198];
          wkb.field_a = param1[62];
          ana.field_f = param1[105];
          wk.field_a = param1[42];
          GetRepairModePower.field_q = param1[126];
          cp.field_f = param1[80];
          GetPlayerRepairAmount.field_o = param1[87];
          aea.field_a = param1[72];
          if (param0 != 107) {
            field_o = -43;
          }
          eca.field_e = param1[103];
          bv.field_e = param1[163];
          Particle.field_a = param1[221];
          cia.field_a = param1[136];
          GetBombletSprayProjectileOndamageParticles.field_q = param1[229];
          SetPointDefenceLaserProjectiles.field_o = param1[50];
          GetMissionResnetResourceTickTime.field_o = param1[168];
          gl.field_d = param1[8];
          SetPointDefenceLaserEnergyUsed.field_o = param1[200];
          rma.field_b = param1[20];
          SetUseRectFill.field_p = param1[184];
          sja.field_b = param1[44];
          mq.field_j = param1[95];
          mmb.field_i = param1[131];
          SetThrusterBindingBalanceThreshold.field_p = param1[135];
          ujb.field_h = param1[108];
          GetTeamSelectionSpeedup.field_p = param1[10];
          SetAutoDetail.field_o = param1[0];
          khb.field_c = param1[140];
          SetBombletSprayFireForce.field_o = param1[190];
          SetMassDriverEnergyUsed.field_o = param1[179];
          PartitionZone.field_e = param1[43];
          SetMissileLauncherFireForce.field_q = param1[212];
          GetTorqueDownshift.field_o = param1[188];
          mc.field_u = param1[153];
          SetShipTeamAction.field_e = param1[28];
          pea.field_b = param1[154];
          GetBombletSprayRandomness.field_p = param1[29];
          nra.field_b = param1[201];
          GetMaxShipSize.field_o = param1[141];
          qrb.field_a = param1[33];
          la.field_k = param1[208];
          enb.field_c = param1[171];
          wf.field_e = param1[181];
          Particle.field_h = param1[232];
          SetShieldsDirectionalRadius.field_o = param1[169];
          SetMissionDebrisDefaultProbability.field_o = param1[195];
          ge.field_c = param1[178];
          Particle.field_x = param1[90];
          Particle.field_g = param1[218];
          dfa.field_a = param1[123];
          SetMissilesTopSpeed.field_o = param1[25];
          vqa.field_k = param1[2];
          SetThrusterAutobalancing.field_r = param1[15];
          wqa.field_b = param1[22];
          SetTorpedoEnergyUsed.field_p = param1[59];
          di.field_p = param1[27];
          GetMinimapWidth.field_o = param1[216];
          as.field_d = param1[13];
          SetMomentOfInertiaPerpointCalcDownshift.field_p = param1[111];
          SetThrusterBindingMoveAndTurnHasOppositeMove.field_p = param1[120];
          MatchResults.field_b = param1[68];
          gda.field_d = param1[40];
          ehb.field_e = param1[152];
          GetFullMissionSet.field_p = param1[36];
          voa.field_b = param1[144];
          sib.field_i = param1[130];
          wha.field_a = param1[61];
          SetLaserAimarc.field_o = param1[160];
          SetPointDefenceLaserReload.field_q = param1[132];
          dla.field_c = param1[139];
          nnb.field_e = param1[122];
          GetUseNiceTrails.field_p = param1[47];
          GetMissileLauncherEnergyUsed.field_p = param1[52];
          GetPhysicsCollisionPhantomForceMultiplier.field_o = param1[213];
          SetSalvoRepairTimeMultiplier.field_p = param1[81];
          pwa.field_b = param1[170];
          SetMissilesCooldown.field_o = param1[174];
          GetAutoAfkTimeout.field_o = param1[97];
          voa.field_d = param1[11];
          GetRadialMenuRadius.field_p = param1[79];
          vdb.field_d = param1[45];
          GetAngularForceDownshift.field_q = param1[150];
          SetFps.field_p = param1[183];
          SetUseLines.field_p = param1[66];
          MissionEvent.field_a = param1[112];
          SetSpinningBladeAimarc.field_o = param1[113];
          qca.field_wb = param1[117];
          fj.field_b = param1[86];
          Particle.field_m = param1[205];
          qh.field_J = param1[88];
          GetMissionTerrainNebulaProbability.field_p = param1[143];
          ffa.field_b = param1[161];
          sl.field_a = param1[57];
          wkb.field_b = param1[133];
          ConsoleCommandRegistry.field_a = param1[172];
          GetMissionTerrainAsteroidProbability.field_o = param1[148];
          SetRepairModePower.field_r = param1[182];
          SetPointDefenceLaserPulsetime.field_o = param1[14];
          Particle.field_z = param1[233];
          joa.field_a = param1[199];
          GetMissileLauncherEnergyUsed.field_q = param1[175];
          aea.field_b = param1[60];
          SetPhasedEnergyBeamPulseFadetime.field_o = param1[77];
          Particle.field_o = param1[223];
          GetMachineGunAimspeed.field_p = param1[101];
          SetSniperCannonProjectiles.field_o = param1[21];
          ue.field_a = param1[41];
          SetTorpedoAimspeed.field_o = param1[53];
          GetGrapplingHookAimspeed.field_p = param1[16];
          ibb.field_a = param1[173];
          km.field_o = param1[156];
          SetShipPersistence.field_s = param1[106];
          LoadSettings.field_s = param1[78];
          SetKeepTeamColours.field_o = param1[231];
          upb.field_a = param1[189];
          SetMissileLauncherEnergyUsed.field_o = param1[107];
          LoadSettings.field_p = param1[217];
          mmb.field_g = param1[164];
          uab.field_b = param1[84];
          Particle.field_j = param1[234];
          GetToggledScoreboard.field_r = param1[67];
          coa.field_f = param1[146];
          veb.field_b = param1[1];
          GetAutoaim.field_o = param1[5];
          GetPointDefenceLaserAimspeed.field_p = param1[159];
          qab.field_d = param1[137];
          Particle.field_w = param1[209];
          SetSniperCannonAimspeed.field_o = param1[110];
          uja.field_b = param1[228];
          SetLaserRandomness.field_q = param1[114];
          wja.field_b = param1[102];
          GetBombletSprayReload.field_s = param1[35];
          r.field_k = param1[89];
          GetMissileLauncherRandomness.field_p = param1[127];
          GrappleLauncherBehaviour.field_d = param1[39];
          SetArmageddonWarning.field_o = param1[54];
          bia.field_c = param1[197];
          rla.field_x = param1[19];
          Particle.field_A = param1[46];
          rn.field_o = param1[162];
          qca.field_yb = param1[76];
          spa.field_a = param1[165];
          bra.field_d = param1[3];
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kga.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = 360;
    }
}
