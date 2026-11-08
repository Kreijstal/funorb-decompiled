/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedLruCache {
    static String field_p;
    static int field_d;
    static int field_f;
    static String field_g;
    static boolean field_b;
    static DraggableWidget field_e;
    private int field_l;
    static String field_i;
    static int field_a;
    static String[] field_m;
    static int[] field_h;
    private int field_c;
    private IterableDualNodeDeque field_k;
    static MouseWheelInput field_j;
    private IterableNodeHashTable field_o;
    static boolean field_q;
    static SceneWidget field_n;

    private final void putWeighted(byte param0, int param1, Object param2, long param3) {
        WeightedCacheEntry var6 = null;
        StrongCacheEntry var6_ref = null;
        int var7 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_c < param1) {
            throw new IllegalStateException();
          }
          this.remove((byte) 117, param3);
          this.field_l = this.field_l - param1;
          while (this.field_l < 0) {
            var6 = (WeightedCacheEntry) (this.field_k.removeFirst(12515));
            this.removeEntry(var6, -17389);
          }
          if (param0 > -47) {
            field_e = (DraggableWidget) null;
          }
          var6_ref = new StrongCacheEntry(param2, param1);
          this.field_o.put(var6_ref, param3, false);
          this.field_k.addLast((byte) 47, var6_ref);
          ((WeightedCacheEntry) ((Object) var6_ref)).field_w = 0L;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "nc.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_m = null;
        field_g = null;
        field_p = null;
        field_e = null;
        field_n = null;
        if (param0 > 126) {
          field_j = null;
          field_h = null;
          field_i = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        WeightedLruCache.createPaletteFont((byte[]) null, 57);
        field_j = null;
        field_h = null;
        field_i = null;
    }

    private final void remove(byte param0, long param1) {
        if (param0 != 117) {
          return;
        }
        WeightedCacheEntry var4 = (WeightedCacheEntry) (this.field_o.get(param1, (byte) -125));
        this.removeEntry(var4, param0 ^ -17306);
    }

    final Object get(long param0, int param1) {
        Object var9 = null;
        StrongCacheEntry var6 = null;
        WeightedCacheEntry var8 = (WeightedCacheEntry) (this.field_o.get(param0, (byte) -127));
        StrongCacheEntry var6Lifetime1;
        if (var8 == null) {
          return null;
        }
        if (param1 > -30) {
          WeightedCacheEntry var7 = (WeightedCacheEntry) null;
          this.removeEntry((WeightedCacheEntry) null, -108);
          var9 = var8.getValue((byte) 125);
          if (var9 == null) {
            var8.unlink(4);
            var8.unlinkDual(480);
            this.field_l = this.field_l + var8.field_z;
            return null;
          }
          if (!var8.isSoftReference(-29304)) {
            this.field_k.addLast((byte) 50, var8);
            var8.field_w = 0L;
            return var9;
          }
          var6 = new StrongCacheEntry(var9, var8.field_z);
          this.field_o.put(var6, var8.key, false);
          this.field_k.addLast((byte) 72, var6);
          ((WeightedCacheEntry) ((Object) var6)).field_w = 0L;
          var8.unlink(4);
          var8.unlinkDual(480);
          return var9;
        }
        Object var10 = var8.getValue((byte) 125);
        if (var10 == null) {
          var8.unlink(4);
          var8.unlinkDual(480);
          this.field_l = this.field_l + var8.field_z;
          return null;
        }
        if (!var8.isSoftReference(-29304)) {
          this.field_k.addLast((byte) 50, var8);
          var8.field_w = 0L;
          return var10;
        }
        var6Lifetime1 = new StrongCacheEntry(var10, var8.field_z);
        this.field_o.put(var6Lifetime1, var8.key, false);
        this.field_k.addLast((byte) 72, var6Lifetime1);
        ((WeightedCacheEntry) ((Object) var6Lifetime1)).field_w = 0L;
        var8.unlink(4);
        var8.unlinkDual(480);
        return var10;
    }

    private final void removeEntry(WeightedCacheEntry param0, int param1) {
        RuntimeException var3 = null;
        java.applet.Applet var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            param0.unlink(param1 ^ -17385);
            param0.unlinkDual(param1 + 17869);
            this.field_l = this.field_l + param0.field_z;
          }
          if (param1 == -17389) {
            return;
          }
          var4 = (java.applet.Applet) null;
          WeightedLruCache.openServerListPage((byte) -12, (java.applet.Applet) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("nc.K(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static PaletteBitmapFont createPaletteFont(byte[] param0, int param1) {
        PaletteBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        java.applet.Applet var3 = null;
        Object stackIn_2_0 = null;
        PaletteBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (PaletteBitmapFont) (stackIn_2_0);
          }
          if (param1 != 7045) {
            var3 = (java.applet.Applet) null;
            WeightedLruCache.openServerListPage((byte) 100, (java.applet.Applet) null);
          }
          var2 = new PaletteBitmapFont(param0, PacketLoopHelpers.field_a, TextButton.field_M, StrongCacheEntry.field_L, MusicPatch.field_r, QuickChatInputHelpers.field_d, UiContainer.field_L);
          NodeHashTable.releaseDecodeArrays(param1 + 2279);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("nc.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void openLoginForm(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        java.applet.Applet var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ArrayWidgetContainer.field_O != null) {
            ArrayWidgetContainer.field_O.closeDialog(105);
          }
          AccountNoticeDialog.field_kb = new LoginForm(param0, param1, false, true, true);
          ClientErrorSupport.field_a.transitionToContent(AccountNoticeDialog.field_kb, -22908735);
          if (param2 < -37) {
            return;
          }
          var4 = (java.applet.Applet) null;
          WeightedLruCache.openServerListPage((byte) 60, (java.applet.Applet) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("nc.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final void put(long param0, Object param1, int param2) {
        try {
          this.putWeighted((byte) -109, param2, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "nc.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    WeightedLruCache(int param0) {
        this(param0, param0);
    }

    final static DisplayMode[] queryDisplayModes(int param0, SystemTaskService param1) {
        int var5 = 0;
        DisplayMode[] stackIn_4_0 = null;
        DisplayMode[] stackIn_10_0 = null;
        DisplayMode[] stackIn_13_0 = null;
        DisplayMode[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        DisplayMode[] var4 = null;
        DisplayMode var6 = null;
        int var7 = 0;
        SystemTask var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (!param1.supportsFullscreen(-35)) {
            stackIn_4_0 = new DisplayMode[]{};
            return stackIn_4_0;
          }
          var8 = param1.requestDisplayModes(param0 ^ -30726);
          while (var8.field_a == 0) {
            MouseWheelInput.sleepMillis((byte) 121, 10L);
          }
          if (var8.field_a == 2) {
            stackIn_10_0 = new DisplayMode[]{};
            return stackIn_10_0;
          }
          if (param0 != 38) {
            stackIn_13_0 = (DisplayMode[]) null;
            return stackIn_13_0;
          }
          var10 = (int[]) (var8.field_c);
          var9 = var10;
          var3 = var9;
          var4 = new DisplayMode[var10.length >> 2];
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new DisplayMode();
            var4[var5] = var6;
            var6.field_a = var3[var5 << 2];
            var6.field_g = var3[1 + (var5 << 2)];
            var6.field_j = var3[(var5 << 2) + 2];
            var6.field_i = var3[(var5 << 2) + 3];
          }
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("nc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void openServerListPage(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
              param1.getAppletContext().showDocument(DirectByteStorage.appendSessionParameters(0, var2, param1), "_top");
              var3 = 58 % ((-15 - param0) / 42);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var2_ref2;
            stackIn_6_1 = new StringBuilder().append("nc.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private WeightedLruCache(int param0, int param1) {
        int var3;
        this.field_k = new IterableDualNodeDeque();
        this.field_l = param0;
        this.field_c = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.field_o = new IterableNodeHashTable(var3);
            return;
          }
          if (var3 < param1) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_o = new IterableNodeHashTable(var3);
        return;
    }

    final static IndexedSprite getIconSprite(int param0, byte param1) {
        if (param0 >= 35) {
          return LinkButtonPainter.field_p[param0 - 35];
        }
        if (param1 < -93) {
          return IsaacRandom.field_d[param0];
        }
        return (IndexedSprite) null;
    }

    static {
        field_b = false;
        field_d = 0;
        field_h = new int[]{38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, -1, -1, -1, 7};
        field_p = "Unable to add name - system busy";
        field_m = new String[]{"speed_icons", "diff_icons", "map_icons"};
        field_i = "Email (Login):";
        field_q = false;
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
