/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends ql {
    static boolean field_r;
    private int field_p;
    private int field_q;
    static String field_o;
    private ffa field_n;

    final static void a(byte param0, int param1, int param2) {
        kh var3 = null;
        var3 = ql.field_k;
        var3.k(param1, -2988);
        var3.i(3, 0);
        var3.i(8, 0);
        if (param0 >= -100) {
          field_r = true;
          var3.f(-1477662136, param2);
          return;
        } else {
          var3.f(-1477662136, param2);
          return;
        }
    }

    public final int hashCode() {
        return ira.a(((q) this).field_q, ((q) this).field_p, (byte) -93);
    }

    final ffa a(byte param0) {
        if (param0 >= -67) {
            ((q) this).field_q = 19;
            return ((q) this).field_n;
        }
        return ((q) this).field_n;
    }

    final void a(int param0, ffa param1, byte param2, int param3) {
        RuntimeException runtimeException = null;
        Object var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((q) this).field_p = param3;
              ((q) this).field_n = param1;
              ((q) this).field_q = param0;
              if (param2 == 116) {
                break L1;
              } else {
                var6 = null;
                ((q) this).a(92, (ffa) null, (byte) -51, 63);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("q.H(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        if (48 > param0) {
          if (param0 < 65) {
            L0: {
              if (param0 < 97) {
                break L0;
              } else {
                if (param0 > 122) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
            return false;
          } else {
            if (param0 <= 90) {
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              return stackIn_28_0 != 0;
            } else {
              L1: {
                L2: {
                  if (param0 < 97) {
                    break L2;
                  } else {
                    if (param0 > 122) {
                      break L2;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L1;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L1;
              }
              return stackIn_25_0 != 0;
            }
          }
        } else {
          if (param0 > 57) {
            if (param0 >= 65) {
              if (param0 > 90) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 == -98) {
          if (param3 < ((q) this).field_q) {
            if (param1 >= ((q) this).field_q) {
              if (((q) this).field_p > param2) {
                if (param0 < ((q) this).field_p) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final boolean a(int param0, int param1, ffa param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param3 > 57) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((q) this).field_n != param2) {
                  break L3;
                } else {
                  if (param1 != ((q) this).field_q) {
                    break L3;
                  } else {
                    if (param0 != ((q) this).field_p) {
                      break L3;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("q.G(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_7_0 != 0;
    }

    public static void a(int param0) {
        field_o = null;
    }

    final boolean a(int param0, int param1, boolean param2) {
        if (param2) {
          if (((q) this).field_q == param0) {
            if (param1 != ((q) this).field_p) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_r = false;
          if (((q) this).field_q == param0) {
            if (param1 != ((q) this).field_p) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    q(ffa param0, int param1, int param2) {
        try {
            ((q) this).field_q = param1;
            ((q) this).field_n = param0;
            ((q) this).field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "q.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Loading graphics";
    }
}
