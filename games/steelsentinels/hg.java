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
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
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
            if (param0 <= -125) {
              L9: {
                rc.field_b = param1;
                if (!pg.field_A) {
                  break L9;
                } else {
                  if (~si.field_m != ~ql.field_Ub) {
                    break L9;
                  } else {
                    si.field_m = 0;
                    pg.field_A = false;
                    break L9;
                  }
                }
              }
              pe.field_d = -1;
              jj.field_c = -1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("hg.C(").append(param0).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L10;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              db.a(-1, (java.awt.Component) (Object) param1);
              al.a(true, (java.awt.Component) (Object) param1);
              if (null == nc.field_j) {
                break L1;
              } else {
                nc.field_j.a((java.awt.Component) (Object) param1, false);
                break L1;
              }
            }
            if (param0 == -93) {
              break L0;
            } else {
              field_h = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("hg.B(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    public static void a(int param0) {
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
