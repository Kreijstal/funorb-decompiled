/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetShipPersistence extends ConsoleCommand {
    static qrb field_o;

    final static void a(String param0, int param1, int param2, int param3, int param4, byte param5) {
        try {
          woa.a(param3, param2, param1, (byte) 74, param4, SetAutoaim.field_p, param0);
          if (param5 != -103) {
            field_o = (qrb) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lea.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    GetShipPersistence(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, 9);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(33, 120));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lea.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 33) {
          String var2 = (String) null;
          GetShipPersistence.a((String) null, -71, 30, -95, 67, (byte) -77);
        }
    }

    static {
        field_o = new qrb();
    }
}
