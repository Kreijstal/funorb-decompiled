/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    static String field_a;
    static String field_b;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          if (param2 < 85) {
            stackIn_3_0 = -18;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = rb.field_H;
          while (var3_int < fb.field_d.length) {
            var5 = m.field_c[var3_int];
            if (0 > var5) {
              var4 = var4 + cm.field_f;
            } else {
              var6 = se.a(3, fb.field_d[var3_int], true);
              var7 = af.field_b - (var6 >> 1);
              var4 = var4 + id.field_c;
              if (lh.a(var4, hb.field_t + (ge.field_h << 1), var6 + (ae.field_c << 1), true, var7 - ae.field_c, param0, param1)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + ((ge.field_h << 1) - (-id.field_c - hb.field_t));
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var3), "bg.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        hi var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (11 == bh.field_t) {
            pl.d(64);
          }
          se.a(qj.field_I, (byte) 121, rj.field_m, wa.field_l);
          be.a(0, param1, (byte) -68, 0);
          if (param0 >= -12) {
            var3 = (hi) null;
            bg.a((hi) null, 112, 66);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("bg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -120) {
          bg.a((byte) 91);
        }
    }

    final static dd[] a(String param0, rh param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dd[] stackIn_2_0 = null;
        dd[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 7) {
            stackIn_2_0 = (dd[]) null;
            return stackIn_2_0;
          }
          var4_int = param1.a(param3, (byte) -100);
          var5 = param1.a(param0, (byte) -15, var4_int);
          stackIn_4_0 = w.a(-37, var5, var4_int, param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("bg.B(");
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static mk a(byte param0) {
        if (cb.field_v == ql.field_l) {
          throw new IllegalStateException();
        }
        if (ui.field_ob == cb.field_v) {
          cb.field_v = ql.field_l;
          return rl.field_b;
        }
        if (param0 == 56) {
          return null;
        }
        hi var2 = (hi) null;
        bg.a((hi) null, -4, -17);
        return null;
    }

    final static void a(hi param0, int param1, int param2) {
        bf.field_e.a(false, param0);
        if (param2 > -37) {
          return;
        }
        try {
          sc.a(param1, param0, 1);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "bg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Checking";
        field_a = "Please check if address is correct";
    }
}
