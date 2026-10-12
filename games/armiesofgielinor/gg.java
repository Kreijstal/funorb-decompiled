/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gg extends ConsoleCommand {
    static int consoleNumberKind;
    static NodeDeque field_F;
    static int field_I;
    static Random animationRandom;
    static String field_H;
    static ResourceArchive field_K;
    static ClientUiComponent field_E;

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
            this.execute(-98, (ConsoleValue[]) null);
          }
          stackIn_3_0 = new ConsoleValue(InstructionsPanel.c(-29288));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gg.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    gg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void g(int param0) {
        field_K = null;
        field_E = null;
        field_H = null;
        field_F = null;
        animationRandom = null;
        if (param0 != -2260) {
          gg.g(12);
        }
    }

    static {
        consoleNumberKind = 6;
        field_F = new NodeDeque();
        field_H = "Options";
        field_I = 2;
        animationRandom = new Random();
    }
}
