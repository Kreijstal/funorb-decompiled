/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetDetachmentMode extends ConsoleCommand {
    static String field_o;

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
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(24, 109));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ic.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetDetachmentMode(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 < 114) {
          GetDetachmentMode.a(4);
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_19_0 = false;
        if (param1 != -9307) {
          GetDetachmentMode.a(-44, 13, -90);
          if (SetBombletSprayProjectileDamage.field_o == 13) {
            fj.b(18444);
            return true;
          }
          if (SetBombletSprayProjectileDamage.field_o == 102) {
            fkb.field_m.j(param1 ^ -25691);
            return true;
          }
          if (null == fkb.field_m) {
            return false;
          }
          if (!fkb.field_m.a(param0, -122, param2)) {
            return false;
          }
          return true;
        }
        if (SetBombletSprayProjectileDamage.field_o == 13) {
          fj.b(18444);
          return true;
        }
        if (SetBombletSprayProjectileDamage.field_o == 102) {
          fkb.field_m.j(param1 ^ -25691);
          return true;
        }
        stackIn_19_0 = (null != fkb.field_m) && (fkb.field_m.a(param0, -122, param2));
        return stackIn_19_0;
    }

    static {
        field_o = "Directional energy shield";
    }
}
