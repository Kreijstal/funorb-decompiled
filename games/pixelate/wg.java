/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static sb field_d;
    static int[] field_c;
    int[] field_f;
    static int field_e;
    static tf[] field_g;
    static boolean field_a;
    static int field_b;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (-1 == (param0 ^ -1)) {
            return 0;
        }
        if (param1 != 15598) {
            return 95;
        }
        if (!(0 >= param0)) {
            var2 = 1;
            if (!((param0 ^ -1) >= -65536)) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (255 < param0) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (!(-16 <= param0)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (!(-4 >= param0)) {
                param0 = param0 >> 2;
                var2 += 2;
            }
            if ((param0 ^ -1) < -2) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (param0 < -65536) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (!(param0 >= -256)) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (!(param0 <= 15)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (!(3 <= param0)) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if ((param0 ^ -1) > 1) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    final static boolean a(String param0, String param1, byte param2) {
        Object var4 = null;
        int stackIn_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        if (!nm.a(param0, 24)) {
          if (cm.a(param0, param2 ^ -98)) {
            return false;
          } else {
            if (param2 == -4) {
              if (ep.a((byte) 34, param0)) {
                return false;
              } else {
                if (-1 == (param1.length() ^ -1)) {
                  return true;
                } else {
                  if (kb.a(param0, param1, (byte) -123)) {
                    return false;
                  } else {
                    if (pc.a(param0, (byte) -47, param1)) {
                      return false;
                    } else {
                      L0: {
                        if (gb.a(param0, param1, 95)) {
                          stackOut_33_0 = 0;
                          stackIn_34_0 = stackOut_33_0;
                          break L0;
                        } else {
                          stackOut_32_0 = 1;
                          stackIn_34_0 = stackOut_32_0;
                          break L0;
                        }
                      }
                      return stackIn_34_0 != 0;
                    }
                  }
                }
              }
            } else {
              var4 = null;
              int discarded$1 = wg.a((byte[]) null, 103, 27);
              if (ep.a((byte) 34, param0)) {
                return false;
              } else {
                if (-1 == (param1.length() ^ -1)) {
                  return true;
                } else {
                  if (kb.a(param0, param1, (byte) -123)) {
                    return false;
                  } else {
                    if (!pc.a(param0, (byte) -47, param1)) {
                      if (!gb.a(param0, param1, 95)) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final ae a(ae param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = param0.field_h >> 1248022498;
        var4 = param0.field_g >> -1711839166;
        if (param1 < 35) {
          mc discarded$1 = wg.b(-124, 49);
          var5 = param0.field_i >> 1708776290;
          return new ae(((wg) this).field_f[0] * var3 - (-(var4 * ((wg) this).field_f[1]) + -(var5 * ((wg) this).field_f[2])) >> 582335214, var3 * ((wg) this).field_f[3] + (((wg) this).field_f[4] * var4 - -(var5 * ((wg) this).field_f[5])) >> -1357313266, var5 * ((wg) this).field_f[8] + ((wg) this).field_f[7] * var4 + ((wg) this).field_f[6] * var3 >> 1040638254);
        } else {
          var5 = param0.field_i >> 1708776290;
          return new ae(((wg) this).field_f[0] * var3 - (-(var4 * ((wg) this).field_f[1]) + -(var5 * ((wg) this).field_f[2])) >> 582335214, var3 * ((wg) this).field_f[3] + (((wg) this).field_f[4] * var4 - -(var5 * ((wg) this).field_f[5])) >> -1357313266, var5 * ((wg) this).field_f[8] + ((wg) this).field_f[7] * var4 + ((wg) this).field_f[6] * var3 >> 1040638254);
        }
    }

    final static int a(byte[] param0, int param1, int param2) {
        if (param1 < 124) {
            return -91;
        }
        return da.a(param0, (byte) 110, 0, param2);
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -5057) {
          L0: {
            int discarded$10 = wg.a(26, 126);
            if (an.field_e.d(125)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (an.field_e.d(125)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static mc b(int param0, int param1) {
        mc var2 = null;
        var2 = new mc();
        if (param0 != 255) {
          wg.a((byte) 74);
          tj.field_z.a(22125, (fa) (Object) var2);
          ro.a(127, param1);
          return var2;
        } else {
          tj.field_z.a(22125, (fa) (Object) var2);
          ro.a(127, param1);
          return var2;
        }
    }

    private wg(int[] param0) {
        if (param0.length != 9) {
            throw new RuntimeException();
        }
        ((wg) this).field_f = param0;
    }

    wg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((wg) this).field_f = new int[9];
        ((wg) this).field_f[4] = param4;
        ((wg) this).field_f[5] = param5;
        ((wg) this).field_f[2] = param2;
        ((wg) this).field_f[6] = param6;
        ((wg) this).field_f[1] = param1;
        ((wg) this).field_f[7] = param7;
        ((wg) this).field_f[8] = param8;
        ((wg) this).field_f[3] = param3;
        ((wg) this).field_f[0] = param0;
    }

    final wg a(int param0, wg param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        var11 = new int[9];
        var10 = var11;
        var3 = var10;
        if (param0 != 8) {
          return null;
        } else {
          var4 = 0;
          L0: while (true) {
            if (-4 >= var4) {
              return new wg(var11);
            } else {
              var5 = 0;
              L1: while (true) {
                if (-4 <= var5) {
                  var4++;
                  continue L0;
                } else {
                  var6 = 0L;
                  var8 = 0;
                  L2: while (true) {
                    if (-4 >= (var8 ^ -1)) {
                      var3[3 * var4 + var5] = (int)(var6 >> -486180464);
                      var5++;
                      continue L1;
                    } else {
                      var6 = var6 + (long)param1.field_f[var8 * 3 - -var5] * (long)((wg) this).field_f[var4 * 3 + var8];
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_c = null;
        if (param0 != -27) {
            field_a = true;
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[4];
    }
}
