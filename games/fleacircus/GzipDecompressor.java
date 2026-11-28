/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipDecompressor {
    static ModalDialogHost field_a;
    private java.util.zip.Inflater field_c;
    static int field_e;
    static mf field_b;
    static int field_d;

    public GzipDecompressor() {
        this(-1, 1000000, 1000000);
    }

    final static int a(boolean param0, int param1, int param2, int param3) {
        if (param2 != 10) {
          GzipDecompressor.a(109);
          return fb.b(-122);
        }
        return fb.b(-122);
    }

    final static void a(int param0) {
        DisplayNameSelectionPanel.field_M = TextHotspotBounds.c((byte) 105);
        nb.field_a = new ModalDialogHost();
        wa.a(true, true, 30);
        if (param0 >= -53) {
          GzipDecompressor.a(true, 123, -100, 21);
        }
    }

    private GzipDecompressor(int param0, int param1, int param2) {
    }

    final void decompress(byte param0, byte[] param1, PacketBuffer param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          int var4_int = 0;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2.payload[param2.position] == 31 &&
              param2.payload[param2.position + 1] == -117) {
              if (this.field_c == null) {
                this.field_c = new java.util.zip.Inflater(true);
              }
              var4_int = 84 % ((-67 - param0) / 59);
              try {
                this.field_c.setInput(param2.payload, param2.position + 10, param2.payload.length - param2.position - 10 - 8);
                this.field_c.inflate(param1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_c.reset();
                throw new RuntimeException("");
              }
              this.field_c.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("mg.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw pf.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 != -3) {
          field_b = (mf) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_d = -1;
    }
}
