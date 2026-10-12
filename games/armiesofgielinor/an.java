/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends ConsoleCommand {
    static ChatMessage[] chatHistory;
    static int[] field_H;
    static long field_E;
    static String field_G;

    final static boolean e(byte param0) {
        if (param0 <= 84) {
          return false;
        }
        return ArchiveIndex.field_g;
    }

    an(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void h(int param0) {
        int var2 = 0;
        int var1 = SummonRequest.a(true);
        int var2Lifetime1;
        if (param0 == 1976460609) {
          var2 = so.a(param0 - 1976435396);
          sg.field_c.a((byte) -111, var2 + (ov.field_b << 1), BattlefieldTheme.field_f - b.field_k, var1 + (b.field_k << 1), -ov.field_b + InstructionsPanel.field_r);
          SpellCastEvent.h(15);
          return;
        }
        an.g(37);
        var2Lifetime1 = so.a(param0 - 1976435396);
        sg.field_c.a((byte) -111, var2Lifetime1 + (ov.field_b << 1), BattlefieldTheme.field_f - b.field_k, var1 + (b.field_k << 1), -ov.field_b + InstructionsPanel.field_r);
        SpellCastEvent.h(15);
    }

    final ConsoleValue execute(int obfuscationGuard, ConsoleValue[] arguments) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -24872) {
            var4 = (ConsoleValue[]) null;
            this.execute(-83, (ConsoleValue[]) null);
          }
          stackIn_3_0 = new ConsoleValue(DelayedPacket.a(arguments[0].asInt(2), (byte) 81));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("an.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_H = null;
        field_G = null;
        chatHistory = null;
        if (param0 != 1746174305) {
          an.g(-72);
        }
    }

    static {
        field_H = new int[4];
        field_G = null;
    }
}
