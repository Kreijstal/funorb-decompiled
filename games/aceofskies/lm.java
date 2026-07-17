/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    private tl field_d;
    static byte[][][] field_c;
    private tl field_a;
    static String field_b;
    private ti field_e;

    final void a(bf param0, int param1) {
        RuntimeException runtimeException = null;
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
              boolean discarded$3 = ((lm) this).field_d.a(24, -116, 786336);
              if (param1 == 0) {
                break L1;
              } else {
                ((lm) this).field_e = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lm.A(");
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
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static String a(char param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var12 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = -14 / ((param1 - -78) / 42);
              var4_int = param2.length();
              var6 = param3.length();
              var7 = var4_int;
              var8 = var6 + -1;
              if (var8 != 0) {
                var9_int = 0;
                L2: while (true) {
                  var9_int = param2.indexOf('_', var9_int);
                  if (0 > var9_int) {
                    break L1;
                  } else {
                    var9_int++;
                    var7 = var7 + var8;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            var9 = new StringBuilder(var7);
            var10 = 0;
            L3: while (true) {
              var11 = param2.indexOf('_', var10);
              if (var11 < 0) {
                StringBuilder discarded$6 = var9.append(param2.substring(var10));
                stackOut_9_0 = var9.toString();
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                StringBuilder discarded$7 = var9.append(param2.substring(var10, var11));
                var10 = var11 + 1;
                StringBuilder discarded$8 = var9.append(param3);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("lm.E(").append(95).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0;
    }

    final static void a(int param0, ap param1, boolean param2, byte param3) {
        try {
            int var4_int = 65 / ((56 - param3) / 36);
            wt.field_e.a((byte) -62, param0, false, 256, param1, 1000000);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "lm.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 1 + 44 + param3 + 41);
        }
    }

    public static void b(int param0) {
        if (param0 != -8192) {
            lm.b(63);
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final void a(int param0) {
        ((lm) this).field_d.a(4665);
        if (param0 < 120) {
            Object var3 = null;
            lm.a(-96, (ap) null, true, (byte) 114);
        }
    }

    lm(bf param0) {
        RuntimeException var2 = null;
        jaclib.memory.Stream var4 = null;
        int var4_int = 0;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        jaclib.memory.Buffer var9 = null;
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
        try {
          L0: {
            L1: {
              fa discarded$4 = param0.a(new pl[2], -127);
              ((lm) this).field_d = param0.a(true, (byte) 101);
              ((lm) this).field_a = param0.a(false, (byte) 81);
              boolean discarded$5 = ((lm) this).field_a.a(12, -126, 393168);
              ((lm) this).field_e = param0.c(false, 8762);
              ((lm) this).field_e.a(-12880, 49146);
              var7 = ((lm) this).field_e.a(true, 32570);
              if (var7 == null) {
                break L1;
              } else {
                L2: {
                  var8 = param0.a(86, var7);
                  if (!jaclib.memory.Stream.b()) {
                    var4_int = 0;
                    L3: while (true) {
                      if (var4_int >= 8191) {
                        break L2;
                      } else {
                        var5 = 4 * var4_int;
                        var8.b(var5);
                        var8.b(1 + var5);
                        var8.b(var5 + 2);
                        var8.b(var5 + 2);
                        var8.b(var5 + 3);
                        var8.b(var5);
                        var4_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var4_int = 0;
                    L4: while (true) {
                      if (8191 <= var4_int) {
                        break L2;
                      } else {
                        var5 = 4 * var4_int;
                        var8.a(var5);
                        var8.a(1 + var5);
                        var8.a(2 + var5);
                        var8.a(2 + var5);
                        var8.a(var5 - -3);
                        var8.a(var5);
                        var4_int++;
                        continue L4;
                      }
                    }
                  }
                }
                var8.a();
                boolean discarded$6 = ((lm) this).field_e.a((byte) 33);
                break L1;
              }
            }
            var9 = ((lm) this).field_a.a(true, (byte) -87);
            if (var9 != null) {
              L5: {
                var4 = param0.a(-115, var9);
                if (jaclib.memory.Stream.b()) {
                  var5 = 0;
                  L6: while (true) {
                    if (8191 <= var5) {
                      break L5;
                    } else {
                      var4.b(0.0f);
                      var4.b(-1.0f);
                      var4.b(0.0f);
                      var4.b(0.0f);
                      var4.b(-1.0f);
                      var4.b(0.0f);
                      var4.b(0.0f);
                      var4.b(-1.0f);
                      var4.b(0.0f);
                      var4.b(0.0f);
                      var4.b(-1.0f);
                      var4.b(0.0f);
                      var5++;
                      continue L6;
                    }
                  }
                } else {
                  var5 = 0;
                  L7: while (true) {
                    if (var5 >= 8191) {
                      break L5;
                    } else {
                      var4.a(0.0f);
                      var4.a(-1.0f);
                      var4.a(0.0f);
                      var4.a(0.0f);
                      var4.a(-1.0f);
                      var4.a(0.0f);
                      var4.a(0.0f);
                      var4.a(-1.0f);
                      var4.a(0.0f);
                      var4.a(0.0f);
                      var4.a(-1.0f);
                      var4.a(0.0f);
                      var5++;
                      continue L7;
                    }
                  }
                }
              }
              var4.a();
              boolean discarded$7 = ((lm) this).field_a.a((byte) -60);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("lm.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading graphics";
    }
}
