/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wha implements dja {
    static int field_a;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          return (tv[]) null;
        }
        return (tv[]) ((Object) new Asteroid[param1]);
    }

    final static void a(int param0) {
        if (param0 != 29012) {
          field_a = 71;
        }
        wga.field_a = new lwa(DualLinkNode.field_g, lo.field_b, GetFighterBayReload.field_p, qc.field_q, SetShieldsDirectionalArcParticleLife.field_o, GetMissionDebrisDefaultProbability.field_o);
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        String[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        String stackIn_60_2 = null;
        String[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        String stackIn_67_2 = null;
        int stackIn_87_0 = 0;
        boolean stackIn_88_1 = false;
        int stackIn_111_0 = 0;
        int stackIn_112_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = VoidHunters.field_G;
        try {
          GetMassDriverAimspeed.field_o = param2;
          SetAngularForceDownshift.field_o = true;
          if (GetMassDriverAimspeed.field_o == 0) {
            var3_int = wva.a(SetDebrisDetachmentForceMultiplier.field_o, ob.field_l, 0, dib.field_j, ShipBlueprint.field_a);
            var4 = var3_int + 3;
            bra.field_f = new String[var4];
            GetMessageMax.field_o = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              GetMessageMax.field_o[var5] = -1;
            }
            jeb.field_c = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              bra.field_f[var5] = ob.field_l[var5];
            }
            bra.field_f[var4 - 3] = "";
            bra.field_f[var4 - 2] = GetLaserBeamProjectileDamage.field_s;
            GetMessageMax.field_o[var4 - 2] = 0;
            jeb.field_c[0] = 4;
            bra.field_f[var4 - 1] = MissionCondition.field_b;
            GetMessageMax.field_o[-1 + var4] = 1;
            jeb.field_c[1] = 5;
          } else if (1 == GetMassDriverAimspeed.field_o) {
            var3_int = wva.a(SetDebrisDetachmentForceMultiplier.field_o, ob.field_l, 0, dib.field_j, ShipBlueprint.field_a);
            var4 = 2 + var3_int;
            bra.field_f = new String[var4];
            GetMessageMax.field_o = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              GetMessageMax.field_o[var5] = -1;
            }
            jeb.field_c = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              bra.field_f[var5] = ob.field_l[var5];
            }
            bra.field_f[-2 + var4] = "";
            bra.field_f[-1 + var4] = MissionCondition.field_b;
            GetMessageMax.field_o[var4 - 1] = 0;
            jeb.field_c[0] = 5;
          } else if (GetMassDriverAimspeed.field_o != 2) {
            if (GetMassDriverAimspeed.field_o == 3) {
              if (!SetTorpedoProjectiles.field_o.field_k) {
                var3_int = wva.a(SetDebrisDetachmentForceMultiplier.field_o, ob.field_l, 0, oda.field_t, ShipBlueprint.field_a);
              } else {
                var3_int = wva.a(SetDebrisDetachmentForceMultiplier.field_o, ob.field_l, param0 ^ 2, moa.field_n, ShipBlueprint.field_a);
              }
              var4 = 2 + var3_int;
              GetMessageMax.field_o = new int[var4];
              bra.field_f = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                GetMessageMax.field_o[var5] = -1;
              }
              jeb.field_c = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                bra.field_f[var5] = ob.field_l[var5];
              }
              bra.field_f[var4 - 2] = "";
              bra.field_f[var4 - 1] = MissionCondition.field_b;
              GetMessageMax.field_o[var4 - 1] = 0;
              jeb.field_c[0] = 5;
            } else if (GetMassDriverAimspeed.field_o == 4) {
              var3_int = wva.a(SetDebrisDetachmentForceMultiplier.field_o, ob.field_l, 0, r.field_m, ShipBlueprint.field_a);
              var4 = var3_int + 2;
              bra.field_f = new String[var4];
              GetMessageMax.field_o = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                GetMessageMax.field_o[var5] = -1;
              }
              jeb.field_c = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                bra.field_f[var5] = ob.field_l[var5];
              }
              bra.field_f[var4 - 2] = "";
              bra.field_f[var4 - 1] = MissionCondition.field_b;
              GetMessageMax.field_o[-1 + var4] = 0;
              jeb.field_c[0] = 5;
            } else {
              if (5 != GetMassDriverAimspeed.field_o) {
                throw new IllegalArgumentException();
              }
              var3_int = wva.a(SetDebrisDetachmentForceMultiplier.field_o, ob.field_l, param0 - 2, SetFighterRepairAmount.field_o, ShipBlueprint.field_a);
              var4 = 3 + var3_int;
              bra.field_f = new String[var4];
              GetMessageMax.field_o = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                GetMessageMax.field_o[var5] = -1;
              }
              jeb.field_c = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                bra.field_f[var5] = ob.field_l[var5];
              }
              bra.field_f[-3 + var4] = "";
              bra.field_f[-2 + var4] = GetShipToShipRamDamage.field_p;
              GetMessageMax.field_o[var4 - 2] = 0;
              jeb.field_c[0] = 3;
              bra.field_f[var4 - 1] = MissionCondition.field_b;
              GetMessageMax.field_o[var4 - 1] = 1;
              jeb.field_c[1] = 5;
            }
          } else {
            var3_int = wva.a(SetDebrisDetachmentForceMultiplier.field_o, ob.field_l, 0, SetReverbGain.a(wma.field_M, new String[]{"<br><%0><br>"}, param0 + 93), ShipBlueprint.field_a);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(ob.field_l[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            Projectile.field_k = new String[var4];
            cua.a(ob.field_l, 0, Projectile.field_k, 0, var4);
            GetFogOfWarSensorRange.field_p = new String[-var4 + (var3_int - 1)];
            cua.a(ob.field_l, var4 + 1, GetFogOfWarSensorRange.field_p, 0, -1 - var4 + var3_int);
            var3_int = wva.a(SetDebrisDetachmentForceMultiplier.field_o, ob.field_l, 0, SetReverbGain.a(SetPhasedEnergyBeamAimspeed.field_o, new String[]{"<br><%0><br>"}, 88), ShipBlueprint.field_a);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(ob.field_l[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            dha.field_q = new String[var4];
            cua.a(ob.field_l, 0, dha.field_q, 0, var4);
            GetMissileLauncherProjectileLife.field_o = new String[-var4 + (var3_int - 1)];
            cua.a(ob.field_l, var4 + 1, GetMissileLauncherProjectileLife.field_o, 0, -1 - var4 + var3_int);
            if (Projectile.field_k.length >= dha.field_q.length) {
              stackIn_49_0 = Projectile.field_k.length;
            } else {
              stackIn_49_0 = dha.field_q.length;
            }
            var5 = stackIn_49_0;
            if (GetMissileLauncherProjectileLife.field_o.length <= GetFogOfWarSensorRange.field_p.length) {
              stackIn_52_0 = GetFogOfWarSensorRange.field_p.length;
            } else {
              stackIn_52_0 = GetMissileLauncherProjectileLife.field_o.length;
            }
            var6 = stackIn_52_0;
            var7 = 7 - (-var5 - var6);
            bra.field_f = new String[var7];
            GetMessageMax.field_o = new int[var7];
            for (var8 = 0; var8 < var7; var8++) {
              GetMessageMax.field_o[var8] = -1;
            }
            bra.field_f[1] = amb.field_b;
            jeb.field_c = new int[2];
            bra.field_f[0] = kda.field_g;
            GetMessageMax.field_o[1] = 0;
            bra.field_f[4] = SetReloadBarHeight.field_p;
            GetMessageMax.field_o[3] = 1;
            bra.field_f[2] = GetFighterBayAimspeed.field_p;
            jeb.field_c[0] = 5;
            bra.field_f[3] = GetFighterRepairAmount.field_r;
            bra.field_f[5] = "";
            jeb.field_c[1] = 2;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_59_0 = bra.field_f;
              stackIn_59_1 = var8Lifetime2 + 6;
              if (0 > -var5 + var8Lifetime2 + dha.field_q.length) {
                stackIn_60_2 = "";
              } else {
                stackIn_60_2 = dha.field_q[dha.field_q.length + var8Lifetime2 - var5];
              }
              stackIn_59_0[stackIn_59_1] = stackIn_60_2;
            }
            bra.field_f[6 + var5] = null;
            GetMessageMax.field_o[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_64_0 = bra.field_f;
              stackIn_64_1 = var8Lifetime3 + (var5 + 7);
              stackIn_64_2 = ~var8Lifetime3;
              stackIn_64_3 = ~GetMissileLauncherProjectileLife.field_o.length;
              if (stackIn_64_2 > stackIn_64_3) {
                stackIn_67_2 = GetMissileLauncherProjectileLife.field_o[var8Lifetime3];
              } else {
                stackIn_67_2 = "";
              }
              stackIn_64_0[stackIn_64_1] = stackIn_67_2;
            }
            wt.a(false);
          }
          mba.field_a.field_c = jeb.field_c.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; bra.field_f.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_87_0 = -107;
            stackIn_88_1 = !(GetMessageMax.field_o[var4Lifetime1] < 0);
            var5Lifetime1 = ptb.$cfr$intArgs$a$62abead39cee(stackIn_87_0, stackIn_88_1, bra.field_f[var4Lifetime1]);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (GetMassDriverAimspeed.field_o == 2) {
            var10 = Projectile.field_k;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = ptb.$cfr$intArgs$a$62abead39cee(-107, false, var11);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = GetFogOfWarSensorRange.field_p;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = ptb.$cfr$intArgs$a$62abead39cee(-107, false, var12);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          Ship.field_E = (lfa.field_m + ro.field_c << 1) * mba.field_a.field_c;
          for (var4Lifetime2 = 0; bra.field_f.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_111_0 = Ship.field_E;
            if (GetMessageMax.field_o[var4Lifetime2] >= 0) {
              stackIn_112_1 = GetAngularVelocitySustain.field_p;
            } else {
              stackIn_112_1 = GetSniperCannonProjectileLife.field_r;
            }
            Ship.field_E = stackIn_111_0 + stackIn_112_1;
          }
          SetUseOffscreenRendering.field_o = -(Ship.field_E >> 1) + MissionEvent.field_d;
          GetMissionTerrainSpaceProbability.field_o = new int[bra.field_f.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = SetUseOffscreenRendering.field_o;
          while (bra.field_f.length > var4Lifetime3) {
            var6Lifetime1 = GetMessageMax.field_o[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + GetSniperCannonProjectileLife.field_r;
            } else {
              var7Lifetime2 = ptb.$cfr$intArgs$a$62abead39cee(-107, true, bra.field_f[var4Lifetime3]);
              var8Lifetime1 = -(var7Lifetime2 >> 1) + PlayerVote.field_f;
              var5Lifetime3 = var5Lifetime3 + ro.field_c;
              GetMissionTerrainSpaceProbability.field_o[var4Lifetime3] = new int[4];
              GetMissionTerrainSpaceProbability.field_o[var4Lifetime3][0] = var8Lifetime1 - za.field_d;
              GetMissionTerrainSpaceProbability.field_o[var4Lifetime3][1] = var5Lifetime3;
              GetMissionTerrainSpaceProbability.field_o[var4Lifetime3][2] = var7Lifetime2 + (za.field_d << 1);
              GetMissionTerrainSpaceProbability.field_o[var4Lifetime3][3] = (lfa.field_m << 1) + GetAngularVelocitySustain.field_p;
              var5Lifetime3 = var5Lifetime3 + ((lfa.field_m << 1) - (-ro.field_c - GetAngularVelocitySustain.field_p));
            }
            var4Lifetime3++;
          }
          if (param0 != GetMassDriverAimspeed.field_o) {
            mba.field_a.a(param1, -1, 0, uca.a(true, kc.field_b, uia.field_b));
          } else {
            mba.field_a.a(param1, -1, -1, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "wha.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final tv a(byte param0) {
        int var2 = -12 % ((param0 + 64) / 50);
        return (tv) ((Object) new Asteroid());
    }

    static {
        field_a = 11;
    }
}
