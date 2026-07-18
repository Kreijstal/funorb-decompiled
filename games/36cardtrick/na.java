/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends la {
    byte field_u;
    static int[] field_q;
    int field_t;
    static String field_p;
    static w field_r;
    pb field_s;

    final byte[] b(boolean param0) {
        if (param0) {
          if (!((na) this).field_n) {
            if (((na) this).field_s.field_i < -((na) this).field_u + ((na) this).field_s.field_g.length) {
              throw new RuntimeException();
            } else {
              return ((na) this).field_s.field_g;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = Main.field_T;
        try {
          L0: {
            var5_int = param4 - -param2;
            var6 = param0 - -param3;
            if (param1 > 45) {
              L1: {
                if (vj.field_f >= param4) {
                  stackOut_5_0 = vj.field_f;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = param4;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_6_0;
                if (vj.field_h >= param0) {
                  stackOut_8_0 = vj.field_h;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = param0;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_9_0;
                if (vj.field_a > var5_int) {
                  stackOut_11_0 = var5_int;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = vj.field_a;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_12_0;
                if (vj.field_b <= var6) {
                  stackOut_14_0 = vj.field_b;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = var6;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              L5: {
                var10 = stackIn_15_0;
                if (param4 < vj.field_f) {
                  break L5;
                } else {
                  if (param4 >= vj.field_a) {
                    break L5;
                  } else {
                    var11 = param4 + var8 * vj.field_l;
                    var12 = 1 + (var10 - var8) >> 1;
                    L6: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L5;
                      } else {
                        vj.field_j[var11] = 16777215;
                        var11 = var11 + vj.field_l * 2;
                        continue L6;
                      }
                    }
                  }
                }
              }
              L7: {
                if (vj.field_h > param0) {
                  break L7;
                } else {
                  if (vj.field_b > var6) {
                    var11 = var7 + param0 * vj.field_l;
                    var12 = var9 + (1 + -var7) >> 1;
                    L8: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L7;
                      } else {
                        vj.field_j[var11] = 16777215;
                        var11 += 2;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (vj.field_f > var5_int) {
                  break L9;
                } else {
                  if (var5_int >= vj.field_a) {
                    break L9;
                  } else {
                    var11 = var5_int + vj.field_l * (var8 + (1 & var5_int - param4));
                    var12 = 1 - (-var10 - -var8) >> 1;
                    L10: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L9;
                      } else {
                        vj.field_j[var11] = 16777215;
                        var11 = var11 + vj.field_l * 2;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L11: {
                if (param0 < vj.field_h) {
                  break L11;
                } else {
                  if (vj.field_b > var6) {
                    var11 = var7 + (vj.field_l * var6 - -(-param0 + var6 & 1));
                    var12 = 1 + var9 + -var7 >> 1;
                    L12: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L11;
                      } else {
                        vj.field_j[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var5, "na.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int a(boolean param0) {
        if (null == ((na) this).field_s) {
          return 0;
        } else {
          if (param0) {
            na.c(true);
            return 100 * ((na) this).field_s.field_i / (((na) this).field_s.field_g.length - ((na) this).field_u);
          } else {
            return 100 * ((na) this).field_s.field_i / (((na) this).field_s.field_g.length - ((na) this).field_u);
          }
        }
    }

    public static void c(boolean param0) {
        field_r = null;
        field_p = null;
        if (param0) {
            field_q = null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    na() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Reload game";
    }
}
