/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static String field_a;
    static String field_b;

    final static du a(String param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        pc var4 = null;
        pc stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 104 % ((16 - param1) / 61);
          var4 = new pc();
          ((du) ((Object) var4)).field_a = param0;
          ((du) ((Object) var4)).field_c = param2;
          stackIn_1_0 = var4;
          return (du) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ti.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 <= 17) {
          return;
        }
        field_a = null;
    }

    final static String toggleAutomaticTurnSkipping(byte obfuscationGuard) {
        int newSkipFlag = 0;
        if (obfuscationGuard <= -117) {
          newSkipFlag = !DualLinkedNode.automaticallySkipPlayerTurns ? 1 : 0;
          DualLinkedNode.automaticallySkipPlayerTurns = !DualLinkedNode.automaticallySkipPlayerTurns ? true : false;
          return new Boolean(newSkipFlag != 0).toString();
        }
        field_b = (String) null;
        int guardedNewSkipFlag = !DualLinkedNode.automaticallySkipPlayerTurns ? 1 : 0;
        DualLinkedNode.automaticallySkipPlayerTurns = !DualLinkedNode.automaticallySkipPlayerTurns ? true : false;
        return new Boolean(guardedNewSkipFlag != 0).toString();
    }

    static {
        field_a = "Cancel unrated rematch";
        field_b = "This unit already has <%0>";
    }
}
