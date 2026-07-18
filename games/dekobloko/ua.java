/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends vi {
    static String field_D;
    static long field_B;
    static w field_H;
    static String field_C;
    static int[] field_E;
    static String field_G;
    private Object field_F;

    final static String a(CharSequence param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var2 = cf.a(0, ab.a(117, param0));
            L1: {
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_5_0 = (String) var2;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("ua.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + true + ')');
        }
        return stackIn_6_0;
    }

    final Object c(int param0) {
        if (param0 != -1) {
            field_E = null;
            return ((ua) this).field_F;
        }
        return ((ua) this).field_F;
    }

    final static void h() {
        if (gd.field_e != 0 - sh.field_i) {
          if (gd.field_e != -sh.field_i + 250) {
            gd.field_e = gd.field_e + 1;
            return;
          } else {
            gd.field_e = gd.field_e + 1;
            return;
          }
        } else {
          gd.field_e = gd.field_e + 1;
          return;
        }
    }

    final static void a(int param0, ji param1, boolean param2, ji param3) {
        try {
            re.a(fc.field_c, df.field_ab, field_H, rd.field_a, sg.field_e, true, wa.field_a, db.field_c, (mm) (Object) nf.field_d, oh.field_i, (byte) 103, tm.field_b);
            ef.field_O = bj.a(112, param1, "lobby", "chatfilter");
            sg.field_a[2] = mc.field_d;
            sg.field_a[0] = qj.field_g;
            sg.field_a[1] = al.field_a;
            jh.a((byte) 116, (mm) (Object) tg.field_a, param3);
            int var4_int = -74;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ua.D(" + 46 + ',' + (param1 != null ? "{...}" : "null") + ',' + true + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(long param0, int param1) {
        if (param1 <= -127) {
          if (param0 <= 0L) {
            return;
          } else {
            if (0L != param0 % 10L) {
              qe.a(param0, -111);
              return;
            } else {
              qe.a(-1L + param0, -124);
              qe.a(1L, -109);
              return;
            }
          }
        } else {
          field_H = null;
          if (param0 <= 0L) {
            return;
          } else {
            if (0L != param0 % 10L) {
              qe.a(param0, -111);
              return;
            } else {
              qe.a(-1L + param0, -124);
              qe.a(1L, -109);
              return;
            }
          }
        }
    }

    final static void i() {
        ug dupTemp$0 = (ug) (Object) qi.field_Q.c((byte) -121);
        ug var4 = dupTemp$0;
        ug var1 = dupTemp$0;
        int var2 = 0;
        if (!(var4 != null)) {
            si.a(66);
            return;
        }
        uf var3 = de.field_V;
        int discarded$1 = var3.i(7553);
        int discarded$2 = var3.i(7553);
        int discarded$3 = var3.i(7553);
        int discarded$4 = var3.i(7553);
        var4.b((byte) 124);
    }

    final boolean g(byte param0) {
        if (param0 != -83) {
            field_C = null;
            return false;
        }
        return false;
    }

    ua(Object param0, int param1) {
        super(param1);
        try {
            ((ua) this).field_F = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void e() {
        field_G = null;
        field_H = null;
        field_D = null;
        field_C = null;
        field_E = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new int[8];
        field_D = "WELL DONE!";
        field_G = "Login: ";
        field_C = "Type your password again to make sure it's correct";
    }
}
