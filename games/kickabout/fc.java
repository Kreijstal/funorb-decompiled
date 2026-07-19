/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static boolean field_f;
    static gm field_c;
    static ot field_h;
    static String field_e;
    static int field_a;
    static String field_b;
    static boolean field_d;
    static int[] field_g;

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_g = null;
        field_c = null;
        field_b = null;
        if (param0 != 29136) {
            String var2 = (String) null;
            fc.a((String) null, -116, 0);
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
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
            L1: {
              po.field_f = false;
              wq.field_g = false;
              var3_int = 123 / ((param2 - 22) / 47);
              if (null == rk.field_f) {
                break L1;
              } else {
                if (rk.field_f.field_C) {
                  L2: {
                    var4 = 1;
                    if ((param1 ^ -1) == -9) {
                      L3: {
                        param1 = 2;
                        if (hk.field_G) {
                          param0 = dt.field_j;
                          break L3;
                        } else {
                          param0 = cb.field_f;
                          break L3;
                        }
                      }
                      pb.field_E.a(ep.field_b, (byte) 120);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if ((param1 ^ -1) != -11) {
                      break L4;
                    } else {
                      pc.a((byte) -126);
                      var4 = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (var4 == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (po.field_f) {
                          param0 = vo.a((byte) -18, mh.field_l, new String[]{param0});
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (!is.field_a) {
                          break L7;
                        } else {
                          param0 = ai.field_L;
                          break L7;
                        }
                      }
                      rk.field_f.a(param1, 101, param0);
                      break L5;
                    }
                  }
                  if (-257 == (param1 ^ -1)) {
                    break L1;
                  } else {
                    if ((param1 ^ -1) == -11) {
                      break L1;
                    } else {
                      if (hk.field_G) {
                        break L1;
                      } else {
                        pb.field_E.h((byte) -76);
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("fc.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = 2;
        field_e = "Slight stagger";
        field_b = "rankings";
    }
}
