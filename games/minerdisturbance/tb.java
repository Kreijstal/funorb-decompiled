/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb implements uj {
    static String field_b;
    static int field_c;
    static hn field_d;
    static int field_h;
    static boolean field_e;
    static int field_a;
    static String field_g;
    static int field_f;

    public final void a(boolean param0) {
        if (param0) {
          field_d = (hn) null;
          gd.field_x = 2;
          field_a = 1;
          return;
        }
        gd.field_x = 2;
        field_a = 1;
    }

    final static id a(boolean param0, int param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ld var8 = null;
        fc var9 = null;
        var7 = MinerDisturbance.field_ab;
        var8 = kj.field_a;
        var3 = var8.d((byte) -54);
        pf.field_i = var3 & 127;
        stackIn_3_0 = ((128 & var3) != 0);
        sa.field_u = stackIn_3_0;
        mk.field_a = var8.d((byte) -54);
        il.field_v = var8.h(param1 + 120);
        if (pf.field_i == 2) {
          pl.field_c = var8.e(param1 ^ 32);
          ig.field_e = var8.i(3);
        } else {
          pl.field_c = 0;
          ig.field_e = 0;
        }
        stackIn_9_0 = (var8.d((byte) -54) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        lm.field_L = var8.a(false);
        if (var4 == 0) {
          vd.field_x = lm.field_L;
        } else {
          vd.field_x = var8.a(false);
        }
        if (~pf.field_i == param1) {
          var8.e(-76);
          var8.a(false);
        } else {
          if (pf.field_i == 4) {
            var8.e(-76);
            var8.a(false);
          }
        }
        if (!param0) {
          bf.field_c = dl.a(var8, 80, -27898);
          pi.field_l = null;
          return new id(param0);
        }
        var5 = var8.e(param1 ^ 50);
        try {
          var9 = lf.field_b.a(param1 ^ -25461, var5);
          bf.field_c = var9.f(1);
          if (vd.field_x.equals(ti.field_J)) {
            stackIn_22_0 = null;
          } else {
            stackIn_22_0 = var9.field_y;
          }
          pi.field_l = stackIn_22_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          di.a((Throwable) ((Object) var6), 1, "CC1");
          bf.field_c = null;
          pi.field_l = null;
          return new id(param0);
        }
        return new id(param0);
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != 127) {
          return;
        }
        field_g = null;
    }

    public final String a(byte param0) {
        int var2 = -97 % ((-33 - param0) / 62);
        return "Make Ore Gold";
    }

    final static ln[] a(String param0, String param1, bj param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ln[] stackIn_2_0 = null;
        ln[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a(125, param1);
          if (param3 != 1) {
            stackIn_2_0 = (ln[]) null;
            return stackIn_2_0;
          }
          var5 = param2.a(param0, var4_int, -120);
          stackIn_4_0 = ek.a(var4_int, param2, param3 ^ 20838, var5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("tb.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = "Accept";
        field_e = true;
        field_g = "Shaft: Pre-excavated shaft.";
        field_d = null;
    }
}
