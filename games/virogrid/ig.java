/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static long[] field_b;
    static String field_d;
    static je field_c;
    static String field_a;

    public static void a(int param0) {
        eh var2 = null;
        if (param0 >= -46) {
          var2 = (eh) null;
          ig.a(true, (r) null, (eh) null, 84);
          field_a = null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static rn a(int param0, String param1, int param2) {
        ph var3 = null;
        RuntimeException var3_ref = null;
        ph stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ph stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new ph();
              if (param2 < -48) {
                break L1;
              } else {
                field_b = (long[]) null;
                break L1;
              }
            }
            ((rn) ((Object) var3)).field_b = param0;
            ((rn) ((Object) var3)).field_d = param1;
            stackOut_2_0 = (ph) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("ig.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return (rn) ((Object) stackIn_3_0);
    }

    final static boolean a(byte param0, char param1) {
        if (32 <= param1) {
          if (param1 > 126) {
            if (param0 < -104) {
              if (param1 < 160) {
                if (param1 != 8364) {
                  if (338 != param1) {
                    if (param1 != 8212) {
                      if (param1 != 339) {
                        if (param1 == 376) {
                          return true;
                        } else {
                          return false;
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
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (param0 < -104) {
            if (param1 < 160) {
              if (param1 != 8364) {
                if (338 != param1) {
                  if (param1 != 8212) {
                    if (param1 != 339) {
                      if (param1 == 376) {
                        return true;
                      } else {
                        return false;
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
              if (param1 > 255) {
                if (param1 != 8364) {
                  if (338 != param1) {
                    if (param1 != 8212) {
                      if (param1 != 339) {
                        if (param1 == 376) {
                          return true;
                        } else {
                          return false;
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
          } else {
            return false;
          }
        }
    }

    final static void a(boolean param0, r param1, eh param2, int param3) {
        try {
            of.field_a = wh.a((byte) 5) * param3 / 1000;
            la.a(1048576, param2);
            pm.a(param2, 106);
            Virogrid.a(param2, (byte) -9);
            ag.a(255);
            qk.a(param0);
            kf.field_e = -of.field_a + 0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ig.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = new long[32];
        field_d = "Players: ";
        field_a = "Your ignore list is full. Max of 100 hit.";
    }
}
