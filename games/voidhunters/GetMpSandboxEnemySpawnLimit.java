/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMpSandboxEnemySpawnLimit extends ConsoleCommand {
    static String field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(40, 126));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ir.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_o = null;
        int var1 = 56 / ((param0 + 47) / 55);
    }

    final static boolean a(int param0, int param1) {
        coa var3;
        ShipBlueprint var4;
        coa var5;
        ShipBlueprint var6;
        if (param0 < -44) {
          if (param1 == 73) {
            GetDebrisThrowable.a(false, "Receiving server info");
            var5 = new coa();
            uw.a((byte) -61, qga.field_b, var5);
            if (var5 == null) {
              return true;
            }
            fwa.field_g = var5;
            return true;
          }
          if (param1 != 74) {
            return false;
          }
          GetDebrisThrowable.a(false, "Receiving player blueprint");
          var6 = new ShipBlueprint();
          uw.a((byte) -84, qga.field_b, var6);
          if (var6 == null) {
            return true;
          }
          SetInnateThrusters.a(0, var6.description);
          return true;
        }
        GetMpSandboxEnemySpawnLimit.a(114, 1);
        if (param1 == 73) {
          GetDebrisThrowable.a(false, "Receiving server info");
          var3 = new coa();
          uw.a((byte) -61, qga.field_b, var3);
          if (var3 == null) {
            return true;
          }
          fwa.field_g = var3;
          return true;
        }
        if (param1 != 74) {
          return false;
        }
        GetDebrisThrowable.a(false, "Receiving player blueprint");
        var4 = new ShipBlueprint();
        uw.a((byte) -84, qga.field_b, var4);
        if (var4 == null) {
          return true;
        }
        SetInnateThrusters.a(0, var4.description);
        return true;
    }

    final static void a(byte param0, long param1, String param2) {
        CharSequence var5 = null;
        try {
          ow.field_b = 2;
          waa.field_x = param2;
          var5 = (CharSequence) ((Object) param2);
          GetDebrisThrowable.field_o = jwa.a(false, var5);
          SetFightersPerPlayerMaximum.field_p = true;
          if (param0 != 39) {
            field_o = (String) null;
          }
          lsa.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ir.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(ShipComponent param0, byte param1) {
        ShipComponent var4 = null;
        ShipComponent var5 = null;
        try {
          param0.a(1, 10, new ShipComponent(13));
          param0.a(1, 9, new ShipComponent(13));
          param0.a(1, 8, new ShipComponent(13));
          param0.a(1, 0, new ShipComponent(13));
          param0.a(1, 1, new ShipComponent(13));
          param0.a(1, 7, new ShipComponent(13));
          param0.a(1, 4, new ShipComponent(26));
          param0.a(1, 11, new ShipComponent(13));
          int var3 = -119 / ((79 - param1) / 47);
          var4 = new ShipComponent(31);
          var4.a(1, 0, new ShipComponent(23));
          param0.a(1, 3, var4);
          var5 = new ShipComponent(31);
          var5.a(1, 1, new ShipComponent(23));
          param0.a(1, 5, var5);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ir.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    GetMpSandboxEnemySpawnLimit(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static tsa a(int param0, qab param1) {
        int fieldTemp$2 = 0;
        StringBuilder discarded$3 = null;
        int var2_int = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        tsa stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var6 = VoidHunters.field_G;
        try {
          if (param0 >= -8) {
            field_o = (String) null;
          }
          fieldTemp$2 = param1.field_b - 1;
          param1.field_b = param1.field_b - 1;
          var2_int = fieldTemp$2;
          var3 = new StringBuilder();
          while (!param1.a((byte) -123)) {
            var4 = param1.a(-104);
            if (!Character.isWhitespace((char) var4) &&
              var4 != 44 &&
              var4 != 40 &&
              var4 != 41) {
              discarded$3 = var3.append((char) var4);
              continue;
            }
            param1.field_b = param1.field_b - 1;
            break;
          }
          var5 = var3.toString();
          if (!var5.equals("true") &&
            !var5.equals("false")) {
            if (45 != var5.charAt(0) &&
              !Character.isDigit(var5.charAt(0))) {
              var4Lifetime1 = SetMissionVariablesHudX.field_p;
            } else {
              var4Lifetime1 = fwa.field_h;
            }
          } else {
            var4Lifetime1 = io.field_p;
          }
          stackIn_21_0 = new tsa(var4Lifetime1, var2_int, var5);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("ir.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_o = "Armour";
    }
}
