/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class VoidHunters extends NetworkGameClient {
    private int field_B;
    private int field_D;
    private Sprite field_F;
    static int[] field_E;
    private int field_C;
    public static int field_G;

    private final void a(int param0, MidiChannelLevels param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = field_G;
        try {
          if (this.field_D == -1) {
            for (var4_int = 0; var4_int < param1.levels.length; var4_int++) {
              GetThrusterParticleLife.field_o.b(param1.levels[var4_int], (byte) 18, var4_int);
            }
          } else {
            GetThrusterParticleLife.field_o.a((byte) 125, 4000, param1);
          }
          this.field_D = param2;
          if (param0 != -23134) {
            field_E = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("VoidHunters.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean checkDuplicateReference(boolean param0, Object param1) {
        int var3 = 0;
        Object[] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int var2_int = 0;
        Object[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        Object[] var5 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = field_G;
        try {
          if (GetMissionTerrainNebulaProbability.field_q &&
            param1 != null) {
            var2_int = 0;
            while (var2_int < SetVelocitySustainMax.field_o) {
              if (SetFogOfWarOn.field_o[var2_int] != param1) {
                var2_int++;
                continue;
              }
              return true;
            }
            if (!param0) {
              field_E = (int[]) null;
            }
            if (~SetVelocitySustainMax.field_o == ~SetFogOfWarOn.field_o.length) {
              var5 = new Object[SetFogOfWarOn.field_o.length + 1];
              var2 = var5;
              for (var3 = 0; var3 < SetFogOfWarOn.field_o.length; var3++) {
                var5[var3] = SetFogOfWarOn.field_o[var3];
              }
              SetFogOfWarOn.field_o = var2;
            }
            fieldTemp$2 = SetFogOfWarOn.field_o;
            fieldTemp$3 = SetVelocitySustainMax.field_o;
            SetVelocitySustainMax.field_o = SetVelocitySustainMax.field_o + 1;
            fieldTemp$2[fieldTemp$3] = param1;
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("VoidHunters.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final static void m(int param0) {
        SetPlayerRepairAmount.e(param0 + 29129);
        if (param0 != -29130) {
          return;
        }
        GetUseBackground.a(param0 + 29129);
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, boolean param6, boolean param7) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (0 != jba.field_b.field_o &&
            !GetBloomThresholdPercentage.field_p) {
            SetFightersPerPlayerMaximum.field_p = true;
          }
          if (!param6) {
            field_E = (int[]) null;
          }
          if (SetFightersPerPlayerMaximum.field_p) {
            SetTorpedoRandomness.a(param0, param1, 20, param5, false, param3, param3, param4, param2);
            qw.field_l.a(param7, 1332);
            if (!param7) {
              return;
            }
            if (GetMachineGunAimarc.field_q.field_o != 0) {
              SetFightersPerPlayerMaximum.field_p = false;
            }
            if (dp.field_a.field_o == 0) {
              return;
            }
            dr.a(26718);
            SetFightersPerPlayerMaximum.field_p = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("VoidHunters.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void applyShipCookie(boolean logGuard) {
        if (null != GetBombletSprayPushMultiplier.field_o) {
          return;
        }
        String var2 = ro.a("fog_voidhunters_ship", 74, MissionList.b((byte) -125));
        GetDebrisThrowable.a(logGuard, "Ship cookie=" + var2);
        if (var2 != null) {
          SetInnateThrusters.a(0, GetResourceNodeCaptureTime.a(var2, true, true));
        }
    }

    public final void init() {
        this.startClient("voidhunters", -74, 27);
    }

    private final void handleServerPacket(int param0, int param1) {
        int stackIn_59_0 = 0;
        Object var3;
        int var4;
        Object var5;
        int var7;
        uca var8;
        int var4Lifetime1;
        int var4Lifetime2;
        Object var3Lifetime1;
        int var4Lifetime1Lifetime1;
        var7 = field_G;
        if (param0 == 9) {
          olb.d(param1 + 991426336);
          lu.field_d = false;
          wgb.field_f = 6;
          BodyInZoneCondition.field_c = qga.field_b.readString(-1);
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param0 == 14) {
          GetDebrisThrowable.a(false, "Entering lobby");
          GetBombletSprayAimarc.a(shb.field_o, SetUseOffscreenRendering.a(0), GetSalvoaim.a(8, (byte) -99), GetSalvoaim.a(2000, (byte) -116), SetUseOffscreenRendering.b(false), true, NetworkGameClient.field_A.length, 150, 1024, GetMissilesAcceleration.a(207));
          GetPhasedEnergyBeamAimarc.a(SetBombletSprayPushMultiplier.a(0), dm.i((byte) -90), true);
          jkb.field_a = true;
          lu.field_d = false;
          if (vqa.field_g != null &&
            !vqa.field_g.field_N) {
            vga.field_b = 0;
            GetSniperCannonProjectiles.field_p = false;
            SetDebrisSurvives.e((byte) -86);
            return;
          }
          if (vqa.field_g == null) {
            olb.d(param1 ^ 991426336);
            wgb.field_f = -2;
            GetSniperCannonProjectiles.field_p = true;
            lsb.a(true);
            decompiledFrameRemainder0 = false;
          }
          else {
            return;
          }
        }
        if (decompiledFrameRemainder0) {
          if (param0 == 15) {
            GetDebrisThrowable.a(false, "Leaving lobby");
            if (jkb.field_a) {
              olb.d(991426348);
              vjb.a((byte) 110);
              SettingsInstance.a(-15400);
              enb.field_b = true;
              GetThrusterSmallForce.field_o = false;
              GetMessageFadetime.field_o = false;
              SetMissionTerrainDebrisProbability.field_p = false;
              wgb.field_f = 0;
              aeb.field_a = true;
              jkb.field_a = false;
              lsb.a(true);
            }
            lu.field_d = false;
            SetMassDriverFireForce.field_o = false;
            return;
          }
          if (param0 == 10 &&
            jkb.field_a) {
            GetTeamSelectionSpeedup.a(13);
            GetDebrisThrowable.a(false, "Lobby packet");
            return;
          }
          if (param0 != 57 &&
            param0 != 58) {
            if (59 == param0) {
              GetDebrisThrowable.a(false, "Stop game packet");
              if (null != vqa.field_g &&
                !vqa.field_g.field_N) {
                return;
              }
              GetDebrisThrowable.a(false, "Stop game! playing=" + GetThrusterSmallForce.field_o + ", spectating=" + SetMissionTerrainDebrisProbability.field_p);
              if (GetThrusterSmallForce.field_o ||
                SetMissionTerrainDebrisProbability.field_p ||
                di.field_l.a(-28208)) {
                olb.d(991426348);
                if (null == vqa.field_g) {
                  GetThrusterSmallForce.field_o = false;
                }
                if (GetThrusterSmallForce.field_o) {
                  vqa.field_g.a(false, -10510);
                }
                GetMessageFadetime.field_o = false;
                GetThrusterSmallForce.field_o = false;
                wgb.field_f = -2;
                SetMissionTerrainDebrisProbability.field_p = false;
                aeb.field_a = true;
                GetSniperCannonProjectiles.field_p = true;
                lsb.a(true);
              }
              di.field_l.a(true);
              SetMassDriverFireForce.field_o = false;
              return;
            }
            var3 = null;
            if (!GetThrusterSmallForce.field_o) {
              if (SetMissionTerrainDebrisProbability.field_p) {
                var3 = ProxyAuthenticationException.field_a;
              }
            } else {
              var3 = vqa.field_g;
            }
            if (param1 != 12) {
              this.field_F = (Sprite) null;
            }
            if (param0 == 62) {
              GetDebrisThrowable.a(false, "Game finished packet");
              if (var3 != null) {
                stackIn_59_0 = (bqa.a(false)) ? 7 : 0;
                GetNebulaFadesOutWhenClose.a(stackIn_59_0, false, (byte) -85, -1);
              }
              return;
            }
            if (param0 == 63) {
              var4 = qga.field_b.readUnsignedByte((byte) -107);
              if (var3 != null) {
                ((uca) (var3)).field_m.field_f = var4;
                decompiledFrameRemainder0 = (null != vqa.field_g);
                if (decompiledFrameRemainder0) {
                  sna.d(-19057);
                }
              }
              if (decompiledFrameRemainder0) {
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              if (param0 != 64) {
                if (param0 == 65) {
                  var4Lifetime1 = qga.field_b.readUnsignedByte((byte) -110);
                  if (var3 != null) {
                    ((uca) (var3)).field_m.field_k = var4Lifetime1;
                    if (null == vqa.field_g) {
                      return;
                    }
                    VariableCondition.b(param1 ^ -86);
                  }
                  return;
                }
                if (param0 == 66) {
                  var4Lifetime1Lifetime1 = qga.field_b.readUnsignedByte((byte) -128);
                  if (var3 != null) {
                    ((uca) (var3)).field_B = var4Lifetime1Lifetime1;
                    if (null == vqa.field_g) {
                      return;
                    }
                    VariableCondition.b(-106);
                  }
                  return;
                }
                if (GetMpSandboxEnemySpawnLimit.a(-53, param0)) {
                  return;
                }
                if ((param0 == 11 ||
                  12 == param0) &&
                  (vqa.field_g != null &&
                  vqa.field_g.field_N &&
                  GetThrusterSmallForce.field_o)) {
                  GetNebulaFadesOutWhenClose.a(-118, fa.field_d[5]);
                }
                var5 = null;
                if (var3 != null) {
                  var5 = ((uca) (var3)).field_m.carouselInfo;
                }
                if (di.field_l.a(RequestNewestBlackboxRecording.field_p, qga.field_b, GetThrusterSmallForce.field_o, (byte) 7, param0, (CarouselCommongameInfo) (var5))) {
                  return;
                }
                this.e(97);
                return;
              }
              var4Lifetime2 = qga.field_b.readUnsignedByte((byte) -90);
              if (var3 != null &&
                !di.field_l.a(-28208)) {
                ((uca) (var3)).field_m.field_j = var4Lifetime2;
                return;
              }
              di.field_l.a(-29804, var4Lifetime2);
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            GetDebrisThrowable.a(false, "Start game packet");
            olb.d(991426348);
            vqa.field_g = null;
            ProxyAuthenticationException.field_a = null;
            var8 = SetPointDefenceLaserProjectileDamage.a(param0, di.field_l, qga.field_b, (byte) 120);
            var3Lifetime1 = var8;
            if (var8 != null) {
              mjb.field_e = false;
              GetSniperCannonProjectiles.field_p = false;
              if (param0 == 57) {
                vqa.field_g = (uca) (var3Lifetime1);
                GetThrusterSmallForce.field_o = true;
                sna.d(-19057);
                VariableCondition.b(-126);
                SetDebrisSurvives.e((byte) -76);
              } else {
                SetMissionTerrainDebrisProbability.field_p = true;
                ProxyAuthenticationException.field_a = var8;
              }
              SetMassDriverFireForce.field_o = false;
              wgb.field_f = -1;
              GetMessageFadetime.field_o = true;
            }
            return;
          }
        }

    }

    final void updateGameTick(int param0) {
        boolean stackIn_7_1 = false;
        boolean stackIn_27_1 = false;
        int stackIn_69_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_85_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        ea var7;
        int var3Lifetime1;
        int var3Lifetime2;
        var6 = field_G;
        ProxySocketConnector.field_f = SetPedrosRepairModeSwitchtime.a(32);
        GetCountermeasureLauncherEnergyUsed.field_o = gia.d(-2);
        SetReverbFeedback.e(200);
        if (psb.field_b != null &&
          psb.field_b.field_a) {
          VariableCondition.b((byte) 116);
          gva.a((byte) -115);
        }
        stackIn_7_1 = (psb.field_b != null);
        this.b(stackIn_7_1, 9);
        if (GetMissionTerrainDebrisProbability.field_o) {
          eu.field_i.b((byte) 1);
          GetMissionTerrainDebrisProbability.field_o = false;
        }
        var2 = -40 % ((23 - param0) / 61);
        SetMinimapWidth.field_o = SetMinimapWidth.field_o + 1;
        if (GetUseTriFill.a(51)) {
          fka.a("Servicing login...", (byte) -86);
          this.h(0);
          if (GetUseTriFill.a(119)) {
            return;
          }
        }
        if (!uob.field_e) {
          fka.a("Servicing login_create_ui...", (byte) -85);
          GetLagOut.a(GetPointDefenceLaserPulsetime.field_o, 15877);
          fka.a("Finished servicing login_create_ui...", (byte) -72);
          if (this.finishResourceLoading((byte) 125)) {
            uob.field_e = true;
          }
        } else {
          if (!Mission.b(-1)) {
            GetUseRectOutline.b(false);
            if (ar.field_d &&
              this.l(0) &&
              !uc.b(-116)) {
              wu.a(true, false);
            }
          } else {
            if (tjb.l(0)) {
              stackIn_27_1 = (psb.field_b != null);
              var3 = this.c(stackIn_27_1, -9288);
              if (1 == var3 ||
                var3 == 2) {
                if (psb.field_b != null) {
                  VariableCondition.b((byte) -56);
                }
                if (2 == var3) {
                  VoidHunters.quitToWebsite(MissionList.b((byte) -118), 4);
                }
              }
              this.d(true, -121);
            } else {
              if (!ffa.a(false)) {
                if (SetDebrisGroupColour.b(false)) {
                  this.d(true, -126);
                } else {
                  this.d(false, -124);
                }
              } else {
                if (wp.field_b == wp.field_a) {
                  var3 = vdb.d(-31515);
                  if (var3 == 1) {
                    kua.field_e = true;
                    ta.a((byte) -121, 0);
                  }
                  this.d(true, -127);
                } else {
                  this.d(false, -122);
                }
              }
            }
          }
        }
        di.field_l.a(RequestNewestBlackboxRecording.field_p, -114);
        if (!GetPhasedEnergyBeamPulsetime.e((byte) 111)) {
          while (true) {
            var7 = (ea) (SetGrapplingHookCooldown.field_o.removeFirst(true));
            if (var7 == null) {
              break;
            }
            SetLaserReload.a(4, var7, 0);
          }
        }
        while (GetSelfDestructTimer.a(0, ta.field_b)) {
          var3Lifetime1 = ow.field_a;
          this.handleServerPacket(var3Lifetime1, 12);
        }
        SetReverbWidth.a(0, -29008);
        if (GetSniperCannonProjectiles.field_p) {
        }
        if (null != di.field_l &&
          !GetThrusterSmallForce.field_o &&
          !SetMissionTerrainDebrisProbability.field_p &&
          di.field_l.field_m.c(0) <= 0) {
          di.field_l.a((byte) -110);
        }
        boolean decompiledFrameRemainder0 = true;
        if ((ssa.b(2) ||
          (vqa.field_g != null &&
          vqa.field_g.field_m.carouselInfo.field_k ||
          ProxyAuthenticationException.field_a != null &&
          ProxyAuthenticationException.field_a.field_m.carouselInfo.field_k) &&
          null != di.field_l &&
          null == di.field_l.field_j) && (wh.g(-114) &&
          SetMachineGunEnergyUsed.field_o[82] &&
          SetMachineGunEnergyUsed.field_o[35])) {
          stackIn_69_0 = 1;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_69_0 = 0;
        }
        var3Lifetime2 = stackIn_69_0;
        if (var3Lifetime2 != 0) {
          ifb.l(-118);
        }
        if (SetWeaponProjectileSpeedMultiply.b(true)) {
          di.field_l.c((byte) -94);
          var4 = this.f(109);
          if (var4 == 0 ||
            var4 == 1) {
            iwa.a((byte) -30, 2);
            GetSalvoDamageMultiplier.a(50, 4);
            GetReverbGain.a(6, (byte) -52);
            md.b(5, 0);
            GetReverbDry.a(-115);
            if (1 == var4) {
              if (vqa.field_g == null ||
                vqa.field_g.field_N) {
                SetMassDriverFireForce.field_o = true;
                lu.field_d = true;
              }
            } else {
              if (jkb.field_a) {
                aeb.field_a = true;
                enb.field_b = true;
                GetMessageFadetime.field_o = false;
                if (!GetThrusterSmallForce.field_o) {
                  stackIn_85_0 = (!bqa.a(false)) ? 0 : 7;
                  GetNebulaFadesOutWhenClose.a(stackIn_85_0, false, (byte) -85, 0);
                } else {
                  BodyInZoneCondition.field_c = GetMissilesDamageSourceTeam.field_o;
                  stackIn_81_0 = (bqa.a(false)) ? 7 : 0;
                  GetNebulaFadesOutWhenClose.a(stackIn_81_0, false, (byte) -85, 6);
                }
                olb.d(991426348);
                lo.field_a[GetArmageddonTimerStart.field_o].a(false, 320, 0);
                jkb.field_a = false;
                GetThrusterSmallForce.field_o = false;
                SetMissionTerrainDebrisProbability.field_p = false;
                lsb.a(true);
              }
              lu.field_d = false;
              SetMassDriverFireForce.field_o = false;
            }
          }
          var5 = 0;
          if (2 == var4) {
            var5 = 1;
          }
          if (var3Lifetime2 != 0) {
            var5 = 1;
          }
          if (jkb.field_a ||
            lu.field_d ||
            SetMassDriverFireForce.field_o) {
            var5 = 1;
          }
          if (!SetWeaponProjectileSpeedMultiply.b(true)) {
            var5 = 0;
          }
          if (var5 != 0) {
            km.f((byte) -119);
          }
        }
    }

    private final boolean l(int param0) {
        if (param0 != 0) {
          this.d(true, 48);
        }
        return SetUseExtraBackground.field_p;
    }

    private final void a(MidiChannelLevels param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = field_G;
        try {
          if (param1 != -19653) {
            this.field_D = -9;
          }
          if (this.field_C == -1) {
            for (var4_int = 0; param0.levels.length > var4_int; var4_int++) {
              uga.field_g.b(param0.levels[var4_int], (byte) 18, var4_int);
            }
          } else {
            uga.field_g.a((byte) -115, 4000, param0);
          }
          this.field_C = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("VoidHunters.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void initializeGame(boolean param0) {
        this.a(false, 110, 92);
        eu.field_i = new fcb();
        hbb var6 = new hbb();
        var6.a(128, (byte) 96, 9);
        GetThrusterParticleLife.field_o = new fdb();
        uga.field_g = new fdb(GetThrusterParticleLife.field_o);
        hbb var3 = new hbb();
        dra var4 = new dra(GetThrusterParticleLife.field_o, uga.field_g, var3);
        kr.a((byte) -32, true, SetTorpedoProjectiles.field_o, (java.awt.Component) ((Object) igb.field_a), var4, 22050);
        vfa var5 = new vfa(new iab());
        var5.field_i = 0;
        var5.field_b = false;
        SetMissionTimeLimit.a(var5, 20);
        uu.a((byte) 90, ta.field_b, (NetworkGameClient) (this));
        SetNebulaProximityFadeDownshift.a(114, param0, false);
        di.field_l = new kda();
        GetCountermeasureLauncherAimarc.e((byte) 117);
        this.applyShipCookie(false);
        fwa.field_g = new coa();
        fwa.field_g.a((byte) -65);
        SetUseTriFill.field_o = GameKeyHandler.b(-89);
        SetGrapplingHookMaxExtension8Force.field_o = tc.field_b;
        ncb.field_a = GetPointDefenceLaserAimspeed.field_o;
        if (ef.field_E) {
          GetGrapplingHooksDamageableBySourcePlayer.e((byte) -120);
          GetMissileLauncherProjectileLife.field_p = GetLagIn.a(GetMissileLauncherProjectileLife.field_p, 68, "graphics_quality");
          aw.a(false);
          nl.a(GetLagIn.a(kt.field_l, 93, "fx_volume"), -13205);
          re.a(GetLagIn.a(GetMutatorVotes.field_p, 21, "music_volume"), (byte) -99);
          GetMassDriverProjectiles.field_q = GetLagIn.a(GetMassDriverProjectiles.field_q, 36, "graphics_mode");
        }
    }

    public static void clearSharedReferences(int param0) {
        field_E = null;
        if (param0 != 0) {
          String var2 = (String) null;
          VoidHunters.a(-6, -55, -125, 73, (String) null, -128, true, true);
        }
    }

    private final void updateMusicSelection(byte param0) {
        int stackIn_5_0 = 0;
        int var2;
        int var3;
        uca var4;
        int var5;
        int var6_int;
        MidiChannelLevels var6;
        int var7;
        int var8;
        MidiChannelLevels var9;
        MidiChannelLevels var10;
        MidiChannelLevels var11;
        var7 = field_G;
        if (vqa.field_g == null &&
          null == ProxyAuthenticationException.field_a) {
          stackIn_5_0 = 0;
        } else {
          stackIn_5_0 = 1;
        }
        var2 = stackIn_5_0;
        var3 = 28 / ((-54 - param0) / 37);
        if (var2 != 0) {
          if (GetBurstFireMaxEnergy.field_p.field_n != uga.field_g &&
            this.field_B <= 0) {
            GetBurstFireMaxEnergy.field_p.a(-126, pab.field_k[1], 100, 1000000);
          }
          this.field_D = -1;
        } else {
          if (GetBurstFireMaxEnergy.field_p.field_n != GetThrusterParticleLife.field_o) {
            GetBurstFireMaxEnergy.field_p.a(-127, pab.field_k[0], 100, 1000000);
          }
          this.field_C = -1;
        }
        if (this.field_B > 0) {
          this.field_B = this.field_B - 1;
        }
        regionExit1: {
          if (var2 != 0) {
            if (wqa.a(false, GetArmageddonTimerStart.field_o)) {
              if (4 != this.field_C) {
                var9 = new MidiChannelLevels();
                var9.levels[0] = 255;
                this.a(var9, -19653, 4);
              }
            } else {
              var4 = vqa.field_g;
              if (var4 == null) {
                var4 = ProxyAuthenticationException.field_a;
              }
              if (var4 != null) {
                var5 = var4.k(-18620);
                if (var5 == 5) {
                  if (this.field_B <= 0) {
                    for (var6_int = 0; var6_int < 16; var6_int++) {
                      uga.field_g.b(0, (byte) 18, var6_int);
                    }
                    be.a(32, false, pab.field_k[2]);
                    this.field_B = 500;
                  }
                } else {
                  if (6 == var5 &&
                    this.field_B <= 0) {
                    for (var6_int = 0; var6_int < 16; var6_int++) {
                      uga.field_g.b(0, (byte) 18, var6_int);
                    }
                    be.a(32, false, pab.field_k[3]);
                    this.field_B = 500;
                  }
                }
                if (~var5 != ~this.field_C) {
                  var6 = new MidiChannelLevels();
                  if (0 == var5) {
                    var6.levels[0] = 255;
                    var6.levels[5] = 255;
                    var6.levels[8] = 255;
                    var6.levels[7] = 255;
                  } else {
                    switch (var5) {
                      case 1:
                        var6.levels[6] = 255;
                        var6.levels[7] = 255;
                        var6.levels[9] = 255;
                        var6.levels[10] = 255;
                        var6.levels[3] = 255;
                        var6.levels[0] = 255;
                        var6.levels[15] = 255;
                        var6.levels[8] = 255;
                        var6.levels[5] = 255;
                        break;
                      case 2:
                        var6.levels[14] = 255;
                        var6.levels[13] = 255;
                        var6.levels[15] = 255;
                        var6.levels[8] = 255;
                        var6.levels[11] = 255;
                        var6.levels[2] = 255;
                        var6.levels[12] = 255;
                        var6.levels[1] = 255;
                        break;
                      default:
                        this.a(var6, -19653, var5);
                        break regionExit1;
                      case 3:
                        var6.levels[4] = 255;
                        break;
                    }
                  }
                  this.a(var6, -19653, var5);
                }
              }
            }
          }
        }
        if (!wqa.a(false, GetArmageddonTimerStart.field_o)) {
          if (GetArmageddonTimerStart.field_o == -2 &&
            this.field_D != 1) {
            var11 = new MidiChannelLevels();
            var11.levels[14] = 255;
            this.a(-23134, var11, 1);
          }
        } else {
          if (var2 == 0 &&
            this.field_D != 0) {
            var10 = new MidiChannelLevels();
            var8 = 0;
            var5 = var8;
            while (var8 < var10.levels.length) {
              var10.levels[var8] = 255;
              var8++;
            }
            var10.levels[14] = 0;
            this.a(-23134, var10, 0);
          }
        }
    }

    final static void quitToWebsite(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              if (param1 != 4) {
                return;
              }
              param0.getAppletContext().showDocument(ne.a(var2, (byte) -89, param0), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("VoidHunters.T(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void clearClientResources(boolean param0) {
        VoidHunters.clearSharedReferences(0);
        abb.clearSharedReferences(4);
        BitmapFont.clearSharedReferences();
        kla.clearSharedReferences(89);
        bw.clearSharedReferences(9502);
        hb.a(15873);
        veb.a(1);
        oua.a(true);
        kda.b(66);
        fab.clearSharedReferences(10970);
        pa.clearSharedReferences(2);
        fdb.g(0);
        dra.clearSharedReferences(98);
        btb.clearSharedReferences((byte) 94);
        bda.clearSharedReferences(-12407);
        sh.clearSharedReferences((byte) 89);
        ot.a(param0);
        gob.clearSharedReferences(26986);
        tua.a(114);
        coa.a(true);
        ShipBlueprint.clearSharedReferences(0);
        GameKeyHandler.a(-106);
        NetworkGameClient.clearSharedReferences(false);
        ClientException.clearSharedReferences(127);
        bi.clearSharedReferences(-19766);
        MouseWheelInput.clearSharedReferences(-25692);
        dma.clearSharedReferences();
        asb.clearSharedReferences((byte) 112);
        PacketBuffer.clearSharedReferences(-38);
        wt.a(-101);
        tc.clearSharedReferences((byte) 40);
        kia.clearSharedReferences(3553);
        kmb.a(32768);
        wja.a(false);
        bsb.a(23870);
        dp.clearSharedReferences(8);
        lmb.clearSharedReferences((byte) -53);
        pgb.clearSharedReferences((byte) 75);
        nqa.clearSharedReferences((byte) -30);
        mab.a(-23483);
        wsb.b((byte) -108);
        ufb.clearSharedReferences(false);
        vfa.clearSharedReferences((byte) 120);
        wf.clearSharedReferences(3);
        uca.f(!param0 ? true : false);
        kc.a(-106);
        djb.clearSharedReferences((byte) -107);
        fcb.clearSharedReferences(111);
        dla.clearSharedReferences((byte) 101);
        mn.clearSharedReferences(-49);
        ShipComponent.clearSharedReferences(24388);
        iwa.a((byte) -116);
        igb.clearSharedReferences(0);
        ro.clearSharedReferences(-47);
        kma.clearSharedReferences(-58);
        GrappleLauncherBehaviour.clearSharedReferences((byte) 114);
        ThrusterBehaviour.b(-69);
        WeaponBehaviour.c(!param0 ? true : false);
        fra.a(2147483647);
        jb.clearSharedReferences(12472);
        uj.a((byte) -95);
        eqb.clearSharedReferences(65);
        es.a(param0);
        pd.clearSharedReferences((byte) 26);
        oma.a(28801);
        bea.clearSharedReferences(1);
        MissionCondition.clearSharedReferences((byte) -110);
        MissionControl.clearSharedReferences((byte) -98);
        MissionEvent.clearSharedReferences((byte) -76);
        MissionState.a(!param0 ? true : false);
        MissionVariable.clearSharedReferences((byte) -102);
        qsa.clearSharedReferences(30089);
        Asteroid.l(3);
        Debris.j((byte) -127);
        EscapePod.c(3);
        PartitionZone.a(true);
        fba.clearSharedReferences(117);
        Projectile.clearSharedReferences(-124);
        ResourceNode.clearSharedReferences(false);
        ShipAI.clearSharedReferences(false);
        World.clearSharedReferences(3);
        SettingsChange.a((byte) 61);
        SpawnChoice.a(32);
        SpecialOrderSubmessage.clearSharedReferences(-120);
        rj.clearSharedReferences();
        ncb.a(500);
        cib.a(-18013);
        llb.f(-2147483648);
        bv.a(39);
        hw.clearSharedReferences(-1);
        bfb.clearSharedReferences();
        aaa.clearSharedReferences((byte) 35);
        SettingsInstance.clearSharedReferences(17674);
        MissionList.clearSharedReferences(param0);
        qga.clearSharedReferences(114);
        qs.clearSharedReferences(true);
        joa.a(26936);
        qua.a(16606);
        sfa.clearSharedReferences(false);
        ara.clearSharedReferences(true);
        SetVariableLabelAction.clearSharedReferences(112);
        TickCondition.clearSharedReferences((byte) -44);
        tja.a(false);
        MessageLog.a(1);
        rgb.clearSharedReferences(true);
        ptb.clearSharedReferences((byte) 127);
        AdjustBodyComponentsAction.clearSharedReferences((byte) 94);
        AdjustVariableAction.a(true);
        AwardVictoryToTeamAction.clearSharedReferences(1);
        SetVariableAction.a((byte) 24);
        SetShipTeamAction.a((byte) 118);
        BodyCondition.clearSharedReferences(6970);
        BodyInZoneCondition.b(-15818);
        TeamNodeCondition.clearSharedReferences(-2684);
        ShipSpawnedCondition.b((byte) 11);
        ShipCondition.clearSharedReferences(-10570);
        VariableCondition.clearSharedReferences(-120);
        gda.c((byte) 18);
        lu.a((byte) 87);
        vra.a((byte) -66);
        kl.b(-127);
        AsteroidField.a((byte) 48);
        GrapplingHook.clearSharedReferences((byte) -116);
        rdb.clearSharedReferences(51200);
        rca.clearSharedReferences(12035);
        Hardpoint.a(64);
        kra.clearSharedReferences((byte) 70);
        pea.clearSharedReferences(true);
        sra.clearSharedReferences(96);
        ii.b(25498);
        bmb.clearSharedReferences((byte) -120);
        dqb.a(15060);
        tea.a(!param0 ? true : false);
        hbb.c(!param0 ? true : false);
        gnb.b((byte) 19);
        fkb.d(-25815);
        q.clearSharedReferences();
        ht.a(false);
        vka.clearSharedReferences();
        iab.clearSharedReferences(2);
        um.clearSharedReferences(100);
        lc.a(95);
        ssa.clearSharedReferences(2);
        pr.b(1);
        spb.clearSharedReferences(0);
        enb.clearSharedReferences((byte) 38);
        ae.e(-1);
        nl.a(2128263208);
        mba.clearSharedReferences((byte) 26);
        fgb.clearSharedReferences(8);
        cwa.clearSharedReferences((byte) 74);
        wia.a(9911);
        ida.clearSharedReferences((byte) -96);
        ud.clearSharedReferences(false);
        rq.clearSharedReferences(112);
        rla.clearSharedReferences((byte) 61);
        vla.clearSharedReferences(3);
        waa.clearSharedReferences((byte) 115);
        dj.clearSharedReferences((byte) -114);
        rbb.clearSharedReferences((byte) -29);
        kr.clearSharedReferences(-127);
        RemoveEventAction.clearSharedReferences(-125);
        qpa.clearSharedReferences(!param0 ? true : false);
        bc.a(-22113);
        gdb.clearSharedReferences(-73);
        lo.a(true);
        psb.a(false);
        oib.clearSharedReferences(124);
        vw.clearSharedReferences((byte) 55);
        wc.b(-20221);
        ona.clearSharedReferences(125);
        pfa.b(63);
        fwa.b(5);
        ppb.clearSharedReferences(37);
        pjb.e((byte) 22);
        aw.clearSharedReferences(0);
        wdb.e((byte) 127);
        hqb.a((byte) -106);
        lwa.clearSharedReferences(0);
        cna.clearSharedReferences(1);
        bs.a((byte) 42);
        ooa.clearSharedReferences(126);
        DualLinkNode.clearSharedReferences(-31049);
        qc.clearSharedReferences((byte) 78);
        ffb.clearSharedReferences(-106);
        kw.g((byte) 124);
        pia.clearSharedReferences(-89);
        bra.a(true);
        cd.a(5);
        ebb.a(23357);
        SpriteDimensions.a(!param0 ? true : false);
        mr.l((byte) -16);
        ija.clearSharedReferences(true);
        uc.clearSharedReferences(0);
        lm.clearSharedReferences(127);
        wk.clearSharedReferences((byte) 80);
        tjb.clearSharedReferences(85);
        jv.a((byte) -33);
        tgb.b((byte) -58);
        eua.clearSharedReferences(-128);
        feb.clearSharedReferences((byte) 122);
        alb.clearSharedReferences(6947);
        uv.clearSharedReferences(22089);
        uea.a((byte) -18);
        ei.clearSharedReferences(false);
        jba.clearSharedReferences(true);
        bob.clearSharedReferences(22540);
        shb.c((byte) 71);
        bl.i((byte) -17);
        ar.clearSharedReferences(54);
        hnb.clearSharedReferences(1);
        fm.a((byte) -114);
        iw.f(-27545);
        nva.clearSharedReferences(-104);
        htb.clearSharedReferences(124);
        dqa.clearSharedReferences(param0);
        oda.a(0);
        pwa.a(-126);
        whb.clearSharedReferences(-113);
        ub.clearSharedReferences((byte) 104);
        mo.clearSharedReferences((byte) 46);
        CarouselSlotStateDump.clearSharedReferences(32);
        umb.a(16214);
        pca.clearSharedReferences(9);
        hg.a(false);
        gtb.a((byte) -88);
        hp.a(false);
        fnb.a(-19);
        mia.a(-11954);
        PlayerVote.clearSharedReferences((byte) -98);
        sa.clearSharedReferences();
        ComponentBehaviour.b(0);
        TimedSpecialOrderBehaviour.a(126);
        uab.a(0);
        fca.clearSharedReferences();
        wma.clearSharedReferences(118);
        csa.clearSharedReferences((byte) 124);
        cjb.a(0);
        bd.clearSharedReferences((byte) -103);
        kea.clearSharedReferences(115);
        kca.clearSharedReferences((byte) 127);
        ps.clearSharedReferences(1);
        cv.clearSharedReferences();
        dha.clearSharedReferences(53);
        fia.clearSharedReferences((byte) -28);
        ota.clearSharedReferences();
        qd.clearSharedReferences((byte) 66);
        pfb.clearSharedReferences(118);
        bbb.clearSharedReferences(0);
        jw.a(false);
        SocketConnector.clearSharedReferences((byte) -109);
        ProxyAuthenticationException.clearSharedReferences(91);
        MissionGenerationData.a((byte) -125);
        TargetLock.clearSharedReferences(true);
        MapClearanceArea.a((byte) -128);
        RoundResult.clearSharedReferences((byte) -128);
        lh.clearSharedReferences(15261);
        TeamShipComponentCondition.b(-2404);
        ehb.a(false);
        ProceduralTexture.a(!param0 ? true : false);
        qeb.clearSharedReferences((byte) -122);
        tn.clearSharedReferences((byte) 110);
        bqa.clearSharedReferences((byte) 124);
        AwardVictoryToWinnerAction.clearSharedReferences(0);
        qw.clearSharedReferences(true);
        wh.h(0);
        km.g((byte) 114);
        jma.e(100);
        ga.clearSharedReferences((byte) -110);
        qda.clearSharedReferences();
        tga.j(88);
        uf.clearSharedReferences((byte) -128);
        ttb.d(16711935);
        kja.clearSharedReferences(-30);
        gm.clearSharedReferences(-2459);
        jla.clearSharedReferences(-125);
        eca.clearSharedReferences(-27183);
        reb.clearSharedReferences(false);
        w.i((byte) 77);
        ut.a(-72);
        cja.clearSharedReferences(-17719);
        ata.a(6344);
        fj.a(0);
        ita.clearSharedReferences((byte) 106);
        vq.clearSharedReferences((byte) -81);
        sha.f(1);
        nga.clearSharedReferences((byte) -126);
        SecondaryNodeDeque.clearSharedReferences(!param0 ? true : false);
        al.a(true);
        rlb.clearSharedReferences(-120);
        fbb.a(param0);
        kha.clearSharedReferences(1);
        mpb.clearSharedReferences(0);
        vf.a((byte) -26);
        tla.clearSharedReferences(1);
        rpa.clearSharedReferences(1);
        epb.clearSharedReferences(13);
        rtb.clearSharedReferences((byte) 81);
        GpuToolkit.clearSharedReferences((byte) -101);
        pb.a((byte) -84);
        mj.a(17);
        rga.clearSharedReferences((byte) 108);
        oj.b(108);
        kba.clearSharedReferences(17121);
        aba.a(-3696);
        atb.a(true);
        uda.b((byte) -96);
        as.clearSharedReferences(0);
        je.b((byte) 117);
        vmb.clearSharedReferences(8192);
        slb.clearSharedReferences((byte) 13);
        uja.a((byte) -123);
        jra.clearSharedReferences((byte) -125);
        OpenGlGpuToolkit.K(771);
        esb.e(-118);
        hma.clearSharedReferences(-1);
        re.clearSharedReferences(-2705);
        ef.clearSharedReferences(-100);
        tda.clearSharedReferences(29914);
        qh.clearSharedReferences((byte) -123);
        bk.e(80);
        vcb.clearSharedReferences((byte) -7);
        ta.clearSharedReferences((byte) -109);
        se.clearSharedReferences(-27982);
        ri.clearSharedReferences(41);
        ska.clearSharedReferences(5697);
        bna.a(!param0 ? true : false);
        ProxySocketConnector.clearSharedReferences(true);
        MonochromeRowCache.clearSharedReferences(15325);
        pja.clearSharedReferences(-1);
        wv.clearSharedReferences(65280);
        ul.clearSharedReferences(-23460);
        drb.clearSharedReferences((byte) -85);
        jwa.d(-122);
        jlb.clearSharedReferences(true);
        grb.e((byte) -72);
        owa.e((byte) 110);
        di.e((byte) 113);
        lq.d(262144);
        gw.clearSharedReferences(param0);
        vm.e((byte) 110);
        vn.clearSharedReferences(!param0 ? true : false);
        kbb.clearSharedReferences((byte) -117);
        me.clearSharedReferences(true);
        lnb.clearSharedReferences(1);
        hpb.d(-6200);
        qqa.clearSharedReferences((byte) -104);
        moa.clearSharedReferences(-120);
        cm.clearSharedReferences((byte) -118);
        md.a(false);
        koa.d(19);
        gia.a(false);
        rw.clearSharedReferences((byte) 86);
        elb.c((byte) 78);
        hk.clearSharedReferences(-1210841460);
        oqb.clearSharedReferences((byte) -123);
        hc.clearSharedReferences();
        SecondaryNodeDequeIterator.clearSharedReferences((byte) -101);
        lia.a(97);
        uva.clearSharedReferences();
        woa.clearSharedReferences(-16777216);
        cs.a((byte) 111);
        ImageProducerRasterBuffer.clearSharedReferences((byte) -128);
        r.e((byte) -123);
        ct.clearSharedReferences((byte) -96);
        mb.f((byte) -122);
        of.clearSharedReferences(8345);
        ob.c((byte) 42);
        nv.e(33);
        mea.clearSharedReferences(-95);
        qg.clearSharedReferences(-15081);
        jjb.clearSharedReferences(false);
        ne.clearSharedReferences(-2);
        uia.clearSharedReferences(-4353);
        gpa.clearSharedReferences(-92);
        im.clearSharedReferences((byte) 105);
        tob.clearSharedReferences(91);
        bt.clearSharedReferences(-4509);
        ArbProgram.clearSharedReferences(false);
        bkb.clearSharedReferences(26);
        oaa.clearSharedReferences(124);
        mnb.clearSharedReferences(117);
        dda.clearSharedReferences(0);
        uga.clearSharedReferences((byte) -9);
        iib.d(1);
        ku.a((byte) 108);
        uob.d(3168);
        ti.a(true);
        mw.d(13776);
        ts.clearSharedReferences((byte) 90);
        tu.clearSharedReferences((byte) 88);
        cba.b(!param0 ? true : false);
        gib.a(15);
        ko.clearSharedReferences(-35);
        mjb.a(-81);
        sv.e(0);
        wu.clearSharedReferences((byte) 46);
        hab.clearSharedReferences(-18951);
        bib.clearSharedReferences(param0);
        kt.clearSharedReferences((byte) -19);
        gna.b(false);
        vjb.b((byte) 53);
        ho.a(13032);
        ubb.clearSharedReferences((byte) 42);
        gn.clearSharedReferences(106);
        qva.a(6);
        rab.a(148);
        gla.a(-5709);
        fib.clearSharedReferences(-113);
        bva.clearSharedReferences(23008);
        tb.clearSharedReferences(-75);
        pl.clearSharedReferences((byte) -109);
        fk.clearSharedReferences((byte) 80);
        iob.clearSharedReferences(-5509);
        vhb.b(21053);
        hla.clearSharedReferences((byte) 39);
        asa.clearSharedReferences(20000000);
        ue.clearSharedReferences((byte) 124);
        sja.clearSharedReferences((byte) 120);
        qb.clearSharedReferences(111);
        MidiChannelLevels.clearSharedReferences((byte) -99);
        ccb.b((byte) 126);
        amb.clearSharedReferences(-46);
        gl.clearSharedReferences(0);
        vva.clearSharedReferences((byte) 121);
        meb.clearSharedReferences((byte) -52);
        kpb.c(17433);
        dw.clearSharedReferences(118);
        qpb.clearSharedReferences(!param0 ? true : false);
        kab.clearSharedReferences(777);
        qn.a(true);
        ifa.clearSharedReferences(95);
        vu.e((byte) 113);
        fa.clearSharedReferences((byte) 119);
        ujb.a((byte) -111);
        lw.clearSharedReferences(false);
        kob.clearSharedReferences(127);
        ConsoleCommand.clearSharedReferences(true);
        gva.clearSharedReferences(true);
        qab.b(0);
        kua.a(181765988);
        nfb.clearSharedReferences((byte) 120);
        etb.clearSharedReferences((byte) 43);
        pn.a(-30938);
        nfa.d(-3408);
        rea.clearSharedReferences(102);
        qsb.d(104);
        uw.clearSharedReferences(34037);
        lg.clearSharedReferences(108);
        nnb.b(false);
        pva.clearSharedReferences(109);
        fpa.d(110);
        hka.clearSharedReferences(0);
        fjb.clearSharedReferences(105);
        ecb.clearSharedReferences(95);
        wva.clearSharedReferences(-13);
        av.clearSharedReferences(false);
        dtb.clearSharedReferences((byte) 124);
        efb.clearSharedReferences((byte) -80);
        akb.clearSharedReferences((byte) 21);
        fpb.clearSharedReferences(62);
        deb.clearSharedReferences((byte) -125);
        wqb.clearSharedReferences((byte) 75);
        mna.clearSharedReferences((byte) 9);
        teb.clearSharedReferences(8192);
        fma.clearSharedReferences((byte) -22);
        rma.l(3);
        wca.l(-36);
        ira.l(17036);
        jeb.clearSharedReferences((byte) -81);
        ok.clearSharedReferences((byte) -103);
        ej.clearSharedReferences((byte) 124);
        gfb.clearSharedReferences((byte) 80);
        dkb.clearSharedReferences((byte) -120);
        jga.clearSharedReferences(-121);
        gs.b((byte) 120);
        gmb.a(-109);
        ng.a(false);
        ajb.c((byte) 44);
        ns.clearSharedReferences(102);
        ge.clearSharedReferences((byte) 122);
        eta.clearSharedReferences(126);
        mta.a(false);
        jdb.a(param0);
        cn.a(false);
        vfb.clearSharedReferences(92);
        hsb.b((byte) 27);
        bf.clearSharedReferences((byte) 27);
        nra.clearSharedReferences(2);
        wkb.a(-1);
        mbb.a(50);
        osb.a(1);
        eoa.clearSharedReferences(-18593);
        upb.b(50);
        pu.clearSharedReferences(124);
        sl.clearSharedReferences(-123);
        lhb.clearSharedReferences((byte) -116);
        lob.b((byte) 102);
        lka.a(8192);
        lsa.c((byte) -92);
        dfa.a((byte) 112);
        tpa.a(2);
        lp.b((byte) 43);
        nna.c(true);
        rg.clearSharedReferences(-117);
        us.clearSharedReferences((byte) 32);
        un.a(false);
        cfa.clearSharedReferences((byte) 83);
        ea.a(10);
        nj.a(false);
        br.a(true);
        t.a(1);
        vv.b(24358);
        pbb.a(-652030847);
        nrb.a(11227);
        bpa.a((byte) 68);
        tia.clearSharedReferences(-102);
        jja.clearSharedReferences((byte) -110);
        uu.clearSharedReferences(-19);
        npa.clearSharedReferences(true);
        nf.clearSharedReferences(27167);
        ci.clearSharedReferences(-5254);
        kgb.a(0);
        nma.b((byte) -4);
        Lo.clearSharedReferences(301);
        SetLagVariant.clearSharedReferences(125);
        GetLagStandardDeviationIn.b(true);
        GetLagStandardDeviationOut.a(-2);
        LoadSettings.clearSharedReferences((byte) -100);
        LoadBlackboxRecording.e(0);
        RequestNewestBlackboxRecording.clearSharedReferences(false);
        SetCarouselConstant.clearSharedReferences((byte) -105);
        GetLoadingMissions.a(1);
        SetTrapMouse.clearSharedReferences(false);
        GetTabForScores.a(-9028);
        SetTabForScores.b(false);
        GetToggledScoreboard.clearSharedReferences(false);
        SetToggledScoreboard.clearSharedReferences((byte) 124);
        GetDebrisGroupColour.a(23969);
        SetDebrisGroupColour.a(7311);
        SetShipDirectionArrow.clearSharedReferences(0);
        SetShipAimLines.clearSharedReferences(-1);
        GetAllowShipSaving.clearSharedReferences(105);
        SetUseOffscreenRendering.clearSharedReferences(-2326);
        GetUseCircleFill.a(2);
        SetUseCircleFill.clearSharedReferences(0);
        GetUseCircleOutline.e((byte) -47);
        SetUseCircleOutline.e((byte) 74);
        GetUseLines.clearSharedReferences(0);
        SetUseLines.a(10);
        GetUseRectFill.clearSharedReferences(25837);
        SetUseRectFill.clearSharedReferences((byte) -5);
        GetUseTriFill.clearSharedReferences((byte) -125);
        SetUseTriFill.clearSharedReferences(100);
        GetUsePolygonFill.clearSharedReferences(9141);
        SetShowTutorial.clearSharedReferences(0);
        GetFps.clearSharedReferences(30465);
        GetRadialMenuRadius.a(0);
        GetMinimapWidth.e((byte) -93);
        GetMinimapHeight.e((byte) 89);
        SetMinimapHeight.clearSharedReferences(param0);
        GetHealthBarWidth.a(27358);
        SetHealthBarHeight.clearSharedReferences(0);
        GetReloadBarWidth.a(1);
        SetReloadBarWidth.clearSharedReferences((byte) -31);
        GetReloadBarHeight.clearSharedReferences(123);
        SetReloadBarHeight.clearSharedReferences(!param0 ? true : false);
        GetSpecialOrderBarX.e((byte) -115);
        SetSpecialOrderBarX.clearSharedReferences((byte) 4);
        GetSpecialOrderBoxHeight.b(false);
        SetSpecialOrderBoxHeight.clearSharedReferences(0);
        GetMissionVariablesHudX.a(18841);
        SetMissionVariablesHudX.clearSharedReferences(2);
        GetMissionVariablesHudY.clearSharedReferences(16224);
        GetAudioRangeCutoff.clearSharedReferences((byte) 98);
        SetAudioRangeCutoff.b(param0);
        GetReverbGain.clearSharedReferences(34);
        SetReverbFeedback.clearSharedReferences(200);
        GetReverbDamp.e((byte) 121);
        SetReverbDamp.clearSharedReferences((byte) -7);
        GetReverbWet.a(-23714);
        SetReverbWet.e((byte) 124);
        GetReverbWidth.clearSharedReferences(9839);
        GetBlueprintSaveTime.a(-21447);
        SetBlueprintSaveTime.a(0);
        GetMessageMaxage.clearSharedReferences((byte) -71);
        SetMessageFadetime.e((byte) 32);
        GetMessageMax.clearSharedReferences(-122);
        SetMessageMax.clearSharedReferences(0);
        GetOndamageParticleSpeed.clearSharedReferences(30388);
        SetOndamageParticleSpeed.a(2051507073);
        GetOndamageParticleLife.clearSharedReferences(-92);
        SetOndamageParticleLife.clearSharedReferences(-1);
        SetShieldsDirectionalHalfarcCuts.clearSharedReferences(-118);
        GetShieldsDirectionalArcParticleLife.clearSharedReferences(-23822);
        SetShieldsDirectionalArcParticleLife.clearSharedReferences(0);
        GetShieldsDirectionalArcParticleSpeedDownshift.clearSharedReferences((byte) -31);
        SetShieldsDirectionalArcParticleSpeedDownshift.a(-32514);
        SetAutoAfkTimeout.a(0);
        GetBuildViewAutozoomEndOnAction.e(53562);
        GetNumStars.clearSharedReferences(95);
        SetNumStars.clearSharedReferences((byte) 84);
        GetUseSprites.a(-91);
        SetUseBackground.clearSharedReferences(118);
        GetUseBackgroundInFullscreen.clearSharedReferences((byte) -29);
        SetUseBackgroundInFullscreen.a(0);
        SetUseExtraBackground.a(0);
        GetUseNiceTrails.clearSharedReferences(106);
        GetDebugLineLife.a(25553);
        SetDebugLineLife.clearSharedReferences((byte) 116);
        GetUseFilledPolygons.clearSharedReferences((byte) 49);
        SetUseDetailLines.clearSharedReferences(0);
        GetBloomThresholdPercentage.a(96);
        SetBloomThresholdPercentage.clearSharedReferences(false);
        GetBloomCoefficientPercentage.a(256);
        SetBloomCoefficientPercentage.e((byte) 107);
        GetAutozoomSpeedDivide.e((byte) -15);
        SetAutozoomSpeedDivide.clearSharedReferences(101);
        GetAutozoomAmountMultiply.clearSharedReferences(-105);
        SetAutozoomAmountMultiply.clearSharedReferences(-122);
        GetNebulaProximityFadeDownshift.clearSharedReferences(param0);
        GetUseTrails.e((byte) 63);
        SetUseTrails.clearSharedReferences((byte) 103);
        GetShipToShipRamDamage.clearSharedReferences(2);
        SetShipToShipRamDamage.a(-128);
        GetTeamSelectionSpeedup.e(3575);
        SetTeamSelectionSpeedup.clearSharedReferences((byte) -66);
        GetWaitForPlayers.e((byte) 40);
        SetWaitForPlayers.clearSharedReferences((byte) -20);
        GetKeepTeamColours.clearSharedReferences(22829);
        SetKeepTeamColours.b(false);
        SetDebrisCollision.clearSharedReferences((byte) -128);
        GetDebrisPartitioned.b(false);
        GetDebrisCollisionDamage.clearSharedReferences((byte) -91);
        GetDebrisThrowable.e((byte) -115);
        GetMissilesHitSourceTeam.e((byte) 123);
        SetMissilesHitSourceTeam.b(false);
        GetMissilesDamageSourceTeam.clearSharedReferences(111);
        SetMissilesDamageSourceTeam.clearSharedReferences(0);
        GetGrapplingHooksDamageableBySourcePlayer.e(1);
        SetThrusterBindingMoveAndTurnHasOppositeMove.f((byte) -96);
        SetNebulaFadesOutWhenClose.a(2);
        GetDebrisFoundInPairs.clearSharedReferences((byte) -114);
        SetDebrisFoundInPairs.e((byte) 32);
        SetFogOfWarOn.f((byte) -104);
        SetUseModels.e((byte) -57);
        GetInnateThrusters.a(0);
        SetInnateThrusters.a(21);
        SetThrusterAutobalancing.a(-21968);
        SetBots.b(true);
        GetDetachmentMode.a(124);
        GetAutoaim.clearSharedReferences((byte) -115);
        GetSalvoaim.a(87);
        SetSalvoaim.b(false);
        GetFixedaim.e((byte) -70);
        SetFixedaim.e((byte) -49);
        GetSalvoUsesAllEnergy.clearSharedReferences(44);
        SetSalvoUsesAllEnergy.clearSharedReferences(0);
        GetSalvoHoldable.a(-1721);
        SetSalvoHoldable.e((byte) -127);
        GetPedrosRepairMode.e((byte) -50);
        SetPedrosRepairMode.e((byte) 53);
        GetShipPersistence.a(33);
        SetShipPersistence.a(-125);
        GetDebrisCarryOver.a(68);
        SetDebrisCarryOver.a(0);
        GetDebrisCarryOverPercentage.clearSharedReferences(-51);
        SetDebrisCarryOverPercentage.e((byte) -119);
        SetDebrisSurvives.e(0);
        SetClientSideDragging.a(37);
        GetSalvoDamageMultiplier.clearSharedReferences((byte) -119);
        SetSalvoDamageMultiplier.clearSharedReferences(-126);
        SetSalvoRepairTimeMultiplier.clearSharedReferences(-1);
        GetMpSandboxEnemySpawnLimit.clearSharedReferences((byte) 32);
        SetMpSandboxEnemySpawnLimit.a(-23436);
        GetMaxShipSize.a(-100);
        GetFightersPerPlayerMaximum.a(42);
        GetBurstFireMaxEnergy.clearSharedReferences(param0);
        SetBurstFireMaxEnergy.clearSharedReferences((byte) 7);
        SetShipSpawnInvulnerabilityTime.clearSharedReferences(46);
        GetFogOfWarSensorRange.e((byte) -114);
        SetFogOfWarSensorRange.a(122);
        GetThrusterBindingBalanceThreshold.clearSharedReferences((byte) 87);
        SetThrusterBindingBalanceThreshold.clearSharedReferences((byte) 76);
        GetComponentBreakingExplosionForceMultiplier.clearSharedReferences(3);
        SetPhysicsCollisionForceMultiplier.clearSharedReferences(124);
        SetPhysicsCollisionGrapplingHookForceMultiplier.e((byte) 123);
        GetPhysicsCollisionPhantomForceMultiplier.clearSharedReferences(51);
        SetPhysicsCollisionPhantomForceMultiplier.clearSharedReferences(124);
        GetDebrisDetachmentForceMultiplier.b(true);
        GetGrappleDebris.a(54);
        SetGrappleDebris.e((byte) 56);
        GetDebrisGrabbingRange.clearSharedReferences(55);
        SetDebrisGrabbingRange.clearSharedReferences((byte) 112);
        GetDebrisMax.clearSharedReferences((byte) -61);
        GetMissionVotes.clearSharedReferences((byte) -127);
        SetMissionVotes.clearSharedReferences(-78);
        GetMutatorVotes.e((byte) 95);
        SetMutatorVotes.clearSharedReferences(122);
        GetMissionTimeLimit.clearSharedReferences(-75);
        SetArmageddonTimerStart.e((byte) 126);
        SetArmageddonWarning.b(true);
        GetArmageddonLength.f((byte) 66);
        SetArmageddonLength.clearSharedReferences((byte) -41);
        GetMissionTerrainAsteroidProbability.e((byte) -117);
        GetMissionTerrainDebrisProbability.clearSharedReferences(true);
        SetMissionTerrainDebrisProbability.clearSharedReferences(12124934);
        GetMissionTerrainSpaceProbability.clearSharedReferences(!param0 ? true : false);
        GetMissionTerrainVotingChancestep.b(true);
        GetMissionDebrisDefaultProbability.clearSharedReferences(!param0 ? true : false);
        SetMissionDebrisDefaultProbability.a(-10441);
        GetMissionDebrisVotingChancestep.a(69);
        SetMissionDebrisVotingChancestep.clearSharedReferences((byte) 112);
        SetResourceNodeCaptureTime.clearSharedReferences(70);
        GetMissionResnetResourceTickTime.a(-124);
        SetMassDriverRandomness.b(true);
        GetLaserRandomness.a(-26081);
        SetLaserRandomness.b(!param0 ? true : false);
        GetBombletSprayRandomness.clearSharedReferences(-15435);
        SetBombletSprayRandomness.a(-612363640);
        GetPhasedEnergyBeamRandomness.clearSharedReferences(76);
        SetPhasedEnergyBeamRandomness.a(23518);
        GetSniperCannonRandomness.clearSharedReferences(-27645);
        SetSniperCannonRandomness.e((byte) 42);
        GetMissileLauncherRandomness.a(32);
        SetMissileLauncherRandomness.clearSharedReferences(122);
        GetPointDefenceLaserRandomness.clearSharedReferences(true);
        SetPointDefenceLaserRandomness.clearSharedReferences(6);
        GetCountermeasureLauncherRandomness.a(80);
        SetCountermeasureLauncherRandomness.a(1511754497);
        GetMassDriverProjectiles.clearSharedReferences(-110);
        GetLaserProjectiles.a(32);
        SetLaserProjectiles.clearSharedReferences((byte) -96);
        GetBombletSprayProjectiles.b(true);
        SetBombletSprayProjectiles.clearSharedReferences((byte) -27);
        SetPhasedEnergyBeamProjectiles.a(-60);
        GetTorpedoProjectiles.a(85);
        SetTorpedoProjectiles.clearSharedReferences(-28228);
        GetSniperCannonProjectiles.e((byte) -119);
        SetSniperCannonProjectiles.clearSharedReferences((byte) -8);
        SetMissileLauncherProjectiles.clearSharedReferences(27154);
        GetPointDefenceLaserProjectiles.clearSharedReferences(0);
        SetPointDefenceLaserProjectiles.clearSharedReferences(88);
        SetCountermeasureLauncherProjectiles.clearSharedReferences(89);
        GetMassDriverProjectileLife.clearSharedReferences(21584);
        SetMassDriverProjectileLife.clearSharedReferences((byte) 127);
        SetTorpedoProjectileLife.clearSharedReferences((byte) 102);
        GetBombletSprayProjectileLife.a(92);
        SetBombletSprayProjectileLife.e((byte) -115);
        GetSniperCannonProjectileLife.a(4);
        SetSniperCannonProjectileLife.clearSharedReferences((byte) -87);
        GetMissileLauncherProjectileLife.clearSharedReferences((byte) 127);
        SetMissileLauncherProjectileLife.a(6425);
        GetCountermeasureLauncherProjectileLife.a(-87);
        SetDefaultFiringLeeway.b(!param0 ? true : false);
        SetSniperCannonFiringLeeway.clearSharedReferences((byte) -97);
        GetMassDriverFireForce.clearSharedReferences(127);
        SetMassDriverFireForce.clearSharedReferences((byte) 106);
        SetTorpedoFireForce.b(false);
        GetBombletSprayFireForce.e((byte) -91);
        GetPhasedEnergyBeamFireForce.a(617169759);
        SetMachineGunFireForce.clearSharedReferences(0);
        SetSniperCannonFireForce.a(-114);
        SetMissileLauncherFireForce.a(-17297);
        SetPointDefenceLaserFireForce.clearSharedReferences(1600);
        SetCountermeasureLauncherFireForce.a(107);
        GetMassDriverReload.clearSharedReferences(true);
        SetMassDriverReload.e(-20005);
        GetTorpedoReload.clearSharedReferences(194);
        SetTorpedoReload.a(109);
        GetLaserReload.clearSharedReferences((byte) 119);
        GetBombletSprayReload.a(-20626);
        SetBombletSprayReload.clearSharedReferences(0);
        GetPhasedEnergyBeamReload.clearSharedReferences(-100);
        SetPhasedEnergyBeamReload.e((byte) 101);
        SetMachineGunReload.clearSharedReferences((byte) -16);
        GetSniperCannonReload.clearSharedReferences(-1);
        GetFighterBayReload.a(16086);
        GetPointDefenceLaserReload.a(116);
        GetMassDriverAimspeed.a(117);
        GetTorpedoAimspeed.clearSharedReferences((byte) 57);
        GetLaserAimspeed.e(117);
        GetFighterBayAimspeed.clearSharedReferences((byte) 99);
        SetFighterBayAimspeed.clearSharedReferences((byte) 65);
        GetSpinningBladeAimspeed.e((byte) -125);
        GetSniperCannonAimspeed.a(100);
        GetBombletSprayAimspeed.clearSharedReferences((byte) 71);
        SetBombletSprayAimspeed.clearSharedReferences(15110);
        GetPhasedEnergyBeamAimspeed.clearSharedReferences(-29417);
        SetPhasedEnergyBeamAimspeed.a(0);
        GetMachineGunAimspeed.clearSharedReferences(125);
        SetMachineGunAimspeed.e((byte) -78);
        GetGrapplingHookAimspeed.a(-1);
        GetMissileLauncherAimspeed.a(127);
        SetMissileLauncherAimspeed.e((byte) 53);
        GetPointDefenceLaserAimspeed.a(-120);
        SetCountermeasureLauncherAimspeed.clearSharedReferences(-52);
        SetMassDriverAimarc.clearSharedReferences((byte) -25);
        GetTorpedoAimarc.clearSharedReferences((byte) 108);
        SetTorpedoAimarc.a(63);
        GetLaserAimarc.e((byte) -116);
        SetLaserAimarc.clearSharedReferences((byte) -80);
        GetFighterBayAimarc.clearSharedReferences(69);
        GetSpinningBladeAimarc.clearSharedReferences((byte) 92);
        SetSniperCannonAimarc.clearSharedReferences((byte) -99);
        GetBombletSprayAimarc.clearSharedReferences(-1);
        SetBombletSprayAimarc.clearSharedReferences((byte) -80);
        GetPhasedEnergyBeamAimarc.a(16);
        GetMachineGunAimarc.a(-116);
        SetMachineGunAimarc.clearSharedReferences(14675);
        SetGrapplingHookAimarc.clearSharedReferences(0);
        GetPointDefenceLaserAimarc.clearSharedReferences((byte) 21);
        SetPointDefenceLaserAimarc.clearSharedReferences((byte) 107);
        SetCountermeasureLauncherAimarc.clearSharedReferences(-92);
        GetMassDriverProjectileDamage.b(!param0 ? true : false);
        SetMassDriverProjectileDamage.a(9099);
        GetTorpedoProjectileDamage.a(-124);
        SetTorpedoProjectileDamage.a(0);
        GetLaserBeamProjectileDamage.a(7848);
        GetMachineGunProjectileDamage.clearSharedReferences(0);
        SetMachineGunProjectileDamage.a(146);
        SetSniperCannonProjectileDamage.clearSharedReferences((byte) 97);
        GetBombletSprayProjectileDamage.e((byte) -102);
        SetBombletSprayProjectileDamage.clearSharedReferences((byte) -102);
        SetExplosionProjectileDamage.a(-123);
        GetPointDefenceLaserProjectileDamage.clearSharedReferences((byte) -127);
        GetPointDefenceLaserProjectileInterceptDamage.a(0);
        SetPointDefenceLaserProjectileInterceptDamage.a(-982);
        GetMassDriverProjectileOndamageParticles.clearSharedReferences(-59);
        SetTorpedoProjectileOndamageParticles.clearSharedReferences(153);
        SetPhasedEnergyBeamProjectileOndamageParticles.clearSharedReferences(-2573);
        GetSniperCannonProjectileOndamageParticles.e((byte) 15);
        SetSniperCannonProjectileOndamageParticles.a(-17548);
        SetBombletSprayProjectileOndamageParticles.clearSharedReferences(76);
        SetPointDefenceLaserProjectileOndamageParticles.clearSharedReferences(0);
        GetMassDriverEnergyUsed.clearSharedReferences((byte) 118);
        SetMassDriverEnergyUsed.b(!param0 ? true : false);
        GetLaserEnergyUsed.a(0);
        SetLaserEnergyUsed.clearSharedReferences((byte) 92);
        GetBombletSprayEnergyUsed.clearSharedReferences((byte) 62);
        SetPhasedEnergyBeamEnergyUsed.clearSharedReferences(163);
        GetMachineGunEnergyUsed.b(false);
        SetMachineGunEnergyUsed.b(!param0 ? true : false);
        GetSniperCannonEnergyUsed.clearSharedReferences(118);
        SetSniperCannonEnergyUsed.e((byte) -113);
        GetMissileLauncherEnergyUsed.clearSharedReferences(-10515);
        SetMissileLauncherEnergyUsed.clearSharedReferences(-17);
        GetCountermeasureLauncherEnergyUsed.b(false);
        SetCountermeasureLauncherEnergyUsed.e((byte) 28);
        GetPointDefenceLaserEnergyUsed.clearSharedReferences(12992);
        SetPointDefenceLaserEnergyUsed.e((byte) -99);
        GetTorpedoAcceleration.clearSharedReferences(0);
        SetTorpedoAcceleration.clearSharedReferences(169);
        SetVelocitySustain.clearSharedReferences(-107);
        GetAngularVelocitySustain.clearSharedReferences((byte) 83);
        SetAngularVelocitySustain.a(-25544);
        GetThrusterParticleSpeedDownshift.clearSharedReferences(176);
        SetThrusterParticleSpeedDownshift.clearSharedReferences((byte) 84);
        GetThrusterParticleLife.clearSharedReferences(177);
        SetThrusterParticleLife.clearSharedReferences(127);
        GetAngularForceDownshift.clearSharedReferences(64);
        SetAngularForceDownshift.e((byte) -118);
        GetAngularVelocitySustainMax.clearSharedReferences(0);
        GetTorqueDownshift.a(2);
        GetMomentOfInertiaPredivideDownshift.clearSharedReferences((byte) 126);
        SetMomentOfInertiaPredivideDownshift.clearSharedReferences((byte) 69);
        GetMomentOfInertiaPerpointCalcDownshift.clearSharedReferences(0);
        SetMomentOfInertiaPerpointCalcDownshift.a(113);
        GetSpinningBladeTopSpeed.a(-120);
        SetSpinningBladeTopSpeed.clearSharedReferences(-19013);
        SetSpinningBladeSpinupSpeed.a(21942);
        GetSpinningBladeSpindamageMultiplier.b(false);
        SetSpinningBladeSpindamageMultiplier.clearSharedReferences((byte) -122);
        GetPhasedEnergyBeamPulsetime.clearSharedReferences((byte) 51);
        SetPhasedEnergyBeamPulsetime.clearSharedReferences((byte) -71);
        GetPhasedEnergyBeamPulseFadetime.e((byte) 65);
        GetMachineGunPulsetime.clearSharedReferences((byte) -28);
        SetMachineGunPulsetime.clearSharedReferences(-105);
        GetBombletSprayPushMultiplier.clearSharedReferences(-122);
        SetBombletSprayPushMultiplier.e(0);
        GetExplosionPushMultiplier.clearSharedReferences(80);
        SetExplosionPushMultiplier.e((byte) -89);
        GetAiFiringRangeUpshift.e((byte) -118);
        SetAiFiringRangeUpshift.clearSharedReferences(26468);
        GetWorldWidthUpshift.clearSharedReferences(193);
        GetWeaponParticleSpeedDownshift.clearSharedReferences(-33);
        SetWeaponParticleSpeedDownshift.clearSharedReferences(7069);
        GetWeaponProjectileSpeedMultiply.f((byte) -125);
        SetWeaponProjectileSpeedMultiply.a(0);
        SetRespawnTime.clearSharedReferences(67);
        SetGrapplingHookMaxLength.clearSharedReferences((byte) -52);
        GetGrapplingHookFireForce.clearSharedReferences(0);
        SetGrapplingHookFireForce.clearSharedReferences((byte) 57);
        GetGrapplingHookSpringConstant.b(true);
        SetGrapplingHookSpringConstant.clearSharedReferences(200);
        SetGrapplingHookMaxExtension8Force.clearSharedReferences(17231);
        GetGrapplingHookCooldown.a(-120);
        SetGrapplingHookCooldown.clearSharedReferences((byte) -63);
        GetGrapplingHookRopeChangeRate.a(-14010);
        GetGrapplingHookRopeBreakLength.clearSharedReferences(204);
        SetGrapplingHookRopeBreakLength.a(235);
        GetMissilesCooldown.clearSharedReferences(124);
        GetMissilesExplosionPower.a(3);
        SetMissilesExplosionPower.clearSharedReferences(0);
        SetMissilesAcceleration.clearSharedReferences(207);
        SetMissilesTopSpeed.clearSharedReferences((byte) -90);
        GetShieldsToggleCooldown.clearSharedReferences((byte) 123);
        SetShieldsDirectionalIdleEnergyUsage.clearSharedReferences((byte) 0);
        GetShieldsDirectionalArc.a(-29044);
        SetShieldsDirectionalArc.clearSharedReferences((byte) 121);
        GetShieldsDamageEnergyConversion.clearSharedReferences((byte) -101);
        SetShieldsDamageEnergyConversion.clearSharedReferences(-126);
        GetRepairModeCooldown.e((byte) 91);
        GetRepairModeActiveTime.clearSharedReferences(215);
        GetRepairModeRadius.clearSharedReferences(-99);
        SetRepairModeRadius.clearSharedReferences(-105);
        GetRepairModePower.b(false);
        SetRepairModePower.clearSharedReferences((byte) -33);
        GetBoostersCooldown.clearSharedReferences((byte) -121);
        GetBoostersActiveTime.clearSharedReferences((byte) 84);
        SetCountermeasuresPulsetime.a(-123);
        GetCountermeasuresCooldown.a(221);
        SetCountermeasuresCooldown.clearSharedReferences(0);
        GetCountermeasuresPulseRadius.a(16407);
        SetCountermeasuresPulseRadius.a(-27266);
        GetSelfDestructTimer.a(225);
        SetSelfDestructTimer.a(-26016);
        GetPlayerRepairTime.clearSharedReferences(8);
        SetPlayerRepairTime.clearSharedReferences(14055);
        GetPlayerRepairAmount.a(103);
        SetPlayerRepairAmount.clearSharedReferences(-128);
        GetAiRepairTime.clearSharedReferences(46);
        SetFighterRepairTime.clearSharedReferences(0);
        GetFighterRepairAmount.clearSharedReferences((byte) -106);
        SetFighterRepairAmount.e((byte) -15);
        GetReadyRoomMissionTime.a(232);
        GetReadyRoomMutatorTime.e((byte) 49);
        SetReadyRoomMutatorTime.clearSharedReferences(233);
        GetReadyRoomTeamTime.clearSharedReferences((byte) 91);
        bab.a(true);
        fob.a(75);
        rc.clearSharedReferences(540800);
        vlb.clearSharedReferences(-104);
        ada.clearSharedReferences(-1);
        wga.clearSharedReferences(-1);
        uk.c((byte) 67);
        tib.f(6312);
        ocb.clearSharedReferences((byte) 126);
        rm.clearSharedReferences(2);
        wgb.f(68);
        vqa.clearSharedReferences(1);
        oe.clearSharedReferences((byte) 94);
        hob.clearSharedReferences((byte) -63);
        sc.c(123);
        ola.b(2);
        glb.b(-17471);
        rv.a(-1);
        vib.clearSharedReferences(84);
        bca.clearSharedReferences(-115);
        pab.clearSharedReferences(false);
        ev.a(28378);
        eu.clearSharedReferences(30826);
        cp.clearSharedReferences((byte) -127);
        dib.a((byte) 89);
        lkb.clearSharedReferences(199);
        mmb.a(2);
        dgb.clearSharedReferences(false);
        this.field_F = null;
        this.host = null;
    }

    private final boolean finishResourceLoading(byte param0) {
        int var2 = 0;
        int var3 = field_G;
        int var2Lifetime1;
        mab.field_a = this;
        if (!eu.field_i.a((byte) 68)) {
          return false;
        }
        fka.a("Initing menus", (byte) -62);
        csa.b((byte) -111);
        for (var2 = 0; var2 < 10; var2++) {
          lo.field_a[var2] = new wf(var2);
        }
        wgb.field_f = 0;
        GetArmageddonTimerStart.field_o = 0;
        gib.a(-106, 50);
        fka.a("Playing music", (byte) -101);
        hb.a(pab.field_k[0], (byte) -114);
        if (param0 <= 124) {
          Object var4 = (Object) null;
          VoidHunters.checkDuplicateReference(true, (Object) null);
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 16; var2Lifetime1++) {
          GetThrusterParticleLife.field_o.b(0, (byte) 18, var2Lifetime1);
        }
        wgb.a(SetMissileLauncherEnergyUsed.field_p, GetMissileLauncherProjectiles.field_o, qaa.field_a, -131, qua.field_b, nl.field_n, oma.field_i);
        fka.a("Initing audiohandler", (byte) -64);
        qn.c((byte) 89);
        fkb.a(2096);
        fka.a("Finished loadloop", (byte) -128);
        if (this.l(0) &&
          GetPhasedEnergyBeamPulsetime.e((byte) 116)) {
          wu.a(true, false);
        }
        return true;
    }

    final void shutdownGame(int param0) {
        GetBurstFireRegenerationRate.b(false);
        if (null != psb.field_b) {
          VariableCondition.b((byte) 86);
        }
        SecondaryNodeDequeIterator.a(1);
        if (param0 >= -102) {
          VoidHunters.b(63, 91);
        }
    }

    private final void d(boolean param0, int param1) {
        int fieldTemp$0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_32_0 = 0;
        uca stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        boolean stackIn_44_2 = false;
        boolean stackIn_48_0 = false;
        int stackIn_59_0 = 0;
        IsaacPacketBuffer stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        int stackIn_119_2 = 0;
        boolean stackIn_133_0 = false;
        int stackIn_200_0 = 0;
        boolean stackOut_47_0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int[] var11;
        int[] var12;
        int var7Lifetime1;
        int var8Lifetime1;
        int stackIn_59_0Lifetime1;
        boolean stackIn_133_0Lifetime1;
        int var7Lifetime2;
        var10 = field_G;
        if (ssa.b(2)) {
          wgb.a(SetMissileLauncherEnergyUsed.field_p, GetMissileLauncherProjectiles.field_o, qaa.field_a, -131, qua.field_b, nl.field_n, oma.field_i);
          if (SetMachineGunEnergyUsed.field_o[81] &&
            SetMachineGunEnergyUsed.field_o[102]) {
            SetInnateThrusters.a(0, new int[]{4});
          }
        }
        if (GetBuildViewAutozoomEndOnAction.a(61848) &&
          GetArmageddonTimerStart.field_o == 0 &&
          0 == wgb.field_f) {
          GetDebrisThrowable.a(false, "Cookie ship found, so starting game");
          stackIn_10_0 = (bqa.a(false)) ? 7 : 0;
          GetNebulaFadesOutWhenClose.a(stackIn_10_0, false, (byte) -85, -3);
        }
        if (wp.field_b != wp.field_a) {
          if (~wp.field_a == ~SetBombletSprayEnergyUsed.field_o) {
            hn.field_a = hn.field_a + 1;
            if (16 == hn.field_a) {
              if (!hpb.field_i) {
                gnb.a(0);
              } else {
                pla.a(0);
              }
              wp.field_a = tjb.field_wb;
            }
          } else {
            if (tjb.field_wb == wp.field_a) {
              if (!GetPhasedEnergyBeamPulsetime.e((byte) 102)) {
                SetMissionTerrainSpaceProbability.b(false);
                wgb.field_f = pw.field_a;
                if (hpb.field_i) {
                  AwardVictoryToTeamAction.a(-356, false);
                }
                if (kua.field_e) {
                  GetNebulaFadesOutWhenClose.a(wgb.field_f, false, (byte) -85, -4);
                }
                if (wqa.a(false, wgb.field_f)) {
                  olb.d(991426348);
                }
              }
              wp.field_a = SetShieldsDirectionalIdleEnergyUsage.field_p;
            } else {
              hn.field_a = hn.field_a - 1;
              if (hn.field_a == 0) {
                wp.field_a = wp.field_b;
              }
            }
          }
        } else {
          var3 = 0;
          var4 = 0;
          if (nna.field_C != null) {
            nna.field_C.a(true, (byte) 77);
          }
          if (null != nna.field_C &&
            nna.field_C.c(13462)) {
            stackIn_18_0 = 1;
          } else {
            stackIn_18_0 = 0;
          }
          boolean decompiledFrameRemainder0 = true;
          var5 = stackIn_18_0;
          if (SetNebulaProximityFadeDownshift.field_o &&
            null != vqa.field_g &&
            GetArmageddonTimerStart.field_o == -1 &&
            wgb.field_f == GetArmageddonTimerStart.field_o &&
            var5 == 0 && ((psb.field_b != null ||
            SetReverbDamp.field_o) &&
            (!vqa.field_g.field_N ||
            !GetSniperCannonProjectiles.field_p &&
            !SetFightersPerPlayerMaximum.field_p))) {
            stackIn_32_0 = 1;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_32_0 = 0;
          }
          var6 = stackIn_32_0;
          SetReadyRoomMissionTime.a(true, var6 != 0, GetBombletSprayEnergyUsed.field_p.width, GetBombletSprayEnergyUsed.field_p.height);
          if (!param0) {
            if (~wgb.field_f != ~GetArmageddonTimerStart.field_o) {
              SetVariableAction.field_b = SetVariableAction.field_b + 1;
              if (32 == SetVariableAction.field_b) {
                olb.d(991426348);
              }
            } else {
              if (GetArmageddonTimerStart.field_o != -1) {
                if (GetArmageddonTimerStart.field_o == -2) {
                  var3 = 1;
                } else {
                  if (wqa.a(false, GetArmageddonTimerStart.field_o)) {
                    lo.field_a[GetArmageddonTimerStart.field_o].b(0);
                  }
                }
              } else {
                if (jkb.field_a) {
                  var3 = 1;
                  var4 = 1;
                }
                if (!jkb.field_a ||
                  null != vqa.field_g &&
                  !vqa.field_g.field_N) {
                  stackIn_43_0 = vqa.field_g;
                  stackIn_43_1 = 81;
                  stackIn_44_2 = (var5 == 0);
                  ((uca) (Object) stackIn_43_0).a((byte) stackIn_43_1, stackIn_44_2);
                  if (!jkb.field_a) {
                    while (ata.e(127)) {
                      stackOut_47_0 = GetSpinningBladeAimspeed.a(-22029);
                      stackIn_59_0 = stackOut_47_0 ? 1 : 0;
                      stackIn_48_0 = stackOut_47_0;
                      if (stackIn_48_0) {
                        continue;
                      }
                      vqa.field_g.d((byte) 121);
                    }
                  }
                }
              }
            }
          }
          stackIn_59_0Lifetime1 = 17043;
          glb.c(stackIn_59_0Lifetime1);
          if (null != wca.field_b) {
            wca.field_b.b(0);
          }
          if (null != nna.field_C &&
            nna.field_C.c(13462)) {
            var3 = 0;
            var4 = 0;
          }
          if (di.field_l.a(-28208) ||
            !GetThrusterSmallForce.field_o &&
            !SetMissionTerrainDebrisProbability.field_p &&
            SetSpinningBladeSpindamageMultiplier.field_o != null &&
            SetSpinningBladeSpindamageMultiplier.field_o.field_fc) {
            var3 = 0;
            var4 = 0;
          }
          if (jkb.field_a &&
            !lu.field_d &&
            !SetMassDriverFireForce.field_o) {
            if (GetThrusterSmallForce.field_o &&
              SetFightersPerPlayerMaximum.field_p) {
              var3 = 0;
            }
            GetShieldsDirectionalRadius.a((byte) 21, var3 != 0);
            if (SetMissionTerrainDebrisProbability.field_p) {
              ProxyAuthenticationException.field_a.a((byte) 98, var4 != 0);
            }
            if (GetThrusterSmallForce.field_o) {
              if (vqa.field_g == null) {
                GetThrusterSmallForce.field_o = false;
              } else {
                var7 = (-dma.field_g + GetBombletSprayEnergyUsed.field_p.width) / 2;
                var8 = (-dma.field_j + GetBombletSprayEnergyUsed.field_p.height) / 2;
                GetBombletSprayReload.a(-119, var8, var7);
                GetMutatorVotes.a(SetBombletSprayProjectileOndamageParticles.e((byte) 93), var4 != 0, SetThrusterForce.a(-99), 123);
                BodyCondition.b(-1);
                if (vqa.field_g.field_N) {
                  vqa.field_g.a((byte) 89, var4 != 0);
                }
              }
            }
            var7Lifetime2 = 0;
            while (ata.e(127)) {
              if (GetSpinningBladeAimspeed.a(-22029)) {
                continue;
              }
              stackIn_133_0 = GetThrusterSmallForce.field_o;
              if (stackIn_133_0 &&
                SetBombletSprayProjectileDamage.field_o != 9 &&
                SetBombletSprayProjectileDamage.field_o != 10 &&
                SetBombletSprayProjectileDamage.field_o != 11) {
                if (!SetFightersPerPlayerMaximum.field_p) {
                  mjb.field_e = false;
                }
                if (!SetFightersPerPlayerMaximum.field_p) {
                  if (!me.field_r) {
                    if (GetHealthBarWidth.field_q == SetBombletSprayProjectileDamage.field_o) {
                      var7Lifetime2 = 1;
                      mjb.field_e = false;
                      SetFightersPerPlayerMaximum.field_p = true;
                      continue;
                    }
                    if (~GetGrappleDebris.field_p == ~SetBombletSprayProjectileDamage.field_o) {
                      SetFightersPerPlayerMaximum.field_p = true;
                      mjb.field_e = true;
                      var7Lifetime2 = 1;
                      continue;
                    }
                  } else {
                    if (SetBombletSprayProjectileDamage.field_o == vu.field_Db) {
                      mjb.field_e = false;
                      SetFightersPerPlayerMaximum.field_p = true;
                      var7Lifetime2 = 1;
                      continue;
                    }
                    if (GetBombletSprayProjectiles.field_p == SetBombletSprayProjectileDamage.field_o) {
                      var7Lifetime2 = 1;
                      mjb.field_e = true;
                      SetFightersPerPlayerMaximum.field_p = true;
                      continue;
                    }
                  }
                }
                if (var7Lifetime2 != 0) {
                  RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, 69);
                  stackIn_118_0 = RequestNewestBlackboxRecording.field_p;
                  stackIn_118_1 = 0;
                  if (mjb.field_e) {
                    stackIn_119_2 = 1;
                  } else {
                    stackIn_119_2 = 0;
                  }
                  ((IsaacPacketBuffer) (Object) stackIn_118_0).writeByte(stackIn_118_1, stackIn_119_2);
                }
                if (var7Lifetime2 == 0 && (SetBombletSprayProjectileDamage.field_o != 80 ||
                  SetFightersPerPlayerMaximum.field_p) && SetMassDriverEnergyUsed.a(13, 15, 12, (byte) 23)) {
                  continue;
                }
              } else {
                if (GetSniperCannonProjectiles.field_p &&
                  jlb.b(12, -2048, 13, 15)) {
                  continue;
                }
              }
              if (SetMissionTerrainDebrisProbability.field_p) {
                ProxyAuthenticationException.field_a.d((byte) -111);
              }
              if (!GetThrusterSmallForce.field_o) {
                continue;
              }
              vqa.field_g.d((byte) -16);
            }
          }
          stackIn_133_0Lifetime1 = jkb.field_a;
          if (!stackIn_133_0Lifetime1) {
            VoidHunters.m(-29130);
          }
          if (GetSniperCannonProjectiles.field_p) {
            if (GetRepairModePower.field_o > vga.field_b) {
              vga.field_b = vga.field_b + 1;
            }
          } else {
            if (0 < vga.field_b) {
              vga.field_b = vga.field_b - 1;
            }
          }
          var7Lifetime1 = GetRepairModePower.field_o * GetRepairModePower.field_o;
          var8Lifetime1 = -(vga.field_b * vga.field_b) + var7Lifetime1;
          var9 = 120 * var8Lifetime1 / var7Lifetime1 + nv.field_v;
          GetDebrisProjectileCollision.a(0, var9);
          if (PlayerVote.field_c.first(0) != null) {
            fieldTemp$0 = wva.field_b + 1;
            wva.field_b = wva.field_b + 1;
            if (fieldTemp$0 == 335) {
              wva.field_b = 0;
              PlayerVote.field_c.removeFirst(true);
            }
          }
        }
        if (wgb.field_f == -3) {
          wu.a(false, false);
        }
        if (-4 == wgb.field_f) {
          RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, 9);
          wgb.field_f = GetArmageddonTimerStart.field_o;
          lu.field_d = true;
          vga.field_b = GetRepairModePower.field_o;
        }
        if (-5 == wgb.field_f) {
          sh.a(SetSpinningBladeSpindamageMultiplier.field_o.f((byte) -13), -1, 11);
          SetMassDriverFireForce.field_o = true;
          wgb.field_f = GetArmageddonTimerStart.field_o;
        }
        if (param1 >= -117) {
          this.field_B = -120;
        }
        if (wh.field_n > 0) {
          wh.field_n = wh.field_n - 1;
        }
        this.updateMusicSelection((byte) -127);
        if (ssa.b(2) &&
          SetMachineGunEnergyUsed.field_o[1]) {
          li.field_i = true;
        } else {
          if (ssa.b(2) &&
            SetMachineGunEnergyUsed.field_o[2]) {
            li.field_i = false;
          }
        }
        if (ssa.b(2) &&
          SetMachineGunEnergyUsed.field_o[3]) {
          GetDebrisThrowable.a(false, "Selecting opengl toolkit...");
          var11 = new int[]{1};
          vq.field_x.a(false, GetFighterRepairAmount.a(var11, 2));
          GetDebrisThrowable.a(false, "Done");
        }
        if (ssa.b(2) &&
          SetMachineGunEnergyUsed.field_o[4]) {
          GetDebrisThrowable.a(false, "Selecting java toolkit...");
          var12 = new int[]{0};
          vq.field_x.a(false, GetFighterRepairAmount.a(var12, 2));
          GetDebrisThrowable.a(false, "Done");
        }
        if (ssa.b(2) &&
          SetMachineGunEnergyUsed.field_o[55] &&
          SetMachineGunEnergyUsed.field_o[82]) {
          BodyInZoneCondition.field_c = "This is a forced error, you pressed some crazy button combo";
          stackIn_200_0 = (!bqa.a(false)) ? 0 : 7;
          GetNebulaFadesOutWhenClose.a(stackIn_200_0, false, (byte) -85, 6);
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        if (0 >= param2) {
          return;
        }
        if (param1 > 0 &&
          GetDebrisGroupColour.field_r != null) {
          var4 = (GetBombletSprayEnergyUsed.field_p.width - param2) / 2;
          var5 = (GetBombletSprayEnergyUsed.field_p.height - param1) / 2;
          if (null == this.field_F ||
            ~param2 != ~this.field_F.field_q ||
            ~this.field_F.field_p != ~param1) {
            this.field_F = new Sprite(0, 0);
            this.field_F.field_q = param2;
            this.field_F.field_m = param2;
            this.field_F.field_p = param1;
            this.field_F.field_n = param1;
            this.field_F.field_r = GetDebrisGroupColour.field_r.na(var4, var5, this.field_F.field_q, this.field_F.field_p);
          }
          this.field_F.c(dma.field_g / 2 - param2 / param0, dma.field_j / 2 - param1 / 2 - 1);
          return;
        }
    }

    final static String b(int param0, int param1) {
        if (param0 >= 0 &&
          !(glb.field_c.length <= param0)) {
          return glb.field_c[param0];
        }
        if (param1 != -1) {
          return (String) null;
        }
        return glb.field_c[glb.field_c.length - 1];
    }

    final void renderGameFrame(int param0) {
        try {
          int stackIn_81_0 = 0;
          boolean stackIn_82_1 = false;
          Throwable decompiledCaughtException = null;
          int var3_int = 0;
          hua var3 = null;
          int var4_int = 0;
          jkb var4 = null;
          int var5_int = 0;
          String var5 = null;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          kla var8_ref_kla = null;
          int var9 = 0;
          java.awt.Canvas var10 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          int var5_intLifetime3;
          int var6Lifetime1;
          int var6Lifetime2;
          int var7Lifetime1;
          int var7Lifetime2;
          int var8Lifetime1;
          int var6Lifetime1Lifetime1;
          int var7Lifetime1Lifetime1;
          var9 = field_G;
          GetBombletSprayEnergyUsed.field_p = SetThrusterBindingMoveAndTurnHasOppositeMove.e((byte) 102).getSize();
          RoundResult.field_e = false;
          var10 = SetThrusterBindingMoveAndTurnHasOppositeMove.e((byte) 101);
          if (null != vq.field_x) {
            if (uu.field_b != var10) {
              GetDebrisThrowable.a(false, "Canvas=" + var10 + " hashcode=" + var10.hashCode());
              uu.field_b = var10;
            }
            if (vq.field_x.a((byte) -128, var10) ||
              null != vq.field_x.field_e &&
              vq.field_x.field_e.field_g != GetDebrisGroupColour.field_r) {
              GetSpinningBladeSpindamageMultiplier.a(-9934);
            }
          }
          if (GetUseTriFill.a(77)) {
            hka.a(111, var10, SetMassDriverProjectileLife.a(0));
            return;
          }
          if (!uob.field_e) {
            GetPhasedEnergyBeamAimspeed.a(var10, true);
            return;
          }
          if (!Mission.b(-1)) {
            IncrementVariableAction.a(lwa.field_vb, -1, 100.0f);
            GetPhasedEnergyBeamAimspeed.a(var10, true);
            return;
          }
          if (li.field_i) {
            GetDebrisGroupColour.field_r.c((int)(-GetSalvoaim.field_q + wt.a(false)));
            if (ul.field_a == 1) {
              if (!GetDebrisGroupColour.field_r.s()) {
                GetDebrisGroupColour.field_r.b();
              }
              GetDebrisGroupColour.field_r.a((float)pab.field_m / 100.0f, 1.0f, (float)oaa.field_i / 100.0f);
            }
            GetDebrisGroupColour.field_r.GA(0);
            GetDebrisGroupColour.field_r.ya();
          }
          dma.a();
          if (~wgb.field_f != ~GetArmageddonTimerStart.field_o) {
            if (SetVariableAction.field_b < 16) {
              uea.a((byte) 88, SetShipTeamAction.field_f, false, GetArmageddonTimerStart.field_o);
            } else {
              uea.a((byte) 88, GetMessageFadetime.field_o, false, wgb.field_f);
            }
          } else {
            uea.a((byte) 88, SetShipTeamAction.field_f, true, GetArmageddonTimerStart.field_o);
          }
          if (!SetShipTeamAction.field_f ||
            !GetMessageFadetime.field_o) {
            var3_int = (-dma.field_g + GetBombletSprayEnergyUsed.field_p.width) / 2;
            var4_int = (-dma.field_j + GetBombletSprayEnergyUsed.field_p.height) / 2;
            GetBombletSprayReload.a(-89, var4_int, var3_int);
            fr.a(SetSalvoDamageMultiplier.e(83), true);
            BodyCondition.b(-1);
          }
          var3 = (hua) (PlayerVote.field_c.first(0));
          if (var3 != null) {
            var5_int = wva.field_b;
            if (var5_int < 80) {
              var4_int = -32 + var5_int / 2;
            } else {
              if (var5_int < 230) {
                var4_int = 8;
              } else {
                var4_int = -(var5_int / 2) + 123;
              }
            }
            lo.field_c[var3.field_d].b(8, var4_int, 32, 32);
          }
          if (param0 >= -79) {
            return;
          }
          if (nna.field_C != null) {
            nna.field_C.b((byte) 95);
            if (nna.field_C.c(13462)) {
              RoundResult.field_e = true;
            }
          }
          if (SetReloadBarWidth.f((byte) -113)) {
            var4_int = (-dma.field_g + GetBombletSprayEnergyUsed.field_p.width) / 2;
            var5_intLifetime1 = (GetBombletSprayEnergyUsed.field_p.height - dma.field_j) / 2;
            if (li.field_i) {
              GetDebrisGroupColour.field_r.GA(-16777216);
            }
            SetMassDriverProjectileDamage.a(var4_int, var5_intLifetime1, 143);
            vfa.a(false, 20637);
            RoundResult.field_e = true;
          }
          if (tjb.l(0)) {
            var4_int = (-dma.field_g + GetBombletSprayEnergyUsed.field_p.width) / 2;
            var5_intLifetime2 = (-dma.field_j + GetBombletSprayEnergyUsed.field_p.height) / 2;
            GetPhasedEnergyBeamFireForce.a(var4_int, 32, var5_intLifetime2);
            if (!RoundResult.field_e) {
              this.a(2, 20 + cd.a(true), fk.b(-119));
            }
            rw.a(false, (byte) 71);
            RoundResult.field_e = true;
          } else {
            if (ffa.a(false)) {
              IntrusiveNode.a((Sprite[]) null, 8, 0, (Sprite[]) null, (Sprite[]) null, 8555923, 0, 15658751, 15658751, SetMpSandboxEnemySpawnLimit.field_p, dma.field_j / 2, 0, 0, -14109, dma.field_g / 2);
              var4_int = 16;
              var5_intLifetime2 = var4_int + SetUseNiceTrails.a(0);
              var6 = var4_int + SetShieldsDirectionalArc.a(-22954);
              var7 = GetBombletSprayEnergyUsed.field_p.width / 2 - var5_intLifetime2 / 2;
              var8 = -(var6 / 2) + GetBombletSprayEnergyUsed.field_p.height / 2;
              af.a((byte) -115, 255, var6, var7, var8 - 1, var5_intLifetime2);
              if (this.field_F == null) {
                this.field_F = new Sprite(0, 0);
                this.field_F.field_q = var5_intLifetime2;
                this.field_F.field_m = var5_intLifetime2;
                this.field_F.field_p = var6;
                this.field_F.field_n = var6;
                this.field_F.field_r = GetDebrisGroupColour.field_r.na(var7, var8, this.field_F.field_q, this.field_F.field_p);
              }
              this.field_F.c(dma.field_g / 2 - var5_intLifetime2 / 2, dma.field_j / 2 - var6 / 2 - 1);
              SetMutatorVotes.f(-1321004447);
              RoundResult.field_e = true;
            }
          }
          if (wp.field_a != wp.field_b) {
            var4_int = 256 * hn.field_a / 16;
            if (0 < var4_int) {
              dma.e(0, 0, dma.field_g, dma.field_j, 0, var4_int);
            }
          }
          if (!RoundResult.field_e) {
            this.field_F = null;
          }
          if (RoundResult.field_e &&
            li.field_i) {
            var4_int = dma.field_g;
            var5_intLifetime3 = dma.field_j;
            if (this.field_F != null) {
              var5_intLifetime3 = this.field_F.field_p;
              var4_int = this.field_F.field_q;
            }
            var6Lifetime1 = (-var4_int + GetBombletSprayEnergyUsed.field_p.width) / 2;
            var7Lifetime1 = (-var5_intLifetime3 + GetBombletSprayEnergyUsed.field_p.height) / 2;
            if (SetReloadBarWidth.f((byte) -116) &&
              this.field_F != null) {
              var6Lifetime1 = GetExplosionProjectileOndamageParticles.e((byte) -24);
              var7Lifetime1 = rg.b((byte) 102);
            }
            var8_ref_kla = feb.a(GetDebrisGroupColour.field_r, true);
            var8_ref_kla.a(var6Lifetime1, var6Lifetime1 + var4_int, var7Lifetime1, var7Lifetime1 + var5_intLifetime3, (byte) -76);
            var7Lifetime1Lifetime1 = (-dma.field_j + GetBombletSprayEnergyUsed.field_p.height) / 2;
            var6Lifetime1Lifetime1 = (GetBombletSprayEnergyUsed.field_p.width - dma.field_g) / 2;
            GetDebrisGroupColour.field_r.SA(var6Lifetime1Lifetime1, var7Lifetime1Lifetime1, dma.field_g, dma.field_j, dma.field_i, 0, dma.field_g);
            var8_ref_kla.a(true);
          }
          if (di.field_l.a(-28208)) {
            var4_int = di.field_l.field_m.c(0);
            var5 = SetReverbGain.a(GetGrapplingHookRopeBreakLength.field_q, new String[]{Integer.toString(var4_int)}, 106);
            var6Lifetime2 = 1;
            var7Lifetime2 = (GetBombletSprayEnergyUsed.field_p.width >> 1) - (tea.a(var6Lifetime2, var5, 13879) >> 1);
            var8Lifetime1 = (GetBombletSprayEnergyUsed.field_p.height >> 1) - (GetPointDefenceLaserProjectiles.a(false, var6Lifetime2) >> 1);
            af.a((byte) -115, 200, fkb.a(var6Lifetime2, (byte) -121) * 8, var7Lifetime2 - 16, var8Lifetime1 - 5 * fkb.a(var6Lifetime2, (byte) -121), 32 + tea.a(var6Lifetime2, var5, 13879));
            SetSelfDestructPrepareToggleCooldown.a(var7Lifetime2, 1, var8Lifetime1, var5, var6Lifetime2, 16777215, (byte) -101);
          }
          stackIn_81_0 = 0;
          stackIn_82_1 = (GetUseDetailLines.field_o != -1) && (GetTorpedoReload.field_q != -1);
          spa.a(stackIn_81_0, stackIn_82_1);
          if (GetPointDefenceLaserProjectiles.a(1024, 11284)) {
            GetLagStandardDeviationOut.a(1, "FPS: " + Integer.toString(ffa.field_a), 16777215, 20, 160, 4266);
          }
          if (li.field_i) {
            try {
              GetDebrisGroupColour.field_r.b(-122);
            } catch (jkb decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (jkb) (Object) decompiledCaughtException;
              var4.printStackTrace();
            }
          } else {
            SetSniperCannonAimarc.a(var10, 0, 0, 0);
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public VoidHunters() {
        this.field_B = 0;
        this.field_F = null;
        this.field_D = -1;
        this.field_C = -1;
    }

    static {
        field_E = new int[1];
    }
}
