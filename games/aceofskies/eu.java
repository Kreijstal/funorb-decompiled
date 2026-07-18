/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eu extends o {
    static String field_k;
    md field_i;
    int field_h;
    static int field_g;
    static String field_j;

    public eu() {
        super(new kc());
    }

    final void a(int param0, int param1, double param2, md param3) {
        try {
            ((eu) this).field_i = param3;
            ((eu) this).field_d.a(((eu) this).field_i.field_d, true);
            ((eu) this).field_b = 20.0;
            ((eu) this).field_h = 64;
            ((eu) this).field_f = param1;
            ((eu) this).field_e = ((eu) this).field_i.field_e;
            ((eu) this).a((byte) 111, (double)param0);
            ((eu) this).a(param2, (byte) 25);
            ((eu) this).b(24.0, 128);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "eu.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b() {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == vs.field_g) {
                break L0;
              } else {
                try {
                  L1: {
                    vs.field_g.a(true, 0L);
                    vs.field_g.a(24, nm.field_c.field_f, nm.field_c.field_g, -105);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  nm.field_c.field_g = nm.field_c.field_g + 24;
                  return;
                } else {
                  break L0;
                }
              }
            }
            nm.field_c.field_g = nm.field_c.field_g + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, boolean param2) {
        int var3 = -50 % ((-21 - param0) / 51);
        ec.field_t = 0;
        ci.field_d = param1;
        if (!(ci.field_d < 0)) {
            aa.field_b[ci.field_d].a(param2, 1);
        }
    }

    public static void c(int param0) {
        if (param0 != 24) {
            eu.c(111);
            field_j = null;
            field_k = null;
            return;
        }
        field_j = null;
        field_k = null;
    }

    final static byte[] a(byte[] param0, int param1, byte param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var6 = new byte[32768];
            var4 = var6;
            var5 = -38;
            au.a(param0, param3, var6, 0, 32768);
            stackOut_0_0 = (byte[]) var6;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("eu.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 32768 + ',' + 20 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            qm.a(ft.field_o, (byte) -31, op.field_a, true, param0, os.field_w, 0);
            var2_int = 0;
            L1: while (true) {
              if (os.field_w <= var2_int) {
                qm.a(fj.field_d, (byte) -52, nh.field_a, false, param0 + param0, os.field_w + param0, param0);
                if (param0 >= os.field_w) {
                  break L0;
                } else {
                  os.field_w = param0;
                  return;
                }
              } else {
                uf.field_d[param0 + var2_int] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "eu.J(" + param0 + ',' + true + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_j = "Back";
    }
}
