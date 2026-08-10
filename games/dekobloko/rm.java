/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    static long field_c;
    static ui field_b;
    static ck[] field_a;

    final static boolean a(int param0, int param1, byte param2, int param3) {
        int var4;
        var4 = -27 % ((-37 - param2) / 37);
        if (!wc.field_n) {
          if (jh.field_h) {
            return tl.b(param0, 102, param3);
          } else {
            if (!dc.a(param3, param0, 6774)) {
              if (wl.field_p) {
                return false;
              } else {
                return nm.a(param1, 1, param3);
              }
            } else {
              return true;
            }
          }
        } else {
          return bc.field_E.a(wh.field_c, el.field_G, (byte) 126);
        }
    }

    final static void a(byte param0, String param1) {
        try {
            vh.field_f = param1;
            if (param0 != 73) {
                field_a = (ck[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "rm.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, ck[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (-1 <= (param3 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    var6_int = param1[0].field_K;
                    var7 = param1[2].field_K;
                    var8 = param1[1].field_K;
                    param1[0].a(param2, param0, param4);
                    param1[2].a(-var7 + param2 - -param3, param0, param4);
                    hk.b(kh.field_e);
                    hk.f(var6_int + param2, param0, -var7 + (param3 + param2), param1[1].field_C + param0);
                    var9 = param2 + var6_int;
                    var10 = param3 + param2 - var7;
                    if (param5 < -98) {
                      break L2;
                    } else {
                      field_a = (ck[]) null;
                      break L2;
                    }
                  }
                  param2 = var9;
                  L3: while (true) {
                    if (param2 >= var10) {
                      hk.a(kh.field_e);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param1[1].a(param2, param0, param4);
                      param2 = param2 + var8;
                      continue L3;
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
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("rm.B(").append(param0).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
            field_c = 40L;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
    }
}
