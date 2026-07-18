/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class av {
    static kp field_c;
    private static int[] field_b;
    static ej field_a;

    final static boolean a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        if (ua.field_l[0] == null) {
          L0: {
            za.a(34, new int[6], 220, 210, 0, 430, (byte) -64);
            za.a(32, new int[5], 160, 170, 1, 470, (byte) 107);
            za.a(32, new int[2], 400, 200, 2, 440, (byte) 106);
            za.a(32, new int[3], 430, 170, 3, 470, (byte) -103);
            za.a(32, new int[2], 400, 260, 4, 512, (byte) -42);
            za.a(32, new int[2], 400, 260, 5, 498, (byte) -64);
            za.a(32, new int[2], 200, 110, 6, 530, (byte) -65);
            za.a(32, new int[3], 240, 170, 7, 470, (byte) 119);
            oq.field_K = kn.field_b.a((byte) 94, du.field_p[12]);
            var1 = kn.field_b.a((byte) 94, du.field_p[13]);
            if (oq.field_K >= var1) {
              break L0;
            } else {
              oq.field_K = var1;
              break L0;
            }
          }
          var2 = 4 + dp.field_h.field_a - -dp.field_h.field_i;
          bk.field_e[6] = var2 + 200 + (dp.field_h.field_j - -dp.field_h.field_i);
          oo.field_Y[6] = 30 + 2 * var2;
          return true;
        } else {
          return false;
        }
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (param2) {
            var4 += 2;
        }
        var4++;
        int var5 = -111;
        return qh.field_a[var4];
    }

    final static boolean a(int param0, int param1, int param2) {
        return mi.b(param1, param2, 22547) & ta.a(param2, param1, (byte) 82);
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        int var1 = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        field_c = new kp();
        field_b = new int[128];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 64) {
            var0 = 0;
            L1: while (true) {
              if (var0 >= 64) {
                var0 = 16711935 & field_b[63];
                var1 = 65280 & field_b[63];
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 2) {
                    field_a = new ej(2, 4, 4, 0);
                    return;
                  } else {
                    var3 = field_b[64 - -var2];
                    var4 = 256 + -(256 * var2 / 2);
                    var5 = 16711935 & var3;
                    var6 = var3 & 65280;
                    var5 = var5 * (-var4 + 256);
                    var6 = var6 * (-var4 + 256);
                    var5 = var5 + var0 * var4;
                    var6 = var6 + var1 * var4;
                    var3 = (var6 & 16711680 | -16711936 & var5) >>> 8;
                    field_b[64 - -var2] = var3;
                    var2++;
                    continue L2;
                  }
                }
              } else {
                var1 = 96 * (var0 * var0) / 4096;
                var2 = 32 * (var0 * (var0 * var0)) / 262144;
                var3 = var0 * var0 * 128 / 4096;
                field_b[-var0 + 127] = (var1 << 16) - (-(var2 << 8) + -var3);
                var0++;
                continue L1;
              }
            }
          } else {
            var1 = var0 * (var0 * 192) / 4096;
            var2 = 128 * var0 * (var0 * (var0 * var0)) / 16777216;
            var3 = 255 * (var0 * (var0 * var0)) / 262144;
            field_b[var0] = (var2 << 8) + (var1 << 16) + var3;
            var0++;
            continue L0;
          }
        }
    }
}
