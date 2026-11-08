/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    static String field_l;
    long field_j;
    static String field_n;
    DualLinkNode field_h;
    static String field_g;
    static String field_i;
    static SpriteWidget field_m;
    DualLinkNode field_k;

    final void unlinkSecondary(int param0) {
        if (this.field_k == null) {
          return;
        }
        if (param0 >= 10) {
          this.field_k.field_h = this.field_h;
          this.field_h.field_k = this.field_k;
          this.field_k = null;
          this.field_h = null;
          return;
        }
    }

    final boolean isSecondaryLinked(int param0) {
        if (param0 == 1) {
          return this.field_k != null ? true : false;
        }
        field_n = (String) null;
        if (this.field_k == null) {
          return false;
        }
        return true;
    }

    final void setSecondaryKey(int param0, long param1) {
        if (this.field_k != null) {
          throw new RuntimeException();
        }
        if (param0 != 0) {
          return;
        }
        this.field_j = param1;
    }

    final static void sendByteRequest(int param0, int param1) {
        CipherPacketBuffer var2 = IterableNodeHashTable.field_g;
        var2.writeCipheredOpcode(param0, 8);
        var2.writeByte(1, param1 + 62);
        var2.writeByte(param1, 80);
    }

    final static void drawDimmedBackground(boolean param0, byte param1, boolean param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (param0) {
          Rasterizer.fillRectangleAlpha(0, 0, Rasterizer.field_e, Rasterizer.field_f, 0, 192);
          PasswordConfirmationValidator.drawDialogStack(param0, -126);
          var3 = -121 / ((79 - param1) / 35);
          return;
        }
        Rasterizer.clear();
        PasswordConfirmationValidator.drawDialogStack(param0, -126);
        var3Lifetime1 = -121 / ((79 - param1) / 35);
    }

    public static void releaseStatics(boolean param0) {
        field_n = null;
        field_g = null;
        field_m = null;
        if (param0) {
          field_i = null;
          field_l = null;
          return;
        }
        field_i = (String) null;
        field_i = null;
        field_l = null;
    }

    final long getSecondaryKey(byte param0) {
        if (param0 <= 12) {
          this.field_j = 6L;
          return this.field_j;
        }
        return this.field_j;
    }

    protected DualLinkNode() {
    }

    static {
        field_n = "Show chat";
        field_l = "New Game";
        field_i = "Orb coins: ";
        field_g = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
