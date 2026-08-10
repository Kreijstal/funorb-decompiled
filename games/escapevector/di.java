/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    String field_a;
    static d field_g;
    static wc field_d;
    static String field_f;
    String field_h;
    static String field_b;
    static String field_c;
    boolean field_e;

    final static void a(int param0) {
        L0: {
          ri.a(param0 ^ -25124);
          if (null != of.field_d) {
            bo.a(of.field_d, (byte) 118);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 1) {
          re.d(2);
          lb.c(true);
          ac.d(-16802);
          if (rn.a(-31879)) {
            om.field_c.a(1, true);
            rn.a(0, 30785);
            nm.a(16);
            return;
          } else {
            nm.a(16);
            return;
          }
        } else {
          field_c = (String) null;
          re.d(2);
          lb.c(true);
          ac.d(-16802);
          if (!rn.a(-31879)) {
            nm.a(16);
            return;
          } else {
            om.field_c.a(1, true);
            rn.a(0, 30785);
            nm.a(16);
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ll var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 < -75) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var4 = (ll) ((Object) jl.field_n.a(false));
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                ma.a(-109, param1, var4);
                var4 = (ll) ((Object) jl.field_n.b((byte) 70));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "di.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_d = null;
        if (param0 != 0) {
          field_b = (String) null;
          field_g = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_g = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static void a(ed[] param0, int param1, int param2, int param3, int param4, int param5, wl param6, int param7, ed[] param8, boolean param9, int param10, int param11, wl param12, byte param13, int param14) {
        try {
            ed[] var16 = (ed[]) null;
            ti.a(param8, param10, param1, param5, param11, 480, 0, param4, param3, lh.field_e, param12, pc.field_d, param2, param7, (ed[]) null, 2, param14, 0, gd.field_X, param6, param0);
            sm.a(false, param9);
            if (param13 > -5) {
                field_g = (d) null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "di.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ',' + (param12 != null ? "{...}" : "null") + ',' + param13 + ',' + param14 + ')');
        }
    }

    static {
        field_b = "Fuel: ";
        field_c = "Warning! Auto-destruct timer initiated! Escape!";
    }
}
