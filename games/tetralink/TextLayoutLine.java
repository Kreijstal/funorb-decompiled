/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLayoutLine {
    static UiComponent field_i;
    static String field_l;
    static int[] field_d;
    static DateOfBirthPanel field_e;
    int field_a;
    static String field_f;
    int field_h;
    static String field_g;
    int[] field_j;
    static int[] field_k;
    static int field_c;
    static String field_b;

    final int findNearestCharacterIndex(byte param0, int param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = TetraLink.field_J;
        if (this.field_j == null) {
          return 0;
        }
        if (0 == this.field_j.length) {
          return 0;
        }
        if (param0 >= 62) {
          for (var3 = 1; this.field_j.length > var3; var3++) {
            if (param1 < (this.field_j[-1 + var3] + this.field_j[var3] >> 1)) {
              return var3 - 1;
            }
          }
          return -1 + this.field_j.length;
        }
        this.field_h = -98;
        for (var3Lifetime1 = 1; this.field_j.length > var3Lifetime1; var3Lifetime1++) {
          if (param1 < (this.field_j[-1 + var3Lifetime1] + this.field_j[var3Lifetime1] >> 1)) {
            return var3Lifetime1 - 1;
          }
        }
        return -1 + this.field_j.length;
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_i = null;
        field_d = null;
        field_l = null;
        field_g = null;
        field_k = null;
        if (param0 > 48) {
          field_f = null;
          field_e = null;
          return;
        }
        TextLayoutLine.releaseStatics(-43);
        field_f = null;
        field_e = null;
    }

    final static void showUnreadMessagesNotice(int param0) {
        int var1;
        int var2;
        var2 = TetraLink.field_J;
        MenuThemeHelpers.field_f = false;
        if (param0 != 1) {
          return;
        }
        ChatMessageReader.field_b = null;
        if (QuickChatCategory.field_v) {
          BufferedSocket.field_u.showConnectionRestored(param0 ^ 129);
        } else {
          var1 = AudioPumpThread.field_a;
          if (var1 > 0) {
            if (var1 == 1) {
              ChatMessageReader.field_b = StatusRequestHelpers.field_g;
            } else {
              ChatMessageReader.field_b = SectorCacheStore.formatTemplate(new String[]{Integer.toString(var1)}, ArchiveRequest.field_z, 121);
            }
            ChatMessageReader.field_b = IntroFinalFrameHelpers.joinCharSequences((byte) 109, new CharSequence[]{(CharSequence) ((Object) ChatMessageReader.field_b), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ValidatedTextWidget.field_eb)});
          }
          BufferedSocket.field_u.closeDialog(param0 - 126);
          MenuInputState.showLoadingProgressScreen(true);
        }
    }

    TextLayoutLine(int param0, int param1, int param2) {
        this.field_a = param1;
        this.field_h = param0;
        this.field_j = new int[1 + param2];
    }

    final int getWidth(byte param0) {
        if (param0 > -12) {
          field_f = (String) null;
          if (null != this.field_j) {
            return this.field_j.length == 0 ? 0 : this.field_j[-1 + this.field_j.length];
          }
          return 0;
        }
        if (null == this.field_j) {
          return 0;
        }
        if (this.field_j.length != 0) {
          return this.field_j[-1 + this.field_j.length];
        }
        return 0;
    }

    static {
        field_l = "All players have left <%0>'s game.";
        field_f = "This is your RuneScape clan if you have one.";
        field_g = "You are offering to draw.";
        field_d = new int[8192];
        field_b = "<%0> has won!";
    }
}
