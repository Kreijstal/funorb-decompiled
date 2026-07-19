/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int field_c;
    static vj field_b;
    static String field_d;
    private int[] field_a;

    public static void a(boolean param0) {
        if (!param0) {
            field_d = (String) null;
            field_d = null;
            field_b = null;
            return;
        }
        field_d = null;
        field_b = null;
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        var6 = client.field_A ? 1 : 0;
        var3 = -1 + (this.field_a.length >> 1043895585);
        if (param0 == -68) {
          var4 = var3 & param1;
          L0: while (true) {
            L1: {
              var5 = this.field_a[1 + (var4 + var4)];
              if (0 != (var5 ^ -1)) {
                stackOut_6_0 = this.field_a[var4 - -var4];
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_4_0 = -1;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  return stackIn_5_0;
                }
              }
            }
            if (stackIn_7_0 == param1) {
              return var5;
            } else {
              var4 = 1 + var4 & var3;
              continue L0;
            }
          }
        } else {
          return 51;
        }
    }

    final static ij[] a(byte param0) {
        if (param0 != 27) {
          oc.a(false);
          return new ij[]{ah.field_f, ge.field_g, hn.field_c};
        } else {
          return new ij[]{ah.field_f, ge.field_g, hn.field_c};
        }
    }

    oc(int[] param0) {
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
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int > param0.length + (param0.length >> -1972935807)) {
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
                this.field_a = new int[var2_int - -var2_int];
                break L2;
              }
              var3 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int + var2_int <= var3) {
                      break L6;
                    } else {
                      this.field_a[var3] = -1;
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
                  if (var3 >= param0.length) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      var4 = param0[var3] & -1 + var2_int;
                      L8: while (true) {
                        L9: {
                          if (-1 == this.field_a[var4 - (-var4 + -1)]) {
                            this.field_a[var4 + var4] = param0[var3];
                            this.field_a[1 + var4 + var4] = var3;
                            var3++;
                            break L9;
                          } else {
                            var4 = -1 + var2_int & var4 - -1;
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
            stackOut_21_1 = new StringBuilder().append("oc.<init>(");
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
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    static {
        field_d = "Confirm Email:";
    }
}
