/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetDebrisSurvives extends ConsoleCommand {
    static String field_o;

    public static void e(int param0) {
        field_o = null;
        if (param0 != 0) {
          SetDebrisSurvives.e((byte) -59);
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(36, 62, arguments[0].a(33));
          if (obfuscationGuard >= -119) {
            field_o = (String) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jgb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void e(byte param0) {
        if (param0 > -53) {
          field_o = (String) null;
        }
        SetFighterVision.a(htb.field_w, -20149, lo.field_b, DualLinkNode.field_g, qc.field_q);
    }

    SetDebrisSurvives(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static phb a(int param0) {
        int var4_int = 0;
        int var5 = VoidHunters.field_G;
        int var1 = hla.field_a[0] * SetMissionTerrainDebrisProbability.field_o[0];
        byte[] var2 = sh.field_a[0];
        if (param0 >= -65) {
          SetDebrisSurvives.e((byte) 85);
        }
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
          var3[var4_int] = rlb.field_d[dla.a((int) var2[var4_int], 255)];
        }
        phb var4 = new phb(fbb.field_i, Ship.field_H, iib.field_e[0], SettingsChange.field_f[0], SetMissionTerrainDebrisProbability.field_o[0], hla.field_a[0], var3);
        MatchResults.a(58);
        return var4;
    }

    static {
        field_o = "Machine gun";
    }
}
