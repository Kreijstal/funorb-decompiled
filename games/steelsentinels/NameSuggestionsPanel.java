/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameSuggestionsPanel extends UiContainer implements ButtonListener {
    static int field_X;
    private NameSuggestionListener field_R;
    static String field_Q;
    static int field_W;
    static String field_P;
    private TextButton[] field_U;
    static String field_T;
    static int field_Y;
    static String field_S;
    static String field_V;
    private String[] field_Z;

    public static void releaseStatics(byte param0) {
        field_T = null;
        if (param0 != -42) {
          field_Q = (String) null;
        }
        field_S = null;
        field_V = null;
        field_P = null;
        field_Q = null;
    }

    final void setSuggestions(boolean param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        LinkButtonPainter var4 = null;
        int var6 = 0;
        var6 = SteelSentinels.obfuscationControl;
        try {
          this.field_K.clear(6);
          if (!param0) {
            this.field_Z = (String[]) null;
          }
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_Z = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_Z[var4_int] = TextWidgetPainter.normalizeName((byte) 90, (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
            }
            var4 = new LinkButtonPainter(tj.field_e, 0, 1);
            this.field_U = new TextButton[var3_int + 1];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_U[var5] = new TextButton(this.field_Z[var5], (UiListener) (this));
              this.field_U[var5].field_p = (WidgetPainter) ((Object) var4);
              this.field_U[var5].field_v = un.field_f;
              this.field_U[var5].setBounds(0, (byte) -120, var5 * 16 + 20, 80, 15);
              this.addChild(this.field_U[var5], -95);
            }
            this.field_U[var3_int] = new TextButton(SectorCacheStore.field_f, (UiListener) (this));
            this.field_U[var3_int].field_p = (WidgetPainter) ((Object) var4);
            this.field_U[var3_int].setBounds(0, (byte) -126, 16 + (var3_int * 16 + 20), 100, 15);
            this.addChild(this.field_U[var3_int], -114);
            return;
          }
          this.field_Z = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ij.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final void onAction(int param0, byte param1, int param2, TextButton param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var6_intLifetime1;
        var7 = SteelSentinels.obfuscationControl;
        try {
          for (var6_int = 0; var6_int < this.field_Z.length; var6_int++) {
            if (param3 == this.field_U[var6_int]) {
              this.field_R.onNameSelected(20522, this.field_Z[var6_int]);
            }
          }
          var6_intLifetime1 = -108 % ((-85 - param1) / 36);
          if (this.field_U[this.field_Z.length] == param3) {
            this.field_R.onMoreSuggestions((byte) 86);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ij.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean onFocusedKey(int param0, int param1, char param2, UiComponent param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.onFocusedKey(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.focusPreviousChild(param3, 92);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(param0 ^ -22560, param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ij.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    NameSuggestionsPanel(NameSuggestionListener param0) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.field_R = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(CharSequence param0, boolean param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          var2_int = param0.length();
          var3 = 0;
          if (param1) {
            stackIn_3_0 = -89;
            return stackIn_3_0;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var3 = -var3 + ((var3 << 5) + AccountRequestResult.encodeExtendedChar(param0.charAt(var4), 732));
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("ij.M(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void k(int param0) {
        int var1 = 0;
        if (32 >= VerticalScrollbar.field_ac) {
          ModalPanel.a(0, (byte) 64);
        } else {
          var1 = VerticalScrollbar.field_ac % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          ModalPanel.a(-var1 + VerticalScrollbar.field_ac, (byte) 64);
        }
        if (param0 >= -15) {
          NameSuggestionsPanel.j(111);
        }
    }

    final void drawLayer(int param0, byte param1, int param2, int param3) {
        super.drawLayer(param0, (byte) -113, param2, param3);
        if (param3 != 0) {
          return;
        }
        if (param1 >= -99) {
          String[] var6 = (String[]) null;
          this.setSuggestions(false, (String[]) null);
        }
        BitmapFont var5 = tj.field_e;
        if (null != this.field_Z) {
          var5.drawParagraph(qi.field_h, param2 + this.field_o, this.field_z + param0, this.field_x, 20, 16777215, -1, 0, 0, var5.field_F + var5.field_G);
        }
    }

    final static RgbSprite j(int param0) {
        int var4_int = 0;
        int var5 = SteelSentinels.obfuscationControl;
        int var1 = MusicPatch.field_r[0] * StrongCacheEntry.field_L[0];
        if (param0 != -100) {
          return (RgbSprite) null;
        }
        byte[] var2 = UiContainer.field_L[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = QuickChatInputHelpers.field_d[ClientUiHelpers.bitAnd(255, (int) var2[var4_int])];
        }
        RgbSprite var4 = new RgbSprite(un.field_n, AgeValidator.field_n, PacketLoopHelpers.field_a[0], TextButton.field_M[0], StrongCacheEntry.field_L[0], MusicPatch.field_r[0], var3);
        NodeHashTable.a(9324);
        return var4;
    }

    final static IndexedSprite[] i(int param0) {
        int var2 = 0;
        int var3 = SteelSentinels.obfuscationControl;
        IndexedSprite[] var1 = new IndexedSprite[PacketLoopHelpers.field_d];
        for (var2 = 0; PacketLoopHelpers.field_d > var2; var2++) {
          var1[var2] = new IndexedSprite(un.field_n, AgeValidator.field_n, PacketLoopHelpers.field_a[var2], TextButton.field_M[var2], StrongCacheEntry.field_L[var2], MusicPatch.field_r[var2], UiContainer.field_L[var2], QuickChatInputHelpers.field_d);
        }
        if (param0 >= -66) {
          field_W = 104;
        }
        NodeHashTable.a(9324);
        return var1;
    }

    static {
        field_T = "Training Complete";
        field_Y = -1;
        field_Q = "Average rating";
        field_V = "You can join this game";
        field_X = 0;
        field_S = "Enter name of friend to add to list";
    }
}
