/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends ConsoleCommand {
    static wm field_L;
    static RgbSprite[] field_J;
    static boolean[] field_G;
    static String field_F;
    static MusicTrack field_K;
    static RgbSprite field_I;
    static int field_E;
    static long localAccountId;
    static ResourceArchive field_M;

    public static void g(int param0) {
        field_G = null;
        field_F = null;
        field_K = null;
        field_J = null;
        field_L = null;
        field_I = null;
        if (param0 == 21336) {
          field_M = null;
          return;
        }
    }

    final static void e(byte param0) {
        String var2 = null;
        if (PopupPresentation.field_e != null) {
          var2 = PopupPresentation.field_e;
          String var1 = var2;
          wr.a((byte) 68, fo.a(4800, ActionSpell.field_l, new String[]{var2}));
          PopupPresentation.field_e = null;
        }
        if (param0 <= -127) {
          return;
        }
        oh.e((byte) 28);
    }

    final ConsoleValue execute(int obfuscationGuard, ConsoleValue[] arguments) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == -24872) {
            stackIn_4_0 = new ConsoleValue(DisplacedUnitMarker.b(256, arguments[0].asInt(2)));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("oh.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    oh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_G = new boolean[56];
        field_F = "Dragonhide";
    }
}
