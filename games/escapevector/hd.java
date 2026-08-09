/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends java.awt.Canvas {
    static String field_a;
    private java.awt.Component field_b;
    static String field_e;
    static int[] field_d;
    static int field_c;

    public static void a(int param0) {
        int var1 = 26 / ((param0 - 55) / 60);
        field_a = null;
        field_e = null;
        field_d = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_b.update(param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hd.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!lb.b((byte) -35, param0)) {
              if (aa.a(1, param0)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!ol.a((byte) -7, param0)) {
                  if (param2.length() == 0) {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!lg.a(0, param0, param2)) {
                      if (lf.a(param0, (byte) 37, param2)) {
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param1) {
                          if (!pi.a(-91, param0, param2)) {
                            stackIn_28_0 = 1;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackIn_26_0 = 0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackIn_23_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("hd.B(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L1;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_26_0 != 0;
                      } else {
                        return stackIn_28_0 != 0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_b.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hd.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    hd(java.awt.Component param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Triple shot";
        field_d = new int[8192];
    }
}
