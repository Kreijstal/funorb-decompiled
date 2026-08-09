/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends se {
    private String field_i;
    static hb field_e;
    private String field_g;
    static ki field_j;
    static String field_h;
    static du field_f;

    final static ki a(int param0, byte param1) {
        if (param1 != 125) {
          field_e = (hb) null;
          return ng.a(1, -74, true, param0, false, false);
        } else {
          return ng.a(1, -74, true, param0, false, false);
        }
    }

    final void a(fs param0, byte param1) {
        try {
            param0.b(this.field_i, (byte) -105);
            param0.a(this.field_g, 46);
            if (param1 >= -107) {
                fs var4 = (fs) null;
                this.a((fs) null, (byte) 29);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = -16 / ((18 - param0) / 60);
        fq.field_f.a(-3388, param1);
    }

    final nb a(byte param0) {
        if (param0 < 80) {
            this.a((byte) -128);
            return pb.field_b;
        }
        return pb.field_b;
    }

    public static void b(byte param0) {
        if (param0 != 88) {
          field_h = (String) null;
          field_j = null;
          field_f = null;
          field_h = null;
          field_e = null;
          return;
        } else {
          field_j = null;
          field_f = null;
          field_h = null;
          field_e = null;
          return;
        }
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        var1_ref = field_e;
        synchronized (var1_ref) {
          L0: {
            L1: {
              if (param0 <= -20) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            if (ua.field_a != bj.field_a) {
              tg.field_a = cp.field_c[bj.field_a];
              np.field_c = aa.field_c[bj.field_a];
              bj.field_a = bj.field_a - -1 & 127;
              stackIn_7_0 = 1;
              break L0;
            } else {
              stackIn_5_0 = 0;
              return stackIn_5_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    wd(String param0, String param1) {
        try {
            this.field_i = param0;
            this.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new hb();
        field_h = "Continue";
    }
}
