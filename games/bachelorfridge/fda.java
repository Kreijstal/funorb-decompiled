/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fda extends pp {
    static java.awt.Frame field_j;
    static kv field_m;
    static vr field_l;
    static qh field_i;
    static vr field_k;

    fda(nq param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "fda.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String[] a(int param0, char param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = BachelorFridge.field_y;
        try {
          if (param0 != -1) {
            fda.b(-55);
          }
          var10 = (CharSequence) ((Object) param2);
          var3_int = tea.a(var10, param1, 50);
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param1 != param2.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = 1 + var8;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("fda.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static int a(int param0) {
        if (param0 != 0) {
          gs var2 = (gs) null;
          fda.a((gs) null, 109);
        }
        return (int)(1000000000L / fe.field_h);
    }

    final static int b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          gja.field_m.a(true, hk.field_e, tq.field_q, param0 ^ 6380);
          gja.field_m.i(0);
          while (kaa.b(127)) {
            gja.field_m.a(dla.field_j, (byte) 7, gf.field_k);
          }
          if (la.field_r != -1) {
            var1_int = la.field_r;
            ep.a(-1, param0 + 8191);
            stackIn_6_0 = var1_int;
            return stackIn_6_0;
          }
          if (eea.field_b) {
            stackIn_10_0 = 3;
            return stackIn_10_0;
          }
          if (kq.field_j == dka.field_G) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!ut.field_m.a(false)) {
            stackIn_17_0 = 1;
            return stackIn_17_0;
          }
          if (param0 != 1) {
            stackIn_20_0 = -103;
            return stackIn_20_0;
          }
          if (kq.field_j != ola.field_p) {
            return -1;
          }
          stackIn_24_0 = 2;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "fda.D(" + param0 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 != 25) {
          field_j = (java.awt.Frame) null;
        }
        field_m = null;
        field_l = null;
        field_i = null;
        field_k = null;
        field_j = null;
    }

    final void a(aga param0, op param1, int param2) {
        aga var4 = this.field_h.a(103, param1);
        if (var4 == null) {
          return;
        }
        try {
          var4.field_A = false;
          var4.j(param2 ^ -98);
          if (param2 != 12) {
            field_l = (vr) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "fda.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(lu param0, byte param1) {
        try {
          er.a(this.field_h, 109, param0);
          int var3_int = -94 % ((param1 - 34) / 58);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "fda.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(gs param0, int param1) {
        int var2_int = 0;
        gs var3 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = BachelorFridge.field_y;
        try {
          if (param0.field_n == null) {
            return;
          }
          if (param1 != 3100) {
            return;
          }
          if (param0.field_m != 0 ||
            param0.field_j != 0) {
            for (var2_int = 0; var2_int < qs.field_n; var2_int++) {
              var3 = kw.field_k[var2_int];
              if (var3.field_p == 2 &&
                var3.field_m == param0.field_m &&
                var3.field_j == param0.field_j) {
                return;
              }
            }
          }
          if (param0.field_o != null) {
            dda.field_l = param0.field_g;
            cp.field_d = param0.field_p;
            w.field_g = param0.field_a;
            fl.field_p = param0.field_o;
          }
          ija.a((byte) -100, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("fda.G(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
