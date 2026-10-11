/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends ie {
    static ti field_D;
    static String field_C;
    static int field_z;
    static String field_B;
    int field_A;

    final static boolean g(int param0) {
        if (param0 > -26) {
          field_B = (String) null;
          if (mp.field_a < 20) {
            return true;
          }
          if (!we.g(-1)) {
            return true;
          }
          if (jk.field_c <= 0) {
            return false;
          }
          if (!au.c(1)) {
            return true;
          }
          return false;
        }
        if (mp.field_a < 20) {
          return true;
        }
        if (!we.g(-1)) {
          return true;
        }
        if (jk.field_c <= 0) {
          return false;
        }
        if (!au.c(1)) {
          return true;
        }
        return false;
    }

    in(pk param0) {
        super(param0.field_r, param0.field_v, param0.field_q, param0.field_p, (mh) null, (qm) null);
        try {
          param0.a(-116, 0, 0, this.field_p, this.field_q);
          this.field_A = 256;
          this.field_y = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "in.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public in() {
        super(0, 0, 0, 0, (mh) null, (qm) null);
        this.field_A = 256;
    }

    public static void a(byte param0) {
        if (param0 > -9) {
          return;
        }
        field_C = null;
        field_D = null;
        field_B = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (0 != param3) {
          return;
        }
        if (null == this.field_y) {
          return;
        }
        if (this.field_A == 0) {
          return;
        }
        if (this.field_A == 256) {
          this.field_y.a(this.field_r + param0, this.field_v + param1, (byte) -125, param3);
          return;
        }
        wb var6 = new wb(this.field_y.field_q, this.field_y.field_p);
        jq.a(7161, var6);
        if (param2 < -35) {
          this.field_y.a(0, 0, (byte) -55, param3);
          su.a((byte) 108);
          var6.a(this.field_r + param0, param1 + this.field_v, this.field_A);
          return;
        }
        field_C = (String) null;
        this.field_y.a(0, 0, (byte) -55, param3);
        su.a((byte) 108);
        var6.a(this.field_r + param0, param1 + this.field_v, this.field_A);
    }

    static {
        field_z = 0;
        field_B = "Next";
    }
}
