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
        if (param0 != 1) {
            field_a = 112;
            return vb.field_m.field_Rb;
        }
        return vb.field_m.field_Rb;
    }

    public static void a(int param0) {
        if (param0 != 28882) {
          hh.a((byte) -23, -113);
          field_b = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_f = null;
          return;
        }
    }

    final static short a(byte param0, int param1) {
        float stackIn_7_0 = 0.0f;
        float stackIn_14_0 = 0.0f;
        float stackIn_34_0 = 0.0f;
        short stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            L1: {
              var2_float = (float)((param1 & 16711680) >> -952290864) / 255.0f;
              var3 = (float)((param1 & 65280) >> -64701304) / 255.0f;
              var4 = (float)(255 & param1) / 255.0f;
              if (var3 < var2_float) {
                if (var4 >= var2_float) {
                  stackIn_7_0 = var4;
                  break L1;
                } else {
                  stackIn_7_0 = var2_float;
                  break L1;
                }
              } else {
                if (var3 <= var4) {
                  stackIn_7_0 = var4;
                  break L1;
                } else {
                  stackIn_7_0 = var3;
                  break L1;
                }
              }
            }
            L2: {
              var5 = stackIn_7_0;
              var7 = 105 % ((param0 - -62) / 40);
              if (var2_float < var3) {
                if (var2_float >= var4) {
                  stackIn_14_0 = var4;
                  break L2;
                } else {
                  stackIn_14_0 = var2_float;
                  break L2;
                }
              } else {
                if (var3 < var4) {
                  stackIn_14_0 = var3;
                  break L2;
                } else {
                  stackIn_14_0 = var4;
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
                              stackIn_34_0 = (var5 - var6) / (2.0f * var10);
                              break L6;
                            } else {
                              stackIn_34_0 = (-var6 + var5) / (-(2.0f * var10) + 2.0f);
                              break L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      stackIn_34_0 = 0.0f;
                      break L6;
                    }
                    var9 = stackIn_34_0;
                    var11 = (int)(var8 * 63.0f + 0.5f);
                    var12 = (int)(0.5f + var9 * 7.0f);
                    var13 = (int)(0.5f + var10 * 127.0f);
                    stackIn_35_0 = (short)(var12 << 453553511 | var11 << -822924790 | var13);
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
          throw wm.a((Throwable) ((Object) var2), "hh.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_35_0;
    }

    static {
        field_c = true;
        field_a = 0;
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_d = "Unrated game";
    }
}
