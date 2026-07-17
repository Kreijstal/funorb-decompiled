/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends gl {
    static int field_N;
    private nh field_M;
    int field_I;
    Object[] field_L;
    private rb field_H;
    int field_O;
    int field_K;
    static boolean field_J;

    private final void a(int param0, byte param1, Object[] param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              ((pk) this).field_K = param0;
              ((pk) this).field_O = -1;
              ((pk) this).field_L = param2;
              if (param1 == 94) {
                break L1;
              } else {
                boolean discarded$2 = ((pk) this).b(((int[]) ((pk) this).field_L[37])[8], 8, ((int[]) ((pk) this).field_L[1])[1], 39, -119);
                break L1;
              }
            }
            if (param2 == null) {
              break L0;
            } else {
              L2: {
                if (((pk) this).field_K < -1) {
                  break L2;
                } else {
                  if (((pk) this).field_K >= ((pk) this).field_L.length) {
                    break L2;
                  } else {
                    return;
                  }
                }
              }
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("pk.P(").append(param0).append(44).append(param1).append(44);
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        if (param1 == 0) {
          L0: {
            var5 = param2 + ((pk) this).field_k;
            var6 = param0 - -((pk) this).field_j;
            bi.b(var5, var6, ((pk) this).field_i, ((pk) this).field_n, 0);
            var7 = ((pk) this).field_K;
            if (param3 == ~((pk) this).field_O) {
              break L0;
            } else {
              var7 = ((pk) this).field_O;
              break L0;
            }
          }
          if (((pk) this).field_L == null) {
            return;
          } else {
            var8 = 0;
            L1: while (true) {
              if (((pk) this).field_L.length <= var8) {
                return;
              } else {
                L2: {
                  var9 = ((pk) this).field_L[var8];
                  var10 = var9.toString();
                  if (var8 == var7) {
                    bi.a(2 + var5, var6 + 4, -4 + ((pk) this).field_i, ((pk) this).field_I, 2188450, 128);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6 = var6 + ((pk) this).field_I;
                ((pk) this).field_H.c(var10, 2 + var5, var6, 10000536, -1);
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = -12 / ((param1 - -12) / 56);
        super.b(param0, -103, param2, param3);
        param0 = param0 - ((pk) this).field_k;
        param2 = param2 - ((pk) this).field_j;
        if (null != ((pk) this).field_L) {
          var6 = param2 / ((pk) this).field_I;
          if (var6 >= 0) {
            if (((pk) this).field_L.length <= var6) {
              return;
            } else {
              ((pk) this).field_K = var6;
              ((pk) this).field_M.b(true);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final Object g(int param0) {
        Object stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        if (param0 == 0) {
          if (null != ((pk) this).field_L) {
            if (0 == ((pk) this).field_K) {
              return null;
            } else {
              return ((pk) this).field_L[((pk) this).field_K];
            }
          } else {
            stackOut_9_0 = null;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0;
          }
        } else {
          boolean discarded$1 = ((pk) this).b(70, ((int[]) ((pk) this).field_L[25])[1], ((int[]) ((Object[]) ((pk) this).field_L[4])[1])[5], ((int[]) ((Object[]) ((pk) this).field_L[6])[4])[0], ((int[]) ((pk) this).field_L[0])[3]);
          if (null == ((pk) this).field_L) {
            return null;
          } else {
            L0: {
              if (0 != ((pk) this).field_K) {
                stackOut_4_0 = ((pk) this).field_L[((pk) this).field_K];
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = null;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        ((pk) this).field_O = -1;
        if (((pk) this).field_M.field_H) {
          if (param1 == 21224) {
            if (((pk) this).field_M.field_F.field_D.field_l) {
              if (((pk) this).field_L != null) {
                param4 = param4 - (param3 - -((pk) this).field_k);
                param0 = param0 - (param2 + ((pk) this).field_j);
                if (0 <= param4) {
                  if (param0 >= 0) {
                    if (param4 <= ((pk) this).field_i) {
                      if (param0 > ((pk) this).field_n) {
                        return false;
                      } else {
                        L0: {
                          ((pk) this).field_O = param0 / ((pk) this).field_I;
                          if (((pk) this).field_L.length <= ((pk) this).field_O) {
                            ((pk) this).field_O = -1;
                            break L0;
                          } else {
                            break L0;
                          }
                        }
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
                return super.b(param0, 21224, param2, param3, param4);
              }
            } else {
              return false;
            }
          } else {
            ((pk) this).field_H = null;
            if (((pk) this).field_M.field_F.field_D.field_l) {
              if (((pk) this).field_L != null) {
                param4 = param4 - (param3 - -((pk) this).field_k);
                param0 = param0 - (param2 + ((pk) this).field_j);
                if (0 <= param4) {
                  if (param0 >= 0) {
                    if (param4 <= ((pk) this).field_i) {
                      if (param0 > ((pk) this).field_n) {
                        return false;
                      } else {
                        L1: {
                          ((pk) this).field_O = param0 / ((pk) this).field_I;
                          if (((pk) this).field_L.length <= ((pk) this).field_O) {
                            ((pk) this).field_O = -1;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
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
                return super.b(param0, 21224, param2, param3, param4);
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final int h(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 1227847265) {
          L0: {
            this.a(49, (byte) -85, (Object[]) ((pk) this).field_L[5]);
            if (null != ((pk) this).field_L) {
              stackOut_7_0 = (2 * ((pk) this).field_L.length + 1) * ((pk) this).field_I >> 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 200;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (null != ((pk) this).field_L) {
              stackOut_3_0 = (2 * ((pk) this).field_L.length + 1) * ((pk) this).field_I >> 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 200;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    pk(nh param0, rb param1, Object[] param2, int param3) {
        super((ga) (Object) param0);
        try {
            ((pk) this).field_M = param0;
            ((pk) this).field_H = param1;
            ((pk) this).field_I = ((pk) this).field_H.field_I + ((pk) this).field_H.field_x;
            this.a(param3, (byte) 94, param2);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "pk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = 640;
        field_J = false;
    }
}
