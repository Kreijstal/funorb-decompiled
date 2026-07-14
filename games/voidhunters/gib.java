/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gib {
    static String[] field_b;
    static int field_a;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 15) {
            gib.a(100, 43);
        }
    }

    gib(int param0) {
    }

    final static void a(byte param0) {
        L0: {
          klb.field_r.g((byte) -17);
          if (null == vqa.field_i) {
            vqa.field_i = new goa(klb.field_r, hab.field_j);
            break L0;
          } else {
            break L0;
          }
        }
        klb.field_r.a(false, (shb) (Object) vqa.field_i);
        if (param0 >= -32) {
          field_c = null;
          return;
        } else {
          return;
        }
    }

    final static khb a(int param0, java.applet.Applet param1) {
        String var2 = null;
        khb[] var3 = null;
        int var4 = 0;
        khb var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var2 = ro.a("jagex-last-login-method", param0 ^ 19227, param1);
        if (param0 == 19314) {
          if (var2 == null) {
            return dua.field_p;
          } else {
            var3 = pl.c((byte) 123);
            var4 = 0;
            L0: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (var5.a(0, var2)) {
                  return var5;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return dua.field_p;
              }
            }
          }
        } else {
          field_b = null;
          if (var2 == null) {
            return dua.field_p;
          } else {
            var3 = pl.c((byte) 123);
            var4 = 0;
            L1: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (var5.a(0, var2)) {
                  return var5;
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                return dua.field_p;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        asa.field_c = 1000000000L / (long)param1;
        int var2 = 38 % ((param0 - -37) / 54);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_c = "Who can join";
        field_a = 15;
    }
}
