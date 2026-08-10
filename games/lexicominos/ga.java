/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static int field_c;
    static String field_b;
    static sh field_a;

    final static void a(nc param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        th var7 = ed.field_q;
        th var8 = var7;
        if (param2 <= 71) {
            return;
        }
        try {
            var8.h(param1, 0);
            var8.field_h = var8.field_h + 1;
            var4 = var8.field_h;
            var8.c(1, -1);
            var8.e(96, param0.field_j);
            var8.e(105, param0.field_k);
            var8.e(111, param0.field_l);
            var8.f(param0.field_i, -32287);
            var8.f(param0.field_q, -32287);
            var8.f(param0.field_o, -32287);
            var8.f(param0.field_s, -32287);
            var8.c(param0.field_m.length, -1);
            for (var5 = 0; param0.field_m.length > var5; var5++) {
                var7.f(param0.field_m[var5], -32287);
            }
            var8.a(var4, (byte) 29);
            var8.d(-var4 + var8.field_h, (byte) -124);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ga.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-11 >= (wf.field_i ^ -1)) {
                if (og.a(23440)) {
                  if (-1 != (ta.field_g ^ -1)) {
                    uj.a(param0 + -126, param2);
                    break L1;
                  } else {
                    tg.a(param1, false, param0 + 49);
                    lj.a(0, param2, 0, (byte) -128);
                    break L1;
                  }
                } else {
                  lf.a();
                  ra.a(320, 150, 240);
                  lj.a(0, param2, 0, (byte) -128);
                  break L1;
                }
              } else {
                L2: {
                  var3_int = 0;
                  if (dl.field_b) {
                    dl.field_b = false;
                    var3_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                hd.a(aa.a((byte) 92), (byte) -90, ik.a((byte) 94), var3_int != 0, te.field_E);
                break L1;
              }
            }
            if (param0 == 57) {
              break L0;
            } else {
              field_b = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("ga.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        di.field_x.b(123, new mh());
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            java.awt.Canvas var2 = (java.awt.Canvas) null;
            ga.a((byte) -81, true, (java.awt.Canvas) null);
        }
    }

    static {
        field_c = 0;
        field_b = "GAME OVER";
    }
}
