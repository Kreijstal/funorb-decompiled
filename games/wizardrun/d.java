/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static String field_b;
    static String field_a;
    static int[] field_c;

    final static void a(String param0, int param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (og.field_O != -1) {
                break L1;
              } else {
                if ((ee.field_r ^ -1) != 0) {
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
                  if (param0.equals(vb.field_I)) {
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
                      stackIn_16_0 = 1;
                      break L4;
                    } else {
                      stackIn_16_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_16_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_16_0 = 0;
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
              if (param1 == 0) {
                break L8;
              } else {
                d.a(false, 'b');
                break L8;
              }
            }
            L9: {
              if (!ol.field_b) {
                break L9;
              } else {
                if (q.field_b != gj.field_b) {
                  break L9;
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
          L10: {
            var2 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var2);

            stackIn_42_1 = new StringBuilder().append("d.D(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L10;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L10;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -5309) {
          d.a((byte) 113);
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    final synchronized static long a(byte param0) {
        long var1;
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
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        if (param0) {
          if (160 != param1) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_20_0 = 1;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          d.a(87);
          if (160 != param1) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_8_0 = 1;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_c = new int[8192];
    }
}
