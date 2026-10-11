/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    static String field_f;
    static char field_d;
    static int[] field_b;
    static String field_c;
    static double field_a;
    static ba field_e;

    final static void a(kd param0, int param1, boolean param2, int param3, boolean param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          pl.field_a[0] = ta.field_c.nextInt();
          pl.field_a[1] = ta.field_c.nextInt();
          pl.field_a[3] = (int)h.field_d;
          pl.field_a[2] = (int)(h.field_d >> 32);
          ui.field_p.field_k = 0;
          ui.field_p.b(false, pl.field_a[0]);
          ui.field_p.b(false, pl.field_a[1]);
          ui.field_p.b(false, pl.field_a[2]);
          ui.field_p.b(false, pl.field_a[3]);
          vd.a(ui.field_p, (byte) -69);
          ui.field_p.b(param1, (byte) -124);
          param0.a((byte) -6, ui.field_p);
          ra.field_C.field_k = 0;
          if (!param2) {
            ra.field_C.a(16, (byte) -96);
          } else {
            ra.field_C.a(18, (byte) -105);
          }
          ra.field_C.field_k = ra.field_C.field_k + 2;
          var5_int = ra.field_C.field_k;
          ra.field_C.b(false, db.field_Z);
          ra.field_C.a(sb.field_a, 2147483647);
          var6 = 0;
          if (oc.field_i) {
            var6 = var6 | 1;
          }
          if (mk.field_c) {
            var6 = var6 | 4;
          }
          if (param4) {
            var6 = var6 | 8;
          }
          if (kg.field_a != null) {
            var6 = var6 | 16;
          }
          ra.field_C.a(var6, (byte) -77);
          var7 = bg.a(gd.b((byte) 77), -22004);
          if (var7 == null) {
            var7 = "";
          }
          ra.field_C.a((byte) -57, var7);
          if (null != kg.field_a) {
            ra.field_C.b(kg.field_a, 126);
          }
          ee.a(sc.field_d, ra.field_C, fj.field_N, ~param3, ui.field_p);
          ra.field_C.c(ra.field_C.field_k - var5_int, (byte) -96);
          me.a(param3, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("md.B(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, cf param1, int param2) {
        la var6 = null;
        int var5 = 0;
        try {
          var6 = ra.field_C;
          var6.c(param0, 7);
          int var4 = 81 / ((-12 - param2) / 48);
          var6.field_k = var6.field_k + 1;
          var5 = var6.field_k;
          var6.a(1, (byte) -87);
          var6.a(param1.field_j, (byte) -91);
          var6.a(param1.field_k, (byte) -77);
          var6.b(false, param1.field_i);
          var6.b(false, param1.field_n);
          var6.b(false, param1.field_l);
          var6.b(false, param1.field_o);
          var6.a(var5, false);
          var6.a(true, -var5 + var6.field_k);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "md.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0) {
          kd var2 = (kd) null;
          md.a((kd) null, -5, false, 89, true);
        }
    }

    static {
        field_b = new int[128];
        field_c = "To Customer Support";
        field_f = "Create a free Account";
        field_a = Math.atan2(1.0, 0.0);
        field_e = new ba();
    }
}
