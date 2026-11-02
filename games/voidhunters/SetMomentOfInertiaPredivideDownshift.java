/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMomentOfInertiaPredivideDownshift extends ConsoleCommand {
    static String field_o;

    public static void e(byte param0) {
        if (param0 < 49) {
          return;
        }
        field_o = null;
    }

    final static void a(java.applet.Applet param0, int param1, String[] param2, int param3, int param4, int param5) {
        int var7 = 0;
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = VoidHunters.field_G;
        try {
          GetKeepTeamColours.field_p = param0.getParameter("overxgames");
          if (GetKeepTeamColours.field_p == null) {
            GetKeepTeamColours.field_p = "0";
          }
          ud.field_R = param0.getParameter("overxachievements");
          if (null == ud.field_R) {
            ud.field_R = "0";
          }
          var6 = param0.getParameter("currency");
          if (var6 != null &&
            SetPointDefenceLaserAimarc.a((CharSequence) ((Object) var6), param1 - 2131)) {
            lob.a(-106, (CharSequence) ((Object) var6));
          }
          AwardVictoryToWinnerAction.field_a = new phb[param2.length];
          if (param1 != 2141) {
            return;
          }
          for (var7 = 0; var7 < param2.length; var7++) {
            AwardVictoryToWinnerAction.field_a[var7] = new phb(317, 34);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_18_0 = var6_ref;
          stackIn_18_1 = new StringBuilder().append("vk.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
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
          if (obfuscationGuard > -119) {
            field_o = (String) null;
          }
          SetMachineGunEnergyUsed.a(181, 62, arguments[0].a(79));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vk.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetMomentOfInertiaPredivideDownshift(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "Unknown";
    }
}
