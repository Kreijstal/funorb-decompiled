/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kua extends vg implements fo {
    private hca field_h;
    private int field_g;
    private int field_l;
    private int field_k;
    private int field_f;
    static jna field_j;
    static jea field_i;

    final int f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = -73 / ((param0 - -4) / 47);
        var3 = this.field_k;
        if ((var3 ^ -1) == -5) {
          return 1;
        } else {
          return 6;
        }
    }

    final void a(la param0, byte param1) {
        try {
            int var3_int = -11 % ((param1 - 39) / 46);
            this.field_l = param0.a(this.field_l, (byte) 71);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kua.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static hja a(int param0, int[] param1, hja param2) {
        hja var3 = null;
        RuntimeException var3_ref = null;
        hja stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        hja stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
              var3 = new hja(0, 0, 0);
              var3.field_e = param2.field_e;
              var3.field_b = param2.field_b;
              if (param0 == 21938) {
                break L1;
              } else {
                field_j = (jna) null;
                break L1;
              }
            }
            var3.field_h = param2.field_h;
            var3.field_c = param2.field_c;
            var3.field_f = param2.field_f;
            var3.field_a = param2.field_a;
            var3.field_g = param1;
            var3.field_d = param2.field_d;
            stackOut_2_0 = (hja) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("kua.E(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            this.field_g = -95;
        }
    }

    kua(kua param0) {
        this(param0.field_h, param0.field_l, param0.field_g, param0.field_f, param0.field_k);
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            this.field_h = (hca) null;
            return this.field_f;
        }
        return this.field_f;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return false;
        }
        return false;
    }

    public final void a(int param0, iq param1) {
        if (param0 < 103) {
            return;
        }
        try {
            this.field_h.n((byte) -66).a(this.field_k, (byte) -101, this.field_f, this.field_g, this.field_l);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kua.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(byte param0) {
        int var2 = 105 % ((-23 - param0) / 53);
        return this.field_l;
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
            field_i = (jea) null;
            return this.field_g;
        }
        return this.field_g;
    }

    kua(hca param0, int param1, int param2, int param3, int param4) {
        try {
            this.field_l = param1;
            this.field_f = param3;
            this.field_g = param2;
            this.field_h = param0;
            this.field_k = param4;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static hra a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hra stackIn_6_0 = null;
        hra stackIn_10_0 = null;
        hra stackIn_19_0 = null;
        hra stackIn_22_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hra stackOut_5_0 = null;
        hra stackOut_9_0 = null;
        hra stackOut_21_0 = null;
        hra stackOut_18_0 = null;
        Object stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -6962) {
                break L1;
              } else {
                kua.a((byte) 94);
                break L1;
              }
            }
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_5_0 = is.field_wb;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) < -64) {
                stackOut_9_0 = rg.field_A;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L2: while (true) {
                  if (var2_int > var3) {
                    L3: {
                      var4 = param0.charAt(var3);
                      if (var4 != 45) {
                        if (gsa.field_s.indexOf(var4) != -1) {
                          break L3;
                        } else {
                          stackOut_21_0 = fb.field_c;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        L4: {
                          if (var3 == 0) {
                            break L4;
                          } else {
                            if (var3 != var2_int + -1) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        stackOut_18_0 = fb.field_c;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      stackOut_24_0 = null;
                      stackIn_25_0 = stackOut_24_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var2);
            stackOut_26_1 = new StringBuilder().append("kua.A(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0;
              } else {
                return (hra) ((Object) stackIn_25_0);
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = -102 / ((-79 - param0) / 34);
    }

    static {
        field_j = null;
    }
}
