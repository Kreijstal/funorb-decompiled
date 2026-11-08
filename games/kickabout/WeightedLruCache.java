/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedLruCache {
    static int field_a;
    static int field_d;
    static int field_j;
    static String[] field_c;
    static String field_b;
    private int field_k;
    private IterableNodeHashTable field_e;
    private int field_f;
    static String field_g;
    static ArgbSprite field_h;
    private IterableDualLinkDeque field_i;

    public static void releaseStatics(byte param0) {
        field_g = null;
        if (param0 != -32) {
          return;
        }
        field_b = null;
        field_c = null;
        field_h = null;
    }

    WeightedLruCache(int param0) {
        this(param0, param0);
    }

    final static void layoutAnimatedChatPanel(int param0) {
        int var1 = TextPromptDialog.field_Bb * TextPromptDialog.field_Bb;
        int var2 = -(SharedPanelFactory.field_b * SharedPanelFactory.field_b) + var1;
        int var3 = ClientPacketFlushSupport.field_c + var2 * (-ClientPacketFlushSupport.field_c + VerticalScrollbar.field_Ab) / var1;
        GrayscalePaletteSupport.field_a.setBounds(true, 640, AuctionsHelpScreen.field_H, var3, 120);
        RankingRowNode.layoutChatPanelOverlay(124, PitchAppearanceSupport.field_b, 640, 5, DiskCacheWorker.field_b, VerticalScrollbar.field_Ab - 24, param0);
    }

    final static boolean hasBlockingInputPopup(boolean param0) {
        if (param0) {
          WeightedLruCache.layoutAnimatedChatPanel(21);
          if (null != TextButton.field_v) {
            return true;
          }
          if (GameplayHelpScreen.hasActiveSocialNamePrompt((byte) -55)) {
            return true;
          }
          if (TextPromptState.field_b != null) {
            return true;
          }
          if (!UiInputRoutingSupport.hasInputPopup((byte) 79)) {
            return false;
          }
          return true;
        }
        if (null != TextButton.field_v) {
          return true;
        }
        if (GameplayHelpScreen.hasActiveSocialNamePrompt((byte) -55)) {
          return true;
        }
        if (TextPromptState.field_b != null) {
          return true;
        }
        if (!UiInputRoutingSupport.hasInputPopup((byte) 79)) {
          return false;
        }
        return true;
    }

    private final void remove(byte param0, long param1) {
        WeightedCacheEntry var4 = (WeightedCacheEntry) (this.field_e.get(param1, (byte) 111));
        if (param0 == 90) {
          this.removeEntry(var4, -64);
          return;
        }
        Object var5 = (Object) null;
        this.put(-116L, (Object) null, (byte) 82);
        this.removeEntry(var4, -64);
    }

    final static void a(int param0, boolean param1) {
        if (param0 == 1) {
          TournamentChampionDialog.field_I = 0;
          MatchHudSupport.field_g = MatchTextInputOverlay.field_c;
          LoginCredentials.field_e = 0;
          AuctionItem.field_l = new MenuSelection(2);
          AuctionItem.field_l.restoreSelection(MatchTextInputOverlay.hitTestPairedControls(ArchiveManager.field_m, BytePlusOneCommand.field_A, (byte) 42), 0, -1, param1);
          return;
        }
    }

    private final void putWeighted(int param0, Object param1, int param2, long param3) {
        WeightedCacheEntry var6 = null;
        StrongCacheEntry var6_ref = null;
        int var7 = Kickabout.field_G;
        try {
          if (param0 > this.field_k) {
            throw new IllegalStateException();
          }
          this.remove((byte) 90, param3);
          this.field_f = this.field_f - param0;
          while (this.field_f < 0) {
            var6 = (WeightedCacheEntry) (this.field_i.pollFirst((byte) -120));
            this.removeEntry(var6, param2 - 126);
          }
          var6_ref = new StrongCacheEntry(param1, param0);
          this.field_e.put(var6_ref, -78, param3);
          this.field_i.addLast(-8545, var6_ref);
          ((WeightedCacheEntry) ((Object) var6_ref)).field_l = (long)param2;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "eq.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void put(long param0, Object param1, byte param2) {
        try {
          this.putWeighted(1, param1, 0, param0);
          if (param2 > -56) {
            this.remove((byte) -83, -58L);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "eq.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final Object get(long param0, byte param1) {
        StrongCacheEntry var6;
        WeightedCacheEntry var7;
        Object var8;
        Object var9;
        StrongCacheEntry var6Lifetime1;
        var7 = (WeightedCacheEntry) (this.field_e.get(param0, (byte) 69));
        if (param1 == 43) {
          if (var7 == null) {
            return null;
          }
          var9 = var7.getValue(-91);
          if (var9 == null) {
            var7.unlink((byte) -109);
            var7.unlinkSecondary(62);
            this.field_f = this.field_f + var7.field_o;
            return null;
          }
          if (var7.isSoftReference((byte) 113)) {
            var6 = new StrongCacheEntry(var9, var7.field_o);
            this.field_e.put(var6, param1 ^ -27, var7.field_a);
            this.field_i.addLast(-8545, var6);
            ((WeightedCacheEntry) ((Object) var6)).field_l = 0L;
            var7.unlink((byte) -109);
            var7.unlinkSecondary(53);
          } else {
            this.field_i.addLast(param1 ^ -8524, var7);
            var7.field_l = 0L;
          }
          return var9;
        }
        this.get(75L, (byte) -114);
        if (var7 == null) {
          return null;
        }
        var8 = var7.getValue(-91);
        if (var8 == null) {
          var7.unlink((byte) -109);
          var7.unlinkSecondary(62);
          this.field_f = this.field_f + var7.field_o;
          return null;
        }
        if (var7.isSoftReference((byte) 113)) {
          var6Lifetime1 = new StrongCacheEntry(var8, var7.field_o);
          this.field_e.put(var6Lifetime1, param1 ^ -27, var7.field_a);
          this.field_i.addLast(-8545, var6Lifetime1);
          ((WeightedCacheEntry) ((Object) var6Lifetime1)).field_l = 0L;
          var7.unlink((byte) -109);
          var7.unlinkSecondary(53);
        } else {
          this.field_i.addLast(param1 ^ -8524, var7);
          var7.field_l = 0L;
        }
        return var8;
    }

    private final void removeEntry(WeightedCacheEntry param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -25 % ((-5 - param1) / 54);
          if (param0 == null) {
            return;
          }
          param0.unlink((byte) -109);
          param0.unlinkSecondary(-113);
          this.field_f = this.field_f + param0.field_o;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eq.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private WeightedLruCache(int param0, int param1) {
        int var3;
        this.field_i = new IterableDualLinkDeque();
        this.field_f = param0;
        this.field_k = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.field_e = new IterableNodeHashTable(var3);
            return;
          }
          if (var3 < param1) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_e = new IterableNodeHashTable(var3);
        return;
    }

    static {
        field_j = 0;
        field_a = field_j;
        field_g = "winner";
        field_b = "New!";
    }
}
