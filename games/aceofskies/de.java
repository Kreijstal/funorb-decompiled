/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de implements ir {
    private hc field_c;
    private int field_d;
    private int field_e;
    private int field_a;
    private int field_g;
    private int field_b;
    private int field_f;
    private int field_h;

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        cn var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var14 = !(param3 instanceof cn) ? null : (cn) (param3);
          vp.b(param3.field_p + param2, param4 + param3.field_h, param3.field_q, param3.field_n, this.field_b);
          if (var14 != null) {
          }
          var7 = param2 + (param3.field_p + var14.field_C);
          var8 = param4 + param3.field_h + var14.field_x;
          vp.g(var7, var8, var14.field_A, this.field_g);
          if (var14.field_B != -1) {
            var9 = 3.141592653589793 * (double)var14.field_B * 2.0 / (double)var14.field_w;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_A);
            var12 = (int)(Math.cos(var9) * (double)var14.field_A);
            vp.g(var7 + var11, var8 + var12, 1, this.field_f);
          }
          vp.g(var7, var8, 2, 1);
          var9Lifetime1 = 2.0 * ((double)var14.field_y * 3.141592653589793) / (double)var14.field_w;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_A);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_A);
          vp.f(var7, var8, var7 + var11Lifetime1, var12Lifetime1 + var8, 1);
          if (param1 != -7592) {
            this.field_e = 72;
          }
          if (this.field_c != null) {
            var13 = var14.field_C + var14.field_A + this.field_d;
            this.field_c.a(param3.field_f, param2 + param3.field_p + var13, param3.field_h + param4 + this.field_h, param3.field_q - var13 - this.field_d, -(this.field_d << 1) + param3.field_n, this.field_a, this.field_e, 1, 1, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "de.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(java.awt.Component param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.addMouseListener(ho.field_b);
          param0.addMouseMotionListener(ho.field_b);
          param0.addFocusListener(ho.field_b);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("de.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 92) {
            stackIn_3_0 = -79;
            return stackIn_3_0;
          }
          vn.field_f.a(pd.field_b, true, qe.field_k, true);
          vn.field_f.f((byte) -117);
          while (ek.a((byte) -127)) {
            vn.field_f.a(param0 - 42, fr.field_e, bk.field_f);
          }
          if (-1 != dh.field_c) {
            var1_int = dh.field_c;
            oi.a(-1, param0 + 20573);
            stackIn_9_0 = var1_int;
            return stackIn_9_0;
          }
          if (ss.field_t) {
            stackIn_13_0 = 3;
            return stackIn_13_0;
          }
          if (jq.field_fb == nb.field_c) {
            stackIn_17_0 = 1;
            return stackIn_17_0;
          }
          if (!gm.field_x.a(false)) {
            stackIn_20_0 = 1;
            return stackIn_20_0;
          }
          if (jq.field_fb != ht.field_k) {
            stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          stackIn_23_0 = 2;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "de.A(" + param0 + ')');
        }
    }

    de(hc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_h = param2;
          this.field_b = param7;
          this.field_c = param0;
          this.field_e = param4;
          this.field_g = param5;
          this.field_a = param3;
          this.field_f = param6;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "de.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
    }
}
