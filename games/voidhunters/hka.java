/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hka extends uj {
    static String[] field_d;

    hka() {
    }

    final boolean c(byte param0) {
        if (param0 > -104) {
          field_d = (String[]) null;
          return true;
        }
        return true;
    }

    final int a(int param0) {
        if (param0 != -1) {
          field_d = (String[]) null;
          return gg.field_j;
        }
        return gg.field_j;
    }

    final boolean c(int param0) {
        if (param0 < 63) {
          return true;
        }
        return false;
    }

    final int b(byte param0) {
        if (param0 <= 79) {
          field_d = (String[]) null;
          return 111;
        }
        return 111;
    }

    final static void a(asb param0, int param1) {
        llb var5 = null;
        llb var6 = null;
        llb var3 = null;
        SetMissileLauncherRandomness.field_o = SetSniperCannonProjectiles.a(param0, "display_name_changed", "basic", true);
        re.field_n = new wdb(0L, rbb.field_k, SetMissileLauncherEnergyUsed.field_q, SetDefaultFiringLeeway.field_o);
        vra.field_b = new wdb(0L, rbb.field_k, SetMissilesTopSpeed.field_q, ci.field_a);
        ci.field_c = new llb(0L, (llb) null);
        rtb.field_h = new llb(0L, qc.field_q);
        rtb.field_h.field_F = 1;
        if (param1 >= -96) {
          return;
        }
        try {
          SetCountermeasureLauncherRandomness.field_o = new llb(0L, GetThrusterBindingBalanceThreshold.field_p, kpb.field_r);
          GameKeyHandler.field_b = new llb(0L, qsa.field_d, mab.field_e);
          nf.field_c = new llb(0L, GetMissionDebrisDefaultProbability.field_o);
          ci.field_c.b(-561, rtb.field_h);
          ci.field_c.b(-561, SetCountermeasureLauncherRandomness.field_o);
          ci.field_c.b(-561, GameKeyHandler.field_b);
          ci.field_c.b(-561, re.field_n);
          ci.field_c.b(-561, nf.field_c);
          re.field_n.field_xb.field_xb.a(18445, qc.field_q);
          re.field_n.field_xb.field_xb.field_B = 1;
          var5 = re.field_n.field_xb.field_xb;
          var6 = var5;
          var6.field_F = 1;
          vra.field_b.field_xb.field_xb.a(18445, qc.field_q);
          var3 = vra.field_b.field_xb.field_xb;
          vra.field_b.field_xb.field_xb.field_B = 1;
          var3.field_F = 1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hka.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_d = null;
        if (param0 != 0) {
          field_d = (String[]) null;
        }
    }

    final int b(int param0) {
        if (param0 != -25131) {
          this.c(-85);
          return 256;
        }
        return 256;
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          if (ef.field_z >= 10) {
            if (!lm.a(true)) {
              dma.a();
              SetRadialMenuRadius.a((byte) 82, 320, 240);
              SetSniperCannonAimarc.a(param1, 0, 0, 0);
            } else {
              if (GetSpinningBladeAimspeed.field_q == 0) {
                pi.a((byte) -70, false, param2);
                SetSniperCannonAimarc.a(param1, 0, 0, 0);
              } else {
                GetPhasedEnergyBeamAimspeed.a(param1, true);
              }
            }
          } else {
            var3_int = 0;
            if (GetShowTutorial.field_o) {
              GetShowTutorial.field_o = false;
              var3_int = 1;
            }
            Lo.a(SetBlueprintSaveTime.field_p, 13, GetMissileLauncherFireForce.e((byte) 97), var3_int != 0, SetMassDriverFireForce.e((byte) -79));
          }
          if (param0 == 111) {
            return;
          }
          field_d = (String[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("hka.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final int d(byte param0) {
        if (param0 != 64) {
          field_d = (String[]) null;
          return Particle.field_t;
        }
        return Particle.field_t;
    }

    final boolean a(boolean param0) {
        if (param0) {
          field_d = (String[]) null;
          return false;
        }
        return false;
    }

    static {
        field_d = new String[]{"All scores", "My scores", "Best each"};
    }
}
