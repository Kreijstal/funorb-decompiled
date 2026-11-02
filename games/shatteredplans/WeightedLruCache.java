/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedLruCache {
    static String field_i;
    private int field_k;
    private IterableNodeHashTable field_h;
    static String field_j;
    static String field_f;
    static int field_e;
    static int[] field_a;
    static sq field_g;
    static String field_l;
    private SecondaryNodeDeque field_c;
    private int field_b;
    static String field_d;

    private final void a(long param0, int param1, int param2, Object param3) {
        WeightedCacheEntry var6 = null;
        StrongCacheEntry var6_ref = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 > this.field_b) {
            throw new IllegalStateException();
          }
          this.a(false, param0);
          this.field_k = this.field_k - param1;
          while (this.field_k < 0) {
            var6 = (WeightedCacheEntry) (this.field_c.a((byte) -20));
            this.a(var6, (byte) -88);
          }
          var6_ref = new StrongCacheEntry(param3, param1);
          this.field_h.a(var6_ref, true, param0);
          this.field_c.a(var6_ref, 6);
          ((WeightedCacheEntry) ((Object) var6_ref)).field_l = (long)param2;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ol.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final Object a(long param0, int param1) {
        Object var8 = null;
        StrongCacheEntry var6 = null;
        WeightedCacheEntry var7 = (WeightedCacheEntry) (this.field_h.a(-78, param0));
        StrongCacheEntry var6Lifetime1;
        if (param1 != 0) {
          WeightedLruCache.a(true);
          if (var7 == null) {
            return null;
          }
          var8 = var7.e((byte) -111);
          Object var5 = var8;
          if (var8 == null) {
            var7.b((byte) -123);
            var7.a(param1 + 16);
            this.field_k = this.field_k + var7.field_p;
            return null;
          }
          if (!var7.e(false)) {
            this.field_c.a(var7, 6);
            var7.field_l = 0L;
            return var8;
          }
          var6 = new StrongCacheEntry(var8, var7.field_p);
          this.field_h.a(var6, true, var7.key);
          this.field_c.a(var6, 6);
          ((WeightedCacheEntry) ((Object) var6)).field_l = 0L;
          var7.b((byte) -96);
          var7.a(16);
          return var8;
        }
        if (var7 == null) {
          return null;
        }
        Object var9 = var7.e((byte) -111);
        if (var9 == null) {
          var7.b((byte) -123);
          var7.a(param1 + 16);
          this.field_k = this.field_k + var7.field_p;
          return null;
        }
        if (!var7.e(false)) {
          this.field_c.a(var7, 6);
          var7.field_l = 0L;
          return var9;
        }
        var6Lifetime1 = new StrongCacheEntry(var9, var7.field_p);
        this.field_h.a(var6Lifetime1, true, var7.key);
        this.field_c.a(var6Lifetime1, 6);
        ((WeightedCacheEntry) ((Object) var6Lifetime1)).field_l = 0L;
        var7.b((byte) -96);
        var7.a(16);
        return var9;
    }

    final static boolean a(int param0) {
        if (param0 >= -79) {
          WeightedLruCache.a(true);
          if (null != hp.field_m) {
            return true;
          }
          if (ih.b(-124)) {
            return true;
          }
          if (tc.field_G != null) {
            return true;
          }
          if (!ep.a(640)) {
            return false;
          }
          return true;
        }
        if (null != hp.field_m) {
          return true;
        }
        if (ih.b(-124)) {
          return true;
        }
        if (tc.field_G != null) {
          return true;
        }
        if (!ep.a(640)) {
          return false;
        }
        return true;
    }

    final static void b(byte param0) {
        ae.field_f.b(new cq(), 127);
        if (param0 >= -76) {
          WeightedLruCache.a(false);
        }
    }

    final static os a(byte param0) {
        ff var2 = null;
        bd var3 = null;
        bd var4 = null;
        go.field_E = new os(5, 5, 500, 45);
        ad var1 = new ad();
        go.field_E.field_v = (jk) ((Object) var1);
        if (param0 == 69) {
          var2 = new ff(15, 10, 36, 36, (Sprite) null);
          go.field_E.a(var2, 8);
          var1.field_e = var2;
          var3 = new bd(15, 5 - (-(go.field_E.field_i / 2) + rs.field_Cb.field_J / 2), 450, rs.field_Cb.field_J, (String) null, 0);
          var4 = new bd(15, go.field_E.field_i - rs.field_Cb.field_J, 450, rs.field_Cb.field_J, (String) null, 2);
          var1.field_f = var3;
          go.field_E.a(var3, 8);
          go.field_E.a(var4, param0 ^ 77);
          return go.field_E;
        }
        return (os) null;
    }

    private final void a(WeightedCacheEntry param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -88) {
            this.a(89L, -55);
          }
          if (param0 == null) {
            return;
          }
          param0.b((byte) -126);
          param0.a(16);
          this.field_k = this.field_k + param0.field_p;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ol.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, long param1) {
        WeightedCacheEntry var4 = (WeightedCacheEntry) (this.field_h.a(-99, param1));
        this.a(var4, (byte) -88);
        if (param0) {
          field_l = (String) null;
          return;
        }
    }

    WeightedLruCache(int param0) {
        this(param0, param0);
    }

    final void a(long param0, Object param1, byte param2) {
        if (param2 != -108) {
          return;
        }
        try {
          this.a(param0, 1, 0, param1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ol.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_a = null;
        field_d = null;
        field_f = null;
        if (!param0) {
          field_i = null;
          field_l = null;
          field_g = null;
          return;
        }
        WeightedLruCache.b((byte) -77);
        field_i = null;
        field_l = null;
        field_g = null;
    }

    private WeightedLruCache(int param0, int param1) {
        int var3;
        this.field_c = new SecondaryNodeDeque();
        this.field_k = param0;
        this.field_b = param0;
        var3 = 1;
        while (true) {
          if (param0 <= var3 + var3) {
            this.field_h = new IterableNodeHashTable(var3);
            return;
          }
          if (param1 > var3) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_h = new IterableNodeHashTable(var3);
        return;
    }

    static {
        field_i = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_f = "Invite <%0> to this game";
        field_j = "Warning";
        field_l = "Select a friendly system to construct a defense grid, or right click to cancel this project.";
        field_d = "Passwords can only contain letters and numbers";
    }
}
