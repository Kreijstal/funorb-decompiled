/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetUseBackgroundInFullscreen extends ConsoleCommand {
    static dja field_o;

    final static void a(byte param0, ShipComponent param1) {
        ShipComponent var3 = null;
        ShipComponent var4 = null;
        try {
          param1.a(1, 2, new ShipComponent(13));
          param1.a(1, 3, new ShipComponent(13));
          param1.a(1, 13, new ShipComponent(13));
          param1.a(1, 12, new ShipComponent(13));
          param1.a(1, 7, new ShipComponent(25));
          param1.a(1, 8, new ShipComponent(25));
          param1.a(1, 16, new ShipComponent(18));
          var3 = new ShipComponent(29);
          var3.a(1, 0, new ShipComponent(27));
          param1.a(1, 4, var3);
          if (param0 >= -77) {
            field_o = (dja) null;
          }
          var4 = new ShipComponent(29);
          var4.a(1, 0, new ShipComponent(27));
          param1.a(1, 11, var4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "leb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, -56);
          }
          stackIn_3_0 = new ConsoleValue(GetMissilesExplosionPower.field_p);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("leb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_o = null;
        int var1 = 76 % ((45 - param0) / 48);
    }

    GetUseBackgroundInFullscreen(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = (dja) ((Object) new jdb());
    }
}
