/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategoryCache {
    private Archive field_d;
    static int field_a;
    static String[] field_c;
    private Archive field_b;
    static NineSliceFrame field_e;
    private WeightedLruCache field_f;

    public static void releaseStatics(int param0) {
        if (param0 != 32768) {
          return;
        }
        field_c = null;
        field_e = null;
    }

    final static void registerScreens(byte param0) {
        DualLinkDeque.registerScreen(LobbyListHelpers.field_d, 6, -13850);
        DualLinkDeque.registerScreen(OpacityWidget.field_T, 8, -13850);
        if (!WidgetTheme.isInputIdle((byte) 122)) {
          DualLinkDeque.registerScreen(PageReloadHelpers.field_c, 2, -13850);
          DualLinkDeque.registerScreen(NineSliceFrameHelpers.field_b, 3, -13850);
          DualLinkDeque.registerScreen(ChatMessageReader.field_f, 4, -13850);
          DualLinkDeque.registerScreen(NumericDateInputWidget.field_Y, 5, -13850);
          if (param0 <= -45) {
            GameOptionControls.field_b[8] = GameOptionControls.field_b[8] + 32;
            return;
          }
          QuickChatCategoryCache.registerScreens((byte) 99);
          GameOptionControls.field_b[8] = GameOptionControls.field_b[8] + 32;
          return;
        }
        if (param0 > -45) {
          QuickChatCategoryCache.registerScreens((byte) 99);
          GameOptionControls.field_b[8] = GameOptionControls.field_b[8] + 32;
          return;
        }
        GameOptionControls.field_b[8] = GameOptionControls.field_b[8] + 32;
    }

    final static AccountServerResult createUsernameResponseQuery(String param0, int param1, boolean param2) {
        AccountServerResult var3 = null;
        RuntimeException var3_ref = null;
        AccountServerResult stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new AccountServerResult(param2);
          var3.field_i = param0;
          var3.field_d = param1;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("hj.F(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void compactDepthBucketFaceOrder(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = TetraLink.field_J;
        try {
          if (param0 != -93) {
            return;
          }
          var1_int = LoadingProgressDialog.field_bb[0];
          for (var2 = 1; var2 < LoadingProgressDialog.field_bb.length; var2++) {
            var3 = LoadingProgressDialog.field_bb[var2];
            ArraySupport.copy(StripedProgressBar.field_ab, var2 << 4, StripedProgressBar.field_ab, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "hj.D(" + param0 + ')');
        }
    }

    final QuickChatCategory getCategory(int param0, boolean param1) {
        byte[] var4 = null;
        if (!param1) {
          return (QuickChatCategory) null;
        }
        QuickChatCategory var3 = (QuickChatCategory) (this.field_f.get((byte) 120, (long)param0));
        if (var3 != null) {
          return var3;
        }
        if (32768 > param0) {
          var4 = this.field_b.getFile(-86, param0, 0);
        } else {
          var4 = this.field_d.getFile(-103, param0 & 32767, 0);
        }
        var3 = new QuickChatCategory();
        if (var4 != null) {
          var3.decode(new PacketBuffer(var4), 0);
          if (32768 <= param0) {
            var3.applyGlobalIds(32768);
          }
          this.field_f.put(var3, (long)param0, (byte) 50);
          return var3;
        }
        if (32768 <= param0) {
          var3.applyGlobalIds(32768);
        }
        this.field_f.put(var3, (long)param0, (byte) 50);
        return var3;
    }

    QuickChatCategoryCache(int param0, Archive param1, Archive param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_f = new WeightedLruCache(64);
        try {
          this.field_b = param1;
          this.field_d = param2;
          if (this.field_b != null) {
            this.field_b.getFileCount(-23126, 0);
          }
          if (this.field_d != null) {
            this.field_d.getFileCount(-23126, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("hj.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void updateQuickChatMenu(boolean param0, int param1, int param2, boolean param3) {
        int var4;
        int var5;
        if (!TextLayout.field_a) {
          return;
        }
        ValidationMessageWidget.field_bb.updateInput(0, param0);
        var4 = AlternateLongAndTextCredentials.field_o.hasPressedItem(param3) ? 1 : 0;
        if (param3) {
          return;
        }
        if (0 != NameAvailabilityValidator.field_t &&
          var4 == 0) {
          HotspotTextWidget.closeQuickChatMenuIfOpen((byte) -8);
          param0 = false;
        }
        if (param0) {
          AlternateLongAndTextCredentials.field_o.processPressedItems(0, param1, param2);
        }
        if (var4 != 0) {
          ValidationMessageWidget.field_bb.updateInput(0, param0);
        }
        var5 = AlternateLongAndTextCredentials.field_o.getChainHeight(0) + AlternateLongAndTextCredentials.field_o.field_eb;
        if (640 < var5) {
          DebouncedValidator.field_e = DebouncedValidator.field_e + 5;
          return;
        }
        if (var5 >= 635) {
          return;
        }
        if (DebouncedValidator.field_e <= 0) {
          return;
        }
        DebouncedValidator.field_e = DebouncedValidator.field_e - 5;
    }

    static {
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
