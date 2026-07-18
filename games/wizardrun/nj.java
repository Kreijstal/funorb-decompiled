/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends wl {
    static db[] field_k;
    int field_l;
    int field_o;
    String[][] field_n;
    long[][] field_q;
    int field_j;
    int[][] field_i;
    boolean field_m;
    static int field_r;
    static String field_p;

    public static void a(int param0) {
        field_k = null;
        field_p = null;
        if (param0 >= -86) {
            nj.a(-51);
        }
    }

    final static void a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
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
            L1: {
              cf.field_i = false;
              lc.field_d = false;
              if (null == aa.field_lb) {
                break L1;
              } else {
                if (!aa.field_lb.field_H) {
                  break L1;
                } else {
                  L2: {
                    var3_int = 1;
                    if (param2 != 8) {
                      break L2;
                    } else {
                      L3: {
                        if (wi.field_J) {
                          param1 = i.field_f;
                          break L3;
                        } else {
                          param1 = fc.field_a;
                          break L3;
                        }
                      }
                      param2 = 2;
                      r.field_b.a(param0 + 5980, rg.field_S);
                      break L2;
                    }
                  }
                  L4: {
                    if (param2 != 10) {
                      break L4;
                    } else {
                      var3_int = 0;
                      int discarded$2 = -3870;
                      ie.a();
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int != 0) {
                      L6: {
                        if (!lc.field_d) {
                          break L6;
                        } else {
                          param1 = di.a(new String[1], (byte) 84, ca.field_d);
                          break L6;
                        }
                      }
                      L7: {
                        if (ga.field_a) {
                          param1 = ca.field_g;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      aa.field_lb.a(param1, 57, param2);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (param2 == 256) {
                    break L1;
                  } else {
                    if (10 != param2) {
                      if (!wi.field_J) {
                        r.field_b.h(-71);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if (param0 == 10) {
              break L0;
            } else {
              var4 = null;
              nj.a(-77, (String) null, 102);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("nj.B(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param2 + ')');
        }
    }

    nj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 255;
        field_p = "World-Stage";
    }
}
