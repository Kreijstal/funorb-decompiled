/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ProxyAuthenticationException extends IOException {
    static int field_a;

    final static int greatestCommonDivisor(int left, int right, int guard) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (right < left) {
            int var3_int = right;
            right = left;
            left = var3_int;
          }
          while (left != 0) {
            int var3_intLifetime1 = right % left;
            right = left;
            left = var3_intLifetime1;
          }
          int var3_intLifetime2 = 59 % ((-4 - guard) / 49);
          int stackIn_6_0 = right;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "im.A(" + left + ',' + right + ',' + guard + ')');
        }
    }

    final static void resendProgressRequests(byte guard, int opcode) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          if (guard <= 48) {
            field_a = 28;
          }
          ProgressRecord var4 = (ProgressRecord) (RasterBuffer.field_e.first(false));
          while (var4 != null) {
            IntrusiveNode.writeProgressRecord(-121, opcode, var4);
            var4 = (ProgressRecord) (RasterBuffer.field_e.next((byte) 70));
          }
          ProgressQuery var5 = (ProgressQuery) (AchievementTracker.field_i.first(false));
          while (var5 != null) {
            ArchiveRequest.writeProgressQuery(opcode, var5, -755);
            var5 = (ProgressQuery) (AchievementTracker.field_i.next((byte) 70));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "im.B(" + guard + ',' + opcode + ')');
        }
    }

    ProxyAuthenticationException(String scheme) {
        super(scheme);
    }

    static {
    }
}
