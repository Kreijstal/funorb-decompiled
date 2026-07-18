/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rm extends n {
    static String field_E;
    private boolean field_C;
    private boolean field_F;
    boolean field_B;
    static uf field_A;
    boolean field_D;

    final void e(int param0) {
        if (((rm) this).field_C) {
          L0: {
            ((rm) this).field_C = false;
            if (null == ((rm) this).field_t) {
              break L0;
            } else {
              if (((rm) this).field_t instanceof mh) {
                ((mh) (Object) ((rm) this).field_t).a((n) this, 30154, ((rm) this).field_C);
                break L0;
              } else {
                if (param0 >= 15) {
                  return;
                } else {
                  rm.h(-3);
                  return;
                }
              }
            }
          }
          if (param0 < 15) {
            rm.h(-3);
            return;
          } else {
            return;
          }
        } else {
          if (param0 >= 15) {
            return;
          } else {
            rm.h(-3);
            return;
          }
        }
    }

    rm(String param0, dh param1, tb param2) {
        super(param0, param1, param2);
        ((rm) this).field_C = false;
        ((rm) this).field_F = true;
        ((rm) this).field_D = true;
    }

    boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -78) {
                break L1;
              } else {
                ((rm) this).field_F = true;
                break L1;
              }
            }
            L2: {
              if (!((rm) this).c((byte) -20)) {
                break L2;
              } else {
                L3: {
                  if (param1 == 84) {
                    break L3;
                  } else {
                    if (param1 != 83) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ((rm) this).a(1, -1, true, -1);
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("rm.T(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        try {
            if (param4 != -9) {
                ((rm) this).e(45);
            }
            if (null != ((rm) this).field_t) {
                if (((rm) this).field_t instanceof un) {
                    ((un) (Object) ((rm) this).field_t).a(param5, param0, param2, (rm) this, (byte) -71, param3);
                }
            }
            ((rm) this).field_v = 0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "rm.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void i(int param0) {
        field_E = null;
        if (param0 != -5531) {
            return;
        }
        field_A = null;
    }

    void a(int param0, n param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (0 == ((rm) this).field_v) {
                break L1;
              } else {
                if (((rm) this).field_v != rd.field_f) {
                  L2: {
                    if (!((rm) this).b(param0, (byte) -105, nc.field_g, param2, rf.field_X)) {
                      break L2;
                    } else {
                      if (rd.field_f == 0) {
                        ((rm) this).a(((rm) this).field_v, -param2 + rf.field_X, true, nc.field_g - param0);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((rm) this).a(nc.field_g, param1, param2, param0, (byte) -9, rf.field_X);
                  break L1;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("rm.JA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!((rm) this).field_D) {
                break L1;
              } else {
                if (!((rm) this).b(param0, (byte) -105, param5, param2, param1)) {
                  break L1;
                } else {
                  L2: {
                    boolean discarded$2 = ((rm) this).a(param3, param4 ^ 25781);
                    ((rm) this).field_v = param6;
                    if (null == ((rm) this).field_t) {
                      break L2;
                    } else {
                      if (((rm) this).field_t instanceof un) {
                        ((un) (Object) ((rm) this).field_t).a((byte) -68, (rm) this, param0, param5, param2, param6, param1);
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
            if (param4 == -108) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_9_0 = 1;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("rm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final static void h(int param0) {
        Object var2 = null;
        if (param0 != 84) {
          rm.h(-35);
          var2 = null;
          ag.a((String) null, false, "");
          return;
        } else {
          var2 = null;
          ag.a((String) null, false, "");
          return;
        }
    }

    void a(int param0, int param1, boolean param2, int param3) {
        L0: {
          if (null == ((rm) this).field_t) {
            break L0;
          } else {
            if (((rm) this).field_t instanceof pi) {
              ((pi) (Object) ((rm) this).field_t).a(param0, (rm) this, -4, param3, param1);
              break L0;
            } else {
              if (param2) {
                return;
              } else {
                field_E = null;
                return;
              }
            }
          }
        }
        if (!param2) {
          field_E = null;
          return;
        } else {
          return;
        }
    }

    rm(String param0, tb param1) {
        this(param0, pc.field_b.field_p, param1);
    }

    final StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var5_int = -66 % (param1 / 49);
              if (((rm) this).a(20720, param2, param3, param0)) {
                L2: {
                  ((rm) this).a(param2, param0, true, param3);
                  if (!((rm) this).field_B) {
                    break L2;
                  } else {
                    StringBuilder discarded$4 = param3.append(" active");
                    break L2;
                  }
                }
                if (((rm) this).field_D) {
                  break L1;
                } else {
                  StringBuilder discarded$5 = param3.append(" disabled");
                  break L1;
                }
              } else {
                break L1;
              }
            }
            stackOut_6_0 = (StringBuilder) param3;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("rm.PA(").append(param0).append(',').append(param1).append(',');
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
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final boolean c(byte param0) {
        if (param0 != -20) {
            return true;
        }
        return ((rm) this).field_C;
    }

    boolean a(n param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!((rm) this).field_D) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (((rm) this).field_F) {
                L1: {
                  param0.e(50);
                  ((rm) this).field_C = true;
                  if (param1 == -25823) {
                    break L1;
                  } else {
                    rm.i(17);
                    break L1;
                  }
                }
                L2: {
                  if (null == ((rm) this).field_t) {
                    break L2;
                  } else {
                    if (((rm) this).field_t instanceof mh) {
                      ((mh) (Object) ((rm) this).field_t).a((n) this, 30154, ((rm) this).field_C);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("rm.NB(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    protected rm() {
        ((rm) this).field_C = false;
        ((rm) this).field_F = true;
        ((rm) this).field_D = true;
        ((rm) this).field_l = pc.field_b.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Waiting for levels";
    }
}
