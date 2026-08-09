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
        kk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 71) {
                break L1;
              } else {
                dl.a(-15, -114);
                break L1;
              }
            }
            var4 = param2.a(-6635, param1);
            var3 = var4;
            if (var4 != null) {
              stackIn_6_0 = new kk(var4);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("dl.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        nh var2;
        field_a = null;
        if (param0 != 51) {
          var2 = (nh) null;
          dl.a((byte) -53, -32, (nh) null);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = DungeonAssault.field_K;
        ba.field_f = 0;
        qi.field_e = null;
        pe.field_l = null;
        var2 = lk.field_T;
        lk.field_T = bf.field_k;
        if ((param1 ^ -1) == -52) {
          hb.field_a.field_c = 2;
          hb.field_a.field_h = hb.field_a.field_h + 1;
          bf.field_k = var2;
          if (-3 < (hb.field_a.field_h ^ -1)) {
            if (-3 < (hb.field_a.field_h ^ -1)) {
              if ((hb.field_a.field_h ^ -1) > param0) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (50 == param1) {
                return 5;
              } else {
                if ((hb.field_a.field_h ^ -1) > param0) {
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
              if (-3 < (hb.field_a.field_h ^ -1)) {
                if ((hb.field_a.field_h ^ -1) > param0) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param1) {
                  return 5;
                } else {
                  if ((hb.field_a.field_h ^ -1) > param0) {
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
            if (-3 < (hb.field_a.field_h ^ -1)) {
              if (-3 < (hb.field_a.field_h ^ -1)) {
                if ((hb.field_a.field_h ^ -1) <= param0) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (50 != param1) {
                  if ((hb.field_a.field_h ^ -1) > param0) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return 5;
                }
              }
            } else {
              if (51 != param1) {
                if (-3 >= (hb.field_a.field_h ^ -1)) {
                  if (50 == param1) {
                    return 5;
                  } else {
                    if ((hb.field_a.field_h ^ -1) <= param0) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  if ((hb.field_a.field_h ^ -1) <= param0) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              } else {
                return 2;
              }
            }
          } else {
            hb.field_a.field_c = 1;
            hb.field_a.field_h = hb.field_a.field_h + 1;
            bf.field_k = var2;
            if (-3 >= (hb.field_a.field_h ^ -1)) {
              if (51 == param1) {
                return 2;
              } else {
                if (-3 >= (hb.field_a.field_h ^ -1)) {
                  if (50 == param1) {
                    return 5;
                  } else {
                    if ((hb.field_a.field_h ^ -1) <= param0) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  if ((hb.field_a.field_h ^ -1) <= param0) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            } else {
              if (-3 < (hb.field_a.field_h ^ -1)) {
                if ((hb.field_a.field_h ^ -1) <= param0) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (50 != param1) {
                  if ((hb.field_a.field_h ^ -1) <= param0) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 5;
                }
              }
            }
          }
        }
    }

    static {
        field_c = "<col=FF0000>Defence -1</col>";
        field_b = 0;
        field_a = "Password is valid";
    }
}
