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
        field_x = null;
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
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ve.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, lg param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            if (lg.field_M != param3) {
              L1: {
                L2: {
                  if (null == vl.field_h) {
                    break L2;
                  } else {
                    if (param3 == null) {
                      break L2;
                    } else {
                      if (param1 != 0) {
                        vl.field_h.a(param3, param2, 0, param1);
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L3: {
                  if (vl.field_h != null) {
                    i.field_p.b((og) (Object) vl.field_h);
                    vl.field_h = null;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (param3 != null) {
                  vl.field_h = new qf(param3);
                  w.a(-1, ol.field_e);
                  if (param3 == kb.field_d) {
                    vl.field_h.a(false);
                    i.field_p.c((og) (Object) vl.field_h);
                    break L1;
                  } else {
                    if (bl.field_g == param3) {
                      vl.field_h.a(false);
                      i.field_p.c((og) (Object) vl.field_h);
                      break L1;
                    } else {
                      if (param3 != b.field_l) {
                        i.field_p.c((og) (Object) vl.field_h);
                        break L1;
                      } else {
                        vl.field_h.a(false);
                        i.field_p.c((og) (Object) vl.field_h);
                        break L1;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              lg.field_M = param3;
              if (param0 > 64) {
                break L0;
              } else {
                field_y = null;
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("ve.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[200][2];
        field_w = new long[32];
        field_A = new te(12, 0, 1, 0);
        field_y = new int[]{500, 500, 300, 100, 200, 300, 300, 100, 200, 300};
    }
}
