/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rja extends loa {
    static String field_c;
    static String field_b;
    static int field_e;
    private vna field_d;

    private final void a(hj param0, int param1, int param2) {
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.a(2, param0, param2, param1);
            L1: while (true) {
              if (((rja) this).field_d.d((byte) 14)) {
                break L0;
              } else {
                var6 = ((rja) this).field_a.a(((rja) this).field_d.a((byte) -16), 0);
                var7 = 0;
                var5_ref = (oda) (Object) ((rja) this).field_d.f(-80);
                L2: while (true) {
                  if (var6 == var7) {
                    var19 = ((rja) this).a(4, -2352);
                    var9 = var5_ref.field_g;
                    var10 = var5_ref.field_f;
                    var11 = 0;
                    var12 = 0;
                    L3: while (true) {
                      if (var11 != 0) {
                        continue L1;
                      } else {
                        if (var12 >= 4) {
                          continue L1;
                        } else {
                          L4: {
                            var13 = 2 * dma.field_k[var19[var12]][0] + var9;
                            var14 = var10 - -(dma.field_k[var19[var12]][1] * 2);
                            if (!param0.a(var13, var14, (byte) -128)) {
                              var12++;
                              break L4;
                            } else {
                              if (0 != param0.b((byte) -5, var14, var13)) {
                                var12++;
                                break L4;
                              } else {
                                ((rja) this).a(var10, (byte) -42, param0, var9, var14, var13);
                                this.a(2, param0, var9, var10);
                                var5_ref.p(28);
                                var11 = 1;
                                break L4;
                              }
                            }
                          }
                          var12++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var5_ref = (oda) (Object) ((rja) this).field_d.e(124);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("rja.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + 2 + ')');
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
                  ((rja) this).field_d.b((byte) -76, (vg) (Object) new oda(param0, param1));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param3 >= 93) {
              break L0;
            } else {
              field_b = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("rja.D(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
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
            this.a(param2 + 2, param3, param1, (byte) 95);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rja.C(" + 2 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, hj param2, int param3) {
        ((rja) this).field_d = new vna();
        if (param1 < 73) {
            return;
        }
        try {
            int discarded$0 = 2;
            this.a(param2, param0, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rja.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Total";
        field_b = "Room: ";
    }
}
