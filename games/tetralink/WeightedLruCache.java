/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedLruCache {
    static String field_f;
    private int field_c;
    static String field_g;
    private IterableNodeHashTable field_m;
    private int field_j;
    static GameRoomPanelHelpers field_a;
    static Sprite[] field_n;
    private SecondaryNodeDeque field_o;
    static Model field_l;
    static int field_i;
    static String field_h;
    static String field_d;
    static int[] field_e;
    static UiComponent field_b;
    static boolean field_k;

    private final void removeEntry(CacheEntry param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -100 % ((-59 - param1) / 60);
          if (param0 == null) {
            return;
          }
          param0.unlink(false);
          param0.unlinkSecondary(0);
          this.field_c = this.field_c + param0.field_t;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("ec.E(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void remove(int param0, long param1) {
        CacheEntry var4 = (CacheEntry) (this.field_m.get(param1, 111));
        if (param0 < 22) {
          return;
        }
        this.removeEntry(var4, 44);
    }

    final static UiComponent createThemedWidget(int param0, BitmapFont param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        UiComponent var13 = null;
        RuntimeException var13_ref = null;
        UiComponent stackIn_2_0 = null;
        UiComponent stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13 = new UiComponent(0L, (UiComponent) null);
          var13.field_Eb = ImageProducerRasterBuffer.createSolidFrameSprites((byte) 28, param9, param11);
          var13.field_kb = ImageProducerRasterBuffer.createSolidFrameSprites((byte) 28, param0, param10);
          var13.field_pb = ImageProducerRasterBuffer.createSolidFrameSprites((byte) 28, param8, param7);
          var13.field_Gb = ImageProducerRasterBuffer.createSolidFrameSprites((byte) 28, param3, param2);
          var13.field_H = ImageProducerRasterBuffer.createSolidFrameSprites((byte) 28, param6, param5);
          var13.field_N = param12;
          var13.field_Ib = param1;
          if (param4 == -120) {
            stackIn_4_0 = var13;
            return stackIn_4_0;
          }
          stackIn_2_0 = (UiComponent) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_7_0 = var13_ref;
          stackIn_7_1 = new StringBuilder().append("ec.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    final static void setSharedFlaggedTextEnabled(boolean param0, int param1) {
        if (param1 < 113) {
          field_l = (Model) null;
          HighscoreQuery.field_y.setEnabled(param0, 8);
          return;
        }
        HighscoreQuery.field_y.setEnabled(param0, 8);
    }

    final void put(Object param0, long param1, byte param2) {
        try {
          if (param2 != 50) {
            WeightedLruCache.setSharedFlaggedTextEnabled(true, 108);
          }
          this.putWeighted(param2 ^ 50, param0, param1, 1);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ec.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final Object get(byte param0, long param1) {
        StrongCacheEntry var6 = null;
        CacheEntry var7 = (CacheEntry) (this.field_m.get(param1, 116));
        StrongCacheEntry var6Lifetime1;
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.getValue(22850);
        if (var5 == null) {
          var7.unlink(false);
          var7.unlinkSecondary(0);
          this.field_c = this.field_c + var7.field_t;
          return null;
        }
        if (param0 < 116) {
          WeightedLruCache.setSharedFlaggedTextEnabled(false, -84);
          if (!var7.isSoftReference(105)) {
            this.field_o.addLast((byte) -50, var7);
            var7.secondaryKey = 0L;
            return var5;
          }
          var6 = new StrongCacheEntry(var5, var7.field_t);
          this.field_m.put(var7.key, var6, false);
          this.field_o.addLast((byte) -85, var6);
          ((CacheEntry) ((Object) var6)).secondaryKey = 0L;
          var7.unlink(false);
          var7.unlinkSecondary(0);
          return var5;
        }
        if (!var7.isSoftReference(105)) {
          this.field_o.addLast((byte) -50, var7);
          var7.secondaryKey = 0L;
          return var5;
        }
        var6Lifetime1 = new StrongCacheEntry(var5, var7.field_t);
        this.field_m.put(var7.key, var6Lifetime1, false);
        this.field_o.addLast((byte) -85, var6Lifetime1);
        ((CacheEntry) ((Object) var6Lifetime1)).secondaryKey = 0L;
        var7.unlink(false);
        var7.unlinkSecondary(0);
        return var5;
    }

    WeightedLruCache(int param0) {
        this(param0, param0);
    }

    public static void releaseStatics(byte param0) {
        field_f = null;
        field_n = null;
        field_d = null;
        field_g = null;
        field_a = null;
        field_b = null;
        field_h = null;
        int var1 = 54 % ((38 - param0) / 62);
        field_l = null;
        field_e = null;
    }

    private final void putWeighted(int param0, Object param1, long param2, int param3) {
        CacheEntry var6 = null;
        StrongCacheEntry var6_ref = null;
        int var7 = TetraLink.field_J;
        try {
          if (param3 > this.field_j) {
            throw new IllegalStateException();
          }
          this.remove(57, param2);
          this.field_c = this.field_c - param3;
          while (this.field_c < 0) {
            var6 = (CacheEntry) (this.field_o.removeFirst(-91));
            this.removeEntry(var6, param0 ^ -122);
          }
          var6_ref = new StrongCacheEntry(param1, param3);
          this.field_m.put(param2, var6_ref, false);
          this.field_o.addLast((byte) -14, var6_ref);
          ((CacheEntry) ((Object) var6_ref)).secondaryKey = (long)param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ec.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private WeightedLruCache(int param0, int param1) {
        int var3;
        this.field_o = new SecondaryNodeDeque();
        this.field_c = param0;
        this.field_j = param0;
        var3 = 1;
        while (true) {
          if (param0 <= var3 + var3) {
            this.field_m = new IterableNodeHashTable(var3);
            return;
          }
          if (param1 > var3) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_m = new IterableNodeHashTable(var3);
        return;
    }

    static {
        field_f = "Graphics: ";
        field_g = "Ignore";
        field_a = new GameRoomPanelHelpers();
        field_i = 0;
        field_k = false;
        field_e = new int[12];
        field_d = "Logging in...";
    }
}
