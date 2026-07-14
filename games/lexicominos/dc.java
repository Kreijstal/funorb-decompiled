/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends si {
    wf field_x;
    static db[] field_z;
    int field_w;
    byte field_A;
    static String field_y;

    final byte[] d(byte param0) {
        if (!((dc) this).field_v) {
            // if_icmplt L34
        } else {
            throw new RuntimeException();
        }
        int var2 = 37 % ((2 - param0) / 38);
        return ((dc) this).field_x.field_j;
    }

    final static void c(int param0) {
        if (param0 != 255) {
            return;
        }
        Object var2 = null;
        cl.a((byte) 41, (String) null, "");
    }

    final static boolean d(int param0) {
        if (a.field_c == -1) {
            if (!(a.b(1, 10343))) {
                return false;
            }
            a.field_c = ig.field_a.d(true);
            ig.field_a.field_h = 0;
        }
        if (param0 != 2) {
            return false;
        }
        if (1 == (a.field_c ^ -1)) {
            if (!(a.b(2, 10343))) {
                return false;
            }
            a.field_c = ig.field_a.b(-1698573656);
            ig.field_a.field_h = 0;
        }
        return a.b(a.field_c, 10343);
    }

    dc() {
    }

    final static String[] a(String param0, char param1, byte param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Lexicominos.field_L ? 1 : 0;
        CharSequence var10 = (CharSequence) (Object) param0;
        int var3 = wd.a((byte) -72, param1, var10);
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = 0;
        if (param2 != -125) {
            field_y = null;
        }
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param1 != param0.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param0.substring(var6, var8);
            var6 = var8 - -1;
        }
        var4[var3] = param0.substring(var6);
        return var4;
    }

    public static void f(byte param0) {
        field_y = null;
        int var1 = -27 % ((param0 - 19) / 53);
        field_z = null;
    }

    final static String a(int param0, byte[] param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var12 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        var10 = new char[param0];
        var12 = var10;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= param0) {
            L1: {
              if (param2 == 16) {
                break L1;
              } else {
                boolean discarded$1 = dc.d(-88);
                break L1;
              }
            }
            return new String(var12, 0, var5);
          } else {
            var7 = param1[param3 + var6] & 255;
            if (0 != var7) {
              L2: {
                if ((var7 ^ -1) > -129) {
                  break L2;
                } else {
                  if (160 > var7) {
                    L3: {
                      var8 = ne.field_d[var7 - 128];
                      if (var8 == 0) {
                        var8 = 63;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var7 = var8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var5++;
              var10[var5] = (char)var7;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final int c(byte param0) {
        if (param0 != 16) {
            return 68;
        }
        if (!(((dc) this).field_x != null)) {
            return 0;
        }
        return 100 * ((dc) this).field_x.field_h / (((dc) this).field_x.field_j.length - ((dc) this).field_A);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
