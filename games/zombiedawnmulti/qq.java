/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq {
    static cj field_b;
    static cj field_c;
    static boolean field_h;
    private int[] field_e;
    static String field_g;
    static String field_d;
    static int field_a;
    static cj field_f;

    qq(int[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int > param0.length - -(param0.length >> -723639551)) {
                    break L3;
                  } else {
                    var2_int = var2_int << 1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_e = new int[var2_int + var2_int];
                break L2;
              }
              var3 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var3 >= var2_int + var2_int) {
                      break L6;
                    } else {
                      this.field_e[var3] = -1;
                      var3++;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var3 = 0;
                  break L5;
                }
                L7: while (true) {
                  if (param0.length <= var3) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      var4 = param0[var3] & -1 + var2_int;
                      L8: while (true) {
                        L9: {
                          if (0 == (this.field_e[var4 + var4 + 1] ^ -1)) {
                            this.field_e[var4 + var4] = param0[var3];
                            this.field_e[var4 + (var4 - -1)] = var3;
                            var3++;
                            break L9;
                          } else {
                            var4 = var4 - -1 & var2_int - 1;
                            if (var5 != 0) {
                              break L9;
                            } else {
                              continue L8;
                            }
                          }
                        }
                        continue L7;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("qq.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 21) {
            return;
        }
        field_c = null;
        field_g = null;
        field_f = null;
        field_b = null;
    }

    final int a(int param0, int param1) {
        uj discarded$5 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == 1481485697) {
          var3 = (this.field_e.length >> 1481485697) + -1;
          var4 = var3 & param1;
          L0: while (true) {
            L1: {
              var5 = this.field_e[1 + (var4 + var4)];
              if (-1 != var5) {
                stackOut_13_0 = param1 ^ -1;
                stackIn_14_0 = stackOut_13_0;
                break L1;
              } else {
                stackOut_11_0 = -1;
                stackIn_14_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  return stackIn_12_0;
                }
              }
            }
            if (stackIn_14_0 != (this.field_e[var4 - -var4] ^ -1)) {
              var4 = 1 + var4 & var3;
              continue L0;
            } else {
              return var5;
            }
          }
        } else {
          discarded$5 = qq.b(81, 106);
          var3 = (this.field_e.length >> 1481485697) + -1;
          var4 = var3 & param1;
          L2: while (true) {
            L3: {
              var5 = this.field_e[1 + (var4 + var4)];
              if (-1 != var5) {
                stackOut_5_0 = param1 ^ -1;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_3_0 = -1;
                stackIn_6_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (var6 != 0) {
                  break L3;
                } else {
                  return stackIn_4_0;
                }
              }
            }
            if (stackIn_6_0 != (this.field_e[var4 - -var4] ^ -1)) {
              var4 = 1 + var4 & var3;
              continue L2;
            } else {
              return var5;
            }
          }
        }
    }

    final static uj b(int param0, int param1) {
        wj var2 = null;
        if (df.field_H) {
          if (4 <= jp.field_c.a(param0 ^ param0)) {
            return null;
          } else {
            var2 = new wj(param1);
            jp.field_c.a(var2, false);
            return var2.field_m;
          }
        } else {
          return null;
        }
    }

    static {
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_h = false;
        field_d = "Close";
    }
}
