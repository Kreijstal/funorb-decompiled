/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu {
    static b field_b;
    static String field_a;

    final static boolean a(int param0) {
        int var1 = -61 / ((-54 - param0) / 62);
        if (ToggleTurnSkipConsoleCommand.debugConsole != null) {
          return ToggleTurnSkipConsoleCommand.debugConsole.handleKey(-30847, DualNodeDeque.typedCharacter, rs.keyCode);
        }
        return false;
    }

    final static NodeDeque tokenizeConsole(boolean obfuscationGuard, String source) {
        NodeDeque tokens = null;
        TextCursor cursor = null;
        int character = 0;
        int obfuscationControl = 0;
        NodeDeque tokenDequeResult = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String sourceDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard) {
            gu.a(102);
          }
          tokens = new NodeDeque();
          cursor = new TextCursor(source);
          while (!cursor.isAtEnd((byte) 16)) {
            character = cursor.readCharacter(-1);
            if (Character.isWhitespace((char) character)) {
              continue;
            }
            if (character != 34 &&
              character != 39) {
              if (character == 40) {
                tokens.addLast((byte) -119, (IntrusiveNode) (new ConsoleExpression(ChatMessage.consoleArgumentStartKind, -1 + cursor.position)));
                continue;
              }
              if (character == 41) {
                tokens.addLast((byte) -119, (IntrusiveNode) (new ConsoleExpression(LeaderEscortCondition.consoleArgumentEndKind, -1 + cursor.position)));
                continue;
              }
              if (44 != character) {
                tokens.addLast((byte) -119, (IntrusiveNode) (bi.readBareConsoleToken((byte) -118, cursor)));
                continue;
              }
              tokens.addLast((byte) -119, (IntrusiveNode) (new ConsoleExpression(sb.consoleArgumentCommaKind, cursor.position - 1)));
              continue;
            }
            tokens.addLast((byte) -119, (IntrusiveNode) (BestScoreStrategy.readQuotedConsoleToken((byte) 121, cursor)));
          }
          tokenDequeResult = tokens;
          return tokenDequeResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("gu.D(").append(obfuscationGuard).append(',');
          if (source == null) {
            sourceDescription = "null";
          } else {
            sourceDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(sourceDescription).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -16356) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = vl.outgoingPacket;
        if (param0 < -31) {
          var2.writeCipheredOpcode(32161, param1);
          var2.writeByte(1, 1);
          var2.writeByte(1, 0);
          return;
        }
        field_a = (String) null;
        var2.writeCipheredOpcode(32161, param1);
        var2.writeByte(1, 1);
        var2.writeByte(1, 0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = "Connection timed out. Please try using a different server.";
    }
}
