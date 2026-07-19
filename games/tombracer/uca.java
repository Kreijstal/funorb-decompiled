/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uca {
    int field_e;
    static double field_b;
    static qea field_c;
    static int field_a;
    static int field_d;
    static iu[] field_f;

    final static String a(String param0, byte param1, int param2) {
        vg discarded$1 = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        mu var7 = null;
        mu var8 = null;
        kh var9 = null;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
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
        String stackOut_9_0 = null;
        Object stackOut_20_0 = null;
        String stackOut_5_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param0);
            if (fs.a(true, var10)) {
              if ((ae.field_g ^ -1) == -3) {
                var8 = wp.a(94, param0);
                if (var8 == null) {
                  stackOut_9_0 = gl.a((byte) 88, hoa.field_m, new String[]{param0});
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    if (param1 == 102) {
                      break L1;
                    } else {
                      field_d = 38;
                      break L1;
                    }
                  }
                  discarded$1 = fla.field_f.a(-13854, var8);
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          var7 = (mu) ((Object) fla.field_f.e(115));
                          if (var7 != null) {
                            break L5;
                          } else {
                            if (var6 != 0) {
                              break L4;
                            } else {
                              if (var6 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var7.field_Db = var7.field_Db - 1;
                        break L4;
                      }
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                    var8.p(19);
                    var8.c(-7975);
                    ii.field_a = ii.field_a - 1;
                    var9 = ql.field_k;
                    var9.k(param2, param1 + -3090);
                    var9.field_h = var9.field_h + 1;
                    var5 = var9.field_h;
                    var9.i(1, 0);
                    var9.a(param0, false);
                    var9.d(var9.field_h - var5, (byte) -113);
                    stackOut_20_0 = null;
                    stackIn_21_0 = stackOut_20_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = dga.field_b;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = pk.field_v;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("uca.B(");
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
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return (String) ((Object) stackIn_21_0);
            }
          }
        }
    }

    public static void a(int param0) {
        int var1 = 79 / ((-50 - param0) / 48);
        field_f = null;
        field_c = null;
    }

    final static void a(int param0, toa param1, byte param2) {
        kh var5 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            var5 = ql.field_k;
            var5.k(param0, -2988);
            var5.field_h = var5.field_h + 1;
            if (param2 != 93) {
                field_a = 32;
            }
            var4 = var5.field_h;
            var5.i(1, 0);
            var5.i(param1.field_i, 0);
            var5.e(param2 ^ -5253, param1.field_k);
            var5.a(param1.field_h, (byte) -22);
            var5.a(param1.field_m, (byte) 102);
            var5.a(param1.field_l, (byte) -1);
            var5.a(param1.field_g, (byte) -90);
            discarded$0 = var5.g(var4, 64);
            var5.d(-var4 + var5.field_h, (byte) -122);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uca.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = Math.atan2(1.0, 0.0);
        field_c = new qea(new int[]{21312});
        field_a = -1;
    }
}
