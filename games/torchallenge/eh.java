/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends da {
    int field_j;
    static int field_k;
    static int field_m;
    static ne field_p;
    static int field_o;
    static int field_l;
    byte[] field_i;
    static int field_n;

    final static boolean a(int param0, int param1, int[] param2, int param3, qe param4) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qe var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qe var14 = null;
        try {
          L0: {
            L1: {
              if (param1 == -30917) {
                break L1;
              } else {
                field_o = 49;
                break L1;
              }
            }
            if (param2[param3] < 0) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ea.field_g.length > param2[param3]) {
                L2: {
                  var14 = ea.field_g[param2[param3]];
                  var5 = var14;
                  if (var5 == param4) {
                    break L2;
                  } else {
                    if (var5 != null) {
                      var6 = var14.field_e;
                      var7 = -var14.field_w + var14.field_z;
                      var8 = var14.field_I;
                      var9 = var14.field_w;
                      var10 = param4.field_e;
                      var11 = -param4.field_w + param4.field_z;
                      var12 = param4.field_I;
                      var13 = param4.field_w;
                      if (o.a(var13, var7, var12, var8, var9, var10, var6, (byte) 9, var11)) {
                        stackIn_16_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        stackIn_14_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5_ref);

            stackIn_19_1 = new StringBuilder().append("eh.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 50) {
          L0: {
            field_o = 9;
            if (-251 <= (jc.field_c ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-251 <= (jc.field_c ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void c(byte param0) {
        field_p = null;
        if (param0 != 121) {
            qe var2 = (qe) null;
            eh.a(65, 6, (int[]) null, 124, (qe) null);
        }
    }

    final static void b(byte param0) {
        if (param0 >= -45) {
            field_l = -119;
            pf.field_d = new sl();
            return;
        }
        pf.field_d = new sl();
    }

    eh(byte[] param0) {
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "eh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        o.a(28, 50);
        field_n = 0;
    }
}
