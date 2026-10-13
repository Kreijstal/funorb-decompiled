/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiFileReader {
    private PacketBuffer packet;
    private static byte[] messageDataLengths;
    private int tempo;
    private int[] runningStatus;
    int[] trackTicks;
    int division;
    private int[] trackPositions;
    private long timeOffset;
    private int[] trackStarts;

    final int getTrackCount() {
        return this.trackPositions.length;
    }

    final int readMessage(int track) {
        int var2 = this.readMessageInternal(track);
        return var2;
    }

    final void seekTrack(int track) {
        this.packet.position = this.trackPositions[track];
    }

    final int timeToTick(long time) {
        long var3 = time - this.timeOffset;
        return (int)((var3 + (long)this.tempo - 1L) / (long)this.tempo);
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

    public static void g() {
        messageDataLengths = null;
    }

    final void markTrackEnded() {
        this.packet.position = -1;
    }

    final void readTrackDelta(int track) {
        int var2 = this.packet.readVarInt((byte) 127);
        this.trackTicks[track] = this.trackTicks[track] + var2;
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

    final void parse(byte[] data) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.packet.data = data;
        this.packet.position = 10;
        int var2 = this.packet.readUnsignedShort(65280);
        this.division = this.packet.readUnsignedShort(65280);
        this.tempo = 500000;
        this.trackStarts = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.packet.readInt(255);
          var5 = this.packet.readInt(255);
          if (var4 == 1297379947) {
            this.trackStarts[var3] = this.packet.position;
            var3++;
          }
          this.packet.position = this.packet.position + var5;
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

    private final int readMessageInternal(int track) {
        int var2;
        int var3;
        int var4;
        var2 = this.packet.data[this.packet.position];
        if (var2 >= 0) {
          var2 = this.runningStatus[track];
        } else {
          var2 = var2 & 255;
          this.runningStatus[track] = var2;
          this.packet.position = this.packet.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.readMessageBody(track, var2);
        }
        var3 = this.packet.readVarInt((byte) -73);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.packet.data[this.packet.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.packet.position = this.packet.position + 1;
            this.runningStatus[track] = var4;
            return this.readMessageBody(track, var4);
          }
        }
        this.packet.position = this.packet.position + var3;
        return 0;
    }

    private final int readMessageBody(int track, int status) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (status == 255) {
          var3 = this.packet.readUnsignedByte(255);
          var4 = this.packet.readVarInt((byte) -75);
          if (var3 == 47) {
            this.packet.position = this.packet.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.packet.readUnsignedMedium((byte) -34);
            var4 -= 3;
            var6 = this.trackTicks[track];
            this.timeOffset = this.timeOffset + (long)var6 * (long)(this.tempo - var5);
            this.tempo = var5;
            this.packet.position = this.packet.position + var4;
            return 2;
          }
          this.packet.position = this.packet.position + var4;
          return 3;
        }
        var3Lifetime1 = messageDataLengths[status - 128];
        var4Lifetime1 = status;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.packet.readUnsignedByte(255) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.packet.readUnsignedByte(255) << 16;
        }
        return var4Lifetime1;
    }

    final void clear() {
        this.packet.data = null;
        this.trackStarts = null;
        this.trackPositions = null;
        this.trackTicks = null;
        this.runningStatus = null;
    }

    final long getTickTime(int tick) {
        return this.timeOffset + (long)tick * (long)this.tempo;
    }

    final void reset(long time) {
        int var4 = 0;
        this.timeOffset = time;
        int var3 = this.trackPositions.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.trackTicks[var4] = 0;
          this.runningStatus[var4] = 0;
          this.packet.position = this.trackStarts[var4];
          this.readTrackDelta(var4);
          this.trackPositions[var4] = this.packet.position;
        }
    }

    final boolean hasData() {
        return this.packet.data != null;
    }

    final void saveTrackPosition(int track) {
        this.trackPositions[track] = this.packet.position;
    }

    MidiFileReader() {
        this.packet = new PacketBuffer((byte[]) null);
    }

    MidiFileReader(byte[] data) {
        this.packet = new PacketBuffer((byte[]) null);
        this.parse(data);
    }

    static {
        messageDataLengths = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
