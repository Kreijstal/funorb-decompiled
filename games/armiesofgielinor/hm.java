/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    cm field_g;
    private int field_k;
    int field_j;
    int[] field_a;
    static String field_e;
    int field_c;
    static String[] field_i;
    int[] field_b;
    int[] field_d;
    static jl field_h;
    static int[] field_l;
    static je field_f;

    public static void b() {
        field_f = null;
        field_l = null;
        field_e = null;
        field_i = null;
        field_h = null;
    }

    hm(vh param0, boolean param1) {
        this();
        try {
            int discarded$0 = this.a(param0, -2, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "hm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static int a(mo param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ni.field_d;
              if (param0.field_b != 2) {
                if (param0.field_b == 4) {
                  var2_int = fm.field_d[param0.field_b];
                  break L1;
                } else {
                  if (~oh.field_H == ~param0.field_n) {
                    var2_int = ag.field_A[param0.field_b];
                    break L1;
                  } else {
                    var2_int = fm.field_d[param0.field_b];
                    break L1;
                  }
                }
              } else {
                if (!param0.field_f) {
                  L2: {
                    if (0 != param0.field_a) {
                      break L2;
                    } else {
                      if (param0.field_e != 0) {
                        break L2;
                      } else {
                        var2_int = ag.field_A[param0.field_b];
                        break L1;
                      }
                    }
                  }
                  var2_int = fm.field_d[param0.field_b];
                  break L1;
                } else {
                  var2_int = ni.field_d;
                  break L1;
                }
              }
            }
            stackOut_13_0 = var2_int;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("hm.B(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + -5 + 41);
        }
        return stackIn_14_0;
    }

    final int a(byte param0) {
        if (param0 <= 44) {
            int discarded$0 = ((hm) this).a((byte) 121);
        }
        return -((hm) this).field_k + ((hm) this).field_c;
    }

    final boolean a(int param0, byte param1) {
        if (!(((hm) this).a((byte) 57) >= param0)) {
            return false;
        }
        ((hm) this).field_k = ((hm) this).field_k + param0;
        if (param1 != 103) {
            field_l = null;
            return true;
        }
        return true;
    }

    final int a(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = at.field_c.length;
        int var3 = ((hm) this).field_j + ((hm) this).field_c;
        for (var4 = param0; var4 < var2; var4++) {
            var5 = at.field_c[var4];
            var3 = var3 - var5;
            if (!(0 <= var3)) {
                return var4;
            }
        }
        return var2;
    }

    private final int a(vh param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = param0.k(0);
            if (9 >= var4_int) {
              L1: {
                if (var4_int >= 1) {
                  L2: {
                    L3: {
                      if (var4_int < 5) {
                        break L3;
                      } else {
                        if (!param2) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      if (~((hm) this).field_a.length >= ~var6) {
                        break L2;
                      } else {
                        ((hm) this).field_a[var6] = param0.k(0);
                        var6++;
                        continue L4;
                      }
                    }
                  }
                  var6 = 0;
                  L5: while (true) {
                    if (~((hm) this).field_d.length >= ~var6) {
                      ((hm) this).field_c = param0.i(1);
                      var6 = 0;
                      L6: while (true) {
                        if (7 <= var6) {
                          break L1;
                        } else {
                          ((hm) this).field_b[var6] = param0.e((byte) -104);
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      L7: {
                        ((hm) this).field_d[var6] = param0.e((byte) -104);
                        if (((hm) this).field_d[var6] >= 135) {
                          ((hm) this).field_d[var6] = -1;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var6++;
                      continue L5;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L8: {
                var5 = -1;
                if (6 <= var4_int) {
                  ((hm) this).field_k = param0.i(1);
                  ((hm) this).field_j = param0.i(1);
                  ((hm) this).field_g.a(var4_int, param0, -115);
                  break L8;
                } else {
                  var5 = param0.k(0);
                  ((hm) this).field_k = 0;
                  ((hm) this).field_j = 0;
                  var6 = 0;
                  L9: while (true) {
                    if (~var6 <= ~var5) {
                      break L8;
                    } else {
                      var7 = at.field_c[var6];
                      ((hm) this).field_j = ((hm) this).field_j + var7;
                      var6++;
                      continue L9;
                    }
                  }
                }
              }
              stackOut_25_0 = var4_int;
              stackIn_26_0 = stackOut_25_0;
              break L0;
            } else {
              throw new RuntimeException("Unrecognized version: " + var4_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("hm.F(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + -2 + 44 + param2 + 41);
        }
        return stackIn_26_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        as.field_E.a(param5, -20500, 640, 0, 5);
        if (qd.field_I != null) {
            qd.field_I.b(param1, param3, param5, -kn.field_z + param1, param5, -6519);
        }
    }

    private hm() {
        int var1 = 0;
        ((hm) this).field_k = 0;
        ((hm) this).field_a = new int[135];
        ((hm) this).field_b = new int[7];
        ((hm) this).field_c = 0;
        ((hm) this).field_j = 0;
        ((hm) this).field_d = new int[5];
        for (var1 = 0; 5 > var1; var1++) {
            ((hm) this).field_d[var1] = -1;
        }
        int var3 = 0;
        var1 = var3;
        while (135 > var3) {
            ((hm) this).field_a[var3] = 0;
            var3++;
        }
        ((hm) this).field_g = new cm();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"Full health", "1/2 health", "1/3 health", "1/4 health", "1/5 health", "1/6 health"};
        field_e = "Are You Sure?";
        field_l = new int[]{0, 0, 536870912, 553634816, 544700415};
        field_h = new jl();
    }
}
