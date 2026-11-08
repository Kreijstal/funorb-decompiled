/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedLruCache {
    private IterableDualLinkDeque field_b;
    static String field_g;
    private int field_e;
    static SpriteWidget field_h;
    static String field_c;
    private IterableNodeHashTable field_d;
    private int field_f;
    static String textSwitch2d;

    private final void removeEntry(int param0, CacheReference param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            param1.unlink(false);
            param1.unlinkSecondary(82);
            this.field_e = this.field_e + param1.field_p;
          }
          if (param0 >= 25) {
            return;
          }
          field_g = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void removeByKey(long param0, int param1) {
        int var5 = 83 / ((param1 - 25) / 59);
        CacheReference var4 = (CacheReference) (this.field_d.get(param0, -18348));
        this.removeEntry(106, var4);
    }

    WeightedLruCache(int param0) {
        this(param0, param0);
    }

    final static void drawRootWidget(int param0, int param1) {
        LobbyLayout.setLobbyPanelX(param1, (byte) -102);
        if (param0 > -101) {
          field_g = (String) null;
        }
    }

    final Object get(long param0, int param1) {
        Object var8 = null;
        StrongCacheReference var6 = null;
        CacheReference var7 = (CacheReference) (this.field_d.get(param0, -18348));
        StrongCacheReference var6Lifetime1;
        if (var7 == null) {
          return null;
        }
        if (param1 != 0) {
          this.field_e = -36;
          var8 = var7.getReferent((byte) -109);
          if (var8 != null) {
            if (!var7.isSoftReference(107)) {
              this.field_b.addLast(true, var7);
              var7.field_j = 0L;
            } else {
              var6 = new StrongCacheReference(var8, var7.field_p);
              this.field_d.put(var6, param1 ^ -112, var7.key);
              this.field_b.addLast(true, var6);
              ((CacheReference) ((Object) var6)).field_j = 0L;
              var7.unlink(false);
              var7.unlinkSecondary(param1 + 69);
            }
            return var8;
          }
          var7.unlink(false);
          var7.unlinkSecondary(75);
          this.field_e = this.field_e + var7.field_p;
          return null;
        }
        Object var9 = var7.getReferent((byte) -109);
        if (var9 != null) {
          if (!var7.isSoftReference(107)) {
            this.field_b.addLast(true, var7);
            var7.field_j = 0L;
          } else {
            var6Lifetime1 = new StrongCacheReference(var9, var7.field_p);
            this.field_d.put(var6Lifetime1, param1 ^ -112, var7.key);
            this.field_b.addLast(true, var6Lifetime1);
            ((CacheReference) ((Object) var6Lifetime1)).field_j = 0L;
            var7.unlink(false);
            var7.unlinkSecondary(param1 + 69);
          }
          return var9;
        }
        var7.unlink(false);
        var7.unlinkSecondary(75);
        this.field_e = this.field_e + var7.field_p;
        return null;
    }

    private final void putWeighted(int param0, Object param1, long param2, int param3) {
        CacheReference var9 = null;
        StrongCacheReference var6 = null;
        int var8 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_f < param0) {
            throw new IllegalStateException();
          }
          this.removeByKey(param2, -48);
          this.field_e = this.field_e - param0;
          while (this.field_e < 0) {
            var9 = (CacheReference) (this.field_b.removeFirst(-32314));
            this.removeEntry(103, var9);
          }
          var6 = new StrongCacheReference(param1, param0);
          this.field_d.put(var6, -121, param2);
          int var7 = 103 % ((-40 - param3) / 60);
          this.field_b.addLast(true, var6);
          ((CacheReference) ((Object) var6)).field_j = 0L;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "sl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        textSwitch2d = null;
        if (param0 == 1) {
          field_h = null;
          field_g = null;
          return;
        }
        WeightedLruCache.releaseStatics(-112);
        field_h = null;
        field_g = null;
    }

    private WeightedLruCache(int param0, int param1) {
        int var3;
        this.field_b = new IterableDualLinkDeque();
        this.field_f = param0;
        this.field_e = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.field_d = new IterableNodeHashTable(var3);
            return;
          }
          if (param1 > var3) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_d = new IterableNodeHashTable(var3);
        return;
    }

    final void put(Object param0, long param1, int param2) {
        try {
          if (param2 != -14696) {
            this.field_f = -85;
          }
          this.putWeighted(1, param0, param1, -106);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "sl.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Accept";
        field_g = "Concluded";
        textSwitch2d = "3D mode";
    }
}
