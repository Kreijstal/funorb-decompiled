/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PitTile implements Renderable {
    int field_i;
    boolean field_g;
    PitModel pit;
    PitTile field_b;
    int field_j;
    int field_a;
    int field_h;
    int field_f;
    int field_d;
    static String field_c;

    public final int getRenderZ(byte param0) {
        if (param0 <= -86) {
          return this.pit.getRenderZ((byte) -99) - (this.field_h << 16);
        }
        PitTile.releaseStatics(-37);
        return this.pit.getRenderZ((byte) -99) - (this.field_h << 16);
    }

    public final int getRenderX(byte param0) {
        int var2 = 36 / ((-23 - param0) / 53);
        return this.pit.getRenderX((byte) 95) + this.field_i;
    }

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          this.isRenderExpired((byte) -51);
          return this.pit.isRenderExpired((byte) 48);
        }
        return this.pit.isRenderExpired((byte) 48);
    }

    public final int getRenderY(byte param0) {
        if (param0 < 91) {
          return 115;
        }
        return this.pit.getRenderY((byte) 125) + this.field_a;
    }

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          PitTile.releaseStatics(92);
          field_c = null;
          return;
        }
        field_c = null;
    }

    public final void render(int param0, Camera param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ToolkitModel var4 = null;
        TrapPart var3 = this.pit.getPart(-85);
        if (var3 != null &&
          !var3.isEnabled(-102)) {
          return;
        }
        if (param0 <= 103) {
          return;
        }
        try {
          if (this.field_h != 0) {
            var4 = this.pit.a(107, this);
          } else {
            var4 = this.pit.a(this, 44);
          }
          var5 = GameScreen.positiveModulo(this.field_f, 2048, -54);
          var6 = this.getRenderX((byte) -95);
          var7 = this.getRenderY((byte) 117);
          var8 = this.getRenderZ((byte) -106);
          ChatMessage.drawModelAt(var5, -83584144, var7, var6, var4, var8);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "dpa.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void updateAnimation(int param0) {
        if (param0 != -4366) {
          PitTile.releaseStatics(103);
        }
    }

    final PitTile copy(int param0) {
        PitTile var2 = new PitTile();
        var2.field_h = this.field_h;
        var2.field_f = this.field_f;
        if (param0 >= 8) {
          var2.field_j = this.field_j;
          var2.pit = this.pit;
          var2.field_d = this.field_d;
          var2.field_i = this.field_i;
          var2.field_a = this.field_a;
          return var2;
        }
        return (PitTile) null;
    }

    static {
        field_c = "Spectator";
    }
}
