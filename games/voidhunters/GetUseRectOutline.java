/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetUseRectOutline extends ConsoleCommand {
    final static void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, boolean param7, boolean param8, boolean param9) {
        int var11;
        var11 = VoidHunters.field_G;
        if (param7) {
          SetUseDetailLines.field_o = GetVelocitySustain.field_p;
          GetMissionTimeLimit.a(param7, true);
          if (lia.field_b > 0) {
            fdb.a(param0, param7, param5, (byte) 100);
          }
          SetAutozoomSpeedDivide.field_p.field_F = 1;
          SetAutozoomSpeedDivide.field_p.field_w = SetAutoAfkTimeout.field_q.field_w;
          if (nf.field_a > 0) {
            soa.a(param0, -99, param7, param5);
          }
          if (~SetExplosionPushMultiplier.field_p < param1) {
            fka.a(param5, (byte) 105, param8, param0, param7);
          }
          if (GetTorpedoProjectileDamage.field_o &&
            SetSpinningBladeSpindamageMultiplier.field_o.field_zb >= SetSpinningBladeSpindamageMultiplier.field_o.field_Fb) {
            DualLinkNode.field_f.field_y = false;
            tja.field_a.field_xb.field_R = SetPhasedEnergyBeamPulsetime.field_q;
            igb.a(tja.field_a.field_wb, (byte) -93);
          } else {
            tja.field_a.field_xb.field_R = null;
            DualLinkNode.field_f.field_y = true;
            SetTorpedoProjectiles.a(param6, (byte) 1, tja.field_a, param4, param5);
          }
        } else {
          if (GetShieldsDirectionalArcParticleLife.field_p != dma.field_g) {
            if (dma.field_j == SetClientSideDragging.field_q.field_b &&
              SetClientSideDragging.field_q.field_d == dma.field_g) {
              if (null == SetSpinningBladeSpindamageMultiplier.field_o) {
                if (null == SetThrusterParticleSpeedDownshift.field_o) {
                  SetGrapplingHookMinLength.a(5);
                } else {
                  ok.a((byte) 100, true);
                }
              } else {
                ok.a((byte) 100, false);
              }
            }
            if (!param7) {
              SetUseDetailLines.field_o = (GetShieldsDirectionalArcParticleLife.field_p - 640) / 2;
              GetMissionTimeLimit.a(param7, true);
              if (lia.field_b > 0) {
                fdb.a(param0, param7, param5, (byte) 100);
              }
              SetAutozoomSpeedDivide.field_p.field_F = 1;
              SetAutozoomSpeedDivide.field_p.field_w = SetAutoAfkTimeout.field_q.field_w;
              if (nf.field_a > 0) {
                soa.a(param0, -99, param7, param5);
              }
              if (~SetExplosionPushMultiplier.field_p < param1) {
                fka.a(param5, (byte) 105, param8, param0, param7);
              }
              if (GetTorpedoProjectileDamage.field_o &&
                SetSpinningBladeSpindamageMultiplier.field_o.field_zb >= SetSpinningBladeSpindamageMultiplier.field_o.field_Fb) {
                DualLinkNode.field_f.field_y = false;
                tja.field_a.field_xb.field_R = SetPhasedEnergyBeamPulsetime.field_q;
                igb.a(tja.field_a.field_wb, (byte) -93);
              } else {
                tja.field_a.field_xb.field_R = null;
                DualLinkNode.field_f.field_y = true;
                SetTorpedoProjectiles.a(param6, (byte) 1, tja.field_a, param4, param5);
              }
            } else {
              SetUseDetailLines.field_o = GetVelocitySustain.field_p;
              GetMissionTimeLimit.a(param7, true);
              if (lia.field_b > 0) {
                fdb.a(param0, param7, param5, (byte) 100);
              }
              SetAutozoomSpeedDivide.field_p.field_F = 1;
              SetAutozoomSpeedDivide.field_p.field_w = SetAutoAfkTimeout.field_q.field_w;
              if (nf.field_a > 0) {
                soa.a(param0, -99, param7, param5);
              }
              if (~SetExplosionPushMultiplier.field_p < param1) {
                fka.a(param5, (byte) 105, param8, param0, param7);
              }
              if (GetTorpedoProjectileDamage.field_o &&
                SetSpinningBladeSpindamageMultiplier.field_o.field_zb >= SetSpinningBladeSpindamageMultiplier.field_o.field_Fb) {
                DualLinkNode.field_f.field_y = false;
                tja.field_a.field_xb.field_R = SetPhasedEnergyBeamPulsetime.field_q;
                igb.a(tja.field_a.field_wb, (byte) -93);
              } else {
                tja.field_a.field_xb.field_R = null;
                DualLinkNode.field_f.field_y = true;
                SetTorpedoProjectiles.a(param6, (byte) 1, tja.field_a, param4, param5);
              }
            }
          } else {
            if (dma.field_j != SetGrapplingHookRopeBreakLength.field_p &&
              dma.field_j == SetClientSideDragging.field_q.field_b &&
              SetClientSideDragging.field_q.field_d == dma.field_g) {
              if (null == SetSpinningBladeSpindamageMultiplier.field_o) {
                if (null == SetThrusterParticleSpeedDownshift.field_o) {
                  SetGrapplingHookMinLength.a(5);
                } else {
                  ok.a((byte) 100, true);
                }
              } else {
                ok.a((byte) 100, false);
              }
            }
            if (!param7) {
              SetUseDetailLines.field_o = (GetShieldsDirectionalArcParticleLife.field_p - 640) / 2;
              GetMissionTimeLimit.a(param7, true);
              if (lia.field_b > 0) {
                fdb.a(param0, param7, param5, (byte) 100);
              }
              SetAutozoomSpeedDivide.field_p.field_F = 1;
              SetAutozoomSpeedDivide.field_p.field_w = SetAutoAfkTimeout.field_q.field_w;
              if (nf.field_a > 0) {
                soa.a(param0, -99, param7, param5);
              }
              if (~SetExplosionPushMultiplier.field_p < param1) {
                fka.a(param5, (byte) 105, param8, param0, param7);
              }
              if (GetTorpedoProjectileDamage.field_o &&
                SetSpinningBladeSpindamageMultiplier.field_o.field_zb >= SetSpinningBladeSpindamageMultiplier.field_o.field_Fb) {
                DualLinkNode.field_f.field_y = false;
                tja.field_a.field_xb.field_R = SetPhasedEnergyBeamPulsetime.field_q;
                igb.a(tja.field_a.field_wb, (byte) -93);
              } else {
                tja.field_a.field_xb.field_R = null;
                DualLinkNode.field_f.field_y = true;
                SetTorpedoProjectiles.a(param6, (byte) 1, tja.field_a, param4, param5);
              }
            } else {
              SetUseDetailLines.field_o = GetVelocitySustain.field_p;
              GetMissionTimeLimit.a(param7, true);
              if (lia.field_b > 0) {
                fdb.a(param0, param7, param5, (byte) 100);
              }
              SetAutozoomSpeedDivide.field_p.field_F = 1;
              SetAutozoomSpeedDivide.field_p.field_w = SetAutoAfkTimeout.field_q.field_w;
              if (nf.field_a > 0) {
                soa.a(param0, -99, param7, param5);
              }
              if (~SetExplosionPushMultiplier.field_p < param1) {
                fka.a(param5, (byte) 105, param8, param0, param7);
              }
              if (!GetTorpedoProjectileDamage.field_o) {
                tja.field_a.field_xb.field_R = null;
                DualLinkNode.field_f.field_y = true;
                SetTorpedoProjectiles.a(param6, (byte) 1, tja.field_a, param4, param5);
              } else {
                if (SetSpinningBladeSpindamageMultiplier.field_o.field_zb < SetSpinningBladeSpindamageMultiplier.field_o.field_Fb) {
                  tja.field_a.field_xb.field_R = null;
                  DualLinkNode.field_f.field_y = true;
                  SetTorpedoProjectiles.a(param6, (byte) 1, tja.field_a, param4, param5);
                } else {
                  DualLinkNode.field_f.field_y = false;
                  tja.field_a.field_xb.field_R = SetPhasedEnergyBeamPulsetime.field_q;
                  igb.a(tja.field_a.field_wb, (byte) -93);
                }
              }
            }
          }
        }
        me.a(param2, param6, param4, param9, param5, param3, (byte) 119);
        SetTorpedoProjectiles.a(param6, (byte) 1, rga.field_f, param4, param5);
        GetMissionTerrainNebulaProbability.field_o = GetMissionTerrainNebulaProbability.field_o + 1;
    }

    GetUseRectOutline(String param0, Class[] param1, String param2) {
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
            GetUseRectOutline.b(true);
          }
          stackIn_3_0 = new ConsoleValue(SetPointDefenceLaserReload.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rl.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          GetUseRectOutline.a(true, 69, -111, -75, true, 23, 116, false, false, true);
        }
        if (ar.field_d) {
          return;
        }
        if (fjb.field_c == null) {
          fjb.field_c = drb.a(true, 6);
        }
        if (!fjb.field_c.field_d) {
          return;
        }
        fab.a(-29365, fjb.field_c.field_f);
        fjb.field_c = null;
        ar.field_d = true;
        ilb.a((byte) -114);
        SetKeepTeamColours.a(15334);
    }

    static {
    }
}
