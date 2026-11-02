/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ms extends GameApplet {
    private boolean field_x;
    private int field_r;
    static int[] field_A;
    private int field_w;
    static IntrusiveDeque field_y;
    private int field_v;
    private boolean field_z;
    private long field_t;
    private int field_q;
    private boolean field_s;
    String field_u;
    private int field_o;
    private int field_p;

    private final void d(byte param0) {
        if (param0 != -116) {
          this.e((byte) 92);
        }
        String var2 = mea.a(true);
        wva.a(MissionList.b((byte) -119), (byte) 56, var2);
    }

    final int f(int param0) {
        int var2;
        if (param0 < 34) {
          this.a(83, 93, -32, 71, -33, -12, false, -123);
        }
        if (this.field_c) {
          return -1;
        }
        if (!SetWeaponProjectileSpeedMultiply.b(true)) {
          return -1;
        }
        if (GetSpinningBladeAimarc.field_o) {
          return -1;
        }
        var2 = GetPhasedEnergyBeamPulseFadetime.a(this.field_x, this.field_r, LoadBlackboxRecording.a(125), (byte) 13, true, fpb.d(true));
        if (var2 == -1) {
          return -1;
        }
        if (var2 == 0) {
          if (GetSpinningBladeAimspeed.field_q != 11) {
            return var2;
          }
          if (0 != MapClearanceArea.field_a) {
            return var2;
          }
          uk.b((byte) 50);
          return var2;
        }
        if (var2 != 1) {
          if (!SetAudioRangeCutoff.field_q) {
            this.a("reconnect", 0);
          }
          km.f((byte) -119);
          SetMessageFadetime.a(dgb.field_b, (byte) 72, var2);
          GetSpinningBladeAimarc.field_o = true;
          ska.field_p = wt.a(false) + 15000L;
        } else {
          if (GetSpinningBladeAimspeed.field_q == 11 &&
            0 == MapClearanceArea.field_a) {
            uk.b((byte) 50);
          }
        }
        return var2;
    }

    final void h(int param0) {
        int discarded$28 = 0;
        int discarded$29 = 0;
        int var3;
        int stackIn_5_1 = 0;
        boolean stackIn_5_2 = false;
        Object stackIn_6_0;
        boolean stackIn_6_3;
        var3 = VoidHunters.field_G;
        if (param0 != 0) {
          this.a((byte) 6, false);
        }
        if (!eu.a(true)) {
          if (ef.field_z >= 10) {
            if (!lm.a(true)) {
              wkb.b((byte) 6);
            } else {
              if (GetSpinningBladeAimspeed.field_q != 0) {
                GetLagOut.a(GetPointDefenceLaserPulsetime.field_o, param0 ^ 15877);
              } else {
                discarded$28 = this.a((byte) -96, false, false);
              }
            }
          }
        } else {
          stackIn_5_1 = -102;
          stackIn_5_2 = false;
          if (psb.field_b == null) {
            stackIn_6_0 = this;
            stackIn_6_3 = false;
          } else {
            stackIn_6_0 = this;
            stackIn_6_3 = true;
          }
          discarded$29 = this.a((byte) stackIn_5_1, stackIn_5_2, stackIn_6_3);
        }
    }

    final void b(boolean param0, int param1) {
        int stackIn_23_0 = 0;
        boolean stackIn_102_0 = false;
        int stackIn_104_1 = 0;
        boolean stackIn_105_2 = false;
        int stackIn_133_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = VoidHunters.field_G;
        if (efb.field_b != null) {
          if (psb.field_b == null) {
            var6 = etb.b(-28941);
            var4 = var6.getSize();
            efb.field_b.c(param1 ^ 109, var4.width, var4.height);
          }
          efb.field_b.d(param1 + 3899);
        }
        GetMassDriverFireForce.e((byte) -101);
        ts.a(1001);
        if (param1 != 9) {
          this.field_w = 76;
        }
        if (!GetUseTriFill.a(45) &&
          GetSpinningBladeAimspeed.field_q != 11) {
          csb.a(true);
        }
        if (null != GetWaitForPlayers.field_o) {
          GetPointDefenceLaserPulsetime.field_o = GetWaitForPlayers.field_o.b(1);
        }
        if (wh.g(-126)) {
          var3 = 1200 * SetGrapplingHookRopeBreakLength.e(204);
          if (this.field_s ||
            !(var3 >= SetPedrosRepairModeSwitchtime.a(32)) &&
            !(gia.d(-2) <= var3)) {
            this.field_s = false;
            ifb.l(-123);
            km.f((byte) -119);
            SetMessageFadetime.a(GetSpinningBladeSpindamageMultiplier.field_o, (byte) 105, 2);
            GetSniperCannonFiringLeeway.a(-10560);
            GetSpinningBladeAimarc.field_o = true;
            ska.field_p = 15000L + wt.a(false);
          }
        }
        if (-1 == MapClearanceArea.field_a ||
          MapClearanceArea.field_a == 0) {
          stackIn_23_0 = (-1 != MapClearanceArea.field_a) ? 0 : 1;
          var3Lifetime1 = stackIn_23_0;
          MapClearanceArea.field_a = GetGrapplingHooksDamageableBySourcePlayer.a(-124);
          if (var3Lifetime1 != 0 &&
            0 == MapClearanceArea.field_a &&
            GetSpinningBladeAimspeed.field_q == 11 &&
            !SetWeaponProjectileSpeedMultiply.b(true)) {
            uk.b((byte) 123);
          }
          if (MapClearanceArea.field_a != -1 &&
            MapClearanceArea.field_a != 0) {
            ska.field_p = wt.a(false) + 15000L;
          }
        }
        if (-1 != MapClearanceArea.field_a &&
          MapClearanceArea.field_a != 0) {
          if (10 <= ef.field_z) {
            if (10 <= GetSpinningBladeAimspeed.field_q) {
              km.f((byte) -119);
              if (MapClearanceArea.field_a == 3) {
                SetMessageFadetime.a(GetUseFilledPolygons.field_o, (byte) 84, 256);
              } else {
                if (MapClearanceArea.field_a != 4) {
                  if (MapClearanceArea.field_a != 2) {
                    if (5 != MapClearanceArea.field_a) {
                      SetMessageFadetime.a(SetDebugLineLife.field_o, (byte) 82, 256);
                    } else {
                      SetMessageFadetime.a(RoundResult.field_a, (byte) 121, 5);
                    }
                  } else {
                    SetMessageFadetime.a(MissionControl.field_f, (byte) 110, 256);
                  }
                } else {
                  SetMessageFadetime.a(cna.field_wb, (byte) 17, 256);
                }
              }
              GetSpinningBladeAimarc.field_o = true;
            }
          } else {
            if (MapClearanceArea.field_a == 3) {
              this.a("js5crc", 0);
            } else {
              if (MapClearanceArea.field_a != 4) {
                if (MapClearanceArea.field_a != 2) {
                  if (MapClearanceArea.field_a != 5) {
                    this.a("js5connect", 0);
                  } else {
                    this.a("outofdate", 0);
                  }
                } else {
                  this.a("js5connect_full", 0);
                }
              } else {
                this.a("js5io", 0);
              }
            }
          }
        }
        if ((-1 != MapClearanceArea.field_a &&
          MapClearanceArea.field_a != 0 ||
          SetWeaponProjectileSpeedMultiply.b(true)) &&
          wt.a(false) >= ska.field_p) {
          GetSpinningBladeAimarc.field_o = false;
          if (-1 != MapClearanceArea.field_a &&
            MapClearanceArea.field_a != 0) {
            MapClearanceArea.field_a = -1;
            bna.e(0);
          }
        }
        if (MapClearanceArea.field_a == 0 &&
          !SetWeaponProjectileSpeedMultiply.b(true)) {
          dga.field_a = false;
        }
        if (0 == ef.field_z &&
          ThrusterBehaviour.a(param1 - 90)) {
          ef.field_z = 1;
        }
        if (1 == ef.field_z) {
          if (0 != SetGrapplingHookAimarc.field_p) {
            ppb.field_a = bea.a(1, GrappleLauncherBehaviour.field_f);
          }
          btb.field_b = SetDebrisFoundInPairs.a(1, GetShieldsDirectionalArc.field_p, 106, true, false);
          GetSalvoUsesAllEnergy.field_o = SetDebrisFoundInPairs.a(1, SetFighterRepairAmount.field_p, 97, true, false);
          gdb.field_i = SetDebrisFoundInPairs.a(1, GetThrusterBindingMoveAndTurnHasOppositeMove.field_p, 81, true, false);
          ef.field_z = 2;
          GetMassDriverReload.field_o = btb.field_b;
          GetShieldsDirectionalArc.field_r = GetSalvoUsesAllEnergy.field_o;
        }
        if (ef.field_z == 2) {
          if (null != ppb.field_a &&
            ppb.field_a.b((byte) -81)) {
            if (ppb.field_a.a(true, "")) {
              if (ppb.field_a.a(32171, "")) {
                dga.a(true, ppb.field_a);
                ppb.field_a = null;
                fkb.a(2096);
              }
            } else {
              ppb.field_a = null;
            }
          }
          if (null == ppb.field_a) {
            ef.field_z = 3;
          }
        }
        if (ef.field_z == 3 &&
          SetBombletSprayEnergyUsed.a(GetSalvoUsesAllEnergy.field_o, 2, gdb.field_i, btb.field_b) &&
          GetUseOffscreenRendering.a(-20230, gdb.field_i)) {
          mta.b((byte) 123);
          GetPhasedEnergyBeamFireForce.b(false);
          mnb.field_g = SetFighterRepairTime.field_o;
          djb.field_r = false;
          GetUseCircleOutline.a(GetRespawnTime.field_o, GetSalvoUsesAllEnergy.field_o, btb.field_b, gdb.field_i, false);
          if (jb.field_a ||
            gtb.field_a != null) {
            stackIn_102_0 = !(jb.field_a);
            stackIn_104_1 = param1 ^ -110;
            stackIn_105_2 = !(jb.field_a);
            SetSniperCannonAimspeed.a(stackIn_102_0, stackIn_104_1, stackIn_105_2, gtb.field_a);
          }
          if (tc.field_a) {
            pr.a(param1 + 17487);
          }
          if (null == SetReverbFeedback.field_p) {
            SetReverbFeedback.field_p = bia.a(true);
            EscapePod.field_j = lwa.e((byte) 73);
          }
          GetSpinningBladeSpindamageMultiplier.a((byte) 55, gdb.field_i, EscapePod.field_j, SetReverbFeedback.field_p);
          GetSalvoUsesAllEnergy.field_o = null;
          gdb.field_i = null;
          btb.field_b = null;
          qd.a(0, (java.applet.Applet) (this));
          fkb.a(2096);
          ef.field_z = 10;
        }
        if (10 == ef.field_z) {
          if (0 != SetGrapplingHookAimarc.field_p) {
            esb.field_j = bea.a(1, GetFullMissionSet.field_o);
          }
          ef.field_z = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (ef.field_z == 11) {
          if (esb.field_j != null && (!esb.field_j.b((byte) -38) ||
            !esb.field_j.a(param1 ^ 113))) {
            IncrementVariableAction.a(SetMomentOfInertiaPerpointCalcDownshift.a(-93, esb.field_j, ocb.field_i, lo.field_d), -1, 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            GetMissionTerrainDebrisProbability.field_o = true;
            ef.field_z = 12;
          }
        }
        if (ef.field_z == 12 &&
          !GetMissionTerrainDebrisProbability.field_o) {
          ef.field_z = 13;
        }
        if (ef.field_z == 13) {
          var3Lifetime2 = 1;
          if (null != rab.field_m) {
            stackIn_133_0 = (!rab.field_m.a((byte) 87)) ? 0 : 1;
            var3Lifetime2 = stackIn_133_0;
            IncrementVariableAction.a(rab.field_m.field_a, -1, rab.field_m.field_g);
          }
          if (var3Lifetime2 != 0) {
            ef.field_z = 20;
          }
        }
        if (!param0 &&
          GetDebrisSurvives.field_q) {
          kl.a(igb.field_a, -125);
          this.c(-81);
          SetGrapplingHookCooldown.a((byte) -62, igb.field_a);
        }
        if (SetBombletSprayProjectileLife.field_o[8]) {
          GetCountermeasureLauncherFireForce.a(param1 ^ 1);
        }
    }

    private final void g(int param0) {
        SetBombletSprayProjectileLife.field_o[11] = true;
        SetBombletSprayProjectileLife.field_o[12] = true;
        SetBombletSprayProjectileLife.field_o[13] = true;
        int var2 = -95 % ((param0 - 24) / 37);
    }

    final int c(boolean param0, int param1) {
        if (param1 != -9288) {
          this.g(-79);
        }
        return this.a((byte) 60, true, param0);
    }

    private final void k(int param0) {
        ta.field_b[12] = -1;
        ta.field_b[18] = 1;
        ta.field_b[10] = -1;
        ta.field_b[4] = -1;
        ta.field_b[1] = 16;
        ta.field_b[6] = -2;
        ta.field_b[3] = -1;
        ta.field_b[8] = -2;
        ta.field_b[2] = -2;
        ta.field_b[9] = -1;
        if (param0 >= -80) {
          this.field_s = true;
        }
        ta.field_b[11] = -1;
        ta.field_b[7] = -1;
        ta.field_b[13] = -1;
        ta.field_b[17] = -1;
        ta.field_b[16] = -1;
        ta.field_b[5] = -1;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4, boolean param5, boolean param6) {
        this.a((byte) 119, true);
        if (param3) {
          this.c(true);
        }
        if (param1) {
          this.i(30138);
        }
        if (param0) {
          this.e(true);
        }
        if (param6) {
          this.e((byte) -4);
        }
        if (param2) {
          this.f((byte) -1);
        }
        if (param5) {
          this.g(-121);
        }
        if (param4 != -4590) {
          this.c(true);
        }
    }

    final void a(String param0, int param1, int param2) {
        try {
          int var4_int = 1 % ((-20 - param1) / 33);
          this.a(param2, 480, 640, param0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ms.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static byte[] b(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 23100) {
            ms.d(true);
          }
          stackIn_3_0 = hw.field_e.a(param0, true, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ms.RA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void i(int param0) {
        if (param0 != 30138) {
          String var3 = (String) null;
          this.a((String) null, 57, -40);
        }
        SetBombletSprayProjectileLife.field_o[2] = true;
    }

    private final void e(boolean param0) {
        SetBombletSprayProjectileLife.field_o[4] = param0;
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          try {
            if (!this.b((byte) -114)) {
              return;
            }
            this.field_u = this.getCodeBase().getHost();
            var6 = this.field_u.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_x = stackIn_7_1;
            this.field_p = Integer.parseInt(this.getParameter("gameport1"));
            this.field_v = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_w = Integer.parseInt(var7);
            }
            this.field_q = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_t = Long.parseLong(this.getParameter("instanceid"));
            this.field_z = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_o = Integer.parseInt(var8);
            }
            if (this.field_o >= 5) {
              this.field_o = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_r = Integer.parseInt(var9);
            }
            tc.field_a = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(this.field_q, param4, param0, 7, param2, param3, param1);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            gna.a((Throwable) ((Object) var6_ref), (String) null, 0);
            this.a("crash", 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var6_ref2;
          stackIn_24_1 = new StringBuilder().append("ms.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        this.setBackground(java.awt.Color.black);
        SetGrapplingHookAimarc.field_p = this.field_o;
        aeb.a(SetGrapplingHookAimarc.field_p, 1);
        int var10 = -52 / ((-72 - param0) / 33);
        bmb.a(5000, this.field_v, 60, this.field_w, SetTorpedoProjectiles.field_o, this.field_t, this.field_u, this.field_z, this.field_p, this.field_q, param6, SetGrapplingHookAimarc.field_p, param3, 5000);
        sha.a(param3, this.field_u, this.field_p, this.field_v, (byte) -2, SetGrapplingHookAimarc.field_p, this.field_q, SetTorpedoProjectiles.field_o, this.field_w);
        ndb.b(47);
        GetWaitForPlayers.field_o = ghb.c((byte) -127);
        SetGrapplingHookCooldown.a((byte) 122, igb.field_a);
        GetShieldsDirectionalArc.field_p = param7;
        SetFighterRepairAmount.field_p = param5;
        GetFullMissionSet.field_o = param4;
        GrappleLauncherBehaviour.field_f = param2;
        GetThrusterBindingMoveAndTurnHasOppositeMove.field_p = param1;
        this.k(-92);
        GameKeyHandler.a((byte) 101);
    }

    final void a(boolean param0, int param1, int param2) {
        this.a(-119, cp.field_q.field_a, SetShipPersistence.field_r.field_a, param2, aw.field_Bb.field_a, pgb.field_b.field_a, param0, al.field_f.field_a);
        int var4 = -37 % ((param1 - 30) / 50);
    }

    private final void f(byte param0) {
        if (param0 != -1) {
          return;
        }
        SetBombletSprayProjectileLife.field_o[6] = true;
    }

    final void e(int param0) {
        int stackIn_31_0 = 0;
        boolean stackIn_32_1 = false;
        int var2;
        pgb var3;
        int var4;
        var4 = VoidHunters.field_G;
        var2 = ow.field_a;
        if (64 > var2 &&
          SetBombletSprayProjectileLife.field_o[var2]) {
          if (var2 == 0) {
            return;
          }
          regionExit1: {
            switch (var2) {
              case 1:
                je.a((byte) 113);
                break;
              case 4:
                SetLag.a(-8999);
                break;
              case 7:
                this.d((byte) -116);
                break;
              default:
                if (var2 != 11 &&
                  var2 != 12) {
                  switch (var2) {
                    case 13:
                      lob.a(true);
                      break regionExit1;
                    case 17:
                      this.j(3);
                      break regionExit1;
                    case 18:
                      GetAiRepairAmount.e(-96);
                      break regionExit1;
                    default:
                      gna.a((Throwable) null, "MGS1: " + SetCountermeasuresPulsetime.e(-13514), 0);
                      ifb.l(-123);
                      break regionExit1;
                  }
                }
                stackIn_31_0 = 47;
                stackIn_32_1 = (12 == var2);
                var3 = TrailHolder.a(stackIn_31_0, stackIn_32_1);
                hg.a((byte) 108, var3);
                break;
              case 16:
                al.a(-113);
                break;
              case 8:
                SetSalvoDamageMultiplier.a(SetTorpedoProjectiles.field_o, vja.field_a, qga.field_b, false);
                break;
              case 6:
                iw.k((byte) -38);
                break;
              case 5:
                GetArmageddonLength.e((byte) -128);
                break;
              case 3:
                SetSniperCannonRandomness.a(0);
                break;
              case 2:
                GetLaserAimspeed.a(1);
                break;
            }
          }
          if (param0 <= 57) {
            this.f(-115);
          }
          return;
        }
        gna.a((Throwable) null, "MGS2: " + SetCountermeasuresPulsetime.e(-13514), 0);
        ifb.l(-125);
    }

    private final void c(boolean param0) {
        SetBombletSprayProjectileLife.field_o[1] = param0;
    }

    private final void j(int param0) {
        int var2 = qga.field_b.e((byte) -124);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + vja.field_a;
        byte[] var5 = new byte[var4];
        qga.field_b.a(var4, 0, (byte) -50, var5);
        qp.a(var3 != 0, param0 ^ param0, MissionList.b((byte) -117), qpa.a((byte) -125, var5));
    }

    private final void a(byte param0, boolean param1) {
        SetBombletSprayProjectileLife.field_o[0] = true;
        SetBombletSprayProjectileLife.field_o[18] = true;
        SetBombletSprayProjectileLife.field_o[3] = true;
        if (param0 <= 40) {
          this.c(false, 74);
        }
        SetBombletSprayProjectileLife.field_o[7] = true;
        SetBombletSprayProjectileLife.field_o[17] = true;
        SetBombletSprayProjectileLife.field_o[8] = param1;
        SetBombletSprayProjectileLife.field_o[16] = true;
    }

    private final void e(byte param0) {
        SetBombletSprayProjectileLife.field_o[5] = true;
        if (param0 != -4) {
          String var3 = (String) null;
          ms.b((String) null, -15);
        }
    }

    private final int a(byte param0, boolean param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5 = 0;
          int var6_int = 0;
          Exception var6 = null;
          PacketBuffer var7 = null;
          String var8 = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          Boolean var12 = null;
          int var5Lifetime1;
          int var6_intLifetime1;
          var9 = VoidHunters.field_G;
          var4 = tia.a(false, GetPointDefenceLaserPulsetime.field_o, SetGrapplingHookAimarc.field_p, param2);
          if (0 == var4) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5 = qua.a(GetFixedaim.g((byte) -65), true, SetMachineGunFireForce.e(120));
            if (var5 != -1) {
              qga.a(dgb.field_b, var5, (byte) 70, gob.field_a);
              gob.field_a = null;
              dgb.field_b = null;
            }
            var12 = SetExplosionPushMultiplier.a(-127);
            if (var12 != null) {
              GetDebrisThrowable.a(12, var12.booleanValue());
            }
          }
          var5Lifetime1 = 60 % ((-49 - param0) / 41);
          if (var4 == 2) {
            var6_int = RoundResult.a(SetVariableAction.b(119), GetPointDefenceLaserRandomness.a(52), this.field_r, (byte) 111, LoadBlackboxRecording.a(88), etb.a(31065), fpb.d(true));
            if (-1 != var6_int) {
              wt.a(var6_int, -19342, gob.field_a, dgb.field_b);
              gob.field_a = null;
              dgb.field_b = null;
            }
          }
          if (3 == var4) {
            if (MapClearanceArea.field_a != -1 &&
              MapClearanceArea.field_a != 0) {
              MapClearanceArea.field_a = -1;
              bna.e(0);
            }
            if (param1) {
              GetSpinningBladeAimarc.field_o = false;
            } else {
              var6_intLifetime1 = GetPhasedEnergyBeamPulseFadetime.a(this.field_x, this.field_r, LoadBlackboxRecording.a(83), (byte) 13, false, fpb.d(true));
              if (var6_intLifetime1 != -1) {
                if (var6_intLifetime1 != 0) {
                  SetMessageFadetime.a(dgb.field_b, (byte) 110, var6_intLifetime1);
                  dgb.field_b = null;
                } else {
                  tia.field_C = SetTorpedoAimarc.field_p;
                  uk.b((byte) 49);
                  cgb.field_a = false;
                  GetSpinningBladeAimspeed.field_q = 10;
                }
              }
            }
          }
          if (4 == var4) {
            if (!GetRespawnTime.field_o) {
              GetSpinningBladeAimspeed.field_q = 10;
              cgb.field_a = true;
            } else {
              SetGrapplingHookRopeChangeRate.a(MissionList.b((byte) -84), -18209);
            }
          }
          if (5 == var4) {
            VoidHunters.a(MissionList.b((byte) -91), 4);
          }
          if (var4 == 6 &&
            djb.field_r) {
            GetSpinningBladeAimspeed.field_q = 10;
          }
          if (var4 == 7) {
            SetPedrosRepairModeSwitchtime.a(32, MissionList.b((byte) -86));
          }
          if (var4 == 8) {
            SetGrapplingHookRopeChangeRate.a(MissionList.b((byte) -90), -18209);
          }
          if (var4 == 9) {
            SetNebulaFadesOutWhenClose.a(17, MissionList.b((byte) -127));
          }
          if (var4 == 10) {
            RequestNewestBlackboxRecording.field_p.h(24335, 17);
          }
          if (11 == var4) {
            kr.a(MissionList.b((byte) -126), 5836);
          }
          if (var4 == 12) {
            lc.a((byte) 86, MissionList.b((byte) -126), GetToggledScoreboard.a(27158));
          }
          if (var4 == 13) {
            try {
              if (SetPhasedEnergyBeamReload.field_p == null) {
                SetPhasedEnergyBeamReload.field_p = new bi(SetTorpedoProjectiles.field_o, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (SetPhasedEnergyBeamReload.field_p.c(104)) {
                var7 = SetPhasedEnergyBeamReload.field_p.a(43);
                if (var7 != null) {
                  var8 = tja.a(0, 0, var7.position, var7.payload);
                  GetMissionTerrainNebulaProbability.a(var8, (byte) 122);
                } else {
                  var10 = (String) null;
                  GetMissionTerrainNebulaProbability.a((String) null, (byte) 125);
                }
                SetPhasedEnergyBeamReload.field_p = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              gna.a((Throwable) ((Object) var6), "S1", 0);
              var11 = (String) null;
              GetMissionTerrainNebulaProbability.a((String) null, (byte) 122);
              SetPhasedEnergyBeamReload.field_p = null;
            }
          }
          if (var4 == 15) {
            GetSpinningBladeAimspeed.field_q = 10;
          }
          if (16 == var4) {
            return 1;
          }
          if (var4 == 17) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(boolean param0) {
        field_y = null;
        if (param0) {
          field_y = (IntrusiveDeque) null;
        }
        field_A = null;
    }

    protected ms() {
    }

    static {
        field_A = new int[]{2, 3, 4, 6, 8};
    }
}
