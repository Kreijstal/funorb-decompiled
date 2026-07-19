/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static java.awt.Color field_a;
    private int[] field_b;
    static String field_d;
    static String[] field_c;

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 18260) {
            field_d = (String) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        if (!ms.field_a) {
            throw new IllegalStateException();
        }
        pu.field_m = true;
        jv.a(true, false);
        jv.field_a = param0;
    }

    bf(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
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
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if ((param0.length >> -875845535) + param0.length < var2_int) {
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
                this.field_b = new int[var2_int + var2_int];
                break L2;
              }
              var3 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int + var2_int <= var3) {
                      break L6;
                    } else {
                      this.field_b[var3] = -1;
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
                      var4 = param0[var3] & var2_int - 1;
                      L8: while (true) {
                        L9: {
                          if (-1 == this.field_b[1 + (var4 + var4)]) {
                            this.field_b[var4 - -var4] = param0[var3];
                            this.field_b[var4 + (var4 - -1)] = var3;
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
            stackOut_21_1 = new StringBuilder().append("bf.<init>(");
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
          throw qo.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = -116 % ((param1 - 32) / 48);
        var3 = -1 + (this.field_b.length >> -1234307775);
        var5 = var3 & param0;
        L0: while (true) {
          var6 = this.field_b[var5 + (var5 - -1)];
          if (var6 == -1) {
            return -1;
          } else {
            if (param0 == this.field_b[var5 + var5]) {
              return var6;
            } else {
              var5 = var3 & 1 + var5;
              continue L0;
            }
          }
        }
    }

    static {
        field_a = new java.awt.Color(10040319);
    }
}
