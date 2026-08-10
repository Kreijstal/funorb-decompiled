/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_b;
    static int[] field_c;
    private int[] field_d;
    static int field_a;

    public static void a(boolean param0) {
        if (param0) {
            field_c = (int[]) null;
        }
        field_c = null;
        field_b = null;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = -1 + (this.field_d.length >> -1402369503);
        var4 = var3 & param1;
        if (param0 == 0) {
          L0: while (true) {
            var5 = this.field_d[var4 + var4 - -1];
            if ((var5 ^ -1) == 0) {
              return -1;
            } else {
              if (param1 != this.field_d[var4 - -var4]) {
                var4 = 1 + var4 & var3;
                continue L0;
              } else {
                return var5;
              }
            }
          }
        } else {
          return -32;
        }
    }

    final static void a(hf param0, byte param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= al.field_p) {
                    dupTemp$0 = param0.a(1910696752);
                    SolKnight.field_K[dupTemp$0] = SolKnight.field_K[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= al.field_p) {
                        var4 = -52 / ((param1 - -2) / 59);
                        al.field_p = var2_int;
                        fieldTemp$1 = al.field_p;
                        al.field_p = al.field_p + 1;
                        kc.field_K[fieldTemp$1] = param0;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (kc.field_K[var3].field_i == param0.field_i) {
                              var4 = kc.field_K[var3].a(1910696752);
                              if (i.field_K >= SolKnight.field_K[var4]) {
                                break L5;
                              } else {
                                SolKnight.field_K[var4] = SolKnight.field_K[var4] - 1;
                                break L4;
                              }
                            } else {
                              break L5;
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          kc.field_K[incrementValue$2] = kc.field_K[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (kc.field_K[var2_int].field_i != param0.field_i) {
                        break L6;
                      } else {
                        dupTemp$3 = kc.field_K[var2_int].a(1910696752);
                        SolKnight.field_K[dupTemp$3] = SolKnight.field_K[dupTemp$3] + 1;
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                SolKnight.field_K[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("qg.A(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
    }

    qg(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if ((param0.length >> -996309951) + param0.length < var2_int) {
                this.field_d = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = param0[var3] & var2_int + -1;
                        L4: while (true) {
                          if (-1 == this.field_d[var4 + var4 + 1]) {
                            this.field_d[var4 + var4] = param0[var3];
                            this.field_d[1 + var4 + var4] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var2_int - 1 & 1 + var4;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_d[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("qg.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    static {
        field_b = "Create";
        field_a = -1;
    }
}
