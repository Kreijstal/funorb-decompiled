/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoadBlackboxRecording extends ConsoleCommand {
    static phb[] field_o;
    static String field_p;
    static int field_q;
    static String field_r;

    final static void a(ShipComponent param0, byte param1) {
        int var3 = 0;
        int[] var2 = null;
        ShipComponent var4 = null;
        ShipComponent var5 = null;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = VoidHunters.field_G;
        try {
          if (param1 != -10) {
            return;
          }
          var7 = new int[]{27, 43, 27, 43};
          var2 = var7;
          for (var3 = 0; 4 > var3; var3++) {
            var4 = new ShipComponent(29);
            var5 = new ShipComponent(32);
            var5.a(param1 ^ -9, 2, new ShipComponent(var7[var3]));
            var5.a(1, 3, new ShipComponent(var7[var3]));
            var5.a(1, 4, new ShipComponent(var7[var3]));
            var4.a(1, 0, var5);
            param0.a(1, var3, var4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("wnb.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 == 0) {
          field_o = null;
          field_r = null;
          field_p = null;
          return;
        }
        ShipComponent var2 = (ShipComponent) null;
        LoadBlackboxRecording.a((ShipComponent) null, (byte) 45);
        field_o = null;
        field_r = null;
        field_p = null;
    }

    final static String a(int param0) {
        if (dw.field_c == SetCountermeasureLauncherAimspeed.field_r) {
          return GetTabForScores.field_o;
        }
        if (SetShipTeamAction.field_b == dw.field_c) {
          return SetCountermeasureLauncherAimarc.field_q;
        }
        if (param0 < 54) {
          field_o = (phb[]) null;
          if (!GetBombletSprayPushMultiplier.field_p.a(4)) {
            return SetCountermeasureLauncherAimarc.field_q;
          }
          return qsb.field_d;
        }
        if (!GetBombletSprayPushMultiplier.field_p.a(4)) {
          return SetCountermeasureLauncherAimarc.field_q;
        }
        return qsb.field_d;
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
          rma.a(arguments[0].a(25), (byte) 47);
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wnb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    LoadBlackboxRecording(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = "Destroy the base with blueprint ships. No respawns.";
        field_q = 0;
        field_r = "Loading sound effects";
    }
}
