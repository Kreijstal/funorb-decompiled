/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static int field_a;
    static dd[] field_f;
    static boolean field_c;
    static String field_d;
    static String field_b;
    static int field_e;

    final static vh a(byte param0) {
        return vb.field_m.field_Rb;
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_f = null;
    }

    final static short a(byte param0, int param1) {
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        float stackIn_7_0 = 0.0f;
        float stackIn_14_0 = 0.0f;
        float stackIn_34_0 = 0.0f;
        short stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
        float stackOut_6_0 = 0.0f;
        float stackOut_5_0 = 0.0f;
        float stackOut_3_0 = 0.0f;
        float stackOut_2_0 = 0.0f;
        float stackOut_13_0 = 0.0f;
        float stackOut_12_0 = 0.0f;
        float stackOut_10_0 = 0.0f;
        float stackOut_9_0 = 0.0f;
        float stackOut_33_0 = 0.0f;
        float stackOut_32_0 = 0.0f;
        float stackOut_30_0 = 0.0f;
        short stackOut_34_0 = 0;
        try {
          L0: {
            L1: {
              var2_float = (float)((param1 & 16711680) >> 16) / 255.0f;
              var3 = (float)((param1 & 65280) >> 8) / 255.0f;
              var4 = (float)(255 & param1) / 255.0f;
              if (var3 < var2_float) {
                if (var4 >= var2_float) {
                  stackOut_6_0 = var4;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = var2_float;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              } else {
                if (var3 <= var4) {
                  stackOut_3_0 = var4;
                  stackIn_7_0 = stackOut_3_0;
                  break L1;
                } else {
                  stackOut_2_0 = var3;
                  stackIn_7_0 = stackOut_2_0;
                  break L1;
                }
              }
            }
            L2: {
              var5 = stackIn_7_0;
              var7 = 105 % ((param0 - -62) / 40);
              if (var2_float < var3) {
                if (var2_float >= var4) {
                  stackOut_13_0 = var4;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_12_0 = var2_float;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
              } else {
                if (var3 < var4) {
                  stackOut_10_0 = var3;
                  stackIn_14_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = var4;
                  stackIn_14_0 = stackOut_9_0;
                  break L2;
                }
              }
            }
            L3: {
              var6 = stackIn_14_0;
              if (var6 == var5) {
                var8 = 0.0f;
                break L3;
              } else {
                if (var5 != var2_float) {
                  if (var3 != var5) {
                    var8 = 4.0f + (var2_float - var3) / (var5 - var6);
                    break L3;
                  } else {
                    var8 = 2.0f + (-var2_float + var4) / (-var6 + var5);
                    break L3;
                  }
                } else {
                  var8 = (var3 - var4) / (-var6 + var5);
                  break L3;
                }
              }
            }
            var8 = var8 / 6.0f;
            L4: while (true) {
              if (var8 >= 0.0f) {
                var10 = (var5 + var6) / 2.0f;
                L5: while (true) {
                  if (var8 <= 1.0f) {
                    L6: {
                      L7: {
                        if (var10 == 0.0f) {
                          break L7;
                        } else {
                          if (var5 != var6) {
                            if (0.5f > var10) {
                              stackOut_33_0 = (var5 - var6) / (2.0f * var10);
                              stackIn_34_0 = stackOut_33_0;
                              break L6;
                            } else {
                              stackOut_32_0 = (-var6 + var5) / (-(2.0f * var10) + 2.0f);
                              stackIn_34_0 = stackOut_32_0;
                              break L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      stackOut_30_0 = 0.0f;
                      stackIn_34_0 = stackOut_30_0;
                      break L6;
                    }
                    var9 = stackIn_34_0;
                    var11 = (int)(var8 * 63.0f + 0.5f);
                    var12 = (int)(0.5f + var9 * 7.0f);
                    var13 = (int)(0.5f + var10 * 127.0f);
                    stackOut_34_0 = (short)(var12 << 7 | var11 << 10 | var13);
                    stackIn_35_0 = stackOut_34_0;
                    break L0;
                  } else {
                    var8 = var8 - 1.0f;
                    continue L5;
                  }
                }
              } else {
                var8 = var8 + 1.0f;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "hh.B(" + param0 + 44 + param1 + 41);
        }
        return stackIn_35_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
        field_a = 0;
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_d = "Unrated game";
    }
}
