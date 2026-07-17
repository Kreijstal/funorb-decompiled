/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static u field_d;
    private static int[] field_b;
    static int field_h;
    static ka[] field_f;
    static ka field_e;
    static ka[][] field_c;
    static boolean field_i;
    static String field_m;
    static String field_g;
    static int[] field_k;
    static int[] field_a;
    private static int[] field_l;
    static int field_n;
    static int field_j;

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        int var1 = -61;
        field_e = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_k = null;
        field_l = null;
        field_m = null;
        field_g = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[][] var17 = null;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_2_0 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param2;
            var5 = param3 + var4_int;
            if (param1 > 30) {
              L1: {
                var6 = 2048;
                if (var5 < var6) {
                  break L1;
                } else {
                  var5 = var5 - var6;
                  break L1;
                }
              }
              var7 = -1;
              var17 = pa.field_v[param0];
              var9 = s.field_i[param0];
              var13 = 0;
              var7 = var13;
              L2: while (true) {
                if (var9 <= var13) {
                  stackOut_32_0 = -1;
                  stackIn_33_0 = stackOut_32_0;
                  break L0;
                } else {
                  L3: {
                    var10 = 32 * var17[var13][0];
                    if (var10 < var6) {
                      break L3;
                    } else {
                      var10 = var10 - var6;
                      break L3;
                    }
                  }
                  L4: {
                    var11 = (var17[var13][1] - -1) * 32;
                    if (var6 <= var11) {
                      var11 = var11 - var6;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (var10 > var11) {
                        break L6;
                      } else {
                        if (var4_int > var5) {
                          break L6;
                        } else {
                          if (var10 > var5) {
                            break L5;
                          } else {
                            if (var4_int > var11) {
                              break L5;
                            } else {
                              stackOut_17_0 = var13;
                              stackIn_18_0 = stackOut_17_0;
                              return stackIn_18_0;
                            }
                          }
                        }
                      }
                    }
                    L7: {
                      if (var10 < var11) {
                        break L7;
                      } else {
                        if (var5 < var4_int) {
                          break L7;
                        } else {
                          L8: {
                            if (var5 >= var10) {
                              break L8;
                            } else {
                              if (var4_int > var11) {
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                          stackOut_24_0 = var13;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      }
                    }
                    if (var11 > var10) {
                      break L5;
                    } else {
                      if (var4_int >= var5) {
                        stackOut_29_0 = var13;
                        stackIn_30_0 = stackOut_29_0;
                        return stackIn_30_0;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var13++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 81;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var4, "ub.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_33_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{240, 240, 240, 240, 240, 240};
        field_h = 0;
        field_g = "Connection lost - attempting to reconnect";
        field_m = "EXCLUSIVE";
        field_c = new ka[3][2];
        field_n = -1;
        field_l = new int[]{96, 96, 96, 96, 96, 96};
        field_i = false;
        field_a = new int[]{field_l[0] + field_b[0] >> 1, field_l[1] + field_b[1] >> 1, field_l[2] + field_b[2] >> 1, field_l[3] - -field_b[3] >> 1, field_l[4] - -field_b[4] >> 1, field_b[5] + field_l[5] >> 1};
        field_j = 2;
        field_k = new int[]{-field_l[0] + field_b[0] >> 1, field_b[1] - field_l[1] >> 1, field_b[2] - field_l[2] >> 1, field_b[3] - field_l[3] >> 1, field_b[4] + -field_l[4] >> 1, field_b[5] - field_l[5] >> 1};
    }
}
