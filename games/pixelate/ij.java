/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends de {
    static bd field_o;
    static String field_q;
    static String field_r;
    static String field_t;
    static String field_p;
    static int field_s;

    ij(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (fh.field_L != -1) {
                break L1;
              } else {
                if (-1 == h.field_Q) {
                  fh.field_L = uf.field_d;
                  h.field_Q = bg.field_k;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                no.field_h = no.field_h + 1;
                if (param1 != null) {
                  if (!param1.equals((Object) (Object) qg.field_b)) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (qg.field_b != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!re.field_h) {
                  if (no.field_h >= am.field_c) {
                    if (pc.field_s + am.field_c > no.field_h) {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_18_0 = stackOut_15_0;
                      break L4;
                    }
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_18_0 = stackOut_13_0;
                    break L4;
                  }
                } else {
                  stackOut_11_0 = 0;
                  stackIn_18_0 = stackOut_11_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_18_0;
                if (param1 == null) {
                  no.field_h = 0;
                  break L5;
                } else {
                  if (re.field_h) {
                    no.field_h = am.field_c;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      no.field_h = 0;
                      break L5;
                    } else {
                      no.field_h = am.field_c;
                      break L5;
                    }
                  }
                }
              }
              oo.field_f = h.field_Q;
              tm.field_V = fh.field_L;
              if (param1 != null) {
                re.field_h = false;
                break L2;
              } else {
                if (var2_int != 0) {
                  re.field_h = true;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L6: {
              qg.field_b = param1;
              if (re.field_h) {
                break L6;
              } else {
                if (no.field_h >= am.field_c) {
                  break L6;
                } else {
                  if (im.field_Jb) {
                    tm.field_V = fh.field_L;
                    oo.field_f = h.field_Q;
                    no.field_h = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L7: {
              h.field_Q = -1;
              fh.field_L = -1;
              if (!re.field_h) {
                break L7;
              } else {
                if (no.field_h != pi.field_Fb) {
                  break L7;
                } else {
                  re.field_h = false;
                  no.field_h = 0;
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var2;
            stackOut_40_1 = new StringBuilder().append("ij.B(").append(-5516).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L8;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ')');
        }
    }

    final void c(int param0) {
        if (param0 != 0) {
            return;
        }
        t.d();
    }

    final void c(byte param0) {
        if (param0 >= -13) {
            ((ij) this).c((byte) -53);
        }
    }

    public static void e(int param0) {
        field_o = null;
        field_r = null;
        field_q = null;
        field_p = null;
        field_t = null;
        int var1 = 8;
    }

    final void a(int param0) {
        if (param0 != 11) {
            field_t = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Name";
        field_o = new bd();
        field_t = "Yes";
        field_r = "Day";
        field_p = "Please try changing the following settings:  ";
        field_s = 0;
    }
}
