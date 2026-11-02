/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetBombletSprayReload extends ConsoleCommand {
    static int field_r;
    static int field_s;
    static String[] field_p;
    static boolean field_q;
    static int field_o;

    GetBombletSprayReload(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            GetBombletSprayReload.a(-46, -76, -106);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(111, 80));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("js.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -20626) {
          GetBombletSprayReload.a(43);
          field_p = null;
          return;
        }
        field_p = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = GetUseDetailLines.field_o - param2;
        int var4 = GetTorpedoReload.field_q - param1;
        kc.field_b = var3;
        uia.field_b = var4;
        int var5 = -112 / ((param0 + 16) / 59);
        Particle.field_H = var3;
        qs.field_a = var4;
    }

    static {
        field_r = -1;
        field_p = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_s = 50;
    }
}
