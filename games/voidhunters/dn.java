/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends rqa {
    static float[] field_o;
    static int field_p;
    static dfa field_r;
    static int field_q;

    final static boolean a(tv[] param0, boolean param1, int param2, tv[] param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = 88 / ((param4 - 60) / 55);
              if (param3 == null) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = param3.length;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (param0 == null) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = param0.length;
                break L2;
              }
            }
            var7 = stackIn_7_0;
            if (var6 == var7) {
              var8 = 0;
              L3: while (true) {
                if (var8 >= var6) {
                  stackIn_24_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      if (param3[var8] == null) {
                        if (null == param0[var8]) {
                          break L4;
                        } else {
                          break L5;
                        }
                      } else {
                        if (param0[var8] == null) {
                          break L5;
                        } else {
                          L6: {
                            if (!param1) {
                              break L6;
                            } else {
                              if (param0[var8].getClass() != param3[var8].getClass()) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (!la.a(param0[var8], param3[var8], param2, (byte) -86)) {
                            break L4;
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                    stackIn_21_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                  var8++;
                  continue L3;
                }
              }
            } else {
              stackIn_9_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("dn.B(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0 != 0;
          } else {
            return stackIn_24_0 != 0;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              si.a(129, 62, param0[0].a(44));
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("dn.A(");

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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        int var1 = 1 % ((param0 - 59) / 42);
        field_r = null;
        field_o = null;
    }

    dn(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = new float[]{0.0f, -1.0f, 0.0f, 0.0f};
        field_q = 49;
    }
}
