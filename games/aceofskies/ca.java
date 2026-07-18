/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    private int field_a;
    static int field_h;
    private qq[] field_c;
    static String field_g;
    static eg field_f;
    float field_d;
    private int field_e;
    String field_j;
    static ph field_i;
    private int field_b;

    final boolean a(int param0) {
        qq var2 = null;
        int var3 = 0;
        qq var4 = null;
        L0: {
          var3 = AceOfSkies.field_G ? 1 : 0;
          if (param0 == -18738) {
            break L0;
          } else {
            ((ca) this).field_e = 91;
            break L0;
          }
        }
        L1: while (true) {
          if (~((ca) this).field_e <= ~((ca) this).field_a) {
            return true;
          } else {
            var4 = ((ca) this).field_c[((ca) this).field_e];
            var2 = var4;
            if (var4.field_d.b((byte) -95)) {
              L2: {
                if (var4.field_f < 0) {
                  break L2;
                } else {
                  if (!var4.field_d.c(var4.field_f, 0)) {
                    this.a(-1, var2, var4.field_d.a(var4.field_f, 100));
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4.field_b == null) {
                  break L3;
                } else {
                  if (var4.field_d.c(var4.field_b, -14012)) {
                    break L3;
                  } else {
                    this.a(-1, var2, var4.field_d.a(var4.field_b, (byte) -79));
                    return false;
                  }
                }
              }
              L4: {
                if (0 <= var4.field_f) {
                  break L4;
                } else {
                  if (null != var4.field_b) {
                    break L4;
                  } else {
                    if (null == var4.field_c) {
                      break L4;
                    } else {
                      if (!var4.field_d.b(0)) {
                        this.a(-1, var2, var4.field_d.a(-83));
                        return false;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              ((ca) this).field_e = ((ca) this).field_e + 1;
              continue L1;
            } else {
              this.a(param0 + 18737, var4, 0);
              return false;
            }
          }
        }
    }

    private final void a(int param0, qq param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4_float = (float)param2 / 100.0f + (float)(1 + ((ca) this).field_e);
              ((ca) this).field_d = var4_float * (float)((ca) this).field_b / (float)(((ca) this).field_a - param0);
              if (param2 == 0) {
                ((ca) this).field_j = param1.field_a;
                break L1;
              } else {
                ((ca) this).field_j = param1.field_c + " - " + param2 + "%";
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ca.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ')');
        }
    }

    final static int a(uc param0, byte param1, int param2, ga param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.field_h == null) {
                  break L1;
                } else {
                  if (param3 == null) {
                    break L1;
                  } else {
                    if (~param3.field_e != ~param0.field_n) {
                      break L1;
                    } else {
                      var4_int = param3.field_h.length;
                      var5 = param0.field_h[param2].length / var4_int;
                      var6 = 0;
                      L2: while (true) {
                        if (~var6 <= ~var5) {
                          stackOut_22_0 = -1;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          L3: {
                            if (~param3.field_j != ~param0.field_f[param2][var6]) {
                              break L3;
                            } else {
                              if (fd.a(param0.field_e[param2][var6], (byte) -6)) {
                                var7 = 0;
                                L4: while (true) {
                                  if (var7 >= var4_int) {
                                    stackOut_19_0 = var6;
                                    stackIn_20_0 = stackOut_19_0;
                                    return stackIn_20_0;
                                  } else {
                                    if (param3.field_h[var7] != param0.field_h[param2][var7 + var6 * var4_int]) {
                                      break L3;
                                    } else {
                                      var7++;
                                      continue L4;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("ca.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          L6: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(113).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_23_0;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            ca.b(76);
        }
        field_g = null;
        field_f = null;
        field_i = null;
    }

    private ca() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ph(8);
    }
}
