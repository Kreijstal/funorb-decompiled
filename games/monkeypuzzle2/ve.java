/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends mg {
    static ad field_z;
    static te field_A;
    static int[][] field_x;
    static long[] field_w;
    static int[] field_y;

    public static void a(byte param0) {
        field_A = null;
        field_y = null;
        int var1 = -95 / ((-34 - param0) / 38);
        field_w = null;
        field_z = null;
        field_x = (int[][]) null;
    }

    private ve(ta param0, int param1) {
        super(param0, param1);
    }

    ve(int param0) {
        this(t.field_z, param0);
    }

    final String c(we param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -775) {
                break L1;
              } else {
                ve.a((byte) 94);
                break L1;
              }
            }
            stackOut_2_0 = al.a('*', param0.field_s.length(), 12663);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ve.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, lg param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (lg.field_M != param3) {
              L1: {
                L2: {
                  L3: {
                    if (null == vl.field_h) {
                      break L3;
                    } else {
                      if (param3 == null) {
                        break L3;
                      } else {
                        if (param1 != 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (vl.field_h != null) {
                      i.field_p.b(vl.field_h);
                      vl.field_h = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (param3 != null) {
                    L5: {
                      vl.field_h = new qf(param3);
                      w.a(-1, ol.field_e);
                      if (param3 == kb.field_d) {
                        vl.field_h.a(false);
                        break L5;
                      } else {
                        if (bl.field_g == param3) {
                          vl.field_h.a(false);
                          break L5;
                        } else {
                          if (param3 != b.field_l) {
                            break L5;
                          } else {
                            vl.field_h.a(false);
                            break L5;
                          }
                        }
                      }
                    }
                    i.field_p.c(vl.field_h);
                    if (!MonkeyPuzzle2.field_F) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
                vl.field_h.a(param3, param2, 0, param1);
                break L1;
              }
              lg.field_M = param3;
              if (param0 > 64) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_y = (int[]) null;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var4);
            stackOut_23_1 = new StringBuilder().append("ve.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_x = new int[200][2];
        field_w = new long[32];
        field_A = new te(12, 0, 1, 0);
        field_y = new int[]{500, 500, 300, 100, 200, 300, 300, 100, 200, 300};
    }
}
