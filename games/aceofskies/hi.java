/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends to {
    int field_u;
    static BitmapFontMetrics field_v;
    static String field_x;
    static int field_w;

    public static void k(int param0) {
        if (param0 > -40) {
          return;
        }
        field_v = null;
        field_x = null;
    }

    hi(ea param0) {
        super(param0.field_p, param0.field_h, param0.field_q, param0.field_n, (ir) null, (no) null);
        try {
          param0.a(this.field_n, 0, 0, this.field_q, (byte) 126);
          this.field_u = 256;
          this.field_s = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public hi() {
        super(0, 0, 0, 0, (ir) null, (no) null);
        this.field_u = 256;
    }

    final static boolean c(int param0, int param1, int param2) {
        boolean stackIn_5_0 = false;
        boolean stackIn_6_1 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_21_1 = false;
        boolean stackIn_25_0 = false;
        boolean stackIn_27_0 = false;
        boolean stackIn_28_1 = false;
        if (param0 == 14834) {
          if (!si.a(param2, 2, param1)) {
            return false;
          }
          stackIn_20_0 = qr.a(param1, param0 - 22084, param2);
          stackIn_21_1 = ((param1 & 36864) == 0) ? false : true;
          if (stackIn_20_0 | stackIn_21_1 | hh.a(0, param1, param2)) {
            return true;
          }
          stackIn_25_0 = (0 != (param1 & 8192));
          stackIn_27_0 = stackIn_25_0 | HighscoreNameEntry.a(param1, 544, param2) | gh.a(param2, false, param1);
          stackIn_28_1 = ((55 & param2) != 0) ? false : true;
          return stackIn_27_0 & stackIn_28_1;
        }
        hi.k(13);
        if (!si.a(param2, 2, param1)) {
          return false;
        }
        stackIn_5_0 = qr.a(param1, param0 - 22084, param2);
        stackIn_6_1 = ((param1 & 36864) == 0) ? false : true;
        if (stackIn_5_0 | stackIn_6_1 | hh.a(0, param1, param2)) {
          return true;
        }
        stackIn_10_0 = (0 != (param1 & 8192));
        stackIn_12_0 = stackIn_10_0 | HighscoreNameEntry.a(param1, 544, param2) | gh.a(param2, false, param1);
        stackIn_13_1 = ((55 & param2) != 0) ? false : true;
        return stackIn_12_0 & stackIn_13_1;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return;
        }
        if (this.field_s == null) {
          return;
        }
        if (0 == this.field_u) {
          return;
        }
        if (this.field_u == 256) {
          this.field_s.a((byte) 69, param1, this.field_h + param2, this.field_p + param3);
          return;
        }
        ll var6 = new ll(this.field_s.field_q, this.field_s.field_n);
        cm.a(var6, -14492);
        this.field_s.a((byte) 90, param1, 0, 0);
        sl.c(2765);
        var6.a(param3 + this.field_p, param2 + this.field_h, this.field_u);
        if (param0 >= 64) {
          return;
        }
        field_v = (BitmapFontMetrics) null;
    }

    final static void j(int param0) {
        if (!gi.a(true)) {
          return;
        }
        if (param0 == 8585) {
          MenuScreen.a((byte) -119, 4, false);
          return;
        }
        hi.k(37);
        MenuScreen.a((byte) -119, 4, false);
    }

    static {
        field_w = -1;
    }
}
