/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BirthDateEntryPanel extends ArrayWidgetContainer implements ButtonActionListener {
    static String field_I;
    static int[] field_H;
    static SpriteWidget field_K;
    static ModelMesh field_L;
    private BirthDateInputWidget field_M;
    static LoginCredentials field_G;
    static boolean field_J;
    private TextButton field_N;

    BirthDateEntryPanel(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (WidgetListener) null);
        this.field_M = new BirthDateInputWidget(new TextFieldPainter(10000536), MathAndCookieHelpers.field_a, 0, 0, 140, 25);
        this.field_M.setBirthDateValidator(2, new DateOfBirthValidator());
        this.field_N = new TextButton(IntKeyLookup.field_c, (UiListener) (this));
        this.field_E = new UiWidget[]{(UiWidget) ((Object) this.field_M), (UiWidget) ((Object) this.field_N)};
        this.field_N.listener = (WidgetListener) ((Object) new ThreeSliceButtonPainter());
        this.refreshLayout(false);
    }

    public final void onAction(int param0, TextButton param1, int param2, int param3, int param4) {
        if (param0 != 12085) {
          this.field_M = (BirthDateInputWidget) null;
        }
        if (this.field_M.getValidationSource(param0 - 12086).getValidationState(param0 - 34328) != CachedTextLayout.field_i) {
          return;
        }
        try {
          DraggableWidget.sendBirthDate(this.field_M.getDay(-2), this.field_M.getMonthIndex(param0 - 12114), -2, this.field_M.getYear(true));
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ab.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void layoutChildren(byte param0) {
        int var2 = 0;
        if (param0 < -82) {
          var2 = 250;
          this.field_M.setBounds(25, true, this.field_m + 20 - 25 >> 1, this.field_g - var2 >> 1, 140);
          this.field_N.setBounds(30, true, (20 + (this.field_m - 30) >> 1) + 2, 140 + ((-var2 + this.field_g >> 1) + 10), 100);
          return;
        }
    }

    final static boolean isMenuScreenId(int param0, int param1) {
        if (param1 != 1) {
          field_L = (ModelMesh) null;
          if (!NanoTickClock.isNonNegative(95, param0)) {
            return false;
          }
          if (param0 != -2) {
            return true;
          }
          return false;
        }
        if (!NanoTickClock.isNonNegative(95, param0)) {
          return false;
        }
        if (param0 != -2) {
          return true;
        }
        return false;
    }

    final static String requestAddFriend(byte param0, String param1, int param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        CipherPacketBuffer var6 = null;
        CharSequence var7 = null;
        try {
          var7 = (CharSequence) ((Object) param1);
          if (!CacheReference.isValidAccountName(var7, param0 - 1551)) {
            stackIn_2_0 = StatSubmission.field_l;
            return stackIn_2_0;
          }
          if (CachedArchiveSource.field_q != 2) {
            stackIn_5_0 = AccountChoicePanel.field_F;
            return stackIn_5_0;
          }
          if (PacketBuffer.isLocalPlayerName(param1, true)) {
            stackIn_9_0 = DialWidgetPainter.field_k;
            return stackIn_9_0;
          }
          if (DisplayModeInfo.isKnownPlayer(param1, (byte) -73)) {
            stackIn_12_0 = MenuScreen.formatIndexedText(new String[]{param1}, BoundedUrlRequest.field_e, 2);
            return stackIn_12_0;
          }
          if (PatchNoteUsage.field_j >= 100 &&
            NameCharacterHelpers.field_d <= 0) {
            stackIn_17_0 = PopupMenuDrawHelpers.field_a;
            return stackIn_17_0;
          }
          if (PatchNoteUsage.field_j >= 200) {
            stackIn_20_0 = PopupMenuDrawHelpers.field_a;
            return stackIn_20_0;
          }
          if (WhirlpoolDigest.isFriend(param1, param0 ^ -1369854407)) {
            stackIn_23_0 = MenuScreen.formatIndexedText(new String[]{param1}, AgeValidator.field_o, 2);
            return stackIn_23_0;
          }
          var6 = IterableNodeHashTable.field_g;
          var6.writeCipheredOpcode(param2, 8);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(0, param0 ^ -25);
          var6.writeString(param1, (byte) -112);
          var6.backpatchByteLength(var6.position - var4, param0 - 74);
          if (param0 == 73) {
            return null;
          }
          var5 = (String) null;
          BirthDateEntryPanel.requestAddFriend((byte) -58, (String) null, 66);
          stackIn_27_0 = null;
          return (String) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("ab.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    final void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        try {
          if (param1 < 113) {
            BirthDateEntryPanel.isMenuScreenId(-49, -84);
          }
          super.updatePointer(param0, 124, param2, param3);
          this.field_N.field_C = this.field_M.getValidationSource(-1).getValidationState(-22243) == CachedTextLayout.field_i ? true : false;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ab.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, param2, param3);
        Js5Transport.arezzo12Font.drawLeft(NameCharacterHelpers.field_c, 4 + (this.field_l + param1), 4 + (Js5Transport.arezzo12Font.field_H + (this.field_u + param2)), 16777215, -1);
    }

    public static void releaseStatics(int param0) {
        field_G = null;
        if (param0 != -16349) {
          return;
        }
        field_I = null;
        field_L = null;
        field_K = null;
        field_H = null;
    }

    static {
        field_H = new int[128];
        field_I = "This option cannot be combined with the current settings for:  ";
        field_G = null;
    }
}
