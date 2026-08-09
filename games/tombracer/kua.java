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
        int var2;
        int var3;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = (hja) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("kua.E(").append(param0).append(',');

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hra stackIn_6_0 = null;
        hra stackIn_10_0 = null;
        hra stackIn_19_0 = null;
        hra stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
              stackIn_6_0 = is.field_wb;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) < -64) {
                stackIn_10_0 = rg.field_A;
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
                          stackIn_22_0 = fb.field_c;
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
                        stackIn_19_0 = fb.field_c;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L2;
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
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("kua.A(");

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
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
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
              return stackIn_22_0;
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
