/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static long[] field_b;
    static String field_d;
    static je field_c;
    static String field_a;

    public static void a() {
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static rn a(int param0, String param1) {
        ph var3 = null;
        RuntimeException var3_ref = null;
        ph stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ph stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new ph();
            ((rn) (Object) var3).field_b = param0;
            ((rn) (Object) var3).field_d = param1;
            stackOut_0_0 = (ph) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("ig.C(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -92 + ')');
        }
        return (rn) (Object) stackIn_1_0;
    }

    final static boolean a(byte param0, char param1) {
        if (32 <= param1) {
          if (param1 <= 126) {
            return true;
          } else {
            if (param1 < 160) {
              L0: {
                if (param1 == 8364) {
                  break L0;
                } else {
                  if (338 == param1) {
                    break L0;
                  } else {
                    if (param1 == 8212) {
                      break L0;
                    } else {
                      if (param1 == 339) {
                        break L0;
                      } else {
                        if (param1 != 376) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              if (param1 <= 255) {
                return true;
              } else {
                L1: {
                  if (param1 == 8364) {
                    break L1;
                  } else {
                    if (338 == param1) {
                      break L1;
                    } else {
                      if (param1 == 8212) {
                        break L1;
                      } else {
                        if (param1 == 339) {
                          break L1;
                        } else {
                          if (param1 != 376) {
                            return false;
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                  }
                }
                return true;
              }
            }
          }
        } else {
          if (param1 < 160) {
            L2: {
              if (param1 == 8364) {
                break L2;
              } else {
                if (338 == param1) {
                  break L2;
                } else {
                  if (param1 == 8212) {
                    break L2;
                  } else {
                    if (param1 == 339) {
                      break L2;
                    } else {
                      if (param1 != 376) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
            }
            return true;
          } else {
            if (param1 > 255) {
              if (param1 != 8364) {
                if (338 != param1) {
                  if (param1 != 8212) {
                    if (param1 != 339) {
                      if (param1 != 376) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static void a(boolean param0, r param1, eh param2, int param3) {
        try {
            int discarded$0 = 5;
            of.field_a = wh.a() * param3 / 1000;
            la.a(1048576, param2);
            int discarded$1 = 106;
            pm.a(param2);
            Virogrid.a(param2, (byte) -9);
            int discarded$2 = 255;
            ag.a();
            qk.a(false);
            kf.field_e = -of.field_a;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ig.B(" + false + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new long[32];
        field_d = "Players: ";
        field_a = "Your ignore list is full. Max of 100 hit.";
    }
}
