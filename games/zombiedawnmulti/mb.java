/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends br {
    int field_m;
    int field_v;
    static String field_g;
    int field_i;
    int field_E;
    static boolean[][] field_k;
    int field_t;
    static ja field_j;
    static int[] field_n;
    int field_o;
    uj field_C;
    int field_B;
    nj field_h;
    int field_l;
    po field_x;
    int field_D;
    int field_A;
    int field_p;
    int field_q;
    int field_w;
    static String field_u;
    int field_y;
    jd field_f;
    int field_r;
    int field_s;
    int field_z;

    final static int a(fm param0, boolean param1, String param2, String[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = ZombieDawnMulti.field_E ? 1 : 0;
          var5 = param0.a(param2);
          if (var5 > param4) {
            break L0;
          } else {
            if ((param2.indexOf("<br>") ^ -1) == 0) {
              param3[0] = (String) (Object) param3;
              return 1;
            } else {
              break L0;
            }
          }
        }
        var6 = (param4 + (var5 + -1)) / param4;
        param4 = var5 / var6;
        if (!param1) {
          var6 = 0;
          var7 = 0;
          var8 = param2.length();
          var9 = 0;
          L1: while (true) {
            if (var9 >= var8) {
              L2: {
                if (var8 > var7) {
                  var6++;
                  param3[var6] = param2.substring(var7, var8).trim();
                  break L2;
                } else {
                  break L2;
                }
              }
              return var6;
            } else {
              L3: {
                L4: {
                  var10 = param2.charAt(var9);
                  if (var10 == 32) {
                    break L4;
                  } else {
                    if (var10 != 45) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var11 = param2.substring(var7, 1 + var9).trim();
                var12 = param0.a(var11);
                if (var12 < param4) {
                  break L3;
                } else {
                  var7 = 1 + var9;
                  var6++;
                  param3[var6] = var11;
                  break L3;
                }
              }
              if (var10 == 62) {
                if (param2.regionMatches(var9 + -3, "<br>", 0, 4)) {
                  var6++;
                  param3[var6] = param2.substring(var7, -3 + var9).trim();
                  var7 = var9 - -1;
                  var9++;
                  continue L1;
                } else {
                  var9++;
                  continue L1;
                }
              } else {
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return 66;
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != -31) {
            return -96;
        }
        int var2 = 0;
        if (param1 >= 0) {
            // if_icmpgt L34
        }
        var2 += 16;
        param1 = param1 >>> 16;
        if (!((param1 ^ -1) > -257)) {
            param1 = param1 >>> 8;
            var2 += 8;
        }
        if (param1 >= 16) {
            param1 = param1 >>> 4;
            var2 += 4;
        }
        if (4 <= param1) {
            var2 += 2;
            param1 = param1 >>> 2;
        }
        if (1 <= param1) {
            var2++;
            param1 = param1 >>> 1;
        }
        return var2 - -param1;
    }

    final void a(byte param0) {
        ((mb) this).field_x = null;
        if (param0 != 71) {
            ((mb) this).field_l = -91;
        }
        ((mb) this).field_f = null;
        ((mb) this).field_h = null;
        ((mb) this).field_C = null;
    }

    public static void b(boolean param0) {
        field_n = null;
        if (param0) {
            field_j = null;
        }
        field_k = null;
        field_j = null;
        field_g = null;
        field_u = null;
    }

    mb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Please log in to access this feature.";
        field_n = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_u = "The following settings need to be changed:  ";
    }
}
