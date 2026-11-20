/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetReverbWidth extends ConsoleCommand {
    static SocialTabsPanel field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        Camera2D var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            var4 = (Camera2D) null;
            GetReverbWidth.a((Camera2D) null, 62);
          }
          stackIn_3_0 = new ConsoleValue(CommonGameState.field_i);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hra.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetReverbWidth(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(Camera2D param0, int param1) {
        if (param1 != -8077) {
          return;
        }
        try {
          TextureTransformMode.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hra.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 != 9839) {
          field_o = (SocialTabsPanel) null;
        }
    }

    static {
    }
}
