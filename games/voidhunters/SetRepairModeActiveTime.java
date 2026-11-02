/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetRepairModeActiveTime extends ConsoleCommand {
    SetRepairModeActiveTime(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 >= -89) {
          return false;
        }
        stackIn_7_0 = (GetPhasedEnergyBeamPulsetime.e((byte) 120)) || !(GetDebrisCarryOver.field_o > 0);
        return stackIn_7_0;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            SetRepairModeActiveTime.a(106);
          }
          SetMachineGunEnergyUsed.a(215, 62, arguments[0].a(123));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vrb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(byte[] param0, int param1, int param2, asb param3, String[] param4, String[][] param5, phb[][] param6, int param7, phb[][] param8, String[][] param9, String[] param10, byte[] param11, int param12, String[] param13, int[] param14) {
        cna[] array$0 = null;
        cna[] array$1 = null;
        cna[] array$2 = null;
        int var19 = 0;
        llb stackIn_6_0;
        llb stackIn_6_1;
        long stackIn_6_2;
        llb stackIn_6_3;
        llb stackIn_7_0 = null;
        llb stackIn_7_1 = null;
        String stackIn_7_4 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_94_2 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_97_2 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_103_2 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_109_2 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_112_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        llb var16 = null;
        int var17_int = 0;
        llb var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        llb var23 = null;
        llb var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = VoidHunters.field_G;
        try {
          wja.field_c = param4;
          sha.field_w = param2;
          GetDebrisThrowable.field_r = param7;
          hqb.field_k = param9;
          SetMutatorVotes.field_o = param14;
          ClientException.field_c = param10;
          ea.field_k = param13;
          SetShipAimLines.field_o = param5;
          gm.field_M = param0;
          SetRepairModeRadius.field_o = param6;
          vva.field_u = param11;
          SetPointDefenceLaserAimarc.field_p = param8;
          sqb.field_o = SetGrapplingHookRopeBreakLength.a(param3, true, "lobby", "gameprivacy");
          hnb.field_U = SetGrapplingHookRopeBreakLength.a(param3, true, "lobby", "ratedgame");
          atb.field_b = SetGrapplingHookRopeBreakLength.a(param3, true, "lobby", "opentome");
          GetPointDefenceLaserProjectileInterceptDamage.field_t = SetGrapplingHookRopeBreakLength.a(param3, true, "lobby", "allowspectators");
          SetHealthBarHeight.field_p = new String[5];
          SetHealthBarHeight.field_p[2] = tja.field_b;
          SetHealthBarHeight.field_p[3] = SetPointDefenceLaserProjectiles.field_q;
          SetHealthBarHeight.field_p[1] = GetAngularForceDownshift.field_o;
          SetHealthBarHeight.field_p[0] = uob.field_f;
          SetHealthBarHeight.field_p[4] = GetCountermeasuresCooldown.field_o;
          DualLinkNode.field_f = new llb(0L, (llb) null);
          me.field_q = new llb(0L, GetThrusterBindingBalanceThreshold.field_p, kpb.field_r);
          GetDebrisGrabbingRange.field_o = new llb(0L, qsa.field_d, GetMessageMaxage.field_p);
          tja.field_a = new soa(0L, new llb(0L, (llb) null), htb.field_w, GetUseNiceTrails.field_o);
          DualLinkNode.field_f.b(-561, me.field_q);
          if (GetGrapplingHooksDamageableBySourcePlayer.field_o) {
            DualLinkNode.field_f.b(param1 - 10792, GetDebrisGrabbingRange.field_o);
          }
          DualLinkNode.field_f.b(param1 - 10792, tja.field_a);
          tja.field_a.field_xb.a(param1 + 8214, qc.field_q);
          var23 = tja.field_a.field_xb;
          var24 = var23;
          tja.field_a.field_xb.field_B = 1;
          var24.field_F = 1;
          nna.field_v = new llb(0L, qc.field_q);
          nna.field_v.field_F = 1;
          gmb.field_c = new llb(0L, SetPlayerRepairAmount.field_q, bw.field_a.toUpperCase());
          qpb.field_w = new llb(0L, pa.field_a, SetMachineGunAimarc.field_o.toUpperCase());
          sra.field_a = new llb(0L, as.field_c);
          fwa.field_a = new llb(0L, GetThrusterBindingBalanceThreshold.field_p, GetLaserRandomness.field_o);
          GetSniperCannonAimspeed.field_q = new llb(0L, GetUseSprites.field_p, lw.field_e);
          gs.field_b = new llb(0L, GetUseSprites.field_p, sc.field_b);
          GrapplingHook.field_C = new llb(0L, GetUseSprites.field_p, MissionGenerationData.field_e);
          GetDebrisDetachmentForceMultiplier.field_o = new llb(0L, GetUseSprites.field_p, SetTrapMouse.field_o);
          uga.field_h = new llb(0L, qsa.field_d, tea.field_c);
          rgb.field_f = new soa(0L, new llb(0L, (llb) null), htb.field_w, GetUseNiceTrails.field_o);
          GetMomentOfInertiaPerpointCalcDownshift.field_p = new llb(0L, SetGrapplingHookMaxExtension8Force.field_p, ev.field_b.toUpperCase());
          GetMomentOfInertiaPerpointCalcDownshift.field_p.field_y = GetGrapplingHooksDamageableBySourcePlayer.field_o;
          stackIn_6_0 = null;
          stackIn_6_1 = null;
          stackIn_6_2 = 0L;
          stackIn_6_3 = SetGrapplingHookMaxExtension8Force.field_p;
          if (GetGrapplingHooksDamageableBySourcePlayer.field_o) {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = uab.field_a;
          } else {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = SetMessageMax.field_o;
          }
          oib.field_a = new llb(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_7_4).toUpperCase());
          bqa.field_d = new llb(0L, (llb) null);
          bqa.field_d.b(-561, qpb.field_w);
          bqa.field_d.b(param1 - 10792, sra.field_a);
          sra.field_a.b(-561, fwa.field_a);
          sra.field_a.b(-561, GetSniperCannonAimspeed.field_q);
          sra.field_a.b(param1 ^ -9672, gs.field_b);
          if (GetGrapplingHooksDamageableBySourcePlayer.field_o) {
            sra.field_a.b(param1 ^ -9672, GrapplingHook.field_C);
          }
          sra.field_a.b(-561, GetDebrisDetachmentForceMultiplier.field_o);
          sra.field_a.b(-561, uga.field_h);
          sra.field_a.b(-561, rgb.field_f);
          if (GetGrapplingHooksDamageableBySourcePlayer.field_o) {
            bqa.field_d.b(-561, GetMomentOfInertiaPerpointCalcDownshift.field_p);
          }
          bqa.field_d.b(-561, oib.field_a);
          Debris.field_y = new llb(0L, qc.field_q);
          Debris.field_y.field_F = 1;
          Debris.field_y.field_B = 0;
          SetTorpedoAcceleration.field_o = new llb(0L, hnb.field_X, tia.field_K.toUpperCase());
          GetTorpedoProjectiles.field_o = new llb(0L, DualLinkNode.field_g);
          GetTorpedoProjectiles.field_o.b(-561, Debris.field_y);
          GetTorpedoProjectiles.field_o.b(-561, SetTorpedoAcceleration.field_o);
          GetTorpedoProjectileDamage.field_p = new llb(0L, htb.field_w);
          GetTorpedoProjectileDamage.field_p.a(18445, qc.field_q);
          var16 = GetTorpedoProjectileDamage.field_p;
          GetTorpedoProjectileDamage.field_p.field_B = 1;
          if (param1 != 10231) {
            return;
          }
          var16.field_F = 1;
          SetOndamageParticleLife.field_o = new llb(0L, (llb) null);
          SetPhasedEnergyBeamPulsetime.field_o = new llb(0L, qc.field_q);
          SetPhasedEnergyBeamPulsetime.field_o.field_F = 1;
          NodeHashTableIterator.field_a = new llb(0L, GetThrusterBindingBalanceThreshold.field_p, kpb.field_r);
          GetPointDefenceLaserProjectileDamage.field_o = new llb(0L, qsa.field_d, GetMessageMaxage.field_p);
          rga.field_f = new soa(0L, new llb(0L, (llb) null), htb.field_w, GetUseNiceTrails.field_o);
          SetOndamageParticleLife.field_o.b(-561, SetPhasedEnergyBeamPulsetime.field_o);
          SetOndamageParticleLife.field_o.b(-561, NodeHashTableIterator.field_a);
          if (GetGrapplingHooksDamageableBySourcePlayer.field_o) {
            SetOndamageParticleLife.field_o.b(-561, GetPointDefenceLaserProjectileDamage.field_o);
          }
          SetOndamageParticleLife.field_o.b(-561, rga.field_f);
          GetShipToShipRamDamage.field_q = new llb(0L, SetPlayerRepairAmount.field_q, tua.field_b.toUpperCase());
          GetWeaponParticleSpeedDownshift.field_q = new llb(0L, pa.field_a);
          SetPhysicsCollisionGrapplingHookForceMultiplier.field_o = new llb(0L, as.field_c);
          ProxySocketConnector.field_e = new llb(0L, bv.field_b, mr.field_J.toUpperCase());
          GetLaserAimarc.field_o = new llb[4 + param12];
          SetReloadBarHeight.field_q = new cna[4 + param12][];
          GetLaserAimarc.field_o[0] = new llb(0L, SetShieldsDirectionalHalfarcCuts.field_p, GetMissionTerrainSpaceProbability.field_p);
          SetReloadBarHeight.field_q[0] = new cna[6];
          for (var17_int = 0; var17_int < 5; var17_int++) {
            SetReloadBarHeight.field_q[0][1 + var17_int] = new cna(0L, tia.field_M, (llb) null, GetMissionDebrisDefaultProbability.field_o, sqb.field_o[var17_int], SetHealthBarHeight.field_p[var17_int]);
          }
          if (SetMutatorVotes.field_o.length >= 2) {
            GetLaserAimarc.field_o[1] = new llb(0L, SetShieldsDirectionalHalfarcCuts.field_p, uda.field_a);
            array$0 = new cna[1 + SetMutatorVotes.field_o.length];
            SetReloadBarHeight.field_q[1] = array$0;
            SetReloadBarHeight.field_q[1][0] = new cna(0L, tia.field_M, (llb) null, GetMissionDebrisDefaultProbability.field_o, (phb) null, mpb.field_k);
            for (var17_intLifetime1 = 0; var17_intLifetime1 < SetMutatorVotes.field_o.length; var17_intLifetime1++) {
              SetReloadBarHeight.field_q[1][var17_intLifetime1 + 1] = new cna(0L, tia.field_M, (llb) null, GetMissionDebrisDefaultProbability.field_o, (phb) null, Integer.toString(SetMutatorVotes.field_o[var17_intLifetime1]));
            }
          }
          GetLaserAimarc.field_o[2] = new llb(0L, SetShieldsDirectionalHalfarcCuts.field_p, kra.field_b);
          SetReloadBarHeight.field_q[2] = new cna[]{new cna(0L, tia.field_M, (llb) null, GetMissionDebrisDefaultProbability.field_o, (phb) null, mpb.field_k), new cna(0L, tia.field_M, (llb) null, GetMissionDebrisDefaultProbability.field_o, GetPointDefenceLaserProjectileInterceptDamage.field_t[0], nl.field_j), new cna(0L, tia.field_M, (llb) null, GetMissionDebrisDefaultProbability.field_o, GetPointDefenceLaserProjectileInterceptDamage.field_t[1], ns.field_a)};
          if (GetDebrisThrowable.field_r > 1) {
            GetLaserAimarc.field_o[3] = new llb(0L, SetShieldsDirectionalHalfarcCuts.field_p, GetMassDriverProjectileOndamageParticles.field_o);
            array$1 = new cna[1 + GetDebrisThrowable.field_r];
            SetReloadBarHeight.field_q[3] = array$1;
            SetReloadBarHeight.field_q[3][0] = new cna(0L, tia.field_M, (llb) null, GetMissionDebrisDefaultProbability.field_o, (phb) null, mpb.field_k);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < GetDebrisThrowable.field_r; var17_intLifetime2++) {
              SetReloadBarHeight.field_q[3][var17_intLifetime2 + 1] = new cna(0L, tia.field_M, (llb) null, GetMissionDebrisDefaultProbability.field_o, (phb) null, wja.field_c[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param12 > var17_intLifetime3; var17_intLifetime3++) {
            GetLaserAimarc.field_o[var17_intLifetime3 + 4] = new llb(0L, SetShieldsDirectionalHalfarcCuts.field_p, ClientException.field_c[var17_intLifetime3]);
            array$2 = new cna[dla.a(255, (int) gm.field_M[var17_intLifetime3]) + 1];
            SetReloadBarHeight.field_q[var17_intLifetime3 + 4] = array$2;
            SetReloadBarHeight.field_q[var17_intLifetime3 + 4][0] = new cna(0L, tia.field_M, (llb) null, GetMissionDebrisDefaultProbability.field_o, (phb) null, mpb.field_k);
            for (var18 = 0; var18 < (gm.field_M[var17_intLifetime3] & 255); var18++) {
              if (SetRepairModeRadius.field_o == null) {
                var19_ref = null;
              } else {
                if (null == SetRepairModeRadius.field_o[var17_intLifetime3]) {
                  var19_ref = null;
                } else {
                  var19_ref = SetRepairModeRadius.field_o[var17_intLifetime3][var18];
                }
              }
              if (null == hqb.field_k) {
                var20 = null;
              } else {
                if (null == hqb.field_k[var17_intLifetime3]) {
                  var20 = null;
                } else {
                  var20 = hqb.field_k[var17_intLifetime3][var18];
                }
              }
              SetReloadBarHeight.field_q[4 + var17_intLifetime3][1 + var18] = new cna(0L, tia.field_M, (llb) null, GetMissionDebrisDefaultProbability.field_o, (phb) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; var17_intLifetime4 < 4 + param12; var17_intLifetime4++) {
            if (GetLaserAimarc.field_o[var17_intLifetime4] != null) {
              GetLaserAimarc.field_o[var17_intLifetime4].field_D = 11;
            }
            if (SetReloadBarHeight.field_q[var17_intLifetime4] != null) {
              for (var18Lifetime1 = 0; var18Lifetime1 < SetReloadBarHeight.field_q[var17_intLifetime4].length; var18Lifetime1++) {
                if (SetReloadBarHeight.field_q[var17_intLifetime4][var18Lifetime1] != null &&
                  null != SetReloadBarHeight.field_q[var17_intLifetime4][var18Lifetime1].field_yb) {
                  SetReloadBarHeight.field_q[var17_intLifetime4][var18Lifetime1].field_yb.field_D = 11;
                }
              }
            }
          }
          vw.field_a = new llb(0L, SetGrapplingHookMaxExtension8Force.field_p);
          qsa.field_b = new llb(0L, SetGrapplingHookMaxExtension8Force.field_p);
          SetAutozoomSpeedDivide.field_p = new llb(0L, SetAutoAfkTimeout.field_q);
          SetAutozoomSpeedDivide.field_p.a(18445, qc.field_q);
          SetAutozoomSpeedDivide.field_p.field_B = 1;
          var17 = SetAutozoomSpeedDivide.field_p;
          var17.field_F = 1;
          vva.field_r = new llb(0L, (llb) null);
          vva.field_r.b(-561, GetWeaponParticleSpeedDownshift.field_q);
          vva.field_r.b(-561, SetPhysicsCollisionGrapplingHookForceMultiplier.field_o);
          SetPhysicsCollisionGrapplingHookForceMultiplier.field_o.b(-561, ProxySocketConnector.field_e);
          for (var18Lifetime2 = 0; 4 + param12 > var18Lifetime2; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(SetMutatorVotes.field_o.length < 2)) && (var18Lifetime2 != 3 ||
              !(GetDebrisThrowable.field_r <= 1))) {
              SetPhysicsCollisionGrapplingHookForceMultiplier.field_o.b(-561, GetLaserAimarc.field_o[var18Lifetime2]);
              for (var19 = 0; var19 < SetReloadBarHeight.field_q[var18Lifetime2].length; var19++) {
                if (null != SetReloadBarHeight.field_q[var18Lifetime2][var19]) {
                  SetPhysicsCollisionGrapplingHookForceMultiplier.field_o.b(-561, SetReloadBarHeight.field_q[var18Lifetime2][var19]);
                }
              }
            }
          }
          vva.field_r.b(param1 - 10792, vw.field_a);
          vva.field_r.b(-561, qsa.field_b);
          vva.field_r.b(-561, SetAutozoomSpeedDivide.field_p);
          sfa.field_d = new llb(0L, lo.field_b, ko.field_d.toUpperCase());
          rlb.field_a = new llb(0L, hnb.field_X, SetCountermeasureLauncherAimarc.field_s.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_81_0 = var15;
          stackIn_81_1 = new StringBuilder().append("vrb.B(");
          if (param0 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          stackIn_84_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          stackIn_87_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',');
          if (param4 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          stackIn_90_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(',');
          if (param5 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          stackIn_93_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',');
          if (param6 == null) {
            stackIn_94_2 = "null";
          } else {
            stackIn_94_2 = "{...}";
          }
          stackIn_96_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_94_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_97_2 = "null";
          } else {
            stackIn_97_2 = "{...}";
          }
          stackIn_99_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_97_2).append(',');
          if (param9 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          stackIn_102_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',');
          if (param10 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          stackIn_105_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(',');
          if (param11 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          stackIn_108_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_109_2 = "null";
          } else {
            stackIn_109_2 = "{...}";
          }
          stackIn_111_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(',');
          if (param14 == null) {
            stackIn_112_2 = "null";
          } else {
            stackIn_112_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_111_1).append(stackIn_112_2).append(')').toString());
        }
    }

    static {
    }
}
