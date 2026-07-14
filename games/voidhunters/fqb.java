/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fqb extends rqa {
    static String field_p;
    static String[] field_o;

    final static boolean a(int param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (hoa.a(param1, false)) {
            return true;
          } else {
            if (param0 == 16647) {
              if (param1 != 45) {
                if (160 != param1) {
                  if (param1 != 32) {
                    if (param1 == 95) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    fqb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static byte[] a(byte param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        fj var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        L0: {
          var7 = VoidHunters.field_G;
          if ((param3 ^ -1) >= -1) {
            var4 = param2;
            break L0;
          } else {
            var8 = new byte[param1];
            var4 = var8;
            var5_int = 0;
            L1: while (true) {
              if (param1 <= var5_int) {
                break L0;
              } else {
                var8[var5_int] = param2[var5_int + param3];
                var5_int++;
                continue L1;
              }
            }
          }
        }
        var5 = new fj();
        var5.b((byte) -88);
        var5.a(var4, -7, (long)(8 * param1));
        var6 = new byte[64];
        if (param0 != 25) {
          field_o = null;
          var5.a(var6, 0, (byte) 89);
          return var6;
        } else {
          var5.a(var6, 0, (byte) 89);
          return var6;
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != 27154) {
            field_p = null;
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(87, 62, param0[0].a(89));
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[3];
        field_p = "Cancel";
    }
}
