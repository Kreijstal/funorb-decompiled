/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameProgressSupport {
    static int field_a;
    static String field_b;
    static GameProgressTracker field_c;

    final static int[] queryScoreValues(int mode, boolean guard, int column, HighscoreQuery query) {
        String stackIn_11_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (!guard) {
            field_b = (String) null;
          }
          int[] var8 = query.intColumns[column];
          int[] var4 = var8;
          int[] var5 = new int[var8.length];
          for (int var6 = 0; var8.length > var6; var6++) {
            var5[var6] = UiContainer.scoreFromPacked(-19, mode, var8[var6]);
          }
          int[] stackIn_7_0 = var5;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var4_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("ua.A(").append(mode).append(',').append(guard).append(',').append(column).append(',');
          if (query == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_c = null;
        if (guard != 0) {
          field_a = 95;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void writeLevelResult(int flatLevelIndex, int scaledTicks, int outcome, int guard) {
        if (AccountSessionSupport.isGuestSession(-127)) {
          return;
        }
        CipherPacketBuffer var4 = QuickChatDynamicCommand.outgoingPackets;
        var4.writeCipheredOpcode(16, true);
        var4.position = var4.position + 1;
        if (guard == 1) {
          int var5 = var4.position;
          var4.writeByte(0, -123);
          var4.writeShort(guard + 45, flatLevelIndex);
          var4.writeByte(outcome, -123);
          var4.writeShort(guard + 9, scaledTicks);
          var4.backpatchByteLength(-96, var4.position - var5);
          return;
        }
        field_b = (String) null;
        int var5Lifetime1 = var4.position;
        var4.writeByte(0, -123);
        var4.writeShort(guard + 45, flatLevelIndex);
        var4.writeByte(outcome, -123);
        var4.writeShort(guard + 9, scaledTicks);
        var4.backpatchByteLength(-96, var4.position - var5Lifetime1);
    }

    final static String joinRange(int startIndex, int count, CharSequence[] parts, int guard) {
        String stackIn_34_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (count == 0) {
            String stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (1 == count) {
            CharSequence var10 = parts[startIndex];
            CharSequence var4 = var10;
            if (var4 != null) {
              String stackIn_11_0 = var10.toString();
              return stackIn_11_0;
            }
            String stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          int var4_int = startIndex + count;
          if (guard != 4) {
            String stackIn_14_0 = (String) null;
            return stackIn_14_0;
          }
          int var5 = 0;
          for (int var6_int = startIndex; var4_int > var6_int; var6_int++) {
            CharSequence var7_ref_CharSequence = parts[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          StringBuilder var6 = new StringBuilder(var5);
          for (int var7 = startIndex; var4_int > var7; var7++) {
            CharSequence var8 = parts[var7];
            if (var8 == null) {
              StringBuilder discarded$0 = var6.append("null");
            } else {
              StringBuilder discarded$1 = var6.append(var8);
            }
          }
          String stackIn_30_0 = var6.toString();
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_33_0 = var4_ref;
          StringBuilder stackIn_33_1 = new StringBuilder().append("ua.B(").append(startIndex).append(',').append(count).append(',');
          if (parts == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        field_b = "Current Objective";
    }
}
