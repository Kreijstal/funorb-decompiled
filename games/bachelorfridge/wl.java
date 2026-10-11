/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends sna {
    gba field_vb;
    static kv[][] field_yb;
    static String field_wb;
    private sna field_xb;
    private gba field_zb;
    private sna field_Ab;

    private wl(long param0, sna param1, sna param2, gba param3) {
        super(param0, (sna) null);
        try {
          this.field_xb = new sna(0L, param2);
          this.field_vb = new gba(0L, param3, true);
          this.field_zb = new gba(0L, param3, false);
          this.a(-1, this.field_xb);
          this.a(-1, this.field_vb);
          this.a(-1, this.field_zb);
          this.field_Ab = param1;
          this.field_xb.a(-1, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        var7 = BachelorFridge.field_y;
        this.field_Ab.field_rb = 0;
        this.field_Ab.field_kb = 0;
        this.field_xb.field_sb = this.field_sb;
        var4 = 18 % ((78 - param2) / 48);
        this.field_xb.field_p = this.field_p;
        this.field_vb.a(false);
        this.field_zb.a(false);
        stackIn_3_0 = (this.field_Ab.field_sb <= this.field_xb.field_sb) ? 0 : 1;
        var5 = stackIn_3_0;
        stackIn_6_0 = (this.field_Ab.field_p <= this.field_xb.field_p) ? 0 : 1;
        var6 = stackIn_6_0;
        if (var5 != 0 &&
          var6 != 0) {
          this.a(-1, this.field_zb);
          this.a(-1, this.field_vb);
          this.field_xb.field_sb = this.field_xb.field_sb - (param1 + param0);
          this.field_xb.field_p = this.field_xb.field_p - (param1 + param0);
          this.field_zb.a(param1, 31407, -param1 + this.field_sb, 0, -param1 + this.field_p);
          this.field_zb.b(this.field_Ab.field_sb, -this.field_Ab.field_kb, this.field_xb.field_sb, (byte) -117);
          this.field_vb.a(-param1 + this.field_p, 31407, param1, -param1 + this.field_sb, 0);
          this.field_vb.b(this.field_Ab.field_p, -this.field_Ab.field_rb, this.field_xb.field_p, (byte) -117);
        } else {
          if (var5 == 0) {
            if (var6 != 0) {
              this.a(-1, this.field_vb);
              this.field_xb.field_sb = this.field_xb.field_sb - (param0 + param1);
              this.field_vb.a(this.field_p, 31407, param1, this.field_sb - param1, 0);
              this.field_vb.b(this.field_Ab.field_p, -this.field_Ab.field_rb, this.field_xb.field_p, (byte) -117);
            }
          } else {
            this.a(-1, this.field_zb);
            this.field_xb.field_p = this.field_xb.field_p - (param0 + param1);
            this.field_zb.a(param1, 31407, this.field_sb, 0, this.field_p - param1);
            this.field_zb.b(this.field_Ab.field_sb, -this.field_Ab.field_kb, this.field_xb.field_sb, (byte) -117);
          }
        }
    }

    wl(String param0, sna param1, sna param2, gba param3) {
        this(ew.a((byte) 8, (CharSequence) ((Object) param0)), param1, param2, param3);
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        this.field_p = param4;
        if (param2) {
          this.field_vb = (gba) null;
        }
        this.field_rb = param1;
        this.field_kb = param5;
        this.field_sb = param6;
        this.a(param0, param3, -50);
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param3 <= 104) {
          this.a(-126, -34, 21);
        }
        this.a(param1, param0, this.field_xb.field_sb, param2, this.field_xb.field_p, false);
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var8;
        var8 = BachelorFridge.field_y;
        if (this.field_vb.g(25910)) {
          this.field_Ab.field_I = this.field_Ab.field_I + param3;
        }
        if (this.field_vb.b(param5)) {
          this.field_Ab.field_I = this.field_Ab.field_I - param3;
        }
        if (this.field_vb.f(0)) {
          this.field_Ab.field_I = this.field_Ab.field_I + param2;
        }
        if (this.field_vb.h(0)) {
          this.field_Ab.field_I = this.field_Ab.field_I - param2;
        }
        if (this.field_zb.g(25910)) {
          this.field_Ab.field_mb = this.field_Ab.field_mb + param3;
        }
        if (this.field_zb.b(false)) {
          this.field_Ab.field_mb = this.field_Ab.field_mb - param3;
        }
        if (this.field_zb.f(0)) {
          this.field_Ab.field_mb = this.field_Ab.field_mb + param4;
        }
        if (this.field_zb.h(0)) {
          this.field_Ab.field_mb = this.field_Ab.field_mb - param4;
        }
        if (this.field_T) {
          if (this.field_xb.field_p > this.field_Ab.field_p) {
            this.field_Ab.field_mb = this.field_Ab.field_mb - param1;
          } else {
            this.field_Ab.field_I = this.field_Ab.field_I - param1;
          }
        }
        if (!param0) {
          if (-(this.field_Ab.field_I + this.field_Ab.field_rb) > this.field_Ab.field_p + this.field_Ab.field_hb - this.field_xb.field_p) {
            this.field_Ab.field_I = -(this.field_Ab.field_hb + this.field_Ab.field_p - this.field_xb.field_p) - this.field_Ab.field_rb;
          }
          if (this.field_Ab.field_sb + this.field_Ab.field_W - this.field_xb.field_sb < -(this.field_Ab.field_kb + this.field_Ab.field_mb)) {
            this.field_Ab.field_mb = -this.field_Ab.field_kb - (-this.field_xb.field_sb + this.field_Ab.field_W + this.field_Ab.field_sb);
          }
          if (-(this.field_Ab.field_I + this.field_Ab.field_rb) < 0) {
            this.field_Ab.field_I = -this.field_Ab.field_rb;
          }
          if (-(this.field_Ab.field_kb + this.field_Ab.field_mb) < 0) {
            this.field_Ab.field_mb = -this.field_Ab.field_kb;
          }
        } else {
          if (-(this.field_Ab.field_I + this.field_Ab.field_rb) < 0) {
            this.field_Ab.field_I = -this.field_Ab.field_rb;
          }
          if (this.field_Ab.field_p + this.field_Ab.field_hb - this.field_xb.field_p < -(this.field_Ab.field_I + this.field_Ab.field_rb)) {
            this.field_Ab.field_I = -this.field_Ab.field_rb - (this.field_Ab.field_hb + (this.field_Ab.field_p - this.field_xb.field_p));
          }
          if (-(this.field_Ab.field_mb + this.field_Ab.field_kb) < 0) {
            this.field_Ab.field_mb = -this.field_Ab.field_kb;
          }
          if (-(this.field_Ab.field_mb + this.field_Ab.field_kb) > this.field_Ab.field_W + this.field_Ab.field_sb - this.field_xb.field_sb) {
            this.field_Ab.field_mb = -this.field_Ab.field_kb - (-this.field_xb.field_sb + this.field_Ab.field_W + this.field_Ab.field_sb);
          }
        }
        if (this.field_vb.f((byte) -122)) {
          this.field_Ab.field_rb = -this.field_vb.a(param0, (byte) 87, this.field_xb.field_p, this.field_Ab.field_p);
          this.field_Ab.field_I = 0;
        }
        if (this.field_zb.f((byte) -119)) {
          this.field_Ab.field_kb = -this.field_zb.a(-88, param0, this.field_xb.field_sb, this.field_Ab.field_sb);
          this.field_Ab.field_mb = 0;
        }
        this.field_vb.b(this.field_Ab.field_p, -this.field_Ab.field_rb, this.field_xb.field_p, (byte) -117);
        this.field_zb.b(this.field_Ab.field_sb, -this.field_Ab.field_kb, this.field_xb.field_sb, (byte) -117);
    }

    public static void f(int param0) {
        field_yb = (kv[][]) null;
        field_wb = null;
        if (param0 != 0) {
          field_yb = (kv[][]) null;
        }
    }

    static {
        field_wb = "Hide players in <%0>'s game";
    }
}
