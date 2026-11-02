/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetUseTriFill extends ConsoleCommand {
    static jra field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            GetUseTriFill.e((byte) -53);
          }
          stackIn_3_0 = new ConsoleValue(GetBurstFireMaxEnergy.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fu.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 < 43) {
          field_o = (jra) null;
          if (ef.field_z < 20) {
            return true;
          }
          if (!eu.a(true)) {
            return true;
          }
          if (SetClientSideDragging.field_p <= 0) {
            return false;
          }
          if (!SetAutoaim.b(true)) {
            return true;
          }
          return false;
        }
        if (ef.field_z < 20) {
          return true;
        }
        if (!eu.a(true)) {
          return true;
        }
        if (SetClientSideDragging.field_p <= 0) {
          return false;
        }
        if (!SetAutoaim.b(true)) {
          return true;
        }
        return false;
    }

    GetUseTriFill(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        if (param0 >= -121) {
          return;
        }
        field_o = null;
    }

    static {
        field_o = new jra();
    }
}
