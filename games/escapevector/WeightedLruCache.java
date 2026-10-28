/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedLruCache {
    private IterableDualLinkDeque recency;
    private int remainingWeight;
    private int capacity;
    static boolean[] field_c;
    private IterableNodeHashTable entries;
    static String field_f;
    static String field_e;

    private final void remove(long key, int guard) {
        if (guard == 0) {
          WeightedCacheEntry var4 = (WeightedCacheEntry) (this.entries.get(-2678, key));
          this.removeEntry(var4, (byte) 20);
          return;
        }
        this.remove(52L, 125);
        WeightedCacheEntry var4Lifetime1 = (WeightedCacheEntry) (this.entries.get(-2678, key));
        this.removeEntry(var4Lifetime1, (byte) 20);
    }

    private final void putWeighted(long key, Object value, int weight, int guard) {
        int var7 = EscapeVector.obfuscationControl;
        if (weight > this.capacity) {
          throw new IllegalStateException();
        }
        this.remove(key, 0);
        this.remainingWeight = this.remainingWeight - weight;
        while (this.remainingWeight < 0) {
          WeightedCacheEntry var6 = (WeightedCacheEntry) (this.recency.removeFirst((byte) 102));
          this.removeEntry(var6, (byte) -113);
        }
        if (guard != 11261) {
          return;
        }
        try {
          StrongCacheEntry var6_ref = new StrongCacheEntry(value, weight);
          this.entries.put(key, (byte) -106, var6_ref);
          this.recency.addLast(false, var6_ref);
          ((WeightedCacheEntry) ((Object) var6_ref)).secondaryKey = 0L;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "fa.D(" + key + ',' + (value != null ? "{...}" : "null") + ',' + weight + ',' + guard + ')');
        }
    }

    final void put(Object value, long key, byte guard) {
        if (guard <= 53) {
          return;
        }
        try {
          this.putWeighted(key, value, 1, 11261);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "fa.B(" + (value != null ? "{...}" : "null") + ',' + key + ',' + guard + ')');
        }
    }

    public static void releaseStatics(boolean guard) {
        field_f = null;
        field_e = null;
        field_c = null;
        if (!guard) {
          field_e = (String) null;
        }
    }

    private final void removeEntry(WeightedCacheEntry entry, byte guard) {
        String stackIn_7_2 = null;
        try {
          int var3_int = 38 / ((guard + 70) / 38);
          if (entry == null) {
            return;
          }
          entry.unlink((byte) -94);
          entry.unlinkSecondary(117);
          this.remainingWeight = this.remainingWeight + entry.weight;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("fa.E(");
          if (entry == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    final Object get(long key, byte guard) {
        WeightedCacheEntry var7 = (WeightedCacheEntry) (this.entries.get(-2678, key));
        if (var7 == null) {
          return null;
        }
        if (guard != -54) {
          return (Object) null;
        }
        Object var5 = var7.getValue((byte) 97);
        if (var5 == null) {
          var7.unlink((byte) -85);
          var7.unlinkSecondary(-58);
          this.remainingWeight = this.remainingWeight + var7.weight;
          return null;
        }
        if (!var7.isSoft((byte) 120)) {
          this.recency.addLast(false, var7);
          var7.secondaryKey = 0L;
          return var5;
        }
        StrongCacheEntry var6 = new StrongCacheEntry(var5, var7.weight);
        this.entries.put(var7.key, (byte) -106, var6);
        this.recency.addLast(false, var6);
        ((WeightedCacheEntry) ((Object) var6)).secondaryKey = 0L;
        var7.unlink((byte) -123);
        var7.unlinkSecondary(guard ^ 25);
        return var5;
    }

    final static ih loadBitmapFont(int guard, ResourceArchive metricsArchive, int groupId, ResourceArchive glyphArchive, int fileId) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (guard != 1) {
            WeightedLruCache.releaseStatics(true);
          }
          if (uc.a(glyphArchive, 121, groupId, fileId)) {
            ih stackIn_6_0 = DropTargetWidget.a(16826, metricsArchive.getFile(groupId, (byte) -97, fileId));
            return stackIn_6_0;
          }
          Object stackIn_4_0 = null;
          return (ih) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("fa.G(").append(guard).append(',');
          if (metricsArchive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(groupId).append(',');
          if (glyphArchive == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(fileId).append(')').toString());
        }
    }

    private WeightedLruCache() throws Throwable {
        throw new Error();
    }

    static {
        field_c = new boolean[7];
        field_f = "Return to Pause Menu";
        field_e = "WARNING: HIGH GRAVITY";
    }
}
