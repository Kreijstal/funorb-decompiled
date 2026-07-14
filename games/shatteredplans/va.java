/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static boolean field_j;
    static r field_g;
    static int field_b;
    static bi field_e;
    static String field_i;
    boolean field_f;
    int field_c;
    boolean field_k;
    static bi[] field_d;
    int field_h;
    int field_a;

    public static void a(int param0) {
        int var1 = 46 / ((param0 - 30) / 48);
        field_e = null;
        field_g = null;
        field_d = null;
        field_i = null;
    }

    final static String a(int param0, String[] param1) {
        int var2 = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != null) {
          if (-1 != (param1.length ^ -1)) {
            if (1 == param1.length) {
              return param1[0];
            } else {
              var2 = param1.length + param0;
              var3 = new StringBuilder(20);
              var4 = 0;
              L0: while (true) {
                if (var2 <= var4) {
                  StringBuilder discarded$10 = var3.append(param1[var2]);
                  StringBuilder discarded$11 = var3.append(qn.field_d);
                  StringBuilder discarded$12 = var3.append(param1[1 + var2]);
                  return var3.toString();
                } else {
                  StringBuilder discarded$13 = var3.append(param1[var4]);
                  StringBuilder discarded$14 = var3.append(ef.field_d);
                  var4++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(String[] args, byte param1, int param2, String param3) {
        int var5 = 0;
        Object var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        ee.field_l = rh.field_g;
        if (param1 == -113) {
          if (param2 != 255) {
            if (100 <= param2) {
              if (-106 > (param2 ^ -1)) {
                wh.field_c = ck.a(param3, param2, -80);
                return;
              } else {
                wh.field_c = tc.a(args, (byte) -64);
                return;
              }
            } else {
              wh.field_c = ck.a(param3, param2, -80);
              return;
            }
          } else {
            L0: {
              stackOut_13_0 = 93;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (jm.field_t >= 13) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L0;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L0;
              }
            }
            wh.field_c = ub.a((byte) stackIn_16_0, stackIn_16_1 != 0);
            return;
          }
        } else {
          var6 = null;
          bi[] discarded$1 = va.a((String) null, -24, (String) null, (bc) null);
          if (param2 != 255) {
            if (100 <= param2) {
              if (-106 <= (param2 ^ -1)) {
                wh.field_c = tc.a(args, (byte) -64);
                return;
              } else {
                wh.field_c = ck.a(param3, param2, -80);
                return;
              }
            } else {
              wh.field_c = ck.a(param3, param2, -80);
              return;
            }
          } else {
            L1: {
              stackOut_2_0 = 93;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (jm.field_t >= 13) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            wh.field_c = ub.a((byte) stackIn_5_0, stackIn_5_1 != 0);
            return;
          }
        }
    }

    final static bi[] a(String param0, int param1, String param2, bc param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param3.a(123, param2);
        var5 = param3.a(var4, (byte) 106, param0);
        if (param1 != 0) {
          return null;
        } else {
          return um.a(var4, param3, var5, param1 + -84);
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int stackIn_27_0 = 0;
        int stackOut_25_0 = 0;
        if (param1 == -1) {
          var5 = dn.a(param0, true);
          if ((param2.indexOf(param0) ^ -1) == 0) {
            if (-1 == param2.indexOf(var5)) {
              if (!param2.startsWith(param0)) {
                if (!param2.startsWith(var5)) {
                  if (!param2.endsWith(param0)) {
                    if (param2.endsWith(var5)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    return stackIn_27_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_g = null;
          var4 = dn.a(param0, true);
          var3 = var4;
          if ((param2.indexOf(param0) ^ -1) == 0) {
            if (-1 == param2.indexOf(var4)) {
              if (!param2.startsWith(param0)) {
                if (!param2.startsWith(var4)) {
                  if (!param2.endsWith(param0)) {
                    if (!param2.endsWith(var4)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "RuneScape clan";
    }
}
