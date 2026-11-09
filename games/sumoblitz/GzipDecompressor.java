/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipDecompressor {
    static int[] field_e;
    static boolean field_a;
    private java.util.zip.Inflater inflater;
    static int[] field_b;
    static volatile int field_d;

    public GzipDecompressor() {
        this(-1, 1000000, 1000000);
    }

    final static void sendServerDataRead(int guard, int opcode) {
        pl var2 = InwardSparkParticle.field_v;
        var2.g(opcode, 8);
        var2.writeByte((byte) 106, 1);
        if (guard == 11044) {
          var2.writeByte((byte) 79, 0);
          return;
        }
    }

    static int bitwiseXor(int left, int right) {
        return left ^ right;
    }

    final void decompress(byte[] destination, byte guard, PacketBuffer source) {
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
            if (source.payload[source.position] == 31 &&
              source.payload[1 + source.position] == -117) {
              if (null == this.inflater) {
                this.inflater = new java.util.zip.Inflater(true);
              }
              if (guard != -104) {
                this.inflater = (java.util.zip.Inflater) null;
              }
              try {
                this.inflater.setInput(source.payload, 10 + source.position, source.payload.length + (-source.position - 10 - 8));
                this.inflater.inflate(destination);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.inflater.reset();
                throw new RuntimeException("");
              }
              this.inflater.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("jg.C(");
            if (destination == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(',');
            if (source == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private GzipDecompressor(int param0, int param1, int param2) {
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_e = null;
        if (param0 < 2) {
          field_a = true;
        }
    }

    static {
        field_e = new int[1];
        field_a = false;
        field_d = 0;
    }
}
