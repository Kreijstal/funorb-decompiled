/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vt extends tc {
    static int[] field_m;
    static wk field_k;
    static int field_n;
    static int field_l;

    final static boolean a(int param0, int param1, int param2, byte param3) {
        if (!bb.field_a) {
          if (!iu.field_h) {
            if (!po.a(param0, 6150, param2)) {
              if (!vi.field_d) {
                if (param3 <= 25) {
                  field_k = (wk) null;
                  return ro.b(param1, (byte) -59, param2);
                } else {
                  return ro.b(param1, (byte) -59, param2);
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return cd.a(param2, param0, false);
          }
        } else {
          return aw.field_i.a(rs.field_q, ui.field_i, 80);
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_m = null;
        if (param0) {
            vt.a(true);
        }
    }

    final static void a(int param0) {
        ft var1;
        ft var2;
        int var3;
        kr.field_G = new rk();
        kr.field_G.n(111);
        var1 = kr.field_G.e((byte) 126);
        if (var1 == null) {
          return;
        } else {
          var2 = kr.field_G.a((byte) -108);
          if (var2 != null) {
            var3 = kr.field_G.o(-1);
            if ((var3 ^ -1) > -1) {
              return;
            } else {
              if (param0 <= -112) {
                if (null != kr.field_G.field_w) {
                  if (-1 == (kr.field_G.field_w.length ^ -1)) {
                    return;
                  } else {
                    gb.a(var3, 7, var1.field_k, var2.field_k, var1.field_n, var2.field_n, kr.field_G.field_w, -40);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static int a(int param0, int param1, int param2, bv param3) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -9202) {
              stackIn_4_0 = ju.a(param3, 1 << param2, 1 << param1, param1, (byte) -122, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 101;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("vt.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    vt() {
    }

    final static boolean a(int param0, tu param1, int param2, wk[] param3, String param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6_int = param1.a(param4) + (param3[0].field_A << -200883423) >> 398192385;
              if (param5 <= -104) {
                break L1;
              } else {
                field_m = (int[]) null;
                break L1;
              }
            }
            L2: {
              var7 = -var6_int + param0;
              var8 = param0 - -var6_int;
              if (-1 >= (var7 ^ -1)) {
                if (var8 > 640) {
                  param0 = param0 - (var8 - 640);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                param0 = param0 - var7;
                break L2;
              }
            }
            stackIn_8_0 = wg.a(-33, -var6_int + param0, var6_int + param0, param2, param3[0].field_x + param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("vt.KA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param5 + ')');
        }
        return stackIn_8_0;
    }

    static {
    }
}
