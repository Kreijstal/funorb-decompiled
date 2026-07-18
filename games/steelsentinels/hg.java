/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static long[] field_c;
    boolean field_d;
    static wk[] field_i;
    String field_b;
    String field_g;
    static boolean field_h;
    static String field_f;
    static String field_a;
    static gh field_e;

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              si.field_m = si.field_m + 1;
              if (pe.field_d != -1) {
                break L1;
              } else {
                if (jj.field_c == -1) {
                  jj.field_c = pi.field_c;
                  pe.field_d = oh.field_f;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  if (rc.field_b != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (param1.equals((Object) (Object) rc.field_b)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (pg.field_A) {
                    break L5;
                  } else {
                    if (~ik.field_c < ~si.field_m) {
                      break L5;
                    } else {
                      if (~si.field_m <= ~(ni.field_c + ik.field_c)) {
                        break L5;
                      } else {
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L4;
              }
              L6: {
                var2_int = stackIn_14_0;
                if (param1 == null) {
                  si.field_m = 0;
                  break L6;
                } else {
                  if (pg.field_A) {
                    si.field_m = ik.field_c;
                    break L6;
                  } else {
                    if (var2_int != 0) {
                      si.field_m = ik.field_c;
                      break L6;
                    } else {
                      si.field_m = 0;
                      break L6;
                    }
                  }
                }
              }
              L7: {
                if (param1 != null) {
                  pg.field_A = false;
                  break L7;
                } else {
                  if (var2_int != 0) {
                    pg.field_A = true;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              t.field_l = jj.field_c;
              eh.field_a = pe.field_d;
              break L2;
            }
            L8: {
              if (pg.field_A) {
                break L8;
              } else {
                if (~si.field_m <= ~ik.field_c) {
                  break L8;
                } else {
                  if (!ik.field_a) {
                    break L8;
                  } else {
                    t.field_l = jj.field_c;
                    si.field_m = 0;
                    eh.field_a = pe.field_d;
                    break L8;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var2;
            stackOut_34_1 = new StringBuilder().append("hg.C(").append(-127).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L9;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            db.a(-1, (java.awt.Component) (Object) param1);
            al.a(true, (java.awt.Component) (Object) param1);
            if (null == nc.field_j) {
              break L0;
            } else {
              nc.field_j.a((java.awt.Component) (Object) param1, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("hg.B(").append(-93).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public static void a() {
        field_e = null;
        field_i = null;
        field_c = null;
        field_f = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new long[32];
        field_h = false;
        field_f = "Go Back";
        field_a = "FULL ACCESS";
    }
}
