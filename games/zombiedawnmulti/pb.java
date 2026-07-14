/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static String field_g;
    static int field_h;
    static ef field_e;
    static boolean field_f;
    static int field_b;
    static String field_i;
    static String field_c;
    static volatile int field_a;
    static int field_d;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (!ch.a(param2, false)) {
          return false;
        } else {
          if (param1 == -20) {
            if (-256 != (param0 ^ -1)) {
              if ((param0 ^ -1) <= -20) {
                return false;
              } else {
                L0: {
                  if ((1 << -32 + param2 & em.field_O[param0]) == 0) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L0;
                  }
                }
                return stackIn_11_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static ja[] a(String param0, ul param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param2 != -256) {
          uj discarded$2 = pb.a((byte) -65, -95);
          var4 = param1.a(param0, (byte) -70);
          var5 = param1.a(param3, var4, -1);
          return vk.a(38, var5, param1, var4);
        } else {
          var4 = param1.a(param0, (byte) -70);
          var5 = param1.a(param3, var4, -1);
          return vk.a(38, var5, param1, var4);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        if (param0 != -116) {
          field_d = 70;
          field_i = null;
          field_g = null;
          return;
        } else {
          field_i = null;
          field_g = null;
          return;
        }
    }

    final static int a(byte[] param0, int param1, byte param2) {
        int var3 = -117 / ((param2 - -83) / 37);
        return c.a(param0, param1, true, 0);
    }

    final static uj a(byte param0, int param1) {
        wj var2 = null;
        if (df.field_H) {
          if (qo.field_q.a(0) < 4) {
            var2 = new wj(param1);
            if (param0 != 62) {
              field_a = 52;
              qo.field_q.a((br) (Object) var2, false);
              return var2.field_m;
            } else {
              qo.field_q.a((br) (Object) var2, false);
              return var2.field_m;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = 256 * (-320 + param1) / 320;
        var3 = var3 / 2;
        // wide iinc 3 128
        var4 = 64;
        if (!param2) {
          var5 = 256 - var4;
          if (var5 >= var3) {
            if (var4 <= var3) {
              return var3;
            } else {
              var3 = var4;
              return var3;
            }
          } else {
            var3 = var5;
            return var3;
          }
        } else {
          return -119;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Players: <%0>/<%1>";
        field_a = -1;
        field_c = "Zombie-lover";
        field_d = 0;
    }
}
