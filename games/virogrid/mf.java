/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends hm {
    private long[] field_k;
    static int field_h;
    static String field_d;
    private int field_e;
    private long field_g;
    private long field_n;
    private long field_l;
    static km field_j;
    static String field_f;
    private int field_m;
    static String field_i;

    public static void f() {
        field_i = null;
        int var1 = -31;
        field_j = null;
        field_f = null;
        field_d = null;
    }

    final void d(int param0) {
        if (param0 != 110) {
          return;
        } else {
          L0: {
            ((mf) this).field_l = 0L;
            if (~((mf) this).field_n >= ~((mf) this).field_g) {
              break L0;
            } else {
              ((mf) this).field_g = ((mf) this).field_g + (-((mf) this).field_g + ((mf) this).field_n);
              break L0;
            }
          }
          return;
        }
    }

    final static void e(int param0) {
        if (param0 != 1) {
            return;
        }
        int discarded$0 = 111;
        tn.a();
        co.a(0);
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    private final long b() {
        long var2 = 0L;
        int var4 = 0;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = Virogrid.field_F ? 1 : 0;
        var4 = 1;
        var2 = System.nanoTime();
        var5 = -((mf) this).field_l + var2;
        ((mf) this).field_l = var2;
        if (-5000000000L < var5) {
          if (var5 < 5000000000L) {
            ((mf) this).field_k[((mf) this).field_e] = var5;
            ((mf) this).field_e = (1 + ((mf) this).field_e) % 10;
            if (((mf) this).field_m >= 1) {
              var7 = 0L;
              var9 = 1;
              L0: while (true) {
                if (((mf) this).field_m < var9) {
                  return var7 / (long)((mf) this).field_m;
                } else {
                  var7 = var7 + ((mf) this).field_k[(-var9 + (((mf) this).field_e - -10)) % 10];
                  var9++;
                  continue L0;
                }
              }
            } else {
              ((mf) this).field_m = ((mf) this).field_m + 1;
              var7 = 0L;
              var9 = 1;
              L1: while (true) {
                if (((mf) this).field_m < var9) {
                  return var7 / (long)((mf) this).field_m;
                } else {
                  var7 = var7 + ((mf) this).field_k[(-var9 + (((mf) this).field_e - -10)) % 10];
                  var9++;
                  continue L1;
                }
              }
            }
          } else {
            var7 = 0L;
            var9 = 1;
            L2: while (true) {
              if (((mf) this).field_m < var9) {
                return var7 / (long)((mf) this).field_m;
              } else {
                var7 = var7 + ((mf) this).field_k[(-var9 + (((mf) this).field_e - -10)) % 10];
                var9++;
                continue L2;
              }
            }
          }
        } else {
          var7 = 0L;
          var9 = 1;
          L3: while (true) {
            if (((mf) this).field_m < var9) {
              return var7 / (long)((mf) this).field_m;
            } else {
              var7 = var7 + ((mf) this).field_k[(-var9 + (((mf) this).field_e - -10)) % 10];
              var9++;
              continue L3;
            }
          }
        }
    }

    final long a(byte param0) {
        int discarded$0 = 106;
        ((mf) this).field_g = ((mf) this).field_g + this.b();
        if (param0 != -84) {
            return -57L;
        }
        if (!(((mf) this).field_n <= ((mf) this).field_g)) {
            return (-((mf) this).field_g + ((mf) this).field_n) / 1000000L;
        }
        return 0L;
    }

    final static boolean a(int param0, int param1) {
        if (param0 <= 82) {
            field_h = -97;
            return param1 >= 0 ? true : false;
        }
        return param1 >= 0 ? true : false;
    }

    final int a(byte param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        if (param0 == -103) {
          if (~((mf) this).field_n >= ~((mf) this).field_g) {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((mf) this).field_n = ((mf) this).field_n + param1;
                var4++;
                if (10 <= var4) {
                  break L1;
                } else {
                  if (((mf) this).field_g > ((mf) this).field_n) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (~((mf) this).field_g < ~((mf) this).field_n) {
                  ((mf) this).field_n = ((mf) this).field_g;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          } else {
            ((mf) this).field_l = ((mf) this).field_l + (((mf) this).field_n - ((mf) this).field_g);
            ((mf) this).field_g = ((mf) this).field_g + (-((mf) this).field_g + ((mf) this).field_n);
            ((mf) this).field_n = ((mf) this).field_n + param1;
            return 1;
          }
        } else {
          field_d = null;
          if (~((mf) this).field_n >= ~((mf) this).field_g) {
            var4 = 0;
            L3: while (true) {
              L4: {
                ((mf) this).field_n = ((mf) this).field_n + param1;
                var4++;
                if (10 <= var4) {
                  break L4;
                } else {
                  if (((mf) this).field_g > ((mf) this).field_n) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (~((mf) this).field_g < ~((mf) this).field_n) {
                  ((mf) this).field_n = ((mf) this).field_g;
                  break L5;
                } else {
                  break L5;
                }
              }
              return var4;
            }
          } else {
            ((mf) this).field_l = ((mf) this).field_l + (((mf) this).field_n - ((mf) this).field_g);
            ((mf) this).field_g = ((mf) this).field_g + (-((mf) this).field_g + ((mf) this).field_n);
            ((mf) this).field_n = ((mf) this).field_n + param1;
            return 1;
          }
        }
    }

    mf() {
        ((mf) this).field_k = new long[10];
        ((mf) this).field_e = 0;
        ((mf) this).field_l = 0L;
        ((mf) this).field_g = 0L;
        ((mf) this).field_n = 0L;
        ((mf) this).field_m = 1;
        ((mf) this).field_g = System.nanoTime();
        ((mf) this).field_n = System.nanoTime();
    }

    final static boolean a(CharSequence param0, char param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (!bn.a(74, param1)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param0 == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var3_int = param0.length();
                if (var3_int < 12) {
                  if (ck.a(param1, -46)) {
                    if (var3_int != 0) {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      break L0;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0 != 0;
                    }
                  } else {
                    return true;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("mf.E(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L1;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + -13 + 41);
        }
        return stackIn_17_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "From <%0>: ";
        field_i = "Return to lobby";
    }
}
