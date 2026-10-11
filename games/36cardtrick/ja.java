/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static eb field_b;
    static String field_d;
    private qk field_e;
    static String field_a;
    static String field_c;
    private qk field_g;
    private pg field_f;

    final static String a(int param0) {
        if (hh.field_g == jc.field_P) {
          return lh.field_c;
        }
        if (!wh.field_a.a(640)) {
          return wh.field_a.d(640);
        }
        if (hh.field_g == ei.field_d) {
          return wh.field_a.d(640);
        }
        if (param0 == -7705) {
          return ng.field_y;
        }
        ja.a((byte) -105);
        return ng.field_y;
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 >= -69) {
          ja.a((byte) 55);
        }
    }

    final vd a(int param0, int param1) {
        byte[] var4 = null;
        vd var3 = (vd) (this.field_f.a((long)param0, -1));
        if (var3 != null) {
          return var3;
        }
        if (param1 >= ~param0) {
          var4 = this.field_e.a(param0 & 32767, (byte) -115, 1);
        } else {
          var4 = this.field_g.a(param0, (byte) -115, 1);
        }
        var3 = new vd();
        if (var4 != null) {
          var3.a((byte) 48, new pb(var4));
        }
        if (param0 < 32768) {
          this.field_f.a(param1 ^ -32889, var3, (long)param0);
          return var3;
        }
        var3.c((byte) -43);
        this.field_f.a(param1 ^ -32889, var3, (long)param0);
        return var3;
    }

    private ja() throws Throwable {
        throw new Error();
    }

    static {
        field_d = "Email: ";
        field_c = "Type your password again to make sure it's correct";
    }
}
