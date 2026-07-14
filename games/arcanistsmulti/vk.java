/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends ve {
    static aj field_B;
    static int field_u;
    wk field_A;
    byte field_y;
    static ll[] field_w;
    int field_x;
    static String field_v;
    static String field_z;

    final static void c(boolean param0) {
        sb.field_a = param0 ? true : false;
    }

    final int e(byte param0) {
        if (!(((vk) this).field_A != null)) {
            return 0;
        }
        if (param0 >= -71) {
            field_u = -34;
        }
        return ((vk) this).field_A.field_g * 100 / (-((vk) this).field_y + ((vk) this).field_A.field_j.length);
    }

    final byte[] c(int param0) {
        L0: {
          if (param0 < -11) {
            break L0;
          } else {
            field_z = null;
            break L0;
          }
        }
        L1: {
          if (((vk) this).field_p) {
            break L1;
          } else {
            if (((vk) this).field_A.field_g >= -((vk) this).field_y + ((vk) this).field_A.field_j.length) {
              return ((vk) this).field_A.field_j;
            } else {
              break L1;
            }
          }
        }
        throw new RuntimeException();
    }

    public static void f(byte param0) {
        field_v = null;
        field_z = null;
        field_B = null;
        if (param0 != 20) {
            field_w = null;
        }
        field_w = null;
    }

    vk() {
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var3 = ba.a(param0, param1, true);
        if (var3 == null) {
          var4 = 27 % ((-51 - param2) / 62);
          var5 = 0;
          L0: while (true) {
            if (var5 < param1.length()) {
              if (pm.a(param1.charAt(var5), 45)) {
                var5++;
                continue L0;
              } else {
                return mb.field_N;
              }
            } else {
              return null;
            }
          }
        } else {
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 0;
        field_B = new aj(1, 2, 2, 0);
        field_v = "Message game";
        field_z = "Remove friend";
    }
}
