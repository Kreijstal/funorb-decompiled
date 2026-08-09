/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends pu {
    static String[] field_l;

    final static rga a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        rga stackIn_3_0 = null;
        rga stackIn_7_0 = null;
        rga stackIn_18_0 = null;
        rga stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (63 < var2_int) {
                stackIn_7_0 = rm.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param1 == 5431) {
                    break L1;
                  } else {
                    field_l = (String[]) null;
                    break L1;
                  }
                }
                var3 = 0;
                L2: while (true) {
                  if (var2_int > var3) {
                    L3: {
                      var4 = param0.charAt(var3);
                      if (var4 != 45) {
                        if (0 == (hb.field_i.indexOf(var4) ^ -1)) {
                          stackIn_22_0 = cha.field_m;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      } else {
                        L4: {
                          if (0 == var3) {
                            break L4;
                          } else {
                            if (var3 == -1 + var2_int) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackIn_18_0 = cha.field_m;
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
            } else {
              stackIn_3_0 = uc.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("ol.C(");

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
          throw pe.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              return stackIn_22_0;
            }
          }
        }
    }

    public static void d(byte param0) {
        field_l = null;
        if (param0 > -18) {
            field_l = (String[]) null;
        }
    }

    final static cq a(be param0, boolean param1) {
        RuntimeException var2 = null;
        cq stackIn_2_0 = null;
        cq stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              stackIn_4_0 = tw.a(je.b(param0, 100, 96), (byte) -36);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (cq) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ol.A(");

            if (param0 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_l = new String[]{"single", "range", "long range", "ranged with splash", "splash", "big splash", "cone", "slash", "charge", "long charge", "jump", "big jump", "bigger splash", "board", "doughnut", "boomerang", "team", "one creature", "board edge", "mid splash", "range splash"};
    }
}
