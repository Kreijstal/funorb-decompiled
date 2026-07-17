/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int field_b;
    static String field_a;

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (gk.field_e != -1) {
                break L1;
              } else {
                if (oi.field_f == -1) {
                  gk.field_e = ei.field_a;
                  oi.field_f = p.field_a;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                ka.field_a = ka.field_a + 1;
                if (param1 != null) {
                  if (param1.equals((Object) (Object) pf.field_b)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != pf.field_b) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!ac.field_b) {
                  if (cj.field_e <= ka.field_a) {
                    if (ka.field_a < cj.field_e - -id.field_a) {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  ka.field_a = 0;
                  break L5;
                } else {
                  if (ac.field_b) {
                    ka.field_a = cj.field_e;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      ka.field_a = 0;
                      break L5;
                    } else {
                      ka.field_a = cj.field_e;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (param1 != null) {
                  ac.field_b = false;
                  break L6;
                } else {
                  if (var2_int == 0) {
                    break L6;
                  } else {
                    ac.field_b = true;
                    break L6;
                  }
                }
              }
              oa.field_G = gk.field_e;
              nj.field_a = oi.field_f;
              break L2;
            }
            L7: {
              if (ac.field_b) {
                break L7;
              } else {
                if (cj.field_e <= ka.field_a) {
                  break L7;
                } else {
                  if (oe.field_d) {
                    ka.field_a = 0;
                    nj.field_a = oi.field_f;
                    oa.field_G = gk.field_e;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              pf.field_b = param1;
              if (param0 > 8) {
                break L8;
              } else {
                ef.a(false);
                break L8;
              }
            }
            L9: {
              gk.field_e = -1;
              if (!ac.field_b) {
                break L9;
              } else {
                if (ik.field_l != ka.field_a) {
                  break L9;
                } else {
                  ka.field_a = 0;
                  ac.field_b = false;
                  break L9;
                }
              }
            }
            oi.field_f = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var2;
            stackOut_42_1 = new StringBuilder().append("ef.B(").append(param0).append(44);
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L10;
            }
          }
          throw la.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 41);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            field_b = -19;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Confirm Email:";
    }
}
