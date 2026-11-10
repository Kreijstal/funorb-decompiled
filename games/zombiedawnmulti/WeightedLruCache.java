/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedLruCache {
    static boolean field_b;
    private int field_f;
    private IterableNodeHashTable field_j;
    static String field_e;
    static boolean field_g;
    private int field_i;
    private SecondaryNodeDeque field_c;
    static String field_d;
    static String field_a;
    static String field_h;

    private final void putWeighted(int param0, Object param1, long param2, int param3) {
        CacheEntry var9 = null;
        StrongCacheEntry var6 = null;
        int var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_i < param0) {
            throw new IllegalStateException();
          }
          this.remove(param2, false);
          this.field_f = this.field_f - param0;
          while (this.field_f < 0) {
            var9 = (CacheEntry) (this.field_c.removeLast(false));
            this.removeEntry(1, var9);
          }
          var6 = new StrongCacheEntry(param1, param0);
          this.field_j.put(param2, (byte) -19, var6);
          this.field_c.addFirst(var6, (byte) 94);
          int var7 = 91 / ((param3 - 82) / 44);
          ((CacheEntry) ((Object) var6)).secondaryKey = 0L;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "io.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    WeightedLruCache(int param0) {
        this(param0, param0);
    }

    final static void initializeChatComposerPopup(int param0, UiComponent param1, UiComponent param2, UiComponent param3, UiComponent param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (NavigationGrid.field_m != null) {
            return;
          }
          HotspotTextWidget.field_N = false;
          if (PendingRankingRequest.field_m) {
            var5 = ByteStorage.field_a;
          } else {
            if (SimPortal.field_L) {
              var5 = GameScreen.field_v;
            } else {
              var5 = FramePainter.field_e;
            }
          }
          var7 = (String) null;
          IterableNodeHashTable.setChatTabLabel(6, SoundEffectInstance.field_g, 0, var5, (String) null);
          FontPaletteHelpers.field_j = DraggableWidget.field_E;
          NavigationGrid.field_m = CookieHelpers.field_b;
          CookieHelpers.field_b.field_xb = (8355711 & IntHashIndex.field_f.field_xb >> 1) + SoundEffectInstance.field_g - (8355711 & SoundEffectInstance.field_g >> 1);
          CookieHelpers.field_b.field_Db = (8355711 & IntHashIndex.field_f.field_Db >> 1) + (SoundEffectInstance.field_g - (8355711 & SoundEffectInstance.field_g >> 1));
          CookieHelpers.field_b.field_ob = SoundEffectInstance.field_g - (8355711 & SoundEffectInstance.field_g >> 1) + (IntHashIndex.field_f.field_ob >> 1 & param0);
          ClickMarker.field_v = new UiComponent(0L, param3);
          SpriteState.field_t = new UiComponent(0L, param2);
          ValidationState.field_a = new UiComponent(0L, (UiComponent) null);
          IntrusiveNode.field_c = new UiComponent(0L, param1);
          CookieHelpers.field_b = new UiComponent(0L, param4);
          CookieHelpers.field_b.field_yb = MusicCrossfadeStream.field_A;
          IntrusiveNode.field_c.addChild((byte) 50, CookieHelpers.field_b);
          DraggableWidget.field_E = new UiComponent(0L, FontPaletteHelpers.field_j);
          IntrusiveNode.field_c.addChild((byte) 50, DraggableWidget.field_E);
          DisplayNameRequestHelpers.field_c = new UiComponent(0L, IntHashIndex.field_f, DialWidgetPainter.field_o);
          UpgradeAccessHelpers.field_d = new UiComponent(0L, IntHashIndex.field_f);
          ClickMarker.field_v.addChild((byte) 50, SpriteState.field_t);
          ClickMarker.field_v.addChild((byte) 50, ValidationState.field_a);
          ValidationState.field_a.addChild((byte) 50, IntrusiveNode.field_c);
          ValidationState.field_a.addChild((byte) 50, DisplayNameRequestHelpers.field_c);
          ValidationState.field_a.addChild((byte) 50, UpgradeAccessHelpers.field_d);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("io.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void openLoginDialog(int param0, boolean param1, boolean param2) {
        String var5 = (String) null;
        RankingEntry.openLoginDialog((String) null, param2, -67, param1);
        if (param0 != -21113) {
          UiComponent var4 = (UiComponent) null;
          WeightedLruCache.initializeChatComposerPopup(3, (UiComponent) null, (UiComponent) null, (UiComponent) null, (UiComponent) null);
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 == 8) {
          field_h = null;
          field_d = null;
          field_e = null;
          return;
        }
        field_e = (String) null;
        field_h = null;
        field_d = null;
        field_e = null;
    }

    final static boolean isOnScreen(int param0, int param1, byte param2, Camera param3) {
        RuntimeException var4 = null;
        Camera var5 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -72) {
            var5 = (Camera) null;
            WeightedLruCache.isOnScreen(-88, -65, (byte) 96, (Camera) null);
          }
          stackIn_8_0 = (param0 > -48) && (param0 > -48) && (640.0f * param3.zoom > (float)param0) && (param3.zoom * 480.0f > (float)param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("io.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void remove(long param0, boolean param1) {
        CacheEntry var4 = (CacheEntry) (this.field_j.get(param0, 72));
        this.removeEntry(1, var4);
        if (!param1) {
          return;
        }
        UiComponent var5 = (UiComponent) null;
        WeightedLruCache.initializeChatComposerPopup(-49, (UiComponent) null, (UiComponent) null, (UiComponent) null, (UiComponent) null);
    }

    private final void removeEntry(int param0, CacheEntry param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            return;
          }
          if (param1 == null) {
            return;
          }
          param1.unlink(true);
          param1.unlinkSecondary(param0 ^ -4563);
          this.field_f = this.field_f + param1.field_t;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("io.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static LoginMethod[] listLoginMethods(boolean param0) {
        if (param0) {
          return new LoginMethod[]{AudioServiceHelpers.field_b, RasterBuffer.field_c, TextHotspot.field_h};
        }
        return (LoginMethod[]) null;
    }

    final void put(Object param0, long param1, int param2) {
        try {
          this.putWeighted(param2, param0, param1, -107);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "io.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private WeightedLruCache(int param0, int param1) {
        int var3;
        this.field_c = new SecondaryNodeDeque();
        this.field_f = param0;
        this.field_i = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.field_j = new IterableNodeHashTable(var3);
            return;
          }
          if (var3 < param1) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_j = new IterableNodeHashTable(var3);
        return;
    }

    final Object get(byte param0, long param1) {
        StrongCacheEntry var6 = null;
        if (param0 <= 121) {
          return (Object) null;
        }
        CacheEntry var7 = (CacheEntry) (this.field_j.get(param1, 64));
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.getValue(-111);
        if (var5 != null) {
          if (!var7.isSoftReference(1000)) {
            this.field_c.addFirst(var7, (byte) 106);
            var7.secondaryKey = 0L;
          } else {
            var6 = new StrongCacheEntry(var5, var7.field_t);
            this.field_j.put(var7.key, (byte) -86, var6);
            this.field_c.addFirst(var6, (byte) 109);
            ((CacheEntry) ((Object) var6)).secondaryKey = 0L;
            var7.unlink(true);
            var7.unlinkSecondary(-4564);
          }
          return var5;
        }
        var7.unlink(true);
        var7.unlinkSecondary(-4564);
        this.field_f = this.field_f + var7.field_t;
        return null;
    }

    static {
        field_e = "ESC - cancel this line";
        field_d = "Resigned";
        field_h = "Show all game chat";
        field_a = "This option cannot be combined with the current '<%0>' setting.";
    }
}
