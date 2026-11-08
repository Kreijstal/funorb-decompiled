/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FadingChatMessage extends IntrusiveNode {
    private boolean field_j;
    private int field_e;
    private int age;
    private String text;
    static int field_h;
    private int alpha;

    final static void a(int param0, int param1, HighScoreQuery param2) {
        CipherPacketBuffer var3 = null;
        try {
          var3 = FootballerAiOverlaySupport.field_d;
          var3.b(param0, (byte) 73);
          var3.writeByte(115, 5);
          var3.writeByte(118, 0);
          if (param1 <= 71) {
            field_h = -27;
          }
          var3.writeShort(-1207444472, param2.field_o);
          var3.writeByte(116, param2.field_g);
          var3.writeByte(102, param2.field_j);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "gv.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void draw(int param0, int param1) {
        int var3 = -121 / ((37 - param0) / 47);
        if (this.alpha == 0) {
          return;
        }
        int var4 = FriendsListPanel.getHudOpacity(true, (byte) -120);
        SoftwareRasterizer.fillRoundedRectangleBlended(95, param1 + 1, this.field_e, 17, 6, 0, var4 * this.alpha >> 8);
        if (256 != this.alpha) {
          AuctionLogEntry.field_e.b(this.text, 107, -4 + (18 + param1), 16777215, -1, this.alpha);
        } else {
          AuctionLogEntry.field_e.a(this.text, 107, -4 + (param1 + 18), 16777215, -1);
        }
    }

    final void tickFade(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          this.alpha = 22;
        }
        if (this.field_j) {
          this.alpha = 256;
          return;
        }
        if (this.age >= 600) {
          this.alpha = 0;
          return;
        }
        this.age = this.age + 1;
        if (500 >= this.age) {
        } else {
          var2 = 100 - this.age + 500;
          if (0 <= var2) {
            this.alpha = (var2 << 8) / 100;
          } else {
            this.alpha = 0;
          }
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          if (!InstrumentNoteMask.isValidDisplayName(param1, param2 ^ -26200, param0)) {
            return false;
          }
          for (var3_int = param2; var3_int < param1.length(); var3_int++) {
            if (!CheckboxLabelWidget.a(param1.charAt(var3_int), 160)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("gv.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    FadingChatMessage(String param0, boolean param1) {
        int var3_int = 0;
        try {
          this.alpha = 256;
          this.field_j = param1 ? true : false;
          this.text = param0;
          this.age = this.field_j ? 500 : 0;
          var3_int = 20 + AuctionLogEntry.field_e.a(this.text);
          this.field_e = Math.max(400, var3_int);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "gv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_h = -1;
    }
}
