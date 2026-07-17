/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tna extends loa {
    static String field_d;
    static ph[] field_c;
    static vna field_e;
    static String field_b;
    static int field_f;

    public static void a() {
        field_b = null;
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, gqa param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= ara.field_xb) {
                    int dupTemp$4 = param1.a(false);
                    baa.field_b[dupTemp$4] = baa.field_b[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ara.field_xb) {
                        ara.field_xb = var2_int;
                        int fieldTemp$5 = ara.field_xb;
                        ara.field_xb = ara.field_xb + 1;
                        wea.field_d[fieldTemp$5] = param1;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (param1.field_d == wea.field_d[var3].field_d) {
                              var4 = wea.field_d[var3].a(false);
                              if (sd.field_K >= baa.field_b[var4]) {
                                break L5;
                              } else {
                                baa.field_b[var4] = baa.field_b[var4] - 1;
                                break L4;
                              }
                            } else {
                              break L5;
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          wea.field_d[incrementValue$6] = wea.field_d[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (wea.field_d[var2_int].field_d == param1.field_d) {
                        int dupTemp$7 = wea.field_d[var2_int].a(false);
                        baa.field_b[dupTemp$7] = baa.field_b[dupTemp$7] + 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                baa.field_b[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("tna.A(").append(16599).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    tna(qea param0) {
        super(param0);
    }

    final void a(int param0, int param1, hj param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        try {
            if (param1 < 73) {
                Object var8 = null;
                ((tna) this).a(-107, 127, (hj) null, -114);
            }
            for (var5_int = 1; param2.field_f + -1 > var5_int; var5_int++) {
                for (var6 = 1; var6 < param2.field_a - 1; var6++) {
                    param2.a(var6, 0, 0, var5_int);
                }
            }
            this.a(0, param2.field_f, 0, param2, param2.field_a, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tna.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, hj param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 5) {
                break L1;
              } else {
                if (5 > param4) {
                  break L1;
                } else {
                  var7_int = (((tna) this).field_a.a(param1 / 2 + -1, 0) + param5) * 2 + param2;
                  var8 = param0 - (-(2 * ((tna) this).field_a.a(-1 + param4 / 2, 0)) + -2);
                  var9 = param2 - -1;
                  L2: while (true) {
                    if (var9 >= param1 + param2 + -1) {
                      var9 = param0 - -1;
                      L3: while (true) {
                        if (-1 + param4 + param0 <= var9) {
                          L4: {
                            var9 = ((tna) this).field_a.a(4, param5 ^ 1);
                            if (var9 == 0) {
                              break L4;
                            } else {
                              param3.a(param0 + 2 * (((tna) this).field_a.a(var8 + -param0, 0) / 2) - -1, 0, 0, var7_int);
                              break L4;
                            }
                          }
                          L5: {
                            if (1 == var9) {
                              break L5;
                            } else {
                              param3.a(var8, 0, 0, param2 + (((tna) this).field_a.a(-param2 + var7_int, param5 ^ 1) / 2 * 2 + 1));
                              break L5;
                            }
                          }
                          L6: {
                            if (2 != var9) {
                              param3.a(2 * (((tna) this).field_a.a(-1 + (param0 - -param4 + -var8), 0) / 2) + var8 + 1, 0, 0, var7_int);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if (var9 != 3) {
                              param3.a(var8, 0, 0, 1 + ((tna) this).field_a.a(-1 + param2 + (param1 - var7_int), 0) / 2 * 2 + var7_int);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          this.a(param0, -param2 + (var7_int + 1), param2, param3, var8 + 1 + -param0, 1);
                          this.a(param0, param2 - -param1 + -var7_int, var7_int, param3, var8 + (1 + -param0), 1);
                          this.a(var8, -param2 + (var7_int + 1), param2, param3, param0 + (param4 - var8), param5);
                          this.a(var8, param2 - (-param1 + var7_int), var7_int, param3, -var8 + (param0 - -param4), param5);
                          break L0;
                        } else {
                          param3.a(var9, 1, param5 ^ 1, var7_int);
                          var9++;
                          continue L3;
                        }
                      }
                    } else {
                      param3.a(var8, 1, param5 ^ 1, var9);
                      var9++;
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
          L8: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("tna.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You have completed the free content of Tomb Racer, to play a further 5 worlds become a member at FunOrb.com.";
        field_e = new vna();
        field_b = "Connecting to<br>friend server...";
    }
}
