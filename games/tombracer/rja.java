/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rja extends loa {
    static String field_c;
    static String field_b;
    static int field_e;
    private vna field_d;

    private final void a(hj param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        oda var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var19 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.a(param3, param0, param2, param1);
            L1: while (true) {
              L2: {
                if (this.field_d.d((byte) 14)) {
                  break L2;
                } else {
                  var6 = this.field_a.a(this.field_d.a((byte) -16), 0);
                  var7 = 0;
                  if (var15 == 0) {
                    var5_ref = (oda) ((Object) this.field_d.f(-80));
                    L3: while (true) {
                      stackOut_6_0 = var6;
                      stackOut_6_1 = var7;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      L4: while (true) {
                        if (stackIn_7_0 == stackIn_7_1) {
                          var19 = this.a(4, param3 + -2354);
                          var9 = var5_ref.field_g;
                          var10 = var5_ref.field_f;
                          var11 = 0;
                          var12 = 0;
                          L5: while (true) {
                            L6: {
                              if (var11 != 0) {
                                break L6;
                              } else {
                                stackOut_12_0 = var12 ^ -1;
                                stackOut_12_1 = -5;
                                stackIn_7_0 = stackOut_12_0;
                                stackIn_7_1 = stackOut_12_1;
                                stackIn_13_0 = stackOut_12_0;
                                stackIn_13_1 = stackOut_12_1;
                                if (var15 != 0) {
                                  continue L4;
                                } else {
                                  if (stackIn_13_0 <= stackIn_13_1) {
                                    break L6;
                                  } else {
                                    L7: {
                                      var13 = 2 * dma.field_k[var19[var12]][0] + var9;
                                      var14 = var10 - -(dma.field_k[var19[var12]][1] * 2);
                                      if (!param0.a(var13, var14, (byte) -128)) {
                                        break L7;
                                      } else {
                                        if (0 != param0.b((byte) -5, var14, var13)) {
                                          break L7;
                                        } else {
                                          this.a(var10, (byte) -42, param0, var9, var14, var13);
                                          this.a(param3 + 0, param0, var9, var10);
                                          var5_ref.p(param3 ^ 30);
                                          var11 = 1;
                                          break L7;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (var15 == 0) {
                                      continue L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            if (var15 == 0) {
                              continue L1;
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          var5_ref = (oda) ((Object) this.field_d.e(param3 ^ 126));
                          var7++;
                          if (var15 != 0) {
                            continue L1;
                          } else {
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("rja.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, hj param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (!param2.a(param0, param1, (byte) -128)) {
                break L1;
              } else {
                if (0 < param2.b((byte) -5, param1, param0)) {
                  param2.a(param1, -1, 0, param0);
                  this.field_d.b((byte) -76, new oda(param0, param1));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param3 >= 93) {
              break L0;
            } else {
              field_b = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("rja.D(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
    }

    rja(qea param0) {
        super(param0);
    }

    public static void a(int param0) {
        if (param0 != -21755) {
            rja.a(96);
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    private final void a(int param0, hj param1, int param2, int param3) {
        try {
            param1.a(param3, 0, 0, param2);
            this.a(param2, param3 - 2, param1, (byte) 119);
            this.a(param2, param3 + 2, param1, (byte) 126);
            this.a(param2 + -2, param3, param1, (byte) 109);
            this.a(param2 + param0, param3, param1, (byte) 95);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rja.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, hj param2, int param3) {
        this.field_d = new vna();
        if (param1 < 73) {
            return;
        }
        try {
            this.a(param2, param0, param3, 2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rja.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = "Total";
        field_b = "Room: ";
    }
}
