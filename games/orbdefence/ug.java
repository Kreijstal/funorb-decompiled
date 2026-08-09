/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends hi {
    static tl field_p;
    static String field_o;
    private vi field_n;
    static int field_q;
    static String field_r;

    final static boolean a(byte param0, be param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -88 / ((2 - param0) / 56);
            stackIn_1_0 = param1.b((byte) -72);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("ug.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final String a(int param0, String param1) {
        ga var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
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
              if (this.field_n instanceof ib) {
                var3 = ((ib) ((Object) this.field_n)).a((byte) -115);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.d(param0 + 3453) != nc.field_bb) {
                      break L2;
                    } else {
                      if (!param1.equals(this.field_n.field_l)) {
                        stackIn_7_0 = cc.field_i;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_9_0 = var3.a(123);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            if (param1.equals(this.field_n.field_l)) {
              if (param0 != -11300) {
                stackIn_16_0 = (String) null;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_12_0 = cc.field_i;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("ug.B(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_o = null;
        int var1 = 49 / ((param0 - 7) / 43);
        field_r = null;
        field_p = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ul.d(param2, param1, param4, param3, 0);
        param1++;
        param3 -= 2;
        param2++;
        param4 -= 2;
        ul.a(param2, param1, param4, param3, 11184810, 4605510);
        param2 += 2;
        param3 -= 4;
        param1 += 2;
        param4 -= 4;
        ul.c(param2, param1, param4, param3, 2500134, 5921370);
        param3 -= 2;
        param1++;
        param4 -= 2;
        param2++;
        if (param0 < 32) {
          return;
        } else {
          ul.d(param2, param1, param4, param3, 0);
          param1++;
          param2++;
          param4 -= 2;
          param3 -= 2;
          ul.a(param2, param1, param4, param3, 394758, 1710618);
          gk.field_a.e(param2, param1, param4, param3, 64);
          return;
        }
    }

    final qd a(String param0, byte param1) {
        ga var3 = null;
        RuntimeException var3_ref = null;
        qd stackIn_6_0 = null;
        qd stackIn_9_0 = null;
        qd stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_n instanceof ib) {
                var3 = ((ib) ((Object) this.field_n)).a((byte) 22);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.d(-7847) != nc.field_bb) {
                    stackIn_6_0 = vh.field_h;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param1 == -99) {
              L2: {
                if (!param0.equals(this.field_n.field_l)) {
                  stackIn_13_0 = vh.field_h;
                  break L2;
                } else {
                  stackIn_13_0 = nc.field_bb;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_9_0 = (qd) null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("ug.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    ug(vi param0, vi param1) {
        super(param0);
        try {
            this.field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "MEGA SHOT";
        field_p = new tl();
    }
}
