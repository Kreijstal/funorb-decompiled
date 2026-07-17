/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rla extends pp {
    private int field_j;
    static kv field_k;
    static String field_i;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param2 <= -118) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var3_int = 0;
            var4 = ql.field_s;
            L2: while (true) {
              if (mj.field_h.length <= var3_int) {
                stackOut_15_0 = -1;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                L3: {
                  var5 = fr.field_l[var3_int];
                  if (0 > var5) {
                    var4 = var4 + mm.field_z;
                    var3_int++;
                    break L3;
                  } else {
                    var6 = gg.a(true, -103, mj.field_h[var3_int]);
                    var7 = mg.field_k + -(var6 >> 1);
                    var4 = var4 + cba.field_d;
                    if (!hha.a((um.field_d << 1) + hc.field_D, param1, (vt.field_k << 1) + var6, 1, var7 - vt.field_k, var4, param0)) {
                      var4 = var4 + (cba.field_d + (um.field_d << 1) + hc.field_D);
                      var3_int++;
                      break L3;
                    } else {
                      stackOut_7_0 = var5;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    }
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "rla.D(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_16_0;
    }

    rla(nq param0, int param1) {
        try {
            ((rla) this).field_j = param1;
            ((rla) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rla.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(lu param0, byte param1) {
        try {
            super.a(param0, (byte) -123);
            er.a(((rla) this).field_h, 117, param0);
            param0.d(((rla) this).field_j, 0);
            int var3_int = -78 / ((34 - param1) / 58);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rla.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void d(byte param0) {
        field_k = null;
        field_i = null;
    }

    final void a(aga param0, op param1, int param2) {
        RuntimeException runtimeException = null;
        aga var4 = null;
        Object var5 = null;
        aga var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var6 = ((rla) this).field_h.a(74, param1);
            var4 = var6;
            if (var6 != null) {
              L1: {
                var6.field_E = ((rla) this).field_j;
                if (param2 == 12) {
                  break L1;
                } else {
                  var5 = null;
                  ((rla) this).a((lu) null, (byte) -61);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("rla.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    final static int a(boolean param0, int param1) {
        if (param0) {
            field_k = null;
            return 255 & param1 >> 16;
        }
        return 255 & param1 >> 16;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != -1) {
          int discarded$2 = rla.a(-108, -62, 102);
          rda.a(param0 + 1, true, true);
          return;
        } else {
          rda.a(param0 + 1, true, true);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Loading extra data";
    }
}
