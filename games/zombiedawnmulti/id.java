/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class id extends ff {
    int field_C;
    static String field_x;
    static String field_A;
    int field_z;
    static ak field_B;
    int field_y;
    static int field_D;
    int field_E;

    abstract void f(byte param0);

    abstract void a(int param0, nm param1);

    final static void d(byte param0) {
        br var1 = null;
        RuntimeException var1_ref = null;
        br var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1 = fd.field_M.c(49);
            L1: while (true) {
              if (!(var1 instanceof wj)) {
                var1 = qo.field_q.c(80);
                L2: while (true) {
                  if (!(var1 instanceof wj)) {
                    var1 = jp.field_c.c(80);
                    L3: while (true) {
                      if (!(var1 instanceof wj)) {
                        L4: {
                          wp.b(127);
                          if (null == td.field_b) {
                            break L4;
                          } else {
                            if (wd.field_L.c(-37)) {
                              break L4;
                            } else {
                              fk.a(td.field_b, true);
                              td.field_b = null;
                              return;
                            }
                          }
                        }
                        break L0;
                      } else {
                        L5: {
                          var2 = var1.field_d;
                          if (((wj) (Object) var1).field_m.k()) {
                            var1.a(true);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var1 = var2;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      var2 = var1.field_d;
                      if (((wj) (Object) var1).field_m.k()) {
                        var1.a(true);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var1 = var2;
                    continue L2;
                  }
                }
              } else {
                L7: {
                  var2 = var1.field_d;
                  if (((wj) (Object) var1).field_m.k()) {
                    var1.a(true);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var1 = var2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1_ref, "id.S(" + 20 + 41);
        }
    }

    public static void e(byte param0) {
        field_B = null;
        field_x = null;
        field_A = null;
    }

    final int h(int param0) {
        int var2 = 60 / ((12 - param0) / 58);
        return ((id) this).field_E >> 16;
    }

    final static ld a(cj param0, cj param1, byte param2, int[] param3, cj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        ld[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        tl var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        char[] var16 = null;
        Object stackIn_9_0 = null;
        ld stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        ld stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = param3.length;
            var6 = new String[var5_int];
            var16 = new char[var5_int];
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var7 = var13;
            var8 = new ld[var5_int];
            var9 = 49;
            try {
              L1: {
                var10_int = 0;
                L2: while (true) {
                  if (var5_int <= var10_int) {
                    L3: {
                      if (param2 == -65) {
                        break L3;
                      } else {
                        field_D = -90;
                        break L3;
                      }
                    }
                    break L1;
                  } else {
                    var11 = bd.field_c.a(param3[var10_int], -11452);
                    var6[var10_int] = var11.e(-18572);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (ld) (Object) stackIn_9_0;
            }
            stackOut_10_0 = new ld(0L, param0, param4, param1, var8, param3, var6, var16);
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("id.P(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_11_0;
    }

    final int g(int param0) {
        int var2 = -126 / ((param0 - 13) / 45);
        return ((id) this).field_z >> 16;
    }

    id(int param0, int param1, int param2) {
        ((id) this).field_C = param2;
        ((id) this).field_E = param1 << 16;
        ((id) this).field_z = param0 << 16;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Unable to delete name - system busy";
        field_x = "Hide chat";
    }
}
