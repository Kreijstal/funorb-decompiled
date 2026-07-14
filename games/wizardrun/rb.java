/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    int field_g;
    static int field_e;
    static long field_d;
    int field_h;
    int field_f;
    static String field_b;
    int field_c;
    static boolean field_a;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        var3 = 0;
        var4 = pf.field_f;
        if (param0 == -578629823) {
          if (a.field_b.length > var3) {
            var5 = ec.field_g[var3];
            if (0 <= var5) {
              var6 = sf.a(true, 110, a.field_b[var3]);
              var7 = -(var6 >> 327844097) + id.field_c;
              var4 = var4 + na.field_e;
              if (ih.a(-vl.field_h + var7, (vl.field_h << -578629823) + var6, ec.field_c + (e.field_d << -1926289535), var4, true, param1, param2)) {
                return var5;
              } else {
                var4 = var4 + (ec.field_c + (na.field_e + (e.field_d << -1899043039)));
                var3++;
                var3++;
                var3++;
                var3++;
                return -1;
              }
            } else {
              var4 = var4 + si.field_f;
              var3++;
              var3++;
              var3++;
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -85;
        }
    }

    final static void a(int param0, byte param1) {
        vf var2 = null;
        int var3 = 0;
        var3 = wizardrun.field_H;
        var2 = (vf) (Object) r.field_d.b((byte) 50);
        if (param1 >= -72) {
          rb.a(57, (byte) -120);
          L0: while (true) {
            if (var2 != null) {
              oj.a(param0, var2, -22);
              var2 = (vf) (Object) r.field_d.d(8192);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (var2 != null) {
              oj.a(param0, var2, -22);
              var2 = (vf) (Object) r.field_d.d(8192);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 == -1926289535) {
            return;
        }
        rb.a(-27, (byte) -34);
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            if (param1 != -1926289535) {
                return;
            }
            try {
                var3 = new java.net.URL(param2.getCodeBase(), param0);
                var3 = jl.a(-91, var3, param2);
                sh.a(true, 127, var3.toString(), param2);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Achievements This Game";
    }
}
