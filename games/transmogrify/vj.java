/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static String field_a;

    final static boolean a(int param0, String param1) {
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length() < ca.field_f) {
              break L0;
            } else {
              if (param1.length() <= a.field_Q) {
                if (param0 == -23424) {
                  return false;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
        return true;
    }

    public static void a(byte param0) {
        if (param0 < 8) {
            return;
        }
        field_a = null;
    }

    final static void a(int[] param0, byte[] param1, byte param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Transmogrify.field_A ? 1 : 0;
        if (param2 >= -10) {
            vj.a((byte) 60);
        }
        for (var5 = 0; var5 < mh.field_b.length; var5++) {
            param3 = mh.field_b[var5];
            var6 = var5 << 450868548;
            while (true) {
                param3--;
                if (param3 == 0) {
                    break;
                }
                var6++;
                param4 = i.field_b[var6];
                param0[param1[param4]] = param0[param1[param4]] + 1;
                i.field_b[param0[param1[param4]]] = param4;
            }
        }
    }

    static {
    }
}
