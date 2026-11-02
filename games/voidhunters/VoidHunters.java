/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class VoidHunters extends ms {
    private int field_B;
    private int field_D;
    private phb field_F;
    static int[] field_E;
    private int field_C;
    public static int field_G;

    private final void a(int param0, cl param1, int param2) {
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
            for (var4_int = 0; var4_int < param1.field_a.length; var4_int++) {
              GetThrusterParticleLife.field_o.b(param1.field_a[var4_int], (byte) 18, var4_int);
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

    final static boolean a(boolean param0, Object param1) {
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
        this.a("voidhunters", -74, 27);
    }

    private final void a(int param0, int param1) {
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
          BodyInZoneCondition.field_c = qga.field_b.a(-1);
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param0 == 14) {
          GetDebrisThrowable.a(false, "Entering lobby");
          GetBombletSprayAimarc.a(shb.field_o, SetUseOffscreenRendering.a(0), GetSalvoaim.a(8, (byte) -99), GetSalvoaim.a(2000, (byte) -116), SetUseOffscreenRendering.b(false), true, ms.field_A.length, 150, 1024, GetMissilesAcceleration.a(207));
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
                var3 = ndb.field_a;
              }
            } else {
              var3 = vqa.field_g;
            }
            if (param1 != 12) {
              this.field_F = (phb) null;
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
              var4 = qga.field_b.e((byte) -107);
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
                  var4Lifetime1 = qga.field_b.e((byte) -110);
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
                  var4Lifetime1Lifetime1 = qga.field_b.e((byte) -128);
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
              var4Lifetime2 = qga.field_b.e((byte) -90);
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
            ndb.field_a = null;
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
                ndb.field_a = var8;
              }
              SetMassDriverFireForce.field_o = false;
              wgb.field_f = -1;
              GetMessageFadetime.field_o = true;
            }
            return;
          }
        }

    }

    final void a(int param0) {
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
          if (this.h((byte) 125)) {
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
                  VoidHunters.a(MissionList.b((byte) -118), 4);
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
            var7 = (ea) (SetGrapplingHookCooldown.field_o.a(true));
            if (var7 == null) {
              break;
            }
            SetLaserReload.a(4, var7, 0);
          }
        }
        while (GetSelfDestructTimer.a(0, ta.field_b)) {
          var3Lifetime1 = ow.field_a;
          this.a(var3Lifetime1, 12);
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
          ndb.field_a != null &&
          ndb.field_a.field_m.carouselInfo.field_k) &&
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

    private final void a(cl param0, int param1, int param2) {
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
            for (var4_int = 0; param0.field_a.length > var4_int; var4_int++) {
              uga.field_g.b(param0.field_a[var4_int], (byte) 18, var4_int);
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

    final void a(boolean param0) {
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
        uu.a((byte) 90, ta.field_b, (ms) (this));
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

    public static void n(int param0) {
        field_E = null;
        if (param0 != 0) {
          String var2 = (String) null;
          VoidHunters.a(-6, -55, -125, 73, (String) null, -128, true, true);
        }
    }

    private final void g(byte param0) {
        int stackIn_5_0 = 0;
        int var2;
        int var3;
        uca var4;
        int var5;
        int var6_int;
        cl var6;
        int var7;
        int var8;
        cl var9;
        cl var10;
        cl var11;
        var7 = field_G;
        if (vqa.field_g == null &&
          null == ndb.field_a) {
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
                var9 = new cl();
                var9.field_a[0] = 255;
                this.a(var9, -19653, 4);
              }
            } else {
              var4 = vqa.field_g;
              if (var4 == null) {
                var4 = ndb.field_a;
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
                  var6 = new cl();
                  if (0 == var5) {
                    var6.field_a[0] = 255;
                    var6.field_a[5] = 255;
                    var6.field_a[8] = 255;
                    var6.field_a[7] = 255;
                  } else {
                    switch (var5) {
                      case 1:
                        var6.field_a[6] = 255;
                        var6.field_a[7] = 255;
                        var6.field_a[9] = 255;
                        var6.field_a[10] = 255;
                        var6.field_a[3] = 255;
                        var6.field_a[0] = 255;
                        var6.field_a[15] = 255;
                        var6.field_a[8] = 255;
                        var6.field_a[5] = 255;
                        break;
                      case 2:
                        var6.field_a[14] = 255;
                        var6.field_a[13] = 255;
                        var6.field_a[15] = 255;
                        var6.field_a[8] = 255;
                        var6.field_a[11] = 255;
                        var6.field_a[2] = 255;
                        var6.field_a[12] = 255;
                        var6.field_a[1] = 255;
                        break;
                      default:
                        this.a(var6, -19653, var5);
                        break regionExit1;
                      case 3:
                        var6.field_a[4] = 255;
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
            var11 = new cl();
            var11.field_a[14] = 255;
            this.a(-23134, var11, 1);
          }
        } else {
          if (var2 == 0 &&
            this.field_D != 0) {
            var10 = new cl();
            var8 = 0;
            var5 = var8;
            while (var8 < var10.field_a.length) {
              var10.field_a[var8] = 255;
              var8++;
            }
            var10.field_a[14] = 0;
            this.a(-23134, var10, 0);
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
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

    final void b(boolean param0) {
        VoidHunters.n(0);
        abb.a(4);
        no.a();
        kla.a(89);
        bw.a(9502);
        hb.a(15873);
        veb.a(1);
        oua.a(true);
        kda.b(66);
        fab.a(10970);
        pa.a(2);
        fdb.g(0);
        dra.c(98);
        btb.a((byte) 94);
        bda.a(-12407);
        sh.a((byte) 89);
        ot.a(param0);
        gob.a(26986);
        tua.a(114);
        coa.a(true);
        ShipBlueprint.a(0);
        GameKeyHandler.a(-106);
        ms.d(false);
        ClientException.a(127);
        bi.b(-19766);
        MouseWheelInput.a(-25692);
        dma.b();
        asb.a((byte) 112);
        PacketBuffer.j(-38);
        wt.a(-101);
        tc.a((byte) 40);
        kia.a(3553);
        kmb.a(32768);
        wja.a(false);
        bsb.a(23870);
        dp.a(8);
        lmb.a((byte) -53);
        pgb.a((byte) 75);
        nqa.a((byte) -30);
        mab.a(-23483);
        wsb.b((byte) -108);
        ufb.a(false);
        vfa.c((byte) 120);
        wf.a(3);
        uca.f(!param0 ? true : false);
        kc.a(-106);
        djb.c((byte) -107);
        fcb.a(111);
        dla.a((byte) 101);
        mn.a(-49);
        ShipComponent.e(24388);
        iwa.a((byte) -116);
        igb.a(0);
        ro.a(-47);
        kma.c(-58);
        GrappleLauncherBehaviour.c((byte) 114);
        ThrusterBehaviour.b(-69);
        WeaponBehaviour.c(!param0 ? true : false);
        fra.a(2147483647);
        jb.a(12472);
        uj.a((byte) -95);
        eqb.a(65);
        es.a(param0);
        pd.c((byte) 26);
        oma.a(28801);
        bea.a(1);
        MissionCondition.a((byte) -110);
        MissionControl.a((byte) -98);
        MissionEvent.b((byte) -76);
        MissionState.a(!param0 ? true : false);
        MissionVariable.a((byte) -102);
        qsa.a(30089);
        Asteroid.l(3);
        Debris.j((byte) -127);
        EscapePod.c(3);
        PartitionZone.a(true);
        fba.b(117);
        Projectile.g(-124);
        ResourceNode.a(false);
        ShipAI.a(false);
        World.h(3);
        SettingsChange.a((byte) 61);
        SpawnChoice.a(32);
        SpecialOrderSubmessage.a(-120);
        rj.a();
        ncb.a(500);
        cib.a(-18013);
        llb.f(-2147483648);
        bv.a(39);
        hw.a(-1);
        bfb.b();
        aaa.a((byte) 35);
        SettingsInstance.b(17674);
        MissionList.a(param0);
        qga.a(114);
        qs.a(true);
        joa.a(26936);
        qua.a(16606);
        sfa.a(false);
        ara.a(true);
        SetVariableLabelAction.c(112);
        TickCondition.b((byte) -44);
        tja.a(false);
        MessageLog.a(1);
        rgb.a(true);
        ptb.b((byte) 127);
        AdjustBodyComponentsAction.a((byte) 94);
        AdjustVariableAction.a(true);
        AwardVictoryToTeamAction.b(1);
        SetVariableAction.a((byte) 24);
        SetShipTeamAction.a((byte) 118);
        BodyCondition.c(6970);
        BodyInZoneCondition.b(-15818);
        TeamNodeCondition.b(-2684);
        ShipSpawnedCondition.b((byte) 11);
        ShipCondition.b(-10570);
        VariableCondition.c(-120);
        gda.c((byte) 18);
        lu.a((byte) 87);
        vra.a((byte) -66);
        kl.b(-127);
        AsteroidField.a((byte) 48);
        GrapplingHook.j((byte) -116);
        rdb.c(51200);
        rca.a(12035);
        Hardpoint.a(64);
        kra.a((byte) 70);
        pea.a(true);
        sra.a(96);
        ii.b(25498);
        bmb.a((byte) -120);
        dqb.a(15060);
        tea.a(!param0 ? true : false);
        hbb.c(!param0 ? true : false);
        gnb.b((byte) 19);
        fkb.d(-25815);
        q.b();
        ht.a(false);
        vka.d();
        iab.a(2);
        um.a(100);
        lc.a(95);
        ssa.a(2);
        pr.b(1);
        spb.b(0);
        enb.a((byte) 38);
        ae.e(-1);
        nl.a(2128263208);
        mba.a((byte) 26);
        fgb.a(8);
        cwa.a((byte) 74);
        wia.a(9911);
        ida.h((byte) -96);
        ud.e(false);
        rq.f(112);
        rla.i((byte) 61);
        vla.e(3);
        waa.i((byte) 115);
        dj.a((byte) -114);
        rbb.b((byte) -29);
        kr.a(-127);
        RemoveEventAction.b(-125);
        qpa.a(!param0 ? true : false);
        bc.a(-22113);
        gdb.a(-73);
        lo.a(true);
        psb.a(false);
        oib.a(124);
        vw.a((byte) 55);
        wc.b(-20221);
        ona.c(125);
        pfa.b(63);
        fwa.b(5);
        ppb.a(37);
        pjb.e((byte) 22);
        aw.h(0);
        wdb.e((byte) 127);
        hqb.a((byte) -106);
        lwa.h(0);
        cna.h(1);
        bs.a((byte) 42);
        ooa.h(126);
        DualLinkNode.d(-31049);
        qc.a((byte) 78);
        ffb.a(-106);
        kw.g((byte) 124);
        pia.e(-89);
        bra.a(true);
        cd.a(5);
        ebb.a(23357);
        sqb.a(!param0 ? true : false);
        mr.l((byte) -16);
        ija.a(true);
        uc.a(0);
        lm.a(127);
        wk.a((byte) 80);
        tjb.i(85);
        jv.a((byte) -33);
        tgb.b((byte) -58);
        eua.a(-128);
        feb.a((byte) 122);
        alb.a(6947);
        uv.a(22089);
        uea.a((byte) -18);
        ei.a(false);
        jba.a(true);
        bob.b(22540);
        shb.c((byte) 71);
        bl.i((byte) -17);
        ar.b(54);
        hnb.i(1);
        fm.a((byte) -114);
        iw.f(-27545);
        nva.f(-104);
        htb.d(124);
        dqa.b(param0);
        oda.a(0);
        pwa.a(-126);
        whb.a(-113);
        ub.c((byte) 104);
        mo.d((byte) 46);
        CarouselSlotStateDump.a(32);
        umb.a(16214);
        pca.d(9);
        hg.a(false);
        gtb.a((byte) -88);
        hp.a(false);
        fnb.a(-19);
        mia.a(-11954);
        PlayerVote.a((byte) -98);
        sa.b();
        ComponentBehaviour.b(0);
        TimedSpecialOrderBehaviour.a(126);
        uab.a(0);
        fca.a();
        wma.b(118);
        csa.a((byte) 124);
        cjb.a(0);
        bd.a((byte) -103);
        kea.a(115);
        kca.a((byte) 127);
        ps.a(1);
        cv.a();
        dha.a(53);
        fia.a((byte) -28);
        ota.a();
        qd.a((byte) 66);
        pfb.a(118);
        bbb.a(0);
        jw.a(false);
        SocketConnector.a((byte) -109);
        ndb.a(91);
        MissionGenerationData.a((byte) -125);
        TargetLock.a(true);
        MapClearanceArea.a((byte) -128);
        RoundResult.a((byte) -128);
        lh.a(15261);
        TeamShipComponentCondition.b(-2404);
        ehb.a(false);
        lra.a(!param0 ? true : false);
        qeb.a((byte) -122);
        tn.a((byte) 110);
        bqa.a((byte) 124);
        AwardVictoryToWinnerAction.b(0);
        qw.a(true);
        wh.h(0);
        km.g((byte) 114);
        jma.e(100);
        ga.c((byte) -110);
        qda.a();
        tga.j(88);
        uf.h((byte) -128);
        ttb.d(16711935);
        kja.a(-30);
        gm.e(-2459);
        jla.a(-125);
        eca.e(-27183);
        reb.a(false);
        w.i((byte) 77);
        ut.a(-72);
        cja.a(-17719);
        ata.a(6344);
        fj.a(0);
        ita.j((byte) 106);
        vq.i((byte) -81);
        sha.f(1);
        nga.b((byte) -126);
        IterableNodeHashTable.b(!param0 ? true : false);
        al.a(true);
        rlb.a(-120);
        fbb.a(param0);
        kha.b(1);
        mpb.g(0);
        vf.a((byte) -26);
        tla.b(1);
        rpa.f(1);
        epb.c(13);
        rtb.c((byte) 81);
        pf.d((byte) -101);
        pb.a((byte) -84);
        mj.a(17);
        rga.a((byte) 108);
        oj.b(108);
        kba.a(17121);
        aba.a(-3696);
        atb.a(true);
        uda.b((byte) -96);
        as.c(0);
        je.b((byte) 117);
        vmb.a(8192);
        slb.a((byte) 13);
        uja.a((byte) -123);
        jra.a((byte) -125);
        jp.K(771);
        esb.e(-118);
        hma.a(-1);
        re.d(-2705);
        ef.e(-100);
        tda.g(29914);
        qh.l((byte) -123);
        bk.e(80);
        vcb.j((byte) -7);
        ta.a((byte) -109);
        se.c(-27982);
        ri.a(41);
        ska.e(5697);
        bna.a(!param0 ? true : false);
        ProxySocketConnector.b(true);
        gab.a(15325);
        pja.d(-1);
        wv.d(65280);
        ul.a(-23460);
        drb.e((byte) -85);
        jwa.d(-122);
        jlb.a(true);
        grb.e((byte) -72);
        owa.e((byte) 110);
        di.e((byte) 113);
        lq.d(262144);
        gw.a(param0);
        vm.e((byte) 110);
        vn.a(!param0 ? true : false);
        kbb.e((byte) -117);
        me.a(true);
        lnb.e(1);
        hpb.d(-6200);
        qqa.e((byte) -104);
        moa.d(-120);
        cm.e((byte) -118);
        md.a(false);
        koa.d(19);
        gia.a(false);
        rw.e((byte) 86);
        elb.c((byte) 78);
        hk.d(-1210841460);
        oqb.e((byte) -123);
        hc.a();
        NodeHashTableIterator.a((byte) -101);
        lia.a(97);
        uva.a();
        woa.a(-16777216);
        cs.a((byte) 111);
        ImageProducerRasterBuffer.c((byte) -128);
        r.e((byte) -123);
        ct.a((byte) -96);
        mb.f((byte) -122);
        of.a(8345);
        ob.c((byte) 42);
        nv.e(33);
        mea.c(-95);
        qg.c(-15081);
        jjb.a(false);
        ne.a(-2);
        uia.a(-4353);
        gpa.a(-92);
        im.c((byte) 105);
        tob.a(91);
        bt.a(-4509);
        vab.a(false);
        bkb.b(26);
        oaa.c(124);
        mnb.b(117);
        dda.a(0);
        uga.a((byte) -9);
        iib.d(1);
        ku.a((byte) 108);
        uob.d(3168);
        ti.a(true);
        mw.d(13776);
        ts.a((byte) 90);
        tu.a((byte) 88);
        cba.b(!param0 ? true : false);
        gib.a(15);
        ko.a(-35);
        mjb.a(-81);
        sv.e(0);
        wu.d((byte) 46);
        hab.e(-18951);
        bib.c(param0);
        kt.d((byte) -19);
        gna.b(false);
        vjb.b((byte) 53);
        ho.a(13032);
        ubb.f((byte) 42);
        gn.e(106);
        qva.a(6);
        rab.a(148);
        gla.a(-5709);
        fib.e(-113);
        bva.b(23008);
        tb.a(-75);
        pl.b((byte) -109);
        fk.a((byte) 80);
        iob.c(-5509);
        vhb.b(21053);
        hla.a((byte) 39);
        asa.a(20000000);
        ue.a((byte) 124);
        sja.a((byte) 120);
        qb.a(111);
        cl.a((byte) -99);
        ccb.b((byte) 126);
        amb.a(-46);
        gl.a(0);
        vva.a((byte) 121);
        meb.a((byte) -52);
        kpb.c(17433);
        dw.a(118);
        qpb.b(!param0 ? true : false);
        kab.c(777);
        qn.a(true);
        ifa.a(95);
        vu.e((byte) 113);
        fa.c((byte) 119);
        ujb.a((byte) -111);
        lw.a(false);
        kob.a(127);
        ConsoleCommand.a(true);
        gva.a(true);
        qab.b(0);
        kua.a(181765988);
        nfb.b((byte) 120);
        etb.b((byte) 43);
        pn.a(-30938);
        nfa.d(-3408);
        rea.d(102);
        qsb.d(104);
        uw.d(34037);
        lg.d(108);
        nnb.b(false);
        pva.d(109);
        fpa.d(110);
        hka.d(0);
        fjb.a(105);
        ecb.a(95);
        wva.a(-13);
        av.a(false);
        dtb.b((byte) 124);
        efb.b((byte) -80);
        akb.b((byte) 21);
        fpb.l(62);
        deb.i((byte) -125);
        wqb.i((byte) 75);
        mna.i((byte) 9);
        teb.l(8192);
        fma.i((byte) -22);
        rma.l(3);
        wca.l(-36);
        ira.l(17036);
        jeb.i((byte) -81);
        ok.b((byte) -103);
        ej.b((byte) 124);
        gfb.b((byte) 80);
        dkb.b((byte) -120);
        jga.a(-121);
        gs.b((byte) 120);
        gmb.a(-109);
        ng.a(false);
        ajb.c((byte) 44);
        ns.a(102);
        ge.a((byte) 122);
        eta.a(126);
        mta.a(false);
        jdb.a(param0);
        cn.a(false);
        vfb.a(92);
        hsb.b((byte) 27);
        bf.b((byte) 27);
        nra.a(2);
        wkb.a(-1);
        mbb.a(50);
        osb.a(1);
        eoa.a(-18593);
        upb.b(50);
        pu.a(124);
        sl.a(-123);
        lhb.b((byte) -116);
        lob.b((byte) 102);
        lka.a(8192);
        lsa.c((byte) -92);
        dfa.a((byte) 112);
        tpa.a(2);
        lp.b((byte) 43);
        nna.c(true);
        rg.a(-117);
        us.b((byte) 32);
        un.a(false);
        cfa.c((byte) 83);
        ea.a(10);
        nj.a(false);
        br.a(true);
        t.a(1);
        vv.b(24358);
        pbb.a(-652030847);
        nrb.a(11227);
        bpa.a((byte) 68);
        tia.a(-102);
        jja.b((byte) -110);
        uu.a(-19);
        npa.a(true);
        nf.a(27167);
        ci.a(-5254);
        kgb.a(0);
        nma.b((byte) -4);
        Lo.a(301);
        SetLagVariant.a(125);
        GetLagStandardDeviationIn.b(true);
        GetLagStandardDeviationOut.a(-2);
        LoadSettings.e((byte) -100);
        LoadBlackboxRecording.e(0);
        RequestNewestBlackboxRecording.b(false);
        SetCarouselConstant.e((byte) -105);
        GetLoadingMissions.a(1);
        SetTrapMouse.b(false);
        GetTabForScores.a(-9028);
        SetTabForScores.b(false);
        GetToggledScoreboard.b(false);
        SetToggledScoreboard.e((byte) 124);
        GetDebrisGroupColour.a(23969);
        SetDebrisGroupColour.a(7311);
        SetShipDirectionArrow.a(0);
        SetShipAimLines.a(-1);
        GetAllowShipSaving.e(105);
        SetUseOffscreenRendering.e(-2326);
        GetUseCircleFill.a(2);
        SetUseCircleFill.a(0);
        GetUseCircleOutline.e((byte) -47);
        SetUseCircleOutline.e((byte) 74);
        GetUseLines.a(0);
        SetUseLines.a(10);
        GetUseRectFill.a(25837);
        SetUseRectFill.e((byte) -5);
        GetUseTriFill.e((byte) -125);
        SetUseTriFill.a(100);
        GetUsePolygonFill.a(9141);
        SetShowTutorial.a(0);
        GetFps.a(30465);
        GetRadialMenuRadius.a(0);
        GetMinimapWidth.e((byte) -93);
        GetMinimapHeight.e((byte) 89);
        SetMinimapHeight.b(param0);
        GetHealthBarWidth.a(27358);
        SetHealthBarHeight.a(0);
        GetReloadBarWidth.a(1);
        SetReloadBarWidth.e((byte) -31);
        GetReloadBarHeight.a(123);
        SetReloadBarHeight.b(!param0 ? true : false);
        GetSpecialOrderBarX.e((byte) -115);
        SetSpecialOrderBarX.e((byte) 4);
        GetSpecialOrderBoxHeight.b(false);
        SetSpecialOrderBoxHeight.a(0);
        GetMissionVariablesHudX.a(18841);
        SetMissionVariablesHudX.a(2);
        GetMissionVariablesHudY.a(16224);
        GetAudioRangeCutoff.e((byte) 98);
        SetAudioRangeCutoff.b(param0);
        GetReverbGain.a(34);
        SetReverbFeedback.a(200);
        GetReverbDamp.e((byte) 121);
        SetReverbDamp.e((byte) -7);
        GetReverbWet.a(-23714);
        SetReverbWet.e((byte) 124);
        GetReverbWidth.a(9839);
        GetBlueprintSaveTime.a(-21447);
        SetBlueprintSaveTime.a(0);
        GetMessageMaxage.e((byte) -71);
        SetMessageFadetime.e((byte) 32);
        GetMessageMax.a(-122);
        SetMessageMax.a(0);
        GetOndamageParticleSpeed.a(30388);
        SetOndamageParticleSpeed.a(2051507073);
        GetOndamageParticleLife.a(-92);
        SetOndamageParticleLife.a(-1);
        SetShieldsDirectionalHalfarcCuts.a(-118);
        GetShieldsDirectionalArcParticleLife.a(-23822);
        SetShieldsDirectionalArcParticleLife.a(0);
        GetShieldsDirectionalArcParticleSpeedDownshift.e((byte) -31);
        SetShieldsDirectionalArcParticleSpeedDownshift.a(-32514);
        SetAutoAfkTimeout.a(0);
        GetBuildViewAutozoomEndOnAction.e(53562);
        GetNumStars.a(95);
        SetNumStars.e((byte) 84);
        GetUseSprites.a(-91);
        SetUseBackground.a(118);
        GetUseBackgroundInFullscreen.e((byte) -29);
        SetUseBackgroundInFullscreen.a(0);
        SetUseExtraBackground.a(0);
        GetUseNiceTrails.a(106);
        GetDebugLineLife.a(25553);
        SetDebugLineLife.e((byte) 116);
        GetUseFilledPolygons.e((byte) 49);
        SetUseDetailLines.a(0);
        GetBloomThresholdPercentage.a(96);
        SetBloomThresholdPercentage.b(false);
        GetBloomCoefficientPercentage.a(256);
        SetBloomCoefficientPercentage.e((byte) 107);
        GetAutozoomSpeedDivide.e((byte) -15);
        SetAutozoomSpeedDivide.a(101);
        GetAutozoomAmountMultiply.a(-105);
        SetAutozoomAmountMultiply.e(-122);
        GetNebulaProximityFadeDownshift.b(param0);
        GetUseTrails.e((byte) 63);
        SetUseTrails.e((byte) 103);
        GetShipToShipRamDamage.a(2);
        SetShipToShipRamDamage.a(-128);
        GetTeamSelectionSpeedup.e(3575);
        SetTeamSelectionSpeedup.e((byte) -66);
        GetWaitForPlayers.e((byte) 40);
        SetWaitForPlayers.e((byte) -20);
        GetKeepTeamColours.a(22829);
        SetKeepTeamColours.b(false);
        SetDebrisCollision.e((byte) -128);
        GetDebrisPartitioned.b(false);
        GetDebrisCollisionDamage.e((byte) -91);
        GetDebrisThrowable.e((byte) -115);
        GetMissilesHitSourceTeam.e((byte) 123);
        SetMissilesHitSourceTeam.b(false);
        GetMissilesDamageSourceTeam.a(111);
        SetMissilesDamageSourceTeam.a(0);
        GetGrapplingHooksDamageableBySourcePlayer.e(1);
        SetThrusterBindingMoveAndTurnHasOppositeMove.f((byte) -96);
        SetNebulaFadesOutWhenClose.a(2);
        GetDebrisFoundInPairs.e((byte) -114);
        SetDebrisFoundInPairs.e((byte) 32);
        SetFogOfWarOn.f((byte) -104);
        SetUseModels.e((byte) -57);
        GetInnateThrusters.a(0);
        SetInnateThrusters.a(21);
        SetThrusterAutobalancing.a(-21968);
        SetBots.b(true);
        GetDetachmentMode.a(124);
        GetAutoaim.e((byte) -115);
        GetSalvoaim.a(87);
        SetSalvoaim.b(false);
        GetFixedaim.e((byte) -70);
        SetFixedaim.e((byte) -49);
        GetSalvoUsesAllEnergy.e(44);
        SetSalvoUsesAllEnergy.a(0);
        GetSalvoHoldable.a(-1721);
        SetSalvoHoldable.e((byte) -127);
        GetPedrosRepairMode.e((byte) -50);
        SetPedrosRepairMode.e((byte) 53);
        GetShipPersistence.a(33);
        SetShipPersistence.a(-125);
        GetDebrisCarryOver.a(68);
        SetDebrisCarryOver.a(0);
        GetDebrisCarryOverPercentage.a(-51);
        SetDebrisCarryOverPercentage.e((byte) -119);
        SetDebrisSurvives.e(0);
        SetClientSideDragging.a(37);
        GetSalvoDamageMultiplier.e((byte) -119);
        SetSalvoDamageMultiplier.a(-126);
        SetSalvoRepairTimeMultiplier.e(-1);
        GetMpSandboxEnemySpawnLimit.e((byte) 32);
        SetMpSandboxEnemySpawnLimit.a(-23436);
        GetMaxShipSize.a(-100);
        GetFightersPerPlayerMaximum.a(42);
        GetBurstFireMaxEnergy.b(param0);
        SetBurstFireMaxEnergy.e((byte) 7);
        SetShipSpawnInvulnerabilityTime.a(46);
        GetFogOfWarSensorRange.e((byte) -114);
        SetFogOfWarSensorRange.a(122);
        GetThrusterBindingBalanceThreshold.e((byte) 87);
        SetThrusterBindingBalanceThreshold.e((byte) 76);
        GetComponentBreakingExplosionForceMultiplier.a(3);
        SetPhysicsCollisionForceMultiplier.a(124);
        SetPhysicsCollisionGrapplingHookForceMultiplier.e((byte) 123);
        GetPhysicsCollisionPhantomForceMultiplier.a(51);
        SetPhysicsCollisionPhantomForceMultiplier.a(124);
        GetDebrisDetachmentForceMultiplier.b(true);
        GetGrappleDebris.a(54);
        SetGrappleDebris.e((byte) 56);
        GetDebrisGrabbingRange.a(55);
        SetDebrisGrabbingRange.e((byte) 112);
        GetDebrisMax.e((byte) -61);
        GetMissionVotes.e((byte) -127);
        SetMissionVotes.a(-78);
        GetMutatorVotes.e((byte) 95);
        SetMutatorVotes.a(122);
        GetMissionTimeLimit.a(-75);
        SetArmageddonTimerStart.e((byte) 126);
        SetArmageddonWarning.b(true);
        GetArmageddonLength.f((byte) 66);
        SetArmageddonLength.e((byte) -41);
        GetMissionTerrainAsteroidProbability.e((byte) -117);
        GetMissionTerrainDebrisProbability.b(true);
        SetMissionTerrainDebrisProbability.a(12124934);
        GetMissionTerrainSpaceProbability.b(!param0 ? true : false);
        GetMissionTerrainVotingChancestep.b(true);
        GetMissionDebrisDefaultProbability.b(!param0 ? true : false);
        SetMissionDebrisDefaultProbability.a(-10441);
        GetMissionDebrisVotingChancestep.a(69);
        SetMissionDebrisVotingChancestep.e((byte) 112);
        SetResourceNodeCaptureTime.a(70);
        GetMissionResnetResourceTickTime.a(-124);
        SetMassDriverRandomness.b(true);
        GetLaserRandomness.a(-26081);
        SetLaserRandomness.b(!param0 ? true : false);
        GetBombletSprayRandomness.e(-15435);
        SetBombletSprayRandomness.a(-612363640);
        GetPhasedEnergyBeamRandomness.a(76);
        SetPhasedEnergyBeamRandomness.a(23518);
        GetSniperCannonRandomness.a(-27645);
        SetSniperCannonRandomness.e((byte) 42);
        GetMissileLauncherRandomness.a(32);
        SetMissileLauncherRandomness.a(122);
        GetPointDefenceLaserRandomness.b(true);
        SetPointDefenceLaserRandomness.a(6);
        GetCountermeasureLauncherRandomness.a(80);
        SetCountermeasureLauncherRandomness.a(1511754497);
        GetMassDriverProjectiles.a(-110);
        GetLaserProjectiles.a(32);
        SetLaserProjectiles.e((byte) -96);
        GetBombletSprayProjectiles.b(true);
        SetBombletSprayProjectiles.e((byte) -27);
        SetPhasedEnergyBeamProjectiles.a(-60);
        GetTorpedoProjectiles.a(85);
        SetTorpedoProjectiles.a(-28228);
        GetSniperCannonProjectiles.e((byte) -119);
        SetSniperCannonProjectiles.e((byte) -8);
        SetMissileLauncherProjectiles.a(27154);
        GetPointDefenceLaserProjectiles.a(0);
        SetPointDefenceLaserProjectiles.a(88);
        SetCountermeasureLauncherProjectiles.a(89);
        GetMassDriverProjectileLife.a(21584);
        SetMassDriverProjectileLife.e((byte) 127);
        SetTorpedoProjectileLife.e((byte) 102);
        GetBombletSprayProjectileLife.a(92);
        SetBombletSprayProjectileLife.e((byte) -115);
        GetSniperCannonProjectileLife.a(4);
        SetSniperCannonProjectileLife.e((byte) -87);
        GetMissileLauncherProjectileLife.e((byte) 127);
        SetMissileLauncherProjectileLife.a(6425);
        GetCountermeasureLauncherProjectileLife.a(-87);
        SetDefaultFiringLeeway.b(!param0 ? true : false);
        SetSniperCannonFiringLeeway.e((byte) -97);
        GetMassDriverFireForce.a(127);
        SetMassDriverFireForce.f((byte) 106);
        SetTorpedoFireForce.b(false);
        GetBombletSprayFireForce.e((byte) -91);
        GetPhasedEnergyBeamFireForce.a(617169759);
        SetMachineGunFireForce.a(0);
        SetSniperCannonFireForce.a(-114);
        SetMissileLauncherFireForce.a(-17297);
        SetPointDefenceLaserFireForce.a(1600);
        SetCountermeasureLauncherFireForce.a(107);
        GetMassDriverReload.b(true);
        SetMassDriverReload.e(-20005);
        GetTorpedoReload.a(194);
        SetTorpedoReload.a(109);
        GetLaserReload.e((byte) 119);
        GetBombletSprayReload.a(-20626);
        SetBombletSprayReload.a(0);
        GetPhasedEnergyBeamReload.a(-100);
        SetPhasedEnergyBeamReload.e((byte) 101);
        SetMachineGunReload.e((byte) -16);
        GetSniperCannonReload.a(-1);
        GetFighterBayReload.a(16086);
        GetPointDefenceLaserReload.a(116);
        GetMassDriverAimspeed.a(117);
        GetTorpedoAimspeed.e((byte) 57);
        GetLaserAimspeed.e(117);
        GetFighterBayAimspeed.e((byte) 99);
        SetFighterBayAimspeed.e((byte) 65);
        GetSpinningBladeAimspeed.e((byte) -125);
        GetSniperCannonAimspeed.a(100);
        GetBombletSprayAimspeed.e((byte) 71);
        SetBombletSprayAimspeed.a(15110);
        GetPhasedEnergyBeamAimspeed.a(-29417);
        SetPhasedEnergyBeamAimspeed.a(0);
        GetMachineGunAimspeed.a(125);
        SetMachineGunAimspeed.e((byte) -78);
        GetGrapplingHookAimspeed.a(-1);
        GetMissileLauncherAimspeed.a(127);
        SetMissileLauncherAimspeed.e((byte) 53);
        GetPointDefenceLaserAimspeed.a(-120);
        SetCountermeasureLauncherAimspeed.a(-52);
        SetMassDriverAimarc.e((byte) -25);
        GetTorpedoAimarc.e((byte) 108);
        SetTorpedoAimarc.a(63);
        GetLaserAimarc.e((byte) -116);
        SetLaserAimarc.e((byte) -80);
        GetFighterBayAimarc.a(69);
        GetSpinningBladeAimarc.e((byte) 92);
        SetSniperCannonAimarc.e((byte) -99);
        GetBombletSprayAimarc.e(-1);
        SetBombletSprayAimarc.e((byte) -80);
        GetPhasedEnergyBeamAimarc.a(16);
        GetMachineGunAimarc.a(-116);
        SetMachineGunAimarc.a(14675);
        SetGrapplingHookAimarc.a(0);
        GetPointDefenceLaserAimarc.e((byte) 21);
        SetPointDefenceLaserAimarc.e((byte) 107);
        SetCountermeasureLauncherAimarc.a(-92);
        GetMassDriverProjectileDamage.b(!param0 ? true : false);
        SetMassDriverProjectileDamage.a(9099);
        GetTorpedoProjectileDamage.a(-124);
        SetTorpedoProjectileDamage.a(0);
        GetLaserBeamProjectileDamage.a(7848);
        GetMachineGunProjectileDamage.a(0);
        SetMachineGunProjectileDamage.a(146);
        SetSniperCannonProjectileDamage.e((byte) 97);
        GetBombletSprayProjectileDamage.e((byte) -102);
        SetBombletSprayProjectileDamage.e((byte) -102);
        SetExplosionProjectileDamage.a(-123);
        GetPointDefenceLaserProjectileDamage.e((byte) -127);
        GetPointDefenceLaserProjectileInterceptDamage.a(0);
        SetPointDefenceLaserProjectileInterceptDamage.a(-982);
        GetMassDriverProjectileOndamageParticles.a(-59);
        SetTorpedoProjectileOndamageParticles.a(153);
        SetPhasedEnergyBeamProjectileOndamageParticles.a(-2573);
        GetSniperCannonProjectileOndamageParticles.e((byte) 15);
        SetSniperCannonProjectileOndamageParticles.a(-17548);
        SetBombletSprayProjectileOndamageParticles.a(76);
        SetPointDefenceLaserProjectileOndamageParticles.a(0);
        GetMassDriverEnergyUsed.e((byte) 118);
        SetMassDriverEnergyUsed.b(!param0 ? true : false);
        GetLaserEnergyUsed.a(0);
        SetLaserEnergyUsed.f((byte) 92);
        GetBombletSprayEnergyUsed.e((byte) 62);
        SetPhasedEnergyBeamEnergyUsed.a(163);
        GetMachineGunEnergyUsed.b(false);
        SetMachineGunEnergyUsed.b(!param0 ? true : false);
        GetSniperCannonEnergyUsed.a(118);
        SetSniperCannonEnergyUsed.e((byte) -113);
        GetMissileLauncherEnergyUsed.a(-10515);
        SetMissileLauncherEnergyUsed.a(-17);
        GetCountermeasureLauncherEnergyUsed.b(false);
        SetCountermeasureLauncherEnergyUsed.e((byte) 28);
        GetPointDefenceLaserEnergyUsed.a(12992);
        SetPointDefenceLaserEnergyUsed.e((byte) -99);
        GetTorpedoAcceleration.a(0);
        SetTorpedoAcceleration.a(169);
        SetVelocitySustain.a(-107);
        GetAngularVelocitySustain.e((byte) 83);
        SetAngularVelocitySustain.a(-25544);
        GetThrusterParticleSpeedDownshift.a(176);
        SetThrusterParticleSpeedDownshift.e((byte) 84);
        GetThrusterParticleLife.a(177);
        SetThrusterParticleLife.a(127);
        GetAngularForceDownshift.a(64);
        SetAngularForceDownshift.e((byte) -118);
        GetAngularVelocitySustainMax.a(0);
        GetTorqueDownshift.a(2);
        GetMomentOfInertiaPredivideDownshift.e((byte) 126);
        SetMomentOfInertiaPredivideDownshift.e((byte) 69);
        GetMomentOfInertiaPerpointCalcDownshift.a(0);
        SetMomentOfInertiaPerpointCalcDownshift.a(113);
        GetSpinningBladeTopSpeed.a(-120);
        SetSpinningBladeTopSpeed.a(-19013);
        SetSpinningBladeSpinupSpeed.a(21942);
        GetSpinningBladeSpindamageMultiplier.b(false);
        SetSpinningBladeSpindamageMultiplier.e((byte) -122);
        GetPhasedEnergyBeamPulsetime.f((byte) 51);
        SetPhasedEnergyBeamPulsetime.e((byte) -71);
        GetPhasedEnergyBeamPulseFadetime.e((byte) 65);
        GetMachineGunPulsetime.e((byte) -28);
        SetMachineGunPulsetime.a(-105);
        GetBombletSprayPushMultiplier.a(-122);
        SetBombletSprayPushMultiplier.e(0);
        GetExplosionPushMultiplier.a(80);
        SetExplosionPushMultiplier.e((byte) -89);
        GetAiFiringRangeUpshift.e((byte) -118);
        SetAiFiringRangeUpshift.a(26468);
        GetWorldWidthUpshift.e(193);
        GetWeaponParticleSpeedDownshift.a(-33);
        SetWeaponParticleSpeedDownshift.a(7069);
        GetWeaponProjectileSpeedMultiply.f((byte) -125);
        SetWeaponProjectileSpeedMultiply.a(0);
        SetRespawnTime.a(67);
        SetGrapplingHookMaxLength.e((byte) -52);
        GetGrapplingHookFireForce.a(0);
        SetGrapplingHookFireForce.e((byte) 57);
        GetGrapplingHookSpringConstant.b(true);
        SetGrapplingHookSpringConstant.a(200);
        SetGrapplingHookMaxExtension8Force.a(17231);
        GetGrapplingHookCooldown.a(-120);
        SetGrapplingHookCooldown.e((byte) -63);
        GetGrapplingHookRopeChangeRate.a(-14010);
        GetGrapplingHookRopeBreakLength.a(204);
        SetGrapplingHookRopeBreakLength.a(235);
        GetMissilesCooldown.a(124);
        GetMissilesExplosionPower.a(3);
        SetMissilesExplosionPower.a(0);
        SetMissilesAcceleration.a(207);
        SetMissilesTopSpeed.e((byte) -90);
        GetShieldsToggleCooldown.e((byte) 123);
        SetShieldsDirectionalIdleEnergyUsage.e((byte) 0);
        GetShieldsDirectionalArc.a(-29044);
        SetShieldsDirectionalArc.e((byte) 121);
        GetShieldsDamageEnergyConversion.e((byte) -101);
        SetShieldsDamageEnergyConversion.a(-126);
        GetRepairModeCooldown.e((byte) 91);
        GetRepairModeActiveTime.a(215);
        GetRepairModeRadius.a(-99);
        SetRepairModeRadius.e(-105);
        GetRepairModePower.b(false);
        SetRepairModePower.e((byte) -33);
        GetBoostersCooldown.e((byte) -121);
        GetBoostersActiveTime.e((byte) 84);
        SetCountermeasuresPulsetime.a(-123);
        GetCountermeasuresCooldown.a(221);
        SetCountermeasuresCooldown.a(0);
        GetCountermeasuresPulseRadius.a(16407);
        SetCountermeasuresPulseRadius.a(-27266);
        GetSelfDestructTimer.a(225);
        SetSelfDestructTimer.a(-26016);
        GetPlayerRepairTime.a(8);
        SetPlayerRepairTime.a(14055);
        GetPlayerRepairAmount.a(103);
        SetPlayerRepairAmount.a(-128);
        GetAiRepairTime.a(46);
        SetFighterRepairTime.a(0);
        GetFighterRepairAmount.e((byte) -106);
        SetFighterRepairAmount.e((byte) -15);
        GetReadyRoomMissionTime.a(232);
        GetReadyRoomMutatorTime.e((byte) 49);
        SetReadyRoomMutatorTime.a(233);
        GetReadyRoomTeamTime.e((byte) 91);
        bab.a(true);
        fob.a(75);
        rc.a(540800);
        vlb.a(-104);
        ada.a(-1);
        wga.a(-1);
        uk.c((byte) 67);
        tib.f(6312);
        ocb.d((byte) 126);
        rm.f(2);
        wgb.f(68);
        vqa.f(1);
        oe.a((byte) 94);
        hob.c((byte) -63);
        sc.c(123);
        ola.b(2);
        glb.b(-17471);
        rv.a(-1);
        vib.a(84);
        bca.a(-115);
        pab.a(false);
        ev.a(28378);
        eu.b(30826);
        cp.a((byte) -127);
        dib.a((byte) 89);
        lkb.a(199);
        mmb.a(2);
        dgb.a(false);
        this.field_F = null;
        this.field_u = null;
    }

    private final boolean h(byte param0) {
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
          VoidHunters.a(true, (Object) null);
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

    final void b(int param0) {
        GetBurstFireRegenerationRate.b(false);
        if (null != psb.field_b) {
          VariableCondition.b((byte) 86);
        }
        NodeHashTableIterator.a(1);
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
        faa stackIn_118_0 = null;
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
              ndb.field_a.a((byte) 98, var4 != 0);
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
                  RequestNewestBlackboxRecording.field_p.h(24335, 69);
                  stackIn_118_0 = RequestNewestBlackboxRecording.field_p;
                  stackIn_118_1 = 0;
                  if (mjb.field_e) {
                    stackIn_119_2 = 1;
                  } else {
                    stackIn_119_2 = 0;
                  }
                  ((faa) (Object) stackIn_118_0).c(stackIn_118_1, stackIn_119_2);
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
                ndb.field_a.d((byte) -111);
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
          if (PlayerVote.field_c.d(0) != null) {
            fieldTemp$0 = wva.field_b + 1;
            wva.field_b = wva.field_b + 1;
            if (fieldTemp$0 == 335) {
              wva.field_b = 0;
              PlayerVote.field_c.a(true);
            }
          }
        }
        if (wgb.field_f == -3) {
          wu.a(false, false);
        }
        if (-4 == wgb.field_f) {
          RequestNewestBlackboxRecording.field_p.h(24335, 9);
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
        this.g((byte) -127);
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
            this.field_F = new phb(0, 0);
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

    final void d(int param0) {
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
          var3 = (hua) (PlayerVote.field_c.d(0));
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
              IntrusiveNode.a((phb[]) null, 8, 0, (phb[]) null, (phb[]) null, 8555923, 0, 15658751, 15658751, SetMpSandboxEnemySpawnLimit.field_p, dma.field_j / 2, 0, 0, -14109, dma.field_g / 2);
              var4_int = 16;
              var5_intLifetime2 = var4_int + SetUseNiceTrails.a(0);
              var6 = var4_int + SetShieldsDirectionalArc.a(-22954);
              var7 = GetBombletSprayEnergyUsed.field_p.width / 2 - var5_intLifetime2 / 2;
              var8 = -(var6 / 2) + GetBombletSprayEnergyUsed.field_p.height / 2;
              af.a((byte) -115, 255, var6, var7, var8 - 1, var5_intLifetime2);
              if (this.field_F == null) {
                this.field_F = new phb(0, 0);
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
