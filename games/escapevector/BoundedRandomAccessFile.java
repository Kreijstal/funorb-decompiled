/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BoundedRandomAccessFile {
    static int[] field_c;
    static long field_g;
    static ReverbPcmStream field_b;
    private RandomAccessFile file;
    private long position;
    private long maximumLength;
    static GameplaySession activeSession;

    final long length(int guard) throws IOException {
        if (guard != -26510) {
          activeSession = (GameplaySession) null;
          return this.file.length();
        }
        return this.file.length();
    }

    final static void legacyFrameHook(int guard, int unusedFirstMetric, NineSliceFrame unusedFrame, int unusedSecondMetric) {
        try {
          if (guard != 25398) {
            NineSliceFrame var5 = (NineSliceFrame) null;
            BoundedRandomAccessFile.legacyFrameHook(-36, 48, (NineSliceFrame) null, -113);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ma.G(" + guard + ',' + unusedFirstMetric + ',' + (unusedFrame != null ? "{...}" : "null") + ',' + unusedSecondMetric + ')');
        }
    }

    final int read(int length, byte guard, byte[] destination, int offset) throws IOException {
        String stackIn_10_2 = null;
        try {
          if (guard <= 124) {
            BoundedRandomAccessFile.releaseStatics(103);
          }
          int var5_int = this.file.read(destination, offset, length);
          if (var5_int > 0) {
            this.position = this.position + (long)var5_int;
          }
          int stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("ma.E(").append(length).append(',').append(guard).append(',');
          if (destination == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(offset).append(')').toString());
        }
    }

    final void seek(long position, int guard) throws IOException {
        if (guard == 1) {
          this.file.seek(position);
          this.position = position;
          return;
        }
        this.position = -21L;
        this.file.seek(position);
        this.position = position;
    }

    final static PointCloudEffect createPointCloud(int count, boolean indexedRendering, int guard) {
        PointCloudEffect var3 = new PointCloudEffect(count);
        var3.indexedRendering = indexedRendering ? true : false;
        if (guard == 8) {
          return var3;
        }
        return (PointCloudEffect) null;
    }

    public static void releaseStatics(int guard) {
        if (guard == 1) {
          field_b = null;
          activeSession = null;
          field_c = null;
          return;
        }
        NineSliceFrame var2 = (NineSliceFrame) null;
        BoundedRandomAccessFile.legacyFrameHook(-114, -57, (NineSliceFrame) null, 13);
        field_b = null;
        activeSession = null;
        field_c = null;
    }

    final static LoginMethod[] loginMethods(boolean guard) {
        if (!guard) {
          return new LoginMethod[]{NameAvailabilityValidator.field_q, MenuEdgeSegment.field_n, PathPoint.field_g};
        }
        field_b = (ReverbPcmStream) null;
        return new LoginMethod[]{NameAvailabilityValidator.field_q, MenuEdgeSegment.field_n, PathPoint.field_g};
    }

    final void write(byte[] source, int length, int offset, int guard) throws IOException {
        try {
          if (guard != -15814) {
            field_c = (int[]) null;
          }
          if (this.maximumLength < this.position + (long)length) {
            this.file.seek(this.maximumLength);
            this.file.write(1);
            throw new EOFException();
          }
          this.file.write(source, offset, length);
          this.position = this.position + (long)length;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ma.A(" + (source != null ? "{...}" : "null") + ',' + length + ',' + offset + ',' + guard + ')');
        }
    }

    final static void writeArchiveKeyRequest(int guard, int opcode, ArchiveKeyRequest request) {
        CipherPacketBuffer var3 = QuickChatDynamicCommand.outgoingPackets;
        var3.writeCipheredOpcode(opcode, true);
        var3.writeByte(request.archiveId, -123);
        if (guard >= -42) {
          return;
        }
        try {
          var3.writeShort(75, request.groupId);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ma.C(" + guard + ',' + opcode + ',' + (request != null ? "{...}" : "null") + ')');
        }
    }

    final void close(int guard) throws IOException {
        if (guard != 0) {
          return;
        }
        if (null != this.file) {
          this.file.close();
          this.file = null;
        }
    }

    BoundedRandomAccessFile(File path, String mode, long maximumLength) throws IOException {
        try {
          if (maximumLength == -1L) {
            maximumLength = 9223372036854775807L;
          }
          if (maximumLength < path.length()) {
            path.delete();
          }
          this.file = new RandomAccessFile(path, mode);
          this.maximumLength = maximumLength;
          this.position = 0L;
          int var5_int = this.file.read();
          if (var5_int != -1 &&
            !mode.equals("r")) {
            this.file.seek(0L);
            this.file.write(var5_int);
          }
          this.file.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ma.<init>(" + (path != null ? "{...}" : "null") + ',' + (mode != null ? "{...}" : "null") + ',' + maximumLength + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.file) {
          System.out.println("");
          this.close(0);
        }
    }

    static {
        field_c = new int[]{5, 11, 8};
    }
}
