/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipDecompressor {
    static Vector field_d;
    static int field_b;
    static int field_c;
    private java.util.zip.Inflater field_a;

    public GzipDecompressor() {
        this(-1, 1000000, 1000000);
    }

    private GzipDecompressor(int param0, int param1, int param2) {
    }

    final void decompress(boolean param0, byte[] param1, PacketBuffer param2) {
        try {
          try {
            if (31 != param2.payload[param2.position] ||
              -117 != param2.payload[1 + param2.position]) {
              throw new RuntimeException("");
            }
            if (param0) {
              GzipDecompressor.clearStaticReferences(50);
            }
            if (this.field_a == null) {
              this.field_a = new java.util.zip.Inflater(true);
            }
            try {
              this.field_a.setInput(param2.payload, param2.position + 10, -8 + (-param2.position - 10) + param2.payload.length);
              this.field_a.inflate(param1);
            } catch (Exception exception) {
              this.field_a.reset();
              throw new RuntimeException("");
            }
            this.field_a.reset();
          } catch (RuntimeException runtimeException) {
            throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ln.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearStaticReferences(int param0) {
        field_d = null;
        if (param0 >= -46) {
          GzipDecompressor.clearStaticReferences(-12);
        }
    }

    static {
        field_b = 66;
        field_d = new Vector();
    }
}
