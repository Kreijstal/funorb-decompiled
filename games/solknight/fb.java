/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static int field_c;
    static int[] field_b;
    static boolean field_a;

    final static void a(int param0, String[] param1, int param2, String param3) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 12239) {
                break L1;
              } else {
                field_b = (int[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                gb.field_i = da.field_d;
                if (param2 == 255) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if ((param2 ^ -1) > -101) {
                        break L5;
                      } else {
                        if ((param2 ^ -1) >= -106) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    a.field_h = mh.a(param2, true, param3);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                  var4 = param1;
                  kf.a(1, var4);
                  a.field_h = wk.a((byte) 17, param1);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                stackOut_10_0 = 0;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (13 <= uh.field_d) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L6;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L6;
                }
              }
              a.field_h = di.a(stackIn_13_0 != 0, stackIn_13_1 != 0);
              var6 = (String[]) null;
              kf.a(1, (String[]) null);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("fb.C(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          L8: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            String var2 = (String) null;
            fb.a(-18, (String[]) null, -68, (String) null);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        if (param0 != 255) {
          L0: {
            fb.a(true);
            if (null != u.field_b) {
              u.field_b.d(true);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != pc.field_b) {
              pc.field_b.f((byte) -85);
              break L1;
            } else {
              break L1;
            }
          }
          df.h(-1);
          return;
        } else {
          L2: {
            if (null != u.field_b) {
              u.field_b.d(true);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null != pc.field_b) {
              pc.field_b.f((byte) -85);
              break L3;
            } else {
              break L3;
            }
          }
          df.h(-1);
          return;
        }
    }

    static {
        field_c = 0;
        field_b = new int[1024];
        field_a = true;
    }
}
