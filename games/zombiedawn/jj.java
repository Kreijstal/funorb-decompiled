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
          ((jj) this).field_y = (((jj) this).field_F << 2021978896) - -(4 * fb.a(1311979239, ac.field_m << 1125936485));
          ((jj) this).field_x = (((jj) this).field_E << -1668414160) + rd.a(true, ac.field_m << -2116884826) * 4;
          return;
        } else {
          ((jj) this).field_y = (((jj) this).field_F << 2021978896) - -(4 * fb.a(1311979239, ac.field_m << 1125936485));
          ((jj) this).field_x = (((jj) this).field_E << -1668414160) + rd.a(true, ac.field_m << -2116884826) * 4;
          return;
        }
    }

    final void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        var3 = param1.a(((jj) this).field_y >> 976646032, (byte) -88);
        var4 = param1.a(((jj) this).field_x >> -1335165296, 0) + -lc.field_k[0].field_t;
        if (param0 <= -76) {
          if (((jj) this).field_K < ((jj) this).field_I) {
            ((jj) this).field_K = ((jj) this).field_K + 6;
            lc.field_k[0].e(var3, var4, ((jj) this).field_K);
            return;
          } else {
            lc.field_k[0].e(var3, var4, ((jj) this).field_K);
            return;
          }
        } else {
          return;
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
        if (param0 < 93) {
            field_G = null;
            return fj.field_g.a(true);
        }
        return fj.field_g.a(true);
    }

    final static void b(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = ZombieDawn.field_J;
        wk.field_o = new vn(512, 512);
        wk.field_o.a();
        var1 = 256;
        L0: while (true) {
          if ((var1 ^ -1) >= -1) {
            if (param0) {
              jj.j(115);
              cn.field_f.b(109);
              return;
            } else {
              cn.field_f.b(109);
              return;
            }
          } else {
            bi.g(256, 256, var1, -var1 + 256);
            var1--;
            continue L0;
          }
        }
    }

    final static String a(int param0, int param1, de param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        Object var6 = null;
        String stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
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
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_6_0;
        }
        return null;
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
