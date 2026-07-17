/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class oa extends lh {
    static wk[] field_U;
    static String field_R;
    static long field_P;
    static String field_O;
    static String field_H;
    private boolean field_L;
    boolean field_K;
    static String[] field_J;
    static wk field_N;
    static int field_S;
    private boolean field_I;
    boolean field_T;
    static int[] field_M;
    static long field_G;
    static wk[] field_Q;

    public static void a(byte param0) {
        field_J = null;
        field_O = null;
        field_N = null;
        field_M = null;
        field_Q = null;
        field_R = null;
        field_U = null;
        field_H = null;
    }

    final boolean d(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ((oa) this).a(4, -27, (lh) null, -86);
            return ((oa) this).field_I;
        }
        return ((oa) this).field_I;
    }

    boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
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
              if (!((oa) this).field_K) {
                break L1;
              } else {
                if (!((oa) this).a(param0, param4, (byte) 81, param3, param2)) {
                  break L1;
                } else {
                  L2: {
                    boolean discarded$2 = ((oa) this).a(1, param1);
                    ((oa) this).field_w = param6;
                    if (null == ((oa) this).field_A) {
                      break L2;
                    } else {
                      if (((oa) this).field_A instanceof gn) {
                        ((gn) (Object) ((oa) this).field_A).a(param6, param0, param2, 13030, param4, param3, (oa) this);
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
            if (param5) {
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
            stackOut_13_1 = new StringBuilder().append("oa.I(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
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
              on.field_k = param0;
              if (param1 == -107) {
                break L1;
              } else {
                var3 = null;
                oa.a((String) null, (byte) 82);
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
            stackOut_3_1 = new StringBuilder().append("oa.IA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    oa(String param0, tn param1) {
        this(param0, ad.field_j.field_f, param1);
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
              if (param2 < -104) {
                break L1;
              } else {
                var6 = null;
                StringBuilder discarded$6 = ((oa) this).a((Hashtable) null, (StringBuilder) null, (byte) -122, 29);
                break L1;
              }
            }
            L2: {
              if (!((oa) this).a(param1, (byte) -91, param3, param0)) {
                break L2;
              } else {
                L3: {
                  ((oa) this).a(param3, param0, false, param1);
                  if (!((oa) this).field_T) {
                    break L3;
                  } else {
                    StringBuilder discarded$7 = param1.append(" active");
                    break L3;
                  }
                }
                if (!((oa) this).field_K) {
                  StringBuilder discarded$8 = param1.append(" disabled");
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackOut_8_0 = (StringBuilder) param1;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("oa.D(");
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    void b(int param0, byte param1, int param2, int param3) {
        if (param1 <= -122) {
          if (((oa) this).field_A != null) {
            if (!(((oa) this).field_A instanceof ae)) {
              return;
            } else {
              ((ae) (Object) ((oa) this).field_A).a(param2, (byte) -23, param0, (oa) this, param3);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void d(byte param0) {
        if (param0 == -45) {
          if (((oa) this).field_I) {
            ((oa) this).field_I = false;
            if (((oa) this).field_A != null) {
              if (!(((oa) this).field_A instanceof j)) {
                return;
              } else {
                ((j) (Object) ((oa) this).field_A).a(((oa) this).field_I, (byte) 7, (lh) this);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((oa) this).d((byte) -34);
          if (((oa) this).field_I) {
            ((oa) this).field_I = false;
            if (((oa) this).field_A != null) {
              if (!(((oa) this).field_A instanceof j)) {
                return;
              } else {
                ((j) (Object) ((oa) this).field_A).a(((oa) this).field_I, (byte) 7, (lh) this);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    oa(String param0, qk param1, tn param2) {
        super(param0, param1, param2);
        ((oa) this).field_K = true;
        ((oa) this).field_I = false;
        ((oa) this).field_L = true;
    }

    boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
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
            if (!((oa) this).d(param0 ^ param0)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              L1: {
                if (param1 == 84) {
                  break L1;
                } else {
                  if (param1 == 83) {
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              ((oa) this).b(1, (byte) -125, -1, -1);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("oa.R(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final static boolean a(int param0, char param1) {
        if (48 > param1) {
            return false;
        }
        if (param1 > 57) {
            return false;
        }
        return true;
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        try {
            if (null != ((oa) this).field_A) {
                if (((oa) this).field_A instanceof gn) {
                    ((gn) (Object) ((oa) this).field_A).a(param3, param2, param1, (oa) this, param5, 19870);
                }
            }
            ((oa) this).field_w = 0;
            int var7_int = 88 % ((36 - param0) / 32);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "oa.P(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    final static boolean a(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (0 == param0) {
          return true;
        } else {
          L0: {
            if (-1 == (1 << param0 & ln.field_a)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void f(int param0) {
        int discarded$0 = 0;
        rh.a();
        int discarded$1 = -70;
        jb.c();
        n.field_x = null;
        ke.a(2);
        if (param0 != -12161) {
            oa.f(-6);
        }
    }

    void a(int param0, int param1, lh param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param1 > 56) {
              L1: {
                super.a(param0, 87, param2, param3);
                if (((oa) this).field_w == 0) {
                  break L1;
                } else {
                  if (nc.field_d != ((oa) this).field_w) {
                    L2: {
                      if (!((oa) this).a(pi.field_c, param3, (byte) 81, oh.field_f, param0)) {
                        break L2;
                      } else {
                        if (nc.field_d == 0) {
                          ((oa) this).b(((oa) this).field_w, (byte) -123, oh.field_f + -param0, -param3 + pi.field_c);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    ((oa) this).a((byte) -14, oh.field_f, param3, param0, param2, pi.field_c);
                    break L1;
                  } else {
                    return;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("oa.H(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
    }

    boolean a(int param0, lh param1) {
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
        int stackOut_11_0 = 0;
        int stackOut_3_0 = 0;
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
              if (!((oa) this).field_K) {
                break L1;
              } else {
                if (!((oa) this).field_L) {
                  break L1;
                } else {
                  L2: {
                    param1.d((byte) -45);
                    if (param0 == 1) {
                      break L2;
                    } else {
                      boolean discarded$2 = oa.a(-72, true);
                      break L2;
                    }
                  }
                  L3: {
                    ((oa) this).field_I = true;
                    if (null == ((oa) this).field_A) {
                      break L3;
                    } else {
                      if (((oa) this).field_A instanceof j) {
                        ((j) (Object) ((oa) this).field_A).a(((oa) this).field_I, (byte) 7, (lh) this);
                        break L3;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("oa.E(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    protected oa() {
        ((oa) this).field_K = true;
        ((oa) this).field_I = false;
        ((oa) this).field_L = true;
        ((oa) this).field_p = ad.field_j.field_u;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "<br><br>Close-combat attack: <col=ffffff><%0></col>";
        field_J = new String[16];
        field_O = "Tags from Unrated games are not recorded.";
        field_S = 0;
        field_R = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
    }
}
