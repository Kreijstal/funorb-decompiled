/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aw extends sm {
    static wk field_m;
    static String field_k;
    static boolean field_l;
    static int[][][] field_j;
    static String field_h;
    static wr field_i;

    final static boolean a(boolean param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var1 = vi.b(-45);
        var3 = var1 + -dp.field_Lb;
        if (var3 > 30000L) {
          dp.field_Lb = var1;
          mu.field_d = 0;
          return true;
        } else {
          L0: {
            var5 = 3000;
            if (7 <= mu.field_d) {
              var5 = 12000;
              break L0;
            } else {
              if (mu.field_d < 5) {
                if (3 > mu.field_d) {
                  break L0;
                } else {
                  var5 = 6000;
                  if (~var3 < ~(long)var5) {
                    dp.field_Lb = var1;
                    mu.field_d = mu.field_d + 1;
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                var5 = 9000;
                if (~var3 < ~(long)var5) {
                  dp.field_Lb = var1;
                  mu.field_d = mu.field_d + 1;
                  return true;
                } else {
                  return false;
                }
              }
            }
          }
          if (~var3 < ~(long)var5) {
            dp.field_Lb = var1;
            mu.field_d = mu.field_d + 1;
            return true;
          } else {
            return false;
          }
        }
    }

    final void a(int param0, jb param1) {
        RuntimeException runtimeException = null;
        jb var3 = null;
        Object var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var3 = (jb) (Object) ((aw) this).field_a.a(0);
              if (param0 == 16777062) {
                break L1;
              } else {
                var4 = null;
                ((aw) this).a(64, (jb) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (param1.field_t > var3.field_t) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param1;
              break L2;
            }
            ((aw) this).field_a.a(750, (tc) (Object) var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("aw.F(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final jb a(byte param0) {
        jb var2 = null;
        if (param0 > -28) {
          jb discarded$2 = ((aw) this).a((byte) -5);
          var2 = (jb) (Object) ((aw) this).field_a.a(0);
          return var2;
        } else {
          var2 = (jb) (Object) ((aw) this).field_a.a(0);
          return var2;
        }
    }

    final static og a(byte param0, mt param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_15_0 = 0;
        og stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        og stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              int fieldTemp$8 = param1.field_c - 1;
              param1.field_c = param1.field_c - 1;
              var2_int = fieldTemp$8;
              var3 = new StringBuilder();
              var4 = param1.b(-1);
              if (param0 > 95) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            StringBuilder discarded$9 = var3.append(var4);
            var5 = 0;
            L2: while (true) {
              L3: {
                if (param1.a((byte) 16)) {
                  break L3;
                } else {
                  var6 = param1.b(-1);
                  if (var5 != 0) {
                    var5 = 0;
                    StringBuilder discarded$10 = var3.append(var6);
                    continue L2;
                  } else {
                    L4: {
                      if (var6 != 92) {
                        StringBuilder discarded$11 = var3.append(var6);
                        break L4;
                      } else {
                        var5 = 1;
                        break L4;
                      }
                    }
                    if (var4 != var6) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L5: {
                if (var4 != 34) {
                  stackOut_14_0 = hf.field_h;
                  stackIn_15_0 = stackOut_14_0;
                  break L5;
                } else {
                  stackOut_13_0 = iu.field_x;
                  stackIn_15_0 = stackOut_13_0;
                  break L5;
                }
              }
              var6 = stackIn_15_0;
              stackOut_15_0 = new og(var6, var2_int, var3.toString());
              stackIn_16_0 = stackOut_15_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("aw.B(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    final static void a(co param0, co[] param1, int param2) {
        try {
            if (param2 != -5841) {
                field_h = null;
            }
            param1[param0.field_d] = (co) (Object) param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "aw.A(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        nt var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = (nt) (Object) s.field_a.e((byte) 104);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                tf.a(param0, var4, (byte) -64);
                var4 = (nt) (Object) s.field_a.a((byte) 123);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "aw.R(" + param0 + 44 + 1742 + 41);
        }
    }

    public static void c(byte param0) {
        int var1 = 1;
        field_h = null;
        field_k = null;
        field_m = null;
        field_j = null;
        field_i = null;
    }

    aw(ej param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = null;
    }
}
