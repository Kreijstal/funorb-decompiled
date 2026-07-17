/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static String field_c;
    static int field_b;
    static String field_a;

    final static kk a(byte param0, int param1, nh param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        kk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        kk stackOut_3_0 = null;
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
            var4 = param2.a(-6635, param1);
            var3 = var4;
            if (var4 != null) {
              stackOut_3_0 = new kk(var4);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("dl.B(").append(110).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    public static void a() {
        field_a = null;
        field_c = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        ba.field_f = 0;
        qi.field_e = null;
        pe.field_l = null;
        var2 = lk.field_T;
        lk.field_T = bf.field_k;
        if (param1 == 51) {
          hb.field_a.field_c = 2;
          hb.field_a.field_h = hb.field_a.field_h + 1;
          bf.field_k = var2;
          if (hb.field_a.field_h < 2) {
            if (hb.field_a.field_h < 2) {
              if (hb.field_a.field_h < 4) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (50 == param1) {
                return 5;
              } else {
                if (hb.field_a.field_h < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (51 == param1) {
              return 2;
            } else {
              if (hb.field_a.field_h < 2) {
                if (hb.field_a.field_h < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param1) {
                  return 5;
                } else {
                  if (hb.field_a.field_h < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        } else {
          if (param1 == 50) {
            hb.field_a.field_c = 5;
            hb.field_a.field_h = hb.field_a.field_h + 1;
            bf.field_k = var2;
            if (hb.field_a.field_h < 2) {
              if (hb.field_a.field_h < 2) {
                if (hb.field_a.field_h < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param1) {
                  return 5;
                } else {
                  if (hb.field_a.field_h < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (51 == param1) {
                return 2;
              } else {
                if (hb.field_a.field_h >= 2) {
                  if (50 == param1) {
                    return 5;
                  } else {
                    if (hb.field_a.field_h < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (hb.field_a.field_h < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            hb.field_a.field_c = 1;
            hb.field_a.field_h = hb.field_a.field_h + 1;
            bf.field_k = var2;
            if (hb.field_a.field_h >= 2) {
              if (51 == param1) {
                return 2;
              } else {
                if (hb.field_a.field_h >= 2) {
                  if (50 == param1) {
                    return 5;
                  } else {
                    if (hb.field_a.field_h < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (hb.field_a.field_h < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (hb.field_a.field_h < 2) {
                if (hb.field_a.field_h < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param1) {
                  return 5;
                } else {
                  if (hb.field_a.field_h < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<col=FF0000>Defence -1</col>";
        field_b = 0;
        field_a = "Password is valid";
    }
}
