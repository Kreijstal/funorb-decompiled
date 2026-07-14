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

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        var2 = cf.a(0, ab.a(117, param0));
        if (!param1) {
          return null;
        } else {
          L0: {
            if (var2 == null) {
              var2 = "";
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        }
    }

    final Object c(int param0) {
        if (param0 != -1) {
            field_E = null;
            return ((ua) this).field_F;
        }
        return ((ua) this).field_F;
    }

    final static void h(byte param0) {
        Object var2 = null;
        if (gd.field_e != 0 - sh.field_i) {
          if (gd.field_e == -sh.field_i + 250) {
            gd.field_e = gd.field_e + 1;
            if (param0 != -70) {
              var2 = null;
              ua.a(-119, (ji) null, false, (ji) null);
              return;
            } else {
              return;
            }
          } else {
            gd.field_e = gd.field_e + 1;
            if (param0 != -70) {
              var2 = null;
              ua.a(-119, (ji) null, false, (ji) null);
              return;
            } else {
              return;
            }
          }
        } else {
          gd.field_e = gd.field_e + 1;
          if (param0 != -70) {
            var2 = null;
            ua.a(-119, (ji) null, false, (ji) null);
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, ji param1, boolean param2, ji param3) {
        re.a(fc.field_c, df.field_ab, field_H, rd.field_a, sg.field_e, param2, wa.field_a, db.field_c, (mm) (Object) nf.field_d, oh.field_i, (byte) 103, tm.field_b);
        ef.field_O = bj.a(112, param1, "lobby", "chatfilter");
        sg.field_a[2] = mc.field_d;
        sg.field_a[0] = qj.field_g;
        sg.field_a[1] = al.field_a;
        jh.a((byte) 116, (mm) (Object) tg.field_a, param3);
        int var4 = 74 / ((-31 - param0) / 46);
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

    final static void i(byte param0) {
        ug var1 = (ug) (Object) qi.field_Q.c((byte) -121);
        int var2 = -11 % ((param0 - 19) / 35);
        if (!(var1 != null)) {
            si.a(66);
            return;
        }
        uf var3 = de.field_V;
        int discarded$0 = var3.i(7553);
        int discarded$1 = var3.i(7553);
        int discarded$2 = var3.i(7553);
        int discarded$3 = var3.i(7553);
        var1.b((byte) 124);
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
        ((ua) this).field_F = param0;
    }

    public static void e(int param0) {
        if (param0 != 8) {
          field_C = null;
          field_G = null;
          field_H = null;
          field_D = null;
          field_C = null;
          field_E = null;
          return;
        } else {
          field_G = null;
          field_H = null;
          field_D = null;
          field_C = null;
          field_E = null;
          return;
        }
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
