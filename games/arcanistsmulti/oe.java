/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static boolean field_a;
    static int field_b;
    static ll[] field_d;
    static int[] field_c;

    final static int a(int param0, int param1, int param2) {
        if ((param2 ^ -1) == param0) {
          if (!cn.a(113, param1)) {
            return ub.field_i[param2];
          } else {
            return 29;
          }
        } else {
          return ub.field_i[param2];
        }
    }

    public static void a(int param0) {
        if (param0 <= 119) {
            field_d = (ll[]) null;
            field_d = null;
            field_c = null;
            return;
        }
        field_d = null;
        field_c = null;
    }

    final static String a(String param0, int param1, int param2) {
        pg discarded$1 = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        wa var7 = null;
        wa var8 = null;
        ab var9 = null;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_7_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_20_0 = null;
        String stackOut_18_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param0);
            if (!vn.a(var10, param1 + -29140)) {
              stackOut_3_0 = fn.field_h;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (jb.field_t != 2) {
                stackOut_7_0 = oo.field_E;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var8 = im.a(0, param0);
                if (var8 == null) {
                  stackOut_11_0 = tj.a(122, new String[]{param0}, rd.field_c);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  discarded$1 = vd.field_d.a(var8, 121);
                  L1: while (true) {
                    var7 = (wa) ((Object) vd.field_d.a(param1 ^ 29140));
                    if (var7 != null) {
                      var7.field_Bb = var7.field_Bb - 1;
                      continue L1;
                    } else {
                      var8.a(true);
                      var8.a((byte) 88);
                      rc.field_m = rc.field_m - 1;
                      if (param1 == 29140) {
                        var9 = he.field_e;
                        var9.b((byte) -48, param2);
                        var9.field_g = var9.field_g + 1;
                        var5 = var9.field_g;
                        var9.f(1, (byte) -118);
                        var9.a(param0, 23333);
                        var9.b(var9.field_g + -var5, (byte) 43);
                        stackOut_20_0 = null;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        stackOut_18_0 = (String) null;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("oe.C(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return (String) ((Object) stackIn_21_0);
              }
            }
          }
        }
    }

    static {
        field_a = false;
    }
}
