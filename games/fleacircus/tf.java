/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends dk {
    int field_F;
    static ob field_H;
    static vc field_E;
    static ob field_G;

    tf(qa param0) {
        super(param0.field_y, param0.field_z, param0.field_u, param0.field_j, (ch) null, (kd) null);
        param0.a(0, ((tf) this).field_u, 0, ((tf) this).field_j, 80);
        ((tf) this).field_A = param0;
        ((tf) this).field_F = 256;
    }

    public tf() {
        super(0, 0, 0, 0, (ch) null, (kd) null);
        ((tf) this).field_F = 256;
    }

    final static String a(ni param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        try {
          L0: {
            var3_int = param0.d(-13583);
            if (var3_int <= param2) {
              break L0;
            } else {
              var3_int = param2;
              break L0;
            }
          }
          var4 = new byte[var3_int];
          param0.field_i = param0.field_i + qg.field_e.a(param0.field_k, param0.field_i, 0, var3_int, var4, param1 + -1);
          var5 = pg.a(var3_int, 0, var4, param1);
          stackOut_2_0 = (String) var5;
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return null;
    }

    public static void i(int param0) {
        field_G = null;
        field_H = null;
        field_E = null;
        if (param0 == 0) {
            return;
        }
        Object var2 = null;
        String discarded$0 = tf.a((ni) null, 24, -4);
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        if (!(((tf) this).field_A != null)) {
            return;
        }
        if (((tf) this).field_F == -1) {
            return;
        }
        if (!(-257 != ((tf) this).field_F)) {
            ((tf) this).field_A.b(((tf) this).field_z + param0, ((tf) this).field_y + param1, true, param3);
            return;
        }
        dd var6 = new dd(((tf) this).field_A.field_u, ((tf) this).field_A.field_j);
        r.a(var6, 45);
        ((tf) this).field_A.b(0, 0, param2, param3);
        ia.a(-107);
        var6.c(((tf) this).field_y + param1, param0 + ((tf) this).field_z, ((tf) this).field_F);
    }

    final static byte[] a(int param0, String param1) {
        if (param0 != 0) {
            field_G = null;
            return em.field_c.a(0, param1, "");
        }
        return em.field_c.a(0, param1, "");
    }

    final static void d(boolean param0) {
        L0: {
          if (nb.field_a != null) {
            nb.field_a.k(-110);
            break L0;
          } else {
            break L0;
          }
        }
        if (em.field_g == null) {
          if (!param0) {
            field_H = null;
            bc.s(-33);
            return;
          } else {
            bc.s(-33);
            return;
          }
        } else {
          em.field_g.n(100);
          if (param0) {
            bc.s(-33);
            return;
          } else {
            field_H = null;
            bc.s(-33);
            return;
          }
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var3 = 1;
        if (param2 != -2) {
          tf.d(false);
          L0: while (true) {
            if (param1 >= -2) {
              if (1 == param1) {
                return var3 * param0;
              } else {
                return var3;
              }
            } else {
              L1: {
                if (-1 != (1 & param1)) {
                  var3 = var3 * param0;
                  break L1;
                } else {
                  break L1;
                }
              }
              param0 = param0 * param0;
              param1 = param1 >> 1;
              continue L0;
            }
          }
        } else {
          L2: while (true) {
            if (param1 >= -2) {
              if (1 == param1) {
                return var3 * param0;
              } else {
                return var3;
              }
            } else {
              L3: {
                if (-1 != (1 & param1)) {
                  var3 = var3 * param0;
                  break L3;
                } else {
                  break L3;
                }
              }
              param0 = param0 * param0;
              param1 = param1 >> 1;
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new ob();
        field_G = new ob();
    }
}
