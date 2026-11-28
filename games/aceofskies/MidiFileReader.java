/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiFileReader {
    private static byte[] field_d;
    private PacketBuffer field_a;
    private int[] field_b;
    int[] field_f;
    private int field_i;
    int field_e;
    private long field_h;
    private int[] field_c;
    private int[] field_g;

    final void seekTrack(int param0) {
        this.field_a.position = this.field_g[param0];
    }

    final void reset(long param0) {
        this.field_h = param0;
        int var3 = this.field_g.length;
        for (int var4 = 0; var4 < var3; var4++) {
          this.field_f[var4] = 0;
          this.field_b[var4] = 0;
          this.field_a.position = this.field_c[var4];
          this.readDelta(var4);
          this.field_g[var4] = this.field_a.position;
        }
    }

    private final int decodeMessagePayload(int param0, int param1) {
        if (param1 == 255) {
          int var3 = this.field_a.readUnsignedByte(70);
          int var4 = this.field_a.readVarInt(116);
          if (var3 == 47) {
            this.field_a.position = this.field_a.position + var4;
            return 1;
          }
          if (var3 == 81) {
            int var5 = this.field_a.readUnsignedMedium((byte) -87);
            var4 -= 3;
            int var6 = this.field_f[param0];
            this.field_h = this.field_h + (long)var6 * (long)(this.field_i - var5);
            this.field_i = var5;
            this.field_a.position = this.field_a.position + var4;
            return 2;
          }
          this.field_a.position = this.field_a.position + var4;
          return 3;
        }
        int var3Lifetime1 = field_d[param1 - 128];
        int var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_a.readUnsignedByte(120) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_a.readUnsignedByte(120) << 16;
        }
        return var4Lifetime1;
    }

    final long tickTime(int param0) {
        return this.field_h + (long)param0 * (long)this.field_i;
    }

    final void parse(byte[] param0) {
        this.field_a.payload = param0;
        this.field_a.position = 10;
        int var2 = this.field_a.readUnsignedShort((byte) 0);
        this.field_e = this.field_a.readUnsignedShort((byte) 0);
        this.field_i = 500000;
        this.field_c = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          int var4 = this.field_a.readInt((byte) 119);
          int var5 = this.field_a.readInt((byte) 117);
          if (var4 == 1297379947) {
            this.field_c[var3] = this.field_a.position;
            var3++;
          }
          this.field_a.position = this.field_a.position + var5;
        }
        this.field_h = 0L;
        this.field_g = new int[var2];
        int var6 = 0;
        int var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_g[var6] = this.field_c[var6];
          var6++;
        }
        this.field_f = new int[var2];
        this.field_b = new int[var2];
    }

    final void readDelta(int param0) {
        int var2 = this.field_a.readVarInt(121);
        this.field_f[param0] = this.field_f[param0] + var2;
    }

    final int nextTrack() {
        int var1 = this.field_g.length;
        int var2 = -1;
        int var3 = 2147483647;
        for (int var4 = 0; var4 < var1; var4++) {
          if (this.field_g[var4] >= 0 &&
            this.field_f[var4] < var3) {
            var2 = var4;
            var3 = this.field_f[var4];
          }
        }
        return var2;
    }

    final boolean hasMidiData() {
        return this.field_a.payload != null;
    }

    final void release() {
        this.field_a.payload = null;
        this.field_c = null;
        this.field_g = null;
        this.field_f = null;
        this.field_b = null;
    }

    final void saveTrackPosition(int param0) {
        this.field_g[param0] = this.field_a.position;
    }

    private final int readNextMessage(int param0) {
        int var2 = this.field_a.payload[this.field_a.position];
        if (var2 >= 0) {
          var2 = this.field_b[param0];
        } else {
          var2 = var2 & 255;
          this.field_b[param0] = var2;
          this.field_a.position = this.field_a.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.decodeMessagePayload(param0, var2);
        }
        int var3 = this.field_a.readVarInt(121);
        if (var2 == 247 &&
          var3 > 0) {
          int var4 = this.field_a.payload[this.field_a.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_a.position = this.field_a.position + 1;
            this.field_b[param0] = var4;
            return this.decodeMessagePayload(param0, var4);
          }
        }
        this.field_a.position = this.field_a.position + var3;
        return 0;
    }

    final void markTrackDone() {
        this.field_a.position = -1;
    }

    final int trackCount() {
        return this.field_g.length;
    }

    final int readMessage(int param0) {
        int var2 = this.readNextMessage(param0);
        return var2;
    }

    final boolean isDone() {
        int var1 = this.field_g.length;
        for (int var2 = 0; var2 < var1; var2++) {
          if (this.field_g[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    public static void clearStaticReferences() {
        field_d = null;
    }

    MidiFileReader() {
        this.field_a = new PacketBuffer((byte[]) null);
    }

    MidiFileReader(byte[] param0) {
        this.field_a = new PacketBuffer((byte[]) null);
        this.parse(param0);
    }

    static {
        field_d = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
