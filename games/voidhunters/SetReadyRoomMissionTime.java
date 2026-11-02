/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetReadyRoomMissionTime extends ConsoleCommand {
    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.a(232, 62, arguments[0].a(79));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bq.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetReadyRoomMissionTime(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        Object stackIn_15_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_83_0 = null;
        Object stackIn_93_0 = null;
        Object stackIn_98_0 = null;
        Object var4;
        int var5;
        var5 = VoidHunters.field_G;
        uqb.field_h = param2 >> 1;
        if (param0) {
          GetComponentBreakingExplosionForceMultiplier.field_p = param3 >> 1;
          if (SetMachineGunPulsetime.e(0)) {
            if (param1 &&
              !upa.field_a) {
              SetMassDriverReload.a(6045);
              if (!upa.field_a) {
                GetTorpedoReload.field_q = uia.field_b;
                GetUseDetailLines.field_o = kc.field_b;
                GetBots.field_o = hu.field_b;
                ujb.field_c = SetDebrisPartitioned.field_o;
              } else {
                if (~uqb.field_h == ~kc.field_b &&
                  GetComponentBreakingExplosionForceMultiplier.field_p == uia.field_b) {
                  GetBots.field_o = hu.field_b;
                  ujb.field_c = SetDebrisPartitioned.field_o;
                  return;
                }
                GetTorpedoReload.field_q = GetTorpedoReload.field_q + (-GetComponentBreakingExplosionForceMultiplier.field_p + uia.field_b);
                GetUseDetailLines.field_o = GetUseDetailLines.field_o + (kc.field_b - uqb.field_h);
                GetUseDetailLines.field_o = Math.max(0, Math.min(param2 - 1, GetUseDetailLines.field_o));
                GetTorpedoReload.field_q = Math.max(0, Math.min(param3 - 1, GetTorpedoReload.field_q));
                if (null != psb.field_b) {
                  stackIn_15_0 = psb.field_b;
                } else {
                  stackIn_15_0 = igb.field_a;
                }
                var4 = stackIn_15_0;
                SetTorpedoProjectiles.field_o.a((java.awt.Component) (var4), GetComponentBreakingExplosionForceMultiplier.field_p, uqb.field_h, 14);
                GetBots.field_o = hu.field_b;
                ujb.field_c = SetDebrisPartitioned.field_o;
              }
              return;
            }
            if (!param1 &&
              upa.field_a) {
              SetSpinningBladeAimarc.e((byte) -128);
            }
          }
          if (!upa.field_a) {
            GetTorpedoReload.field_q = uia.field_b;
            GetUseDetailLines.field_o = kc.field_b;
          } else {
            if (~uqb.field_h != ~kc.field_b ||
              GetComponentBreakingExplosionForceMultiplier.field_p != uia.field_b) {
              GetTorpedoReload.field_q = GetTorpedoReload.field_q + (-GetComponentBreakingExplosionForceMultiplier.field_p + uia.field_b);
              GetUseDetailLines.field_o = GetUseDetailLines.field_o + (kc.field_b - uqb.field_h);
              GetUseDetailLines.field_o = Math.max(0, Math.min(param2 - 1, GetUseDetailLines.field_o));
              GetTorpedoReload.field_q = Math.max(0, Math.min(param3 - 1, GetTorpedoReload.field_q));
              if (null != psb.field_b) {
                stackIn_28_0 = psb.field_b;
              } else {
                stackIn_28_0 = igb.field_a;
              }
              var4 = stackIn_28_0;
              SetTorpedoProjectiles.field_o.a((java.awt.Component) (var4), GetComponentBreakingExplosionForceMultiplier.field_p, uqb.field_h, 14);
            }
          }
        } else {
          SetReadyRoomMissionTime.a(false, true, -60, -60);
          GetComponentBreakingExplosionForceMultiplier.field_p = param3 >> 1;
          if (!SetMachineGunPulsetime.e(0)) {
            if (!upa.field_a) {
              GetTorpedoReload.field_q = uia.field_b;
              GetUseDetailLines.field_o = kc.field_b;
            } else {
              if (~uqb.field_h != ~kc.field_b ||
                GetComponentBreakingExplosionForceMultiplier.field_p != uia.field_b) {
                GetTorpedoReload.field_q = GetTorpedoReload.field_q + (-GetComponentBreakingExplosionForceMultiplier.field_p + uia.field_b);
                GetUseDetailLines.field_o = GetUseDetailLines.field_o + (kc.field_b - uqb.field_h);
                GetUseDetailLines.field_o = Math.max(0, Math.min(param2 - 1, GetUseDetailLines.field_o));
                GetTorpedoReload.field_q = Math.max(0, Math.min(param3 - 1, GetTorpedoReload.field_q));
                if (null != psb.field_b) {
                  stackIn_41_0 = psb.field_b;
                } else {
                  stackIn_41_0 = igb.field_a;
                }
                var4 = stackIn_41_0;
                SetTorpedoProjectiles.field_o.a((java.awt.Component) (var4), GetComponentBreakingExplosionForceMultiplier.field_p, uqb.field_h, 14);
              }
            }
          } else {
            if (param1 &&
              !upa.field_a) {
              SetMassDriverReload.a(6045);
              if (!upa.field_a) {
                GetTorpedoReload.field_q = uia.field_b;
                GetUseDetailLines.field_o = kc.field_b;
                GetBots.field_o = hu.field_b;
                ujb.field_c = SetDebrisPartitioned.field_o;
                return;
              }
              if (~uqb.field_h == ~kc.field_b &&
                GetComponentBreakingExplosionForceMultiplier.field_p == uia.field_b) {
                GetBots.field_o = hu.field_b;
                ujb.field_c = SetDebrisPartitioned.field_o;
                return;
              }
              GetTorpedoReload.field_q = GetTorpedoReload.field_q + (-GetComponentBreakingExplosionForceMultiplier.field_p + uia.field_b);
              GetUseDetailLines.field_o = GetUseDetailLines.field_o + (kc.field_b - uqb.field_h);
              GetUseDetailLines.field_o = Math.max(0, Math.min(param2 - 1, GetUseDetailLines.field_o));
              GetTorpedoReload.field_q = Math.max(0, Math.min(param3 - 1, GetTorpedoReload.field_q));
              if (null != psb.field_b) {
                stackIn_83_0 = psb.field_b;
              } else {
                stackIn_83_0 = igb.field_a;
              }
              var4 = stackIn_83_0;
              SetTorpedoProjectiles.field_o.a((java.awt.Component) (var4), GetComponentBreakingExplosionForceMultiplier.field_p, uqb.field_h, 14);
              GetBots.field_o = hu.field_b;
              ujb.field_c = SetDebrisPartitioned.field_o;
              return;
            }
            if (param1) {
              if (!upa.field_a) {
                GetTorpedoReload.field_q = uia.field_b;
                GetUseDetailLines.field_o = kc.field_b;
              } else {
                if (~uqb.field_h != ~kc.field_b ||
                  GetComponentBreakingExplosionForceMultiplier.field_p != uia.field_b) {
                  GetTorpedoReload.field_q = GetTorpedoReload.field_q + (-GetComponentBreakingExplosionForceMultiplier.field_p + uia.field_b);
                  GetUseDetailLines.field_o = GetUseDetailLines.field_o + (kc.field_b - uqb.field_h);
                  GetUseDetailLines.field_o = Math.max(0, Math.min(param2 - 1, GetUseDetailLines.field_o));
                  GetTorpedoReload.field_q = Math.max(0, Math.min(param3 - 1, GetTorpedoReload.field_q));
                  if (null != psb.field_b) {
                    stackIn_57_0 = psb.field_b;
                  } else {
                    stackIn_57_0 = igb.field_a;
                  }
                  var4 = stackIn_57_0;
                  SetTorpedoProjectiles.field_o.a((java.awt.Component) (var4), GetComponentBreakingExplosionForceMultiplier.field_p, uqb.field_h, 14);
                }
              }
            } else {
              if (!upa.field_a) {
                if (!upa.field_a) {
                  GetTorpedoReload.field_q = uia.field_b;
                  GetUseDetailLines.field_o = kc.field_b;
                } else {
                  if (~uqb.field_h != ~kc.field_b ||
                    GetComponentBreakingExplosionForceMultiplier.field_p != uia.field_b) {
                    GetTorpedoReload.field_q = GetTorpedoReload.field_q + (-GetComponentBreakingExplosionForceMultiplier.field_p + uia.field_b);
                    GetUseDetailLines.field_o = GetUseDetailLines.field_o + (kc.field_b - uqb.field_h);
                    GetUseDetailLines.field_o = Math.max(0, Math.min(param2 - 1, GetUseDetailLines.field_o));
                    GetTorpedoReload.field_q = Math.max(0, Math.min(param3 - 1, GetTorpedoReload.field_q));
                    if (null != psb.field_b) {
                      stackIn_70_0 = psb.field_b;
                    } else {
                      stackIn_70_0 = igb.field_a;
                    }
                    var4 = stackIn_70_0;
                    SetTorpedoProjectiles.field_o.a((java.awt.Component) (var4), GetComponentBreakingExplosionForceMultiplier.field_p, uqb.field_h, 14);
                  }
                }
              } else {
                SetSpinningBladeAimarc.e((byte) -128);
                if (!upa.field_a) {
                  GetTorpedoReload.field_q = uia.field_b;
                  GetUseDetailLines.field_o = kc.field_b;
                } else {
                  if (~uqb.field_h != ~kc.field_b) {
                    GetTorpedoReload.field_q = GetTorpedoReload.field_q + (-GetComponentBreakingExplosionForceMultiplier.field_p + uia.field_b);
                    GetUseDetailLines.field_o = GetUseDetailLines.field_o + (kc.field_b - uqb.field_h);
                    GetUseDetailLines.field_o = Math.max(0, Math.min(param2 - 1, GetUseDetailLines.field_o));
                    GetTorpedoReload.field_q = Math.max(0, Math.min(param3 - 1, GetTorpedoReload.field_q));
                    if (null != psb.field_b) {
                      stackIn_93_0 = psb.field_b;
                    } else {
                      stackIn_93_0 = igb.field_a;
                    }
                    var4 = stackIn_93_0;
                    SetTorpedoProjectiles.field_o.a((java.awt.Component) (var4), GetComponentBreakingExplosionForceMultiplier.field_p, uqb.field_h, 14);
                  } else {
                    if (GetComponentBreakingExplosionForceMultiplier.field_p != uia.field_b) {
                      GetTorpedoReload.field_q = GetTorpedoReload.field_q + (-GetComponentBreakingExplosionForceMultiplier.field_p + uia.field_b);
                      GetUseDetailLines.field_o = GetUseDetailLines.field_o + (kc.field_b - uqb.field_h);
                      GetUseDetailLines.field_o = Math.max(0, Math.min(param2 - 1, GetUseDetailLines.field_o));
                      GetTorpedoReload.field_q = Math.max(0, Math.min(param3 - 1, GetTorpedoReload.field_q));
                      if (null != psb.field_b) {
                        stackIn_98_0 = psb.field_b;
                      } else {
                        stackIn_98_0 = igb.field_a;
                      }
                      var4 = stackIn_98_0;
                      SetTorpedoProjectiles.field_o.a((java.awt.Component) (var4), GetComponentBreakingExplosionForceMultiplier.field_p, uqb.field_h, 14);
                    }
                  }
                }
              }
            }
          }
        }
        GetBots.field_o = hu.field_b;
        ujb.field_c = SetDebrisPartitioned.field_o;
    }

    static {
    }
}
