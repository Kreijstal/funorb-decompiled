/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetPhasedEnergyBeamPulseFadetime extends ConsoleCommand {
    static String field_o;

    public static void e(byte param0) {
        if (param0 <= 58) {
          GetPhasedEnergyBeamPulseFadetime.e((byte) 89);
        }
        field_o = null;
    }

    GetPhasedEnergyBeamPulseFadetime(String param0, Class[] param1, String param2) {
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
          if (obfuscationGuard >= -119) {
            field_o = (String) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(187, 101));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ju.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1, String param2, byte param3, boolean param4, String param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_28_0 = 0;
          boolean stackIn_39_0 = false;
          boolean stackIn_42_0 = false;
          boolean stackIn_45_0 = false;
          boolean stackIn_50_0 = false;
          int stackIn_77_0 = 0;
          int stackIn_87_0 = 0;
          int stackIn_89_0 = 0;
          int stackIn_100_0 = 0;
          int stackIn_102_0 = 0;
          RuntimeException stackIn_105_0 = null;
          StringBuilder stackIn_105_1 = null;
          String stackIn_106_2 = null;
          StringBuilder stackIn_108_1 = null;
          String stackIn_109_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          String var12 = null;
          CharSequence var13 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = VoidHunters.field_G;
          try {
            if (SetShipSpawnInvulnerabilityTime.field_o == null &&
              !ne.a(param4, (byte) -11)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (tc.field_c == SetBombletSprayReload.field_p) {
              if (!param4) {
                qva.field_j = SetMissileLauncherProjectileLife.a(param2, param5, false, (byte) -70);
              } else {
                var11 = (String) null;
                qva.field_j = SetFullMissionSet.a(96, SetTorpedoAimarc.field_p, (String) null, false, param5);
              }
              RequestNewestBlackboxRecording.field_p.position = 0;
              RequestNewestBlackboxRecording.field_p.c(param3 ^ 13, 14);
              RequestNewestBlackboxRecording.field_p.c(0, qva.field_j.a((byte) 56).field_a);
              lnb.b(-1, 117);
              tc.field_c = SetSpecialOrderBoxHeight.field_o;
            }
            if (SetSpecialOrderBoxHeight.field_o == tc.field_c &&
              ShipBlueprint.a(1, 30000)) {
              var6_int = qga.field_b.e((byte) -121);
              if (var6_int != 0) {
                vja.field_a = -1;
                tc.field_c = kw.field_xb;
                ow.field_a = var6_int;
              } else {
                tc.field_c = ida.field_w;
              }
              qga.field_b.position = 0;
            }
            if (ida.field_w == tc.field_c &&
              ShipBlueprint.a(8, param3 ^ 30013)) {
              SetMissileLauncherRandomness.field_p = qga.field_b.k(255);
              qga.field_b.position = 0;
              dqa.a(-87, param0, param4, qva.field_j, param1);
              tc.field_c = of.field_a;
            }
            boolean decompiledFrameRemainder0 = true;
            if (tc.field_c == of.field_a &&
              ShipBlueprint.a(1, 30000)) {
              var6_intLifetime1 = qga.field_b.e((byte) -110);
              ow.field_a = var6_intLifetime1;
              qga.field_b.position = 0;
              GetFighterBayAimspeed.field_o = null;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  vja.field_a = -1;
                  tc.field_c = kw.field_xb;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ifb.l(-122);
                  SetShowTutorial.field_o = false;
                  stackIn_28_0 = var6_intLifetime1;
                  return stackIn_28_0;
                }
              }
              if (decompiledFrameRemainder0) {
                vja.field_a = -1;
                tc.field_c = htb.field_A;
              }
            }
            if (tc.field_c == htb.field_A &&
              ci.b((byte) 113)) {
              SetTorpedoAimarc.field_p = qga.field_b.k(255);
              SetLagVariant.field_p = param5;
              SetAngularVelocitySustain.field_p = qga.field_b.e((byte) -94);
              nfa.field_d = qga.field_b.e((byte) -106);
              GetDebrisCarryOver.field_o = qga.field_b.e(param3 + 1856);
              var12 = qga.field_b.m(0);
              var7 = qga.field_b.e((byte) -106);
              if ((var7 & 1) != 0) {
                ImageProducerRasterBuffer.d((byte) 111);
              }
              if (!param4) {
                stackIn_39_0 = ((8 & var7) != 0);
                GetBloomThresholdPercentage.field_p = stackIn_39_0;
                stackIn_42_0 = ((var7 & 2) != 0);
                hb.field_c = stackIn_42_0;
                stackIn_45_0 = ((var7 & 4) != 0);
                GetFightersPerPlayerMaximum.field_r = stackIn_45_0;
                if (GetBloomThresholdPercentage.field_p) {
                  hb.field_c = true;
                }
              }
              stackIn_50_0 = ((16 & var7) != 0);
              SetMissilesHitSourceTeam.field_p = stackIn_50_0;
              if (GetBombletSprayReload.field_q) {
                qga.field_b.e((byte) -117);
                qga.field_b.e((byte) -91);
                qga.field_b.h(86);
                TeamNodeCondition.field_e = qga.field_b.e(1869);
                GetRepairModeActiveTime.field_o = new byte[TeamNodeCondition.field_e];
                for (var8 = 0; TeamNodeCondition.field_e > var8; var8++) {
                  GetRepairModeActiveTime.field_o[var8] = qga.field_b.d((byte) -114);
                }
              }
              kca.field_a = qga.field_b.a(param3 ^ -14);
              var13 = (CharSequence) ((Object) kca.field_a);
              ffb.field_e = jwa.a(false, var13);
              SetClientSideDragging.field_p = qga.field_b.e((byte) -94);
              tc.field_c = GetOndamageParticleSpeed.field_o;
              if (qva.field_j.a((byte) 124) == GetSalvoDamageMultiplier.field_r) {
                SetFighterBayAimspeed.field_o.a(MissionList.b((byte) -106), param3 ^ 13);
              } else {
                if (qva.field_j.a((byte) 112) == GetTorpedoReload.field_p) {
                  SetShowTutorial.field_p.a(MissionList.b((byte) -103), 0);
                }
              }
              SetShowTutorial.field_o = false;
              if (var12 != null) {
                SetNebulaProximityFadeDownshift.a(MissionList.b((byte) -94), var12, -1);
              }
              if (GetDebrisCarryOver.field_o <= 0 &&
                !GetFightersPerPlayerMaximum.field_r) {
                try {
                  ia.a(MissionList.b((byte) -87), "unzap", param3 ^ 12337);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  ia.a(new Object[]{vga.a(SetTorpedoAimarc.field_p, -127)}, MissionList.b((byte) -92), "zap", (byte) 108);
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (GetDebrisCarryOver.field_o > 0) {
                GetRespawnTime.field_o = true;
              }
              RequestNewestBlackboxRecording.field_p.a(18794, nfa.field_e);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                nfa.field_e[var8Lifetime1] = nfa.field_e[var8Lifetime1] + 50;
              }
              qga.field_b.a(18794, nfa.field_e);
              stackIn_77_0 = ow.field_a;
              return stackIn_77_0;
            }
            if (tc.field_c == kw.field_xb &&
              ci.b((byte) 113)) {
              ifb.l(-117);
              if (ow.field_a == 7 &&
                !SetShowTutorial.field_o) {
                SetShowTutorial.field_o = true;
                stackIn_89_0 = -1;
                return stackIn_89_0;
              }
              if (ow.field_a == 7) {
                ow.field_a = 3;
              }
              dgb.field_b = qga.field_b.a(-1);
              SetShowTutorial.field_o = false;
              stackIn_87_0 = ow.field_a;
              return stackIn_87_0;
            }
            if (param3 != 13) {
              var10 = (String) null;
              GetPhasedEnergyBeamPulseFadetime.a(true, 44, (String) null, (byte) 29, true, (String) null);
            }
            if (null == SetShipSpawnInvulnerabilityTime.field_o) {
              if (SetShowTutorial.field_o) {
                if (mw.e(0) > 30000L) {
                  dgb.field_b = SetSalvoRepairTimeMultiplier.field_o;
                } else {
                  dgb.field_b = uv.field_f;
                }
                SetShowTutorial.field_o = false;
                stackIn_100_0 = 3;
                return stackIn_100_0;
              }
              var6_intLifetime2 = SetNebulaProximityFadeDownshift.field_p;
              SetNebulaProximityFadeDownshift.field_p = bia.field_d;
              bia.field_d = var6_intLifetime2;
              SetShowTutorial.field_o = true;
            }
            stackIn_102_0 = -1;
            return stackIn_102_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_105_0 = var6;
            stackIn_105_1 = new StringBuilder().append("ju.C(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_106_2 = "null";
            } else {
              stackIn_106_2 = "{...}";
            }
            stackIn_108_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_109_2 = "null";
            } else {
              stackIn_109_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_o = "Press CTRL-R to reconnect";
    }
}
