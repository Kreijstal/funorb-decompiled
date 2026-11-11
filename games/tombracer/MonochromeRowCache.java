/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MonochromeRowCache {
    private int height;
    private int lastRow;
    private int capacity;
    private IntrusiveDeque lru;
    private MonochromeRowCacheEntry[] field_f;
    static int field_i;
    private int usedCount;
    private int[][] rows;
    boolean rowMissed;

    final int[] getRow(byte param0, int param1) {
        boolean stackIn_4_1 = false;
        boolean stackIn_9_1 = false;
        int var3;
        MonochromeRowCacheEntry var4;
        MonochromeRowCacheEntry var5;
        int var6;
        MonochromeRowCacheEntry var5Lifetime1;
        MonochromeRowCacheEntry var5Lifetime2;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = 8 % ((param0 + 43) / 59);
        if (this.capacity == this.height) {
          stackIn_4_1 = (this.field_f[param1] == null);
          this.rowMissed = stackIn_4_1;
          this.field_f[param1] = nea.field_a;
          return this.rows[param1];
        }
        if (1 == this.capacity) {
          stackIn_9_1 = (param1 != this.lastRow);
          this.rowMissed = stackIn_9_1;
          this.lastRow = param1;
          return this.rows[0];
        }
        var4 = this.field_f[param1];
        var5 = var4;
        var5Lifetime1 = var4;
        if (var4 == null) {
          this.rowMissed = true;
          if (this.usedCount < this.capacity) {
            var4 = new MonochromeRowCacheEntry(param1, this.usedCount);
            this.usedCount = this.usedCount + 1;
          } else {
            var5Lifetime2 = (MonochromeRowCacheEntry) (this.lru.last(3));
            var4 = new MonochromeRowCacheEntry(param1, var5Lifetime2.field_j);
            this.field_f[var5Lifetime2.field_h] = null;
            var5Lifetime2.unlink(69);
          }
          this.field_f[param1] = var4;
        } else {
          this.rowMissed = false;
        }
        this.lru.addFirst((byte) 103, (IntrusiveNode) (var4));
        return this.rows[var4.field_j];
    }

    final void release(boolean param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < this.capacity; var2++) {
          this.rows[var2] = null;
        }
        this.rows = (int[][]) null;
        this.field_f = null;
        this.lru.clear(8);
        this.lru = null;
        if (param0) {
          this.release(true);
        }
    }

    final int[][] getAllRows(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (this.capacity != this.height) {
          throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = param0; var2 < this.capacity; var2++) {
          this.field_f[var2] = nea.field_a;
        }
        return this.rows;
    }

    MonochromeRowCache(int param0, int param1, int param2) {
        this.lastRow = -1;
        this.usedCount = 0;
        this.lru = new IntrusiveDeque();
        this.rowMissed = false;
        this.capacity = param0;
        this.height = param1;
        this.rows = new int[this.capacity][param2];
        this.field_f = new MonochromeRowCacheEntry[this.height];
    }

    static {
        field_i = 35;
    }
}
