/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh implements dh {
    private int field_b;
    private int field_k;
    private int field_j;
    private int field_c;
    private int field_e;
    static rd field_f;
    private int field_g;
    private int field_d;
    private qi field_h;
    static ll field_a;
    static uf field_i;

    public static void a(boolean param0) {
        field_i = null;
        field_f = null;
        if (!param0) {
            return;
        }
        field_a = null;
    }

    vh(qi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_h = param0;
            this.field_g = param2;
            this.field_c = param4;
            this.field_k = param7;
            this.field_b = param6;
            this.field_j = param5;
            this.field_e = param3;
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "vh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static int a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.equalsIgnoreCase("red")) {
                break L1;
              } else {
                if (param1.equalsIgnoreCase("weapons")) {
                  break L1;
                } else {
                  L2: {
                    if (param0 > 93) {
                      break L2;
                    } else {
                      vh.a(true);
                      break L2;
                    }
                  }
                  L3: {
                    if (param1.equalsIgnoreCase("green")) {
                      break L3;
                    } else {
                      if (param1.equalsIgnoreCase("speed")) {
                        break L3;
                      } else {
                        L4: {
                          if (param1.equalsIgnoreCase("blue")) {
                            break L4;
                          } else {
                            if (param1.equalsIgnoreCase("shields")) {
                              break L4;
                            } else {
                              if (!param1.equalsIgnoreCase("black")) {
                                throw new IllegalArgumentException();
                              } else {
                                stackIn_19_0 = 3;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                        }
                        stackIn_16_0 = 2;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("vh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              return stackIn_19_0;
            }
          }
        }
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hg var14 = null;
        n stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof hg)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (n) (param3);
                break L1;
              }
            }
            L2: {
              var14 = (hg) ((Object) stackIn_3_0);
              if (var14 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              tc.f(param3.field_k + param1, param4 - -param3.field_o, param3.field_x, param3.field_u, this.field_k);
              var7 = var14.field_G + (param3.field_k + param1);
              var8 = var14.field_J + (param4 - -param3.field_o);
              tc.d(var7, var8, var14.field_P, this.field_j);
              if ((var14.field_L ^ -1) == 0) {
                break L3;
              } else {
                var9 = 2.0 * ((double)var14.field_L * 3.141592653589793) / (double)var14.field_O;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_P);
                var12 = (int)(Math.cos(var9) * (double)var14.field_P);
                tc.d(var7 - -var11, var12 + var8, 1, this.field_b);
                break L3;
              }
            }
            L4: {
              tc.d(var7, var8, 2, 1);
              var9 = 2.0 * ((double)var14.field_K * 3.141592653589793) / (double)var14.field_O;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_P);
              if (param2 <= -48) {
                break L4;
              } else {
                this.field_g = -87;
                break L4;
              }
            }
            var12 = (int)(Math.cos(var9) * (double)var14.field_P);
            tc.d(var7, var8, var7 + var11, var8 + var12, 1);
            if (this.field_h != null) {
              var13 = var14.field_P + var14.field_G - -this.field_d;
              this.field_h.a(param3.field_q, param1 + (param3.field_k + var13), param4 + param3.field_o - -this.field_g, -this.field_d + (-var13 + param3.field_x), param3.field_u - (this.field_d << -1442656095), this.field_e, this.field_c, 1, 1, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("vh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    static {
        field_f = (rd) ((Object) new le(7, 30.0f, new int[]{8372223, 16777215}));
        field_a = new ll();
    }
}
