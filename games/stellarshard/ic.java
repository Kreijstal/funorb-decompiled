/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ic implements w {
    static String field_b;
    private long field_c;
    static int field_a;
    static ej field_d;

    public final cg b(int param0) {
        if (!((ic) this).a((byte) 28)) {
          if (param0 == -28036) {
            if (350L + ((ic) this).field_c > ih.a((byte) -98)) {
              return eh.field_c;
            } else {
              return ((ic) this).c((byte) -119);
            }
          } else {
            return null;
          }
        } else {
          return sf.field_a;
        }
    }

    abstract String b(byte param0);

    public static void d(byte param0) {
        if (param0 != 37) {
            ic.a(-25, 74);
            field_b = null;
            field_d = null;
            return;
        }
        field_b = null;
        field_d = null;
    }

    abstract cg c(byte param0);

    public final void a(int param0) {
        ((ic) this).field_c = ih.a((byte) -98);
        if (param0 >= -81) {
            String discarded$0 = ((ic) this).c(-83);
        }
    }

    final static void a(String param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        int var9 = 0;
        L0: {
          var9 = stellarshard.field_B;
          param6 += 24;
          var7 = 48 + l.field_f.b(gf.field_b) - -nj.field_f[param1];
          if (l.field_f.b(param0) > -nj.field_f[param1] + (var7 - 48)) {
            var7 = 48 + (l.field_f.b(param0) - -nj.field_f[param1]);
            break L0;
          } else {
            break L0;
          }
        }
        jf.field_n[0].e(param4 - var7 / 2, -(jf.field_n[0].field_x / 2) + (2 + param6) + (-(l.field_f.field_N / 2) - -2));
        ti.d(-(var7 / 2) + (param4 - -jf.field_n[0].field_w), 0, -jf.field_n[2].field_w + param4 + var7 / 2, 480);
        var8_int = jf.field_n[0].field_w + param4 - var7 / 2;
        L1: while (true) {
          if (-jf.field_n[2].field_w + var7 / 2 + param4 <= var8_int) {
            L2: {
              ti.b();
              ti.b();
              ti.b();
              jf.field_n[2].e(-jf.field_n[2].field_w + (param4 + var7 / 2), 2 + (param6 - (-2 + l.field_f.field_N / 2)) + -(jf.field_n[0].field_x / 2));
              if (nj.field_f[param1] > 0) {
                ti.a(param4 - (var7 / 2 - 12) << -1635365692, param6 + 2 - (l.field_f.field_N / 2 - 2) << 1264863076, 512, nj.field_f[param1] * 4, ei.field_I);
                ti.a(-14 + (var7 / 2 + param4) << -238864412, -(l.field_f.field_N / 2) + 2 + param6 - -2 << -1264288732, 512, nj.field_f[param1] * 4, ei.field_I);
                ti.a(param4 - (var7 / 2 - 12) << -1577990972, -(l.field_f.field_N / 2) + (2 + param6 + 2) << -32294588, 256, nj.field_f[param1] * 2, ei.field_B);
                ti.a(-14 + (var7 / 2 + param4) << 856693380, 2 + -(l.field_f.field_N / 2) + (2 + param6) << 609145156, 256, nj.field_f[param1] * 2, ei.field_B);
                break L2;
              } else {
                break L2;
              }
            }
            if (param3) {
              return;
            } else {
              var8 = ai.a(param0, "<col", "<", -101);
              l.field_f.c(var8, -1 + param4, param6, 0, -1);
              l.field_f.c(var8, 1 + param4, param6, 0, -1);
              l.field_f.c(var8, param4 + 1, -1 + param6, 0, -1);
              l.field_f.c(var8, 1 + param4, param6 + 1, 0, -1);
              l.field_f.c(param0, param4, param6, param5, param2);
              return;
            }
          } else {
            jf.field_n[1].e(var8_int, 2 + (2 + param6) + (-(l.field_f.field_N / 2) + -(jf.field_n[0].field_x / 2)));
            var8_int = var8_int + jf.field_n[1].field_w;
            continue L1;
          }
        }
    }

    public final String c(int param0) {
        if (param0 == -22773) {
          if (!((ic) this).a((byte) 79)) {
            if ((ih.a((byte) -98) ^ -1L) > (((ic) this).field_c + 350L ^ -1L)) {
              return null;
            } else {
              return ((ic) this).b((byte) 36);
            }
          } else {
            return null;
          }
        } else {
          cg discarded$7 = ((ic) this).c((byte) -69);
          if (!((ic) this).a((byte) 79)) {
            if ((ih.a((byte) -98) ^ -1L) > (((ic) this).field_c + 350L ^ -1L)) {
              return null;
            } else {
              return ((ic) this).b((byte) 36);
            }
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        fk var4 = null;
        af var5 = null;
        var3 = stellarshard.field_B;
        var4 = (fk) (Object) ib.field_c.b(-88);
        L0: while (true) {
          if (var4 == null) {
            if (param1 < 30) {
              return;
            } else {
              var5 = (af) (Object) pf.field_b.b(-110);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  kg.a(param0, var5, false);
                  var5 = (af) (Object) pf.field_b.b((byte) 87);
                  continue L1;
                }
              }
            }
          } else {
            th.a(param0, var4, 1);
            var4 = (fk) (Object) ib.field_c.b((byte) 106);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Suggested names: ";
    }
}
