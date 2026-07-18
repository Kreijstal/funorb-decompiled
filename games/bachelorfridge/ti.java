/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static byte[] field_a;

    final static hh a() {
        int var1 = 0;
        int discarded$0 = -65;
        return new hh(tt.e(21240), aj.a());
    }

    final static String a(byte param0, int param1, long param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = BachelorFridge.field_y;
          var6 = 44;
          var7 = 46;
          if (param3 != 0) {
            break L0;
          } else {
            var6 = 46;
            var7 = 44;
            break L0;
          }
        }
        L1: {
          if (param3 == 2) {
            var7 = 160;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var9 = 0 / ((param0 - 60) / 39);
          var8 = 0;
          if (param2 < 0L) {
            param2 = -param2;
            var8 = 1;
            break L2;
          } else {
            break L2;
          }
        }
        var10 = new StringBuilder(26);
        var11 = 0;
        L3: while (true) {
          if (var11 >= 2) {
            StringBuilder discarded$5 = var10.append((char) var6);
            var11 = 0;
            L4: while (true) {
              var12 = (int)param2;
              param2 = param2 / 10L;
              StringBuilder discarded$6 = var10.append((char)(48 + (var12 - 10 * (int)param2)));
              if (0L != param2) {
                var11++;
                if (var11 % 3 == 0) {
                  StringBuilder discarded$7 = var10.append((char) var7);
                  continue L4;
                } else {
                  continue L4;
                }
              } else {
                L5: {
                  if (var8 != 0) {
                    StringBuilder discarded$8 = var10.append('-');
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return var10.reverse().toString();
              }
            }
          } else {
            var12 = (int)param2;
            param2 = param2 / 10L;
            StringBuilder discarded$9 = var10.append((char)(-(10 * (int)param2) + var12 + 48));
            var11++;
            continue L3;
          }
        }
    }

    public static void b() {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        int var2 = 0;
        int var0 = 0;
        field_a = new byte[32896];
        for (var1 = 0; var1 < 256; var1++) {
            for (var2 = 0; var2 <= var1; var2++) {
                int incrementValue$0 = var0;
                var0++;
                field_a[incrementValue$0] = (byte)(int)(255.0 / Math.sqrt((double)((float)(65535 + (var2 * var2 + var1 * var1)) / 65535.0f)));
            }
        }
    }
}
