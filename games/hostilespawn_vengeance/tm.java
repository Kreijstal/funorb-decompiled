/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends am {
    int field_u;
    int field_y;
    int field_m;
    int field_D;
    int field_k;
    int field_E;
    int field_z;
    int field_C;
    static vl field_o;
    int field_n;
    nf field_p;
    int field_F;
    b field_A;
    int field_t;
    int field_h;
    pl field_x;
    int field_B;
    int field_w;
    int field_l;
    jb field_r;
    int field_j;
    static int field_q;
    int field_i;
    static int field_v;
    static String field_s;

    final static void a(int param0, int param1, int param2, boolean param3) {
        ce.field_c = param0;
        hh.field_e = param1;
        nf.field_m = param2;
        if (!param3) {
          tm.a(false);
        }
    }

    final static void a(byte param0, int param1, int param2, p param3) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 0 ||
            param2 < 0 ||
            640 < param1 ||
            param2 > 480) {
            param3.field_i = -1;
          }
          if (0 <= param3.field_e) {
            si.e(param1, param2, 1, 65535, -(param3.field_e * 4) + 128);
          } else {
            si.e(param1, param2, 1, 16777215, 128);
          }
          var4_int = 117 / ((-79 - param0) / 33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("tm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        this.field_A = null;
        if (param0) {
          this.field_x = null;
          this.field_r = null;
          this.field_p = null;
          return;
        }
        this.field_i = 82;
        this.field_x = null;
        this.field_r = null;
        this.field_p = null;
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_s = null;
        field_o = null;
    }

    tm() {
    }

    static {
        field_o = new vl();
        field_q = 0;
        field_s = "Where am I? This must be the station medical bay. I'd better find the lift.";
    }
}
