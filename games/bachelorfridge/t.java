/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends oha {
    int field_s;
    int field_p;
    int field_n;
    static String field_m;
    int field_r;
    int field_o;
    int field_u;
    int field_q;
    int field_w;
    static int field_v;
    int field_t;

    final static void a(int param0, vr param1) {
        try {
            vw.field_a = new pn[3];
            vw.field_a[param0] = (pn) ((Object) new id(param1));
            vw.field_a[1] = (pn) ((Object) new pla(param1));
            vw.field_a[2] = (pn) ((Object) new kn(param1));
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "t.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(int param0) {
        int stackIn_7_0 = 0;
        if (param0 == 27863) {
          if (1 != this.field_p) {
            if (-5 != (this.field_p ^ -1)) {
              if (-3 == (this.field_p ^ -1)) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          this.field_w = 20;
          if (1 != this.field_p) {
            if (-5 == (this.field_p ^ -1)) {
              return true;
            } else {
              L0: {
                if (-3 != (this.field_p ^ -1)) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 >= -81) {
            t.c((byte) -55);
            field_m = null;
            return;
        }
        field_m = null;
    }

    t(int param0, String param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18) {
        super(param0, param1, param2, param3, param5, param6, param14, param15, param16);
        try {
            this.field_w = param9;
            this.field_r = param7;
            this.field_p = param4;
            this.field_o = param17;
            this.field_q = param8;
            this.field_u = param13;
            this.field_t = param10;
            this.field_n = param18;
            this.field_s = param11;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "t.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ')');
        }
    }

    static {
        field_m = "You win!";
        field_v = 0;
    }
}
