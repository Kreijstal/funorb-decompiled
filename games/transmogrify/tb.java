/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static int field_a;
    static kg field_c;
    static ti field_e;
    static int[] field_d;
    static ti[] field_b;

    final static void a(kk param0, int param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        Object var8 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              mf.field_c[0] = d.field_c.nextInt();
              mf.field_c[1] = d.field_c.nextInt();
              mf.field_c[3] = (int)fd.field_g;
              mf.field_c[2] = (int)(fd.field_g >> 32);
              d.field_d.field_h = 0;
              d.field_d.a(-96, mf.field_c[0]);
              d.field_d.a(-124, mf.field_c[1]);
              d.field_d.a(-105, mf.field_c[2]);
              d.field_d.a(-103, mf.field_c[3]);
              gb.a(d.field_d, true);
              d.field_d.c(param1, -159688920);
              param0.a((byte) -115, d.field_d);
              ff.field_D.field_h = 0;
              if (param3) {
                ff.field_D.f(6389, 18);
                break L1;
              } else {
                ff.field_D.f(6389, 16);
                break L1;
              }
            }
            L2: {
              ff.field_D.field_h = ff.field_D.field_h + 2;
              var5_int = ff.field_D.field_h;
              ff.field_D.a(-102, cl.field_w);
              ff.field_D.b(1908720528, qb.field_k);
              var6 = 0;
              if (wd.field_g) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (kc.field_D) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2) {
                var6 = var6 | 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == e.field_I) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              if (param4 >= 25) {
                break L6;
              } else {
                var8 = null;
                tb.a((kk) null, -124, true, true, 31);
                break L6;
              }
            }
            L7: {
              ff.field_D.f(6389, var6);
              var7 = wk.a(ha.b(99), (byte) -45);
              if (var7 == null) {
                var7 = "";
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              ff.field_D.a(-116, var7);
              if (e.field_I == null) {
                break L8;
              } else {
                ff.field_D.a(e.field_I, 127);
                break L8;
              }
            }
            bj.a(kb.field_p, q.field_f, (oa) (Object) ff.field_D, (byte) -116, d.field_d);
            ff.field_D.b(-120, ff.field_D.field_h - var5_int);
            rb.a(-1, -377);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("tb.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            fl.field_c = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            hi.a(0, var4, var2, var3, param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "tb.B(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    static {
    }
}
