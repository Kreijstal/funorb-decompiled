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
        qq var2;
        int var3;
        qq var4;
        L0: {
          var3 = AceOfSkies.field_G ? 1 : 0;
          if (param0 == -18738) {
            break L0;
          } else {
            this.field_e = 91;
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_e >= this.field_a) {
            return true;
          } else {
            var4 = this.field_c[this.field_e];
            var2 = var4;
            if (var4.field_d.b((byte) -95)) {
              L2: {
                if ((var4.field_f ^ -1) > -1) {
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
              this.field_e = this.field_e + 1;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_float = (float)param2 / 100.0f + (float)(1 + this.field_e);
              this.field_d = var4_float * (float)this.field_b / (float)(this.field_a - param0);
              if (param2 == 0) {
                this.field_j = param1.field_a;
                break L1;
              } else {
                this.field_j = param1.field_c + " - " + param2 + "%";
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ca.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
    }

    final static int a(uc param0, byte param1, int param2, ga param3) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
                    if (param3.field_e != param0.field_n) {
                      break L1;
                    } else {
                      var4_int = param3.field_h.length;
                      var5 = param0.field_h[param2].length / var4_int;
                      if (param1 > 101) {
                        var6 = 0;
                        L2: while (true) {
                          if (var6 >= var5) {
                            stackIn_24_0 = -1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            L3: {
                              if ((param3.field_j ^ -1L) != (param0.field_f[param2][var6] ^ -1L)) {
                                break L3;
                              } else {
                                if (fd.a(param0.field_e[param2][var6], (byte) -6)) {
                                  var7 = 0;
                                  L4: while (true) {
                                    if (var7 >= var4_int) {
                                      stackIn_21_0 = var6;
                                      decompiledRegionSelector0 = 2;
                                      break L0;
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
                      } else {
                        stackIn_10_0 = 94;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackIn_7_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("ca.A(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0;
            } else {
              return stackIn_24_0;
            }
          }
        }
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
        field_i = new ph(8);
    }
}
