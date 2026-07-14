/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static ao field_d;
    static int field_g;
    static String field_c;
    static int field_e;
    static String field_f;
    static int field_b;
    static int field_a;

    public static void a(int param0) {
        if (param0 != 4) {
            return;
        }
        field_c = null;
        field_d = null;
        field_f = null;
    }

    final static fc a(byte param0, byte[] param1) {
        int var2 = 0;
        if (param0 == -96) {
          var2 = re.a(param1, 0, (byte) 77);
          if ((var2 ^ -1) != -4) {
            if (4 != var2) {
              if (5 != var2) {
                if (var2 != 6) {
                  return null;
                } else {
                  return (fc) (Object) no.a((byte) 104, param1);
                }
              } else {
                return (fc) (Object) bo.a(param1, 24);
              }
            } else {
              return (fc) (Object) ij.a(param1, 7);
            }
          } else {
            return (fc) (Object) gd.a(param1, (byte) 46);
          }
        } else {
          return null;
        }
    }

    final static String a(int param0, int param1, String param2) {
        int var4 = 0;
        ga var6 = null;
        ga var7 = null;
        CharSequence var8 = null;
        var8 = (CharSequence) (Object) param2;
        if (!em.a(var8, (byte) -38)) {
          return u.field_f;
        } else {
          if (!sf.a(1, param2)) {
            if ((ge.field_zb ^ -1) == -3) {
              if (!hp.a(param2, 1020)) {
                if (-101 < (fn.field_d ^ -1)) {
                  if (!kj.a((byte) -94, param2)) {
                    if (param0 >= -75) {
                      field_d = null;
                      var6 = ma.field_a;
                      var6.b((byte) -35, param1);
                      var6.field_j = var6.field_j + 1;
                      var4 = var6.field_j;
                      var6.a(125, 2);
                      var6.a(param2, (byte) 105);
                      var6.e(100, -var4 + var6.field_j);
                      return null;
                    } else {
                      var7 = ma.field_a;
                      var7.b((byte) -35, param1);
                      var7.field_j = var7.field_j + 1;
                      var4 = var7.field_j;
                      var7.a(125, 2);
                      var7.a(param2, (byte) 105);
                      var7.e(100, -var4 + var7.field_j);
                      return null;
                    }
                  } else {
                    return vl.a(lo.field_h, new String[1], 2);
                  }
                } else {
                  return th.field_c;
                }
              } else {
                return vl.a(lo.field_i, new String[1], 2);
              }
            } else {
              return bg.field_d;
            }
          } else {
            return hf.field_b;
          }
        }
    }

    final static boolean a(int param0, String param1) {
        if (param0 != 1) {
            return false;
        }
        CharSequence var3 = (CharSequence) (Object) param1;
        return kf.field_k.equals((Object) (Object) tg.a(var3, false));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Waiting for levels";
        field_g = 32;
        field_b = 17;
        field_e = 39;
        field_c = "<%0> cannot join; the game has started.";
        field_a = (640 - ((field_b - 1) * (-field_g + field_e) + field_g * field_b)) / 2;
        field_d = new ao(1, 2, 2, 0);
    }
}
