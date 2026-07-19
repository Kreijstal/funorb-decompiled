/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kd extends ck {
    static int field_p;
    kd field_o;
    static String field_q;
    static int[] field_r;
    static String field_s;
    static cm field_x;
    long field_w;
    static int field_u;
    kd field_v;
    static String field_t;

    public static void f(int param0) {
        field_r = null;
        field_t = null;
        field_q = null;
        field_x = null;
        if (param0 != 8191) {
            return;
        }
        field_s = null;
    }

    final void e(int param0) {
        if (this.field_v == null) {
          return;
        } else {
          this.field_v.field_o = this.field_o;
          this.field_o.field_v = this.field_v;
          if (param0 != 480) {
            field_x = (cm) null;
            this.field_v = null;
            this.field_o = null;
            return;
          } else {
            this.field_v = null;
            this.field_o = null;
            return;
          }
        }
    }

    final long d(int param0) {
        if (param0 < 84) {
            return -44L;
        }
        return this.field_w;
    }

    final void a(byte param0, long param1) {
        if (param0 <= 41) {
            return;
        }
        if (null != this.field_v) {
            throw new RuntimeException();
        }
        this.field_w = param1;
    }

    final boolean a(byte param0) {
        if (this.field_v == null) {
            return false;
        }
        if (param0 != 30) {
            field_s = (String) null;
            return true;
        }
        return true;
    }

    protected kd() {
    }

    static {
        field_q = "Connecting to<br>friend server...";
        field_s = "Reference manual";
        field_u = 480;
        field_t = "Research into <col=00ffff>EMP weapons</col> is needed before the <%0> can be engineered.";
        field_r = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
