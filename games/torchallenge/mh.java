/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static rj field_b;
    static int field_a;
    static int[] field_d;
    static int[][] field_c;
    static aa field_e;
    static long field_f;

    final static ge[] a(int param0, lj param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var4 = param1.a(param3, -80);
        if (param0 <= 27) {
          var6 = null;
          mh.a((String) null, (byte) -125, 0.009368140250444412f);
          var5 = param1.a(var4, param2, (byte) 85);
          return m.a(param1, var4, (byte) 6, var5);
        } else {
          var5 = param1.a(var4, param2, (byte) 85);
          return m.a(param1, var4, (byte) 6, var5);
        }
    }

    final static void a(String param0, byte param1, float param2) {
        bg.field_G = param2;
        if (param1 != -125) {
            return;
        }
        sa.field_b = param0;
    }

    final static void a(int param0, byte[] param1, int[] param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        if (param4) {
          field_e = null;
          var5 = 0;
          L0: while (true) {
            if (vf.field_b.length <= var5) {
              return;
            } else {
              param3 = vf.field_b[var5];
              var6 = var5 << 1108340484;
              L1: while (true) {
                param3--;
                if (-1 == (param3 ^ -1)) {
                  var5++;
                  var5++;
                  continue L0;
                } else {
                  var6++;
                  param0 = k.field_e[var6];
                  param2[param1[param0]] = param2[param1[param0]] + 1;
                  k.field_e[param2[param1[param0]]] = param0;
                  continue L1;
                }
              }
            }
          }
        } else {
          var5 = 0;
          L2: while (true) {
            if (vf.field_b.length <= var5) {
              return;
            } else {
              param3 = vf.field_b[var5];
              var6 = var5 << 1108340484;
              L3: while (true) {
                param3--;
                if (-1 == (param3 ^ -1)) {
                  var5++;
                  var5++;
                  continue L2;
                } else {
                  var6++;
                  param0 = k.field_e[var6];
                  param2[param1[param0]] = param2[param1[param0]] + 1;
                  k.field_e[param2[param1[param0]]] = param0;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final static boolean a(String param0, boolean param1, String param2) {
        Object var4 = null;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        if (li.a((byte) -82, param2)) {
          return false;
        } else {
          if (!qf.a(-8503, param2)) {
            if (gi.a((byte) 57, param2)) {
              return false;
            } else {
              if (param0.length() == 0) {
                return true;
              } else {
                if (kc.a(param0, (byte) -52, param2)) {
                  return false;
                } else {
                  if (param1) {
                    if (bc.a((byte) -128, param2, param0)) {
                      return false;
                    } else {
                      L0: {
                        if (ja.a(param2, 119, param0)) {
                          stackOut_24_0 = 0;
                          stackIn_25_0 = stackOut_24_0;
                          break L0;
                        } else {
                          stackOut_23_0 = 1;
                          stackIn_25_0 = stackOut_23_0;
                          break L0;
                        }
                      }
                      return stackIn_25_0 != 0;
                    }
                  } else {
                    var4 = null;
                    ge[] discarded$4 = mh.a(66, (lj) null, (String) null, (String) null);
                    if (!bc.a((byte) -128, param2, param0)) {
                      if (!ja.a(param2, 119, param0)) {
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
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        int var1 = -79 % ((param0 - 6) / 35);
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new rj();
        field_d = new int[5];
        field_c = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[1], new int[1]};
    }
}
