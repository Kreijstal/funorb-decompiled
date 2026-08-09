/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tna extends loa {
    static String field_d;
    static ph[] field_c;
    static vna field_e;
    static String field_b;
    static int field_f;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            return;
        }
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, gqa param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if ((var2_int ^ -1) <= -4) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= ara.field_xb) {
                    L3: {
                      if (param0 == 16599) {
                        break L3;
                      } else {
                        field_b = (String) null;
                        break L3;
                      }
                    }
                    dupTemp$0 = param1.a(false);
                    baa.field_b[dupTemp$0] = baa.field_b[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= ara.field_xb) {
                        ara.field_xb = var2_int;
                        fieldTemp$1 = ara.field_xb;
                        ara.field_xb = ara.field_xb + 1;
                        wea.field_d[fieldTemp$1] = param1;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (param1.field_d == wea.field_d[var3].field_d) {
                              var4 = wea.field_d[var3].a(false);
                              if (sd.field_K >= baa.field_b[var4]) {
                                break L6;
                              } else {
                                baa.field_b[var4] = baa.field_b[var4] - 1;
                                break L5;
                              }
                            } else {
                              break L6;
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          wea.field_d[incrementValue$2] = wea.field_d[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (wea.field_d[var2_int].field_d == param1.field_d) {
                        dupTemp$3 = wea.field_d[var2_int].a(false);
                        baa.field_b[dupTemp$3] = baa.field_b[dupTemp$3] + 1;
                        break L7;
                      } else {
                        break L7;
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
          L8: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("tna.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
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
                hj var8 = (hj) null;
                this.a(-107, 127, (hj) null, -114);
            }
            for (var5_int = 1; param2.field_f + -1 > var5_int; var5_int++) {
                for (var6 = 1; var6 < param2.field_a - 1; var6++) {
                    param2.a(var6, 0, 0, var5_int);
                }
            }
            this.a(0, param2.field_f, 0, param2, param2.field_a, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tna.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, hj param3, int param4, int param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-6 < (param1 ^ -1)) {
                break L1;
              } else {
                if (5 > param4) {
                  break L1;
                } else {
                  var7_int = (this.field_a.a(param1 / 2 + -1, 0) + param5) * 2 + param2;
                  var8 = param0 - (-(2 * this.field_a.a(-1 + param4 / 2, 0)) + -2);
                  var9 = param2 - -1;
                  L2: while (true) {
                    if (var9 >= param1 + param2 + -1) {
                      var9 = param0 - -1;
                      L3: while (true) {
                        if (-1 + param4 + param0 <= var9) {
                          L4: {
                            var9 = this.field_a.a(4, param5 ^ 1);
                            if (var9 == 0) {
                              break L4;
                            } else {
                              param3.a(param0 + 2 * (this.field_a.a(var8 + -param0, 0) / 2) - -1, 0, 0, var7_int);
                              break L4;
                            }
                          }
                          L5: {
                            if (1 == var9) {
                              break L5;
                            } else {
                              param3.a(var8, 0, 0, param2 + (this.field_a.a(-param2 + var7_int, param5 ^ 1) / 2 * 2 + 1));
                              break L5;
                            }
                          }
                          L6: {
                            if (2 != var9) {
                              param3.a(2 * (this.field_a.a(-1 + (param0 - -param4 + -var8), 0) / 2) + var8 + 1, 0, 0, var7_int);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if (-4 != (var9 ^ -1)) {
                              param3.a(var8, 0, 0, 1 + this.field_a.a(-1 + param2 + (param1 - var7_int), 0) / 2 * 2 + var7_int);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          this.a(param0, -param2 + (var7_int + 1), param2, param3, var8 + 1 + -param0, 1);
                          this.a(param0, param2 - -param1 + -var7_int, var7_int, param3, var8 + (1 + -param0), 1);
                          this.a(var8, -param2 + (var7_int + 1), param2, param3, param0 + (param4 - var8), param5 + 0);
                          this.a(var8, param2 - (-param1 + var7_int), var7_int, param3, -var8 + (param0 - -param4), param5 ^ 0);
                          decompiledRegionSelector0 = 1;
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
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("tna.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = "You have completed the free content of Tomb Racer, to play a further 5 worlds become a member at FunOrb.com.";
        field_e = new vna();
        field_b = "Connecting to<br>friend server...";
    }
}
