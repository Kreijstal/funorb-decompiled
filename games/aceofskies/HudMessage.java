/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HudMessage extends IntrusiveNode {
    static ej field_g;
    static String field_e;
    private int ageTicks;
    private int colour;
    private int holdTicks;
    private int fadeOutTicks;
    private int fadeInTicks;
    private String text;

    public static void a(byte param0) {
        field_e = null;
        int var1 = -17 % ((19 - param0) / 35);
        field_g = null;
    }

    final boolean c(byte param0) {
        if (param0 == 47) {
          return this.ageTicks < this.holdTicks + (kn.bigFontMetrics.lineAdvance - this.fadeInTicks) ? true : false;
        }
        this.colour = -72;
        return this.ageTicks < this.holdTicks + (kn.bigFontMetrics.lineAdvance - this.fadeInTicks) ? true : false;
    }

    final boolean advanceAndIsExpired(int obfuscationGuard) {
        int var2 = -39 / ((obfuscationGuard + 45) / 55);
        int fieldTemp$0 = this.ageTicks + 1;
        this.ageTicks = this.ageTicks + 1;
        return this.fadeOutTicks + (this.holdTicks + this.fadeInTicks) < fieldTemp$0 ? true : false;
    }

    final void draw(int exitBottomOffset) {
        if (this.fadeInTicks > this.ageTicks) {
          int var2 = (this.ageTicks << 8) / this.fadeInTicks;
          int var3 = (-this.ageTicks + this.fadeInTicks) * 80 / this.fadeInTicks;
          PacketBuffer.gameFont.drawCenteredText(122, var2 << 24 | this.colour, -1, var3 + (-50 + gp.field_w), 320, this.text);
          return;
        }
        if (this.ageTicks < this.fadeInTicks + this.holdTicks) {
          PacketBuffer.gameFont.drawCenteredText(102, this.colour | -16777216, -1, gp.field_w - 50, 320, this.text);
          return;
        }
        int var2Lifetime1 = this.ageTicks - this.fadeInTicks - this.holdTicks;
        int var3Lifetime1 = (this.fadeOutTicks - var2Lifetime1 << 8) / this.fadeOutTicks;
        if (var3Lifetime1 <= 0) {
          return;
        }
        int var4 = 80 * var2Lifetime1 / this.fadeOutTicks;
        PacketBuffer.gameFont.drawCenteredText(99, this.colour | var3Lifetime1 << 24, -1, exitBottomOffset + (gp.field_w - var4), sh.field_u >> 1, this.text);
    }

    HudMessage(String text, int colour) {
        try {
          this.fadeInTicks = 20;
          this.colour = colour;
          this.text = text;
          this.fadeOutTicks = 80;
          this.ageTicks = 0;
          this.holdTicks = 150;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "tb.<init>(" + (text != null ? "{...}" : "null") + ',' + colour + ')');
        }
    }

    HudMessage(String text, int colour, int holdTicks) {
        try {
          this.fadeInTicks = 20;
          this.holdTicks = holdTicks;
          this.ageTicks = 0;
          this.colour = colour;
          this.text = text;
          this.fadeOutTicks = 80;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "tb.<init>(" + (text != null ? "{...}" : "null") + ',' + colour + ',' + holdTicks + ')');
        }
    }

    static {
        field_g = new ej(7, 0, 1, 1);
        field_e = "That name is not available";
    }
}
