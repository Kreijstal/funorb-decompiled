/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetFighterVision extends ConsoleCommand {
    final static void a(llb param0, int param1, llb param2, llb param3, llb param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = VoidHunters.field_G;
        try {
          if (lsa.field_e != null) {
            return;
          }
          SetFightersPerPlayerMaximum.field_p = false;
          if (GetBloomThresholdPercentage.field_p) {
            var5 = ocb.field_g;
          } else {
            if (hb.field_c) {
              var5 = bw.field_b;
            } else {
              var5 = cna.field_xb;
            }
          }
          var7 = (String) null;
          SetSelfDestructTimer.a(19204, var5, 0, (String) null, kmb.field_a);
          umb.field_d = fgb.field_l;
          bpa.field_c.field_ib = (8355711 & TargetLock.field_b.field_ib >> 1) + (-((16711423 & kmb.field_a) >> 1) + kmb.field_a);
          bpa.field_c.field_qb = kmb.field_a - (((16711422 & kmb.field_a) >> 1) - ((TargetLock.field_b.field_qb & 16711423) >> 1));
          bpa.field_c.field_U = -(kmb.field_a >> 1 & 8355711) + kmb.field_a + ((TargetLock.field_b.field_U & 16711423) >> 1);
          if (param1 != -20149) {
            return;
          }
          lsa.field_e = bpa.field_c;
          qw.field_l = new llb(0L, param3);
          hp.field_b = new llb(0L, param2);
          me.field_s = new llb(0L, (llb) null);
          SetThrusterAutobalancing.field_p = new llb(0L, param0);
          bpa.field_c = new llb(0L, param4);
          bpa.field_c.field_eb = ej.field_c;
          SetThrusterAutobalancing.field_p.b(-561, bpa.field_c);
          fgb.field_l = new llb(0L, umb.field_d);
          SetThrusterAutobalancing.field_p.b(-561, fgb.field_l);
          GetMachineGunAimarc.field_q = new llb(0L, TargetLock.field_b, GetMissionTerrainVotingChancestep.field_o);
          dp.field_a = new llb(0L, TargetLock.field_b);
          qw.field_l.b(-561, hp.field_b);
          qw.field_l.b(-561, me.field_s);
          me.field_s.b(-561, SetThrusterAutobalancing.field_p);
          me.field_s.b(param1 + 19588, GetMachineGunAimarc.field_q);
          me.field_s.b(-561, dp.field_a);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("dc.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    SetFighterVision(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
          if (obfuscationGuard >= -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.a(2, 62, arguments[0].a(103));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("dc.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
