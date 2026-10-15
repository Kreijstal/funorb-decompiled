/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedLruCache {
    private int capacity;
    static java.math.BigInteger field_g;
    static int privateChatFilter;
    private int remainingCapacity;
    static String validEmailMessage;
    private IterableIntrusiveHashTable index;
    static RgbSprite field_e;
    private DualLinkDeque lruEntries;
    static int[] powerUpDropPeriods;
    static PcmStream primaryActivityLoop;
    static String field_h;
    static int canvasWidth;
    static int canvasOffsetX;

    final Object get(long key, boolean obfuscationGuard) {
        CacheEntry entry = (CacheEntry) (this.index.get(key, 101));
        if (entry == null) {
          return null;
        }
        Object value = entry.getValue(1);
        if (value == null) {
          entry.unlink((byte) 111);
          entry.unlinkSecondary(3);
          this.remainingCapacity = this.remainingCapacity + entry.weight;
          return null;
        }
        if (!entry.isSoft(obfuscationGuard)) {
          this.lruEntries.addLast(entry, (byte) -126);
          entry.secondaryKey = 0L;
          return value;
        }
        StrongCacheEntry promotedEntry = new StrongCacheEntry(value, entry.weight);
        this.index.put((byte) 44, entry.key, promotedEntry);
        this.lruEntries.addLast(promotedEntry, (byte) -119);
        ((CacheEntry) ((Object) promotedEntry)).secondaryKey = 0L;
        entry.unlink((byte) 111);
        entry.unlinkSecondary(3);
        return value;
    }

    WeightedLruCache(int capacity) {
        this(capacity, capacity);
    }

    private final void removeKey(long key, int obfuscationGuard) {
        int var4 = -89 % ((-26 - obfuscationGuard) / 48);
        CacheEntry var5 = (CacheEntry) (this.index.get(key, 121));
        this.removeEntry(false, var5);
    }

    private final void putWeighted(int obfuscationGuard, long key, int weight, Object value) {
        CacheEntry evictedEntry = null;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (weight > this.capacity) {
          throw new IllegalStateException();
        }
        this.removeKey(key, 38);
        this.remainingCapacity = this.remainingCapacity - weight;
        while (this.remainingCapacity < 0) {
          evictedEntry = (CacheEntry) (this.lruEntries.removeFirst(false));
          this.removeEntry(false, evictedEntry);
        }
        StrongCacheEntry newEntry = new StrongCacheEntry(value, weight);
        this.index.put((byte) 79, key, newEntry);
        this.lruEntries.addLast(newEntry, (byte) -123);
        if (obfuscationGuard != -1) {
          return;
        }
        try {
          ((CacheEntry) ((Object) newEntry)).secondaryKey = 0L;
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "to.C(" + obfuscationGuard + ',' + key + ',' + weight + ',' + (value != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        primaryActivityLoop = null;
        int var1 = 77 / ((-29 - param0) / 44);
        validEmailMessage = null;
        field_h = null;
        powerUpDropPeriods = null;
        field_g = null;
    }

    final void put(int obfuscationGuard, Object value, long key) {
        try {
          this.putWeighted(-1, key, 1, value);
          if (obfuscationGuard < 60) {
            this.removeKey(35L, -69);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "to.E(" + obfuscationGuard + ',' + (value != null ? "{...}" : "null") + ',' + key + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 > -127) {
          powerUpDropPeriods = (int[]) null;
          LabeledWidget.emailAvailabilityRequest.complete(param0, 20892);
          return;
        }
        LabeledWidget.emailAvailabilityRequest.complete(param0, 20892);
    }

    private final void removeEntry(boolean obfuscationGuard, CacheEntry entry) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard) {
            canvasOffsetX = -88;
          }
          if (entry == null) {
            return;
          }
          entry.unlink((byte) 111);
          entry.unlinkSecondary(3);
          this.remainingCapacity = this.remainingCapacity + entry.weight;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("to.D(").append(obfuscationGuard).append(',');
          if (entry == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private WeightedLruCache(int capacity, int bucketLimit) {
        int bucketCount;
        this.lruEntries = new DualLinkDeque();
        this.capacity = capacity;
        this.remainingCapacity = capacity;
        bucketCount = 1;
        while (true) {
          if (bucketCount + bucketCount >= capacity) {
            this.index = new IterableIntrusiveHashTable(bucketCount);
            return;
          }
          if (bucketLimit > bucketCount) {
            bucketCount = bucketCount + bucketCount;
            continue;
          }
          break;
        }
        this.index = new IterableIntrusiveHashTable(bucketCount);
        return;
    }

    static {
        privateChatFilter = 2;
        field_g = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_h = "<%0> is not on your ignore list.";
        validEmailMessage = "Email is valid";
        powerUpDropPeriods = new int[29];
        powerUpDropPeriods[3] = 5;
        powerUpDropPeriods[15] = 2;
        powerUpDropPeriods[22] = -1;
        powerUpDropPeriods[27] = -1;
        powerUpDropPeriods[14] = 5;
        powerUpDropPeriods[26] = -1;
        powerUpDropPeriods[20] = -1;
        powerUpDropPeriods[0] = -1;
        powerUpDropPeriods[28] = -1;
        powerUpDropPeriods[13] = 2;
        powerUpDropPeriods[1] = -1;
        powerUpDropPeriods[21] = -1;
        powerUpDropPeriods[8] = 2;
        powerUpDropPeriods[7] = 2;
        powerUpDropPeriods[6] = 5;
        powerUpDropPeriods[23] = -1;
        powerUpDropPeriods[4] = 5;
        powerUpDropPeriods[18] = 10;
        powerUpDropPeriods[2] = -1;
        powerUpDropPeriods[9] = 2;
        powerUpDropPeriods[24] = -1;
        powerUpDropPeriods[25] = -1;
        powerUpDropPeriods[16] = 5;
        powerUpDropPeriods[12] = 10;
        powerUpDropPeriods[17] = 2;
        powerUpDropPeriods[10] = 5;
        powerUpDropPeriods[19] = -1;
        powerUpDropPeriods[11] = 2;
        powerUpDropPeriods[5] = 10;
        canvasOffsetX = 0;
    }
}
