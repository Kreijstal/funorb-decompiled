/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static wg[] field_a;
    static String[] field_b;
    static o[] field_d;
    static boolean field_c;
    static String field_f;
    static boolean field_e;

    final static boolean a(char param0, boolean param1) {
        if (param1) {
          if (param0 < 65) {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (90 < param0) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          field_f = null;
          if (param0 >= 65) {
            if (90 < param0) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = qj.a(param2 + -27210, param0);
        var4 = wizardrun.a((byte) -110, param0);
        var5 = qj.a(-2942, param1);
        var6 = wizardrun.a((byte) 119, param1);
        var7 = (int)((long)var5 * (long)var3 >> 1024666128);
        if (param2 != 24268) {
          return null;
        } else {
          var8 = (int)((long)var3 * (long)var6 >> -2055603056);
          var9 = (int)((long)var5 * (long)var4 >> 1907219856);
          var10 = (int)((long)var4 * (long)var6 >> -1482263792);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    final static void a(byte param0, String[] param1) {
        Object var3 = null;
        L0: {
          if (rk.field_k != null) {
            rk.field_k.field_J.a((byte) 87, param1);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (null != ik.field_G) {
            ik.field_G.field_H.a((byte) 87, param1);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != -117) {
          var3 = null;
          f.a((byte) -120, (String[]) null);
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        int var1 = -108 % ((param0 - 13) / 52);
        field_a = null;
        field_b = null;
        field_d = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = new wg[255];
        for (var0 = 0; field_a.length > var0; var0++) {
            field_a[var0] = new wg();
        }
        field_f = "The requirements and rewards for this achievement are hidden until collected";
    }
}
