/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends ql {
    static String field_n;
    static int field_m;
    static char[] field_g;
    private oc field_f;
    static int[] field_i;
    private v field_h;
    static int field_l;
    static boolean field_k;
    static bd[] field_d;
    static int[] field_e;
    static String field_j;

    final static void g(int param0) {
        ka.field_o = null;
        gg.field_D = null;
        if (param0 >= -56) {
          field_e = null;
          uh.field_j = null;
          p.field_k = null;
          sf.field_U = false;
          return;
        } else {
          uh.field_j = null;
          p.field_k = null;
          sf.field_U = false;
          return;
        }
    }

    final String a(boolean param0) {
        if (param0) {
            ((pk) this).d(90);
            return tc.field_e;
        }
        return tc.field_e;
    }

    final void e(int param0) {
        ((pk) this).field_f = new oc(ln.field_a.field_v[2], ln.field_a.field_v[3]);
        ((pk) this).field_h = new v(ke.field_w, 0, param0);
        ((pk) this).field_h.field_m = Math.min(((pk) this).field_h.field_m, ((pk) this).field_h.field_i.a(((pk) this).field_h.field_k));
        ((pk) this).field_h.field_l = -24 + 24 * ((pk) this).field_f.field_e;
        ((pk) this).field_h.field_a = 1;
        ((pk) this).field_h.field_d = 24 * ((pk) this).field_f.field_g + -120;
        kd.a(0, 1);
        if (6 <= ln.field_a.field_v.length) {
            nh.field_E.a(ln.field_a.field_v[4], 8360, ln.field_a.field_v[5]);
        }
    }

    final static void a(int param0, long param1) {
        try {
            {
                Thread.sleep(param1);
            }
            if (param0 != 207) {
                field_l = -120;
                return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void d(int param0) {
        oc var2 = null;
        var2 = mm.field_m[0].field_j;
        if (param0 != -1) {
          L0: {
            field_i = null;
            pm.field_d = (ln.field_a.field_d + -var2.field_e) * 26 / ln.field_a.field_d;
            if (ih.a(var2, (byte) -109, nh.field_E) < 2) {
              mf.a(false, 2);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            pm.field_d = (ln.field_a.field_d + -var2.field_e) * 26 / ln.field_a.field_d;
            if (ih.a(var2, (byte) -109, nh.field_E) < 2) {
              mf.a(false, 2);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void c(int param0) {
        if (!(om.field_a)) {
            ti.a(226, (byte) 95, 29);
        }
        if (param0 != 0) {
            ((pk) this).d(-102);
            return;
        }
    }

    final static String a(int param0, int param1, vi param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        int var5 = 0;
        String var6 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
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
          try {
            L0: {
              var3_int = param2.f(255);
              if (param0 < var3_int) {
                var3_int = param0;
                break L0;
              } else {
                break L0;
              }
            }
            var4 = new byte[var3_int];
            var5 = 85 % ((71 - param1) / 43);
            param2.field_i = param2.field_i + fj.field_Tb.a(0, param2.field_n, param2.field_i, 17112, var3_int, var4);
            var6 = db.a(var4, 0, (byte) -120, var3_int);
            stackOut_3_0 = (String) var6;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_5_0 = "Cabbage";
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("pk.K(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    public static void h(int param0) {
        field_g = null;
        field_d = null;
        if (param0 != 2) {
          field_d = null;
          field_e = null;
          field_j = null;
          field_i = null;
          field_n = null;
          return;
        } else {
          field_e = null;
          field_j = null;
          field_i = null;
          field_n = null;
          return;
        }
    }

    final void b(byte param0) {
        oc var2 = null;
        int var3 = 0;
        var3 = -118 % ((param0 - -48) / 38);
        var2 = mm.field_m[0].field_j;
        if (1 == ((pk) this).field_h.field_a) {
          if (!((pk) this).field_h.a((byte) -127)) {
            if (var2.field_e < ((pk) this).field_f.field_e) {
              return;
            } else {
              ((pk) this).field_h.field_a = 2;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public pk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_n = "Pick up enough explosive charges to destroy the incursion points.";
        field_l = 4;
        field_j = "Locate the reactor to return power to the lift.";
        field_e = new int[]{272, 272, 558};
    }
}
