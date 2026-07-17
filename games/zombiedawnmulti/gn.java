/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class gn extends cf {
    private boolean field_H;
    static java.util.zip.CRC32 field_B;
    boolean field_G;
    boolean field_F;
    private boolean field_J;
    static ip field_K;
    static java.math.BigInteger field_L;
    static int[] field_I;
    static String field_D;
    static String field_C;
    static String field_E;

    gn(String param0, nl param1, bj param2) {
        super(param0, param1, param2);
        ((gn) this).field_J = true;
        ((gn) this).field_F = true;
        ((gn) this).field_H = false;
    }

    void a(int param0, cf param1, int param2, int param3) {
        RuntimeException runtimeException = null;
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
              super.a(param0, param1, param2, param3);
              if (((gn) this).field_u == 0) {
                break L1;
              } else {
                if (((gn) this).field_u == pq.field_f) {
                  break L1;
                } else {
                  L2: {
                    if (!((gn) this).a(92, param2, bd.field_g, bo.field_d, param3)) {
                      break L2;
                    } else {
                      if (pq.field_f == 0) {
                        ((gn) this).a((byte) -49, ((gn) this).field_u, bd.field_g + -param2, bo.field_d + -param3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((gn) this).a(bd.field_g, param1, param3, bo.field_d, true, param2);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("gn.T(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (!((gn) this).field_F) {
                break L1;
              } else {
                if (!((gn) this).field_J) {
                  break L1;
                } else {
                  L2: {
                    param0.c((byte) 32);
                    ((gn) this).field_H = true;
                    if (null == ((gn) this).field_A) {
                      break L2;
                    } else {
                      if (((gn) this).field_A instanceof om) {
                        ((om) (Object) ((gn) this).field_A).a(((gn) this).field_H, true, (cf) this);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (param1 == 0) {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0 != 0;
                  }
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("gn.S(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final boolean c(int param0) {
        if (param0 < 123) {
            return true;
        }
        return ((gn) this).field_H;
    }

    final static boolean b(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
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
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < rp.field_j) {
                  break L1;
                } else {
                  if (param1.length() > iq.field_e) {
                    break L1;
                  } else {
                    if (param0 == 62) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L0;
                    } else {
                      field_L = null;
                      return false;
                    }
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("gn.V(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
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
              if (!((gn) this).c(param3 + 6332)) {
                break L1;
              } else {
                L2: {
                  if (param0 == 84) {
                    break L2;
                  } else {
                    if (param0 == 83) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                ((gn) this).a((byte) -49, 1, -1, -1);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            }
            if (param3 == -6208) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("gn.CA(").append(param0).append(44).append(param1).append(44);
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
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        if (param1 == 16413) {
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
              if (90 >= param0) {
                stackOut_28_0 = 1;
                stackIn_30_0 = stackOut_28_0;
                return stackIn_30_0 != 0;
              } else {
                L1: {
                  L2: {
                    if (param0 < 97) {
                      break L2;
                    } else {
                      if (param0 > 122) {
                        break L2;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L1;
                      }
                    }
                  }
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                }
                return stackIn_27_0 != 0;
              }
            }
          } else {
            if (param0 > 57) {
              if (param0 >= 65) {
                if (90 < param0) {
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
        } else {
          return false;
        }
    }

    final static ae a(int param0, ga param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        op stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        op stackOut_2_0 = null;
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
              var2_int = param1.d((byte) 69);
              if (param0 == -1) {
                break L1;
              } else {
                field_D = null;
                break L1;
              }
            }
            var3 = param1.d((byte) 69);
            var4 = param1.g(31365);
            stackOut_2_0 = ak.a(var4, (byte) -94, var2_int, var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("gn.AA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (ae) (Object) stackIn_3_0;
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        try {
            if (null != ((gn) this).field_A) {
                if (((gn) this).field_A instanceof ph) {
                    ((ph) (Object) ((gn) this).field_A).a(param2, param3, -108, param0, param5, (gn) this);
                }
            }
            if (!param4) {
                field_L = null;
            }
            ((gn) this).field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "gn.NA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void c(byte param0) {
        Object var3 = null;
        if (param0 == 32) {
          if (((gn) this).field_H) {
            ((gn) this).field_H = false;
            if (null != ((gn) this).field_A) {
              if (!(((gn) this).field_A instanceof om)) {
                return;
              } else {
                ((om) (Object) ((gn) this).field_A).a(((gn) this).field_H, true, (cf) this);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var3 = null;
          StringBuilder discarded$4 = ((gn) this).a(114, (Hashtable) null, 36, (StringBuilder) null);
          if (((gn) this).field_H) {
            ((gn) this).field_H = false;
            if (null != ((gn) this).field_A) {
              if (!(((gn) this).field_A instanceof om)) {
                return;
              } else {
                ((om) (Object) ((gn) this).field_A).a(((gn) this).field_H, true, (cf) this);
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

    gn(String param0, bj param1) {
        this(param0, ra.field_o.field_n, param1);
    }

    boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        Object var9 = null;
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
              if (param4 == -24) {
                break L1;
              } else {
                var9 = null;
                boolean discarded$4 = gn.b((byte) -31, (String) null);
                break L1;
              }
            }
            if (!((gn) this).field_F) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              if (((gn) this).a(89, param5, param1, param0, param6)) {
                L2: {
                  boolean discarded$5 = ((gn) this).a(param3, param4 ^ -24);
                  ((gn) this).field_u = param2;
                  if (null == ((gn) this).field_A) {
                    break L2;
                  } else {
                    if (((gn) this).field_A instanceof ph) {
                      ((ph) (Object) ((gn) this).field_A).a(param6, param1, param2, (gn) this, param5, param4 + -25285, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("gn.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final static String a(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        ml var7 = null;
        ml var8 = null;
        ga var9 = null;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        Object stackOut_17_0 = null;
        Object stackOut_8_0 = null;
        String stackOut_5_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) (Object) param0;
            if (em.a(var10, (byte) -38)) {
              if (2 == ge.field_zb) {
                if (param1 >= 70) {
                  var8 = dn.a(param0, false);
                  if (var8 == null) {
                    stackOut_12_0 = vl.a(ki.field_i, new String[1], 2);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    br discarded$1 = ro.field_M.a((byte) 120, (br) (Object) var8);
                    L1: while (true) {
                      var7 = (ml) (Object) ro.field_M.b(6);
                      if (var7 == null) {
                        var8.a(true);
                        var8.a(-4564);
                        dc.field_Fb = dc.field_Fb - 1;
                        var9 = ma.field_a;
                        var9.b((byte) -35, param2);
                        var9.field_j = var9.field_j + 1;
                        var5 = var9.field_j;
                        var9.a(-93, 1);
                        var9.a(param0, (byte) 105);
                        var9.e(73, -var5 + var9.field_j);
                        stackOut_17_0 = null;
                        stackIn_18_0 = stackOut_17_0;
                        break L0;
                      } else {
                        var7.field_Mb = var7.field_Mb - 1;
                        continue L1;
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (String) (Object) stackIn_9_0;
                }
              } else {
                stackOut_5_0 = cf.field_p;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = u.field_f;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("gn.W(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 41);
        }
        return (String) (Object) stackIn_18_0;
    }

    public static void a(int param0) {
        field_E = null;
        field_I = null;
        field_C = null;
        field_D = null;
        field_K = null;
        field_B = null;
        field_L = null;
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param0 == -49) {
          if (null != ((gn) this).field_A) {
            if (!(((gn) this).field_A instanceof in)) {
              return;
            } else {
              ((in) (Object) ((gn) this).field_A).a(param1, param3, (gn) this, -127, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          field_C = null;
          if (null != ((gn) this).field_A) {
            if (!(((gn) this).field_A instanceof in)) {
              return;
            } else {
              ((in) (Object) ((gn) this).field_A).a(param1, param3, (gn) this, -127, param2);
              return;
            }
          } else {
            return;
          }
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (!((gn) this).a(param1, 117, param3, param2)) {
                break L1;
              } else {
                L2: {
                  ((gn) this).a(param2, param3, (byte) 26, param1);
                  if (!((gn) this).field_G) {
                    break L2;
                  } else {
                    StringBuilder discarded$6 = param3.append(" active");
                    break L2;
                  }
                }
                if (((gn) this).field_F) {
                  break L1;
                } else {
                  StringBuilder discarded$7 = param3.append(" disabled");
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == 7) {
                break L3;
              } else {
                boolean discarded$8 = gn.a(',', -13);
                break L3;
              }
            }
            stackOut_7_0 = (StringBuilder) param3;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("gn.GA(").append(param0).append(44);
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_8_0;
    }

    protected gn() {
        ((gn) this).field_J = true;
        ((gn) this).field_F = true;
        ((gn) this).field_H = false;
        ((gn) this).field_h = ra.field_o.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new java.util.zip.CRC32();
        field_K = new ip();
        field_D = "Password: ";
        field_I = new int[32];
        field_C = "Player";
        field_L = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_E = "Flee, zombies, flee!";
    }
}
