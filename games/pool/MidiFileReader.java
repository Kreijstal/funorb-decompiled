/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiFileReader {
    private PacketBuffer packet;
    private int[] trackStarts;
    private long timeOffset;
    int field_f;
    private int[] runningStatus;
    private int[] trackPositions;
    private int tempoMicrosPerQuarter;
    private static byte[] field_d;
    int[] trackTicks;

    final int readMessage(int trackIndex) {
        int var2 = this.readNextMessage(trackIndex);
        return var2;
    }

    final boolean a() {
        return this.packet.payload != null;
    }

    final long b(int param0) {
        return this.timeOffset + (long)param0 * (long)this.tempoMicrosPerQuarter;
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

    final void release() {
        this.packet.payload = null;
        this.trackStarts = null;
        this.trackPositions = null;
        this.trackTicks = null;
        this.runningStatus = null;
    }

    final void saveTrackPosition(int trackIndex) {
        this.trackPositions[trackIndex] = this.packet.position;
    }

    final void seekTrack(int trackIndex) {
        this.packet.position = this.trackPositions[trackIndex];
    }

    final void parse(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.packet.payload = param0;
        this.packet.position = 10;
        int var2 = this.packet.readUnsignedShort(-1034);
        this.field_f = this.packet.readUnsignedShort(-1034);
        this.tempoMicrosPerQuarter = 500000;
        this.trackStarts = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.packet.readInt(true);
          var5 = this.packet.readInt(true);
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

    final int d() {
        return this.trackPositions.length;
    }

    final void readDelta(int param0) {
        int var2 = this.packet.readVarInt(88);
        this.trackTicks[param0] = this.trackTicks[param0] + var2;
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

    public static void g() {
        field_d = null;
    }

    final void reset(long param0) {
        int var4 = 0;
        this.timeOffset = param0;
        int var3 = this.trackPositions.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.trackTicks[var4] = 0;
          this.runningStatus[var4] = 0;
          this.packet.position = this.trackStarts[var4];
          this.readDelta(var4);
          this.trackPositions[var4] = this.packet.position;
        }
    }

    private final int decodeMessagePayload(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 255) {
          var3 = this.packet.readUnsignedByte(-123);
          var4 = this.packet.readVarInt(91);
          if (var3 == 47) {
            this.packet.position = this.packet.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.packet.readUnsignedMedium(56);
            var4 -= 3;
            var6 = this.trackTicks[param0];
            this.timeOffset = this.timeOffset + (long)var6 * (long)(this.tempoMicrosPerQuarter - var5);
            this.tempoMicrosPerQuarter = var5;
            this.packet.position = this.packet.position + var4;
            return 2;
          }
          this.packet.position = this.packet.position + var4;
          return 3;
        }
        var3Lifetime1 = field_d[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.packet.readUnsignedByte(-65) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.packet.readUnsignedByte(-127) << 16;
        }
        return var4Lifetime1;
    }

    private final int readNextMessage(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.packet.payload[this.packet.position];
        if (var2 >= 0) {
          var2 = this.runningStatus[param0];
        } else {
          var2 = var2 & 255;
          this.runningStatus[param0] = var2;
          this.packet.position = this.packet.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.decodeMessagePayload(param0, var2);
        }
        var3 = this.packet.readVarInt(-75);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.packet.payload[this.packet.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.packet.position = this.packet.position + 1;
            this.runningStatus[param0] = var4;
            return this.decodeMessagePayload(param0, var4);
          }
        }
        this.packet.position = this.packet.position + var3;
        return 0;
    }

    MidiFileReader() {
        this.packet = new PacketBuffer((byte[]) null);
    }

    MidiFileReader(byte[] param0) {
        this.packet = new PacketBuffer((byte[]) null);
        this.parse(param0);
    }

    final void c() {
        this.packet.position = -1;
    }

    static {
        field_d = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
