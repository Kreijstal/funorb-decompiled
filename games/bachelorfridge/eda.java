/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eda extends TileEffect {
    private lna field_h;
    private int field_f;
    static boolean field_j;
    static MusicTrack field_i;
    static UiComponent field_k;
    private IndexedSprite field_g;

    final boolean b(int param0) {
        int fieldTemp$0 = 0;
        if (param0 < 21) {
          eda.releaseStatics(-107);
          fieldTemp$0 = this.field_f + 12;
          this.field_f = this.field_f + 12;
          if (fieldTemp$0 < bd.field_i.field_p) {
            return false;
          }
          return true;
        }
        int fieldTemp$1 = this.field_f + 12;
        this.field_f = this.field_f + 12;
        if (fieldTemp$1 < bd.field_i.field_p) {
          return false;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        field_k = null;
        field_i = null;
        if (param0 != 60) {
          eda.a(18, -71, 96, true, -18);
        }
    }

    eda(BattleScreen param0, int param1, int param2, lna param3, IndexedSprite param4) {
        super(param0, param1, param2);
        try {
          this.field_g = param4;
          this.field_h = param3;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "eda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_h.e(66);
        Sprite var4 = lq.a(this.field_g, 8533, bd.field_i, (bd.field_i.field_p >> 1) - (this.field_f + 60), param1);
        var4.drawScaled(param2 + 16, -64 + (param0 - (40 - (this.field_f >> 1))), var4.field_q >> 1, var4.field_p >> 1);
        this.field_g.a(param2, param0);
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
          this.field_f = 11;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (param3) {
          return;
        }
        if (param1 - param2 < DualLinkNode.field_l) {
          wu.a(param4, param0, param2, param1, (byte) -23);
          return;
        }
        if (param1 + param2 > SnowAnimation.field_x) {
          wu.a(param4, param0, param2, param1, (byte) -23);
          return;
        }
        if (an.field_q > -param2 + param0) {
          wu.a(param4, param0, param2, param1, (byte) -23);
          return;
        }
        if (param0 + param2 > ha.field_n) {
          wu.a(param4, param0, param2, param1, (byte) -23);
          return;
        }
        EventAnimation.a(true, param4, param1, param2, param0);
    }

    static {
    }
}
