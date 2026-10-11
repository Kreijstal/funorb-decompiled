/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn {
    static String field_e;
    static int field_c;
    static String field_a;
    static String field_d;
    static int[] field_b;

    final static as a(int param0, mg param1) {
        as var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        as stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new as(param1);
          var3 = -54 % ((-34 - param0) / 45);
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("qn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void a(ik[] param0, int param1, boolean param2) {
        try {
          bj.k(26987);
          bk.a(param0, 0);
          if (!param2) {
            field_c = -118;
          }
          vp.c(-20677, param1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "qn.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        hd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (cb.field_h == null) {
            return;
          }
          var1 = (hd) (cb.field_h.d(0));
          var2 = (int)ra.field_e + 20;
          var3 = 20;
          var4 = 63 % ((param0 + 56) / 39);
          while (var1 != null) {
            if (var1.field_h < 0) {
              var2 = var2 + var1.field_i.field_w;
              var1 = (hd) (cb.field_h.a((byte) -71));
              continue;
            }
            if (230 > var1.field_h) {
              wc.a(-27030, var1.field_h << 4, var3, var1.field_i, var2, 256);
            } else {
              if (var1.field_h >= 250) {
                var5 = -(5 * var1.field_h) + 1500;
                wc.a(-27030, var1.field_h << 4, -3 + var3, var1.field_o, var2 - 3, var5);
                wc.a(-27030, var1.field_h << 4, var3, var1.field_i, var2, var5);
              } else {
                wc.a(-27030, var1.field_h << 4, -3 + var3, var1.field_o, var2 - 3, -2760 + 12 * var1.field_h);
                wc.a(-27030, var1.field_h << 4, var3, var1.field_i, var2, 256);
              }
            }
            var2 = var2 + var1.field_i.field_w;
            var1 = (hd) (cb.field_h.a((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "qn.D(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < 82) {
          return;
        }
        try {
          for (var1_int = 0; var1_int < da.field_g; var1_int++) {
            wm.field_d[var1_int] = null;
          }
          da.field_g = 0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "qn.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 != -989994556) {
          field_d = (String) null;
        }
    }

    static {
        field_c = 0;
        field_e = "Create";
        field_d = " and ";
        field_a = "Join";
        field_b = new int[4];
    }
}
