/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetSelfDestructTimer extends ConsoleCommand {
    static String field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 225) {
          int[] var2 = (int[]) null;
          GetSelfDestructTimer.a(52, (int[]) null);
        }
    }

    GetSelfDestructTimer(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        c var4_ref_c = null;
        int var4 = 0;
        c var5 = null;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        try {
          if (tc.field_c != GetOndamageParticleSpeed.field_o) {
            return false;
          }
          var2_long = wt.a(false);
          if (param0 != cd.field_c &&
            SetAutoDetail.field_p < 0) {
            var4_ref_c = (c) (GetSpinningBladeAimarc.field_q.d(param0 + 0));
            if (var4_ref_c != null &&
              var4_ref_c.field_e < var2_long) {
              var4_ref_c.b(-3846);
              vja.field_a = var4_ref_c.field_f.length;
              qga.field_b.position = 0;
              for (var5_int = 0; var5_int < vja.field_a; var5_int++) {
                qga.field_b.payload[var5_int] = var4_ref_c.field_f[var5_int];
              }
              iq.field_a = SetMissionResnetResourceTickTime.field_o;
              SetMissionResnetResourceTickTime.field_o = SetSalvoRepairTimeMultiplier.field_r;
              SetSalvoRepairTimeMultiplier.field_r = ow.field_a;
              ow.field_a = var4_ref_c.field_d;
              return true;
            }
          }
          while (true) {
            if (0 > SetAutoDetail.field_p) {
              qga.field_b.position = 0;
              if (!ShipBlueprint.a(1, 30000)) {
                return false;
              }
              SetAutoDetail.field_p = qga.field_b.o(255);
              qga.field_b.position = 0;
              vja.field_a = param1[SetAutoDetail.field_p];
            }
            if (!ci.b((byte) 51)) {
              return false;
            }
            if (cd.field_c == 0) {
              iq.field_a = SetMissionResnetResourceTickTime.field_o;
              SetMissionResnetResourceTickTime.field_o = SetSalvoRepairTimeMultiplier.field_r;
              SetSalvoRepairTimeMultiplier.field_r = ow.field_a;
              ow.field_a = SetAutoDetail.field_p;
              SetAutoDetail.field_p = -1;
              return true;
            }
            var4 = cd.field_c;
            if (AsteroidField.field_c != 0.0) {
              var4 = (int)((double)var4 + jeb.field_b.nextGaussian() * AsteroidField.field_c);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new c((long)var4 + var2_long, SetAutoDetail.field_p, new byte[vja.field_a]);
            for (var6 = 0; var6 < vja.field_a; var6++) {
              var5.field_f[var6] = qga.field_b.payload[var6];
            }
            GetSpinningBladeAimarc.field_q.b(param0 ^ -10258, var5);
            SetAutoDetail.field_p = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_36_0 = var2;
          stackIn_36_1 = new StringBuilder().append("rhb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
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
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(225, 79));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rhb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_o = "Real-life threats";
    }
}
