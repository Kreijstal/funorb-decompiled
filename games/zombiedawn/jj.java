/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends fb {
    static String[] field_G;
    static int[] field_H;
    private int field_K;
    private int field_F;
    private int field_E;
    static String field_J;
    static vo field_D;
    private int field_I;

    public static void j(int param0) {
        field_G = null;
        field_H = null;
        field_D = null;
        field_J = null;
        if (param0 != 2021978896) {
            field_G = null;
        }
    }

    final void g(int param0) {
        if (param0 < 95) {
          ((jj) this).field_E = -11;
          ((jj) this).field_y = (((jj) this).field_F << 16) - -(4 * fb.a(1311979239, ac.field_m << 5));
          ((jj) this).field_x = (((jj) this).field_E << 16) + rd.a(true, ac.field_m << 6) * 4;
          return;
        } else {
          ((jj) this).field_y = (((jj) this).field_F << 16) - -(4 * fb.a(1311979239, ac.field_m << 5));
          ((jj) this).field_x = (((jj) this).field_E << 16) + rd.a(true, ac.field_m << 6) * 4;
          return;
        }
    }

    final void a(byte param0, wk param1) {
        int var3_int = param1.a(((jj) this).field_y >> 16, (byte) -88);
        int var4 = param1.a(((jj) this).field_x >> 16, 0) + -lc.field_k[0].field_t;
        if (param0 > -76) {
            return;
        }
        try {
            if (((jj) this).field_K < ((jj) this).field_I) {
                ((jj) this).field_K = ((jj) this).field_K + 6;
            }
            lc.field_k[0].e(var3_int, var4, ((jj) this).field_K);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "jj.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static al c(int param0, int param1) {
        if (param1 < 72) {
            field_J = null;
            return qk.field_Jb[param0];
        }
        return qk.field_Jb[param0];
    }

    jj(int param0, int param1) {
        super(param0, param1, 0);
        ((jj) this).field_I = 48;
        ((jj) this).field_K = 0;
        ((jj) this).field_F = -100 + hp.field_A.a(true);
        ((jj) this).field_E = hp.field_A.f(237239984) + 40;
    }

    final static String i(int param0) {
        return fj.field_g.a(true);
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawn.field_J;
        try {
          L0: {
            wk.field_o = new vn(512, 512);
            wk.field_o.a();
            var1_int = 256;
            L1: while (true) {
              if (var1_int <= 0) {
                L2: {
                  if (param0) {
                    jj.j(115);
                    cn.field_f.b(109);
                    break L2;
                  } else {
                    cn.field_f.b(109);
                    break L2;
                  }
                }
                break L0;
              } else {
                bi.g(256, 256, var1_int, -var1_int + 256);
                var1_int--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "jj.G(" + param0 + 41);
        }
    }

    final static String a(int param0, int param1, de param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        Object var6 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          try {
            L0: {
              var3_int = param2.c((byte) -107);
              if (param0 < var3_int) {
                var3_int = param0;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              var4 = new byte[var3_int];
              param2.field_j = param2.field_j + pi.field_l.a(param2.field_h, 0, var3_int, param1 ^ -28649, param2.field_j, var4);
              if (param1 == -23171) {
                break L1;
              } else {
                var6 = null;
                String discarded$2 = jj.a(57, -111, (de) null);
                break L1;
              }
            }
            var5 = fa.a(var4, var3_int, 0, -78);
            stackOut_5_0 = (String) var5;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_7_0 = "Cabbage";
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("jj.D(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_J = "Passwords must be between 5 and 20 letters and numbers";
        field_D = new vo();
    }
}
