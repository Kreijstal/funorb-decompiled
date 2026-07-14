/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aha extends rqa {
    static llb field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(80, 62, param0[0].a(109));
          return new nc((Object) (Object) "void");
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var13 = VoidHunters.field_G;
          var5 = param2 - -param1;
          var6 = param3 + param0;
          if (param2 <= dma.field_d) {
            stackOut_2_0 = dma.field_d;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (dma.field_c < param0) {
            stackOut_5_0 = param0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = dma.field_c;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (param4 < -41) {
            break L2;
          } else {
            aha.a(110);
            break L2;
          }
        }
        L3: {
          if (dma.field_a <= var5) {
            stackOut_10_0 = dma.field_a;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = var5;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var9 = stackIn_11_0;
          if (var6 < dma.field_f) {
            stackOut_13_0 = var6;
            stackIn_14_0 = stackOut_13_0;
            break L4;
          } else {
            stackOut_12_0 = dma.field_f;
            stackIn_14_0 = stackOut_12_0;
            break L4;
          }
        }
        L5: {
          var10 = stackIn_14_0;
          if (param2 < dma.field_d) {
            break L5;
          } else {
            if (dma.field_a > param2) {
              var11 = dma.field_g * var8 + param2;
              var12 = 1 - -var10 - var8 >> 1511754497;
              L6: while (true) {
                var12--;
                if (0 > var12) {
                  break L5;
                } else {
                  dma.field_i[var11] = 16777215;
                  var11 = var11 + 2 * dma.field_g;
                  continue L6;
                }
              }
            } else {
              L7: {
                if (dma.field_c > param0) {
                  break L7;
                } else {
                  if (var6 >= dma.field_f) {
                    break L7;
                  } else {
                    var11 = dma.field_g * param0 - -var7;
                    var12 = var9 + 1 + -var7 >> 3870017;
                    L8: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L7;
                      } else {
                        dma.field_i[var11] = 16777215;
                        var11 += 2;
                        continue L8;
                      }
                    }
                  }
                }
              }
              L9: {
                if (var5 < dma.field_d) {
                  break L9;
                } else {
                  if (var5 >= dma.field_a) {
                    break L9;
                  } else {
                    var11 = (var8 + (var5 - param2 & 1)) * dma.field_g - -var5;
                    var12 = 1 - (-var10 + var8) >> -103082367;
                    L10: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L9;
                      } else {
                        dma.field_i[var11] = 16777215;
                        var11 = var11 + dma.field_g * 2;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L11: {
                if (dma.field_c > param0) {
                  break L11;
                } else {
                  if (dma.field_f > var6) {
                    var11 = dma.field_g * var6 + var7 - -(1 & -param0 + var6);
                    var12 = -var7 + (1 + var9) >> 1587813313;
                    L12: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L11;
                      } else {
                        dma.field_i[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  } else {
                    break L11;
                  }
                }
              }
              return;
            }
          }
        }
        L13: {
          if (dma.field_c > param0) {
            break L13;
          } else {
            if (var6 >= dma.field_f) {
              break L13;
            } else {
              var11 = dma.field_g * param0 - -var7;
              var12 = var9 + 1 + -var7 >> 3870017;
              L14: while (true) {
                var12--;
                if (0 > var12) {
                  break L13;
                } else {
                  dma.field_i[var11] = 16777215;
                  var11 += 2;
                  continue L14;
                }
              }
            }
          }
        }
        L15: {
          if (var5 < dma.field_d) {
            break L15;
          } else {
            if (var5 >= dma.field_a) {
              break L15;
            } else {
              var11 = (var8 + (var5 - param2 & 1)) * dma.field_g - -var5;
              var12 = 1 - (-var10 + var8) >> -103082367;
              L16: while (true) {
                var12--;
                if (0 > var12) {
                  break L15;
                } else {
                  dma.field_i[var11] = 16777215;
                  var11 = var11 + dma.field_g * 2;
                  continue L16;
                }
              }
            }
          }
        }
        if (dma.field_c <= param0) {
          if (dma.field_f <= var6) {
            return;
          } else {
            var11 = dma.field_g * var6 + var7 - -(1 & -param0 + var6);
            var12 = -var7 + (1 + var9) >> 1587813313;
            L17: while (true) {
              var12--;
              if (0 > var12) {
                return;
              } else {
                dma.field_i[var11] = 16777215;
                var11 += 2;
                continue L17;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 1511754497) {
            aha.a(-121, 80, -93, -27, (byte) -68);
        }
    }

    aha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
