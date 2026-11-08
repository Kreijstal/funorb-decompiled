/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PacketFlushHelpers {
    static UiComponent field_a;
    static String field_b;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_b = null;
        int var1 = 30 / ((param0 + 27) / 49);
    }

    final static byte[] copyBytes(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          if (param0 != -14074) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var3 = new byte[var2_int];
          ArraySupport.copy(param1, 0, var3, 0, var2_int);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ak.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void flushPackets(byte param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (null != TriangleSpanHelpers.field_e && (param1 < 0 ||
            SparkParticle.field_p == WhirlpoolHasher.field_a)) {
            if (param0 > -37) {
              PacketFlushHelpers.hasBlockingPopup(69);
            }
            if (0 == QuickChatHelpDialog.field_Lb.position &&
              (FlaggedTextValue.field_n + 10000L) < ClockAndTextHelpers.monotonicMillis(0)) {
              QuickChatHelpDialog.field_Lb.writeCipheredByte(param1, (byte) -92);
            }
            if (QuickChatHelpDialog.field_Lb.position > 0) {
              try {
                TriangleSpanHelpers.field_e.write(true, QuickChatHelpDialog.field_Lb.position, QuickChatHelpDialog.field_Lb.payload, 0);
                FlaggedTextValue.field_n = ClockAndTextHelpers.monotonicMillis(0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                SocialTabsPanel.closeGameSocket(false);
              }
              QuickChatHelpDialog.field_Lb.position = 0;
            }
            return;
          }
          QuickChatHelpDialog.field_Lb.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void setBenefitsBorderAndCaption(int param0, String param1, float param2) {
        try {
          if (param0 != 0) {
            field_b = (String) null;
          }
          ProxyAuthenticationRequiredException.field_a = param1;
          SpriteState.field_v = param2;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ak.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean hasBlockingPopup(int param0) {
        if (param0 != 3058) {
          field_b = (String) null;
          if (null != EmailAvailabilityValidator.field_s) {
            return true;
          }
          if (ProxySocketConnector.isTextPromptOpen(param0 - 34020)) {
            return true;
          }
          if (null != PasswordValidator.field_y) {
            return true;
          }
          if (!DebouncedValidator.hasOpenDialog((byte) 66)) {
            return false;
          }
          return true;
        }
        if (null != EmailAvailabilityValidator.field_s) {
          return true;
        }
        if (ProxySocketConnector.isTextPromptOpen(param0 - 34020)) {
          return true;
        }
        if (null != PasswordValidator.field_y) {
          return true;
        }
        if (!DebouncedValidator.hasOpenDialog((byte) 66)) {
          return false;
        }
        return true;
    }

    static {
    }
}
