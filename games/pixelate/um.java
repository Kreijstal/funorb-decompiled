/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um extends fa {
    static int field_k;
    static int field_r;
    static String field_o;
    byte[] field_n;
    static fb field_q;
    static volatile long field_m;
    static String[] field_l;
    boolean field_p;

    final static void a(int param0, int param1, wg param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9, int param10) {
        ae[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ae[] var17 = null;
        ae[] var18 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var16 = Pixelate.field_H ? 1 : 0;
        var17 = new ae[8];
        var18 = var17;
        var11 = var18;
        var12 = 0;
        L0: while (true) {
          if (-9 >= var12) {
            if ((param2.field_f[8] ^ -1) < -1) {
              L1: {
                w.a(param10, param8 + -param0, var18[1], param4 - param7, var18[0], var18[2], var18[3], param6, (byte) -43, param9);
                if (param5 <= -85) {
                  break L1;
                } else {
                  um.a(-74);
                  break L1;
                }
              }
              L2: {
                if (param2.field_f[7] <= 0) {
                  w.a(param10, param3 + -param1, var18[7], -param0 + param8, var18[3], var18[2], var18[6], param6, (byte) -104, param9);
                  break L2;
                } else {
                  w.a(param10, param3 - param1, var18[4], -param0 + param8, var18[0], var18[1], var18[5], param6, (byte) -125, param9);
                  break L2;
                }
              }
              L3: {
                if ((param2.field_f[6] ^ -1) < -1) {
                  w.a(param10, param4 - param7, var18[4], param3 - param1, var18[6], var18[2], var18[0], param6, (byte) -118, param9);
                  break L3;
                } else {
                  w.a(param10, param4 - param7, var18[1], param3 - param1, var18[3], var18[7], var18[5], param6, (byte) -96, param9);
                  break L3;
                }
              }
              return;
            } else {
              w.a(param10, param8 - param0, var18[4], param4 - param7, var18[5], var18[7], var18[6], param6, (byte) -38, param9);
              if (param5 <= -85) {
                if (param2.field_f[7] <= 0) {
                  w.a(param10, param3 + -param1, var18[7], -param0 + param8, var18[3], var18[2], var18[6], param6, (byte) -104, param9);
                  if ((param2.field_f[6] ^ -1) >= -1) {
                    w.a(param10, param4 - param7, var18[1], param3 - param1, var18[3], var18[7], var18[5], param6, (byte) -96, param9);
                    return;
                  } else {
                    w.a(param10, param4 - param7, var18[4], param3 - param1, var18[6], var18[2], var18[0], param6, (byte) -118, param9);
                    return;
                  }
                } else {
                  w.a(param10, param3 - param1, var18[4], -param0 + param8, var18[0], var18[1], var18[5], param6, (byte) -125, param9);
                  if ((param2.field_f[6] ^ -1) >= -1) {
                    w.a(param10, param4 - param7, var18[1], param3 - param1, var18[3], var18[7], var18[5], param6, (byte) -96, param9);
                    return;
                  } else {
                    w.a(param10, param4 - param7, var18[4], param3 - param1, var18[6], var18[2], var18[0], param6, (byte) -118, param9);
                    return;
                  }
                }
              } else {
                L4: {
                  um.a(-74);
                  if (param2.field_f[7] <= 0) {
                    w.a(param10, param3 + -param1, var18[7], -param0 + param8, var18[3], var18[2], var18[6], param6, (byte) -104, param9);
                    break L4;
                  } else {
                    w.a(param10, param3 - param1, var18[4], -param0 + param8, var18[0], var18[1], var18[5], param6, (byte) -125, param9);
                    break L4;
                  }
                }
                if ((param2.field_f[6] ^ -1) >= -1) {
                  w.a(param10, param4 - param7, var18[1], param3 - param1, var18[3], var18[7], var18[5], param6, (byte) -96, param9);
                  return;
                } else {
                  w.a(param10, param4 - param7, var18[4], param3 - param1, var18[6], var18[2], var18[0], param6, (byte) -118, param9);
                  return;
                }
              }
            }
          } else {
            L5: {
              if (-1 == (1 & var12)) {
                stackOut_4_0 = param0;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = param8;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            L6: {
              var13 = stackIn_5_0;
              if ((var12 & 2) == 0) {
                stackOut_7_0 = param7;
                stackIn_8_0 = stackOut_7_0;
                break L6;
              } else {
                stackOut_6_0 = param4;
                stackIn_8_0 = stackOut_6_0;
                break L6;
              }
            }
            L7: {
              var14 = stackIn_8_0;
              if (-1 != (var12 & 4 ^ -1)) {
                stackOut_10_0 = param3;
                stackIn_11_0 = stackOut_10_0;
                break L7;
              } else {
                stackOut_9_0 = param1;
                stackIn_11_0 = stackOut_9_0;
                break L7;
              }
            }
            var15 = stackIn_11_0;
            var11[var12] = new ae(var13 * 2 + -2 << 1723923724, var14 * 2 - 2 << -1870995476, var15 * 2 - 2 << -1920762580);
            var17[var12] = param2.a(var17[var12], (byte) 83);
            var12++;
            continue L0;
          }
        }
    }

    final static tc a(fm param0, fm param1, int param2, int param3, int param4) {
        if (param3 >= 54) {
          if (!rk.a(param4, false, param0, param2)) {
            return null;
          } else {
            return kf.a(param1.a(param2, param4, true), -17);
          }
        } else {
          field_o = null;
          if (!rk.a(param4, false, param0, param2)) {
            return null;
          } else {
            return kf.a(param1.a(param2, param4, true), -17);
          }
        }
    }

    public static void a(int param0) {
        field_o = null;
        int var1 = -127 / ((param0 - 74) / 32);
        field_q = null;
        field_l = null;
    }

    um() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0L;
        field_l = new String[]{"You can also use the '<col=ffff00>W</col>', '<col=ffff00>A</col>', '<col=ffff00>S</col>' and '<col=ffff00>D</col>' keys to move your piece.<br>Press '<col=ffff00>X</col>' to rotate your piece."};
    }
}
