/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedLruCache {
    private int field_b;
    static char field_c;
    private IterableNodeHashTable field_e;
    private int field_f;
    static int field_i;
    static volatile boolean field_d;
    private SecondaryNodeDeque field_g;
    static int field_h;
    static PlatformTaskDispatcher field_a;
    static Sprite[] field_k;
    static int field_j;

    private final void putWeighted(long param0, int param1, int param2, Object param3) {
        CacheEntry var8 = null;
        StrongCacheEntry var6 = null;
        int var7 = ZombieDawn.field_J;
        try {
          if (param1 > this.field_f) {
            throw new IllegalStateException();
          }
          if (param2 != 32500) {
            this.remove((byte) 73, -37L);
          }
          this.remove((byte) -20, param0);
          this.field_b = this.field_b - param1;
          while (0 > this.field_b) {
            var8 = (CacheEntry) (this.field_g.removeFirst(78));
            this.removeEntry(var8, 108);
          }
          var6 = new StrongCacheEntry(param3, param1);
          this.field_e.put(param0, true, var6);
          this.field_g.addLast(0, var6);
          ((CacheEntry) ((Object) var6)).secondaryKey = 0L;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "lc.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void removeEntry(CacheEntry param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 <= 100) {
            return;
          }
          if (param0 != null) {
            param0.unlink(-27598);
            param0.unlinkSecondary((byte) -79);
            this.field_b = this.field_b + param0.field_r;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("lc.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void setTorchlightMode(boolean param0, boolean param1) {
        int var2_int = 0;
        int var3 = ZombieDawn.field_J;
        try {
          if (!param0) {
            field_c = 'D';
          }
          PowerupBar.field_g = !param1 ? true : false;
          if (param1) {
            PendingIntArrayRequest.field_p = new int[100];
            for (var2_int = 0; var2_int < PendingIntArrayRequest.field_p.length; var2_int++) {
              PendingIntArrayRequest.field_p[var2_int] = 256 / PendingIntArrayRequest.field_p.length * (var2_int * 65793);
            }
            TextLayoutLine.field_c = MenuSelection.startTrackedSoundEffect(125, 48);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "lc.I(" + param0 + ',' + param1 + ')');
        }
    }

    private final void remove(byte param0, long param1) {
        CacheEntry var4 = (CacheEntry) (this.field_e.get(false, param1));
        this.removeEntry(var4, param0 + 143);
        if (param0 != -20) {
          field_k = (Sprite[]) null;
        }
    }

    final void put(long param0, Object param1, int param2) {
        try {
          if (param2 != -16709) {
            this.field_b = 11;
          }
          this.putWeighted(param0, 1, 32500, param1);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "lc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void openServerListPage(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          java.applet.Applet var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(PendingRecordRequest.appendSessionParameters(-1, param0, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            if (param1 != -2895) {
              var3 = (java.applet.Applet) null;
              WeightedLruCache.openServerListPage((java.applet.Applet) null, 6);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("lc.F(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void setPromotionArchives(Js5Archive param0, Js5Archive param1, byte param2) {
        try {
          AddressHintGlobals.field_b = param1;
          int var3_int = -117 / ((-21 - param2) / 34);
          AchievementsScreen.field_t = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "lc.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          field_k = (Sprite[]) null;
        }
        field_a = null;
        field_k = null;
    }

    final static int countSetBits(int param0, byte param1) {
        param0 = (1431655765 & param0) + ((param0 & -1431655765) >>> 1);
        param0 = ((param0 & -858993458) >>> 2) + (858993459 & param0);
        param0 = (param0 >>> 4) + param0 & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        if (param1 < 70) {
          return 61;
        }
        return 255 & param0;
    }

    final Object get(long param0, int param1) {
        StrongCacheEntry var6 = null;
        CacheEntry var8 = (CacheEntry) (this.field_e.get(false, param0));
        if (var8 == null) {
          return null;
        }
        if (param1 != 1431655765) {
          CacheEntry var7 = (CacheEntry) null;
          this.removeEntry((CacheEntry) null, 58);
        }
        Object var5 = var8.getValue((byte) 87);
        if (var5 == null) {
          var8.unlink(param1 ^ -1431649945);
          var8.unlinkSecondary((byte) -21);
          this.field_b = this.field_b + var8.field_r;
          return null;
        }
        if (var8.isSoftReference(true)) {
          var6 = new StrongCacheEntry(var5, var8.field_r);
          this.field_e.put(var8.key, true, var6);
          this.field_g.addLast(0, var6);
          ((CacheEntry) ((Object) var6)).secondaryKey = 0L;
          var8.unlink(-27598);
          var8.unlinkSecondary((byte) -60);
        } else {
          this.field_g.addLast(0, var8);
          var8.secondaryKey = 0L;
        }
        return var5;
    }

    private WeightedLruCache() throws Throwable {
        throw new Error();
    }

    static {
        field_h = 1;
        field_i = -1;
        field_d = true;
        field_j = 15;
    }
}
