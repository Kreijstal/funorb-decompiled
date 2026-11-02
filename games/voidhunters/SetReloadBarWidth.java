/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetReloadBarWidth extends ConsoleCommand {
    static int[] field_q;
    static int[] field_s;
    static int[] field_o;
    static int[] field_r;
    static int[][] field_p;
    static String field_t;

    SetReloadBarWidth(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean f(byte param0) {
        if (param0 >= -63) {
          return false;
        }
        if (null == qn.field_h) {
          return false;
        }
        if (null != qn.field_h.g(0)) {
          return true;
        }
        return false;
    }

    public static void e(byte param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        field_o = null;
        field_p = (int[][]) null;
        field_t = null;
        if (param0 != -31) {
          field_s = (int[]) null;
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
          GetSniperCannonAimarc.field_p = arguments[0].a(11);
          if (obfuscationGuard > -119) {
            SetReloadBarWidth.f((byte) -42);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vba.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        try {
          SetTabForScores.field_p = param1;
          GetSelfDestructPrepareToggleCooldown.a(-53, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vba.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = new int[10];
        field_r = new int[10];
        field_o = new int[10];
        field_q = new int[10];
        field_p = new int[10][];
        int[] var0 = new int[]{0, 1, 21, 4, 3, 12};
        GetOndamageParticleFadestart.a(320, var0, (byte) -80, 230, 530, 50, 0);
        int var1 = 70;
        GetOndamageParticleFadestart.a(200, new int[]{2, 21, 3, 23, 7}, (byte) -71, -var1 + 200, 440, 50, 1);
        GetOndamageParticleFadestart.a(200, new int[]{2, 21, 3, 23, 11}, (byte) -94, 200 - var1, 440, 50, 2);
        GetOndamageParticleFadestart.a(200, new int[]{2, 21, 3, 11}, (byte) -47, -var1 + 200, 440, 50, 3);
        GetOndamageParticleFadestart.a(200, new int[]{2, 21, 3, 11}, (byte) -14, -var1 + 200, 440, 50, 4);
        GetOndamageParticleFadestart.a(60, new int[]{17, 6, 18}, (byte) -84, 400, 440, 50, 5);
        GetOndamageParticleFadestart.a(200, new int[]{5}, (byte) -58, 400, 440, 50, 6);
        GetOndamageParticleFadestart.a(200, new int[]{}, (byte) -13, 200, 440, 50, 7);
        GetOndamageParticleFadestart.a(200, new int[]{6}, (byte) -26, 420, 440, 50, 8);
        GetOndamageParticleFadestart.a(200, new int[]{13, 14, 24, 19, 22, 6}, (byte) -94, -var1 + 200, 440, 50, 9);
        field_t = "Choose the mission";
    }
}
