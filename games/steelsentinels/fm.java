/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static gk field_j;
    int field_k;
    static String field_h;
    static int field_d;
    int field_c;
    static String field_g;
    static dk field_a;
    static int[] field_l;
    static String field_i;
    static int[] field_f;
    static gh field_b;
    static int[] field_e;

    public static void a(int param0) {
        if (param0 != 4314) {
            Object var2 = null;
            gh discarded$0 = fm.a(-42, true, 120, 16, -64, 89, -116, -30, -115, 59, 77, (mi) null, -85);
        }
        field_j = null;
        field_b = null;
        field_a = null;
        field_l = null;
        field_i = null;
        field_g = null;
        field_e = null;
        field_f = null;
        field_h = null;
    }

    final static gh a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, mi param11, int param12) {
        gh var13 = new gh(0L, (gh) null);
        var13.field_I = ul.a((byte) 0, param12, param8);
        var13.field_Ab = ul.a((byte) 0, param6, param10);
        var13.field_mb = ul.a((byte) 0, param3, param2);
        if (param1) {
            fm.a(-102);
        }
        var13.field_bb = ul.a((byte) 0, param5, param9);
        var13.field_H = ul.a((byte) 0, param4, param0);
        var13.field_nb = param7;
        var13.field_L = param11;
        return var13;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    fm(int param0, int param1, int param2, int param3) {
        ((fm) this).field_c = param0;
        ((fm) this).field_k = param3;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (-1 == param0) {
            return 0;
        }
        if (!(0 >= param0)) {
            var2 = 1;
            if (!(-65536 >= param0)) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (!(-256 <= param0)) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (param0 > 15) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (!(-4 >= param0)) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if ((param0 ^ -1) < -2) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (!((param0 ^ -1) <= 65535)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (param0 < -256) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (param1 < 13) {
            field_d = -36;
        }
        if ((param0 ^ -1) > 15) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (-4 > param0) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (!(-2 <= param0)) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        field_d = 33;
        field_h = "Camera follows sentinel: Off";
        field_j = new gk(192, 192, 256);
        var0 = 0;
        var2 = -96;
        L0: while (true) {
          if (var2 <= -97) {
            field_g = "Open";
            field_l = new int[8192];
            field_i = "Z";
            field_e = new int[8192];
            field_f = new int[3];
          } else {
            var3 = -96;
            L1: while (true) {
              if (-97 <= var3) {
                var2++;
                continue L0;
              } else {
                L2: {
                  var1 = (int)(64.0 * Math.atan2((double)Math.abs(var3), (double)var2) / 3.141592653589793);
                  if (1 <= var1) {
                    break L2;
                  } else {
                    var1 = 1;
                    break L2;
                  }
                }
                L3: {
                  if (-128 > (var1 ^ -1)) {
                    var1 = 127;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var0++;
                  field_j.field_p[var0] = (byte)var1;
                  if ((var3 * var3 + var2 * var2 ^ -1) <= -6725) {
                    break L4;
                  } else {
                    field_j.field_p[-1 + var0] = (byte)(field_j.field_p[-1 + var0] + 127);
                    break L4;
                  }
                }
                L5: {
                  if (8100 < var3 * var3 + var2 * var2) {
                    field_j.field_p[-1 + var0] = (byte) 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (-4901 < (var2 * var2 - -(var3 * var3) ^ -1)) {
                  field_j.field_p[-1 + var0] = (byte) 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
