/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends fe {
    rc field_G;
    static String field_J;
    static boolean field_K;
    static boolean field_I;
    int field_H;
    byte[] field_L;

    final byte[] d(byte param0) {
        if (param0 < -49) {
          if (((df) this).field_z) {
            throw new RuntimeException();
          } else {
            return ((df) this).field_L;
          }
        } else {
          int discarded$5 = df.h(-48);
          if (((df) this).field_z) {
            throw new RuntimeException();
          } else {
            return ((df) this).field_L;
          }
        }
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        if ((nj.field_Q ^ -1) <= -11) {
          if (km.a(-124)) {
            if (0 == uj.field_d) {
              fa.a(false, (byte) 88, param2);
              kg.a(0, 0, 28594, param1);
              var3 = 89 % ((param0 - -66) / 44);
              return;
            } else {
              en.a(param1, -28003);
              var3 = 89 % ((param0 - -66) / 44);
              return;
            }
          } else {
            pb.b();
            ff.a((byte) 17, 240, 320);
            kg.a(0, 0, 28594, param1);
            var3 = 89 % ((param0 - -66) / 44);
            return;
          }
        } else {
          L0: {
            var3 = 0;
            if (dd.field_e) {
              dd.field_e = false;
              var3 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          kc.a(sa.b((byte) 118), fi.a(true), var3 != 0, 300, d.field_S);
          var3 = 89 % ((param0 - -66) / 44);
          return;
        }
    }

    final static int h(int param0) {
        int var1 = 68 % ((param0 - 3) / 63);
        return wi.field_y;
    }

    final static int a(int param0, int param1) {
        if (param0 == -3720) {
          if (-1 < (param1 ^ -1)) {
            if (-65536 > param1) {
              return vn.field_m[134217728 / -param1] + -2048;
            } else {
              return -vn.field_m[-param1 >> 206538725];
            }
          } else {
            if (param1 <= 65536) {
              return vn.field_m[param1 >> 1282746501];
            } else {
              return 2048 + -vn.field_m[134217728 / param1];
            }
          }
        } else {
          field_J = null;
          if (-1 < (param1 ^ -1)) {
            if (-65536 > param1) {
              return vn.field_m[134217728 / -param1] + -2048;
            } else {
              return -vn.field_m[-param1 >> 206538725];
            }
          } else {
            if (param1 <= 65536) {
              return vn.field_m[param1 >> 1282746501];
            } else {
              return 2048 + -vn.field_m[134217728 / param1];
            }
          }
        }
    }

    final int g(int param0) {
        if (param0 == 16) {
          if (((df) this).field_z) {
            return 0;
          } else {
            return 100;
          }
        } else {
          int discarded$6 = ((df) this).g(65);
          if (((df) this).field_z) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    public static void i(int param0) {
        field_J = null;
        if (param0 >= -20) {
            field_K = true;
        }
    }

    df() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = false;
        field_J = "You have <%0> unread messages!";
    }
}
