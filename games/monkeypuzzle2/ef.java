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
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (gk.field_e != -1) {
                break L1;
              } else {
                if ((oi.field_f ^ -1) == 0) {
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
                  if (param1.equals(pf.field_b)) {
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
                  L6: {
                    if (ac.field_b) {
                      break L6;
                    } else {
                      if (var2_int == 0) {
                        ka.field_a = 0;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ka.field_a = cj.field_e;
                  if (var3 == 0) {
                    break L5;
                  } else {
                    ka.field_a = 0;
                    break L5;
                  }
                }
              }
              L7: {
                if (param1 != null) {
                  ac.field_b = false;
                  break L7;
                } else {
                  if (var2_int == 0) {
                    break L7;
                  } else {
                    ac.field_b = true;
                    if (var3 == 0) {
                      break L7;
                    } else {
                      ac.field_b = false;
                      break L7;
                    }
                  }
                }
              }
              oa.field_G = gk.field_e;
              nj.field_a = oi.field_f;
              break L2;
            }
            L8: {
              if (ac.field_b) {
                break L8;
              } else {
                if (cj.field_e <= ka.field_a) {
                  break L8;
                } else {
                  if (oe.field_d) {
                    ka.field_a = 0;
                    nj.field_a = oi.field_f;
                    oa.field_G = gk.field_e;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              pf.field_b = param1;
              if (param0 > 8) {
                break L9;
              } else {
                ef.a(false);
                break L9;
              }
            }
            L10: {
              gk.field_e = -1;
              if (!ac.field_b) {
                break L10;
              } else {
                if (ik.field_l != ka.field_a) {
                  break L10;
                } else {
                  ka.field_a = 0;
                  ac.field_b = false;
                  break L10;
                }
              }
            }
            oi.field_f = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var2);
            stackOut_45_1 = new StringBuilder().append("ef.B(").append(param0).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L11;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            field_b = -19;
        }
    }

    static {
        field_a = "Confirm Email:";
    }
}
