/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedLruCache {
    private int capacity;
    private int remainingCapacity;
    static int[] terrainDamageTakenPercent;
    static int field_d;
    private IterableDualNodeDeque lruEntries;
    private IterableNodeHashTable entries;
    static ll field_b;

    final Object get(long key, byte obfuscationGuard) {
        StrongCacheEntry promotedEntry = null;
        CacheEntry entry = (CacheEntry) (this.entries.get(13497, key));
        StrongCacheEntry guardedPromotedEntry;
        if (entry == null) {
          return null;
        }
        Object value = entry.getValue(false);
        if (value == null) {
          entry.unlink(123);
          entry.unlinkSecondary((byte) -76);
          this.remainingCapacity = this.remainingCapacity + entry.weight;
          return null;
        }
        if (obfuscationGuard > 121) {
          if (!entry.isReferenceBacked(true)) {
            this.lruEntries.addLast(-96, entry);
            entry.secondaryKey = 0L;
          } else {
            promotedEntry = new StrongCacheEntry(value, entry.weight);
            this.entries.put(promotedEntry, false, entry.key);
            this.lruEntries.addLast(-96, promotedEntry);
            ((CacheEntry) ((Object) promotedEntry)).secondaryKey = 0L;
            entry.unlink(97);
            entry.unlinkSecondary((byte) -76);
          }
          return value;
        }
        this.remove(-102L, 20);
        if (!entry.isReferenceBacked(true)) {
          this.lruEntries.addLast(-96, entry);
          entry.secondaryKey = 0L;
        } else {
          guardedPromotedEntry = new StrongCacheEntry(value, entry.weight);
          this.entries.put(guardedPromotedEntry, false, entry.key);
          this.lruEntries.addLast(-96, guardedPromotedEntry);
          ((CacheEntry) ((Object) guardedPromotedEntry)).secondaryKey = 0L;
          entry.unlink(97);
          entry.unlinkSecondary((byte) -76);
        }
        return value;
    }

    private final void removeEntry(CacheEntry entry, int obfuscationGuard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (entry != null) {
            entry.unlink(obfuscationGuard ^ -115);
            entry.unlinkSecondary((byte) -76);
            this.remainingCapacity = this.remainingCapacity + entry.weight;
          }
          if (obfuscationGuard == 0) {
            return;
          }
          this.entries = (IterableNodeHashTable) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ri.F(");
          if (entry == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void putWeighted(Object value, byte obfuscationGuard, int weight, long key) {
        CacheEntry evictedEntry = null;
        StrongCacheEntry newEntry = null;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.capacity < weight) {
            throw new IllegalStateException();
          }
          this.remove(key, -75);
          this.remainingCapacity = this.remainingCapacity - weight;
          while (0 > this.remainingCapacity) {
            evictedEntry = (CacheEntry) (this.lruEntries.popFirst(false));
            this.removeEntry(evictedEntry, 0);
          }
          int guardRemainder = 105 % ((4 - obfuscationGuard) / 34);
          newEntry = new StrongCacheEntry(value, weight);
          this.entries.put(newEntry, false, key);
          this.lruEntries.addLast(-96, newEntry);
          ((CacheEntry) ((Object) newEntry)).secondaryKey = 0L;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ri.B(" + (value != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + weight + ',' + key + ')');
        }
    }

    private final void remove(long key, int obfuscationGuard) {
        if (obfuscationGuard > -64) {
          return;
        }
        CacheEntry var4 = (CacheEntry) (this.entries.get(13497, key));
        this.removeEntry(var4, 0);
    }

    final void put(Object value, int obfuscationGuard, long key) {
        try {
          this.putWeighted(value, (byte) -46, 1, key);
          if (obfuscationGuard != 100) {
            this.get(64L, (byte) 125);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ri.D(" + (value != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + key + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -24 % ((14 - param0) / 59);
        field_b = null;
        terrainDamageTakenPercent = null;
    }

    WeightedLruCache(int capacity) {
        this(capacity, capacity);
    }

    private WeightedLruCache(int capacity, int bucketGrowthLimit) {
        int var3;
        this.lruEntries = new IterableDualNodeDeque();
        this.remainingCapacity = capacity;
        this.capacity = capacity;
        var3 = 1;
        while (true) {
          if (capacity <= var3 + var3) {
            this.entries = new IterableNodeHashTable(var3);
            return;
          }
          if (bucketGrowthLimit > var3) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.entries = new IterableNodeHashTable(var3);
        return;
    }

    static {
        terrainDamageTakenPercent = new int[]{100, 100, 60, 80, 90, 90, 100, 100, 80, 70, 100, 100, 90, 100, 70, 90};
        field_d = 0;
    }
}
