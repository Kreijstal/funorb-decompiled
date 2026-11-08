/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipDecoder {
    static int[] field_d;
    static String playerXLostTwoLives;
    static long field_e;
    static String createAlertDoublespace;
    static boolean field_h;
    private java.util.zip.Inflater field_b;
    static PcmStreamMixer field_c;
    static String raTitle;

    final static AvailabilityQueryResult createAvailabilityQuery(int obfuscationGuard, String text) {
        int var2_int = 0;
        RuntimeException var2 = null;
        AvailabilityQueryResult stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -79 % ((51 - obfuscationGuard) / 49);
          stackIn_1_0 = new AvailabilityQueryResult(text);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("oh.A(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void decompress(byte[] param0, boolean param1, PacketBuffer param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (!param1) {
              GzipDecoder.releaseStatics((byte) 4);
            }
            if (param2.payload[param2.position] == 31 &&
              param2.payload[param2.position + 1] == -117) {
              if (null == this.field_b) {
                this.field_b = new java.util.zip.Inflater(true);
              }
              try {
                this.field_b.setInput(param2.payload, 10 + param2.position, -10 + (-param2.position - 8 + param2.payload.length));
                this.field_b.inflate(param0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_b.reset();
                throw new RuntimeException("");
              }
              this.field_b.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("oh.B(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public GzipDecoder() {
        this(-1, 1000000, 1000000);
    }

    private GzipDecoder(int param0, int param1, int param2) {
    }

    public static void releaseStatics(byte param0) {
        playerXLostTwoLives = null;
        if (param0 >= -82) {
          return;
        }
        field_d = null;
        raTitle = null;
        field_c = null;
        createAlertDoublespace = null;
    }

    static {
        field_d = new int[12];
        createAlertDoublespace = "Names cannot contain consecutive spaces";
        field_e = 20000000L;
        field_h = false;
        playerXLostTwoLives = "<%0> lost 2 lives!";
        raTitle = "Report abuse";
    }
}
