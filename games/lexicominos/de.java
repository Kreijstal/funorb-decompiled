/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends RuntimeException {
    String field_a;
    Throwable field_c;
    static hk field_b;

    final static void a(db param0, int param1) {
        try {
            if (param1 != 6) {
                field_b = (hk) null;
            }
            ja.b((byte) -111);
            lf.a(param0.field_y, param0.field_r, param0.field_x);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "de.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, sh param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        pk var5 = null;
        int[] var6 = null;
        int var7 = 0;
        th var8 = null;
        th var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var8 = new th(param1.a((byte) 127, "", "logo.fo3d"));
            var9 = var8;
            var3 = var9.d(true);
            var9.e(10);
            sh.field_d = cl.a(var9, -121);
            uj.field_f = new int[var3][];
            ae.field_J = new pk[var3];
            var4 = 0;
            L1: while (true) {
              L2: {
                if (var4 >= var3) {
                  var9.f(8);
                  break L2;
                } else {
                  ae.field_J[var4] = tb.a(var8, dg.a(param0, -114));
                  var4++;
                  if (var7 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              var4 = param0;
              L3: while (true) {
                if (var3 <= var4) {
                  break L0;
                } else {
                  var5 = ae.field_J[var4];
                  var5.a(6, 6, (byte) 52, 1, 6);
                  var5.a((byte) -50);
                  var6 = new int[]{var5.field_v + var5.field_m >> -1501649279, var5.field_M + var5.field_G >> -176702207, var5.field_F + var5.field_O >> -20484031};
                  uj.field_f[var4] = var6;
                  var5.a(-var6[2], -var6[1], false, -var6[0]);
                  var4++;
                  if (var7 == 0) {
                    continue L3;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("de.B(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static void a(boolean param0, float param1, String param2, boolean param3) {
        try {
            if (null == qj.field_fb) {
                qj.field_fb = new uk(ug.field_A, jj.field_d);
                ug.field_A.a(-14579, qj.field_fb);
            }
            qj.field_fb.a(param0, param2, 125, param1);
            lf.a();
            we.a((byte) -65, param3);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "de.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 6) {
            return;
        }
        field_b = null;
    }

    de(Throwable param0, String param1) {
        this.field_a = param1;
        this.field_c = param0;
    }

    static {
    }
}
