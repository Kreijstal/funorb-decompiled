/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftLruCache {
    static String field_a;
    private int capacity;
    private SecondaryNodeDeque recency;
    private IntrusiveNodeHashTable entries;
    private int remainingCapacity;

    final void clear(byte param0) {
        if (param0 > 72) {
          this.recency.clear((byte) 61);
          this.entries.clear(0);
          this.remainingCapacity = this.capacity;
          return;
        }
        field_a = (String) null;
        this.recency.clear((byte) 61);
        this.entries.clear(0);
        this.remainingCapacity = this.capacity;
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        int var1 = 77 / ((62 - param0) / 56);
    }

    private final void putWeighted(int param0, Object param1, long param2, int param3) {
        CacheReference var6 = null;
        StrongCacheReference var6_ref = null;
        int var7 = VoidHunters.field_G;
        if (param3 > this.capacity) {
          throw new IllegalStateException();
        }
        this.remove(-70, param2);
        this.remainingCapacity = this.remainingCapacity - param3;
        while (0 > this.remainingCapacity) {
          var6 = (CacheReference) (this.recency.removeFirst(-7481));
          this.removeReference(var6, -17173);
        }
        if (param0 > -43) {
          return;
        }
        try {
          var6_ref = new StrongCacheReference(param1, param3);
          this.entries.put(var6_ref, 0, param2);
          this.recency.addLast(-17569, var6_ref);
          ((CacheReference) ((Object) var6_ref)).secondaryKey = 0L;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "pfb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    SoftLruCache(int param0) {
        this(param0, param0);
    }

    final void put(Object param0, long param1, byte param2) {
        try {
          if (param2 != -117) {
            SoftLruCache.clearSharedReferences(-73);
          }
          this.putWeighted(param2 ^ 20, param0, param1, 1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "pfb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final Object first(byte param0) {
        Object var3 = null;
        CacheReference var4 = null;
        int var5 = VoidHunters.field_G;
        CacheReference var2 = (CacheReference) (this.entries.first(param0 ^ 33));
        while (var2 != null) {
          var3 = var2.getValue(120);
          if (var3 != null) {
            return var3;
          }
          var4 = var2;
          var2 = (CacheReference) (this.entries.next((byte) 44));
          var4.unlink(param0 ^ -3911);
          var4.unlinkSecondary((byte) -35);
          this.remainingCapacity = this.remainingCapacity + var4.weight;
        }
        if (param0 != 67) {
          return (Object) null;
        }
        return null;
    }

    final void age(boolean param0, int param1) {
        long fieldTemp$0 = 0L;
        long fieldTemp$1 = 0L;
        Object var3;
        CacheReference var3_ref;
        SoftCacheReference var4;
        int var5;
        CacheReference var3_refLifetime1;
        SoftCacheReference var4Lifetime1;
        var3 = null;
        var5 = VoidHunters.field_G;
        if (param0) {
          var3_ref = (CacheReference) (this.recency.first(false));
          while (var3_ref != null) {
            if (!var3_ref.isSoft((byte) 74)) {
              fieldTemp$0 = var3_ref.secondaryKey + 1L;
              var3_ref.secondaryKey = var3_ref.secondaryKey + 1L;
              if ((long)param1 < fieldTemp$0) {
                var4 = new SoftCacheReference(var3_ref.getValue(122), var3_ref.weight);
                this.entries.put(var4, 0, var3_ref.key);
                SetMassDriverEnergyUsed.a(var4, var3_ref, (byte) -68);
                var3_ref.unlink(-3846);
                var3_ref.unlinkSecondary((byte) -35);
              }
            } else {
              if (null == var3_ref.getValue(107)) {
                var3_ref.unlink(-3846);
                var3_ref.unlinkSecondary((byte) -35);
                this.remainingCapacity = this.remainingCapacity + var3_ref.weight;
              }
            }
            var3_ref = (CacheReference) (this.recency.next(8063));
          }
          return;
        }
        this.remainingCapacity = 105;
        var3_refLifetime1 = (CacheReference) (this.recency.first(false));
        while (var3_refLifetime1 != null) {
          if (!var3_refLifetime1.isSoft((byte) 74)) {
            fieldTemp$1 = var3_refLifetime1.secondaryKey + 1L;
            var3_refLifetime1.secondaryKey = var3_refLifetime1.secondaryKey + 1L;
            if ((long)param1 < fieldTemp$1) {
              var4Lifetime1 = new SoftCacheReference(var3_refLifetime1.getValue(122), var3_refLifetime1.weight);
              this.entries.put(var4Lifetime1, 0, var3_refLifetime1.key);
              SetMassDriverEnergyUsed.a(var4Lifetime1, var3_refLifetime1, (byte) -68);
              var3_refLifetime1.unlink(-3846);
              var3_refLifetime1.unlinkSecondary((byte) -35);
            }
          } else {
            if (null == var3_refLifetime1.getValue(107)) {
              var3_refLifetime1.unlink(-3846);
              var3_refLifetime1.unlinkSecondary((byte) -35);
              this.remainingCapacity = this.remainingCapacity + var3_refLifetime1.weight;
            }
          }
          var3_refLifetime1 = (CacheReference) (this.recency.next(8063));
        }
    }

    final Object next(boolean param0) {
        CacheReference var2;
        Object var3;
        int var5;
        CacheReference var6;
        CacheReference var7;
        CacheReference var2Lifetime1;
        Object var3Lifetime1;
        var5 = VoidHunters.field_G;
        if (!param0) {
          var2 = (CacheReference) (this.entries.next((byte) 44));
          while (true) {
            if (var2 == null) {
              return null;
            }
            var3 = var2.getValue(118);
            if (var3 != null) {
              return var3;
            }
            var6 = var2;
            var2 = (CacheReference) (this.entries.next((byte) 44));
            var6.unlink(-3846);
            var6.unlinkSecondary((byte) -35);
            this.remainingCapacity = this.remainingCapacity + var6.weight;
          }
        }
        this.put((Object) null, -64L, (byte) -68);
        var2Lifetime1 = (CacheReference) (this.entries.next((byte) 44));
        while (true) {
          if (var2Lifetime1 == null) {
            return null;
          }
          var3Lifetime1 = var2Lifetime1.getValue(118);
          if (var3Lifetime1 != null) {
            return var3Lifetime1;
          }
          var7 = var2Lifetime1;
          var2Lifetime1 = (CacheReference) (this.entries.next((byte) 44));
          var7.unlink(-3846);
          var7.unlinkSecondary((byte) -35);
          this.remainingCapacity = this.remainingCapacity + var7.weight;
        }
    }

    final Object get(int param0, long param1) {
        StrongCacheReference var6 = null;
        CacheReference var7 = (CacheReference) (this.entries.get((byte) -124, param1));
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.getValue(param0 ^ 94);
        if (var5 == null) {
          var7.unlink(-3846);
          var7.unlinkSecondary((byte) -35);
          this.remainingCapacity = this.remainingCapacity + var7.weight;
          return null;
        }
        if (var7.isSoft((byte) 50)) {
          var6 = new StrongCacheReference(var5, var7.weight);
          this.entries.put(var6, 0, var7.key);
          this.recency.addLast(-17569, var6);
          ((CacheReference) ((Object) var6)).secondaryKey = 0L;
          var7.unlink(-3846);
          var7.unlinkSecondary((byte) -35);
          if (param0 != 0) {
            SoftLruCache.clearSharedReferences(-93);
            return var5;
          }
          return var5;
        }
        this.recency.addLast(param0 - 17569, var7);
        var7.secondaryKey = 0L;
        if (param0 != 0) {
          SoftLruCache.clearSharedReferences(-93);
          return var5;
        }
        return var5;
    }

    private final void removeReference(CacheReference param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -17173) {
            return;
          }
          if (param0 == null) {
            return;
          }
          param0.unlink(-3846);
          param0.unlinkSecondary((byte) -35);
          this.remainingCapacity = this.remainingCapacity + param0.weight;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pfb.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void remove(int param0, long param1) {
        CacheReference var4 = null;
        CacheReference var4Lifetime1;
        if (param0 < -66) {
          var4 = (CacheReference) (this.entries.get((byte) -112, param1));
          this.removeReference(var4, -17173);
          return;
        }
        this.put((Object) null, 32L, (byte) 24);
        var4Lifetime1 = (CacheReference) (this.entries.get((byte) -112, param1));
        this.removeReference(var4Lifetime1, -17173);
    }

    private SoftLruCache(int param0, int param1) {
        int var3;
        this.recency = new SecondaryNodeDeque();
        this.remainingCapacity = param0;
        this.capacity = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.entries = new IntrusiveNodeHashTable(var3);
            return;
          }
          if (var3 < param1) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.entries = new IntrusiveNodeHashTable(var3);
        return;
    }

    static {
        field_a = "Next mission: ";
    }
}
