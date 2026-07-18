/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static String field_b;
    static String field_a;
    static int[] field_c;

    final static void a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var3 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (og.field_O != -1) {
                break L1;
              } else {
                if (ee.field_r != -1) {
                  break L1;
                } else {
                  og.field_O = pg.field_n;
                  ee.field_r = fi.field_B;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                gj.field_b = gj.field_b + 1;
                if (param0 != null) {
                  if (param0.equals((Object) (Object) vb.field_I)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != vb.field_I) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!ol.field_b) {
                  if (jc.field_I <= gj.field_b) {
                    if (jc.field_I - -ll.field_o > gj.field_b) {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_16_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_16_0 = stackOut_11_0;
                    break L4;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_16_0 = stackOut_9_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_16_0;
                if (param0 == null) {
                  gj.field_b = 0;
                  break L5;
                } else {
                  if (ol.field_b) {
                    gj.field_b = jc.field_I;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      gj.field_b = 0;
                      break L5;
                    } else {
                      gj.field_b = jc.field_I;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                uc.field_a = og.field_O;
                if (param0 == null) {
                  if (var2_int == 0) {
                    break L6;
                  } else {
                    ol.field_b = true;
                    break L6;
                  }
                } else {
                  ol.field_b = false;
                  break L6;
                }
              }
              ag.field_u = ee.field_r;
              break L2;
            }
            L7: {
              if (ol.field_b) {
                break L7;
              } else {
                if (jc.field_I <= gj.field_b) {
                  break L7;
                } else {
                  if (ih.field_a) {
                    ag.field_u = ee.field_r;
                    uc.field_a = og.field_O;
                    gj.field_b = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              vb.field_I = param0;
              ee.field_r = -1;
              og.field_O = -1;
              if (!ol.field_b) {
                break L8;
              } else {
                if (q.field_b != gj.field_b) {
                  break L8;
                } else {
                  ol.field_b = false;
                  gj.field_b = 0;
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("d.D(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L9;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + 0 + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final synchronized static long a(byte param0) {
        long var1 = 0L;
        if (param0 >= 16) {
          var1 = System.currentTimeMillis();
          if (var1 < sj.field_k) {
            rb.field_d = rb.field_d + (-var1 + sj.field_k);
            sj.field_k = var1;
            return rb.field_d + var1;
          } else {
            sj.field_k = var1;
            return rb.field_d + var1;
          }
        } else {
          return 0L;
        }
    }

    final static boolean a(boolean param0, char param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        if (160 != param1) {
          if (param1 != 32) {
            if (param1 != 95) {
              if (param1 == 45) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_c = new int[8192];
    }
}
