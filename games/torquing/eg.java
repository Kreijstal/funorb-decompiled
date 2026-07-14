/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends am {
    private int field_s;
    static int field_w;
    static int field_x;
    static la field_v;
    static long field_u;
    static String field_y;
    static la field_t;

    final void a(fj param0, int param1, int param2) {
        int var4 = param2;
        if (!(-1 != (var4 ^ -1))) {
            ((eg) this).field_s = param0.i(7088);
        }
        if (param1 != 35) {
            field_u = -102L;
        }
    }

    public eg() {
        super(0, true);
        ((eg) this).field_s = 585;
    }

    final static void a(int param0, int param1, fn param2, int param3, fn param4, boolean param5) {
        hn.field_z = param1;
        id.field_b = param4;
        aq.field_b = param3;
        ln.field_D = param0;
        kc.field_x = param2;
        if (!param5) {
            field_v = null;
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var8 = Torquing.field_u;
          if (param0 > 86) {
            break L0;
          } else {
            eg.b(-24);
            break L0;
          }
        }
        L1: {
          var13 = ((eg) this).field_l.a(param1, 25657);
          var12 = var13;
          var11 = var12;
          var10 = var11;
          var9 = var10;
          var3 = var9;
          if (!((eg) this).field_l.field_b) {
            break L1;
          } else {
            var4 = dp.field_a[param1];
            var5 = 0;
            L2: while (true) {
              if (var5 >= ci.field_c) {
                break L1;
              } else {
                L3: {
                  var6 = q.field_b[var5];
                  if (((eg) this).field_s >= var6) {
                    break L3;
                  } else {
                    if (var6 >= -((eg) this).field_s + 4096) {
                      break L3;
                    } else {
                      if (-((eg) this).field_s + 2048 >= var4) {
                        break L3;
                      } else {
                        if (2048 + ((eg) this).field_s <= var4) {
                          break L3;
                        } else {
                          L4: {
                            var7 = -var6 + 2048;
                            if (0 > var7) {
                              var9 = var3;
                              stackOut_11_0 = -var7;
                              stackIn_12_0 = stackOut_11_0;
                              break L4;
                            } else {
                              stackOut_10_0 = var7;
                              stackIn_12_0 = stackOut_10_0;
                              break L4;
                            }
                          }
                          var9 = var3;
                          var7 = stackIn_12_0;
                          var7 = var7 << 12;
                          var7 = var7 / (2048 + -((eg) this).field_s);
                          var9[var5] = -var7 + 4096;
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (var6 <= -((eg) this).field_s + 2048) {
                    break L5;
                  } else {
                    if (var6 >= 2048 + ((eg) this).field_s) {
                      break L5;
                    } else {
                      L6: {
                        var7 = -2048 + var4;
                        if (0 <= var7) {
                          stackOut_17_0 = var7;
                          stackIn_18_0 = stackOut_17_0;
                          break L6;
                        } else {
                          stackOut_16_0 = -var7;
                          stackIn_18_0 = stackOut_16_0;
                          break L6;
                        }
                      }
                      var7 = stackIn_18_0;
                      var7 = var7 - ((eg) this).field_s;
                      var7 = var7 << 12;
                      var9[var5] = var7 / (2048 - ((eg) this).field_s);
                      var5++;
                      continue L2;
                    }
                  }
                }
                L7: {
                  if (var4 < ((eg) this).field_s) {
                    break L7;
                  } else {
                    if (4096 + -((eg) this).field_s < var4) {
                      break L7;
                    } else {
                      L8: {
                        if (((eg) this).field_s > var6) {
                          break L8;
                        } else {
                          if (var6 > -((eg) this).field_s + 4096) {
                            break L8;
                          } else {
                            var13[var5] = 0;
                            var5++;
                            continue L2;
                          }
                        }
                      }
                      L9: {
                        var7 = 2048 - var4;
                        if (0 <= var7) {
                          stackOut_31_0 = var7;
                          stackIn_32_0 = stackOut_31_0;
                          break L9;
                        } else {
                          stackOut_30_0 = -var7;
                          stackIn_32_0 = stackOut_30_0;
                          break L9;
                        }
                      }
                      var7 = stackIn_32_0;
                      var7 = var7 << 12;
                      var7 = var7 / (-((eg) this).field_s + 2048);
                      var9[var5] = -var7 + 4096;
                      var5++;
                      continue L2;
                    }
                  }
                }
                L10: {
                  var7 = var6 + -2048;
                  if (-1 >= (var7 ^ -1)) {
                    stackOut_24_0 = var7;
                    stackIn_25_0 = stackOut_24_0;
                    break L10;
                  } else {
                    stackOut_23_0 = -var7;
                    stackIn_25_0 = stackOut_23_0;
                    break L10;
                  }
                }
                var7 = stackIn_25_0;
                var7 = var7 - ((eg) this).field_s;
                var7 = var7 << 12;
                var9[var5] = var7 / (-((eg) this).field_s + 2048);
                var5++;
                continue L2;
              }
            }
          }
        }
        var9 = var3;
        return var9;
    }

    public static void b(int param0) {
        if (param0 >= -17) {
            field_t = null;
        }
        field_v = null;
        field_y = null;
        field_t = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Achievements";
        field_u = 20000000L;
    }
}
