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
          short discarded$2 = hh.a((byte) -23, -113);
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
        float var2 = 0.0f;
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
        float stackIn_28_0 = 0.0f;
        float stackIn_44_0 = 0.0f;
        float stackIn_56_0 = 0.0f;
        float stackIn_63_0 = 0.0f;
        float stackIn_77_0 = 0.0f;
        float stackOut_6_0 = 0.0f;
        float stackOut_5_0 = 0.0f;
        float stackOut_3_0 = 0.0f;
        float stackOut_2_0 = 0.0f;
        float stackOut_13_0 = 0.0f;
        float stackOut_12_0 = 0.0f;
        float stackOut_10_0 = 0.0f;
        float stackOut_9_0 = 0.0f;
        float stackOut_73_0 = 0.0f;
        float stackOut_76_0 = 0.0f;
        float stackOut_75_0 = 0.0f;
        float stackOut_62_0 = 0.0f;
        float stackOut_61_0 = 0.0f;
        float stackOut_54_0 = 0.0f;
        float stackOut_43_0 = 0.0f;
        float stackOut_42_0 = 0.0f;
        float stackOut_40_0 = 0.0f;
        float stackOut_27_0 = 0.0f;
        float stackOut_26_0 = 0.0f;
        float stackOut_24_0 = 0.0f;
        L0: {
          var2 = (float)((param1 & 16711680) >> -952290864) / 255.0f;
          var3 = (float)((param1 & 65280) >> -64701304) / 255.0f;
          var4 = (float)(255 & param1) / 255.0f;
          if (var3 < var2) {
            if (var4 >= var2) {
              stackOut_6_0 = var4;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_5_0 = var2;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            }
          } else {
            if (var3 <= var4) {
              stackOut_3_0 = var4;
              stackIn_7_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = var3;
              stackIn_7_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        L1: {
          var5 = stackIn_7_0;
          var7 = 105 % ((param0 - -62) / 40);
          if (var2 < var3) {
            if (var2 >= var4) {
              stackOut_13_0 = var4;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = var2;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          } else {
            if (var3 < var4) {
              stackOut_10_0 = var3;
              stackIn_14_0 = stackOut_10_0;
              break L1;
            } else {
              stackOut_9_0 = var4;
              stackIn_14_0 = stackOut_9_0;
              break L1;
            }
          }
        }
        var6 = stackIn_14_0;
        if (var6 == var5) {
          var8 = 0.0f;
          var8 = var8 / 6.0f;
          L2: while (true) {
            if (var8 >= 0.0f) {
              var10 = (var5 + var6) / 2.0f;
              L3: while (true) {
                if (var8 <= 1.0f) {
                  L4: {
                    if (var10 == 0.0f) {
                      stackOut_73_0 = 0.0f;
                      stackIn_77_0 = stackOut_73_0;
                      break L4;
                    } else {
                      if (var5 != var6) {
                        if (0.5f > var10) {
                          stackOut_76_0 = (var5 - var6) / (2.0f * var10);
                          stackIn_77_0 = stackOut_76_0;
                          break L4;
                        } else {
                          stackOut_75_0 = (-var6 + var5) / (-(2.0f * var10) + 2.0f);
                          stackIn_77_0 = stackOut_75_0;
                          break L4;
                        }
                      } else {
                        var9 = 0.0f;
                        var11 = (int)(var8 * 63.0f + 0.5f);
                        var12 = (int)(0.5f + var9 * 7.0f);
                        var13 = (int)(0.5f + var10 * 127.0f);
                        return (short)(var12 << 453553511 | var11 << -822924790 | var13);
                      }
                    }
                  }
                  var9 = stackIn_77_0;
                  var11 = (int)(var8 * 63.0f + 0.5f);
                  var12 = (int)(0.5f + var9 * 7.0f);
                  var13 = (int)(0.5f + var10 * 127.0f);
                  return (short)(var12 << 453553511 | var11 << -822924790 | var13);
                } else {
                  var8 = var8 - 1.0f;
                  continue L3;
                }
              }
            } else {
              var8 = var8 + 1.0f;
              continue L2;
            }
          }
        } else {
          if (var5 != var2) {
            if (var3 != var5) {
              var8 = 4.0f + (var2 - var3) / (var5 - var6);
              var8 = var8 / 6.0f;
              L5: while (true) {
                if (var8 >= 0.0f) {
                  var10 = (var5 + var6) / 2.0f;
                  L6: while (true) {
                    if (var8 <= 1.0f) {
                      if (var10 != 0.0f) {
                        if (var5 != var6) {
                          L7: {
                            if (0.5f > var10) {
                              stackOut_62_0 = (var5 - var6) / (2.0f * var10);
                              stackIn_63_0 = stackOut_62_0;
                              break L7;
                            } else {
                              stackOut_61_0 = (-var6 + var5) / (-(2.0f * var10) + 2.0f);
                              stackIn_63_0 = stackOut_61_0;
                              break L7;
                            }
                          }
                          var9 = stackIn_63_0;
                          var11 = (int)(var8 * 63.0f + 0.5f);
                          var12 = (int)(0.5f + var9 * 7.0f);
                          var13 = (int)(0.5f + var10 * 127.0f);
                          return (short)(var12 << 453553511 | var11 << -822924790 | var13);
                        } else {
                          var9 = 0.0f;
                          var11 = (int)(var8 * 63.0f + 0.5f);
                          var12 = (int)(0.5f + var9 * 7.0f);
                          var13 = (int)(0.5f + var10 * 127.0f);
                          return (short)(var12 << 453553511 | var11 << -822924790 | var13);
                        }
                      } else {
                        stackOut_54_0 = 0.0f;
                        stackIn_56_0 = stackOut_54_0;
                        var9 = stackIn_56_0;
                        var11 = (int)(var8 * 63.0f + 0.5f);
                        var12 = (int)(0.5f + var9 * 7.0f);
                        var13 = (int)(0.5f + var10 * 127.0f);
                        return (short)(var12 << 453553511 | var11 << -822924790 | var13);
                      }
                    } else {
                      var8 = var8 - 1.0f;
                      continue L6;
                    }
                  }
                } else {
                  var8 = var8 + 1.0f;
                  continue L5;
                }
              }
            } else {
              var8 = 2.0f + (-var2 + var4) / (-var6 + var5);
              var8 = var8 / 6.0f;
              L8: while (true) {
                if (var8 >= 0.0f) {
                  var10 = (var5 + var6) / 2.0f;
                  L9: while (true) {
                    if (var8 <= 1.0f) {
                      if (var10 == 0.0f) {
                        var9 = 0.0f;
                        var11 = (int)(var8 * 63.0f + 0.5f);
                        var12 = (int)(0.5f + var9 * 7.0f);
                        var13 = (int)(0.5f + var10 * 127.0f);
                        return (short)(var12 << 453553511 | var11 << -822924790 | var13);
                      } else {
                        L10: {
                          if (var5 != var6) {
                            if (0.5f > var10) {
                              stackOut_43_0 = (var5 - var6) / (2.0f * var10);
                              stackIn_44_0 = stackOut_43_0;
                              break L10;
                            } else {
                              stackOut_42_0 = (-var6 + var5) / (-(2.0f * var10) + 2.0f);
                              stackIn_44_0 = stackOut_42_0;
                              break L10;
                            }
                          } else {
                            stackOut_40_0 = 0.0f;
                            stackIn_44_0 = stackOut_40_0;
                            break L10;
                          }
                        }
                        var9 = stackIn_44_0;
                        var11 = (int)(var8 * 63.0f + 0.5f);
                        var12 = (int)(0.5f + var9 * 7.0f);
                        var13 = (int)(0.5f + var10 * 127.0f);
                        return (short)(var12 << 453553511 | var11 << -822924790 | var13);
                      }
                    } else {
                      var8 = var8 - 1.0f;
                      continue L9;
                    }
                  }
                } else {
                  var8 = var8 + 1.0f;
                  continue L8;
                }
              }
            }
          } else {
            var8 = (var3 - var4) / (-var6 + var5);
            var8 = var8 / 6.0f;
            L11: while (true) {
              if (var8 >= 0.0f) {
                var10 = (var5 + var6) / 2.0f;
                L12: while (true) {
                  if (var8 <= 1.0f) {
                    if (var10 == 0.0f) {
                      var9 = 0.0f;
                      var11 = (int)(var8 * 63.0f + 0.5f);
                      var12 = (int)(0.5f + var9 * 7.0f);
                      var13 = (int)(0.5f + var10 * 127.0f);
                      return (short)(var12 << 453553511 | var11 << -822924790 | var13);
                    } else {
                      L13: {
                        if (var5 != var6) {
                          if (0.5f > var10) {
                            stackOut_27_0 = (var5 - var6) / (2.0f * var10);
                            stackIn_28_0 = stackOut_27_0;
                            break L13;
                          } else {
                            stackOut_26_0 = (-var6 + var5) / (-(2.0f * var10) + 2.0f);
                            stackIn_28_0 = stackOut_26_0;
                            break L13;
                          }
                        } else {
                          stackOut_24_0 = 0.0f;
                          stackIn_28_0 = stackOut_24_0;
                          break L13;
                        }
                      }
                      var9 = stackIn_28_0;
                      var11 = (int)(var8 * 63.0f + 0.5f);
                      var12 = (int)(0.5f + var9 * 7.0f);
                      var13 = (int)(0.5f + var10 * 127.0f);
                      return (short)(var12 << 453553511 | var11 << -822924790 | var13);
                    }
                  } else {
                    var8 = var8 - 1.0f;
                    continue L12;
                  }
                }
              } else {
                var8 = var8 + 1.0f;
                continue L11;
              }
            }
          }
        }
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
