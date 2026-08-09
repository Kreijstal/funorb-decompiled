/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va implements pf {
    static String field_a;
    static eg field_c;
    static String field_b;
    static String field_d;
    static String field_e;

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (var6_int > param0.field_k) {
                if (param1 == 5592405) {
                  var6_int = 1;
                  L2: while (true) {
                    if (5 < var6_int) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        var7 = var6_int + (-5 + -(param0.field_v >> -1245424703) + (param0.field_n + param2) - -param0.field_v);
                        var8 = (param0.field_v >> -687975071) + -(var6_int * 2);
                        var9 = var6_int + (param3 + param0.field_j - -(-4 + param0.field_k >> 1006381601));
                        if (var9 < de.field_c) {
                          break L3;
                        } else {
                          if (var9 >= de.field_k) {
                            break L3;
                          } else {
                            L4: {
                              if (var7 <= de.field_i) {
                                break L4;
                              } else {
                                de.field_l[-1 + (de.field_e * var9 + var7)] = dg.a(16711422, de.field_l[de.field_e * var9 + var7 + -1]) >> 782918177;
                                break L4;
                              }
                            }
                            if (de.field_h > var8 + var7) {
                              de.field_l[var9 * de.field_e - -var7 + var8] = dg.a(16711422, de.field_l[de.field_e * var9 + var7 + var8]) >> 1028993697;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      de.f(var7, var9, var8, 0);
                      var6_int++;
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var7 = 48 * var6_int / param0.field_k + 152;
                var8 = var7 | (var7 << 1592779048 | var7 << 1985315888);
                de.f(param0.field_n + param2, param3 - (-param0.field_j - var6_int), param0.field_v, var8);
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6);

            stackIn_19_1 = new StringBuilder().append("va.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(long param0, int param1, int[] param2, String param3, int param4) {
        ij var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (wj.a(param3, param2, param4, 2, param0)) {
              L1: {
                if (param4 != param1) {
                  break L1;
                } else {
                  param4 = 0;
                  break L1;
                }
              }
              nj.field_c = param4;
              so.field_p = param3;
              var7 = (CharSequence) ((Object) param3);
              ua.field_S = gk.a(var7, param1 ^ -14);
              gg.field_e = param0;
              var6 = ff.a(param2, 49, gl.field_c, mj.field_z, ab.field_p);
              ag.a(var6, (byte) -104);
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6_ref);

            stackIn_9_1 = new StringBuilder().append("va.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 < 110) {
            field_a = (String) null;
        }
        field_a = null;
        field_d = null;
        field_b = null;
    }

    static {
        field_a = "  If you don't like playing Team Games, just select the <col=ffffff>Free-For-All</col> button on the game creation screen.";
        field_b = "Imps can use the Self Destruct spell. This spell causes the Imp to explode, damaging anything nearby - the more health the Imp has, the more damage the explosion causes. It also has the effect of healing any other imps caught in the blast, which can lead to some very dangerous Imps...<br>Select an Imp's Self Destruct spell";
        field_d = "Only show private chat from my friends and opponents";
    }
}
