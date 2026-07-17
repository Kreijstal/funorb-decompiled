/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends td {
    static sna field_q;
    static int field_p;
    static String field_r;

    final static void a(gb param0, boolean param1, int param2) {
        pf var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              var3 = sja.field_fb;
              var3.c(param2, (byte) 127);
              var3.d(param0.field_g, 0);
              var3.b(param0.field_h, -127);
              if (param1) {
                break L1;
              } else {
                field_p = -86;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("io.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int var7 = 0;
        char[] var8 = null;
        char[] var10 = null;
        char[] var12 = null;
        char[] var14 = null;
        char[] var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (!hm.a((byte) 110, param1)) {
                var14 = uj.field_s;
                var12 = var14;
                var10 = var12;
                var8 = var10;
                var6 = var8;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var14.length <= var3) {
                    L2: {
                      var15 = ra.field_r;
                      if (param0) {
                        break L2;
                      } else {
                        boolean discarded$2 = io.a(false, '5');
                        break L2;
                      }
                    }
                    var7 = 0;
                    var3 = var7;
                    L3: while (true) {
                      if (var7 >= var15.length) {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        break L0;
                      } else {
                        var4 = var15[var7];
                        if (var4 == param1) {
                          stackOut_21_0 = 1;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0 != 0;
                        } else {
                          var7++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var14[var3];
                    if (param1 == var4) {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2_ref, "io.D(" + param0 + 44 + param1 + 41);
        }
        return stackIn_25_0 != 0;
    }

    public static void b(int param0) {
        if (param0 >= -114) {
            boolean discarded$0 = io.a(false, 'Z');
        }
        field_q = null;
        field_r = null;
    }

    io(int param0, aga param1, nq param2) {
        super(param0, param1);
        try {
            ((io) this).field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "io.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        aga var4 = null;
        hla var5 = null;
        aga var6 = null;
        hla stackIn_6_0 = null;
        ew stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        hla stackOut_5_0 = null;
        ew stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                io.b(87);
                break L1;
              }
            }
            L2: {
              var6 = ((io) this).field_h.a(71, param0);
              var4 = ((io) this).field_j.a(67, param0);
              if (var4 == null) {
                break L2;
              } else {
                if (null != param0.field_a[var4.field_x][var4.field_J].field_l) {
                  break L2;
                } else {
                  if (!var4.field_A) {
                    break L2;
                  } else {
                    var5 = new hla(((io) this).field_g, new nq(var6), ((io) this).field_j);
                    var5.field_o.a((bw) (Object) new iv(new nq(var4), false, 1, -(var4.field_t >> 1), 0), true);
                    var5.field_o.a((bw) (Object) new cn(new nq(var4), var4.field_x, var4.field_J), true);
                    stackOut_5_0 = (hla) var5;
                    stackIn_6_0 = stackOut_5_0;
                    return (ii) (Object) stackIn_6_0;
                  }
                }
              }
            }
            stackOut_7_0 = new ew(new nq(var6));
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("io.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return (ii) (Object) stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Advertising websites";
    }
}
