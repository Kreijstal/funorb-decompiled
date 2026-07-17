/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rg extends fj {
    private boolean field_H;
    static int field_M;
    boolean field_L;
    boolean field_O;
    static String field_J;
    static boolean field_K;
    static int[] field_I;
    private boolean field_N;

    boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        RuntimeException var8 = null;
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
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
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
              if (param2 == 91) {
                break L1;
              } else {
                rg.g((byte) 85);
                break L1;
              }
            }
            L2: {
              if (!((rg) this).field_L) {
                break L2;
              } else {
                if (!((rg) this).a(param1, (byte) 126, param0, param5, param3)) {
                  break L2;
                } else {
                  L3: {
                    boolean discarded$2 = ((rg) this).a(param4, 418);
                    ((rg) this).field_o = param6;
                    if (((rg) this).field_t == null) {
                      break L3;
                    } else {
                      if (!(((rg) this).field_t instanceof nc)) {
                        break L3;
                      } else {
                        ((nc) (Object) ((rg) this).field_t).a(param0, param5, (rg) this, param3, (byte) -115, param1, param6);
                        break L3;
                      }
                    }
                  }
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var8;
            stackOut_11_1 = new StringBuilder().append("rg.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_10_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 == 25124) {
          if (null != ((rg) this).field_t) {
            if (!(((rg) this).field_t instanceof el)) {
              return;
            } else {
              ((el) (Object) ((rg) this).field_t).a(98, param3, param1, (rg) this, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    rg(String param0, uk param1) {
        this(param0, bg.field_d.field_h, param1);
    }

    boolean a(fj param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
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
              if (!((rg) this).field_L) {
                break L1;
              } else {
                if (!((rg) this).field_N) {
                  break L1;
                } else {
                  L2: {
                    param0.b(param1 + -334);
                    if (param1 == 418) {
                      break L2;
                    } else {
                      field_M = 32;
                      break L2;
                    }
                  }
                  L3: {
                    ((rg) this).field_H = true;
                    if (null == ((rg) this).field_t) {
                      break L3;
                    } else {
                      if (!(((rg) this).field_t instanceof vi)) {
                        break L3;
                      } else {
                        ((vi) (Object) ((rg) this).field_t).a((fj) this, ((rg) this).field_H, (byte) -85);
                        break L3;
                      }
                    }
                  }
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
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
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("rg.I(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
    }

    public static void g(byte param0) {
        if (param0 != 17) {
            return;
        }
        field_J = null;
        field_I = null;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
              if (((rg) this).a((byte) -13, param1, param2, param0)) {
                L2: {
                  ((rg) this).a(param0, param2, (byte) -63, param1);
                  if (!((rg) this).field_O) {
                    break L2;
                  } else {
                    StringBuilder discarded$6 = param0.append(" active");
                    break L2;
                  }
                }
                if (!((rg) this).field_L) {
                  StringBuilder discarded$7 = param0.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (!param3) {
                break L3;
              } else {
                boolean discarded$8 = ((rg) this).e((byte) 17);
                break L3;
              }
            }
            stackOut_9_0 = (StringBuilder) param0;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("rg.O(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 41);
        }
        return stackIn_10_0;
    }

    void a(fj param0, int param1, int param2, int param3) {
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
              if (0 == ((rg) this).field_o) {
                break L1;
              } else {
                if (((rg) this).field_o != Confined.field_I) {
                  L2: {
                    if (!((rg) this).a(ld.field_l, (byte) 124, param2, jh.field_R, param3)) {
                      break L2;
                    } else {
                      if (Confined.field_I == 0) {
                        ((rg) this).a(25124, jh.field_R + -param3, ld.field_l - param2, ((rg) this).field_o);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((rg) this).a(-38, param3, ld.field_l, param0, jh.field_R, param2);
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
            stackOut_9_1 = new StringBuilder().append("rg.V(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    rg(String param0, fe param1, uk param2) {
        super(param0, param1, param2);
        ((rg) this).field_L = true;
        ((rg) this).field_H = false;
        ((rg) this).field_N = true;
    }

    final void b(int param0) {
        if (param0 == 84) {
          if (((rg) this).field_H) {
            ((rg) this).field_H = false;
            if (((rg) this).field_t != null) {
              if (!(((rg) this).field_t instanceof vi)) {
                return;
              } else {
                ((vi) (Object) ((rg) this).field_t).a((fj) this, ((rg) this).field_H, (byte) -110);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((rg) this).field_H = true;
          if (((rg) this).field_H) {
            ((rg) this).field_H = false;
            if (((rg) this).field_t != null) {
              if (!(((rg) this).field_t instanceof vi)) {
                return;
              } else {
                ((vi) (Object) ((rg) this).field_t).a((fj) this, ((rg) this).field_H, (byte) -110);
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

    boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
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
        int stackOut_4_0 = 0;
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
              if (!((rg) this).e((byte) 60)) {
                break L1;
              } else {
                L2: {
                  if (param2 == 84) {
                    break L2;
                  } else {
                    if (param2 == 83) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                ((rg) this).a(25124, -1, -1, 1);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            }
            var5_int = 0 / ((47 - param1) / 43);
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("rg.Q(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final boolean e(byte param0) {
        int var2 = -119 % ((param0 - -74) / 49);
        return ((rg) this).field_H;
    }

    final void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        try {
            if (param0 >= -18) {
                Object var8 = null;
                ((rg) this).a((fj) null, 87, -34, -5);
            }
            if (((rg) this).field_t != null) {
                if (!(!(((rg) this).field_t instanceof nc))) {
                    ((nc) (Object) ((rg) this).field_t).a((rg) this, -126, param2, param1, param4, param5);
                }
            }
            ((rg) this).field_o = 0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "rg.K(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    protected rg() {
        ((rg) this).field_L = true;
        ((rg) this).field_H = false;
        ((rg) this).field_N = true;
        ((rg) this).field_n = bg.field_d.field_w;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Mouse over an icon for details";
    }
}
