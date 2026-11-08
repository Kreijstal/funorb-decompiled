/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiFileReader {
    private static byte[] messageLengths;
    private PacketBuffer buffer;
    int division;
    private int[] trackStarts;
    int[] trackTicks;
    private int[] runningStatus;
    private int tempo;
    private int[] trackPositions;
    private long timeBase;

    final void markTrackDone() {
        this.buffer.position = -1;
    }

    final int trackCount() {
        return this.trackPositions.length;
    }

    final void parse(byte[] midiBytes) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.buffer.payload = midiBytes;
        this.buffer.position = 10;
        int var2 = this.buffer.readUnsignedShort(255);
        this.division = this.buffer.readUnsignedShort(255);
        this.tempo = 500000;
        this.trackStarts = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.buffer.readInt(true);
          var5 = this.buffer.readInt(true);
          if (var4 == 1297379947) {
            this.trackStarts[var3] = this.buffer.position;
            var3++;
          }
          this.buffer.position = this.buffer.position + var5;
        }
        this.timeBase = 0L;
        this.trackPositions = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.trackPositions[var6] = this.trackStarts[var6];
          var6++;
        }
        this.trackTicks = new int[var2];
        this.runningStatus = new int[var2];
    }

    final int nextTrack() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.trackPositions.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.trackPositions[var4] >= 0 &&
            this.trackTicks[var4] < var3) {
            var2 = var4;
            var3 = this.trackTicks[var4];
          }
        }
        return var2;
    }

    final void seekTrack(int track) {
        this.buffer.position = this.trackPositions[track];
    }

    final void clear() {
        this.buffer.payload = null;
        this.trackStarts = null;
        this.trackPositions = null;
        this.trackTicks = null;
        this.runningStatus = null;
    }

    final void reset(long param0) {
        int var4 = 0;
        this.timeBase = param0;
        int var3 = this.trackPositions.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.trackTicks[var4] = 0;
          this.runningStatus[var4] = 0;
          this.buffer.position = this.trackStarts[var4];
          this.readTrackDelta(var4);
          this.trackPositions[var4] = this.buffer.position;
        }
    }

    private final int readRunningStatusMessage(int track) {
        int var2;
        int var3;
        int var4;
        var2 = this.buffer.payload[this.buffer.position];
        if (var2 >= 0) {
          var2 = this.runningStatus[track];
        } else {
          var2 = var2 & 255;
          this.runningStatus[track] = var2;
          this.buffer.position = this.buffer.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.readMessageData(track, var2);
        }
        var3 = this.buffer.readVarInt((byte) 93);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.buffer.payload[this.buffer.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.buffer.position = this.buffer.position + 1;
            this.runningStatus[track] = var4;
            return this.readMessageData(track, var4);
          }
        }
        this.buffer.position = this.buffer.position + var3;
        return 0;
    }

    final void readTrackDelta(int track) {
        int var2 = this.buffer.readVarInt((byte) 127);
        this.trackTicks[track] = this.trackTicks[track] + var2;
    }

    final int readMessage(int track) {
        int var2 = this.readRunningStatusMessage(track);
        return var2;
    }

    private final int readMessageData(int track, int status) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (status == 255) {
          var3 = this.buffer.readUnsignedByte(-31302);
          var4 = this.buffer.readVarInt((byte) 105);
          if (var3 == 47) {
            this.buffer.position = this.buffer.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.buffer.readUnsignedMedium((byte) 124);
            var4 -= 3;
            var6 = this.trackTicks[track];
            this.timeBase = this.timeBase + (long)var6 * (long)(this.tempo - var5);
            this.tempo = var5;
            this.buffer.position = this.buffer.position + var4;
            return 2;
          }
          this.buffer.position = this.buffer.position + var4;
          return 3;
        }
        var3Lifetime1 = messageLengths[status - 128];
        var4Lifetime1 = status;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.buffer.readUnsignedByte(-31302) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.buffer.readUnsignedByte(-31302) << 16;
        }
        return var4Lifetime1;
    }

    public static void releaseStatics() {
        messageLengths = null;
    }

    final int ticksAtTimeCeiling(long time) {
        long var3 = time - this.timeBase;
        return (int)((var3 + (long)this.tempo - 1L) / (long)this.tempo);
    }

    final boolean allTracksDone() {
        int var2 = 0;
        int var1 = this.trackPositions.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.trackPositions[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    final long timeAtTick(int tick) {
        return this.timeBase + (long)tick * (long)this.tempo;
    }

    final boolean isReady() {
        return this.buffer.payload != null;
    }

    MidiFileReader() {
        this.buffer = new PacketBuffer((byte[]) null);
    }

    final void saveTrackPosition(int track) {
        this.trackPositions[track] = this.buffer.position;
    }

    MidiFileReader(byte[] param0) {
        this.buffer = new PacketBuffer((byte[]) null);
        this.parse(param0);
    }

    static {
        messageLengths = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
