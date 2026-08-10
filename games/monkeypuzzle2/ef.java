/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int field_b;
    static String field_a;

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
                      stackIn_17_0 = 1;
                      break L4;
                    } else {
                      stackIn_17_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_17_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_17_0 = 0;
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
            stackIn_44_0 = (RuntimeException) (var2);

            stackIn_44_1 = new StringBuilder().append("ef.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L10;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L10;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
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
