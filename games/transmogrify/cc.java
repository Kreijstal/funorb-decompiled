/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static String field_c;
    static int[] field_d;
    static boolean[] field_e;
    static char[] field_g;
    static int field_a;
    static String field_b;
    static int[] field_f;

    final static ti[] a(int param0, ci param1, int param2, int param3) {
        if (param2 > -31) {
            return null;
        }
        if (!rl.a(param0, 0, param3, param1)) {
            return null;
        }
        return bc.a((byte) 106);
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        L0: {
          var9 = Transmogrify.field_A ? 1 : 0;
          if (param1 == 15923) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        var10 = new char[param2];
        var4 = var10;
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (var6 >= param2) {
            return new String(var10, 0, var5);
          } else {
            var7 = 255 & param3[var6 + param0];
            if (var7 != 0) {
              L2: {
                if (-129 < (var7 ^ -1)) {
                  break L2;
                } else {
                  if (var7 >= 160) {
                    break L2;
                  } else {
                    L3: {
                      var8 = af.field_a[var7 - 128];
                      if (var8 == 0) {
                        var8 = 63;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var7 = var8;
                    break L2;
                  }
                }
              }
              var5++;
              var10[var5] = (char)var7;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
            field_f = null;
        }
        field_f = null;
        field_c = null;
        field_g = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_b = "Connection restored.";
        field_c = "Quit";
        field_a = 0;
        field_f = new int[]{0, 0, 4, 6, 5, 2, 2, 3, 0, 6, 1, 6, 0, 7, 2, 5, 4, 7, 7};
        field_d = new int[4];
    }
}
