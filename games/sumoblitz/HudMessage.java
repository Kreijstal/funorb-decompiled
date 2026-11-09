/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HudMessage extends IntrusiveNode {
    private int fadeInTicks;
    private int fadeOutTicks;
    private int x;
    private int y;
    private boolean multiline;
    private int holdTicks;
    static ToolkitSprite[] field_s;
    private int ageTicks;
    private int color;
    private String text;
    static ToolkitSprite field_m;
    static byte[] field_t;

    final boolean updateAndIsExpired(int param0) {
        int fieldTemp$0 = 0;
        if (param0 == 80) {
          fieldTemp$0 = this.ageTicks + 1;
          this.ageTicks = this.ageTicks + 1;
          return this.fadeOutTicks + this.holdTicks + this.fadeInTicks < fieldTemp$0 ? true : false;
        }
        field_m = (ToolkitSprite) null;
        int fieldTemp$1 = this.ageTicks + 1;
        this.ageTicks = this.ageTicks + 1;
        return this.fadeOutTicks + this.holdTicks + this.fadeInTicks < fieldTemp$1 ? true : false;
    }

    final void render(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -70) {
          HudMessage.releaseStatics(false);
        }
        if (this.fadeInTicks > this.ageTicks) {
          var2 = (this.ageTicks << 8) / this.fadeInTicks;
          if (var2 > 255) {
            var2 = 255;
          }
          var3 = 80 * (this.fadeInTicks - this.ageTicks) / this.fadeInTicks;
          if (this.multiline) {
            QueuedIntArrayRequest.field_k.a(100, 5023231 | var2 << 24, 0, 320, 160, (int[]) null, (ToolkitSprite[]) null, this.y + var3, -1, 0, 0, -8787, this.text, (SpriteMask) null, 1, 1);
            GameTrackPlayback.field_a.a(100, var2 << 24 | 16777215, 0, 320, 160, (int[]) null, (ToolkitSprite[]) null, this.y + var3, -1, 0, 0, -8787, this.text, (SpriteMask) null, 1, 1);
          } else {
            QueuedIntArrayRequest.field_k.a(this.text, var2 << 24 | 5023231, -1, this.y + var3, this.x, 0);
            GameTrackPlayback.field_a.a(this.text, var2 << 24 | this.color, -1, var3 + this.y, this.x, 0);
          }
          return;
        }
        if (this.ageTicks < this.holdTicks + this.fadeInTicks) {
          var2Lifetime1 = (this.ageTicks << 8) / this.fadeInTicks;
          if (var2Lifetime1 > 255) {
            var2Lifetime1 = 255;
          }
          if (!this.multiline) {
            QueuedIntArrayRequest.field_k.a(this.text, 5023231 | var2Lifetime1 << 24, -1, this.y, this.x, param0 + 70);
            GameTrackPlayback.field_a.a(this.text, this.color | var2Lifetime1 << 24, -1, this.y, this.x, 0);
          } else {
            QueuedIntArrayRequest.field_k.a(100, var2Lifetime1 << 24 | 5023231, 0, 320, 160, (int[]) null, (ToolkitSprite[]) null, this.y, -1, 0, 0, -8787, this.text, (SpriteMask) null, 1, 1);
            GameTrackPlayback.field_a.a(100, 16777215 | var2Lifetime1 << 24, 0, 320, 160, (int[]) null, (ToolkitSprite[]) null, this.y, -1, 0, 0, -8787, this.text, (SpriteMask) null, 1, 1);
          }
          return;
        }
        var2Lifetime2 = -this.holdTicks + (this.ageTicks - this.fadeInTicks);
        var3Lifetime1 = (-var2Lifetime2 + this.fadeOutTicks << 8) / this.fadeOutTicks;
        if (var3Lifetime1 <= 0) {
          return;
        }
        if (var3Lifetime1 > 255) {
          var3Lifetime1 = 255;
        }
        var4 = 80 * var2Lifetime2 / this.fadeOutTicks;
        if (!this.multiline) {
          QueuedIntArrayRequest.field_k.a(this.text, 5023231 | var3Lifetime1 << 24, -1, -var4 + this.y, this.x, 0);
          GameTrackPlayback.field_a.a(this.text, var3Lifetime1 << 24 | this.color, -1, this.y - var4, this.x, param0 ^ -70);
        } else {
          QueuedIntArrayRequest.field_k.a(100, 5023231 | var3Lifetime1 << 24, 0, 320, 160, (int[]) null, (ToolkitSprite[]) null, -var4 + this.y, -1, 0, 0, param0 - 8717, this.text, (SpriteMask) null, 1, 1);
          GameTrackPlayback.field_a.a(100, var3Lifetime1 << 24 | 16777215, 0, 320, 160, (int[]) null, (ToolkitSprite[]) null, -var4 + this.y, -1, 0, 0, -8787, this.text, (SpriteMask) null, 1, 1);
        }
    }

    public static void releaseStatics(boolean param0) {
        field_t = null;
        field_m = null;
        field_s = null;
        if (param0) {
          field_m = (ToolkitSprite) null;
        }
    }

    HudMessage(String text, int color, int x, int y) {
        try {
          this.ageTicks = 0;
          this.fadeOutTicks = 80;
          this.holdTicks = 20;
          this.y = y;
          this.x = x;
          this.fadeInTicks = 20;
          this.color = color;
          this.text = text;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "to.<init>(" + (text != null ? "{...}" : "null") + ',' + color + ',' + x + ',' + y + ')');
        }
    }

    HudMessage(String text, int color) {
        try {
          this.fadeOutTicks = 80;
          this.x = 320;
          this.holdTicks = 0;
          this.y = 240;
          this.fadeInTicks = 20;
          this.color = color;
          this.text = text;
          this.ageTicks = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "to.<init>(" + (text != null ? "{...}" : "null") + ',' + color + ')');
        }
    }

    static {
        field_t = new byte[520];
    }
}
