/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends na {
    static ik field_h;
    private dh field_e;
    static int field_i;
    static eg field_g;
    static int[] field_j;
    static String field_f;

    final gf a(byte param0, String param1) {
        v var3 = null;
        RuntimeException var3_ref = null;
        gf stackIn_5_0 = null;
        gf stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(this.field_e instanceof op)) {
                break L1;
              } else {
                var3 = ((op) ((Object) this.field_e)).a(72);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.c(88) != qe.field_a) {
                    stackIn_5_0 = qr.field_e;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == 26) {
                break L2;
              } else {
                nq.a(-47, 52, 56);
                break L2;
              }
            }
            L3: {
              if (!param1.equals(this.field_e.field_m)) {
                stackIn_11_0 = qr.field_e;
                break L3;
              } else {
                stackIn_11_0 = qe.field_a;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("nq.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_11_0;
        }
    }

    public static void c(byte param0) {
        field_j = null;
        field_f = null;
        field_h = null;
        field_g = null;
        if (param0 != -31) {
            nq.a(-90, -68, 30);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 > 72) {
              var3_int = 1;
              L1: while (true) {
                if ((param2 ^ -1) >= -2) {
                  if (-2 != (param2 ^ -1)) {
                    stackIn_15_0 = var3_int;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_13_0 = param0 * var3_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L2: {
                    if (0 == (1 & param2)) {
                      break L2;
                    } else {
                      var3_int = var3_int * param0;
                      break L2;
                    }
                  }
                  param0 = param0 * param0;
                  param2 = param2 >> 1;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 18;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "nq.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final String a(int param0, String param1) {
        v var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_e instanceof op) {
                var3 = ((op) ((Object) this.field_e)).a(-114);
                if (var3 != null) {
                  L2: {
                    if (var3.c(param0 + -98) != qe.field_a) {
                      break L2;
                    } else {
                      if (!param1.equals(this.field_e.field_m)) {
                        stackIn_8_0 = gq.field_p;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_10_0 = var3.a(param0 + 3690);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param1.equals(this.field_e.field_m)) {
              if (param0 != 0) {
                nq.c((byte) 75);
                stackIn_17_0 = null;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_13_0 = gq.field_p;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("nq.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return (String) ((Object) stackIn_17_0);
            }
          }
        }
    }

    nq(dh param0, dh param1) {
        super(param0);
        try {
            this.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "nq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 0;
        field_f = "options";
        field_j = new int[1];
    }
}
