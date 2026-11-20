/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleTokenStream {
    int position;
    private ConsoleExpressionToken[] tokens;

    ConsoleTokenStream(IntrusiveDeque param0) {
        int incrementValue$2 = 0;
        int var2_int = 0;
        ConsoleExpressionToken var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.position = 0;
        try {
          this.tokens = new ConsoleExpressionToken[param0.size(3)];
          var2_int = 0;
          var3 = (ConsoleExpressionToken) (param0.first(0));
          while (var3 != null) {
            var3.unlink(-3846);
            incrementValue$2 = var2_int;
            var2_int++;
            this.tokens[incrementValue$2] = var3;
            var3 = (ConsoleExpressionToken) (param0.next((byte) 13));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ipb.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean isAtEnd(int param0) {
        if (param0 > 18) {
          return this.position >= this.tokens.length ? true : false;
        }
        this.tokens = (ConsoleExpressionToken[]) null;
        return this.position >= this.tokens.length ? true : false;
    }

    final ConsoleExpressionToken readToken(byte param0) {
        int var2 = 75 / ((param0 - 70) / 55);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.tokens[fieldTemp$0];
    }

    static {
    }
}
