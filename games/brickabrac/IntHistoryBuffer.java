/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntHistoryBuffer extends IntrusiveNode {
    int latestIndex;
    static String field_k;
    static ResourceArchive field_i;
    private int[] entries;
    static RgbSprite[] largeRosetteSprites;
    private int capacity;
    static int field_m;

    final int get(int index, int retentionAdjustment) {
        if (index > this.latestIndex) {
          throw new RuntimeException("State in future " + this.latestIndex + " " + index);
        }
        if (index < -this.capacity + this.latestIndex + retentionAdjustment) {
          throw new RuntimeException("State erased " + index + ". Lastest entry: " + this.latestIndex);
        }
        return this.entries[index % this.capacity];
    }

    final void append(int obfuscationGuard, int value) {
        int nextIndex = this.latestIndex + 1;
        this.latestIndex = this.latestIndex + 1;
        this.entries[nextIndex % this.capacity] = value;
        if (obfuscationGuard != -7255) {
          this.append(-25, 104);
        }
    }

    public static void a(int param0) {
        field_i = null;
        largeRosetteSprites = null;
        field_k = null;
        if (param0 != 67108864) {
          largeRosetteSprites = (RgbSprite[]) null;
        }
    }

    IntHistoryBuffer(int capacity) {
        this.latestIndex = -1;
        this.capacity = capacity;
        this.entries = new int[this.capacity];
    }

    static {
        field_k = "Waiting for extra data";
        field_m = field_m | 4;
        field_m = field_m | 8;
        field_m = field_m | 16;
        field_m = field_m | 32;
        field_m = field_m | 64;
        field_m = field_m | 128;
        field_m = field_m | 256;
        field_m = field_m | 512;
        field_m = field_m | 1024;
        field_m = field_m | 2048;
        field_m = field_m | 4096;
        field_m = field_m | 8192;
        field_m = field_m | 16384;
        field_m = field_m | 32768;
        field_m = field_m | 65536;
        field_m = field_m | 131072;
        field_m = field_m | 262144;
        field_m = field_m | 524288;
        field_m = field_m | 1048576;
        field_m = field_m | 2097152;
        field_m = field_m | 4194304;
        field_m = field_m | 8388608;
        field_m = field_m | 16777216;
        field_m = field_m | 67108864;
        field_m = field_m | 134217728;
    }
}
