/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String field_e;
    private gn field_d;
    private bi field_c;
    static String field_b;
    private gn field_a;

    final on a(int param0, int param1) {
        byte[] var4 = null;
        on var3 = (on) (this.field_c.a((long)param0, -113));
        if (var3 != null) {
          return var3;
        }
        if (32768 > param0) {
          var4 = this.field_a.a(1, true, param0);
        } else {
          var4 = this.field_d.a(1, true, param0 & 32767);
        }
        if (param1 != 1) {
          return (on) null;
        }
        var3 = new on();
        if (var4 != null) {
          var3.a(120, new th(var4));
        }
        if (param0 < 32768) {
          this.field_c.a((long)param0, var3, false);
          return var3;
        }
        var3.g(-111);
        this.field_c.a((long)param0, var3, false);
        return var3;
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = -98 % ((param0 - 29) / 59);
        field_b = null;
    }

    final static void a(int param0) {
        ci.field_h = false;
        if (param0 >= -2) {
          ng.a(-88);
          rd.field_e.f((byte) -55);
          return;
        }
        rd.field_e.f((byte) -55);
    }

    private ng() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Please wait...";
    }
}
