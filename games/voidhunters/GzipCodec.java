/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipCodec {
    private int initialBufferSize;
    static int field_h;
    static int alternateChecksumDelay;
    private java.util.zip.Inflater inflater;
    PacketBuffer compressedOutput;
    private java.util.zip.Deflater deflater;
    private java.util.zip.CRC32 crc32;
    private int bufferGrowth;
    static int alternateHistoryLength;
    private int compressionLevel;

    final byte[] decompress(int param0, byte[] param1) {
        PacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new PacketBuffer(param1);
          var3.position = -4 + param1.length;
          var4 = var3.readIntLE(11468);
          var3.position = param0;
          var5 = new byte[var4];
          this.decompress(20773, var5, var3);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("lla.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public GzipCodec() {
        this(-1, 1000000, 1000000);
    }

    final void decompress(int param0, byte[] param1, PacketBuffer param2) {
        try {
          try {
            if (param2.payload[param2.position] != 31 ||
              -117 != param2.payload[param2.position + 1]) {
              throw new RuntimeException("");
            }
            if (this.inflater == null) {
              this.inflater = new java.util.zip.Inflater(true);
            }
            try {
              this.inflater.setInput(param2.payload, param2.position + 10, -10 - (param2.position + 8) + param2.payload.length);
              if (param0 != 20773) {
                alternateChecksumDelay = 59;
              }
              this.inflater.inflate(param1);
            } catch (Exception exception) {
              this.inflater.reset();
              throw new RuntimeException("");
            }
            this.inflater.reset();
          } catch (RuntimeException runtimeException) {
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lla.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void compress(int param0, int param1, byte[] param2, int param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        var8 = VoidHunters.field_G;
        try {
          if (null == this.compressedOutput) {
            this.deflater = new java.util.zip.Deflater(this.compressionLevel, true);
            this.crc32 = new java.util.zip.CRC32();
            this.compressedOutput = new PacketBuffer(this.initialBufferSize);
            this.compressedOutput.writeBytes(0, VertexAttribute.gzipHeader, -1, VertexAttribute.gzipHeader.length);
          } else {
            this.compressedOutput.position = VertexAttribute.gzipHeader.length;
          }
          this.crc32.update(param2, param1, param3);
          this.deflater.setInput(param2, param1, param3);
          this.deflater.finish();
          var5_int = 1;
          while (true) {
            var6 = this.compressedOutput.payload.length - this.compressedOutput.position;
            if (var6 < 8) {
              var10 = new byte[this.bufferGrowth + this.compressedOutput.payload.length];
              var9 = var10;
              var7 = var9;
              ArrayOperations.copy(this.compressedOutput.payload, 0, var10, 0, this.compressedOutput.position);
              var6 = var6 + this.bufferGrowth;
              this.compressedOutput.payload = var7;
              if (var5_int != 0) {
                var5_int = 0;
                System.out.println("[blue]Warning: GZIP deflate buffer required expanding[/blue]");
              }
            }
            if (!this.deflater.finished()) {
              this.compressedOutput.position = this.compressedOutput.position + this.deflater.deflate(this.compressedOutput.payload, this.compressedOutput.position, var6);
              continue;
            }
            break;
          }
          this.compressedOutput.writeIntLE((byte) 103, (int)this.crc32.getValue());
          if (param0 < 72) {
            return;
          }
          this.compressedOutput.writeIntLE((byte) 93, this.deflater.getTotalIn());
          this.deflater.reset();
          this.crc32.reset();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("lla.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    private GzipCodec(int param0, int param1, int param2) {
        this.bufferGrowth = param2;
        this.initialBufferSize = param1;
        this.compressionLevel = param0;
    }

    static {
        field_h = 2;
        alternateHistoryLength = 200;
        alternateChecksumDelay = alternateHistoryLength / 2;
    }
}
