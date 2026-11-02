/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMessageFadetime extends ConsoleCommand {
    static String field_o;
    static String field_p;

    SetMessageFadetime(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 != 32) {
          SetMessageFadetime.e((byte) 122);
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
          Particle.field_s = arguments[0].a(125);
          if (obfuscationGuard > -119) {
            field_o = (String) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aj.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(String param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          rg.field_b = false;
          vu.field_xb = false;
          if (SetPointDefenceLaserAimarc.field_o != null &&
            SetPointDefenceLaserAimarc.field_o.field_z) {
            var3_int = 1;
            if (param2 == 8) {
              if (!tla.field_c) {
                param0 = SetPlayerRepairAmount.field_p;
              } else {
                param0 = GetTorqueDownshift.field_p;
              }
              param2 = 2;
              SetAiFiringRangeUpshift.field_o.a((byte) 9, qsb.field_d);
            }
            if (param2 == 10) {
              Nebula.a(92);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (vu.field_xb) {
                param0 = SetReverbGain.a(SetPointDefenceLaserFireForce.field_o, new String[]{param0}, 107);
              }
              if (kmb.field_c) {
                param0 = bbb.field_a;
              }
              SetPointDefenceLaserAimarc.field_o.a(true, param0, param2);
            }
            if (param2 != 256 &&
              param2 != 10 &&
              !tla.field_c) {
              SetAiFiringRangeUpshift.field_o.i((byte) -29);
            }
          }
          if (param1 >= 5) {
            return;
          }
          field_p = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("aj.B(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_o = "Repair mode in <%0>";
        field_p = "Options Menu";
    }
}
