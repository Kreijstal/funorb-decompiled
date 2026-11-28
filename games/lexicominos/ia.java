/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends mg {
    static RgbSprite field_G;
    static int field_C;
    static String field_F;
    static RgbSprite field_H;
    int field_E;

    final static void a(byte param0) {
        if (ta.field_g == 10) {
          sb.a(-128);
          ta.field_g = 11;
        } else {
          if (!DualLinkNode.d(true)) {
            sb.a(-128);
            ta.field_g = 11;
          }
        }
        fh.field_i = true;
        if (param0 > 33) {
          return;
        }
        ia.clearStaticReferences(-116);
    }

    ia(w param0) {
        super(param0.field_t, param0.field_o, param0.field_j, param0.field_v, (rd) null, (vd) null);
        try {
          param0.a(this.field_v, this.field_j, true, 0, 0);
          this.field_A = param0;
          this.field_E = 256;
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "ia.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        RgbSprite var6 = null;
        if (param3 != 0) {
          return;
        }
        if (this.field_A == null) {
          return;
        }
        if (this.field_E == 0) {
          return;
        }
        if (this.field_E != 256) {
          var6 = new RgbSprite(this.field_A.field_j, this.field_A.field_v);
          de.a(var6, 6);
          this.field_A.a(param0, 0, 0, param3);
          pd.a(-22949);
          var6.drawWithOpacity(this.field_t + param2, param1 + this.field_o, this.field_E);
          return;
        }
        this.field_A.a((byte) -115, this.field_o + param1, param2 + this.field_t, param3);
    }

    public static void clearStaticReferences(int param0) {
        field_H = null;
        field_G = null;
        field_F = null;
        if (param0 != 0) {
          ia.clearStaticReferences(126);
        }
    }

    public ia() {
        super(0, 0, 0, 0, (rd) null, (vd) null);
        this.field_E = 256;
    }

    static {
        field_C = 64;
        field_F = "Loading animations";
    }
}
