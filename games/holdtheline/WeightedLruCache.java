/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedLruCache {
    static String field_h;
    private IterableNodeHashTable field_d;
    static byte[] field_b;
    private IterableSecondaryNodeDeque field_a;
    private int field_c;
    private int field_f;
    static int field_g;
    static int field_e;

    private final void a(byte param0, int param1, Object param2, long param3) {
        CacheEntry var8 = null;
        StrongCacheEntry var6 = null;
        int var7 = HoldTheLine.field_D;
        if (this.field_c < param1) {
          throw new IllegalStateException();
        }
        this.a(true, param3);
        this.field_f = this.field_f - param1;
        while (this.field_f < 0) {
          var8 = (CacheEntry) (this.field_a.removeFirst((byte) 121));
          this.a(-3393, var8);
        }
        if (param0 != -7) {
          return;
        }
        try {
          var6 = new StrongCacheEntry(param2, param1);
          this.field_d.put((byte) 27, var6, param3);
          this.field_a.addLast(var6, -29460);
          ((CacheEntry) ((Object) var6)).secondaryKey = 0L;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "bi.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, long param1) {
        CacheEntry var4 = (CacheEntry) (this.field_d.get(param1, -88));
        this.a(-3393, var4);
        if (param0) {
          return;
        }
        this.field_c = 79;
    }

    final static RotatedSpriteAsset a(boolean param0, String param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        RotatedSpriteAsset stackIn_2_0 = null;
        RotatedSpriteAsset stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            stackIn_4_0 = new RotatedSpriteAsset(param1, param4, param3, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (RotatedSpriteAsset) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("bi.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, CacheEntry param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            param1.unlink(0);
            param1.unlinkSecondary((byte) -42);
            this.field_f = this.field_f + param1.field_o;
          }
          if (param0 == -3393) {
            return;
          }
          this.field_c = -45;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("bi.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_b = null;
        field_h = null;
        if (param0) {
          String var2 = (String) null;
          WeightedLruCache.a(false, (String) null, false, false, -5);
        }
    }

    final static ResourceArchive a(int param0, int param1) {
        int var2 = 36 / ((56 - param0) / 61);
        return EmailConfirmationValidator.createResourceArchive(param1, false, true, false, 10600, 1);
    }

    final Object a(long param0, int param1) {
        StrongCacheEntry var7 = null;
        CacheEntry var8 = (CacheEntry) (this.field_d.get(param0, -78));
        if (var8 == null) {
          return null;
        }
        int var5 = -29 / ((-57 - param1) / 46);
        Object var6 = var8.getValue((byte) 66);
        if (var6 != null) {
          if (!var8.isSoftReference(-101)) {
            this.field_a.addLast(var8, -29460);
            var8.secondaryKey = 0L;
          } else {
            var7 = new StrongCacheEntry(var6, var8.field_o);
            this.field_d.put((byte) 27, var7, var8.key);
            this.field_a.addLast(var7, -29460);
            ((CacheEntry) ((Object) var7)).secondaryKey = 0L;
            var8.unlink(0);
            var8.unlinkSecondary((byte) -42);
          }
          return var6;
        }
        var8.unlink(0);
        var8.unlinkSecondary((byte) -42);
        this.field_f = this.field_f + var8.field_o;
        return null;
    }

    final void a(long param0, Object param1, boolean param2) {
        try {
          if (param2) {
            this.field_a = (IterableSecondaryNodeDeque) null;
          }
          this.a((byte) -7, 1, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "bi.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private WeightedLruCache() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Achievements This Game";
        field_b = new byte[]{(byte)49, (byte)105};
    }
}
