/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ClientException extends RuntimeException {
    Throwable cause;
    static int[] field_f;
    static int[] field_b;
    String context;
    static LoginStage field_c;
    static int[] field_d;
    static int field_e;

    public static void releaseStatics(boolean guard) {
        if (guard) {
          return;
        }
        field_b = null;
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final static boolean hasResponseConnection(int guard) {
        if (guard != -31879) {
          ClientException.flushAccountPackets(21, -45);
          if (TextLayout.field_c == null) {
            return false;
          }
          if (AccountFormStage.field_d.isResponseStage((byte) 63)) {
            return true;
          }
          return false;
        }
        if (TextLayout.field_c == null) {
          return false;
        }
        if (AccountFormStage.field_d.isResponseStage((byte) 63)) {
          return true;
        }
        return false;
    }

    ClientException(Throwable param0, String param1) {
        this.context = param1;
        this.cause = param0;
    }

    final static EmailValidationError validateDomain(String domain, int startIndex) {
        EmailValidationError var7 = null;
        String stackIn_22_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var2_int = domain.length();
          if (var2_int == 0) {
            EmailValidationError stackIn_4_0 = ResourceArchive.field_d;
            return stackIn_4_0;
          }
          if (var2_int > 255) {
            EmailValidationError stackIn_7_0 = EmailAvailabilityRequest.field_c;
            return stackIn_7_0;
          }
          String[] var3 = ModalPanel.splitString(-128, domain, '.');
          if (var3.length < 2) {
            EmailValidationError stackIn_10_0 = ResourceArchive.field_d;
            return stackIn_10_0;
          }
          String[] var4 = var3;
          int var5 = startIndex;
          while (true) {
            if (var4.length <= var5) {
              EmailValidationError stackIn_18_0 = InputGlyphSupport.rejectNumericDomainSuffix(var3[var3.length - 1], 0);
              return stackIn_18_0;
            }
            String var6 = var4[var5];
            var7 = StrongCacheEntry.validateDomainLabel(var6, startIndex - 116);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          EmailValidationError stackIn_15_0 = var7;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var2;
          StringBuilder stackIn_21_1 = new StringBuilder().append("rn.B(");
          if (domain == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(startIndex).append(')').toString());
        }
    }

    final static void flushAccountPackets(int keepaliveOpcode, int guard) {
        try {
          if (TextLayout.field_c != null && (0 > keepaliveOpcode ||
            AccountFormStage.field_d == ThreeSliceButtonPainter.field_t)) {
            if (QuickChatDynamicCommand.outgoingPackets.position == 0 &&
              (10000L + FrameworkLoadingStatus.field_c) < MonotonicClockSupport.monotonicMillis(128)) {
              QuickChatDynamicCommand.outgoingPackets.writeCipheredOpcode(keepaliveOpcode, true);
            }
            if (0 < QuickChatDynamicCommand.outgoingPackets.position) {
              try {
                TextLayout.field_c.write(QuickChatDynamicCommand.outgoingPackets.position, 0, QuickChatDynamicCommand.outgoingPackets.payload, 5000);
                FrameworkLoadingStatus.field_c = MonotonicClockSupport.monotonicMillis(128);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                Throwable decompiledCaughtException = decompiledCaughtParameter0;
                IOException iOException = (IOException) (Object) decompiledCaughtException;
                ConnectionSupport.closeTransport(16);
              }
              QuickChatDynamicCommand.outgoingPackets.position = 0;
            }
            if (guard == 30785) {
              return;
            }
            ClientException.releaseStatics(true);
            return;
          }
          QuickChatDynamicCommand.outgoingPackets.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new int[]{29, 0, 0, -3, -3};
        field_f = new int[]{19, 0, -10, -5, -5};
        field_b = new int[17];
        int[] var1 = new int[]{29, 0, 0, -3, -3};
        int[] var0 = var1;
        ArraySupport.copy(var0, 0, field_b, 0, var1.length);
        field_f = new int[17];
        int[] var2 = new int[]{19, 0, -10, -5, -5};
        var0 = var2;
        ArraySupport.copy(var0, 0, field_f, 0, var2.length);
        field_c = new LoginStage();
        field_d = new int[8192];
    }
}
