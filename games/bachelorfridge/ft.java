/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ft extends bw {
    static vr field_h;
    boolean field_f;
    int field_g;

    final static void a(int param0) {
        kt.field_m = new sna(0L, (sna) null);
        if (eaa.field_c) {
          kt.field_m.a(-1, dea.field_m);
        }
        kt.field_m.a(-1, tv.field_o);
        if (param0 == 2048) {
          lia.field_j = new lm(cja.field_r, kt.field_m);
          ng.field_e = new sna(0L, (sna) null);
          ng.field_e.a(-1, lia.field_j.field_a);
          ng.field_e.a(-1, mc.field_g);
          kf.a((byte) -6);
          return;
        }
        ft.a(93);
        lia.field_j = new lm(cja.field_r, kt.field_m);
        ng.field_e = new sna(0L, (sna) null);
        ng.field_e.a(-1, lia.field_j.field_a);
        ng.field_e.a(-1, mc.field_g);
        kf.a((byte) -6);
    }

    final static void c(byte param0) {
        if (qo.field_c) {
          lia.field_i = true;
          int var1 = -76 % ((param0 - 32) / 42);
          gq.a(false, 19626);
          jv.field_j = 0;
          return;
        }
        throw new IllegalStateException();
    }

    private final void a(lu param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_g = param0.f(-95);
          stackIn_3_1 = (param0.b(16711935) != 0);
          this.field_f = stackIn_3_1;
          if (param1 == -26011) {
            return;
          }
          ft.a(-71, (byte) 7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ft.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_h = null;
        int var1 = -81 / ((param0 - 3) / 50);
    }

    final static int a(int param0, byte param1) {
        if (param1 > -127) {
          return -124;
        }
        param0 = param0 & 8191;
        if (4096 <= param0) {
          return param0 >= 6144 ? ed.field_b[param0 - 6144] : -ed.field_b[6144 - param0];
        }
        return 2048 > param0 ? ed.field_b[2048 - param0] : -ed.field_b[-2048 + param0];
    }

    ft(lu param0) {
        try {
          this.a(param0, -26011);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ft.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
