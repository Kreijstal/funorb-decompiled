/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends qg {
    int field_A;
    static String field_C;
    static int[] field_F;
    static String field_D;
    static String[] field_B;
    static int field_E;

    final static void a(String param0, byte param1) {
        System.out.println("Error: " + sb.a(param0, "%0a", "\n", 127));
        if (param1 < 105) {
            String var3 = (String) null;
            n.a((String) null, (byte) 75);
        }
    }

    public static void d(byte param0) {
        field_F = null;
        field_C = null;
        field_B = null;
        field_D = null;
        if (param0 != -89) {
            n.d((byte) -100);
        }
    }

    final static nc b(String param0, byte param1) {
        int var2 = 0;
        String[] var3 = null;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        String var7 = null;
        nc var8 = null;
        int var9 = 0;
        var9 = Main.field_T;
        var2 = param0.length();
        if (var2 != 0) {
          if (255 < var2) {
            return dj.field_f;
          } else {
            var3 = rh.a('.', param0, -68);
            var4 = 17 % ((param1 - -44) / 33);
            if (2 > var3.length) {
              return ec.field_j;
            } else {
              var5 = var3;
              var6 = 0;
              L0: while (true) {
                if (var5.length > var6) {
                  var7 = var5[var6];
                  var8 = sj.a(var7, (byte) 8);
                  if (var8 != null) {
                    return var8;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  return eb.a(-3124, var3[var3.length + -1]);
                }
              }
            }
          }
        } else {
          return ec.field_j;
        }
    }

    n(lk param0) {
        super(((lk) param0).field_o, ((lk) param0).field_i, ((lk) param0).field_h, ((lk) param0).field_q, (ci) null, (pl) null);
        param0.a(((n) this).field_q, 0, ((n) this).field_h, 0, true);
        ((n) this).field_A = 256;
        ((n) this).field_y = param0;
    }

    public n() {
        super(0, 0, 0, 0, (ci) null, (pl) null);
        ((n) this).field_A = 256;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param2 == (param3 ^ -1))) {
            return;
        }
        if (!(((n) this).field_y != null)) {
            return;
        }
        if (((n) this).field_A == -1) {
            return;
        }
        if (!(-257 != ((n) this).field_A)) {
            ((n) this).field_y.a(param0 + ((n) this).field_o, param1 + ((n) this).field_i, -1, param3);
            return;
        }
        kc var6 = new kc(((n) this).field_y.field_h, ((n) this).field_y.field_q);
        dl.a(-27, var6);
        ((n) this).field_y.a(0, 0, param2 + 0, param3);
        gg.a(14756);
        var6.e(param0 - -((n) this).field_o, param1 + ((n) this).field_i, ((n) this).field_A);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[8192];
        field_D = "Highscores";
        field_C = "Checking";
        field_E = 2;
        field_B = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
