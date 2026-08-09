/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class foa implements bo {
    static String field_a;
    private int field_c;
    static boolean field_b;

    final void a(qh param0, int param1, v param2) {
        if (!param0.f(0)) {
            return;
        }
        try {
            if (param1 != -1) {
                field_b = true;
            }
            param0.field_r = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "foa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
    }

    final static boolean a(byte param0) {
        if (param0 < 86) {
            return false;
        }
        return jf.field_r;
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param2 != 0) {
          L0: {
            field_a = (String) null;
            if (0 == (2048 & param0)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (0 == (2048 & param0)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final void a(int param0, kh param1) {
        param1.i(8);
        param1.a((byte) -128, 1 + this.field_c, 32);
        if (param0 != 200) {
            return;
        }
        try {
            param1.k(-1826190686);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "foa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(kh param0, byte param1) {
        try {
            param0.h((byte) -62);
            this.field_c = param0.b((byte) 44, 32) + -1;
            param0.i((byte) 98);
            if (param1 != -19) {
                foa.a(false);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "foa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    foa() {
        this.field_c = -1;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9) {
        if (param5 == 75) {
          if (!io.a(param4, param3, (byte) -122, param7, param1, param2, param0, param6, param9)) {
            return 0;
          } else {
            return jqa.a(-(param7 / 2) + param2, 1, -(param0 / 2) + param3, param3 + (1 + param0) / 2, param2 + (param7 + 1) / 2, param8, param1 - param6 / 2, (param4 - -1) / 2 + param9, (1 + param6) / 2 + param1, param9 + -(param4 / 2));
          }
        } else {
          return 73;
        }
    }

    static {
        field_a = "Create a free Account";
        field_b = true;
    }
}
