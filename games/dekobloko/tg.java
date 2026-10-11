/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg implements gl {
    static String[] field_g;
    static lm field_a;
    static nk field_b;
    static w field_i;
    static w field_f;
    static int field_c;
    static String[][] field_d;
    static w field_h;
    static int field_e;

    public static void a(boolean param0) {
        field_d = (String[][]) null;
        field_g = null;
        field_i = null;
        field_a = null;
        field_f = null;
        if (!param0) {
          field_b = null;
          field_h = null;
          return;
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ck var8 = null;
        try {
          var6_int = param1 + param4.field_u;
          var7 = param4.field_D + param2;
          ke.a(var6_int, var7, param4.field_t, param4.field_y, (byte) 101);
          var8 = tl.field_u[1];
          if (param4 instanceof ek &&
            ((ek) (param4)).field_H) {
            var8.f((param4.field_t - var8.field_K >> 1) + var6_int + 1, 1 + var7 + (param4.field_y - var8.field_C >> 1), 256);
          }
          if (param4.a(true)) {
            kd.a(-4 + param4.field_t, 2 + var6_int, (byte) 124, 2 + var7, param4.field_y - 4);
          }
          if (param3 < -60) {
            return;
          }
          tg.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("tg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        md.a(9, 11, cd.field_m.e(102));
        wk.field_i = true;
        if (param0 >= -2) {
          field_i = (w) null;
        }
    }

    final static ck a(boolean param0, int param1) {
        if (!param0) {
          return (ck) null;
        }
        return ik.field_b[param1][(12 & uf.field_A) >> 2];
    }

    static {
        field_d = new String[][]{new String[]{"Standard", "Large"}, new String[]{"Slow", "Medium", "Fast", "Maximum", "Panic!"}, new String[]{"3", "4", "5", "6", "7"}, new String[]{"None", "W/cards", "+Drills", "+Bombs", "All"}, new String[]{"Level 1", "Level 2", "Level 3", "Off"}};
    }
}
