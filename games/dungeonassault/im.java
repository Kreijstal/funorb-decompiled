/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im implements ca {
    private int field_g;
    private int field_c;
    private int field_f;
    static String field_l;
    private int field_i;
    static boolean field_a;
    static volatile boolean field_d;
    private int field_k;
    private se field_j;
    static cn field_m;
    static me field_b;
    private int field_h;
    static cn field_e;

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        int var10 = 0;
        lm stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        eb var12 = null;
        var11 = DungeonAssault.field_K;
        try {
          if (param1 instanceof eb) {
            stackIn_4_0 = (lm) (param1);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (eb) (stackIn_4_0);
          gf.b(param1.field_q + param2, param3 + param1.field_v, param1.field_x, param1.field_s, this.field_k);
          if (var12 != null) {
          }
          var7 = param1.field_x - var12.field_J * 2;
          if (param0 != 34) {
            this.field_c = 108;
          }
          var8 = var12.field_J + (param2 + param1.field_q);
          var9 = var12.field_N + param1.field_v + param3;
          gf.c(var8, var9, var7 + var8, var9, this.field_h);
          for (var10 = -1 + var12.i(97); var10 >= 0; var10--) {
            gf.f(var8 + var7 * var12.a(-1, var10) / var12.a(-116), var9, this.field_f, this.field_i);
          }
          if (this.field_j == null) {
            return;
          }
          this.field_j.c(var12.field_w, var7 / 2 + var8, this.field_j.field_R + var9 + var12.field_N, this.field_c, this.field_g);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("im.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_m = null;
        field_b = null;
        field_l = null;
        field_e = null;
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.addMouseListener(ib.field_f);
          param0.addMouseMotionListener(ib.field_f);
          param0.addFocusListener(ib.field_f);
          int var2_int = -53 % ((param1 - 30) / 59);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "im.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    im(se param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_g = param2;
          this.field_c = param1;
          this.field_h = param3;
          this.field_k = param4;
          this.field_j = param0;
          this.field_f = param5;
          this.field_i = param6;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_l = "Unfortunately you are not eligible to create an account.";
        field_d = true;
    }
}
