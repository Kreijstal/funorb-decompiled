/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static boolean field_c;
    static String field_b;
    static String field_a;
    static int field_d;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 21) {
            field_c = false;
        }
    }

    final static void a(o[] param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param3 <= 0) {
                  break L1;
                } else {
                  var5_int = param0[0].field_q;
                  var6 = param0[2].field_q;
                  var7 = param0[1].field_q;
                  param0[0].d(param1, param2);
                  param0[2].d(-var6 + param1 + param3, param2);
                  mi.b(ql.field_q);
                  mi.d(var5_int + param1, param2, param1 + param3 + -var6, param0[1].field_r + param2);
                  var8 = param1 - -var5_int;
                  var9 = param1 + (param3 + -var6);
                  param1 = var8;
                  L2: while (true) {
                    if (var9 <= param1) {
                      mi.a(ql.field_q);
                      var10 = -88 % ((-22 - param4) / 53);
                      break L0;
                    } else {
                      param0[1].d(param1, param2);
                      param1 = param1 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("je.G(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static o[] a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = -125 % ((param1 - 30) / 35);
        return md.a(param2, param3, param0, 0, 1, -1, 1, 3, 1);
    }

    final synchronized static long a(int param0) {
        long var1 = 0L;
        var1 = System.currentTimeMillis();
        if (qf.field_b <= var1) {
          if (param0 != 1) {
            je.a((byte) 110);
            qf.field_b = var1;
            return var1 + of.field_e;
          } else {
            qf.field_b = var1;
            return var1 + of.field_e;
          }
        } else {
          of.field_e = of.field_e + (qf.field_b + -var1);
          if (param0 == 1) {
            qf.field_b = var1;
            return var1 + of.field_e;
          } else {
            je.a((byte) 110);
            qf.field_b = var1;
            return var1 + of.field_e;
          }
        }
    }

    final static boolean a(ia param0, ia param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param0.field_jb - param1.field_jb;
              if (param0.field_gb != qa.field_r) {
                if (param0.field_gb == null) {
                  var3_int += 200;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            L2: {
              if (qa.field_r != param1.field_gb) {
                if (null == param1.field_gb) {
                  var3_int -= 200;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var3_int += 200;
                break L2;
              }
            }
            L3: {
              if (0 >= var3_int) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                stackOut_12_0 = 1;
                stackIn_14_0 = stackOut_12_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("je.F(");
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
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + 1 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 <= -59) {
              if (null != kf.field_G) {
                var3_int = 0;
                L1: while (true) {
                  if (kf.field_G.length <= var3_int) {
                    break L0;
                  } else {
                    L2: {
                      if (null == kf.field_G[var3_int]) {
                        var3_int++;
                        var3_int++;
                        break L2;
                      } else {
                        kf.field_G[var3_int].a((byte) 117, param2, param1);
                        var3_int++;
                        break L2;
                      }
                    }
                    var3_int++;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var3, "je.D(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(boolean param0) {
        if (param0) {
          L0: {
            je.a(false);
            if (lf.field_d != null) {
              lf.field_d.d(2);
              lf.field_d = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (lf.field_d != null) {
              lf.field_d.d(2);
              lf.field_d = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Waiting for music";
        field_a = "Player";
        field_d = 0;
    }
}
