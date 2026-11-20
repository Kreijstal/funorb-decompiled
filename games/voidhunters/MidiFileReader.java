/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiFileReader {
    private PacketBuffer buffer;
    private static byte[] messageDataLengths;
    int division;
    private int tempo;
    int[] trackTicks;
    private int[] runningStatus;
    private int[] trackPositions;
    private int[] trackStarts;
    private long timeOffset;

    final int getNextTrack() {
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

    final void clear() {
        this.buffer.payload = null;
        this.trackStarts = null;
        this.trackPositions = null;
        this.trackTicks = null;
        this.runningStatus = null;
    }

    final void markTrackPosition(int param0) {
        this.trackPositions[param0] = this.buffer.position;
    }

    public static void clearSharedReferences() {
        messageDataLengths = null;
    }

    final void readTrackDelta(int param0) {
        int var2 = this.buffer.readVarInt(11436);
        this.trackTicks[param0] = this.trackTicks[param0] + var2;
    }

    final void parse(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.buffer.payload = param0;
        this.buffer.position = 10;
        int var2 = this.buffer.readUnsignedShort(1869);
        this.division = this.buffer.readUnsignedShort(1869);
        this.tempo = 500000;
        this.trackStarts = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.buffer.readInt(65);
          var5 = this.buffer.readInt(49);
          if (var4 == 1297379947) {
            this.trackStarts[var3] = this.buffer.position;
            var3++;
          }
          this.buffer.position = this.buffer.position + var5;
        }
        this.timeOffset = 0L;
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

    final int getTrackCount() {
        return this.trackPositions.length;
    }

    private final int readMessageData(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 255) {
          var3 = this.buffer.readUnsignedByte((byte) -119);
          var4 = this.buffer.readVarInt(11436);
          if (var3 == 47) {
            this.buffer.position = this.buffer.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.buffer.readUnsignedMedium((byte) -124);
            var4 -= 3;
            var6 = this.trackTicks[param0];
            this.timeOffset = this.timeOffset + (long)var6 * (long)(this.tempo - var5);
            this.tempo = var5;
            this.buffer.position = this.buffer.position + var4;
            return 2;
          }
          this.buffer.position = this.buffer.position + var4;
          return 3;
        }
        var3Lifetime1 = messageDataLengths[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.buffer.readUnsignedByte((byte) -126) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.buffer.readUnsignedByte((byte) -93) << 16;
        }
        return var4Lifetime1;
    }

    final long getTickTime(int param0) {
        return this.timeOffset + (long)param0 * (long)this.tempo;
    }

    final void gotoTrack(int param0) {
        this.buffer.position = this.trackPositions[param0];
    }

    final boolean isDone() {
        int var2 = 0;
        int var1 = this.trackPositions.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.trackPositions[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    final void setTrackDone() {
        this.buffer.position = -1;
    }

    final int readMessage(int param0) {
        int var2 = this.readMessageWithStatus(param0);
        return var2;
    }

    private final int readMessageWithStatus(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.buffer.payload[this.buffer.position];
        if (var2 >= 0) {
          var2 = this.runningStatus[param0];
        } else {
          var2 = var2 & 255;
          this.runningStatus[param0] = var2;
          this.buffer.position = this.buffer.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.readMessageData(param0, var2);
        }
        var3 = this.buffer.readVarInt(11436);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.buffer.payload[this.buffer.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.buffer.position = this.buffer.position + 1;
            this.runningStatus[param0] = var4;
            return this.readMessageData(param0, var4);
          }
        }
        this.buffer.position = this.buffer.position + var3;
        return 0;
    }

    final boolean isReady() {
        return this.buffer.payload != null;
    }

    MidiFileReader() {
        this.buffer = new PacketBuffer((byte[]) null);
    }

    MidiFileReader(byte[] param0) {
        this.buffer = new PacketBuffer((byte[]) null);
        this.parse(param0);
    }

    final void reset(long param0) {
        int var4 = 0;
        this.timeOffset = param0;
        int var3 = this.trackPositions.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.trackTicks[var4] = 0;
          this.runningStatus[var4] = 0;
          this.buffer.position = this.trackStarts[var4];
          this.readTrackDelta(var4);
          this.trackPositions[var4] = this.buffer.position;
        }
    }

    static {
        messageDataLengths = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
