/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static int[] field_a;
    static int field_c;
    static String field_b;

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        try {
          L0: {
            L1: {
              if (a.field_e != -1) {
                break L1;
              } else {
                if (dg.field_n == -1) {
                  a.field_e = pe.field_d;
                  dg.field_n = la.field_c;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                di.field_m = di.field_m + 1;
                if (param1 == null) {
                  if (sc.field_c == null) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (param1.equals((Object) (Object) sc.field_c)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!eg.field_h) {
                  if (di.field_m >= le.field_a) {
                    if (le.field_a - -hf.field_l > di.field_m) {
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
                L6: {
                  var2_int = stackIn_17_0;
                  if (param1 == null) {
                    break L6;
                  } else {
                    if (eg.field_h) {
                      di.field_m = le.field_a;
                      break L5;
                    } else {
                      if (var2_int == 0) {
                        break L6;
                      } else {
                        di.field_m = le.field_a;
                        break L5;
                      }
                    }
                  }
                }
                di.field_m = 0;
                break L5;
              }
              ti.field_c = a.field_e;
              ua.field_a = dg.field_n;
              if (param1 == null) {
                if (var2_int == 0) {
                  break L2;
                } else {
                  eg.field_h = true;
                  break L2;
                }
              } else {
                eg.field_h = false;
                break L2;
              }
            }
            L7: {
              sc.field_c = param1;
              if (eg.field_h) {
                break L7;
              } else {
                if (le.field_a <= di.field_m) {
                  break L7;
                } else {
                  if (!uf.field_d) {
                    break L7;
                  } else {
                    ua.field_a = dg.field_n;
                    ti.field_c = a.field_e;
                    di.field_m = 0;
                    break L7;
                  }
                }
              }
            }
            L8: {
              a.field_e = -1;
              if (!eg.field_h) {
                break L8;
              } else {
                if (sb.field_c != di.field_m) {
                  break L8;
                } else {
                  eg.field_h = false;
                  di.field_m = 0;
                  break L8;
                }
              }
            }
            dg.field_n = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("qi.B(").append(-111).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L9;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L9;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
    }

    final static id a(int param0) {
        id var1 = new id(td.field_m, gb.field_w, fc.field_d[0], qd.field_H[0], gg.field_d[0], gh.field_C[0], og.field_c[0], of.field_g);
        rc.b((byte) 64);
        return var1;
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8];
        field_c = 0;
    }
}
